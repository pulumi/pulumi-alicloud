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

__all__ = ['SiteArgs', 'Site']

@pulumi.input_type
class SiteArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 site_name: pulumi.Input[str],
                 access_type: Optional[pulumi.Input[str]] = None,
                 coverage: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Site resource.
        :param pulumi.Input[str] instance_id: The ID of the associated package instance.
        :param pulumi.Input[str] site_name: Site Name
        :param pulumi.Input[str] access_type: Site Access Type
        :param pulumi.Input[str] coverage: Acceleration area
        :param pulumi.Input[str] resource_group_id: The ID of the resource group
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Resource tags
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "site_name", site_name)
        if access_type is not None:
            pulumi.set(__self__, "access_type", access_type)
        if coverage is not None:
            pulumi.set(__self__, "coverage", coverage)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the associated package instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="siteName")
    def site_name(self) -> pulumi.Input[str]:
        """
        Site Name
        """
        return pulumi.get(self, "site_name")

    @site_name.setter
    def site_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "site_name", value)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> Optional[pulumi.Input[str]]:
        """
        Site Access Type
        """
        return pulumi.get(self, "access_type")

    @access_type.setter
    def access_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_type", value)

    @property
    @pulumi.getter
    def coverage(self) -> Optional[pulumi.Input[str]]:
        """
        Acceleration area
        """
        return pulumi.get(self, "coverage")

    @coverage.setter
    def coverage(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "coverage", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Resource tags
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _SiteState:
    def __init__(__self__, *,
                 access_type: Optional[pulumi.Input[str]] = None,
                 coverage: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 site_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Site resources.
        :param pulumi.Input[str] access_type: Site Access Type
        :param pulumi.Input[str] coverage: Acceleration area
        :param pulumi.Input[str] create_time: Creation time
        :param pulumi.Input[str] instance_id: The ID of the associated package instance.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group
        :param pulumi.Input[str] site_name: Site Name
        :param pulumi.Input[str] status: The status of the resource
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Resource tags
        """
        if access_type is not None:
            pulumi.set(__self__, "access_type", access_type)
        if coverage is not None:
            pulumi.set(__self__, "coverage", coverage)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if site_name is not None:
            pulumi.set(__self__, "site_name", site_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> Optional[pulumi.Input[str]]:
        """
        Site Access Type
        """
        return pulumi.get(self, "access_type")

    @access_type.setter
    def access_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_type", value)

    @property
    @pulumi.getter
    def coverage(self) -> Optional[pulumi.Input[str]]:
        """
        Acceleration area
        """
        return pulumi.get(self, "coverage")

    @coverage.setter
    def coverage(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "coverage", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Creation time
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the associated package instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="siteName")
    def site_name(self) -> Optional[pulumi.Input[str]]:
        """
        Site Name
        """
        return pulumi.get(self, "site_name")

    @site_name.setter
    def site_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "site_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Resource tags
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class Site(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_type: Optional[pulumi.Input[str]] = None,
                 coverage: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 site_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a ESA Site resource.

        For information about ESA Site and how to use it, see [What is Site](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.234.0.

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
        default = alicloud.resourcemanager.get_resource_groups()
        default_i_eo_df_u = alicloud.esa.RatePlanInstance("defaultIEoDfU",
            type="NS",
            auto_renew=True,
            period=1,
            payment_type="Subscription",
            coverage="overseas",
            auto_pay=True,
            plan_name="basic")
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default_site = alicloud.esa.Site("default",
            site_name=f"bcd{default_integer['result']}.com",
            coverage="overseas",
            access_type="NS",
            instance_id=default_i_eo_df_u.id,
            resource_group_id=default.ids[0])
        ```

        ## Import

        ESA Site can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:esa/site:Site example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_type: Site Access Type
        :param pulumi.Input[str] coverage: Acceleration area
        :param pulumi.Input[str] instance_id: The ID of the associated package instance.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group
        :param pulumi.Input[str] site_name: Site Name
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Resource tags
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SiteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ESA Site resource.

        For information about ESA Site and how to use it, see [What is Site](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.234.0.

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
        default = alicloud.resourcemanager.get_resource_groups()
        default_i_eo_df_u = alicloud.esa.RatePlanInstance("defaultIEoDfU",
            type="NS",
            auto_renew=True,
            period=1,
            payment_type="Subscription",
            coverage="overseas",
            auto_pay=True,
            plan_name="basic")
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default_site = alicloud.esa.Site("default",
            site_name=f"bcd{default_integer['result']}.com",
            coverage="overseas",
            access_type="NS",
            instance_id=default_i_eo_df_u.id,
            resource_group_id=default.ids[0])
        ```

        ## Import

        ESA Site can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:esa/site:Site example <id>
        ```

        :param str resource_name: The name of the resource.
        :param SiteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SiteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_type: Optional[pulumi.Input[str]] = None,
                 coverage: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 site_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SiteArgs.__new__(SiteArgs)

            __props__.__dict__["access_type"] = access_type
            __props__.__dict__["coverage"] = coverage
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["resource_group_id"] = resource_group_id
            if site_name is None and not opts.urn:
                raise TypeError("Missing required property 'site_name'")
            __props__.__dict__["site_name"] = site_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(Site, __self__).__init__(
            'alicloud:esa/site:Site',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_type: Optional[pulumi.Input[str]] = None,
            coverage: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            site_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Site':
        """
        Get an existing Site resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_type: Site Access Type
        :param pulumi.Input[str] coverage: Acceleration area
        :param pulumi.Input[str] create_time: Creation time
        :param pulumi.Input[str] instance_id: The ID of the associated package instance.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group
        :param pulumi.Input[str] site_name: Site Name
        :param pulumi.Input[str] status: The status of the resource
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Resource tags
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SiteState.__new__(_SiteState)

        __props__.__dict__["access_type"] = access_type
        __props__.__dict__["coverage"] = coverage
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["site_name"] = site_name
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        return Site(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> pulumi.Output[Optional[str]]:
        """
        Site Access Type
        """
        return pulumi.get(self, "access_type")

    @property
    @pulumi.getter
    def coverage(self) -> pulumi.Output[Optional[str]]:
        """
        Acceleration area
        """
        return pulumi.get(self, "coverage")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Creation time
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the associated package instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="siteName")
    def site_name(self) -> pulumi.Output[str]:
        """
        Site Name
        """
        return pulumi.get(self, "site_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Resource tags
        """
        return pulumi.get(self, "tags")

