# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FileUploadLimitArgs', 'FileUploadLimit']

@pulumi.input_type
class FileUploadLimitArgs:
    def __init__(__self__, *,
                 limit: pulumi.Input[int]):
        """
        The set of arguments for constructing a FileUploadLimit resource.
        :param pulumi.Input[int] limit: File Upload Threshold.
        """
        pulumi.set(__self__, "limit", limit)

    @property
    @pulumi.getter
    def limit(self) -> pulumi.Input[int]:
        """
        File Upload Threshold.
        """
        return pulumi.get(self, "limit")

    @limit.setter
    def limit(self, value: pulumi.Input[int]):
        pulumi.set(self, "limit", value)


@pulumi.input_type
class _FileUploadLimitState:
    def __init__(__self__, *,
                 limit: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering FileUploadLimit resources.
        :param pulumi.Input[int] limit: File Upload Threshold.
        """
        if limit is not None:
            pulumi.set(__self__, "limit", limit)

    @property
    @pulumi.getter
    def limit(self) -> Optional[pulumi.Input[int]]:
        """
        File Upload Threshold.
        """
        return pulumi.get(self, "limit")

    @limit.setter
    def limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "limit", value)


class FileUploadLimit(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 limit: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Import

        Threat Detection File Upload Limit can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:threatdetection/fileUploadLimit:FileUploadLimit example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] limit: File Upload Threshold.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FileUploadLimitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Threat Detection File Upload Limit can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:threatdetection/fileUploadLimit:FileUploadLimit example
        ```

        :param str resource_name: The name of the resource.
        :param FileUploadLimitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FileUploadLimitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 limit: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FileUploadLimitArgs.__new__(FileUploadLimitArgs)

            if limit is None and not opts.urn:
                raise TypeError("Missing required property 'limit'")
            __props__.__dict__["limit"] = limit
        super(FileUploadLimit, __self__).__init__(
            'alicloud:threatdetection/fileUploadLimit:FileUploadLimit',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            limit: Optional[pulumi.Input[int]] = None) -> 'FileUploadLimit':
        """
        Get an existing FileUploadLimit resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] limit: File Upload Threshold.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FileUploadLimitState.__new__(_FileUploadLimitState)

        __props__.__dict__["limit"] = limit
        return FileUploadLimit(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def limit(self) -> pulumi.Output[int]:
        """
        File Upload Threshold.
        """
        return pulumi.get(self, "limit")
