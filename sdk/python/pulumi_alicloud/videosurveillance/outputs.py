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
    'GetSystemGroupsGroupResult',
    'GetSystemGroupsGroupStatResult',
]

@pulumi.output_type
class GetSystemGroupsGroupResult(dict):
    def __init__(__self__, *,
                 app: _builtins.str,
                 callback: _builtins.str,
                 create_time: _builtins.str,
                 description: _builtins.str,
                 enabled: _builtins.bool,
                 gb_id: _builtins.str,
                 gb_ip: _builtins.str,
                 group_id: _builtins.str,
                 group_name: _builtins.str,
                 id: _builtins.str,
                 in_protocol: _builtins.str,
                 out_protocol: _builtins.str,
                 play_domain: _builtins.str,
                 push_domain: _builtins.str,
                 stats: Sequence['outputs.GetSystemGroupsGroupStatResult']):
        """
        :param _builtins.str app: The App Name of Group.
        :param _builtins.str callback: The space within the device status update of the callback, need to start with http:// or https:// at the beginning.
        :param _builtins.str create_time: The creation time of the Group.
        :param _builtins.str description: The description of the Group.
        :param _builtins.bool enabled: Whether to open Group.
        :param _builtins.str gb_id: Space of national standard ID. **NOTE:** Available only in the national standard access space.
        :param _builtins.str gb_ip: Space of national standard signaling server address. **NOTE:** Available only in the national standard access space.
        :param _builtins.str group_id: The ID of Group.
        :param _builtins.str group_name: The name of Group.
        :param _builtins.str id: The ID of the Group.
        :param _builtins.str in_protocol: The use of the access protocol support `gb28181`,`rtmp`(Real Time Messaging Protocol).
        :param _builtins.str out_protocol: The use of space play Protocol multi-valued separate them with commas (,). Valid values: `flv`,`hls`, `rtmp`(Real Time Messaging Protocol).
        :param _builtins.str play_domain: The domain name of plan streaming used by the group.
        :param _builtins.str push_domain: The domain name of push streaming used by the group.
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

    @_builtins.property
    @pulumi.getter
    def app(self) -> _builtins.str:
        """
        The App Name of Group.
        """
        return pulumi.get(self, "app")

    @_builtins.property
    @pulumi.getter
    def callback(self) -> _builtins.str:
        """
        The space within the device status update of the callback, need to start with http:// or https:// at the beginning.
        """
        return pulumi.get(self, "callback")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        """
        The creation time of the Group.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the Group.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Whether to open Group.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="gbId")
    def gb_id(self) -> _builtins.str:
        """
        Space of national standard ID. **NOTE:** Available only in the national standard access space.
        """
        return pulumi.get(self, "gb_id")

    @_builtins.property
    @pulumi.getter(name="gbIp")
    def gb_ip(self) -> _builtins.str:
        """
        Space of national standard signaling server address. **NOTE:** Available only in the national standard access space.
        """
        return pulumi.get(self, "gb_ip")

    @_builtins.property
    @pulumi.getter(name="groupId")
    def group_id(self) -> _builtins.str:
        """
        The ID of Group.
        """
        return pulumi.get(self, "group_id")

    @_builtins.property
    @pulumi.getter(name="groupName")
    def group_name(self) -> _builtins.str:
        """
        The name of Group.
        """
        return pulumi.get(self, "group_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Group.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="inProtocol")
    def in_protocol(self) -> _builtins.str:
        """
        The use of the access protocol support `gb28181`,`rtmp`(Real Time Messaging Protocol).
        """
        return pulumi.get(self, "in_protocol")

    @_builtins.property
    @pulumi.getter(name="outProtocol")
    def out_protocol(self) -> _builtins.str:
        """
        The use of space play Protocol multi-valued separate them with commas (,). Valid values: `flv`,`hls`, `rtmp`(Real Time Messaging Protocol).
        """
        return pulumi.get(self, "out_protocol")

    @_builtins.property
    @pulumi.getter(name="playDomain")
    def play_domain(self) -> _builtins.str:
        """
        The domain name of plan streaming used by the group.
        """
        return pulumi.get(self, "play_domain")

    @_builtins.property
    @pulumi.getter(name="pushDomain")
    def push_domain(self) -> _builtins.str:
        """
        The domain name of push streaming used by the group.
        """
        return pulumi.get(self, "push_domain")

    @_builtins.property
    @pulumi.getter
    def stats(self) -> Sequence['outputs.GetSystemGroupsGroupStatResult']:
        """
        The Device statistics of Group.
        """
        return pulumi.get(self, "stats")


@pulumi.output_type
class GetSystemGroupsGroupStatResult(dict):
    def __init__(__self__, *,
                 device_num: _builtins.str,
                 ied_num: _builtins.str,
                 ipc_num: _builtins.str,
                 platform_num: _builtins.str):
        """
        :param _builtins.str device_num: The total number of devices in the group.
        :param _builtins.str ied_num: The total number of smart devices in the group.
        :param _builtins.str ipc_num: The total number of cameras in the group.
        :param _builtins.str platform_num: The total number of platforms in the group.
        """
        pulumi.set(__self__, "device_num", device_num)
        pulumi.set(__self__, "ied_num", ied_num)
        pulumi.set(__self__, "ipc_num", ipc_num)
        pulumi.set(__self__, "platform_num", platform_num)

    @_builtins.property
    @pulumi.getter(name="deviceNum")
    def device_num(self) -> _builtins.str:
        """
        The total number of devices in the group.
        """
        return pulumi.get(self, "device_num")

    @_builtins.property
    @pulumi.getter(name="iedNum")
    def ied_num(self) -> _builtins.str:
        """
        The total number of smart devices in the group.
        """
        return pulumi.get(self, "ied_num")

    @_builtins.property
    @pulumi.getter(name="ipcNum")
    def ipc_num(self) -> _builtins.str:
        """
        The total number of cameras in the group.
        """
        return pulumi.get(self, "ipc_num")

    @_builtins.property
    @pulumi.getter(name="platformNum")
    def platform_num(self) -> _builtins.str:
        """
        The total number of platforms in the group.
        """
        return pulumi.get(self, "platform_num")


