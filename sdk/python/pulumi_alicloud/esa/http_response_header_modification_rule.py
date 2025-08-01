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
from ._inputs import *

__all__ = ['HttpResponseHeaderModificationRuleArgs', 'HttpResponseHeaderModificationRule']

@pulumi.input_type
class HttpResponseHeaderModificationRuleArgs:
    def __init__(__self__, *,
                 response_header_modifications: pulumi.Input[Sequence[pulumi.Input['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs']]],
                 site_id: pulumi.Input[_builtins.int],
                 rule: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_name: Optional[pulumi.Input[_builtins.str]] = None,
                 site_version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a HttpResponseHeaderModificationRule resource.
        :param pulumi.Input[Sequence[pulumi.Input['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs']]] response_header_modifications: Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
        :param pulumi.Input[_builtins.int] site_id: The site ID.
        :param pulumi.Input[_builtins.str] rule: Rule content.
        :param pulumi.Input[_builtins.str] rule_enable: Rule switch. Possible values:
        :param pulumi.Input[_builtins.str] rule_name: Rule name.
        :param pulumi.Input[_builtins.int] site_version: The version number of the website configurations.
        """
        pulumi.set(__self__, "response_header_modifications", response_header_modifications)
        pulumi.set(__self__, "site_id", site_id)
        if rule is not None:
            pulumi.set(__self__, "rule", rule)
        if rule_enable is not None:
            pulumi.set(__self__, "rule_enable", rule_enable)
        if rule_name is not None:
            pulumi.set(__self__, "rule_name", rule_name)
        if site_version is not None:
            pulumi.set(__self__, "site_version", site_version)

    @_builtins.property
    @pulumi.getter(name="responseHeaderModifications")
    def response_header_modifications(self) -> pulumi.Input[Sequence[pulumi.Input['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs']]]:
        """
        Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
        """
        return pulumi.get(self, "response_header_modifications")

    @response_header_modifications.setter
    def response_header_modifications(self, value: pulumi.Input[Sequence[pulumi.Input['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs']]]):
        pulumi.set(self, "response_header_modifications", value)

    @_builtins.property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Input[_builtins.int]:
        """
        The site ID.
        """
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "site_id", value)

    @_builtins.property
    @pulumi.getter
    def rule(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule content.
        """
        return pulumi.get(self, "rule")

    @rule.setter
    def rule(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule", value)

    @_builtins.property
    @pulumi.getter(name="ruleEnable")
    def rule_enable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule switch. Possible values:
        """
        return pulumi.get(self, "rule_enable")

    @rule_enable.setter
    def rule_enable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_enable", value)

    @_builtins.property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule name.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_name", value)

    @_builtins.property
    @pulumi.getter(name="siteVersion")
    def site_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The version number of the website configurations.
        """
        return pulumi.get(self, "site_version")

    @site_version.setter
    def site_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "site_version", value)


@pulumi.input_type
class _HttpResponseHeaderModificationRuleState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[_builtins.int]] = None,
                 response_header_modifications: Optional[pulumi.Input[Sequence[pulumi.Input['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs']]]] = None,
                 rule: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_name: Optional[pulumi.Input[_builtins.str]] = None,
                 site_id: Optional[pulumi.Input[_builtins.int]] = None,
                 site_version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering HttpResponseHeaderModificationRule resources.
        :param pulumi.Input[_builtins.int] config_id: Config Id
        :param pulumi.Input[Sequence[pulumi.Input['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs']]] response_header_modifications: Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
        :param pulumi.Input[_builtins.str] rule: Rule content.
        :param pulumi.Input[_builtins.str] rule_enable: Rule switch. Possible values:
        :param pulumi.Input[_builtins.str] rule_name: Rule name.
        :param pulumi.Input[_builtins.int] site_id: The site ID.
        :param pulumi.Input[_builtins.int] site_version: The version number of the website configurations.
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if response_header_modifications is not None:
            pulumi.set(__self__, "response_header_modifications", response_header_modifications)
        if rule is not None:
            pulumi.set(__self__, "rule", rule)
        if rule_enable is not None:
            pulumi.set(__self__, "rule_enable", rule_enable)
        if rule_name is not None:
            pulumi.set(__self__, "rule_name", rule_name)
        if site_id is not None:
            pulumi.set(__self__, "site_id", site_id)
        if site_version is not None:
            pulumi.set(__self__, "site_version", site_version)

    @_builtins.property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Config Id
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "config_id", value)

    @_builtins.property
    @pulumi.getter(name="responseHeaderModifications")
    def response_header_modifications(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs']]]]:
        """
        Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
        """
        return pulumi.get(self, "response_header_modifications")

    @response_header_modifications.setter
    def response_header_modifications(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs']]]]):
        pulumi.set(self, "response_header_modifications", value)

    @_builtins.property
    @pulumi.getter
    def rule(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule content.
        """
        return pulumi.get(self, "rule")

    @rule.setter
    def rule(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule", value)

    @_builtins.property
    @pulumi.getter(name="ruleEnable")
    def rule_enable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule switch. Possible values:
        """
        return pulumi.get(self, "rule_enable")

    @rule_enable.setter
    def rule_enable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_enable", value)

    @_builtins.property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule name.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_name", value)

    @_builtins.property
    @pulumi.getter(name="siteId")
    def site_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The site ID.
        """
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "site_id", value)

    @_builtins.property
    @pulumi.getter(name="siteVersion")
    def site_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The version number of the website configurations.
        """
        return pulumi.get(self, "site_version")

    @site_version.setter
    def site_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "site_version", value)


@pulumi.type_token("alicloud:esa/httpResponseHeaderModificationRule:HttpResponseHeaderModificationRule")
class HttpResponseHeaderModificationRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 response_header_modifications: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs', 'HttpResponseHeaderModificationRuleResponseHeaderModificationArgsDict']]]]] = None,
                 rule: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_name: Optional[pulumi.Input[_builtins.str]] = None,
                 site_id: Optional[pulumi.Input[_builtins.int]] = None,
                 site_version: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        Provides a ESA Http Response Header Modification Rule resource.

        For information about ESA Http Response Header Modification Rule and how to use it, see [What is Http Response Header Modification Rule](https://www.alibabacloud.com/help/en/edge-security-acceleration/esa/api-esa-2024-09-10-createhttpresponseheadermodificationrule).

        > **NOTE:** Available since v1.243.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        resource_http_response_header_modification_rule_example = alicloud.esa.RatePlanInstance("resource_HttpResponseHeaderModificationRule_example",
            type="NS",
            auto_renew=False,
            period=1,
            payment_type="Subscription",
            coverage="overseas",
            auto_pay=True,
            plan_name="high")
        default = random.index.Integer("default",
            min=10000,
            max=99999)
        resource_site_http_response_header_modification_rule_example = alicloud.esa.Site("resource_Site_HttpResponseHeaderModificationRule_example",
            site_name=f"gositecdn-{default['result']}.cn",
            instance_id=resource_http_response_header_modification_rule_example.id,
            coverage="overseas",
            access_type="NS")
        default_http_response_header_modification_rule = alicloud.esa.HttpResponseHeaderModificationRule("default",
            rule_enable="on",
            response_header_modifications=[
                {
                    "value": "add",
                    "operation": "add",
                    "name": "exampleadd",
                },
                {
                    "operation": "del",
                    "name": "exampledel",
                },
                {
                    "operation": "modify",
                    "name": "examplemodify",
                    "value": "modify",
                },
            ],
            rule="(http.host eq \\"video.example.com\\")",
            site_version=0,
            rule_name="exampleResponseHeader",
            site_id=resource_site_http_response_header_modification_rule_example.id)
        ```

        ## Import

        ESA Http Response Header Modification Rule can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:esa/httpResponseHeaderModificationRule:HttpResponseHeaderModificationRule example <site_id>:<config_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs', 'HttpResponseHeaderModificationRuleResponseHeaderModificationArgsDict']]]] response_header_modifications: Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
        :param pulumi.Input[_builtins.str] rule: Rule content.
        :param pulumi.Input[_builtins.str] rule_enable: Rule switch. Possible values:
        :param pulumi.Input[_builtins.str] rule_name: Rule name.
        :param pulumi.Input[_builtins.int] site_id: The site ID.
        :param pulumi.Input[_builtins.int] site_version: The version number of the website configurations.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HttpResponseHeaderModificationRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ESA Http Response Header Modification Rule resource.

        For information about ESA Http Response Header Modification Rule and how to use it, see [What is Http Response Header Modification Rule](https://www.alibabacloud.com/help/en/edge-security-acceleration/esa/api-esa-2024-09-10-createhttpresponseheadermodificationrule).

        > **NOTE:** Available since v1.243.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        resource_http_response_header_modification_rule_example = alicloud.esa.RatePlanInstance("resource_HttpResponseHeaderModificationRule_example",
            type="NS",
            auto_renew=False,
            period=1,
            payment_type="Subscription",
            coverage="overseas",
            auto_pay=True,
            plan_name="high")
        default = random.index.Integer("default",
            min=10000,
            max=99999)
        resource_site_http_response_header_modification_rule_example = alicloud.esa.Site("resource_Site_HttpResponseHeaderModificationRule_example",
            site_name=f"gositecdn-{default['result']}.cn",
            instance_id=resource_http_response_header_modification_rule_example.id,
            coverage="overseas",
            access_type="NS")
        default_http_response_header_modification_rule = alicloud.esa.HttpResponseHeaderModificationRule("default",
            rule_enable="on",
            response_header_modifications=[
                {
                    "value": "add",
                    "operation": "add",
                    "name": "exampleadd",
                },
                {
                    "operation": "del",
                    "name": "exampledel",
                },
                {
                    "operation": "modify",
                    "name": "examplemodify",
                    "value": "modify",
                },
            ],
            rule="(http.host eq \\"video.example.com\\")",
            site_version=0,
            rule_name="exampleResponseHeader",
            site_id=resource_site_http_response_header_modification_rule_example.id)
        ```

        ## Import

        ESA Http Response Header Modification Rule can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:esa/httpResponseHeaderModificationRule:HttpResponseHeaderModificationRule example <site_id>:<config_id>
        ```

        :param str resource_name: The name of the resource.
        :param HttpResponseHeaderModificationRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HttpResponseHeaderModificationRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 response_header_modifications: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs', 'HttpResponseHeaderModificationRuleResponseHeaderModificationArgsDict']]]]] = None,
                 rule: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_name: Optional[pulumi.Input[_builtins.str]] = None,
                 site_id: Optional[pulumi.Input[_builtins.int]] = None,
                 site_version: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HttpResponseHeaderModificationRuleArgs.__new__(HttpResponseHeaderModificationRuleArgs)

            if response_header_modifications is None and not opts.urn:
                raise TypeError("Missing required property 'response_header_modifications'")
            __props__.__dict__["response_header_modifications"] = response_header_modifications
            __props__.__dict__["rule"] = rule
            __props__.__dict__["rule_enable"] = rule_enable
            __props__.__dict__["rule_name"] = rule_name
            if site_id is None and not opts.urn:
                raise TypeError("Missing required property 'site_id'")
            __props__.__dict__["site_id"] = site_id
            __props__.__dict__["site_version"] = site_version
            __props__.__dict__["config_id"] = None
        super(HttpResponseHeaderModificationRule, __self__).__init__(
            'alicloud:esa/httpResponseHeaderModificationRule:HttpResponseHeaderModificationRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[_builtins.int]] = None,
            response_header_modifications: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs', 'HttpResponseHeaderModificationRuleResponseHeaderModificationArgsDict']]]]] = None,
            rule: Optional[pulumi.Input[_builtins.str]] = None,
            rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
            rule_name: Optional[pulumi.Input[_builtins.str]] = None,
            site_id: Optional[pulumi.Input[_builtins.int]] = None,
            site_version: Optional[pulumi.Input[_builtins.int]] = None) -> 'HttpResponseHeaderModificationRule':
        """
        Get an existing HttpResponseHeaderModificationRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] config_id: Config Id
        :param pulumi.Input[Sequence[pulumi.Input[Union['HttpResponseHeaderModificationRuleResponseHeaderModificationArgs', 'HttpResponseHeaderModificationRuleResponseHeaderModificationArgsDict']]]] response_header_modifications: Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
        :param pulumi.Input[_builtins.str] rule: Rule content.
        :param pulumi.Input[_builtins.str] rule_enable: Rule switch. Possible values:
        :param pulumi.Input[_builtins.str] rule_name: Rule name.
        :param pulumi.Input[_builtins.int] site_id: The site ID.
        :param pulumi.Input[_builtins.int] site_version: The version number of the website configurations.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HttpResponseHeaderModificationRuleState.__new__(_HttpResponseHeaderModificationRuleState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["response_header_modifications"] = response_header_modifications
        __props__.__dict__["rule"] = rule
        __props__.__dict__["rule_enable"] = rule_enable
        __props__.__dict__["rule_name"] = rule_name
        __props__.__dict__["site_id"] = site_id
        __props__.__dict__["site_version"] = site_version
        return HttpResponseHeaderModificationRule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[_builtins.int]:
        """
        Config Id
        """
        return pulumi.get(self, "config_id")

    @_builtins.property
    @pulumi.getter(name="responseHeaderModifications")
    def response_header_modifications(self) -> pulumi.Output[Sequence['outputs.HttpResponseHeaderModificationRuleResponseHeaderModification']]:
        """
        Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
        """
        return pulumi.get(self, "response_header_modifications")

    @_builtins.property
    @pulumi.getter
    def rule(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Rule content.
        """
        return pulumi.get(self, "rule")

    @_builtins.property
    @pulumi.getter(name="ruleEnable")
    def rule_enable(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Rule switch. Possible values:
        """
        return pulumi.get(self, "rule_enable")

    @_builtins.property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Rule name.
        """
        return pulumi.get(self, "rule_name")

    @_builtins.property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Output[_builtins.int]:
        """
        The site ID.
        """
        return pulumi.get(self, "site_id")

    @_builtins.property
    @pulumi.getter(name="siteVersion")
    def site_version(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The version number of the website configurations.
        """
        return pulumi.get(self, "site_version")

