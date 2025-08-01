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
from . import outputs
from ._inputs import *

__all__ = ['ResourceGroupArgs', 'ResourceGroup']

@pulumi.input_type
class ResourceGroupArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a ResourceGroup resource.
        :param pulumi.Input[_builtins.str] display_name: The display name of the resource group. The name must be 1 to 50 characters in length.
        :param pulumi.Input[_builtins.str] name: Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.
        :param pulumi.Input[_builtins.str] resource_group_name: The unique identifier of the resource group. The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "display_name", display_name)
        if name is not None:
            warnings.warn("""Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[_builtins.str]:
        """
        The display name of the resource group. The name must be 1 to 50 characters in length.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.""")
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique identifier of the resource group. The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ResourceGroupState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 region_statuses: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceGroupRegionStatusArgs']]]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering ResourceGroup resources.
        :param pulumi.Input[_builtins.str] account_id: The ID of the Alibaba Cloud account to which the resource group belongs.
        :param pulumi.Input[_builtins.str] display_name: The display name of the resource group. The name must be 1 to 50 characters in length.
        :param pulumi.Input[_builtins.str] name: Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.
        :param pulumi.Input[Sequence[pulumi.Input['ResourceGroupRegionStatusArgs']]] region_statuses: The status of the resource group in all regions.
        :param pulumi.Input[_builtins.str] resource_group_name: The unique identifier of the resource group. The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.
        :param pulumi.Input[_builtins.str] status: The status of the resource group.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if name is not None:
            warnings.warn("""Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if region_statuses is not None:
            pulumi.set(__self__, "region_statuses", region_statuses)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Alibaba Cloud account to which the resource group belongs.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The display name of the resource group. The name must be 1 to 50 characters in length.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.""")
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="regionStatuses")
    def region_statuses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResourceGroupRegionStatusArgs']]]]:
        """
        The status of the resource group in all regions.
        """
        return pulumi.get(self, "region_statuses")

    @region_statuses.setter
    def region_statuses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceGroupRegionStatusArgs']]]]):
        pulumi.set(self, "region_statuses", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique identifier of the resource group. The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the resource group.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("alicloud:resourcemanager/resourceGroup:ResourceGroup")
class ResourceGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Provides a Resource Manager Resource Group resource. If you need to group cloud resources according to business departments, projects, and other dimensions, you can create resource groups.

        For information about Resource Manager Resource Group and how to use it, see [What is Resource Group](https://www.alibabacloud.com/help/en/resource-management/developer-reference/api-createresourcegroup).

        > **NOTE:** Available since v1.82.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tfexample"
        example = alicloud.resourcemanager.ResourceGroup("example",
            resource_group_name=name,
            display_name=name)
        ```

        ## Import

        Resource Manager Resource Group can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:resourcemanager/resourceGroup:ResourceGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] display_name: The display name of the resource group. The name must be 1 to 50 characters in length.
        :param pulumi.Input[_builtins.str] name: Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.
        :param pulumi.Input[_builtins.str] resource_group_name: The unique identifier of the resource group. The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Resource Manager Resource Group resource. If you need to group cloud resources according to business departments, projects, and other dimensions, you can create resource groups.

        For information about Resource Manager Resource Group and how to use it, see [What is Resource Group](https://www.alibabacloud.com/help/en/resource-management/developer-reference/api-createresourcegroup).

        > **NOTE:** Available since v1.82.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tfexample"
        example = alicloud.resourcemanager.ResourceGroup("example",
            resource_group_name=name,
            display_name=name)
        ```

        ## Import

        Resource Manager Resource Group can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:resourcemanager/resourceGroup:ResourceGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ResourceGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceGroupArgs.__new__(ResourceGroupArgs)

            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["name"] = name
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["account_id"] = None
            __props__.__dict__["region_statuses"] = None
            __props__.__dict__["status"] = None
        super(ResourceGroup, __self__).__init__(
            'alicloud:resourcemanager/resourceGroup:ResourceGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            region_statuses: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResourceGroupRegionStatusArgs', 'ResourceGroupRegionStatusArgsDict']]]]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'ResourceGroup':
        """
        Get an existing ResourceGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: The ID of the Alibaba Cloud account to which the resource group belongs.
        :param pulumi.Input[_builtins.str] display_name: The display name of the resource group. The name must be 1 to 50 characters in length.
        :param pulumi.Input[_builtins.str] name: Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ResourceGroupRegionStatusArgs', 'ResourceGroupRegionStatusArgsDict']]]] region_statuses: The status of the resource group in all regions.
        :param pulumi.Input[_builtins.str] resource_group_name: The unique identifier of the resource group. The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.
        :param pulumi.Input[_builtins.str] status: The status of the resource group.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceGroupState.__new__(_ResourceGroupState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["name"] = name
        __props__.__dict__["region_statuses"] = region_statuses
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        return ResourceGroup(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Alibaba Cloud account to which the resource group belongs.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        The display name of the resource group. The name must be 1 to 50 characters in length.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.""")
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Field `name` has been deprecated from provider version 1.114.0. New field `resource_group_name` instead.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="regionStatuses")
    def region_statuses(self) -> pulumi.Output[Sequence['outputs.ResourceGroupRegionStatus']]:
        """
        The status of the resource group in all regions.
        """
        return pulumi.get(self, "region_statuses")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The unique identifier of the resource group. The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the resource group.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

