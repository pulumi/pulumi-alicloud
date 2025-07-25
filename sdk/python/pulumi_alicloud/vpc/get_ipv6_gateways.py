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
    'GetIpv6GatewaysResult',
    'AwaitableGetIpv6GatewaysResult',
    'get_ipv6_gateways',
    'get_ipv6_gateways_output',
]

@pulumi.output_type
class GetIpv6GatewaysResult:
    """
    A collection of values returned by getIpv6Gateways.
    """
    def __init__(__self__, gateways=None, id=None, ids=None, ipv6_gateway_name=None, name_regex=None, names=None, output_file=None, status=None, vpc_id=None):
        if gateways and not isinstance(gateways, list):
            raise TypeError("Expected argument 'gateways' to be a list")
        pulumi.set(__self__, "gateways", gateways)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if ipv6_gateway_name and not isinstance(ipv6_gateway_name, str):
            raise TypeError("Expected argument 'ipv6_gateway_name' to be a str")
        pulumi.set(__self__, "ipv6_gateway_name", ipv6_gateway_name)
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
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @_builtins.property
    @pulumi.getter
    def gateways(self) -> Sequence['outputs.GetIpv6GatewaysGatewayResult']:
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
    @pulumi.getter(name="ipv6GatewayName")
    def ipv6_gateway_name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "ipv6_gateway_name")

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
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "vpc_id")


class AwaitableGetIpv6GatewaysResult(GetIpv6GatewaysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpv6GatewaysResult(
            gateways=self.gateways,
            id=self.id,
            ids=self.ids,
            ipv6_gateway_name=self.ipv6_gateway_name,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            vpc_id=self.vpc_id)


def get_ipv6_gateways(ids: Optional[Sequence[_builtins.str]] = None,
                      ipv6_gateway_name: Optional[_builtins.str] = None,
                      name_regex: Optional[_builtins.str] = None,
                      output_file: Optional[_builtins.str] = None,
                      status: Optional[_builtins.str] = None,
                      vpc_id: Optional[_builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpv6GatewaysResult:
    """
    This data source provides the Vpc Ipv6 Gateways of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.142.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_ipv6_gateways(ids=["example_id"])
    pulumi.export("vpcIpv6GatewayId1", ids.gateways[0].id)
    name_regex = alicloud.vpc.get_ipv6_gateways(name_regex="^my-Ipv6Gateway")
    pulumi.export("vpcIpv6GatewayId2", name_regex.gateways[0].id)
    vpc_id = alicloud.vpc.get_ipv6_gateways(ids=["example_id"],
        vpc_id="example_value")
    pulumi.export("vpcIpv6GatewayId3", vpc_id.gateways[0].id)
    status = alicloud.vpc.get_ipv6_gateways(ids=["example_id"],
        status="Available")
    pulumi.export("vpcIpv6GatewayId4", status.gateways[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of Ipv6 Gateway IDs.
    :param _builtins.str ipv6_gateway_name: The name of the IPv6 gateway.
    :param _builtins.str name_regex: A regex string to filter results by Ipv6 Gateway name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
    :param _builtins.str vpc_id: The ID of the virtual private cloud (VPC) to which the IPv6 gateway belongs.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['ipv6GatewayName'] = ipv6_gateway_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getIpv6Gateways:getIpv6Gateways', __args__, opts=opts, typ=GetIpv6GatewaysResult).value

    return AwaitableGetIpv6GatewaysResult(
        gateways=pulumi.get(__ret__, 'gateways'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        ipv6_gateway_name=pulumi.get(__ret__, 'ipv6_gateway_name'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))
def get_ipv6_gateways_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                             ipv6_gateway_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             vpc_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIpv6GatewaysResult]:
    """
    This data source provides the Vpc Ipv6 Gateways of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.142.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_ipv6_gateways(ids=["example_id"])
    pulumi.export("vpcIpv6GatewayId1", ids.gateways[0].id)
    name_regex = alicloud.vpc.get_ipv6_gateways(name_regex="^my-Ipv6Gateway")
    pulumi.export("vpcIpv6GatewayId2", name_regex.gateways[0].id)
    vpc_id = alicloud.vpc.get_ipv6_gateways(ids=["example_id"],
        vpc_id="example_value")
    pulumi.export("vpcIpv6GatewayId3", vpc_id.gateways[0].id)
    status = alicloud.vpc.get_ipv6_gateways(ids=["example_id"],
        status="Available")
    pulumi.export("vpcIpv6GatewayId4", status.gateways[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of Ipv6 Gateway IDs.
    :param _builtins.str ipv6_gateway_name: The name of the IPv6 gateway.
    :param _builtins.str name_regex: A regex string to filter results by Ipv6 Gateway name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
    :param _builtins.str vpc_id: The ID of the virtual private cloud (VPC) to which the IPv6 gateway belongs.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['ipv6GatewayName'] = ipv6_gateway_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:vpc/getIpv6Gateways:getIpv6Gateways', __args__, opts=opts, typ=GetIpv6GatewaysResult)
    return __ret__.apply(lambda __response__: GetIpv6GatewaysResult(
        gateways=pulumi.get(__response__, 'gateways'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        ipv6_gateway_name=pulumi.get(__response__, 'ipv6_gateway_name'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        status=pulumi.get(__response__, 'status'),
        vpc_id=pulumi.get(__response__, 'vpc_id')))
