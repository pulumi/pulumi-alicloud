# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
    'GetSystemGroupsGroupResult',
    'GetSystemGroupsGroupStatResult',
]

@pulumi.output_type
class GetSystemGroupsGroupResult(dict):
    def __init__(__self__, *,
                 app: builtins.str,
                 callback: builtins.str,
                 create_time: builtins.str,
                 description: builtins.str,
                 enabled: builtins.bool,
                 gb_id: builtins.str,
                 gb_ip: builtins.str,
                 group_id: builtins.str,
                 group_name: builtins.str,
                 id: builtins.str,
                 in_protocol: builtins.str,
                 out_protocol: builtins.str,
                 play_domain: builtins.str,
                 push_domain: builtins.str,
                 stats: Sequence['outputs.GetSystemGroupsGroupStatResult']):
        """
        :param builtins.str app: The App Name of Group.
        :param builtins.str callback: The space within the device status update of the callback, need to start with http:// or https:// at the beginning.
        :param builtins.str create_time: The creation time of the Group.
        :param builtins.str description: The description of the Group.
        :param builtins.bool enabled: Whether to open Group.
        :param builtins.str gb_id: Space of national standard ID. **NOTE:** Available only in the national standard access space.
        :param builtins.str gb_ip: Space of national standard signaling server address. **NOTE:** Available only in the national standard access space.
        :param builtins.str group_id: The ID of Group.
        :param builtins.str group_name: The name of Group.
        :param builtins.str id: The ID of the Group.
        :param builtins.str in_protocol: The use of the access protocol support `gb28181`,`rtmp`(Real Time Messaging Protocol).
        :param builtins.str out_protocol: The use of space play Protocol multi-valued separate them with commas (,). Valid values: `flv`,`hls`, `rtmp`(Real Time Messaging Protocol).
        :param builtins.str play_domain: The domain name of plan streaming used by the group.
        :param builtins.str push_domain: The domain name of push streaming used by the group.
        :param Sequence['GetSystemGroupsGroupStatArgs'] stats: The Device statistics of Group.
        """
        pulumi.set(__self__, "app", app)
        pulumi.set(__self__, "callback", callback)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "gb_id", gb_id)
        pulumi.set(__self__, "gb_ip", gb_ip)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "in_protocol", in_protocol)
        pulumi.set(__self__, "out_protocol", out_protocol)
        pulumi.set(__self__, "play_domain", play_domain)
        pulumi.set(__self__, "push_domain", push_domain)
        pulumi.set(__self__, "stats", stats)

    @property
    @pulumi.getter
    def app(self) -> builtins.str:
        """
        The App Name of Group.
        """
        return pulumi.get(self, "app")

    @property
    @pulumi.getter
    def callback(self) -> builtins.str:
        """
        The space within the device status update of the callback, need to start with http:// or https:// at the beginning.
        """
        return pulumi.get(self, "callback")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> builtins.str:
        """
        The creation time of the Group.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        The description of the Group.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> builtins.bool:
        """
        Whether to open Group.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="gbId")
    def gb_id(self) -> builtins.str:
        """
        Space of national standard ID. **NOTE:** Available only in the national standard access space.
        """
        return pulumi.get(self, "gb_id")

    @property
    @pulumi.getter(name="gbIp")
    def gb_ip(self) -> builtins.str:
        """
        Space of national standard signaling server address. **NOTE:** Available only in the national standard access space.
        """
        return pulumi.get(self, "gb_ip")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> builtins.str:
        """
        The ID of Group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> builtins.str:
        """
        The name of Group.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of the Group.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inProtocol")
    def in_protocol(self) -> builtins.str:
        """
        The use of the access protocol support `gb28181`,`rtmp`(Real Time Messaging Protocol).
        """
        return pulumi.get(self, "in_protocol")

    @property
    @pulumi.getter(name="outProtocol")
    def out_protocol(self) -> builtins.str:
        """
        The use of space play Protocol multi-valued separate them with commas (,). Valid values: `flv`,`hls`, `rtmp`(Real Time Messaging Protocol).
        """
        return pulumi.get(self, "out_protocol")

    @property
    @pulumi.getter(name="playDomain")
    def play_domain(self) -> builtins.str:
        """
        The domain name of plan streaming used by the group.
        """
        return pulumi.get(self, "play_domain")

    @property
    @pulumi.getter(name="pushDomain")
    def push_domain(self) -> builtins.str:
        """
        The domain name of push streaming used by the group.
        """
        return pulumi.get(self, "push_domain")

    @property
    @pulumi.getter
    def stats(self) -> Sequence['outputs.GetSystemGroupsGroupStatResult']:
        """
        The Device statistics of Group.
        """
        return pulumi.get(self, "stats")


@pulumi.output_type
class GetSystemGroupsGroupStatResult(dict):
    def __init__(__self__, *,
                 device_num: builtins.str,
                 ied_num: builtins.str,
                 ipc_num: builtins.str,
                 platform_num: builtins.str):
        """
        :param builtins.str device_num: The total number of devices in the group.
        :param builtins.str ied_num: The total number of smart devices in the group.
        :param builtins.str ipc_num: The total number of cameras in the group.
        :param builtins.str platform_num: The total number of platforms in the group.
        """
        pulumi.set(__self__, "device_num", device_num)
        pulumi.set(__self__, "ied_num", ied_num)
        pulumi.set(__self__, "ipc_num", ipc_num)
        pulumi.set(__self__, "platform_num", platform_num)

    @property
    @pulumi.getter(name="deviceNum")
    def device_num(self) -> builtins.str:
        """
        The total number of devices in the group.
        """
        return pulumi.get(self, "device_num")

    @property
    @pulumi.getter(name="iedNum")
    def ied_num(self) -> builtins.str:
        """
        The total number of smart devices in the group.
        """
        return pulumi.get(self, "ied_num")

    @property
    @pulumi.getter(name="ipcNum")
    def ipc_num(self) -> builtins.str:
        """
        The total number of cameras in the group.
        """
        return pulumi.get(self, "ipc_num")

    @property
    @pulumi.getter(name="platformNum")
    def platform_num(self) -> builtins.str:
        """
        The total number of platforms in the group.
        """
        return pulumi.get(self, "platform_num")


