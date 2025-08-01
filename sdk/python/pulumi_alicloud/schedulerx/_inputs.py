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
    'JobJobMonitorInfoArgs',
    'JobJobMonitorInfoArgsDict',
    'JobJobMonitorInfoContactInfoArgs',
    'JobJobMonitorInfoContactInfoArgsDict',
    'JobJobMonitorInfoMonitorConfigArgs',
    'JobJobMonitorInfoMonitorConfigArgsDict',
    'JobMapTaskXattrsArgs',
    'JobMapTaskXattrsArgsDict',
    'JobTimeConfigArgs',
    'JobTimeConfigArgsDict',
]

MYPY = False

if not MYPY:
    class JobJobMonitorInfoArgsDict(TypedDict):
        contact_infos: NotRequired[pulumi.Input[Sequence[pulumi.Input['JobJobMonitorInfoContactInfoArgsDict']]]]
        """
        Contact information. See `contact_info` below.
        """
        monitor_config: NotRequired[pulumi.Input['JobJobMonitorInfoMonitorConfigArgsDict']]
        """
        Alarm switch and threshold configuration. See `monitor_config` below.
        """
elif False:
    JobJobMonitorInfoArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class JobJobMonitorInfoArgs:
    def __init__(__self__, *,
                 contact_infos: Optional[pulumi.Input[Sequence[pulumi.Input['JobJobMonitorInfoContactInfoArgs']]]] = None,
                 monitor_config: Optional[pulumi.Input['JobJobMonitorInfoMonitorConfigArgs']] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['JobJobMonitorInfoContactInfoArgs']]] contact_infos: Contact information. See `contact_info` below.
        :param pulumi.Input['JobJobMonitorInfoMonitorConfigArgs'] monitor_config: Alarm switch and threshold configuration. See `monitor_config` below.
        """
        if contact_infos is not None:
            pulumi.set(__self__, "contact_infos", contact_infos)
        if monitor_config is not None:
            pulumi.set(__self__, "monitor_config", monitor_config)

    @_builtins.property
    @pulumi.getter(name="contactInfos")
    def contact_infos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['JobJobMonitorInfoContactInfoArgs']]]]:
        """
        Contact information. See `contact_info` below.
        """
        return pulumi.get(self, "contact_infos")

    @contact_infos.setter
    def contact_infos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['JobJobMonitorInfoContactInfoArgs']]]]):
        pulumi.set(self, "contact_infos", value)

    @_builtins.property
    @pulumi.getter(name="monitorConfig")
    def monitor_config(self) -> Optional[pulumi.Input['JobJobMonitorInfoMonitorConfigArgs']]:
        """
        Alarm switch and threshold configuration. See `monitor_config` below.
        """
        return pulumi.get(self, "monitor_config")

    @monitor_config.setter
    def monitor_config(self, value: Optional[pulumi.Input['JobJobMonitorInfoMonitorConfigArgs']]):
        pulumi.set(self, "monitor_config", value)


if not MYPY:
    class JobJobMonitorInfoContactInfoArgsDict(TypedDict):
        ding: NotRequired[pulumi.Input[_builtins.str]]
        """
        DingTalk swarm robot webhook address
        """
        user_mail: NotRequired[pulumi.Input[_builtins.str]]
        """
        User Email Address
        """
        user_name: NotRequired[pulumi.Input[_builtins.str]]
        """
        The user name
        """
        user_phone: NotRequired[pulumi.Input[_builtins.str]]
        """
        The user's mobile phone number
        """
elif False:
    JobJobMonitorInfoContactInfoArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class JobJobMonitorInfoContactInfoArgs:
    def __init__(__self__, *,
                 ding: Optional[pulumi.Input[_builtins.str]] = None,
                 user_mail: Optional[pulumi.Input[_builtins.str]] = None,
                 user_name: Optional[pulumi.Input[_builtins.str]] = None,
                 user_phone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] ding: DingTalk swarm robot webhook address
        :param pulumi.Input[_builtins.str] user_mail: User Email Address
        :param pulumi.Input[_builtins.str] user_name: The user name
        :param pulumi.Input[_builtins.str] user_phone: The user's mobile phone number
        """
        if ding is not None:
            pulumi.set(__self__, "ding", ding)
        if user_mail is not None:
            pulumi.set(__self__, "user_mail", user_mail)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)
        if user_phone is not None:
            pulumi.set(__self__, "user_phone", user_phone)

    @_builtins.property
    @pulumi.getter
    def ding(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        DingTalk swarm robot webhook address
        """
        return pulumi.get(self, "ding")

    @ding.setter
    def ding(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ding", value)

    @_builtins.property
    @pulumi.getter(name="userMail")
    def user_mail(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User Email Address
        """
        return pulumi.get(self, "user_mail")

    @user_mail.setter
    def user_mail(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_mail", value)

    @_builtins.property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The user name
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_name", value)

    @_builtins.property
    @pulumi.getter(name="userPhone")
    def user_phone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The user's mobile phone number
        """
        return pulumi.get(self, "user_phone")

    @user_phone.setter
    def user_phone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_phone", value)


if not MYPY:
    class JobJobMonitorInfoMonitorConfigArgsDict(TypedDict):
        fail_enable: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enable failure alarm
        """
        miss_worker_enable: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether no available Machine alarm is on
        """
        send_channel: NotRequired[pulumi.Input[_builtins.str]]
        """
        Alarm sending form
        - sms: sms alarm
        - phone: phone alarm
        - mail: mail alarm
        - webhook:webhook alarm
        """
        timeout: NotRequired[pulumi.Input[_builtins.int]]
        """
        Timeout threshold, unit s, default 7200.
        """
        timeout_enable: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Time-out alarm switch. The values are as follows:
        """
        timeout_kill_enable: NotRequired[pulumi.Input[_builtins.bool]]
        """
        The trigger switch is terminated by timeout and is turned off by default.
        """
elif False:
    JobJobMonitorInfoMonitorConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class JobJobMonitorInfoMonitorConfigArgs:
    def __init__(__self__, *,
                 fail_enable: Optional[pulumi.Input[_builtins.bool]] = None,
                 miss_worker_enable: Optional[pulumi.Input[_builtins.bool]] = None,
                 send_channel: Optional[pulumi.Input[_builtins.str]] = None,
                 timeout: Optional[pulumi.Input[_builtins.int]] = None,
                 timeout_enable: Optional[pulumi.Input[_builtins.bool]] = None,
                 timeout_kill_enable: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.bool] fail_enable: Enable failure alarm
        :param pulumi.Input[_builtins.bool] miss_worker_enable: Whether no available Machine alarm is on
        :param pulumi.Input[_builtins.str] send_channel: Alarm sending form
               - sms: sms alarm
               - phone: phone alarm
               - mail: mail alarm
               - webhook:webhook alarm
        :param pulumi.Input[_builtins.int] timeout: Timeout threshold, unit s, default 7200.
        :param pulumi.Input[_builtins.bool] timeout_enable: Time-out alarm switch. The values are as follows:
        :param pulumi.Input[_builtins.bool] timeout_kill_enable: The trigger switch is terminated by timeout and is turned off by default.
        """
        if fail_enable is not None:
            pulumi.set(__self__, "fail_enable", fail_enable)
        if miss_worker_enable is not None:
            pulumi.set(__self__, "miss_worker_enable", miss_worker_enable)
        if send_channel is not None:
            pulumi.set(__self__, "send_channel", send_channel)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)
        if timeout_enable is not None:
            pulumi.set(__self__, "timeout_enable", timeout_enable)
        if timeout_kill_enable is not None:
            pulumi.set(__self__, "timeout_kill_enable", timeout_kill_enable)

    @_builtins.property
    @pulumi.getter(name="failEnable")
    def fail_enable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable failure alarm
        """
        return pulumi.get(self, "fail_enable")

    @fail_enable.setter
    def fail_enable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "fail_enable", value)

    @_builtins.property
    @pulumi.getter(name="missWorkerEnable")
    def miss_worker_enable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether no available Machine alarm is on
        """
        return pulumi.get(self, "miss_worker_enable")

    @miss_worker_enable.setter
    def miss_worker_enable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "miss_worker_enable", value)

    @_builtins.property
    @pulumi.getter(name="sendChannel")
    def send_channel(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Alarm sending form
        - sms: sms alarm
        - phone: phone alarm
        - mail: mail alarm
        - webhook:webhook alarm
        """
        return pulumi.get(self, "send_channel")

    @send_channel.setter
    def send_channel(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "send_channel", value)

    @_builtins.property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Timeout threshold, unit s, default 7200.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "timeout", value)

    @_builtins.property
    @pulumi.getter(name="timeoutEnable")
    def timeout_enable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Time-out alarm switch. The values are as follows:
        """
        return pulumi.get(self, "timeout_enable")

    @timeout_enable.setter
    def timeout_enable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "timeout_enable", value)

    @_builtins.property
    @pulumi.getter(name="timeoutKillEnable")
    def timeout_kill_enable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The trigger switch is terminated by timeout and is turned off by default.
        """
        return pulumi.get(self, "timeout_kill_enable")

    @timeout_kill_enable.setter
    def timeout_kill_enable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "timeout_kill_enable", value)


if not MYPY:
    class JobMapTaskXattrsArgsDict(TypedDict):
        consumer_size: NotRequired[pulumi.Input[_builtins.int]]
        """
        The number of threads to execute a single trigger. The default value is 5.
        """
        dispatcher_size: NotRequired[pulumi.Input[_builtins.int]]
        """
        The number of subtask distribution threads. The default value is 5.
        """
        page_size: NotRequired[pulumi.Input[_builtins.int]]
        """
        The number of sub-tasks pulled by a parallel task at a time. The default value is 100.
        """
        queue_size: NotRequired[pulumi.Input[_builtins.int]]
        """
        The upper limit of the sub-task queue cache. The default value is 10000.
        """
        task_attempt_interval: NotRequired[pulumi.Input[_builtins.int]]
        """
        Subtask failure retry interval.
        """
        task_max_attempt: NotRequired[pulumi.Input[_builtins.int]]
        """
        The number of failed sub-task retries.
        """
elif False:
    JobMapTaskXattrsArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class JobMapTaskXattrsArgs:
    def __init__(__self__, *,
                 consumer_size: Optional[pulumi.Input[_builtins.int]] = None,
                 dispatcher_size: Optional[pulumi.Input[_builtins.int]] = None,
                 page_size: Optional[pulumi.Input[_builtins.int]] = None,
                 queue_size: Optional[pulumi.Input[_builtins.int]] = None,
                 task_attempt_interval: Optional[pulumi.Input[_builtins.int]] = None,
                 task_max_attempt: Optional[pulumi.Input[_builtins.int]] = None):
        """
        :param pulumi.Input[_builtins.int] consumer_size: The number of threads to execute a single trigger. The default value is 5.
        :param pulumi.Input[_builtins.int] dispatcher_size: The number of subtask distribution threads. The default value is 5.
        :param pulumi.Input[_builtins.int] page_size: The number of sub-tasks pulled by a parallel task at a time. The default value is 100.
        :param pulumi.Input[_builtins.int] queue_size: The upper limit of the sub-task queue cache. The default value is 10000.
        :param pulumi.Input[_builtins.int] task_attempt_interval: Subtask failure retry interval.
        :param pulumi.Input[_builtins.int] task_max_attempt: The number of failed sub-task retries.
        """
        if consumer_size is not None:
            pulumi.set(__self__, "consumer_size", consumer_size)
        if dispatcher_size is not None:
            pulumi.set(__self__, "dispatcher_size", dispatcher_size)
        if page_size is not None:
            pulumi.set(__self__, "page_size", page_size)
        if queue_size is not None:
            pulumi.set(__self__, "queue_size", queue_size)
        if task_attempt_interval is not None:
            pulumi.set(__self__, "task_attempt_interval", task_attempt_interval)
        if task_max_attempt is not None:
            pulumi.set(__self__, "task_max_attempt", task_max_attempt)

    @_builtins.property
    @pulumi.getter(name="consumerSize")
    def consumer_size(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of threads to execute a single trigger. The default value is 5.
        """
        return pulumi.get(self, "consumer_size")

    @consumer_size.setter
    def consumer_size(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "consumer_size", value)

    @_builtins.property
    @pulumi.getter(name="dispatcherSize")
    def dispatcher_size(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of subtask distribution threads. The default value is 5.
        """
        return pulumi.get(self, "dispatcher_size")

    @dispatcher_size.setter
    def dispatcher_size(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "dispatcher_size", value)

    @_builtins.property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of sub-tasks pulled by a parallel task at a time. The default value is 100.
        """
        return pulumi.get(self, "page_size")

    @page_size.setter
    def page_size(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "page_size", value)

    @_builtins.property
    @pulumi.getter(name="queueSize")
    def queue_size(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The upper limit of the sub-task queue cache. The default value is 10000.
        """
        return pulumi.get(self, "queue_size")

    @queue_size.setter
    def queue_size(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "queue_size", value)

    @_builtins.property
    @pulumi.getter(name="taskAttemptInterval")
    def task_attempt_interval(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Subtask failure retry interval.
        """
        return pulumi.get(self, "task_attempt_interval")

    @task_attempt_interval.setter
    def task_attempt_interval(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "task_attempt_interval", value)

    @_builtins.property
    @pulumi.getter(name="taskMaxAttempt")
    def task_max_attempt(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of failed sub-task retries.
        """
        return pulumi.get(self, "task_max_attempt")

    @task_max_attempt.setter
    def task_max_attempt(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "task_max_attempt", value)


if not MYPY:
    class JobTimeConfigArgsDict(TypedDict):
        time_type: pulumi.Input[_builtins.int]
        """
        Time configuration type. Currently, the following time types are supported:
        """
        calendar: NotRequired[pulumi.Input[_builtins.str]]
        """
        The cron type can optionally fill in a custom calendar.
        """
        data_offset: NotRequired[pulumi.Input[_builtins.int]]
        """
        Cron type can choose time offset, unit s.
        """
        time_expression: NotRequired[pulumi.Input[_builtins.str]]
        """
        Time expressions. Currently, the following types of time expressions are supported:
        """
elif False:
    JobTimeConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class JobTimeConfigArgs:
    def __init__(__self__, *,
                 time_type: pulumi.Input[_builtins.int],
                 calendar: Optional[pulumi.Input[_builtins.str]] = None,
                 data_offset: Optional[pulumi.Input[_builtins.int]] = None,
                 time_expression: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.int] time_type: Time configuration type. Currently, the following time types are supported:
        :param pulumi.Input[_builtins.str] calendar: The cron type can optionally fill in a custom calendar.
        :param pulumi.Input[_builtins.int] data_offset: Cron type can choose time offset, unit s.
        :param pulumi.Input[_builtins.str] time_expression: Time expressions. Currently, the following types of time expressions are supported:
        """
        pulumi.set(__self__, "time_type", time_type)
        if calendar is not None:
            pulumi.set(__self__, "calendar", calendar)
        if data_offset is not None:
            pulumi.set(__self__, "data_offset", data_offset)
        if time_expression is not None:
            pulumi.set(__self__, "time_expression", time_expression)

    @_builtins.property
    @pulumi.getter(name="timeType")
    def time_type(self) -> pulumi.Input[_builtins.int]:
        """
        Time configuration type. Currently, the following time types are supported:
        """
        return pulumi.get(self, "time_type")

    @time_type.setter
    def time_type(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "time_type", value)

    @_builtins.property
    @pulumi.getter
    def calendar(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The cron type can optionally fill in a custom calendar.
        """
        return pulumi.get(self, "calendar")

    @calendar.setter
    def calendar(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "calendar", value)

    @_builtins.property
    @pulumi.getter(name="dataOffset")
    def data_offset(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Cron type can choose time offset, unit s.
        """
        return pulumi.get(self, "data_offset")

    @data_offset.setter
    def data_offset(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "data_offset", value)

    @_builtins.property
    @pulumi.getter(name="timeExpression")
    def time_expression(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Time expressions. Currently, the following types of time expressions are supported:
        """
        return pulumi.get(self, "time_expression")

    @time_expression.setter
    def time_expression(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "time_expression", value)


