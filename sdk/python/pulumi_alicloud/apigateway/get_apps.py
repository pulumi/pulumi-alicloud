# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'GetAppsResult',
    'AwaitableGetAppsResult',
    'get_apps',
    'get_apps_output',
]

@pulumi.output_type
class GetAppsResult:
    """
    A collection of values returned by getApps.
    """
    def __init__(__self__, apps=None, id=None, ids=None, name_regex=None, names=None, output_file=None, tags=None):
        if apps and not isinstance(apps, list):
            raise TypeError("Expected argument 'apps' to be a list")
        pulumi.set(__self__, "apps", apps)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def apps(self) -> Sequence['outputs.GetAppsAppResult']:
        """
        A list of apps. Each element contains the following attributes:
        """
        return pulumi.get(self, "apps")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[builtins.str]:
        """
        A list of app IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[builtins.str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[builtins.str]:
        """
        A list of app names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[builtins.str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, builtins.str]]:
        return pulumi.get(self, "tags")


class AwaitableGetAppsResult(GetAppsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppsResult(
            apps=self.apps,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            tags=self.tags)


def get_apps(ids: Optional[Sequence[builtins.str]] = None,
             name_regex: Optional[builtins.str] = None,
             output_file: Optional[builtins.str] = None,
             tags: Optional[Mapping[str, builtins.str]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppsResult:
    """
    This data source provides the apps of the current Alibaba Cloud user.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    data_apigatway = alicloud.apigateway.get_apps(output_file="outapps")
    pulumi.export("firstAppId", data_apigatway.apps[0].id)
    ```


    :param Sequence[builtins.str] ids: A list of app IDs.
    :param builtins.str name_regex: A regex string to filter apps by name.
    :param builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param Mapping[str, builtins.str] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:apigateway/getApps:getApps', __args__, opts=opts, typ=GetAppsResult).value

    return AwaitableGetAppsResult(
        apps=pulumi.get(__ret__, 'apps'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        tags=pulumi.get(__ret__, 'tags'))
def get_apps_output(ids: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                    name_regex: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    output_file: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    tags: Optional[pulumi.Input[Optional[Mapping[str, builtins.str]]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppsResult]:
    """
    This data source provides the apps of the current Alibaba Cloud user.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    data_apigatway = alicloud.apigateway.get_apps(output_file="outapps")
    pulumi.export("firstAppId", data_apigatway.apps[0].id)
    ```


    :param Sequence[builtins.str] ids: A list of app IDs.
    :param builtins.str name_regex: A regex string to filter apps by name.
    :param builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param Mapping[str, builtins.str] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:apigateway/getApps:getApps', __args__, opts=opts, typ=GetAppsResult)
    return __ret__.apply(lambda __response__: GetAppsResult(
        apps=pulumi.get(__response__, 'apps'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        tags=pulumi.get(__response__, 'tags')))
