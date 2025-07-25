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

__all__ = ['TransitRouterRouteTableArgs', 'TransitRouterRouteTable']

@pulumi.input_type
class TransitRouterRouteTableArgs:
    def __init__(__self__, *,
                 transit_router_id: pulumi.Input[_builtins.str],
                 dry_run: Optional[pulumi.Input[_builtins.bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 transit_router_route_table_description: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a TransitRouterRouteTable resource.
        :param pulumi.Input[_builtins.str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[_builtins.bool] dry_run: The dry run.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] transit_router_route_table_description: The description of the transit router route table.
        :param pulumi.Input[_builtins.str] transit_router_route_table_name: The name of the transit router route table.
        """
        pulumi.set(__self__, "transit_router_id", transit_router_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transit_router_route_table_description is not None:
            pulumi.set(__self__, "transit_router_route_table_description", transit_router_route_table_description)
        if transit_router_route_table_name is not None:
            pulumi.set(__self__, "transit_router_route_table_name", transit_router_route_table_name)

    @_builtins.property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "transit_router_id", value)

    @_builtins.property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "dry_run", value)

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

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableDescription")
    def transit_router_route_table_description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_description")

    @transit_router_route_table_description.setter
    def transit_router_route_table_description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_route_table_description", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableName")
    def transit_router_route_table_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_name")

    @transit_router_route_table_name.setter
    def transit_router_route_table_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_route_table_name", value)


@pulumi.input_type
class _TransitRouterRouteTableState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[_builtins.bool]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 transit_router_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_description: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_name: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TransitRouterRouteTable resources.
        :param pulumi.Input[_builtins.bool] dry_run: The dry run.
        :param pulumi.Input[_builtins.str] status: The associating status of the Transit Router.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[_builtins.str] transit_router_route_table_description: The description of the transit router route table.
        :param pulumi.Input[_builtins.str] transit_router_route_table_id: The id of the transit router route table.
        :param pulumi.Input[_builtins.str] transit_router_route_table_name: The name of the transit router route table.
        :param pulumi.Input[_builtins.str] transit_router_route_table_type: The type of the transit router route table. Valid values: `Custom`, `System`.
        """
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transit_router_id is not None:
            pulumi.set(__self__, "transit_router_id", transit_router_id)
        if transit_router_route_table_description is not None:
            pulumi.set(__self__, "transit_router_route_table_description", transit_router_route_table_description)
        if transit_router_route_table_id is not None:
            pulumi.set(__self__, "transit_router_route_table_id", transit_router_route_table_id)
        if transit_router_route_table_name is not None:
            pulumi.set(__self__, "transit_router_route_table_name", transit_router_route_table_name)
        if transit_router_route_table_type is not None:
            pulumi.set(__self__, "transit_router_route_table_type", transit_router_route_table_type)

    @_builtins.property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "dry_run", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The associating status of the Transit Router.
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

    @_builtins.property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_id", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableDescription")
    def transit_router_route_table_description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_description")

    @transit_router_route_table_description.setter
    def transit_router_route_table_description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_route_table_description", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableId")
    def transit_router_route_table_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_id")

    @transit_router_route_table_id.setter
    def transit_router_route_table_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_route_table_id", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableName")
    def transit_router_route_table_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_name")

    @transit_router_route_table_name.setter
    def transit_router_route_table_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_route_table_name", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableType")
    def transit_router_route_table_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the transit router route table. Valid values: `Custom`, `System`.
        """
        return pulumi.get(self, "transit_router_route_table_type")

    @transit_router_route_table_type.setter
    def transit_router_route_table_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_route_table_type", value)


@pulumi.type_token("alicloud:cen/transitRouterRouteTable:TransitRouterRouteTable")
class TransitRouterRouteTable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[_builtins.bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 transit_router_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_description: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a CEN transit router route table resource.[What is Cen Transit Router Route Table](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitrouterroutetable)

        > **NOTE:** Available since v1.126.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.cen.Instance("example",
            cen_instance_name="tf_example",
            description="an example for cen")
        example_transit_router = alicloud.cen.TransitRouter("example",
            transit_router_name="tf_example",
            cen_id=example.id)
        example_transit_router_route_table = alicloud.cen.TransitRouterRouteTable("example", transit_router_id=example_transit_router.transit_router_id)
        ```

        ## Import

        CEN transit router route table  can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cen/transitRouterRouteTable:TransitRouterRouteTable default tr-*********:vtb-********
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] dry_run: The dry run.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[_builtins.str] transit_router_route_table_description: The description of the transit router route table.
        :param pulumi.Input[_builtins.str] transit_router_route_table_name: The name of the transit router route table.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitRouterRouteTableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN transit router route table resource.[What is Cen Transit Router Route Table](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitrouterroutetable)

        > **NOTE:** Available since v1.126.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.cen.Instance("example",
            cen_instance_name="tf_example",
            description="an example for cen")
        example_transit_router = alicloud.cen.TransitRouter("example",
            transit_router_name="tf_example",
            cen_id=example.id)
        example_transit_router_route_table = alicloud.cen.TransitRouterRouteTable("example", transit_router_id=example_transit_router.transit_router_id)
        ```

        ## Import

        CEN transit router route table  can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cen/transitRouterRouteTable:TransitRouterRouteTable default tr-*********:vtb-********
        ```

        :param str resource_name: The name of the resource.
        :param TransitRouterRouteTableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitRouterRouteTableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[_builtins.bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 transit_router_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_description: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_route_table_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterRouteTableArgs.__new__(TransitRouterRouteTableArgs)

            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["tags"] = tags
            if transit_router_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_id'")
            __props__.__dict__["transit_router_id"] = transit_router_id
            __props__.__dict__["transit_router_route_table_description"] = transit_router_route_table_description
            __props__.__dict__["transit_router_route_table_name"] = transit_router_route_table_name
            __props__.__dict__["status"] = None
            __props__.__dict__["transit_router_route_table_id"] = None
            __props__.__dict__["transit_router_route_table_type"] = None
        super(TransitRouterRouteTable, __self__).__init__(
            'alicloud:cen/transitRouterRouteTable:TransitRouterRouteTable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[_builtins.bool]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            transit_router_id: Optional[pulumi.Input[_builtins.str]] = None,
            transit_router_route_table_description: Optional[pulumi.Input[_builtins.str]] = None,
            transit_router_route_table_id: Optional[pulumi.Input[_builtins.str]] = None,
            transit_router_route_table_name: Optional[pulumi.Input[_builtins.str]] = None,
            transit_router_route_table_type: Optional[pulumi.Input[_builtins.str]] = None) -> 'TransitRouterRouteTable':
        """
        Get an existing TransitRouterRouteTable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] dry_run: The dry run.
        :param pulumi.Input[_builtins.str] status: The associating status of the Transit Router.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[_builtins.str] transit_router_route_table_description: The description of the transit router route table.
        :param pulumi.Input[_builtins.str] transit_router_route_table_id: The id of the transit router route table.
        :param pulumi.Input[_builtins.str] transit_router_route_table_name: The name of the transit router route table.
        :param pulumi.Input[_builtins.str] transit_router_route_table_type: The type of the transit router route table. Valid values: `Custom`, `System`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterRouteTableState.__new__(_TransitRouterRouteTableState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["transit_router_id"] = transit_router_id
        __props__.__dict__["transit_router_route_table_description"] = transit_router_route_table_description
        __props__.__dict__["transit_router_route_table_id"] = transit_router_route_table_id
        __props__.__dict__["transit_router_route_table_name"] = transit_router_route_table_name
        __props__.__dict__["transit_router_route_table_type"] = transit_router_route_table_type
        return TransitRouterRouteTable(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The associating status of the Transit Router.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableDescription")
    def transit_router_route_table_description(self) -> pulumi.Output[_builtins.str]:
        """
        The description of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_description")

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableId")
    def transit_router_route_table_id(self) -> pulumi.Output[_builtins.str]:
        """
        The id of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_id")

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableName")
    def transit_router_route_table_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_name")

    @_builtins.property
    @pulumi.getter(name="transitRouterRouteTableType")
    def transit_router_route_table_type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of the transit router route table. Valid values: `Custom`, `System`.
        """
        return pulumi.get(self, "transit_router_route_table_type")

