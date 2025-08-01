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
    'GetPrefixListsResult',
    'AwaitableGetPrefixListsResult',
    'get_prefix_lists',
    'get_prefix_lists_output',
]

@pulumi.output_type
class GetPrefixListsResult:
    """
    A collection of values returned by getPrefixLists.
    """
    def __init__(__self__, enable_details=None, id=None, ids=None, lists=None, name_regex=None, names=None, output_file=None, prefix_list_name=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if lists and not isinstance(lists, list):
            raise TypeError("Expected argument 'lists' to be a list")
        pulumi.set(__self__, "lists", lists)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if prefix_list_name and not isinstance(prefix_list_name, str):
            raise TypeError("Expected argument 'prefix_list_name' to be a str")
        pulumi.set(__self__, "prefix_list_name", prefix_list_name)

    @_builtins.property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_details")

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
    def lists(self) -> Sequence['outputs.GetPrefixListsListResult']:
        """
        A list of Vpc Prefix Lists. Each element contains the following attributes:
        """
        return pulumi.get(self, "lists")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of Prefix List names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="prefixListName")
    def prefix_list_name(self) -> Optional[_builtins.str]:
        """
        The name of the prefix list.
        """
        return pulumi.get(self, "prefix_list_name")


class AwaitableGetPrefixListsResult(GetPrefixListsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrefixListsResult(
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            lists=self.lists,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            prefix_list_name=self.prefix_list_name)


def get_prefix_lists(enable_details: Optional[_builtins.bool] = None,
                     ids: Optional[Sequence[_builtins.str]] = None,
                     name_regex: Optional[_builtins.str] = None,
                     output_file: Optional[_builtins.str] = None,
                     prefix_list_name: Optional[_builtins.str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrefixListsResult:
    """
    This data source provides the Vpc Prefix Lists of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.182.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_prefix_lists()
    pulumi.export("vpcPrefixListId1", ids.lists[0].id)
    name_regex = alicloud.vpc.get_prefix_lists(name_regex="^my-PrefixList")
    pulumi.export("vpcPrefixListId2", name_regex.lists[0].id)
    ```


    :param _builtins.bool enable_details: Default to `true`. Set it to `false` can hide the `entrys` to output.
    :param Sequence[_builtins.str] ids: A list of Prefix List IDs.
    :param _builtins.str name_regex: A regex string to filter results by Prefix List name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str prefix_list_name: The name of the prefix list.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['prefixListName'] = prefix_list_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getPrefixLists:getPrefixLists', __args__, opts=opts, typ=GetPrefixListsResult).value

    return AwaitableGetPrefixListsResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        lists=pulumi.get(__ret__, 'lists'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        prefix_list_name=pulumi.get(__ret__, 'prefix_list_name'))
def get_prefix_lists_output(enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                            ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                            name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            prefix_list_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPrefixListsResult]:
    """
    This data source provides the Vpc Prefix Lists of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.182.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_prefix_lists()
    pulumi.export("vpcPrefixListId1", ids.lists[0].id)
    name_regex = alicloud.vpc.get_prefix_lists(name_regex="^my-PrefixList")
    pulumi.export("vpcPrefixListId2", name_regex.lists[0].id)
    ```


    :param _builtins.bool enable_details: Default to `true`. Set it to `false` can hide the `entrys` to output.
    :param Sequence[_builtins.str] ids: A list of Prefix List IDs.
    :param _builtins.str name_regex: A regex string to filter results by Prefix List name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str prefix_list_name: The name of the prefix list.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['prefixListName'] = prefix_list_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:vpc/getPrefixLists:getPrefixLists', __args__, opts=opts, typ=GetPrefixListsResult)
    return __ret__.apply(lambda __response__: GetPrefixListsResult(
        enable_details=pulumi.get(__response__, 'enable_details'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        lists=pulumi.get(__response__, 'lists'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        prefix_list_name=pulumi.get(__response__, 'prefix_list_name')))
