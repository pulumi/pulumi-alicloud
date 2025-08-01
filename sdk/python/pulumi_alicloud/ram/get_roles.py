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
    'GetRolesResult',
    'AwaitableGetRolesResult',
    'get_roles',
    'get_roles_output',
]

@pulumi.output_type
class GetRolesResult:
    """
    A collection of values returned by getRoles.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, policy_name=None, policy_type=None, roles=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if policy_name and not isinstance(policy_name, str):
            raise TypeError("Expected argument 'policy_name' to be a str")
        pulumi.set(__self__, "policy_name", policy_name)
        if policy_type and not isinstance(policy_type, str):
            raise TypeError("Expected argument 'policy_type' to be a str")
        pulumi.set(__self__, "policy_type", policy_type)
        if roles and not isinstance(roles, list):
            raise TypeError("Expected argument 'roles' to be a list")
        pulumi.set(__self__, "roles", roles)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ids(self) -> Sequence[_builtins.str]:
        """
        A list of ram role IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of ram role names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "policy_name")

    @_builtins.property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "policy_type")

    @_builtins.property
    @pulumi.getter
    def roles(self) -> Sequence['outputs.GetRolesRoleResult']:
        """
        A list of roles. Each element contains the following attributes:
        """
        return pulumi.get(self, "roles")


class AwaitableGetRolesResult(GetRolesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRolesResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            policy_name=self.policy_name,
            policy_type=self.policy_type,
            roles=self.roles)


def get_roles(ids: Optional[Sequence[_builtins.str]] = None,
              name_regex: Optional[_builtins.str] = None,
              output_file: Optional[_builtins.str] = None,
              policy_name: Optional[_builtins.str] = None,
              policy_type: Optional[_builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRolesResult:
    """
    This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available since v1.0.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    roles_ds = alicloud.ram.get_roles(output_file="roles.txt",
        name_regex=".*test.*",
        policy_name="AliyunACSDefaultAccess",
        policy_type="Custom")
    pulumi.export("firstRoleId", roles_ds.roles[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of ram role IDs.
    :param _builtins.str name_regex: A regex string to filter results by the role name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str policy_name: Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
    :param _builtins.str policy_type: Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['policyName'] = policy_name
    __args__['policyType'] = policy_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ram/getRoles:getRoles', __args__, opts=opts, typ=GetRolesResult).value

    return AwaitableGetRolesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        policy_name=pulumi.get(__ret__, 'policy_name'),
        policy_type=pulumi.get(__ret__, 'policy_type'),
        roles=pulumi.get(__ret__, 'roles'))
def get_roles_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                     name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     policy_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     policy_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRolesResult]:
    """
    This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available since v1.0.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    roles_ds = alicloud.ram.get_roles(output_file="roles.txt",
        name_regex=".*test.*",
        policy_name="AliyunACSDefaultAccess",
        policy_type="Custom")
    pulumi.export("firstRoleId", roles_ds.roles[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of ram role IDs.
    :param _builtins.str name_regex: A regex string to filter results by the role name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str policy_name: Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
    :param _builtins.str policy_type: Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['policyName'] = policy_name
    __args__['policyType'] = policy_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:ram/getRoles:getRoles', __args__, opts=opts, typ=GetRolesResult)
    return __ret__.apply(lambda __response__: GetRolesResult(
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        policy_name=pulumi.get(__response__, 'policy_name'),
        policy_type=pulumi.get(__response__, 'policy_type'),
        roles=pulumi.get(__response__, 'roles')))
