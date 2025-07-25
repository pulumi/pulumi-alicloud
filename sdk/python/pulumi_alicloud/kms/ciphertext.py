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

__all__ = ['CiphertextArgs', 'Ciphertext']

@pulumi.input_type
class CiphertextArgs:
    def __init__(__self__, *,
                 key_id: pulumi.Input[_builtins.str],
                 plaintext: pulumi.Input[_builtins.str],
                 encryption_context: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a Ciphertext resource.
        :param pulumi.Input[_builtins.str] key_id: The globally unique ID of the CMK.
        :param pulumi.Input[_builtins.str] plaintext: The plaintext to be encrypted which must be encoded in Base64.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] encryption_context: The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        """
        pulumi.set(__self__, "key_id", key_id)
        pulumi.set(__self__, "plaintext", plaintext)
        if encryption_context is not None:
            pulumi.set(__self__, "encryption_context", encryption_context)

    @_builtins.property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Input[_builtins.str]:
        """
        The globally unique ID of the CMK.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "key_id", value)

    @_builtins.property
    @pulumi.getter
    def plaintext(self) -> pulumi.Input[_builtins.str]:
        """
        The plaintext to be encrypted which must be encoded in Base64.
        """
        return pulumi.get(self, "plaintext")

    @plaintext.setter
    def plaintext(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "plaintext", value)

    @_builtins.property
    @pulumi.getter(name="encryptionContext")
    def encryption_context(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        """
        return pulumi.get(self, "encryption_context")

    @encryption_context.setter
    def encryption_context(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "encryption_context", value)


@pulumi.input_type
class _CiphertextState:
    def __init__(__self__, *,
                 ciphertext_blob: Optional[pulumi.Input[_builtins.str]] = None,
                 encryption_context: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 key_id: Optional[pulumi.Input[_builtins.str]] = None,
                 plaintext: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Ciphertext resources.
        :param pulumi.Input[_builtins.str] ciphertext_blob: The ciphertext of the data key encrypted with the primary CMK version.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] encryption_context: The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        :param pulumi.Input[_builtins.str] key_id: The globally unique ID of the CMK.
        :param pulumi.Input[_builtins.str] plaintext: The plaintext to be encrypted which must be encoded in Base64.
        """
        if ciphertext_blob is not None:
            pulumi.set(__self__, "ciphertext_blob", ciphertext_blob)
        if encryption_context is not None:
            pulumi.set(__self__, "encryption_context", encryption_context)
        if key_id is not None:
            pulumi.set(__self__, "key_id", key_id)
        if plaintext is not None:
            pulumi.set(__self__, "plaintext", plaintext)

    @_builtins.property
    @pulumi.getter(name="ciphertextBlob")
    def ciphertext_blob(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ciphertext of the data key encrypted with the primary CMK version.
        """
        return pulumi.get(self, "ciphertext_blob")

    @ciphertext_blob.setter
    def ciphertext_blob(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ciphertext_blob", value)

    @_builtins.property
    @pulumi.getter(name="encryptionContext")
    def encryption_context(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        """
        return pulumi.get(self, "encryption_context")

    @encryption_context.setter
    def encryption_context(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "encryption_context", value)

    @_builtins.property
    @pulumi.getter(name="keyId")
    def key_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The globally unique ID of the CMK.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key_id", value)

    @_builtins.property
    @pulumi.getter
    def plaintext(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The plaintext to be encrypted which must be encoded in Base64.
        """
        return pulumi.get(self, "plaintext")

    @plaintext.setter
    def plaintext(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "plaintext", value)


@pulumi.type_token("alicloud:kms/ciphertext:Ciphertext")
class Ciphertext(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 encryption_context: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 key_id: Optional[pulumi.Input[_builtins.str]] = None,
                 plaintext: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        key = alicloud.kms.Key("key",
            description="example key",
            status="Enabled",
            pending_window_in_days=7)
        encrypted = alicloud.kms.Ciphertext("encrypted",
            key_id=key.id,
            plaintext="example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] encryption_context: The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        :param pulumi.Input[_builtins.str] key_id: The globally unique ID of the CMK.
        :param pulumi.Input[_builtins.str] plaintext: The plaintext to be encrypted which must be encoded in Base64.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CiphertextArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        key = alicloud.kms.Key("key",
            description="example key",
            status="Enabled",
            pending_window_in_days=7)
        encrypted = alicloud.kms.Ciphertext("encrypted",
            key_id=key.id,
            plaintext="example")
        ```

        :param str resource_name: The name of the resource.
        :param CiphertextArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CiphertextArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 encryption_context: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 key_id: Optional[pulumi.Input[_builtins.str]] = None,
                 plaintext: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CiphertextArgs.__new__(CiphertextArgs)

            __props__.__dict__["encryption_context"] = encryption_context
            if key_id is None and not opts.urn:
                raise TypeError("Missing required property 'key_id'")
            __props__.__dict__["key_id"] = key_id
            if plaintext is None and not opts.urn:
                raise TypeError("Missing required property 'plaintext'")
            __props__.__dict__["plaintext"] = None if plaintext is None else pulumi.Output.secret(plaintext)
            __props__.__dict__["ciphertext_blob"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["plaintext"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Ciphertext, __self__).__init__(
            'alicloud:kms/ciphertext:Ciphertext',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ciphertext_blob: Optional[pulumi.Input[_builtins.str]] = None,
            encryption_context: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            key_id: Optional[pulumi.Input[_builtins.str]] = None,
            plaintext: Optional[pulumi.Input[_builtins.str]] = None) -> 'Ciphertext':
        """
        Get an existing Ciphertext resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] ciphertext_blob: The ciphertext of the data key encrypted with the primary CMK version.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] encryption_context: The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        :param pulumi.Input[_builtins.str] key_id: The globally unique ID of the CMK.
        :param pulumi.Input[_builtins.str] plaintext: The plaintext to be encrypted which must be encoded in Base64.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CiphertextState.__new__(_CiphertextState)

        __props__.__dict__["ciphertext_blob"] = ciphertext_blob
        __props__.__dict__["encryption_context"] = encryption_context
        __props__.__dict__["key_id"] = key_id
        __props__.__dict__["plaintext"] = plaintext
        return Ciphertext(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="ciphertextBlob")
    def ciphertext_blob(self) -> pulumi.Output[_builtins.str]:
        """
        The ciphertext of the data key encrypted with the primary CMK version.
        """
        return pulumi.get(self, "ciphertext_blob")

    @_builtins.property
    @pulumi.getter(name="encryptionContext")
    def encryption_context(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        """
        return pulumi.get(self, "encryption_context")

    @_builtins.property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Output[_builtins.str]:
        """
        The globally unique ID of the CMK.
        """
        return pulumi.get(self, "key_id")

    @_builtins.property
    @pulumi.getter
    def plaintext(self) -> pulumi.Output[_builtins.str]:
        """
        The plaintext to be encrypted which must be encoded in Base64.
        """
        return pulumi.get(self, "plaintext")

