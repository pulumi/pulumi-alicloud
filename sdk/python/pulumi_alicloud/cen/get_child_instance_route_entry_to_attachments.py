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
    'GetChildInstanceRouteEntryToAttachmentsResult',
    'AwaitableGetChildInstanceRouteEntryToAttachmentsResult',
    'get_child_instance_route_entry_to_attachments',
    'get_child_instance_route_entry_to_attachments_output',
]

@pulumi.output_type
class GetChildInstanceRouteEntryToAttachmentsResult:
    """
    A collection of values returned by getChildInstanceRouteEntryToAttachments.
    """
    def __init__(__self__, attachments=None, cen_id=None, child_instance_route_table_id=None, id=None, ids=None, output_file=None, service_type=None, transit_router_attachment_id=None):
        if attachments and not isinstance(attachments, list):
            raise TypeError("Expected argument 'attachments' to be a list")
        pulumi.set(__self__, "attachments", attachments)
        if cen_id and not isinstance(cen_id, str):
            raise TypeError("Expected argument 'cen_id' to be a str")
        pulumi.set(__self__, "cen_id", cen_id)
        if child_instance_route_table_id and not isinstance(child_instance_route_table_id, str):
            raise TypeError("Expected argument 'child_instance_route_table_id' to be a str")
        pulumi.set(__self__, "child_instance_route_table_id", child_instance_route_table_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if service_type and not isinstance(service_type, str):
            raise TypeError("Expected argument 'service_type' to be a str")
        pulumi.set(__self__, "service_type", service_type)
        if transit_router_attachment_id and not isinstance(transit_router_attachment_id, str):
            raise TypeError("Expected argument 'transit_router_attachment_id' to be a str")
        pulumi.set(__self__, "transit_router_attachment_id", transit_router_attachment_id)

    @property
    @pulumi.getter
    def attachments(self) -> Sequence['outputs.GetChildInstanceRouteEntryToAttachmentsAttachmentResult']:
        """
        A list of Child Instance Route Entry To Attachment Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "attachments")

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[str]:
        """
        The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter(name="childInstanceRouteTableId")
    def child_instance_route_table_id(self) -> str:
        """
        The first ID of the resource
        """
        return pulumi.get(self, "child_instance_route_table_id")

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
        Limit search to a list of specific IDs.The value is formulated as `<cen_id>:<child_instance_route_table_id>:<transit_router_attachment_id>:<destination_cidr_block>`.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> Optional[str]:
        """
        ServiceType
        """
        return pulumi.get(self, "service_type")

    @property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> str:
        """
        TransitRouterAttachmentId
        """
        return pulumi.get(self, "transit_router_attachment_id")


class AwaitableGetChildInstanceRouteEntryToAttachmentsResult(GetChildInstanceRouteEntryToAttachmentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetChildInstanceRouteEntryToAttachmentsResult(
            attachments=self.attachments,
            cen_id=self.cen_id,
            child_instance_route_table_id=self.child_instance_route_table_id,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            service_type=self.service_type,
            transit_router_attachment_id=self.transit_router_attachment_id)


def get_child_instance_route_entry_to_attachments(cen_id: Optional[str] = None,
                                                  child_instance_route_table_id: Optional[str] = None,
                                                  ids: Optional[Sequence[str]] = None,
                                                  output_file: Optional[str] = None,
                                                  service_type: Optional[str] = None,
                                                  transit_router_attachment_id: Optional[str] = None,
                                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetChildInstanceRouteEntryToAttachmentsResult:
    """
    This data source provides Cen Child Instance Route Entry To Attachment available to the user.[What is Child Instance Route Entry To Attachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createcenchildinstancerouteentrytoattachment)

    > **NOTE:** Available in 1.195.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.cen.get_child_instance_route_entry_to_attachments(child_instance_route_table_id="vtb-t4nt0z5xxbti85c78nkzy",
        transit_router_attachment_id="tr-attach-f1fd1y50rql00emvej")
    pulumi.export("alicloudCenChildInstanceRouteEntryToAttachmentExampleId", default.attachments[0].id)
    ```


    :param str cen_id: The ID of the CEN instance.
    :param str child_instance_route_table_id: The first ID of the resource
    :param Sequence[str] ids: Limit search to a list of specific IDs.The value is formulated as `<cen_id>:<child_instance_route_table_id>:<transit_router_attachment_id>:<destination_cidr_block>`.
    :param str service_type: ServiceType
    :param str transit_router_attachment_id: TransitRouterAttachmentId
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['childInstanceRouteTableId'] = child_instance_route_table_id
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['serviceType'] = service_type
    __args__['transitRouterAttachmentId'] = transit_router_attachment_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getChildInstanceRouteEntryToAttachments:getChildInstanceRouteEntryToAttachments', __args__, opts=opts, typ=GetChildInstanceRouteEntryToAttachmentsResult).value

    return AwaitableGetChildInstanceRouteEntryToAttachmentsResult(
        attachments=__ret__.attachments,
        cen_id=__ret__.cen_id,
        child_instance_route_table_id=__ret__.child_instance_route_table_id,
        id=__ret__.id,
        ids=__ret__.ids,
        output_file=__ret__.output_file,
        service_type=__ret__.service_type,
        transit_router_attachment_id=__ret__.transit_router_attachment_id)


@_utilities.lift_output_func(get_child_instance_route_entry_to_attachments)
def get_child_instance_route_entry_to_attachments_output(cen_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                         child_instance_route_table_id: Optional[pulumi.Input[str]] = None,
                                                         ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                         output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                                         service_type: Optional[pulumi.Input[Optional[str]]] = None,
                                                         transit_router_attachment_id: Optional[pulumi.Input[str]] = None,
                                                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetChildInstanceRouteEntryToAttachmentsResult]:
    """
    This data source provides Cen Child Instance Route Entry To Attachment available to the user.[What is Child Instance Route Entry To Attachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createcenchildinstancerouteentrytoattachment)

    > **NOTE:** Available in 1.195.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.cen.get_child_instance_route_entry_to_attachments(child_instance_route_table_id="vtb-t4nt0z5xxbti85c78nkzy",
        transit_router_attachment_id="tr-attach-f1fd1y50rql00emvej")
    pulumi.export("alicloudCenChildInstanceRouteEntryToAttachmentExampleId", default.attachments[0].id)
    ```


    :param str cen_id: The ID of the CEN instance.
    :param str child_instance_route_table_id: The first ID of the resource
    :param Sequence[str] ids: Limit search to a list of specific IDs.The value is formulated as `<cen_id>:<child_instance_route_table_id>:<transit_router_attachment_id>:<destination_cidr_block>`.
    :param str service_type: ServiceType
    :param str transit_router_attachment_id: TransitRouterAttachmentId
    """
    ...