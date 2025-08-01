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
    'CustomPropertyPropertyValueArgs',
    'CustomPropertyPropertyValueArgsDict',
    'EcdPolicyGroupAuthorizeAccessPolicyRuleArgs',
    'EcdPolicyGroupAuthorizeAccessPolicyRuleArgsDict',
    'EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs',
    'EcdPolicyGroupAuthorizeSecurityPolicyRuleArgsDict',
]

MYPY = False

if not MYPY:
    class CustomPropertyPropertyValueArgsDict(TypedDict):
        property_value: NotRequired[pulumi.Input[_builtins.str]]
        """
        The value of an attribute.
        """
        property_value_id: NotRequired[pulumi.Input[_builtins.str]]
        """
        The value of an attribute id.
        """
elif False:
    CustomPropertyPropertyValueArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class CustomPropertyPropertyValueArgs:
    def __init__(__self__, *,
                 property_value: Optional[pulumi.Input[_builtins.str]] = None,
                 property_value_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] property_value: The value of an attribute.
        :param pulumi.Input[_builtins.str] property_value_id: The value of an attribute id.
        """
        if property_value is not None:
            pulumi.set(__self__, "property_value", property_value)
        if property_value_id is not None:
            pulumi.set(__self__, "property_value_id", property_value_id)

    @_builtins.property
    @pulumi.getter(name="propertyValue")
    def property_value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The value of an attribute.
        """
        return pulumi.get(self, "property_value")

    @property_value.setter
    def property_value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "property_value", value)

    @_builtins.property
    @pulumi.getter(name="propertyValueId")
    def property_value_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The value of an attribute id.
        """
        return pulumi.get(self, "property_value_id")

    @property_value_id.setter
    def property_value_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "property_value_id", value)


if not MYPY:
    class EcdPolicyGroupAuthorizeAccessPolicyRuleArgsDict(TypedDict):
        cidr_ip: NotRequired[pulumi.Input[_builtins.str]]
        """
        The cidrip of authorize access rule.
        """
        description: NotRequired[pulumi.Input[_builtins.str]]
        """
        The description of authorize access rule.
        """
elif False:
    EcdPolicyGroupAuthorizeAccessPolicyRuleArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class EcdPolicyGroupAuthorizeAccessPolicyRuleArgs:
    def __init__(__self__, *,
                 cidr_ip: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] cidr_ip: The cidrip of authorize access rule.
        :param pulumi.Input[_builtins.str] description: The description of authorize access rule.
        """
        if cidr_ip is not None:
            pulumi.set(__self__, "cidr_ip", cidr_ip)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter(name="cidrIp")
    def cidr_ip(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The cidrip of authorize access rule.
        """
        return pulumi.get(self, "cidr_ip")

    @cidr_ip.setter
    def cidr_ip(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cidr_ip", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of authorize access rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)


if not MYPY:
    class EcdPolicyGroupAuthorizeSecurityPolicyRuleArgsDict(TypedDict):
        cidr_ip: NotRequired[pulumi.Input[_builtins.str]]
        """
        The cidrip of security rules.
        """
        description: NotRequired[pulumi.Input[_builtins.str]]
        """
        The description of security rules.
        """
        ip_protocol: NotRequired[pulumi.Input[_builtins.str]]
        """
        The ip protocol of security rules.
        """
        policy: NotRequired[pulumi.Input[_builtins.str]]
        """
        The policy of security rules.
        """
        port_range: NotRequired[pulumi.Input[_builtins.str]]
        """
        The port range of security rules.
        """
        priority: NotRequired[pulumi.Input[_builtins.str]]
        """
        The priority of security rules.
        """
        type: NotRequired[pulumi.Input[_builtins.str]]
        """
        The type of security rules.
        """
elif False:
    EcdPolicyGroupAuthorizeSecurityPolicyRuleArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs:
    def __init__(__self__, *,
                 cidr_ip: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 ip_protocol: Optional[pulumi.Input[_builtins.str]] = None,
                 policy: Optional[pulumi.Input[_builtins.str]] = None,
                 port_range: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] cidr_ip: The cidrip of security rules.
        :param pulumi.Input[_builtins.str] description: The description of security rules.
        :param pulumi.Input[_builtins.str] ip_protocol: The ip protocol of security rules.
        :param pulumi.Input[_builtins.str] policy: The policy of security rules.
        :param pulumi.Input[_builtins.str] port_range: The port range of security rules.
        :param pulumi.Input[_builtins.str] priority: The priority of security rules.
        :param pulumi.Input[_builtins.str] type: The type of security rules.
        """
        if cidr_ip is not None:
            pulumi.set(__self__, "cidr_ip", cidr_ip)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ip_protocol is not None:
            pulumi.set(__self__, "ip_protocol", ip_protocol)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if port_range is not None:
            pulumi.set(__self__, "port_range", port_range)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="cidrIp")
    def cidr_ip(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The cidrip of security rules.
        """
        return pulumi.get(self, "cidr_ip")

    @cidr_ip.setter
    def cidr_ip(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cidr_ip", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of security rules.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="ipProtocol")
    def ip_protocol(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ip protocol of security rules.
        """
        return pulumi.get(self, "ip_protocol")

    @ip_protocol.setter
    def ip_protocol(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ip_protocol", value)

    @_builtins.property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy of security rules.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy", value)

    @_builtins.property
    @pulumi.getter(name="portRange")
    def port_range(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The port range of security rules.
        """
        return pulumi.get(self, "port_range")

    @port_range.setter
    def port_range(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "port_range", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The priority of security rules.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of security rules.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


