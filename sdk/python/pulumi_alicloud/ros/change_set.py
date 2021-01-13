# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ChangeSet']


class ChangeSet(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 change_set_name: Optional[pulumi.Input[str]] = None,
                 change_set_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_rollback: Optional[pulumi.Input[bool]] = None,
                 notification_urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ChangeSetParameterArgs']]]]] = None,
                 ram_role_name: Optional[pulumi.Input[str]] = None,
                 replacement_option: Optional[pulumi.Input[str]] = None,
                 stack_id: Optional[pulumi.Input[str]] = None,
                 stack_name: Optional[pulumi.Input[str]] = None,
                 stack_policy_body: Optional[pulumi.Input[str]] = None,
                 stack_policy_during_update_body: Optional[pulumi.Input[str]] = None,
                 stack_policy_during_update_url: Optional[pulumi.Input[str]] = None,
                 stack_policy_url: Optional[pulumi.Input[str]] = None,
                 template_body: Optional[pulumi.Input[str]] = None,
                 template_url: Optional[pulumi.Input[str]] = None,
                 timeout_in_minutes: Optional[pulumi.Input[int]] = None,
                 use_previous_parameters: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a ROS Change Set resource.

        For information about ROS Change Set and how to use it, see [What is Change Set](https://www.alibabacloud.com/help/doc-detail/131051.htm).

        > **NOTE:** Available in v1.105.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ros.ChangeSet("example",
            change_set_name="example_value",
            change_set_type="CREATE",
            description="Test From Terraform",
            stack_name="tf-testacc",
            template_body="{\"ROSTemplateFormatVersion\":\"2015-09-01\"}")
        ```

        ## Import

        ROS Change Set can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ros/changeSet:ChangeSet example <change_set_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] change_set_name: The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        :param pulumi.Input[str] change_set_type: The type of the change set. Valid values:  CREATE: creates a change set for a new stack. UPDATE: creates a change set for an existing stack. IMPORT: creates a change set for a new stack or an existing stack to import non-ROS-managed resources. If you create a change set for a new stack, ROS creates a stack that has a unique stack ID. The stack is in the REVIEW_IN_PROGRESS state until you execute the change set.  You cannot use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
        :param pulumi.Input[str] description: The description of the change set. The description can be up to 1,024 bytes in length.
        :param pulumi.Input[bool] disable_rollback: Specifies whether to disable rollback on stack creation failure. Default value: false.  Valid values:  true: disables rollback on stack creation failure. false: enables rollback on stack creation failure. Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] notification_urls: The notification urls.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ChangeSetParameterArgs']]]] parameters: Parameters.
        :param pulumi.Input[str] ram_role_name: The ram role name.
        :param pulumi.Input[str] replacement_option: The replacement option.
        :param pulumi.Input[str] stack_id: The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
        :param pulumi.Input[str] stack_name: The name of the stack for which you want to create the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.  Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
        :param pulumi.Input[str] stack_policy_body: The stack policy body.
        :param pulumi.Input[str] stack_policy_during_update_body: The stack policy during update body.
        :param pulumi.Input[str] stack_policy_during_update_url: The stack policy during update url.
        :param pulumi.Input[str] stack_policy_url: The stack policy url.
        :param pulumi.Input[str] template_body: The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You can specify one of TemplateBody or TemplateURL parameters, but you cannot specify both of them.
        :param pulumi.Input[str] template_url: The template url.
        :param pulumi.Input[int] timeout_in_minutes: Timeout In Minutes.
        :param pulumi.Input[bool] use_previous_parameters: The use previous parameters.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if change_set_name is None and not opts.urn:
                raise TypeError("Missing required property 'change_set_name'")
            __props__['change_set_name'] = change_set_name
            __props__['change_set_type'] = change_set_type
            __props__['description'] = description
            __props__['disable_rollback'] = disable_rollback
            __props__['notification_urls'] = notification_urls
            __props__['parameters'] = parameters
            __props__['ram_role_name'] = ram_role_name
            __props__['replacement_option'] = replacement_option
            __props__['stack_id'] = stack_id
            __props__['stack_name'] = stack_name
            __props__['stack_policy_body'] = stack_policy_body
            __props__['stack_policy_during_update_body'] = stack_policy_during_update_body
            __props__['stack_policy_during_update_url'] = stack_policy_during_update_url
            __props__['stack_policy_url'] = stack_policy_url
            __props__['template_body'] = template_body
            __props__['template_url'] = template_url
            __props__['timeout_in_minutes'] = timeout_in_minutes
            __props__['use_previous_parameters'] = use_previous_parameters
            __props__['status'] = None
        super(ChangeSet, __self__).__init__(
            'alicloud:ros/changeSet:ChangeSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            change_set_name: Optional[pulumi.Input[str]] = None,
            change_set_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disable_rollback: Optional[pulumi.Input[bool]] = None,
            notification_urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ChangeSetParameterArgs']]]]] = None,
            ram_role_name: Optional[pulumi.Input[str]] = None,
            replacement_option: Optional[pulumi.Input[str]] = None,
            stack_id: Optional[pulumi.Input[str]] = None,
            stack_name: Optional[pulumi.Input[str]] = None,
            stack_policy_body: Optional[pulumi.Input[str]] = None,
            stack_policy_during_update_body: Optional[pulumi.Input[str]] = None,
            stack_policy_during_update_url: Optional[pulumi.Input[str]] = None,
            stack_policy_url: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            template_body: Optional[pulumi.Input[str]] = None,
            template_url: Optional[pulumi.Input[str]] = None,
            timeout_in_minutes: Optional[pulumi.Input[int]] = None,
            use_previous_parameters: Optional[pulumi.Input[bool]] = None) -> 'ChangeSet':
        """
        Get an existing ChangeSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] change_set_name: The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        :param pulumi.Input[str] change_set_type: The type of the change set. Valid values:  CREATE: creates a change set for a new stack. UPDATE: creates a change set for an existing stack. IMPORT: creates a change set for a new stack or an existing stack to import non-ROS-managed resources. If you create a change set for a new stack, ROS creates a stack that has a unique stack ID. The stack is in the REVIEW_IN_PROGRESS state until you execute the change set.  You cannot use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
        :param pulumi.Input[str] description: The description of the change set. The description can be up to 1,024 bytes in length.
        :param pulumi.Input[bool] disable_rollback: Specifies whether to disable rollback on stack creation failure. Default value: false.  Valid values:  true: disables rollback on stack creation failure. false: enables rollback on stack creation failure. Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] notification_urls: The notification urls.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ChangeSetParameterArgs']]]] parameters: Parameters.
        :param pulumi.Input[str] ram_role_name: The ram role name.
        :param pulumi.Input[str] replacement_option: The replacement option.
        :param pulumi.Input[str] stack_id: The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
        :param pulumi.Input[str] stack_name: The name of the stack for which you want to create the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.  Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
        :param pulumi.Input[str] stack_policy_body: The stack policy body.
        :param pulumi.Input[str] stack_policy_during_update_body: The stack policy during update body.
        :param pulumi.Input[str] stack_policy_during_update_url: The stack policy during update url.
        :param pulumi.Input[str] stack_policy_url: The stack policy url.
        :param pulumi.Input[str] status: The status of the change set.
        :param pulumi.Input[str] template_body: The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You can specify one of TemplateBody or TemplateURL parameters, but you cannot specify both of them.
        :param pulumi.Input[str] template_url: The template url.
        :param pulumi.Input[int] timeout_in_minutes: Timeout In Minutes.
        :param pulumi.Input[bool] use_previous_parameters: The use previous parameters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["change_set_name"] = change_set_name
        __props__["change_set_type"] = change_set_type
        __props__["description"] = description
        __props__["disable_rollback"] = disable_rollback
        __props__["notification_urls"] = notification_urls
        __props__["parameters"] = parameters
        __props__["ram_role_name"] = ram_role_name
        __props__["replacement_option"] = replacement_option
        __props__["stack_id"] = stack_id
        __props__["stack_name"] = stack_name
        __props__["stack_policy_body"] = stack_policy_body
        __props__["stack_policy_during_update_body"] = stack_policy_during_update_body
        __props__["stack_policy_during_update_url"] = stack_policy_during_update_url
        __props__["stack_policy_url"] = stack_policy_url
        __props__["status"] = status
        __props__["template_body"] = template_body
        __props__["template_url"] = template_url
        __props__["timeout_in_minutes"] = timeout_in_minutes
        __props__["use_previous_parameters"] = use_previous_parameters
        return ChangeSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="changeSetName")
    def change_set_name(self) -> pulumi.Output[str]:
        """
        The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        """
        return pulumi.get(self, "change_set_name")

    @property
    @pulumi.getter(name="changeSetType")
    def change_set_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of the change set. Valid values:  CREATE: creates a change set for a new stack. UPDATE: creates a change set for an existing stack. IMPORT: creates a change set for a new stack or an existing stack to import non-ROS-managed resources. If you create a change set for a new stack, ROS creates a stack that has a unique stack ID. The stack is in the REVIEW_IN_PROGRESS state until you execute the change set.  You cannot use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
        """
        return pulumi.get(self, "change_set_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the change set. The description can be up to 1,024 bytes in length.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="disableRollback")
    def disable_rollback(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to disable rollback on stack creation failure. Default value: false.  Valid values:  true: disables rollback on stack creation failure. false: enables rollback on stack creation failure. Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
        """
        return pulumi.get(self, "disable_rollback")

    @property
    @pulumi.getter(name="notificationUrls")
    def notification_urls(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The notification urls.
        """
        return pulumi.get(self, "notification_urls")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[Sequence['outputs.ChangeSetParameter']]:
        """
        Parameters.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="ramRoleName")
    def ram_role_name(self) -> pulumi.Output[Optional[str]]:
        """
        The ram role name.
        """
        return pulumi.get(self, "ram_role_name")

    @property
    @pulumi.getter(name="replacementOption")
    def replacement_option(self) -> pulumi.Output[Optional[str]]:
        """
        The replacement option.
        """
        return pulumi.get(self, "replacement_option")

    @property
    @pulumi.getter(name="stackId")
    def stack_id(self) -> pulumi.Output[str]:
        """
        The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
        """
        return pulumi.get(self, "stack_id")

    @property
    @pulumi.getter(name="stackName")
    def stack_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the stack for which you want to create the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.  Note This parameter takes effect only when ChangeSetType is set to CREATE or IMPORT.
        """
        return pulumi.get(self, "stack_name")

    @property
    @pulumi.getter(name="stackPolicyBody")
    def stack_policy_body(self) -> pulumi.Output[Optional[str]]:
        """
        The stack policy body.
        """
        return pulumi.get(self, "stack_policy_body")

    @property
    @pulumi.getter(name="stackPolicyDuringUpdateBody")
    def stack_policy_during_update_body(self) -> pulumi.Output[Optional[str]]:
        """
        The stack policy during update body.
        """
        return pulumi.get(self, "stack_policy_during_update_body")

    @property
    @pulumi.getter(name="stackPolicyDuringUpdateUrl")
    def stack_policy_during_update_url(self) -> pulumi.Output[Optional[str]]:
        """
        The stack policy during update url.
        """
        return pulumi.get(self, "stack_policy_during_update_url")

    @property
    @pulumi.getter(name="stackPolicyUrl")
    def stack_policy_url(self) -> pulumi.Output[Optional[str]]:
        """
        The stack policy url.
        """
        return pulumi.get(self, "stack_policy_url")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the change set.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="templateBody")
    def template_body(self) -> pulumi.Output[Optional[str]]:
        """
        The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You can specify one of TemplateBody or TemplateURL parameters, but you cannot specify both of them.
        """
        return pulumi.get(self, "template_body")

    @property
    @pulumi.getter(name="templateUrl")
    def template_url(self) -> pulumi.Output[Optional[str]]:
        """
        The template url.
        """
        return pulumi.get(self, "template_url")

    @property
    @pulumi.getter(name="timeoutInMinutes")
    def timeout_in_minutes(self) -> pulumi.Output[int]:
        """
        Timeout In Minutes.
        """
        return pulumi.get(self, "timeout_in_minutes")

    @property
    @pulumi.getter(name="usePreviousParameters")
    def use_previous_parameters(self) -> pulumi.Output[Optional[bool]]:
        """
        The use previous parameters.
        """
        return pulumi.get(self, "use_previous_parameters")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
