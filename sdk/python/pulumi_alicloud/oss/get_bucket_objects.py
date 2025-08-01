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
    'GetBucketObjectsResult',
    'AwaitableGetBucketObjectsResult',
    'get_bucket_objects',
    'get_bucket_objects_output',
]

@pulumi.output_type
class GetBucketObjectsResult:
    """
    A collection of values returned by getBucketObjects.
    """
    def __init__(__self__, bucket_name=None, id=None, key_prefix=None, key_regex=None, objects=None, output_file=None):
        if bucket_name and not isinstance(bucket_name, str):
            raise TypeError("Expected argument 'bucket_name' to be a str")
        pulumi.set(__self__, "bucket_name", bucket_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_prefix and not isinstance(key_prefix, str):
            raise TypeError("Expected argument 'key_prefix' to be a str")
        pulumi.set(__self__, "key_prefix", key_prefix)
        if key_regex and not isinstance(key_regex, str):
            raise TypeError("Expected argument 'key_regex' to be a str")
        pulumi.set(__self__, "key_regex", key_regex)
        if objects and not isinstance(objects, list):
            raise TypeError("Expected argument 'objects' to be a list")
        pulumi.set(__self__, "objects", objects)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @_builtins.property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> _builtins.str:
        return pulumi.get(self, "bucket_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="keyPrefix")
    def key_prefix(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "key_prefix")

    @_builtins.property
    @pulumi.getter(name="keyRegex")
    def key_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "key_regex")

    @_builtins.property
    @pulumi.getter
    def objects(self) -> Sequence['outputs.GetBucketObjectsObjectResult']:
        """
        A list of bucket objects. Each element contains the following attributes:
        """
        return pulumi.get(self, "objects")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")


class AwaitableGetBucketObjectsResult(GetBucketObjectsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBucketObjectsResult(
            bucket_name=self.bucket_name,
            id=self.id,
            key_prefix=self.key_prefix,
            key_regex=self.key_regex,
            objects=self.objects,
            output_file=self.output_file)


def get_bucket_objects(bucket_name: Optional[_builtins.str] = None,
                       key_prefix: Optional[_builtins.str] = None,
                       key_regex: Optional[_builtins.str] = None,
                       output_file: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBucketObjectsResult:
    """
    This data source provides the objects of an OSS bucket.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    bucket_objects_ds = alicloud.oss.get_bucket_objects(bucket_name="sample_bucket",
        key_regex="sample/sample_object.txt")
    pulumi.export("firstObjectKey", bucket_objects_ds.objects[0].key)
    ```


    :param _builtins.str bucket_name: Name of the bucket that contains the objects to find.
    :param _builtins.str key_prefix: Filter results by the given key prefix (such as "path/to/folder/logs-").
    :param _builtins.str key_regex: A regex string to filter results by key.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['bucketName'] = bucket_name
    __args__['keyPrefix'] = key_prefix
    __args__['keyRegex'] = key_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:oss/getBucketObjects:getBucketObjects', __args__, opts=opts, typ=GetBucketObjectsResult).value

    return AwaitableGetBucketObjectsResult(
        bucket_name=pulumi.get(__ret__, 'bucket_name'),
        id=pulumi.get(__ret__, 'id'),
        key_prefix=pulumi.get(__ret__, 'key_prefix'),
        key_regex=pulumi.get(__ret__, 'key_regex'),
        objects=pulumi.get(__ret__, 'objects'),
        output_file=pulumi.get(__ret__, 'output_file'))
def get_bucket_objects_output(bucket_name: Optional[pulumi.Input[_builtins.str]] = None,
                              key_prefix: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              key_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBucketObjectsResult]:
    """
    This data source provides the objects of an OSS bucket.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    bucket_objects_ds = alicloud.oss.get_bucket_objects(bucket_name="sample_bucket",
        key_regex="sample/sample_object.txt")
    pulumi.export("firstObjectKey", bucket_objects_ds.objects[0].key)
    ```


    :param _builtins.str bucket_name: Name of the bucket that contains the objects to find.
    :param _builtins.str key_prefix: Filter results by the given key prefix (such as "path/to/folder/logs-").
    :param _builtins.str key_regex: A regex string to filter results by key.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['bucketName'] = bucket_name
    __args__['keyPrefix'] = key_prefix
    __args__['keyRegex'] = key_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:oss/getBucketObjects:getBucketObjects', __args__, opts=opts, typ=GetBucketObjectsResult)
    return __ret__.apply(lambda __response__: GetBucketObjectsResult(
        bucket_name=pulumi.get(__response__, 'bucket_name'),
        id=pulumi.get(__response__, 'id'),
        key_prefix=pulumi.get(__response__, 'key_prefix'),
        key_regex=pulumi.get(__response__, 'key_regex'),
        objects=pulumi.get(__response__, 'objects'),
        output_file=pulumi.get(__response__, 'output_file')))
