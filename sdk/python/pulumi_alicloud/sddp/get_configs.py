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
    'GetConfigsResult',
    'AwaitableGetConfigsResult',
    'get_configs',
    'get_configs_output',
]

@pulumi.output_type
class GetConfigsResult:
    """
    A collection of values returned by getConfigs.
    """
    def __init__(__self__, configs=None, id=None, ids=None, lang=None, output_file=None):
        if configs and not isinstance(configs, list):
            raise TypeError("Expected argument 'configs' to be a list")
        pulumi.set(__self__, "configs", configs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if lang and not isinstance(lang, str):
            raise TypeError("Expected argument 'lang' to be a str")
        pulumi.set(__self__, "lang", lang)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @_builtins.property
    @pulumi.getter
    def configs(self) -> Sequence['outputs.GetConfigsConfigResult']:
        """
        A list of Sddp Configs. Each element contains the following attributes:
        """
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
    @pulumi.getter
    def lang(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "lang")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")


class AwaitableGetConfigsResult(GetConfigsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConfigsResult(
            configs=self.configs,
            id=self.id,
            ids=self.ids,
            lang=self.lang,
            output_file=self.output_file)


def get_configs(ids: Optional[Sequence[_builtins.str]] = None,
                lang: Optional[_builtins.str] = None,
                output_file: Optional[_builtins.str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConfigsResult:
    """
    This data source provides the Sddp Configs of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.133.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default_config = alicloud.sddp.Config("default",
        code="access_failed_cnt",
        value="10")
    default = alicloud.sddp.get_configs_output(ids=[default_config.id],
        output_file="./t.json")
    pulumi.export("sddpConfigId", default.ids)
    ```


    :param Sequence[_builtins.str] ids: A list of Config IDs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['lang'] = lang
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:sddp/getConfigs:getConfigs', __args__, opts=opts, typ=GetConfigsResult).value

    return AwaitableGetConfigsResult(
        configs=pulumi.get(__ret__, 'configs'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        lang=pulumi.get(__ret__, 'lang'),
        output_file=pulumi.get(__ret__, 'output_file'))
def get_configs_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                       lang: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetConfigsResult]:
    """
    This data source provides the Sddp Configs of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.133.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default_config = alicloud.sddp.Config("default",
        code="access_failed_cnt",
        value="10")
    default = alicloud.sddp.get_configs_output(ids=[default_config.id],
        output_file="./t.json")
    pulumi.export("sddpConfigId", default.ids)
    ```


    :param Sequence[_builtins.str] ids: A list of Config IDs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['lang'] = lang
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:sddp/getConfigs:getConfigs', __args__, opts=opts, typ=GetConfigsResult)
    return __ret__.apply(lambda __response__: GetConfigsResult(
        configs=pulumi.get(__response__, 'configs'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        lang=pulumi.get(__response__, 'lang'),
        output_file=pulumi.get(__response__, 'output_file')))
