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
                 db_cluster_id: pulumi.Input[_builtins.str],
                 preferred_backup_periods: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 preferred_backup_time: pulumi.Input[_builtins.str],
                 backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a BackupPolicy resource.
        :param pulumi.Input[_builtins.str] db_cluster_id: The id of the DBCluster.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] preferred_backup_periods: DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        :param pulumi.Input[_builtins.str] preferred_backup_time: DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        :param pulumi.Input[_builtins.int] backup_retention_period: Data backup days. Valid values: `7` to `730`.
        """
        pulumi.set(__self__, "db_cluster_id", db_cluster_id)
        pulumi.set(__self__, "preferred_backup_periods", preferred_backup_periods)
        pulumi.set(__self__, "preferred_backup_time", preferred_backup_time)
        if backup_retention_period is not None:
            pulumi.set(__self__, "backup_retention_period", backup_retention_period)

    @_builtins.property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> pulumi.Input[_builtins.str]:
        """
        The id of the DBCluster.
        """
        return pulumi.get(self, "db_cluster_id")

    @db_cluster_id.setter
    def db_cluster_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "db_cluster_id", value)

    @_builtins.property
    @pulumi.getter(name="preferredBackupPeriods")
    def preferred_backup_periods(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        """
        return pulumi.get(self, "preferred_backup_periods")

    @preferred_backup_periods.setter
    def preferred_backup_periods(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "preferred_backup_periods", value)

    @_builtins.property
    @pulumi.getter(name="preferredBackupTime")
    def preferred_backup_time(self) -> pulumi.Input[_builtins.str]:
        """
        DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        """
        return pulumi.get(self, "preferred_backup_time")

    @preferred_backup_time.setter
    def preferred_backup_time(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "preferred_backup_time", value)

    @_builtins.property
    @pulumi.getter(name="backupRetentionPeriod")
    def backup_retention_period(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Data backup days. Valid values: `7` to `730`.
        """
        return pulumi.get(self, "backup_retention_period")

    @backup_retention_period.setter
    def backup_retention_period(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "backup_retention_period", value)


@pulumi.input_type
class _BackupPolicyState:
    def __init__(__self__, *,
                 backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None,
                 db_cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 preferred_backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 preferred_backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering BackupPolicy resources.
        :param pulumi.Input[_builtins.int] backup_retention_period: Data backup days. Valid values: `7` to `730`.
        :param pulumi.Input[_builtins.str] db_cluster_id: The id of the DBCluster.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] preferred_backup_periods: DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        :param pulumi.Input[_builtins.str] preferred_backup_time: DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        :param pulumi.Input[_builtins.str] status: The status of the resource.
        """
        if backup_retention_period is not None:
            pulumi.set(__self__, "backup_retention_period", backup_retention_period)
        if db_cluster_id is not None:
            pulumi.set(__self__, "db_cluster_id", db_cluster_id)
        if preferred_backup_periods is not None:
            pulumi.set(__self__, "preferred_backup_periods", preferred_backup_periods)
        if preferred_backup_time is not None:
            pulumi.set(__self__, "preferred_backup_time", preferred_backup_time)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="backupRetentionPeriod")
    def backup_retention_period(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Data backup days. Valid values: `7` to `730`.
        """
        return pulumi.get(self, "backup_retention_period")

    @backup_retention_period.setter
    def backup_retention_period(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "backup_retention_period", value)

    @_builtins.property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id of the DBCluster.
        """
        return pulumi.get(self, "db_cluster_id")

    @db_cluster_id.setter
    def db_cluster_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "db_cluster_id", value)

    @_builtins.property
    @pulumi.getter(name="preferredBackupPeriods")
    def preferred_backup_periods(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        """
        return pulumi.get(self, "preferred_backup_periods")

    @preferred_backup_periods.setter
    def preferred_backup_periods(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "preferred_backup_periods", value)

    @_builtins.property
    @pulumi.getter(name="preferredBackupTime")
    def preferred_backup_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        """
        return pulumi.get(self, "preferred_backup_time")

    @preferred_backup_time.setter
    def preferred_backup_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "preferred_backup_time", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:clickhouse/backupPolicy:BackupPolicy")
class BackupPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None,
                 db_cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 preferred_backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 preferred_backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Click House Backup Policy resource.

        For information about Click House Backup Policy and how to use it, see [What is Backup Policy](https://www.alibabacloud.com/help/zh/clickhouse/latest/api-clickhouse-2019-11-11-createbackuppolicy).

        > **NOTE:** Available since v1.147.0.

        > **NOTE:** Only the cloud database ClickHouse cluster version `20.3` supports data backup.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.clickhouse.get_regions(current=True)
        default_network = alicloud.vpc.Network("default",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("default",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default.regions[0].zone_ids[1].zone_id)
        default_db_cluster = alicloud.clickhouse.DbCluster("default",
            db_cluster_version="22.8.5.29",
            status="Running",
            category="Basic",
            db_cluster_class="S8",
            db_cluster_network_type="vpc",
            db_node_group_count=1,
            payment_type="PayAsYouGo",
            db_node_storage="500",
            storage_type="cloud_essd",
            vswitch_id=default_switch.id,
            vpc_id=default_network.id)
        default_backup_policy = alicloud.clickhouse.BackupPolicy("default",
            db_cluster_id=default_db_cluster.id,
            preferred_backup_periods=[
                "Monday",
                "Friday",
            ],
            preferred_backup_time="00:00Z-01:00Z",
            backup_retention_period=7)
        ```

        ## Import

        Click House Backup Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:clickhouse/backupPolicy:BackupPolicy example <db_cluster_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] backup_retention_period: Data backup days. Valid values: `7` to `730`.
        :param pulumi.Input[_builtins.str] db_cluster_id: The id of the DBCluster.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] preferred_backup_periods: DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        :param pulumi.Input[_builtins.str] preferred_backup_time: DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Click House Backup Policy resource.

        For information about Click House Backup Policy and how to use it, see [What is Backup Policy](https://www.alibabacloud.com/help/zh/clickhouse/latest/api-clickhouse-2019-11-11-createbackuppolicy).

        > **NOTE:** Available since v1.147.0.

        > **NOTE:** Only the cloud database ClickHouse cluster version `20.3` supports data backup.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.clickhouse.get_regions(current=True)
        default_network = alicloud.vpc.Network("default",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("default",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default.regions[0].zone_ids[1].zone_id)
        default_db_cluster = alicloud.clickhouse.DbCluster("default",
            db_cluster_version="22.8.5.29",
            status="Running",
            category="Basic",
            db_cluster_class="S8",
            db_cluster_network_type="vpc",
            db_node_group_count=1,
            payment_type="PayAsYouGo",
            db_node_storage="500",
            storage_type="cloud_essd",
            vswitch_id=default_switch.id,
            vpc_id=default_network.id)
        default_backup_policy = alicloud.clickhouse.BackupPolicy("default",
            db_cluster_id=default_db_cluster.id,
            preferred_backup_periods=[
                "Monday",
                "Friday",
            ],
            preferred_backup_time="00:00Z-01:00Z",
            backup_retention_period=7)
        ```

        ## Import

        Click House Backup Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:clickhouse/backupPolicy:BackupPolicy example <db_cluster_id>
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
                 db_cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 preferred_backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 preferred_backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupPolicyArgs.__new__(BackupPolicyArgs)

            __props__.__dict__["backup_retention_period"] = backup_retention_period
            if db_cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_cluster_id'")
            __props__.__dict__["db_cluster_id"] = db_cluster_id
            if preferred_backup_periods is None and not opts.urn:
                raise TypeError("Missing required property 'preferred_backup_periods'")
            __props__.__dict__["preferred_backup_periods"] = preferred_backup_periods
            if preferred_backup_time is None and not opts.urn:
                raise TypeError("Missing required property 'preferred_backup_time'")
            __props__.__dict__["preferred_backup_time"] = preferred_backup_time
            __props__.__dict__["status"] = None
        super(BackupPolicy, __self__).__init__(
            'alicloud:clickhouse/backupPolicy:BackupPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_retention_period: Optional[pulumi.Input[_builtins.int]] = None,
            db_cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
            preferred_backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            preferred_backup_time: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'BackupPolicy':
        """
        Get an existing BackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] backup_retention_period: Data backup days. Valid values: `7` to `730`.
        :param pulumi.Input[_builtins.str] db_cluster_id: The id of the DBCluster.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] preferred_backup_periods: DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        :param pulumi.Input[_builtins.str] preferred_backup_time: DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        :param pulumi.Input[_builtins.str] status: The status of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupPolicyState.__new__(_BackupPolicyState)

        __props__.__dict__["backup_retention_period"] = backup_retention_period
        __props__.__dict__["db_cluster_id"] = db_cluster_id
        __props__.__dict__["preferred_backup_periods"] = preferred_backup_periods
        __props__.__dict__["preferred_backup_time"] = preferred_backup_time
        __props__.__dict__["status"] = status
        return BackupPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="backupRetentionPeriod")
    def backup_retention_period(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Data backup days. Valid values: `7` to `730`.
        """
        return pulumi.get(self, "backup_retention_period")

    @_builtins.property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> pulumi.Output[_builtins.str]:
        """
        The id of the DBCluster.
        """
        return pulumi.get(self, "db_cluster_id")

    @_builtins.property
    @pulumi.getter(name="preferredBackupPeriods")
    def preferred_backup_periods(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        """
        return pulumi.get(self, "preferred_backup_periods")

    @_builtins.property
    @pulumi.getter(name="preferredBackupTime")
    def preferred_backup_time(self) -> pulumi.Output[_builtins.str]:
        """
        DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        """
        return pulumi.get(self, "preferred_backup_time")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

