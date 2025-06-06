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

__all__ = [
    'GetBackupPlansPlanResult',
]

@pulumi.output_type
class GetBackupPlansPlanResult(dict):
    def __init__(__self__, *,
                 backup_gateway_id: builtins.str,
                 backup_method: builtins.str,
                 backup_objects: builtins.str,
                 backup_period: builtins.str,
                 backup_plan_id: builtins.str,
                 backup_plan_name: builtins.str,
                 backup_retention_period: builtins.int,
                 backup_start_time: builtins.str,
                 backup_storage_type: builtins.str,
                 cross_aliyun_id: builtins.str,
                 cross_role_name: builtins.str,
                 database_type: builtins.str,
                 duplication_archive_period: builtins.int,
                 duplication_infrequent_access_period: builtins.int,
                 enable_backup_log: builtins.bool,
                 id: builtins.str,
                 instance_class: builtins.str,
                 oss_bucket_name: builtins.str,
                 payment_type: builtins.str,
                 resource_group_id: builtins.str,
                 source_endpoint_database_name: builtins.str,
                 source_endpoint_instance_id: builtins.str,
                 source_endpoint_instance_type: builtins.str,
                 source_endpoint_region: builtins.str,
                 source_endpoint_sid: builtins.str,
                 source_endpoint_user_name: builtins.str,
                 status: builtins.str):
        """
        :param builtins.str backup_gateway_id: The ID of the backup gateway.
        :param builtins.str backup_method: The Backup method.
        :param builtins.str backup_objects: The backup object.
        :param builtins.str backup_period: Full backup cycle.
        :param builtins.str backup_plan_id: The first ID of the resource.
        :param builtins.str backup_plan_name: The name of the resource.
        :param builtins.int backup_retention_period: The retention time of backup data.
        :param builtins.str backup_start_time: The start time of full Backup.
        :param builtins.str backup_storage_type: Built-in storage type.
        :param builtins.str cross_aliyun_id: The UID that is backed up across Alibaba cloud accounts.
        :param builtins.str cross_role_name: The name of the RAM role that is backed up across Alibaba cloud accounts.
        :param builtins.str database_type: The database type.
        :param builtins.int duplication_archive_period: The storage time for conversion to archive cold standby is 365 days by default.
        :param builtins.int duplication_infrequent_access_period: The storage time is converted to low-frequency access. The default time is 180 days.
        :param builtins.bool enable_backup_log: Whether to enable incremental log Backup.
        :param builtins.str id: The ID of the Backup Plan.
        :param builtins.str instance_class: The Instance class.
        :param builtins.str oss_bucket_name: The OSS Bucket name.
        :param builtins.str payment_type: The payment type of the resource.
        :param builtins.str resource_group_id: The ID of the resource group.
        :param builtins.str source_endpoint_database_name: The name of the database.
        :param builtins.str source_endpoint_instance_id: The ID of the database instance.
        :param builtins.str source_endpoint_instance_type: The location of the database.
        :param builtins.str source_endpoint_region: The region of the database.
        :param builtins.str source_endpoint_sid: The Oracle SID name.
        :param builtins.str source_endpoint_user_name: The source endpoint username.
        :param builtins.str status: The status of the resource.
        """
        pulumi.set(__self__, "backup_gateway_id", backup_gateway_id)
        pulumi.set(__self__, "backup_method", backup_method)
        pulumi.set(__self__, "backup_objects", backup_objects)
        pulumi.set(__self__, "backup_period", backup_period)
        pulumi.set(__self__, "backup_plan_id", backup_plan_id)
        pulumi.set(__self__, "backup_plan_name", backup_plan_name)
        pulumi.set(__self__, "backup_retention_period", backup_retention_period)
        pulumi.set(__self__, "backup_start_time", backup_start_time)
        pulumi.set(__self__, "backup_storage_type", backup_storage_type)
        pulumi.set(__self__, "cross_aliyun_id", cross_aliyun_id)
        pulumi.set(__self__, "cross_role_name", cross_role_name)
        pulumi.set(__self__, "database_type", database_type)
        pulumi.set(__self__, "duplication_archive_period", duplication_archive_period)
        pulumi.set(__self__, "duplication_infrequent_access_period", duplication_infrequent_access_period)
        pulumi.set(__self__, "enable_backup_log", enable_backup_log)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_class", instance_class)
        pulumi.set(__self__, "oss_bucket_name", oss_bucket_name)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "source_endpoint_database_name", source_endpoint_database_name)
        pulumi.set(__self__, "source_endpoint_instance_id", source_endpoint_instance_id)
        pulumi.set(__self__, "source_endpoint_instance_type", source_endpoint_instance_type)
        pulumi.set(__self__, "source_endpoint_region", source_endpoint_region)
        pulumi.set(__self__, "source_endpoint_sid", source_endpoint_sid)
        pulumi.set(__self__, "source_endpoint_user_name", source_endpoint_user_name)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="backupGatewayId")
    def backup_gateway_id(self) -> builtins.str:
        """
        The ID of the backup gateway.
        """
        return pulumi.get(self, "backup_gateway_id")

    @property
    @pulumi.getter(name="backupMethod")
    def backup_method(self) -> builtins.str:
        """
        The Backup method.
        """
        return pulumi.get(self, "backup_method")

    @property
    @pulumi.getter(name="backupObjects")
    def backup_objects(self) -> builtins.str:
        """
        The backup object.
        """
        return pulumi.get(self, "backup_objects")

    @property
    @pulumi.getter(name="backupPeriod")
    def backup_period(self) -> builtins.str:
        """
        Full backup cycle.
        """
        return pulumi.get(self, "backup_period")

    @property
    @pulumi.getter(name="backupPlanId")
    def backup_plan_id(self) -> builtins.str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "backup_plan_id")

    @property
    @pulumi.getter(name="backupPlanName")
    def backup_plan_name(self) -> builtins.str:
        """
        The name of the resource.
        """
        return pulumi.get(self, "backup_plan_name")

    @property
    @pulumi.getter(name="backupRetentionPeriod")
    def backup_retention_period(self) -> builtins.int:
        """
        The retention time of backup data.
        """
        return pulumi.get(self, "backup_retention_period")

    @property
    @pulumi.getter(name="backupStartTime")
    def backup_start_time(self) -> builtins.str:
        """
        The start time of full Backup.
        """
        return pulumi.get(self, "backup_start_time")

    @property
    @pulumi.getter(name="backupStorageType")
    def backup_storage_type(self) -> builtins.str:
        """
        Built-in storage type.
        """
        return pulumi.get(self, "backup_storage_type")

    @property
    @pulumi.getter(name="crossAliyunId")
    def cross_aliyun_id(self) -> builtins.str:
        """
        The UID that is backed up across Alibaba cloud accounts.
        """
        return pulumi.get(self, "cross_aliyun_id")

    @property
    @pulumi.getter(name="crossRoleName")
    def cross_role_name(self) -> builtins.str:
        """
        The name of the RAM role that is backed up across Alibaba cloud accounts.
        """
        return pulumi.get(self, "cross_role_name")

    @property
    @pulumi.getter(name="databaseType")
    def database_type(self) -> builtins.str:
        """
        The database type.
        """
        return pulumi.get(self, "database_type")

    @property
    @pulumi.getter(name="duplicationArchivePeriod")
    def duplication_archive_period(self) -> builtins.int:
        """
        The storage time for conversion to archive cold standby is 365 days by default.
        """
        return pulumi.get(self, "duplication_archive_period")

    @property
    @pulumi.getter(name="duplicationInfrequentAccessPeriod")
    def duplication_infrequent_access_period(self) -> builtins.int:
        """
        The storage time is converted to low-frequency access. The default time is 180 days.
        """
        return pulumi.get(self, "duplication_infrequent_access_period")

    @property
    @pulumi.getter(name="enableBackupLog")
    def enable_backup_log(self) -> builtins.bool:
        """
        Whether to enable incremental log Backup.
        """
        return pulumi.get(self, "enable_backup_log")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of the Backup Plan.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceClass")
    def instance_class(self) -> builtins.str:
        """
        The Instance class.
        """
        return pulumi.get(self, "instance_class")

    @property
    @pulumi.getter(name="ossBucketName")
    def oss_bucket_name(self) -> builtins.str:
        """
        The OSS Bucket name.
        """
        return pulumi.get(self, "oss_bucket_name")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> builtins.str:
        """
        The payment type of the resource.
        """
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> builtins.str:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="sourceEndpointDatabaseName")
    def source_endpoint_database_name(self) -> builtins.str:
        """
        The name of the database.
        """
        return pulumi.get(self, "source_endpoint_database_name")

    @property
    @pulumi.getter(name="sourceEndpointInstanceId")
    def source_endpoint_instance_id(self) -> builtins.str:
        """
        The ID of the database instance.
        """
        return pulumi.get(self, "source_endpoint_instance_id")

    @property
    @pulumi.getter(name="sourceEndpointInstanceType")
    def source_endpoint_instance_type(self) -> builtins.str:
        """
        The location of the database.
        """
        return pulumi.get(self, "source_endpoint_instance_type")

    @property
    @pulumi.getter(name="sourceEndpointRegion")
    def source_endpoint_region(self) -> builtins.str:
        """
        The region of the database.
        """
        return pulumi.get(self, "source_endpoint_region")

    @property
    @pulumi.getter(name="sourceEndpointSid")
    def source_endpoint_sid(self) -> builtins.str:
        """
        The Oracle SID name.
        """
        return pulumi.get(self, "source_endpoint_sid")

    @property
    @pulumi.getter(name="sourceEndpointUserName")
    def source_endpoint_user_name(self) -> builtins.str:
        """
        The source endpoint username.
        """
        return pulumi.get(self, "source_endpoint_user_name")

    @property
    @pulumi.getter
    def status(self) -> builtins.str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")


