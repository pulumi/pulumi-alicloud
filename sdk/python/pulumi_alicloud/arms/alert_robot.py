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

__all__ = ['AlertRobotArgs', 'AlertRobot']

@pulumi.input_type
class AlertRobotArgs:
    def __init__(__self__, *,
                 alert_robot_name: pulumi.Input[str],
                 robot_addr: pulumi.Input[str],
                 robot_type: pulumi.Input[str],
                 daily_noc: Optional[pulumi.Input[bool]] = None,
                 daily_noc_time: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AlertRobot resource.
        :param pulumi.Input[str] alert_robot_name: The name of the resource.
        :param pulumi.Input[str] robot_addr: The webhook url of the robot.
        :param pulumi.Input[str] robot_type: The type of the robot, Valid values: `wechat`, `dingding`, `feishu`.
        :param pulumi.Input[bool] daily_noc: Specifies whether the alert robot receives daily notifications. Valid values: `true`: receives daily notifications. `false`: does not receive daily notifications, default to `false`.
        :param pulumi.Input[str] daily_noc_time: The time of the daily notification.
        """
        pulumi.set(__self__, "alert_robot_name", alert_robot_name)
        pulumi.set(__self__, "robot_addr", robot_addr)
        pulumi.set(__self__, "robot_type", robot_type)
        if daily_noc is not None:
            pulumi.set(__self__, "daily_noc", daily_noc)
        if daily_noc_time is not None:
            pulumi.set(__self__, "daily_noc_time", daily_noc_time)

    @property
    @pulumi.getter(name="alertRobotName")
    def alert_robot_name(self) -> pulumi.Input[str]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "alert_robot_name")

    @alert_robot_name.setter
    def alert_robot_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "alert_robot_name", value)

    @property
    @pulumi.getter(name="robotAddr")
    def robot_addr(self) -> pulumi.Input[str]:
        """
        The webhook url of the robot.
        """
        return pulumi.get(self, "robot_addr")

    @robot_addr.setter
    def robot_addr(self, value: pulumi.Input[str]):
        pulumi.set(self, "robot_addr", value)

    @property
    @pulumi.getter(name="robotType")
    def robot_type(self) -> pulumi.Input[str]:
        """
        The type of the robot, Valid values: `wechat`, `dingding`, `feishu`.
        """
        return pulumi.get(self, "robot_type")

    @robot_type.setter
    def robot_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "robot_type", value)

    @property
    @pulumi.getter(name="dailyNoc")
    def daily_noc(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the alert robot receives daily notifications. Valid values: `true`: receives daily notifications. `false`: does not receive daily notifications, default to `false`.
        """
        return pulumi.get(self, "daily_noc")

    @daily_noc.setter
    def daily_noc(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "daily_noc", value)

    @property
    @pulumi.getter(name="dailyNocTime")
    def daily_noc_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time of the daily notification.
        """
        return pulumi.get(self, "daily_noc_time")

    @daily_noc_time.setter
    def daily_noc_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "daily_noc_time", value)


@pulumi.input_type
class _AlertRobotState:
    def __init__(__self__, *,
                 alert_robot_name: Optional[pulumi.Input[str]] = None,
                 daily_noc: Optional[pulumi.Input[bool]] = None,
                 daily_noc_time: Optional[pulumi.Input[str]] = None,
                 robot_addr: Optional[pulumi.Input[str]] = None,
                 robot_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AlertRobot resources.
        :param pulumi.Input[str] alert_robot_name: The name of the resource.
        :param pulumi.Input[bool] daily_noc: Specifies whether the alert robot receives daily notifications. Valid values: `true`: receives daily notifications. `false`: does not receive daily notifications, default to `false`.
        :param pulumi.Input[str] daily_noc_time: The time of the daily notification.
        :param pulumi.Input[str] robot_addr: The webhook url of the robot.
        :param pulumi.Input[str] robot_type: The type of the robot, Valid values: `wechat`, `dingding`, `feishu`.
        """
        if alert_robot_name is not None:
            pulumi.set(__self__, "alert_robot_name", alert_robot_name)
        if daily_noc is not None:
            pulumi.set(__self__, "daily_noc", daily_noc)
        if daily_noc_time is not None:
            pulumi.set(__self__, "daily_noc_time", daily_noc_time)
        if robot_addr is not None:
            pulumi.set(__self__, "robot_addr", robot_addr)
        if robot_type is not None:
            pulumi.set(__self__, "robot_type", robot_type)

    @property
    @pulumi.getter(name="alertRobotName")
    def alert_robot_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "alert_robot_name")

    @alert_robot_name.setter
    def alert_robot_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_robot_name", value)

    @property
    @pulumi.getter(name="dailyNoc")
    def daily_noc(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the alert robot receives daily notifications. Valid values: `true`: receives daily notifications. `false`: does not receive daily notifications, default to `false`.
        """
        return pulumi.get(self, "daily_noc")

    @daily_noc.setter
    def daily_noc(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "daily_noc", value)

    @property
    @pulumi.getter(name="dailyNocTime")
    def daily_noc_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time of the daily notification.
        """
        return pulumi.get(self, "daily_noc_time")

    @daily_noc_time.setter
    def daily_noc_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "daily_noc_time", value)

    @property
    @pulumi.getter(name="robotAddr")
    def robot_addr(self) -> Optional[pulumi.Input[str]]:
        """
        The webhook url of the robot.
        """
        return pulumi.get(self, "robot_addr")

    @robot_addr.setter
    def robot_addr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "robot_addr", value)

    @property
    @pulumi.getter(name="robotType")
    def robot_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the robot, Valid values: `wechat`, `dingding`, `feishu`.
        """
        return pulumi.get(self, "robot_type")

    @robot_type.setter
    def robot_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "robot_type", value)


class AlertRobot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_robot_name: Optional[pulumi.Input[str]] = None,
                 daily_noc: Optional[pulumi.Input[bool]] = None,
                 daily_noc_time: Optional[pulumi.Input[str]] = None,
                 robot_addr: Optional[pulumi.Input[str]] = None,
                 robot_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Application Real-Time Monitoring Service (ARMS) Alert Robot resource.

        For information about Application Real-Time Monitoring Service (ARMS) Alert Robot and how to use it, see [What is Alert Robot](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/CreateOrUpdateIMRobot).

        > **NOTE:** Available since v1.237.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        wechat = alicloud.arms.AlertRobot("wechat",
            alert_robot_name="example_wechat",
            robot_type="wechat",
            robot_addr="https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=1c704e23",
            daily_noc=True,
            daily_noc_time="09:30,17:00")
        dingding = alicloud.arms.AlertRobot("dingding",
            alert_robot_name="example_dingding",
            robot_type="dingding",
            robot_addr="https://oapi.dingtalk.com/robot/send?access_token=1c704e23",
            daily_noc=True,
            daily_noc_time="09:30,17:00")
        feishu = alicloud.arms.AlertRobot("feishu",
            alert_robot_name="example_feishu",
            robot_type="feishu",
            robot_addr="https://open.feishu.cn/open-apis/bot/v2/hook/a48efa01",
            daily_noc=True,
            daily_noc_time="09:30,17:00")
        ```

        ## Import

        Application Real-Time Monitoring Service (ARMS) Alert Robot can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:arms/alertRobot:AlertRobot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_robot_name: The name of the resource.
        :param pulumi.Input[bool] daily_noc: Specifies whether the alert robot receives daily notifications. Valid values: `true`: receives daily notifications. `false`: does not receive daily notifications, default to `false`.
        :param pulumi.Input[str] daily_noc_time: The time of the daily notification.
        :param pulumi.Input[str] robot_addr: The webhook url of the robot.
        :param pulumi.Input[str] robot_type: The type of the robot, Valid values: `wechat`, `dingding`, `feishu`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertRobotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Application Real-Time Monitoring Service (ARMS) Alert Robot resource.

        For information about Application Real-Time Monitoring Service (ARMS) Alert Robot and how to use it, see [What is Alert Robot](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/CreateOrUpdateIMRobot).

        > **NOTE:** Available since v1.237.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        wechat = alicloud.arms.AlertRobot("wechat",
            alert_robot_name="example_wechat",
            robot_type="wechat",
            robot_addr="https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=1c704e23",
            daily_noc=True,
            daily_noc_time="09:30,17:00")
        dingding = alicloud.arms.AlertRobot("dingding",
            alert_robot_name="example_dingding",
            robot_type="dingding",
            robot_addr="https://oapi.dingtalk.com/robot/send?access_token=1c704e23",
            daily_noc=True,
            daily_noc_time="09:30,17:00")
        feishu = alicloud.arms.AlertRobot("feishu",
            alert_robot_name="example_feishu",
            robot_type="feishu",
            robot_addr="https://open.feishu.cn/open-apis/bot/v2/hook/a48efa01",
            daily_noc=True,
            daily_noc_time="09:30,17:00")
        ```

        ## Import

        Application Real-Time Monitoring Service (ARMS) Alert Robot can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:arms/alertRobot:AlertRobot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param AlertRobotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertRobotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_robot_name: Optional[pulumi.Input[str]] = None,
                 daily_noc: Optional[pulumi.Input[bool]] = None,
                 daily_noc_time: Optional[pulumi.Input[str]] = None,
                 robot_addr: Optional[pulumi.Input[str]] = None,
                 robot_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertRobotArgs.__new__(AlertRobotArgs)

            if alert_robot_name is None and not opts.urn:
                raise TypeError("Missing required property 'alert_robot_name'")
            __props__.__dict__["alert_robot_name"] = alert_robot_name
            __props__.__dict__["daily_noc"] = daily_noc
            __props__.__dict__["daily_noc_time"] = daily_noc_time
            if robot_addr is None and not opts.urn:
                raise TypeError("Missing required property 'robot_addr'")
            __props__.__dict__["robot_addr"] = robot_addr
            if robot_type is None and not opts.urn:
                raise TypeError("Missing required property 'robot_type'")
            __props__.__dict__["robot_type"] = robot_type
        super(AlertRobot, __self__).__init__(
            'alicloud:arms/alertRobot:AlertRobot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alert_robot_name: Optional[pulumi.Input[str]] = None,
            daily_noc: Optional[pulumi.Input[bool]] = None,
            daily_noc_time: Optional[pulumi.Input[str]] = None,
            robot_addr: Optional[pulumi.Input[str]] = None,
            robot_type: Optional[pulumi.Input[str]] = None) -> 'AlertRobot':
        """
        Get an existing AlertRobot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_robot_name: The name of the resource.
        :param pulumi.Input[bool] daily_noc: Specifies whether the alert robot receives daily notifications. Valid values: `true`: receives daily notifications. `false`: does not receive daily notifications, default to `false`.
        :param pulumi.Input[str] daily_noc_time: The time of the daily notification.
        :param pulumi.Input[str] robot_addr: The webhook url of the robot.
        :param pulumi.Input[str] robot_type: The type of the robot, Valid values: `wechat`, `dingding`, `feishu`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertRobotState.__new__(_AlertRobotState)

        __props__.__dict__["alert_robot_name"] = alert_robot_name
        __props__.__dict__["daily_noc"] = daily_noc
        __props__.__dict__["daily_noc_time"] = daily_noc_time
        __props__.__dict__["robot_addr"] = robot_addr
        __props__.__dict__["robot_type"] = robot_type
        return AlertRobot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alertRobotName")
    def alert_robot_name(self) -> pulumi.Output[str]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "alert_robot_name")

    @property
    @pulumi.getter(name="dailyNoc")
    def daily_noc(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the alert robot receives daily notifications. Valid values: `true`: receives daily notifications. `false`: does not receive daily notifications, default to `false`.
        """
        return pulumi.get(self, "daily_noc")

    @property
    @pulumi.getter(name="dailyNocTime")
    def daily_noc_time(self) -> pulumi.Output[Optional[str]]:
        """
        The time of the daily notification.
        """
        return pulumi.get(self, "daily_noc_time")

    @property
    @pulumi.getter(name="robotAddr")
    def robot_addr(self) -> pulumi.Output[str]:
        """
        The webhook url of the robot.
        """
        return pulumi.get(self, "robot_addr")

    @property
    @pulumi.getter(name="robotType")
    def robot_type(self) -> pulumi.Output[str]:
        """
        The type of the robot, Valid values: `wechat`, `dingding`, `feishu`.
        """
        return pulumi.get(self, "robot_type")
