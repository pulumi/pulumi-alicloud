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
    'GetAccountDeletionCheckTaskResult',
    'AwaitableGetAccountDeletionCheckTaskResult',
    'get_account_deletion_check_task',
    'get_account_deletion_check_task_output',
]

@pulumi.output_type
class GetAccountDeletionCheckTaskResult:
    """
    A collection of values returned by getAccountDeletionCheckTask.
    """
    def __init__(__self__, abandon_able_checks=None, account_id=None, allow_delete=None, id=None, not_allow_reasons=None, status=None):
        if abandon_able_checks and not isinstance(abandon_able_checks, list):
            raise TypeError("Expected argument 'abandon_able_checks' to be a list")
        pulumi.set(__self__, "abandon_able_checks", abandon_able_checks)
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if allow_delete and not isinstance(allow_delete, bool):
            raise TypeError("Expected argument 'allow_delete' to be a bool")
        pulumi.set(__self__, "allow_delete", allow_delete)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if not_allow_reasons and not isinstance(not_allow_reasons, list):
            raise TypeError("Expected argument 'not_allow_reasons' to be a list")
        pulumi.set(__self__, "not_allow_reasons", not_allow_reasons)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="abandonAbleChecks")
    def abandon_able_checks(self) -> Sequence['outputs.GetAccountDeletionCheckTaskAbandonAbleCheckResult']:
        """
        The check items that you can choose to ignore for the member deletion. Each element contains the following attributes:
        """
        return pulumi.get(self, "abandon_able_checks")

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="allowDelete")
    def allow_delete(self) -> _builtins.bool:
        """
        Indicates whether the member can be deleted.
        """
        return pulumi.get(self, "allow_delete")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="notAllowReasons")
    def not_allow_reasons(self) -> Sequence['outputs.GetAccountDeletionCheckTaskNotAllowReasonResult']:
        """
        The reasons why the member cannot be deleted. Each element contains the following attributes:
        """
        return pulumi.get(self, "not_allow_reasons")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The status of the check.
        """
        return pulumi.get(self, "status")


class AwaitableGetAccountDeletionCheckTaskResult(GetAccountDeletionCheckTaskResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountDeletionCheckTaskResult(
            abandon_able_checks=self.abandon_able_checks,
            account_id=self.account_id,
            allow_delete=self.allow_delete,
            id=self.id,
            not_allow_reasons=self.not_allow_reasons,
            status=self.status)


def get_account_deletion_check_task(account_id: Optional[_builtins.str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountDeletionCheckTaskResult:
    """
    Using this data source can open Resource Manager Account Deletion Check Task.

    For information about Resource Manager Account Deletion Check Task and how to use it, see [What is Resource Manager Account Deletion Check Task](https://www.alibabacloud.com/help/en/resource-management/latest/check-account-delete).

    > **NOTE:** Available in v1.187.0+.

    > **NOTE:** The member deletion feature is in invitational preview. You can contact the service manager of Alibaba Cloud to apply for a trial.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    task = alicloud.resourcemanager.get_account_deletion_check_task(account_id="your_account_id")
    pulumi.export("abandonAbleChecksIds", [__item.check_id for __item in task.abandon_able_checks])
    ```


    :param _builtins.str account_id: The ID of the member that you want to delete.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:resourcemanager/getAccountDeletionCheckTask:getAccountDeletionCheckTask', __args__, opts=opts, typ=GetAccountDeletionCheckTaskResult).value

    return AwaitableGetAccountDeletionCheckTaskResult(
        abandon_able_checks=pulumi.get(__ret__, 'abandon_able_checks'),
        account_id=pulumi.get(__ret__, 'account_id'),
        allow_delete=pulumi.get(__ret__, 'allow_delete'),
        id=pulumi.get(__ret__, 'id'),
        not_allow_reasons=pulumi.get(__ret__, 'not_allow_reasons'),
        status=pulumi.get(__ret__, 'status'))
def get_account_deletion_check_task_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAccountDeletionCheckTaskResult]:
    """
    Using this data source can open Resource Manager Account Deletion Check Task.

    For information about Resource Manager Account Deletion Check Task and how to use it, see [What is Resource Manager Account Deletion Check Task](https://www.alibabacloud.com/help/en/resource-management/latest/check-account-delete).

    > **NOTE:** Available in v1.187.0+.

    > **NOTE:** The member deletion feature is in invitational preview. You can contact the service manager of Alibaba Cloud to apply for a trial.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    task = alicloud.resourcemanager.get_account_deletion_check_task(account_id="your_account_id")
    pulumi.export("abandonAbleChecksIds", [__item.check_id for __item in task.abandon_able_checks])
    ```


    :param _builtins.str account_id: The ID of the member that you want to delete.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:resourcemanager/getAccountDeletionCheckTask:getAccountDeletionCheckTask', __args__, opts=opts, typ=GetAccountDeletionCheckTaskResult)
    return __ret__.apply(lambda __response__: GetAccountDeletionCheckTaskResult(
        abandon_able_checks=pulumi.get(__response__, 'abandon_able_checks'),
        account_id=pulumi.get(__response__, 'account_id'),
        allow_delete=pulumi.get(__response__, 'allow_delete'),
        id=pulumi.get(__response__, 'id'),
        not_allow_reasons=pulumi.get(__response__, 'not_allow_reasons'),
        status=pulumi.get(__response__, 'status')))
