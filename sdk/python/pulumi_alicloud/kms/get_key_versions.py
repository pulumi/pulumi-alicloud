# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetKeyVersionsResult:
    """
    A collection of values returned by getKeyVersions.
    """
    def __init__(__self__, id=None, ids=None, key_id=None, output_file=None, versions=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        __self__.ids = ids
        """
        A list of KMS KeyVersion IDs.
        """
        if key_id and not isinstance(key_id, str):
            raise TypeError("Expected argument 'key_id' to be a str")
        __self__.key_id = key_id
        """
        ID of the key.
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if versions and not isinstance(versions, list):
            raise TypeError("Expected argument 'versions' to be a list")
        __self__.versions = versions
        """
        A list of KMS KeyVersions. Each element contains the following attributes:
        """
class AwaitableGetKeyVersionsResult(GetKeyVersionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKeyVersionsResult(
            id=self.id,
            ids=self.ids,
            key_id=self.key_id,
            output_file=self.output_file,
            versions=self.versions)

def get_key_versions(ids=None,key_id=None,output_file=None,opts=None):
    """
    This data source provides a list of KMS KeyVersions in an Alibaba Cloud account according to the specified filters.

    > NOTE: Available in v1.85.0+

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    alicloud_kms_key_versions_ds = alicloud.kms.get_key_versions(ids=["d89e8a53-b708-41aa-8c67-6873axxx"],
        key_id="08438c-b4d5-4d05-928c-07b7xxxx")
    pulumi.export("allVersions", alicloud_kms_key_versions_ds.versions)
    ```



    :param list ids: A list of KMS KeyVersion IDs.
    :param str key_id: The id of kms key.
    """
    __args__ = dict()


    __args__['ids'] = ids
    __args__['keyId'] = key_id
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:kms/getKeyVersions:getKeyVersions', __args__, opts=opts).value

    return AwaitableGetKeyVersionsResult(
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        key_id=__ret__.get('keyId'),
        output_file=__ret__.get('outputFile'),
        versions=__ret__.get('versions'))