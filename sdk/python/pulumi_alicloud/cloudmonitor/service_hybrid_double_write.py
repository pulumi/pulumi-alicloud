# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceHybridDoubleWriteArgs', 'ServiceHybridDoubleWrite']

@pulumi.input_type
class ServiceHybridDoubleWriteArgs:
    def __init__(__self__, *,
                 namespace: pulumi.Input[str],
                 source_namespace: pulumi.Input[str],
                 source_user_id: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a ServiceHybridDoubleWrite resource.
        :param pulumi.Input[str] namespace: Target Namespace.
        :param pulumi.Input[str] source_namespace: Source Namespace.
        :param pulumi.Input[str] source_user_id: Source UserId.
        :param pulumi.Input[str] user_id: Target UserId.
        """
        ServiceHybridDoubleWriteArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            namespace=namespace,
            source_namespace=source_namespace,
            source_user_id=source_user_id,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             namespace: pulumi.Input[str],
             source_namespace: pulumi.Input[str],
             source_user_id: pulumi.Input[str],
             user_id: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'sourceNamespace' in kwargs:
            source_namespace = kwargs['sourceNamespace']
        if 'sourceUserId' in kwargs:
            source_user_id = kwargs['sourceUserId']
        if 'userId' in kwargs:
            user_id = kwargs['userId']

        _setter("namespace", namespace)
        _setter("source_namespace", source_namespace)
        _setter("source_user_id", source_user_id)
        _setter("user_id", user_id)

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Input[str]:
        """
        Target Namespace.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="sourceNamespace")
    def source_namespace(self) -> pulumi.Input[str]:
        """
        Source Namespace.
        """
        return pulumi.get(self, "source_namespace")

    @source_namespace.setter
    def source_namespace(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_namespace", value)

    @property
    @pulumi.getter(name="sourceUserId")
    def source_user_id(self) -> pulumi.Input[str]:
        """
        Source UserId.
        """
        return pulumi.get(self, "source_user_id")

    @source_user_id.setter
    def source_user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_user_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        Target UserId.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _ServiceHybridDoubleWriteState:
    def __init__(__self__, *,
                 namespace: Optional[pulumi.Input[str]] = None,
                 source_namespace: Optional[pulumi.Input[str]] = None,
                 source_user_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceHybridDoubleWrite resources.
        :param pulumi.Input[str] namespace: Target Namespace.
        :param pulumi.Input[str] source_namespace: Source Namespace.
        :param pulumi.Input[str] source_user_id: Source UserId.
        :param pulumi.Input[str] user_id: Target UserId.
        """
        _ServiceHybridDoubleWriteState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            namespace=namespace,
            source_namespace=source_namespace,
            source_user_id=source_user_id,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             namespace: Optional[pulumi.Input[str]] = None,
             source_namespace: Optional[pulumi.Input[str]] = None,
             source_user_id: Optional[pulumi.Input[str]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'sourceNamespace' in kwargs:
            source_namespace = kwargs['sourceNamespace']
        if 'sourceUserId' in kwargs:
            source_user_id = kwargs['sourceUserId']
        if 'userId' in kwargs:
            user_id = kwargs['userId']

        if namespace is not None:
            _setter("namespace", namespace)
        if source_namespace is not None:
            _setter("source_namespace", source_namespace)
        if source_user_id is not None:
            _setter("source_user_id", source_user_id)
        if user_id is not None:
            _setter("user_id", user_id)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        Target Namespace.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="sourceNamespace")
    def source_namespace(self) -> Optional[pulumi.Input[str]]:
        """
        Source Namespace.
        """
        return pulumi.get(self, "source_namespace")

    @source_namespace.setter
    def source_namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_namespace", value)

    @property
    @pulumi.getter(name="sourceUserId")
    def source_user_id(self) -> Optional[pulumi.Input[str]]:
        """
        Source UserId.
        """
        return pulumi.get(self, "source_user_id")

    @source_user_id.setter
    def source_user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_user_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        Target UserId.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class ServiceHybridDoubleWrite(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 source_namespace: Optional[pulumi.Input[str]] = None,
                 source_user_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud Monitor Service Hybrid Double Write resource.

        For information about Cloud Monitor Service Hybrid Double Write and how to use it, see [What is Hybrid Double Write](https://next.api.alibabacloud.com/document/Cms/2018-03-08/CreateHybridDoubleWrite).

        > **NOTE:** Available since v1.210.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        source = alicloud.cms.Namespace("source", namespace="your_source_namespace")
        default_namespace = alicloud.cms.Namespace("defaultNamespace", namespace="your_namespace")
        default_service_hybrid_double_write = alicloud.cloudmonitor.ServiceHybridDoubleWrite("defaultServiceHybridDoubleWrite",
            source_namespace=source.id,
            source_user_id="your_source_account",
            namespace=default_namespace.id,
            user_id="your_account")
        ```

        ## Import

        Cloud Monitor Service Hybrid Double Write can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudmonitor/serviceHybridDoubleWrite:ServiceHybridDoubleWrite example <source_namespace>:<source_user_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] namespace: Target Namespace.
        :param pulumi.Input[str] source_namespace: Source Namespace.
        :param pulumi.Input[str] source_user_id: Source UserId.
        :param pulumi.Input[str] user_id: Target UserId.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceHybridDoubleWriteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Monitor Service Hybrid Double Write resource.

        For information about Cloud Monitor Service Hybrid Double Write and how to use it, see [What is Hybrid Double Write](https://next.api.alibabacloud.com/document/Cms/2018-03-08/CreateHybridDoubleWrite).

        > **NOTE:** Available since v1.210.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        source = alicloud.cms.Namespace("source", namespace="your_source_namespace")
        default_namespace = alicloud.cms.Namespace("defaultNamespace", namespace="your_namespace")
        default_service_hybrid_double_write = alicloud.cloudmonitor.ServiceHybridDoubleWrite("defaultServiceHybridDoubleWrite",
            source_namespace=source.id,
            source_user_id="your_source_account",
            namespace=default_namespace.id,
            user_id="your_account")
        ```

        ## Import

        Cloud Monitor Service Hybrid Double Write can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudmonitor/serviceHybridDoubleWrite:ServiceHybridDoubleWrite example <source_namespace>:<source_user_id>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceHybridDoubleWriteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceHybridDoubleWriteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ServiceHybridDoubleWriteArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 source_namespace: Optional[pulumi.Input[str]] = None,
                 source_user_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceHybridDoubleWriteArgs.__new__(ServiceHybridDoubleWriteArgs)

            if namespace is None and not opts.urn:
                raise TypeError("Missing required property 'namespace'")
            __props__.__dict__["namespace"] = namespace
            if source_namespace is None and not opts.urn:
                raise TypeError("Missing required property 'source_namespace'")
            __props__.__dict__["source_namespace"] = source_namespace
            if source_user_id is None and not opts.urn:
                raise TypeError("Missing required property 'source_user_id'")
            __props__.__dict__["source_user_id"] = source_user_id
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(ServiceHybridDoubleWrite, __self__).__init__(
            'alicloud:cloudmonitor/serviceHybridDoubleWrite:ServiceHybridDoubleWrite',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            source_namespace: Optional[pulumi.Input[str]] = None,
            source_user_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'ServiceHybridDoubleWrite':
        """
        Get an existing ServiceHybridDoubleWrite resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] namespace: Target Namespace.
        :param pulumi.Input[str] source_namespace: Source Namespace.
        :param pulumi.Input[str] source_user_id: Source UserId.
        :param pulumi.Input[str] user_id: Target UserId.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceHybridDoubleWriteState.__new__(_ServiceHybridDoubleWriteState)

        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["source_namespace"] = source_namespace
        __props__.__dict__["source_user_id"] = source_user_id
        __props__.__dict__["user_id"] = user_id
        return ServiceHybridDoubleWrite(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[str]:
        """
        Target Namespace.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="sourceNamespace")
    def source_namespace(self) -> pulumi.Output[str]:
        """
        Source Namespace.
        """
        return pulumi.get(self, "source_namespace")

    @property
    @pulumi.getter(name="sourceUserId")
    def source_user_id(self) -> pulumi.Output[str]:
        """
        Source UserId.
        """
        return pulumi.get(self, "source_user_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        Target UserId.
        """
        return pulumi.get(self, "user_id")
