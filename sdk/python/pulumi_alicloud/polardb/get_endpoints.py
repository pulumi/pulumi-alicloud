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
    'GetEndpointsResult',
    'AwaitableGetEndpointsResult',
    'get_endpoints',
    'get_endpoints_output',
]

@pulumi.output_type
class GetEndpointsResult:
    """
    A collection of values returned by getEndpoints.
    """
    def __init__(__self__, db_cluster_id=None, db_endpoint_id=None, endpoints=None, id=None):
        if db_cluster_id and not isinstance(db_cluster_id, str):
            raise TypeError("Expected argument 'db_cluster_id' to be a str")
        pulumi.set(__self__, "db_cluster_id", db_cluster_id)
        if db_endpoint_id and not isinstance(db_endpoint_id, str):
            raise TypeError("Expected argument 'db_endpoint_id' to be a str")
        pulumi.set(__self__, "db_endpoint_id", db_endpoint_id)
        if endpoints and not isinstance(endpoints, list):
            raise TypeError("Expected argument 'endpoints' to be a list")
        pulumi.set(__self__, "endpoints", endpoints)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @_builtins.property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> _builtins.str:
        return pulumi.get(self, "db_cluster_id")

    @_builtins.property
    @pulumi.getter(name="dbEndpointId")
    def db_endpoint_id(self) -> Optional[_builtins.str]:
        """
        The endpoint ID.
        """
        return pulumi.get(self, "db_endpoint_id")

    @_builtins.property
    @pulumi.getter
    def endpoints(self) -> Sequence['outputs.GetEndpointsEndpointResult']:
        """
        A list of PolarDB cluster endpoints. Each element contains the following attributes:
        """
        return pulumi.get(self, "endpoints")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetEndpointsResult(GetEndpointsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEndpointsResult(
            db_cluster_id=self.db_cluster_id,
            db_endpoint_id=self.db_endpoint_id,
            endpoints=self.endpoints,
            id=self.id)


def get_endpoints(db_cluster_id: Optional[_builtins.str] = None,
                  db_endpoint_id: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEndpointsResult:
    """
    The `polardb_get_endpoints` data source provides a collection of PolarDB endpoints available in Alibaba Cloud account.
    Filters support regular expression for the cluster name, searches by clusterId, and other filters which are listed below.

    > **NOTE:** Available since v1.68.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    this = alicloud.polardb.get_node_classes(db_type="MySQL",
        db_version="8.0",
        pay_type="PostPaid",
        category="Normal")
    default_network = alicloud.vpc.Network("default",
        vpc_name="terraform-example",
        cidr_block="172.16.0.0/16")
    default_switch = alicloud.vpc.Switch("default",
        vpc_id=default_network.id,
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
    polardb_clusters_ds = alicloud.polardb.get_clusters_output(description_regex=cluster.description,
        status="Running")
    default = polardb_clusters_ds.apply(lambda polardb_clusters_ds: alicloud.polardb.get_endpoints_output(db_cluster_id=polardb_clusters_ds.clusters[0].id))
    pulumi.export("endpoint", default.endpoints[0].db_endpoint_id)
    ```


    :param _builtins.str db_cluster_id: PolarDB cluster ID.
    :param _builtins.str db_endpoint_id: endpoint of the cluster.
    """
    __args__ = dict()
    __args__['dbClusterId'] = db_cluster_id
    __args__['dbEndpointId'] = db_endpoint_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:polardb/getEndpoints:getEndpoints', __args__, opts=opts, typ=GetEndpointsResult).value

    return AwaitableGetEndpointsResult(
        db_cluster_id=pulumi.get(__ret__, 'db_cluster_id'),
        db_endpoint_id=pulumi.get(__ret__, 'db_endpoint_id'),
        endpoints=pulumi.get(__ret__, 'endpoints'),
        id=pulumi.get(__ret__, 'id'))
def get_endpoints_output(db_cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                         db_endpoint_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetEndpointsResult]:
    """
    The `polardb_get_endpoints` data source provides a collection of PolarDB endpoints available in Alibaba Cloud account.
    Filters support regular expression for the cluster name, searches by clusterId, and other filters which are listed below.

    > **NOTE:** Available since v1.68.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    this = alicloud.polardb.get_node_classes(db_type="MySQL",
        db_version="8.0",
        pay_type="PostPaid",
        category="Normal")
    default_network = alicloud.vpc.Network("default",
        vpc_name="terraform-example",
        cidr_block="172.16.0.0/16")
    default_switch = alicloud.vpc.Switch("default",
        vpc_id=default_network.id,
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
    polardb_clusters_ds = alicloud.polardb.get_clusters_output(description_regex=cluster.description,
        status="Running")
    default = polardb_clusters_ds.apply(lambda polardb_clusters_ds: alicloud.polardb.get_endpoints_output(db_cluster_id=polardb_clusters_ds.clusters[0].id))
    pulumi.export("endpoint", default.endpoints[0].db_endpoint_id)
    ```


    :param _builtins.str db_cluster_id: PolarDB cluster ID.
    :param _builtins.str db_endpoint_id: endpoint of the cluster.
    """
    __args__ = dict()
    __args__['dbClusterId'] = db_cluster_id
    __args__['dbEndpointId'] = db_endpoint_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:polardb/getEndpoints:getEndpoints', __args__, opts=opts, typ=GetEndpointsResult)
    return __ret__.apply(lambda __response__: GetEndpointsResult(
        db_cluster_id=pulumi.get(__response__, 'db_cluster_id'),
        db_endpoint_id=pulumi.get(__response__, 'db_endpoint_id'),
        endpoints=pulumi.get(__response__, 'endpoints'),
        id=pulumi.get(__response__, 'id')))
