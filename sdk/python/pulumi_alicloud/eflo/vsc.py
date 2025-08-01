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

__all__ = ['VscArgs', 'Vsc']

@pulumi.input_type
class VscArgs:
    def __init__(__self__, *,
                 node_id: pulumi.Input[_builtins.str],
                 resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 vsc_name: Optional[pulumi.Input[_builtins.str]] = None,
                 vsc_type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Vsc resource.
        :param pulumi.Input[_builtins.str] node_id: The ID of the Node.
        :param pulumi.Input[_builtins.str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource.
        :param pulumi.Input[_builtins.str] vsc_name: The name of the Vsc.
        :param pulumi.Input[_builtins.str] vsc_type: The type of the Vsc. Default value: `primary`. Valid values: `primary`.
        """
        pulumi.set(__self__, "node_id", node_id)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vsc_name is not None:
            pulumi.set(__self__, "vsc_name", vsc_name)
        if vsc_type is not None:
            pulumi.set(__self__, "vsc_type", vsc_type)

    @_builtins.property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Node.
        """
        return pulumi.get(self, "node_id")

    @node_id.setter
    def node_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "node_id", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_id", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="vscName")
    def vsc_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Vsc.
        """
        return pulumi.get(self, "vsc_name")

    @vsc_name.setter
    def vsc_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vsc_name", value)

    @_builtins.property
    @pulumi.getter(name="vscType")
    def vsc_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the Vsc. Default value: `primary`. Valid values: `primary`.
        """
        return pulumi.get(self, "vsc_type")

    @vsc_type.setter
    def vsc_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vsc_type", value)


@pulumi.input_type
class _VscState:
    def __init__(__self__, *,
                 node_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 vsc_name: Optional[pulumi.Input[_builtins.str]] = None,
                 vsc_type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Vsc resources.
        :param pulumi.Input[_builtins.str] node_id: The ID of the Node.
        :param pulumi.Input[_builtins.str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[_builtins.str] status: The status of the Vsc.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource.
        :param pulumi.Input[_builtins.str] vsc_name: The name of the Vsc.
        :param pulumi.Input[_builtins.str] vsc_type: The type of the Vsc. Default value: `primary`. Valid values: `primary`.
        """
        if node_id is not None:
            pulumi.set(__self__, "node_id", node_id)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vsc_name is not None:
            pulumi.set(__self__, "vsc_name", vsc_name)
        if vsc_type is not None:
            pulumi.set(__self__, "vsc_type", vsc_type)

    @_builtins.property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Node.
        """
        return pulumi.get(self, "node_id")

    @node_id.setter
    def node_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "node_id", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the Vsc.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="vscName")
    def vsc_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Vsc.
        """
        return pulumi.get(self, "vsc_name")

    @vsc_name.setter
    def vsc_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vsc_name", value)

    @_builtins.property
    @pulumi.getter(name="vscType")
    def vsc_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the Vsc. Default value: `primary`. Valid values: `primary`.
        """
        return pulumi.get(self, "vsc_type")

    @vsc_type.setter
    def vsc_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vsc_type", value)


@pulumi.type_token("alicloud:eflo/vsc:Vsc")
class Vsc(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 node_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 vsc_name: Optional[pulumi.Input[_builtins.str]] = None,
                 vsc_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Eflo Vsc resource.

        Virtual Storage Channel.

        For information about Eflo Vsc and how to use it, see [What is Vsc](https://www.alibabacloud.com/help/en/pai/developer-reference/api-eflo-controller-2022-12-15-createvsc).

        > **NOTE:** Available since v1.250.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.eflo.Vsc("default",
            vsc_type="primary",
            node_id="e01-cn-9me49omda01",
            vsc_name=name)
        ```

        ## Import

        Eflo Vsc can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:eflo/vsc:Vsc example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] node_id: The ID of the Node.
        :param pulumi.Input[_builtins.str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource.
        :param pulumi.Input[_builtins.str] vsc_name: The name of the Vsc.
        :param pulumi.Input[_builtins.str] vsc_type: The type of the Vsc. Default value: `primary`. Valid values: `primary`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VscArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Eflo Vsc resource.

        Virtual Storage Channel.

        For information about Eflo Vsc and how to use it, see [What is Vsc](https://www.alibabacloud.com/help/en/pai/developer-reference/api-eflo-controller-2022-12-15-createvsc).

        > **NOTE:** Available since v1.250.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.eflo.Vsc("default",
            vsc_type="primary",
            node_id="e01-cn-9me49omda01",
            vsc_name=name)
        ```

        ## Import

        Eflo Vsc can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:eflo/vsc:Vsc example <id>
        ```

        :param str resource_name: The name of the resource.
        :param VscArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VscArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 node_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 vsc_name: Optional[pulumi.Input[_builtins.str]] = None,
                 vsc_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VscArgs.__new__(VscArgs)

            if node_id is None and not opts.urn:
                raise TypeError("Missing required property 'node_id'")
            __props__.__dict__["node_id"] = node_id
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["vsc_name"] = vsc_name
            __props__.__dict__["vsc_type"] = vsc_type
            __props__.__dict__["status"] = None
        super(Vsc, __self__).__init__(
            'alicloud:eflo/vsc:Vsc',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            node_id: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            vsc_name: Optional[pulumi.Input[_builtins.str]] = None,
            vsc_type: Optional[pulumi.Input[_builtins.str]] = None) -> 'Vsc':
        """
        Get an existing Vsc resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] node_id: The ID of the Node.
        :param pulumi.Input[_builtins.str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[_builtins.str] status: The status of the Vsc.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource.
        :param pulumi.Input[_builtins.str] vsc_name: The name of the Vsc.
        :param pulumi.Input[_builtins.str] vsc_type: The type of the Vsc. Default value: `primary`. Valid values: `primary`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VscState.__new__(_VscState)

        __props__.__dict__["node_id"] = node_id
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vsc_name"] = vsc_name
        __props__.__dict__["vsc_type"] = vsc_type
        return Vsc(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Node.
        """
        return pulumi.get(self, "node_id")

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the Vsc.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="vscName")
    def vsc_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the Vsc.
        """
        return pulumi.get(self, "vsc_name")

    @_builtins.property
    @pulumi.getter(name="vscType")
    def vsc_type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of the Vsc. Default value: `primary`. Valid values: `primary`.
        """
        return pulumi.get(self, "vsc_type")

