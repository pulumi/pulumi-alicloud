# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetCustomRoutingPortMappingsResult',
    'AwaitableGetCustomRoutingPortMappingsResult',
    'get_custom_routing_port_mappings',
    'get_custom_routing_port_mappings_output',
]

@pulumi.output_type
class GetCustomRoutingPortMappingsResult:
    """
    A collection of values returned by getCustomRoutingPortMappings.
    """
    def __init__(__self__, accelerator_id=None, custom_routing_port_mappings=None, endpoint_group_id=None, id=None, listener_id=None, output_file=None, page_number=None, page_size=None, status=None):
        if accelerator_id and not isinstance(accelerator_id, str):
            raise TypeError("Expected argument 'accelerator_id' to be a str")
        pulumi.set(__self__, "accelerator_id", accelerator_id)
        if custom_routing_port_mappings and not isinstance(custom_routing_port_mappings, list):
            raise TypeError("Expected argument 'custom_routing_port_mappings' to be a list")
        pulumi.set(__self__, "custom_routing_port_mappings", custom_routing_port_mappings)
        if endpoint_group_id and not isinstance(endpoint_group_id, str):
            raise TypeError("Expected argument 'endpoint_group_id' to be a str")
        pulumi.set(__self__, "endpoint_group_id", endpoint_group_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if listener_id and not isinstance(listener_id, str):
            raise TypeError("Expected argument 'listener_id' to be a str")
        pulumi.set(__self__, "listener_id", listener_id)
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

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> str:
        """
        The ID of the GA instance.
        """
        return pulumi.get(self, "accelerator_id")

    @property
    @pulumi.getter(name="customRoutingPortMappings")
    def custom_routing_port_mappings(self) -> Sequence['outputs.GetCustomRoutingPortMappingsCustomRoutingPortMappingResult']:
        """
        A list of Custom Routing Port Mappings. Each element contains the following attributes:
        """
        return pulumi.get(self, "custom_routing_port_mappings")

    @property
    @pulumi.getter(name="endpointGroupId")
    def endpoint_group_id(self) -> Optional[str]:
        """
        The ID of the endpoint group.
        """
        return pulumi.get(self, "endpoint_group_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="listenerId")
    def listener_id(self) -> Optional[str]:
        """
        The ID of the listener.
        """
        return pulumi.get(self, "listener_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The access policy of traffic for the backend instance.
        """
        return pulumi.get(self, "status")


class AwaitableGetCustomRoutingPortMappingsResult(GetCustomRoutingPortMappingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomRoutingPortMappingsResult(
            accelerator_id=self.accelerator_id,
            custom_routing_port_mappings=self.custom_routing_port_mappings,
            endpoint_group_id=self.endpoint_group_id,
            id=self.id,
            listener_id=self.listener_id,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            status=self.status)


def get_custom_routing_port_mappings(accelerator_id: Optional[str] = None,
                                     endpoint_group_id: Optional[str] = None,
                                     listener_id: Optional[str] = None,
                                     output_file: Optional[str] = None,
                                     page_number: Optional[int] = None,
                                     page_size: Optional[int] = None,
                                     status: Optional[str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomRoutingPortMappingsResult:
    """
    This data source provides the Global Accelerator (GA) Custom Routing Port Mappings of the current Alibaba Cloud user.

    > **NOTE:** Available in 1.197.0+

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.ga.get_custom_routing_port_mappings(accelerator_id="your_accelerator_id")
    pulumi.export("gaCustomRoutingPortMappingsAcceleratorId1", default.custom_routing_port_mappings[0].accelerator_id)
    ```


    :param str accelerator_id: The ID of the GA instance.
    :param str endpoint_group_id: The ID of the endpoint group.
    :param str listener_id: The ID of the listener.
    :param str status: The access policy of traffic for the backend instance. Valid Values: `allow`, `deny`.
    """
    __args__ = dict()
    __args__['acceleratorId'] = accelerator_id
    __args__['endpointGroupId'] = endpoint_group_id
    __args__['listenerId'] = listener_id
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ga/getCustomRoutingPortMappings:getCustomRoutingPortMappings', __args__, opts=opts, typ=GetCustomRoutingPortMappingsResult).value

    return AwaitableGetCustomRoutingPortMappingsResult(
        accelerator_id=__ret__.accelerator_id,
        custom_routing_port_mappings=__ret__.custom_routing_port_mappings,
        endpoint_group_id=__ret__.endpoint_group_id,
        id=__ret__.id,
        listener_id=__ret__.listener_id,
        output_file=__ret__.output_file,
        page_number=__ret__.page_number,
        page_size=__ret__.page_size,
        status=__ret__.status)


@_utilities.lift_output_func(get_custom_routing_port_mappings)
def get_custom_routing_port_mappings_output(accelerator_id: Optional[pulumi.Input[str]] = None,
                                            endpoint_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                                            listener_id: Optional[pulumi.Input[Optional[str]]] = None,
                                            output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                            page_number: Optional[pulumi.Input[Optional[int]]] = None,
                                            page_size: Optional[pulumi.Input[Optional[int]]] = None,
                                            status: Optional[pulumi.Input[Optional[str]]] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCustomRoutingPortMappingsResult]:
    """
    This data source provides the Global Accelerator (GA) Custom Routing Port Mappings of the current Alibaba Cloud user.

    > **NOTE:** Available in 1.197.0+

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.ga.get_custom_routing_port_mappings(accelerator_id="your_accelerator_id")
    pulumi.export("gaCustomRoutingPortMappingsAcceleratorId1", default.custom_routing_port_mappings[0].accelerator_id)
    ```


    :param str accelerator_id: The ID of the GA instance.
    :param str endpoint_group_id: The ID of the endpoint group.
    :param str listener_id: The ID of the listener.
    :param str status: The access policy of traffic for the backend instance. Valid Values: `allow`, `deny`.
    """
    ...