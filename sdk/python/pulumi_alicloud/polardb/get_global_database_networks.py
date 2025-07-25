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

__all__ = [
    'GetGlobalDatabaseNetworksResult',
    'AwaitableGetGlobalDatabaseNetworksResult',
    'get_global_database_networks',
    'get_global_database_networks_output',
]

@pulumi.output_type
class GetGlobalDatabaseNetworksResult:
    """
    A collection of values returned by getGlobalDatabaseNetworks.
    """
    def __init__(__self__, db_cluster_id=None, description=None, gdn_id=None, id=None, ids=None, networks=None, output_file=None, page_number=None, page_size=None, status=None):
        if db_cluster_id and not isinstance(db_cluster_id, str):
            raise TypeError("Expected argument 'db_cluster_id' to be a str")
        pulumi.set(__self__, "db_cluster_id", db_cluster_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if gdn_id and not isinstance(gdn_id, str):
            raise TypeError("Expected argument 'gdn_id' to be a str")
        pulumi.set(__self__, "gdn_id", gdn_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> Optional[_builtins.str]:
        """
        The ID of the PolarDB cluster.
        """
        return pulumi.get(self, "db_cluster_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        """
        The description of the Global Database Network.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="gdnId")
    def gdn_id(self) -> Optional[_builtins.str]:
        """
        The ID of the Global Database Network.
        """
        return pulumi.get(self, "gdn_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ids(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetGlobalDatabaseNetworksNetworkResult']:
        """
        A list of PolarDB Global Database Networks. Each element contains the following attributes:
        """
        return pulumi.get(self, "networks")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "page_number")

    @_builtins.property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "page_size")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        """
        The status of the Global Database Network.
        """
        return pulumi.get(self, "status")


class AwaitableGetGlobalDatabaseNetworksResult(GetGlobalDatabaseNetworksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalDatabaseNetworksResult(
            db_cluster_id=self.db_cluster_id,
            description=self.description,
            gdn_id=self.gdn_id,
            id=self.id,
            ids=self.ids,
            networks=self.networks,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            status=self.status)


def get_global_database_networks(db_cluster_id: Optional[_builtins.str] = None,
                                 description: Optional[_builtins.str] = None,
                                 gdn_id: Optional[_builtins.str] = None,
                                 ids: Optional[Sequence[_builtins.str]] = None,
                                 output_file: Optional[_builtins.str] = None,
                                 page_number: Optional[_builtins.int] = None,
                                 page_size: Optional[_builtins.int] = None,
                                 status: Optional[_builtins.str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalDatabaseNetworksResult:
    """
    This data source provides the PolarDB Global Database Networks of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.181.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    this = alicloud.polardb.get_node_classes(db_type="MySQL",
        db_version="8.0",
        pay_type="PostPaid",
        category="Normal")
    default = alicloud.vpc.Network("default",
        vpc_name="terraform-example",
        cidr_block="172.16.0.0/16")
    default_switch = alicloud.vpc.Switch("default",
        vpc_id=default.id,
        cidr_block="172.16.0.0/24",
        zone_id=this.classes[0].zone_id,
        vswitch_name="terraform-example")
    cluster = alicloud.polardb.Cluster("cluster",
        db_type="MySQL",
        db_version="8.0",
        pay_type="PostPaid",
        db_node_count=2,
        db_node_class=this.classes[0].supported_engines[0].available_resources[0].db_node_class,
        vswitch_id=default_switch.id)
    default_global_database_network = alicloud.polardb.GlobalDatabaseNetwork("default",
        db_cluster_id=cluster.id,
        description=cluster.id)
    ids = alicloud.polardb.get_global_database_networks_output(ids=[default_global_database_network.id])
    pulumi.export("polardbGlobalDatabaseNetworkId1", ids.networks[0].id)
    description = alicloud.polardb.get_global_database_networks_output(description=default_global_database_network.description)
    pulumi.export("polardbGlobalDatabaseNetworkId2", description.networks[0].id)
    ```


    :param _builtins.str db_cluster_id: The ID of the cluster.
    :param _builtins.str description: The description of the Global Database Network.
    :param _builtins.str gdn_id: The ID of the Global Database Network.
    :param Sequence[_builtins.str] ids: A list of Global Database Network IDs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the Global Database Network. Valid values:
    """
    __args__ = dict()
    __args__['dbClusterId'] = db_cluster_id
    __args__['description'] = description
    __args__['gdnId'] = gdn_id
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:polardb/getGlobalDatabaseNetworks:getGlobalDatabaseNetworks', __args__, opts=opts, typ=GetGlobalDatabaseNetworksResult).value

    return AwaitableGetGlobalDatabaseNetworksResult(
        db_cluster_id=pulumi.get(__ret__, 'db_cluster_id'),
        description=pulumi.get(__ret__, 'description'),
        gdn_id=pulumi.get(__ret__, 'gdn_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        networks=pulumi.get(__ret__, 'networks'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        status=pulumi.get(__ret__, 'status'))
def get_global_database_networks_output(db_cluster_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        description: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        gdn_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                        output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        page_number: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                        page_size: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                        status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGlobalDatabaseNetworksResult]:
    """
    This data source provides the PolarDB Global Database Networks of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.181.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    this = alicloud.polardb.get_node_classes(db_type="MySQL",
        db_version="8.0",
        pay_type="PostPaid",
        category="Normal")
    default = alicloud.vpc.Network("default",
        vpc_name="terraform-example",
        cidr_block="172.16.0.0/16")
    default_switch = alicloud.vpc.Switch("default",
        vpc_id=default.id,
        cidr_block="172.16.0.0/24",
        zone_id=this.classes[0].zone_id,
        vswitch_name="terraform-example")
    cluster = alicloud.polardb.Cluster("cluster",
        db_type="MySQL",
        db_version="8.0",
        pay_type="PostPaid",
        db_node_count=2,
        db_node_class=this.classes[0].supported_engines[0].available_resources[0].db_node_class,
        vswitch_id=default_switch.id)
    default_global_database_network = alicloud.polardb.GlobalDatabaseNetwork("default",
        db_cluster_id=cluster.id,
        description=cluster.id)
    ids = alicloud.polardb.get_global_database_networks_output(ids=[default_global_database_network.id])
    pulumi.export("polardbGlobalDatabaseNetworkId1", ids.networks[0].id)
    description = alicloud.polardb.get_global_database_networks_output(description=default_global_database_network.description)
    pulumi.export("polardbGlobalDatabaseNetworkId2", description.networks[0].id)
    ```


    :param _builtins.str db_cluster_id: The ID of the cluster.
    :param _builtins.str description: The description of the Global Database Network.
    :param _builtins.str gdn_id: The ID of the Global Database Network.
    :param Sequence[_builtins.str] ids: A list of Global Database Network IDs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the Global Database Network. Valid values:
    """
    __args__ = dict()
    __args__['dbClusterId'] = db_cluster_id
    __args__['description'] = description
    __args__['gdnId'] = gdn_id
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['status'] = status
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:polardb/getGlobalDatabaseNetworks:getGlobalDatabaseNetworks', __args__, opts=opts, typ=GetGlobalDatabaseNetworksResult)
    return __ret__.apply(lambda __response__: GetGlobalDatabaseNetworksResult(
        db_cluster_id=pulumi.get(__response__, 'db_cluster_id'),
        description=pulumi.get(__response__, 'description'),
        gdn_id=pulumi.get(__response__, 'gdn_id'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        networks=pulumi.get(__response__, 'networks'),
        output_file=pulumi.get(__response__, 'output_file'),
        page_number=pulumi.get(__response__, 'page_number'),
        page_size=pulumi.get(__response__, 'page_size'),
        status=pulumi.get(__response__, 'status')))
