# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetPolicyVersionsResult:
    """
    A collection of values returned by getPolicyVersions.
    """
    def __init__(__self__, id=None, ids=None, output_file=None, policy_name=None, policy_type=None, versions=None):
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
        A list of policy version IDs.
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if policy_name and not isinstance(policy_name, str):
            raise TypeError("Expected argument 'policy_name' to be a str")
        __self__.policy_name = policy_name
        if policy_type and not isinstance(policy_type, str):
            raise TypeError("Expected argument 'policy_type' to be a str")
        __self__.policy_type = policy_type
        if versions and not isinstance(versions, list):
            raise TypeError("Expected argument 'versions' to be a list")
        __self__.versions = versions
        """
        A list of policy versions. Each element contains the following attributes:
        """
class AwaitableGetPolicyVersionsResult(GetPolicyVersionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPolicyVersionsResult(
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            policy_name=self.policy_name,
            policy_type=self.policy_type,
            versions=self.versions)

def get_policy_versions(ids=None,output_file=None,policy_name=None,policy_type=None,opts=None):
    """
    This data source provides the Resource Manager Policy Versions of the current Alibaba Cloud user.

    > **NOTE:**  Available in 1.85.0+.

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.resourcemanager.get_policy_versions(policy_name="tftest",
        policy_type="Custom")
    pulumi.export("firstPolicyVersionId", default.versions[0]["id"])
    ```



    :param list ids: A list of policy version IDs.
    :param str policy_name: The name of the policy.
    :param str policy_type: The type of the policy. Valid values:`Custom` and `System`.
    """
    __args__ = dict()


    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['policyName'] = policy_name
    __args__['policyType'] = policy_type
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:resourcemanager/getPolicyVersions:getPolicyVersions', __args__, opts=opts).value

    return AwaitableGetPolicyVersionsResult(
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        output_file=__ret__.get('outputFile'),
        policy_name=__ret__.get('policyName'),
        policy_type=__ret__.get('policyType'),
        versions=__ret__.get('versions'))