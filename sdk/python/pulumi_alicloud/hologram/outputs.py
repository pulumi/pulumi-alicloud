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
    'InstanceEndpoint',
]

@pulumi.output_type
class InstanceEndpoint(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "alternativeEndpoints":
            suggest = "alternative_endpoints"
        elif key == "vpcId":
            suggest = "vpc_id"
        elif key == "vpcInstanceId":
            suggest = "vpc_instance_id"
        elif key == "vswitchId":
            suggest = "vswitch_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in InstanceEndpoint. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        InstanceEndpoint.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        InstanceEndpoint.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 alternative_endpoints: Optional[builtins.str] = None,
                 enabled: Optional[builtins.bool] = None,
                 endpoint: Optional[builtins.str] = None,
                 type: Optional[builtins.str] = None,
                 vpc_id: Optional[builtins.str] = None,
                 vpc_instance_id: Optional[builtins.str] = None,
                 vswitch_id: Optional[builtins.str] = None):
        """
        :param builtins.str alternative_endpoints: Some old instances have both AnyTunnel and SingleTunnel enabled. When switching from AnyTunnel to SingleTunnel, the endpoints of both are retained. Therefore, one more field is required to store the Endpoint.
        :param builtins.bool enabled: Whether to turn on the network.
        :param builtins.str endpoint: Domain name.
        :param builtins.str type: The network type.
        :param builtins.str vpc_id: VPC primary key.
        :param builtins.str vpc_instance_id: The vpc instance ID.
        :param builtins.str vswitch_id: The ID of the virtual switch.
        """
        if alternative_endpoints is not None:
            pulumi.set(__self__, "alternative_endpoints", alternative_endpoints)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if vpc_instance_id is not None:
            pulumi.set(__self__, "vpc_instance_id", vpc_instance_id)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="alternativeEndpoints")
    def alternative_endpoints(self) -> Optional[builtins.str]:
        """
        Some old instances have both AnyTunnel and SingleTunnel enabled. When switching from AnyTunnel to SingleTunnel, the endpoints of both are retained. Therefore, one more field is required to store the Endpoint.
        """
        return pulumi.get(self, "alternative_endpoints")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[builtins.bool]:
        """
        Whether to turn on the network.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[builtins.str]:
        """
        Domain name.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def type(self) -> Optional[builtins.str]:
        """
        The network type.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[builtins.str]:
        """
        VPC primary key.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vpcInstanceId")
    def vpc_instance_id(self) -> Optional[builtins.str]:
        """
        The vpc instance ID.
        """
        return pulumi.get(self, "vpc_instance_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[builtins.str]:
        """
        The ID of the virtual switch.
        """
        return pulumi.get(self, "vswitch_id")


