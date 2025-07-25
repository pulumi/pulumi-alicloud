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
from ._inputs import *

__all__ = ['BucketCnameArgs', 'BucketCname']

@pulumi.input_type
class BucketCnameArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[_builtins.str],
                 domain: pulumi.Input[_builtins.str],
                 certificate: Optional[pulumi.Input['BucketCnameCertificateArgs']] = None,
                 delete_certificate: Optional[pulumi.Input[_builtins.bool]] = None,
                 force: Optional[pulumi.Input[_builtins.bool]] = None,
                 previous_cert_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a BucketCname resource.
        :param pulumi.Input[_builtins.str] bucket: The bucket to which the custom domain name belongs
        :param pulumi.Input[_builtins.str] domain: User-defined domain name
        :param pulumi.Input['BucketCnameCertificateArgs'] certificate: The container for the certificate configuration. See `certificate` below.
        :param pulumi.Input[_builtins.bool] delete_certificate: Whether to delete the certificate.
        :param pulumi.Input[_builtins.bool] force: Whether to force overwrite certificate.
        :param pulumi.Input[_builtins.str] previous_cert_id: The current certificate ID. If the Force value is not true, the OSS Server checks whether the value matches the current certificate ID. If the value does not match, an error is reported.
        """
        pulumi.set(__self__, "bucket", bucket)
        pulumi.set(__self__, "domain", domain)
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if delete_certificate is not None:
            pulumi.set(__self__, "delete_certificate", delete_certificate)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if previous_cert_id is not None:
            pulumi.set(__self__, "previous_cert_id", previous_cert_id)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[_builtins.str]:
        """
        The bucket to which the custom domain name belongs
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter
    def domain(self) -> pulumi.Input[_builtins.str]:
        """
        User-defined domain name
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "domain", value)

    @_builtins.property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input['BucketCnameCertificateArgs']]:
        """
        The container for the certificate configuration. See `certificate` below.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input['BucketCnameCertificateArgs']]):
        pulumi.set(self, "certificate", value)

    @_builtins.property
    @pulumi.getter(name="deleteCertificate")
    def delete_certificate(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to delete the certificate.
        """
        return pulumi.get(self, "delete_certificate")

    @delete_certificate.setter
    def delete_certificate(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "delete_certificate", value)

    @_builtins.property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to force overwrite certificate.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "force", value)

    @_builtins.property
    @pulumi.getter(name="previousCertId")
    def previous_cert_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The current certificate ID. If the Force value is not true, the OSS Server checks whether the value matches the current certificate ID. If the value does not match, an error is reported.
        """
        return pulumi.get(self, "previous_cert_id")

    @previous_cert_id.setter
    def previous_cert_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "previous_cert_id", value)


@pulumi.input_type
class _BucketCnameState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 certificate: Optional[pulumi.Input['BucketCnameCertificateArgs']] = None,
                 delete_certificate: Optional[pulumi.Input[_builtins.bool]] = None,
                 domain: Optional[pulumi.Input[_builtins.str]] = None,
                 force: Optional[pulumi.Input[_builtins.bool]] = None,
                 previous_cert_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering BucketCname resources.
        :param pulumi.Input[_builtins.str] bucket: The bucket to which the custom domain name belongs
        :param pulumi.Input['BucketCnameCertificateArgs'] certificate: The container for the certificate configuration. See `certificate` below.
        :param pulumi.Input[_builtins.bool] delete_certificate: Whether to delete the certificate.
        :param pulumi.Input[_builtins.str] domain: User-defined domain name
        :param pulumi.Input[_builtins.bool] force: Whether to force overwrite certificate.
        :param pulumi.Input[_builtins.str] previous_cert_id: The current certificate ID. If the Force value is not true, the OSS Server checks whether the value matches the current certificate ID. If the value does not match, an error is reported.
        :param pulumi.Input[_builtins.str] status: Cname status
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if delete_certificate is not None:
            pulumi.set(__self__, "delete_certificate", delete_certificate)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if previous_cert_id is not None:
            pulumi.set(__self__, "previous_cert_id", previous_cert_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The bucket to which the custom domain name belongs
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input['BucketCnameCertificateArgs']]:
        """
        The container for the certificate configuration. See `certificate` below.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input['BucketCnameCertificateArgs']]):
        pulumi.set(self, "certificate", value)

    @_builtins.property
    @pulumi.getter(name="deleteCertificate")
    def delete_certificate(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to delete the certificate.
        """
        return pulumi.get(self, "delete_certificate")

    @delete_certificate.setter
    def delete_certificate(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "delete_certificate", value)

    @_builtins.property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User-defined domain name
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "domain", value)

    @_builtins.property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to force overwrite certificate.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "force", value)

    @_builtins.property
    @pulumi.getter(name="previousCertId")
    def previous_cert_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The current certificate ID. If the Force value is not true, the OSS Server checks whether the value matches the current certificate ID. If the value does not match, an error is reported.
        """
        return pulumi.get(self, "previous_cert_id")

    @previous_cert_id.setter
    def previous_cert_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "previous_cert_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Cname status
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:oss/bucketCname:BucketCname")
class BucketCname(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 certificate: Optional[pulumi.Input[Union['BucketCnameCertificateArgs', 'BucketCnameCertificateArgsDict']]] = None,
                 delete_certificate: Optional[pulumi.Input[_builtins.bool]] = None,
                 domain: Optional[pulumi.Input[_builtins.str]] = None,
                 force: Optional[pulumi.Input[_builtins.bool]] = None,
                 previous_cert_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a OSS Bucket Cname resource.

        Customizing Bucket domains.

        For information about OSS Bucket Cname and how to use it, see [What is Bucket Cname](https://www.alibabacloud.com/help/en/oss/developer-reference/putcname).

        > **NOTE:** Available since v1.233.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        create_bucket = alicloud.oss.Bucket("CreateBucket",
            bucket=name,
            storage_class="Standard")
        default_za_w_jf_g = alicloud.oss.BucketCnameToken("defaultZaWJfG",
            bucket=create_bucket.bucket,
            domain="tftestacc.com")
        defaultn_hqm5p = alicloud.dns.AlidnsRecord("defaultnHqm5p",
            status="ENABLE",
            line="default",
            rr="_dnsauth",
            type="TXT",
            domain_name="tftestacc.com",
            priority=1,
            value=default_za_w_jf_g.token,
            ttl=600)
        default = alicloud.oss.BucketCname("default",
            bucket=create_bucket.bucket,
            domain=defaultn_hqm5p.domain_name)
        ```

        ## Import

        OSS Bucket Cname can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketCname:BucketCname example <bucket>:<domain>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The bucket to which the custom domain name belongs
        :param pulumi.Input[Union['BucketCnameCertificateArgs', 'BucketCnameCertificateArgsDict']] certificate: The container for the certificate configuration. See `certificate` below.
        :param pulumi.Input[_builtins.bool] delete_certificate: Whether to delete the certificate.
        :param pulumi.Input[_builtins.str] domain: User-defined domain name
        :param pulumi.Input[_builtins.bool] force: Whether to force overwrite certificate.
        :param pulumi.Input[_builtins.str] previous_cert_id: The current certificate ID. If the Force value is not true, the OSS Server checks whether the value matches the current certificate ID. If the value does not match, an error is reported.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketCnameArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a OSS Bucket Cname resource.

        Customizing Bucket domains.

        For information about OSS Bucket Cname and how to use it, see [What is Bucket Cname](https://www.alibabacloud.com/help/en/oss/developer-reference/putcname).

        > **NOTE:** Available since v1.233.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        create_bucket = alicloud.oss.Bucket("CreateBucket",
            bucket=name,
            storage_class="Standard")
        default_za_w_jf_g = alicloud.oss.BucketCnameToken("defaultZaWJfG",
            bucket=create_bucket.bucket,
            domain="tftestacc.com")
        defaultn_hqm5p = alicloud.dns.AlidnsRecord("defaultnHqm5p",
            status="ENABLE",
            line="default",
            rr="_dnsauth",
            type="TXT",
            domain_name="tftestacc.com",
            priority=1,
            value=default_za_w_jf_g.token,
            ttl=600)
        default = alicloud.oss.BucketCname("default",
            bucket=create_bucket.bucket,
            domain=defaultn_hqm5p.domain_name)
        ```

        ## Import

        OSS Bucket Cname can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketCname:BucketCname example <bucket>:<domain>
        ```

        :param str resource_name: The name of the resource.
        :param BucketCnameArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketCnameArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 certificate: Optional[pulumi.Input[Union['BucketCnameCertificateArgs', 'BucketCnameCertificateArgsDict']]] = None,
                 delete_certificate: Optional[pulumi.Input[_builtins.bool]] = None,
                 domain: Optional[pulumi.Input[_builtins.str]] = None,
                 force: Optional[pulumi.Input[_builtins.bool]] = None,
                 previous_cert_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketCnameArgs.__new__(BucketCnameArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["certificate"] = certificate
            __props__.__dict__["delete_certificate"] = delete_certificate
            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            __props__.__dict__["force"] = force
            __props__.__dict__["previous_cert_id"] = previous_cert_id
            __props__.__dict__["status"] = None
        super(BucketCname, __self__).__init__(
            'alicloud:oss/bucketCname:BucketCname',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[_builtins.str]] = None,
            certificate: Optional[pulumi.Input[Union['BucketCnameCertificateArgs', 'BucketCnameCertificateArgsDict']]] = None,
            delete_certificate: Optional[pulumi.Input[_builtins.bool]] = None,
            domain: Optional[pulumi.Input[_builtins.str]] = None,
            force: Optional[pulumi.Input[_builtins.bool]] = None,
            previous_cert_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'BucketCname':
        """
        Get an existing BucketCname resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The bucket to which the custom domain name belongs
        :param pulumi.Input[Union['BucketCnameCertificateArgs', 'BucketCnameCertificateArgsDict']] certificate: The container for the certificate configuration. See `certificate` below.
        :param pulumi.Input[_builtins.bool] delete_certificate: Whether to delete the certificate.
        :param pulumi.Input[_builtins.str] domain: User-defined domain name
        :param pulumi.Input[_builtins.bool] force: Whether to force overwrite certificate.
        :param pulumi.Input[_builtins.str] previous_cert_id: The current certificate ID. If the Force value is not true, the OSS Server checks whether the value matches the current certificate ID. If the value does not match, an error is reported.
        :param pulumi.Input[_builtins.str] status: Cname status
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketCnameState.__new__(_BucketCnameState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["delete_certificate"] = delete_certificate
        __props__.__dict__["domain"] = domain
        __props__.__dict__["force"] = force
        __props__.__dict__["previous_cert_id"] = previous_cert_id
        __props__.__dict__["status"] = status
        return BucketCname(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[_builtins.str]:
        """
        The bucket to which the custom domain name belongs
        """
        return pulumi.get(self, "bucket")

    @_builtins.property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[Optional['outputs.BucketCnameCertificate']]:
        """
        The container for the certificate configuration. See `certificate` below.
        """
        return pulumi.get(self, "certificate")

    @_builtins.property
    @pulumi.getter(name="deleteCertificate")
    def delete_certificate(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether to delete the certificate.
        """
        return pulumi.get(self, "delete_certificate")

    @_builtins.property
    @pulumi.getter
    def domain(self) -> pulumi.Output[_builtins.str]:
        """
        User-defined domain name
        """
        return pulumi.get(self, "domain")

    @_builtins.property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether to force overwrite certificate.
        """
        return pulumi.get(self, "force")

    @_builtins.property
    @pulumi.getter(name="previousCertId")
    def previous_cert_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The current certificate ID. If the Force value is not true, the OSS Server checks whether the value matches the current certificate ID. If the value does not match, an error is reported.
        """
        return pulumi.get(self, "previous_cert_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        Cname status
        """
        return pulumi.get(self, "status")

