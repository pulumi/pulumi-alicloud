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
    'GetClustersResult',
    'AwaitableGetClustersResult',
    'get_clusters',
    'get_clusters_output',
]

@pulumi.output_type
class GetClustersResult:
    """
    A collection of values returned by getClusters.
    """
    def __init__(__self__, clusters=None, description=None, description_regex=None, descriptions=None, enable_details=None, id=None, ids=None, output_file=None, page_number=None, page_size=None, resource_group_id=None, status=None, tags=None, total_count=None):
        if clusters and not isinstance(clusters, list):
            raise TypeError("Expected argument 'clusters' to be a list")
        pulumi.set(__self__, "clusters", clusters)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if description_regex and not isinstance(description_regex, str):
            raise TypeError("Expected argument 'description_regex' to be a str")
        pulumi.set(__self__, "description_regex", description_regex)
        if descriptions and not isinstance(descriptions, list):
            raise TypeError("Expected argument 'descriptions' to be a list")
        pulumi.set(__self__, "descriptions", descriptions)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if total_count and not isinstance(total_count, int):
            raise TypeError("Expected argument 'total_count' to be a int")
        pulumi.set(__self__, "total_count", total_count)

    @_builtins.property
    @pulumi.getter
    def clusters(self) -> Sequence['outputs.GetClustersClusterResult']:
        """
        A list of ADB clusters. Each element contains the following attributes:
        """
        return pulumi.get(self, "clusters")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        """
        The description of the ADB cluster.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="descriptionRegex")
    def description_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description_regex")

    @_builtins.property
    @pulumi.getter
    def descriptions(self) -> Sequence[_builtins.str]:
        """
        A list of ADB cluster descriptions.
        """
        return pulumi.get(self, "descriptions")

    @_builtins.property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_details")

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
        """
        A list of ADB cluster IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "page_number")

    @_builtins.property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "page_size")

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "resource_group_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        """
        Status of the cluster.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="totalCount")
    def total_count(self) -> _builtins.int:
        return pulumi.get(self, "total_count")


class AwaitableGetClustersResult(GetClustersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClustersResult(
            clusters=self.clusters,
            description=self.description,
            description_regex=self.description_regex,
            descriptions=self.descriptions,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            resource_group_id=self.resource_group_id,
            status=self.status,
            tags=self.tags,
            total_count=self.total_count)


def get_clusters(description: Optional[_builtins.str] = None,
                 description_regex: Optional[_builtins.str] = None,
                 enable_details: Optional[_builtins.bool] = None,
                 ids: Optional[Sequence[_builtins.str]] = None,
                 output_file: Optional[_builtins.str] = None,
                 page_number: Optional[_builtins.int] = None,
                 page_size: Optional[_builtins.int] = None,
                 resource_group_id: Optional[_builtins.str] = None,
                 status: Optional[_builtins.str] = None,
                 tags: Optional[Mapping[str, _builtins.str]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClustersResult:
    """
    The `adb_get_clusters` data source provides a collection of ADB clusters available in Alibaba Cloud account.
    Filters support regular expression for the cluster description, searches by tags, and other filters which are listed below.

    > **DEPRECATED:**  This resource  has been deprecated from version `1.121.0`. Please use new datasource alicloud_adb_db_clusters.

    > **NOTE:** Available in v1.71.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    adb_clusters_ds = alicloud.adb.get_clusters(description_regex="am-\\\\w+",
        status="Running")
    pulumi.export("firstAdbClusterId", adb_clusters_ds.clusters[0].id)
    ```


    :param _builtins.str description: The description of the ADB cluster.
    :param _builtins.str description_regex: A regex string to filter results by cluster description.
    :param Sequence[_builtins.str] ids: A list of ADB cluster IDs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the cluster. Valid values: `Preparing`, `Creating`, `Restoring`, `Running`, `Deleting`, `ClassChanging`, `NetAddressCreating`, `NetAddressDeleting`. For more information, see [Cluster status](https://www.alibabacloud.com/help/doc-detail/143075.htm).
    :param Mapping[str, _builtins.str] tags: A mapping of tags to assign to the resource.
           - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
           - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['descriptionRegex'] = description_regex
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:adb/getClusters:getClusters', __args__, opts=opts, typ=GetClustersResult).value

    return AwaitableGetClustersResult(
        clusters=pulumi.get(__ret__, 'clusters'),
        description=pulumi.get(__ret__, 'description'),
        description_regex=pulumi.get(__ret__, 'description_regex'),
        descriptions=pulumi.get(__ret__, 'descriptions'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        total_count=pulumi.get(__ret__, 'total_count'))
def get_clusters_output(description: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        description_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                        ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                        output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        page_number: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                        page_size: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                        resource_group_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        tags: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetClustersResult]:
    """
    The `adb_get_clusters` data source provides a collection of ADB clusters available in Alibaba Cloud account.
    Filters support regular expression for the cluster description, searches by tags, and other filters which are listed below.

    > **DEPRECATED:**  This resource  has been deprecated from version `1.121.0`. Please use new datasource alicloud_adb_db_clusters.

    > **NOTE:** Available in v1.71.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    adb_clusters_ds = alicloud.adb.get_clusters(description_regex="am-\\\\w+",
        status="Running")
    pulumi.export("firstAdbClusterId", adb_clusters_ds.clusters[0].id)
    ```


    :param _builtins.str description: The description of the ADB cluster.
    :param _builtins.str description_regex: A regex string to filter results by cluster description.
    :param Sequence[_builtins.str] ids: A list of ADB cluster IDs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the cluster. Valid values: `Preparing`, `Creating`, `Restoring`, `Running`, `Deleting`, `ClassChanging`, `NetAddressCreating`, `NetAddressDeleting`. For more information, see [Cluster status](https://www.alibabacloud.com/help/doc-detail/143075.htm).
    :param Mapping[str, _builtins.str] tags: A mapping of tags to assign to the resource.
           - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
           - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['descriptionRegex'] = description_regex
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:adb/getClusters:getClusters', __args__, opts=opts, typ=GetClustersResult)
    return __ret__.apply(lambda __response__: GetClustersResult(
        clusters=pulumi.get(__response__, 'clusters'),
        description=pulumi.get(__response__, 'description'),
        description_regex=pulumi.get(__response__, 'description_regex'),
        descriptions=pulumi.get(__response__, 'descriptions'),
        enable_details=pulumi.get(__response__, 'enable_details'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        output_file=pulumi.get(__response__, 'output_file'),
        page_number=pulumi.get(__response__, 'page_number'),
        page_size=pulumi.get(__response__, 'page_size'),
        resource_group_id=pulumi.get(__response__, 'resource_group_id'),
        status=pulumi.get(__response__, 'status'),
        tags=pulumi.get(__response__, 'tags'),
        total_count=pulumi.get(__response__, 'total_count')))
