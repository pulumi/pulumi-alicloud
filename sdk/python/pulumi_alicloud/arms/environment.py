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

__all__ = ['EnvironmentArgs', 'Environment']

@pulumi.input_type
class EnvironmentArgs:
    def __init__(__self__, *,
                 environment_sub_type: pulumi.Input[_builtins.str],
                 environment_type: pulumi.Input[_builtins.str],
                 aliyun_lang: Optional[pulumi.Input[_builtins.str]] = None,
                 bind_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 drop_metrics: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_name: Optional[pulumi.Input[_builtins.str]] = None,
                 managed_type: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a Environment resource.
        :param pulumi.Input[_builtins.str] environment_sub_type: Subtype of environment:
               - Type of CS: ACK is currently supported. ManagedKubernetes, Kubernetes, ExternalKubernetes, and One are also supported.
               - Type of ECS: currently supports ECS.
               - Type of Cloud: currently supports Cloud.
        :param pulumi.Input[_builtins.str] environment_type: Type of environment.
        :param pulumi.Input[_builtins.str] aliyun_lang: The locale. The default is Chinese zh | en.
        :param pulumi.Input[_builtins.str] bind_resource_id: The id or vpcId of the bound container instance.
        :param pulumi.Input[_builtins.str] drop_metrics: List of abandoned indicators.
        :param pulumi.Input[_builtins.str] environment_name: The name of the resource.
        :param pulumi.Input[_builtins.str] managed_type: Hosting type:
               - none: unmanaged. The default value of the ACK cluster.
               - agent: Managed agent (including ksm). Default values of ASK, ACS, and Acone clusters.
               - agent-exproter: Managed agent and exporter. The default value of the cloud service type.
        :param pulumi.Input[_builtins.str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource.
        """
        pulumi.set(__self__, "environment_sub_type", environment_sub_type)
        pulumi.set(__self__, "environment_type", environment_type)
        if aliyun_lang is not None:
            pulumi.set(__self__, "aliyun_lang", aliyun_lang)
        if bind_resource_id is not None:
            pulumi.set(__self__, "bind_resource_id", bind_resource_id)
        if drop_metrics is not None:
            pulumi.set(__self__, "drop_metrics", drop_metrics)
        if environment_name is not None:
            pulumi.set(__self__, "environment_name", environment_name)
        if managed_type is not None:
            pulumi.set(__self__, "managed_type", managed_type)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="environmentSubType")
    def environment_sub_type(self) -> pulumi.Input[_builtins.str]:
        """
        Subtype of environment:
        - Type of CS: ACK is currently supported. ManagedKubernetes, Kubernetes, ExternalKubernetes, and One are also supported.
        - Type of ECS: currently supports ECS.
        - Type of Cloud: currently supports Cloud.
        """
        return pulumi.get(self, "environment_sub_type")

    @environment_sub_type.setter
    def environment_sub_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "environment_sub_type", value)

    @_builtins.property
    @pulumi.getter(name="environmentType")
    def environment_type(self) -> pulumi.Input[_builtins.str]:
        """
        Type of environment.
        """
        return pulumi.get(self, "environment_type")

    @environment_type.setter
    def environment_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "environment_type", value)

    @_builtins.property
    @pulumi.getter(name="aliyunLang")
    def aliyun_lang(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The locale. The default is Chinese zh | en.
        """
        return pulumi.get(self, "aliyun_lang")

    @aliyun_lang.setter
    def aliyun_lang(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "aliyun_lang", value)

    @_builtins.property
    @pulumi.getter(name="bindResourceId")
    def bind_resource_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id or vpcId of the bound container instance.
        """
        return pulumi.get(self, "bind_resource_id")

    @bind_resource_id.setter
    def bind_resource_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bind_resource_id", value)

    @_builtins.property
    @pulumi.getter(name="dropMetrics")
    def drop_metrics(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        List of abandoned indicators.
        """
        return pulumi.get(self, "drop_metrics")

    @drop_metrics.setter
    def drop_metrics(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "drop_metrics", value)

    @_builtins.property
    @pulumi.getter(name="environmentName")
    def environment_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "environment_name")

    @environment_name.setter
    def environment_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "environment_name", value)

    @_builtins.property
    @pulumi.getter(name="managedType")
    def managed_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Hosting type:
        - none: unmanaged. The default value of the ACK cluster.
        - agent: Managed agent (including ksm). Default values of ASK, ACS, and Acone clusters.
        - agent-exproter: Managed agent and exporter. The default value of the cloud service type.
        """
        return pulumi.get(self, "managed_type")

    @managed_type.setter
    def managed_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "managed_type", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_id", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _EnvironmentState:
    def __init__(__self__, *,
                 aliyun_lang: Optional[pulumi.Input[_builtins.str]] = None,
                 bind_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 drop_metrics: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_name: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_sub_type: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_type: Optional[pulumi.Input[_builtins.str]] = None,
                 managed_type: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering Environment resources.
        :param pulumi.Input[_builtins.str] aliyun_lang: The locale. The default is Chinese zh | en.
        :param pulumi.Input[_builtins.str] bind_resource_id: The id or vpcId of the bound container instance.
        :param pulumi.Input[_builtins.str] drop_metrics: List of abandoned indicators.
        :param pulumi.Input[_builtins.str] environment_id: The first ID of the resource.
        :param pulumi.Input[_builtins.str] environment_name: The name of the resource.
        :param pulumi.Input[_builtins.str] environment_sub_type: Subtype of environment:
               - Type of CS: ACK is currently supported. ManagedKubernetes, Kubernetes, ExternalKubernetes, and One are also supported.
               - Type of ECS: currently supports ECS.
               - Type of Cloud: currently supports Cloud.
        :param pulumi.Input[_builtins.str] environment_type: Type of environment.
        :param pulumi.Input[_builtins.str] managed_type: Hosting type:
               - none: unmanaged. The default value of the ACK cluster.
               - agent: Managed agent (including ksm). Default values of ASK, ACS, and Acone clusters.
               - agent-exproter: Managed agent and exporter. The default value of the cloud service type.
        :param pulumi.Input[_builtins.str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource.
        """
        if aliyun_lang is not None:
            pulumi.set(__self__, "aliyun_lang", aliyun_lang)
        if bind_resource_id is not None:
            pulumi.set(__self__, "bind_resource_id", bind_resource_id)
        if drop_metrics is not None:
            pulumi.set(__self__, "drop_metrics", drop_metrics)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if environment_name is not None:
            pulumi.set(__self__, "environment_name", environment_name)
        if environment_sub_type is not None:
            pulumi.set(__self__, "environment_sub_type", environment_sub_type)
        if environment_type is not None:
            pulumi.set(__self__, "environment_type", environment_type)
        if managed_type is not None:
            pulumi.set(__self__, "managed_type", managed_type)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="aliyunLang")
    def aliyun_lang(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The locale. The default is Chinese zh | en.
        """
        return pulumi.get(self, "aliyun_lang")

    @aliyun_lang.setter
    def aliyun_lang(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "aliyun_lang", value)

    @_builtins.property
    @pulumi.getter(name="bindResourceId")
    def bind_resource_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id or vpcId of the bound container instance.
        """
        return pulumi.get(self, "bind_resource_id")

    @bind_resource_id.setter
    def bind_resource_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bind_resource_id", value)

    @_builtins.property
    @pulumi.getter(name="dropMetrics")
    def drop_metrics(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        List of abandoned indicators.
        """
        return pulumi.get(self, "drop_metrics")

    @drop_metrics.setter
    def drop_metrics(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "drop_metrics", value)

    @_builtins.property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "environment_id", value)

    @_builtins.property
    @pulumi.getter(name="environmentName")
    def environment_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "environment_name")

    @environment_name.setter
    def environment_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "environment_name", value)

    @_builtins.property
    @pulumi.getter(name="environmentSubType")
    def environment_sub_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Subtype of environment:
        - Type of CS: ACK is currently supported. ManagedKubernetes, Kubernetes, ExternalKubernetes, and One are also supported.
        - Type of ECS: currently supports ECS.
        - Type of Cloud: currently supports Cloud.
        """
        return pulumi.get(self, "environment_sub_type")

    @environment_sub_type.setter
    def environment_sub_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "environment_sub_type", value)

    @_builtins.property
    @pulumi.getter(name="environmentType")
    def environment_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Type of environment.
        """
        return pulumi.get(self, "environment_type")

    @environment_type.setter
    def environment_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "environment_type", value)

    @_builtins.property
    @pulumi.getter(name="managedType")
    def managed_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Hosting type:
        - none: unmanaged. The default value of the ACK cluster.
        - agent: Managed agent (including ksm). Default values of ASK, ACS, and Acone clusters.
        - agent-exproter: Managed agent and exporter. The default value of the cloud service type.
        """
        return pulumi.get(self, "managed_type")

    @managed_type.setter
    def managed_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "managed_type", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_id", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("alicloud:arms/environment:Environment")
class Environment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aliyun_lang: Optional[pulumi.Input[_builtins.str]] = None,
                 bind_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 drop_metrics: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_name: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_sub_type: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_type: Optional[pulumi.Input[_builtins.str]] = None,
                 managed_type: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Provides a ARMS Environment resource. The arms environment.

        For information about ARMS Environment and how to use it, see [What is Environment](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createenvironment).

        > **NOTE:** Available since v1.212.0.

        ## Import

        ARMS Environment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:arms/environment:Environment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] aliyun_lang: The locale. The default is Chinese zh | en.
        :param pulumi.Input[_builtins.str] bind_resource_id: The id or vpcId of the bound container instance.
        :param pulumi.Input[_builtins.str] drop_metrics: List of abandoned indicators.
        :param pulumi.Input[_builtins.str] environment_name: The name of the resource.
        :param pulumi.Input[_builtins.str] environment_sub_type: Subtype of environment:
               - Type of CS: ACK is currently supported. ManagedKubernetes, Kubernetes, ExternalKubernetes, and One are also supported.
               - Type of ECS: currently supports ECS.
               - Type of Cloud: currently supports Cloud.
        :param pulumi.Input[_builtins.str] environment_type: Type of environment.
        :param pulumi.Input[_builtins.str] managed_type: Hosting type:
               - none: unmanaged. The default value of the ACK cluster.
               - agent: Managed agent (including ksm). Default values of ASK, ACS, and Acone clusters.
               - agent-exproter: Managed agent and exporter. The default value of the cloud service type.
        :param pulumi.Input[_builtins.str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EnvironmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ARMS Environment resource. The arms environment.

        For information about ARMS Environment and how to use it, see [What is Environment](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createenvironment).

        > **NOTE:** Available since v1.212.0.

        ## Import

        ARMS Environment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:arms/environment:Environment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param EnvironmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvironmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aliyun_lang: Optional[pulumi.Input[_builtins.str]] = None,
                 bind_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 drop_metrics: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_name: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_sub_type: Optional[pulumi.Input[_builtins.str]] = None,
                 environment_type: Optional[pulumi.Input[_builtins.str]] = None,
                 managed_type: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvironmentArgs.__new__(EnvironmentArgs)

            __props__.__dict__["aliyun_lang"] = aliyun_lang
            __props__.__dict__["bind_resource_id"] = bind_resource_id
            __props__.__dict__["drop_metrics"] = drop_metrics
            __props__.__dict__["environment_name"] = environment_name
            if environment_sub_type is None and not opts.urn:
                raise TypeError("Missing required property 'environment_sub_type'")
            __props__.__dict__["environment_sub_type"] = environment_sub_type
            if environment_type is None and not opts.urn:
                raise TypeError("Missing required property 'environment_type'")
            __props__.__dict__["environment_type"] = environment_type
            __props__.__dict__["managed_type"] = managed_type
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["environment_id"] = None
        super(Environment, __self__).__init__(
            'alicloud:arms/environment:Environment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aliyun_lang: Optional[pulumi.Input[_builtins.str]] = None,
            bind_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
            drop_metrics: Optional[pulumi.Input[_builtins.str]] = None,
            environment_id: Optional[pulumi.Input[_builtins.str]] = None,
            environment_name: Optional[pulumi.Input[_builtins.str]] = None,
            environment_sub_type: Optional[pulumi.Input[_builtins.str]] = None,
            environment_type: Optional[pulumi.Input[_builtins.str]] = None,
            managed_type: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_id: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'Environment':
        """
        Get an existing Environment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] aliyun_lang: The locale. The default is Chinese zh | en.
        :param pulumi.Input[_builtins.str] bind_resource_id: The id or vpcId of the bound container instance.
        :param pulumi.Input[_builtins.str] drop_metrics: List of abandoned indicators.
        :param pulumi.Input[_builtins.str] environment_id: The first ID of the resource.
        :param pulumi.Input[_builtins.str] environment_name: The name of the resource.
        :param pulumi.Input[_builtins.str] environment_sub_type: Subtype of environment:
               - Type of CS: ACK is currently supported. ManagedKubernetes, Kubernetes, ExternalKubernetes, and One are also supported.
               - Type of ECS: currently supports ECS.
               - Type of Cloud: currently supports Cloud.
        :param pulumi.Input[_builtins.str] environment_type: Type of environment.
        :param pulumi.Input[_builtins.str] managed_type: Hosting type:
               - none: unmanaged. The default value of the ACK cluster.
               - agent: Managed agent (including ksm). Default values of ASK, ACS, and Acone clusters.
               - agent-exproter: Managed agent and exporter. The default value of the cloud service type.
        :param pulumi.Input[_builtins.str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvironmentState.__new__(_EnvironmentState)

        __props__.__dict__["aliyun_lang"] = aliyun_lang
        __props__.__dict__["bind_resource_id"] = bind_resource_id
        __props__.__dict__["drop_metrics"] = drop_metrics
        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["environment_name"] = environment_name
        __props__.__dict__["environment_sub_type"] = environment_sub_type
        __props__.__dict__["environment_type"] = environment_type
        __props__.__dict__["managed_type"] = managed_type
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["tags"] = tags
        return Environment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="aliyunLang")
    def aliyun_lang(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The locale. The default is Chinese zh | en.
        """
        return pulumi.get(self, "aliyun_lang")

    @_builtins.property
    @pulumi.getter(name="bindResourceId")
    def bind_resource_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The id or vpcId of the bound container instance.
        """
        return pulumi.get(self, "bind_resource_id")

    @_builtins.property
    @pulumi.getter(name="dropMetrics")
    def drop_metrics(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        List of abandoned indicators.
        """
        return pulumi.get(self, "drop_metrics")

    @_builtins.property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[_builtins.str]:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "environment_id")

    @_builtins.property
    @pulumi.getter(name="environmentName")
    def environment_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "environment_name")

    @_builtins.property
    @pulumi.getter(name="environmentSubType")
    def environment_sub_type(self) -> pulumi.Output[_builtins.str]:
        """
        Subtype of environment:
        - Type of CS: ACK is currently supported. ManagedKubernetes, Kubernetes, ExternalKubernetes, and One are also supported.
        - Type of ECS: currently supports ECS.
        - Type of Cloud: currently supports Cloud.
        """
        return pulumi.get(self, "environment_sub_type")

    @_builtins.property
    @pulumi.getter(name="environmentType")
    def environment_type(self) -> pulumi.Output[_builtins.str]:
        """
        Type of environment.
        """
        return pulumi.get(self, "environment_type")

    @_builtins.property
    @pulumi.getter(name="managedType")
    def managed_type(self) -> pulumi.Output[_builtins.str]:
        """
        Hosting type:
        - none: unmanaged. The default value of the ACK cluster.
        - agent: Managed agent (including ksm). Default values of ASK, ACS, and Acone clusters.
        - agent-exproter: Managed agent and exporter. The default value of the cloud service type.
        """
        return pulumi.get(self, "managed_type")

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

