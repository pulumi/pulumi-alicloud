# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PluginArgs', 'Plugin']

@pulumi.input_type
class PluginArgs:
    def __init__(__self__, *,
                 plugin_data: pulumi.Input[str],
                 plugin_name: pulumi.Input[str],
                 plugin_type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a Plugin resource.
        :param pulumi.Input[str] plugin_data: The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
        :param pulumi.Input[str] plugin_name: The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
        :param pulumi.Input[str] plugin_type: The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
               - ipControl: indicates IP address-based access control.
               - trafficControl: indicates throttling.
               - backendSignature: indicates backend signature.
               - jwtAuth: indicates JWT (OpenId Connect).
               - cors: indicates cross-origin resource access (CORS).
               - caching: indicates caching.
        :param pulumi.Input[str] description: The description of the plug-in, which cannot exceed 200 characters.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "plugin_data", plugin_data)
        pulumi.set(__self__, "plugin_name", plugin_name)
        pulumi.set(__self__, "plugin_type", plugin_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="pluginData")
    def plugin_data(self) -> pulumi.Input[str]:
        """
        The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
        """
        return pulumi.get(self, "plugin_data")

    @plugin_data.setter
    def plugin_data(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_data", value)

    @property
    @pulumi.getter(name="pluginName")
    def plugin_name(self) -> pulumi.Input[str]:
        """
        The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
        """
        return pulumi.get(self, "plugin_name")

    @plugin_name.setter
    def plugin_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_name", value)

    @property
    @pulumi.getter(name="pluginType")
    def plugin_type(self) -> pulumi.Input[str]:
        """
        The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
        - ipControl: indicates IP address-based access control.
        - trafficControl: indicates throttling.
        - backendSignature: indicates backend signature.
        - jwtAuth: indicates JWT (OpenId Connect).
        - cors: indicates cross-origin resource access (CORS).
        - caching: indicates caching.
        """
        return pulumi.get(self, "plugin_type")

    @plugin_type.setter
    def plugin_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the plug-in, which cannot exceed 200 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _PluginState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 plugin_data: Optional[pulumi.Input[str]] = None,
                 plugin_name: Optional[pulumi.Input[str]] = None,
                 plugin_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        Input properties used for looking up and filtering Plugin resources.
        :param pulumi.Input[str] description: The description of the plug-in, which cannot exceed 200 characters.
        :param pulumi.Input[str] plugin_data: The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
        :param pulumi.Input[str] plugin_name: The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
        :param pulumi.Input[str] plugin_type: The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
               - ipControl: indicates IP address-based access control.
               - trafficControl: indicates throttling.
               - backendSignature: indicates backend signature.
               - jwtAuth: indicates JWT (OpenId Connect).
               - cors: indicates cross-origin resource access (CORS).
               - caching: indicates caching.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if plugin_data is not None:
            pulumi.set(__self__, "plugin_data", plugin_data)
        if plugin_name is not None:
            pulumi.set(__self__, "plugin_name", plugin_name)
        if plugin_type is not None:
            pulumi.set(__self__, "plugin_type", plugin_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the plug-in, which cannot exceed 200 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="pluginData")
    def plugin_data(self) -> Optional[pulumi.Input[str]]:
        """
        The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
        """
        return pulumi.get(self, "plugin_data")

    @plugin_data.setter
    def plugin_data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plugin_data", value)

    @property
    @pulumi.getter(name="pluginName")
    def plugin_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
        """
        return pulumi.get(self, "plugin_name")

    @plugin_name.setter
    def plugin_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plugin_name", value)

    @property
    @pulumi.getter(name="pluginType")
    def plugin_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
        - ipControl: indicates IP address-based access control.
        - trafficControl: indicates throttling.
        - backendSignature: indicates backend signature.
        - jwtAuth: indicates JWT (OpenId Connect).
        - cors: indicates cross-origin resource access (CORS).
        - caching: indicates caching.
        """
        return pulumi.get(self, "plugin_type")

    @plugin_type.setter
    def plugin_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plugin_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


class Plugin(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 plugin_data: Optional[pulumi.Input[str]] = None,
                 plugin_name: Optional[pulumi.Input[str]] = None,
                 plugin_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        """
        Provides a Api Gateway Plugin resource.

        For information about Api Gateway Plugin and how to use it, see [What is Plugin](https://www.alibabacloud.com/help/en/api-gateway/latest/create-an-plugin).

        > **NOTE:** Available in v1.187.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.apigateway.Plugin("default",
            description=var["name"],
            plugin_name=var["name"],
            plugin_data="{\\"allowOrigins\\": \\"api.foo.com\\",\\"allowMethods\\": \\"GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH\\",\\"allowHeaders\\": \\"Authorization,Accept,Accept-Ranges,Cache-Control,Range,Date,Content-Type,Content-Length,Content-MD5,User-Agent,X-Ca-Signature,X-Ca-Signature-Headers,X-Ca-Signature-Method,X-Ca-Key,X-Ca-Timestamp,X-Ca-Nonce,X-Ca-Stage,X-Ca-Request-Mode,x-ca-deviceid\\",\\"exposeHeaders\\": \\"Content-MD5,Server,Date,Latency,X-Ca-Request-Id,X-Ca-Error-Code,X-Ca-Error-Message\\",\\"maxAge\\": 172800,\\"allowCredentials\\": true}",
            plugin_type="cors",
            tags={
                "Created": "TF",
                "For": "Acceptance-test",
            })
        ```

        ## Import

        Api Gateway Plugin can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:apigateway/plugin:Plugin example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the plug-in, which cannot exceed 200 characters.
        :param pulumi.Input[str] plugin_data: The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
        :param pulumi.Input[str] plugin_name: The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
        :param pulumi.Input[str] plugin_type: The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
               - ipControl: indicates IP address-based access control.
               - trafficControl: indicates throttling.
               - backendSignature: indicates backend signature.
               - jwtAuth: indicates JWT (OpenId Connect).
               - cors: indicates cross-origin resource access (CORS).
               - caching: indicates caching.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PluginArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Api Gateway Plugin resource.

        For information about Api Gateway Plugin and how to use it, see [What is Plugin](https://www.alibabacloud.com/help/en/api-gateway/latest/create-an-plugin).

        > **NOTE:** Available in v1.187.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.apigateway.Plugin("default",
            description=var["name"],
            plugin_name=var["name"],
            plugin_data="{\\"allowOrigins\\": \\"api.foo.com\\",\\"allowMethods\\": \\"GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH\\",\\"allowHeaders\\": \\"Authorization,Accept,Accept-Ranges,Cache-Control,Range,Date,Content-Type,Content-Length,Content-MD5,User-Agent,X-Ca-Signature,X-Ca-Signature-Headers,X-Ca-Signature-Method,X-Ca-Key,X-Ca-Timestamp,X-Ca-Nonce,X-Ca-Stage,X-Ca-Request-Mode,x-ca-deviceid\\",\\"exposeHeaders\\": \\"Content-MD5,Server,Date,Latency,X-Ca-Request-Id,X-Ca-Error-Code,X-Ca-Error-Message\\",\\"maxAge\\": 172800,\\"allowCredentials\\": true}",
            plugin_type="cors",
            tags={
                "Created": "TF",
                "For": "Acceptance-test",
            })
        ```

        ## Import

        Api Gateway Plugin can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:apigateway/plugin:Plugin example <id>
        ```

        :param str resource_name: The name of the resource.
        :param PluginArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PluginArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 plugin_data: Optional[pulumi.Input[str]] = None,
                 plugin_name: Optional[pulumi.Input[str]] = None,
                 plugin_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PluginArgs.__new__(PluginArgs)

            __props__.__dict__["description"] = description
            if plugin_data is None and not opts.urn:
                raise TypeError("Missing required property 'plugin_data'")
            __props__.__dict__["plugin_data"] = plugin_data
            if plugin_name is None and not opts.urn:
                raise TypeError("Missing required property 'plugin_name'")
            __props__.__dict__["plugin_name"] = plugin_name
            if plugin_type is None and not opts.urn:
                raise TypeError("Missing required property 'plugin_type'")
            __props__.__dict__["plugin_type"] = plugin_type
            __props__.__dict__["tags"] = tags
        super(Plugin, __self__).__init__(
            'alicloud:apigateway/plugin:Plugin',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            plugin_data: Optional[pulumi.Input[str]] = None,
            plugin_name: Optional[pulumi.Input[str]] = None,
            plugin_type: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'Plugin':
        """
        Get an existing Plugin resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the plug-in, which cannot exceed 200 characters.
        :param pulumi.Input[str] plugin_data: The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
        :param pulumi.Input[str] plugin_name: The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
        :param pulumi.Input[str] plugin_type: The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
               - ipControl: indicates IP address-based access control.
               - trafficControl: indicates throttling.
               - backendSignature: indicates backend signature.
               - jwtAuth: indicates JWT (OpenId Connect).
               - cors: indicates cross-origin resource access (CORS).
               - caching: indicates caching.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PluginState.__new__(_PluginState)

        __props__.__dict__["description"] = description
        __props__.__dict__["plugin_data"] = plugin_data
        __props__.__dict__["plugin_name"] = plugin_name
        __props__.__dict__["plugin_type"] = plugin_type
        __props__.__dict__["tags"] = tags
        return Plugin(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the plug-in, which cannot exceed 200 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="pluginData")
    def plugin_data(self) -> pulumi.Output[str]:
        """
        The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
        """
        return pulumi.get(self, "plugin_data")

    @property
    @pulumi.getter(name="pluginName")
    def plugin_name(self) -> pulumi.Output[str]:
        """
        The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
        """
        return pulumi.get(self, "plugin_name")

    @property
    @pulumi.getter(name="pluginType")
    def plugin_type(self) -> pulumi.Output[str]:
        """
        The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
        - ipControl: indicates IP address-based access control.
        - trafficControl: indicates throttling.
        - backendSignature: indicates backend signature.
        - jwtAuth: indicates JWT (OpenId Connect).
        - cors: indicates cross-origin resource access (CORS).
        - caching: indicates caching.
        """
        return pulumi.get(self, "plugin_type")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")
