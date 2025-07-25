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
    'GetSaslUsersResult',
    'AwaitableGetSaslUsersResult',
    'get_sasl_users',
    'get_sasl_users_output',
]

@pulumi.output_type
class GetSaslUsersResult:
    """
    A collection of values returned by getSaslUsers.
    """
    def __init__(__self__, id=None, instance_id=None, name_regex=None, names=None, output_file=None, users=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> _builtins.str:
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of sasl usernames.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def users(self) -> Sequence['outputs.GetSaslUsersUserResult']:
        """
        A list of sasl users. Each element contains the following attributes:
        """
        return pulumi.get(self, "users")


class AwaitableGetSaslUsersResult(GetSaslUsersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSaslUsersResult(
            id=self.id,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            users=self.users)


def get_sasl_users(instance_id: Optional[_builtins.str] = None,
                   name_regex: Optional[_builtins.str] = None,
                   output_file: Optional[_builtins.str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSaslUsersResult:
    """
    This data source provides a list of ALIKAFKA Sasl users in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in 1.66.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    sasl_users_ds = alicloud.actiontrail.get_sasl_users(instance_id="xxx",
        name_regex="username",
        output_file="saslUsers.txt")
    pulumi.export("firstSaslUsername", sasl_users_ds.users[0].username)
    ```


    :param _builtins.str instance_id: ID of the ALIKAFKA Instance that owns the sasl users.
    :param _builtins.str name_regex: A regex string to filter results by the username.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:actiontrail/getSaslUsers:getSaslUsers', __args__, opts=opts, typ=GetSaslUsersResult).value

    return AwaitableGetSaslUsersResult(
        id=pulumi.get(__ret__, 'id'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        users=pulumi.get(__ret__, 'users'))
def get_sasl_users_output(instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                          name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSaslUsersResult]:
    """
    This data source provides a list of ALIKAFKA Sasl users in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in 1.66.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    sasl_users_ds = alicloud.actiontrail.get_sasl_users(instance_id="xxx",
        name_regex="username",
        output_file="saslUsers.txt")
    pulumi.export("firstSaslUsername", sasl_users_ds.users[0].username)
    ```


    :param _builtins.str instance_id: ID of the ALIKAFKA Instance that owns the sasl users.
    :param _builtins.str name_regex: A regex string to filter results by the username.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:actiontrail/getSaslUsers:getSaslUsers', __args__, opts=opts, typ=GetSaslUsersResult)
    return __ret__.apply(lambda __response__: GetSaslUsersResult(
        id=pulumi.get(__response__, 'id'),
        instance_id=pulumi.get(__response__, 'instance_id'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        users=pulumi.get(__response__, 'users')))
