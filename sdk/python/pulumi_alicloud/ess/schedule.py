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

__all__ = ['ScheduleArgs', 'Schedule']

@pulumi.input_type
class ScheduleArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 desired_capacity: Optional[pulumi.Input[_builtins.int]] = None,
                 launch_expiration_time: Optional[pulumi.Input[_builtins.int]] = None,
                 launch_time: Optional[pulumi.Input[_builtins.str]] = None,
                 max_value: Optional[pulumi.Input[_builtins.int]] = None,
                 min_value: Optional[pulumi.Input[_builtins.int]] = None,
                 recurrence_end_time: Optional[pulumi.Input[_builtins.str]] = None,
                 recurrence_type: Optional[pulumi.Input[_builtins.str]] = None,
                 recurrence_value: Optional[pulumi.Input[_builtins.str]] = None,
                 scaling_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scheduled_action: Optional[pulumi.Input[_builtins.str]] = None,
                 scheduled_task_name: Optional[pulumi.Input[_builtins.str]] = None,
                 task_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a Schedule resource.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if desired_capacity is not None:
            pulumi.set(__self__, "desired_capacity", desired_capacity)
        if launch_expiration_time is not None:
            pulumi.set(__self__, "launch_expiration_time", launch_expiration_time)
        if launch_time is not None:
            pulumi.set(__self__, "launch_time", launch_time)
        if max_value is not None:
            pulumi.set(__self__, "max_value", max_value)
        if min_value is not None:
            pulumi.set(__self__, "min_value", min_value)
        if recurrence_end_time is not None:
            pulumi.set(__self__, "recurrence_end_time", recurrence_end_time)
        if recurrence_type is not None:
            pulumi.set(__self__, "recurrence_type", recurrence_type)
        if recurrence_value is not None:
            pulumi.set(__self__, "recurrence_value", recurrence_value)
        if scaling_group_id is not None:
            pulumi.set(__self__, "scaling_group_id", scaling_group_id)
        if scheduled_action is not None:
            pulumi.set(__self__, "scheduled_action", scheduled_action)
        if scheduled_task_name is not None:
            pulumi.set(__self__, "scheduled_task_name", scheduled_task_name)
        if task_enabled is not None:
            pulumi.set(__self__, "task_enabled", task_enabled)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "desired_capacity", value)

    @_builtins.property
    @pulumi.getter(name="launchExpirationTime")
    def launch_expiration_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "launch_expiration_time")

    @launch_expiration_time.setter
    def launch_expiration_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "launch_expiration_time", value)

    @_builtins.property
    @pulumi.getter(name="launchTime")
    def launch_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "launch_time")

    @launch_time.setter
    def launch_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "launch_time", value)

    @_builtins.property
    @pulumi.getter(name="maxValue")
    def max_value(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "max_value")

    @max_value.setter
    def max_value(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "max_value", value)

    @_builtins.property
    @pulumi.getter(name="minValue")
    def min_value(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "min_value")

    @min_value.setter
    def min_value(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "min_value", value)

    @_builtins.property
    @pulumi.getter(name="recurrenceEndTime")
    def recurrence_end_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "recurrence_end_time")

    @recurrence_end_time.setter
    def recurrence_end_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recurrence_end_time", value)

    @_builtins.property
    @pulumi.getter(name="recurrenceType")
    def recurrence_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "recurrence_type")

    @recurrence_type.setter
    def recurrence_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recurrence_type", value)

    @_builtins.property
    @pulumi.getter(name="recurrenceValue")
    def recurrence_value(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "recurrence_value")

    @recurrence_value.setter
    def recurrence_value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recurrence_value", value)

    @_builtins.property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "scaling_group_id")

    @scaling_group_id.setter
    def scaling_group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scaling_group_id", value)

    @_builtins.property
    @pulumi.getter(name="scheduledAction")
    def scheduled_action(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "scheduled_action")

    @scheduled_action.setter
    def scheduled_action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scheduled_action", value)

    @_builtins.property
    @pulumi.getter(name="scheduledTaskName")
    def scheduled_task_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "scheduled_task_name")

    @scheduled_task_name.setter
    def scheduled_task_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scheduled_task_name", value)

    @_builtins.property
    @pulumi.getter(name="taskEnabled")
    def task_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "task_enabled")

    @task_enabled.setter
    def task_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "task_enabled", value)


@pulumi.input_type
class _ScheduleState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 desired_capacity: Optional[pulumi.Input[_builtins.int]] = None,
                 launch_expiration_time: Optional[pulumi.Input[_builtins.int]] = None,
                 launch_time: Optional[pulumi.Input[_builtins.str]] = None,
                 max_value: Optional[pulumi.Input[_builtins.int]] = None,
                 min_value: Optional[pulumi.Input[_builtins.int]] = None,
                 recurrence_end_time: Optional[pulumi.Input[_builtins.str]] = None,
                 recurrence_type: Optional[pulumi.Input[_builtins.str]] = None,
                 recurrence_value: Optional[pulumi.Input[_builtins.str]] = None,
                 scaling_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scheduled_action: Optional[pulumi.Input[_builtins.str]] = None,
                 scheduled_task_name: Optional[pulumi.Input[_builtins.str]] = None,
                 task_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        Input properties used for looking up and filtering Schedule resources.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if desired_capacity is not None:
            pulumi.set(__self__, "desired_capacity", desired_capacity)
        if launch_expiration_time is not None:
            pulumi.set(__self__, "launch_expiration_time", launch_expiration_time)
        if launch_time is not None:
            pulumi.set(__self__, "launch_time", launch_time)
        if max_value is not None:
            pulumi.set(__self__, "max_value", max_value)
        if min_value is not None:
            pulumi.set(__self__, "min_value", min_value)
        if recurrence_end_time is not None:
            pulumi.set(__self__, "recurrence_end_time", recurrence_end_time)
        if recurrence_type is not None:
            pulumi.set(__self__, "recurrence_type", recurrence_type)
        if recurrence_value is not None:
            pulumi.set(__self__, "recurrence_value", recurrence_value)
        if scaling_group_id is not None:
            pulumi.set(__self__, "scaling_group_id", scaling_group_id)
        if scheduled_action is not None:
            pulumi.set(__self__, "scheduled_action", scheduled_action)
        if scheduled_task_name is not None:
            pulumi.set(__self__, "scheduled_task_name", scheduled_task_name)
        if task_enabled is not None:
            pulumi.set(__self__, "task_enabled", task_enabled)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "desired_capacity", value)

    @_builtins.property
    @pulumi.getter(name="launchExpirationTime")
    def launch_expiration_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "launch_expiration_time")

    @launch_expiration_time.setter
    def launch_expiration_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "launch_expiration_time", value)

    @_builtins.property
    @pulumi.getter(name="launchTime")
    def launch_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "launch_time")

    @launch_time.setter
    def launch_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "launch_time", value)

    @_builtins.property
    @pulumi.getter(name="maxValue")
    def max_value(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "max_value")

    @max_value.setter
    def max_value(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "max_value", value)

    @_builtins.property
    @pulumi.getter(name="minValue")
    def min_value(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "min_value")

    @min_value.setter
    def min_value(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "min_value", value)

    @_builtins.property
    @pulumi.getter(name="recurrenceEndTime")
    def recurrence_end_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "recurrence_end_time")

    @recurrence_end_time.setter
    def recurrence_end_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recurrence_end_time", value)

    @_builtins.property
    @pulumi.getter(name="recurrenceType")
    def recurrence_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "recurrence_type")

    @recurrence_type.setter
    def recurrence_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recurrence_type", value)

    @_builtins.property
    @pulumi.getter(name="recurrenceValue")
    def recurrence_value(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "recurrence_value")

    @recurrence_value.setter
    def recurrence_value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recurrence_value", value)

    @_builtins.property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "scaling_group_id")

    @scaling_group_id.setter
    def scaling_group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scaling_group_id", value)

    @_builtins.property
    @pulumi.getter(name="scheduledAction")
    def scheduled_action(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "scheduled_action")

    @scheduled_action.setter
    def scheduled_action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scheduled_action", value)

    @_builtins.property
    @pulumi.getter(name="scheduledTaskName")
    def scheduled_task_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "scheduled_task_name")

    @scheduled_task_name.setter
    def scheduled_task_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scheduled_task_name", value)

    @_builtins.property
    @pulumi.getter(name="taskEnabled")
    def task_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "task_enabled")

    @task_enabled.setter
    def task_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "task_enabled", value)


@pulumi.type_token("alicloud:ess/schedule:Schedule")
class Schedule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 desired_capacity: Optional[pulumi.Input[_builtins.int]] = None,
                 launch_expiration_time: Optional[pulumi.Input[_builtins.int]] = None,
                 launch_time: Optional[pulumi.Input[_builtins.str]] = None,
                 max_value: Optional[pulumi.Input[_builtins.int]] = None,
                 min_value: Optional[pulumi.Input[_builtins.int]] = None,
                 recurrence_end_time: Optional[pulumi.Input[_builtins.str]] = None,
                 recurrence_type: Optional[pulumi.Input[_builtins.str]] = None,
                 recurrence_value: Optional[pulumi.Input[_builtins.str]] = None,
                 scaling_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scheduled_action: Optional[pulumi.Input[_builtins.str]] = None,
                 scheduled_task_name: Optional[pulumi.Input[_builtins.str]] = None,
                 task_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        """
        > **NOTE:** This resource has been deprecated from v1.45.0. New resource `ess.ScheduledTask` will replace.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ScheduleArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **NOTE:** This resource has been deprecated from v1.45.0. New resource `ess.ScheduledTask` will replace.

        :param str resource_name: The name of the resource.
        :param ScheduleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScheduleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 desired_capacity: Optional[pulumi.Input[_builtins.int]] = None,
                 launch_expiration_time: Optional[pulumi.Input[_builtins.int]] = None,
                 launch_time: Optional[pulumi.Input[_builtins.str]] = None,
                 max_value: Optional[pulumi.Input[_builtins.int]] = None,
                 min_value: Optional[pulumi.Input[_builtins.int]] = None,
                 recurrence_end_time: Optional[pulumi.Input[_builtins.str]] = None,
                 recurrence_type: Optional[pulumi.Input[_builtins.str]] = None,
                 recurrence_value: Optional[pulumi.Input[_builtins.str]] = None,
                 scaling_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scheduled_action: Optional[pulumi.Input[_builtins.str]] = None,
                 scheduled_task_name: Optional[pulumi.Input[_builtins.str]] = None,
                 task_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScheduleArgs.__new__(ScheduleArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["desired_capacity"] = desired_capacity
            __props__.__dict__["launch_expiration_time"] = launch_expiration_time
            __props__.__dict__["launch_time"] = launch_time
            __props__.__dict__["max_value"] = max_value
            __props__.__dict__["min_value"] = min_value
            __props__.__dict__["recurrence_end_time"] = recurrence_end_time
            __props__.__dict__["recurrence_type"] = recurrence_type
            __props__.__dict__["recurrence_value"] = recurrence_value
            __props__.__dict__["scaling_group_id"] = scaling_group_id
            __props__.__dict__["scheduled_action"] = scheduled_action
            __props__.__dict__["scheduled_task_name"] = scheduled_task_name
            __props__.__dict__["task_enabled"] = task_enabled
        super(Schedule, __self__).__init__(
            'alicloud:ess/schedule:Schedule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            desired_capacity: Optional[pulumi.Input[_builtins.int]] = None,
            launch_expiration_time: Optional[pulumi.Input[_builtins.int]] = None,
            launch_time: Optional[pulumi.Input[_builtins.str]] = None,
            max_value: Optional[pulumi.Input[_builtins.int]] = None,
            min_value: Optional[pulumi.Input[_builtins.int]] = None,
            recurrence_end_time: Optional[pulumi.Input[_builtins.str]] = None,
            recurrence_type: Optional[pulumi.Input[_builtins.str]] = None,
            recurrence_value: Optional[pulumi.Input[_builtins.str]] = None,
            scaling_group_id: Optional[pulumi.Input[_builtins.str]] = None,
            scheduled_action: Optional[pulumi.Input[_builtins.str]] = None,
            scheduled_task_name: Optional[pulumi.Input[_builtins.str]] = None,
            task_enabled: Optional[pulumi.Input[_builtins.bool]] = None) -> 'Schedule':
        """
        Get an existing Schedule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScheduleState.__new__(_ScheduleState)

        __props__.__dict__["description"] = description
        __props__.__dict__["desired_capacity"] = desired_capacity
        __props__.__dict__["launch_expiration_time"] = launch_expiration_time
        __props__.__dict__["launch_time"] = launch_time
        __props__.__dict__["max_value"] = max_value
        __props__.__dict__["min_value"] = min_value
        __props__.__dict__["recurrence_end_time"] = recurrence_end_time
        __props__.__dict__["recurrence_type"] = recurrence_type
        __props__.__dict__["recurrence_value"] = recurrence_value
        __props__.__dict__["scaling_group_id"] = scaling_group_id
        __props__.__dict__["scheduled_action"] = scheduled_action
        __props__.__dict__["scheduled_task_name"] = scheduled_task_name
        __props__.__dict__["task_enabled"] = task_enabled
        return Schedule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> pulumi.Output[Optional[_builtins.int]]:
        return pulumi.get(self, "desired_capacity")

    @_builtins.property
    @pulumi.getter(name="launchExpirationTime")
    def launch_expiration_time(self) -> pulumi.Output[Optional[_builtins.int]]:
        return pulumi.get(self, "launch_expiration_time")

    @_builtins.property
    @pulumi.getter(name="launchTime")
    def launch_time(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "launch_time")

    @_builtins.property
    @pulumi.getter(name="maxValue")
    def max_value(self) -> pulumi.Output[Optional[_builtins.int]]:
        return pulumi.get(self, "max_value")

    @_builtins.property
    @pulumi.getter(name="minValue")
    def min_value(self) -> pulumi.Output[Optional[_builtins.int]]:
        return pulumi.get(self, "min_value")

    @_builtins.property
    @pulumi.getter(name="recurrenceEndTime")
    def recurrence_end_time(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "recurrence_end_time")

    @_builtins.property
    @pulumi.getter(name="recurrenceType")
    def recurrence_type(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "recurrence_type")

    @_builtins.property
    @pulumi.getter(name="recurrenceValue")
    def recurrence_value(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "recurrence_value")

    @_builtins.property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "scaling_group_id")

    @_builtins.property
    @pulumi.getter(name="scheduledAction")
    def scheduled_action(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "scheduled_action")

    @_builtins.property
    @pulumi.getter(name="scheduledTaskName")
    def scheduled_task_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "scheduled_task_name")

    @_builtins.property
    @pulumi.getter(name="taskEnabled")
    def task_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        return pulumi.get(self, "task_enabled")

