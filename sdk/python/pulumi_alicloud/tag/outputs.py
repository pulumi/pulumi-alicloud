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
    'GetMetaTagsTagResult',
]

@pulumi.output_type
class GetMetaTagsTagResult(dict):
    def __init__(__self__, *,
                 category: builtins.str,
                 key_name: builtins.str,
                 value_name: builtins.str):
        """
        :param builtins.str category: The type of the resource tags.
        :param builtins.str key_name: The name of the key.
        :param builtins.str value_name: The name of the value.
        """
        pulumi.set(__self__, "category", category)
        pulumi.set(__self__, "key_name", key_name)
        pulumi.set(__self__, "value_name", value_name)

    @property
    @pulumi.getter
    def category(self) -> builtins.str:
        """
        The type of the resource tags.
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="keyName")
    def key_name(self) -> builtins.str:
        """
        The name of the key.
        """
        return pulumi.get(self, "key_name")

    @property
    @pulumi.getter(name="valueName")
    def value_name(self) -> builtins.str:
        """
        The name of the value.
        """
        return pulumi.get(self, "value_name")


