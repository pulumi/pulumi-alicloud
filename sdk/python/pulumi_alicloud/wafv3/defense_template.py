# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DefenseTemplateArgs', 'DefenseTemplate']

@pulumi.input_type
class DefenseTemplateArgs:
    def __init__(__self__, *,
                 defense_scene: pulumi.Input[str],
                 defense_template_name: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 status: pulumi.Input[str],
                 template_origin: pulumi.Input[str],
                 template_type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 resource_manager_resource_group_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DefenseTemplate resource.
        :param pulumi.Input[str] defense_scene: The module to which the protection rule that you want to create belongs. Value:
               - **waf_group**: the basic protection rule module.
               - **antiscan**: the scan protection module.
               - **ip_blacklist**: the IP address blacklist module.
               - **custom_acl**: the custom rule module.
               - **whitelist**: the whitelist module.
               - **region_block**: the region blacklist module.
               - **custom_response**: the custom response module.
               - **cc**: the HTTP flood protection module.
               - **tamperproof**: the website tamper-proofing module.
               - **dlp**: the data leakage prevention module.
        :param pulumi.Input[str] defense_template_name: The name of the protection rule template.
        :param pulumi.Input[str] instance_id: The ID of the Web Application Firewall (WAF) instance. .
        :param pulumi.Input[str] status: The status of the protection rule template. Valid values:
               - **0**: disabled.
               - **1**: enabled.
        :param pulumi.Input[str] template_origin: The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
        :param pulumi.Input[str] template_type: The type of the protection rule template. Valid values:
               - **user_default:** default template.
               - **user_custom:** custom template.
        :param pulumi.Input[str] description: The description of the protection rule template. .
        :param pulumi.Input[str] resource_manager_resource_group_id: The ID of the Alibaba Cloud resource group. .
        """
        pulumi.set(__self__, "defense_scene", defense_scene)
        pulumi.set(__self__, "defense_template_name", defense_template_name)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "template_origin", template_origin)
        pulumi.set(__self__, "template_type", template_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if resource_manager_resource_group_id is not None:
            pulumi.set(__self__, "resource_manager_resource_group_id", resource_manager_resource_group_id)

    @property
    @pulumi.getter(name="defenseScene")
    def defense_scene(self) -> pulumi.Input[str]:
        """
        The module to which the protection rule that you want to create belongs. Value:
        - **waf_group**: the basic protection rule module.
        - **antiscan**: the scan protection module.
        - **ip_blacklist**: the IP address blacklist module.
        - **custom_acl**: the custom rule module.
        - **whitelist**: the whitelist module.
        - **region_block**: the region blacklist module.
        - **custom_response**: the custom response module.
        - **cc**: the HTTP flood protection module.
        - **tamperproof**: the website tamper-proofing module.
        - **dlp**: the data leakage prevention module.
        """
        return pulumi.get(self, "defense_scene")

    @defense_scene.setter
    def defense_scene(self, value: pulumi.Input[str]):
        pulumi.set(self, "defense_scene", value)

    @property
    @pulumi.getter(name="defenseTemplateName")
    def defense_template_name(self) -> pulumi.Input[str]:
        """
        The name of the protection rule template.
        """
        return pulumi.get(self, "defense_template_name")

    @defense_template_name.setter
    def defense_template_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "defense_template_name", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the Web Application Firewall (WAF) instance. .
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[str]:
        """
        The status of the protection rule template. Valid values:
        - **0**: disabled.
        - **1**: enabled.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="templateOrigin")
    def template_origin(self) -> pulumi.Input[str]:
        """
        The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
        """
        return pulumi.get(self, "template_origin")

    @template_origin.setter
    def template_origin(self, value: pulumi.Input[str]):
        pulumi.set(self, "template_origin", value)

    @property
    @pulumi.getter(name="templateType")
    def template_type(self) -> pulumi.Input[str]:
        """
        The type of the protection rule template. Valid values:
        - **user_default:** default template.
        - **user_custom:** custom template.
        """
        return pulumi.get(self, "template_type")

    @template_type.setter
    def template_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "template_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the protection rule template. .
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="resourceManagerResourceGroupId")
    def resource_manager_resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Alibaba Cloud resource group. .
        """
        return pulumi.get(self, "resource_manager_resource_group_id")

    @resource_manager_resource_group_id.setter
    def resource_manager_resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_manager_resource_group_id", value)


@pulumi.input_type
class _DefenseTemplateState:
    def __init__(__self__, *,
                 defense_scene: Optional[pulumi.Input[str]] = None,
                 defense_template_id: Optional[pulumi.Input[int]] = None,
                 defense_template_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 resource_manager_resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 template_origin: Optional[pulumi.Input[str]] = None,
                 template_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DefenseTemplate resources.
        :param pulumi.Input[str] defense_scene: The module to which the protection rule that you want to create belongs. Value:
               - **waf_group**: the basic protection rule module.
               - **antiscan**: the scan protection module.
               - **ip_blacklist**: the IP address blacklist module.
               - **custom_acl**: the custom rule module.
               - **whitelist**: the whitelist module.
               - **region_block**: the region blacklist module.
               - **custom_response**: the custom response module.
               - **cc**: the HTTP flood protection module.
               - **tamperproof**: the website tamper-proofing module.
               - **dlp**: the data leakage prevention module.
        :param pulumi.Input[int] defense_template_id: Template ID.
        :param pulumi.Input[str] defense_template_name: The name of the protection rule template.
        :param pulumi.Input[str] description: The description of the protection rule template. .
        :param pulumi.Input[str] instance_id: The ID of the Web Application Firewall (WAF) instance. .
        :param pulumi.Input[str] resource_manager_resource_group_id: The ID of the Alibaba Cloud resource group. .
        :param pulumi.Input[str] status: The status of the protection rule template. Valid values:
               - **0**: disabled.
               - **1**: enabled.
        :param pulumi.Input[str] template_origin: The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
        :param pulumi.Input[str] template_type: The type of the protection rule template. Valid values:
               - **user_default:** default template.
               - **user_custom:** custom template.
        """
        if defense_scene is not None:
            pulumi.set(__self__, "defense_scene", defense_scene)
        if defense_template_id is not None:
            pulumi.set(__self__, "defense_template_id", defense_template_id)
        if defense_template_name is not None:
            pulumi.set(__self__, "defense_template_name", defense_template_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if resource_manager_resource_group_id is not None:
            pulumi.set(__self__, "resource_manager_resource_group_id", resource_manager_resource_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if template_origin is not None:
            pulumi.set(__self__, "template_origin", template_origin)
        if template_type is not None:
            pulumi.set(__self__, "template_type", template_type)

    @property
    @pulumi.getter(name="defenseScene")
    def defense_scene(self) -> Optional[pulumi.Input[str]]:
        """
        The module to which the protection rule that you want to create belongs. Value:
        - **waf_group**: the basic protection rule module.
        - **antiscan**: the scan protection module.
        - **ip_blacklist**: the IP address blacklist module.
        - **custom_acl**: the custom rule module.
        - **whitelist**: the whitelist module.
        - **region_block**: the region blacklist module.
        - **custom_response**: the custom response module.
        - **cc**: the HTTP flood protection module.
        - **tamperproof**: the website tamper-proofing module.
        - **dlp**: the data leakage prevention module.
        """
        return pulumi.get(self, "defense_scene")

    @defense_scene.setter
    def defense_scene(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "defense_scene", value)

    @property
    @pulumi.getter(name="defenseTemplateId")
    def defense_template_id(self) -> Optional[pulumi.Input[int]]:
        """
        Template ID.
        """
        return pulumi.get(self, "defense_template_id")

    @defense_template_id.setter
    def defense_template_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "defense_template_id", value)

    @property
    @pulumi.getter(name="defenseTemplateName")
    def defense_template_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the protection rule template.
        """
        return pulumi.get(self, "defense_template_name")

    @defense_template_name.setter
    def defense_template_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "defense_template_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the protection rule template. .
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Web Application Firewall (WAF) instance. .
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="resourceManagerResourceGroupId")
    def resource_manager_resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Alibaba Cloud resource group. .
        """
        return pulumi.get(self, "resource_manager_resource_group_id")

    @resource_manager_resource_group_id.setter
    def resource_manager_resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_manager_resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the protection rule template. Valid values:
        - **0**: disabled.
        - **1**: enabled.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="templateOrigin")
    def template_origin(self) -> Optional[pulumi.Input[str]]:
        """
        The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
        """
        return pulumi.get(self, "template_origin")

    @template_origin.setter
    def template_origin(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template_origin", value)

    @property
    @pulumi.getter(name="templateType")
    def template_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the protection rule template. Valid values:
        - **user_default:** default template.
        - **user_custom:** custom template.
        """
        return pulumi.get(self, "template_type")

    @template_type.setter
    def template_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template_type", value)


class DefenseTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 defense_scene: Optional[pulumi.Input[str]] = None,
                 defense_template_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 resource_manager_resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 template_origin: Optional[pulumi.Input[str]] = None,
                 template_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a WAFV3 Defense Template resource.

        For information about WAFV3 Defense Template and how to use it, see [What is Defense Template](https://www.alibabacloud.com/help/en/web-application-firewall/latest/api-waf-openapi-2021-10-01-createdefensetemplate).

        > **NOTE:** Available since v1.218.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.wafv3.get_instances()
        default_defense_template = alicloud.wafv3.DefenseTemplate("default",
            status="1",
            instance_id=default.ids[0],
            defense_template_name=name,
            template_type="user_custom",
            template_origin="custom",
            defense_scene="antiscan",
            resource_manager_resource_group_id="example",
            description=name)
        ```

        ## Import

        WAFV3 Defense Template can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:wafv3/defenseTemplate:DefenseTemplate example <instance_id>:<defense_template_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] defense_scene: The module to which the protection rule that you want to create belongs. Value:
               - **waf_group**: the basic protection rule module.
               - **antiscan**: the scan protection module.
               - **ip_blacklist**: the IP address blacklist module.
               - **custom_acl**: the custom rule module.
               - **whitelist**: the whitelist module.
               - **region_block**: the region blacklist module.
               - **custom_response**: the custom response module.
               - **cc**: the HTTP flood protection module.
               - **tamperproof**: the website tamper-proofing module.
               - **dlp**: the data leakage prevention module.
        :param pulumi.Input[str] defense_template_name: The name of the protection rule template.
        :param pulumi.Input[str] description: The description of the protection rule template. .
        :param pulumi.Input[str] instance_id: The ID of the Web Application Firewall (WAF) instance. .
        :param pulumi.Input[str] resource_manager_resource_group_id: The ID of the Alibaba Cloud resource group. .
        :param pulumi.Input[str] status: The status of the protection rule template. Valid values:
               - **0**: disabled.
               - **1**: enabled.
        :param pulumi.Input[str] template_origin: The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
        :param pulumi.Input[str] template_type: The type of the protection rule template. Valid values:
               - **user_default:** default template.
               - **user_custom:** custom template.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DefenseTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a WAFV3 Defense Template resource.

        For information about WAFV3 Defense Template and how to use it, see [What is Defense Template](https://www.alibabacloud.com/help/en/web-application-firewall/latest/api-waf-openapi-2021-10-01-createdefensetemplate).

        > **NOTE:** Available since v1.218.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.wafv3.get_instances()
        default_defense_template = alicloud.wafv3.DefenseTemplate("default",
            status="1",
            instance_id=default.ids[0],
            defense_template_name=name,
            template_type="user_custom",
            template_origin="custom",
            defense_scene="antiscan",
            resource_manager_resource_group_id="example",
            description=name)
        ```

        ## Import

        WAFV3 Defense Template can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:wafv3/defenseTemplate:DefenseTemplate example <instance_id>:<defense_template_id>
        ```

        :param str resource_name: The name of the resource.
        :param DefenseTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DefenseTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 defense_scene: Optional[pulumi.Input[str]] = None,
                 defense_template_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 resource_manager_resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 template_origin: Optional[pulumi.Input[str]] = None,
                 template_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DefenseTemplateArgs.__new__(DefenseTemplateArgs)

            if defense_scene is None and not opts.urn:
                raise TypeError("Missing required property 'defense_scene'")
            __props__.__dict__["defense_scene"] = defense_scene
            if defense_template_name is None and not opts.urn:
                raise TypeError("Missing required property 'defense_template_name'")
            __props__.__dict__["defense_template_name"] = defense_template_name
            __props__.__dict__["description"] = description
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["resource_manager_resource_group_id"] = resource_manager_resource_group_id
            if status is None and not opts.urn:
                raise TypeError("Missing required property 'status'")
            __props__.__dict__["status"] = status
            if template_origin is None and not opts.urn:
                raise TypeError("Missing required property 'template_origin'")
            __props__.__dict__["template_origin"] = template_origin
            if template_type is None and not opts.urn:
                raise TypeError("Missing required property 'template_type'")
            __props__.__dict__["template_type"] = template_type
            __props__.__dict__["defense_template_id"] = None
        super(DefenseTemplate, __self__).__init__(
            'alicloud:wafv3/defenseTemplate:DefenseTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            defense_scene: Optional[pulumi.Input[str]] = None,
            defense_template_id: Optional[pulumi.Input[int]] = None,
            defense_template_name: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            resource_manager_resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            template_origin: Optional[pulumi.Input[str]] = None,
            template_type: Optional[pulumi.Input[str]] = None) -> 'DefenseTemplate':
        """
        Get an existing DefenseTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] defense_scene: The module to which the protection rule that you want to create belongs. Value:
               - **waf_group**: the basic protection rule module.
               - **antiscan**: the scan protection module.
               - **ip_blacklist**: the IP address blacklist module.
               - **custom_acl**: the custom rule module.
               - **whitelist**: the whitelist module.
               - **region_block**: the region blacklist module.
               - **custom_response**: the custom response module.
               - **cc**: the HTTP flood protection module.
               - **tamperproof**: the website tamper-proofing module.
               - **dlp**: the data leakage prevention module.
        :param pulumi.Input[int] defense_template_id: Template ID.
        :param pulumi.Input[str] defense_template_name: The name of the protection rule template.
        :param pulumi.Input[str] description: The description of the protection rule template. .
        :param pulumi.Input[str] instance_id: The ID of the Web Application Firewall (WAF) instance. .
        :param pulumi.Input[str] resource_manager_resource_group_id: The ID of the Alibaba Cloud resource group. .
        :param pulumi.Input[str] status: The status of the protection rule template. Valid values:
               - **0**: disabled.
               - **1**: enabled.
        :param pulumi.Input[str] template_origin: The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
        :param pulumi.Input[str] template_type: The type of the protection rule template. Valid values:
               - **user_default:** default template.
               - **user_custom:** custom template.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DefenseTemplateState.__new__(_DefenseTemplateState)

        __props__.__dict__["defense_scene"] = defense_scene
        __props__.__dict__["defense_template_id"] = defense_template_id
        __props__.__dict__["defense_template_name"] = defense_template_name
        __props__.__dict__["description"] = description
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["resource_manager_resource_group_id"] = resource_manager_resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["template_origin"] = template_origin
        __props__.__dict__["template_type"] = template_type
        return DefenseTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defenseScene")
    def defense_scene(self) -> pulumi.Output[str]:
        """
        The module to which the protection rule that you want to create belongs. Value:
        - **waf_group**: the basic protection rule module.
        - **antiscan**: the scan protection module.
        - **ip_blacklist**: the IP address blacklist module.
        - **custom_acl**: the custom rule module.
        - **whitelist**: the whitelist module.
        - **region_block**: the region blacklist module.
        - **custom_response**: the custom response module.
        - **cc**: the HTTP flood protection module.
        - **tamperproof**: the website tamper-proofing module.
        - **dlp**: the data leakage prevention module.
        """
        return pulumi.get(self, "defense_scene")

    @property
    @pulumi.getter(name="defenseTemplateId")
    def defense_template_id(self) -> pulumi.Output[int]:
        """
        Template ID.
        """
        return pulumi.get(self, "defense_template_id")

    @property
    @pulumi.getter(name="defenseTemplateName")
    def defense_template_name(self) -> pulumi.Output[str]:
        """
        The name of the protection rule template.
        """
        return pulumi.get(self, "defense_template_name")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the protection rule template. .
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the Web Application Firewall (WAF) instance. .
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="resourceManagerResourceGroupId")
    def resource_manager_resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the Alibaba Cloud resource group. .
        """
        return pulumi.get(self, "resource_manager_resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the protection rule template. Valid values:
        - **0**: disabled.
        - **1**: enabled.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="templateOrigin")
    def template_origin(self) -> pulumi.Output[str]:
        """
        The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
        """
        return pulumi.get(self, "template_origin")

    @property
    @pulumi.getter(name="templateType")
    def template_type(self) -> pulumi.Output[str]:
        """
        The type of the protection rule template. Valid values:
        - **user_default:** default template.
        - **user_custom:** custom template.
        """
        return pulumi.get(self, "template_type")
