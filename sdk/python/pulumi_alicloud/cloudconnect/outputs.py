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
    'GetNetworksNetworkResult',
]

@pulumi.output_type
class GetNetworksNetworkResult(dict):
    def __init__(__self__, *,
                 cidr_block: _builtins.str,
                 description: _builtins.str,
                 id: _builtins.str,
                 is_default: _builtins.bool,
                 name: _builtins.str):
        """
        :param _builtins.str cidr_block: CidrBlock of the CCN instance.
        :param _builtins.str id: ID of the CCN instance.
        :param _builtins.bool is_default: IsDefault of the CCN instance.
        :param _builtins.str name: Name of the CCN instance.
        """
        pulumi.set(__self__, "cidr_block", cidr_block)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "is_default", is_default)
        pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> _builtins.str:
        """
        CidrBlock of the CCN instance.
        """
        return pulumi.get(self, "cidr_block")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        ID of the CCN instance.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> _builtins.bool:
        """
        IsDefault of the CCN instance.
        """
        return pulumi.get(self, "is_default")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the CCN instance.
        """
        return pulumi.get(self, "name")


