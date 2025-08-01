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

__all__ = [
    'GetAlertResourceResult',
    'AwaitableGetAlertResourceResult',
    'get_alert_resource',
    'get_alert_resource_output',
]

@pulumi.output_type
class GetAlertResourceResult:
    """
    A collection of values returned by getAlertResource.
    """
    def __init__(__self__, id=None, lang=None, project=None, type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if lang and not isinstance(lang, str):
            raise TypeError("Expected argument 'lang' to be a str")
        pulumi.set(__self__, "lang", lang)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def lang(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "lang")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        return pulumi.get(self, "type")


class AwaitableGetAlertResourceResult(GetAlertResourceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAlertResourceResult(
            id=self.id,
            lang=self.lang,
            project=self.project,
            type=self.type)


def get_alert_resource(lang: Optional[_builtins.str] = None,
                       project: Optional[_builtins.str] = None,
                       type: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAlertResourceResult:
    """
    Using this data source can init SLS Alert resources automatically.

    For information about SLS Alert and how to use it, see [SLS Alert Overview](https://www.alibabacloud.com/help/en/doc-detail/209202.html)

    > **DEPRECATED:**  This resource  has been deprecated from version `1.219.0`. Please use new resource alicloud_log_alert_resource.

    > **NOTE:** Available since v1.161.0.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example_user = alicloud.log.get_alert_resource(type="user",
        lang="cn")
    ```


    :param _builtins.str lang: The lang of alert center resource when type is user.
    :param _builtins.str project: The project of alert resource when type is project.
    :param _builtins.str type: The type of alert resources, must be user or project, 'user' for init aliyuncloud account's alert center resource, including project named sls-alert-{uid}-{region} and some dashboards; 'project' for init project's alert resource, including logstore named internal-alert-history and alert dashboard.
    """
    __args__ = dict()
    __args__['lang'] = lang
    __args__['project'] = project
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:log/getAlertResource:getAlertResource', __args__, opts=opts, typ=GetAlertResourceResult).value

    return AwaitableGetAlertResourceResult(
        id=pulumi.get(__ret__, 'id'),
        lang=pulumi.get(__ret__, 'lang'),
        project=pulumi.get(__ret__, 'project'),
        type=pulumi.get(__ret__, 'type'))
def get_alert_resource_output(lang: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              type: Optional[pulumi.Input[_builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAlertResourceResult]:
    """
    Using this data source can init SLS Alert resources automatically.

    For information about SLS Alert and how to use it, see [SLS Alert Overview](https://www.alibabacloud.com/help/en/doc-detail/209202.html)

    > **DEPRECATED:**  This resource  has been deprecated from version `1.219.0`. Please use new resource alicloud_log_alert_resource.

    > **NOTE:** Available since v1.161.0.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example_user = alicloud.log.get_alert_resource(type="user",
        lang="cn")
    ```


    :param _builtins.str lang: The lang of alert center resource when type is user.
    :param _builtins.str project: The project of alert resource when type is project.
    :param _builtins.str type: The type of alert resources, must be user or project, 'user' for init aliyuncloud account's alert center resource, including project named sls-alert-{uid}-{region} and some dashboards; 'project' for init project's alert resource, including logstore named internal-alert-history and alert dashboard.
    """
    __args__ = dict()
    __args__['lang'] = lang
    __args__['project'] = project
    __args__['type'] = type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:log/getAlertResource:getAlertResource', __args__, opts=opts, typ=GetAlertResourceResult)
    return __ret__.apply(lambda __response__: GetAlertResourceResult(
        id=pulumi.get(__response__, 'id'),
        lang=pulumi.get(__response__, 'lang'),
        project=pulumi.get(__response__, 'project'),
        type=pulumi.get(__response__, 'type')))
