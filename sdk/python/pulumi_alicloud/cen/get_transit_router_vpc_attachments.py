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
    'GetTransitRouterVpcAttachmentsResult',
    'AwaitableGetTransitRouterVpcAttachmentsResult',
    'get_transit_router_vpc_attachments',
    'get_transit_router_vpc_attachments_output',
]

@pulumi.output_type
class GetTransitRouterVpcAttachmentsResult:
    """
    A collection of values returned by getTransitRouterVpcAttachments.
    """
    def __init__(__self__, attachments=None, cen_id=None, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, transit_router_attachment_id=None, transit_router_id=None, vpc_id=None):
        if attachments and not isinstance(attachments, list):
            raise TypeError("Expected argument 'attachments' to be a list")
        pulumi.set(__self__, "attachments", attachments)
        if cen_id and not isinstance(cen_id, str):
            raise TypeError("Expected argument 'cen_id' to be a str")
        pulumi.set(__self__, "cen_id", cen_id)
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
        if transit_router_attachment_id and not isinstance(transit_router_attachment_id, str):
            raise TypeError("Expected argument 'transit_router_attachment_id' to be a str")
        pulumi.set(__self__, "transit_router_attachment_id", transit_router_attachment_id)
        if transit_router_id and not isinstance(transit_router_id, str):
            raise TypeError("Expected argument 'transit_router_id' to be a str")
        pulumi.set(__self__, "transit_router_id", transit_router_id)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @_builtins.property
    @pulumi.getter
    def attachments(self) -> Sequence['outputs.GetTransitRouterVpcAttachmentsAttachmentResult']:
        """
        A list of Transit Router VPC Attachments. Each element contains the following attributes:
        """
        return pulumi.get(self, "attachments")

    @_builtins.property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> _builtins.str:
        """
        (Available since v1.224.0) The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

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
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of Transit Router VPC Attachment names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        """
        The status of the Transit Router VPC Attachment.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> Optional[_builtins.str]:
        """
        The ID of the Transit Router VPC Attachment.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @_builtins.property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[_builtins.str]:
        """
        (Available since v1.224.0) The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @_builtins.property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[_builtins.str]:
        """
        The ID of the VPC.
        """
        return pulumi.get(self, "vpc_id")


class AwaitableGetTransitRouterVpcAttachmentsResult(GetTransitRouterVpcAttachmentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitRouterVpcAttachmentsResult(
            attachments=self.attachments,
            cen_id=self.cen_id,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            transit_router_attachment_id=self.transit_router_attachment_id,
            transit_router_id=self.transit_router_id,
            vpc_id=self.vpc_id)


def get_transit_router_vpc_attachments(cen_id: Optional[_builtins.str] = None,
                                       ids: Optional[Sequence[_builtins.str]] = None,
                                       name_regex: Optional[_builtins.str] = None,
                                       output_file: Optional[_builtins.str] = None,
                                       status: Optional[_builtins.str] = None,
                                       transit_router_attachment_id: Optional[_builtins.str] = None,
                                       transit_router_id: Optional[_builtins.str] = None,
                                       vpc_id: Optional[_builtins.str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitRouterVpcAttachmentsResult:
    """
    This data source provides the CEN Transit Router VPC Attachments of the current Alibaba Cloud user.

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
    default = alicloud.get_zones()
    default_get_networks = alicloud.vpc.get_networks(name_regex="^default-NODELETING$")
    default_get_switches = alicloud.vpc.get_switches(vpc_id=default_get_networks.ids[0],
        zone_id=default.ids[0])
    default_master = alicloud.vpc.get_switches(vpc_id=default_get_networks.ids[0],
        zone_id=default.ids[1])
    default_instance = alicloud.cen.Instance("default",
        cen_instance_name=name,
        protection_level="REDUCED")
    default_transit_router = alicloud.cen.TransitRouter("default", cen_id=default_instance.id)
    default_transit_router_vpc_attachment = alicloud.cen.TransitRouterVpcAttachment("default",
        cen_id=default_instance.id,
        vpc_id=default_get_networks.ids[0],
        transit_router_id=default_transit_router.transit_router_id,
        transit_router_attachment_name=name,
        transit_router_attachment_description=name,
        zone_mappings=[
            {
                "vswitch_id": default_master.vswitches[0].id,
                "zone_id": default_master.vswitches[0].zone_id,
            },
            {
                "vswitch_id": default_get_switches.vswitches[0].id,
                "zone_id": default_get_switches.vswitches[0].zone_id,
            },
        ])
    ids = alicloud.cen.get_transit_router_vpc_attachments_output(ids=[default_transit_router_vpc_attachment.id],
        cen_id=default_instance.id)
    pulumi.export("cenTransitRouterVpcAttachmentsId0", ids.attachments[0].id)
    ```


    :param _builtins.str cen_id: The ID of the CEN instance.
    :param Sequence[_builtins.str] ids: A list of Transit Router VPC Attachment IDs.
    :param _builtins.str name_regex: A regex string to filter results by Transit Router VPC Attachment name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the Transit Router VPC Attachment. Valid Values: `Attached`, `Attaching`, `Detaching`.
    :param _builtins.str transit_router_attachment_id: The ID of the Transit Router VPC Attachment.
    :param _builtins.str transit_router_id: The ID of the transit router.
    :param _builtins.str vpc_id: The ID of the VPC.
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterAttachmentId'] = transit_router_attachment_id
    __args__['transitRouterId'] = transit_router_id
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getTransitRouterVpcAttachments:getTransitRouterVpcAttachments', __args__, opts=opts, typ=GetTransitRouterVpcAttachmentsResult).value

    return AwaitableGetTransitRouterVpcAttachmentsResult(
        attachments=pulumi.get(__ret__, 'attachments'),
        cen_id=pulumi.get(__ret__, 'cen_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        transit_router_attachment_id=pulumi.get(__ret__, 'transit_router_attachment_id'),
        transit_router_id=pulumi.get(__ret__, 'transit_router_id'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))
def get_transit_router_vpc_attachments_output(cen_id: Optional[pulumi.Input[_builtins.str]] = None,
                                              ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                              name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                              output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                              status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                              transit_router_attachment_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                              transit_router_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                              vpc_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTransitRouterVpcAttachmentsResult]:
    """
    This data source provides the CEN Transit Router VPC Attachments of the current Alibaba Cloud user.

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
    default = alicloud.get_zones()
    default_get_networks = alicloud.vpc.get_networks(name_regex="^default-NODELETING$")
    default_get_switches = alicloud.vpc.get_switches(vpc_id=default_get_networks.ids[0],
        zone_id=default.ids[0])
    default_master = alicloud.vpc.get_switches(vpc_id=default_get_networks.ids[0],
        zone_id=default.ids[1])
    default_instance = alicloud.cen.Instance("default",
        cen_instance_name=name,
        protection_level="REDUCED")
    default_transit_router = alicloud.cen.TransitRouter("default", cen_id=default_instance.id)
    default_transit_router_vpc_attachment = alicloud.cen.TransitRouterVpcAttachment("default",
        cen_id=default_instance.id,
        vpc_id=default_get_networks.ids[0],
        transit_router_id=default_transit_router.transit_router_id,
        transit_router_attachment_name=name,
        transit_router_attachment_description=name,
        zone_mappings=[
            {
                "vswitch_id": default_master.vswitches[0].id,
                "zone_id": default_master.vswitches[0].zone_id,
            },
            {
                "vswitch_id": default_get_switches.vswitches[0].id,
                "zone_id": default_get_switches.vswitches[0].zone_id,
            },
        ])
    ids = alicloud.cen.get_transit_router_vpc_attachments_output(ids=[default_transit_router_vpc_attachment.id],
        cen_id=default_instance.id)
    pulumi.export("cenTransitRouterVpcAttachmentsId0", ids.attachments[0].id)
    ```


    :param _builtins.str cen_id: The ID of the CEN instance.
    :param Sequence[_builtins.str] ids: A list of Transit Router VPC Attachment IDs.
    :param _builtins.str name_regex: A regex string to filter results by Transit Router VPC Attachment name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the Transit Router VPC Attachment. Valid Values: `Attached`, `Attaching`, `Detaching`.
    :param _builtins.str transit_router_attachment_id: The ID of the Transit Router VPC Attachment.
    :param _builtins.str transit_router_id: The ID of the transit router.
    :param _builtins.str vpc_id: The ID of the VPC.
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterAttachmentId'] = transit_router_attachment_id
    __args__['transitRouterId'] = transit_router_id
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cen/getTransitRouterVpcAttachments:getTransitRouterVpcAttachments', __args__, opts=opts, typ=GetTransitRouterVpcAttachmentsResult)
    return __ret__.apply(lambda __response__: GetTransitRouterVpcAttachmentsResult(
        attachments=pulumi.get(__response__, 'attachments'),
        cen_id=pulumi.get(__response__, 'cen_id'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        status=pulumi.get(__response__, 'status'),
        transit_router_attachment_id=pulumi.get(__response__, 'transit_router_attachment_id'),
        transit_router_id=pulumi.get(__response__, 'transit_router_id'),
        vpc_id=pulumi.get(__response__, 'vpc_id')))
