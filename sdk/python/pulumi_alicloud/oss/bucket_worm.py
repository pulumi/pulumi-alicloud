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

__all__ = ['BucketWormArgs', 'BucketWorm']

@pulumi.input_type
class BucketWormArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 retention_period_in_days: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BucketWorm resource.
        :param pulumi.Input[str] bucket: The name of the bucket
        :param pulumi.Input[int] retention_period_in_days: The specified number of days to retain the Object.
        :param pulumi.Input[str] status: The status of the compliance retention policy. Optional values:
               - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
               - `Locked`: The compliance retention policy is Locked.
        """
        pulumi.set(__self__, "bucket", bucket)
        if retention_period_in_days is not None:
            pulumi.set(__self__, "retention_period_in_days", retention_period_in_days)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        The name of the bucket
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter(name="retentionPeriodInDays")
    def retention_period_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        The specified number of days to retain the Object.
        """
        return pulumi.get(self, "retention_period_in_days")

    @retention_period_in_days.setter
    def retention_period_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_period_in_days", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the compliance retention policy. Optional values:
        - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
        - `Locked`: The compliance retention policy is Locked.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _BucketWormState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 retention_period_in_days: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 worm_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BucketWorm resources.
        :param pulumi.Input[str] bucket: The name of the bucket
        :param pulumi.Input[str] create_time: The creation time of the resource
        :param pulumi.Input[int] retention_period_in_days: The specified number of days to retain the Object.
        :param pulumi.Input[str] status: The status of the compliance retention policy. Optional values:
               - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
               - `Locked`: The compliance retention policy is Locked.
        :param pulumi.Input[str] worm_id: The ID of the retention policy.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if retention_period_in_days is not None:
            pulumi.set(__self__, "retention_period_in_days", retention_period_in_days)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if worm_id is not None:
            pulumi.set(__self__, "worm_id", worm_id)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bucket
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="retentionPeriodInDays")
    def retention_period_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        The specified number of days to retain the Object.
        """
        return pulumi.get(self, "retention_period_in_days")

    @retention_period_in_days.setter
    def retention_period_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_period_in_days", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the compliance retention policy. Optional values:
        - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
        - `Locked`: The compliance retention policy is Locked.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="wormId")
    def worm_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the retention policy.
        """
        return pulumi.get(self, "worm_id")

    @worm_id.setter
    def worm_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "worm_id", value)


class BucketWorm(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 retention_period_in_days: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        OSS Bucket Worm can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketWorm:BucketWorm example <bucket>:<worm_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: The name of the bucket
        :param pulumi.Input[int] retention_period_in_days: The specified number of days to retain the Object.
        :param pulumi.Input[str] status: The status of the compliance retention policy. Optional values:
               - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
               - `Locked`: The compliance retention policy is Locked.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketWormArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        OSS Bucket Worm can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:oss/bucketWorm:BucketWorm example <bucket>:<worm_id>
        ```

        :param str resource_name: The name of the resource.
        :param BucketWormArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketWormArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 retention_period_in_days: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketWormArgs.__new__(BucketWormArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["retention_period_in_days"] = retention_period_in_days
            __props__.__dict__["status"] = status
            __props__.__dict__["create_time"] = None
            __props__.__dict__["worm_id"] = None
        super(BucketWorm, __self__).__init__(
            'alicloud:oss/bucketWorm:BucketWorm',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            retention_period_in_days: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            worm_id: Optional[pulumi.Input[str]] = None) -> 'BucketWorm':
        """
        Get an existing BucketWorm resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: The name of the bucket
        :param pulumi.Input[str] create_time: The creation time of the resource
        :param pulumi.Input[int] retention_period_in_days: The specified number of days to retain the Object.
        :param pulumi.Input[str] status: The status of the compliance retention policy. Optional values:
               - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
               - `Locked`: The compliance retention policy is Locked.
        :param pulumi.Input[str] worm_id: The ID of the retention policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketWormState.__new__(_BucketWormState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["retention_period_in_days"] = retention_period_in_days
        __props__.__dict__["status"] = status
        __props__.__dict__["worm_id"] = worm_id
        return BucketWorm(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        The name of the bucket
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="retentionPeriodInDays")
    def retention_period_in_days(self) -> pulumi.Output[Optional[int]]:
        """
        The specified number of days to retain the Object.
        """
        return pulumi.get(self, "retention_period_in_days")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the compliance retention policy. Optional values:
        - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
        - `Locked`: The compliance retention policy is Locked.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="wormId")
    def worm_id(self) -> pulumi.Output[str]:
        """
        The ID of the retention policy.
        """
        return pulumi.get(self, "worm_id")
