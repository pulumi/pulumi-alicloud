# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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
    'WorkspaceDatasetLabelArgs',
    'WorkspaceDatasetLabelArgsDict',
    'WorkspaceDatasetversionLabelArgs',
    'WorkspaceDatasetversionLabelArgsDict',
]

MYPY = False

if not MYPY:
    class WorkspaceDatasetLabelArgsDict(TypedDict):
        key: NotRequired[pulumi.Input[str]]
        """
        The key of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        """
        value: NotRequired[pulumi.Input[str]]
        """
        The value of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        """
elif False:
    WorkspaceDatasetLabelArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class WorkspaceDatasetLabelArgs:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] key: The key of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        :param pulumi.Input[str] value: The value of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        The key of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The value of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


if not MYPY:
    class WorkspaceDatasetversionLabelArgsDict(TypedDict):
        key: NotRequired[pulumi.Input[str]]
        """
        The key of the tags
        """
        value: NotRequired[pulumi.Input[str]]
        """
        The value of the tags
        """
elif False:
    WorkspaceDatasetversionLabelArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class WorkspaceDatasetversionLabelArgs:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] key: The key of the tags
        :param pulumi.Input[str] value: The value of the tags
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        The key of the tags
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The value of the tags
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


