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
    'GetDdosCooPortsResult',
    'AwaitableGetDdosCooPortsResult',
    'get_ddos_coo_ports',
    'get_ddos_coo_ports_output',
]

@pulumi.output_type
class GetDdosCooPortsResult:
    """
    A collection of values returned by getDdosCooPorts.
    """
    def __init__(__self__, frontend_port=None, frontend_protocol=None, id=None, ids=None, instance_id=None, output_file=None, ports=None):
        if frontend_port and not isinstance(frontend_port, str):
            raise TypeError("Expected argument 'frontend_port' to be a str")
        pulumi.set(__self__, "frontend_port", frontend_port)
        if frontend_protocol and not isinstance(frontend_protocol, str):
            raise TypeError("Expected argument 'frontend_protocol' to be a str")
        pulumi.set(__self__, "frontend_protocol", frontend_protocol)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if ports and not isinstance(ports, list):
            raise TypeError("Expected argument 'ports' to be a list")
        pulumi.set(__self__, "ports", ports)

    @_builtins.property
    @pulumi.getter(name="frontendPort")
    def frontend_port(self) -> Optional[_builtins.str]:
        """
        The forwarding port.
        """
        return pulumi.get(self, "frontend_port")

    @_builtins.property
    @pulumi.getter(name="frontendProtocol")
    def frontend_protocol(self) -> Optional[_builtins.str]:
        """
        The forwarding protocol.
        """
        return pulumi.get(self, "frontend_protocol")

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
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> _builtins.str:
        """
        The Ddoscoo instance ID.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def ports(self) -> Sequence['outputs.GetDdosCooPortsPortResult']:
        """
        A list of DdosCoo Ports. Each element contains the following attributes:
        """
        return pulumi.get(self, "ports")


class AwaitableGetDdosCooPortsResult(GetDdosCooPortsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDdosCooPortsResult(
            frontend_port=self.frontend_port,
            frontend_protocol=self.frontend_protocol,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            output_file=self.output_file,
            ports=self.ports)


def get_ddos_coo_ports(frontend_port: Optional[_builtins.str] = None,
                       frontend_protocol: Optional[_builtins.str] = None,
                       ids: Optional[Sequence[_builtins.str]] = None,
                       instance_id: Optional[_builtins.str] = None,
                       output_file: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDdosCooPortsResult:
    """
    This data source provides the Ddoscoo Ports of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.123.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.ddos.get_ddos_coo_ports(instance_id="ddoscoo-cn-6ja1rl4j****",
        ids=["ddoscoo-cn-6ja1rl4j****:7001:tcp"])
    pulumi.export("firstDdoscooPortId", example.ports[0].id)
    ```


    :param _builtins.str frontend_port: The forwarding port.
    :param _builtins.str frontend_protocol: The forwarding protocol. Valid values `tcp` and `udp`.
    :param Sequence[_builtins.str] ids: A list of Port IDs.
    :param _builtins.str instance_id: The DdosCoo instance ID.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['frontendPort'] = frontend_port
    __args__['frontendProtocol'] = frontend_protocol
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ddos/getDdosCooPorts:getDdosCooPorts', __args__, opts=opts, typ=GetDdosCooPortsResult).value

    return AwaitableGetDdosCooPortsResult(
        frontend_port=pulumi.get(__ret__, 'frontend_port'),
        frontend_protocol=pulumi.get(__ret__, 'frontend_protocol'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        output_file=pulumi.get(__ret__, 'output_file'),
        ports=pulumi.get(__ret__, 'ports'))
def get_ddos_coo_ports_output(frontend_port: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              frontend_protocol: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                              instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                              output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDdosCooPortsResult]:
    """
    This data source provides the Ddoscoo Ports of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.123.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.ddos.get_ddos_coo_ports(instance_id="ddoscoo-cn-6ja1rl4j****",
        ids=["ddoscoo-cn-6ja1rl4j****:7001:tcp"])
    pulumi.export("firstDdoscooPortId", example.ports[0].id)
    ```


    :param _builtins.str frontend_port: The forwarding port.
    :param _builtins.str frontend_protocol: The forwarding protocol. Valid values `tcp` and `udp`.
    :param Sequence[_builtins.str] ids: A list of Port IDs.
    :param _builtins.str instance_id: The DdosCoo instance ID.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['frontendPort'] = frontend_port
    __args__['frontendProtocol'] = frontend_protocol
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:ddos/getDdosCooPorts:getDdosCooPorts', __args__, opts=opts, typ=GetDdosCooPortsResult)
    return __ret__.apply(lambda __response__: GetDdosCooPortsResult(
        frontend_port=pulumi.get(__response__, 'frontend_port'),
        frontend_protocol=pulumi.get(__response__, 'frontend_protocol'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        instance_id=pulumi.get(__response__, 'instance_id'),
        output_file=pulumi.get(__response__, 'output_file'),
        ports=pulumi.get(__response__, 'ports')))
