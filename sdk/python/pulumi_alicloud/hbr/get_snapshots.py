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
    'GetSnapshotsResult',
    'AwaitableGetSnapshotsResult',
    'get_snapshots',
    'get_snapshots_output',
]

@pulumi.output_type
class GetSnapshotsResult:
    """
    A collection of values returned by getSnapshots.
    """
    def __init__(__self__, bucket=None, complete_time=None, complete_time_checker=None, create_time=None, file_system_id=None, id=None, ids=None, instance_id=None, limit=None, output_file=None, query=None, snapshots=None, source_type=None, status=None, vault_id=None):
        if bucket and not isinstance(bucket, str):
            raise TypeError("Expected argument 'bucket' to be a str")
        pulumi.set(__self__, "bucket", bucket)
        if complete_time and not isinstance(complete_time, str):
            raise TypeError("Expected argument 'complete_time' to be a str")
        pulumi.set(__self__, "complete_time", complete_time)
        if complete_time_checker and not isinstance(complete_time_checker, str):
            raise TypeError("Expected argument 'complete_time_checker' to be a str")
        pulumi.set(__self__, "complete_time_checker", complete_time_checker)
        if create_time and not isinstance(create_time, str):
            raise TypeError("Expected argument 'create_time' to be a str")
        pulumi.set(__self__, "create_time", create_time)
        if file_system_id and not isinstance(file_system_id, str):
            raise TypeError("Expected argument 'file_system_id' to be a str")
        pulumi.set(__self__, "file_system_id", file_system_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if limit and not isinstance(limit, int):
            raise TypeError("Expected argument 'limit' to be a int")
        pulumi.set(__self__, "limit", limit)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if query and not isinstance(query, str):
            raise TypeError("Expected argument 'query' to be a str")
        pulumi.set(__self__, "query", query)
        if snapshots and not isinstance(snapshots, list):
            raise TypeError("Expected argument 'snapshots' to be a list")
        pulumi.set(__self__, "snapshots", snapshots)
        if source_type and not isinstance(source_type, str):
            raise TypeError("Expected argument 'source_type' to be a str")
        pulumi.set(__self__, "source_type", source_type)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if vault_id and not isinstance(vault_id, str):
            raise TypeError("Expected argument 'vault_id' to be a str")
        pulumi.set(__self__, "vault_id", vault_id)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "bucket")

    @_builtins.property
    @pulumi.getter(name="completeTime")
    def complete_time(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "complete_time")

    @_builtins.property
    @pulumi.getter(name="completeTimeChecker")
    def complete_time_checker(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "complete_time_checker")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "file_system_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ids(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter
    def limit(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "limit")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def query(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "query")

    @_builtins.property
    @pulumi.getter
    def snapshots(self) -> Sequence['outputs.GetSnapshotsSnapshotResult']:
        return pulumi.get(self, "snapshots")

    @_builtins.property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> _builtins.str:
        return pulumi.get(self, "source_type")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> _builtins.str:
        return pulumi.get(self, "vault_id")


class AwaitableGetSnapshotsResult(GetSnapshotsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSnapshotsResult(
            bucket=self.bucket,
            complete_time=self.complete_time,
            complete_time_checker=self.complete_time_checker,
            create_time=self.create_time,
            file_system_id=self.file_system_id,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            limit=self.limit,
            output_file=self.output_file,
            query=self.query,
            snapshots=self.snapshots,
            source_type=self.source_type,
            status=self.status,
            vault_id=self.vault_id)


def get_snapshots(bucket: Optional[_builtins.str] = None,
                  complete_time: Optional[_builtins.str] = None,
                  complete_time_checker: Optional[_builtins.str] = None,
                  create_time: Optional[_builtins.str] = None,
                  file_system_id: Optional[_builtins.str] = None,
                  ids: Optional[Sequence[_builtins.str]] = None,
                  instance_id: Optional[_builtins.str] = None,
                  limit: Optional[_builtins.int] = None,
                  output_file: Optional[_builtins.str] = None,
                  query: Optional[_builtins.str] = None,
                  source_type: Optional[_builtins.str] = None,
                  status: Optional[_builtins.str] = None,
                  vault_id: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSnapshotsResult:
    """
    This data source provides the Hbr Snapshots of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.133.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.hbr.get_ecs_backup_plans(name_regex="plan-tf-used-dont-delete")
    default_get_oss_backup_plans = alicloud.hbr.get_oss_backup_plans(name_regex="plan-tf-used-dont-delete")
    default_get_nas_backup_plans = alicloud.hbr.get_nas_backup_plans(name_regex="plan-tf-used-dont-delete")
    ecs_snapshots = alicloud.hbr.get_snapshots(source_type="ECS_FILE",
        vault_id=default.plans[0].vault_id,
        instance_id=default.plans[0].instance_id)
    oss_snapshots = alicloud.hbr.get_snapshots(source_type="OSS",
        vault_id=default_get_oss_backup_plans.plans[0].vault_id,
        bucket=default_get_oss_backup_plans.plans[0].bucket,
        complete_time="2021-07-20T14:17:15CST,2021-07-24T14:17:15CST",
        complete_time_checker="BETWEEN")
    nas_snapshots = alicloud.hbr.get_snapshots(source_type="NAS",
        vault_id=default_get_nas_backup_plans.plans[0].vault_id,
        file_system_id=default_get_nas_backup_plans.plans[0].file_system_id,
        create_time=default_get_nas_backup_plans.plans[0].create_time,
        complete_time="2021-08-23T14:17:15CST",
        complete_time_checker="GREATER_THAN_OR_EQUAL")
    pulumi.export("hbrSnapshotId1", nas_snapshots.snapshots[0].id)
    ```


    :param _builtins.str bucket: The bucket name of OSS. While source_type equals `OSS`, this parameter must be set.
    :param _builtins.str complete_time: Timestamp of Snapshot completion. Note The time format of the API adopts the ISO 8601 format, such as 2021-07-09T15:45:30CST or 2021-07-09T07:45:30Z. **Note**: While `complete_time_checker` equals `BETWEEN`, this field should be formatted such as `"2021-08-20T14:17:15CST,2021-08-26T14:17:15CST"`, The first part of this string is the start time, the second part is the end time, and the two parts should be separated by commas.
    :param _builtins.str complete_time_checker: Complete time filter operator. Optional values: `MATCH_TERM`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`.
    :param _builtins.str create_time: File system creation timestamp of Nas. While source_type equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
    :param _builtins.str file_system_id: The File System ID of Nas. While source_type equals `NAS`, this parameter must be set.
    :param Sequence[_builtins.str] ids: A list of Snapshot IDs.
    :param _builtins.str instance_id: The ID of ECS instance. The ecs backup client must have been installed on the host. While source_type equals `ECS_FILE`, this parameter must be set.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str source_type: Data source type, valid values: `ECS_FILE`, `OSS`, `NAS`.
    :param _builtins.str status: The status of snapshot, valid values: `COMPLETE`, `PARTIAL_COMPLETE`.
    :param _builtins.str vault_id: The ID of Vault.
    """
    __args__ = dict()
    __args__['bucket'] = bucket
    __args__['completeTime'] = complete_time
    __args__['completeTimeChecker'] = complete_time_checker
    __args__['createTime'] = create_time
    __args__['fileSystemId'] = file_system_id
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['limit'] = limit
    __args__['outputFile'] = output_file
    __args__['query'] = query
    __args__['sourceType'] = source_type
    __args__['status'] = status
    __args__['vaultId'] = vault_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:hbr/getSnapshots:getSnapshots', __args__, opts=opts, typ=GetSnapshotsResult).value

    return AwaitableGetSnapshotsResult(
        bucket=pulumi.get(__ret__, 'bucket'),
        complete_time=pulumi.get(__ret__, 'complete_time'),
        complete_time_checker=pulumi.get(__ret__, 'complete_time_checker'),
        create_time=pulumi.get(__ret__, 'create_time'),
        file_system_id=pulumi.get(__ret__, 'file_system_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        limit=pulumi.get(__ret__, 'limit'),
        output_file=pulumi.get(__ret__, 'output_file'),
        query=pulumi.get(__ret__, 'query'),
        snapshots=pulumi.get(__ret__, 'snapshots'),
        source_type=pulumi.get(__ret__, 'source_type'),
        status=pulumi.get(__ret__, 'status'),
        vault_id=pulumi.get(__ret__, 'vault_id'))
def get_snapshots_output(bucket: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         complete_time: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         complete_time_checker: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         create_time: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         file_system_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                         instance_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         limit: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                         output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         query: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         source_type: Optional[pulumi.Input[_builtins.str]] = None,
                         status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSnapshotsResult]:
    """
    This data source provides the Hbr Snapshots of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.133.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.hbr.get_ecs_backup_plans(name_regex="plan-tf-used-dont-delete")
    default_get_oss_backup_plans = alicloud.hbr.get_oss_backup_plans(name_regex="plan-tf-used-dont-delete")
    default_get_nas_backup_plans = alicloud.hbr.get_nas_backup_plans(name_regex="plan-tf-used-dont-delete")
    ecs_snapshots = alicloud.hbr.get_snapshots(source_type="ECS_FILE",
        vault_id=default.plans[0].vault_id,
        instance_id=default.plans[0].instance_id)
    oss_snapshots = alicloud.hbr.get_snapshots(source_type="OSS",
        vault_id=default_get_oss_backup_plans.plans[0].vault_id,
        bucket=default_get_oss_backup_plans.plans[0].bucket,
        complete_time="2021-07-20T14:17:15CST,2021-07-24T14:17:15CST",
        complete_time_checker="BETWEEN")
    nas_snapshots = alicloud.hbr.get_snapshots(source_type="NAS",
        vault_id=default_get_nas_backup_plans.plans[0].vault_id,
        file_system_id=default_get_nas_backup_plans.plans[0].file_system_id,
        create_time=default_get_nas_backup_plans.plans[0].create_time,
        complete_time="2021-08-23T14:17:15CST",
        complete_time_checker="GREATER_THAN_OR_EQUAL")
    pulumi.export("hbrSnapshotId1", nas_snapshots.snapshots[0].id)
    ```


    :param _builtins.str bucket: The bucket name of OSS. While source_type equals `OSS`, this parameter must be set.
    :param _builtins.str complete_time: Timestamp of Snapshot completion. Note The time format of the API adopts the ISO 8601 format, such as 2021-07-09T15:45:30CST or 2021-07-09T07:45:30Z. **Note**: While `complete_time_checker` equals `BETWEEN`, this field should be formatted such as `"2021-08-20T14:17:15CST,2021-08-26T14:17:15CST"`, The first part of this string is the start time, the second part is the end time, and the two parts should be separated by commas.
    :param _builtins.str complete_time_checker: Complete time filter operator. Optional values: `MATCH_TERM`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`.
    :param _builtins.str create_time: File system creation timestamp of Nas. While source_type equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
    :param _builtins.str file_system_id: The File System ID of Nas. While source_type equals `NAS`, this parameter must be set.
    :param Sequence[_builtins.str] ids: A list of Snapshot IDs.
    :param _builtins.str instance_id: The ID of ECS instance. The ecs backup client must have been installed on the host. While source_type equals `ECS_FILE`, this parameter must be set.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str source_type: Data source type, valid values: `ECS_FILE`, `OSS`, `NAS`.
    :param _builtins.str status: The status of snapshot, valid values: `COMPLETE`, `PARTIAL_COMPLETE`.
    :param _builtins.str vault_id: The ID of Vault.
    """
    __args__ = dict()
    __args__['bucket'] = bucket
    __args__['completeTime'] = complete_time
    __args__['completeTimeChecker'] = complete_time_checker
    __args__['createTime'] = create_time
    __args__['fileSystemId'] = file_system_id
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['limit'] = limit
    __args__['outputFile'] = output_file
    __args__['query'] = query
    __args__['sourceType'] = source_type
    __args__['status'] = status
    __args__['vaultId'] = vault_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:hbr/getSnapshots:getSnapshots', __args__, opts=opts, typ=GetSnapshotsResult)
    return __ret__.apply(lambda __response__: GetSnapshotsResult(
        bucket=pulumi.get(__response__, 'bucket'),
        complete_time=pulumi.get(__response__, 'complete_time'),
        complete_time_checker=pulumi.get(__response__, 'complete_time_checker'),
        create_time=pulumi.get(__response__, 'create_time'),
        file_system_id=pulumi.get(__response__, 'file_system_id'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        instance_id=pulumi.get(__response__, 'instance_id'),
        limit=pulumi.get(__response__, 'limit'),
        output_file=pulumi.get(__response__, 'output_file'),
        query=pulumi.get(__response__, 'query'),
        snapshots=pulumi.get(__response__, 'snapshots'),
        source_type=pulumi.get(__response__, 'source_type'),
        status=pulumi.get(__response__, 'status'),
        vault_id=pulumi.get(__response__, 'vault_id')))
