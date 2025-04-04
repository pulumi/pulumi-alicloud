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

__all__ = ['GroupArgs', 'Group']

@pulumi.input_type
class GroupArgs:
    def __init__(__self__, *,
                 comments: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Group resource.
        :param pulumi.Input[str] comments: Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
        :param pulumi.Input[bool] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] name: Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        if comments is not None:
            pulumi.set(__self__, "comments", comments)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def comments(self) -> Optional[pulumi.Input[str]]:
        """
        Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
        """
        return pulumi.get(self, "comments")

    @comments.setter
    def comments(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comments", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        This parameter is used for resource destroy. Default value is `false`.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _GroupState:
    def __init__(__self__, *,
                 comments: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Group resources.
        :param pulumi.Input[str] comments: Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
        :param pulumi.Input[bool] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] name: Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        if comments is not None:
            pulumi.set(__self__, "comments", comments)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def comments(self) -> Optional[pulumi.Input[str]]:
        """
        Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
        """
        return pulumi.get(self, "comments")

    @comments.setter
    def comments(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comments", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        This parameter is used for resource destroy. Default value is `false`.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Group(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comments: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a RAM Group resource.

        > **NOTE:** When you want to destroy this resource forcefully(means remove all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `pulumi preview`, then you can delete resource forcefully.

        > **NOTE:** Available since v1.0.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a new RAM Group.
        group = alicloud.ram.Group("group",
            name="groupName",
            comments="this is a group comments.")
        ```

        ## Import

        RAM group can be imported using the id or name, e.g.

        ```sh
        $ pulumi import alicloud:ram/group:Group example my-group
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comments: Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
        :param pulumi.Input[bool] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] name: Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[GroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RAM Group resource.

        > **NOTE:** When you want to destroy this resource forcefully(means remove all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `pulumi preview`, then you can delete resource forcefully.

        > **NOTE:** Available since v1.0.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a new RAM Group.
        group = alicloud.ram.Group("group",
            name="groupName",
            comments="this is a group comments.")
        ```

        ## Import

        RAM group can be imported using the id or name, e.g.

        ```sh
        $ pulumi import alicloud:ram/group:Group example my-group
        ```

        :param str resource_name: The name of the resource.
        :param GroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comments: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupArgs.__new__(GroupArgs)

            __props__.__dict__["comments"] = comments
            __props__.__dict__["force"] = force
            __props__.__dict__["name"] = name
        super(Group, __self__).__init__(
            'alicloud:ram/group:Group',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comments: Optional[pulumi.Input[str]] = None,
            force: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Group':
        """
        Get an existing Group resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comments: Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
        :param pulumi.Input[bool] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] name: Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupState.__new__(_GroupState)

        __props__.__dict__["comments"] = comments
        __props__.__dict__["force"] = force
        __props__.__dict__["name"] = name
        return Group(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comments(self) -> pulumi.Output[Optional[str]]:
        """
        Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
        """
        return pulumi.get(self, "comments")

    @property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[bool]]:
        """
        This parameter is used for resource destroy. Default value is `false`.
        """
        return pulumi.get(self, "force")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        return pulumi.get(self, "name")

