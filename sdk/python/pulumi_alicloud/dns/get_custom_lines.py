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
    'GetCustomLinesResult',
    'AwaitableGetCustomLinesResult',
    'get_custom_lines',
    'get_custom_lines_output',
]

@pulumi.output_type
class GetCustomLinesResult:
    """
    A collection of values returned by getCustomLines.
    """
    def __init__(__self__, domain_name=None, enable_details=None, id=None, ids=None, lang=None, lines=None, name_regex=None, names=None, output_file=None):
        if domain_name and not isinstance(domain_name, str):
            raise TypeError("Expected argument 'domain_name' to be a str")
        pulumi.set(__self__, "domain_name", domain_name)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if lang and not isinstance(lang, str):
            raise TypeError("Expected argument 'lang' to be a str")
        pulumi.set(__self__, "lang", lang)
        if lines and not isinstance(lines, list):
            raise TypeError("Expected argument 'lines' to be a list")
        pulumi.set(__self__, "lines", lines)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        return pulumi.get(self, "domain_name")

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
    def lang(self) -> Optional[str]:
        return pulumi.get(self, "lang")

    @property
    @pulumi.getter
    def lines(self) -> Sequence['outputs.GetCustomLinesLineResult']:
        return pulumi.get(self, "lines")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetCustomLinesResult(GetCustomLinesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomLinesResult(
            domain_name=self.domain_name,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            lang=self.lang,
            lines=self.lines,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_custom_lines(domain_name: Optional[str] = None,
                     enable_details: Optional[bool] = None,
                     ids: Optional[Sequence[str]] = None,
                     lang: Optional[str] = None,
                     name_regex: Optional[str] = None,
                     output_file: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomLinesResult:
    """
    This data source provides the Alidns Custom Lines of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.151.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.dns.get_custom_lines(enable_details=True,
        domain_name="your_domain_name")
    pulumi.export("alidnsCustomLineId1", ids.lines[0].id)
    ```


    :param str domain_name: The Domain name.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Custom Line IDs.
    :param str lang: The lang.
    :param str name_regex: A regex string to filter results by Custom Line name.
    """
    __args__ = dict()
    __args__['domainName'] = domain_name
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['lang'] = lang
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:dns/getCustomLines:getCustomLines', __args__, opts=opts, typ=GetCustomLinesResult).value

    return AwaitableGetCustomLinesResult(
        domain_name=__ret__.domain_name,
        enable_details=__ret__.enable_details,
        id=__ret__.id,
        ids=__ret__.ids,
        lang=__ret__.lang,
        lines=__ret__.lines,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file)


@_utilities.lift_output_func(get_custom_lines)
def get_custom_lines_output(domain_name: Optional[pulumi.Input[str]] = None,
                            enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                            ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            lang: Optional[pulumi.Input[Optional[str]]] = None,
                            name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                            output_file: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCustomLinesResult]:
    """
    This data source provides the Alidns Custom Lines of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.151.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.dns.get_custom_lines(enable_details=True,
        domain_name="your_domain_name")
    pulumi.export("alidnsCustomLineId1", ids.lines[0].id)
    ```


    :param str domain_name: The Domain name.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Custom Line IDs.
    :param str lang: The lang.
    :param str name_regex: A regex string to filter results by Custom Line name.
    """
    ...