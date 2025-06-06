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
    'GetTransitRouterPeerAttachmentsResult',
    'AwaitableGetTransitRouterPeerAttachmentsResult',
    'get_transit_router_peer_attachments',
    'get_transit_router_peer_attachments_output',
]

@pulumi.output_type
class GetTransitRouterPeerAttachmentsResult:
    """
    A collection of values returned by getTransitRouterPeerAttachments.
    """
    def __init__(__self__, attachments=None, cen_id=None, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, transit_router_attachment_id=None, transit_router_id=None):
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

    @property
    @pulumi.getter
    def attachments(self) -> Sequence['outputs.GetTransitRouterPeerAttachmentsAttachmentResult']:
        return pulumi.get(self, "attachments")

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> builtins.str:
        return pulumi.get(self, "cen_id")

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
        """
        A list of CEN Transit Router peer attachments IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[builtins.str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[builtins.str]:
        """
        A list of CEN Transit Router peer attachments names.
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
        The status of the transit router attachment.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> Optional[builtins.str]:
        """
        ID of the transit router attachment.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[builtins.str]:
        """
        ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")


class AwaitableGetTransitRouterPeerAttachmentsResult(GetTransitRouterPeerAttachmentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitRouterPeerAttachmentsResult(
            attachments=self.attachments,
            cen_id=self.cen_id,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            transit_router_attachment_id=self.transit_router_attachment_id,
            transit_router_id=self.transit_router_id)


def get_transit_router_peer_attachments(cen_id: Optional[builtins.str] = None,
                                        ids: Optional[Sequence[builtins.str]] = None,
                                        name_regex: Optional[builtins.str] = None,
                                        output_file: Optional[builtins.str] = None,
                                        status: Optional[builtins.str] = None,
                                        transit_router_attachment_id: Optional[builtins.str] = None,
                                        transit_router_id: Optional[builtins.str] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitRouterPeerAttachmentsResult:
    """
    This data source provides CEN Transit Router peer attachments available to the user.

    > **NOTE:** Available in 1.128.0+


    :param builtins.str cen_id: ID of the CEN instance.
    :param Sequence[builtins.str] ids: A list of CEN Transit Router peer attachments IDs.
    :param builtins.str name_regex: A regex string to filter CEN Transit Router peer attachments by name.
    :param builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param builtins.str status: The status of CEN Transit Router peer attachment. Valid values `Attached`, `Attaching` and `Detaching`.
    :param builtins.str transit_router_attachment_id: The ID of CEN Transit Router peer attachments.
    :param builtins.str transit_router_id: The ID of transit router.
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterAttachmentId'] = transit_router_attachment_id
    __args__['transitRouterId'] = transit_router_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getTransitRouterPeerAttachments:getTransitRouterPeerAttachments', __args__, opts=opts, typ=GetTransitRouterPeerAttachmentsResult).value

    return AwaitableGetTransitRouterPeerAttachmentsResult(
        attachments=pulumi.get(__ret__, 'attachments'),
        cen_id=pulumi.get(__ret__, 'cen_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        transit_router_attachment_id=pulumi.get(__ret__, 'transit_router_attachment_id'),
        transit_router_id=pulumi.get(__ret__, 'transit_router_id'))
def get_transit_router_peer_attachments_output(cen_id: Optional[pulumi.Input[builtins.str]] = None,
                                               ids: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                               name_regex: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                               output_file: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                               status: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                               transit_router_attachment_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                               transit_router_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTransitRouterPeerAttachmentsResult]:
    """
    This data source provides CEN Transit Router peer attachments available to the user.

    > **NOTE:** Available in 1.128.0+


    :param builtins.str cen_id: ID of the CEN instance.
    :param Sequence[builtins.str] ids: A list of CEN Transit Router peer attachments IDs.
    :param builtins.str name_regex: A regex string to filter CEN Transit Router peer attachments by name.
    :param builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param builtins.str status: The status of CEN Transit Router peer attachment. Valid values `Attached`, `Attaching` and `Detaching`.
    :param builtins.str transit_router_attachment_id: The ID of CEN Transit Router peer attachments.
    :param builtins.str transit_router_id: The ID of transit router.
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterAttachmentId'] = transit_router_attachment_id
    __args__['transitRouterId'] = transit_router_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cen/getTransitRouterPeerAttachments:getTransitRouterPeerAttachments', __args__, opts=opts, typ=GetTransitRouterPeerAttachmentsResult)
    return __ret__.apply(lambda __response__: GetTransitRouterPeerAttachmentsResult(
        attachments=pulumi.get(__response__, 'attachments'),
        cen_id=pulumi.get(__response__, 'cen_id'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        status=pulumi.get(__response__, 'status'),
        transit_router_attachment_id=pulumi.get(__response__, 'transit_router_attachment_id'),
        transit_router_id=pulumi.get(__response__, 'transit_router_id')))
