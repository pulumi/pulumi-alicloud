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

__all__ = ['OrganizationArgs', 'Organization']

@pulumi.input_type
class OrganizationArgs:
    def __init__(__self__, *,
                 organization_name: pulumi.Input[_builtins.str],
                 source: pulumi.Input[_builtins.str],
                 desired_member_count: Optional[pulumi.Input[_builtins.int]] = None,
                 real_pk: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Organization resource.
        :param pulumi.Input[_builtins.str] organization_name: Company name.
        :param pulumi.Input[_builtins.str] source: This is organization source information
        :param pulumi.Input[_builtins.int] desired_member_count: The desired member count.
        :param pulumi.Input[_builtins.str] real_pk: User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        """
        pulumi.set(__self__, "organization_name", organization_name)
        pulumi.set(__self__, "source", source)
        if desired_member_count is not None:
            pulumi.set(__self__, "desired_member_count", desired_member_count)
        if real_pk is not None:
            pulumi.set(__self__, "real_pk", real_pk)

    @_builtins.property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> pulumi.Input[_builtins.str]:
        """
        Company name.
        """
        return pulumi.get(self, "organization_name")

    @organization_name.setter
    def organization_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "organization_name", value)

    @_builtins.property
    @pulumi.getter
    def source(self) -> pulumi.Input[_builtins.str]:
        """
        This is organization source information
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "source", value)

    @_builtins.property
    @pulumi.getter(name="desiredMemberCount")
    def desired_member_count(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The desired member count.
        """
        return pulumi.get(self, "desired_member_count")

    @desired_member_count.setter
    def desired_member_count(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "desired_member_count", value)

    @_builtins.property
    @pulumi.getter(name="realPk")
    def real_pk(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        """
        return pulumi.get(self, "real_pk")

    @real_pk.setter
    def real_pk(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "real_pk", value)


@pulumi.input_type
class _OrganizationState:
    def __init__(__self__, *,
                 desired_member_count: Optional[pulumi.Input[_builtins.int]] = None,
                 organization_name: Optional[pulumi.Input[_builtins.str]] = None,
                 real_pk: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Organization resources.
        :param pulumi.Input[_builtins.int] desired_member_count: The desired member count.
        :param pulumi.Input[_builtins.str] organization_name: Company name.
        :param pulumi.Input[_builtins.str] real_pk: User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        :param pulumi.Input[_builtins.str] source: This is organization source information
        """
        if desired_member_count is not None:
            pulumi.set(__self__, "desired_member_count", desired_member_count)
        if organization_name is not None:
            pulumi.set(__self__, "organization_name", organization_name)
        if real_pk is not None:
            pulumi.set(__self__, "real_pk", real_pk)
        if source is not None:
            pulumi.set(__self__, "source", source)

    @_builtins.property
    @pulumi.getter(name="desiredMemberCount")
    def desired_member_count(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The desired member count.
        """
        return pulumi.get(self, "desired_member_count")

    @desired_member_count.setter
    def desired_member_count(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "desired_member_count", value)

    @_builtins.property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Company name.
        """
        return pulumi.get(self, "organization_name")

    @organization_name.setter
    def organization_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "organization_name", value)

    @_builtins.property
    @pulumi.getter(name="realPk")
    def real_pk(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        """
        return pulumi.get(self, "real_pk")

    @real_pk.setter
    def real_pk(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "real_pk", value)

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        This is organization source information
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source", value)


@pulumi.type_token("alicloud:rdc/organization:Organization")
class Organization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 desired_member_count: Optional[pulumi.Input[_builtins.int]] = None,
                 organization_name: Optional[pulumi.Input[_builtins.str]] = None,
                 real_pk: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a RDC Organization resource.

        For information about RDC Organization and how to use it, see [What is Organization](https://www.alibabacloud.com/help/en/yunxiao/product-overview/what-is-cloud-effect).

        > **NOTE:** Available since v1.137.0.

        > **DEPRECATED:** This resource has been deprecated from version `1.238.0`.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.rdc.Organization("example",
            organization_name="example_value",
            source="example_value")
        ```

        ## Import

        RDC Organization can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:rdc/organization:Organization example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] desired_member_count: The desired member count.
        :param pulumi.Input[_builtins.str] organization_name: Company name.
        :param pulumi.Input[_builtins.str] real_pk: User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        :param pulumi.Input[_builtins.str] source: This is organization source information
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RDC Organization resource.

        For information about RDC Organization and how to use it, see [What is Organization](https://www.alibabacloud.com/help/en/yunxiao/product-overview/what-is-cloud-effect).

        > **NOTE:** Available since v1.137.0.

        > **DEPRECATED:** This resource has been deprecated from version `1.238.0`.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.rdc.Organization("example",
            organization_name="example_value",
            source="example_value")
        ```

        ## Import

        RDC Organization can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:rdc/organization:Organization example <id>
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 desired_member_count: Optional[pulumi.Input[_builtins.int]] = None,
                 organization_name: Optional[pulumi.Input[_builtins.str]] = None,
                 real_pk: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationArgs.__new__(OrganizationArgs)

            __props__.__dict__["desired_member_count"] = desired_member_count
            if organization_name is None and not opts.urn:
                raise TypeError("Missing required property 'organization_name'")
            __props__.__dict__["organization_name"] = organization_name
            __props__.__dict__["real_pk"] = real_pk
            if source is None and not opts.urn:
                raise TypeError("Missing required property 'source'")
            __props__.__dict__["source"] = source
        super(Organization, __self__).__init__(
            'alicloud:rdc/organization:Organization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            desired_member_count: Optional[pulumi.Input[_builtins.int]] = None,
            organization_name: Optional[pulumi.Input[_builtins.str]] = None,
            real_pk: Optional[pulumi.Input[_builtins.str]] = None,
            source: Optional[pulumi.Input[_builtins.str]] = None) -> 'Organization':
        """
        Get an existing Organization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] desired_member_count: The desired member count.
        :param pulumi.Input[_builtins.str] organization_name: Company name.
        :param pulumi.Input[_builtins.str] real_pk: User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        :param pulumi.Input[_builtins.str] source: This is organization source information
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationState.__new__(_OrganizationState)

        __props__.__dict__["desired_member_count"] = desired_member_count
        __props__.__dict__["organization_name"] = organization_name
        __props__.__dict__["real_pk"] = real_pk
        __props__.__dict__["source"] = source
        return Organization(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="desiredMemberCount")
    def desired_member_count(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The desired member count.
        """
        return pulumi.get(self, "desired_member_count")

    @_builtins.property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> pulumi.Output[_builtins.str]:
        """
        Company name.
        """
        return pulumi.get(self, "organization_name")

    @_builtins.property
    @pulumi.getter(name="realPk")
    def real_pk(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        """
        return pulumi.get(self, "real_pk")

    @_builtins.property
    @pulumi.getter
    def source(self) -> pulumi.Output[_builtins.str]:
        """
        This is organization source information
        """
        return pulumi.get(self, "source")

