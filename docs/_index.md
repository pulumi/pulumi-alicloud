---
title: Alicloud Provider
meta_desc: Provides an overview on how to configure the Pulumi Alicloud provider.
layout: package
---
## Installation

The alicloud provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/alicloud`](https://www.npmjs.com/package/@pulumi/alicloud)
* Python: [`pulumi-alicloud`](https://pypi.org/project/pulumi-alicloud/)
* Go: [`github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud`](https://github.com/pulumi/pulumi-alicloud)
* .NET: [`Pulumi.Alicloud`](https://www.nuget.org/packages/Pulumi.Alicloud)
* Java: [`com.pulumi/alicloud`](https://central.sonatype.com/artifact/com.pulumi/alicloud)

The Alibaba Cloud provider is used to interact with the
many resources supported by [Alibaba Cloud](https://www.alibabacloud.com). The provider needs to be configured
with the proper credentials before it can be used.

Use the navigation on the left to read about the available resources.
## Example Usage

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as alicloud from "@pulumi/alicloud";

const config = new pulumi.Config();
const name = config.get("name") || "pulumi-example";
const default = alicloud.getZones({
    availableDiskCategory: "cloud_efficiency",
    availableResourceCreation: "VSwitch",
});
// Create a new ECS instance for VPC
const vpc = new alicloud.vpc.Network("vpc", {
    vpcName: name,
    cidrBlock: "172.16.0.0/16",
});
const vswitch = new alicloud.vpc.Switch("vswitch", {
    vpcId: vpc.id,
    cidrBlock: "172.16.0.0/24",
    zoneId: _default.then(_default => _default.zones?.[0]?.id),
    vswitchName: name,
});
// Create a new Security in a VPC
const group = new alicloud.ecs.SecurityGroup("group", {
    name: name,
    description: "foo",
    vpcId: vpc.id,
});
// Create a kms to encrypt the disk
const key = new alicloud.kms.Key("key", {
    description: "Hello KMS",
    pendingWindowInDays: 7,
    status: "Enabled",
});
const instance = new alicloud.ecs.Instance("instance", {
    availabilityZone: _default.then(_default => _default.zones?.[0]?.id),
    securityGroups: [group].map(__item => __item.id),
    instanceType: "ecs.n4.large",
    systemDiskCategory: "cloud_efficiency",
    systemDiskName: name,
    systemDiskDescription: "system_disk_description",
    imageId: "ubuntu_18_04_64_20G_alibase_20190624.vhd",
    instanceName: name,
    vswitchId: vswitch.id,
    internetMaxBandwidthOut: 10,
    dataDisks: [{
        name: "data-disk",
        size: 20,
        category: "cloud_efficiency",
        description: "disk-description",
        encrypted: true,
        kmsKeyId: key.id,
    }],
});
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```
```python
import pulumi
import pulumi_alicloud as alicloud

config = pulumi.Config()
name = config.get("name")
if name is None:
    name = "pulumi-example"
default = alicloud.get_zones(available_disk_category="cloud_efficiency",
    available_resource_creation="VSwitch")
# Create a new ECS instance for VPC
vpc = alicloud.vpc.Network("vpc",
    vpc_name=name,
    cidr_block="172.16.0.0/16")
vswitch = alicloud.vpc.Switch("vswitch",
    vpc_id=vpc.id,
    cidr_block="172.16.0.0/24",
    zone_id=default.zones[0].id,
    vswitch_name=name)
# Create a new Security in a VPC
group = alicloud.ecs.SecurityGroup("group",
    name=name,
    description="foo",
    vpc_id=vpc.id)
# Create a kms to encrypt the disk
key = alicloud.kms.Key("key",
    description="Hello KMS",
    pending_window_in_days=7,
    status="Enabled")
instance = alicloud.ecs.Instance("instance",
    availability_zone=default.zones[0].id,
    security_groups=[__item.id for __item in [group]],
    instance_type="ecs.n4.large",
    system_disk_category="cloud_efficiency",
    system_disk_name=name,
    system_disk_description="system_disk_description",
    image_id="ubuntu_18_04_64_20G_alibase_20190624.vhd",
    instance_name=name,
    vswitch_id=vswitch.id,
    internet_max_bandwidth_out=10,
    data_disks=[{
        "name": "data-disk",
        "size": 20,
        "category": "cloud_efficiency",
        "description": "disk-description",
        "encrypted": True,
        "kms_key_id": key.id,
    }])
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using AliCloud = Pulumi.AliCloud;

return await Deployment.RunAsync(() =>
{
    var config = new Config();
    var name = config.Get("name") ?? "pulumi-example";
    var @default = AliCloud.GetZones.Invoke(new()
    {
        AvailableDiskCategory = "cloud_efficiency",
        AvailableResourceCreation = "VSwitch",
    });

    // Create a new ECS instance for VPC
    var vpc = new AliCloud.Vpc.Network("vpc", new()
    {
        VpcName = name,
        CidrBlock = "172.16.0.0/16",
    });

    var vswitch = new AliCloud.Vpc.Switch("vswitch", new()
    {
        VpcId = vpc.Id,
        CidrBlock = "172.16.0.0/24",
        ZoneId = @default.Apply(@default => @default.Apply(getZonesResult => getZonesResult.Zones[0]?.Id)),
        VswitchName = name,
    });

    // Create a new Security in a VPC
    var @group = new AliCloud.Ecs.SecurityGroup("group", new()
    {
        Name = name,
        Description = "foo",
        VpcId = vpc.Id,
    });

    // Create a kms to encrypt the disk
    var key = new AliCloud.Kms.Key("key", new()
    {
        Description = "Hello KMS",
        PendingWindowInDays = 7,
        Status = "Enabled",
    });

    var instance = new AliCloud.Ecs.Instance("instance", new()
    {
        AvailabilityZone = @default.Apply(@default => @default.Apply(getZonesResult => getZonesResult.Zones[0]?.Id)),
        SecurityGroups = new[]
        {
            @group,
        }.Select(__item => __item.Id).ToList(),
        InstanceType = "ecs.n4.large",
        SystemDiskCategory = "cloud_efficiency",
        SystemDiskName = name,
        SystemDiskDescription = "system_disk_description",
        ImageId = "ubuntu_18_04_64_20G_alibase_20190624.vhd",
        InstanceName = name,
        VswitchId = vswitch.Id,
        InternetMaxBandwidthOut = 10,
        DataDisks = new[]
        {
            new AliCloud.Ecs.Inputs.InstanceDataDiskArgs
            {
                Name = "data-disk",
                Size = 20,
                Category = "cloud_efficiency",
                Description = "disk-description",
                Encrypted = true,
                KmsKeyId = key.Id,
            },
        },
    });

});

```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```
```go
package main

import (
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kms"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)
func main() {
pulumi.Run(func(ctx *pulumi.Context) error {
cfg := config.New(ctx, "")
name := "pulumi-example";
if param := cfg.Get("name"); param != ""{
name = param
}
_default, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
AvailableDiskCategory: pulumi.StringRef("cloud_efficiency"),
AvailableResourceCreation: pulumi.StringRef("VSwitch"),
}, nil);
if err != nil {
return err
}
// Create a new ECS instance for VPC
vpc, err := vpc.NewNetwork(ctx, "vpc", &vpc.NetworkArgs{
VpcName: pulumi.String(name),
CidrBlock: pulumi.String("172.16.0.0/16"),
})
if err != nil {
return err
}
vswitch, err := vpc.NewSwitch(ctx, "vswitch", &vpc.SwitchArgs{
VpcId: vpc.ID(),
CidrBlock: pulumi.String("172.16.0.0/24"),
ZoneId: pulumi.String(_default.Zones[0].Id),
VswitchName: pulumi.String(name),
})
if err != nil {
return err
}
// Create a new Security in a VPC
group, err := ecs.NewSecurityGroup(ctx, "group", &ecs.SecurityGroupArgs{
Name: pulumi.String(name),
Description: pulumi.String("foo"),
VpcId: vpc.ID(),
})
if err != nil {
return err
}
// Create a kms to encrypt the disk
key, err := kms.NewKey(ctx, "key", &kms.KeyArgs{
Description: pulumi.String("Hello KMS"),
PendingWindowInDays: pulumi.Int(7),
Status: pulumi.String("Enabled"),
})
if err != nil {
return err
}
var splat0 pulumi.StringArray
for _, val0 := range %!v(PANIC=Format method: fatal: An assertion has failed: tok: ) {
splat0 = append(splat0, val0.ID())
}
_, err = ecs.NewInstance(ctx, "instance", &ecs.InstanceArgs{
AvailabilityZone: pulumi.String(_default.Zones[0].Id),
SecurityGroups: splat0,
InstanceType: pulumi.String("ecs.n4.large"),
SystemDiskCategory: pulumi.String("cloud_efficiency"),
SystemDiskName: pulumi.String(name),
SystemDiskDescription: pulumi.String("system_disk_description"),
ImageId: pulumi.String("ubuntu_18_04_64_20G_alibase_20190624.vhd"),
InstanceName: pulumi.String(name),
VswitchId: vswitch.ID(),
InternetMaxBandwidthOut: pulumi.Int(10),
DataDisks: ecs.InstanceDataDiskArray{
&ecs.InstanceDataDiskArgs{
Name: pulumi.String("data-disk"),
Size: pulumi.Int(20),
Category: pulumi.String("cloud_efficiency"),
Description: pulumi.String("disk-description"),
Encrypted: pulumi.Bool(true),
KmsKeyId: key.ID(),
},
},
})
if err != nil {
return err
}
return nil
})
}
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```
```yaml
Example currently unavailable in this language
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.alicloud.AlicloudFunctions;
import com.pulumi.alicloud.inputs.GetZonesArgs;
import com.pulumi.alicloud.vpc.Network;
import com.pulumi.alicloud.vpc.NetworkArgs;
import com.pulumi.alicloud.vpc.Switch;
import com.pulumi.alicloud.vpc.SwitchArgs;
import com.pulumi.alicloud.ecs.SecurityGroup;
import com.pulumi.alicloud.ecs.SecurityGroupArgs;
import com.pulumi.alicloud.kms.Key;
import com.pulumi.alicloud.kms.KeyArgs;
import com.pulumi.alicloud.ecs.Instance;
import com.pulumi.alicloud.ecs.InstanceArgs;
import com.pulumi.alicloud.ecs.inputs.InstanceDataDiskArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var name = config.get("name").orElse("pulumi-example");
        final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
            .availableDiskCategory("cloud_efficiency")
            .availableResourceCreation("VSwitch")
            .build());

        // Create a new ECS instance for VPC
        var vpc = new Network("vpc", NetworkArgs.builder()
            .vpcName(name)
            .cidrBlock("172.16.0.0/16")
            .build());

        var vswitch = new Switch("vswitch", SwitchArgs.builder()
            .vpcId(vpc.id())
            .cidrBlock("172.16.0.0/24")
            .zoneId(default_.zones()[0].id())
            .vswitchName(name)
            .build());

        // Create a new Security in a VPC
        var group = new SecurityGroup("group", SecurityGroupArgs.builder()
            .name(name)
            .description("foo")
            .vpcId(vpc.id())
            .build());

        // Create a kms to encrypt the disk
        var key = new Key("key", KeyArgs.builder()
            .description("Hello KMS")
            .pendingWindowInDays("7")
            .status("Enabled")
            .build());

        var instance = new Instance("instance", InstanceArgs.builder()
            .availabilityZone(default_.zones()[0].id())
            .securityGroups(group.stream().map(element -> element.id()).collect(toList()))
            .instanceType("ecs.n4.large")
            .systemDiskCategory("cloud_efficiency")
            .systemDiskName(name)
            .systemDiskDescription("system_disk_description")
            .imageId("ubuntu_18_04_64_20G_alibase_20190624.vhd")
            .instanceName(name)
            .vswitchId(vswitch.id())
            .internetMaxBandwidthOut(10)
            .dataDisks(InstanceDataDiskArgs.builder()
                .name("data-disk")
                .size(20)
                .category("cloud_efficiency")
                .description("disk-description")
                .encrypted(true)
                .kmsKeyId(key.id())
                .build())
            .build());

    }
}
```
{{% /choosable %}}
{{< /chooser >}}
## Authentication

The Alicloud provider accepts several ways to enter credentials for authentication.
The following methods are supported, in this order, and explained below:

- Static credentials
- Environment variables
- Shared credentials/configuration file
- ECS Instance Role
- Assuming A RAM Role
- Assuming A RAM Role With OIDC
- Sidecar Credentials
### Static credentials

Static credentials can be provided by adding `accessKey`, `secretKey` and `region` in-line in the
alicloud provider block:

Usage:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    alicloud:accessKey:
        value: 'TODO: var.access_key'
    alicloud:region:
        value: 'TODO: var.region'
    alicloud:secretKey:
        value: 'TODO: var.secret_key'

```

{{% /choosable %}}
{{< /chooser >}}
### Environment variables

You can provide your credentials via `ALIBABA_CLOUD_ACCESS_KEY_ID`, `ALIBABA_CLOUD_ACCESS_KEY_SECRET` and optionally
`ALIBABA_CLOUD_SECURITY_TOKEN` environment variables. The Region can be set using the `ALIBABA_CLOUD_REGION` environment variables.

Usage:
{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs

```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python

```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go

```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml

```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java

```

{{% /choosable %}}
{{< /chooser >}}

```shell
$ export ALIBABA_CLOUD_ACCESS_KEY_ID="<Your-Access-Key-ID>"
$ export ALIBABA_CLOUD_ACCESS_KEY_SECRET="<Your-Access-Key-Secret>"
$ export ALIBABA_CLOUD_REGION="cn-beijing"
$ pulumi preview
```
### Shared Credentials File

You can use an [Alibaba Cloud credentials or configuration file](https://www.alibabacloud.com/help/doc-detail/110341.htm) to specify your credentials.
The default location is `$HOME/.aliyun/config.json` on Linux and macOS, or `"%USERPROFILE%\.aliyun/config.json"` on Windows.
You can optionally specify a different location in the Pulumi configuration by providing the `sharedCredentialsFile` argument
or using the `ALIBABA_CLOUD_CREDENTIALS_FILE` environment variable.
This method also supports a `profile` configuration and matching `ALIBABA_CLOUD_PROFILE` environment variable:

Usage:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    alicloud:profile:
        value: customprofile
    alicloud:region:
        value: cn-hangzhou
    alicloud:sharedCredentialsFile:
        value: /Users/tf_user/.aliyun/creds

```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    alicloud:profile:
        value: customprofile
    alicloud:region:
        value: cn-hangzhou
    alicloud:sharedCredentialsFile:
        value: /Users/tf_user/.aliyun/creds

```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    alicloud:profile:
        value: customprofile
    alicloud:region:
        value: cn-hangzhou
    alicloud:sharedCredentialsFile:
        value: /Users/tf_user/.aliyun/creds

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    alicloud:profile:
        value: customprofile
    alicloud:region:
        value: cn-hangzhou
    alicloud:sharedCredentialsFile:
        value: /Users/tf_user/.aliyun/creds

```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    alicloud:profile:
        value: customprofile
    alicloud:region:
        value: cn-hangzhou
    alicloud:sharedCredentialsFile:
        value: /Users/tf_user/.aliyun/creds

```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    alicloud:profile:
        value: customprofile
    alicloud:region:
        value: cn-hangzhou
    alicloud:sharedCredentialsFile:
        value: /Users/tf_user/.aliyun/creds

```

{{% /choosable %}}
{{< /chooser >}}
### ECS Instance Role

If you're running Pulumi from an ECS instance with RAM Instance using RAM Role,
Pulumi will just access
the metadata URL: `http://100.100.100.200/latest/meta-data/ram/security-credentials/<ecs_role_name>`
to obtain the STS credential.
Refer to details [Access other Cloud Product APIs by the Instance RAM Role](https://www.alibabacloud.com/help/doc-detail/54579.htm).

This is a preferred approach over any other when running in ECS as you can avoid
hard coding credentials. Instead, these are leased on-the-fly by Pulumi
which reduces the chance of leakage.

The ECS Instance Role can be set using the `ALIBABA_CLOUD_ECS_METADATA` environment variables.

Usage:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    alicloud:ecsRoleName:
        value: pulumi-provider-alicloud
    alicloud:region:
        value: 'TODO: var.region'

```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    alicloud:ecsRoleName:
        value: pulumi-provider-alicloud
    alicloud:region:
        value: 'TODO: var.region'

```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    alicloud:ecsRoleName:
        value: pulumi-provider-alicloud
    alicloud:region:
        value: 'TODO: var.region'

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    alicloud:ecsRoleName:
        value: pulumi-provider-alicloud
    alicloud:region:
        value: 'TODO: var.region'

```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    alicloud:ecsRoleName:
        value: pulumi-provider-alicloud
    alicloud:region:
        value: 'TODO: var.region'

```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    alicloud:ecsRoleName:
        value: pulumi-provider-alicloud
    alicloud:region:
        value: 'TODO: var.region'

```

{{% /choosable %}}
{{< /chooser >}}
### Assuming A RAM Role

If provided with a role ARN, Pulumi will attempt to assume this role using the supplied credentials.
The role arn can be set using the `ALIBABA_CLOUD_ROLE_ARN` environment variables,
and the role session name using the `ALIBABA_CLOUD_ROLE_SESSION_NAME` environment variables.

Usage:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    alicloud:accessKey:
        value: <One-AccessKeyId-With-AssumeRole-Policy>
    alicloud:secretKey:
        value: <One-AccessKeySecret-With-AssumeRole-Policy>

```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    alicloud:accessKey:
        value: <One-AccessKeyId-With-AssumeRole-Policy>
    alicloud:secretKey:
        value: <One-AccessKeySecret-With-AssumeRole-Policy>

```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    alicloud:accessKey:
        value: <One-AccessKeyId-With-AssumeRole-Policy>
    alicloud:secretKey:
        value: <One-AccessKeySecret-With-AssumeRole-Policy>

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    alicloud:accessKey:
        value: <One-AccessKeyId-With-AssumeRole-Policy>
    alicloud:secretKey:
        value: <One-AccessKeySecret-With-AssumeRole-Policy>

```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    alicloud:accessKey:
        value: <One-AccessKeyId-With-AssumeRole-Policy>
    alicloud:secretKey:
        value: <One-AccessKeySecret-With-AssumeRole-Policy>

```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    alicloud:accessKey:
        value: <One-AccessKeyId-With-AssumeRole-Policy>
    alicloud:secretKey:
        value: <One-AccessKeySecret-With-AssumeRole-Policy>

```

{{% /choosable %}}
{{< /chooser >}}
### Assuming A RAM Role With OIDC

If provided with a role ARN and a token from a service account OpenID Connect (OIDC),
the Alibaba CLoud Provider will attempt to assume this role using the supplied credentials.

**NOTE:** Assuming-Role-With-OIDC is a no-AK auth type, and there is no need setting accessKey and secretKey while using it.

Usage:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs

```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python

```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go

```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml

```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java

```

{{% /choosable %}}
{{< /chooser >}}
### Sidecar Credentials

You can deploy a sidecar to storage alibaba cloud credentials.
Then, you can optionally specify a credentials URI in the Pulumi configuration by providing the `credentialsUri` argument
or using the `ALIBABA_CLOUD_CREDENTIALS_URI` environment variable to get the credentials automatically.
The Sidecar Credentials is available since v1.141.0.

Usage:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    alicloud:credentialsUri:
        value: <Your-Credential-URI>
    alicloud:region:
        value: cn-hangzhou

```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    alicloud:credentialsUri:
        value: <Your-Credential-URI>
    alicloud:region:
        value: cn-hangzhou

```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    alicloud:credentialsUri:
        value: <Your-Credential-URI>
    alicloud:region:
        value: cn-hangzhou

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    alicloud:credentialsUri:
        value: <Your-Credential-URI>
    alicloud:region:
        value: cn-hangzhou

```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    alicloud:credentialsUri:
        value: <Your-Credential-URI>
    alicloud:region:
        value: cn-hangzhou

```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    alicloud:credentialsUri:
        value: <Your-Credential-URI>
    alicloud:region:
        value: cn-hangzhou

```

{{% /choosable %}}
{{< /chooser >}}
## Configuration Reference

In addition to generic `provider` arguments
(e.g. `alias` and `version`), the following arguments are supported in the Alibaba Cloud
`provider` block:

* `accessKey` - Alibaba Cloud access key. It is required for the provider.
  Can also be set with the `ALIBABA_CLOUD_ACCESS_KEY_ID` environment variable since v1.228.0,
  or via a shared credentials file if profile is specified. See also `secretKey`.
  Environment variable `ALICLOUD_ACCESS_KEY` and `ALIBABACLOUD_ACCESS_KEY_ID` have been deprecated since v1.228.0.

* `secretKey` - Alibaba Cloud secret key. It is required for the provider.
  Can also be set with the `ALIBABA_CLOUD_ACCESS_KEY_SECRET` environment variable since v1.228.0,
  or via a shared credentials file if profile is specified. See also `accessKey`.
  Environment variable `ALICLOUD_SECRET_KEY` and `ALIBABACLOUD_ACCESS_KEY_SECRET` have been deprecated since v1.228.0.

* `securityToken` - Alibaba Cloud [Security Token Service](https://www.alibabacloud.com/help/en/ram/product-overview/what-is-sts).
  Can also be set with the `ALIBABA_CLOUD_SECURITY_TOKEN` environment variable since v1.228.0,
  or via a shared credentials file if profile is specified. See also `accessKey`.
  Environment variable `ALICLOUD_SECURITY_TOKEN` and `ALIBABACLOUD_SECURITY_TOKEN` have been deprecated since v1.228.0.

* `ecsRoleName` - The RAM Role Name attached on a ECS instance for API operations.
  Can also be set with the `ALIBABA_CLOUD_ECS_METADATA` environment variable since v1.228.0.
  Environment variable `ALICLOUD_ECS_ROLE_NAME` has been deprecated since v1.228.0.

* `region` - Alibaba Cloud region. Default to `cn-beijing`.
  Can also be set with the `ALIBABA_CLOUD_REGION` environment variable since v1.228.0.
  Environment variable `ALICLOUD_REGION` has been deprecated since v1.228.0.

* `accountId` - (Optional) Alibaba Cloud Account ID. It is used by the Function Compute service and to connect router interfaces.
  If not provided, the provider will attempt to retrieve it automatically with [STS GetCallerIdentity](https://www.alibabacloud.com/help/doc-detail/43767.htm).
  Can also be set with the `ALIBABA_CLOUD_ACCOUNT_ID` environment variable since v1.228.0.
  Environment variable `ALICLOUD_ACCOUNT_ID` has been deprecated since v1.228.0.

* `sharedCredentialsFile` - (Optional, Available since 1.49.0) This is the path to the shared credentials file.
  Can also be set with the `ALIBABA_CLOUD_CREDENTIALS_FILE` environment variable since v1.228.0.
  Environment variable `ALICLOUD_SHARED_CREDENTIALS_FILE` has been deprecated since v1.228.0.
  If this is not set and `profile` is specified, "~/.aliyun/config.json" will be used.

* `profile` - (Optional, Available since 1.49.0) This is the Alibaba Cloud profile name as set in the shared credentials file.
  Can also be set with the `ALIBABA_CLOUD_PROFILE` environment variable since v1.228.0.
  Environment variable `ALICLOUD_PROFILE` has been deprecated since v1.228.0.

* `assumeRole` - (Optional) An `assumeRole` Configuration Block block. Only one `assumeRole` block may be in the configuration.

* `assumeRoleWithOidc` - (Optional, Available since v1.220.0) Configuration block for assuming an RAM role using an OIDC. See the `assumeRoleWithOidc` Configuration Block section below. Only one `assumeRoleWithOidc` block may be in the configuration.

* `credentialsUri` - (Optional, Available since 1.141.0) The URI of sidecar credentials service.
  Can also be set with the `ALIBABA_CLOUD_CREDENTIALS_URI` environment variable since v1.228.0.
  Environment variable `ALICLOUD_CREDENTIALS_URI` has been deprecated since v1.228.0.

* `endpoints` - (Optional) An `endpoints` block to support custom endpoints.

* `skipRegionValidation` - (Optional, Available since 1.52.0) Skip static validation of region ID. Used by users of alternative AlibabaCloud-like APIs or users w/ access to regions that are not public (yet).

* `protocol` - (Optional, Available since 1.72.0) The Protocol of used by API request. Valid values: `HTTP` and `HTTPS`. Default to `HTTPS`.

* `clientReadTimeout` - (Optional, Available since 1.125.0) The maximum timeout in millisecond second of the client read request. Default to 60000.

* `clientConnectTimeout` - (Optional, Available since 1.125.0) The maximum timeout in millisecond second of the client connection server. Default to 60000.

* `maxRetryTimeout` - (Optional, Available since 1.183.0) The maximum retry timeout in second of the request. Default to `0`.
### `assumeRole` Configuration Block

* `roleArn` - (Required) The ARN of the role to assume. If ARN is set to an empty string, it does not perform role switching.
  Can also be set with the `ALIBABA_CLOUD_ROLE_ARN` environment variable since v1.228.0.
  Environment variable `ALICLOUD_ASSUME_ROLE_ARN` has been deprecated since v1.228.0.
  Pulumi executes configuration on account with provided credentials.

* `policy` - (Optional) A more restrictive policy to apply to the temporary credentials. This gives you a way to further restrict the permissions for the resulting temporary
  security credentials. You cannot use the passed policy to grant permissions that are in excess of those allowed by the access policy of the role that is being assumed.

* `sessionName` - (Optional) The session name to use when assuming the role. If omitted, 'pulumi' is passed to the AssumeRole call as session name.
  Can also be set with the `ALIBABA_CLOUD_ROLE_SESSION_NAME` environment variable since v1.228.0.
  Environment variable `ALICLOUD_ASSUME_ROLE_SESSION_NAME` has been deprecated since v1.228.0.

* `sessionExpiration` - (Optional) The time after which the established session for assuming role expires. Valid value range: [900-43200] seconds. Default to 3600 (in this case Alicloud use own default value). It supports environment variable `ALICLOUD_ASSUME_ROLE_SESSION_EXPIRATION`.

* `externalId` - (Optional, Available since 1.207.1) The external ID of the RAM role.
  This parameter is provided by an external party and is used to prevent the confused deputy problem.
  The value must be 2 to 1,224 characters in length and can contain letters, digits, and the following special characters:`= , . @ : / - _`.
### assumeRoleWithOidc Configuration Block

The `assumeRoleWithOidc` configuration block supports the following arguments:

* `oidcProviderArn` - (Required) ARN of the OIDC IdP. Can also be set with the `ALIBABA_CLOUD_OIDC_PROVIDER_ARN` environment variable.
* `roleArn` - (Required) ARN of the RAM Role to assume. Can also be set with the `ALIBABA_CLOUD_ROLE_ARN` environment variable.
* `oidcToken` - (Optional) Value of a RRSA security token from an OIDC Idp. One of `oidcToken` or `oidcTokenFile` is required.
* `oidcTokenFile` - (Optional) File containing a RRSA security token from an OIDC. One of `oidcTokenFile` or `oidcToken` is required.
  Can also be set with the `ALIBABA_CLOUD_OIDC_TOKEN_FILE` environment variable.
* `roleSessionName` - (Optional) The session name to use when assuming the role. If omitted, 'pulumi' is passed to the AssumeRoleWithOIDC call as session name.
  Can also be set with the `ALIBABA_CLOUD_ROLE_SESSION_NAME` environment variable.
* `sessionExpiration` - (Optional) The validity period of the STS token. Unit: seconds. Default value: 3600. Minimum value: 900. Maximum value: the value of the MaxSessionDuration parameter when creating a ram role.
* `policy` - (Optional) The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.
### `endpoints`

**NOTE:** Due to certain API restrictions, the endpoints pointing to the area should be consistent with the `regionId`.

* `ecs` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom ECS endpoints.

* `rds` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom RDS endpoints.

* `slb` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom SLB endpoints.

* `vpc` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom VPC and VPN endpoints.

* `cbn` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom CEN endpoints.

* `ess` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Autoscaling endpoints.

* `oss` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom OSS endpoints.

* `dns` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom DNS endpoints.

* `ram` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom RAM endpoints.

* `cs` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Container Service endpoints.

* `cr` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Container Registry endpoints.

* `cdn` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom CDN endpoints.

* `kms` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom KMS endpoints.

* `ots` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Table Store endpoints.

* `cms` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Cloud Monitor endpoints.

* `pvtz` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Private Zone endpoints.

* `sts` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom STS endpoints.

* `log` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Log Service endpoints.

* `drds` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom DRDS endpoints.

* `dds` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom MongoDB endpoints.

* `gpdb` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom GPDB endpoints.

* `kvstore` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom R-KVStore endpoints.

* `fc` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Function Computing endpoints.

* `apigateway` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Api Gateway endpoints.

* `datahub` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Datahub endpoints.

* `mns` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom MNS endpoints.

* `location` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Location Service endpoints.",

* `nas` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom nas Service endpoints.",

* `actiontrail` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom actiontrail Service endpoints.",

* `cas` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom CAS endpoints.

* `bssopenapi` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom BSSOPENAPI endpoints.

* `ddoscoo` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom BGP-Line Anti-DDoS Pro endpoints.

* `market` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Market endpoints.

* `cddc` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom ApsaraDB for MyBase endpoints.

* `ehpc` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Elastic High Performance Computing endpoints.

* `mscsub` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Message Center endpoints.

* `hitsdb` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Lindorm endpoints.

* `sddp` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Data Security Center endpoints.

* `sas` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Security Center endpoints.

* `dts` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Data Transmission endpoints.

* `ens` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom ens endpoints.

* `alidfs` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Apsara File Storage for HDFS endpoints.

* `arms` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Application Real-Time Monitoring Service endpoints.

* `bastionhost` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Bastion Host endpoints.

* `waf` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Web Application Firewall endpoints.

* `alb` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Application Load Balancer endpoints.

* `hbr` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Hybrid Backup Recovery endpoints.

* `dataworkspublic` - - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Data Works endpoints.

* `cloudfw` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Cloud Firewall endpoints.

* `dm` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Direct Mail endpoints.

* `eais` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Elastic Accelerated Computing Instances endpoints.

* `dg` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Database Gateway endpoints.

* `imm` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Intelligent Media Management endpoints.

* `iot` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Internet of Things endpoints.

* `vod` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom VOD endpoints.

* `gds` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Graph Database endpoints.

* `swas` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Simple Application Server endpoints.

* `opensearch` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Open Search endpoints.

* `clickhouse` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Click House endpoints.

* `vs` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Video Surveillance System endpoints.

* `quickbi` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Quick BI endpoints.

* `cloudsso` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom Cloud SSO endpoints.

* `edas` - (Optional) Use this to override the default endpoint URL constructed from the `region`. It's typically used to connect to custom EDAS endpoints.