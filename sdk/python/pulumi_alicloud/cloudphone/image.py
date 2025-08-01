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

__all__ = ['ImageArgs', 'Image']

@pulumi.input_type
class ImageArgs:
    def __init__(__self__, *,
                 image_name: pulumi.Input[_builtins.str],
                 instance_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a Image resource.
        :param pulumi.Input[_builtins.str] image_name: The image name.
        :param pulumi.Input[_builtins.str] instance_id: The instance ID.
        """
        pulumi.set(__self__, "image_name", image_name)
        pulumi.set(__self__, "instance_id", instance_id)

    @_builtins.property
    @pulumi.getter(name="imageName")
    def image_name(self) -> pulumi.Input[_builtins.str]:
        """
        The image name.
        """
        return pulumi.get(self, "image_name")

    @image_name.setter
    def image_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "image_name", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The instance ID.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "instance_id", value)


@pulumi.input_type
class _ImageState:
    def __init__(__self__, *,
                 image_name: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Image resources.
        :param pulumi.Input[_builtins.str] image_name: The image name.
        :param pulumi.Input[_builtins.str] instance_id: The instance ID.
        :param pulumi.Input[_builtins.str] status: The status of the mirror.
        """
        if image_name is not None:
            pulumi.set(__self__, "image_name", image_name)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="imageName")
    def image_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The image name.
        """
        return pulumi.get(self, "image_name")

    @image_name.setter
    def image_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "image_name", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The instance ID.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the mirror.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:cloudphone/image:Image")
class Image(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 image_name: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Cloud Phone Image resource.

        Cloud phone image.

        For information about Cloud Phone Image and how to use it, see [What is Image](https://next.api.alibabacloud.com/document/eds-aic/2023-09-30/CreateCustomImage).

        > **NOTE:** Available since v1.243.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        defaultj_z1gi0 = alicloud.cloudphone.Policy("defaultjZ1gi0")
        default_yh_ml_to = alicloud.cloudphoneinstance.Group("defaultYHMlTO",
            instance_group_spec="acp.basic.small",
            policy_group_id=defaultj_z1gi0.id,
            instance_group_name="AutoCreateGroupName",
            period=1,
            number_of_instances=1,
            charge_type="PostPaid",
            image_id="imgc-075cllfeuazh03tg9",
            period_unit="Hour",
            auto_renew=False,
            amount=1,
            auto_pay=False,
            gpu_acceleration=False)
        default04hh_xk = alicloud.cloudphoneinstance.CloudPhoneInstance("default04hhXk",
            android_instance_group_id=default_yh_ml_to.id,
            android_instance_name="CreateInstanceName")
        default = alicloud.cloudphone.Image("default",
            image_name="ImageName",
            instance_id=default04hh_xk.id)
        ```

        ## Import

        Cloud Phone Image can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cloudphone/image:Image example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] image_name: The image name.
        :param pulumi.Input[_builtins.str] instance_id: The instance ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ImageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Phone Image resource.

        Cloud phone image.

        For information about Cloud Phone Image and how to use it, see [What is Image](https://next.api.alibabacloud.com/document/eds-aic/2023-09-30/CreateCustomImage).

        > **NOTE:** Available since v1.243.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        defaultj_z1gi0 = alicloud.cloudphone.Policy("defaultjZ1gi0")
        default_yh_ml_to = alicloud.cloudphoneinstance.Group("defaultYHMlTO",
            instance_group_spec="acp.basic.small",
            policy_group_id=defaultj_z1gi0.id,
            instance_group_name="AutoCreateGroupName",
            period=1,
            number_of_instances=1,
            charge_type="PostPaid",
            image_id="imgc-075cllfeuazh03tg9",
            period_unit="Hour",
            auto_renew=False,
            amount=1,
            auto_pay=False,
            gpu_acceleration=False)
        default04hh_xk = alicloud.cloudphoneinstance.CloudPhoneInstance("default04hhXk",
            android_instance_group_id=default_yh_ml_to.id,
            android_instance_name="CreateInstanceName")
        default = alicloud.cloudphone.Image("default",
            image_name="ImageName",
            instance_id=default04hh_xk.id)
        ```

        ## Import

        Cloud Phone Image can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cloudphone/image:Image example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ImageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ImageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 image_name: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ImageArgs.__new__(ImageArgs)

            if image_name is None and not opts.urn:
                raise TypeError("Missing required property 'image_name'")
            __props__.__dict__["image_name"] = image_name
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["status"] = None
        super(Image, __self__).__init__(
            'alicloud:cloudphone/image:Image',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            image_name: Optional[pulumi.Input[_builtins.str]] = None,
            instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'Image':
        """
        Get an existing Image resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] image_name: The image name.
        :param pulumi.Input[_builtins.str] instance_id: The instance ID.
        :param pulumi.Input[_builtins.str] status: The status of the mirror.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ImageState.__new__(_ImageState)

        __props__.__dict__["image_name"] = image_name
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["status"] = status
        return Image(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="imageName")
    def image_name(self) -> pulumi.Output[_builtins.str]:
        """
        The image name.
        """
        return pulumi.get(self, "image_name")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The instance ID.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the mirror.
        """
        return pulumi.get(self, "status")

