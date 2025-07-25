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
    'GetRulesResult',
    'AwaitableGetRulesResult',
    'get_rules',
    'get_rules_output',
]

@pulumi.output_type
class GetRulesResult:
    """
    A collection of values returned by getRules.
    """
    def __init__(__self__, category=None, content_category=None, custom_type=None, enable_details=None, id=None, ids=None, name=None, name_regex=None, names=None, output_file=None, product_id=None, risk_level_id=None, rule_type=None, rules=None, status=None, warn_level=None):
        if category and not isinstance(category, int):
            raise TypeError("Expected argument 'category' to be a int")
        pulumi.set(__self__, "category", category)
        if content_category and not isinstance(content_category, str):
            raise TypeError("Expected argument 'content_category' to be a str")
        pulumi.set(__self__, "content_category", content_category)
        if custom_type and not isinstance(custom_type, int):
            raise TypeError("Expected argument 'custom_type' to be a int")
        pulumi.set(__self__, "custom_type", custom_type)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if product_id and not isinstance(product_id, str):
            raise TypeError("Expected argument 'product_id' to be a str")
        pulumi.set(__self__, "product_id", product_id)
        if risk_level_id and not isinstance(risk_level_id, str):
            raise TypeError("Expected argument 'risk_level_id' to be a str")
        pulumi.set(__self__, "risk_level_id", risk_level_id)
        if rule_type and not isinstance(rule_type, int):
            raise TypeError("Expected argument 'rule_type' to be a int")
        pulumi.set(__self__, "rule_type", rule_type)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if warn_level and not isinstance(warn_level, int):
            raise TypeError("Expected argument 'warn_level' to be a int")
        pulumi.set(__self__, "warn_level", warn_level)

    @_builtins.property
    @pulumi.getter
    def category(self) -> Optional[_builtins.int]:
        """
        Sensitive Data Identification Rules for the Type of.
        """
        return pulumi.get(self, "category")

    @_builtins.property
    @pulumi.getter(name="contentCategory")
    def content_category(self) -> Optional[_builtins.str]:
        """
        The Content Classification.
        """
        return pulumi.get(self, "content_category")

    @_builtins.property
    @pulumi.getter(name="customType")
    def custom_type(self) -> Optional[_builtins.int]:
        """
        Sensitive Data Identification Rules of Type. 0: the Built-in 1: The User-Defined.
        """
        return pulumi.get(self, "custom_type")

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
    def name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of Rule names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="productId")
    def product_id(self) -> Optional[_builtins.str]:
        """
        Product ID.
        """
        return pulumi.get(self, "product_id")

    @_builtins.property
    @pulumi.getter(name="riskLevelId")
    def risk_level_id(self) -> Optional[_builtins.str]:
        """
        Sensitive Data Identification Rules of Risk Level ID. Valid values:1:S1, Weak Risk Level. 2:S2, Medium Risk Level. 3:S3 High Risk Level. 4:S4, the Highest Risk Level.
        """
        return pulumi.get(self, "risk_level_id")

    @_builtins.property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "rule_type")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetRulesRuleResult']:
        """
        A list of Sddp Rules. Each element contains the following attributes:
        """
        return pulumi.get(self, "rules")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        """
        Sensitive Data Identification Rules Detection State of.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="warnLevel")
    def warn_level(self) -> Optional[_builtins.int]:
        """
        The Level of Risk.
        """
        return pulumi.get(self, "warn_level")


class AwaitableGetRulesResult(GetRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRulesResult(
            category=self.category,
            content_category=self.content_category,
            custom_type=self.custom_type,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name=self.name,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            product_id=self.product_id,
            risk_level_id=self.risk_level_id,
            rule_type=self.rule_type,
            rules=self.rules,
            status=self.status,
            warn_level=self.warn_level)


def get_rules(category: Optional[_builtins.int] = None,
              content_category: Optional[_builtins.str] = None,
              custom_type: Optional[_builtins.int] = None,
              enable_details: Optional[_builtins.bool] = None,
              ids: Optional[Sequence[_builtins.str]] = None,
              name: Optional[_builtins.str] = None,
              name_regex: Optional[_builtins.str] = None,
              output_file: Optional[_builtins.str] = None,
              product_id: Optional[_builtins.str] = None,
              risk_level_id: Optional[_builtins.str] = None,
              rule_type: Optional[_builtins.int] = None,
              status: Optional[_builtins.str] = None,
              warn_level: Optional[_builtins.int] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRulesResult:
    """
    This data source provides the Sddp Rules of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.132.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default_rule = alicloud.sddp.Rule("default",
        category=0,
        content="content",
        rule_name="rule_name",
        risk_level_id="4",
        product_code="ODPS")
    default = alicloud.sddp.get_rules_output(ids=[default_rule.id])
    pulumi.export("sddpRuleId", default.id)
    ```


    :param _builtins.int category: Sensitive Data Identification Rules for the Type of. Valid values:
    :param _builtins.str content_category: The Content Classification.
    :param _builtins.int custom_type: Sensitive Data Identification Rules of Type. Valid values:
    :param Sequence[_builtins.str] ids: A list of Rule IDs.
    :param _builtins.str name: The name of rule.
    :param _builtins.str name_regex: A regex string to filter results by Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str product_id: Product ID. Valid values:
    :param _builtins.str risk_level_id: Sensitive Data Identification Rules of Risk Level ID. Valid values:
    :param _builtins.int rule_type: Rule Type.
    :param _builtins.str status: Sensitive Data Identification Rules Detection State of.
    :param _builtins.int warn_level: The Level of Risk. Valid values:
    """
    __args__ = dict()
    __args__['category'] = category
    __args__['contentCategory'] = content_category
    __args__['customType'] = custom_type
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['name'] = name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['productId'] = product_id
    __args__['riskLevelId'] = risk_level_id
    __args__['ruleType'] = rule_type
    __args__['status'] = status
    __args__['warnLevel'] = warn_level
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:sddp/getRules:getRules', __args__, opts=opts, typ=GetRulesResult).value

    return AwaitableGetRulesResult(
        category=pulumi.get(__ret__, 'category'),
        content_category=pulumi.get(__ret__, 'content_category'),
        custom_type=pulumi.get(__ret__, 'custom_type'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name=pulumi.get(__ret__, 'name'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        product_id=pulumi.get(__ret__, 'product_id'),
        risk_level_id=pulumi.get(__ret__, 'risk_level_id'),
        rule_type=pulumi.get(__ret__, 'rule_type'),
        rules=pulumi.get(__ret__, 'rules'),
        status=pulumi.get(__ret__, 'status'),
        warn_level=pulumi.get(__ret__, 'warn_level'))
def get_rules_output(category: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                     content_category: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     custom_type: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                     enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                     ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                     name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     product_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     risk_level_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     rule_type: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                     status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     warn_level: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRulesResult]:
    """
    This data source provides the Sddp Rules of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.132.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default_rule = alicloud.sddp.Rule("default",
        category=0,
        content="content",
        rule_name="rule_name",
        risk_level_id="4",
        product_code="ODPS")
    default = alicloud.sddp.get_rules_output(ids=[default_rule.id])
    pulumi.export("sddpRuleId", default.id)
    ```


    :param _builtins.int category: Sensitive Data Identification Rules for the Type of. Valid values:
    :param _builtins.str content_category: The Content Classification.
    :param _builtins.int custom_type: Sensitive Data Identification Rules of Type. Valid values:
    :param Sequence[_builtins.str] ids: A list of Rule IDs.
    :param _builtins.str name: The name of rule.
    :param _builtins.str name_regex: A regex string to filter results by Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str product_id: Product ID. Valid values:
    :param _builtins.str risk_level_id: Sensitive Data Identification Rules of Risk Level ID. Valid values:
    :param _builtins.int rule_type: Rule Type.
    :param _builtins.str status: Sensitive Data Identification Rules Detection State of.
    :param _builtins.int warn_level: The Level of Risk. Valid values:
    """
    __args__ = dict()
    __args__['category'] = category
    __args__['contentCategory'] = content_category
    __args__['customType'] = custom_type
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['name'] = name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['productId'] = product_id
    __args__['riskLevelId'] = risk_level_id
    __args__['ruleType'] = rule_type
    __args__['status'] = status
    __args__['warnLevel'] = warn_level
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:sddp/getRules:getRules', __args__, opts=opts, typ=GetRulesResult)
    return __ret__.apply(lambda __response__: GetRulesResult(
        category=pulumi.get(__response__, 'category'),
        content_category=pulumi.get(__response__, 'content_category'),
        custom_type=pulumi.get(__response__, 'custom_type'),
        enable_details=pulumi.get(__response__, 'enable_details'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name=pulumi.get(__response__, 'name'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        product_id=pulumi.get(__response__, 'product_id'),
        risk_level_id=pulumi.get(__response__, 'risk_level_id'),
        rule_type=pulumi.get(__response__, 'rule_type'),
        rules=pulumi.get(__response__, 'rules'),
        status=pulumi.get(__response__, 'status'),
        warn_level=pulumi.get(__response__, 'warn_level')))
