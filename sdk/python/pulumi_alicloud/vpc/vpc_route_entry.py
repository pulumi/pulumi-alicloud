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

__all__ = ['VPCRouteEntryArgs', 'VPCRouteEntry']

@pulumi.input_type
class VPCRouteEntryArgs:
    def __init__(__self__, *,
                 destination_cidr_block: pulumi.Input[_builtins.str],
                 route_table_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 next_hops: Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryNextHopArgs']]]] = None,
                 nexthop_id: Optional[pulumi.Input[_builtins.str]] = None,
                 nexthop_type: Optional[pulumi.Input[_builtins.str]] = None,
                 route_entry_name: Optional[pulumi.Input[_builtins.str]] = None,
                 route_publish_targets: Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryRoutePublishTargetArgs']]]] = None):
        """
        The set of arguments for constructing a VPCRouteEntry resource.
        :param pulumi.Input[_builtins.str] destination_cidr_block: The destination network segment of the routing entry.
        :param pulumi.Input[_builtins.str] route_table_id: Routing table ID
        :param pulumi.Input[_builtins.str] description: Description of the route entry.
        :param pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryNextHopArgs']]] next_hops: Next jump See `next_hops` below.
        :param pulumi.Input[_builtins.str] nexthop_id: The ID of the next hop instance of the custom route entry.
        :param pulumi.Input[_builtins.str] nexthop_type: The type of the next hop of the custom route entry. Valid values:
               - `Instance` (default): The ECS Instance.
               - `HaVip`: a highly available virtual IP address.
               - `RouterInterface`: indicates the router interface.
               - **Network interface**: ENI.
               - `VpnGateway`: the VPN gateway.
               - `IPv6Gateway`:IPv6 gateway.
               - `NatGateway`:NAT gateway.
               - `Attachment`: The forwarding router.
               - `VpcPeer`:VPC peer connection.
               - `Ipv4Gateway`:IPv4 Gateway.
               - `GatewayEndpoint`: the gateway endpoint.
               - `Ecr`: Leased line gateway.
               - `GatewayLoadBalancerEndpoint`: The Gateway-based load balancing endpoint.
        :param pulumi.Input[_builtins.str] route_entry_name: The name of the route entry.
        :param pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryRoutePublishTargetArgs']]] route_publish_targets: Route publish status and publish target type See `route_publish_targets` below.
        """
        pulumi.set(__self__, "destination_cidr_block", destination_cidr_block)
        pulumi.set(__self__, "route_table_id", route_table_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if next_hops is not None:
            pulumi.set(__self__, "next_hops", next_hops)
        if nexthop_id is not None:
            pulumi.set(__self__, "nexthop_id", nexthop_id)
        if nexthop_type is not None:
            pulumi.set(__self__, "nexthop_type", nexthop_type)
        if route_entry_name is not None:
            pulumi.set(__self__, "route_entry_name", route_entry_name)
        if route_publish_targets is not None:
            pulumi.set(__self__, "route_publish_targets", route_publish_targets)

    @_builtins.property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> pulumi.Input[_builtins.str]:
        """
        The destination network segment of the routing entry.
        """
        return pulumi.get(self, "destination_cidr_block")

    @destination_cidr_block.setter
    def destination_cidr_block(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "destination_cidr_block", value)

    @_builtins.property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Input[_builtins.str]:
        """
        Routing table ID
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "route_table_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the route entry.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="nextHops")
    def next_hops(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryNextHopArgs']]]]:
        """
        Next jump See `next_hops` below.
        """
        return pulumi.get(self, "next_hops")

    @next_hops.setter
    def next_hops(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryNextHopArgs']]]]):
        pulumi.set(self, "next_hops", value)

    @_builtins.property
    @pulumi.getter(name="nexthopId")
    def nexthop_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the next hop instance of the custom route entry.
        """
        return pulumi.get(self, "nexthop_id")

    @nexthop_id.setter
    def nexthop_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "nexthop_id", value)

    @_builtins.property
    @pulumi.getter(name="nexthopType")
    def nexthop_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the next hop of the custom route entry. Valid values:
        - `Instance` (default): The ECS Instance.
        - `HaVip`: a highly available virtual IP address.
        - `RouterInterface`: indicates the router interface.
        - **Network interface**: ENI.
        - `VpnGateway`: the VPN gateway.
        - `IPv6Gateway`:IPv6 gateway.
        - `NatGateway`:NAT gateway.
        - `Attachment`: The forwarding router.
        - `VpcPeer`:VPC peer connection.
        - `Ipv4Gateway`:IPv4 Gateway.
        - `GatewayEndpoint`: the gateway endpoint.
        - `Ecr`: Leased line gateway.
        - `GatewayLoadBalancerEndpoint`: The Gateway-based load balancing endpoint.
        """
        return pulumi.get(self, "nexthop_type")

    @nexthop_type.setter
    def nexthop_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "nexthop_type", value)

    @_builtins.property
    @pulumi.getter(name="routeEntryName")
    def route_entry_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the route entry.
        """
        return pulumi.get(self, "route_entry_name")

    @route_entry_name.setter
    def route_entry_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "route_entry_name", value)

    @_builtins.property
    @pulumi.getter(name="routePublishTargets")
    def route_publish_targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryRoutePublishTargetArgs']]]]:
        """
        Route publish status and publish target type See `route_publish_targets` below.
        """
        return pulumi.get(self, "route_publish_targets")

    @route_publish_targets.setter
    def route_publish_targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryRoutePublishTargetArgs']]]]):
        pulumi.set(self, "route_publish_targets", value)


@pulumi.input_type
class _VPCRouteEntryState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_cidr_block: Optional[pulumi.Input[_builtins.str]] = None,
                 next_hops: Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryNextHopArgs']]]] = None,
                 nexthop_id: Optional[pulumi.Input[_builtins.str]] = None,
                 nexthop_type: Optional[pulumi.Input[_builtins.str]] = None,
                 route_entry_name: Optional[pulumi.Input[_builtins.str]] = None,
                 route_publish_targets: Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryRoutePublishTargetArgs']]]] = None,
                 route_table_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering VPCRouteEntry resources.
        :param pulumi.Input[_builtins.str] description: Description of the route entry.
        :param pulumi.Input[_builtins.str] destination_cidr_block: The destination network segment of the routing entry.
        :param pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryNextHopArgs']]] next_hops: Next jump See `next_hops` below.
        :param pulumi.Input[_builtins.str] nexthop_id: The ID of the next hop instance of the custom route entry.
        :param pulumi.Input[_builtins.str] nexthop_type: The type of the next hop of the custom route entry. Valid values:
               - `Instance` (default): The ECS Instance.
               - `HaVip`: a highly available virtual IP address.
               - `RouterInterface`: indicates the router interface.
               - **Network interface**: ENI.
               - `VpnGateway`: the VPN gateway.
               - `IPv6Gateway`:IPv6 gateway.
               - `NatGateway`:NAT gateway.
               - `Attachment`: The forwarding router.
               - `VpcPeer`:VPC peer connection.
               - `Ipv4Gateway`:IPv4 Gateway.
               - `GatewayEndpoint`: the gateway endpoint.
               - `Ecr`: Leased line gateway.
               - `GatewayLoadBalancerEndpoint`: The Gateway-based load balancing endpoint.
        :param pulumi.Input[_builtins.str] route_entry_name: The name of the route entry.
        :param pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryRoutePublishTargetArgs']]] route_publish_targets: Route publish status and publish target type See `route_publish_targets` below.
        :param pulumi.Input[_builtins.str] route_table_id: Routing table ID
        :param pulumi.Input[_builtins.str] status: The status of the route entry.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if destination_cidr_block is not None:
            pulumi.set(__self__, "destination_cidr_block", destination_cidr_block)
        if next_hops is not None:
            pulumi.set(__self__, "next_hops", next_hops)
        if nexthop_id is not None:
            pulumi.set(__self__, "nexthop_id", nexthop_id)
        if nexthop_type is not None:
            pulumi.set(__self__, "nexthop_type", nexthop_type)
        if route_entry_name is not None:
            pulumi.set(__self__, "route_entry_name", route_entry_name)
        if route_publish_targets is not None:
            pulumi.set(__self__, "route_publish_targets", route_publish_targets)
        if route_table_id is not None:
            pulumi.set(__self__, "route_table_id", route_table_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the route entry.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The destination network segment of the routing entry.
        """
        return pulumi.get(self, "destination_cidr_block")

    @destination_cidr_block.setter
    def destination_cidr_block(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "destination_cidr_block", value)

    @_builtins.property
    @pulumi.getter(name="nextHops")
    def next_hops(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryNextHopArgs']]]]:
        """
        Next jump See `next_hops` below.
        """
        return pulumi.get(self, "next_hops")

    @next_hops.setter
    def next_hops(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryNextHopArgs']]]]):
        pulumi.set(self, "next_hops", value)

    @_builtins.property
    @pulumi.getter(name="nexthopId")
    def nexthop_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the next hop instance of the custom route entry.
        """
        return pulumi.get(self, "nexthop_id")

    @nexthop_id.setter
    def nexthop_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "nexthop_id", value)

    @_builtins.property
    @pulumi.getter(name="nexthopType")
    def nexthop_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the next hop of the custom route entry. Valid values:
        - `Instance` (default): The ECS Instance.
        - `HaVip`: a highly available virtual IP address.
        - `RouterInterface`: indicates the router interface.
        - **Network interface**: ENI.
        - `VpnGateway`: the VPN gateway.
        - `IPv6Gateway`:IPv6 gateway.
        - `NatGateway`:NAT gateway.
        - `Attachment`: The forwarding router.
        - `VpcPeer`:VPC peer connection.
        - `Ipv4Gateway`:IPv4 Gateway.
        - `GatewayEndpoint`: the gateway endpoint.
        - `Ecr`: Leased line gateway.
        - `GatewayLoadBalancerEndpoint`: The Gateway-based load balancing endpoint.
        """
        return pulumi.get(self, "nexthop_type")

    @nexthop_type.setter
    def nexthop_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "nexthop_type", value)

    @_builtins.property
    @pulumi.getter(name="routeEntryName")
    def route_entry_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the route entry.
        """
        return pulumi.get(self, "route_entry_name")

    @route_entry_name.setter
    def route_entry_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "route_entry_name", value)

    @_builtins.property
    @pulumi.getter(name="routePublishTargets")
    def route_publish_targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryRoutePublishTargetArgs']]]]:
        """
        Route publish status and publish target type See `route_publish_targets` below.
        """
        return pulumi.get(self, "route_publish_targets")

    @route_publish_targets.setter
    def route_publish_targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VPCRouteEntryRoutePublishTargetArgs']]]]):
        pulumi.set(self, "route_publish_targets", value)

    @_builtins.property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Routing table ID
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "route_table_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the route entry.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:vpc/vPCRouteEntry:VPCRouteEntry")
class VPCRouteEntry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_cidr_block: Optional[pulumi.Input[_builtins.str]] = None,
                 next_hops: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryNextHopArgs', 'VPCRouteEntryNextHopArgsDict']]]]] = None,
                 nexthop_id: Optional[pulumi.Input[_builtins.str]] = None,
                 nexthop_type: Optional[pulumi.Input[_builtins.str]] = None,
                 route_entry_name: Optional[pulumi.Input[_builtins.str]] = None,
                 route_publish_targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryRoutePublishTargetArgs', 'VPCRouteEntryRoutePublishTargetArgsDict']]]]] = None,
                 route_table_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a VPC Route Entry resource.

        There are route entries in the routing table, and the next hop is judged based on the route entries.

        For information about VPC Route Entry and how to use it, see [What is Route Entry](https://www.alibabacloud.com/help/en/vpc/developer-reference/api-vpc-2016-04-28-createrouteentry).

        > **NOTE:** Available since v1.245.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_get_images = alicloud.ecs.get_images(most_recent=True,
            owners="system")
        default_get_instance_types = alicloud.ecs.get_instance_types(availability_zone=default.zones[0].id,
            image_id=default_get_images.images[0].id)
        default_network = alicloud.vpc.Network("default",
            vpc_name=name,
            cidr_block="192.168.0.0/16")
        default_switch = alicloud.vpc.Switch("default",
            vswitch_name=name,
            vpc_id=default_network.id,
            cidr_block="192.168.192.0/24",
            zone_id=default.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("default",
            name=name,
            vpc_id=default_network.id)
        default_instance = alicloud.ecs.Instance("default",
            image_id=default_get_images.images[0].id,
            instance_type=default_get_instance_types.instance_types[0].id,
            security_groups=[__item.id for __item in [default_security_group]],
            internet_charge_type="PayByTraffic",
            internet_max_bandwidth_out=10,
            availability_zone=default_get_instance_types.instance_types[0].availability_zones[0],
            instance_charge_type="PostPaid",
            system_disk_category="cloud_efficiency",
            vswitch_id=default_switch.id,
            instance_name=name)
        foo = alicloud.vpc.RouteEntry("foo",
            route_table_id=default_network.route_table_id,
            destination_cidrblock="172.11.1.1/32",
            nexthop_type="Instance",
            nexthop_id=default_instance.id)
        ```

        ## Import

        VPC Route Entry can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:vpc/vPCRouteEntry:VPCRouteEntry example <route_table_id>:<destination_cidr_block>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: Description of the route entry.
        :param pulumi.Input[_builtins.str] destination_cidr_block: The destination network segment of the routing entry.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryNextHopArgs', 'VPCRouteEntryNextHopArgsDict']]]] next_hops: Next jump See `next_hops` below.
        :param pulumi.Input[_builtins.str] nexthop_id: The ID of the next hop instance of the custom route entry.
        :param pulumi.Input[_builtins.str] nexthop_type: The type of the next hop of the custom route entry. Valid values:
               - `Instance` (default): The ECS Instance.
               - `HaVip`: a highly available virtual IP address.
               - `RouterInterface`: indicates the router interface.
               - **Network interface**: ENI.
               - `VpnGateway`: the VPN gateway.
               - `IPv6Gateway`:IPv6 gateway.
               - `NatGateway`:NAT gateway.
               - `Attachment`: The forwarding router.
               - `VpcPeer`:VPC peer connection.
               - `Ipv4Gateway`:IPv4 Gateway.
               - `GatewayEndpoint`: the gateway endpoint.
               - `Ecr`: Leased line gateway.
               - `GatewayLoadBalancerEndpoint`: The Gateway-based load balancing endpoint.
        :param pulumi.Input[_builtins.str] route_entry_name: The name of the route entry.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryRoutePublishTargetArgs', 'VPCRouteEntryRoutePublishTargetArgsDict']]]] route_publish_targets: Route publish status and publish target type See `route_publish_targets` below.
        :param pulumi.Input[_builtins.str] route_table_id: Routing table ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VPCRouteEntryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPC Route Entry resource.

        There are route entries in the routing table, and the next hop is judged based on the route entries.

        For information about VPC Route Entry and how to use it, see [What is Route Entry](https://www.alibabacloud.com/help/en/vpc/developer-reference/api-vpc-2016-04-28-createrouteentry).

        > **NOTE:** Available since v1.245.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_get_images = alicloud.ecs.get_images(most_recent=True,
            owners="system")
        default_get_instance_types = alicloud.ecs.get_instance_types(availability_zone=default.zones[0].id,
            image_id=default_get_images.images[0].id)
        default_network = alicloud.vpc.Network("default",
            vpc_name=name,
            cidr_block="192.168.0.0/16")
        default_switch = alicloud.vpc.Switch("default",
            vswitch_name=name,
            vpc_id=default_network.id,
            cidr_block="192.168.192.0/24",
            zone_id=default.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("default",
            name=name,
            vpc_id=default_network.id)
        default_instance = alicloud.ecs.Instance("default",
            image_id=default_get_images.images[0].id,
            instance_type=default_get_instance_types.instance_types[0].id,
            security_groups=[__item.id for __item in [default_security_group]],
            internet_charge_type="PayByTraffic",
            internet_max_bandwidth_out=10,
            availability_zone=default_get_instance_types.instance_types[0].availability_zones[0],
            instance_charge_type="PostPaid",
            system_disk_category="cloud_efficiency",
            vswitch_id=default_switch.id,
            instance_name=name)
        foo = alicloud.vpc.RouteEntry("foo",
            route_table_id=default_network.route_table_id,
            destination_cidrblock="172.11.1.1/32",
            nexthop_type="Instance",
            nexthop_id=default_instance.id)
        ```

        ## Import

        VPC Route Entry can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:vpc/vPCRouteEntry:VPCRouteEntry example <route_table_id>:<destination_cidr_block>
        ```

        :param str resource_name: The name of the resource.
        :param VPCRouteEntryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VPCRouteEntryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_cidr_block: Optional[pulumi.Input[_builtins.str]] = None,
                 next_hops: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryNextHopArgs', 'VPCRouteEntryNextHopArgsDict']]]]] = None,
                 nexthop_id: Optional[pulumi.Input[_builtins.str]] = None,
                 nexthop_type: Optional[pulumi.Input[_builtins.str]] = None,
                 route_entry_name: Optional[pulumi.Input[_builtins.str]] = None,
                 route_publish_targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryRoutePublishTargetArgs', 'VPCRouteEntryRoutePublishTargetArgsDict']]]]] = None,
                 route_table_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VPCRouteEntryArgs.__new__(VPCRouteEntryArgs)

            __props__.__dict__["description"] = description
            if destination_cidr_block is None and not opts.urn:
                raise TypeError("Missing required property 'destination_cidr_block'")
            __props__.__dict__["destination_cidr_block"] = destination_cidr_block
            __props__.__dict__["next_hops"] = next_hops
            __props__.__dict__["nexthop_id"] = nexthop_id
            __props__.__dict__["nexthop_type"] = nexthop_type
            __props__.__dict__["route_entry_name"] = route_entry_name
            __props__.__dict__["route_publish_targets"] = route_publish_targets
            if route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'route_table_id'")
            __props__.__dict__["route_table_id"] = route_table_id
            __props__.__dict__["status"] = None
        super(VPCRouteEntry, __self__).__init__(
            'alicloud:vpc/vPCRouteEntry:VPCRouteEntry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            destination_cidr_block: Optional[pulumi.Input[_builtins.str]] = None,
            next_hops: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryNextHopArgs', 'VPCRouteEntryNextHopArgsDict']]]]] = None,
            nexthop_id: Optional[pulumi.Input[_builtins.str]] = None,
            nexthop_type: Optional[pulumi.Input[_builtins.str]] = None,
            route_entry_name: Optional[pulumi.Input[_builtins.str]] = None,
            route_publish_targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryRoutePublishTargetArgs', 'VPCRouteEntryRoutePublishTargetArgsDict']]]]] = None,
            route_table_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'VPCRouteEntry':
        """
        Get an existing VPCRouteEntry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: Description of the route entry.
        :param pulumi.Input[_builtins.str] destination_cidr_block: The destination network segment of the routing entry.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryNextHopArgs', 'VPCRouteEntryNextHopArgsDict']]]] next_hops: Next jump See `next_hops` below.
        :param pulumi.Input[_builtins.str] nexthop_id: The ID of the next hop instance of the custom route entry.
        :param pulumi.Input[_builtins.str] nexthop_type: The type of the next hop of the custom route entry. Valid values:
               - `Instance` (default): The ECS Instance.
               - `HaVip`: a highly available virtual IP address.
               - `RouterInterface`: indicates the router interface.
               - **Network interface**: ENI.
               - `VpnGateway`: the VPN gateway.
               - `IPv6Gateway`:IPv6 gateway.
               - `NatGateway`:NAT gateway.
               - `Attachment`: The forwarding router.
               - `VpcPeer`:VPC peer connection.
               - `Ipv4Gateway`:IPv4 Gateway.
               - `GatewayEndpoint`: the gateway endpoint.
               - `Ecr`: Leased line gateway.
               - `GatewayLoadBalancerEndpoint`: The Gateway-based load balancing endpoint.
        :param pulumi.Input[_builtins.str] route_entry_name: The name of the route entry.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VPCRouteEntryRoutePublishTargetArgs', 'VPCRouteEntryRoutePublishTargetArgsDict']]]] route_publish_targets: Route publish status and publish target type See `route_publish_targets` below.
        :param pulumi.Input[_builtins.str] route_table_id: Routing table ID
        :param pulumi.Input[_builtins.str] status: The status of the route entry.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VPCRouteEntryState.__new__(_VPCRouteEntryState)

        __props__.__dict__["description"] = description
        __props__.__dict__["destination_cidr_block"] = destination_cidr_block
        __props__.__dict__["next_hops"] = next_hops
        __props__.__dict__["nexthop_id"] = nexthop_id
        __props__.__dict__["nexthop_type"] = nexthop_type
        __props__.__dict__["route_entry_name"] = route_entry_name
        __props__.__dict__["route_publish_targets"] = route_publish_targets
        __props__.__dict__["route_table_id"] = route_table_id
        __props__.__dict__["status"] = status
        return VPCRouteEntry(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description of the route entry.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> pulumi.Output[_builtins.str]:
        """
        The destination network segment of the routing entry.
        """
        return pulumi.get(self, "destination_cidr_block")

    @_builtins.property
    @pulumi.getter(name="nextHops")
    def next_hops(self) -> pulumi.Output[Sequence['outputs.VPCRouteEntryNextHop']]:
        """
        Next jump See `next_hops` below.
        """
        return pulumi.get(self, "next_hops")

    @_builtins.property
    @pulumi.getter(name="nexthopId")
    def nexthop_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the next hop instance of the custom route entry.
        """
        return pulumi.get(self, "nexthop_id")

    @_builtins.property
    @pulumi.getter(name="nexthopType")
    def nexthop_type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of the next hop of the custom route entry. Valid values:
        - `Instance` (default): The ECS Instance.
        - `HaVip`: a highly available virtual IP address.
        - `RouterInterface`: indicates the router interface.
        - **Network interface**: ENI.
        - `VpnGateway`: the VPN gateway.
        - `IPv6Gateway`:IPv6 gateway.
        - `NatGateway`:NAT gateway.
        - `Attachment`: The forwarding router.
        - `VpcPeer`:VPC peer connection.
        - `Ipv4Gateway`:IPv4 Gateway.
        - `GatewayEndpoint`: the gateway endpoint.
        - `Ecr`: Leased line gateway.
        - `GatewayLoadBalancerEndpoint`: The Gateway-based load balancing endpoint.
        """
        return pulumi.get(self, "nexthop_type")

    @_builtins.property
    @pulumi.getter(name="routeEntryName")
    def route_entry_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the route entry.
        """
        return pulumi.get(self, "route_entry_name")

    @_builtins.property
    @pulumi.getter(name="routePublishTargets")
    def route_publish_targets(self) -> pulumi.Output[Optional[Sequence['outputs.VPCRouteEntryRoutePublishTarget']]]:
        """
        Route publish status and publish target type See `route_publish_targets` below.
        """
        return pulumi.get(self, "route_publish_targets")

    @_builtins.property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Output[_builtins.str]:
        """
        Routing table ID
        """
        return pulumi.get(self, "route_table_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the route entry.
        """
        return pulumi.get(self, "status")

