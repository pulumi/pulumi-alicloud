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

__all__ = ['IpamIpamScopeArgs', 'IpamIpamScope']

@pulumi.input_type
class IpamIpamScopeArgs:
    def __init__(__self__, *,
                 ipam_id: pulumi.Input[str],
                 ipam_scope_description: Optional[pulumi.Input[str]] = None,
                 ipam_scope_name: Optional[pulumi.Input[str]] = None,
                 ipam_scope_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a IpamIpamScope resource.
        :param pulumi.Input[str] ipam_id: The id of the Ipam instance.
        :param pulumi.Input[str] ipam_scope_description: The description of the IPAM's scope of action.
               
               It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        :param pulumi.Input[str] ipam_scope_name: The name of the resource.
        :param pulumi.Input[str] ipam_scope_type: IPAM scope of action type:
               `private`.
               
               
               > **NOTE:**  Currently, only the role scope of the private network is supported.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: The tag of the resource.
        """
        pulumi.set(__self__, "ipam_id", ipam_id)
        if ipam_scope_description is not None:
            pulumi.set(__self__, "ipam_scope_description", ipam_scope_description)
        if ipam_scope_name is not None:
            pulumi.set(__self__, "ipam_scope_name", ipam_scope_name)
        if ipam_scope_type is not None:
            pulumi.set(__self__, "ipam_scope_type", ipam_scope_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="ipamId")
    def ipam_id(self) -> pulumi.Input[str]:
        """
        The id of the Ipam instance.
        """
        return pulumi.get(self, "ipam_id")

    @ipam_id.setter
    def ipam_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "ipam_id", value)

    @property
    @pulumi.getter(name="ipamScopeDescription")
    def ipam_scope_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the IPAM's scope of action.

        It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        """
        return pulumi.get(self, "ipam_scope_description")

    @ipam_scope_description.setter
    def ipam_scope_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_scope_description", value)

    @property
    @pulumi.getter(name="ipamScopeName")
    def ipam_scope_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "ipam_scope_name")

    @ipam_scope_name.setter
    def ipam_scope_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_scope_name", value)

    @property
    @pulumi.getter(name="ipamScopeType")
    def ipam_scope_type(self) -> Optional[pulumi.Input[str]]:
        """
        IPAM scope of action type:
        `private`.


        > **NOTE:**  Currently, only the role scope of the private network is supported.
        """
        return pulumi.get(self, "ipam_scope_type")

    @ipam_scope_type.setter
    def ipam_scope_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_scope_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _IpamIpamScopeState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 ipam_id: Optional[pulumi.Input[str]] = None,
                 ipam_scope_description: Optional[pulumi.Input[str]] = None,
                 ipam_scope_name: Optional[pulumi.Input[str]] = None,
                 ipam_scope_type: Optional[pulumi.Input[str]] = None,
                 region_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering IpamIpamScope resources.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] ipam_id: The id of the Ipam instance.
        :param pulumi.Input[str] ipam_scope_description: The description of the IPAM's scope of action.
               
               It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        :param pulumi.Input[str] ipam_scope_name: The name of the resource.
        :param pulumi.Input[str] ipam_scope_type: IPAM scope of action type:
               `private`.
               
               
               > **NOTE:**  Currently, only the role scope of the private network is supported.
        :param pulumi.Input[str] region_id: The region ID of the resource.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: The tag of the resource.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if ipam_id is not None:
            pulumi.set(__self__, "ipam_id", ipam_id)
        if ipam_scope_description is not None:
            pulumi.set(__self__, "ipam_scope_description", ipam_scope_description)
        if ipam_scope_name is not None:
            pulumi.set(__self__, "ipam_scope_name", ipam_scope_name)
        if ipam_scope_type is not None:
            pulumi.set(__self__, "ipam_scope_type", ipam_scope_type)
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="ipamId")
    def ipam_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the Ipam instance.
        """
        return pulumi.get(self, "ipam_id")

    @ipam_id.setter
    def ipam_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_id", value)

    @property
    @pulumi.getter(name="ipamScopeDescription")
    def ipam_scope_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the IPAM's scope of action.

        It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        """
        return pulumi.get(self, "ipam_scope_description")

    @ipam_scope_description.setter
    def ipam_scope_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_scope_description", value)

    @property
    @pulumi.getter(name="ipamScopeName")
    def ipam_scope_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "ipam_scope_name")

    @ipam_scope_name.setter
    def ipam_scope_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_scope_name", value)

    @property
    @pulumi.getter(name="ipamScopeType")
    def ipam_scope_type(self) -> Optional[pulumi.Input[str]]:
        """
        IPAM scope of action type:
        `private`.


        > **NOTE:**  Currently, only the role scope of the private network is supported.
        """
        return pulumi.get(self, "ipam_scope_type")

    @ipam_scope_type.setter
    def ipam_scope_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_scope_type", value)

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[pulumi.Input[str]]:
        """
        The region ID of the resource.
        """
        return pulumi.get(self, "region_id")

    @region_id.setter
    def region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class IpamIpamScope(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ipam_id: Optional[pulumi.Input[str]] = None,
                 ipam_scope_description: Optional[pulumi.Input[str]] = None,
                 ipam_scope_name: Optional[pulumi.Input[str]] = None,
                 ipam_scope_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Vpc Ipam Ipam Scope resource.

        IP Address Management Scope.

        For information about Vpc Ipam Ipam Scope and how to use it, see [What is Ipam Scope](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.234.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_ipam = alicloud.vpc.IpamIpam("defaultIpam",
            operating_region_lists=["cn-hangzhou"],
            ipam_name=name)
        default = alicloud.vpc.IpamIpamScope("default",
            ipam_scope_name=name,
            ipam_id=default_ipam.id,
            ipam_scope_description="This is a ipam scope.",
            ipam_scope_type="private")
        ```

        ## Import

        Vpc Ipam Ipam Scope can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:vpc/ipamIpamScope:IpamIpamScope example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ipam_id: The id of the Ipam instance.
        :param pulumi.Input[str] ipam_scope_description: The description of the IPAM's scope of action.
               
               It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        :param pulumi.Input[str] ipam_scope_name: The name of the resource.
        :param pulumi.Input[str] ipam_scope_type: IPAM scope of action type:
               `private`.
               
               
               > **NOTE:**  Currently, only the role scope of the private network is supported.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: The tag of the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IpamIpamScopeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Vpc Ipam Ipam Scope resource.

        IP Address Management Scope.

        For information about Vpc Ipam Ipam Scope and how to use it, see [What is Ipam Scope](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.234.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_ipam = alicloud.vpc.IpamIpam("defaultIpam",
            operating_region_lists=["cn-hangzhou"],
            ipam_name=name)
        default = alicloud.vpc.IpamIpamScope("default",
            ipam_scope_name=name,
            ipam_id=default_ipam.id,
            ipam_scope_description="This is a ipam scope.",
            ipam_scope_type="private")
        ```

        ## Import

        Vpc Ipam Ipam Scope can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:vpc/ipamIpamScope:IpamIpamScope example <id>
        ```

        :param str resource_name: The name of the resource.
        :param IpamIpamScopeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IpamIpamScopeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ipam_id: Optional[pulumi.Input[str]] = None,
                 ipam_scope_description: Optional[pulumi.Input[str]] = None,
                 ipam_scope_name: Optional[pulumi.Input[str]] = None,
                 ipam_scope_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IpamIpamScopeArgs.__new__(IpamIpamScopeArgs)

            if ipam_id is None and not opts.urn:
                raise TypeError("Missing required property 'ipam_id'")
            __props__.__dict__["ipam_id"] = ipam_id
            __props__.__dict__["ipam_scope_description"] = ipam_scope_description
            __props__.__dict__["ipam_scope_name"] = ipam_scope_name
            __props__.__dict__["ipam_scope_type"] = ipam_scope_type
            __props__.__dict__["tags"] = tags
            __props__.__dict__["create_time"] = None
            __props__.__dict__["region_id"] = None
            __props__.__dict__["status"] = None
        super(IpamIpamScope, __self__).__init__(
            'alicloud:vpc/ipamIpamScope:IpamIpamScope',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            ipam_id: Optional[pulumi.Input[str]] = None,
            ipam_scope_description: Optional[pulumi.Input[str]] = None,
            ipam_scope_name: Optional[pulumi.Input[str]] = None,
            ipam_scope_type: Optional[pulumi.Input[str]] = None,
            region_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'IpamIpamScope':
        """
        Get an existing IpamIpamScope resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] ipam_id: The id of the Ipam instance.
        :param pulumi.Input[str] ipam_scope_description: The description of the IPAM's scope of action.
               
               It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        :param pulumi.Input[str] ipam_scope_name: The name of the resource.
        :param pulumi.Input[str] ipam_scope_type: IPAM scope of action type:
               `private`.
               
               
               > **NOTE:**  Currently, only the role scope of the private network is supported.
        :param pulumi.Input[str] region_id: The region ID of the resource.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: The tag of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IpamIpamScopeState.__new__(_IpamIpamScopeState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["ipam_id"] = ipam_id
        __props__.__dict__["ipam_scope_description"] = ipam_scope_description
        __props__.__dict__["ipam_scope_name"] = ipam_scope_name
        __props__.__dict__["ipam_scope_type"] = ipam_scope_type
        __props__.__dict__["region_id"] = region_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        return IpamIpamScope(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="ipamId")
    def ipam_id(self) -> pulumi.Output[str]:
        """
        The id of the Ipam instance.
        """
        return pulumi.get(self, "ipam_id")

    @property
    @pulumi.getter(name="ipamScopeDescription")
    def ipam_scope_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the IPAM's scope of action.

        It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        """
        return pulumi.get(self, "ipam_scope_description")

    @property
    @pulumi.getter(name="ipamScopeName")
    def ipam_scope_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "ipam_scope_name")

    @property
    @pulumi.getter(name="ipamScopeType")
    def ipam_scope_type(self) -> pulumi.Output[Optional[str]]:
        """
        IPAM scope of action type:
        `private`.


        > **NOTE:**  Currently, only the role scope of the private network is supported.
        """
        return pulumi.get(self, "ipam_scope_type")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> pulumi.Output[str]:
        """
        The region ID of the resource.
        """
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")
