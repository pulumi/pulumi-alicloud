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
    'GetExecutionsExecutionResult',
    'GetFlowsFlowResult',
    'GetSchedulesScheduleResult',
]

@pulumi.output_type
class GetExecutionsExecutionResult(dict):
    def __init__(__self__, *,
                 execution_name: _builtins.str,
                 flow_name: _builtins.str,
                 id: _builtins.str,
                 input: _builtins.str,
                 output: _builtins.str,
                 started_time: _builtins.str,
                 status: _builtins.str,
                 stopped_time: _builtins.str):
        """
        :param _builtins.str execution_name: The name of the execution.
        :param _builtins.str flow_name: The name of the flow.
        :param _builtins.str id: The ID of the Execution. The value formats as `<flow_name>:<execution_name>`.
        :param _builtins.str input: The Input information for this execution.
        :param _builtins.str output: The output of the execution.
        :param _builtins.str started_time: The started time of the execution.
        :param _builtins.str status: The status of the resource.
        :param _builtins.str stopped_time: The stopped time of the execution.
        """
        pulumi.set(__self__, "execution_name", execution_name)
        pulumi.set(__self__, "flow_name", flow_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "input", input)
        pulumi.set(__self__, "output", output)
        pulumi.set(__self__, "started_time", started_time)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "stopped_time", stopped_time)

    @_builtins.property
    @pulumi.getter(name="executionName")
    def execution_name(self) -> _builtins.str:
        """
        The name of the execution.
        """
        return pulumi.get(self, "execution_name")

    @_builtins.property
    @pulumi.getter(name="flowName")
    def flow_name(self) -> _builtins.str:
        """
        The name of the flow.
        """
        return pulumi.get(self, "flow_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Execution. The value formats as `<flow_name>:<execution_name>`.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def input(self) -> _builtins.str:
        """
        The Input information for this execution.
        """
        return pulumi.get(self, "input")

    @_builtins.property
    @pulumi.getter
    def output(self) -> _builtins.str:
        """
        The output of the execution.
        """
        return pulumi.get(self, "output")

    @_builtins.property
    @pulumi.getter(name="startedTime")
    def started_time(self) -> _builtins.str:
        """
        The started time of the execution.
        """
        return pulumi.get(self, "started_time")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="stoppedTime")
    def stopped_time(self) -> _builtins.str:
        """
        The stopped time of the execution.
        """
        return pulumi.get(self, "stopped_time")


@pulumi.output_type
class GetFlowsFlowResult(dict):
    def __init__(__self__, *,
                 definition: _builtins.str,
                 description: _builtins.str,
                 flow_id: _builtins.str,
                 id: _builtins.str,
                 last_modified_time: _builtins.str,
                 name: _builtins.str,
                 role_arn: _builtins.str,
                 type: _builtins.str):
        """
        :param _builtins.str definition: The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        :param _builtins.str description: The description of the flow.
        :param _builtins.str flow_id: The unique ID of the flow.
        :param _builtins.str id: The ID of the Flow.
        :param _builtins.str last_modified_time: The time when the flow was last modified.
        :param _builtins.str name: The name of the flow. The name must be unique in an Alibaba Cloud account.
        :param _builtins.str role_arn: The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        :param _builtins.str type: The type of the flow. Set the value to `FDL`.
        """
        pulumi.set(__self__, "definition", definition)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "flow_id", flow_id)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "last_modified_time", last_modified_time)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def definition(self) -> _builtins.str:
        """
        The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        """
        return pulumi.get(self, "definition")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the flow.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="flowId")
    def flow_id(self) -> _builtins.str:
        """
        The unique ID of the flow.
        """
        return pulumi.get(self, "flow_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Flow.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> _builtins.str:
        """
        The time when the flow was last modified.
        """
        return pulumi.get(self, "last_modified_time")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the flow. The name must be unique in an Alibaba Cloud account.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> _builtins.str:
        """
        The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        """
        return pulumi.get(self, "role_arn")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The type of the flow. Set the value to `FDL`.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetSchedulesScheduleResult(dict):
    def __init__(__self__, *,
                 cron_expression: _builtins.str,
                 description: _builtins.str,
                 enable: _builtins.bool,
                 id: _builtins.str,
                 last_modified_time: _builtins.str,
                 payload: _builtins.str,
                 schedule_id: _builtins.str,
                 schedule_name: _builtins.str):
        """
        :param _builtins.str cron_expression: The CRON expression of the time-based schedule to be created.
        :param _builtins.str description: The description of the time-based schedule to be created.
        :param _builtins.bool enable: Specifies whether to enable the time-based schedule you want to create.
        :param _builtins.str id: The ID of the Schedule.
        :param _builtins.str last_modified_time: The time when the time-based schedule was last updated.
        :param _builtins.str payload: The trigger message of the time-based schedule to be created. It must be in JSON object format.
        :param _builtins.str schedule_id: The ID of the time-based schedule.
        :param _builtins.str schedule_name: The name of the time-based schedule to be created.
        """
        pulumi.set(__self__, "cron_expression", cron_expression)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "enable", enable)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "last_modified_time", last_modified_time)
        pulumi.set(__self__, "payload", payload)
        pulumi.set(__self__, "schedule_id", schedule_id)
        pulumi.set(__self__, "schedule_name", schedule_name)

    @_builtins.property
    @pulumi.getter(name="cronExpression")
    def cron_expression(self) -> _builtins.str:
        """
        The CRON expression of the time-based schedule to be created.
        """
        return pulumi.get(self, "cron_expression")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the time-based schedule to be created.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def enable(self) -> _builtins.bool:
        """
        Specifies whether to enable the time-based schedule you want to create.
        """
        return pulumi.get(self, "enable")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Schedule.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> _builtins.str:
        """
        The time when the time-based schedule was last updated.
        """
        return pulumi.get(self, "last_modified_time")

    @_builtins.property
    @pulumi.getter
    def payload(self) -> _builtins.str:
        """
        The trigger message of the time-based schedule to be created. It must be in JSON object format.
        """
        return pulumi.get(self, "payload")

    @_builtins.property
    @pulumi.getter(name="scheduleId")
    def schedule_id(self) -> _builtins.str:
        """
        The ID of the time-based schedule.
        """
        return pulumi.get(self, "schedule_id")

    @_builtins.property
    @pulumi.getter(name="scheduleName")
    def schedule_name(self) -> _builtins.str:
        """
        The name of the time-based schedule to be created.
        """
        return pulumi.get(self, "schedule_name")


