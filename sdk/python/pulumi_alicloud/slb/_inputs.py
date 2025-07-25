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
    'AclEntryListArgs',
    'AclEntryListArgsDict',
    'BackendServerBackendServerArgs',
    'BackendServerBackendServerArgsDict',
    'ListenerXForwardedForArgs',
    'ListenerXForwardedForArgsDict',
    'MasterSlaveServerGroupServerArgs',
    'MasterSlaveServerGroupServerArgsDict',
    'ServerGroupServerArgs',
    'ServerGroupServerArgsDict',
]

MYPY = False

if not MYPY:
    class AclEntryListArgsDict(TypedDict):
        comment: NotRequired[pulumi.Input[_builtins.str]]
        entry: NotRequired[pulumi.Input[_builtins.str]]
elif False:
    AclEntryListArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class AclEntryListArgs:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 entry: Optional[pulumi.Input[_builtins.str]] = None):
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if entry is not None:
            pulumi.set(__self__, "entry", entry)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def entry(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "entry")

    @entry.setter
    def entry(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "entry", value)


if not MYPY:
    class BackendServerBackendServerArgsDict(TypedDict):
        server_id: pulumi.Input[_builtins.str]
        weight: pulumi.Input[_builtins.int]
        server_ip: NotRequired[pulumi.Input[_builtins.str]]
        type: NotRequired[pulumi.Input[_builtins.str]]
elif False:
    BackendServerBackendServerArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BackendServerBackendServerArgs:
    def __init__(__self__, *,
                 server_id: pulumi.Input[_builtins.str],
                 weight: pulumi.Input[_builtins.int],
                 server_ip: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        pulumi.set(__self__, "server_id", server_id)
        pulumi.set(__self__, "weight", weight)
        if server_ip is not None:
            pulumi.set(__self__, "server_ip", server_ip)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "server_id", value)

    @_builtins.property
    @pulumi.getter
    def weight(self) -> pulumi.Input[_builtins.int]:
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "weight", value)

    @_builtins.property
    @pulumi.getter(name="serverIp")
    def server_ip(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "server_ip")

    @server_ip.setter
    def server_ip(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "server_ip", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


if not MYPY:
    class ListenerXForwardedForArgsDict(TypedDict):
        retrive_client_ip: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether to retrieve the client ip.
        """
        retrive_slb_id: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Indicates whether the SLB-ID header is used to retrieve the ID of the CLB instance. Default value: `false`. Valid values: `true`, `false`.
        """
        retrive_slb_ip: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Indicates whether the SLB-IP header is used to retrieve the virtual IP address (VIP) requested by the client. Default value: `false`. Valid values: `true`, `false`.
        """
        retrive_slb_proto: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Specifies whether to use the X-Forwarded-Proto header to retrieve the listener protocol. Default value: `false`. Valid values: `true`, `false`.
        """
elif False:
    ListenerXForwardedForArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ListenerXForwardedForArgs:
    def __init__(__self__, *,
                 retrive_client_ip: Optional[pulumi.Input[_builtins.bool]] = None,
                 retrive_slb_id: Optional[pulumi.Input[_builtins.bool]] = None,
                 retrive_slb_ip: Optional[pulumi.Input[_builtins.bool]] = None,
                 retrive_slb_proto: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.bool] retrive_client_ip: Whether to retrieve the client ip.
        :param pulumi.Input[_builtins.bool] retrive_slb_id: Indicates whether the SLB-ID header is used to retrieve the ID of the CLB instance. Default value: `false`. Valid values: `true`, `false`.
        :param pulumi.Input[_builtins.bool] retrive_slb_ip: Indicates whether the SLB-IP header is used to retrieve the virtual IP address (VIP) requested by the client. Default value: `false`. Valid values: `true`, `false`.
        :param pulumi.Input[_builtins.bool] retrive_slb_proto: Specifies whether to use the X-Forwarded-Proto header to retrieve the listener protocol. Default value: `false`. Valid values: `true`, `false`.
        """
        if retrive_client_ip is not None:
            pulumi.set(__self__, "retrive_client_ip", retrive_client_ip)
        if retrive_slb_id is not None:
            pulumi.set(__self__, "retrive_slb_id", retrive_slb_id)
        if retrive_slb_ip is not None:
            pulumi.set(__self__, "retrive_slb_ip", retrive_slb_ip)
        if retrive_slb_proto is not None:
            pulumi.set(__self__, "retrive_slb_proto", retrive_slb_proto)

    @_builtins.property
    @pulumi.getter(name="retriveClientIp")
    def retrive_client_ip(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to retrieve the client ip.
        """
        return pulumi.get(self, "retrive_client_ip")

    @retrive_client_ip.setter
    def retrive_client_ip(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "retrive_client_ip", value)

    @_builtins.property
    @pulumi.getter(name="retriveSlbId")
    def retrive_slb_id(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether the SLB-ID header is used to retrieve the ID of the CLB instance. Default value: `false`. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "retrive_slb_id")

    @retrive_slb_id.setter
    def retrive_slb_id(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "retrive_slb_id", value)

    @_builtins.property
    @pulumi.getter(name="retriveSlbIp")
    def retrive_slb_ip(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether the SLB-IP header is used to retrieve the virtual IP address (VIP) requested by the client. Default value: `false`. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "retrive_slb_ip")

    @retrive_slb_ip.setter
    def retrive_slb_ip(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "retrive_slb_ip", value)

    @_builtins.property
    @pulumi.getter(name="retriveSlbProto")
    def retrive_slb_proto(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether to use the X-Forwarded-Proto header to retrieve the listener protocol. Default value: `false`. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "retrive_slb_proto")

    @retrive_slb_proto.setter
    def retrive_slb_proto(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "retrive_slb_proto", value)


if not MYPY:
    class MasterSlaveServerGroupServerArgsDict(TypedDict):
        port: pulumi.Input[_builtins.int]
        """
        The port used by the backend server. Valid value range: [1-65535].
        """
        server_id: pulumi.Input[_builtins.str]
        """
        A list backend server ID (ECS instance ID).
        """
        is_backup: NotRequired[pulumi.Input[_builtins.int]]
        """
        Determine if the server is executing. Valid value 0, 1.
        """
        server_type: NotRequired[pulumi.Input[_builtins.str]]
        """
        The server type of the backend server. Valid value Master, Slave.
        """
        type: NotRequired[pulumi.Input[_builtins.str]]
        """
        Type of the backend server. Valid value ecs, eni. Default to eni.
        """
        weight: NotRequired[pulumi.Input[_builtins.int]]
        """
        Weight of the backend server. Valid value range: [0-100]. Default to 100.
        """
elif False:
    MasterSlaveServerGroupServerArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class MasterSlaveServerGroupServerArgs:
    def __init__(__self__, *,
                 port: pulumi.Input[_builtins.int],
                 server_id: pulumi.Input[_builtins.str],
                 is_backup: Optional[pulumi.Input[_builtins.int]] = None,
                 server_type: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 weight: Optional[pulumi.Input[_builtins.int]] = None):
        """
        :param pulumi.Input[_builtins.int] port: The port used by the backend server. Valid value range: [1-65535].
        :param pulumi.Input[_builtins.str] server_id: A list backend server ID (ECS instance ID).
        :param pulumi.Input[_builtins.int] is_backup: Determine if the server is executing. Valid value 0, 1.
        :param pulumi.Input[_builtins.str] server_type: The server type of the backend server. Valid value Master, Slave.
        :param pulumi.Input[_builtins.str] type: Type of the backend server. Valid value ecs, eni. Default to eni.
        :param pulumi.Input[_builtins.int] weight: Weight of the backend server. Valid value range: [0-100]. Default to 100.
        """
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "server_id", server_id)
        if is_backup is not None:
            pulumi.set(__self__, "is_backup", is_backup)
        if server_type is not None:
            pulumi.set(__self__, "server_type", server_type)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @_builtins.property
    @pulumi.getter
    def port(self) -> pulumi.Input[_builtins.int]:
        """
        The port used by the backend server. Valid value range: [1-65535].
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "port", value)

    @_builtins.property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[_builtins.str]:
        """
        A list backend server ID (ECS instance ID).
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "server_id", value)

    @_builtins.property
    @pulumi.getter(name="isBackup")
    def is_backup(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Determine if the server is executing. Valid value 0, 1.
        """
        return pulumi.get(self, "is_backup")

    @is_backup.setter
    def is_backup(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "is_backup", value)

    @_builtins.property
    @pulumi.getter(name="serverType")
    def server_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The server type of the backend server. Valid value Master, Slave.
        """
        return pulumi.get(self, "server_type")

    @server_type.setter
    def server_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "server_type", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Type of the backend server. Valid value ecs, eni. Default to eni.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Weight of the backend server. Valid value range: [0-100]. Default to 100.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "weight", value)


if not MYPY:
    class ServerGroupServerArgsDict(TypedDict):
        port: pulumi.Input[_builtins.int]
        """
        The port used by the backend server. Valid values: `1` to `65535`.
        """
        server_ids: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]
        """
        The list of Elastic Compute Service (ECS) Ids or Elastic Network Interface (ENI) Ids.
        """
        type: NotRequired[pulumi.Input[_builtins.str]]
        """
        Specify the type of the backend server. Default value: `ecs`. Valid values: `ecs`, `eni`.
        """
        weight: NotRequired[pulumi.Input[_builtins.int]]
        """
        Weight of the backend server. Default value: `100`. Valid values: `0` to `100`.
        """
elif False:
    ServerGroupServerArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ServerGroupServerArgs:
    def __init__(__self__, *,
                 port: pulumi.Input[_builtins.int],
                 server_ids: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 weight: Optional[pulumi.Input[_builtins.int]] = None):
        """
        :param pulumi.Input[_builtins.int] port: The port used by the backend server. Valid values: `1` to `65535`.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] server_ids: The list of Elastic Compute Service (ECS) Ids or Elastic Network Interface (ENI) Ids.
        :param pulumi.Input[_builtins.str] type: Specify the type of the backend server. Default value: `ecs`. Valid values: `ecs`, `eni`.
        :param pulumi.Input[_builtins.int] weight: Weight of the backend server. Default value: `100`. Valid values: `0` to `100`.
        """
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "server_ids", server_ids)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @_builtins.property
    @pulumi.getter
    def port(self) -> pulumi.Input[_builtins.int]:
        """
        The port used by the backend server. Valid values: `1` to `65535`.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "port", value)

    @_builtins.property
    @pulumi.getter(name="serverIds")
    def server_ids(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        The list of Elastic Compute Service (ECS) Ids or Elastic Network Interface (ENI) Ids.
        """
        return pulumi.get(self, "server_ids")

    @server_ids.setter
    def server_ids(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "server_ids", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specify the type of the backend server. Default value: `ecs`. Valid values: `ecs`, `eni`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Weight of the backend server. Default value: `100`. Valid values: `0` to `100`.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "weight", value)


