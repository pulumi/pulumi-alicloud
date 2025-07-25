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

__all__ = [
    'GetLoadBalancersResult',
    'AwaitableGetLoadBalancersResult',
    'get_load_balancers',
    'get_load_balancers_output',
]

@pulumi.output_type
class GetLoadBalancersResult:
    """
    A collection of values returned by getLoadBalancers.
    """
    def __init__(__self__, address_ip_version=None, address_type=None, balancers=None, dns_name=None, id=None, ids=None, ipv6_address_type=None, load_balancer_business_status=None, load_balancer_names=None, name_regex=None, names=None, output_file=None, resource_group_id=None, status=None, tags=None, vpc_ids=None, zone_id=None):
        if address_ip_version and not isinstance(address_ip_version, str):
            raise TypeError("Expected argument 'address_ip_version' to be a str")
        pulumi.set(__self__, "address_ip_version", address_ip_version)
        if address_type and not isinstance(address_type, str):
            raise TypeError("Expected argument 'address_type' to be a str")
        pulumi.set(__self__, "address_type", address_type)
        if balancers and not isinstance(balancers, list):
            raise TypeError("Expected argument 'balancers' to be a list")
        pulumi.set(__self__, "balancers", balancers)
        if dns_name and not isinstance(dns_name, str):
            raise TypeError("Expected argument 'dns_name' to be a str")
        pulumi.set(__self__, "dns_name", dns_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if ipv6_address_type and not isinstance(ipv6_address_type, str):
            raise TypeError("Expected argument 'ipv6_address_type' to be a str")
        pulumi.set(__self__, "ipv6_address_type", ipv6_address_type)
        if load_balancer_business_status and not isinstance(load_balancer_business_status, str):
            raise TypeError("Expected argument 'load_balancer_business_status' to be a str")
        pulumi.set(__self__, "load_balancer_business_status", load_balancer_business_status)
        if load_balancer_names and not isinstance(load_balancer_names, list):
            raise TypeError("Expected argument 'load_balancer_names' to be a list")
        pulumi.set(__self__, "load_balancer_names", load_balancer_names)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if vpc_ids and not isinstance(vpc_ids, list):
            raise TypeError("Expected argument 'vpc_ids' to be a list")
        pulumi.set(__self__, "vpc_ids", vpc_ids)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="addressIpVersion")
    def address_ip_version(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "address_ip_version")

    @_builtins.property
    @pulumi.getter(name="addressType")
    def address_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "address_type")

    @_builtins.property
    @pulumi.getter
    def balancers(self) -> Sequence['outputs.GetLoadBalancersBalancerResult']:
        return pulumi.get(self, "balancers")

    @_builtins.property
    @pulumi.getter(name="dnsName")
    def dns_name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "dns_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ids(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="ipv6AddressType")
    def ipv6_address_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "ipv6_address_type")

    @_builtins.property
    @pulumi.getter(name="loadBalancerBusinessStatus")
    def load_balancer_business_status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "load_balancer_business_status")

    @_builtins.property
    @pulumi.getter(name="loadBalancerNames")
    def load_balancer_names(self) -> Optional[Sequence[_builtins.str]]:
        return pulumi.get(self, "load_balancer_names")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "resource_group_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="vpcIds")
    def vpc_ids(self) -> Optional[Sequence[_builtins.str]]:
        return pulumi.get(self, "vpc_ids")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "zone_id")


class AwaitableGetLoadBalancersResult(GetLoadBalancersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLoadBalancersResult(
            address_ip_version=self.address_ip_version,
            address_type=self.address_type,
            balancers=self.balancers,
            dns_name=self.dns_name,
            id=self.id,
            ids=self.ids,
            ipv6_address_type=self.ipv6_address_type,
            load_balancer_business_status=self.load_balancer_business_status,
            load_balancer_names=self.load_balancer_names,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            resource_group_id=self.resource_group_id,
            status=self.status,
            tags=self.tags,
            vpc_ids=self.vpc_ids,
            zone_id=self.zone_id)


def get_load_balancers(address_ip_version: Optional[_builtins.str] = None,
                       address_type: Optional[_builtins.str] = None,
                       dns_name: Optional[_builtins.str] = None,
                       ids: Optional[Sequence[_builtins.str]] = None,
                       ipv6_address_type: Optional[_builtins.str] = None,
                       load_balancer_business_status: Optional[_builtins.str] = None,
                       load_balancer_names: Optional[Sequence[_builtins.str]] = None,
                       name_regex: Optional[_builtins.str] = None,
                       output_file: Optional[_builtins.str] = None,
                       resource_group_id: Optional[_builtins.str] = None,
                       status: Optional[_builtins.str] = None,
                       tags: Optional[Mapping[str, _builtins.str]] = None,
                       vpc_ids: Optional[Sequence[_builtins.str]] = None,
                       zone_id: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLoadBalancersResult:
    """
    This data source provides the Nlb Load Balancers of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.191.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.nlb.get_load_balancers(ids=["example_id"])
    pulumi.export("nlbLoadBalancerId1", ids.balancers[0].id)
    name_regex = alicloud.nlb.get_load_balancers(name_regex="^my-LoadBalancer")
    pulumi.export("nlbLoadBalancerId2", name_regex.balancers[0].id)
    ```


    :param _builtins.str address_ip_version: The IP version. Valid values: `ipv4`, `DualStack`.
    :param _builtins.str address_type: The type of IPv4 address used by the NLB instance. Valid values: `Internet`, `Intranet`.
    :param _builtins.str dns_name: The domain name of the NLB instance.
    :param Sequence[_builtins.str] ids: A list of Load Balancer IDs.
    :param _builtins.str ipv6_address_type: The type of IPv6 address used by the NLB instance. Valid values: `Internet`, `Intranet`.
    :param _builtins.str load_balancer_business_status: The business status of the NLB instance. Valid values: `Abnormal`, `Normal`.
    :param Sequence[_builtins.str] load_balancer_names: The name of the NLB instance. You can specify at most 10 names.
    :param _builtins.str name_regex: A regex string to filter results by Load Balancer name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str resource_group_id: The ID of the resource group.
    :param _builtins.str status: The status of the NLB instance. Valid values: `Inactive`, `Active`, `Provisioning`, `Configuring`, `Deleting`, `Deleted`.
    :param Sequence[_builtins.str] vpc_ids: The ID of the virtual private cloud (VPC) where the NLB instance is deployed. You can specify at most 10 IDs.
    :param _builtins.str zone_id: The name of the zone.
    """
    __args__ = dict()
    __args__['addressIpVersion'] = address_ip_version
    __args__['addressType'] = address_type
    __args__['dnsName'] = dns_name
    __args__['ids'] = ids
    __args__['ipv6AddressType'] = ipv6_address_type
    __args__['loadBalancerBusinessStatus'] = load_balancer_business_status
    __args__['loadBalancerNames'] = load_balancer_names
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    __args__['tags'] = tags
    __args__['vpcIds'] = vpc_ids
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:nlb/getLoadBalancers:getLoadBalancers', __args__, opts=opts, typ=GetLoadBalancersResult).value

    return AwaitableGetLoadBalancersResult(
        address_ip_version=pulumi.get(__ret__, 'address_ip_version'),
        address_type=pulumi.get(__ret__, 'address_type'),
        balancers=pulumi.get(__ret__, 'balancers'),
        dns_name=pulumi.get(__ret__, 'dns_name'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        ipv6_address_type=pulumi.get(__ret__, 'ipv6_address_type'),
        load_balancer_business_status=pulumi.get(__ret__, 'load_balancer_business_status'),
        load_balancer_names=pulumi.get(__ret__, 'load_balancer_names'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        vpc_ids=pulumi.get(__ret__, 'vpc_ids'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_load_balancers_output(address_ip_version: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              address_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              dns_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                              ipv6_address_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              load_balancer_business_status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              load_balancer_names: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                              name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              resource_group_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              tags: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                              vpc_ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                              zone_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLoadBalancersResult]:
    """
    This data source provides the Nlb Load Balancers of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.191.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.nlb.get_load_balancers(ids=["example_id"])
    pulumi.export("nlbLoadBalancerId1", ids.balancers[0].id)
    name_regex = alicloud.nlb.get_load_balancers(name_regex="^my-LoadBalancer")
    pulumi.export("nlbLoadBalancerId2", name_regex.balancers[0].id)
    ```


    :param _builtins.str address_ip_version: The IP version. Valid values: `ipv4`, `DualStack`.
    :param _builtins.str address_type: The type of IPv4 address used by the NLB instance. Valid values: `Internet`, `Intranet`.
    :param _builtins.str dns_name: The domain name of the NLB instance.
    :param Sequence[_builtins.str] ids: A list of Load Balancer IDs.
    :param _builtins.str ipv6_address_type: The type of IPv6 address used by the NLB instance. Valid values: `Internet`, `Intranet`.
    :param _builtins.str load_balancer_business_status: The business status of the NLB instance. Valid values: `Abnormal`, `Normal`.
    :param Sequence[_builtins.str] load_balancer_names: The name of the NLB instance. You can specify at most 10 names.
    :param _builtins.str name_regex: A regex string to filter results by Load Balancer name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str resource_group_id: The ID of the resource group.
    :param _builtins.str status: The status of the NLB instance. Valid values: `Inactive`, `Active`, `Provisioning`, `Configuring`, `Deleting`, `Deleted`.
    :param Sequence[_builtins.str] vpc_ids: The ID of the virtual private cloud (VPC) where the NLB instance is deployed. You can specify at most 10 IDs.
    :param _builtins.str zone_id: The name of the zone.
    """
    __args__ = dict()
    __args__['addressIpVersion'] = address_ip_version
    __args__['addressType'] = address_type
    __args__['dnsName'] = dns_name
    __args__['ids'] = ids
    __args__['ipv6AddressType'] = ipv6_address_type
    __args__['loadBalancerBusinessStatus'] = load_balancer_business_status
    __args__['loadBalancerNames'] = load_balancer_names
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    __args__['tags'] = tags
    __args__['vpcIds'] = vpc_ids
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:nlb/getLoadBalancers:getLoadBalancers', __args__, opts=opts, typ=GetLoadBalancersResult)
    return __ret__.apply(lambda __response__: GetLoadBalancersResult(
        address_ip_version=pulumi.get(__response__, 'address_ip_version'),
        address_type=pulumi.get(__response__, 'address_type'),
        balancers=pulumi.get(__response__, 'balancers'),
        dns_name=pulumi.get(__response__, 'dns_name'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        ipv6_address_type=pulumi.get(__response__, 'ipv6_address_type'),
        load_balancer_business_status=pulumi.get(__response__, 'load_balancer_business_status'),
        load_balancer_names=pulumi.get(__response__, 'load_balancer_names'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        resource_group_id=pulumi.get(__response__, 'resource_group_id'),
        status=pulumi.get(__response__, 'status'),
        tags=pulumi.get(__response__, 'tags'),
        vpc_ids=pulumi.get(__response__, 'vpc_ids'),
        zone_id=pulumi.get(__response__, 'zone_id')))
