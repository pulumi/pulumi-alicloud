# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    'ServiceGroupMonitoringAgentProcessAlertConfig',
    'ServiceGroupMonitoringAgentProcessAlertConfigTargetList',
    'ServiceGroupMonitoringAgentProcessMatchExpress',
    'GetServiceHybridDoubleWritesHybridDoubleWriteResult',
]

@pulumi.output_type
class ServiceGroupMonitoringAgentProcessAlertConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "comparisonOperator":
            suggest = "comparison_operator"
        elif key == "escalationsLevel":
            suggest = "escalations_level"
        elif key == "effectiveInterval":
            suggest = "effective_interval"
        elif key == "silenceTime":
            suggest = "silence_time"
        elif key == "targetLists":
            suggest = "target_lists"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ServiceGroupMonitoringAgentProcessAlertConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ServiceGroupMonitoringAgentProcessAlertConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ServiceGroupMonitoringAgentProcessAlertConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 comparison_operator: str,
                 escalations_level: str,
                 statistics: str,
                 threshold: str,
                 times: str,
                 effective_interval: Optional[str] = None,
                 silence_time: Optional[int] = None,
                 target_lists: Optional[Sequence['outputs.ServiceGroupMonitoringAgentProcessAlertConfigTargetList']] = None,
                 webhook: Optional[str] = None):
        """
        :param str comparison_operator: The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
        :param str escalations_level: The alert level. Valid values: `critical`, `warn`, `info`.
        :param str statistics: The statistical method for alerts. Valid values: `Average`.
        :param str threshold: The alert threshold.
        :param str times: The number of times for which the threshold can be consecutively exceeded.
        :param str effective_interval: The time period during which the alert rule is effective.
        :param int silence_time: The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
        :param Sequence['ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs'] target_lists: The alert triggers. See `target_list` below.
        :param str webhook: The callback URL.
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
    def comparison_operator(self) -> str:
        """
        The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
        """
        return pulumi.get(self, "comparison_operator")

    @property
    @pulumi.getter(name="escalationsLevel")
    def escalations_level(self) -> str:
        """
        The alert level. Valid values: `critical`, `warn`, `info`.
        """
        return pulumi.get(self, "escalations_level")

    @property
    @pulumi.getter
    def statistics(self) -> str:
        """
        The statistical method for alerts. Valid values: `Average`.
        """
        return pulumi.get(self, "statistics")

    @property
    @pulumi.getter
    def threshold(self) -> str:
        """
        The alert threshold.
        """
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter
    def times(self) -> str:
        """
        The number of times for which the threshold can be consecutively exceeded.
        """
        return pulumi.get(self, "times")

    @property
    @pulumi.getter(name="effectiveInterval")
    def effective_interval(self) -> Optional[str]:
        """
        The time period during which the alert rule is effective.
        """
        return pulumi.get(self, "effective_interval")

    @property
    @pulumi.getter(name="silenceTime")
    def silence_time(self) -> Optional[int]:
        """
        The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
        """
        return pulumi.get(self, "silence_time")

    @property
    @pulumi.getter(name="targetLists")
    def target_lists(self) -> Optional[Sequence['outputs.ServiceGroupMonitoringAgentProcessAlertConfigTargetList']]:
        """
        The alert triggers. See `target_list` below.
        """
        return pulumi.get(self, "target_lists")

    @property
    @pulumi.getter
    def webhook(self) -> Optional[str]:
        """
        The callback URL.
        """
        return pulumi.get(self, "webhook")


@pulumi.output_type
class ServiceGroupMonitoringAgentProcessAlertConfigTargetList(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "jsonParams":
            suggest = "json_params"
        elif key == "targetListId":
            suggest = "target_list_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ServiceGroupMonitoringAgentProcessAlertConfigTargetList. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ServiceGroupMonitoringAgentProcessAlertConfigTargetList.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ServiceGroupMonitoringAgentProcessAlertConfigTargetList.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 arn: Optional[str] = None,
                 json_params: Optional[str] = None,
                 level: Optional[str] = None,
                 target_list_id: Optional[str] = None):
        """
        :param str arn: The Alibaba Cloud Resource Name (ARN) of the resource.
        :param str json_params: The parameters of the alert callback. Specify the parameters in the JSON format.
        :param str level: The alert level. Valid values: `CRITICAL`, `WARN`, `INFO`.
        :param str target_list_id: The ID of the resource for which alerts are triggered.
        """
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
    def arn(self) -> Optional[str]:
        """
        The Alibaba Cloud Resource Name (ARN) of the resource.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="jsonParams")
    def json_params(self) -> Optional[str]:
        """
        The parameters of the alert callback. Specify the parameters in the JSON format.
        """
        return pulumi.get(self, "json_params")

    @property
    @pulumi.getter
    def level(self) -> Optional[str]:
        """
        The alert level. Valid values: `CRITICAL`, `WARN`, `INFO`.
        """
        return pulumi.get(self, "level")

    @property
    @pulumi.getter(name="targetListId")
    def target_list_id(self) -> Optional[str]:
        """
        The ID of the resource for which alerts are triggered.
        """
        return pulumi.get(self, "target_list_id")


@pulumi.output_type
class ServiceGroupMonitoringAgentProcessMatchExpress(dict):
    def __init__(__self__, *,
                 function: Optional[str] = None,
                 name: Optional[str] = None,
                 value: Optional[str] = None):
        """
        :param str function: The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
        :param str name: The criteria based on which the instances are matched.
        :param str value: The keyword used to match the instance name.
        """
        if function is not None:
            pulumi.set(__self__, "function", function)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def function(self) -> Optional[str]:
        """
        The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
        """
        return pulumi.get(self, "function")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The criteria based on which the instances are matched.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        The keyword used to match the instance name.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetServiceHybridDoubleWritesHybridDoubleWriteResult(dict):
    def __init__(__self__, *,
                 id: str,
                 namespace: str,
                 source_namespace: str,
                 source_user_id: str,
                 user_id: str):
        """
        :param str id: The ID of the Hybrid Double Write. It formats as `<source_namespace>:<source_user_id>`.
        :param str namespace: Target Namespace.
        :param str source_namespace: Source Namespace.
        :param str source_user_id: Source UserId.
        :param str user_id: Target UserId.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "namespace", namespace)
        pulumi.set(__self__, "source_namespace", source_namespace)
        pulumi.set(__self__, "source_user_id", source_user_id)
        pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Hybrid Double Write. It formats as `<source_namespace>:<source_user_id>`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def namespace(self) -> str:
        """
        Target Namespace.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="sourceNamespace")
    def source_namespace(self) -> str:
        """
        Source Namespace.
        """
        return pulumi.get(self, "source_namespace")

    @property
    @pulumi.getter(name="sourceUserId")
    def source_user_id(self) -> str:
        """
        Source UserId.
        """
        return pulumi.get(self, "source_user_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        Target UserId.
        """
        return pulumi.get(self, "user_id")


