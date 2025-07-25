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

__all__ = ['RouteEntryArgs', 'RouteEntry']

@pulumi.input_type
class RouteEntryArgs:
    def __init__(__self__, *,
                 cidr_block: pulumi.Input[_builtins.str],
                 instance_id: pulumi.Input[_builtins.str],
                 route_table_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a RouteEntry resource.
        :param pulumi.Input[_builtins.str] cidr_block: The destination CIDR block of the route entry to publish.
               
               ->**NOTE:** The "alicloud_cen_instance_route_entries" resource depends on the related "cen.InstanceAttachment" resource.
               
               ->**NOTE:** The "cen.InstanceAttachment" resource should depend on the related "vpc.Switch" resource.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the CEN.
        :param pulumi.Input[_builtins.str] route_table_id: The route table of the attached VBR or VPC.
        """
        pulumi.set(__self__, "cidr_block", cidr_block)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "route_table_id", route_table_id)

    @_builtins.property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Input[_builtins.str]:
        """
        The destination CIDR block of the route entry to publish.

        ->**NOTE:** The "alicloud_cen_instance_route_entries" resource depends on the related "cen.InstanceAttachment" resource.

        ->**NOTE:** The "cen.InstanceAttachment" resource should depend on the related "vpc.Switch" resource.
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cidr_block", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Input[_builtins.str]:
        """
        The route table of the attached VBR or VPC.
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "route_table_id", value)


@pulumi.input_type
class _RouteEntryState:
    def __init__(__self__, *,
                 cidr_block: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 route_table_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering RouteEntry resources.
        :param pulumi.Input[_builtins.str] cidr_block: The destination CIDR block of the route entry to publish.
               
               ->**NOTE:** The "alicloud_cen_instance_route_entries" resource depends on the related "cen.InstanceAttachment" resource.
               
               ->**NOTE:** The "cen.InstanceAttachment" resource should depend on the related "vpc.Switch" resource.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the CEN.
        :param pulumi.Input[_builtins.str] route_table_id: The route table of the attached VBR or VPC.
        """
        if cidr_block is not None:
            pulumi.set(__self__, "cidr_block", cidr_block)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if route_table_id is not None:
            pulumi.set(__self__, "route_table_id", route_table_id)

    @_builtins.property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The destination CIDR block of the route entry to publish.

        ->**NOTE:** The "alicloud_cen_instance_route_entries" resource depends on the related "cen.InstanceAttachment" resource.

        ->**NOTE:** The "cen.InstanceAttachment" resource should depend on the related "vpc.Switch" resource.
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cidr_block", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The route table of the attached VBR or VPC.
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "route_table_id", value)


@pulumi.type_token("alicloud:cen/routeEntry:RouteEntry")
class RouteEntry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr_block: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 route_table_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a CEN route entry resource. Cloud Enterprise Network (CEN) supports publishing and withdrawing route entries of attached networks. You can publish a route entry of an attached VPC or VBR to a CEN instance, then other attached networks can learn the route if there is no route conflict. You can withdraw a published route entry when CEN does not need it any more.

        For information about CEN route entries publishment and how to use it, see [Manage network routes](https://www.alibabacloud.com/help/doc-detail/86980.htm).

        > **NOTE:** Available since v1.20.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.get_regions(current=True)
        example = alicloud.get_zones(available_resource_creation="Instance")
        example_get_instance_types = alicloud.ecs.get_instance_types(availability_zone=example.zones[0].id,
            cpu_core_count=1,
            memory_size=2)
        example_get_images = alicloud.ecs.get_images(name_regex="^ubuntu_18.*64",
            owners="system")
        example_network = alicloud.vpc.Network("example",
            vpc_name="terraform-example",
            cidr_block="172.17.3.0/24")
        example_switch = alicloud.vpc.Switch("example",
            vswitch_name="terraform-example",
            cidr_block="172.17.3.0/24",
            vpc_id=example_network.id,
            zone_id=example.zones[0].id)
        example_security_group = alicloud.ecs.SecurityGroup("example",
            name="terraform-example",
            vpc_id=example_network.id)
        example_instance = alicloud.ecs.Instance("example",
            availability_zone=example.zones[0].id,
            instance_name="terraform-example",
            image_id=example_get_images.images[0].id,
            instance_type=example_get_instance_types.instance_types[0].id,
            security_groups=[example_security_group.id],
            vswitch_id=example_switch.id,
            internet_max_bandwidth_out=5)
        example_instance2 = alicloud.cen.Instance("example",
            cen_instance_name="tf_example",
            description="an example for cen")
        example_instance_attachment = alicloud.cen.InstanceAttachment("example",
            instance_id=example_instance2.id,
            child_instance_id=example_network.id,
            child_instance_type="VPC",
            child_instance_region_id=default.regions[0].id)
        example_route_entry = alicloud.vpc.RouteEntry("example",
            route_table_id=example_network.route_table_id,
            destination_cidrblock="11.0.0.0/16",
            nexthop_type="Instance",
            nexthop_id=example_instance.id)
        example_route_entry2 = alicloud.cen.RouteEntry("example",
            instance_id=example_instance_attachment.instance_id,
            route_table_id=example_network.route_table_id,
            cidr_block=example_route_entry.destination_cidrblock)
        ```

        ## Import

        CEN instance can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cen/routeEntry:RouteEntry example cen-abc123456:vtb-abc123:192.168.0.0/24
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cidr_block: The destination CIDR block of the route entry to publish.
               
               ->**NOTE:** The "alicloud_cen_instance_route_entries" resource depends on the related "cen.InstanceAttachment" resource.
               
               ->**NOTE:** The "cen.InstanceAttachment" resource should depend on the related "vpc.Switch" resource.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the CEN.
        :param pulumi.Input[_builtins.str] route_table_id: The route table of the attached VBR or VPC.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteEntryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN route entry resource. Cloud Enterprise Network (CEN) supports publishing and withdrawing route entries of attached networks. You can publish a route entry of an attached VPC or VBR to a CEN instance, then other attached networks can learn the route if there is no route conflict. You can withdraw a published route entry when CEN does not need it any more.

        For information about CEN route entries publishment and how to use it, see [Manage network routes](https://www.alibabacloud.com/help/doc-detail/86980.htm).

        > **NOTE:** Available since v1.20.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.get_regions(current=True)
        example = alicloud.get_zones(available_resource_creation="Instance")
        example_get_instance_types = alicloud.ecs.get_instance_types(availability_zone=example.zones[0].id,
            cpu_core_count=1,
            memory_size=2)
        example_get_images = alicloud.ecs.get_images(name_regex="^ubuntu_18.*64",
            owners="system")
        example_network = alicloud.vpc.Network("example",
            vpc_name="terraform-example",
            cidr_block="172.17.3.0/24")
        example_switch = alicloud.vpc.Switch("example",
            vswitch_name="terraform-example",
            cidr_block="172.17.3.0/24",
            vpc_id=example_network.id,
            zone_id=example.zones[0].id)
        example_security_group = alicloud.ecs.SecurityGroup("example",
            name="terraform-example",
            vpc_id=example_network.id)
        example_instance = alicloud.ecs.Instance("example",
            availability_zone=example.zones[0].id,
            instance_name="terraform-example",
            image_id=example_get_images.images[0].id,
            instance_type=example_get_instance_types.instance_types[0].id,
            security_groups=[example_security_group.id],
            vswitch_id=example_switch.id,
            internet_max_bandwidth_out=5)
        example_instance2 = alicloud.cen.Instance("example",
            cen_instance_name="tf_example",
            description="an example for cen")
        example_instance_attachment = alicloud.cen.InstanceAttachment("example",
            instance_id=example_instance2.id,
            child_instance_id=example_network.id,
            child_instance_type="VPC",
            child_instance_region_id=default.regions[0].id)
        example_route_entry = alicloud.vpc.RouteEntry("example",
            route_table_id=example_network.route_table_id,
            destination_cidrblock="11.0.0.0/16",
            nexthop_type="Instance",
            nexthop_id=example_instance.id)
        example_route_entry2 = alicloud.cen.RouteEntry("example",
            instance_id=example_instance_attachment.instance_id,
            route_table_id=example_network.route_table_id,
            cidr_block=example_route_entry.destination_cidrblock)
        ```

        ## Import

        CEN instance can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cen/routeEntry:RouteEntry example cen-abc123456:vtb-abc123:192.168.0.0/24
        ```

        :param str resource_name: The name of the resource.
        :param RouteEntryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteEntryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr_block: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 route_table_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouteEntryArgs.__new__(RouteEntryArgs)

            if cidr_block is None and not opts.urn:
                raise TypeError("Missing required property 'cidr_block'")
            __props__.__dict__["cidr_block"] = cidr_block
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'route_table_id'")
            __props__.__dict__["route_table_id"] = route_table_id
        super(RouteEntry, __self__).__init__(
            'alicloud:cen/routeEntry:RouteEntry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cidr_block: Optional[pulumi.Input[_builtins.str]] = None,
            instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            route_table_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'RouteEntry':
        """
        Get an existing RouteEntry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cidr_block: The destination CIDR block of the route entry to publish.
               
               ->**NOTE:** The "alicloud_cen_instance_route_entries" resource depends on the related "cen.InstanceAttachment" resource.
               
               ->**NOTE:** The "cen.InstanceAttachment" resource should depend on the related "vpc.Switch" resource.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the CEN.
        :param pulumi.Input[_builtins.str] route_table_id: The route table of the attached VBR or VPC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteEntryState.__new__(_RouteEntryState)

        __props__.__dict__["cidr_block"] = cidr_block
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["route_table_id"] = route_table_id
        return RouteEntry(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Output[_builtins.str]:
        """
        The destination CIDR block of the route entry to publish.

        ->**NOTE:** The "alicloud_cen_instance_route_entries" resource depends on the related "cen.InstanceAttachment" resource.

        ->**NOTE:** The "cen.InstanceAttachment" resource should depend on the related "vpc.Switch" resource.
        """
        return pulumi.get(self, "cidr_block")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Output[_builtins.str]:
        """
        The route table of the attached VBR or VPC.
        """
        return pulumi.get(self, "route_table_id")

