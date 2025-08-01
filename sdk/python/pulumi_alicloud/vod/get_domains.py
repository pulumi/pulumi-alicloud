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
    'GetDomainsResult',
    'AwaitableGetDomainsResult',
    'get_domains',
    'get_domains_output',
]

@pulumi.output_type
class GetDomainsResult:
    """
    A collection of values returned by getDomains.
    """
    def __init__(__self__, domain_search_type=None, domains=None, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, tags=None):
        if domain_search_type and not isinstance(domain_search_type, str):
            raise TypeError("Expected argument 'domain_search_type' to be a str")
        pulumi.set(__self__, "domain_search_type", domain_search_type)
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
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="domainSearchType")
    def domain_search_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "domain_search_type")

    @_builtins.property
    @pulumi.getter
    def domains(self) -> Sequence['outputs.GetDomainsDomainResult']:
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
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "tags")


class AwaitableGetDomainsResult(GetDomainsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDomainsResult(
            domain_search_type=self.domain_search_type,
            domains=self.domains,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            tags=self.tags)


def get_domains(domain_search_type: Optional[_builtins.str] = None,
                ids: Optional[Sequence[_builtins.str]] = None,
                name_regex: Optional[_builtins.str] = None,
                output_file: Optional[_builtins.str] = None,
                status: Optional[_builtins.str] = None,
                tags: Optional[Mapping[str, _builtins.str]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDomainsResult:
    """
    This data source provides the Vod Domains of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default_domain = alicloud.vod.Domain("default",
        domain_name="your_domain_name",
        scope="domestic",
        sources=[{
            "source_type": "domain",
            "source_content": "your_source_content",
            "source_port": "80",
        }],
        tags={
            "key1": "value1",
            "key2": "value2",
        })
    default = alicloud.vod.get_domains_output(ids=[default_domain.id],
        tags={
            "key1": "value1",
            "key2": "value2",
        })
    pulumi.export("vodDomain", default.domains[0])
    ```


    :param _builtins.str domain_search_type: The search method. Valid values:
    :param Sequence[_builtins.str] ids: A list of Domain IDs. Its element value is same as Domain Name.
    :param _builtins.str name_regex: A regex string to filter results by Domain name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the domain name. The value of this parameter is used as a condition to filter domain names.
    :param Mapping[str, _builtins.str] tags: A mapping of tags to assign to the resource.
           * `Key`: It can be up to 64 characters in length. It cannot be a null string.
           * `Value`: It can be up to 128 characters in length. It can be a null string.
    """
    __args__ = dict()
    __args__['domainSearchType'] = domain_search_type
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vod/getDomains:getDomains', __args__, opts=opts, typ=GetDomainsResult).value

    return AwaitableGetDomainsResult(
        domain_search_type=pulumi.get(__ret__, 'domain_search_type'),
        domains=pulumi.get(__ret__, 'domains'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'))
def get_domains_output(domain_search_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                       name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       tags: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDomainsResult]:
    """
    This data source provides the Vod Domains of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default_domain = alicloud.vod.Domain("default",
        domain_name="your_domain_name",
        scope="domestic",
        sources=[{
            "source_type": "domain",
            "source_content": "your_source_content",
            "source_port": "80",
        }],
        tags={
            "key1": "value1",
            "key2": "value2",
        })
    default = alicloud.vod.get_domains_output(ids=[default_domain.id],
        tags={
            "key1": "value1",
            "key2": "value2",
        })
    pulumi.export("vodDomain", default.domains[0])
    ```


    :param _builtins.str domain_search_type: The search method. Valid values:
    :param Sequence[_builtins.str] ids: A list of Domain IDs. Its element value is same as Domain Name.
    :param _builtins.str name_regex: A regex string to filter results by Domain name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str status: The status of the domain name. The value of this parameter is used as a condition to filter domain names.
    :param Mapping[str, _builtins.str] tags: A mapping of tags to assign to the resource.
           * `Key`: It can be up to 64 characters in length. It cannot be a null string.
           * `Value`: It can be up to 128 characters in length. It can be a null string.
    """
    __args__ = dict()
    __args__['domainSearchType'] = domain_search_type
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:vod/getDomains:getDomains', __args__, opts=opts, typ=GetDomainsResult)
    return __ret__.apply(lambda __response__: GetDomainsResult(
        domain_search_type=pulumi.get(__response__, 'domain_search_type'),
        domains=pulumi.get(__response__, 'domains'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        status=pulumi.get(__response__, 'status'),
        tags=pulumi.get(__response__, 'tags')))
