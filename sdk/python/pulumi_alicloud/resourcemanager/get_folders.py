# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetFoldersResult:
    """
    A collection of values returned by getFolders.
    """
    def __init__(__self__, folders=None, id=None, ids=None, name_regex=None, names=None, output_file=None, parent_folder_id=None):
        if folders and not isinstance(folders, list):
            raise TypeError("Expected argument 'folders' to be a list")
        __self__.folders = folders
        """
        A list of folders. Each element contains the following attributes:
        """
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
        A list of folder IDs.
        """
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        __self__.name_regex = name_regex
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        __self__.names = names
        """
        A list of folder names.
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if parent_folder_id and not isinstance(parent_folder_id, str):
            raise TypeError("Expected argument 'parent_folder_id' to be a str")
        __self__.parent_folder_id = parent_folder_id
class AwaitableGetFoldersResult(GetFoldersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFoldersResult(
            folders=self.folders,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            parent_folder_id=self.parent_folder_id)

def get_folders(ids=None,name_regex=None,output_file=None,parent_folder_id=None,opts=None):
    """
    This data source provides the resource manager folders of the current Alibaba Cloud user.

    > **NOTE:**  Available in 1.84.0+.

    > **NOTE:**  You can view only the information of the first-level child folders of the specified folder.

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.resourcemanager.get_folders(name_regex="tftest")
    pulumi.export("firstFolderId", example.folders[0]["id"])
    ```



    :param list ids: A list of resource manager folders IDs.
    :param str name_regex: A regex string to filter results by folder name.
    :param str parent_folder_id: The ID of the parent folder.
    """
    __args__ = dict()


    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['parentFolderId'] = parent_folder_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:resourcemanager/getFolders:getFolders', __args__, opts=opts).value

    return AwaitableGetFoldersResult(
        folders=__ret__.get('folders'),
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        name_regex=__ret__.get('nameRegex'),
        names=__ret__.get('names'),
        output_file=__ret__.get('outputFile'),
        parent_folder_id=__ret__.get('parentFolderId'))