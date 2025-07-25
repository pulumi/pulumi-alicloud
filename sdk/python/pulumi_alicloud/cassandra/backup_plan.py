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

__all__ = ['BackupPlanArgs', 'BackupPlan']

@pulumi.input_type
class BackupPlanArgs:
    def __init__(__self__, *,
                 backup_time: pulumi.Input[_builtins.str],
                 cluster_id: pulumi.Input[_builtins.str],
                 data_center_id: pulumi.Input[_builtins.str],
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 backup_period: Optional[pulumi.Input[_builtins.str]] = None,
                 retention_period: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a BackupPlan resource.
        :param pulumi.Input[_builtins.str] backup_time: The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        :param pulumi.Input[_builtins.str] cluster_id: The ID of the cluster for the backup.
        :param pulumi.Input[_builtins.str] data_center_id: The ID of the data center for the backup in the cluster.
        :param pulumi.Input[_builtins.bool] active: Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        :param pulumi.Input[_builtins.str] backup_period: The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        :param pulumi.Input[_builtins.int] retention_period: The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        """
        pulumi.set(__self__, "backup_time", backup_time)
        pulumi.set(__self__, "cluster_id", cluster_id)
        pulumi.set(__self__, "data_center_id", data_center_id)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if backup_period is not None:
            pulumi.set(__self__, "backup_period", backup_period)
        if retention_period is not None:
            pulumi.set(__self__, "retention_period", retention_period)

    @_builtins.property
    @pulumi.getter(name="backupTime")
    def backup_time(self) -> pulumi.Input[_builtins.str]:
        """
        The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        """
        return pulumi.get(self, "backup_time")

    @backup_time.setter
    def backup_time(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "backup_time", value)

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the cluster for the backup.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cluster_id", value)

    @_builtins.property
    @pulumi.getter(name="dataCenterId")
    def data_center_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the data center for the backup in the cluster.
        """
        return pulumi.get(self, "data_center_id")

    @data_center_id.setter
    def data_center_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "data_center_id", value)

    @_builtins.property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "active", value)

    @_builtins.property
    @pulumi.getter(name="backupPeriod")
    def backup_period(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        """
        return pulumi.get(self, "backup_period")

    @backup_period.setter
    def backup_period(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "backup_period", value)

    @_builtins.property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        """
        return pulumi.get(self, "retention_period")

    @retention_period.setter
    def retention_period(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "retention_period", value)


@pulumi.input_type
class _BackupPlanState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 backup_period: Optional[pulumi.Input[_builtins.str]] = None,
                 backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 data_center_id: Optional[pulumi.Input[_builtins.str]] = None,
                 retention_period: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering BackupPlan resources.
        :param pulumi.Input[_builtins.bool] active: Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        :param pulumi.Input[_builtins.str] backup_period: The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        :param pulumi.Input[_builtins.str] backup_time: The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        :param pulumi.Input[_builtins.str] cluster_id: The ID of the cluster for the backup.
        :param pulumi.Input[_builtins.str] data_center_id: The ID of the data center for the backup in the cluster.
        :param pulumi.Input[_builtins.int] retention_period: The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if backup_period is not None:
            pulumi.set(__self__, "backup_period", backup_period)
        if backup_time is not None:
            pulumi.set(__self__, "backup_time", backup_time)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if data_center_id is not None:
            pulumi.set(__self__, "data_center_id", data_center_id)
        if retention_period is not None:
            pulumi.set(__self__, "retention_period", retention_period)

    @_builtins.property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "active", value)

    @_builtins.property
    @pulumi.getter(name="backupPeriod")
    def backup_period(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        """
        return pulumi.get(self, "backup_period")

    @backup_period.setter
    def backup_period(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "backup_period", value)

    @_builtins.property
    @pulumi.getter(name="backupTime")
    def backup_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        """
        return pulumi.get(self, "backup_time")

    @backup_time.setter
    def backup_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "backup_time", value)

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the cluster for the backup.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cluster_id", value)

    @_builtins.property
    @pulumi.getter(name="dataCenterId")
    def data_center_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the data center for the backup in the cluster.
        """
        return pulumi.get(self, "data_center_id")

    @data_center_id.setter
    def data_center_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_center_id", value)

    @_builtins.property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        """
        return pulumi.get(self, "retention_period")

    @retention_period.setter
    def retention_period(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "retention_period", value)


@pulumi.type_token("alicloud:cassandra/backupPlan:BackupPlan")
class BackupPlan(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 backup_period: Optional[pulumi.Input[_builtins.str]] = None,
                 backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 data_center_id: Optional[pulumi.Input[_builtins.str]] = None,
                 retention_period: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        Provides a Cassandra Backup Plan resource.

        For information about Cassandra Backup Plan and how to use it, see [What is Backup Plan](https://www.alibabacloud.com/help/doc-detail/157522.htm).

        > **NOTE:** Available in v1.128.0+.

        > **DEPRECATED:**  This resource has been [deprecated](https://www.alibabacloud.com/help/en/apsaradb-for-cassandra/latest/cassandra-delisting-notice) from version `1.220.0`.

        ## Import

        Cassandra Backup Plan can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cassandra/backupPlan:BackupPlan example <cluster_id>:<data_center_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] active: Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        :param pulumi.Input[_builtins.str] backup_period: The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        :param pulumi.Input[_builtins.str] backup_time: The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        :param pulumi.Input[_builtins.str] cluster_id: The ID of the cluster for the backup.
        :param pulumi.Input[_builtins.str] data_center_id: The ID of the data center for the backup in the cluster.
        :param pulumi.Input[_builtins.int] retention_period: The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupPlanArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cassandra Backup Plan resource.

        For information about Cassandra Backup Plan and how to use it, see [What is Backup Plan](https://www.alibabacloud.com/help/doc-detail/157522.htm).

        > **NOTE:** Available in v1.128.0+.

        > **DEPRECATED:**  This resource has been [deprecated](https://www.alibabacloud.com/help/en/apsaradb-for-cassandra/latest/cassandra-delisting-notice) from version `1.220.0`.

        ## Import

        Cassandra Backup Plan can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cassandra/backupPlan:BackupPlan example <cluster_id>:<data_center_id>
        ```

        :param str resource_name: The name of the resource.
        :param BackupPlanArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupPlanArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 backup_period: Optional[pulumi.Input[_builtins.str]] = None,
                 backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 data_center_id: Optional[pulumi.Input[_builtins.str]] = None,
                 retention_period: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupPlanArgs.__new__(BackupPlanArgs)

            __props__.__dict__["active"] = active
            __props__.__dict__["backup_period"] = backup_period
            if backup_time is None and not opts.urn:
                raise TypeError("Missing required property 'backup_time'")
            __props__.__dict__["backup_time"] = backup_time
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            if data_center_id is None and not opts.urn:
                raise TypeError("Missing required property 'data_center_id'")
            __props__.__dict__["data_center_id"] = data_center_id
            __props__.__dict__["retention_period"] = retention_period
        super(BackupPlan, __self__).__init__(
            'alicloud:cassandra/backupPlan:BackupPlan',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[_builtins.bool]] = None,
            backup_period: Optional[pulumi.Input[_builtins.str]] = None,
            backup_time: Optional[pulumi.Input[_builtins.str]] = None,
            cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
            data_center_id: Optional[pulumi.Input[_builtins.str]] = None,
            retention_period: Optional[pulumi.Input[_builtins.int]] = None) -> 'BackupPlan':
        """
        Get an existing BackupPlan resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] active: Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        :param pulumi.Input[_builtins.str] backup_period: The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        :param pulumi.Input[_builtins.str] backup_time: The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        :param pulumi.Input[_builtins.str] cluster_id: The ID of the cluster for the backup.
        :param pulumi.Input[_builtins.str] data_center_id: The ID of the data center for the backup in the cluster.
        :param pulumi.Input[_builtins.int] retention_period: The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupPlanState.__new__(_BackupPlanState)

        __props__.__dict__["active"] = active
        __props__.__dict__["backup_period"] = backup_period
        __props__.__dict__["backup_time"] = backup_time
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["data_center_id"] = data_center_id
        __props__.__dict__["retention_period"] = retention_period
        return BackupPlan(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def active(self) -> pulumi.Output[_builtins.bool]:
        """
        Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        """
        return pulumi.get(self, "active")

    @_builtins.property
    @pulumi.getter(name="backupPeriod")
    def backup_period(self) -> pulumi.Output[_builtins.str]:
        """
        The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        """
        return pulumi.get(self, "backup_period")

    @_builtins.property
    @pulumi.getter(name="backupTime")
    def backup_time(self) -> pulumi.Output[_builtins.str]:
        """
        The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        """
        return pulumi.get(self, "backup_time")

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the cluster for the backup.
        """
        return pulumi.get(self, "cluster_id")

    @_builtins.property
    @pulumi.getter(name="dataCenterId")
    def data_center_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the data center for the backup in the cluster.
        """
        return pulumi.get(self, "data_center_id")

    @_builtins.property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> pulumi.Output[_builtins.int]:
        """
        The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        """
        return pulumi.get(self, "retention_period")

