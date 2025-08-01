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
    'GetInstancesResult',
    'AwaitableGetInstancesResult',
    'get_instances',
    'get_instances_output',
]

@pulumi.output_type
class GetInstancesResult:
    """
    A collection of values returned by getInstances.
    """
    def __init__(__self__, id=None, ids=None, instance_id=None, instances=None, output_file=None, page_number=None, page_size=None, renew_status=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if instances and not isinstance(instances, list):
            raise TypeError("Expected argument 'instances' to be a list")
        pulumi.set(__self__, "instances", instances)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if renew_status and not isinstance(renew_status, str):
            raise TypeError("Expected argument 'renew_status' to be a str")
        pulumi.set(__self__, "renew_status", renew_status)

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
        A list of Instance IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[_builtins.str]:
        """
        The first ID of the resource
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter
    def instances(self) -> Sequence['outputs.GetInstancesInstanceResult']:
        """
        A list of Instance Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "instances")

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
    @pulumi.getter(name="renewStatus")
    def renew_status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "renew_status")


class AwaitableGetInstancesResult(GetInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstancesResult(
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            instances=self.instances,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            renew_status=self.renew_status)


def get_instances(ids: Optional[Sequence[_builtins.str]] = None,
                  instance_id: Optional[_builtins.str] = None,
                  output_file: Optional[_builtins.str] = None,
                  page_number: Optional[_builtins.int] = None,
                  page_size: Optional[_builtins.int] = None,
                  renew_status: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstancesResult:
    """
    This data source provides Threat Detection Instance available to the user.[What is Instance](https://www.alibabacloud.com/help/en/security-center/latest/what-is-security-center)

    > **NOTE:** Available in 1.199.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.threatdetection.get_instances(ids=[default_alicloud_threat_detection_instance["id"]])
    pulumi.export("alicloudThreatDetectionInstanceExampleId", default.instances[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of Instance IDs.
    :param _builtins.str instance_id: The first ID of the resource
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str renew_status: The renewal status of the specified instance. Valid values: `AutoRenewal`, `ManualRenewal`, `NotRenewal`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['renewStatus'] = renew_status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:threatdetection/getInstances:getInstances', __args__, opts=opts, typ=GetInstancesResult).value

    return AwaitableGetInstancesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        instances=pulumi.get(__ret__, 'instances'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        renew_status=pulumi.get(__ret__, 'renew_status'))
def get_instances_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                         instance_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         page_number: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                         page_size: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                         renew_status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetInstancesResult]:
    """
    This data source provides Threat Detection Instance available to the user.[What is Instance](https://www.alibabacloud.com/help/en/security-center/latest/what-is-security-center)

    > **NOTE:** Available in 1.199.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.threatdetection.get_instances(ids=[default_alicloud_threat_detection_instance["id"]])
    pulumi.export("alicloudThreatDetectionInstanceExampleId", default.instances[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of Instance IDs.
    :param _builtins.str instance_id: The first ID of the resource
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str renew_status: The renewal status of the specified instance. Valid values: `AutoRenewal`, `ManualRenewal`, `NotRenewal`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['renewStatus'] = renew_status
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:threatdetection/getInstances:getInstances', __args__, opts=opts, typ=GetInstancesResult)
    return __ret__.apply(lambda __response__: GetInstancesResult(
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        instance_id=pulumi.get(__response__, 'instance_id'),
        instances=pulumi.get(__response__, 'instances'),
        output_file=pulumi.get(__response__, 'output_file'),
        page_number=pulumi.get(__response__, 'page_number'),
        page_size=pulumi.get(__response__, 'page_size'),
        renew_status=pulumi.get(__response__, 'renew_status')))
