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
    'EnterpriseSnapshotPolicyCrossRegionCopyInfo',
    'EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion',
    'EnterpriseSnapshotPolicyRetainRule',
    'EnterpriseSnapshotPolicySchedule',
    'EnterpriseSnapshotPolicySpecialRetainRules',
    'EnterpriseSnapshotPolicySpecialRetainRulesRule',
    'EnterpriseSnapshotPolicyStorageRule',
    'SolutionInstanceParameter',
    'GetDedicatedBlockStorageClustersClusterResult',
    'GetDiskReplicaGroupsGroupResult',
    'GetDiskReplicaPairsPairResult',
    'GetRegionsRegionResult',
    'GetRegionsRegionZoneResult',
]

@pulumi.output_type
class EnterpriseSnapshotPolicyCrossRegionCopyInfo(dict):
    def __init__(__self__, *,
                 enabled: Optional[_builtins.bool] = None,
                 regions: Optional[Sequence['outputs.EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion']] = None):
        """
        :param _builtins.bool enabled: Enable Snapshot replication.
        :param Sequence['EnterpriseSnapshotPolicyCrossRegionCopyInfoRegionArgs'] regions: Destination region for Snapshot replication. See `regions` below.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if regions is not None:
            pulumi.set(__self__, "regions", regions)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[_builtins.bool]:
        """
        Enable Snapshot replication.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def regions(self) -> Optional[Sequence['outputs.EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion']]:
        """
        Destination region for Snapshot replication. See `regions` below.
        """
        return pulumi.get(self, "regions")


@pulumi.output_type
class EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "regionId":
            suggest = "region_id"
        elif key == "retainDays":
            suggest = "retain_days"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 region_id: Optional[_builtins.str] = None,
                 retain_days: Optional[_builtins.int] = None):
        """
        :param _builtins.str region_id: Destination region ID.
        :param _builtins.int retain_days: Number of days of snapshot retention for replication.
        """
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)
        if retain_days is not None:
            pulumi.set(__self__, "retain_days", retain_days)

    @_builtins.property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[_builtins.str]:
        """
        Destination region ID.
        """
        return pulumi.get(self, "region_id")

    @_builtins.property
    @pulumi.getter(name="retainDays")
    def retain_days(self) -> Optional[_builtins.int]:
        """
        Number of days of snapshot retention for replication.
        """
        return pulumi.get(self, "retain_days")


@pulumi.output_type
class EnterpriseSnapshotPolicyRetainRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "timeInterval":
            suggest = "time_interval"
        elif key == "timeUnit":
            suggest = "time_unit"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EnterpriseSnapshotPolicyRetainRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EnterpriseSnapshotPolicyRetainRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EnterpriseSnapshotPolicyRetainRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 number: Optional[_builtins.int] = None,
                 time_interval: Optional[_builtins.int] = None,
                 time_unit: Optional[_builtins.str] = None):
        """
        :param _builtins.int number: Retention based on counting method.
        :param _builtins.int time_interval: Time unit.
        :param _builtins.str time_unit: Time-based retention.
        """
        if number is not None:
            pulumi.set(__self__, "number", number)
        if time_interval is not None:
            pulumi.set(__self__, "time_interval", time_interval)
        if time_unit is not None:
            pulumi.set(__self__, "time_unit", time_unit)

    @_builtins.property
    @pulumi.getter
    def number(self) -> Optional[_builtins.int]:
        """
        Retention based on counting method.
        """
        return pulumi.get(self, "number")

    @_builtins.property
    @pulumi.getter(name="timeInterval")
    def time_interval(self) -> Optional[_builtins.int]:
        """
        Time unit.
        """
        return pulumi.get(self, "time_interval")

    @_builtins.property
    @pulumi.getter(name="timeUnit")
    def time_unit(self) -> Optional[_builtins.str]:
        """
        Time-based retention.
        """
        return pulumi.get(self, "time_unit")


@pulumi.output_type
class EnterpriseSnapshotPolicySchedule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "cronExpression":
            suggest = "cron_expression"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EnterpriseSnapshotPolicySchedule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EnterpriseSnapshotPolicySchedule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EnterpriseSnapshotPolicySchedule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 cron_expression: _builtins.str):
        """
        :param _builtins.str cron_expression: CronTab expression.
        """
        pulumi.set(__self__, "cron_expression", cron_expression)

    @_builtins.property
    @pulumi.getter(name="cronExpression")
    def cron_expression(self) -> _builtins.str:
        """
        CronTab expression.
        """
        return pulumi.get(self, "cron_expression")


@pulumi.output_type
class EnterpriseSnapshotPolicySpecialRetainRules(dict):
    def __init__(__self__, *,
                 enabled: Optional[_builtins.bool] = None,
                 rules: Optional[Sequence['outputs.EnterpriseSnapshotPolicySpecialRetainRulesRule']] = None):
        """
        :param _builtins.bool enabled: Whether special reservations are enabled. Value range:
               - true
               - false.
        :param Sequence['EnterpriseSnapshotPolicySpecialRetainRulesRuleArgs'] rules: List of special retention rules. See `rules` below.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[_builtins.bool]:
        """
        Whether special reservations are enabled. Value range:
        - true
        - false.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Optional[Sequence['outputs.EnterpriseSnapshotPolicySpecialRetainRulesRule']]:
        """
        List of special retention rules. See `rules` below.
        """
        return pulumi.get(self, "rules")


@pulumi.output_type
class EnterpriseSnapshotPolicySpecialRetainRulesRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "specialPeriodUnit":
            suggest = "special_period_unit"
        elif key == "timeInterval":
            suggest = "time_interval"
        elif key == "timeUnit":
            suggest = "time_unit"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EnterpriseSnapshotPolicySpecialRetainRulesRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EnterpriseSnapshotPolicySpecialRetainRulesRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EnterpriseSnapshotPolicySpecialRetainRulesRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 special_period_unit: Optional[_builtins.str] = None,
                 time_interval: Optional[_builtins.int] = None,
                 time_unit: Optional[_builtins.str] = None):
        """
        :param _builtins.str special_period_unit: The cycle unit of the special reserved snapshot. If the value is set to WEEKS, the first snapshot of each week is reserved. The retention time is determined by TimeUnit and TimeInterval. The value range is:
               - WEEKS
               - MONTHS
               - YEARS.
        """
        if special_period_unit is not None:
            pulumi.set(__self__, "special_period_unit", special_period_unit)
        if time_interval is not None:
            pulumi.set(__self__, "time_interval", time_interval)
        if time_unit is not None:
            pulumi.set(__self__, "time_unit", time_unit)

    @_builtins.property
    @pulumi.getter(name="specialPeriodUnit")
    def special_period_unit(self) -> Optional[_builtins.str]:
        """
        The cycle unit of the special reserved snapshot. If the value is set to WEEKS, the first snapshot of each week is reserved. The retention time is determined by TimeUnit and TimeInterval. The value range is:
        - WEEKS
        - MONTHS
        - YEARS.
        """
        return pulumi.get(self, "special_period_unit")

    @_builtins.property
    @pulumi.getter(name="timeInterval")
    def time_interval(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "time_interval")

    @_builtins.property
    @pulumi.getter(name="timeUnit")
    def time_unit(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "time_unit")


@pulumi.output_type
class EnterpriseSnapshotPolicyStorageRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "enableImmediateAccess":
            suggest = "enable_immediate_access"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EnterpriseSnapshotPolicyStorageRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EnterpriseSnapshotPolicyStorageRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EnterpriseSnapshotPolicyStorageRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enable_immediate_access: Optional[_builtins.bool] = None):
        """
        :param _builtins.bool enable_immediate_access: Snapshot speed available.
        """
        if enable_immediate_access is not None:
            pulumi.set(__self__, "enable_immediate_access", enable_immediate_access)

    @_builtins.property
    @pulumi.getter(name="enableImmediateAccess")
    def enable_immediate_access(self) -> Optional[_builtins.bool]:
        """
        Snapshot speed available.
        """
        return pulumi.get(self, "enable_immediate_access")


@pulumi.output_type
class SolutionInstanceParameter(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "parameterKey":
            suggest = "parameter_key"
        elif key == "parameterValue":
            suggest = "parameter_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SolutionInstanceParameter. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SolutionInstanceParameter.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SolutionInstanceParameter.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 parameter_key: _builtins.str,
                 parameter_value: _builtins.str):
        """
        :param _builtins.str parameter_key: Create parameter Key.
        :param _builtins.str parameter_value: Create parameter Value.
        """
        pulumi.set(__self__, "parameter_key", parameter_key)
        pulumi.set(__self__, "parameter_value", parameter_value)

    @_builtins.property
    @pulumi.getter(name="parameterKey")
    def parameter_key(self) -> _builtins.str:
        """
        Create parameter Key.
        """
        return pulumi.get(self, "parameter_key")

    @_builtins.property
    @pulumi.getter(name="parameterValue")
    def parameter_value(self) -> _builtins.str:
        """
        Create parameter Value.
        """
        return pulumi.get(self, "parameter_value")


@pulumi.output_type
class GetDedicatedBlockStorageClustersClusterResult(dict):
    def __init__(__self__, *,
                 available_capacity: _builtins.str,
                 category: _builtins.str,
                 create_time: _builtins.str,
                 dedicated_block_storage_cluster_id: _builtins.str,
                 dedicated_block_storage_cluster_name: _builtins.str,
                 delivery_capacity: _builtins.str,
                 description: _builtins.str,
                 expired_time: _builtins.str,
                 id: _builtins.str,
                 performance_level: _builtins.str,
                 resource_group_id: _builtins.str,
                 status: _builtins.str,
                 supported_category: _builtins.str,
                 total_capacity: _builtins.str,
                 type: _builtins.str,
                 used_capacity: _builtins.str,
                 zone_id: _builtins.str):
        """
        :param _builtins.str available_capacity: The available capacity of the dedicated block storage cluster. Unit: GiB.
        :param _builtins.str category: The type of cloud disk that can be created by a dedicated block storage cluster.
        :param _builtins.str create_time: The creation time of the resource
        :param _builtins.str dedicated_block_storage_cluster_id: The first ID of the resource
        :param _builtins.str dedicated_block_storage_cluster_name: The name of the resource
        :param _builtins.str delivery_capacity: Capacity to be delivered in GB.
        :param _builtins.str description: The description of the dedicated block storage cluster.
        :param _builtins.str expired_time: The expiration time of the dedicated block storage cluster, in the Unix timestamp format, in seconds.
        :param _builtins.str performance_level: Cloud disk performance level, possible values:-PL0.-PL1.-PL2.-PL3.> Only valid in SupportedCategory = cloud_essd.
        :param _builtins.str resource_group_id: The ID of the resource group
        :param _builtins.str status: The status of the resource
        :param _builtins.str supported_category: This parameter is not supported.
        :param _builtins.str total_capacity: The total capacity of the dedicated block storage cluster. Unit: GiB.
        :param _builtins.str type: The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
        :param _builtins.str used_capacity: The used (created disk) capacity of the current cluster, in GB
        :param _builtins.str zone_id: The zone ID  of the resource
        """
        pulumi.set(__self__, "available_capacity", available_capacity)
        pulumi.set(__self__, "category", category)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "dedicated_block_storage_cluster_id", dedicated_block_storage_cluster_id)
        pulumi.set(__self__, "dedicated_block_storage_cluster_name", dedicated_block_storage_cluster_name)
        pulumi.set(__self__, "delivery_capacity", delivery_capacity)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "expired_time", expired_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "performance_level", performance_level)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "supported_category", supported_category)
        pulumi.set(__self__, "total_capacity", total_capacity)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "used_capacity", used_capacity)
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="availableCapacity")
    def available_capacity(self) -> _builtins.str:
        """
        The available capacity of the dedicated block storage cluster. Unit: GiB.
        """
        return pulumi.get(self, "available_capacity")

    @_builtins.property
    @pulumi.getter
    def category(self) -> _builtins.str:
        """
        The type of cloud disk that can be created by a dedicated block storage cluster.
        """
        return pulumi.get(self, "category")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="dedicatedBlockStorageClusterId")
    def dedicated_block_storage_cluster_id(self) -> _builtins.str:
        """
        The first ID of the resource
        """
        return pulumi.get(self, "dedicated_block_storage_cluster_id")

    @_builtins.property
    @pulumi.getter(name="dedicatedBlockStorageClusterName")
    def dedicated_block_storage_cluster_name(self) -> _builtins.str:
        """
        The name of the resource
        """
        return pulumi.get(self, "dedicated_block_storage_cluster_name")

    @_builtins.property
    @pulumi.getter(name="deliveryCapacity")
    def delivery_capacity(self) -> _builtins.str:
        """
        Capacity to be delivered in GB.
        """
        return pulumi.get(self, "delivery_capacity")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the dedicated block storage cluster.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="expiredTime")
    def expired_time(self) -> _builtins.str:
        """
        The expiration time of the dedicated block storage cluster, in the Unix timestamp format, in seconds.
        """
        return pulumi.get(self, "expired_time")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="performanceLevel")
    def performance_level(self) -> _builtins.str:
        """
        Cloud disk performance level, possible values:-PL0.-PL1.-PL2.-PL3.> Only valid in SupportedCategory = cloud_essd.
        """
        return pulumi.get(self, "performance_level")

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> _builtins.str:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="supportedCategory")
    def supported_category(self) -> _builtins.str:
        """
        This parameter is not supported.
        """
        return pulumi.get(self, "supported_category")

    @_builtins.property
    @pulumi.getter(name="totalCapacity")
    def total_capacity(self) -> _builtins.str:
        """
        The total capacity of the dedicated block storage cluster. Unit: GiB.
        """
        return pulumi.get(self, "total_capacity")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="usedCapacity")
    def used_capacity(self) -> _builtins.str:
        """
        The used (created disk) capacity of the current cluster, in GB
        """
        return pulumi.get(self, "used_capacity")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        The zone ID  of the resource
        """
        return pulumi.get(self, "zone_id")


@pulumi.output_type
class GetDiskReplicaGroupsGroupResult(dict):
    def __init__(__self__, *,
                 description: _builtins.str,
                 destination_region_id: _builtins.str,
                 destination_zone_id: _builtins.str,
                 group_name: _builtins.str,
                 id: _builtins.str,
                 last_recover_point: _builtins.str,
                 primary_region: _builtins.str,
                 primary_zone: _builtins.str,
                 replica_group_id: _builtins.str,
                 rpo: _builtins.int,
                 site: _builtins.str,
                 source_region_id: _builtins.str,
                 source_zone_id: _builtins.str,
                 standby_region: _builtins.str,
                 standby_zone: _builtins.str,
                 status: _builtins.str):
        """
        :param _builtins.str description: The description of the consistent replication group.
        :param _builtins.str destination_region_id: The ID of the region to which the disaster recovery site belongs.
        :param _builtins.str destination_zone_id: The ID of the zone to which the disaster recovery site belongs.
        :param _builtins.str group_name: Consistent replication group name.
        :param _builtins.str id: The ID of the Disk Replica Group.
        :param _builtins.str primary_region: The initial source region of the replication group.
        :param _builtins.str primary_zone: The initial source available area of the replication group.
        :param _builtins.str replica_group_id: The ID of the consistent replication group.
        :param _builtins.int rpo: The recovery point objective (RPO) of the replication pair-consistent group.
        :param _builtins.str site: Site information sources for replication pairs and consistent replication groups.
        :param _builtins.str source_region_id: The ID of the region to which the production site belongs.
        :param _builtins.str source_zone_id: The ID of the zone to which the production site belongs.
        :param _builtins.str standby_region: The initial destination region of the replication group.
        :param _builtins.str standby_zone: The initial destination zone of the replication group.
        :param _builtins.str status: The status of the consistent replication group. Possible values:
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "destination_region_id", destination_region_id)
        pulumi.set(__self__, "destination_zone_id", destination_zone_id)
        pulumi.set(__self__, "group_name", group_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "last_recover_point", last_recover_point)
        pulumi.set(__self__, "primary_region", primary_region)
        pulumi.set(__self__, "primary_zone", primary_zone)
        pulumi.set(__self__, "replica_group_id", replica_group_id)
        pulumi.set(__self__, "rpo", rpo)
        pulumi.set(__self__, "site", site)
        pulumi.set(__self__, "source_region_id", source_region_id)
        pulumi.set(__self__, "source_zone_id", source_zone_id)
        pulumi.set(__self__, "standby_region", standby_region)
        pulumi.set(__self__, "standby_zone", standby_zone)
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the consistent replication group.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="destinationRegionId")
    def destination_region_id(self) -> _builtins.str:
        """
        The ID of the region to which the disaster recovery site belongs.
        """
        return pulumi.get(self, "destination_region_id")

    @_builtins.property
    @pulumi.getter(name="destinationZoneId")
    def destination_zone_id(self) -> _builtins.str:
        """
        The ID of the zone to which the disaster recovery site belongs.
        """
        return pulumi.get(self, "destination_zone_id")

    @_builtins.property
    @pulumi.getter(name="groupName")
    def group_name(self) -> _builtins.str:
        """
        Consistent replication group name.
        """
        return pulumi.get(self, "group_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Disk Replica Group.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="lastRecoverPoint")
    def last_recover_point(self) -> _builtins.str:
        return pulumi.get(self, "last_recover_point")

    @_builtins.property
    @pulumi.getter(name="primaryRegion")
    def primary_region(self) -> _builtins.str:
        """
        The initial source region of the replication group.
        """
        return pulumi.get(self, "primary_region")

    @_builtins.property
    @pulumi.getter(name="primaryZone")
    def primary_zone(self) -> _builtins.str:
        """
        The initial source available area of the replication group.
        """
        return pulumi.get(self, "primary_zone")

    @_builtins.property
    @pulumi.getter(name="replicaGroupId")
    def replica_group_id(self) -> _builtins.str:
        """
        The ID of the consistent replication group.
        """
        return pulumi.get(self, "replica_group_id")

    @_builtins.property
    @pulumi.getter
    def rpo(self) -> _builtins.int:
        """
        The recovery point objective (RPO) of the replication pair-consistent group.
        """
        return pulumi.get(self, "rpo")

    @_builtins.property
    @pulumi.getter
    def site(self) -> _builtins.str:
        """
        Site information sources for replication pairs and consistent replication groups.
        """
        return pulumi.get(self, "site")

    @_builtins.property
    @pulumi.getter(name="sourceRegionId")
    def source_region_id(self) -> _builtins.str:
        """
        The ID of the region to which the production site belongs.
        """
        return pulumi.get(self, "source_region_id")

    @_builtins.property
    @pulumi.getter(name="sourceZoneId")
    def source_zone_id(self) -> _builtins.str:
        """
        The ID of the zone to which the production site belongs.
        """
        return pulumi.get(self, "source_zone_id")

    @_builtins.property
    @pulumi.getter(name="standbyRegion")
    def standby_region(self) -> _builtins.str:
        """
        The initial destination region of the replication group.
        """
        return pulumi.get(self, "standby_region")

    @_builtins.property
    @pulumi.getter(name="standbyZone")
    def standby_zone(self) -> _builtins.str:
        """
        The initial destination zone of the replication group.
        """
        return pulumi.get(self, "standby_zone")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The status of the consistent replication group. Possible values:
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetDiskReplicaPairsPairResult(dict):
    def __init__(__self__, *,
                 bandwidth: _builtins.str,
                 description: _builtins.str,
                 destination_disk_id: _builtins.str,
                 destination_region_id: _builtins.str,
                 destination_zone_id: _builtins.str,
                 disk_id: _builtins.str,
                 id: _builtins.str,
                 pair_name: _builtins.str,
                 payment_type: _builtins.str,
                 replica_pair_id: _builtins.str,
                 resource_group_id: _builtins.str,
                 rpo: _builtins.str,
                 source_zone_id: _builtins.str,
                 status: _builtins.str):
        """
        :param _builtins.str bandwidth: The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
        :param _builtins.str description: The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
        :param _builtins.str destination_disk_id: The ID of the standby disk.
        :param _builtins.str destination_region_id: The ID of the region to which the disaster recovery site belongs.
        :param _builtins.str destination_zone_id: The ID of the zone to which the disaster recovery site belongs.
        :param _builtins.str disk_id: The ID of the primary disk.
        :param _builtins.str pair_name: The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
        :param _builtins.str payment_type: The payment type of the resource.
        :param _builtins.str replica_pair_id: The first ID of the resource
        :param _builtins.str resource_group_id: The ID of the resource group
        :param _builtins.str rpo: The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
        :param _builtins.str source_zone_id: The ID of the zone to which the production site belongs.
        :param _builtins.str status: The status of the resource.
        """
        pulumi.set(__self__, "bandwidth", bandwidth)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "destination_disk_id", destination_disk_id)
        pulumi.set(__self__, "destination_region_id", destination_region_id)
        pulumi.set(__self__, "destination_zone_id", destination_zone_id)
        pulumi.set(__self__, "disk_id", disk_id)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "pair_name", pair_name)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "replica_pair_id", replica_pair_id)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "rpo", rpo)
        pulumi.set(__self__, "source_zone_id", source_zone_id)
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def bandwidth(self) -> _builtins.str:
        """
        The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
        """
        return pulumi.get(self, "bandwidth")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="destinationDiskId")
    def destination_disk_id(self) -> _builtins.str:
        """
        The ID of the standby disk.
        """
        return pulumi.get(self, "destination_disk_id")

    @_builtins.property
    @pulumi.getter(name="destinationRegionId")
    def destination_region_id(self) -> _builtins.str:
        """
        The ID of the region to which the disaster recovery site belongs.
        """
        return pulumi.get(self, "destination_region_id")

    @_builtins.property
    @pulumi.getter(name="destinationZoneId")
    def destination_zone_id(self) -> _builtins.str:
        """
        The ID of the zone to which the disaster recovery site belongs.
        """
        return pulumi.get(self, "destination_zone_id")

    @_builtins.property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> _builtins.str:
        """
        The ID of the primary disk.
        """
        return pulumi.get(self, "disk_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="pairName")
    def pair_name(self) -> _builtins.str:
        """
        The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
        """
        return pulumi.get(self, "pair_name")

    @_builtins.property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> _builtins.str:
        """
        The payment type of the resource.
        """
        return pulumi.get(self, "payment_type")

    @_builtins.property
    @pulumi.getter(name="replicaPairId")
    def replica_pair_id(self) -> _builtins.str:
        """
        The first ID of the resource
        """
        return pulumi.get(self, "replica_pair_id")

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> _builtins.str:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @_builtins.property
    @pulumi.getter
    def rpo(self) -> _builtins.str:
        """
        The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
        """
        return pulumi.get(self, "rpo")

    @_builtins.property
    @pulumi.getter(name="sourceZoneId")
    def source_zone_id(self) -> _builtins.str:
        """
        The ID of the zone to which the production site belongs.
        """
        return pulumi.get(self, "source_zone_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetRegionsRegionResult(dict):
    def __init__(__self__, *,
                 region_id: _builtins.str,
                 zones: Sequence['outputs.GetRegionsRegionZoneResult']):
        """
        :param _builtins.str region_id: The ID of the region.
        :param Sequence['GetRegionsRegionZoneArgs'] zones: A list of Ebs Zones.
        """
        pulumi.set(__self__, "region_id", region_id)
        pulumi.set(__self__, "zones", zones)

    @_builtins.property
    @pulumi.getter(name="regionId")
    def region_id(self) -> _builtins.str:
        """
        The ID of the region.
        """
        return pulumi.get(self, "region_id")

    @_builtins.property
    @pulumi.getter
    def zones(self) -> Sequence['outputs.GetRegionsRegionZoneResult']:
        """
        A list of Ebs Zones.
        """
        return pulumi.get(self, "zones")


@pulumi.output_type
class GetRegionsRegionZoneResult(dict):
    def __init__(__self__, *,
                 zone_id: _builtins.str):
        """
        :param _builtins.str zone_id: The ID of the zone.
        """
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        The ID of the zone.
        """
        return pulumi.get(self, "zone_id")


