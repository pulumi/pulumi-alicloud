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
    'GetGatewaysResult',
    'AwaitableGetGatewaysResult',
    'get_gateways',
    'get_gateways_output',
]

@pulumi.output_type
class GetGatewaysResult:
    """
    A collection of values returned by getGateways.
    """
    def __init__(__self__, enable_details=None, gateways=None, id=None, ids=None, name_regex=None, names=None, output_file=None, search_key=None, status=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if gateways and not isinstance(gateways, list):
            raise TypeError("Expected argument 'gateways' to be a list")
        pulumi.set(__self__, "gateways", gateways)
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
        if search_key and not isinstance(search_key, str):
            raise TypeError("Expected argument 'search_key' to be a str")
        pulumi.set(__self__, "search_key", search_key)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_details")

    @_builtins.property
    @pulumi.getter
    def gateways(self) -> Sequence['outputs.GetGatewaysGatewayResult']:
        return pulumi.get(self, "gateways")

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
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="searchKey")
    def search_key(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "search_key")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "status")


class AwaitableGetGatewaysResult(GetGatewaysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGatewaysResult(
            enable_details=self.enable_details,
            gateways=self.gateways,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            search_key=self.search_key,
            status=self.status)


def get_gateways(enable_details: Optional[_builtins.bool] = None,
                 ids: Optional[Sequence[_builtins.str]] = None,
                 name_regex: Optional[_builtins.str] = None,
                 output_file: Optional[_builtins.str] = None,
                 search_key: Optional[_builtins.str] = None,
                 status: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGatewaysResult:
    """
    This data source provides the Database Gateway Gateways of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.135.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.databasegateway.get_gateways(ids=["example_id"])
    pulumi.export("databaseGatewayGatewayId1", ids.gateways[0].id)
    name_regex = alicloud.databasegateway.get_gateways(name_regex="^my-Gateway")
    pulumi.export("databaseGatewayGatewayId2", name_regex.gateways[0].id)
    ```


    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of Gateway IDs.
    :param _builtins.str name_regex: A regex string to filter results by Gateway name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str search_key: The search key.
    :param _builtins.str status: The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['searchKey'] = search_key
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:databasegateway/getGateways:getGateways', __args__, opts=opts, typ=GetGatewaysResult).value

    return AwaitableGetGatewaysResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        gateways=pulumi.get(__ret__, 'gateways'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        search_key=pulumi.get(__ret__, 'search_key'),
        status=pulumi.get(__ret__, 'status'))
def get_gateways_output(enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                        ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                        name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        search_key: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGatewaysResult]:
    """
    This data source provides the Database Gateway Gateways of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.135.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.databasegateway.get_gateways(ids=["example_id"])
    pulumi.export("databaseGatewayGatewayId1", ids.gateways[0].id)
    name_regex = alicloud.databasegateway.get_gateways(name_regex="^my-Gateway")
    pulumi.export("databaseGatewayGatewayId2", name_regex.gateways[0].id)
    ```


    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of Gateway IDs.
    :param _builtins.str name_regex: A regex string to filter results by Gateway name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str search_key: The search key.
    :param _builtins.str status: The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['searchKey'] = search_key
    __args__['status'] = status
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:databasegateway/getGateways:getGateways', __args__, opts=opts, typ=GetGatewaysResult)
    return __ret__.apply(lambda __response__: GetGatewaysResult(
        enable_details=pulumi.get(__response__, 'enable_details'),
        gateways=pulumi.get(__response__, 'gateways'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        search_key=pulumi.get(__response__, 'search_key'),
        status=pulumi.get(__response__, 'status')))
