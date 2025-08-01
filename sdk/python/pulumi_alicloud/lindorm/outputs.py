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
    'GetInstancesInstanceResult',
]

@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 auto_renew: _builtins.str,
                 cold_storage: _builtins.int,
                 create_time: _builtins.str,
                 deletion_proection: _builtins.bool,
                 disk_category: _builtins.str,
                 disk_usage: _builtins.str,
                 disk_warning_threshold: _builtins.str,
                 engine_type: _builtins.int,
                 expired_time: _builtins.str,
                 file_engine_node_count: _builtins.int,
                 file_engine_specification: _builtins.str,
                 id: _builtins.str,
                 instance_id: _builtins.str,
                 instance_name: _builtins.str,
                 instance_storage: _builtins.str,
                 ip_white_lists: Sequence[_builtins.str],
                 lts_node_count: _builtins.int,
                 lts_node_specification: _builtins.str,
                 network_type: _builtins.str,
                 payment_type: _builtins.str,
                 phoenix_node_count: _builtins.int,
                 phoenix_node_specification: _builtins.str,
                 resource_owner_id: _builtins.str,
                 search_engine_node_count: _builtins.int,
                 search_engine_specification: _builtins.str,
                 service_type: _builtins.str,
                 status: _builtins.str,
                 table_engine_node_count: _builtins.int,
                 table_engine_specification: _builtins.str,
                 time_series_engine_node_count: _builtins.int,
                 time_serires_engine_specification: _builtins.str,
                 vpc_id: _builtins.str,
                 vswitch_id: _builtins.str,
                 zone_id: _builtins.str):
        """
        :param _builtins.str auto_renew: AutoRenew.
        :param _builtins.int cold_storage: The cold storage capacity of the instance. Unit: GB.
        :param _builtins.str create_time: The creation date of Instance.
        :param _builtins.bool deletion_proection: The deletion protection of instance.
        :param _builtins.str disk_category: The disk type of instance. Valid values: `capacity_cloud_storage`, `cloud_efficiency`, `cloud_essd`, `cloud_ssd`.
        :param _builtins.str disk_usage: The usage of disk.
        :param _builtins.str disk_warning_threshold: The threshold of disk.
        :param _builtins.int engine_type: The type of Instance engine .
        :param _builtins.str expired_time: The expiration time of Instance.
        :param _builtins.int file_engine_node_count: The count of file engine.
        :param _builtins.str file_engine_specification: The specification of file engine. Valid values: `lindorm.c.xlarge`.
        :param _builtins.str id: The ID of the Instance.
        :param _builtins.str instance_id: The ID of the instance.
        :param _builtins.str instance_name: The name of the instance.
        :param _builtins.str instance_storage: The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB.
        :param Sequence[_builtins.str] ip_white_lists: The ip white list of instance.
        :param _builtins.int lts_node_count: The count of lindorm tunnel service.
        :param _builtins.str lts_node_specification: The specification of lindorm tunnel service. Valid values: `lindorm.g.2xlarge`, `lindorm.g.xlarge`.
        :param _builtins.str network_type: Instance network type, enumerative.VPC.
        :param _builtins.str payment_type: The billing method. Valid values: `PayAsYouGo` and `Subscription`.
        :param _builtins.int phoenix_node_count: The count of phoenix.
        :param _builtins.str phoenix_node_specification: The specification of phoenix. Valid values: `lindorm.c.2xlarge`, `lindorm.c.4xlarge`, `lindorm.c.8xlarge`, `lindorm.c.xlarge`, `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        :param _builtins.str resource_owner_id: The owner id of resource.
        :param _builtins.int search_engine_node_count: The count of search engine.
        :param _builtins.str search_engine_specification: The specification of search engine. Valid values: `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        :param _builtins.str service_type: The service type of Instance, Valid values:  `lindorm`, `serverless_lindorm`, `lindorm_standalone`.
        :param _builtins.str status: The status of Instance, enumerative: Valid values: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`, `INSTANCE_LEVEL_MODIFY`, `NET_MODIFYING`, `RESIZING`, `RESTARTING`, `MINOR_VERSION_TRANSING`.
        :param _builtins.int table_engine_node_count: The count of table engine.
        :param _builtins.str table_engine_specification: The specification of  table engine. Valid values: `lindorm.c.2xlarge`, `lindorm.c.4xlarge`, `lindorm.c.8xlarge`, `lindorm.c.xlarge`, `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        :param _builtins.int time_series_engine_node_count: The count of time series engine.
        :param _builtins.str time_serires_engine_specification: The specification of time series engine. Valid values: `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        :param _builtins.str vpc_id: The ID of the virtual private cloud (VPC) that is connected to the instance.
        :param _builtins.str vswitch_id: The vswitch id.
        :param _builtins.str zone_id: The zone ID of the instance.
        """
        pulumi.set(__self__, "auto_renew", auto_renew)
        pulumi.set(__self__, "cold_storage", cold_storage)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "deletion_proection", deletion_proection)
        pulumi.set(__self__, "disk_category", disk_category)
        pulumi.set(__self__, "disk_usage", disk_usage)
        pulumi.set(__self__, "disk_warning_threshold", disk_warning_threshold)
        pulumi.set(__self__, "engine_type", engine_type)
        pulumi.set(__self__, "expired_time", expired_time)
        pulumi.set(__self__, "file_engine_node_count", file_engine_node_count)
        pulumi.set(__self__, "file_engine_specification", file_engine_specification)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "instance_name", instance_name)
        pulumi.set(__self__, "instance_storage", instance_storage)
        pulumi.set(__self__, "ip_white_lists", ip_white_lists)
        pulumi.set(__self__, "lts_node_count", lts_node_count)
        pulumi.set(__self__, "lts_node_specification", lts_node_specification)
        pulumi.set(__self__, "network_type", network_type)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "phoenix_node_count", phoenix_node_count)
        pulumi.set(__self__, "phoenix_node_specification", phoenix_node_specification)
        pulumi.set(__self__, "resource_owner_id", resource_owner_id)
        pulumi.set(__self__, "search_engine_node_count", search_engine_node_count)
        pulumi.set(__self__, "search_engine_specification", search_engine_specification)
        pulumi.set(__self__, "service_type", service_type)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "table_engine_node_count", table_engine_node_count)
        pulumi.set(__self__, "table_engine_specification", table_engine_specification)
        pulumi.set(__self__, "time_series_engine_node_count", time_series_engine_node_count)
        pulumi.set(__self__, "time_serires_engine_specification", time_serires_engine_specification)
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> _builtins.str:
        """
        AutoRenew.
        """
        return pulumi.get(self, "auto_renew")

    @_builtins.property
    @pulumi.getter(name="coldStorage")
    def cold_storage(self) -> _builtins.int:
        """
        The cold storage capacity of the instance. Unit: GB.
        """
        return pulumi.get(self, "cold_storage")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        """
        The creation date of Instance.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="deletionProection")
    def deletion_proection(self) -> _builtins.bool:
        """
        The deletion protection of instance.
        """
        return pulumi.get(self, "deletion_proection")

    @_builtins.property
    @pulumi.getter(name="diskCategory")
    def disk_category(self) -> _builtins.str:
        """
        The disk type of instance. Valid values: `capacity_cloud_storage`, `cloud_efficiency`, `cloud_essd`, `cloud_ssd`.
        """
        return pulumi.get(self, "disk_category")

    @_builtins.property
    @pulumi.getter(name="diskUsage")
    def disk_usage(self) -> _builtins.str:
        """
        The usage of disk.
        """
        return pulumi.get(self, "disk_usage")

    @_builtins.property
    @pulumi.getter(name="diskWarningThreshold")
    def disk_warning_threshold(self) -> _builtins.str:
        """
        The threshold of disk.
        """
        return pulumi.get(self, "disk_warning_threshold")

    @_builtins.property
    @pulumi.getter(name="engineType")
    def engine_type(self) -> _builtins.int:
        """
        The type of Instance engine .
        """
        return pulumi.get(self, "engine_type")

    @_builtins.property
    @pulumi.getter(name="expiredTime")
    def expired_time(self) -> _builtins.str:
        """
        The expiration time of Instance.
        """
        return pulumi.get(self, "expired_time")

    @_builtins.property
    @pulumi.getter(name="fileEngineNodeCount")
    def file_engine_node_count(self) -> _builtins.int:
        """
        The count of file engine.
        """
        return pulumi.get(self, "file_engine_node_count")

    @_builtins.property
    @pulumi.getter(name="fileEngineSpecification")
    def file_engine_specification(self) -> _builtins.str:
        """
        The specification of file engine. Valid values: `lindorm.c.xlarge`.
        """
        return pulumi.get(self, "file_engine_specification")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Instance.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> _builtins.str:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> _builtins.str:
        """
        The name of the instance.
        """
        return pulumi.get(self, "instance_name")

    @_builtins.property
    @pulumi.getter(name="instanceStorage")
    def instance_storage(self) -> _builtins.str:
        """
        The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB.
        """
        return pulumi.get(self, "instance_storage")

    @_builtins.property
    @pulumi.getter(name="ipWhiteLists")
    def ip_white_lists(self) -> Sequence[_builtins.str]:
        """
        The ip white list of instance.
        """
        return pulumi.get(self, "ip_white_lists")

    @_builtins.property
    @pulumi.getter(name="ltsNodeCount")
    def lts_node_count(self) -> _builtins.int:
        """
        The count of lindorm tunnel service.
        """
        return pulumi.get(self, "lts_node_count")

    @_builtins.property
    @pulumi.getter(name="ltsNodeSpecification")
    def lts_node_specification(self) -> _builtins.str:
        """
        The specification of lindorm tunnel service. Valid values: `lindorm.g.2xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "lts_node_specification")

    @_builtins.property
    @pulumi.getter(name="networkType")
    def network_type(self) -> _builtins.str:
        """
        Instance network type, enumerative.VPC.
        """
        return pulumi.get(self, "network_type")

    @_builtins.property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> _builtins.str:
        """
        The billing method. Valid values: `PayAsYouGo` and `Subscription`.
        """
        return pulumi.get(self, "payment_type")

    @_builtins.property
    @pulumi.getter(name="phoenixNodeCount")
    def phoenix_node_count(self) -> _builtins.int:
        """
        The count of phoenix.
        """
        return pulumi.get(self, "phoenix_node_count")

    @_builtins.property
    @pulumi.getter(name="phoenixNodeSpecification")
    def phoenix_node_specification(self) -> _builtins.str:
        """
        The specification of phoenix. Valid values: `lindorm.c.2xlarge`, `lindorm.c.4xlarge`, `lindorm.c.8xlarge`, `lindorm.c.xlarge`, `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "phoenix_node_specification")

    @_builtins.property
    @pulumi.getter(name="resourceOwnerId")
    def resource_owner_id(self) -> _builtins.str:
        """
        The owner id of resource.
        """
        return pulumi.get(self, "resource_owner_id")

    @_builtins.property
    @pulumi.getter(name="searchEngineNodeCount")
    def search_engine_node_count(self) -> _builtins.int:
        """
        The count of search engine.
        """
        return pulumi.get(self, "search_engine_node_count")

    @_builtins.property
    @pulumi.getter(name="searchEngineSpecification")
    def search_engine_specification(self) -> _builtins.str:
        """
        The specification of search engine. Valid values: `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "search_engine_specification")

    @_builtins.property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> _builtins.str:
        """
        The service type of Instance, Valid values:  `lindorm`, `serverless_lindorm`, `lindorm_standalone`.
        """
        return pulumi.get(self, "service_type")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The status of Instance, enumerative: Valid values: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`, `INSTANCE_LEVEL_MODIFY`, `NET_MODIFYING`, `RESIZING`, `RESTARTING`, `MINOR_VERSION_TRANSING`.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="tableEngineNodeCount")
    def table_engine_node_count(self) -> _builtins.int:
        """
        The count of table engine.
        """
        return pulumi.get(self, "table_engine_node_count")

    @_builtins.property
    @pulumi.getter(name="tableEngineSpecification")
    def table_engine_specification(self) -> _builtins.str:
        """
        The specification of  table engine. Valid values: `lindorm.c.2xlarge`, `lindorm.c.4xlarge`, `lindorm.c.8xlarge`, `lindorm.c.xlarge`, `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "table_engine_specification")

    @_builtins.property
    @pulumi.getter(name="timeSeriesEngineNodeCount")
    def time_series_engine_node_count(self) -> _builtins.int:
        """
        The count of time series engine.
        """
        return pulumi.get(self, "time_series_engine_node_count")

    @_builtins.property
    @pulumi.getter(name="timeSeriresEngineSpecification")
    def time_serires_engine_specification(self) -> _builtins.str:
        """
        The specification of time series engine. Valid values: `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "time_serires_engine_specification")

    @_builtins.property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> _builtins.str:
        """
        The ID of the virtual private cloud (VPC) that is connected to the instance.
        """
        return pulumi.get(self, "vpc_id")

    @_builtins.property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> _builtins.str:
        """
        The vswitch id.
        """
        return pulumi.get(self, "vswitch_id")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        The zone ID of the instance.
        """
        return pulumi.get(self, "zone_id")


