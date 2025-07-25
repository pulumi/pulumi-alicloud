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

__all__ = ['IpamIpamPoolAllocationArgs', 'IpamIpamPoolAllocation']

@pulumi.input_type
class IpamIpamPoolAllocationArgs:
    def __init__(__self__, *,
                 ipam_pool_id: pulumi.Input[_builtins.str],
                 cidr: Optional[pulumi.Input[_builtins.str]] = None,
                 cidr_mask: Optional[pulumi.Input[_builtins.int]] = None,
                 ipam_pool_allocation_description: Optional[pulumi.Input[_builtins.str]] = None,
                 ipam_pool_allocation_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a IpamIpamPoolAllocation resource.
        :param pulumi.Input[_builtins.str] ipam_pool_id: The ID of the IPAM Pool.
        :param pulumi.Input[_builtins.str] cidr: The allocated address segment.
        :param pulumi.Input[_builtins.int] cidr_mask: Create a custom reserved network segment from The IPAM address pool by entering a mask.
               
               > **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        :param pulumi.Input[_builtins.str] ipam_pool_allocation_description: The description of the ipam pool alloctaion.
               It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        :param pulumi.Input[_builtins.str] ipam_pool_allocation_name: The name of the ipam pool allocation.
               It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        """
        pulumi.set(__self__, "ipam_pool_id", ipam_pool_id)
        if cidr is not None:
            pulumi.set(__self__, "cidr", cidr)
        if cidr_mask is not None:
            pulumi.set(__self__, "cidr_mask", cidr_mask)
        if ipam_pool_allocation_description is not None:
            pulumi.set(__self__, "ipam_pool_allocation_description", ipam_pool_allocation_description)
        if ipam_pool_allocation_name is not None:
            pulumi.set(__self__, "ipam_pool_allocation_name", ipam_pool_allocation_name)

    @_builtins.property
    @pulumi.getter(name="ipamPoolId")
    def ipam_pool_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the IPAM Pool.
        """
        return pulumi.get(self, "ipam_pool_id")

    @ipam_pool_id.setter
    def ipam_pool_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "ipam_pool_id", value)

    @_builtins.property
    @pulumi.getter
    def cidr(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The allocated address segment.
        """
        return pulumi.get(self, "cidr")

    @cidr.setter
    def cidr(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cidr", value)

    @_builtins.property
    @pulumi.getter(name="cidrMask")
    def cidr_mask(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Create a custom reserved network segment from The IPAM address pool by entering a mask.

        > **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        """
        return pulumi.get(self, "cidr_mask")

    @cidr_mask.setter
    def cidr_mask(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "cidr_mask", value)

    @_builtins.property
    @pulumi.getter(name="ipamPoolAllocationDescription")
    def ipam_pool_allocation_description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the ipam pool alloctaion.
        It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        """
        return pulumi.get(self, "ipam_pool_allocation_description")

    @ipam_pool_allocation_description.setter
    def ipam_pool_allocation_description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipam_pool_allocation_description", value)

    @_builtins.property
    @pulumi.getter(name="ipamPoolAllocationName")
    def ipam_pool_allocation_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the ipam pool allocation.
        It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "ipam_pool_allocation_name")

    @ipam_pool_allocation_name.setter
    def ipam_pool_allocation_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipam_pool_allocation_name", value)


@pulumi.input_type
class _IpamIpamPoolAllocationState:
    def __init__(__self__, *,
                 cidr: Optional[pulumi.Input[_builtins.str]] = None,
                 cidr_mask: Optional[pulumi.Input[_builtins.int]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 ipam_pool_allocation_description: Optional[pulumi.Input[_builtins.str]] = None,
                 ipam_pool_allocation_name: Optional[pulumi.Input[_builtins.str]] = None,
                 ipam_pool_id: Optional[pulumi.Input[_builtins.str]] = None,
                 region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering IpamIpamPoolAllocation resources.
        :param pulumi.Input[_builtins.str] cidr: The allocated address segment.
        :param pulumi.Input[_builtins.int] cidr_mask: Create a custom reserved network segment from The IPAM address pool by entering a mask.
               
               > **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        :param pulumi.Input[_builtins.str] create_time: Instance creation time.
        :param pulumi.Input[_builtins.str] ipam_pool_allocation_description: The description of the ipam pool alloctaion.
               It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        :param pulumi.Input[_builtins.str] ipam_pool_allocation_name: The name of the ipam pool allocation.
               It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] ipam_pool_id: The ID of the IPAM Pool.
        :param pulumi.Input[_builtins.str] region_id: When the IPAM Pool to which CIDR is allocated has the region attribute, this attribute is the IPAM Pool region.
               When the IPAM Pool to which CIDR is allocated does not have the region attribute, this attribute is the IPAM region.
        :param pulumi.Input[_builtins.str] status: The status of the instance. Value:
        """
        if cidr is not None:
            pulumi.set(__self__, "cidr", cidr)
        if cidr_mask is not None:
            pulumi.set(__self__, "cidr_mask", cidr_mask)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if ipam_pool_allocation_description is not None:
            pulumi.set(__self__, "ipam_pool_allocation_description", ipam_pool_allocation_description)
        if ipam_pool_allocation_name is not None:
            pulumi.set(__self__, "ipam_pool_allocation_name", ipam_pool_allocation_name)
        if ipam_pool_id is not None:
            pulumi.set(__self__, "ipam_pool_id", ipam_pool_id)
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def cidr(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The allocated address segment.
        """
        return pulumi.get(self, "cidr")

    @cidr.setter
    def cidr(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cidr", value)

    @_builtins.property
    @pulumi.getter(name="cidrMask")
    def cidr_mask(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Create a custom reserved network segment from The IPAM address pool by entering a mask.

        > **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        """
        return pulumi.get(self, "cidr_mask")

    @cidr_mask.setter
    def cidr_mask(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "cidr_mask", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Instance creation time.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="ipamPoolAllocationDescription")
    def ipam_pool_allocation_description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the ipam pool alloctaion.
        It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        """
        return pulumi.get(self, "ipam_pool_allocation_description")

    @ipam_pool_allocation_description.setter
    def ipam_pool_allocation_description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipam_pool_allocation_description", value)

    @_builtins.property
    @pulumi.getter(name="ipamPoolAllocationName")
    def ipam_pool_allocation_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the ipam pool allocation.
        It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "ipam_pool_allocation_name")

    @ipam_pool_allocation_name.setter
    def ipam_pool_allocation_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipam_pool_allocation_name", value)

    @_builtins.property
    @pulumi.getter(name="ipamPoolId")
    def ipam_pool_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the IPAM Pool.
        """
        return pulumi.get(self, "ipam_pool_id")

    @ipam_pool_id.setter
    def ipam_pool_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipam_pool_id", value)

    @_builtins.property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        When the IPAM Pool to which CIDR is allocated has the region attribute, this attribute is the IPAM Pool region.
        When the IPAM Pool to which CIDR is allocated does not have the region attribute, this attribute is the IPAM region.
        """
        return pulumi.get(self, "region_id")

    @region_id.setter
    def region_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the instance. Value:
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:vpc/ipamIpamPoolAllocation:IpamIpamPoolAllocation")
class IpamIpamPoolAllocation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr: Optional[pulumi.Input[_builtins.str]] = None,
                 cidr_mask: Optional[pulumi.Input[_builtins.int]] = None,
                 ipam_pool_allocation_description: Optional[pulumi.Input[_builtins.str]] = None,
                 ipam_pool_allocation_name: Optional[pulumi.Input[_builtins.str]] = None,
                 ipam_pool_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Vpc Ipam Ipam Pool Allocation resource.

        Allocates or reserves a CIDR from an IPAM address pool.

        For information about Vpc Ipam Ipam Pool Allocation and how to use it, see [What is Ipam Pool Allocation](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamPoolAllocation).

        > **NOTE:** Available since v1.238.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_ipam = alicloud.vpc.IpamIpam("defaultIpam", operating_region_lists=["cn-hangzhou"])
        default_ipam_pool = alicloud.vpc.IpamIpamPool("defaultIpamPool",
            ipam_scope_id=default_ipam.private_default_scope_id,
            pool_region_id="cn-hangzhou")
        default_ipam_pool_cidr = alicloud.vpc.IpamIpamPoolCidr("defaultIpamPoolCidr",
            cidr="10.0.0.0/8",
            ipam_pool_id=default_ipam_pool.id)
        default = alicloud.vpc.IpamIpamPoolAllocation("default",
            ipam_pool_allocation_description="init alloc desc",
            ipam_pool_allocation_name=name,
            cidr="10.0.0.0/20",
            ipam_pool_id=default_ipam_pool_cidr.ipam_pool_id)
        ```

        ## Import

        Vpc Ipam Ipam Pool Allocation can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:vpc/ipamIpamPoolAllocation:IpamIpamPoolAllocation example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cidr: The allocated address segment.
        :param pulumi.Input[_builtins.int] cidr_mask: Create a custom reserved network segment from The IPAM address pool by entering a mask.
               
               > **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        :param pulumi.Input[_builtins.str] ipam_pool_allocation_description: The description of the ipam pool alloctaion.
               It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        :param pulumi.Input[_builtins.str] ipam_pool_allocation_name: The name of the ipam pool allocation.
               It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] ipam_pool_id: The ID of the IPAM Pool.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IpamIpamPoolAllocationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Vpc Ipam Ipam Pool Allocation resource.

        Allocates or reserves a CIDR from an IPAM address pool.

        For information about Vpc Ipam Ipam Pool Allocation and how to use it, see [What is Ipam Pool Allocation](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamPoolAllocation).

        > **NOTE:** Available since v1.238.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_ipam = alicloud.vpc.IpamIpam("defaultIpam", operating_region_lists=["cn-hangzhou"])
        default_ipam_pool = alicloud.vpc.IpamIpamPool("defaultIpamPool",
            ipam_scope_id=default_ipam.private_default_scope_id,
            pool_region_id="cn-hangzhou")
        default_ipam_pool_cidr = alicloud.vpc.IpamIpamPoolCidr("defaultIpamPoolCidr",
            cidr="10.0.0.0/8",
            ipam_pool_id=default_ipam_pool.id)
        default = alicloud.vpc.IpamIpamPoolAllocation("default",
            ipam_pool_allocation_description="init alloc desc",
            ipam_pool_allocation_name=name,
            cidr="10.0.0.0/20",
            ipam_pool_id=default_ipam_pool_cidr.ipam_pool_id)
        ```

        ## Import

        Vpc Ipam Ipam Pool Allocation can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:vpc/ipamIpamPoolAllocation:IpamIpamPoolAllocation example <id>
        ```

        :param str resource_name: The name of the resource.
        :param IpamIpamPoolAllocationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IpamIpamPoolAllocationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr: Optional[pulumi.Input[_builtins.str]] = None,
                 cidr_mask: Optional[pulumi.Input[_builtins.int]] = None,
                 ipam_pool_allocation_description: Optional[pulumi.Input[_builtins.str]] = None,
                 ipam_pool_allocation_name: Optional[pulumi.Input[_builtins.str]] = None,
                 ipam_pool_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IpamIpamPoolAllocationArgs.__new__(IpamIpamPoolAllocationArgs)

            __props__.__dict__["cidr"] = cidr
            __props__.__dict__["cidr_mask"] = cidr_mask
            __props__.__dict__["ipam_pool_allocation_description"] = ipam_pool_allocation_description
            __props__.__dict__["ipam_pool_allocation_name"] = ipam_pool_allocation_name
            if ipam_pool_id is None and not opts.urn:
                raise TypeError("Missing required property 'ipam_pool_id'")
            __props__.__dict__["ipam_pool_id"] = ipam_pool_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["region_id"] = None
            __props__.__dict__["status"] = None
        super(IpamIpamPoolAllocation, __self__).__init__(
            'alicloud:vpc/ipamIpamPoolAllocation:IpamIpamPoolAllocation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cidr: Optional[pulumi.Input[_builtins.str]] = None,
            cidr_mask: Optional[pulumi.Input[_builtins.int]] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            ipam_pool_allocation_description: Optional[pulumi.Input[_builtins.str]] = None,
            ipam_pool_allocation_name: Optional[pulumi.Input[_builtins.str]] = None,
            ipam_pool_id: Optional[pulumi.Input[_builtins.str]] = None,
            region_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'IpamIpamPoolAllocation':
        """
        Get an existing IpamIpamPoolAllocation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cidr: The allocated address segment.
        :param pulumi.Input[_builtins.int] cidr_mask: Create a custom reserved network segment from The IPAM address pool by entering a mask.
               
               > **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        :param pulumi.Input[_builtins.str] create_time: Instance creation time.
        :param pulumi.Input[_builtins.str] ipam_pool_allocation_description: The description of the ipam pool alloctaion.
               It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        :param pulumi.Input[_builtins.str] ipam_pool_allocation_name: The name of the ipam pool allocation.
               It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] ipam_pool_id: The ID of the IPAM Pool.
        :param pulumi.Input[_builtins.str] region_id: When the IPAM Pool to which CIDR is allocated has the region attribute, this attribute is the IPAM Pool region.
               When the IPAM Pool to which CIDR is allocated does not have the region attribute, this attribute is the IPAM region.
        :param pulumi.Input[_builtins.str] status: The status of the instance. Value:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IpamIpamPoolAllocationState.__new__(_IpamIpamPoolAllocationState)

        __props__.__dict__["cidr"] = cidr
        __props__.__dict__["cidr_mask"] = cidr_mask
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["ipam_pool_allocation_description"] = ipam_pool_allocation_description
        __props__.__dict__["ipam_pool_allocation_name"] = ipam_pool_allocation_name
        __props__.__dict__["ipam_pool_id"] = ipam_pool_id
        __props__.__dict__["region_id"] = region_id
        __props__.__dict__["status"] = status
        return IpamIpamPoolAllocation(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def cidr(self) -> pulumi.Output[_builtins.str]:
        """
        The allocated address segment.
        """
        return pulumi.get(self, "cidr")

    @_builtins.property
    @pulumi.getter(name="cidrMask")
    def cidr_mask(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Create a custom reserved network segment from The IPAM address pool by entering a mask.

        > **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        """
        return pulumi.get(self, "cidr_mask")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Instance creation time.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="ipamPoolAllocationDescription")
    def ipam_pool_allocation_description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the ipam pool alloctaion.
        It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        """
        return pulumi.get(self, "ipam_pool_allocation_description")

    @_builtins.property
    @pulumi.getter(name="ipamPoolAllocationName")
    def ipam_pool_allocation_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the ipam pool allocation.
        It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "ipam_pool_allocation_name")

    @_builtins.property
    @pulumi.getter(name="ipamPoolId")
    def ipam_pool_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the IPAM Pool.
        """
        return pulumi.get(self, "ipam_pool_id")

    @_builtins.property
    @pulumi.getter(name="regionId")
    def region_id(self) -> pulumi.Output[_builtins.str]:
        """
        When the IPAM Pool to which CIDR is allocated has the region attribute, this attribute is the IPAM Pool region.
        When the IPAM Pool to which CIDR is allocated does not have the region attribute, this attribute is the IPAM region.
        """
        return pulumi.get(self, "region_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the instance. Value:
        """
        return pulumi.get(self, "status")

