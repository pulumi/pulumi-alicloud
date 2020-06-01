# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetInstancesResult:
    """
    A collection of values returned by getInstances.
    """
    def __init__(__self__, id=None, ids=None, instances=None, output_file=None):
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
        A list of instance IDs. 
        """
        if instances and not isinstance(instances, list):
            raise TypeError("Expected argument 'instances' to be a list")
        __self__.instances = instances
        """
        A list of instances. Each element contains the following attributes:
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
class AwaitableGetInstancesResult(GetInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstancesResult(
            id=self.id,
            ids=self.ids,
            instances=self.instances,
            output_file=self.output_file)

def get_instances(ids=None,output_file=None,opts=None):
    """
    This data source provides a list of DNS instances in an Alibaba Cloud account according to the specified filters.

    > **NOTE:**  Available in 1.84.0+.

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.dns.get_instances(ids=["dns-cn-oew1npk****"])
    pulumi.export("firstInstanceId", example.instances[0]["id"])
    ```



    :param list ids: A list of instance IDs.
    """
    __args__ = dict()


    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:dns/getInstances:getInstances', __args__, opts=opts).value

    return AwaitableGetInstancesResult(
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        instances=__ret__.get('instances'),
        output_file=__ret__.get('outputFile'))