# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetBackupPoliciesResult',
    'AwaitableGetBackupPoliciesResult',
    'get_backup_policies',
    'get_backup_policies_output',
]

@pulumi.output_type
class GetBackupPoliciesResult:
    """
    A collection of values returned by getBackupPolicies.
    """
    def __init__(__self__, db_cluster_id=None, id=None, output_file=None, policies=None):
        if db_cluster_id and not isinstance(db_cluster_id, str):
            raise TypeError("Expected argument 'db_cluster_id' to be a str")
        pulumi.set(__self__, "db_cluster_id", db_cluster_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)

    @property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> str:
        return pulumi.get(self, "db_cluster_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def policies(self) -> Sequence['outputs.GetBackupPoliciesPolicyResult']:
        return pulumi.get(self, "policies")


class AwaitableGetBackupPoliciesResult(GetBackupPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBackupPoliciesResult(
            db_cluster_id=self.db_cluster_id,
            id=self.id,
            output_file=self.output_file,
            policies=self.policies)


def get_backup_policies(db_cluster_id: Optional[str] = None,
                        output_file: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBackupPoliciesResult:
    """
    This data source provides the Click House Backup Policies of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.clickhouse.get_backup_policies(db_cluster_id="example_value")
    pulumi.export("clickHouseBackupPolicyId1", example.policies[0].id)
    ```


    :param str db_cluster_id: The db cluster id.
    """
    __args__ = dict()
    __args__['dbClusterId'] = db_cluster_id
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:clickhouse/getBackupPolicies:getBackupPolicies', __args__, opts=opts, typ=GetBackupPoliciesResult).value

    return AwaitableGetBackupPoliciesResult(
        db_cluster_id=__ret__.db_cluster_id,
        id=__ret__.id,
        output_file=__ret__.output_file,
        policies=__ret__.policies)


@_utilities.lift_output_func(get_backup_policies)
def get_backup_policies_output(db_cluster_id: Optional[pulumi.Input[str]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBackupPoliciesResult]:
    """
    This data source provides the Click House Backup Policies of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.clickhouse.get_backup_policies(db_cluster_id="example_value")
    pulumi.export("clickHouseBackupPolicyId1", example.policies[0].id)
    ```


    :param str db_cluster_id: The db cluster id.
    """
    ...