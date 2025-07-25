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

__all__ = ['BucketLoggingInitArgs', 'BucketLogging']

@pulumi.input_type
class BucketLoggingInitArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[_builtins.str],
                 target_bucket: pulumi.Input[_builtins.str],
                 target_prefix: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a BucketLogging resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] target_bucket: The bucket that stores access logs.
        :param pulumi.Input[_builtins.str] target_prefix: The prefix of the saved log objects. This element can be left empty.
        """
        pulumi.set(__self__, "bucket", bucket)
        pulumi.set(__self__, "target_bucket", target_bucket)
        if target_prefix is not None:
            pulumi.set(__self__, "target_prefix", target_prefix)

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
    @pulumi.getter(name="targetBucket")
    def target_bucket(self) -> pulumi.Input[_builtins.str]:
        """
        The bucket that stores access logs.
        """
        return pulumi.get(self, "target_bucket")

    @target_bucket.setter
    def target_bucket(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "target_bucket", value)

    @_builtins.property
    @pulumi.getter(name="targetPrefix")
    def target_prefix(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The prefix of the saved log objects. This element can be left empty.
        """
        return pulumi.get(self, "target_prefix")

    @target_prefix.setter
    def target_prefix(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_prefix", value)


@pulumi.input_type
class _BucketLoggingState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 target_bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 target_prefix: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering BucketLogging resources.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] target_bucket: The bucket that stores access logs.
        :param pulumi.Input[_builtins.str] target_prefix: The prefix of the saved log objects. This element can be left empty.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if target_bucket is not None:
            pulumi.set(__self__, "target_bucket", target_bucket)
        if target_prefix is not None:
            pulumi.set(__self__, "target_prefix", target_prefix)

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
    @pulumi.getter(name="targetBucket")
    def target_bucket(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The bucket that stores access logs.
        """
        return pulumi.get(self, "target_bucket")

    @target_bucket.setter
    def target_bucket(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_bucket", value)

    @_builtins.property
    @pulumi.getter(name="targetPrefix")
    def target_prefix(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The prefix of the saved log objects. This element can be left empty.
        """
        return pulumi.get(self, "target_prefix")

    @target_prefix.setter
    def target_prefix(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_prefix", value)


@pulumi.type_token("alicloud:oss/bucketLogging:BucketLogging")
class BucketLogging(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 target_bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 target_prefix: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a OSS Bucket Logging resource. After you enable and configure logging for a bucket, Object Storage Service (OSS) generates log objects based on a predefined naming convention. This way, access logs are generated and stored in the specified bucket on an hourly basis.

        For information about OSS Bucket Logging and how to use it, see [What is Bucket Logging](https://www.alibabacloud.com/help/en/oss/developer-reference/putbucketlogging).

        > **NOTE:** Available since v1.222.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = random.index.Integer("default",
            min=10000,
            max=99999)
        create_bucket = alicloud.oss.Bucket("CreateBucket",
            storage_class="Standard",
            bucket=f"{name}-{default['result']}")
        default_bucket_logging = alicloud.oss.BucketLogging("default",
            bucket=create_bucket.bucket,
            target_bucket=create_bucket.bucket,
            target_prefix="log/")
        ```

        ## Import

        OSS Bucket Logging can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketLogging:BucketLogging example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] target_bucket: The bucket that stores access logs.
        :param pulumi.Input[_builtins.str] target_prefix: The prefix of the saved log objects. This element can be left empty.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketLoggingInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a OSS Bucket Logging resource. After you enable and configure logging for a bucket, Object Storage Service (OSS) generates log objects based on a predefined naming convention. This way, access logs are generated and stored in the specified bucket on an hourly basis.

        For information about OSS Bucket Logging and how to use it, see [What is Bucket Logging](https://www.alibabacloud.com/help/en/oss/developer-reference/putbucketlogging).

        > **NOTE:** Available since v1.222.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = random.index.Integer("default",
            min=10000,
            max=99999)
        create_bucket = alicloud.oss.Bucket("CreateBucket",
            storage_class="Standard",
            bucket=f"{name}-{default['result']}")
        default_bucket_logging = alicloud.oss.BucketLogging("default",
            bucket=create_bucket.bucket,
            target_bucket=create_bucket.bucket,
            target_prefix="log/")
        ```

        ## Import

        OSS Bucket Logging can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketLogging:BucketLogging example <id>
        ```

        :param str resource_name: The name of the resource.
        :param BucketLoggingInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketLoggingInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 target_bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 target_prefix: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketLoggingInitArgs.__new__(BucketLoggingInitArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            if target_bucket is None and not opts.urn:
                raise TypeError("Missing required property 'target_bucket'")
            __props__.__dict__["target_bucket"] = target_bucket
            __props__.__dict__["target_prefix"] = target_prefix
        super(BucketLogging, __self__).__init__(
            'alicloud:oss/bucketLogging:BucketLogging',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[_builtins.str]] = None,
            target_bucket: Optional[pulumi.Input[_builtins.str]] = None,
            target_prefix: Optional[pulumi.Input[_builtins.str]] = None) -> 'BucketLogging':
        """
        Get an existing BucketLogging resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] target_bucket: The bucket that stores access logs.
        :param pulumi.Input[_builtins.str] target_prefix: The prefix of the saved log objects. This element can be left empty.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketLoggingState.__new__(_BucketLoggingState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["target_bucket"] = target_bucket
        __props__.__dict__["target_prefix"] = target_prefix
        return BucketLogging(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @_builtins.property
    @pulumi.getter(name="targetBucket")
    def target_bucket(self) -> pulumi.Output[_builtins.str]:
        """
        The bucket that stores access logs.
        """
        return pulumi.get(self, "target_bucket")

    @_builtins.property
    @pulumi.getter(name="targetPrefix")
    def target_prefix(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The prefix of the saved log objects. This element can be left empty.
        """
        return pulumi.get(self, "target_prefix")

