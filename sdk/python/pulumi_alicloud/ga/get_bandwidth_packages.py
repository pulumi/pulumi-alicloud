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
    'GetBandwidthPackagesResult',
    'AwaitableGetBandwidthPackagesResult',
    'get_bandwidth_packages',
    'get_bandwidth_packages_output',
]

@pulumi.output_type
class GetBandwidthPackagesResult:
    """
    A collection of values returned by getBandwidthPackages.
    """
    def __init__(__self__, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, packages=None, status=None, type=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
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
        if packages and not isinstance(packages, list):
            raise TypeError("Expected argument 'packages' to be a list")
        pulumi.set(__self__, "packages", packages)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_details")

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
        A list of Bandwidth Package names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def packages(self) -> Sequence['outputs.GetBandwidthPackagesPackageResult']:
        """
        A list of Ga Bandwidth Packages. Each element contains the following attributes:
        """
        return pulumi.get(self, "packages")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        """
        The status of the bandwidth plan.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[_builtins.str]:
        """
        The type of the bandwidth packet. China station only supports return to basic.
        """
        return pulumi.get(self, "type")


class AwaitableGetBandwidthPackagesResult(GetBandwidthPackagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBandwidthPackagesResult(
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            packages=self.packages,
            status=self.status,
            type=self.type)


def get_bandwidth_packages(enable_details: Optional[_builtins.bool] = None,
                           ids: Optional[Sequence[_builtins.str]] = None,
                           name_regex: Optional[_builtins.str] = None,
                           output_file: Optional[_builtins.str] = None,
                           status: Optional[_builtins.str] = None,
                           type: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBandwidthPackagesResult:
    """
    This data source provides the Global Accelerator (GA) Bandwidth Packages of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.112.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.ga.get_bandwidth_packages(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstGaBandwidthPackageId", example.packages[0].id)
    ```


    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of Bandwidth Package IDs.
    :param _builtins.str name_regex: A regex string to filter results by Bandwidth Package name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the bandwidth plan. Valid values: `active`, `binded`, `binding`, `finacialLocked`, `init`, `unbinding`, `updating`.
    :param _builtins.str type: The type of the bandwidth plan. Valid values: `Basic`, `CrossDomain`.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ga/getBandwidthPackages:getBandwidthPackages', __args__, opts=opts, typ=GetBandwidthPackagesResult).value

    return AwaitableGetBandwidthPackagesResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        packages=pulumi.get(__ret__, 'packages'),
        status=pulumi.get(__ret__, 'status'),
        type=pulumi.get(__ret__, 'type'))
def get_bandwidth_packages_output(enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                  ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                  name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBandwidthPackagesResult]:
    """
    This data source provides the Global Accelerator (GA) Bandwidth Packages of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.112.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.ga.get_bandwidth_packages(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstGaBandwidthPackageId", example.packages[0].id)
    ```


    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of Bandwidth Package IDs.
    :param _builtins.str name_regex: A regex string to filter results by Bandwidth Package name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the bandwidth plan. Valid values: `active`, `binded`, `binding`, `finacialLocked`, `init`, `unbinding`, `updating`.
    :param _builtins.str type: The type of the bandwidth plan. Valid values: `Basic`, `CrossDomain`.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['type'] = type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:ga/getBandwidthPackages:getBandwidthPackages', __args__, opts=opts, typ=GetBandwidthPackagesResult)
    return __ret__.apply(lambda __response__: GetBandwidthPackagesResult(
        enable_details=pulumi.get(__response__, 'enable_details'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        packages=pulumi.get(__response__, 'packages'),
        status=pulumi.get(__response__, 'status'),
        type=pulumi.get(__response__, 'type')))
