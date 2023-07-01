// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.HaVipv2Args;
import com.pulumi.alicloud.vpc.inputs.HaVipv2State;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Vpc Ha Vip resource. Highly available virtual IP
 * 
 * For information about Vpc Ha Vip and how to use it, see [What is Ha Vip](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createhavip).
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.resourcemanager.ResourceGroup;
 * import com.pulumi.alicloud.resourcemanager.ResourceGroupArgs;
 * import com.pulumi.alicloud.vpc.HaVipv2;
 * import com.pulumi.alicloud.vpc.HaVipv2Args;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-testacc-example&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultVpc = new Network(&#34;defaultVpc&#34;, NetworkArgs.builder()        
 *             .description(&#34;tf-test-acc-vpc&#34;)
 *             .vpcName(name)
 *             .cidrBlock(&#34;192.168.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultVswitch = new Switch(&#34;defaultVswitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultVpc.id())
 *             .cidrBlock(&#34;192.168.0.0/21&#34;)
 *             .vswitchName(String.format(&#34;%s1&#34;, name))
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .description(&#34;tf-testacc-vswitch&#34;)
 *             .build());
 * 
 *         var defaultRg = new ResourceGroup(&#34;defaultRg&#34;, ResourceGroupArgs.builder()        
 *             .displayName(&#34;tf-testacc-rg819&#34;)
 *             .resourceGroupName(String.format(&#34;%s2&#34;, name))
 *             .build());
 * 
 *         var changeRg = new ResourceGroup(&#34;changeRg&#34;, ResourceGroupArgs.builder()        
 *             .displayName(&#34;tf-testacc-changerg670&#34;)
 *             .resourceGroupName(String.format(&#34;%s3&#34;, name))
 *             .build());
 * 
 *         var defaultHaVipv2 = new HaVipv2(&#34;defaultHaVipv2&#34;, HaVipv2Args.builder()        
 *             .description(&#34;test&#34;)
 *             .vswitchId(defaultVswitch.id())
 *             .haVipName(name)
 *             .ipAddress(&#34;192.168.1.101&#34;)
 *             .resourceGroupId(defaultRg.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Vpc Ha Vip can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/haVipv2:HaVipv2 example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/haVipv2:HaVipv2")
public class HaVipv2 extends com.pulumi.resources.CustomResource {
    /**
     * EIP bound to HaVip.
     * 
     */
    @Export(name="associatedEipAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> associatedEipAddresses;

    /**
     * @return EIP bound to HaVip.
     * 
     */
    public Output<List<String>> associatedEipAddresses() {
        return this.associatedEipAddresses;
    }
    /**
     * The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
     * 
     */
    @Export(name="associatedInstanceType", type=String.class, parameters={})
    private Output<String> associatedInstanceType;

    /**
     * @return The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
     * 
     */
    public Output<String> associatedInstanceType() {
        return this.associatedInstanceType;
    }
    /**
     * An ECS instance that is bound to HaVip.
     * 
     */
    @Export(name="associatedInstances", type=List.class, parameters={String.class})
    private Output<List<String>> associatedInstances;

    /**
     * @return An ECS instance that is bound to HaVip.
     * 
     */
    public Output<List<String>> associatedInstances() {
        return this.associatedInstances;
    }
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the HaVip instance. The length is 2 to 256 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the HaVip instance. The length is 2 to 256 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the resource.
     * 
     */
    @Export(name="haVipId", type=String.class, parameters={})
    private Output<String> haVipId;

    /**
     * @return The ID of the resource.
     * 
     */
    public Output<String> haVipId() {
        return this.haVipId;
    }
    /**
     * The name of the HaVip instance.
     * 
     */
    @Export(name="haVipName", type=String.class, parameters={})
    private Output<String> haVipName;

    /**
     * @return The name of the HaVip instance.
     * 
     */
    public Output<String> haVipName() {
        return this.haVipName;
    }
    /**
     * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
    @Export(name="havipName", type=String.class, parameters={})
    private Output<String> havipName;

    /**
     * @return Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     */
    public Output<String> havipName() {
        return this.havipName;
    }
    /**
     * The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * The primary instance ID bound to HaVip.
     * 
     */
    @Export(name="masterInstanceId", type=String.class, parameters={})
    private Output<String> masterInstanceId;

    /**
     * @return The primary instance ID bound to HaVip.
     * 
     */
    public Output<String> masterInstanceId() {
        return this.masterInstanceId;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The status of this resource instance.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of this resource instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags of HaVip.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tags of HaVip.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The VPC ID to which the HaVip instance belongs.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC ID to which the HaVip instance belongs.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The switch ID to which the HaVip instance belongs.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return The switch ID to which the HaVip instance belongs.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HaVipv2(String name) {
        this(name, HaVipv2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HaVipv2(String name, HaVipv2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HaVipv2(String name, HaVipv2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/haVipv2:HaVipv2", name, args == null ? HaVipv2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HaVipv2(String name, Output<String> id, @Nullable HaVipv2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/haVipv2:HaVipv2", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HaVipv2 get(String name, Output<String> id, @Nullable HaVipv2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HaVipv2(name, id, state, options);
    }
}