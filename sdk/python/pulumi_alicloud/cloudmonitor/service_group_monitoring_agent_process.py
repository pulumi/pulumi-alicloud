# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ServiceGroupMonitoringAgentProcessArgs', 'ServiceGroupMonitoringAgentProcess']

@pulumi.input_type
class ServiceGroupMonitoringAgentProcessArgs:
    def __init__(__self__, *,
                 alert_configs: pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]],
                 group_id: pulumi.Input[str],
                 process_name: pulumi.Input[str],
                 match_express_filter_relation: Optional[pulumi.Input[str]] = None,
                 match_expresses: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]] = None):
        """
        The set of arguments for constructing a ServiceGroupMonitoringAgentProcess resource.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]] alert_configs: The alert rule configurations. See `alert_config` below.
        :param pulumi.Input[str] group_id: The ID of the application group.
        :param pulumi.Input[str] process_name: The name of the process.
        :param pulumi.Input[str] match_express_filter_relation: The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]] match_expresses: The expressions used to match instances. See `match_express` below.
        """
        pulumi.set(__self__, "alert_configs", alert_configs)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "process_name", process_name)
        if match_express_filter_relation is not None:
            pulumi.set(__self__, "match_express_filter_relation", match_express_filter_relation)
        if match_expresses is not None:
            pulumi.set(__self__, "match_expresses", match_expresses)

    @property
    @pulumi.getter(name="alertConfigs")
    def alert_configs(self) -> pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]:
        """
        The alert rule configurations. See `alert_config` below.
        """
        return pulumi.get(self, "alert_configs")

    @alert_configs.setter
    def alert_configs(self, value: pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]):
        pulumi.set(self, "alert_configs", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        The ID of the application group.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="processName")
    def process_name(self) -> pulumi.Input[str]:
        """
        The name of the process.
        """
        return pulumi.get(self, "process_name")

    @process_name.setter
    def process_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "process_name", value)

    @property
    @pulumi.getter(name="matchExpressFilterRelation")
    def match_express_filter_relation(self) -> Optional[pulumi.Input[str]]:
        """
        The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
        """
        return pulumi.get(self, "match_express_filter_relation")

    @match_express_filter_relation.setter
    def match_express_filter_relation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_express_filter_relation", value)

    @property
    @pulumi.getter(name="matchExpresses")
    def match_expresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]]:
        """
        The expressions used to match instances. See `match_express` below.
        """
        return pulumi.get(self, "match_expresses")

    @match_expresses.setter
    def match_expresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]]):
        pulumi.set(self, "match_expresses", value)


@pulumi.input_type
class _ServiceGroupMonitoringAgentProcessState:
    def __init__(__self__, *,
                 alert_configs: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_monitoring_agent_process_id: Optional[pulumi.Input[str]] = None,
                 match_express_filter_relation: Optional[pulumi.Input[str]] = None,
                 match_expresses: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]] = None,
                 process_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceGroupMonitoringAgentProcess resources.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]] alert_configs: The alert rule configurations. See `alert_config` below.
        :param pulumi.Input[str] group_id: The ID of the application group.
        :param pulumi.Input[str] group_monitoring_agent_process_id: The ID of the Group Monitoring Agent Process.
        :param pulumi.Input[str] match_express_filter_relation: The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]] match_expresses: The expressions used to match instances. See `match_express` below.
        :param pulumi.Input[str] process_name: The name of the process.
        """
        if alert_configs is not None:
            pulumi.set(__self__, "alert_configs", alert_configs)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if group_monitoring_agent_process_id is not None:
            pulumi.set(__self__, "group_monitoring_agent_process_id", group_monitoring_agent_process_id)
        if match_express_filter_relation is not None:
            pulumi.set(__self__, "match_express_filter_relation", match_express_filter_relation)
        if match_expresses is not None:
            pulumi.set(__self__, "match_expresses", match_expresses)
        if process_name is not None:
            pulumi.set(__self__, "process_name", process_name)

    @property
    @pulumi.getter(name="alertConfigs")
    def alert_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]]:
        """
        The alert rule configurations. See `alert_config` below.
        """
        return pulumi.get(self, "alert_configs")

    @alert_configs.setter
    def alert_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]]):
        pulumi.set(self, "alert_configs", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the application group.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="groupMonitoringAgentProcessId")
    def group_monitoring_agent_process_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Group Monitoring Agent Process.
        """
        return pulumi.get(self, "group_monitoring_agent_process_id")

    @group_monitoring_agent_process_id.setter
    def group_monitoring_agent_process_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_monitoring_agent_process_id", value)

    @property
    @pulumi.getter(name="matchExpressFilterRelation")
    def match_express_filter_relation(self) -> Optional[pulumi.Input[str]]:
        """
        The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
        """
        return pulumi.get(self, "match_express_filter_relation")

    @match_express_filter_relation.setter
    def match_express_filter_relation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_express_filter_relation", value)

    @property
    @pulumi.getter(name="matchExpresses")
    def match_expresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]]:
        """
        The expressions used to match instances. See `match_express` below.
        """
        return pulumi.get(self, "match_expresses")

    @match_expresses.setter
    def match_expresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]]):
        pulumi.set(self, "match_expresses", value)

    @property
    @pulumi.getter(name="processName")
    def process_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the process.
        """
        return pulumi.get(self, "process_name")

    @process_name.setter
    def process_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "process_name", value)


class ServiceGroupMonitoringAgentProcess(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 match_express_filter_relation: Optional[pulumi.Input[str]] = None,
                 match_expresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]]] = None,
                 process_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud Monitor Service Group Monitoring Agent Process resource.

        For information about Cloud Monitor Service Group Monitoring Agent Process and how to use it, see [What is Group Monitoring Agent Process](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-creategroupmonitoringagentprocess).

        > **NOTE:** Available since v1.212.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.cms.AlarmContactGroup("default",
            alarm_contact_group_name=name,
            contacts=[
                "user",
                "user1",
                "user2",
            ])
        default_monitor_group = alicloud.cms.MonitorGroup("default",
            monitor_group_name=name,
            contact_groups=[default.id])
        default_service_group_monitoring_agent_process = alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcess("default",
            group_id=default_monitor_group.id,
            process_name=name,
            match_express_filter_relation="or",
            match_expresses=[alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcessMatchExpressArgs(
                name=name,
                value="*",
                function="all",
            )],
            alert_configs=[alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcessAlertConfigArgs(
                escalations_level="critical",
                comparison_operator="GreaterThanOrEqualToThreshold",
                statistics="Average",
                threshold="20",
                times="100",
                effective_interval="00:00-22:59",
                silence_time=85800,
                webhook="https://www.aliyun.com",
                target_lists=[alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs(
                    target_list_id="1",
                    json_params="{}",
                    level="WARN",
                    arn="acs:mns:cn-hangzhou:120886317861****:/queues/test123/message",
                )],
            )])
        ```

        ## Import

        Cloud Monitor Service Group Monitoring Agent Process can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cloudmonitor/serviceGroupMonitoringAgentProcess:ServiceGroupMonitoringAgentProcess example <group_id>:<group_monitoring_agent_process_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]] alert_configs: The alert rule configurations. See `alert_config` below.
        :param pulumi.Input[str] group_id: The ID of the application group.
        :param pulumi.Input[str] match_express_filter_relation: The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]] match_expresses: The expressions used to match instances. See `match_express` below.
        :param pulumi.Input[str] process_name: The name of the process.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceGroupMonitoringAgentProcessArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Monitor Service Group Monitoring Agent Process resource.

        For information about Cloud Monitor Service Group Monitoring Agent Process and how to use it, see [What is Group Monitoring Agent Process](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-creategroupmonitoringagentprocess).

        > **NOTE:** Available since v1.212.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.cms.AlarmContactGroup("default",
            alarm_contact_group_name=name,
            contacts=[
                "user",
                "user1",
                "user2",
            ])
        default_monitor_group = alicloud.cms.MonitorGroup("default",
            monitor_group_name=name,
            contact_groups=[default.id])
        default_service_group_monitoring_agent_process = alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcess("default",
            group_id=default_monitor_group.id,
            process_name=name,
            match_express_filter_relation="or",
            match_expresses=[alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcessMatchExpressArgs(
                name=name,
                value="*",
                function="all",
            )],
            alert_configs=[alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcessAlertConfigArgs(
                escalations_level="critical",
                comparison_operator="GreaterThanOrEqualToThreshold",
                statistics="Average",
                threshold="20",
                times="100",
                effective_interval="00:00-22:59",
                silence_time=85800,
                webhook="https://www.aliyun.com",
                target_lists=[alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs(
                    target_list_id="1",
                    json_params="{}",
                    level="WARN",
                    arn="acs:mns:cn-hangzhou:120886317861****:/queues/test123/message",
                )],
            )])
        ```

        ## Import

        Cloud Monitor Service Group Monitoring Agent Process can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cloudmonitor/serviceGroupMonitoringAgentProcess:ServiceGroupMonitoringAgentProcess example <group_id>:<group_monitoring_agent_process_id>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceGroupMonitoringAgentProcessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceGroupMonitoringAgentProcessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 match_express_filter_relation: Optional[pulumi.Input[str]] = None,
                 match_expresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]]] = None,
                 process_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceGroupMonitoringAgentProcessArgs.__new__(ServiceGroupMonitoringAgentProcessArgs)

            if alert_configs is None and not opts.urn:
                raise TypeError("Missing required property 'alert_configs'")
            __props__.__dict__["alert_configs"] = alert_configs
            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            __props__.__dict__["match_express_filter_relation"] = match_express_filter_relation
            __props__.__dict__["match_expresses"] = match_expresses
            if process_name is None and not opts.urn:
                raise TypeError("Missing required property 'process_name'")
            __props__.__dict__["process_name"] = process_name
            __props__.__dict__["group_monitoring_agent_process_id"] = None
        super(ServiceGroupMonitoringAgentProcess, __self__).__init__(
            'alicloud:cloudmonitor/serviceGroupMonitoringAgentProcess:ServiceGroupMonitoringAgentProcess',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alert_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            group_monitoring_agent_process_id: Optional[pulumi.Input[str]] = None,
            match_express_filter_relation: Optional[pulumi.Input[str]] = None,
            match_expresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]]] = None,
            process_name: Optional[pulumi.Input[str]] = None) -> 'ServiceGroupMonitoringAgentProcess':
        """
        Get an existing ServiceGroupMonitoringAgentProcess resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessAlertConfigArgs']]]] alert_configs: The alert rule configurations. See `alert_config` below.
        :param pulumi.Input[str] group_id: The ID of the application group.
        :param pulumi.Input[str] group_monitoring_agent_process_id: The ID of the Group Monitoring Agent Process.
        :param pulumi.Input[str] match_express_filter_relation: The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceGroupMonitoringAgentProcessMatchExpressArgs']]]] match_expresses: The expressions used to match instances. See `match_express` below.
        :param pulumi.Input[str] process_name: The name of the process.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceGroupMonitoringAgentProcessState.__new__(_ServiceGroupMonitoringAgentProcessState)

        __props__.__dict__["alert_configs"] = alert_configs
        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["group_monitoring_agent_process_id"] = group_monitoring_agent_process_id
        __props__.__dict__["match_express_filter_relation"] = match_express_filter_relation
        __props__.__dict__["match_expresses"] = match_expresses
        __props__.__dict__["process_name"] = process_name
        return ServiceGroupMonitoringAgentProcess(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alertConfigs")
    def alert_configs(self) -> pulumi.Output[Sequence['outputs.ServiceGroupMonitoringAgentProcessAlertConfig']]:
        """
        The alert rule configurations. See `alert_config` below.
        """
        return pulumi.get(self, "alert_configs")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The ID of the application group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupMonitoringAgentProcessId")
    def group_monitoring_agent_process_id(self) -> pulumi.Output[str]:
        """
        The ID of the Group Monitoring Agent Process.
        """
        return pulumi.get(self, "group_monitoring_agent_process_id")

    @property
    @pulumi.getter(name="matchExpressFilterRelation")
    def match_express_filter_relation(self) -> pulumi.Output[str]:
        """
        The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
        """
        return pulumi.get(self, "match_express_filter_relation")

    @property
    @pulumi.getter(name="matchExpresses")
    def match_expresses(self) -> pulumi.Output[Sequence['outputs.ServiceGroupMonitoringAgentProcessMatchExpress']]:
        """
        The expressions used to match instances. See `match_express` below.
        """
        return pulumi.get(self, "match_expresses")

    @property
    @pulumi.getter(name="processName")
    def process_name(self) -> pulumi.Output[str]:
        """
        The name of the process.
        """
        return pulumi.get(self, "process_name")
