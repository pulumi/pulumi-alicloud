# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
from . import outputs

__all__ = [
    'GetTransitRouterRouteTablesResult',
    'AwaitableGetTransitRouterRouteTablesResult',
    'get_transit_router_route_tables',
    'get_transit_router_route_tables_output',
]

@pulumi.output_type
class GetTransitRouterRouteTablesResult:
    """
    A collection of values returned by getTransitRouterRouteTables.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, tables=None, transit_router_id=None, transit_router_route_table_ids=None, transit_router_route_table_names=None, transit_router_route_table_status=None, transit_router_route_table_type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tables and not isinstance(tables, list):
            raise TypeError("Expected argument 'tables' to be a list")
        pulumi.set(__self__, "tables", tables)
        if transit_router_id and not isinstance(transit_router_id, str):
            raise TypeError("Expected argument 'transit_router_id' to be a str")
        pulumi.set(__self__, "transit_router_id", transit_router_id)
        if transit_router_route_table_ids and not isinstance(transit_router_route_table_ids, list):
            raise TypeError("Expected argument 'transit_router_route_table_ids' to be a list")
        pulumi.set(__self__, "transit_router_route_table_ids", transit_router_route_table_ids)
        if transit_router_route_table_names and not isinstance(transit_router_route_table_names, list):
            raise TypeError("Expected argument 'transit_router_route_table_names' to be a list")
        pulumi.set(__self__, "transit_router_route_table_names", transit_router_route_table_names)
        if transit_router_route_table_status and not isinstance(transit_router_route_table_status, str):
            raise TypeError("Expected argument 'transit_router_route_table_status' to be a str")
        pulumi.set(__self__, "transit_router_route_table_status", transit_router_route_table_status)
        if transit_router_route_table_type and not isinstance(transit_router_route_table_type, str):
            raise TypeError("Expected argument 'transit_router_route_table_type' to be a str")
        pulumi.set(__self__, "transit_router_route_table_type", transit_router_route_table_type)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[builtins.str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[builtins.str]:
        """
        A list of Transit Router Route Table names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[builtins.str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[builtins.str]:
        """
        The status of the route table.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tables(self) -> Sequence['outputs.GetTransitRouterRouteTablesTableResult']:
        """
        A list of Transit Router Route Tables. Each element contains the following attributes:
        """
        return pulumi.get(self, "tables")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> builtins.str:
        return pulumi.get(self, "transit_router_id")

    @property
    @pulumi.getter(name="transitRouterRouteTableIds")
    def transit_router_route_table_ids(self) -> Optional[Sequence[builtins.str]]:
        return pulumi.get(self, "transit_router_route_table_ids")

    @property
    @pulumi.getter(name="transitRouterRouteTableNames")
    def transit_router_route_table_names(self) -> Optional[Sequence[builtins.str]]:
        return pulumi.get(self, "transit_router_route_table_names")

    @property
    @pulumi.getter(name="transitRouterRouteTableStatus")
    def transit_router_route_table_status(self) -> Optional[builtins.str]:
        return pulumi.get(self, "transit_router_route_table_status")

    @property
    @pulumi.getter(name="transitRouterRouteTableType")
    def transit_router_route_table_type(self) -> Optional[builtins.str]:
        """
        The type of the route table.
        """
        return pulumi.get(self, "transit_router_route_table_type")


class AwaitableGetTransitRouterRouteTablesResult(GetTransitRouterRouteTablesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitRouterRouteTablesResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            tables=self.tables,
            transit_router_id=self.transit_router_id,
            transit_router_route_table_ids=self.transit_router_route_table_ids,
            transit_router_route_table_names=self.transit_router_route_table_names,
            transit_router_route_table_status=self.transit_router_route_table_status,
            transit_router_route_table_type=self.transit_router_route_table_type)


def get_transit_router_route_tables(ids: Optional[Sequence[builtins.str]] = None,
                                    name_regex: Optional[builtins.str] = None,
                                    output_file: Optional[builtins.str] = None,
                                    status: Optional[builtins.str] = None,
                                    transit_router_id: Optional[builtins.str] = None,
                                    transit_router_route_table_ids: Optional[Sequence[builtins.str]] = None,
                                    transit_router_route_table_names: Optional[Sequence[builtins.str]] = None,
                                    transit_router_route_table_status: Optional[builtins.str] = None,
                                    transit_router_route_table_type: Optional[builtins.str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitRouterRouteTablesResult:
    """
    This data source provides the CEN Transit Router Route Tables of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.126.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "terraform-example"
    default = alicloud.cen.Instance("default",
        cen_instance_name=name,
        protection_level="REDUCED")
    default_transit_router = alicloud.cen.TransitRouter("default",
        cen_id=default.id,
        transit_router_name=name)
    default_transit_router_route_table = alicloud.cen.TransitRouterRouteTable("default",
        transit_router_id=default_transit_router.transit_router_id,
        transit_router_route_table_description=name,
        transit_router_route_table_name=name)
    ids = alicloud.cen.get_transit_router_route_tables_output(transit_router_id=default_transit_router_route_table.transit_router_id,
        ids=[default_transit_router_route_table.transit_router_route_table_id])
    pulumi.export("cenTransitRouterRouteTableId0", ids.tables[0].id)
    ```


    :param Sequence[builtins.str] ids: A list of Transit Router Route Table IDs.
    :param builtins.str name_regex: A regex string to filter results by Transit Router Route Table name.
    :param builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param builtins.str status: The status of the route table. Valid values: `Creating`, `Active`, `Deleting`.
    :param builtins.str transit_router_id: The ID of the Enterprise Edition transit router.
    :param Sequence[builtins.str] transit_router_route_table_ids: A list of ID of the CEN Transit Router Route Table.
    :param Sequence[builtins.str] transit_router_route_table_names: A list of name of the CEN Transit Router Route Table.
    :param builtins.str transit_router_route_table_status: The status of the route table. Valid values: `Creating`, `Active`, `Deleting`.
    :param builtins.str transit_router_route_table_type: The type of the route table. Valid values: `System`, `Custom`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterId'] = transit_router_id
    __args__['transitRouterRouteTableIds'] = transit_router_route_table_ids
    __args__['transitRouterRouteTableNames'] = transit_router_route_table_names
    __args__['transitRouterRouteTableStatus'] = transit_router_route_table_status
    __args__['transitRouterRouteTableType'] = transit_router_route_table_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getTransitRouterRouteTables:getTransitRouterRouteTables', __args__, opts=opts, typ=GetTransitRouterRouteTablesResult).value

    return AwaitableGetTransitRouterRouteTablesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        tables=pulumi.get(__ret__, 'tables'),
        transit_router_id=pulumi.get(__ret__, 'transit_router_id'),
        transit_router_route_table_ids=pulumi.get(__ret__, 'transit_router_route_table_ids'),
        transit_router_route_table_names=pulumi.get(__ret__, 'transit_router_route_table_names'),
        transit_router_route_table_status=pulumi.get(__ret__, 'transit_router_route_table_status'),
        transit_router_route_table_type=pulumi.get(__ret__, 'transit_router_route_table_type'))
def get_transit_router_route_tables_output(ids: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                           name_regex: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                           output_file: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                           status: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                           transit_router_id: Optional[pulumi.Input[builtins.str]] = None,
                                           transit_router_route_table_ids: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                           transit_router_route_table_names: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                           transit_router_route_table_status: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                           transit_router_route_table_type: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTransitRouterRouteTablesResult]:
    """
    This data source provides the CEN Transit Router Route Tables of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.126.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "terraform-example"
    default = alicloud.cen.Instance("default",
        cen_instance_name=name,
        protection_level="REDUCED")
    default_transit_router = alicloud.cen.TransitRouter("default",
        cen_id=default.id,
        transit_router_name=name)
    default_transit_router_route_table = alicloud.cen.TransitRouterRouteTable("default",
        transit_router_id=default_transit_router.transit_router_id,
        transit_router_route_table_description=name,
        transit_router_route_table_name=name)
    ids = alicloud.cen.get_transit_router_route_tables_output(transit_router_id=default_transit_router_route_table.transit_router_id,
        ids=[default_transit_router_route_table.transit_router_route_table_id])
    pulumi.export("cenTransitRouterRouteTableId0", ids.tables[0].id)
    ```


    :param Sequence[builtins.str] ids: A list of Transit Router Route Table IDs.
    :param builtins.str name_regex: A regex string to filter results by Transit Router Route Table name.
    :param builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param builtins.str status: The status of the route table. Valid values: `Creating`, `Active`, `Deleting`.
    :param builtins.str transit_router_id: The ID of the Enterprise Edition transit router.
    :param Sequence[builtins.str] transit_router_route_table_ids: A list of ID of the CEN Transit Router Route Table.
    :param Sequence[builtins.str] transit_router_route_table_names: A list of name of the CEN Transit Router Route Table.
    :param builtins.str transit_router_route_table_status: The status of the route table. Valid values: `Creating`, `Active`, `Deleting`.
    :param builtins.str transit_router_route_table_type: The type of the route table. Valid values: `System`, `Custom`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterId'] = transit_router_id
    __args__['transitRouterRouteTableIds'] = transit_router_route_table_ids
    __args__['transitRouterRouteTableNames'] = transit_router_route_table_names
    __args__['transitRouterRouteTableStatus'] = transit_router_route_table_status
    __args__['transitRouterRouteTableType'] = transit_router_route_table_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cen/getTransitRouterRouteTables:getTransitRouterRouteTables', __args__, opts=opts, typ=GetTransitRouterRouteTablesResult)
    return __ret__.apply(lambda __response__: GetTransitRouterRouteTablesResult(
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        status=pulumi.get(__response__, 'status'),
        tables=pulumi.get(__response__, 'tables'),
        transit_router_id=pulumi.get(__response__, 'transit_router_id'),
        transit_router_route_table_ids=pulumi.get(__response__, 'transit_router_route_table_ids'),
        transit_router_route_table_names=pulumi.get(__response__, 'transit_router_route_table_names'),
        transit_router_route_table_status=pulumi.get(__response__, 'transit_router_route_table_status'),
        transit_router_route_table_type=pulumi.get(__response__, 'transit_router_route_table_type')))
