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
    'GetDedicatedHostsResult',
    'AwaitableGetDedicatedHostsResult',
    'get_dedicated_hosts',
    'get_dedicated_hosts_output',
]

@pulumi.output_type
class GetDedicatedHostsResult:
    """
    A collection of values returned by getDedicatedHosts.
    """
    def __init__(__self__, allocation_status=None, dedicated_host_group_id=None, enable_details=None, host_type=None, hosts=None, id=None, ids=None, order_id=None, output_file=None, status=None, tags=None, zone_id=None):
        if allocation_status and not isinstance(allocation_status, str):
            raise TypeError("Expected argument 'allocation_status' to be a str")
        pulumi.set(__self__, "allocation_status", allocation_status)
        if dedicated_host_group_id and not isinstance(dedicated_host_group_id, str):
            raise TypeError("Expected argument 'dedicated_host_group_id' to be a str")
        pulumi.set(__self__, "dedicated_host_group_id", dedicated_host_group_id)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if host_type and not isinstance(host_type, str):
            raise TypeError("Expected argument 'host_type' to be a str")
        pulumi.set(__self__, "host_type", host_type)
        if hosts and not isinstance(hosts, list):
            raise TypeError("Expected argument 'hosts' to be a list")
        pulumi.set(__self__, "hosts", hosts)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if order_id and not isinstance(order_id, str):
            raise TypeError("Expected argument 'order_id' to be a str")
        pulumi.set(__self__, "order_id", order_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="allocationStatus")
    def allocation_status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "allocation_status")

    @_builtins.property
    @pulumi.getter(name="dedicatedHostGroupId")
    def dedicated_host_group_id(self) -> _builtins.str:
        return pulumi.get(self, "dedicated_host_group_id")

    @_builtins.property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_details")

    @_builtins.property
    @pulumi.getter(name="hostType")
    def host_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "host_type")

    @_builtins.property
    @pulumi.getter
    def hosts(self) -> Sequence['outputs.GetDedicatedHostsHostResult']:
        return pulumi.get(self, "hosts")

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
    @pulumi.getter(name="orderId")
    def order_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "order_id")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "zone_id")


class AwaitableGetDedicatedHostsResult(GetDedicatedHostsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDedicatedHostsResult(
            allocation_status=self.allocation_status,
            dedicated_host_group_id=self.dedicated_host_group_id,
            enable_details=self.enable_details,
            host_type=self.host_type,
            hosts=self.hosts,
            id=self.id,
            ids=self.ids,
            order_id=self.order_id,
            output_file=self.output_file,
            status=self.status,
            tags=self.tags,
            zone_id=self.zone_id)


def get_dedicated_hosts(allocation_status: Optional[_builtins.str] = None,
                        dedicated_host_group_id: Optional[_builtins.str] = None,
                        enable_details: Optional[_builtins.bool] = None,
                        host_type: Optional[_builtins.str] = None,
                        ids: Optional[Sequence[_builtins.str]] = None,
                        order_id: Optional[_builtins.str] = None,
                        output_file: Optional[_builtins.str] = None,
                        status: Optional[_builtins.str] = None,
                        tags: Optional[Mapping[str, _builtins.str]] = None,
                        zone_id: Optional[_builtins.str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDedicatedHostsResult:
    """
    This data source provides the Cddc Dedicated Hosts of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("cddcDedicatedHostId1", ids.hosts[0].id)
    status = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        status="1")
    pulumi.export("cddcDedicatedHostId2", status.hosts[0].id)
    zone_id = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        zone_id="example_value")
    pulumi.export("cddcDedicatedHostId3", zone_id.hosts[0].id)
    allocation_status = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        allocation_status="Allocatable")
    pulumi.export("cddcDedicatedHostId4", allocation_status.hosts[0].id)
    host_type = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        host_type="dhg_cloud_ssd")
    pulumi.export("cddcDedicatedHostId5", host_type.hosts[0].id)
    ```


    :param _builtins.str allocation_status: Specifies whether instances can be created on the host. Valid values: `Allocatable` or `Suspended`. `Allocatable`: Instances can be created on the host. `Suspended`: Instances cannot be created on the host.
    :param _builtins.str dedicated_host_group_id: The ID of the dedicated cluster.
    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param _builtins.str host_type: The storage type of the host. Valid values: `dhg_local_ssd` or `dhg_cloud_ssd`. `dhg_local_ssd`: specifies that the host uses local SSDs. `dhg_cloud_ssd`: specifies that the host uses enhanced SSDs (ESSDs).
    :param Sequence[_builtins.str] ids: A list of Dedicated Host IDs.
    :param _builtins.str order_id: The ID of the order.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The state of the host. Valid values: 
           * `0:` The host is being created.
    :param Mapping[str, _builtins.str] tags: A mapping of tags to assign to the resource.
    :param _builtins.str zone_id: The ID of the zone.
    """
    __args__ = dict()
    __args__['allocationStatus'] = allocation_status
    __args__['dedicatedHostGroupId'] = dedicated_host_group_id
    __args__['enableDetails'] = enable_details
    __args__['hostType'] = host_type
    __args__['ids'] = ids
    __args__['orderId'] = order_id
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['tags'] = tags
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cddc/getDedicatedHosts:getDedicatedHosts', __args__, opts=opts, typ=GetDedicatedHostsResult).value

    return AwaitableGetDedicatedHostsResult(
        allocation_status=pulumi.get(__ret__, 'allocation_status'),
        dedicated_host_group_id=pulumi.get(__ret__, 'dedicated_host_group_id'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        host_type=pulumi.get(__ret__, 'host_type'),
        hosts=pulumi.get(__ret__, 'hosts'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        order_id=pulumi.get(__ret__, 'order_id'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_dedicated_hosts_output(allocation_status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               dedicated_host_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                               enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                               host_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                               order_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               tags: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                               zone_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDedicatedHostsResult]:
    """
    This data source provides the Cddc Dedicated Hosts of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("cddcDedicatedHostId1", ids.hosts[0].id)
    status = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        status="1")
    pulumi.export("cddcDedicatedHostId2", status.hosts[0].id)
    zone_id = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        zone_id="example_value")
    pulumi.export("cddcDedicatedHostId3", zone_id.hosts[0].id)
    allocation_status = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        allocation_status="Allocatable")
    pulumi.export("cddcDedicatedHostId4", allocation_status.hosts[0].id)
    host_type = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        host_type="dhg_cloud_ssd")
    pulumi.export("cddcDedicatedHostId5", host_type.hosts[0].id)
    ```


    :param _builtins.str allocation_status: Specifies whether instances can be created on the host. Valid values: `Allocatable` or `Suspended`. `Allocatable`: Instances can be created on the host. `Suspended`: Instances cannot be created on the host.
    :param _builtins.str dedicated_host_group_id: The ID of the dedicated cluster.
    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param _builtins.str host_type: The storage type of the host. Valid values: `dhg_local_ssd` or `dhg_cloud_ssd`. `dhg_local_ssd`: specifies that the host uses local SSDs. `dhg_cloud_ssd`: specifies that the host uses enhanced SSDs (ESSDs).
    :param Sequence[_builtins.str] ids: A list of Dedicated Host IDs.
    :param _builtins.str order_id: The ID of the order.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The state of the host. Valid values: 
           * `0:` The host is being created.
    :param Mapping[str, _builtins.str] tags: A mapping of tags to assign to the resource.
    :param _builtins.str zone_id: The ID of the zone.
    """
    __args__ = dict()
    __args__['allocationStatus'] = allocation_status
    __args__['dedicatedHostGroupId'] = dedicated_host_group_id
    __args__['enableDetails'] = enable_details
    __args__['hostType'] = host_type
    __args__['ids'] = ids
    __args__['orderId'] = order_id
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['tags'] = tags
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cddc/getDedicatedHosts:getDedicatedHosts', __args__, opts=opts, typ=GetDedicatedHostsResult)
    return __ret__.apply(lambda __response__: GetDedicatedHostsResult(
        allocation_status=pulumi.get(__response__, 'allocation_status'),
        dedicated_host_group_id=pulumi.get(__response__, 'dedicated_host_group_id'),
        enable_details=pulumi.get(__response__, 'enable_details'),
        host_type=pulumi.get(__response__, 'host_type'),
        hosts=pulumi.get(__response__, 'hosts'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        order_id=pulumi.get(__response__, 'order_id'),
        output_file=pulumi.get(__response__, 'output_file'),
        status=pulumi.get(__response__, 'status'),
        tags=pulumi.get(__response__, 'tags'),
        zone_id=pulumi.get(__response__, 'zone_id')))
