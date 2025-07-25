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
    'GetMetricRuleTemplatesResult',
    'AwaitableGetMetricRuleTemplatesResult',
    'get_metric_rule_templates',
    'get_metric_rule_templates_output',
]

@pulumi.output_type
class GetMetricRuleTemplatesResult:
    """
    A collection of values returned by getMetricRuleTemplates.
    """
    def __init__(__self__, enable_details=None, id=None, ids=None, keyword=None, metric_rule_template_name=None, name_regex=None, names=None, output_file=None, template_id=None, templates=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if keyword and not isinstance(keyword, str):
            raise TypeError("Expected argument 'keyword' to be a str")
        pulumi.set(__self__, "keyword", keyword)
        if metric_rule_template_name and not isinstance(metric_rule_template_name, str):
            raise TypeError("Expected argument 'metric_rule_template_name' to be a str")
        pulumi.set(__self__, "metric_rule_template_name", metric_rule_template_name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if template_id and not isinstance(template_id, str):
            raise TypeError("Expected argument 'template_id' to be a str")
        pulumi.set(__self__, "template_id", template_id)
        if templates and not isinstance(templates, list):
            raise TypeError("Expected argument 'templates' to be a list")
        pulumi.set(__self__, "templates", templates)

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
    @pulumi.getter
    def keyword(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "keyword")

    @_builtins.property
    @pulumi.getter(name="metricRuleTemplateName")
    def metric_rule_template_name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "metric_rule_template_name")

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
    @pulumi.getter(name="templateId")
    def template_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "template_id")

    @_builtins.property
    @pulumi.getter
    def templates(self) -> Sequence['outputs.GetMetricRuleTemplatesTemplateResult']:
        return pulumi.get(self, "templates")


class AwaitableGetMetricRuleTemplatesResult(GetMetricRuleTemplatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMetricRuleTemplatesResult(
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            keyword=self.keyword,
            metric_rule_template_name=self.metric_rule_template_name,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            template_id=self.template_id,
            templates=self.templates)


def get_metric_rule_templates(enable_details: Optional[_builtins.bool] = None,
                              ids: Optional[Sequence[_builtins.str]] = None,
                              keyword: Optional[_builtins.str] = None,
                              metric_rule_template_name: Optional[_builtins.str] = None,
                              name_regex: Optional[_builtins.str] = None,
                              output_file: Optional[_builtins.str] = None,
                              template_id: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMetricRuleTemplatesResult:
    """
    This data source provides the Cms Metric Rule Templates of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.134.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cms.get_metric_rule_templates(ids=["example_value"])
    pulumi.export("cmsMetricRuleTemplateId1", ids.templates[0].id)
    name_regex = alicloud.cms.get_metric_rule_templates(name_regex="^my-MetricRuleTemplate")
    pulumi.export("cmsMetricRuleTemplateId2", name_regex.templates[0].id)
    keyword = alicloud.cms.get_metric_rule_templates(keyword="^my-MetricRuleTemplate")
    pulumi.export("cmsMetricRuleTemplateId3", name_regex.templates[0].id)
    template_id = alicloud.cms.get_metric_rule_templates(template_id="example_value")
    pulumi.export("cmsMetricRuleTemplateId4", name_regex.templates[0].id)
    ```


    :param _builtins.bool enable_details: Valid values: `true` or `false`. Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of Metric Rule Template IDs.
    :param _builtins.str keyword: The name of the alert template. You can perform fuzzy search based on the template name.
    :param _builtins.str metric_rule_template_name: The name of the alert template.
    :param _builtins.str name_regex: A regex string to filter results by Metric Rule Template name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str template_id: The ID of the alert template.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['keyword'] = keyword
    __args__['metricRuleTemplateName'] = metric_rule_template_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['templateId'] = template_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cms/getMetricRuleTemplates:getMetricRuleTemplates', __args__, opts=opts, typ=GetMetricRuleTemplatesResult).value

    return AwaitableGetMetricRuleTemplatesResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        keyword=pulumi.get(__ret__, 'keyword'),
        metric_rule_template_name=pulumi.get(__ret__, 'metric_rule_template_name'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        template_id=pulumi.get(__ret__, 'template_id'),
        templates=pulumi.get(__ret__, 'templates'))
def get_metric_rule_templates_output(enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                     ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                     keyword: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                     metric_rule_template_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                     name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                     output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                     template_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMetricRuleTemplatesResult]:
    """
    This data source provides the Cms Metric Rule Templates of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.134.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cms.get_metric_rule_templates(ids=["example_value"])
    pulumi.export("cmsMetricRuleTemplateId1", ids.templates[0].id)
    name_regex = alicloud.cms.get_metric_rule_templates(name_regex="^my-MetricRuleTemplate")
    pulumi.export("cmsMetricRuleTemplateId2", name_regex.templates[0].id)
    keyword = alicloud.cms.get_metric_rule_templates(keyword="^my-MetricRuleTemplate")
    pulumi.export("cmsMetricRuleTemplateId3", name_regex.templates[0].id)
    template_id = alicloud.cms.get_metric_rule_templates(template_id="example_value")
    pulumi.export("cmsMetricRuleTemplateId4", name_regex.templates[0].id)
    ```


    :param _builtins.bool enable_details: Valid values: `true` or `false`. Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[_builtins.str] ids: A list of Metric Rule Template IDs.
    :param _builtins.str keyword: The name of the alert template. You can perform fuzzy search based on the template name.
    :param _builtins.str metric_rule_template_name: The name of the alert template.
    :param _builtins.str name_regex: A regex string to filter results by Metric Rule Template name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str template_id: The ID of the alert template.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['keyword'] = keyword
    __args__['metricRuleTemplateName'] = metric_rule_template_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['templateId'] = template_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cms/getMetricRuleTemplates:getMetricRuleTemplates', __args__, opts=opts, typ=GetMetricRuleTemplatesResult)
    return __ret__.apply(lambda __response__: GetMetricRuleTemplatesResult(
        enable_details=pulumi.get(__response__, 'enable_details'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        keyword=pulumi.get(__response__, 'keyword'),
        metric_rule_template_name=pulumi.get(__response__, 'metric_rule_template_name'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        template_id=pulumi.get(__response__, 'template_id'),
        templates=pulumi.get(__response__, 'templates')))
