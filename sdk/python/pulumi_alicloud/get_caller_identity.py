# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetCallerIdentityResult:
    """
    A collection of values returned by getCallerIdentity.
    """
    def __init__(__self__, account_id=None, arn=None, identity_type=None, id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        __self__.account_id = account_id
        """
        Account ID.
        """
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        __self__.arn = arn
        """
        The Alibaba Cloud Resource Name (ARN) of the user making the call.
        """
        if identity_type and not isinstance(identity_type, str):
            raise TypeError("Expected argument 'identity_type' to be a str")
        __self__.identity_type = identity_type
        """
        The type of the princiapal. RAMUser for users.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
class AwaitableGetCallerIdentityResult(GetCallerIdentityResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCallerIdentityResult(
            account_id=self.account_id,
            arn=self.arn,
            identity_type=self.identity_type,
            id=self.id)

def get_caller_identity(opts=None):
    """
    This data source provides the identity of the current user.
    
    > **NOTE:** Available in 1.65.0+.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/caller_identity.html.markdown.
    """
    __args__ = dict()

    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:index/getCallerIdentity:getCallerIdentity', __args__, opts=opts).value

    return AwaitableGetCallerIdentityResult(
        account_id=__ret__.get('accountId'),
        arn=__ret__.get('arn'),
        identity_type=__ret__.get('identityType'),
        id=__ret__.get('id'))