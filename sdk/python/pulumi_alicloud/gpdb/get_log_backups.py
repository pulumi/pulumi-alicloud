# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetLogBackupsResult',
    'AwaitableGetLogBackupsResult',
    'get_log_backups',
    'get_log_backups_output',
]

@pulumi.output_type
class GetLogBackupsResult:
    """
    A collection of values returned by getLogBackups.
    """
    def __init__(__self__, db_instance_id=None, end_time=None, id=None, ids=None, logbackups=None, output_file=None, page_number=None, page_size=None, start_time=None):
        if db_instance_id and not isinstance(db_instance_id, str):
            raise TypeError("Expected argument 'db_instance_id' to be a str")
        pulumi.set(__self__, "db_instance_id", db_instance_id)
        if end_time and not isinstance(end_time, str):
            raise TypeError("Expected argument 'end_time' to be a str")
        pulumi.set(__self__, "end_time", end_time)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if logbackups and not isinstance(logbackups, list):
            raise TypeError("Expected argument 'logbackups' to be a list")
        pulumi.set(__self__, "logbackups", logbackups)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if start_time and not isinstance(start_time, str):
            raise TypeError("Expected argument 'start_time' to be a str")
        pulumi.set(__self__, "start_time", start_time)

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> str:
        """
        The ID of the Master node of the instance.
        """
        return pulumi.get(self, "db_instance_id")

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> Optional[str]:
        return pulumi.get(self, "end_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        A list of Logbackup IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def logbackups(self) -> Sequence['outputs.GetLogBackupsLogbackupResult']:
        """
        A list of Logbackup Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "logbackups")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[str]:
        return pulumi.get(self, "start_time")


class AwaitableGetLogBackupsResult(GetLogBackupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLogBackupsResult(
            db_instance_id=self.db_instance_id,
            end_time=self.end_time,
            id=self.id,
            ids=self.ids,
            logbackups=self.logbackups,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            start_time=self.start_time)


def get_log_backups(db_instance_id: Optional[str] = None,
                    end_time: Optional[str] = None,
                    ids: Optional[Sequence[str]] = None,
                    output_file: Optional[str] = None,
                    page_number: Optional[int] = None,
                    page_size: Optional[int] = None,
                    start_time: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLogBackupsResult:
    """
    This data source provides Gpdb Logbackup available to the user.[What is Log Backup](https://www.alibabacloud.com/help/en/)

    > **NOTE:** Available since v1.231.0.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.gpdb.get_instances(name_regex="^default-NODELETING$")
    default_get_log_backups = alicloud.gpdb.get_log_backups(start_time="2022-12-12T02:00Z",
        end_time="2024-12-12T02:00Z",
        db_instance_id=default.ids[0],
        ids=[default.ids[0]])
    pulumi.export("alicloudGpdbLogbackupExampleId", default_get_log_backups.logbackups[0].db_instance_id)
    ```


    :param str db_instance_id: The ID of the Master node of the instance.
    :param str end_time: The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
    :param Sequence[str] ids: A list of Logbackup IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param int page_number: Current page number.
    :param int page_size: Number of records per page.
    :param str start_time: The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
    """
    __args__ = dict()
    __args__['dbInstanceId'] = db_instance_id
    __args__['endTime'] = end_time
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['startTime'] = start_time
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:gpdb/getLogBackups:getLogBackups', __args__, opts=opts, typ=GetLogBackupsResult).value

    return AwaitableGetLogBackupsResult(
        db_instance_id=pulumi.get(__ret__, 'db_instance_id'),
        end_time=pulumi.get(__ret__, 'end_time'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        logbackups=pulumi.get(__ret__, 'logbackups'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        start_time=pulumi.get(__ret__, 'start_time'))


@_utilities.lift_output_func(get_log_backups)
def get_log_backups_output(db_instance_id: Optional[pulumi.Input[str]] = None,
                           end_time: Optional[pulumi.Input[Optional[str]]] = None,
                           ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           output_file: Optional[pulumi.Input[Optional[str]]] = None,
                           page_number: Optional[pulumi.Input[Optional[int]]] = None,
                           page_size: Optional[pulumi.Input[Optional[int]]] = None,
                           start_time: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLogBackupsResult]:
    """
    This data source provides Gpdb Logbackup available to the user.[What is Log Backup](https://www.alibabacloud.com/help/en/)

    > **NOTE:** Available since v1.231.0.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.gpdb.get_instances(name_regex="^default-NODELETING$")
    default_get_log_backups = alicloud.gpdb.get_log_backups(start_time="2022-12-12T02:00Z",
        end_time="2024-12-12T02:00Z",
        db_instance_id=default.ids[0],
        ids=[default.ids[0]])
    pulumi.export("alicloudGpdbLogbackupExampleId", default_get_log_backups.logbackups[0].db_instance_id)
    ```


    :param str db_instance_id: The ID of the Master node of the instance.
    :param str end_time: The query end time, which must be greater than the query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
    :param Sequence[str] ids: A list of Logbackup IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param int page_number: Current page number.
    :param int page_size: Number of records per page.
    :param str start_time: The query start time. Format: yyyy-MM-ddTHH:mmZ(UTC time).
    """
    ...