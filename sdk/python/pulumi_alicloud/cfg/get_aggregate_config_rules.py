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
    'GetAggregateConfigRulesResult',
    'AwaitableGetAggregateConfigRulesResult',
    'get_aggregate_config_rules',
    'get_aggregate_config_rules_output',
]

@pulumi.output_type
class GetAggregateConfigRulesResult:
    """
    A collection of values returned by getAggregateConfigRules.
    """
    def __init__(__self__, aggregate_config_rule_name=None, aggregator_id=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, risk_level=None, rules=None, status=None):
        if aggregate_config_rule_name and not isinstance(aggregate_config_rule_name, str):
            raise TypeError("Expected argument 'aggregate_config_rule_name' to be a str")
        pulumi.set(__self__, "aggregate_config_rule_name", aggregate_config_rule_name)
        if aggregator_id and not isinstance(aggregator_id, str):
            raise TypeError("Expected argument 'aggregator_id' to be a str")
        pulumi.set(__self__, "aggregator_id", aggregator_id)
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
        if risk_level and not isinstance(risk_level, int):
            raise TypeError("Expected argument 'risk_level' to be a int")
        pulumi.set(__self__, "risk_level", risk_level)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="aggregateConfigRuleName")
    def aggregate_config_rule_name(self) -> Optional[_builtins.str]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "aggregate_config_rule_name")

    @_builtins.property
    @pulumi.getter(name="aggregatorId")
    def aggregator_id(self) -> _builtins.str:
        """
        The ID of Aggregator.
        """
        return pulumi.get(self, "aggregator_id")

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
        A list of Aggregate Config Rule names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="riskLevel")
    def risk_level(self) -> Optional[_builtins.int]:
        """
        The risk level of the resources that are not compliant with the rule. Valid values: `1`: critical, `2`: warning, `3`: info.
        """
        return pulumi.get(self, "risk_level")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetAggregateConfigRulesRuleResult']:
        """
        A list of Config Aggregate Config Rules. Each element contains the following attributes:
        """
        return pulumi.get(self, "rules")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        """
        The status of the rule.
        """
        return pulumi.get(self, "status")


class AwaitableGetAggregateConfigRulesResult(GetAggregateConfigRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAggregateConfigRulesResult(
            aggregate_config_rule_name=self.aggregate_config_rule_name,
            aggregator_id=self.aggregator_id,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            risk_level=self.risk_level,
            rules=self.rules,
            status=self.status)


def get_aggregate_config_rules(aggregate_config_rule_name: Optional[_builtins.str] = None,
                               aggregator_id: Optional[_builtins.str] = None,
                               enable_details: Optional[_builtins.bool] = None,
                               ids: Optional[Sequence[_builtins.str]] = None,
                               name_regex: Optional[_builtins.str] = None,
                               output_file: Optional[_builtins.str] = None,
                               risk_level: Optional[_builtins.int] = None,
                               status: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAggregateConfigRulesResult:
    """
    This data source provides the Config Aggregate Config Rules of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.124.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_aggregate_config_rules(aggregator_id="ca-3a9b626622af001d****",
        ids=["cr-5154626622af0034****"],
        name_regex="the_resource_name")
    pulumi.export("firstConfigAggregateConfigRuleId", example.rules[0].id)
    ```


    :param _builtins.str aggregate_config_rule_name: The config rule name.
    :param _builtins.str aggregator_id: The ID of aggregator.
    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of Aggregate Config Rule IDs.
    :param _builtins.str name_regex: A regex string to filter results by Aggregate Config Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.int risk_level: The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
    :param _builtins.str status: The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
    """
    __args__ = dict()
    __args__['aggregateConfigRuleName'] = aggregate_config_rule_name
    __args__['aggregatorId'] = aggregator_id
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['riskLevel'] = risk_level
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cfg/getAggregateConfigRules:getAggregateConfigRules', __args__, opts=opts, typ=GetAggregateConfigRulesResult).value

    return AwaitableGetAggregateConfigRulesResult(
        aggregate_config_rule_name=pulumi.get(__ret__, 'aggregate_config_rule_name'),
        aggregator_id=pulumi.get(__ret__, 'aggregator_id'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        risk_level=pulumi.get(__ret__, 'risk_level'),
        rules=pulumi.get(__ret__, 'rules'),
        status=pulumi.get(__ret__, 'status'))
def get_aggregate_config_rules_output(aggregate_config_rule_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                      aggregator_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                      ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                      name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                      output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                      risk_level: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                      status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAggregateConfigRulesResult]:
    """
    This data source provides the Config Aggregate Config Rules of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.124.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_aggregate_config_rules(aggregator_id="ca-3a9b626622af001d****",
        ids=["cr-5154626622af0034****"],
        name_regex="the_resource_name")
    pulumi.export("firstConfigAggregateConfigRuleId", example.rules[0].id)
    ```


    :param _builtins.str aggregate_config_rule_name: The config rule name.
    :param _builtins.str aggregator_id: The ID of aggregator.
    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of Aggregate Config Rule IDs.
    :param _builtins.str name_regex: A regex string to filter results by Aggregate Config Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.int risk_level: The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
    :param _builtins.str status: The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
    """
    __args__ = dict()
    __args__['aggregateConfigRuleName'] = aggregate_config_rule_name
    __args__['aggregatorId'] = aggregator_id
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['riskLevel'] = risk_level
    __args__['status'] = status
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cfg/getAggregateConfigRules:getAggregateConfigRules', __args__, opts=opts, typ=GetAggregateConfigRulesResult)
    return __ret__.apply(lambda __response__: GetAggregateConfigRulesResult(
        aggregate_config_rule_name=pulumi.get(__response__, 'aggregate_config_rule_name'),
        aggregator_id=pulumi.get(__response__, 'aggregator_id'),
        enable_details=pulumi.get(__response__, 'enable_details'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        risk_level=pulumi.get(__response__, 'risk_level'),
        rules=pulumi.get(__response__, 'rules'),
        status=pulumi.get(__response__, 'status')))
