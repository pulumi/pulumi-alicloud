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

__all__ = [
    'GetInstancesInstanceResult',
]

@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 auto_renew: str,
                 cold_storage: int,
                 create_time: str,
                 deletion_proection: bool,
                 disk_category: str,
                 disk_usage: str,
                 disk_warning_threshold: str,
                 engine_type: int,
                 expired_time: str,
                 file_engine_node_count: int,
                 file_engine_specification: str,
                 id: str,
                 instance_id: str,
                 instance_name: str,
                 instance_storage: str,
                 ip_white_lists: Sequence[str],
                 lts_node_count: int,
                 lts_node_specification: str,
                 network_type: str,
                 payment_type: str,
                 phoenix_node_count: int,
                 phoenix_node_specification: str,
                 resource_owner_id: str,
                 search_engine_node_count: int,
                 search_engine_specification: str,
                 service_type: str,
                 status: str,
                 table_engine_node_count: int,
                 table_engine_specification: str,
                 time_series_engine_node_count: int,
                 time_serires_engine_specification: str,
                 vpc_id: str,
                 vswitch_id: str,
                 zone_id: str):
        """
        :param str auto_renew: AutoRenew.
        :param int cold_storage: The cold storage capacity of the instance. Unit: GB.
        :param str create_time: The creation date of Instance.
        :param bool deletion_proection: The deletion protection of instance.
        :param str disk_category: The disk type of instance. Valid values: `capacity_cloud_storage`, `cloud_efficiency`, `cloud_essd`, `cloud_ssd`.
        :param str disk_usage: The usage of disk.
        :param str disk_warning_threshold: The threshold of disk.
        :param int engine_type: The type of Instance engine .
        :param str expired_time: The expiration time of Instance.
        :param int file_engine_node_count: The count of file engine.
        :param str file_engine_specification: The specification of file engine. Valid values: `lindorm.c.xlarge`.
        :param str id: The ID of the Instance.
        :param str instance_id: The ID of the instance.
        :param str instance_name: The name of the instance.
        :param str instance_storage: The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB.
        :param Sequence[str] ip_white_lists: The ip white list of instance.
        :param int lts_node_count: The count of lindorm tunnel service.
        :param str lts_node_specification: The specification of lindorm tunnel service. Valid values: `lindorm.g.2xlarge`, `lindorm.g.xlarge`.
        :param str network_type: Instance network type, enumerative.VPC.
        :param str payment_type: The billing method. Valid values: `PayAsYouGo` and `Subscription`.
        :param int phoenix_node_count: The count of phoenix.
        :param str phoenix_node_specification: The specification of phoenix. Valid values: `lindorm.c.2xlarge`, `lindorm.c.4xlarge`, `lindorm.c.8xlarge`, `lindorm.c.xlarge`, `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        :param str resource_owner_id: The owner id of resource.
        :param int search_engine_node_count: The count of search engine.
        :param str search_engine_specification: The specification of search engine. Valid values: `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        :param str service_type: The service type of Instance, Valid values:  `lindorm`, `serverless_lindorm`, `lindorm_standalone`.
        :param str status: The status of Instance, enumerative: Valid values: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`, `INSTANCE_LEVEL_MODIFY`, `NET_MODIFYING`, `RESIZING`, `RESTARTING`, `MINOR_VERSION_TRANSING`.
        :param int table_engine_node_count: The count of table engine.
        :param str table_engine_specification: The specification of  table engine. Valid values: `lindorm.c.2xlarge`, `lindorm.c.4xlarge`, `lindorm.c.8xlarge`, `lindorm.c.xlarge`, `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        :param int time_series_engine_node_count: The count of time series engine.
        :param str time_serires_engine_specification: The specification of time series engine. Valid values: `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        :param str vpc_id: The ID of the virtual private cloud (VPC) that is connected to the instance.
        :param str vswitch_id: The vswitch id.
        :param str zone_id: The zone ID of the instance.
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

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> str:
        """
        AutoRenew.
        """
        return pulumi.get(self, "auto_renew")

    @property
    @pulumi.getter(name="coldStorage")
    def cold_storage(self) -> int:
        """
        The cold storage capacity of the instance. Unit: GB.
        """
        return pulumi.get(self, "cold_storage")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation date of Instance.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="deletionProection")
    def deletion_proection(self) -> bool:
        """
        The deletion protection of instance.
        """
        return pulumi.get(self, "deletion_proection")

    @property
    @pulumi.getter(name="diskCategory")
    def disk_category(self) -> str:
        """
        The disk type of instance. Valid values: `capacity_cloud_storage`, `cloud_efficiency`, `cloud_essd`, `cloud_ssd`.
        """
        return pulumi.get(self, "disk_category")

    @property
    @pulumi.getter(name="diskUsage")
    def disk_usage(self) -> str:
        """
        The usage of disk.
        """
        return pulumi.get(self, "disk_usage")

    @property
    @pulumi.getter(name="diskWarningThreshold")
    def disk_warning_threshold(self) -> str:
        """
        The threshold of disk.
        """
        return pulumi.get(self, "disk_warning_threshold")

    @property
    @pulumi.getter(name="engineType")
    def engine_type(self) -> int:
        """
        The type of Instance engine .
        """
        return pulumi.get(self, "engine_type")

    @property
    @pulumi.getter(name="expiredTime")
    def expired_time(self) -> str:
        """
        The expiration time of Instance.
        """
        return pulumi.get(self, "expired_time")

    @property
    @pulumi.getter(name="fileEngineNodeCount")
    def file_engine_node_count(self) -> int:
        """
        The count of file engine.
        """
        return pulumi.get(self, "file_engine_node_count")

    @property
    @pulumi.getter(name="fileEngineSpecification")
    def file_engine_specification(self) -> str:
        """
        The specification of file engine. Valid values: `lindorm.c.xlarge`.
        """
        return pulumi.get(self, "file_engine_specification")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> str:
        """
        The name of the instance.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="instanceStorage")
    def instance_storage(self) -> str:
        """
        The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB.
        """
        return pulumi.get(self, "instance_storage")

    @property
    @pulumi.getter(name="ipWhiteLists")
    def ip_white_lists(self) -> Sequence[str]:
        """
        The ip white list of instance.
        """
        return pulumi.get(self, "ip_white_lists")

    @property
    @pulumi.getter(name="ltsNodeCount")
    def lts_node_count(self) -> int:
        """
        The count of lindorm tunnel service.
        """
        return pulumi.get(self, "lts_node_count")

    @property
    @pulumi.getter(name="ltsNodeSpecification")
    def lts_node_specification(self) -> str:
        """
        The specification of lindorm tunnel service. Valid values: `lindorm.g.2xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "lts_node_specification")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> str:
        """
        Instance network type, enumerative.VPC.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> str:
        """
        The billing method. Valid values: `PayAsYouGo` and `Subscription`.
        """
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter(name="phoenixNodeCount")
    def phoenix_node_count(self) -> int:
        """
        The count of phoenix.
        """
        return pulumi.get(self, "phoenix_node_count")

    @property
    @pulumi.getter(name="phoenixNodeSpecification")
    def phoenix_node_specification(self) -> str:
        """
        The specification of phoenix. Valid values: `lindorm.c.2xlarge`, `lindorm.c.4xlarge`, `lindorm.c.8xlarge`, `lindorm.c.xlarge`, `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "phoenix_node_specification")

    @property
    @pulumi.getter(name="resourceOwnerId")
    def resource_owner_id(self) -> str:
        """
        The owner id of resource.
        """
        return pulumi.get(self, "resource_owner_id")

    @property
    @pulumi.getter(name="searchEngineNodeCount")
    def search_engine_node_count(self) -> int:
        """
        The count of search engine.
        """
        return pulumi.get(self, "search_engine_node_count")

    @property
    @pulumi.getter(name="searchEngineSpecification")
    def search_engine_specification(self) -> str:
        """
        The specification of search engine. Valid values: `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "search_engine_specification")

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> str:
        """
        The service type of Instance, Valid values:  `lindorm`, `serverless_lindorm`, `lindorm_standalone`.
        """
        return pulumi.get(self, "service_type")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of Instance, enumerative: Valid values: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`, `INSTANCE_LEVEL_MODIFY`, `NET_MODIFYING`, `RESIZING`, `RESTARTING`, `MINOR_VERSION_TRANSING`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="tableEngineNodeCount")
    def table_engine_node_count(self) -> int:
        """
        The count of table engine.
        """
        return pulumi.get(self, "table_engine_node_count")

    @property
    @pulumi.getter(name="tableEngineSpecification")
    def table_engine_specification(self) -> str:
        """
        The specification of  table engine. Valid values: `lindorm.c.2xlarge`, `lindorm.c.4xlarge`, `lindorm.c.8xlarge`, `lindorm.c.xlarge`, `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "table_engine_specification")

    @property
    @pulumi.getter(name="timeSeriesEngineNodeCount")
    def time_series_engine_node_count(self) -> int:
        """
        The count of time series engine.
        """
        return pulumi.get(self, "time_series_engine_node_count")

    @property
    @pulumi.getter(name="timeSeriresEngineSpecification")
    def time_serires_engine_specification(self) -> str:
        """
        The specification of time series engine. Valid values: `lindorm.g.2xlarge`, `lindorm.g.4xlarge`, `lindorm.g.8xlarge`, `lindorm.g.xlarge`.
        """
        return pulumi.get(self, "time_serires_engine_specification")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        The ID of the virtual private cloud (VPC) that is connected to the instance.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> str:
        """
        The vswitch id.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The zone ID of the instance.
        """
        return pulumi.get(self, "zone_id")


