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
                 instance_id: pulumi.Input[_builtins.str],
                 backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 backup_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a BackupPolicy resource.
        :param pulumi.Input[_builtins.str] instance_id: The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
        :param pulumi.Input[_builtins.str] backup_time: Backup time, in the format of HH:mmZ- HH:mm Z.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        if backup_periods is not None:
            pulumi.set(__self__, "backup_periods", backup_periods)
        if backup_time is not None:
            pulumi.set(__self__, "backup_time", backup_time)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter(name="backupPeriods")
    def backup_periods(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
        """
        return pulumi.get(self, "backup_periods")

    @backup_periods.setter
    def backup_periods(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "backup_periods", value)

    @_builtins.property
    @pulumi.getter(name="backupTime")
    def backup_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Backup time, in the format of HH:mmZ- HH:mm Z.
        """
        return pulumi.get(self, "backup_time")

    @backup_time.setter
    def backup_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "backup_time", value)


@pulumi.input_type
class _BackupPolicyState:
    def __init__(__self__, *,
                 backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering BackupPolicy resources.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
        :param pulumi.Input[_builtins.str] backup_time: Backup time, in the format of HH:mmZ- HH:mm Z.
        :param pulumi.Input[_builtins.str] instance_id: The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
        """
        if backup_periods is not None:
            pulumi.set(__self__, "backup_periods", backup_periods)
        if backup_time is not None:
            pulumi.set(__self__, "backup_time", backup_time)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)

    @_builtins.property
    @pulumi.getter(name="backupPeriods")
    def backup_periods(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
        """
        return pulumi.get(self, "backup_periods")

    @backup_periods.setter
    def backup_periods(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "backup_periods", value)

    @_builtins.property
    @pulumi.getter(name="backupTime")
    def backup_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Backup time, in the format of HH:mmZ- HH:mm Z.
        """
        return pulumi.get(self, "backup_time")

    @backup_time.setter
    def backup_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "backup_time", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "instance_id", value)


@pulumi.type_token("alicloud:kvstore/backupPolicy:BackupPolicy")
class BackupPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Backup Policy for Tair (Redis OSS-Compatible) And Memcache (KVStore) resource.

        For information about Backup Policy for Tair (Redis OSS-Compatible) And Memcache (KVStore) and how to use it, see [What is Backup Policy](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-modifybackuppolicy-redis).

        > **NOTE:** Available since v1.15.0.

        > **DEPRECATED:**  This resource  has been deprecated from version `1.104.0`. Please use resource alicloud_kvstore_instance.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.kvstore.get_zones()
        default_network = alicloud.vpc.Network("default",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("default",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default.zones[0].id,
            vswitch_name=name)
        default_instance = alicloud.kvstore.Instance("default",
            db_instance_name=name,
            vswitch_id=default_switch.id,
            zone_id=default.zones[0].id,
            instance_class="redis.master.large.default",
            instance_type="Redis",
            engine_version="5.0",
            security_ips=["10.23.12.24"],
            config={
                "appendonly": "yes",
                "lazyfree-lazy-eviction": "yes",
            },
            tags={
                "Created": "TF",
                "For": "example",
            })
        default_backup_policy = alicloud.kvstore.BackupPolicy("default",
            instance_id=default_instance.id,
            backup_periods=[
                "Tuesday",
                "Wednesday",
            ],
            backup_time="10:00Z-11:00Z")
        ```

        ## Import

        Tair (Redis OSS-Compatible) And Memcache (KVStore) Backup Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:kvstore/backupPolicy:BackupPolicy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
        :param pulumi.Input[_builtins.str] backup_time: Backup time, in the format of HH:mmZ- HH:mm Z.
        :param pulumi.Input[_builtins.str] instance_id: The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Backup Policy for Tair (Redis OSS-Compatible) And Memcache (KVStore) resource.

        For information about Backup Policy for Tair (Redis OSS-Compatible) And Memcache (KVStore) and how to use it, see [What is Backup Policy](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-modifybackuppolicy-redis).

        > **NOTE:** Available since v1.15.0.

        > **DEPRECATED:**  This resource  has been deprecated from version `1.104.0`. Please use resource alicloud_kvstore_instance.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.kvstore.get_zones()
        default_network = alicloud.vpc.Network("default",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("default",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default.zones[0].id,
            vswitch_name=name)
        default_instance = alicloud.kvstore.Instance("default",
            db_instance_name=name,
            vswitch_id=default_switch.id,
            zone_id=default.zones[0].id,
            instance_class="redis.master.large.default",
            instance_type="Redis",
            engine_version="5.0",
            security_ips=["10.23.12.24"],
            config={
                "appendonly": "yes",
                "lazyfree-lazy-eviction": "yes",
            },
            tags={
                "Created": "TF",
                "For": "example",
            })
        default_backup_policy = alicloud.kvstore.BackupPolicy("default",
            instance_id=default_instance.id,
            backup_periods=[
                "Tuesday",
                "Wednesday",
            ],
            backup_time="10:00Z-11:00Z")
        ```

        ## Import

        Tair (Redis OSS-Compatible) And Memcache (KVStore) Backup Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:kvstore/backupPolicy:BackupPolicy example <id>
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
                 backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 backup_time: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupPolicyArgs.__new__(BackupPolicyArgs)

            __props__.__dict__["backup_periods"] = backup_periods
            __props__.__dict__["backup_time"] = backup_time
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
        super(BackupPolicy, __self__).__init__(
            'alicloud:kvstore/backupPolicy:BackupPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            backup_time: Optional[pulumi.Input[_builtins.str]] = None,
            instance_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'BackupPolicy':
        """
        Get an existing BackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
        :param pulumi.Input[_builtins.str] backup_time: Backup time, in the format of HH:mmZ- HH:mm Z.
        :param pulumi.Input[_builtins.str] instance_id: The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupPolicyState.__new__(_BackupPolicyState)

        __props__.__dict__["backup_periods"] = backup_periods
        __props__.__dict__["backup_time"] = backup_time
        __props__.__dict__["instance_id"] = instance_id
        return BackupPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="backupPeriods")
    def backup_periods(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
        """
        return pulumi.get(self, "backup_periods")

    @_builtins.property
    @pulumi.getter(name="backupTime")
    def backup_time(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Backup time, in the format of HH:mmZ- HH:mm Z.
        """
        return pulumi.get(self, "backup_time")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
        """
        return pulumi.get(self, "instance_id")

