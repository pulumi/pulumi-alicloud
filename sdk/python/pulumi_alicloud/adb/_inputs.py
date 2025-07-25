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

__all__ = [
    'LakeAccountAccountPrivilegeArgs',
    'LakeAccountAccountPrivilegeArgsDict',
    'LakeAccountAccountPrivilegePrivilegeObjectArgs',
    'LakeAccountAccountPrivilegePrivilegeObjectArgsDict',
]

MYPY = False

if not MYPY:
    class LakeAccountAccountPrivilegeArgsDict(TypedDict):
        privilege_object: NotRequired[pulumi.Input['LakeAccountAccountPrivilegePrivilegeObjectArgsDict']]
        """
        Object associated to privileges. See `privilege_object` below.
        """
        privilege_type: NotRequired[pulumi.Input[_builtins.str]]
        """
        The type of privileges.
        """
        privileges: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]
        """
        privilege list.
        """
elif False:
    LakeAccountAccountPrivilegeArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class LakeAccountAccountPrivilegeArgs:
    def __init__(__self__, *,
                 privilege_object: Optional[pulumi.Input['LakeAccountAccountPrivilegePrivilegeObjectArgs']] = None,
                 privilege_type: Optional[pulumi.Input[_builtins.str]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        :param pulumi.Input['LakeAccountAccountPrivilegePrivilegeObjectArgs'] privilege_object: Object associated to privileges. See `privilege_object` below.
        :param pulumi.Input[_builtins.str] privilege_type: The type of privileges.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] privileges: privilege list.
        """
        if privilege_object is not None:
            pulumi.set(__self__, "privilege_object", privilege_object)
        if privilege_type is not None:
            pulumi.set(__self__, "privilege_type", privilege_type)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)

    @_builtins.property
    @pulumi.getter(name="privilegeObject")
    def privilege_object(self) -> Optional[pulumi.Input['LakeAccountAccountPrivilegePrivilegeObjectArgs']]:
        """
        Object associated to privileges. See `privilege_object` below.
        """
        return pulumi.get(self, "privilege_object")

    @privilege_object.setter
    def privilege_object(self, value: Optional[pulumi.Input['LakeAccountAccountPrivilegePrivilegeObjectArgs']]):
        pulumi.set(self, "privilege_object", value)

    @_builtins.property
    @pulumi.getter(name="privilegeType")
    def privilege_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of privileges.
        """
        return pulumi.get(self, "privilege_type")

    @privilege_type.setter
    def privilege_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "privilege_type", value)

    @_builtins.property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        privilege list.
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "privileges", value)


if not MYPY:
    class LakeAccountAccountPrivilegePrivilegeObjectArgsDict(TypedDict):
        column: NotRequired[pulumi.Input[_builtins.str]]
        """
        The name of column.
        """
        database: NotRequired[pulumi.Input[_builtins.str]]
        """
        The name of database.
        """
        table: NotRequired[pulumi.Input[_builtins.str]]
        """
        The name of table.
        """
elif False:
    LakeAccountAccountPrivilegePrivilegeObjectArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class LakeAccountAccountPrivilegePrivilegeObjectArgs:
    def __init__(__self__, *,
                 column: Optional[pulumi.Input[_builtins.str]] = None,
                 database: Optional[pulumi.Input[_builtins.str]] = None,
                 table: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] column: The name of column.
        :param pulumi.Input[_builtins.str] database: The name of database.
        :param pulumi.Input[_builtins.str] table: The name of table.
        """
        if column is not None:
            pulumi.set(__self__, "column", column)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if table is not None:
            pulumi.set(__self__, "table", table)

    @_builtins.property
    @pulumi.getter
    def column(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of column.
        """
        return pulumi.get(self, "column")

    @column.setter
    def column(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "column", value)

    @_builtins.property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of database.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "database", value)

    @_builtins.property
    @pulumi.getter
    def table(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of table.
        """
        return pulumi.get(self, "table")

    @table.setter
    def table(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "table", value)


