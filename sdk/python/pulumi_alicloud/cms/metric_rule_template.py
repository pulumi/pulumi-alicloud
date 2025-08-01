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
from ._inputs import *

__all__ = ['MetricRuleTemplateArgs', 'MetricRuleTemplate']

@pulumi.input_type
class MetricRuleTemplateArgs:
    def __init__(__self__, *,
                 metric_rule_template_name: pulumi.Input[_builtins.str],
                 alert_templates: Optional[pulumi.Input[Sequence[pulumi.Input['MetricRuleTemplateAlertTemplateArgs']]]] = None,
                 apply_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_end_time: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_start_time: Optional[pulumi.Input[_builtins.str]] = None,
                 group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 notify_level: Optional[pulumi.Input[_builtins.str]] = None,
                 silence_time: Optional[pulumi.Input[_builtins.int]] = None,
                 webhook: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a MetricRuleTemplate resource.
        :param pulumi.Input[_builtins.str] metric_rule_template_name: The name of the alert template.
        :param pulumi.Input[Sequence[pulumi.Input['MetricRuleTemplateAlertTemplateArgs']]] alert_templates: The details of alert rules that are generated based on the alert template. See `alert_templates` below.
        :param pulumi.Input[_builtins.str] apply_mode: The mode in which the alert template is applied. Valid values:
               - `GROUP_INSTANCE_FIRST`: The metrics in the application group take precedence.
               - `ALARM_TEMPLATE_FIRST `: The metrics specified in the alert template take precedence.
        :param pulumi.Input[_builtins.str] description: The description of the alert template.
        :param pulumi.Input[_builtins.str] enable_end_time: The end of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:59 and the value `23` indicates 23:59.
        :param pulumi.Input[_builtins.str] enable_start_time: The beginning of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:00 and the value `23` indicates 23:00.
        :param pulumi.Input[_builtins.str] group_id: The ID of the application group.
        :param pulumi.Input[_builtins.str] notify_level: The alert notification method. Valid values:
        :param pulumi.Input[_builtins.int] silence_time: The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: `86400`. Valid values: `0` to `86400`.
        :param pulumi.Input[_builtins.str] webhook: The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
        """
        pulumi.set(__self__, "metric_rule_template_name", metric_rule_template_name)
        if alert_templates is not None:
            pulumi.set(__self__, "alert_templates", alert_templates)
        if apply_mode is not None:
            pulumi.set(__self__, "apply_mode", apply_mode)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enable_end_time is not None:
            pulumi.set(__self__, "enable_end_time", enable_end_time)
        if enable_start_time is not None:
            pulumi.set(__self__, "enable_start_time", enable_start_time)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if notify_level is not None:
            pulumi.set(__self__, "notify_level", notify_level)
        if silence_time is not None:
            pulumi.set(__self__, "silence_time", silence_time)
        if webhook is not None:
            pulumi.set(__self__, "webhook", webhook)

    @_builtins.property
    @pulumi.getter(name="metricRuleTemplateName")
    def metric_rule_template_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the alert template.
        """
        return pulumi.get(self, "metric_rule_template_name")

    @metric_rule_template_name.setter
    def metric_rule_template_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "metric_rule_template_name", value)

    @_builtins.property
    @pulumi.getter(name="alertTemplates")
    def alert_templates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MetricRuleTemplateAlertTemplateArgs']]]]:
        """
        The details of alert rules that are generated based on the alert template. See `alert_templates` below.
        """
        return pulumi.get(self, "alert_templates")

    @alert_templates.setter
    def alert_templates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MetricRuleTemplateAlertTemplateArgs']]]]):
        pulumi.set(self, "alert_templates", value)

    @_builtins.property
    @pulumi.getter(name="applyMode")
    def apply_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The mode in which the alert template is applied. Valid values:
        - `GROUP_INSTANCE_FIRST`: The metrics in the application group take precedence.
        - `ALARM_TEMPLATE_FIRST `: The metrics specified in the alert template take precedence.
        """
        return pulumi.get(self, "apply_mode")

    @apply_mode.setter
    def apply_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "apply_mode", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the alert template.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="enableEndTime")
    def enable_end_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The end of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:59 and the value `23` indicates 23:59.
        """
        return pulumi.get(self, "enable_end_time")

    @enable_end_time.setter
    def enable_end_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "enable_end_time", value)

    @_builtins.property
    @pulumi.getter(name="enableStartTime")
    def enable_start_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The beginning of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:00 and the value `23` indicates 23:00.
        """
        return pulumi.get(self, "enable_start_time")

    @enable_start_time.setter
    def enable_start_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "enable_start_time", value)

    @_builtins.property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the application group.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "group_id", value)

    @_builtins.property
    @pulumi.getter(name="notifyLevel")
    def notify_level(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The alert notification method. Valid values:
        """
        return pulumi.get(self, "notify_level")

    @notify_level.setter
    def notify_level(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "notify_level", value)

    @_builtins.property
    @pulumi.getter(name="silenceTime")
    def silence_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: `86400`. Valid values: `0` to `86400`.
        """
        return pulumi.get(self, "silence_time")

    @silence_time.setter
    def silence_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "silence_time", value)

    @_builtins.property
    @pulumi.getter
    def webhook(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
        """
        return pulumi.get(self, "webhook")

    @webhook.setter
    def webhook(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "webhook", value)


@pulumi.input_type
class _MetricRuleTemplateState:
    def __init__(__self__, *,
                 alert_templates: Optional[pulumi.Input[Sequence[pulumi.Input['MetricRuleTemplateAlertTemplateArgs']]]] = None,
                 apply_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_end_time: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_start_time: Optional[pulumi.Input[_builtins.str]] = None,
                 group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metric_rule_template_name: Optional[pulumi.Input[_builtins.str]] = None,
                 notify_level: Optional[pulumi.Input[_builtins.str]] = None,
                 rest_version: Optional[pulumi.Input[_builtins.str]] = None,
                 silence_time: Optional[pulumi.Input[_builtins.int]] = None,
                 webhook: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering MetricRuleTemplate resources.
        :param pulumi.Input[Sequence[pulumi.Input['MetricRuleTemplateAlertTemplateArgs']]] alert_templates: The details of alert rules that are generated based on the alert template. See `alert_templates` below.
        :param pulumi.Input[_builtins.str] apply_mode: The mode in which the alert template is applied. Valid values:
               - `GROUP_INSTANCE_FIRST`: The metrics in the application group take precedence.
               - `ALARM_TEMPLATE_FIRST `: The metrics specified in the alert template take precedence.
        :param pulumi.Input[_builtins.str] description: The description of the alert template.
        :param pulumi.Input[_builtins.str] enable_end_time: The end of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:59 and the value `23` indicates 23:59.
        :param pulumi.Input[_builtins.str] enable_start_time: The beginning of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:00 and the value `23` indicates 23:00.
        :param pulumi.Input[_builtins.str] group_id: The ID of the application group.
        :param pulumi.Input[_builtins.str] metric_rule_template_name: The name of the alert template.
        :param pulumi.Input[_builtins.str] notify_level: The alert notification method. Valid values:
        :param pulumi.Input[_builtins.str] rest_version: The version of the alert template.
        :param pulumi.Input[_builtins.int] silence_time: The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: `86400`. Valid values: `0` to `86400`.
        :param pulumi.Input[_builtins.str] webhook: The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
        """
        if alert_templates is not None:
            pulumi.set(__self__, "alert_templates", alert_templates)
        if apply_mode is not None:
            pulumi.set(__self__, "apply_mode", apply_mode)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enable_end_time is not None:
            pulumi.set(__self__, "enable_end_time", enable_end_time)
        if enable_start_time is not None:
            pulumi.set(__self__, "enable_start_time", enable_start_time)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if metric_rule_template_name is not None:
            pulumi.set(__self__, "metric_rule_template_name", metric_rule_template_name)
        if notify_level is not None:
            pulumi.set(__self__, "notify_level", notify_level)
        if rest_version is not None:
            pulumi.set(__self__, "rest_version", rest_version)
        if silence_time is not None:
            pulumi.set(__self__, "silence_time", silence_time)
        if webhook is not None:
            pulumi.set(__self__, "webhook", webhook)

    @_builtins.property
    @pulumi.getter(name="alertTemplates")
    def alert_templates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MetricRuleTemplateAlertTemplateArgs']]]]:
        """
        The details of alert rules that are generated based on the alert template. See `alert_templates` below.
        """
        return pulumi.get(self, "alert_templates")

    @alert_templates.setter
    def alert_templates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MetricRuleTemplateAlertTemplateArgs']]]]):
        pulumi.set(self, "alert_templates", value)

    @_builtins.property
    @pulumi.getter(name="applyMode")
    def apply_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The mode in which the alert template is applied. Valid values:
        - `GROUP_INSTANCE_FIRST`: The metrics in the application group take precedence.
        - `ALARM_TEMPLATE_FIRST `: The metrics specified in the alert template take precedence.
        """
        return pulumi.get(self, "apply_mode")

    @apply_mode.setter
    def apply_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "apply_mode", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the alert template.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="enableEndTime")
    def enable_end_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The end of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:59 and the value `23` indicates 23:59.
        """
        return pulumi.get(self, "enable_end_time")

    @enable_end_time.setter
    def enable_end_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "enable_end_time", value)

    @_builtins.property
    @pulumi.getter(name="enableStartTime")
    def enable_start_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The beginning of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:00 and the value `23` indicates 23:00.
        """
        return pulumi.get(self, "enable_start_time")

    @enable_start_time.setter
    def enable_start_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "enable_start_time", value)

    @_builtins.property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the application group.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "group_id", value)

    @_builtins.property
    @pulumi.getter(name="metricRuleTemplateName")
    def metric_rule_template_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the alert template.
        """
        return pulumi.get(self, "metric_rule_template_name")

    @metric_rule_template_name.setter
    def metric_rule_template_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "metric_rule_template_name", value)

    @_builtins.property
    @pulumi.getter(name="notifyLevel")
    def notify_level(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The alert notification method. Valid values:
        """
        return pulumi.get(self, "notify_level")

    @notify_level.setter
    def notify_level(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "notify_level", value)

    @_builtins.property
    @pulumi.getter(name="restVersion")
    def rest_version(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The version of the alert template.
        """
        return pulumi.get(self, "rest_version")

    @rest_version.setter
    def rest_version(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rest_version", value)

    @_builtins.property
    @pulumi.getter(name="silenceTime")
    def silence_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: `86400`. Valid values: `0` to `86400`.
        """
        return pulumi.get(self, "silence_time")

    @silence_time.setter
    def silence_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "silence_time", value)

    @_builtins.property
    @pulumi.getter
    def webhook(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
        """
        return pulumi.get(self, "webhook")

    @webhook.setter
    def webhook(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "webhook", value)


@pulumi.type_token("alicloud:cms/metricRuleTemplate:MetricRuleTemplate")
class MetricRuleTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_templates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MetricRuleTemplateAlertTemplateArgs', 'MetricRuleTemplateAlertTemplateArgsDict']]]]] = None,
                 apply_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_end_time: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_start_time: Optional[pulumi.Input[_builtins.str]] = None,
                 group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metric_rule_template_name: Optional[pulumi.Input[_builtins.str]] = None,
                 notify_level: Optional[pulumi.Input[_builtins.str]] = None,
                 silence_time: Optional[pulumi.Input[_builtins.int]] = None,
                 webhook: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Cloud Monitor Service Metric Rule Template resource.

        For information about Cloud Monitor Service Metric Rule Template and how to use it, see [What is Metric Rule Template](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createmetricruletemplate).

        > **NOTE:** Available since v1.134.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        example = alicloud.cms.MetricRuleTemplate("example",
            metric_rule_template_name=name,
            alert_templates=[{
                "category": "ecs",
                "metric_name": "cpu_total",
                "namespace": "acs_ecs_dashboard",
                "rule_name": "tf_example",
                "escalations": {
                    "critical": {
                        "comparison_operator": "GreaterThanThreshold",
                        "statistics": "Average",
                        "threshold": "90",
                        "times": "3",
                    },
                },
            }])
        ```

        ## Import

        Cloud Monitor Service Metric Rule Template can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cms/metricRuleTemplate:MetricRuleTemplate example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['MetricRuleTemplateAlertTemplateArgs', 'MetricRuleTemplateAlertTemplateArgsDict']]]] alert_templates: The details of alert rules that are generated based on the alert template. See `alert_templates` below.
        :param pulumi.Input[_builtins.str] apply_mode: The mode in which the alert template is applied. Valid values:
               - `GROUP_INSTANCE_FIRST`: The metrics in the application group take precedence.
               - `ALARM_TEMPLATE_FIRST `: The metrics specified in the alert template take precedence.
        :param pulumi.Input[_builtins.str] description: The description of the alert template.
        :param pulumi.Input[_builtins.str] enable_end_time: The end of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:59 and the value `23` indicates 23:59.
        :param pulumi.Input[_builtins.str] enable_start_time: The beginning of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:00 and the value `23` indicates 23:00.
        :param pulumi.Input[_builtins.str] group_id: The ID of the application group.
        :param pulumi.Input[_builtins.str] metric_rule_template_name: The name of the alert template.
        :param pulumi.Input[_builtins.str] notify_level: The alert notification method. Valid values:
        :param pulumi.Input[_builtins.int] silence_time: The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: `86400`. Valid values: `0` to `86400`.
        :param pulumi.Input[_builtins.str] webhook: The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MetricRuleTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Monitor Service Metric Rule Template resource.

        For information about Cloud Monitor Service Metric Rule Template and how to use it, see [What is Metric Rule Template](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createmetricruletemplate).

        > **NOTE:** Available since v1.134.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        example = alicloud.cms.MetricRuleTemplate("example",
            metric_rule_template_name=name,
            alert_templates=[{
                "category": "ecs",
                "metric_name": "cpu_total",
                "namespace": "acs_ecs_dashboard",
                "rule_name": "tf_example",
                "escalations": {
                    "critical": {
                        "comparison_operator": "GreaterThanThreshold",
                        "statistics": "Average",
                        "threshold": "90",
                        "times": "3",
                    },
                },
            }])
        ```

        ## Import

        Cloud Monitor Service Metric Rule Template can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cms/metricRuleTemplate:MetricRuleTemplate example <id>
        ```

        :param str resource_name: The name of the resource.
        :param MetricRuleTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MetricRuleTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_templates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MetricRuleTemplateAlertTemplateArgs', 'MetricRuleTemplateAlertTemplateArgsDict']]]]] = None,
                 apply_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_end_time: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_start_time: Optional[pulumi.Input[_builtins.str]] = None,
                 group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metric_rule_template_name: Optional[pulumi.Input[_builtins.str]] = None,
                 notify_level: Optional[pulumi.Input[_builtins.str]] = None,
                 silence_time: Optional[pulumi.Input[_builtins.int]] = None,
                 webhook: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MetricRuleTemplateArgs.__new__(MetricRuleTemplateArgs)

            __props__.__dict__["alert_templates"] = alert_templates
            __props__.__dict__["apply_mode"] = apply_mode
            __props__.__dict__["description"] = description
            __props__.__dict__["enable_end_time"] = enable_end_time
            __props__.__dict__["enable_start_time"] = enable_start_time
            __props__.__dict__["group_id"] = group_id
            if metric_rule_template_name is None and not opts.urn:
                raise TypeError("Missing required property 'metric_rule_template_name'")
            __props__.__dict__["metric_rule_template_name"] = metric_rule_template_name
            __props__.__dict__["notify_level"] = notify_level
            __props__.__dict__["silence_time"] = silence_time
            __props__.__dict__["webhook"] = webhook
            __props__.__dict__["rest_version"] = None
        super(MetricRuleTemplate, __self__).__init__(
            'alicloud:cms/metricRuleTemplate:MetricRuleTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alert_templates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MetricRuleTemplateAlertTemplateArgs', 'MetricRuleTemplateAlertTemplateArgsDict']]]]] = None,
            apply_mode: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            enable_end_time: Optional[pulumi.Input[_builtins.str]] = None,
            enable_start_time: Optional[pulumi.Input[_builtins.str]] = None,
            group_id: Optional[pulumi.Input[_builtins.str]] = None,
            metric_rule_template_name: Optional[pulumi.Input[_builtins.str]] = None,
            notify_level: Optional[pulumi.Input[_builtins.str]] = None,
            rest_version: Optional[pulumi.Input[_builtins.str]] = None,
            silence_time: Optional[pulumi.Input[_builtins.int]] = None,
            webhook: Optional[pulumi.Input[_builtins.str]] = None) -> 'MetricRuleTemplate':
        """
        Get an existing MetricRuleTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['MetricRuleTemplateAlertTemplateArgs', 'MetricRuleTemplateAlertTemplateArgsDict']]]] alert_templates: The details of alert rules that are generated based on the alert template. See `alert_templates` below.
        :param pulumi.Input[_builtins.str] apply_mode: The mode in which the alert template is applied. Valid values:
               - `GROUP_INSTANCE_FIRST`: The metrics in the application group take precedence.
               - `ALARM_TEMPLATE_FIRST `: The metrics specified in the alert template take precedence.
        :param pulumi.Input[_builtins.str] description: The description of the alert template.
        :param pulumi.Input[_builtins.str] enable_end_time: The end of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:59 and the value `23` indicates 23:59.
        :param pulumi.Input[_builtins.str] enable_start_time: The beginning of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:00 and the value `23` indicates 23:00.
        :param pulumi.Input[_builtins.str] group_id: The ID of the application group.
        :param pulumi.Input[_builtins.str] metric_rule_template_name: The name of the alert template.
        :param pulumi.Input[_builtins.str] notify_level: The alert notification method. Valid values:
        :param pulumi.Input[_builtins.str] rest_version: The version of the alert template.
        :param pulumi.Input[_builtins.int] silence_time: The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: `86400`. Valid values: `0` to `86400`.
        :param pulumi.Input[_builtins.str] webhook: The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MetricRuleTemplateState.__new__(_MetricRuleTemplateState)

        __props__.__dict__["alert_templates"] = alert_templates
        __props__.__dict__["apply_mode"] = apply_mode
        __props__.__dict__["description"] = description
        __props__.__dict__["enable_end_time"] = enable_end_time
        __props__.__dict__["enable_start_time"] = enable_start_time
        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["metric_rule_template_name"] = metric_rule_template_name
        __props__.__dict__["notify_level"] = notify_level
        __props__.__dict__["rest_version"] = rest_version
        __props__.__dict__["silence_time"] = silence_time
        __props__.__dict__["webhook"] = webhook
        return MetricRuleTemplate(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="alertTemplates")
    def alert_templates(self) -> pulumi.Output[Optional[Sequence['outputs.MetricRuleTemplateAlertTemplate']]]:
        """
        The details of alert rules that are generated based on the alert template. See `alert_templates` below.
        """
        return pulumi.get(self, "alert_templates")

    @_builtins.property
    @pulumi.getter(name="applyMode")
    def apply_mode(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The mode in which the alert template is applied. Valid values:
        - `GROUP_INSTANCE_FIRST`: The metrics in the application group take precedence.
        - `ALARM_TEMPLATE_FIRST `: The metrics specified in the alert template take precedence.
        """
        return pulumi.get(self, "apply_mode")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the alert template.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="enableEndTime")
    def enable_end_time(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The end of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:59 and the value `23` indicates 23:59.
        """
        return pulumi.get(self, "enable_end_time")

    @_builtins.property
    @pulumi.getter(name="enableStartTime")
    def enable_start_time(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The beginning of the time period during which the alert rule is effective. Valid values: `00` to `23`. The value `00` indicates 00:00 and the value `23` indicates 23:00.
        """
        return pulumi.get(self, "enable_start_time")

    @_builtins.property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The ID of the application group.
        """
        return pulumi.get(self, "group_id")

    @_builtins.property
    @pulumi.getter(name="metricRuleTemplateName")
    def metric_rule_template_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the alert template.
        """
        return pulumi.get(self, "metric_rule_template_name")

    @_builtins.property
    @pulumi.getter(name="notifyLevel")
    def notify_level(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The alert notification method. Valid values:
        """
        return pulumi.get(self, "notify_level")

    @_builtins.property
    @pulumi.getter(name="restVersion")
    def rest_version(self) -> pulumi.Output[_builtins.str]:
        """
        The version of the alert template.
        """
        return pulumi.get(self, "rest_version")

    @_builtins.property
    @pulumi.getter(name="silenceTime")
    def silence_time(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: `86400`. Valid values: `0` to `86400`.
        """
        return pulumi.get(self, "silence_time")

    @_builtins.property
    @pulumi.getter
    def webhook(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
        """
        return pulumi.get(self, "webhook")

