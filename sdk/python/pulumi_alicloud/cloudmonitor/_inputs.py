# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ServiceGroupMonitoringAgentProcessAlertConfigArgs',
    'ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs',
    'ServiceGroupMonitoringAgentProcessMatchExpressArgs',
]

@pulumi.input_type
class ServiceGroupMonitoringAgentProcessAlertConfigArgs:
    def __init__(__self__, *,
                 comparison_operator: pulumi.Input[str],
                 escalations_level: pulumi.Input[str],
                 statistics: pulumi.Input[str],
                 threshold: pulumi.Input[str],
                 times: pulumi.Input[str],
                 effective_interval: Optional[pulumi.Input[str]] = None,
                 silence_time: Optional[pulumi.Input[int]] = None,
                 target_lists: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs']]]] = None,
                 webhook: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] comparison_operator: The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
        :param pulumi.Input[str] escalations_level: The alert level. Valid values: `critical`, `warn`, `info`.
        :param pulumi.Input[str] statistics: The statistical method for alerts. Valid values: `Average`.
        :param pulumi.Input[str] threshold: The alert threshold.
        :param pulumi.Input[str] times: The number of times for which the threshold can be consecutively exceeded.
        :param pulumi.Input[str] effective_interval: The time period during which the alert rule is effective.
        :param pulumi.Input[int] silence_time: The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs']]] target_lists: The alert triggers. See `target_list` below.
        :param pulumi.Input[str] webhook: The callback URL.
        """
        pulumi.set(__self__, "comparison_operator", comparison_operator)
        pulumi.set(__self__, "escalations_level", escalations_level)
        pulumi.set(__self__, "statistics", statistics)
        pulumi.set(__self__, "threshold", threshold)
        pulumi.set(__self__, "times", times)
        if effective_interval is not None:
            pulumi.set(__self__, "effective_interval", effective_interval)
        if silence_time is not None:
            pulumi.set(__self__, "silence_time", silence_time)
        if target_lists is not None:
            pulumi.set(__self__, "target_lists", target_lists)
        if webhook is not None:
            pulumi.set(__self__, "webhook", webhook)

    @property
    @pulumi.getter(name="comparisonOperator")
    def comparison_operator(self) -> pulumi.Input[str]:
        """
        The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
        """
        return pulumi.get(self, "comparison_operator")

    @comparison_operator.setter
    def comparison_operator(self, value: pulumi.Input[str]):
        pulumi.set(self, "comparison_operator", value)

    @property
    @pulumi.getter(name="escalationsLevel")
    def escalations_level(self) -> pulumi.Input[str]:
        """
        The alert level. Valid values: `critical`, `warn`, `info`.
        """
        return pulumi.get(self, "escalations_level")

    @escalations_level.setter
    def escalations_level(self, value: pulumi.Input[str]):
        pulumi.set(self, "escalations_level", value)

    @property
    @pulumi.getter
    def statistics(self) -> pulumi.Input[str]:
        """
        The statistical method for alerts. Valid values: `Average`.
        """
        return pulumi.get(self, "statistics")

    @statistics.setter
    def statistics(self, value: pulumi.Input[str]):
        pulumi.set(self, "statistics", value)

    @property
    @pulumi.getter
    def threshold(self) -> pulumi.Input[str]:
        """
        The alert threshold.
        """
        return pulumi.get(self, "threshold")

    @threshold.setter
    def threshold(self, value: pulumi.Input[str]):
        pulumi.set(self, "threshold", value)

    @property
    @pulumi.getter
    def times(self) -> pulumi.Input[str]:
        """
        The number of times for which the threshold can be consecutively exceeded.
        """
        return pulumi.get(self, "times")

    @times.setter
    def times(self, value: pulumi.Input[str]):
        pulumi.set(self, "times", value)

    @property
    @pulumi.getter(name="effectiveInterval")
    def effective_interval(self) -> Optional[pulumi.Input[str]]:
        """
        The time period during which the alert rule is effective.
        """
        return pulumi.get(self, "effective_interval")

    @effective_interval.setter
    def effective_interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "effective_interval", value)

    @property
    @pulumi.getter(name="silenceTime")
    def silence_time(self) -> Optional[pulumi.Input[int]]:
        """
        The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
        """
        return pulumi.get(self, "silence_time")

    @silence_time.setter
    def silence_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "silence_time", value)

    @property
    @pulumi.getter(name="targetLists")
    def target_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs']]]]:
        """
        The alert triggers. See `target_list` below.
        """
        return pulumi.get(self, "target_lists")

    @target_lists.setter
    def target_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs']]]]):
        pulumi.set(self, "target_lists", value)

    @property
    @pulumi.getter
    def webhook(self) -> Optional[pulumi.Input[str]]:
        """
        The callback URL.
        """
        return pulumi.get(self, "webhook")

    @webhook.setter
    def webhook(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "webhook", value)


@pulumi.input_type
class ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 json_params: Optional[pulumi.Input[str]] = None,
                 level: Optional[pulumi.Input[str]] = None,
                 target_list_id: Optional[pulumi.Input[str]] = None):
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if json_params is not None:
            pulumi.set(__self__, "json_params", json_params)
        if level is not None:
            pulumi.set(__self__, "level", level)
        if target_list_id is not None:
            pulumi.set(__self__, "target_list_id", target_list_id)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="jsonParams")
    def json_params(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "json_params")

    @json_params.setter
    def json_params(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "json_params", value)

    @property
    @pulumi.getter
    def level(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "level")

    @level.setter
    def level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "level", value)

    @property
    @pulumi.getter(name="targetListId")
    def target_list_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "target_list_id")

    @target_list_id.setter
    def target_list_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_list_id", value)


@pulumi.input_type
class ServiceGroupMonitoringAgentProcessMatchExpressArgs:
    def __init__(__self__, *,
                 function: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] function: The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
        :param pulumi.Input[str] name: The criteria based on which the instances are matched.
        :param pulumi.Input[str] value: The keyword used to match the instance name.
        """
        if function is not None:
            pulumi.set(__self__, "function", function)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def function(self) -> Optional[pulumi.Input[str]]:
        """
        The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
        """
        return pulumi.get(self, "function")

    @function.setter
    def function(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The criteria based on which the instances are matched.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The keyword used to match the instance name.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)

