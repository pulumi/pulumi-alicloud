# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = [
    'GetApplicationInfosResult',
    'AwaitableGetApplicationInfosResult',
    'get_application_infos',
]

@pulumi.output_type
class GetApplicationInfosResult:
    """
    A collection of values returned by getApplicationInfos.
    """
    def __init__(__self__, dimensions=None, enable_details=None, id=None, ids=None, infos=None, output_file=None, product_code=None, quota_action_code=None, quota_category=None, status=None):
        if dimensions and not isinstance(dimensions, list):
            raise TypeError("Expected argument 'dimensions' to be a list")
        pulumi.set(__self__, "dimensions", dimensions)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if infos and not isinstance(infos, list):
            raise TypeError("Expected argument 'infos' to be a list")
        pulumi.set(__self__, "infos", infos)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if product_code and not isinstance(product_code, str):
            raise TypeError("Expected argument 'product_code' to be a str")
        pulumi.set(__self__, "product_code", product_code)
        if quota_action_code and not isinstance(quota_action_code, str):
            raise TypeError("Expected argument 'quota_action_code' to be a str")
        pulumi.set(__self__, "quota_action_code", quota_action_code)
        if quota_category and not isinstance(quota_category, str):
            raise TypeError("Expected argument 'quota_category' to be a str")
        pulumi.set(__self__, "quota_category", quota_category)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def dimensions(self) -> Optional[Sequence['outputs.GetApplicationInfosDimensionResult']]:
        return pulumi.get(self, "dimensions")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

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
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def infos(self) -> Sequence['outputs.GetApplicationInfosInfoResult']:
        return pulumi.get(self, "infos")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> str:
        return pulumi.get(self, "product_code")

    @property
    @pulumi.getter(name="quotaActionCode")
    def quota_action_code(self) -> Optional[str]:
        return pulumi.get(self, "quota_action_code")

    @property
    @pulumi.getter(name="quotaCategory")
    def quota_category(self) -> Optional[str]:
        return pulumi.get(self, "quota_category")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetApplicationInfosResult(GetApplicationInfosResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApplicationInfosResult(
            dimensions=self.dimensions,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            infos=self.infos,
            output_file=self.output_file,
            product_code=self.product_code,
            quota_action_code=self.quota_action_code,
            quota_category=self.quota_category,
            status=self.status)


def get_application_infos(dimensions: Optional[Sequence[pulumi.InputType['GetApplicationInfosDimensionArgs']]] = None,
                          enable_details: Optional[bool] = None,
                          ids: Optional[Sequence[str]] = None,
                          output_file: Optional[str] = None,
                          product_code: Optional[str] = None,
                          quota_action_code: Optional[str] = None,
                          quota_category: Optional[str] = None,
                          status: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApplicationInfosResult:
    """
    This data source provides the Quotas Application Infos of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.115.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.quotas.get_application_infos(product_code="ess",
        ids=["4621F886-81E9-xxxx-xxxx"])
    pulumi.export("firstQuotasApplicationInfoId", example.infos[0].id)
    ```


    :param Sequence[pulumi.InputType['GetApplicationInfosDimensionArgs']] dimensions: The quota dimensions.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Application Info IDs.
    :param str product_code: The product code.
    :param str quota_action_code: The ID of quota action..
    :param str quota_category: The quota category. Valid values: `CommonQuota`, `FlowControl`.
    :param str status: The status of the quota application.
    """
    __args__ = dict()
    __args__['dimensions'] = dimensions
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['productCode'] = product_code
    __args__['quotaActionCode'] = quota_action_code
    __args__['quotaCategory'] = quota_category
    __args__['status'] = status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:quotas/getApplicationInfos:getApplicationInfos', __args__, opts=opts, typ=GetApplicationInfosResult).value

    return AwaitableGetApplicationInfosResult(
        dimensions=__ret__.dimensions,
        enable_details=__ret__.enable_details,
        id=__ret__.id,
        ids=__ret__.ids,
        infos=__ret__.infos,
        output_file=__ret__.output_file,
        product_code=__ret__.product_code,
        quota_action_code=__ret__.quota_action_code,
        quota_category=__ret__.quota_category,
        status=__ret__.status)