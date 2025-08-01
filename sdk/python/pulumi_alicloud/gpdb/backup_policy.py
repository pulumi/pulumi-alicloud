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

__all__ = ['BackupPolicyArgs', 'BackupPolicy']

@pulumi.input_type
class BackupPolicyArgs:
    def __init__(__self__, *,
                 db_instance_id: pulumi.Input[_builtins.str],
                 preferred_backup_period: pulumi.Input[_builtins.str],
                 preferred_backup_time: pulumi.Input[_builtins.str],
                 backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None,
                 enable_recovery_point: Optional[pulumi.Input[_builtins.bool]] = None,
                 recovery_point_period: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a BackupPolicy resource.
        :param pulumi.Input[_builtins.str] db_instance_id: The instance ID.
               > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
        :param pulumi.Input[_builtins.str] preferred_backup_period: Data backup cycle. Separate multiple values with commas (,). Value Description:
               - **Monday**: Monday.
               - **Tuesday**: Tuesday.
               - **Wednesday**: Wednesday.
               - **Thursday**: Thursday.
               - **Friday**: Friday.
               - **Saturday**: Saturday.
               - **Sunday**: Sunday.
        :param pulumi.Input[_builtins.str] preferred_backup_time: Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
        :param pulumi.Input[_builtins.int] backup_retention_period: Data backup retention days.
        :param pulumi.Input[_builtins.bool] enable_recovery_point: Whether to enable automatic recovery points. Value Description:
               - **true**: enabled.
               - **false**: Closed.
        :param pulumi.Input[_builtins.str] recovery_point_period: Recovery point frequency. Value Description:
               - **1**: Hourly.
               - **2**: Every two hours.
               - **4**: Every four hours.
               - **8**: Every eight hours.
        """
        pulumi.set(__self__, "db_instance_id", db_instance_id)
        pulumi.set(__self__, "preferred_backup_period", preferred_backup_period)
        pulumi.set(__self__, "preferred_backup_time", preferred_backup_time)
        if backup_retention_period is not None:
            pulumi.set(__self__, "backup_retention_period", backup_retention_period)
        if enable_recovery_point is not None:
            pulumi.set(__self__, "enable_recovery_point", enable_recovery_point)
        if recovery_point_period is not None:
            pulumi.set(__self__, "recovery_point_period", recovery_point_period)

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The instance ID.
        > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "db_instance_id", value)

    @_builtins.property
    @pulumi.getter(name="preferredBackupPeriod")
    def preferred_backup_period(self) -> pulumi.Input[_builtins.str]:
        """
        Data backup cycle. Separate multiple values with commas (,). Value Description:
        - **Monday**: Monday.
        - **Tuesday**: Tuesday.
        - **Wednesday**: Wednesday.
        - **Thursday**: Thursday.
        - **Friday**: Friday.
        - **Saturday**: Saturday.
        - **Sunday**: Sunday.
        """
        return pulumi.get(self, "preferred_backup_period")

    @preferred_backup_period.setter
    def preferred_backup_period(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "preferred_backup_period", value)

    @_builtins.property
    @pulumi.getter(name="preferredBackupTime")
    def preferred_backup_time(self) -> pulumi.Input[_builtins.str]:
        """
        Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
        """
        return pulumi.get(self, "preferred_backup_time")

    @preferred_backup_time.setter
    def preferred_backup_time(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "preferred_backup_time", value)

    @_builtins.property
    @pulumi.getter(name="backupRetentionPeriod")
    def backup_retention_period(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Data backup retention days.
        """
        return pulumi.get(self, "backup_retention_period")

    @backup_retention_period.setter
    def backup_retention_period(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "backup_retention_period", value)

    @_builtins.property
    @pulumi.getter(name="enableRecoveryPoint")
    def enable_recovery_point(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to enable automatic recovery points. Value Description:
        - **true**: enabled.
        - **false**: Closed.
        """
        return pulumi.get(self, "enable_recovery_point")

    @enable_recovery_point.setter
    def enable_recovery_point(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enable_recovery_point", value)

    @_builtins.property
    @pulumi.getter(name="recoveryPointPeriod")
    def recovery_point_period(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Recovery point frequency. Value Description:
        - **1**: Hourly.
        - **2**: Every two hours.
        - **4**: Every four hours.
        - **8**: Every eight hours.
        """
        return pulumi.get(self, "recovery_point_period")

    @recovery_point_period.setter
    def recovery_point_period(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recovery_point_period", value)


@pulumi.input_type
class _BackupPolicyState:
    def __init__(__self__, *,
                 backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_recovery_point: Optional[pulumi.Input[_builtins.bool]] = None,
                 preferred_backup_period: Optional[pulumi.Input[_builtins.str]] = None,
                 preferred_backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_point_period: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering BackupPolicy resources.
        :param pulumi.Input[_builtins.int] backup_retention_period: Data backup retention days.
        :param pulumi.Input[_builtins.str] db_instance_id: The instance ID.
               > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
        :param pulumi.Input[_builtins.bool] enable_recovery_point: Whether to enable automatic recovery points. Value Description:
               - **true**: enabled.
               - **false**: Closed.
        :param pulumi.Input[_builtins.str] preferred_backup_period: Data backup cycle. Separate multiple values with commas (,). Value Description:
               - **Monday**: Monday.
               - **Tuesday**: Tuesday.
               - **Wednesday**: Wednesday.
               - **Thursday**: Thursday.
               - **Friday**: Friday.
               - **Saturday**: Saturday.
               - **Sunday**: Sunday.
        :param pulumi.Input[_builtins.str] preferred_backup_time: Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
        :param pulumi.Input[_builtins.str] recovery_point_period: Recovery point frequency. Value Description:
               - **1**: Hourly.
               - **2**: Every two hours.
               - **4**: Every four hours.
               - **8**: Every eight hours.
        """
        if backup_retention_period is not None:
            pulumi.set(__self__, "backup_retention_period", backup_retention_period)
        if db_instance_id is not None:
            pulumi.set(__self__, "db_instance_id", db_instance_id)
        if enable_recovery_point is not None:
            pulumi.set(__self__, "enable_recovery_point", enable_recovery_point)
        if preferred_backup_period is not None:
            pulumi.set(__self__, "preferred_backup_period", preferred_backup_period)
        if preferred_backup_time is not None:
            pulumi.set(__self__, "preferred_backup_time", preferred_backup_time)
        if recovery_point_period is not None:
            pulumi.set(__self__, "recovery_point_period", recovery_point_period)

    @_builtins.property
    @pulumi.getter(name="backupRetentionPeriod")
    def backup_retention_period(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Data backup retention days.
        """
        return pulumi.get(self, "backup_retention_period")

    @backup_retention_period.setter
    def backup_retention_period(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "backup_retention_period", value)

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The instance ID.
        > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "db_instance_id", value)

    @_builtins.property
    @pulumi.getter(name="enableRecoveryPoint")
    def enable_recovery_point(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to enable automatic recovery points. Value Description:
        - **true**: enabled.
        - **false**: Closed.
        """
        return pulumi.get(self, "enable_recovery_point")

    @enable_recovery_point.setter
    def enable_recovery_point(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enable_recovery_point", value)

    @_builtins.property
    @pulumi.getter(name="preferredBackupPeriod")
    def preferred_backup_period(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Data backup cycle. Separate multiple values with commas (,). Value Description:
        - **Monday**: Monday.
        - **Tuesday**: Tuesday.
        - **Wednesday**: Wednesday.
        - **Thursday**: Thursday.
        - **Friday**: Friday.
        - **Saturday**: Saturday.
        - **Sunday**: Sunday.
        """
        return pulumi.get(self, "preferred_backup_period")

    @preferred_backup_period.setter
    def preferred_backup_period(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "preferred_backup_period", value)

    @_builtins.property
    @pulumi.getter(name="preferredBackupTime")
    def preferred_backup_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
        """
        return pulumi.get(self, "preferred_backup_time")

    @preferred_backup_time.setter
    def preferred_backup_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "preferred_backup_time", value)

    @_builtins.property
    @pulumi.getter(name="recoveryPointPeriod")
    def recovery_point_period(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Recovery point frequency. Value Description:
        - **1**: Hourly.
        - **2**: Every two hours.
        - **4**: Every four hours.
        - **8**: Every eight hours.
        """
        return pulumi.get(self, "recovery_point_period")

    @recovery_point_period.setter
    def recovery_point_period(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recovery_point_period", value)


@pulumi.type_token("alicloud:gpdb/backupPolicy:BackupPolicy")
class BackupPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_recovery_point: Optional[pulumi.Input[_builtins.bool]] = None,
                 preferred_backup_period: Optional[pulumi.Input[_builtins.str]] = None,
                 preferred_backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_point_period: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        GPDB Backup Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:gpdb/backupPolicy:BackupPolicy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] backup_retention_period: Data backup retention days.
        :param pulumi.Input[_builtins.str] db_instance_id: The instance ID.
               > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
        :param pulumi.Input[_builtins.bool] enable_recovery_point: Whether to enable automatic recovery points. Value Description:
               - **true**: enabled.
               - **false**: Closed.
        :param pulumi.Input[_builtins.str] preferred_backup_period: Data backup cycle. Separate multiple values with commas (,). Value Description:
               - **Monday**: Monday.
               - **Tuesday**: Tuesday.
               - **Wednesday**: Wednesday.
               - **Thursday**: Thursday.
               - **Friday**: Friday.
               - **Saturday**: Saturday.
               - **Sunday**: Sunday.
        :param pulumi.Input[_builtins.str] preferred_backup_time: Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
        :param pulumi.Input[_builtins.str] recovery_point_period: Recovery point frequency. Value Description:
               - **1**: Hourly.
               - **2**: Every two hours.
               - **4**: Every four hours.
               - **8**: Every eight hours.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        GPDB Backup Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:gpdb/backupPolicy:BackupPolicy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param BackupPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 enable_recovery_point: Optional[pulumi.Input[_builtins.bool]] = None,
                 preferred_backup_period: Optional[pulumi.Input[_builtins.str]] = None,
                 preferred_backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_point_period: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupPolicyArgs.__new__(BackupPolicyArgs)

            __props__.__dict__["backup_retention_period"] = backup_retention_period
            if db_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_instance_id'")
            __props__.__dict__["db_instance_id"] = db_instance_id
            __props__.__dict__["enable_recovery_point"] = enable_recovery_point
            if preferred_backup_period is None and not opts.urn:
                raise TypeError("Missing required property 'preferred_backup_period'")
            __props__.__dict__["preferred_backup_period"] = preferred_backup_period
            if preferred_backup_time is None and not opts.urn:
                raise TypeError("Missing required property 'preferred_backup_time'")
            __props__.__dict__["preferred_backup_time"] = preferred_backup_time
            __props__.__dict__["recovery_point_period"] = recovery_point_period
        super(BackupPolicy, __self__).__init__(
            'alicloud:gpdb/backupPolicy:BackupPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None,
            db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            enable_recovery_point: Optional[pulumi.Input[_builtins.bool]] = None,
            preferred_backup_period: Optional[pulumi.Input[_builtins.str]] = None,
            preferred_backup_time: Optional[pulumi.Input[_builtins.str]] = None,
            recovery_point_period: Optional[pulumi.Input[_builtins.str]] = None) -> 'BackupPolicy':
        """
        Get an existing BackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] backup_retention_period: Data backup retention days.
        :param pulumi.Input[_builtins.str] db_instance_id: The instance ID.
               > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
        :param pulumi.Input[_builtins.bool] enable_recovery_point: Whether to enable automatic recovery points. Value Description:
               - **true**: enabled.
               - **false**: Closed.
        :param pulumi.Input[_builtins.str] preferred_backup_period: Data backup cycle. Separate multiple values with commas (,). Value Description:
               - **Monday**: Monday.
               - **Tuesday**: Tuesday.
               - **Wednesday**: Wednesday.
               - **Thursday**: Thursday.
               - **Friday**: Friday.
               - **Saturday**: Saturday.
               - **Sunday**: Sunday.
        :param pulumi.Input[_builtins.str] preferred_backup_time: Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
        :param pulumi.Input[_builtins.str] recovery_point_period: Recovery point frequency. Value Description:
               - **1**: Hourly.
               - **2**: Every two hours.
               - **4**: Every four hours.
               - **8**: Every eight hours.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupPolicyState.__new__(_BackupPolicyState)

        __props__.__dict__["backup_retention_period"] = backup_retention_period
        __props__.__dict__["db_instance_id"] = db_instance_id
        __props__.__dict__["enable_recovery_point"] = enable_recovery_point
        __props__.__dict__["preferred_backup_period"] = preferred_backup_period
        __props__.__dict__["preferred_backup_time"] = preferred_backup_time
        __props__.__dict__["recovery_point_period"] = recovery_point_period
        return BackupPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="backupRetentionPeriod")
    def backup_retention_period(self) -> pulumi.Output[_builtins.int]:
        """
        Data backup retention days.
        """
        return pulumi.get(self, "backup_retention_period")

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The instance ID.
        > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
        """
        return pulumi.get(self, "db_instance_id")

    @_builtins.property
    @pulumi.getter(name="enableRecoveryPoint")
    def enable_recovery_point(self) -> pulumi.Output[_builtins.bool]:
        """
        Whether to enable automatic recovery points. Value Description:
        - **true**: enabled.
        - **false**: Closed.
        """
        return pulumi.get(self, "enable_recovery_point")

    @_builtins.property
    @pulumi.getter(name="preferredBackupPeriod")
    def preferred_backup_period(self) -> pulumi.Output[_builtins.str]:
        """
        Data backup cycle. Separate multiple values with commas (,). Value Description:
        - **Monday**: Monday.
        - **Tuesday**: Tuesday.
        - **Wednesday**: Wednesday.
        - **Thursday**: Thursday.
        - **Friday**: Friday.
        - **Saturday**: Saturday.
        - **Sunday**: Sunday.
        """
        return pulumi.get(self, "preferred_backup_period")

    @_builtins.property
    @pulumi.getter(name="preferredBackupTime")
    def preferred_backup_time(self) -> pulumi.Output[_builtins.str]:
        """
        Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
        """
        return pulumi.get(self, "preferred_backup_time")

    @_builtins.property
    @pulumi.getter(name="recoveryPointPeriod")
    def recovery_point_period(self) -> pulumi.Output[_builtins.str]:
        """
        Recovery point frequency. Value Description:
        - **1**: Hourly.
        - **2**: Every two hours.
        - **4**: Every four hours.
        - **8**: Every eight hours.
        """
        return pulumi.get(self, "recovery_point_period")

