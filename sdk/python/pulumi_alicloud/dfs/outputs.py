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
    'VscMountPointInstance',
    'VscMountPointInstanceVsc',
    'GetAccessGroupsGroupResult',
    'GetAccessRulesRuleResult',
    'GetFileSystemsSystemResult',
    'GetMountPointsPointResult',
    'GetZonesZoneResult',
    'GetZonesZoneOptionResult',
]

@pulumi.output_type
class VscMountPointInstance(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "instanceId":
            suggest = "instance_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in VscMountPointInstance. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VscMountPointInstance.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VscMountPointInstance.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 instance_id: Optional[builtins.str] = None,
                 status: Optional[builtins.str] = None,
                 vscs: Optional[Sequence['outputs.VscMountPointInstanceVsc']] = None):
        """
        :param builtins.str instance_id: The ID of the ECS instance to which the HDFS file system is mounted.
        :param builtins.str status: The status of the ECS instance on which the HDFS file system is mounted.
        :param Sequence['VscMountPointInstanceVscArgs'] vscs: The VSC list of mounted HDFS file systems.
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if vscs is not None:
            pulumi.set(__self__, "vscs", vscs)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[builtins.str]:
        """
        The ID of the ECS instance to which the HDFS file system is mounted.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[builtins.str]:
        """
        The status of the ECS instance on which the HDFS file system is mounted.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def vscs(self) -> Optional[Sequence['outputs.VscMountPointInstanceVsc']]:
        """
        The VSC list of mounted HDFS file systems.
        """
        return pulumi.get(self, "vscs")


@pulumi.output_type
class VscMountPointInstanceVsc(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "vscId":
            suggest = "vsc_id"
        elif key == "vscStatus":
            suggest = "vsc_status"
        elif key == "vscType":
            suggest = "vsc_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in VscMountPointInstanceVsc. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VscMountPointInstanceVsc.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VscMountPointInstanceVsc.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 vsc_id: Optional[builtins.str] = None,
                 vsc_status: Optional[builtins.str] = None,
                 vsc_type: Optional[builtins.str] = None):
        """
        :param builtins.str vsc_id: VSC Channel primary key representation, used to retrieve the specified VSC Channel.
        :param builtins.str vsc_status: VSC Mount status.
        :param builtins.str vsc_type: The VSC type.
        """
        if vsc_id is not None:
            pulumi.set(__self__, "vsc_id", vsc_id)
        if vsc_status is not None:
            pulumi.set(__self__, "vsc_status", vsc_status)
        if vsc_type is not None:
            pulumi.set(__self__, "vsc_type", vsc_type)

    @property
    @pulumi.getter(name="vscId")
    def vsc_id(self) -> Optional[builtins.str]:
        """
        VSC Channel primary key representation, used to retrieve the specified VSC Channel.
        """
        return pulumi.get(self, "vsc_id")

    @property
    @pulumi.getter(name="vscStatus")
    def vsc_status(self) -> Optional[builtins.str]:
        """
        VSC Mount status.
        """
        return pulumi.get(self, "vsc_status")

    @property
    @pulumi.getter(name="vscType")
    def vsc_type(self) -> Optional[builtins.str]:
        """
        The VSC type.
        """
        return pulumi.get(self, "vsc_type")


@pulumi.output_type
class GetAccessGroupsGroupResult(dict):
    def __init__(__self__, *,
                 access_group_id: builtins.str,
                 access_group_name: builtins.str,
                 create_time: builtins.str,
                 description: builtins.str,
                 id: builtins.str,
                 mount_point_count: builtins.int,
                 network_type: builtins.str,
                 rule_count: builtins.int):
        """
        :param builtins.str access_group_id: The length of `description` does not exceed 100 bytes.
        :param builtins.str access_group_name: The Name of Access Group. The length Of `access_group_name` does not exceed 100 bytes.
        :param builtins.str create_time: The CreateTime of Access Group.
        :param builtins.str description: The Description of Access Group. The length Of `description` does not exceed 100 bytes.
        :param builtins.str id: The ID of the Access Group.
        :param builtins.int mount_point_count: The Number of attached mountpoint.
        :param builtins.str network_type: The NetworkType of Access Group. Valid values: `VPC`.
        :param builtins.int rule_count: The Number of access rule.
        """
        pulumi.set(__self__, "access_group_id", access_group_id)
        pulumi.set(__self__, "access_group_name", access_group_name)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "mount_point_count", mount_point_count)
        pulumi.set(__self__, "network_type", network_type)
        pulumi.set(__self__, "rule_count", rule_count)

    @property
    @pulumi.getter(name="accessGroupId")
    def access_group_id(self) -> builtins.str:
        """
        The length of `description` does not exceed 100 bytes.
        """
        return pulumi.get(self, "access_group_id")

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> builtins.str:
        """
        The Name of Access Group. The length Of `access_group_name` does not exceed 100 bytes.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> builtins.str:
        """
        The CreateTime of Access Group.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        The Description of Access Group. The length Of `description` does not exceed 100 bytes.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of the Access Group.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mountPointCount")
    def mount_point_count(self) -> builtins.int:
        """
        The Number of attached mountpoint.
        """
        return pulumi.get(self, "mount_point_count")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> builtins.str:
        """
        The NetworkType of Access Group. Valid values: `VPC`.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter(name="ruleCount")
    def rule_count(self) -> builtins.int:
        """
        The Number of access rule.
        """
        return pulumi.get(self, "rule_count")


@pulumi.output_type
class GetAccessRulesRuleResult(dict):
    def __init__(__self__, *,
                 access_group_id: builtins.str,
                 access_rule_id: builtins.str,
                 create_time: builtins.str,
                 description: builtins.str,
                 id: builtins.str,
                 network_segment: builtins.str,
                 priority: builtins.int,
                 rw_access_type: builtins.str):
        """
        :param builtins.str access_group_id: The resource ID of the Access Group.
        :param builtins.str access_rule_id: The ID of the Access Rule.
        :param builtins.str create_time: The created time of the Access Rule.
        :param builtins.str description: The description of the Access Rule.
        :param builtins.str id: The resource ID of Access Rule.
        :param builtins.str network_segment: The NetworkSegment of the Access Rule.
        :param builtins.int priority: The priority of the Access Rule.
        :param builtins.str rw_access_type: RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        """
        pulumi.set(__self__, "access_group_id", access_group_id)
        pulumi.set(__self__, "access_rule_id", access_rule_id)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "network_segment", network_segment)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "rw_access_type", rw_access_type)

    @property
    @pulumi.getter(name="accessGroupId")
    def access_group_id(self) -> builtins.str:
        """
        The resource ID of the Access Group.
        """
        return pulumi.get(self, "access_group_id")

    @property
    @pulumi.getter(name="accessRuleId")
    def access_rule_id(self) -> builtins.str:
        """
        The ID of the Access Rule.
        """
        return pulumi.get(self, "access_rule_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> builtins.str:
        """
        The created time of the Access Rule.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        The description of the Access Rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The resource ID of Access Rule.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="networkSegment")
    def network_segment(self) -> builtins.str:
        """
        The NetworkSegment of the Access Rule.
        """
        return pulumi.get(self, "network_segment")

    @property
    @pulumi.getter
    def priority(self) -> builtins.int:
        """
        The priority of the Access Rule.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="rwAccessType")
    def rw_access_type(self) -> builtins.str:
        """
        RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        """
        return pulumi.get(self, "rw_access_type")


@pulumi.output_type
class GetFileSystemsSystemResult(dict):
    def __init__(__self__, *,
                 create_time: builtins.str,
                 description: builtins.str,
                 file_system_id: builtins.str,
                 file_system_name: builtins.str,
                 id: builtins.str,
                 mount_point_count: builtins.int,
                 number_of_directories: builtins.int,
                 number_of_files: builtins.int,
                 protocol_type: builtins.str,
                 provisioned_throughput_in_mi_bps: builtins.int,
                 space_capacity: builtins.int,
                 storage_package_id: builtins.str,
                 storage_type: builtins.str,
                 throughput_mode: builtins.str,
                 used_space_size: builtins.float,
                 zone_id: builtins.str):
        """
        :param builtins.str create_time: The creation time of the File system.
        :param builtins.str description: The description of the File system.
        :param builtins.str file_system_id: The ID of the File System.
        :param builtins.str file_system_name: The name of the File system.
        :param builtins.str id: The ID of the File System.
        :param builtins.int mount_point_count: The number of Mount points.
        :param builtins.int number_of_directories: The number of directories.
        :param builtins.int number_of_files: The number of files.
        :param builtins.str protocol_type: The protocol type. Valid values: `HDFS`.
        :param builtins.int provisioned_throughput_in_mi_bps: The preset throughput of the File system. Valid values: `1` to `1024`, Unit: MB/s.
        :param builtins.int space_capacity: The capacity budget of the File system.
        :param builtins.str storage_package_id: Storage package Id.
        :param builtins.str storage_type: The storage specifications of the File system. Valid values: `PERFORMANCE`, `STANDARD`.
        :param builtins.str throughput_mode: The throughput mode of the File system. Valid values: `Provisioned`, `Standard`.
        :param builtins.float used_space_size: The used space of the File system.
        :param builtins.str zone_id: The zone ID of the File system.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "file_system_id", file_system_id)
        pulumi.set(__self__, "file_system_name", file_system_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "mount_point_count", mount_point_count)
        pulumi.set(__self__, "number_of_directories", number_of_directories)
        pulumi.set(__self__, "number_of_files", number_of_files)
        pulumi.set(__self__, "protocol_type", protocol_type)
        pulumi.set(__self__, "provisioned_throughput_in_mi_bps", provisioned_throughput_in_mi_bps)
        pulumi.set(__self__, "space_capacity", space_capacity)
        pulumi.set(__self__, "storage_package_id", storage_package_id)
        pulumi.set(__self__, "storage_type", storage_type)
        pulumi.set(__self__, "throughput_mode", throughput_mode)
        pulumi.set(__self__, "used_space_size", used_space_size)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> builtins.str:
        """
        The creation time of the File system.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        The description of the File system.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> builtins.str:
        """
        The ID of the File System.
        """
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter(name="fileSystemName")
    def file_system_name(self) -> builtins.str:
        """
        The name of the File system.
        """
        return pulumi.get(self, "file_system_name")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of the File System.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mountPointCount")
    def mount_point_count(self) -> builtins.int:
        """
        The number of Mount points.
        """
        return pulumi.get(self, "mount_point_count")

    @property
    @pulumi.getter(name="numberOfDirectories")
    def number_of_directories(self) -> builtins.int:
        """
        The number of directories.
        """
        return pulumi.get(self, "number_of_directories")

    @property
    @pulumi.getter(name="numberOfFiles")
    def number_of_files(self) -> builtins.int:
        """
        The number of files.
        """
        return pulumi.get(self, "number_of_files")

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> builtins.str:
        """
        The protocol type. Valid values: `HDFS`.
        """
        return pulumi.get(self, "protocol_type")

    @property
    @pulumi.getter(name="provisionedThroughputInMiBps")
    def provisioned_throughput_in_mi_bps(self) -> builtins.int:
        """
        The preset throughput of the File system. Valid values: `1` to `1024`, Unit: MB/s.
        """
        return pulumi.get(self, "provisioned_throughput_in_mi_bps")

    @property
    @pulumi.getter(name="spaceCapacity")
    def space_capacity(self) -> builtins.int:
        """
        The capacity budget of the File system.
        """
        return pulumi.get(self, "space_capacity")

    @property
    @pulumi.getter(name="storagePackageId")
    def storage_package_id(self) -> builtins.str:
        """
        Storage package Id.
        """
        return pulumi.get(self, "storage_package_id")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> builtins.str:
        """
        The storage specifications of the File system. Valid values: `PERFORMANCE`, `STANDARD`.
        """
        return pulumi.get(self, "storage_type")

    @property
    @pulumi.getter(name="throughputMode")
    def throughput_mode(self) -> builtins.str:
        """
        The throughput mode of the File system. Valid values: `Provisioned`, `Standard`.
        """
        return pulumi.get(self, "throughput_mode")

    @property
    @pulumi.getter(name="usedSpaceSize")
    def used_space_size(self) -> builtins.float:
        """
        The used space of the File system.
        """
        return pulumi.get(self, "used_space_size")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> builtins.str:
        """
        The zone ID of the File system.
        """
        return pulumi.get(self, "zone_id")


@pulumi.output_type
class GetMountPointsPointResult(dict):
    def __init__(__self__, *,
                 access_group_id: builtins.str,
                 create_time: builtins.str,
                 description: builtins.str,
                 file_system_id: builtins.str,
                 id: builtins.str,
                 mount_point_domain: builtins.str,
                 mount_point_id: builtins.str,
                 network_type: builtins.str,
                 status: builtins.str,
                 vpc_id: builtins.str,
                 vswitch_id: builtins.str):
        """
        :param builtins.str access_group_id: The ID of the Access Group.
        :param builtins.str create_time: The created time of the Mount Point.
        :param builtins.str description: The description of the Mount Point.
        :param builtins.str file_system_id: The ID of the File System.
        :param builtins.str id: The ID of the Mount Point.
        :param builtins.str mount_point_domain: The domain name of the Mount Point.
        :param builtins.str mount_point_id: The ID of the Mount Point.
        :param builtins.str network_type: The network type of the Mount Point. Valid values: `VPC`.
        :param builtins.str status: The status of the Mount Point. Valid values: `Active`, `Inactive`.
        :param builtins.str vpc_id: The ID of the VPC network.
        :param builtins.str vswitch_id: The vswitch id.
        """
        pulumi.set(__self__, "access_group_id", access_group_id)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "file_system_id", file_system_id)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "mount_point_domain", mount_point_domain)
        pulumi.set(__self__, "mount_point_id", mount_point_id)
        pulumi.set(__self__, "network_type", network_type)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="accessGroupId")
    def access_group_id(self) -> builtins.str:
        """
        The ID of the Access Group.
        """
        return pulumi.get(self, "access_group_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> builtins.str:
        """
        The created time of the Mount Point.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        The description of the Mount Point.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> builtins.str:
        """
        The ID of the File System.
        """
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of the Mount Point.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mountPointDomain")
    def mount_point_domain(self) -> builtins.str:
        """
        The domain name of the Mount Point.
        """
        return pulumi.get(self, "mount_point_domain")

    @property
    @pulumi.getter(name="mountPointId")
    def mount_point_id(self) -> builtins.str:
        """
        The ID of the Mount Point.
        """
        return pulumi.get(self, "mount_point_id")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> builtins.str:
        """
        The network type of the Mount Point. Valid values: `VPC`.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter
    def status(self) -> builtins.str:
        """
        The status of the Mount Point. Valid values: `Active`, `Inactive`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> builtins.str:
        """
        The ID of the VPC network.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> builtins.str:
        """
        The vswitch id.
        """
        return pulumi.get(self, "vswitch_id")


@pulumi.output_type
class GetZonesZoneResult(dict):
    def __init__(__self__, *,
                 options: Sequence['outputs.GetZonesZoneOptionResult'],
                 zone_id: builtins.str):
        """
        :param Sequence['GetZonesZoneOptionArgs'] options: A list of available configurations of the Zone.
        :param builtins.str zone_id: The zone ID.
        """
        pulumi.set(__self__, "options", options)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def options(self) -> Sequence['outputs.GetZonesZoneOptionResult']:
        """
        A list of available configurations of the Zone.
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> builtins.str:
        """
        The zone ID.
        """
        return pulumi.get(self, "zone_id")


@pulumi.output_type
class GetZonesZoneOptionResult(dict):
    def __init__(__self__, *,
                 protocol_type: builtins.str,
                 storage_type: builtins.str):
        """
        :param builtins.str protocol_type: The protocol type. Valid values: `HDFS`.
        :param builtins.str storage_type: The storage specifications of the File system. Valid values: `PERFORMANCE`, `STANDARD`.
        """
        pulumi.set(__self__, "protocol_type", protocol_type)
        pulumi.set(__self__, "storage_type", storage_type)

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> builtins.str:
        """
        The protocol type. Valid values: `HDFS`.
        """
        return pulumi.get(self, "protocol_type")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> builtins.str:
        """
        The storage specifications of the File system. Valid values: `PERFORMANCE`, `STANDARD`.
        """
        return pulumi.get(self, "storage_type")


