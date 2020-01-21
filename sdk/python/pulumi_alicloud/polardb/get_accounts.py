# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetAccountsResult:
    """
    A collection of values returned by getAccounts.
    """
    def __init__(__self__, accounts=None, db_cluster_id=None, name_regex=None, names=None, id=None):
        if accounts and not isinstance(accounts, list):
            raise TypeError("Expected argument 'accounts' to be a list")
        __self__.accounts = accounts
        """
        A list of PolarDB cluster accounts. Each element contains the following attributes:
        """
        if db_cluster_id and not isinstance(db_cluster_id, str):
            raise TypeError("Expected argument 'db_cluster_id' to be a str")
        __self__.db_cluster_id = db_cluster_id
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        __self__.name_regex = name_regex
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        __self__.names = names
        """
        Account name of the cluster.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
class AwaitableGetAccountsResult(GetAccountsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountsResult(
            accounts=self.accounts,
            db_cluster_id=self.db_cluster_id,
            name_regex=self.name_regex,
            names=self.names,
            id=self.id)

def get_accounts(db_cluster_id=None,name_regex=None,opts=None):
    """
    The `polardb.getAccounts` data source provides a collection of PolarDB cluster database account available in Alibaba Cloud account.
    Filters support regular expression for the account name, searches by clusterId.
    
    > **NOTE:** Available in v1.70.0+.
    
    :param str db_cluster_id: The polarDB cluster ID. 
    :param str name_regex: A regex string to filter results by account name.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/polardb_accounts.html.markdown.
    """
    __args__ = dict()

    __args__['dbClusterId'] = db_cluster_id
    __args__['nameRegex'] = name_regex
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:polardb/getAccounts:getAccounts', __args__, opts=opts).value

    return AwaitableGetAccountsResult(
        accounts=__ret__.get('accounts'),
        db_cluster_id=__ret__.get('dbClusterId'),
        name_regex=__ret__.get('nameRegex'),
        names=__ret__.get('names'),
        id=__ret__.get('id'))