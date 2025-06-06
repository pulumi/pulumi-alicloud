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
from . import outputs

__all__ = [
    'DomainCertInfo',
    'DomainConfigFunctionArg',
    'DomainSource',
    'GetDomainsDomainResult',
    'GetDomainsDomainCertInfoResult',
    'GetDomainsDomainSourceResult',
]

@pulumi.output_type
class DomainCertInfo(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "certName":
            suggest = "cert_name"
        elif key == "certType":
            suggest = "cert_type"
        elif key == "sslPri":
            suggest = "ssl_pri"
        elif key == "sslProtocol":
            suggest = "ssl_protocol"
        elif key == "sslPub":
            suggest = "ssl_pub"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainCertInfo. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainCertInfo.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainCertInfo.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 cert_name: Optional[builtins.str] = None,
                 cert_type: Optional[builtins.str] = None,
                 ssl_pri: Optional[builtins.str] = None,
                 ssl_protocol: Optional[builtins.str] = None,
                 ssl_pub: Optional[builtins.str] = None):
        """
        :param builtins.str cert_name: If You Enable HTTPS Here Certificate Name.
        :param builtins.str cert_type: Certificate Type. Value Range: 
               * upload: Certificate
               * cas: Certificate Authority Certificate.
               * free: Free Certificate.
        :param builtins.str ssl_pri: Private Key. Do Not Enable Certificate without Entering a User Name and Configure Certificates Enter Private Key.
        :param builtins.str ssl_protocol: Whether to Enable SSL Certificate. Valid Values: on, off. Valid values: `on`, `off`.
        :param builtins.str ssl_pub: If You Enable HTTPS Here Key.
        """
        if cert_name is not None:
            pulumi.set(__self__, "cert_name", cert_name)
        if cert_type is not None:
            pulumi.set(__self__, "cert_type", cert_type)
        if ssl_pri is not None:
            pulumi.set(__self__, "ssl_pri", ssl_pri)
        if ssl_protocol is not None:
            pulumi.set(__self__, "ssl_protocol", ssl_protocol)
        if ssl_pub is not None:
            pulumi.set(__self__, "ssl_pub", ssl_pub)

    @property
    @pulumi.getter(name="certName")
    def cert_name(self) -> Optional[builtins.str]:
        """
        If You Enable HTTPS Here Certificate Name.
        """
        return pulumi.get(self, "cert_name")

    @property
    @pulumi.getter(name="certType")
    def cert_type(self) -> Optional[builtins.str]:
        """
        Certificate Type. Value Range: 
        * upload: Certificate
        * cas: Certificate Authority Certificate.
        * free: Free Certificate.
        """
        return pulumi.get(self, "cert_type")

    @property
    @pulumi.getter(name="sslPri")
    def ssl_pri(self) -> Optional[builtins.str]:
        """
        Private Key. Do Not Enable Certificate without Entering a User Name and Configure Certificates Enter Private Key.
        """
        return pulumi.get(self, "ssl_pri")

    @property
    @pulumi.getter(name="sslProtocol")
    def ssl_protocol(self) -> Optional[builtins.str]:
        """
        Whether to Enable SSL Certificate. Valid Values: on, off. Valid values: `on`, `off`.
        """
        return pulumi.get(self, "ssl_protocol")

    @property
    @pulumi.getter(name="sslPub")
    def ssl_pub(self) -> Optional[builtins.str]:
        """
        If You Enable HTTPS Here Key.
        """
        return pulumi.get(self, "ssl_pub")


@pulumi.output_type
class DomainConfigFunctionArg(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "argName":
            suggest = "arg_name"
        elif key == "argValue":
            suggest = "arg_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainConfigFunctionArg. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainConfigFunctionArg.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainConfigFunctionArg.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 arg_name: builtins.str,
                 arg_value: builtins.str):
        """
        :param builtins.str arg_name: The name of arg.
        :param builtins.str arg_value: The value of arg.
        """
        pulumi.set(__self__, "arg_name", arg_name)
        pulumi.set(__self__, "arg_value", arg_value)

    @property
    @pulumi.getter(name="argName")
    def arg_name(self) -> builtins.str:
        """
        The name of arg.
        """
        return pulumi.get(self, "arg_name")

    @property
    @pulumi.getter(name="argValue")
    def arg_value(self) -> builtins.str:
        """
        The value of arg.
        """
        return pulumi.get(self, "arg_value")


@pulumi.output_type
class DomainSource(dict):
    def __init__(__self__, *,
                 content: builtins.str,
                 port: builtins.int,
                 priority: builtins.str,
                 type: builtins.str,
                 enabled: Optional[builtins.str] = None):
        """
        :param builtins.str content: The Back-to-Source Address.
        :param builtins.int port: Port.
        :param builtins.str priority: Priority.
        :param builtins.str type: The Origin Server Type. Valid Values: 
               * ipaddr: IP Source Station
               * domain: the Domain Name
               * oss: OSS Bucket as a Source Station.
        :param builtins.str enabled: The source status. Valid values: online, offline.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "type", type)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def content(self) -> builtins.str:
        """
        The Back-to-Source Address.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def port(self) -> builtins.int:
        """
        Port.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> builtins.str:
        """
        Priority.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        The Origin Server Type. Valid Values: 
        * ipaddr: IP Source Station
        * domain: the Domain Name
        * oss: OSS Bucket as a Source Station.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[builtins.str]:
        """
        The source status. Valid values: online, offline.
        """
        return pulumi.get(self, "enabled")


@pulumi.output_type
class GetDomainsDomainResult(dict):
    def __init__(__self__, *,
                 cert_infos: Sequence['outputs.GetDomainsDomainCertInfoResult'],
                 cname: builtins.str,
                 create_time: builtins.str,
                 description: builtins.str,
                 domain_name: builtins.str,
                 gmt_modified: builtins.str,
                 id: builtins.str,
                 resource_group_id: builtins.str,
                 sources: Sequence['outputs.GetDomainsDomainSourceResult'],
                 status: builtins.str):
        """
        :param Sequence['GetDomainsDomainCertInfoArgs'] cert_infos: Certificate Information.
        :param builtins.str cname: In Order to Link the CDN Domain Name to Generate a CNAME Domain Name, in the Domain Name Resolution Service Provider at the Acceleration Domain Name CNAME Resolution to the Domain.
        :param builtins.str create_time: Creation Time.
        :param builtins.str description: Review the Reason for the Failure Is Displayed.
        :param builtins.str domain_name: Your Domain Name.
        :param builtins.str gmt_modified: Last Modified Date.
        :param builtins.str id: The ID of the Domain. Its value is same as Queue Name.
        :param builtins.str resource_group_id: The Resource Group ID.
        :param Sequence['GetDomainsDomainSourceArgs'] sources: the Origin Server Information.
        :param builtins.str status: The status of the resource.
        """
        pulumi.set(__self__, "cert_infos", cert_infos)
        pulumi.set(__self__, "cname", cname)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "gmt_modified", gmt_modified)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "sources", sources)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="certInfos")
    def cert_infos(self) -> Sequence['outputs.GetDomainsDomainCertInfoResult']:
        """
        Certificate Information.
        """
        return pulumi.get(self, "cert_infos")

    @property
    @pulumi.getter
    def cname(self) -> builtins.str:
        """
        In Order to Link the CDN Domain Name to Generate a CNAME Domain Name, in the Domain Name Resolution Service Provider at the Acceleration Domain Name CNAME Resolution to the Domain.
        """
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> builtins.str:
        """
        Creation Time.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        Review the Reason for the Failure Is Displayed.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> builtins.str:
        """
        Your Domain Name.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="gmtModified")
    def gmt_modified(self) -> builtins.str:
        """
        Last Modified Date.
        """
        return pulumi.get(self, "gmt_modified")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of the Domain. Its value is same as Queue Name.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> builtins.str:
        """
        The Resource Group ID.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def sources(self) -> Sequence['outputs.GetDomainsDomainSourceResult']:
        """
        the Origin Server Information.
        """
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def status(self) -> builtins.str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetDomainsDomainCertInfoResult(dict):
    def __init__(__self__, *,
                 cert_name: builtins.str,
                 cert_type: builtins.str,
                 ssl_protocol: builtins.str,
                 ssl_pub: builtins.str):
        """
        :param builtins.str cert_name: If You Enable HTTPS Here Certificate Name.
        :param builtins.str cert_type: Certificate Type. Value Range: Upload: Certificate. CAS: Certificate Authority Certificate. Free: Free Certificate.
        :param builtins.str ssl_protocol: Whether to Enable SSL Certificate. Valid Values: on, off.
        :param builtins.str ssl_pub: If You Enable HTTPS Here Key.
        """
        pulumi.set(__self__, "cert_name", cert_name)
        pulumi.set(__self__, "cert_type", cert_type)
        pulumi.set(__self__, "ssl_protocol", ssl_protocol)
        pulumi.set(__self__, "ssl_pub", ssl_pub)

    @property
    @pulumi.getter(name="certName")
    def cert_name(self) -> builtins.str:
        """
        If You Enable HTTPS Here Certificate Name.
        """
        return pulumi.get(self, "cert_name")

    @property
    @pulumi.getter(name="certType")
    def cert_type(self) -> builtins.str:
        """
        Certificate Type. Value Range: Upload: Certificate. CAS: Certificate Authority Certificate. Free: Free Certificate.
        """
        return pulumi.get(self, "cert_type")

    @property
    @pulumi.getter(name="sslProtocol")
    def ssl_protocol(self) -> builtins.str:
        """
        Whether to Enable SSL Certificate. Valid Values: on, off.
        """
        return pulumi.get(self, "ssl_protocol")

    @property
    @pulumi.getter(name="sslPub")
    def ssl_pub(self) -> builtins.str:
        """
        If You Enable HTTPS Here Key.
        """
        return pulumi.get(self, "ssl_pub")


@pulumi.output_type
class GetDomainsDomainSourceResult(dict):
    def __init__(__self__, *,
                 content: builtins.str,
                 enabled: builtins.str,
                 port: builtins.int,
                 priority: builtins.str,
                 type: builtins.str):
        """
        :param builtins.str content: The Back-to-Source Address.
        :param builtins.str enabled: State.
        :param builtins.int port: Port.
        :param builtins.str priority: Priority.
        :param builtins.str type: the Origin Server Type. Valid Values: Ipaddr: IP Source Station Domain: the Domain Name, See Extra Domain Quota OSS: OSS Bucket as a Source Station.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def content(self) -> builtins.str:
        """
        The Back-to-Source Address.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def enabled(self) -> builtins.str:
        """
        State.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def port(self) -> builtins.int:
        """
        Port.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> builtins.str:
        """
        Priority.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        the Origin Server Type. Valid Values: Ipaddr: IP Source Station Domain: the Domain Name, See Extra Domain Quota OSS: OSS Bucket as a Source Station.
        """
        return pulumi.get(self, "type")


