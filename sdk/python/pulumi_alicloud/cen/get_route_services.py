# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetRouteServicesResult',
    'AwaitableGetRouteServicesResult',
    'get_route_services',
]

@pulumi.output_type
class GetRouteServicesResult:
    """
    A collection of values returned by getRouteServices.
    """
    def __init__(__self__, access_region_id=None, cen_id=None, host=None, host_region_id=None, host_vpc_id=None, id=None, ids=None, output_file=None, services=None, status=None):
        if access_region_id and not isinstance(access_region_id, str):
            raise TypeError("Expected argument 'access_region_id' to be a str")
        pulumi.set(__self__, "access_region_id", access_region_id)
        if cen_id and not isinstance(cen_id, str):
            raise TypeError("Expected argument 'cen_id' to be a str")
        pulumi.set(__self__, "cen_id", cen_id)
        if host and not isinstance(host, str):
            raise TypeError("Expected argument 'host' to be a str")
        pulumi.set(__self__, "host", host)
        if host_region_id and not isinstance(host_region_id, str):
            raise TypeError("Expected argument 'host_region_id' to be a str")
        pulumi.set(__self__, "host_region_id", host_region_id)
        if host_vpc_id and not isinstance(host_vpc_id, str):
            raise TypeError("Expected argument 'host_vpc_id' to be a str")
        pulumi.set(__self__, "host_vpc_id", host_vpc_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if services and not isinstance(services, list):
            raise TypeError("Expected argument 'services' to be a list")
        pulumi.set(__self__, "services", services)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="accessRegionId")
    def access_region_id(self) -> Optional[str]:
        """
        The region of the network instances that access the cloud services.
        """
        return pulumi.get(self, "access_region_id")

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> str:
        """
        The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter
    def host(self) -> Optional[str]:
        """
        The domain name or IP address of the cloud service.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter(name="hostRegionId")
    def host_region_id(self) -> Optional[str]:
        """
        The region of the cloud service.
        """
        return pulumi.get(self, "host_region_id")

    @property
    @pulumi.getter(name="hostVpcId")
    def host_vpc_id(self) -> Optional[str]:
        """
        The VPC associated with the cloud service.
        """
        return pulumi.get(self, "host_vpc_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        A list of CEN Route Service IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def services(self) -> Sequence['outputs.GetRouteServicesServiceResult']:
        """
        A list of CEN Route Services. Each element contains the following attributes:
        """
        return pulumi.get(self, "services")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the cloud service.
        """
        return pulumi.get(self, "status")


class AwaitableGetRouteServicesResult(GetRouteServicesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRouteServicesResult(
            access_region_id=self.access_region_id,
            cen_id=self.cen_id,
            host=self.host,
            host_region_id=self.host_region_id,
            host_vpc_id=self.host_vpc_id,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            services=self.services,
            status=self.status)


def get_route_services(access_region_id: Optional[str] = None,
                       cen_id: Optional[str] = None,
                       host: Optional[str] = None,
                       host_region_id: Optional[str] = None,
                       host_vpc_id: Optional[str] = None,
                       output_file: Optional[str] = None,
                       status: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRouteServicesResult:
    """
    This data source provides CEN Route Service available to the user.

    > **NOTE:** Available in v1.102.0+

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cen.get_route_services(cen_id="cen-7qthudw0ll6jmc****")
    pulumi.export("firstCenRouteServiceId", example.services[0].id)
    ```


    :param str access_region_id: The region of the network instances that access the cloud services.
    :param str cen_id: -(Required, ForceNew) The ID of the CEN instance.
    :param str host: -(Optional, ForceNew) The domain name or IP address of the cloud service.
    :param str host_region_id: The region of the cloud service.
    :param str host_vpc_id: The VPC associated with the cloud service.
    :param str status: The status of the cloud service. Valid values: `Active`, `Creating` and `Deleting`.
    """
    __args__ = dict()
    __args__['accessRegionId'] = access_region_id
    __args__['cenId'] = cen_id
    __args__['host'] = host
    __args__['hostRegionId'] = host_region_id
    __args__['hostVpcId'] = host_vpc_id
    __args__['outputFile'] = output_file
    __args__['status'] = status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getRouteServices:getRouteServices', __args__, opts=opts, typ=GetRouteServicesResult).value

    return AwaitableGetRouteServicesResult(
        access_region_id=__ret__.access_region_id,
        cen_id=__ret__.cen_id,
        host=__ret__.host,
        host_region_id=__ret__.host_region_id,
        host_vpc_id=__ret__.host_vpc_id,
        id=__ret__.id,
        ids=__ret__.ids,
        output_file=__ret__.output_file,
        services=__ret__.services,
        status=__ret__.status)