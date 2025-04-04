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
    'HttpRequestHeaderModificationRuleRequestHeaderModification',
    'HttpResponseHeaderModificationRuleResponseHeaderModification',
    'OriginPoolOrigin',
    'OriginPoolOriginAuthConf',
    'RecordAuthConf',
    'RecordData',
    'WaitingRoomHostNameAndPath',
    'GetSitesSiteResult',
]

@pulumi.output_type
class HttpRequestHeaderModificationRuleRequestHeaderModification(dict):
    def __init__(__self__, *,
                 name: str,
                 operation: str,
                 value: Optional[str] = None):
        """
        :param str name: Request Header Name.
        :param str operation: Mode of operation. Value range:
               add: add.
               del: delete
               modify: change.
        :param str value: Request header value
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "operation", operation)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Request Header Name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def operation(self) -> str:
        """
        Mode of operation. Value range:
        add: add.
        del: delete
        modify: change.
        """
        return pulumi.get(self, "operation")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        Request header value
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class HttpResponseHeaderModificationRuleResponseHeaderModification(dict):
    def __init__(__self__, *,
                 name: str,
                 operation: str,
                 value: Optional[str] = None):
        """
        :param str name: The response header name.
        :param str operation: Mode of operation.
        :param str value: The response header value.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "operation", operation)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The response header name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def operation(self) -> str:
        """
        Mode of operation.
        """
        return pulumi.get(self, "operation")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        The response header value.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class OriginPoolOrigin(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "authConf":
            suggest = "auth_conf"
        elif key == "originId":
            suggest = "origin_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OriginPoolOrigin. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OriginPoolOrigin.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OriginPoolOrigin.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 address: Optional[str] = None,
                 auth_conf: Optional['outputs.OriginPoolOriginAuthConf'] = None,
                 enabled: Optional[bool] = None,
                 header: Optional[str] = None,
                 name: Optional[str] = None,
                 origin_id: Optional[int] = None,
                 type: Optional[str] = None,
                 weight: Optional[int] = None):
        """
        :param str address: Origin Address.
        :param 'OriginPoolOriginAuthConfArgs' auth_conf: The authentication information. When the source Station is an OSS or S3 and other source stations need to be authenticated, the authentication-related configuration information needs to be transmitted. See `auth_conf` below.
        :param bool enabled: Whether the source station is enabled:
        :param str header: The request header that is sent when returning to the source. Only Host is supported.
        :param str name: Origin Name.
        :param int origin_id: Origin ID.
        :param str type: Source station type:
        :param int weight: Weight, 0-100.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if auth_conf is not None:
            pulumi.set(__self__, "auth_conf", auth_conf)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if header is not None:
            pulumi.set(__self__, "header", header)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if origin_id is not None:
            pulumi.set(__self__, "origin_id", origin_id)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def address(self) -> Optional[str]:
        """
        Origin Address.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter(name="authConf")
    def auth_conf(self) -> Optional['outputs.OriginPoolOriginAuthConf']:
        """
        The authentication information. When the source Station is an OSS or S3 and other source stations need to be authenticated, the authentication-related configuration information needs to be transmitted. See `auth_conf` below.
        """
        return pulumi.get(self, "auth_conf")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Whether the source station is enabled:
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def header(self) -> Optional[str]:
        """
        The request header that is sent when returning to the source. Only Host is supported.
        """
        return pulumi.get(self, "header")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Origin Name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="originId")
    def origin_id(self) -> Optional[int]:
        """
        Origin ID.
        """
        return pulumi.get(self, "origin_id")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Source station type:
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def weight(self) -> Optional[int]:
        """
        Weight, 0-100.
        """
        return pulumi.get(self, "weight")


@pulumi.output_type
class OriginPoolOriginAuthConf(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "accessKey":
            suggest = "access_key"
        elif key == "authType":
            suggest = "auth_type"
        elif key == "secretKey":
            suggest = "secret_key"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OriginPoolOriginAuthConf. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OriginPoolOriginAuthConf.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OriginPoolOriginAuthConf.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 access_key: Optional[str] = None,
                 auth_type: Optional[str] = None,
                 region: Optional[str] = None,
                 secret_key: Optional[str] = None,
                 version: Optional[str] = None):
        """
        :param str access_key: The AccessKey to be passed when AuthType is set to private_cross_account or private.
        :param str auth_type: Authentication type.
        :param str region: The Region of the source station to be transmitted when the source station is AWS S3.
        :param str secret_key: The SecretKey to be passed when AuthType is set to private_cross_account or private.
        :param str version: The signature version to be transmitted when the source station is AWS S3.
        """
        if access_key is not None:
            pulumi.set(__self__, "access_key", access_key)
        if auth_type is not None:
            pulumi.set(__self__, "auth_type", auth_type)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if secret_key is not None:
            pulumi.set(__self__, "secret_key", secret_key)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[str]:
        """
        The AccessKey to be passed when AuthType is set to private_cross_account or private.
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter(name="authType")
    def auth_type(self) -> Optional[str]:
        """
        Authentication type.
        """
        return pulumi.get(self, "auth_type")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        """
        The Region of the source station to be transmitted when the source station is AWS S3.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[str]:
        """
        The SecretKey to be passed when AuthType is set to private_cross_account or private.
        """
        return pulumi.get(self, "secret_key")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        """
        The signature version to be transmitted when the source station is AWS S3.
        """
        return pulumi.get(self, "version")


@pulumi.output_type
class RecordAuthConf(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "accessKey":
            suggest = "access_key"
        elif key == "authType":
            suggest = "auth_type"
        elif key == "secretKey":
            suggest = "secret_key"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RecordAuthConf. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RecordAuthConf.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RecordAuthConf.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 access_key: Optional[str] = None,
                 auth_type: Optional[str] = None,
                 region: Optional[str] = None,
                 secret_key: Optional[str] = None,
                 version: Optional[str] = None):
        """
        :param str access_key: The access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
        :param str auth_type: The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, you must specify the authentication type of the origin. Valid values:
        :param str region: The version of the signature algorithm. This parameter is required when the origin type is S3 and AuthType is private. The following two types are supported:
        :param str secret_key: The secret access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
        :param str version: The region of the origin. If the origin type is S3, you must specify this value. You can get the region information from the official website of S3.
        """
        if access_key is not None:
            pulumi.set(__self__, "access_key", access_key)
        if auth_type is not None:
            pulumi.set(__self__, "auth_type", auth_type)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if secret_key is not None:
            pulumi.set(__self__, "secret_key", secret_key)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[str]:
        """
        The access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter(name="authType")
    def auth_type(self) -> Optional[str]:
        """
        The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, you must specify the authentication type of the origin. Valid values:
        """
        return pulumi.get(self, "auth_type")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        """
        The version of the signature algorithm. This parameter is required when the origin type is S3 and AuthType is private. The following two types are supported:
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[str]:
        """
        The secret access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
        """
        return pulumi.get(self, "secret_key")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        """
        The region of the origin. If the origin type is S3, you must specify this value. You can get the region information from the official website of S3.
        """
        return pulumi.get(self, "version")


@pulumi.output_type
class RecordData(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "keyTag":
            suggest = "key_tag"
        elif key == "matchingType":
            suggest = "matching_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RecordData. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RecordData.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RecordData.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 algorithm: Optional[int] = None,
                 certificate: Optional[str] = None,
                 fingerprint: Optional[str] = None,
                 flag: Optional[int] = None,
                 key_tag: Optional[int] = None,
                 matching_type: Optional[int] = None,
                 port: Optional[int] = None,
                 priority: Optional[int] = None,
                 selector: Optional[int] = None,
                 tag: Optional[str] = None,
                 type: Optional[int] = None,
                 usage: Optional[int] = None,
                 value: Optional[str] = None,
                 weight: Optional[int] = None):
        """
        :param int algorithm: The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.
        :param str certificate: The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.
        :param str fingerprint: The public key fingerprint of the record. This parameter is required when you add a SSHFP record.
        :param int flag: The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.
        :param int key_tag: The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.
        :param int matching_type: The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
        :param int port: The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.
        :param int priority: The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.
        :param int selector: The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
        :param str tag: The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record.
        :param int type: The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.
        :param int usage: The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
        :param str value: The record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on different types of records:
               
               - **A/AAAA**: the IP address(es). Separate multiple IPs with commas (,). You must have at least one IPv4 address.
               - `CNAME`: the target domain name.
               - `NS`: the name servers for the domain name.
               - `MX`: a valid domain name of the target mail server.
               - `TXT`: a valid text string.
               - `CAA`: a valid domain name of the certificate authority.
               - `SRV`: a valid domain name of the target host.
               - `URI`: a valid URI string.
        :param int weight: The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.
        """
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if fingerprint is not None:
            pulumi.set(__self__, "fingerprint", fingerprint)
        if flag is not None:
            pulumi.set(__self__, "flag", flag)
        if key_tag is not None:
            pulumi.set(__self__, "key_tag", key_tag)
        if matching_type is not None:
            pulumi.set(__self__, "matching_type", matching_type)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if selector is not None:
            pulumi.set(__self__, "selector", selector)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if usage is not None:
            pulumi.set(__self__, "usage", usage)
        if value is not None:
            pulumi.set(__self__, "value", value)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[int]:
        """
        The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.
        """
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter
    def certificate(self) -> Optional[str]:
        """
        The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter
    def fingerprint(self) -> Optional[str]:
        """
        The public key fingerprint of the record. This parameter is required when you add a SSHFP record.
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def flag(self) -> Optional[int]:
        """
        The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.
        """
        return pulumi.get(self, "flag")

    @property
    @pulumi.getter(name="keyTag")
    def key_tag(self) -> Optional[int]:
        """
        The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.
        """
        return pulumi.get(self, "key_tag")

    @property
    @pulumi.getter(name="matchingType")
    def matching_type(self) -> Optional[int]:
        """
        The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
        """
        return pulumi.get(self, "matching_type")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> Optional[int]:
        """
        The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def selector(self) -> Optional[int]:
        """
        The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
        """
        return pulumi.get(self, "selector")

    @property
    @pulumi.getter
    def tag(self) -> Optional[str]:
        """
        The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def type(self) -> Optional[int]:
        """
        The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def usage(self) -> Optional[int]:
        """
        The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.
        """
        return pulumi.get(self, "usage")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        The record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on different types of records:

        - **A/AAAA**: the IP address(es). Separate multiple IPs with commas (,). You must have at least one IPv4 address.
        - `CNAME`: the target domain name.
        - `NS`: the name servers for the domain name.
        - `MX`: a valid domain name of the target mail server.
        - `TXT`: a valid text string.
        - `CAA`: a valid domain name of the certificate authority.
        - `SRV`: a valid domain name of the target host.
        - `URI`: a valid URI string.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter
    def weight(self) -> Optional[int]:
        """
        The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.
        """
        return pulumi.get(self, "weight")


@pulumi.output_type
class WaitingRoomHostNameAndPath(dict):
    def __init__(__self__, *,
                 domain: str,
                 path: str,
                 subdomain: str):
        """
        :param str domain: The domain name.
        :param str path: The path.
        :param str subdomain: The subdomain.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "path", path)
        pulumi.set(__self__, "subdomain", subdomain)

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        The domain name.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        The path.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def subdomain(self) -> str:
        """
        The subdomain.
        """
        return pulumi.get(self, "subdomain")


@pulumi.output_type
class GetSitesSiteResult(dict):
    def __init__(__self__, *,
                 access_type: str,
                 coverage: str,
                 create_time: str,
                 id: int,
                 instance_id: str,
                 modify_time: str,
                 name_server_list: str,
                 resource_group_id: str,
                 site_id: int,
                 site_name: str,
                 status: str):
        """
        :param str access_type: Access type. Value:-**NS**: Managed access via NS.-**CNAME**: access through CNAME.
        :param str coverage: Acceleration area
        :param str create_time: Creation time
        :param int id: The ID of the resource supplied above.
        :param str instance_id: The ID of the associated package instance.
        :param str modify_time: Modification time
        :param str name_server_list: Site Resolution Name Server List
        :param str resource_group_id: The ID of the resource group
        :param int site_id: Site ID
        :param str site_name: Site Name
        :param str status: The status of the resource
        """
        pulumi.set(__self__, "access_type", access_type)
        pulumi.set(__self__, "coverage", coverage)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "modify_time", modify_time)
        pulumi.set(__self__, "name_server_list", name_server_list)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "site_id", site_id)
        pulumi.set(__self__, "site_name", site_name)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> str:
        """
        Access type. Value:-**NS**: Managed access via NS.-**CNAME**: access through CNAME.
        """
        return pulumi.get(self, "access_type")

    @property
    @pulumi.getter
    def coverage(self) -> str:
        """
        Acceleration area
        """
        return pulumi.get(self, "coverage")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        Creation time
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The ID of the resource supplied above.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The ID of the associated package instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="modifyTime")
    def modify_time(self) -> str:
        """
        Modification time
        """
        return pulumi.get(self, "modify_time")

    @property
    @pulumi.getter(name="nameServerList")
    def name_server_list(self) -> str:
        """
        Site Resolution Name Server List
        """
        return pulumi.get(self, "name_server_list")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> str:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> int:
        """
        Site ID
        """
        return pulumi.get(self, "site_id")

    @property
    @pulumi.getter(name="siteName")
    def site_name(self) -> str:
        """
        Site Name
        """
        return pulumi.get(self, "site_name")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")


