# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = ['LoadBalancerArgs', 'LoadBalancer']

@pulumi.input_type
class LoadBalancerArgs:
    def __init__(__self__, *,
                 vpc_id: pulumi.Input[str],
                 zone_mappings: pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingArgs']]],
                 address_ip_version: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 load_balancer_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a LoadBalancer resource.
        :param pulumi.Input[str] vpc_id: The ID of the VPC which the Gateway Load Balancer instance belongs.
        :param pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingArgs']]] zone_mappings: The List of zones and vSwitches mapped. You must add at least one zone and a maximum of 20 zones. If the current region supports two or more zones, we recommend that you add two or more zones. See `zone_mappings` below.
        :param pulumi.Input[str] address_ip_version: The protocol version. Value:
               - Ipv4: Ipv4 type
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request.
        :param pulumi.Input[str] load_balancer_name: The name of the Gateway Load Balancer instance.
               
               It must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and can contain digits, half-width periods (.), underscores (_), and dashes (-).
        :param pulumi.Input[str] resource_group_id: The ID of the resource group
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: The list of tags.
        """
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "zone_mappings", zone_mappings)
        if address_ip_version is not None:
            pulumi.set(__self__, "address_ip_version", address_ip_version)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if load_balancer_name is not None:
            pulumi.set(__self__, "load_balancer_name", load_balancer_name)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The ID of the VPC which the Gateway Load Balancer instance belongs.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="zoneMappings")
    def zone_mappings(self) -> pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingArgs']]]:
        """
        The List of zones and vSwitches mapped. You must add at least one zone and a maximum of 20 zones. If the current region supports two or more zones, we recommend that you add two or more zones. See `zone_mappings` below.
        """
        return pulumi.get(self, "zone_mappings")

    @zone_mappings.setter
    def zone_mappings(self, value: pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingArgs']]]):
        pulumi.set(self, "zone_mappings", value)

    @property
    @pulumi.getter(name="addressIpVersion")
    def address_ip_version(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol version. Value:
        - Ipv4: Ipv4 type
        """
        return pulumi.get(self, "address_ip_version")

    @address_ip_version.setter
    def address_ip_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address_ip_version", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="loadBalancerName")
    def load_balancer_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Gateway Load Balancer instance.

        It must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and can contain digits, half-width periods (.), underscores (_), and dashes (-).
        """
        return pulumi.get(self, "load_balancer_name")

    @load_balancer_name.setter
    def load_balancer_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The list of tags.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _LoadBalancerState:
    def __init__(__self__, *,
                 address_ip_version: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 load_balancer_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingArgs']]]] = None):
        """
        Input properties used for looking up and filtering LoadBalancer resources.
        :param pulumi.Input[str] address_ip_version: The protocol version. Value:
               - Ipv4: Ipv4 type
        :param pulumi.Input[str] create_time: The resource creation time, in Greenwich Mean Time, in the format of **yyyy-MM-ddTHH:mm:ssZ**.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request.
        :param pulumi.Input[str] load_balancer_name: The name of the Gateway Load Balancer instance.
               
               It must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and can contain digits, half-width periods (.), underscores (_), and dashes (-).
        :param pulumi.Input[str] resource_group_id: The ID of the resource group
        :param pulumi.Input[str] status: The status of the Gateway load Balancer instance. Value:, indicating that the instance listener will no longer forward traffic.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: The list of tags.
        :param pulumi.Input[str] vpc_id: The ID of the VPC which the Gateway Load Balancer instance belongs.
        :param pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingArgs']]] zone_mappings: The List of zones and vSwitches mapped. You must add at least one zone and a maximum of 20 zones. If the current region supports two or more zones, we recommend that you add two or more zones. See `zone_mappings` below.
        """
        if address_ip_version is not None:
            pulumi.set(__self__, "address_ip_version", address_ip_version)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if load_balancer_name is not None:
            pulumi.set(__self__, "load_balancer_name", load_balancer_name)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if zone_mappings is not None:
            pulumi.set(__self__, "zone_mappings", zone_mappings)

    @property
    @pulumi.getter(name="addressIpVersion")
    def address_ip_version(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol version. Value:
        - Ipv4: Ipv4 type
        """
        return pulumi.get(self, "address_ip_version")

    @address_ip_version.setter
    def address_ip_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address_ip_version", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The resource creation time, in Greenwich Mean Time, in the format of **yyyy-MM-ddTHH:mm:ssZ**.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="loadBalancerName")
    def load_balancer_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Gateway Load Balancer instance.

        It must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and can contain digits, half-width periods (.), underscores (_), and dashes (-).
        """
        return pulumi.get(self, "load_balancer_name")

    @load_balancer_name.setter
    def load_balancer_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Gateway load Balancer instance. Value:, indicating that the instance listener will no longer forward traffic.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The list of tags.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC which the Gateway Load Balancer instance belongs.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="zoneMappings")
    def zone_mappings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingArgs']]]]:
        """
        The List of zones and vSwitches mapped. You must add at least one zone and a maximum of 20 zones. If the current region supports two or more zones, we recommend that you add two or more zones. See `zone_mappings` below.
        """
        return pulumi.get(self, "zone_mappings")

    @zone_mappings.setter
    def zone_mappings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingArgs']]]]):
        pulumi.set(self, "zone_mappings", value)


class LoadBalancer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address_ip_version: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 load_balancer_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LoadBalancerZoneMappingArgs', 'LoadBalancerZoneMappingArgsDict']]]]] = None,
                 __props__=None):
        """
        Provides a GWLB Load Balancer resource.

        For information about GWLB Load Balancer and how to use it, see [What is Load Balancer](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.234.0.

        ## Import

        GWLB Load Balancer can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:gwlb/loadBalancer:LoadBalancer example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address_ip_version: The protocol version. Value:
               - Ipv4: Ipv4 type
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request.
        :param pulumi.Input[str] load_balancer_name: The name of the Gateway Load Balancer instance.
               
               It must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and can contain digits, half-width periods (.), underscores (_), and dashes (-).
        :param pulumi.Input[str] resource_group_id: The ID of the resource group
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: The list of tags.
        :param pulumi.Input[str] vpc_id: The ID of the VPC which the Gateway Load Balancer instance belongs.
        :param pulumi.Input[Sequence[pulumi.Input[Union['LoadBalancerZoneMappingArgs', 'LoadBalancerZoneMappingArgsDict']]]] zone_mappings: The List of zones and vSwitches mapped. You must add at least one zone and a maximum of 20 zones. If the current region supports two or more zones, we recommend that you add two or more zones. See `zone_mappings` below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadBalancerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a GWLB Load Balancer resource.

        For information about GWLB Load Balancer and how to use it, see [What is Load Balancer](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.234.0.

        ## Import

        GWLB Load Balancer can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:gwlb/loadBalancer:LoadBalancer example <id>
        ```

        :param str resource_name: The name of the resource.
        :param LoadBalancerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadBalancerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address_ip_version: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 load_balancer_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LoadBalancerZoneMappingArgs', 'LoadBalancerZoneMappingArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadBalancerArgs.__new__(LoadBalancerArgs)

            __props__.__dict__["address_ip_version"] = address_ip_version
            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["load_balancer_name"] = load_balancer_name
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["tags"] = tags
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            if zone_mappings is None and not opts.urn:
                raise TypeError("Missing required property 'zone_mappings'")
            __props__.__dict__["zone_mappings"] = zone_mappings
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(LoadBalancer, __self__).__init__(
            'alicloud:gwlb/loadBalancer:LoadBalancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address_ip_version: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            load_balancer_name: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LoadBalancerZoneMappingArgs', 'LoadBalancerZoneMappingArgsDict']]]]] = None) -> 'LoadBalancer':
        """
        Get an existing LoadBalancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address_ip_version: The protocol version. Value:
               - Ipv4: Ipv4 type
        :param pulumi.Input[str] create_time: The resource creation time, in Greenwich Mean Time, in the format of **yyyy-MM-ddTHH:mm:ssZ**.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request.
        :param pulumi.Input[str] load_balancer_name: The name of the Gateway Load Balancer instance.
               
               It must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and can contain digits, half-width periods (.), underscores (_), and dashes (-).
        :param pulumi.Input[str] resource_group_id: The ID of the resource group
        :param pulumi.Input[str] status: The status of the Gateway load Balancer instance. Value:, indicating that the instance listener will no longer forward traffic.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: The list of tags.
        :param pulumi.Input[str] vpc_id: The ID of the VPC which the Gateway Load Balancer instance belongs.
        :param pulumi.Input[Sequence[pulumi.Input[Union['LoadBalancerZoneMappingArgs', 'LoadBalancerZoneMappingArgsDict']]]] zone_mappings: The List of zones and vSwitches mapped. You must add at least one zone and a maximum of 20 zones. If the current region supports two or more zones, we recommend that you add two or more zones. See `zone_mappings` below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadBalancerState.__new__(_LoadBalancerState)

        __props__.__dict__["address_ip_version"] = address_ip_version
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["load_balancer_name"] = load_balancer_name
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["zone_mappings"] = zone_mappings
        return LoadBalancer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="addressIpVersion")
    def address_ip_version(self) -> pulumi.Output[str]:
        """
        The protocol version. Value:
        - Ipv4: Ipv4 type
        """
        return pulumi.get(self, "address_ip_version")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The resource creation time, in Greenwich Mean Time, in the format of **yyyy-MM-ddTHH:mm:ssZ**.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="loadBalancerName")
    def load_balancer_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Gateway Load Balancer instance.

        It must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and can contain digits, half-width periods (.), underscores (_), and dashes (-).
        """
        return pulumi.get(self, "load_balancer_name")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Gateway load Balancer instance. Value:, indicating that the instance listener will no longer forward traffic.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        The list of tags.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPC which the Gateway Load Balancer instance belongs.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="zoneMappings")
    def zone_mappings(self) -> pulumi.Output[Sequence['outputs.LoadBalancerZoneMapping']]:
        """
        The List of zones and vSwitches mapped. You must add at least one zone and a maximum of 20 zones. If the current region supports two or more zones, we recommend that you add two or more zones. See `zone_mappings` below.
        """
        return pulumi.get(self, "zone_mappings")
