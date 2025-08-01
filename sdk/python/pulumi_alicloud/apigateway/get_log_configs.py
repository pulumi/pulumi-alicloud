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
    'GetLogConfigsResult',
    'AwaitableGetLogConfigsResult',
    'get_log_configs',
    'get_log_configs_output',
]

@pulumi.output_type
class GetLogConfigsResult:
    """
    A collection of values returned by getLogConfigs.
    """
    def __init__(__self__, configs=None, id=None, ids=None, log_type=None, output_file=None):
        if configs and not isinstance(configs, list):
            raise TypeError("Expected argument 'configs' to be a list")
        pulumi.set(__self__, "configs", configs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if log_type and not isinstance(log_type, str):
            raise TypeError("Expected argument 'log_type' to be a str")
        pulumi.set(__self__, "log_type", log_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @_builtins.property
    @pulumi.getter
    def configs(self) -> Sequence['outputs.GetLogConfigsConfigResult']:
        return pulumi.get(self, "configs")

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
    @pulumi.getter(name="logType")
    def log_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "log_type")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")


class AwaitableGetLogConfigsResult(GetLogConfigsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLogConfigsResult(
            configs=self.configs,
            id=self.id,
            ids=self.ids,
            log_type=self.log_type,
            output_file=self.output_file)


def get_log_configs(ids: Optional[Sequence[_builtins.str]] = None,
                    log_type: Optional[_builtins.str] = None,
                    output_file: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLogConfigsResult:
    """
    This data source provides the Api Gateway Log Configs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.185.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.apigateway.get_log_configs(ids=["example_id"])
    pulumi.export("apiGatewayLogConfigId1", ids.configs[0].id)
    log_type = alicloud.apigateway.get_log_configs(log_type="PROVIDER")
    pulumi.export("apiGatewayLogConfigId2", log_type.configs[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of Log Config IDs.
    :param _builtins.str log_type: The type the of log. Valid values: `PROVIDER`.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['logType'] = log_type
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:apigateway/getLogConfigs:getLogConfigs', __args__, opts=opts, typ=GetLogConfigsResult).value

    return AwaitableGetLogConfigsResult(
        configs=pulumi.get(__ret__, 'configs'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        log_type=pulumi.get(__ret__, 'log_type'),
        output_file=pulumi.get(__ret__, 'output_file'))
def get_log_configs_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                           log_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLogConfigsResult]:
    """
    This data source provides the Api Gateway Log Configs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.185.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.apigateway.get_log_configs(ids=["example_id"])
    pulumi.export("apiGatewayLogConfigId1", ids.configs[0].id)
    log_type = alicloud.apigateway.get_log_configs(log_type="PROVIDER")
    pulumi.export("apiGatewayLogConfigId2", log_type.configs[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of Log Config IDs.
    :param _builtins.str log_type: The type the of log. Valid values: `PROVIDER`.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['logType'] = log_type
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:apigateway/getLogConfigs:getLogConfigs', __args__, opts=opts, typ=GetLogConfigsResult)
    return __ret__.apply(lambda __response__: GetLogConfigsResult(
        configs=pulumi.get(__response__, 'configs'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        log_type=pulumi.get(__response__, 'log_type'),
        output_file=pulumi.get(__response__, 'output_file')))
