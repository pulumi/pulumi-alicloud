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
                 cert_name: Optional[str] = None,
                 cert_type: Optional[str] = None,
                 ssl_pri: Optional[str] = None,
                 ssl_protocol: Optional[str] = None,
                 ssl_pub: Optional[str] = None):
        """
        :param str cert_name: If You Enable HTTPS Here Certificate Name.
        :param str cert_type: Certificate Type. Value Range: 
               * upload: Certificate
               * cas: Certificate Authority Certificate.
               * free: Free Certificate.
        :param str ssl_pri: Private Key. Do Not Enable Certificate without Entering a User Name and Configure Certificates Enter Private Key.
        :param str ssl_protocol: Whether to Enable SSL Certificate. Valid Values: on, off. Valid values: `on`, `off`.
        :param str ssl_pub: If You Enable HTTPS Here Key.
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
    def cert_name(self) -> Optional[str]:
        """
        If You Enable HTTPS Here Certificate Name.
        """
        return pulumi.get(self, "cert_name")

    @property
    @pulumi.getter(name="certType")
    def cert_type(self) -> Optional[str]:
        """
        Certificate Type. Value Range: 
        * upload: Certificate
        * cas: Certificate Authority Certificate.
        * free: Free Certificate.
        """
        return pulumi.get(self, "cert_type")

    @property
    @pulumi.getter(name="sslPri")
    def ssl_pri(self) -> Optional[str]:
        """
        Private Key. Do Not Enable Certificate without Entering a User Name and Configure Certificates Enter Private Key.
        """
        return pulumi.get(self, "ssl_pri")

    @property
    @pulumi.getter(name="sslProtocol")
    def ssl_protocol(self) -> Optional[str]:
        """
        Whether to Enable SSL Certificate. Valid Values: on, off. Valid values: `on`, `off`.
        """
        return pulumi.get(self, "ssl_protocol")

    @property
    @pulumi.getter(name="sslPub")
    def ssl_pub(self) -> Optional[str]:
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
                 arg_name: str,
                 arg_value: str):
        """
        :param str arg_name: The name of arg.
        :param str arg_value: The value of arg.
        """
        pulumi.set(__self__, "arg_name", arg_name)
        pulumi.set(__self__, "arg_value", arg_value)

    @property
    @pulumi.getter(name="argName")
    def arg_name(self) -> str:
        """
        The name of arg.
        """
        return pulumi.get(self, "arg_name")

    @property
    @pulumi.getter(name="argValue")
    def arg_value(self) -> str:
        """
        The value of arg.
        """
        return pulumi.get(self, "arg_value")


@pulumi.output_type
class DomainSource(dict):
    def __init__(__self__, *,
                 content: str,
                 port: int,
                 priority: str,
                 type: str,
                 enabled: Optional[str] = None):
        """
        :param str content: The Back-to-Source Address.
        :param int port: Port.
        :param str priority: Priority.
        :param str type: The Origin Server Type. Valid Values: 
               * ipaddr: IP Source Station
               * domain: the Domain Name
               * oss: OSS Bucket as a Source Station.
        :param str enabled: The source status. Valid values: online, offline.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "type", type)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        The Back-to-Source Address.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        Port.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> str:
        """
        Priority.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The Origin Server Type. Valid Values: 
        * ipaddr: IP Source Station
        * domain: the Domain Name
        * oss: OSS Bucket as a Source Station.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[str]:
        """
        The source status. Valid values: online, offline.
        """
        return pulumi.get(self, "enabled")


@pulumi.output_type
class GetDomainsDomainResult(dict):
    def __init__(__self__, *,
                 cert_infos: Sequence['outputs.GetDomainsDomainCertInfoResult'],
                 cname: str,
                 create_time: str,
                 description: str,
                 domain_name: str,
                 gmt_modified: str,
                 id: str,
                 resource_group_id: str,
                 sources: Sequence['outputs.GetDomainsDomainSourceResult'],
                 status: str):
        """
        :param Sequence['GetDomainsDomainCertInfoArgs'] cert_infos: Certificate Information.
        :param str cname: In Order to Link the CDN Domain Name to Generate a CNAME Domain Name, in the Domain Name Resolution Service Provider at the Acceleration Domain Name CNAME Resolution to the Domain.
        :param str create_time: Creation Time.
        :param str description: Review the Reason for the Failure Is Displayed.
        :param str domain_name: Your Domain Name.
        :param str gmt_modified: Last Modified Date.
        :param str id: The ID of the Domain. Its value is same as Queue Name.
        :param str resource_group_id: The Resource Group ID.
        :param Sequence['GetDomainsDomainSourceArgs'] sources: the Origin Server Information.
        :param str status: The status of the resource.
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
    def cname(self) -> str:
        """
        In Order to Link the CDN Domain Name to Generate a CNAME Domain Name, in the Domain Name Resolution Service Provider at the Acceleration Domain Name CNAME Resolution to the Domain.
        """
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        Creation Time.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Review the Reason for the Failure Is Displayed.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        Your Domain Name.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="gmtModified")
    def gmt_modified(self) -> str:
        """
        Last Modified Date.
        """
        return pulumi.get(self, "gmt_modified")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Domain. Its value is same as Queue Name.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> str:
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
    def status(self) -> str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetDomainsDomainCertInfoResult(dict):
    def __init__(__self__, *,
                 cert_name: str,
                 cert_type: str,
                 ssl_protocol: str,
                 ssl_pub: str):
        """
        :param str cert_name: If You Enable HTTPS Here Certificate Name.
        :param str cert_type: Certificate Type. Value Range: Upload: Certificate. CAS: Certificate Authority Certificate. Free: Free Certificate.
        :param str ssl_protocol: Whether to Enable SSL Certificate. Valid Values: on, off.
        :param str ssl_pub: If You Enable HTTPS Here Key.
        """
        pulumi.set(__self__, "cert_name", cert_name)
        pulumi.set(__self__, "cert_type", cert_type)
        pulumi.set(__self__, "ssl_protocol", ssl_protocol)
        pulumi.set(__self__, "ssl_pub", ssl_pub)

    @property
    @pulumi.getter(name="certName")
    def cert_name(self) -> str:
        """
        If You Enable HTTPS Here Certificate Name.
        """
        return pulumi.get(self, "cert_name")

    @property
    @pulumi.getter(name="certType")
    def cert_type(self) -> str:
        """
        Certificate Type. Value Range: Upload: Certificate. CAS: Certificate Authority Certificate. Free: Free Certificate.
        """
        return pulumi.get(self, "cert_type")

    @property
    @pulumi.getter(name="sslProtocol")
    def ssl_protocol(self) -> str:
        """
        Whether to Enable SSL Certificate. Valid Values: on, off.
        """
        return pulumi.get(self, "ssl_protocol")

    @property
    @pulumi.getter(name="sslPub")
    def ssl_pub(self) -> str:
        """
        If You Enable HTTPS Here Key.
        """
        return pulumi.get(self, "ssl_pub")


@pulumi.output_type
class GetDomainsDomainSourceResult(dict):
    def __init__(__self__, *,
                 content: str,
                 enabled: str,
                 port: int,
                 priority: str,
                 type: str):
        """
        :param str content: The Back-to-Source Address.
        :param str enabled: State.
        :param int port: Port.
        :param str priority: Priority.
        :param str type: the Origin Server Type. Valid Values: Ipaddr: IP Source Station Domain: the Domain Name, See Extra Domain Quota OSS: OSS Bucket as a Source Station.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        The Back-to-Source Address.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def enabled(self) -> str:
        """
        State.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        Port.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> str:
        """
        Priority.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        the Origin Server Type. Valid Values: Ipaddr: IP Source Station Domain: the Domain Name, See Extra Domain Quota OSS: OSS Bucket as a Source Station.
        """
        return pulumi.get(self, "type")


