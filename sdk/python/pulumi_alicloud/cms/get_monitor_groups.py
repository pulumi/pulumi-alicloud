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
    'GetMonitorGroupsResult',
    'AwaitableGetMonitorGroupsResult',
    'get_monitor_groups',
    'get_monitor_groups_output',
]

@pulumi.output_type
class GetMonitorGroupsResult:
    """
    A collection of values returned by getMonitorGroups.
    """
    def __init__(__self__, dynamic_tag_rule_id=None, groups=None, id=None, ids=None, include_template_history=None, keyword=None, monitor_group_name=None, name_regex=None, names=None, output_file=None, select_contact_groups=None, tags=None, type=None):
        if dynamic_tag_rule_id and not isinstance(dynamic_tag_rule_id, str):
            raise TypeError("Expected argument 'dynamic_tag_rule_id' to be a str")
        pulumi.set(__self__, "dynamic_tag_rule_id", dynamic_tag_rule_id)
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if include_template_history and not isinstance(include_template_history, bool):
            raise TypeError("Expected argument 'include_template_history' to be a bool")
        pulumi.set(__self__, "include_template_history", include_template_history)
        if keyword and not isinstance(keyword, str):
            raise TypeError("Expected argument 'keyword' to be a str")
        pulumi.set(__self__, "keyword", keyword)
        if monitor_group_name and not isinstance(monitor_group_name, str):
            raise TypeError("Expected argument 'monitor_group_name' to be a str")
        pulumi.set(__self__, "monitor_group_name", monitor_group_name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if select_contact_groups and not isinstance(select_contact_groups, bool):
            raise TypeError("Expected argument 'select_contact_groups' to be a bool")
        pulumi.set(__self__, "select_contact_groups", select_contact_groups)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="dynamicTagRuleId")
    def dynamic_tag_rule_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "dynamic_tag_rule_id")

    @_builtins.property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetMonitorGroupsGroupResult']:
        return pulumi.get(self, "groups")

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
    @pulumi.getter(name="includeTemplateHistory")
    def include_template_history(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "include_template_history")

    @_builtins.property
    @pulumi.getter
    def keyword(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "keyword")

    @_builtins.property
    @pulumi.getter(name="monitorGroupName")
    def monitor_group_name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "monitor_group_name")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="selectContactGroups")
    def select_contact_groups(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "select_contact_groups")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "type")


class AwaitableGetMonitorGroupsResult(GetMonitorGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMonitorGroupsResult(
            dynamic_tag_rule_id=self.dynamic_tag_rule_id,
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            include_template_history=self.include_template_history,
            keyword=self.keyword,
            monitor_group_name=self.monitor_group_name,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            select_contact_groups=self.select_contact_groups,
            tags=self.tags,
            type=self.type)


def get_monitor_groups(dynamic_tag_rule_id: Optional[_builtins.str] = None,
                       ids: Optional[Sequence[_builtins.str]] = None,
                       include_template_history: Optional[_builtins.bool] = None,
                       keyword: Optional[_builtins.str] = None,
                       monitor_group_name: Optional[_builtins.str] = None,
                       name_regex: Optional[_builtins.str] = None,
                       output_file: Optional[_builtins.str] = None,
                       select_contact_groups: Optional[_builtins.bool] = None,
                       tags: Optional[Mapping[str, _builtins.str]] = None,
                       type: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMonitorGroupsResult:
    """
    This data source provides the Cms Monitor Groups of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.113.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cms.get_monitor_groups(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstCmsMonitorGroupId", example.groups[0].id)
    ```


    :param _builtins.str dynamic_tag_rule_id: The ID of the tag rule.
    :param Sequence[_builtins.str] ids: A list of Monitor Group IDs.
    :param _builtins.bool include_template_history: The include template history.
    :param _builtins.str keyword: The keyword to be matched.
    :param _builtins.str monitor_group_name: The name of the application group.
    :param _builtins.str name_regex: A regex string to filter results by Monitor Group name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.bool select_contact_groups: The select contact groups.
    :param _builtins.str type: The type of the application group. Valid values: `custom`, `ehpc_cluster`, `kubernetes`.
    """
    __args__ = dict()
    __args__['dynamicTagRuleId'] = dynamic_tag_rule_id
    __args__['ids'] = ids
    __args__['includeTemplateHistory'] = include_template_history
    __args__['keyword'] = keyword
    __args__['monitorGroupName'] = monitor_group_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['selectContactGroups'] = select_contact_groups
    __args__['tags'] = tags
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cms/getMonitorGroups:getMonitorGroups', __args__, opts=opts, typ=GetMonitorGroupsResult).value

    return AwaitableGetMonitorGroupsResult(
        dynamic_tag_rule_id=pulumi.get(__ret__, 'dynamic_tag_rule_id'),
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        include_template_history=pulumi.get(__ret__, 'include_template_history'),
        keyword=pulumi.get(__ret__, 'keyword'),
        monitor_group_name=pulumi.get(__ret__, 'monitor_group_name'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        select_contact_groups=pulumi.get(__ret__, 'select_contact_groups'),
        tags=pulumi.get(__ret__, 'tags'),
        type=pulumi.get(__ret__, 'type'))
def get_monitor_groups_output(dynamic_tag_rule_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                              include_template_history: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                              keyword: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              monitor_group_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              select_contact_groups: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                              tags: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                              type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMonitorGroupsResult]:
    """
    This data source provides the Cms Monitor Groups of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.113.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cms.get_monitor_groups(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstCmsMonitorGroupId", example.groups[0].id)
    ```


    :param _builtins.str dynamic_tag_rule_id: The ID of the tag rule.
    :param Sequence[_builtins.str] ids: A list of Monitor Group IDs.
    :param _builtins.bool include_template_history: The include template history.
    :param _builtins.str keyword: The keyword to be matched.
    :param _builtins.str monitor_group_name: The name of the application group.
    :param _builtins.str name_regex: A regex string to filter results by Monitor Group name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.bool select_contact_groups: The select contact groups.
    :param _builtins.str type: The type of the application group. Valid values: `custom`, `ehpc_cluster`, `kubernetes`.
    """
    __args__ = dict()
    __args__['dynamicTagRuleId'] = dynamic_tag_rule_id
    __args__['ids'] = ids
    __args__['includeTemplateHistory'] = include_template_history
    __args__['keyword'] = keyword
    __args__['monitorGroupName'] = monitor_group_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['selectContactGroups'] = select_contact_groups
    __args__['tags'] = tags
    __args__['type'] = type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cms/getMonitorGroups:getMonitorGroups', __args__, opts=opts, typ=GetMonitorGroupsResult)
    return __ret__.apply(lambda __response__: GetMonitorGroupsResult(
        dynamic_tag_rule_id=pulumi.get(__response__, 'dynamic_tag_rule_id'),
        groups=pulumi.get(__response__, 'groups'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        include_template_history=pulumi.get(__response__, 'include_template_history'),
        keyword=pulumi.get(__response__, 'keyword'),
        monitor_group_name=pulumi.get(__response__, 'monitor_group_name'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        select_contact_groups=pulumi.get(__response__, 'select_contact_groups'),
        tags=pulumi.get(__response__, 'tags'),
        type=pulumi.get(__response__, 'type')))
