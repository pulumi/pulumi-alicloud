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
    'DbInstanceDbInstanceIpArrayArgs',
    'DbInstanceDbInstanceIpArrayArgsDict',
]

MYPY = False

if not MYPY:
    class DbInstanceDbInstanceIpArrayArgsDict(TypedDict):
        db_instance_ip_array_attribute: NotRequired[pulumi.Input[builtins.str]]
        """
        The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
        """
        db_instance_ip_array_name: NotRequired[pulumi.Input[builtins.str]]
        """
        IP ADDRESS whitelist group name.
        """
        security_ips: NotRequired[pulumi.Input[builtins.str]]
        """
        IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
        """
elif False:
    DbInstanceDbInstanceIpArrayArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class DbInstanceDbInstanceIpArrayArgs:
    def __init__(__self__, *,
                 db_instance_ip_array_attribute: Optional[pulumi.Input[builtins.str]] = None,
                 db_instance_ip_array_name: Optional[pulumi.Input[builtins.str]] = None,
                 security_ips: Optional[pulumi.Input[builtins.str]] = None):
        """
        :param pulumi.Input[builtins.str] db_instance_ip_array_attribute: The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
        :param pulumi.Input[builtins.str] db_instance_ip_array_name: IP ADDRESS whitelist group name.
        :param pulumi.Input[builtins.str] security_ips: IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
        """
        if db_instance_ip_array_attribute is not None:
            pulumi.set(__self__, "db_instance_ip_array_attribute", db_instance_ip_array_attribute)
        if db_instance_ip_array_name is not None:
            pulumi.set(__self__, "db_instance_ip_array_name", db_instance_ip_array_name)
        if security_ips is not None:
            pulumi.set(__self__, "security_ips", security_ips)

    @property
    @pulumi.getter(name="dbInstanceIpArrayAttribute")
    def db_instance_ip_array_attribute(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
        """
        return pulumi.get(self, "db_instance_ip_array_attribute")

    @db_instance_ip_array_attribute.setter
    def db_instance_ip_array_attribute(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "db_instance_ip_array_attribute", value)

    @property
    @pulumi.getter(name="dbInstanceIpArrayName")
    def db_instance_ip_array_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        IP ADDRESS whitelist group name.
        """
        return pulumi.get(self, "db_instance_ip_array_name")

    @db_instance_ip_array_name.setter
    def db_instance_ip_array_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "db_instance_ip_array_name", value)

    @property
    @pulumi.getter(name="securityIps")
    def security_ips(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
        """
        return pulumi.get(self, "security_ips")

    @security_ips.setter
    def security_ips(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "security_ips", value)


