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

__all__ = ['BundleArgs', 'Bundle']

@pulumi.input_type
class BundleArgs:
    def __init__(__self__, *,
                 desktop_type: pulumi.Input[_builtins.str],
                 image_id: pulumi.Input[_builtins.str],
                 root_disk_size_gib: pulumi.Input[_builtins.int],
                 user_disk_size_gibs: pulumi.Input[Sequence[pulumi.Input[_builtins.int]]],
                 bundle_name: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 language: Optional[pulumi.Input[_builtins.str]] = None,
                 root_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
                 user_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Bundle resource.
        :param pulumi.Input[_builtins.str] desktop_type: The desktop type. You can call `eds_get_desktop_types` to query desktop type.
        :param pulumi.Input[_builtins.str] image_id: The ID of the image.
        :param pulumi.Input[_builtins.int] root_disk_size_gib: The root disk size gib.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.int]]] user_disk_size_gibs: The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
               - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
               - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        :param pulumi.Input[_builtins.str] bundle_name: The name of the bundle.
        :param pulumi.Input[_builtins.str] description: The description of the bundle.
        :param pulumi.Input[_builtins.str] language: The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        :param pulumi.Input[_builtins.str] root_disk_performance_level: The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        :param pulumi.Input[_builtins.str] user_disk_performance_level: The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        """
        pulumi.set(__self__, "desktop_type", desktop_type)
        pulumi.set(__self__, "image_id", image_id)
        pulumi.set(__self__, "root_disk_size_gib", root_disk_size_gib)
        pulumi.set(__self__, "user_disk_size_gibs", user_disk_size_gibs)
        if bundle_name is not None:
            pulumi.set(__self__, "bundle_name", bundle_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if language is not None:
            pulumi.set(__self__, "language", language)
        if root_disk_performance_level is not None:
            pulumi.set(__self__, "root_disk_performance_level", root_disk_performance_level)
        if user_disk_performance_level is not None:
            pulumi.set(__self__, "user_disk_performance_level", user_disk_performance_level)

    @_builtins.property
    @pulumi.getter(name="desktopType")
    def desktop_type(self) -> pulumi.Input[_builtins.str]:
        """
        The desktop type. You can call `eds_get_desktop_types` to query desktop type.
        """
        return pulumi.get(self, "desktop_type")

    @desktop_type.setter
    def desktop_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "desktop_type", value)

    @_builtins.property
    @pulumi.getter(name="imageId")
    def image_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the image.
        """
        return pulumi.get(self, "image_id")

    @image_id.setter
    def image_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "image_id", value)

    @_builtins.property
    @pulumi.getter(name="rootDiskSizeGib")
    def root_disk_size_gib(self) -> pulumi.Input[_builtins.int]:
        """
        The root disk size gib.
        """
        return pulumi.get(self, "root_disk_size_gib")

    @root_disk_size_gib.setter
    def root_disk_size_gib(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "root_disk_size_gib", value)

    @_builtins.property
    @pulumi.getter(name="userDiskSizeGibs")
    def user_disk_size_gibs(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]:
        """
        The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
        - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
        - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        """
        return pulumi.get(self, "user_disk_size_gibs")

    @user_disk_size_gibs.setter
    def user_disk_size_gibs(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]):
        pulumi.set(self, "user_disk_size_gibs", value)

    @_builtins.property
    @pulumi.getter(name="bundleName")
    def bundle_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the bundle.
        """
        return pulumi.get(self, "bundle_name")

    @bundle_name.setter
    def bundle_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bundle_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the bundle.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def language(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        """
        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "language", value)

    @_builtins.property
    @pulumi.getter(name="rootDiskPerformanceLevel")
    def root_disk_performance_level(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        """
        return pulumi.get(self, "root_disk_performance_level")

    @root_disk_performance_level.setter
    def root_disk_performance_level(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "root_disk_performance_level", value)

    @_builtins.property
    @pulumi.getter(name="userDiskPerformanceLevel")
    def user_disk_performance_level(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        """
        return pulumi.get(self, "user_disk_performance_level")

    @user_disk_performance_level.setter
    def user_disk_performance_level(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_disk_performance_level", value)


@pulumi.input_type
class _BundleState:
    def __init__(__self__, *,
                 bundle_name: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 desktop_type: Optional[pulumi.Input[_builtins.str]] = None,
                 image_id: Optional[pulumi.Input[_builtins.str]] = None,
                 language: Optional[pulumi.Input[_builtins.str]] = None,
                 root_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
                 root_disk_size_gib: Optional[pulumi.Input[_builtins.int]] = None,
                 user_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
                 user_disk_size_gibs: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]] = None):
        """
        Input properties used for looking up and filtering Bundle resources.
        :param pulumi.Input[_builtins.str] bundle_name: The name of the bundle.
        :param pulumi.Input[_builtins.str] description: The description of the bundle.
        :param pulumi.Input[_builtins.str] desktop_type: The desktop type. You can call `eds_get_desktop_types` to query desktop type.
        :param pulumi.Input[_builtins.str] image_id: The ID of the image.
        :param pulumi.Input[_builtins.str] language: The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        :param pulumi.Input[_builtins.str] root_disk_performance_level: The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        :param pulumi.Input[_builtins.int] root_disk_size_gib: The root disk size gib.
        :param pulumi.Input[_builtins.str] user_disk_performance_level: The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.int]]] user_disk_size_gibs: The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
               - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
               - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        """
        if bundle_name is not None:
            pulumi.set(__self__, "bundle_name", bundle_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if desktop_type is not None:
            pulumi.set(__self__, "desktop_type", desktop_type)
        if image_id is not None:
            pulumi.set(__self__, "image_id", image_id)
        if language is not None:
            pulumi.set(__self__, "language", language)
        if root_disk_performance_level is not None:
            pulumi.set(__self__, "root_disk_performance_level", root_disk_performance_level)
        if root_disk_size_gib is not None:
            pulumi.set(__self__, "root_disk_size_gib", root_disk_size_gib)
        if user_disk_performance_level is not None:
            pulumi.set(__self__, "user_disk_performance_level", user_disk_performance_level)
        if user_disk_size_gibs is not None:
            pulumi.set(__self__, "user_disk_size_gibs", user_disk_size_gibs)

    @_builtins.property
    @pulumi.getter(name="bundleName")
    def bundle_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the bundle.
        """
        return pulumi.get(self, "bundle_name")

    @bundle_name.setter
    def bundle_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bundle_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the bundle.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="desktopType")
    def desktop_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The desktop type. You can call `eds_get_desktop_types` to query desktop type.
        """
        return pulumi.get(self, "desktop_type")

    @desktop_type.setter
    def desktop_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "desktop_type", value)

    @_builtins.property
    @pulumi.getter(name="imageId")
    def image_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the image.
        """
        return pulumi.get(self, "image_id")

    @image_id.setter
    def image_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "image_id", value)

    @_builtins.property
    @pulumi.getter
    def language(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        """
        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "language", value)

    @_builtins.property
    @pulumi.getter(name="rootDiskPerformanceLevel")
    def root_disk_performance_level(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        """
        return pulumi.get(self, "root_disk_performance_level")

    @root_disk_performance_level.setter
    def root_disk_performance_level(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "root_disk_performance_level", value)

    @_builtins.property
    @pulumi.getter(name="rootDiskSizeGib")
    def root_disk_size_gib(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The root disk size gib.
        """
        return pulumi.get(self, "root_disk_size_gib")

    @root_disk_size_gib.setter
    def root_disk_size_gib(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "root_disk_size_gib", value)

    @_builtins.property
    @pulumi.getter(name="userDiskPerformanceLevel")
    def user_disk_performance_level(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        """
        return pulumi.get(self, "user_disk_performance_level")

    @user_disk_performance_level.setter
    def user_disk_performance_level(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_disk_performance_level", value)

    @_builtins.property
    @pulumi.getter(name="userDiskSizeGibs")
    def user_disk_size_gibs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]]:
        """
        The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
        - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
        - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        """
        return pulumi.get(self, "user_disk_size_gibs")

    @user_disk_size_gibs.setter
    def user_disk_size_gibs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]]):
        pulumi.set(self, "user_disk_size_gibs", value)


@pulumi.type_token("alicloud:eds/bundle:Bundle")
class Bundle(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bundle_name: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 desktop_type: Optional[pulumi.Input[_builtins.str]] = None,
                 image_id: Optional[pulumi.Input[_builtins.str]] = None,
                 language: Optional[pulumi.Input[_builtins.str]] = None,
                 root_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
                 root_disk_size_gib: Optional[pulumi.Input[_builtins.int]] = None,
                 user_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
                 user_disk_size_gibs: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]] = None,
                 __props__=None):
        """
        Provides a ECD Bundle resource.

        For information about ECD Bundle and how to use it, see [What is Bundle](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createbundle).

        > **NOTE:** Available since v1.170.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.eds.get_images(image_type="SYSTEM",
            os_type="Windows",
            desktop_instance_type="eds.hf.4c8g")
        default_get_desktop_types = alicloud.eds.get_desktop_types(instance_type_family="eds.hf",
            cpu_count=4,
            memory_size=8192)
        default_bundle = alicloud.eds.Bundle("default",
            description=name,
            desktop_type=default_get_desktop_types.ids[0],
            bundle_name=name,
            image_id=default.ids[0],
            user_disk_size_gibs=[70],
            root_disk_size_gib=80,
            root_disk_performance_level="PL1",
            user_disk_performance_level="PL1")
        ```

        ## Import

        ECD Bundle can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:eds/bundle:Bundle example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bundle_name: The name of the bundle.
        :param pulumi.Input[_builtins.str] description: The description of the bundle.
        :param pulumi.Input[_builtins.str] desktop_type: The desktop type. You can call `eds_get_desktop_types` to query desktop type.
        :param pulumi.Input[_builtins.str] image_id: The ID of the image.
        :param pulumi.Input[_builtins.str] language: The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        :param pulumi.Input[_builtins.str] root_disk_performance_level: The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        :param pulumi.Input[_builtins.int] root_disk_size_gib: The root disk size gib.
        :param pulumi.Input[_builtins.str] user_disk_performance_level: The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.int]]] user_disk_size_gibs: The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
               - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
               - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BundleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ECD Bundle resource.

        For information about ECD Bundle and how to use it, see [What is Bundle](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createbundle).

        > **NOTE:** Available since v1.170.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.eds.get_images(image_type="SYSTEM",
            os_type="Windows",
            desktop_instance_type="eds.hf.4c8g")
        default_get_desktop_types = alicloud.eds.get_desktop_types(instance_type_family="eds.hf",
            cpu_count=4,
            memory_size=8192)
        default_bundle = alicloud.eds.Bundle("default",
            description=name,
            desktop_type=default_get_desktop_types.ids[0],
            bundle_name=name,
            image_id=default.ids[0],
            user_disk_size_gibs=[70],
            root_disk_size_gib=80,
            root_disk_performance_level="PL1",
            user_disk_performance_level="PL1")
        ```

        ## Import

        ECD Bundle can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:eds/bundle:Bundle example <id>
        ```

        :param str resource_name: The name of the resource.
        :param BundleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BundleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bundle_name: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 desktop_type: Optional[pulumi.Input[_builtins.str]] = None,
                 image_id: Optional[pulumi.Input[_builtins.str]] = None,
                 language: Optional[pulumi.Input[_builtins.str]] = None,
                 root_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
                 root_disk_size_gib: Optional[pulumi.Input[_builtins.int]] = None,
                 user_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
                 user_disk_size_gibs: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BundleArgs.__new__(BundleArgs)

            __props__.__dict__["bundle_name"] = bundle_name
            __props__.__dict__["description"] = description
            if desktop_type is None and not opts.urn:
                raise TypeError("Missing required property 'desktop_type'")
            __props__.__dict__["desktop_type"] = desktop_type
            if image_id is None and not opts.urn:
                raise TypeError("Missing required property 'image_id'")
            __props__.__dict__["image_id"] = image_id
            __props__.__dict__["language"] = language
            __props__.__dict__["root_disk_performance_level"] = root_disk_performance_level
            if root_disk_size_gib is None and not opts.urn:
                raise TypeError("Missing required property 'root_disk_size_gib'")
            __props__.__dict__["root_disk_size_gib"] = root_disk_size_gib
            __props__.__dict__["user_disk_performance_level"] = user_disk_performance_level
            if user_disk_size_gibs is None and not opts.urn:
                raise TypeError("Missing required property 'user_disk_size_gibs'")
            __props__.__dict__["user_disk_size_gibs"] = user_disk_size_gibs
        super(Bundle, __self__).__init__(
            'alicloud:eds/bundle:Bundle',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bundle_name: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            desktop_type: Optional[pulumi.Input[_builtins.str]] = None,
            image_id: Optional[pulumi.Input[_builtins.str]] = None,
            language: Optional[pulumi.Input[_builtins.str]] = None,
            root_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
            root_disk_size_gib: Optional[pulumi.Input[_builtins.int]] = None,
            user_disk_performance_level: Optional[pulumi.Input[_builtins.str]] = None,
            user_disk_size_gibs: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.int]]]] = None) -> 'Bundle':
        """
        Get an existing Bundle resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bundle_name: The name of the bundle.
        :param pulumi.Input[_builtins.str] description: The description of the bundle.
        :param pulumi.Input[_builtins.str] desktop_type: The desktop type. You can call `eds_get_desktop_types` to query desktop type.
        :param pulumi.Input[_builtins.str] image_id: The ID of the image.
        :param pulumi.Input[_builtins.str] language: The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        :param pulumi.Input[_builtins.str] root_disk_performance_level: The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        :param pulumi.Input[_builtins.int] root_disk_size_gib: The root disk size gib.
        :param pulumi.Input[_builtins.str] user_disk_performance_level: The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.int]]] user_disk_size_gibs: The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
               - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
               - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BundleState.__new__(_BundleState)

        __props__.__dict__["bundle_name"] = bundle_name
        __props__.__dict__["description"] = description
        __props__.__dict__["desktop_type"] = desktop_type
        __props__.__dict__["image_id"] = image_id
        __props__.__dict__["language"] = language
        __props__.__dict__["root_disk_performance_level"] = root_disk_performance_level
        __props__.__dict__["root_disk_size_gib"] = root_disk_size_gib
        __props__.__dict__["user_disk_performance_level"] = user_disk_performance_level
        __props__.__dict__["user_disk_size_gibs"] = user_disk_size_gibs
        return Bundle(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="bundleName")
    def bundle_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the bundle.
        """
        return pulumi.get(self, "bundle_name")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the bundle.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="desktopType")
    def desktop_type(self) -> pulumi.Output[_builtins.str]:
        """
        The desktop type. You can call `eds_get_desktop_types` to query desktop type.
        """
        return pulumi.get(self, "desktop_type")

    @_builtins.property
    @pulumi.getter(name="imageId")
    def image_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the image.
        """
        return pulumi.get(self, "image_id")

    @_builtins.property
    @pulumi.getter
    def language(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        """
        return pulumi.get(self, "language")

    @_builtins.property
    @pulumi.getter(name="rootDiskPerformanceLevel")
    def root_disk_performance_level(self) -> pulumi.Output[_builtins.str]:
        """
        The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        """
        return pulumi.get(self, "root_disk_performance_level")

    @_builtins.property
    @pulumi.getter(name="rootDiskSizeGib")
    def root_disk_size_gib(self) -> pulumi.Output[_builtins.int]:
        """
        The root disk size gib.
        """
        return pulumi.get(self, "root_disk_size_gib")

    @_builtins.property
    @pulumi.getter(name="userDiskPerformanceLevel")
    def user_disk_performance_level(self) -> pulumi.Output[_builtins.str]:
        """
        The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        """
        return pulumi.get(self, "user_disk_performance_level")

    @_builtins.property
    @pulumi.getter(name="userDiskSizeGibs")
    def user_disk_size_gibs(self) -> pulumi.Output[Sequence[_builtins.int]]:
        """
        The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
        - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
        - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        """
        return pulumi.get(self, "user_disk_size_gibs")

