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
    'GetVbrHealthChecksResult',
    'AwaitableGetVbrHealthChecksResult',
    'get_vbr_health_checks',
    'get_vbr_health_checks_output',
]

@pulumi.output_type
class GetVbrHealthChecksResult:
    """
    A collection of values returned by getVbrHealthChecks.
    """
    def __init__(__self__, cen_id=None, checks=None, id=None, ids=None, output_file=None, vbr_instance_id=None, vbr_instance_owner_id=None, vbr_instance_region_id=None):
        if cen_id and not isinstance(cen_id, str):
            raise TypeError("Expected argument 'cen_id' to be a str")
        pulumi.set(__self__, "cen_id", cen_id)
        if checks and not isinstance(checks, list):
            raise TypeError("Expected argument 'checks' to be a list")
        pulumi.set(__self__, "checks", checks)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if vbr_instance_id and not isinstance(vbr_instance_id, str):
            raise TypeError("Expected argument 'vbr_instance_id' to be a str")
        pulumi.set(__self__, "vbr_instance_id", vbr_instance_id)
        if vbr_instance_owner_id and not isinstance(vbr_instance_owner_id, int):
            raise TypeError("Expected argument 'vbr_instance_owner_id' to be a int")
        pulumi.set(__self__, "vbr_instance_owner_id", vbr_instance_owner_id)
        if vbr_instance_region_id and not isinstance(vbr_instance_region_id, str):
            raise TypeError("Expected argument 'vbr_instance_region_id' to be a str")
        pulumi.set(__self__, "vbr_instance_region_id", vbr_instance_region_id)

    @_builtins.property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[_builtins.str]:
        """
        The ID of the Cloud Enterprise Network (CEN) instance.
        """
        return pulumi.get(self, "cen_id")

    @_builtins.property
    @pulumi.getter
    def checks(self) -> Sequence['outputs.GetVbrHealthChecksCheckResult']:
        """
        A list of CEN VBR Heath Checks. Each element contains the following attributes:
        """
        return pulumi.get(self, "checks")

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
        """
        A list of the CEN VBR Heath Check IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="vbrInstanceId")
    def vbr_instance_id(self) -> Optional[_builtins.str]:
        """
        The ID of the VBR instance.
        """
        return pulumi.get(self, "vbr_instance_id")

    @_builtins.property
    @pulumi.getter(name="vbrInstanceOwnerId")
    def vbr_instance_owner_id(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "vbr_instance_owner_id")

    @_builtins.property
    @pulumi.getter(name="vbrInstanceRegionId")
    def vbr_instance_region_id(self) -> _builtins.str:
        """
        The ID of the region where the VBR instance is deployed.
        """
        return pulumi.get(self, "vbr_instance_region_id")


class AwaitableGetVbrHealthChecksResult(GetVbrHealthChecksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVbrHealthChecksResult(
            cen_id=self.cen_id,
            checks=self.checks,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            vbr_instance_id=self.vbr_instance_id,
            vbr_instance_owner_id=self.vbr_instance_owner_id,
            vbr_instance_region_id=self.vbr_instance_region_id)


def get_vbr_health_checks(cen_id: Optional[_builtins.str] = None,
                          output_file: Optional[_builtins.str] = None,
                          vbr_instance_id: Optional[_builtins.str] = None,
                          vbr_instance_owner_id: Optional[_builtins.int] = None,
                          vbr_instance_region_id: Optional[_builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVbrHealthChecksResult:
    """
    This data source provides CEN VBR Health Checks available to the user.

    > **NOTE:** Available in 1.98.0+


    :param _builtins.str cen_id: The ID of the Cloud Enterprise Network (CEN) instance.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str vbr_instance_id: The ID of the VBR instance.
    :param _builtins.int vbr_instance_owner_id: The User ID (UID) of the account to which the VBR instance belongs.
    :param _builtins.str vbr_instance_region_id: The ID of the region where the VBR instance is deployed.
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['outputFile'] = output_file
    __args__['vbrInstanceId'] = vbr_instance_id
    __args__['vbrInstanceOwnerId'] = vbr_instance_owner_id
    __args__['vbrInstanceRegionId'] = vbr_instance_region_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getVbrHealthChecks:getVbrHealthChecks', __args__, opts=opts, typ=GetVbrHealthChecksResult).value

    return AwaitableGetVbrHealthChecksResult(
        cen_id=pulumi.get(__ret__, 'cen_id'),
        checks=pulumi.get(__ret__, 'checks'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        vbr_instance_id=pulumi.get(__ret__, 'vbr_instance_id'),
        vbr_instance_owner_id=pulumi.get(__ret__, 'vbr_instance_owner_id'),
        vbr_instance_region_id=pulumi.get(__ret__, 'vbr_instance_region_id'))
def get_vbr_health_checks_output(cen_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                 vbr_instance_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                 vbr_instance_owner_id: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                 vbr_instance_region_id: Optional[pulumi.Input[_builtins.str]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetVbrHealthChecksResult]:
    """
    This data source provides CEN VBR Health Checks available to the user.

    > **NOTE:** Available in 1.98.0+


    :param _builtins.str cen_id: The ID of the Cloud Enterprise Network (CEN) instance.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str vbr_instance_id: The ID of the VBR instance.
    :param _builtins.int vbr_instance_owner_id: The User ID (UID) of the account to which the VBR instance belongs.
    :param _builtins.str vbr_instance_region_id: The ID of the region where the VBR instance is deployed.
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['outputFile'] = output_file
    __args__['vbrInstanceId'] = vbr_instance_id
    __args__['vbrInstanceOwnerId'] = vbr_instance_owner_id
    __args__['vbrInstanceRegionId'] = vbr_instance_region_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cen/getVbrHealthChecks:getVbrHealthChecks', __args__, opts=opts, typ=GetVbrHealthChecksResult)
    return __ret__.apply(lambda __response__: GetVbrHealthChecksResult(
        cen_id=pulumi.get(__response__, 'cen_id'),
        checks=pulumi.get(__response__, 'checks'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        output_file=pulumi.get(__response__, 'output_file'),
        vbr_instance_id=pulumi.get(__response__, 'vbr_instance_id'),
        vbr_instance_owner_id=pulumi.get(__response__, 'vbr_instance_owner_id'),
        vbr_instance_region_id=pulumi.get(__response__, 'vbr_instance_region_id')))
