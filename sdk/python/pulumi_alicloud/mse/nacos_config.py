# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = ['NacosConfigArgs', 'NacosConfig']

@pulumi.input_type
class NacosConfigArgs:
    def __init__(__self__, *,
                 content: pulumi.Input[str],
                 data_id: pulumi.Input[str],
                 group: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 accept_language: Optional[pulumi.Input[str]] = None,
                 app_name: Optional[pulumi.Input[str]] = None,
                 beta_ips: Optional[pulumi.Input[str]] = None,
                 desc: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NacosConfig resource.
        :param pulumi.Input[str] content: The content of the configuration.
        :param pulumi.Input[str] data_id: The ID of the data.
        :param pulumi.Input[str] group: The ID of the group.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] accept_language: The language type of the returned information. Valid values: `zh`, `en`.
        :param pulumi.Input[str] app_name: The name of the application.
        :param pulumi.Input[str] beta_ips: The list of IP addresses where the beta release of the configuration is performed.
        :param pulumi.Input[str] desc: The description of the configuration.
        :param pulumi.Input[str] namespace_id: The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`""`* or just not set this parameter.
        :param pulumi.Input[str] tags: The tags of the configuration.
        :param pulumi.Input[str] type: The format of the configuration. Supported formats include TEXT, JSON, and XML.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "data_id", data_id)
        pulumi.set(__self__, "group", group)
        pulumi.set(__self__, "instance_id", instance_id)
        if accept_language is not None:
            pulumi.set(__self__, "accept_language", accept_language)
        if app_name is not None:
            pulumi.set(__self__, "app_name", app_name)
        if beta_ips is not None:
            pulumi.set(__self__, "beta_ips", beta_ips)
        if desc is not None:
            pulumi.set(__self__, "desc", desc)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        The content of the configuration.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="dataId")
    def data_id(self) -> pulumi.Input[str]:
        """
        The ID of the data.
        """
        return pulumi.get(self, "data_id")

    @data_id.setter
    def data_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "data_id", value)

    @property
    @pulumi.getter
    def group(self) -> pulumi.Input[str]:
        """
        The ID of the group.
        """
        return pulumi.get(self, "group")

    @group.setter
    def group(self, value: pulumi.Input[str]):
        pulumi.set(self, "group", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> Optional[pulumi.Input[str]]:
        """
        The language type of the returned information. Valid values: `zh`, `en`.
        """
        return pulumi.get(self, "accept_language")

    @accept_language.setter
    def accept_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accept_language", value)

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the application.
        """
        return pulumi.get(self, "app_name")

    @app_name.setter
    def app_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_name", value)

    @property
    @pulumi.getter(name="betaIps")
    def beta_ips(self) -> Optional[pulumi.Input[str]]:
        """
        The list of IP addresses where the beta release of the configuration is performed.
        """
        return pulumi.get(self, "beta_ips")

    @beta_ips.setter
    def beta_ips(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "beta_ips", value)

    @property
    @pulumi.getter
    def desc(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the configuration.
        """
        return pulumi.get(self, "desc")

    @desc.setter
    def desc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "desc", value)

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`""`* or just not set this parameter.
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[str]]:
        """
        The tags of the configuration.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The format of the configuration. Supported formats include TEXT, JSON, and XML.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _NacosConfigState:
    def __init__(__self__, *,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 app_name: Optional[pulumi.Input[str]] = None,
                 beta_ips: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 data_id: Optional[pulumi.Input[str]] = None,
                 desc: Optional[pulumi.Input[str]] = None,
                 encrypted_data_key: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NacosConfig resources.
        :param pulumi.Input[str] accept_language: The language type of the returned information. Valid values: `zh`, `en`.
        :param pulumi.Input[str] app_name: The name of the application.
        :param pulumi.Input[str] beta_ips: The list of IP addresses where the beta release of the configuration is performed.
        :param pulumi.Input[str] content: The content of the configuration.
        :param pulumi.Input[str] data_id: The ID of the data.
        :param pulumi.Input[str] desc: The description of the configuration.
        :param pulumi.Input[str] encrypted_data_key: The encryption key.
        :param pulumi.Input[str] group: The ID of the group.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] namespace_id: The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`""`* or just not set this parameter.
        :param pulumi.Input[str] tags: The tags of the configuration.
        :param pulumi.Input[str] type: The format of the configuration. Supported formats include TEXT, JSON, and XML.
        """
        if accept_language is not None:
            pulumi.set(__self__, "accept_language", accept_language)
        if app_name is not None:
            pulumi.set(__self__, "app_name", app_name)
        if beta_ips is not None:
            pulumi.set(__self__, "beta_ips", beta_ips)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if data_id is not None:
            pulumi.set(__self__, "data_id", data_id)
        if desc is not None:
            pulumi.set(__self__, "desc", desc)
        if encrypted_data_key is not None:
            pulumi.set(__self__, "encrypted_data_key", encrypted_data_key)
        if group is not None:
            pulumi.set(__self__, "group", group)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> Optional[pulumi.Input[str]]:
        """
        The language type of the returned information. Valid values: `zh`, `en`.
        """
        return pulumi.get(self, "accept_language")

    @accept_language.setter
    def accept_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accept_language", value)

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the application.
        """
        return pulumi.get(self, "app_name")

    @app_name.setter
    def app_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_name", value)

    @property
    @pulumi.getter(name="betaIps")
    def beta_ips(self) -> Optional[pulumi.Input[str]]:
        """
        The list of IP addresses where the beta release of the configuration is performed.
        """
        return pulumi.get(self, "beta_ips")

    @beta_ips.setter
    def beta_ips(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "beta_ips", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        The content of the configuration.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="dataId")
    def data_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the data.
        """
        return pulumi.get(self, "data_id")

    @data_id.setter
    def data_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data_id", value)

    @property
    @pulumi.getter
    def desc(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the configuration.
        """
        return pulumi.get(self, "desc")

    @desc.setter
    def desc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "desc", value)

    @property
    @pulumi.getter(name="encryptedDataKey")
    def encrypted_data_key(self) -> Optional[pulumi.Input[str]]:
        """
        The encryption key.
        """
        return pulumi.get(self, "encrypted_data_key")

    @encrypted_data_key.setter
    def encrypted_data_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encrypted_data_key", value)

    @property
    @pulumi.getter
    def group(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the group.
        """
        return pulumi.get(self, "group")

    @group.setter
    def group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`""`* or just not set this parameter.
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[str]]:
        """
        The tags of the configuration.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The format of the configuration. Supported formats include TEXT, JSON, and XML.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class NacosConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 app_name: Optional[pulumi.Input[str]] = None,
                 beta_ips: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 data_id: Optional[pulumi.Input[str]] = None,
                 desc: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Microservice Engine (MSE) Nacos Config resource.

        For information about Microservice Engine (MSE) Nacos Config and how to use it, see [What is Nacos configuration](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createnacosconfig)
        > **NOTE:** Available since v1.233.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.get_zones(available_resource_creation="VSwitch")
        example_network = alicloud.vpc.Network("example",
            vpc_name="terraform-example",
            cidr_block="172.17.3.0/24")
        example_switch = alicloud.vpc.Switch("example",
            vswitch_name="terraform-example",
            cidr_block="172.17.3.0/24",
            vpc_id=example_network.id,
            zone_id=example.zones[0].id)
        example_cluster = alicloud.mse.Cluster("example",
            connection_type="slb",
            net_type="privatenet",
            vswitch_id=example_switch.id,
            cluster_specification="MSE_SC_1_2_60_c",
            cluster_version="NACOS_2_0_0",
            instance_count=3,
            pub_network_flow="1",
            cluster_alias_name="example",
            mse_version="mse_pro",
            cluster_type="Nacos-Ans")
        example_engine_namespace = alicloud.mse.EngineNamespace("example",
            instance_id=example_cluster.id,
            namespace_show_name="example",
            namespace_id="example")
        example_nacos_config = alicloud.mse.NacosConfig("example",
            instance_id=example_cluster.id,
            data_id="example",
            group="example",
            namespace_id=example_engine_namespace.namespace_id,
            content="example",
            type="text",
            tags="example",
            app_name="example",
            desc="example")
        ```

        ## Import

        Microservice Engine (MSE) Nacos Config can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:mse/nacosConfig:NacosConfig example <instance_id>:<namespace_id>:<data_id>:<group>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accept_language: The language type of the returned information. Valid values: `zh`, `en`.
        :param pulumi.Input[str] app_name: The name of the application.
        :param pulumi.Input[str] beta_ips: The list of IP addresses where the beta release of the configuration is performed.
        :param pulumi.Input[str] content: The content of the configuration.
        :param pulumi.Input[str] data_id: The ID of the data.
        :param pulumi.Input[str] desc: The description of the configuration.
        :param pulumi.Input[str] group: The ID of the group.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] namespace_id: The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`""`* or just not set this parameter.
        :param pulumi.Input[str] tags: The tags of the configuration.
        :param pulumi.Input[str] type: The format of the configuration. Supported formats include TEXT, JSON, and XML.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NacosConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Microservice Engine (MSE) Nacos Config resource.

        For information about Microservice Engine (MSE) Nacos Config and how to use it, see [What is Nacos configuration](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createnacosconfig)
        > **NOTE:** Available since v1.233.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.get_zones(available_resource_creation="VSwitch")
        example_network = alicloud.vpc.Network("example",
            vpc_name="terraform-example",
            cidr_block="172.17.3.0/24")
        example_switch = alicloud.vpc.Switch("example",
            vswitch_name="terraform-example",
            cidr_block="172.17.3.0/24",
            vpc_id=example_network.id,
            zone_id=example.zones[0].id)
        example_cluster = alicloud.mse.Cluster("example",
            connection_type="slb",
            net_type="privatenet",
            vswitch_id=example_switch.id,
            cluster_specification="MSE_SC_1_2_60_c",
            cluster_version="NACOS_2_0_0",
            instance_count=3,
            pub_network_flow="1",
            cluster_alias_name="example",
            mse_version="mse_pro",
            cluster_type="Nacos-Ans")
        example_engine_namespace = alicloud.mse.EngineNamespace("example",
            instance_id=example_cluster.id,
            namespace_show_name="example",
            namespace_id="example")
        example_nacos_config = alicloud.mse.NacosConfig("example",
            instance_id=example_cluster.id,
            data_id="example",
            group="example",
            namespace_id=example_engine_namespace.namespace_id,
            content="example",
            type="text",
            tags="example",
            app_name="example",
            desc="example")
        ```

        ## Import

        Microservice Engine (MSE) Nacos Config can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:mse/nacosConfig:NacosConfig example <instance_id>:<namespace_id>:<data_id>:<group>
        ```

        :param str resource_name: The name of the resource.
        :param NacosConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NacosConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 app_name: Optional[pulumi.Input[str]] = None,
                 beta_ips: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 data_id: Optional[pulumi.Input[str]] = None,
                 desc: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NacosConfigArgs.__new__(NacosConfigArgs)

            __props__.__dict__["accept_language"] = accept_language
            __props__.__dict__["app_name"] = app_name
            __props__.__dict__["beta_ips"] = beta_ips
            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = content
            if data_id is None and not opts.urn:
                raise TypeError("Missing required property 'data_id'")
            __props__.__dict__["data_id"] = data_id
            __props__.__dict__["desc"] = desc
            if group is None and not opts.urn:
                raise TypeError("Missing required property 'group'")
            __props__.__dict__["group"] = group
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["namespace_id"] = namespace_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["type"] = type
            __props__.__dict__["encrypted_data_key"] = None
        super(NacosConfig, __self__).__init__(
            'alicloud:mse/nacosConfig:NacosConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accept_language: Optional[pulumi.Input[str]] = None,
            app_name: Optional[pulumi.Input[str]] = None,
            beta_ips: Optional[pulumi.Input[str]] = None,
            content: Optional[pulumi.Input[str]] = None,
            data_id: Optional[pulumi.Input[str]] = None,
            desc: Optional[pulumi.Input[str]] = None,
            encrypted_data_key: Optional[pulumi.Input[str]] = None,
            group: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            namespace_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'NacosConfig':
        """
        Get an existing NacosConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accept_language: The language type of the returned information. Valid values: `zh`, `en`.
        :param pulumi.Input[str] app_name: The name of the application.
        :param pulumi.Input[str] beta_ips: The list of IP addresses where the beta release of the configuration is performed.
        :param pulumi.Input[str] content: The content of the configuration.
        :param pulumi.Input[str] data_id: The ID of the data.
        :param pulumi.Input[str] desc: The description of the configuration.
        :param pulumi.Input[str] encrypted_data_key: The encryption key.
        :param pulumi.Input[str] group: The ID of the group.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] namespace_id: The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`""`* or just not set this parameter.
        :param pulumi.Input[str] tags: The tags of the configuration.
        :param pulumi.Input[str] type: The format of the configuration. Supported formats include TEXT, JSON, and XML.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NacosConfigState.__new__(_NacosConfigState)

        __props__.__dict__["accept_language"] = accept_language
        __props__.__dict__["app_name"] = app_name
        __props__.__dict__["beta_ips"] = beta_ips
        __props__.__dict__["content"] = content
        __props__.__dict__["data_id"] = data_id
        __props__.__dict__["desc"] = desc
        __props__.__dict__["encrypted_data_key"] = encrypted_data_key
        __props__.__dict__["group"] = group
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["namespace_id"] = namespace_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["type"] = type
        return NacosConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> pulumi.Output[Optional[str]]:
        """
        The language type of the returned information. Valid values: `zh`, `en`.
        """
        return pulumi.get(self, "accept_language")

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the application.
        """
        return pulumi.get(self, "app_name")

    @property
    @pulumi.getter(name="betaIps")
    def beta_ips(self) -> pulumi.Output[str]:
        """
        The list of IP addresses where the beta release of the configuration is performed.
        """
        return pulumi.get(self, "beta_ips")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        """
        The content of the configuration.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="dataId")
    def data_id(self) -> pulumi.Output[str]:
        """
        The ID of the data.
        """
        return pulumi.get(self, "data_id")

    @property
    @pulumi.getter
    def desc(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the configuration.
        """
        return pulumi.get(self, "desc")

    @property
    @pulumi.getter(name="encryptedDataKey")
    def encrypted_data_key(self) -> pulumi.Output[str]:
        """
        The encryption key.
        """
        return pulumi.get(self, "encrypted_data_key")

    @property
    @pulumi.getter
    def group(self) -> pulumi.Output[str]:
        """
        The ID of the group.
        """
        return pulumi.get(self, "group")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[Optional[str]]:
        """
        The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`""`* or just not set this parameter.
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[str]]:
        """
        The tags of the configuration.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The format of the configuration. Supported formats include TEXT, JSON, and XML.
        """
        return pulumi.get(self, "type")
