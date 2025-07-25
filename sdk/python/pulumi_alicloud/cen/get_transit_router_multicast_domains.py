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
    'GetTransitRouterMulticastDomainsResult',
    'AwaitableGetTransitRouterMulticastDomainsResult',
    'get_transit_router_multicast_domains',
    'get_transit_router_multicast_domains_output',
]

@pulumi.output_type
class GetTransitRouterMulticastDomainsResult:
    """
    A collection of values returned by getTransitRouterMulticastDomains.
    """
    def __init__(__self__, domains=None, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, transit_router_id=None, transit_router_multicast_domain_id=None):
        if domains and not isinstance(domains, list):
            raise TypeError("Expected argument 'domains' to be a list")
        pulumi.set(__self__, "domains", domains)
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
        if transit_router_id and not isinstance(transit_router_id, str):
            raise TypeError("Expected argument 'transit_router_id' to be a str")
        pulumi.set(__self__, "transit_router_id", transit_router_id)
        if transit_router_multicast_domain_id and not isinstance(transit_router_multicast_domain_id, str):
            raise TypeError("Expected argument 'transit_router_multicast_domain_id' to be a str")
        pulumi.set(__self__, "transit_router_multicast_domain_id", transit_router_multicast_domain_id)

    @_builtins.property
    @pulumi.getter
    def domains(self) -> Sequence['outputs.GetTransitRouterMulticastDomainsDomainResult']:
        """
        A list of Cen Transit Router Multicast Domains. Each element contains the following attributes:
        """
        return pulumi.get(self, "domains")

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
        A list of Transit Router Multicast Domain names.
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
        The status of the Transit Router Multicast Domain.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> _builtins.str:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @_builtins.property
    @pulumi.getter(name="transitRouterMulticastDomainId")
    def transit_router_multicast_domain_id(self) -> Optional[_builtins.str]:
        """
        The ID of the Transit Router Multicast Domain.
        """
        return pulumi.get(self, "transit_router_multicast_domain_id")


class AwaitableGetTransitRouterMulticastDomainsResult(GetTransitRouterMulticastDomainsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitRouterMulticastDomainsResult(
            domains=self.domains,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            transit_router_id=self.transit_router_id,
            transit_router_multicast_domain_id=self.transit_router_multicast_domain_id)


def get_transit_router_multicast_domains(ids: Optional[Sequence[_builtins.str]] = None,
                                         name_regex: Optional[_builtins.str] = None,
                                         output_file: Optional[_builtins.str] = None,
                                         status: Optional[_builtins.str] = None,
                                         transit_router_id: Optional[_builtins.str] = None,
                                         transit_router_multicast_domain_id: Optional[_builtins.str] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitRouterMulticastDomainsResult:
    """
    This data source provides the Cen Transit Router Multicast Domains of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.195.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cen.get_transit_router_multicast_domains(ids=["example_id"],
        transit_router_id="your_transit_router_id")
    pulumi.export("cenTransitRouterMulticastDomainId0", ids.domains[0].id)
    name_regex = alicloud.cen.get_transit_router_multicast_domains(name_regex="^my-name",
        transit_router_id="your_transit_router_id")
    pulumi.export("cenTransitRouterMulticastDomainId1", name_regex.domains[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of Transit Router Multicast Domain IDs.
    :param _builtins.str name_regex: A regex string to filter results by Transit Router Multicast Domain name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the multicast domain. Valid Value: `Active`.
    :param _builtins.str transit_router_id: The ID of the transit router.
    :param _builtins.str transit_router_multicast_domain_id: The ID of the multicast domain.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterId'] = transit_router_id
    __args__['transitRouterMulticastDomainId'] = transit_router_multicast_domain_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getTransitRouterMulticastDomains:getTransitRouterMulticastDomains', __args__, opts=opts, typ=GetTransitRouterMulticastDomainsResult).value

    return AwaitableGetTransitRouterMulticastDomainsResult(
        domains=pulumi.get(__ret__, 'domains'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        transit_router_id=pulumi.get(__ret__, 'transit_router_id'),
        transit_router_multicast_domain_id=pulumi.get(__ret__, 'transit_router_multicast_domain_id'))
def get_transit_router_multicast_domains_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                                name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                transit_router_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                transit_router_multicast_domain_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTransitRouterMulticastDomainsResult]:
    """
    This data source provides the Cen Transit Router Multicast Domains of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.195.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cen.get_transit_router_multicast_domains(ids=["example_id"],
        transit_router_id="your_transit_router_id")
    pulumi.export("cenTransitRouterMulticastDomainId0", ids.domains[0].id)
    name_regex = alicloud.cen.get_transit_router_multicast_domains(name_regex="^my-name",
        transit_router_id="your_transit_router_id")
    pulumi.export("cenTransitRouterMulticastDomainId1", name_regex.domains[0].id)
    ```


    :param Sequence[_builtins.str] ids: A list of Transit Router Multicast Domain IDs.
    :param _builtins.str name_regex: A regex string to filter results by Transit Router Multicast Domain name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the multicast domain. Valid Value: `Active`.
    :param _builtins.str transit_router_id: The ID of the transit router.
    :param _builtins.str transit_router_multicast_domain_id: The ID of the multicast domain.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterId'] = transit_router_id
    __args__['transitRouterMulticastDomainId'] = transit_router_multicast_domain_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cen/getTransitRouterMulticastDomains:getTransitRouterMulticastDomains', __args__, opts=opts, typ=GetTransitRouterMulticastDomainsResult)
    return __ret__.apply(lambda __response__: GetTransitRouterMulticastDomainsResult(
        domains=pulumi.get(__response__, 'domains'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        status=pulumi.get(__response__, 'status'),
        transit_router_id=pulumi.get(__response__, 'transit_router_id'),
        transit_router_multicast_domain_id=pulumi.get(__response__, 'transit_router_multicast_domain_id')))
