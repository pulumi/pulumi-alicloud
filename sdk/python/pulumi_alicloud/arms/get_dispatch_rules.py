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
    'GetDispatchRulesResult',
    'AwaitableGetDispatchRulesResult',
    'get_dispatch_rules',
    'get_dispatch_rules_output',
]

@pulumi.output_type
class GetDispatchRulesResult:
    """
    A collection of values returned by getDispatchRules.
    """
    def __init__(__self__, dispatch_rule_name=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, rules=None):
        if dispatch_rule_name and not isinstance(dispatch_rule_name, str):
            raise TypeError("Expected argument 'dispatch_rule_name' to be a str")
        pulumi.set(__self__, "dispatch_rule_name", dispatch_rule_name)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
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
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)

    @_builtins.property
    @pulumi.getter(name="dispatchRuleName")
    def dispatch_rule_name(self) -> Optional[_builtins.str]:
        """
        The name of the dispatch rule.
        """
        return pulumi.get(self, "dispatch_rule_name")

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
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of Dispatch Rule names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetDispatchRulesRuleResult']:
        """
        A list of Arms Dispatch Rules. Each element contains the following attributes:
        """
        return pulumi.get(self, "rules")


class AwaitableGetDispatchRulesResult(GetDispatchRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDispatchRulesResult(
            dispatch_rule_name=self.dispatch_rule_name,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            rules=self.rules)


def get_dispatch_rules(dispatch_rule_name: Optional[_builtins.str] = None,
                       enable_details: Optional[_builtins.bool] = None,
                       ids: Optional[Sequence[_builtins.str]] = None,
                       name_regex: Optional[_builtins.str] = None,
                       output_file: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDispatchRulesResult:
    """
    This data source provides the Arms Dispatch Rules of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.136.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.arms.AlertContact("default",
        alert_contact_name="example_value",
        email="example_value@aaa.com")
    default_alert_contact_group = alicloud.arms.AlertContactGroup("default",
        alert_contact_group_name="example_value",
        contact_ids=[default.id])
    default_dispatch_rule = alicloud.arms.DispatchRule("default",
        dispatch_rule_name="example_value",
        dispatch_type="CREATE_ALERT",
        group_rules=[{
            "group_wait_time": 5,
            "group_interval": 15,
            "repeat_interval": 100,
            "grouping_fields": ["alertname"],
        }],
        label_match_expression_grids=[{
            "label_match_expression_groups": [{
                "label_match_expressions": [{
                    "key": "_aliyun_arms_involvedObject_kind",
                    "value": "app",
                    "operator": "eq",
                }],
            }],
        }],
        notify_rules=[{
            "notify_objects": [
                {
                    "notify_object_id": default.id,
                    "notify_type": "ARMS_CONTACT",
                    "name": "example_value",
                },
                {
                    "notify_object_id": default_alert_contact_group.id,
                    "notify_type": "ARMS_CONTACT_GROUP",
                    "name": "example_value",
                },
            ],
            "notify_channels": [
                "dingTalk",
                "wechat",
            ],
            "notify_start_time": "10:00",
            "notify_end_time": "23:00",
        }])
    ids = alicloud.arms.get_dispatch_rules_output(ids=[default_dispatch_rule.id])
    pulumi.export("armsDispatchRuleId1", ids.rules[0].id)
    ```


    :param _builtins.str dispatch_rule_name: The name of the dispatch rule.
    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of dispatch rule id.
    :param _builtins.str name_regex: A regex string to filter results by Dispatch Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['dispatchRuleName'] = dispatch_rule_name
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:arms/getDispatchRules:getDispatchRules', __args__, opts=opts, typ=GetDispatchRulesResult).value

    return AwaitableGetDispatchRulesResult(
        dispatch_rule_name=pulumi.get(__ret__, 'dispatch_rule_name'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        rules=pulumi.get(__ret__, 'rules'))
def get_dispatch_rules_output(dispatch_rule_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                              ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                              name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDispatchRulesResult]:
    """
    This data source provides the Arms Dispatch Rules of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.136.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.arms.AlertContact("default",
        alert_contact_name="example_value",
        email="example_value@aaa.com")
    default_alert_contact_group = alicloud.arms.AlertContactGroup("default",
        alert_contact_group_name="example_value",
        contact_ids=[default.id])
    default_dispatch_rule = alicloud.arms.DispatchRule("default",
        dispatch_rule_name="example_value",
        dispatch_type="CREATE_ALERT",
        group_rules=[{
            "group_wait_time": 5,
            "group_interval": 15,
            "repeat_interval": 100,
            "grouping_fields": ["alertname"],
        }],
        label_match_expression_grids=[{
            "label_match_expression_groups": [{
                "label_match_expressions": [{
                    "key": "_aliyun_arms_involvedObject_kind",
                    "value": "app",
                    "operator": "eq",
                }],
            }],
        }],
        notify_rules=[{
            "notify_objects": [
                {
                    "notify_object_id": default.id,
                    "notify_type": "ARMS_CONTACT",
                    "name": "example_value",
                },
                {
                    "notify_object_id": default_alert_contact_group.id,
                    "notify_type": "ARMS_CONTACT_GROUP",
                    "name": "example_value",
                },
            ],
            "notify_channels": [
                "dingTalk",
                "wechat",
            ],
            "notify_start_time": "10:00",
            "notify_end_time": "23:00",
        }])
    ids = alicloud.arms.get_dispatch_rules_output(ids=[default_dispatch_rule.id])
    pulumi.export("armsDispatchRuleId1", ids.rules[0].id)
    ```


    :param _builtins.str dispatch_rule_name: The name of the dispatch rule.
    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of dispatch rule id.
    :param _builtins.str name_regex: A regex string to filter results by Dispatch Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['dispatchRuleName'] = dispatch_rule_name
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:arms/getDispatchRules:getDispatchRules', __args__, opts=opts, typ=GetDispatchRulesResult)
    return __ret__.apply(lambda __response__: GetDispatchRulesResult(
        dispatch_rule_name=pulumi.get(__response__, 'dispatch_rule_name'),
        enable_details=pulumi.get(__response__, 'enable_details'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        rules=pulumi.get(__response__, 'rules')))
