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
    'GetCertificatesCertificateResult',
    'GetServiceCertificatesCertificateResult',
]

@pulumi.output_type
class GetCertificatesCertificateResult(dict):
    def __init__(__self__, *,
                 buy_in_aliyun: _builtins.bool,
                 cert: _builtins.str,
                 cert_id: _builtins.str,
                 certificate_name: _builtins.str,
                 city: _builtins.str,
                 common: _builtins.str,
                 country: _builtins.str,
                 end_date: _builtins.str,
                 expired: _builtins.bool,
                 fingerprint: _builtins.str,
                 id: _builtins.str,
                 issuer: _builtins.str,
                 key: _builtins.str,
                 name: _builtins.str,
                 org_name: _builtins.str,
                 province: _builtins.str,
                 sans: _builtins.str,
                 start_date: _builtins.str):
        """
        :param _builtins.bool buy_in_aliyun: The cert is buy from aliyun or not.
        :param _builtins.str city: The cert's city.
        :param _builtins.str common: The cert's common name.
        :param _builtins.str country: The cert's country.
        :param _builtins.str end_date: The cert's not valid after time.
        :param _builtins.bool expired: The cert is expired or not.
        :param _builtins.str id: The cert's id.
        :param _builtins.str issuer: The cert's .
        :param _builtins.str name: The cert's name.
        :param _builtins.str org_name: The cert's organization.
        :param _builtins.str province: The cert's province.
        :param _builtins.str sans: The cert's subject alternative name.
        :param _builtins.str start_date: The cert's not valid before time.
        """
        pulumi.set(__self__, "buy_in_aliyun", buy_in_aliyun)
        pulumi.set(__self__, "cert", cert)
        pulumi.set(__self__, "cert_id", cert_id)
        pulumi.set(__self__, "certificate_name", certificate_name)
        pulumi.set(__self__, "city", city)
        pulumi.set(__self__, "common", common)
        pulumi.set(__self__, "country", country)
        pulumi.set(__self__, "end_date", end_date)
        pulumi.set(__self__, "expired", expired)
        pulumi.set(__self__, "fingerprint", fingerprint)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "issuer", issuer)
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "org_name", org_name)
        pulumi.set(__self__, "province", province)
        pulumi.set(__self__, "sans", sans)
        pulumi.set(__self__, "start_date", start_date)

    @_builtins.property
    @pulumi.getter(name="buyInAliyun")
    def buy_in_aliyun(self) -> _builtins.bool:
        """
        The cert is buy from aliyun or not.
        """
        return pulumi.get(self, "buy_in_aliyun")

    @_builtins.property
    @pulumi.getter
    def cert(self) -> _builtins.str:
        return pulumi.get(self, "cert")

    @_builtins.property
    @pulumi.getter(name="certId")
    def cert_id(self) -> _builtins.str:
        return pulumi.get(self, "cert_id")

    @_builtins.property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> _builtins.str:
        return pulumi.get(self, "certificate_name")

    @_builtins.property
    @pulumi.getter
    def city(self) -> _builtins.str:
        """
        The cert's city.
        """
        return pulumi.get(self, "city")

    @_builtins.property
    @pulumi.getter
    def common(self) -> _builtins.str:
        """
        The cert's common name.
        """
        return pulumi.get(self, "common")

    @_builtins.property
    @pulumi.getter
    def country(self) -> _builtins.str:
        """
        The cert's country.
        """
        return pulumi.get(self, "country")

    @_builtins.property
    @pulumi.getter(name="endDate")
    def end_date(self) -> _builtins.str:
        """
        The cert's not valid after time.
        """
        return pulumi.get(self, "end_date")

    @_builtins.property
    @pulumi.getter
    def expired(self) -> _builtins.bool:
        """
        The cert is expired or not.
        """
        return pulumi.get(self, "expired")

    @_builtins.property
    @pulumi.getter
    def fingerprint(self) -> _builtins.str:
        return pulumi.get(self, "fingerprint")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The cert's id.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def issuer(self) -> _builtins.str:
        """
        The cert's .
        """
        return pulumi.get(self, "issuer")

    @_builtins.property
    @pulumi.getter
    def key(self) -> _builtins.str:
        return pulumi.get(self, "key")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Field `name` has been deprecated from provider version 1.129.0. New field `certificate_name` instead.""")
    def name(self) -> _builtins.str:
        """
        The cert's name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="orgName")
    def org_name(self) -> _builtins.str:
        """
        The cert's organization.
        """
        return pulumi.get(self, "org_name")

    @_builtins.property
    @pulumi.getter
    def province(self) -> _builtins.str:
        """
        The cert's province.
        """
        return pulumi.get(self, "province")

    @_builtins.property
    @pulumi.getter
    def sans(self) -> _builtins.str:
        """
        The cert's subject alternative name.
        """
        return pulumi.get(self, "sans")

    @_builtins.property
    @pulumi.getter(name="startDate")
    def start_date(self) -> _builtins.str:
        """
        The cert's not valid before time.
        """
        return pulumi.get(self, "start_date")


@pulumi.output_type
class GetServiceCertificatesCertificateResult(dict):
    def __init__(__self__, *,
                 buy_in_aliyun: _builtins.bool,
                 cert: _builtins.str,
                 cert_id: _builtins.str,
                 certificate_name: _builtins.str,
                 city: _builtins.str,
                 common: _builtins.str,
                 country: _builtins.str,
                 end_date: _builtins.str,
                 expired: _builtins.bool,
                 fingerprint: _builtins.str,
                 id: _builtins.str,
                 issuer: _builtins.str,
                 key: _builtins.str,
                 name: _builtins.str,
                 org_name: _builtins.str,
                 province: _builtins.str,
                 sans: _builtins.str,
                 start_date: _builtins.str):
        """
        :param _builtins.bool buy_in_aliyun: Whether the certificate was purchased from Aliyun. **Note:** From version 1.232.0, `buy_in_aliyun` takes effect only if `enable_details` is set to `true`.
        :param _builtins.str cert: The Cert of the certificate. **Note:** `cert` takes effect only if `enable_details` is set to `true`.
        :param _builtins.str cert_id: The ID of the certificate.
        :param _builtins.str certificate_name: The name of the certificate.
        :param _builtins.str city: The city in which the organization is located.
        :param _builtins.str common: The parent domain name of the certificate.
        :param _builtins.str country: The code of the country in which the organization is located.
        :param _builtins.str end_date: The time at which the certificate expires.
        :param _builtins.bool expired: Whether the certificate has expired.
        :param _builtins.str fingerprint: The fingerprint of the certificate.
        :param _builtins.str id: The ID of the Ssl Certificates Service Certificate.
        :param _builtins.str issuer: The issuer of the certificate.
        :param _builtins.str key: The Key of the certificate. **Note:** `key` takes effect only if `enable_details` is set to `true`.
        :param _builtins.str name: (Deprecated since v1.129.0) The name of the certificate. **Note:** Field `name` has been deprecated from provider version 1.129.0. New field `certificate_name` instead.
        :param _builtins.str org_name: The name of the organization that is associated with the certificate.
        :param _builtins.str province: The province or autonomous region in which the organization is located.
        :param _builtins.str sans: All domain names that are bound to the certificate.
        :param _builtins.str start_date: The time at which the certificate starts to take effect.
        """
        pulumi.set(__self__, "buy_in_aliyun", buy_in_aliyun)
        pulumi.set(__self__, "cert", cert)
        pulumi.set(__self__, "cert_id", cert_id)
        pulumi.set(__self__, "certificate_name", certificate_name)
        pulumi.set(__self__, "city", city)
        pulumi.set(__self__, "common", common)
        pulumi.set(__self__, "country", country)
        pulumi.set(__self__, "end_date", end_date)
        pulumi.set(__self__, "expired", expired)
        pulumi.set(__self__, "fingerprint", fingerprint)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "issuer", issuer)
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "org_name", org_name)
        pulumi.set(__self__, "province", province)
        pulumi.set(__self__, "sans", sans)
        pulumi.set(__self__, "start_date", start_date)

    @_builtins.property
    @pulumi.getter(name="buyInAliyun")
    def buy_in_aliyun(self) -> _builtins.bool:
        """
        Whether the certificate was purchased from Aliyun. **Note:** From version 1.232.0, `buy_in_aliyun` takes effect only if `enable_details` is set to `true`.
        """
        return pulumi.get(self, "buy_in_aliyun")

    @_builtins.property
    @pulumi.getter
    def cert(self) -> _builtins.str:
        """
        The Cert of the certificate. **Note:** `cert` takes effect only if `enable_details` is set to `true`.
        """
        return pulumi.get(self, "cert")

    @_builtins.property
    @pulumi.getter(name="certId")
    def cert_id(self) -> _builtins.str:
        """
        The ID of the certificate.
        """
        return pulumi.get(self, "cert_id")

    @_builtins.property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> _builtins.str:
        """
        The name of the certificate.
        """
        return pulumi.get(self, "certificate_name")

    @_builtins.property
    @pulumi.getter
    def city(self) -> _builtins.str:
        """
        The city in which the organization is located.
        """
        return pulumi.get(self, "city")

    @_builtins.property
    @pulumi.getter
    def common(self) -> _builtins.str:
        """
        The parent domain name of the certificate.
        """
        return pulumi.get(self, "common")

    @_builtins.property
    @pulumi.getter
    def country(self) -> _builtins.str:
        """
        The code of the country in which the organization is located.
        """
        return pulumi.get(self, "country")

    @_builtins.property
    @pulumi.getter(name="endDate")
    def end_date(self) -> _builtins.str:
        """
        The time at which the certificate expires.
        """
        return pulumi.get(self, "end_date")

    @_builtins.property
    @pulumi.getter
    def expired(self) -> _builtins.bool:
        """
        Whether the certificate has expired.
        """
        return pulumi.get(self, "expired")

    @_builtins.property
    @pulumi.getter
    def fingerprint(self) -> _builtins.str:
        """
        The fingerprint of the certificate.
        """
        return pulumi.get(self, "fingerprint")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Ssl Certificates Service Certificate.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def issuer(self) -> _builtins.str:
        """
        The issuer of the certificate.
        """
        return pulumi.get(self, "issuer")

    @_builtins.property
    @pulumi.getter
    def key(self) -> _builtins.str:
        """
        The Key of the certificate. **Note:** `key` takes effect only if `enable_details` is set to `true`.
        """
        return pulumi.get(self, "key")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Field `name` has been deprecated from provider version 1.129.0. New field `certificate_name` instead.""")
    def name(self) -> _builtins.str:
        """
        (Deprecated since v1.129.0) The name of the certificate. **Note:** Field `name` has been deprecated from provider version 1.129.0. New field `certificate_name` instead.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="orgName")
    def org_name(self) -> _builtins.str:
        """
        The name of the organization that is associated with the certificate.
        """
        return pulumi.get(self, "org_name")

    @_builtins.property
    @pulumi.getter
    def province(self) -> _builtins.str:
        """
        The province or autonomous region in which the organization is located.
        """
        return pulumi.get(self, "province")

    @_builtins.property
    @pulumi.getter
    def sans(self) -> _builtins.str:
        """
        All domain names that are bound to the certificate.
        """
        return pulumi.get(self, "sans")

    @_builtins.property
    @pulumi.getter(name="startDate")
    def start_date(self) -> _builtins.str:
        """
        The time at which the certificate starts to take effect.
        """
        return pulumi.get(self, "start_date")


