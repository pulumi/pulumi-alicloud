# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BucketAclArgs', 'BucketAcl']

@pulumi.input_type
class BucketAclArgs:
    def __init__(__self__, *,
                 acl: pulumi.Input[str],
                 bucket: pulumi.Input[str]):
        """
        The set of arguments for constructing a BucketAcl resource.
        :param pulumi.Input[str] acl: Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
        :param pulumi.Input[str] bucket: The name of the bucket to which the current ACL configuration belongs.
        """
        pulumi.set(__self__, "acl", acl)
        pulumi.set(__self__, "bucket", bucket)

    @property
    @pulumi.getter
    def acl(self) -> pulumi.Input[str]:
        """
        Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
        """
        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: pulumi.Input[str]):
        pulumi.set(self, "acl", value)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        The name of the bucket to which the current ACL configuration belongs.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)


@pulumi.input_type
class _BucketAclState:
    def __init__(__self__, *,
                 acl: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BucketAcl resources.
        :param pulumi.Input[str] acl: Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
        :param pulumi.Input[str] bucket: The name of the bucket to which the current ACL configuration belongs.
        """
        if acl is not None:
            pulumi.set(__self__, "acl", acl)
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)

    @property
    @pulumi.getter
    def acl(self) -> Optional[pulumi.Input[str]]:
        """
        Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
        """
        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl", value)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bucket to which the current ACL configuration belongs.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)


class BucketAcl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        OSS Bucket Acl can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketAcl:BucketAcl example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
        :param pulumi.Input[str] bucket: The name of the bucket to which the current ACL configuration belongs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketAclArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        OSS Bucket Acl can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketAcl:BucketAcl example <id>
        ```

        :param str resource_name: The name of the resource.
        :param BucketAclArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketAclArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketAclArgs.__new__(BucketAclArgs)

            if acl is None and not opts.urn:
                raise TypeError("Missing required property 'acl'")
            __props__.__dict__["acl"] = acl
            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
        super(BucketAcl, __self__).__init__(
            'alicloud:oss/bucketAcl:BucketAcl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acl: Optional[pulumi.Input[str]] = None,
            bucket: Optional[pulumi.Input[str]] = None) -> 'BucketAcl':
        """
        Get an existing BucketAcl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
        :param pulumi.Input[str] bucket: The name of the bucket to which the current ACL configuration belongs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketAclState.__new__(_BucketAclState)

        __props__.__dict__["acl"] = acl
        __props__.__dict__["bucket"] = bucket
        return BucketAcl(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def acl(self) -> pulumi.Output[str]:
        """
        Bucket-level Access Control List (ACL)，Valid values: `private`, `public-read`, `public-read-write`.
        """
        return pulumi.get(self, "acl")

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        The name of the bucket to which the current ACL configuration belongs.
        """
        return pulumi.get(self, "bucket")
