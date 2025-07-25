# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NetworkAclArgs', 'NetworkAcl']

@pulumi.input_type
class NetworkAclArgs:
    def __init__(__self__, *,
                 vpc_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 egress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressAclEntryArgs']]]] = None,
                 ingress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressAclEntryArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_acl_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resources: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclResourceArgs']]]] = None,
                 source_network_acl_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a NetworkAcl resource.
        :param pulumi.Input[_builtins.str] vpc_id: The ID of the associated VPC.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        :param pulumi.Input[_builtins.str] description: The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressAclEntryArgs']]] egress_acl_entries: Out direction rule information. See `egress_acl_entries` below.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressAclEntryArgs']]] ingress_acl_entries: Inward direction rule information. See `ingress_acl_entries` below.
        :param pulumi.Input[_builtins.str] name: . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
        :param pulumi.Input[_builtins.str] network_acl_name: The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclResourceArgs']]] resources: The associated resource. See `resources` below.
        :param pulumi.Input[_builtins.str] source_network_acl_id: SOURCE NetworkAcl specified by CopyNetworkAclEntries.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tags of this resource.
        """
        pulumi.set(__self__, "vpc_id", vpc_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if egress_acl_entries is not None:
            pulumi.set(__self__, "egress_acl_entries", egress_acl_entries)
        if ingress_acl_entries is not None:
            pulumi.set(__self__, "ingress_acl_entries", ingress_acl_entries)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_acl_name is not None:
            pulumi.set(__self__, "network_acl_name", network_acl_name)
        if resources is not None:
            pulumi.set(__self__, "resources", resources)
        if source_network_acl_id is not None:
            pulumi.set(__self__, "source_network_acl_id", source_network_acl_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the associated VPC.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "vpc_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="egressAclEntries")
    def egress_acl_entries(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressAclEntryArgs']]]]:
        """
        Out direction rule information. See `egress_acl_entries` below.
        """
        return pulumi.get(self, "egress_acl_entries")

    @egress_acl_entries.setter
    def egress_acl_entries(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressAclEntryArgs']]]]):
        pulumi.set(self, "egress_acl_entries", value)

    @_builtins.property
    @pulumi.getter(name="ingressAclEntries")
    def ingress_acl_entries(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressAclEntryArgs']]]]:
        """
        Inward direction rule information. See `ingress_acl_entries` below.
        """
        return pulumi.get(self, "ingress_acl_entries")

    @ingress_acl_entries.setter
    def ingress_acl_entries(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressAclEntryArgs']]]]):
        pulumi.set(self, "ingress_acl_entries", value)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.""")
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkAclName")
    def network_acl_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
        """
        return pulumi.get(self, "network_acl_name")

    @network_acl_name.setter
    def network_acl_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_acl_name", value)

    @_builtins.property
    @pulumi.getter
    def resources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclResourceArgs']]]]:
        """
        The associated resource. See `resources` below.
        """
        return pulumi.get(self, "resources")

    @resources.setter
    def resources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclResourceArgs']]]]):
        pulumi.set(self, "resources", value)

    @_builtins.property
    @pulumi.getter(name="sourceNetworkAclId")
    def source_network_acl_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        SOURCE NetworkAcl specified by CopyNetworkAclEntries.
        """
        return pulumi.get(self, "source_network_acl_id")

    @source_network_acl_id.setter
    def source_network_acl_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_network_acl_id", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The tags of this resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _NetworkAclState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 egress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressAclEntryArgs']]]] = None,
                 ingress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressAclEntryArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_acl_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resources: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclResourceArgs']]]] = None,
                 source_network_acl_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 vpc_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering NetworkAcl resources.
        :param pulumi.Input[_builtins.str] create_time: The creation time of the resource.
        :param pulumi.Input[_builtins.str] description: The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressAclEntryArgs']]] egress_acl_entries: Out direction rule information. See `egress_acl_entries` below.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressAclEntryArgs']]] ingress_acl_entries: Inward direction rule information. See `ingress_acl_entries` below.
        :param pulumi.Input[_builtins.str] name: . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
        :param pulumi.Input[_builtins.str] network_acl_name: The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclResourceArgs']]] resources: The associated resource. See `resources` below.
        :param pulumi.Input[_builtins.str] source_network_acl_id: SOURCE NetworkAcl specified by CopyNetworkAclEntries.
        :param pulumi.Input[_builtins.str] status: The state of the network ACL.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tags of this resource.
        :param pulumi.Input[_builtins.str] vpc_id: The ID of the associated VPC.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if egress_acl_entries is not None:
            pulumi.set(__self__, "egress_acl_entries", egress_acl_entries)
        if ingress_acl_entries is not None:
            pulumi.set(__self__, "ingress_acl_entries", ingress_acl_entries)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_acl_name is not None:
            pulumi.set(__self__, "network_acl_name", network_acl_name)
        if resources is not None:
            pulumi.set(__self__, "resources", resources)
        if source_network_acl_id is not None:
            pulumi.set(__self__, "source_network_acl_id", source_network_acl_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="egressAclEntries")
    def egress_acl_entries(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressAclEntryArgs']]]]:
        """
        Out direction rule information. See `egress_acl_entries` below.
        """
        return pulumi.get(self, "egress_acl_entries")

    @egress_acl_entries.setter
    def egress_acl_entries(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressAclEntryArgs']]]]):
        pulumi.set(self, "egress_acl_entries", value)

    @_builtins.property
    @pulumi.getter(name="ingressAclEntries")
    def ingress_acl_entries(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressAclEntryArgs']]]]:
        """
        Inward direction rule information. See `ingress_acl_entries` below.
        """
        return pulumi.get(self, "ingress_acl_entries")

    @ingress_acl_entries.setter
    def ingress_acl_entries(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressAclEntryArgs']]]]):
        pulumi.set(self, "ingress_acl_entries", value)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.""")
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkAclName")
    def network_acl_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
        """
        return pulumi.get(self, "network_acl_name")

    @network_acl_name.setter
    def network_acl_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_acl_name", value)

    @_builtins.property
    @pulumi.getter
    def resources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclResourceArgs']]]]:
        """
        The associated resource. See `resources` below.
        """
        return pulumi.get(self, "resources")

    @resources.setter
    def resources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclResourceArgs']]]]):
        pulumi.set(self, "resources", value)

    @_builtins.property
    @pulumi.getter(name="sourceNetworkAclId")
    def source_network_acl_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        SOURCE NetworkAcl specified by CopyNetworkAclEntries.
        """
        return pulumi.get(self, "source_network_acl_id")

    @source_network_acl_id.setter
    def source_network_acl_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_network_acl_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The state of the network ACL.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The tags of this resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the associated VPC.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vpc_id", value)


@pulumi.type_token("alicloud:vpc/networkAcl:NetworkAcl")
class NetworkAcl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 egress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclEgressAclEntryArgs', 'NetworkAclEgressAclEntryArgsDict']]]]] = None,
                 ingress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclIngressAclEntryArgs', 'NetworkAclIngressAclEntryArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_acl_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclResourceArgs', 'NetworkAclResourceArgsDict']]]]] = None,
                 source_network_acl_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 vpc_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a VPC Network Acl resource. Network Access Control List (ACL) is a Network Access Control function in VPC. You can customize the network ACL rules and bind the network ACL to the switch to control the traffic of ECS instances in the switch.

        For information about VPC Network Acl and how to use it, see [What is Network Acl](https://www.alibabacloud.com/help/en/ens/latest/createnetworkacl).

        > **NOTE:** Available since v1.43.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        example = alicloud.vpc.Network("example",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        example_switch = alicloud.vpc.Switch("example",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=example.id,
            zone_id=default.zones[0].id)
        example_network_acl = alicloud.vpc.NetworkAcl("example",
            vpc_id=example.id,
            network_acl_name=name,
            description=name,
            ingress_acl_entries=[{
                "description": f"{name}-ingress",
                "network_acl_entry_name": f"{name}-ingress",
                "source_cidr_ip": "10.0.0.0/24",
                "policy": "accept",
                "port": "20/80",
                "protocol": "tcp",
            }],
            egress_acl_entries=[{
                "description": f"{name}-egress",
                "network_acl_entry_name": f"{name}-egress",
                "destination_cidr_ip": "10.0.0.0/24",
                "policy": "accept",
                "port": "20/80",
                "protocol": "tcp",
            }],
            resources=[{
                "resource_id": example_switch.id,
                "resource_type": "VSwitch",
            }])
        ```

        ## Import

        VPC Network Acl can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:vpc/networkAcl:NetworkAcl example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
        :param pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclEgressAclEntryArgs', 'NetworkAclEgressAclEntryArgsDict']]]] egress_acl_entries: Out direction rule information. See `egress_acl_entries` below.
        :param pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclIngressAclEntryArgs', 'NetworkAclIngressAclEntryArgsDict']]]] ingress_acl_entries: Inward direction rule information. See `ingress_acl_entries` below.
        :param pulumi.Input[_builtins.str] name: . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
        :param pulumi.Input[_builtins.str] network_acl_name: The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
        :param pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclResourceArgs', 'NetworkAclResourceArgsDict']]]] resources: The associated resource. See `resources` below.
        :param pulumi.Input[_builtins.str] source_network_acl_id: SOURCE NetworkAcl specified by CopyNetworkAclEntries.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tags of this resource.
        :param pulumi.Input[_builtins.str] vpc_id: The ID of the associated VPC.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkAclArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPC Network Acl resource. Network Access Control List (ACL) is a Network Access Control function in VPC. You can customize the network ACL rules and bind the network ACL to the switch to control the traffic of ECS instances in the switch.

        For information about VPC Network Acl and how to use it, see [What is Network Acl](https://www.alibabacloud.com/help/en/ens/latest/createnetworkacl).

        > **NOTE:** Available since v1.43.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        example = alicloud.vpc.Network("example",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        example_switch = alicloud.vpc.Switch("example",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=example.id,
            zone_id=default.zones[0].id)
        example_network_acl = alicloud.vpc.NetworkAcl("example",
            vpc_id=example.id,
            network_acl_name=name,
            description=name,
            ingress_acl_entries=[{
                "description": f"{name}-ingress",
                "network_acl_entry_name": f"{name}-ingress",
                "source_cidr_ip": "10.0.0.0/24",
                "policy": "accept",
                "port": "20/80",
                "protocol": "tcp",
            }],
            egress_acl_entries=[{
                "description": f"{name}-egress",
                "network_acl_entry_name": f"{name}-egress",
                "destination_cidr_ip": "10.0.0.0/24",
                "policy": "accept",
                "port": "20/80",
                "protocol": "tcp",
            }],
            resources=[{
                "resource_id": example_switch.id,
                "resource_type": "VSwitch",
            }])
        ```

        ## Import

        VPC Network Acl can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:vpc/networkAcl:NetworkAcl example <id>
        ```

        :param str resource_name: The name of the resource.
        :param NetworkAclArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkAclArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 egress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclEgressAclEntryArgs', 'NetworkAclEgressAclEntryArgsDict']]]]] = None,
                 ingress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclIngressAclEntryArgs', 'NetworkAclIngressAclEntryArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_acl_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclResourceArgs', 'NetworkAclResourceArgsDict']]]]] = None,
                 source_network_acl_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 vpc_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkAclArgs.__new__(NetworkAclArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["egress_acl_entries"] = egress_acl_entries
            __props__.__dict__["ingress_acl_entries"] = ingress_acl_entries
            __props__.__dict__["name"] = name
            __props__.__dict__["network_acl_name"] = network_acl_name
            __props__.__dict__["resources"] = resources
            __props__.__dict__["source_network_acl_id"] = source_network_acl_id
            __props__.__dict__["tags"] = tags
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(NetworkAcl, __self__).__init__(
            'alicloud:vpc/networkAcl:NetworkAcl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            egress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclEgressAclEntryArgs', 'NetworkAclEgressAclEntryArgsDict']]]]] = None,
            ingress_acl_entries: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclIngressAclEntryArgs', 'NetworkAclIngressAclEntryArgsDict']]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            network_acl_name: Optional[pulumi.Input[_builtins.str]] = None,
            resources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclResourceArgs', 'NetworkAclResourceArgsDict']]]]] = None,
            source_network_acl_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            vpc_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'NetworkAcl':
        """
        Get an existing NetworkAcl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: The creation time of the resource.
        :param pulumi.Input[_builtins.str] description: The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
        :param pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclEgressAclEntryArgs', 'NetworkAclEgressAclEntryArgsDict']]]] egress_acl_entries: Out direction rule information. See `egress_acl_entries` below.
        :param pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclIngressAclEntryArgs', 'NetworkAclIngressAclEntryArgsDict']]]] ingress_acl_entries: Inward direction rule information. See `ingress_acl_entries` below.
        :param pulumi.Input[_builtins.str] name: . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
        :param pulumi.Input[_builtins.str] network_acl_name: The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
        :param pulumi.Input[Sequence[pulumi.Input[Union['NetworkAclResourceArgs', 'NetworkAclResourceArgsDict']]]] resources: The associated resource. See `resources` below.
        :param pulumi.Input[_builtins.str] source_network_acl_id: SOURCE NetworkAcl specified by CopyNetworkAclEntries.
        :param pulumi.Input[_builtins.str] status: The state of the network ACL.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tags of this resource.
        :param pulumi.Input[_builtins.str] vpc_id: The ID of the associated VPC.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkAclState.__new__(_NetworkAclState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["egress_acl_entries"] = egress_acl_entries
        __props__.__dict__["ingress_acl_entries"] = ingress_acl_entries
        __props__.__dict__["name"] = name
        __props__.__dict__["network_acl_name"] = network_acl_name
        __props__.__dict__["resources"] = resources
        __props__.__dict__["source_network_acl_id"] = source_network_acl_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_id"] = vpc_id
        return NetworkAcl(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the network ACL.  The description must be 1 to 256 characters in length and cannot start with http:// or https.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="egressAclEntries")
    def egress_acl_entries(self) -> pulumi.Output[Sequence['outputs.NetworkAclEgressAclEntry']]:
        """
        Out direction rule information. See `egress_acl_entries` below.
        """
        return pulumi.get(self, "egress_acl_entries")

    @_builtins.property
    @pulumi.getter(name="ingressAclEntries")
    def ingress_acl_entries(self) -> pulumi.Output[Sequence['outputs.NetworkAclIngressAclEntry']]:
        """
        Inward direction rule information. See `ingress_acl_entries` below.
        """
        return pulumi.get(self, "ingress_acl_entries")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Field 'name' has been deprecated since provider version 1.122.0. New field 'network_acl_name' instead.""")
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        . Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkAclName")
    def network_acl_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the network ACL.  The name must be 1 to 128 characters in length and cannot start with http:// or https.
        """
        return pulumi.get(self, "network_acl_name")

    @_builtins.property
    @pulumi.getter
    def resources(self) -> pulumi.Output[Sequence['outputs.NetworkAclResource']]:
        """
        The associated resource. See `resources` below.
        """
        return pulumi.get(self, "resources")

    @_builtins.property
    @pulumi.getter(name="sourceNetworkAclId")
    def source_network_acl_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        SOURCE NetworkAcl specified by CopyNetworkAclEntries.
        """
        return pulumi.get(self, "source_network_acl_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The state of the network ACL.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        The tags of this resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the associated VPC.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "vpc_id")

