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
    'GetIpamIpamPoolAllocationsResult',
    'AwaitableGetIpamIpamPoolAllocationsResult',
    'get_ipam_ipam_pool_allocations',
    'get_ipam_ipam_pool_allocations_output',
]

@pulumi.output_type
class GetIpamIpamPoolAllocationsResult:
    """
    A collection of values returned by getIpamIpamPoolAllocations.
    """
    def __init__(__self__, allocations=None, cidr=None, id=None, ids=None, ipam_pool_allocation_id=None, ipam_pool_allocation_name=None, ipam_pool_id=None, name_regex=None, names=None, output_file=None):
        if allocations and not isinstance(allocations, list):
            raise TypeError("Expected argument 'allocations' to be a list")
        pulumi.set(__self__, "allocations", allocations)
        if cidr and not isinstance(cidr, str):
            raise TypeError("Expected argument 'cidr' to be a str")
        pulumi.set(__self__, "cidr", cidr)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if ipam_pool_allocation_id and not isinstance(ipam_pool_allocation_id, str):
            raise TypeError("Expected argument 'ipam_pool_allocation_id' to be a str")
        pulumi.set(__self__, "ipam_pool_allocation_id", ipam_pool_allocation_id)
        if ipam_pool_allocation_name and not isinstance(ipam_pool_allocation_name, str):
            raise TypeError("Expected argument 'ipam_pool_allocation_name' to be a str")
        pulumi.set(__self__, "ipam_pool_allocation_name", ipam_pool_allocation_name)
        if ipam_pool_id and not isinstance(ipam_pool_id, str):
            raise TypeError("Expected argument 'ipam_pool_id' to be a str")
        pulumi.set(__self__, "ipam_pool_id", ipam_pool_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @_builtins.property
    @pulumi.getter
    def allocations(self) -> Sequence['outputs.GetIpamIpamPoolAllocationsAllocationResult']:
        """
        A list of Ipam Pool Allocation Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "allocations")

    @_builtins.property
    @pulumi.getter
    def cidr(self) -> Optional[_builtins.str]:
        """
        The allocated address segment.
        """
        return pulumi.get(self, "cidr")

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
        """
        A list of Ipam Pool Allocation IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="ipamPoolAllocationId")
    def ipam_pool_allocation_id(self) -> Optional[_builtins.str]:
        """
        The instance ID of the ipam pool allocation.
        """
        return pulumi.get(self, "ipam_pool_allocation_id")

    @_builtins.property
    @pulumi.getter(name="ipamPoolAllocationName")
    def ipam_pool_allocation_name(self) -> Optional[_builtins.str]:
        """
        The name of the ipam pool allocation.It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "ipam_pool_allocation_name")

    @_builtins.property
    @pulumi.getter(name="ipamPoolId")
    def ipam_pool_id(self) -> _builtins.str:
        """
        The ID of the IPAM Pool.
        """
        return pulumi.get(self, "ipam_pool_id")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of name of Ipam Pool Allocations.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")


class AwaitableGetIpamIpamPoolAllocationsResult(GetIpamIpamPoolAllocationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpamIpamPoolAllocationsResult(
            allocations=self.allocations,
            cidr=self.cidr,
            id=self.id,
            ids=self.ids,
            ipam_pool_allocation_id=self.ipam_pool_allocation_id,
            ipam_pool_allocation_name=self.ipam_pool_allocation_name,
            ipam_pool_id=self.ipam_pool_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_ipam_ipam_pool_allocations(cidr: Optional[_builtins.str] = None,
                                   ids: Optional[Sequence[_builtins.str]] = None,
                                   ipam_pool_allocation_id: Optional[_builtins.str] = None,
                                   ipam_pool_allocation_name: Optional[_builtins.str] = None,
                                   ipam_pool_id: Optional[_builtins.str] = None,
                                   name_regex: Optional[_builtins.str] = None,
                                   output_file: Optional[_builtins.str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpamIpamPoolAllocationsResult:
    """
    This data source provides Vpc Ipam Ipam Pool Allocation available to the user.[What is Ipam Pool Allocation](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamPoolAllocation)

    > **NOTE:** Available since v1.241.0.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "terraform-example"
    default = alicloud.resourcemanager.get_resource_groups()
    default_ipam = alicloud.vpc.IpamIpam("defaultIpam", operating_region_lists=["cn-hangzhou"])
    default_ipam_pool = alicloud.vpc.IpamIpamPool("defaultIpamPool",
        ipam_scope_id=default_ipam.private_default_scope_id,
        pool_region_id="cn-hangzhou")
    default_ipam_pool_cidr = alicloud.vpc.IpamIpamPoolCidr("defaultIpamPoolCidr",
        cidr="10.0.0.0/8",
        ipam_pool_id=default_ipam_pool.id)
    default_ipam_ipam_pool_allocation = alicloud.vpc.IpamIpamPoolAllocation("default",
        ipam_pool_allocation_description="init alloc desc",
        ipam_pool_allocation_name=name,
        cidr="10.0.0.0/20",
        ipam_pool_id=default_ipam_pool_cidr.ipam_pool_id)
    default_get_ipam_ipam_pool_allocations = alicloud.vpc.get_ipam_ipam_pool_allocations_output(ids=[default_ipam_ipam_pool_allocation.id])
    pulumi.export("alicloudVpcIpamIpamPoolAllocationExampleId", default_get_ipam_ipam_pool_allocations.allocations[0].id)
    ```


    :param _builtins.str cidr: The allocated address segment.
    :param Sequence[_builtins.str] ids: A list of Ipam Pool Allocation IDs.
    :param _builtins.str ipam_pool_allocation_id: The instance ID of the ipam pool allocation.
    :param _builtins.str ipam_pool_allocation_name: The name of the ipam pool allocation.It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
    :param _builtins.str ipam_pool_id: The ID of the IPAM Pool.
    :param _builtins.str name_regex: A regex string to filter results by Group Metric Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['cidr'] = cidr
    __args__['ids'] = ids
    __args__['ipamPoolAllocationId'] = ipam_pool_allocation_id
    __args__['ipamPoolAllocationName'] = ipam_pool_allocation_name
    __args__['ipamPoolId'] = ipam_pool_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getIpamIpamPoolAllocations:getIpamIpamPoolAllocations', __args__, opts=opts, typ=GetIpamIpamPoolAllocationsResult).value

    return AwaitableGetIpamIpamPoolAllocationsResult(
        allocations=pulumi.get(__ret__, 'allocations'),
        cidr=pulumi.get(__ret__, 'cidr'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        ipam_pool_allocation_id=pulumi.get(__ret__, 'ipam_pool_allocation_id'),
        ipam_pool_allocation_name=pulumi.get(__ret__, 'ipam_pool_allocation_name'),
        ipam_pool_id=pulumi.get(__ret__, 'ipam_pool_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'))
def get_ipam_ipam_pool_allocations_output(cidr: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                          ipam_pool_allocation_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          ipam_pool_allocation_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          ipam_pool_id: Optional[pulumi.Input[_builtins.str]] = None,
                                          name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIpamIpamPoolAllocationsResult]:
    """
    This data source provides Vpc Ipam Ipam Pool Allocation available to the user.[What is Ipam Pool Allocation](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamPoolAllocation)

    > **NOTE:** Available since v1.241.0.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "terraform-example"
    default = alicloud.resourcemanager.get_resource_groups()
    default_ipam = alicloud.vpc.IpamIpam("defaultIpam", operating_region_lists=["cn-hangzhou"])
    default_ipam_pool = alicloud.vpc.IpamIpamPool("defaultIpamPool",
        ipam_scope_id=default_ipam.private_default_scope_id,
        pool_region_id="cn-hangzhou")
    default_ipam_pool_cidr = alicloud.vpc.IpamIpamPoolCidr("defaultIpamPoolCidr",
        cidr="10.0.0.0/8",
        ipam_pool_id=default_ipam_pool.id)
    default_ipam_ipam_pool_allocation = alicloud.vpc.IpamIpamPoolAllocation("default",
        ipam_pool_allocation_description="init alloc desc",
        ipam_pool_allocation_name=name,
        cidr="10.0.0.0/20",
        ipam_pool_id=default_ipam_pool_cidr.ipam_pool_id)
    default_get_ipam_ipam_pool_allocations = alicloud.vpc.get_ipam_ipam_pool_allocations_output(ids=[default_ipam_ipam_pool_allocation.id])
    pulumi.export("alicloudVpcIpamIpamPoolAllocationExampleId", default_get_ipam_ipam_pool_allocations.allocations[0].id)
    ```


    :param _builtins.str cidr: The allocated address segment.
    :param Sequence[_builtins.str] ids: A list of Ipam Pool Allocation IDs.
    :param _builtins.str ipam_pool_allocation_id: The instance ID of the ipam pool allocation.
    :param _builtins.str ipam_pool_allocation_name: The name of the ipam pool allocation.It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
    :param _builtins.str ipam_pool_id: The ID of the IPAM Pool.
    :param _builtins.str name_regex: A regex string to filter results by Group Metric Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['cidr'] = cidr
    __args__['ids'] = ids
    __args__['ipamPoolAllocationId'] = ipam_pool_allocation_id
    __args__['ipamPoolAllocationName'] = ipam_pool_allocation_name
    __args__['ipamPoolId'] = ipam_pool_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:vpc/getIpamIpamPoolAllocations:getIpamIpamPoolAllocations', __args__, opts=opts, typ=GetIpamIpamPoolAllocationsResult)
    return __ret__.apply(lambda __response__: GetIpamIpamPoolAllocationsResult(
        allocations=pulumi.get(__response__, 'allocations'),
        cidr=pulumi.get(__response__, 'cidr'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        ipam_pool_allocation_id=pulumi.get(__response__, 'ipam_pool_allocation_id'),
        ipam_pool_allocation_name=pulumi.get(__response__, 'ipam_pool_allocation_name'),
        ipam_pool_id=pulumi.get(__response__, 'ipam_pool_id'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file')))
