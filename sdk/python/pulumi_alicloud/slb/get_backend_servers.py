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
    'GetBackendServersResult',
    'AwaitableGetBackendServersResult',
    'get_backend_servers',
    'get_backend_servers_output',
]

@pulumi.output_type
class GetBackendServersResult:
    """
    A collection of values returned by getBackendServers.
    """
    def __init__(__self__, backend_servers=None, id=None, ids=None, load_balancer_id=None, output_file=None):
        if backend_servers and not isinstance(backend_servers, list):
            raise TypeError("Expected argument 'backend_servers' to be a list")
        pulumi.set(__self__, "backend_servers", backend_servers)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if load_balancer_id and not isinstance(load_balancer_id, str):
            raise TypeError("Expected argument 'load_balancer_id' to be a str")
        pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @_builtins.property
    @pulumi.getter(name="backendServers")
    def backend_servers(self) -> Sequence['outputs.GetBackendServersBackendServerResult']:
        return pulumi.get(self, "backend_servers")

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
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> _builtins.str:
        return pulumi.get(self, "load_balancer_id")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")


class AwaitableGetBackendServersResult(GetBackendServersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBackendServersResult(
            backend_servers=self.backend_servers,
            id=self.id,
            ids=self.ids,
            load_balancer_id=self.load_balancer_id,
            output_file=self.output_file)


def get_backend_servers(ids: Optional[Sequence[_builtins.str]] = None,
                        load_balancer_id: Optional[_builtins.str] = None,
                        output_file: Optional[_builtins.str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBackendServersResult:
    """
    This data source provides the server load balancer backend servers related to a server load balancer..

    > **NOTE:** Available in 1.53.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    sample_ds = alicloud.slb.get_backend_servers(load_balancer_id=sample_slb["id"])
    pulumi.export("firstSlbBackendServerId", sample_ds.backend_servers[0].id)
    ```


    :param Sequence[_builtins.str] ids: List of attached ECS instance IDs.
    :param _builtins.str load_balancer_id: ID of the SLB with attachments.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['loadBalancerId'] = load_balancer_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:slb/getBackendServers:getBackendServers', __args__, opts=opts, typ=GetBackendServersResult).value

    return AwaitableGetBackendServersResult(
        backend_servers=pulumi.get(__ret__, 'backend_servers'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        load_balancer_id=pulumi.get(__ret__, 'load_balancer_id'),
        output_file=pulumi.get(__ret__, 'output_file'))
def get_backend_servers_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                               load_balancer_id: Optional[pulumi.Input[_builtins.str]] = None,
                               output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBackendServersResult]:
    """
    This data source provides the server load balancer backend servers related to a server load balancer..

    > **NOTE:** Available in 1.53.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    sample_ds = alicloud.slb.get_backend_servers(load_balancer_id=sample_slb["id"])
    pulumi.export("firstSlbBackendServerId", sample_ds.backend_servers[0].id)
    ```


    :param Sequence[_builtins.str] ids: List of attached ECS instance IDs.
    :param _builtins.str load_balancer_id: ID of the SLB with attachments.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['loadBalancerId'] = load_balancer_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:slb/getBackendServers:getBackendServers', __args__, opts=opts, typ=GetBackendServersResult)
    return __ret__.apply(lambda __response__: GetBackendServersResult(
        backend_servers=pulumi.get(__response__, 'backend_servers'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        load_balancer_id=pulumi.get(__response__, 'load_balancer_id'),
        output_file=pulumi.get(__response__, 'output_file')))
