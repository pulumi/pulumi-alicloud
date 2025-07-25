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
    'GetTransitRouterAvailableResourcesResult',
    'AwaitableGetTransitRouterAvailableResourcesResult',
    'get_transit_router_available_resources',
    'get_transit_router_available_resources_output',
]

@pulumi.output_type
class GetTransitRouterAvailableResourcesResult:
    """
    A collection of values returned by getTransitRouterAvailableResources.
    """
    def __init__(__self__, id=None, output_file=None, resources=None, support_multicast=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resources and not isinstance(resources, list):
            raise TypeError("Expected argument 'resources' to be a list")
        pulumi.set(__self__, "resources", resources)
        if support_multicast and not isinstance(support_multicast, bool):
            raise TypeError("Expected argument 'support_multicast' to be a bool")
        pulumi.set(__self__, "support_multicast", support_multicast)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def resources(self) -> Sequence['outputs.GetTransitRouterAvailableResourcesResourceResult']:
        """
        A list of Cen Transit Router Available Resources. Each element contains the following attributes:
        """
        return pulumi.get(self, "resources")

    @_builtins.property
    @pulumi.getter(name="supportMulticast")
    def support_multicast(self) -> Optional[_builtins.bool]:
        """
        (Available since v1.225.0) Indicates whether the zone supports the multicast feature.
        """
        return pulumi.get(self, "support_multicast")


class AwaitableGetTransitRouterAvailableResourcesResult(GetTransitRouterAvailableResourcesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitRouterAvailableResourcesResult(
            id=self.id,
            output_file=self.output_file,
            resources=self.resources,
            support_multicast=self.support_multicast)


def get_transit_router_available_resources(output_file: Optional[_builtins.str] = None,
                                           support_multicast: Optional[_builtins.bool] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitRouterAvailableResourcesResult:
    """
    This data source provides the CEN Transit Router Available Resources of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.163.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cen.get_transit_router_available_resources()
    pulumi.export("masterId", ids.resources[0].master_zones[0])
    pulumi.export("slaveId", ids.resources[0].slave_zones[0])
    ```


    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.bool support_multicast: Specifies whether to query only the zones in which the multicast feature is supported.
    """
    __args__ = dict()
    __args__['outputFile'] = output_file
    __args__['supportMulticast'] = support_multicast
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getTransitRouterAvailableResources:getTransitRouterAvailableResources', __args__, opts=opts, typ=GetTransitRouterAvailableResourcesResult).value

    return AwaitableGetTransitRouterAvailableResourcesResult(
        id=pulumi.get(__ret__, 'id'),
        output_file=pulumi.get(__ret__, 'output_file'),
        resources=pulumi.get(__ret__, 'resources'),
        support_multicast=pulumi.get(__ret__, 'support_multicast'))
def get_transit_router_available_resources_output(output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                  support_multicast: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTransitRouterAvailableResourcesResult]:
    """
    This data source provides the CEN Transit Router Available Resources of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.163.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cen.get_transit_router_available_resources()
    pulumi.export("masterId", ids.resources[0].master_zones[0])
    pulumi.export("slaveId", ids.resources[0].slave_zones[0])
    ```


    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.bool support_multicast: Specifies whether to query only the zones in which the multicast feature is supported.
    """
    __args__ = dict()
    __args__['outputFile'] = output_file
    __args__['supportMulticast'] = support_multicast
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cen/getTransitRouterAvailableResources:getTransitRouterAvailableResources', __args__, opts=opts, typ=GetTransitRouterAvailableResourcesResult)
    return __ret__.apply(lambda __response__: GetTransitRouterAvailableResourcesResult(
        id=pulumi.get(__response__, 'id'),
        output_file=pulumi.get(__response__, 'output_file'),
        resources=pulumi.get(__response__, 'resources'),
        support_multicast=pulumi.get(__response__, 'support_multicast')))
