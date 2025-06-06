# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
    'WorkspaceDatasetLabel',
    'WorkspaceDatasetversionLabel',
    'WorkspaceModelLabel',
    'WorkspaceModelVersionLabel',
]

@pulumi.output_type
class WorkspaceDatasetLabel(dict):
    def __init__(__self__, *,
                 key: Optional[builtins.str] = None,
                 value: Optional[builtins.str] = None):
        """
        :param builtins.str key: The key of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        :param builtins.str value: The value of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[builtins.str]:
        """
        The key of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> Optional[builtins.str]:
        """
        The value of the tag. The length is limited to 128 bytes. "=" and "," are not supported.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class WorkspaceDatasetversionLabel(dict):
    def __init__(__self__, *,
                 key: Optional[builtins.str] = None,
                 value: Optional[builtins.str] = None):
        """
        :param builtins.str key: The key of the tags
        :param builtins.str value: The value of the tags
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[builtins.str]:
        """
        The key of the tags
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> Optional[builtins.str]:
        """
        The value of the tags
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class WorkspaceModelLabel(dict):
    def __init__(__self__, *,
                 key: Optional[builtins.str] = None,
                 value: Optional[builtins.str] = None):
        """
        :param builtins.str key: label key
        :param builtins.str value: label value
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[builtins.str]:
        """
        label key
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> Optional[builtins.str]:
        """
        label value
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class WorkspaceModelVersionLabel(dict):
    def __init__(__self__, *,
                 key: Optional[builtins.str] = None,
                 value: Optional[builtins.str] = None):
        """
        :param builtins.str key: label key.
        :param builtins.str value: label value.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[builtins.str]:
        """
        label key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> Optional[builtins.str]:
        """
        label value.
        """
        return pulumi.get(self, "value")


