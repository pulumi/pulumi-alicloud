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

__all__ = ['AuditCallbackArgs', 'AuditCallback']

@pulumi.input_type
class AuditCallbackArgs:
    def __init__(__self__, *,
                 audit_callback_name: pulumi.Input[_builtins.str],
                 callback_suggestions: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 callback_types: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 crypt_type: pulumi.Input[_builtins.str],
                 url: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a AuditCallback resource.
        :param pulumi.Input[_builtins.str] audit_callback_name: The AuditCallback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] callback_suggestions: List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] callback_types: A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
        :param pulumi.Input[_builtins.str] crypt_type: The encryption algorithm is used to verify that the callback request is sent by the content security service to your business service. The value is SHA256:SHA256 encryption algorithm and SM3: SM3 encryption algorithm.
        :param pulumi.Input[_builtins.str] url: The detection result will be called back to the url.
        """
        pulumi.set(__self__, "audit_callback_name", audit_callback_name)
        pulumi.set(__self__, "callback_suggestions", callback_suggestions)
        pulumi.set(__self__, "callback_types", callback_types)
        pulumi.set(__self__, "crypt_type", crypt_type)
        pulumi.set(__self__, "url", url)

    @_builtins.property
    @pulumi.getter(name="auditCallbackName")
    def audit_callback_name(self) -> pulumi.Input[_builtins.str]:
        """
        The AuditCallback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
        """
        return pulumi.get(self, "audit_callback_name")

    @audit_callback_name.setter
    def audit_callback_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "audit_callback_name", value)

    @_builtins.property
    @pulumi.getter(name="callbackSuggestions")
    def callback_suggestions(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
        """
        return pulumi.get(self, "callback_suggestions")

    @callback_suggestions.setter
    def callback_suggestions(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "callback_suggestions", value)

    @_builtins.property
    @pulumi.getter(name="callbackTypes")
    def callback_types(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
        """
        return pulumi.get(self, "callback_types")

    @callback_types.setter
    def callback_types(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "callback_types", value)

    @_builtins.property
    @pulumi.getter(name="cryptType")
    def crypt_type(self) -> pulumi.Input[_builtins.str]:
        """
        The encryption algorithm is used to verify that the callback request is sent by the content security service to your business service. The value is SHA256:SHA256 encryption algorithm and SM3: SM3 encryption algorithm.
        """
        return pulumi.get(self, "crypt_type")

    @crypt_type.setter
    def crypt_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "crypt_type", value)

    @_builtins.property
    @pulumi.getter
    def url(self) -> pulumi.Input[_builtins.str]:
        """
        The detection result will be called back to the url.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "url", value)


@pulumi.input_type
class _AuditCallbackState:
    def __init__(__self__, *,
                 audit_callback_name: Optional[pulumi.Input[_builtins.str]] = None,
                 callback_suggestions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 callback_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 crypt_type: Optional[pulumi.Input[_builtins.str]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AuditCallback resources.
        :param pulumi.Input[_builtins.str] audit_callback_name: The AuditCallback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] callback_suggestions: List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] callback_types: A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
        :param pulumi.Input[_builtins.str] crypt_type: The encryption algorithm is used to verify that the callback request is sent by the content security service to your business service. The value is SHA256:SHA256 encryption algorithm and SM3: SM3 encryption algorithm.
        :param pulumi.Input[_builtins.str] url: The detection result will be called back to the url.
        """
        if audit_callback_name is not None:
            pulumi.set(__self__, "audit_callback_name", audit_callback_name)
        if callback_suggestions is not None:
            pulumi.set(__self__, "callback_suggestions", callback_suggestions)
        if callback_types is not None:
            pulumi.set(__self__, "callback_types", callback_types)
        if crypt_type is not None:
            pulumi.set(__self__, "crypt_type", crypt_type)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @_builtins.property
    @pulumi.getter(name="auditCallbackName")
    def audit_callback_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The AuditCallback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
        """
        return pulumi.get(self, "audit_callback_name")

    @audit_callback_name.setter
    def audit_callback_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "audit_callback_name", value)

    @_builtins.property
    @pulumi.getter(name="callbackSuggestions")
    def callback_suggestions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
        """
        return pulumi.get(self, "callback_suggestions")

    @callback_suggestions.setter
    def callback_suggestions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "callback_suggestions", value)

    @_builtins.property
    @pulumi.getter(name="callbackTypes")
    def callback_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
        """
        return pulumi.get(self, "callback_types")

    @callback_types.setter
    def callback_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "callback_types", value)

    @_builtins.property
    @pulumi.getter(name="cryptType")
    def crypt_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The encryption algorithm is used to verify that the callback request is sent by the content security service to your business service. The value is SHA256:SHA256 encryption algorithm and SM3: SM3 encryption algorithm.
        """
        return pulumi.get(self, "crypt_type")

    @crypt_type.setter
    def crypt_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "crypt_type", value)

    @_builtins.property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The detection result will be called back to the url.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "url", value)


@pulumi.type_token("alicloud:aligreen/auditCallback:AuditCallback")
class AuditCallback(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audit_callback_name: Optional[pulumi.Input[_builtins.str]] = None,
                 callback_suggestions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 callback_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 crypt_type: Optional[pulumi.Input[_builtins.str]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Aligreen Audit Callback resource.

        Callback notification after detection is completed.

        For information about Aligreen Audit Callback and how to use it, see [What is Audit Callback](https://next.api.alibabacloud.com/document/Green/2017-08-23/CreateAuditCallback).

        > **NOTE:** Available since v1.228.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform_example"
        default = alicloud.aligreen.AuditCallback("default",
            crypt_type="SM3",
            audit_callback_name=name,
            url="https://www.aliyun.com/",
            callback_types=[
                "aliyunAudit",
                "selfAduit",
                "example",
            ],
            callback_suggestions=[
                "block",
                "review",
                "pass",
            ])
        ```

        ## Import

        Aligreen Audit Callback can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:aligreen/auditCallback:AuditCallback example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] audit_callback_name: The AuditCallback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] callback_suggestions: List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] callback_types: A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
        :param pulumi.Input[_builtins.str] crypt_type: The encryption algorithm is used to verify that the callback request is sent by the content security service to your business service. The value is SHA256:SHA256 encryption algorithm and SM3: SM3 encryption algorithm.
        :param pulumi.Input[_builtins.str] url: The detection result will be called back to the url.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuditCallbackArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Aligreen Audit Callback resource.

        Callback notification after detection is completed.

        For information about Aligreen Audit Callback and how to use it, see [What is Audit Callback](https://next.api.alibabacloud.com/document/Green/2017-08-23/CreateAuditCallback).

        > **NOTE:** Available since v1.228.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform_example"
        default = alicloud.aligreen.AuditCallback("default",
            crypt_type="SM3",
            audit_callback_name=name,
            url="https://www.aliyun.com/",
            callback_types=[
                "aliyunAudit",
                "selfAduit",
                "example",
            ],
            callback_suggestions=[
                "block",
                "review",
                "pass",
            ])
        ```

        ## Import

        Aligreen Audit Callback can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:aligreen/auditCallback:AuditCallback example <id>
        ```

        :param str resource_name: The name of the resource.
        :param AuditCallbackArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuditCallbackArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audit_callback_name: Optional[pulumi.Input[_builtins.str]] = None,
                 callback_suggestions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 callback_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 crypt_type: Optional[pulumi.Input[_builtins.str]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuditCallbackArgs.__new__(AuditCallbackArgs)

            if audit_callback_name is None and not opts.urn:
                raise TypeError("Missing required property 'audit_callback_name'")
            __props__.__dict__["audit_callback_name"] = audit_callback_name
            if callback_suggestions is None and not opts.urn:
                raise TypeError("Missing required property 'callback_suggestions'")
            __props__.__dict__["callback_suggestions"] = callback_suggestions
            if callback_types is None and not opts.urn:
                raise TypeError("Missing required property 'callback_types'")
            __props__.__dict__["callback_types"] = callback_types
            if crypt_type is None and not opts.urn:
                raise TypeError("Missing required property 'crypt_type'")
            __props__.__dict__["crypt_type"] = crypt_type
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
        super(AuditCallback, __self__).__init__(
            'alicloud:aligreen/auditCallback:AuditCallback',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            audit_callback_name: Optional[pulumi.Input[_builtins.str]] = None,
            callback_suggestions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            callback_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            crypt_type: Optional[pulumi.Input[_builtins.str]] = None,
            url: Optional[pulumi.Input[_builtins.str]] = None) -> 'AuditCallback':
        """
        Get an existing AuditCallback resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] audit_callback_name: The AuditCallback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] callback_suggestions: List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] callback_types: A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
        :param pulumi.Input[_builtins.str] crypt_type: The encryption algorithm is used to verify that the callback request is sent by the content security service to your business service. The value is SHA256:SHA256 encryption algorithm and SM3: SM3 encryption algorithm.
        :param pulumi.Input[_builtins.str] url: The detection result will be called back to the url.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuditCallbackState.__new__(_AuditCallbackState)

        __props__.__dict__["audit_callback_name"] = audit_callback_name
        __props__.__dict__["callback_suggestions"] = callback_suggestions
        __props__.__dict__["callback_types"] = callback_types
        __props__.__dict__["crypt_type"] = crypt_type
        __props__.__dict__["url"] = url
        return AuditCallback(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="auditCallbackName")
    def audit_callback_name(self) -> pulumi.Output[_builtins.str]:
        """
        The AuditCallback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
        """
        return pulumi.get(self, "audit_callback_name")

    @_builtins.property
    @pulumi.getter(name="callbackSuggestions")
    def callback_suggestions(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
        """
        return pulumi.get(self, "callback_suggestions")

    @_builtins.property
    @pulumi.getter(name="callbackTypes")
    def callback_types(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
        """
        return pulumi.get(self, "callback_types")

    @_builtins.property
    @pulumi.getter(name="cryptType")
    def crypt_type(self) -> pulumi.Output[_builtins.str]:
        """
        The encryption algorithm is used to verify that the callback request is sent by the content security service to your business service. The value is SHA256:SHA256 encryption algorithm and SM3: SM3 encryption algorithm.
        """
        return pulumi.get(self, "crypt_type")

    @_builtins.property
    @pulumi.getter
    def url(self) -> pulumi.Output[_builtins.str]:
        """
        The detection result will be called back to the url.
        """
        return pulumi.get(self, "url")

