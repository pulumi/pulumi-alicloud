# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetPrivateZonesResult:
    """
    A collection of values returned by getPrivateZones.
    """
    def __init__(__self__, cen_id=None, host_region_id=None, id=None, ids=None, output_file=None, status=None, zones=None):
        if cen_id and not isinstance(cen_id, str):
            raise TypeError("Expected argument 'cen_id' to be a str")
        __self__.cen_id = cen_id
        """
        The ID of the CEN instance.
        """
        if host_region_id and not isinstance(host_region_id, str):
            raise TypeError("Expected argument 'host_region_id' to be a str")
        __self__.host_region_id = host_region_id
        """
        The service region. The service region is the target region of the PrivateZone service accessed through CEN.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        __self__.ids = ids
        """
        A list of CEN private zone IDs.
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        __self__.status = status
        """
        The status of the PrivateZone service.
        """
        if zones and not isinstance(zones, list):
            raise TypeError("Expected argument 'zones' to be a list")
        __self__.zones = zones
        """
        A list of CEN private zones. Each element contains the following attributes:
        """
class AwaitableGetPrivateZonesResult(GetPrivateZonesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivateZonesResult(
            cen_id=self.cen_id,
            host_region_id=self.host_region_id,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            status=self.status,
            zones=self.zones)

def get_private_zones(cen_id=None,host_region_id=None,ids=None,output_file=None,status=None,opts=None):
    """
    This data source provides CEN Private Zones available to the user.

    > **NOTE:** Available in v1.88.0+.




    :param str cen_id: The ID of the CEN instance.
    :param str host_region_id: The service region. The service region is the target region of the PrivateZone service accessed through CEN.
    :param list ids: A list of CEN private zone IDs.
           * `host_region_id ` - (Optional) The service region is the target region of the PrivateZone service accessed through CEN.
    :param str status: The status of the PrivateZone service, including `Creating`, `Active` and `Deleting`.
    """
    __args__ = dict()


    __args__['cenId'] = cen_id
    __args__['hostRegionId'] = host_region_id
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['status'] = status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getPrivateZones:getPrivateZones', __args__, opts=opts).value

    return AwaitableGetPrivateZonesResult(
        cen_id=__ret__.get('cenId'),
        host_region_id=__ret__.get('hostRegionId'),
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        output_file=__ret__.get('outputFile'),
        status=__ret__.get('status'),
        zones=__ret__.get('zones'))