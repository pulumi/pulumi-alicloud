# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetNetworkAclsResult',
    'AwaitableGetNetworkAclsResult',
    'get_network_acls',
    'get_network_acls_output',
]

@pulumi.output_type
class GetNetworkAclsResult:
    """
    A collection of values returned by getNetworkAcls.
    """
    def __init__(__self__, acls=None, id=None, ids=None, name_regex=None, names=None, network_acl_name=None, output_file=None, resource_id=None, resource_type=None, status=None, vpc_id=None):
        if acls and not isinstance(acls, list):
            raise TypeError("Expected argument 'acls' to be a list")
        pulumi.set(__self__, "acls", acls)
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
        if network_acl_name and not isinstance(network_acl_name, str):
            raise TypeError("Expected argument 'network_acl_name' to be a str")
        pulumi.set(__self__, "network_acl_name", network_acl_name)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resource_id and not isinstance(resource_id, str):
            raise TypeError("Expected argument 'resource_id' to be a str")
        pulumi.set(__self__, "resource_id", resource_id)
        if resource_type and not isinstance(resource_type, str):
            raise TypeError("Expected argument 'resource_type' to be a str")
        pulumi.set(__self__, "resource_type", resource_type)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def acls(self) -> Sequence['outputs.GetNetworkAclsAclResult']:
        return pulumi.get(self, "acls")

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
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="networkAclName")
    def network_acl_name(self) -> Optional[str]:
        return pulumi.get(self, "network_acl_name")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[str]:
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> Optional[str]:
        return pulumi.get(self, "resource_type")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[str]:
        return pulumi.get(self, "vpc_id")


class AwaitableGetNetworkAclsResult(GetNetworkAclsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkAclsResult(
            acls=self.acls,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            network_acl_name=self.network_acl_name,
            output_file=self.output_file,
            resource_id=self.resource_id,
            resource_type=self.resource_type,
            status=self.status,
            vpc_id=self.vpc_id)


def get_network_acls(ids: Optional[Sequence[str]] = None,
                     name_regex: Optional[str] = None,
                     network_acl_name: Optional[str] = None,
                     output_file: Optional[str] = None,
                     resource_id: Optional[str] = None,
                     resource_type: Optional[str] = None,
                     status: Optional[str] = None,
                     vpc_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkAclsResult:
    """
    This data source provides the Network Acls of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.122.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.vpc.get_network_acls(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstNetworkAclId", example.acls[0].id)
    ```


    :param Sequence[str] ids: A list of Network Acl ID.
    :param str name_regex: A regex string to filter results by Network Acl name.
    :param str network_acl_name: The name of the network ACL.
    :param str resource_id: The ID of the associated resource.
    :param str resource_type: The type of the associated resource.
    :param str status: The state of the network ACL.
    :param str vpc_id: The ID of the associated VPC.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['networkAclName'] = network_acl_name
    __args__['outputFile'] = output_file
    __args__['resourceId'] = resource_id
    __args__['resourceType'] = resource_type
    __args__['status'] = status
    __args__['vpcId'] = vpc_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getNetworkAcls:getNetworkAcls', __args__, opts=opts, typ=GetNetworkAclsResult).value

    return AwaitableGetNetworkAclsResult(
        acls=__ret__.acls,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        network_acl_name=__ret__.network_acl_name,
        output_file=__ret__.output_file,
        resource_id=__ret__.resource_id,
        resource_type=__ret__.resource_type,
        status=__ret__.status,
        vpc_id=__ret__.vpc_id)


@_utilities.lift_output_func(get_network_acls)
def get_network_acls_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                            network_acl_name: Optional[pulumi.Input[Optional[str]]] = None,
                            output_file: Optional[pulumi.Input[Optional[str]]] = None,
                            resource_id: Optional[pulumi.Input[Optional[str]]] = None,
                            resource_type: Optional[pulumi.Input[Optional[str]]] = None,
                            status: Optional[pulumi.Input[Optional[str]]] = None,
                            vpc_id: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNetworkAclsResult]:
    """
    This data source provides the Network Acls of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.122.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.vpc.get_network_acls(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstNetworkAclId", example.acls[0].id)
    ```


    :param Sequence[str] ids: A list of Network Acl ID.
    :param str name_regex: A regex string to filter results by Network Acl name.
    :param str network_acl_name: The name of the network ACL.
    :param str resource_id: The ID of the associated resource.
    :param str resource_type: The type of the associated resource.
    :param str status: The state of the network ACL.
    :param str vpc_id: The ID of the associated VPC.
    """
    ...