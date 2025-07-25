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

__all__ = ['ImagePipelineExecutionArgs', 'ImagePipelineExecution']

@pulumi.input_type
class ImagePipelineExecutionArgs:
    def __init__(__self__, *,
                 image_pipeline_id: pulumi.Input[_builtins.str],
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ImagePipelineExecution resource.
        :param pulumi.Input[_builtins.str] image_pipeline_id: The ID of the image template.
        :param pulumi.Input[_builtins.str] status: The status of the image build task. Valid values:
               - CANCELLED: canceled. The build process has been canceled.
        """
        pulumi.set(__self__, "image_pipeline_id", image_pipeline_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="imagePipelineId")
    def image_pipeline_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the image template.
        """
        return pulumi.get(self, "image_pipeline_id")

    @image_pipeline_id.setter
    def image_pipeline_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "image_pipeline_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the image build task. Valid values:
        - CANCELLED: canceled. The build process has been canceled.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _ImagePipelineExecutionState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 image_pipeline_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ImagePipelineExecution resources.
        :param pulumi.Input[_builtins.str] create_time: The time when the image build task was created.
        :param pulumi.Input[_builtins.str] image_pipeline_id: The ID of the image template.
        :param pulumi.Input[_builtins.str] status: The status of the image build task. Valid values:
               - CANCELLED: canceled. The build process has been canceled.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if image_pipeline_id is not None:
            pulumi.set(__self__, "image_pipeline_id", image_pipeline_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The time when the image build task was created.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="imagePipelineId")
    def image_pipeline_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the image template.
        """
        return pulumi.get(self, "image_pipeline_id")

    @image_pipeline_id.setter
    def image_pipeline_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "image_pipeline_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the image build task. Valid values:
        - CANCELLED: canceled. The build process has been canceled.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:ecs/imagePipelineExecution:ImagePipelineExecution")
class ImagePipelineExecution(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 image_pipeline_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        ECS Image Pipeline Execution can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ecs/imagePipelineExecution:ImagePipelineExecution example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] image_pipeline_id: The ID of the image template.
        :param pulumi.Input[_builtins.str] status: The status of the image build task. Valid values:
               - CANCELLED: canceled. The build process has been canceled.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ImagePipelineExecutionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ECS Image Pipeline Execution can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ecs/imagePipelineExecution:ImagePipelineExecution example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ImagePipelineExecutionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ImagePipelineExecutionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 image_pipeline_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ImagePipelineExecutionArgs.__new__(ImagePipelineExecutionArgs)

            if image_pipeline_id is None and not opts.urn:
                raise TypeError("Missing required property 'image_pipeline_id'")
            __props__.__dict__["image_pipeline_id"] = image_pipeline_id
            __props__.__dict__["status"] = status
            __props__.__dict__["create_time"] = None
        super(ImagePipelineExecution, __self__).__init__(
            'alicloud:ecs/imagePipelineExecution:ImagePipelineExecution',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            image_pipeline_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'ImagePipelineExecution':
        """
        Get an existing ImagePipelineExecution resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: The time when the image build task was created.
        :param pulumi.Input[_builtins.str] image_pipeline_id: The ID of the image template.
        :param pulumi.Input[_builtins.str] status: The status of the image build task. Valid values:
               - CANCELLED: canceled. The build process has been canceled.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ImagePipelineExecutionState.__new__(_ImagePipelineExecutionState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["image_pipeline_id"] = image_pipeline_id
        __props__.__dict__["status"] = status
        return ImagePipelineExecution(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        The time when the image build task was created.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="imagePipelineId")
    def image_pipeline_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the image template.
        """
        return pulumi.get(self, "image_pipeline_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the image build task. Valid values:
        - CANCELLED: canceled. The build process has been canceled.
        """
        return pulumi.get(self, "status")

