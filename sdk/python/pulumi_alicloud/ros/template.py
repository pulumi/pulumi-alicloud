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

__all__ = ['TemplateArgs', 'Template']

@pulumi.input_type
class TemplateArgs:
    def __init__(__self__, *,
                 template_name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 template_body: Optional[pulumi.Input[_builtins.str]] = None,
                 template_url: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Template resource.
        :param pulumi.Input[_builtins.str] template_name: The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        :param pulumi.Input[_builtins.str] description: The description of the template. The description can be up to 256 characters in length.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] template_body: The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
        :param pulumi.Input[_builtins.str] template_url: The template url.
        """
        pulumi.set(__self__, "template_name", template_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if template_body is not None:
            pulumi.set(__self__, "template_body", template_body)
        if template_url is not None:
            pulumi.set(__self__, "template_url", template_url)

    @_builtins.property
    @pulumi.getter(name="templateName")
    def template_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        """
        return pulumi.get(self, "template_name")

    @template_name.setter
    def template_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "template_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the template. The description can be up to 256 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="templateBody")
    def template_body(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
        """
        return pulumi.get(self, "template_body")

    @template_body.setter
    def template_body(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "template_body", value)

    @_builtins.property
    @pulumi.getter(name="templateUrl")
    def template_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The template url.
        """
        return pulumi.get(self, "template_url")

    @template_url.setter
    def template_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "template_url", value)


@pulumi.input_type
class _TemplateState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 template_body: Optional[pulumi.Input[_builtins.str]] = None,
                 template_name: Optional[pulumi.Input[_builtins.str]] = None,
                 template_url: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Template resources.
        :param pulumi.Input[_builtins.str] description: The description of the template. The description can be up to 256 characters in length.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] template_body: The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
        :param pulumi.Input[_builtins.str] template_name: The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        :param pulumi.Input[_builtins.str] template_url: The template url.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if template_body is not None:
            pulumi.set(__self__, "template_body", template_body)
        if template_name is not None:
            pulumi.set(__self__, "template_name", template_name)
        if template_url is not None:
            pulumi.set(__self__, "template_url", template_url)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the template. The description can be up to 256 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="templateBody")
    def template_body(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
        """
        return pulumi.get(self, "template_body")

    @template_body.setter
    def template_body(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "template_body", value)

    @_builtins.property
    @pulumi.getter(name="templateName")
    def template_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        """
        return pulumi.get(self, "template_name")

    @template_name.setter
    def template_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "template_name", value)

    @_builtins.property
    @pulumi.getter(name="templateUrl")
    def template_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The template url.
        """
        return pulumi.get(self, "template_url")

    @template_url.setter
    def template_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "template_url", value)


@pulumi.type_token("alicloud:ros/template:Template")
class Template(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 template_body: Optional[pulumi.Input[_builtins.str]] = None,
                 template_name: Optional[pulumi.Input[_builtins.str]] = None,
                 template_url: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a ROS Template resource.

        For information about ROS Template and how to use it, see [What is Template](https://www.alibabacloud.com/help/en/doc-detail/141851.htm).

        > **NOTE:** Available in v1.108.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ros.Template("example",
            template_name="example_value",
            template_body=\"\"\"    {
            \\x09"ROSTemplateFormatVersion": "2015-09-01"
            }
        \"\"\")
        ```

        ## Import

        ROS Template can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ros/template:Template example <template_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the template. The description can be up to 256 characters in length.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] template_body: The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
        :param pulumi.Input[_builtins.str] template_name: The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        :param pulumi.Input[_builtins.str] template_url: The template url.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ROS Template resource.

        For information about ROS Template and how to use it, see [What is Template](https://www.alibabacloud.com/help/en/doc-detail/141851.htm).

        > **NOTE:** Available in v1.108.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ros.Template("example",
            template_name="example_value",
            template_body=\"\"\"    {
            \\x09"ROSTemplateFormatVersion": "2015-09-01"
            }
        \"\"\")
        ```

        ## Import

        ROS Template can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ros/template:Template example <template_id>
        ```

        :param str resource_name: The name of the resource.
        :param TemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 template_body: Optional[pulumi.Input[_builtins.str]] = None,
                 template_name: Optional[pulumi.Input[_builtins.str]] = None,
                 template_url: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TemplateArgs.__new__(TemplateArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["tags"] = tags
            __props__.__dict__["template_body"] = template_body
            if template_name is None and not opts.urn:
                raise TypeError("Missing required property 'template_name'")
            __props__.__dict__["template_name"] = template_name
            __props__.__dict__["template_url"] = template_url
        super(Template, __self__).__init__(
            'alicloud:ros/template:Template',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            template_body: Optional[pulumi.Input[_builtins.str]] = None,
            template_name: Optional[pulumi.Input[_builtins.str]] = None,
            template_url: Optional[pulumi.Input[_builtins.str]] = None) -> 'Template':
        """
        Get an existing Template resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the template. The description can be up to 256 characters in length.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] template_body: The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
        :param pulumi.Input[_builtins.str] template_name: The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        :param pulumi.Input[_builtins.str] template_url: The template url.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TemplateState.__new__(_TemplateState)

        __props__.__dict__["description"] = description
        __props__.__dict__["tags"] = tags
        __props__.__dict__["template_body"] = template_body
        __props__.__dict__["template_name"] = template_name
        __props__.__dict__["template_url"] = template_url
        return Template(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the template. The description can be up to 256 characters in length.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="templateBody")
    def template_body(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
        """
        return pulumi.get(self, "template_body")

    @_builtins.property
    @pulumi.getter(name="templateName")
    def template_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        """
        return pulumi.get(self, "template_name")

    @_builtins.property
    @pulumi.getter(name="templateUrl")
    def template_url(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The template url.
        """
        return pulumi.get(self, "template_url")

