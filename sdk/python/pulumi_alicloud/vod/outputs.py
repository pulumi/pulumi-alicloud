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
from . import outputs

__all__ = [
    'DomainSource',
    'GetDomainsDomainResult',
    'GetDomainsDomainSourceResult',
]

@pulumi.output_type
class DomainSource(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "sourceContent":
            suggest = "source_content"
        elif key == "sourcePort":
            suggest = "source_port"
        elif key == "sourceType":
            suggest = "source_type"
        elif key == "sourcePriority":
            suggest = "source_priority"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainSource. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainSource.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainSource.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 source_content: _builtins.str,
                 source_port: _builtins.str,
                 source_type: _builtins.str,
                 source_priority: Optional[_builtins.str] = None):
        """
        :param _builtins.str source_content: The address of the origin server. You can specify an IP address or a domain name.
        :param _builtins.str source_port: The port number. You can specify port 443 or 80. **Default value: 80**. If you specify port 443, Alibaba Cloud CDN communicates with the origin server over HTTPS. You can also customize a port.
        :param _builtins.str source_type: The type of the origin server. Valid values:
        :param _builtins.str source_priority: The priority of the origin server if multiple origin servers are specified. Valid values: `20` and `30`. **Default value: 20**. A value of 20 indicates that the origin server is the primary origin server. A value of 30 indicates that the origin server is a secondary origin server.
        """
        pulumi.set(__self__, "source_content", source_content)
        pulumi.set(__self__, "source_port", source_port)
        pulumi.set(__self__, "source_type", source_type)
        if source_priority is not None:
            pulumi.set(__self__, "source_priority", source_priority)

    @_builtins.property
    @pulumi.getter(name="sourceContent")
    def source_content(self) -> _builtins.str:
        """
        The address of the origin server. You can specify an IP address or a domain name.
        """
        return pulumi.get(self, "source_content")

    @_builtins.property
    @pulumi.getter(name="sourcePort")
    def source_port(self) -> _builtins.str:
        """
        The port number. You can specify port 443 or 80. **Default value: 80**. If you specify port 443, Alibaba Cloud CDN communicates with the origin server over HTTPS. You can also customize a port.
        """
        return pulumi.get(self, "source_port")

    @_builtins.property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> _builtins.str:
        """
        The type of the origin server. Valid values:
        """
        return pulumi.get(self, "source_type")

    @_builtins.property
    @pulumi.getter(name="sourcePriority")
    def source_priority(self) -> Optional[_builtins.str]:
        """
        The priority of the origin server if multiple origin servers are specified. Valid values: `20` and `30`. **Default value: 20**. A value of 20 indicates that the origin server is the primary origin server. A value of 30 indicates that the origin server is a secondary origin server.
        """
        return pulumi.get(self, "source_priority")


@pulumi.output_type
class GetDomainsDomainResult(dict):
    def __init__(__self__, *,
                 cname: _builtins.str,
                 description: _builtins.str,
                 domain_name: _builtins.str,
                 gmt_created: _builtins.str,
                 gmt_modified: _builtins.str,
                 id: _builtins.str,
                 sand_box: _builtins.str,
                 sources: Sequence['outputs.GetDomainsDomainSourceResult'],
                 ssl_protocol: _builtins.str,
                 status: _builtins.str):
        """
        :param _builtins.str cname: The CNAME that is assigned to the domain name for CDN. You must add a CNAME record in the system of your Domain Name System (DNS) service provider to map the domain name for CDN to the CNAME.
        :param _builtins.str description: The description of the domain name for CDN.
        :param _builtins.str domain_name: The domain name for CDN.
        :param _builtins.str gmt_created: The time when the domain name for CDN was added. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        :param _builtins.str gmt_modified: The last time when the domain name for CDN was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        :param _builtins.str id: The ID of the Domain. Its value is same as Queue Name.
        :param _builtins.str sand_box: Indicates whether the domain name for CDN is in a sandbox environment.
        :param Sequence['GetDomainsDomainSourceArgs'] sources: The information about the address of the origin server. For more information about the Sources parameter, See the following `Block sources`.
        :param _builtins.str ssl_protocol: Indicates whether the Secure Sockets Layer (SSL) certificate is enabled. Valid values: `on`,`off`.
        :param _builtins.str status: The status of the resource.
        """
        pulumi.set(__self__, "cname", cname)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "gmt_created", gmt_created)
        pulumi.set(__self__, "gmt_modified", gmt_modified)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "sand_box", sand_box)
        pulumi.set(__self__, "sources", sources)
        pulumi.set(__self__, "ssl_protocol", ssl_protocol)
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def cname(self) -> _builtins.str:
        """
        The CNAME that is assigned to the domain name for CDN. You must add a CNAME record in the system of your Domain Name System (DNS) service provider to map the domain name for CDN to the CNAME.
        """
        return pulumi.get(self, "cname")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description of the domain name for CDN.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> _builtins.str:
        """
        The domain name for CDN.
        """
        return pulumi.get(self, "domain_name")

    @_builtins.property
    @pulumi.getter(name="gmtCreated")
    def gmt_created(self) -> _builtins.str:
        """
        The time when the domain name for CDN was added. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        """
        return pulumi.get(self, "gmt_created")

    @_builtins.property
    @pulumi.getter(name="gmtModified")
    def gmt_modified(self) -> _builtins.str:
        """
        The last time when the domain name for CDN was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        """
        return pulumi.get(self, "gmt_modified")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Domain. Its value is same as Queue Name.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="sandBox")
    def sand_box(self) -> _builtins.str:
        """
        Indicates whether the domain name for CDN is in a sandbox environment.
        """
        return pulumi.get(self, "sand_box")

    @_builtins.property
    @pulumi.getter
    def sources(self) -> Sequence['outputs.GetDomainsDomainSourceResult']:
        """
        The information about the address of the origin server. For more information about the Sources parameter, See the following `Block sources`.
        """
        return pulumi.get(self, "sources")

    @_builtins.property
    @pulumi.getter(name="sslProtocol")
    def ssl_protocol(self) -> _builtins.str:
        """
        Indicates whether the Secure Sockets Layer (SSL) certificate is enabled. Valid values: `on`,`off`.
        """
        return pulumi.get(self, "ssl_protocol")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetDomainsDomainSourceResult(dict):
    def __init__(__self__, *,
                 source_content: _builtins.str,
                 source_port: _builtins.str,
                 source_priority: _builtins.str,
                 source_type: _builtins.str):
        pulumi.set(__self__, "source_content", source_content)
        pulumi.set(__self__, "source_port", source_port)
        pulumi.set(__self__, "source_priority", source_priority)
        pulumi.set(__self__, "source_type", source_type)

    @_builtins.property
    @pulumi.getter(name="sourceContent")
    def source_content(self) -> _builtins.str:
        return pulumi.get(self, "source_content")

    @_builtins.property
    @pulumi.getter(name="sourcePort")
    def source_port(self) -> _builtins.str:
        return pulumi.get(self, "source_port")

    @_builtins.property
    @pulumi.getter(name="sourcePriority")
    def source_priority(self) -> _builtins.str:
        return pulumi.get(self, "source_priority")

    @_builtins.property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> _builtins.str:
        return pulumi.get(self, "source_type")


