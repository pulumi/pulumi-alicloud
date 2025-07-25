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

__all__ = ['BucketRequestPaymentArgs', 'BucketRequestPayment']

@pulumi.input_type
class BucketRequestPaymentArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[_builtins.str],
                 payer: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a BucketRequestPayment resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] payer: The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        """
        pulumi.set(__self__, "bucket", bucket)
        if payer is not None:
            pulumi.set(__self__, "payer", payer)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter
    def payer(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        """
        return pulumi.get(self, "payer")

    @payer.setter
    def payer(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "payer", value)


@pulumi.input_type
class _BucketRequestPaymentState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 payer: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering BucketRequestPayment resources.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] payer: The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if payer is not None:
            pulumi.set(__self__, "payer", payer)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter
    def payer(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        """
        return pulumi.get(self, "payer")

    @payer.setter
    def payer(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "payer", value)


@pulumi.type_token("alicloud:oss/bucketRequestPayment:BucketRequestPayment")
class BucketRequestPayment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 payer: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        OSS Bucket Request Payment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketRequestPayment:BucketRequestPayment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] payer: The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketRequestPaymentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        OSS Bucket Request Payment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketRequestPayment:BucketRequestPayment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param BucketRequestPaymentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketRequestPaymentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 payer: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketRequestPaymentArgs.__new__(BucketRequestPaymentArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["payer"] = payer
        super(BucketRequestPayment, __self__).__init__(
            'alicloud:oss/bucketRequestPayment:BucketRequestPayment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[_builtins.str]] = None,
            payer: Optional[pulumi.Input[_builtins.str]] = None) -> 'BucketRequestPayment':
        """
        Get an existing BucketRequestPayment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] payer: The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketRequestPaymentState.__new__(_BucketRequestPaymentState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["payer"] = payer
        return BucketRequestPayment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @_builtins.property
    @pulumi.getter
    def payer(self) -> pulumi.Output[_builtins.str]:
        """
        The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        """
        return pulumi.get(self, "payer")

