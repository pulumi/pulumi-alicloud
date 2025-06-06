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
    'RouterExpressConnectRouterRegionArgs',
    'RouterExpressConnectRouterRegionArgsDict',
    'GetRouterInterfacesFilterArgs',
    'GetRouterInterfacesFilterArgsDict',
    'GetVirtualBorderRoutersFilterArgs',
    'GetVirtualBorderRoutersFilterArgsDict',
]

MYPY = False

if not MYPY:
    class RouterExpressConnectRouterRegionArgsDict(TypedDict):
        region_id: NotRequired[pulumi.Input[builtins.str]]
        """
        Representative region ID.
        """
        transit_mode: NotRequired[pulumi.Input[builtins.str]]
        """
        Represents the forwarding mode of the current region.
        """
elif False:
    RouterExpressConnectRouterRegionArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RouterExpressConnectRouterRegionArgs:
    def __init__(__self__, *,
                 region_id: Optional[pulumi.Input[builtins.str]] = None,
                 transit_mode: Optional[pulumi.Input[builtins.str]] = None):
        """
        :param pulumi.Input[builtins.str] region_id: Representative region ID.
        :param pulumi.Input[builtins.str] transit_mode: Represents the forwarding mode of the current region.
        """
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)
        if transit_mode is not None:
            pulumi.set(__self__, "transit_mode", transit_mode)

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Representative region ID.
        """
        return pulumi.get(self, "region_id")

    @region_id.setter
    def region_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "region_id", value)

    @property
    @pulumi.getter(name="transitMode")
    def transit_mode(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Represents the forwarding mode of the current region.
        """
        return pulumi.get(self, "transit_mode")

    @transit_mode.setter
    def transit_mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "transit_mode", value)


if not MYPY:
    class GetRouterInterfacesFilterArgsDict(TypedDict):
        key: NotRequired[builtins.str]
        values: NotRequired[Sequence[builtins.str]]
elif False:
    GetRouterInterfacesFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetRouterInterfacesFilterArgs:
    def __init__(__self__, *,
                 key: Optional[builtins.str] = None,
                 values: Optional[Sequence[builtins.str]] = None):
        if key is not None:
            pulumi.set(__self__, "key", key)
        if values is not None:
            pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> Optional[builtins.str]:
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[builtins.str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[Sequence[builtins.str]]:
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[Sequence[builtins.str]]):
        pulumi.set(self, "values", value)


if not MYPY:
    class GetVirtualBorderRoutersFilterArgsDict(TypedDict):
        key: NotRequired[builtins.str]
        """
        The key of the field to filter by, as defined by
        [Alibaba Cloud API](https://www.alibabacloud.com/help/en/doc-detail/124791.htm).
        """
        values: NotRequired[Sequence[builtins.str]]
        """
        Set of values that are accepted for the given field.
        """
elif False:
    GetVirtualBorderRoutersFilterArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetVirtualBorderRoutersFilterArgs:
    def __init__(__self__, *,
                 key: Optional[builtins.str] = None,
                 values: Optional[Sequence[builtins.str]] = None):
        """
        :param builtins.str key: The key of the field to filter by, as defined by
               [Alibaba Cloud API](https://www.alibabacloud.com/help/en/doc-detail/124791.htm).
        :param Sequence[builtins.str] values: Set of values that are accepted for the given field.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if values is not None:
            pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> Optional[builtins.str]:
        """
        The key of the field to filter by, as defined by
        [Alibaba Cloud API](https://www.alibabacloud.com/help/en/doc-detail/124791.htm).
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[builtins.str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[Sequence[builtins.str]]:
        """
        Set of values that are accepted for the given field.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[Sequence[builtins.str]]):
        pulumi.set(self, "values", value)


