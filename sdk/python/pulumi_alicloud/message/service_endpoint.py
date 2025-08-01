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

__all__ = ['ServiceEndpointArgs', 'ServiceEndpoint']

@pulumi.input_type
class ServiceEndpointArgs:
    def __init__(__self__, *,
                 endpoint_enabled: pulumi.Input[_builtins.bool],
                 endpoint_type: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a ServiceEndpoint resource.
        :param pulumi.Input[_builtins.bool] endpoint_enabled: Specifies whether the endpoint is enabled. Valid values:
        :param pulumi.Input[_builtins.str] endpoint_type: Access point type. Value:
               - public: indicates a public access point. (Currently only public is supported)
        """
        pulumi.set(__self__, "endpoint_enabled", endpoint_enabled)
        pulumi.set(__self__, "endpoint_type", endpoint_type)

    @_builtins.property
    @pulumi.getter(name="endpointEnabled")
    def endpoint_enabled(self) -> pulumi.Input[_builtins.bool]:
        """
        Specifies whether the endpoint is enabled. Valid values:
        """
        return pulumi.get(self, "endpoint_enabled")

    @endpoint_enabled.setter
    def endpoint_enabled(self, value: pulumi.Input[_builtins.bool]):
        pulumi.set(self, "endpoint_enabled", value)

    @_builtins.property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> pulumi.Input[_builtins.str]:
        """
        Access point type. Value:
        - public: indicates a public access point. (Currently only public is supported)
        """
        return pulumi.get(self, "endpoint_type")

    @endpoint_type.setter
    def endpoint_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "endpoint_type", value)


@pulumi.input_type
class _ServiceEndpointState:
    def __init__(__self__, *,
                 endpoint_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 endpoint_type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ServiceEndpoint resources.
        :param pulumi.Input[_builtins.bool] endpoint_enabled: Specifies whether the endpoint is enabled. Valid values:
        :param pulumi.Input[_builtins.str] endpoint_type: Access point type. Value:
               - public: indicates a public access point. (Currently only public is supported)
        """
        if endpoint_enabled is not None:
            pulumi.set(__self__, "endpoint_enabled", endpoint_enabled)
        if endpoint_type is not None:
            pulumi.set(__self__, "endpoint_type", endpoint_type)

    @_builtins.property
    @pulumi.getter(name="endpointEnabled")
    def endpoint_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether the endpoint is enabled. Valid values:
        """
        return pulumi.get(self, "endpoint_enabled")

    @endpoint_enabled.setter
    def endpoint_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "endpoint_enabled", value)

    @_builtins.property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Access point type. Value:
        - public: indicates a public access point. (Currently only public is supported)
        """
        return pulumi.get(self, "endpoint_type")

    @endpoint_type.setter
    def endpoint_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "endpoint_type", value)


@pulumi.type_token("alicloud:message/serviceEndpoint:ServiceEndpoint")
class ServiceEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 endpoint_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        Message Service Endpoint can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:message/serviceEndpoint:ServiceEndpoint example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] endpoint_enabled: Specifies whether the endpoint is enabled. Valid values:
        :param pulumi.Input[_builtins.str] endpoint_type: Access point type. Value:
               - public: indicates a public access point. (Currently only public is supported)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Message Service Endpoint can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:message/serviceEndpoint:ServiceEndpoint example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 endpoint_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceEndpointArgs.__new__(ServiceEndpointArgs)

            if endpoint_enabled is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_enabled'")
            __props__.__dict__["endpoint_enabled"] = endpoint_enabled
            if endpoint_type is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_type'")
            __props__.__dict__["endpoint_type"] = endpoint_type
        super(ServiceEndpoint, __self__).__init__(
            'alicloud:message/serviceEndpoint:ServiceEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            endpoint_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            endpoint_type: Optional[pulumi.Input[_builtins.str]] = None) -> 'ServiceEndpoint':
        """
        Get an existing ServiceEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] endpoint_enabled: Specifies whether the endpoint is enabled. Valid values:
        :param pulumi.Input[_builtins.str] endpoint_type: Access point type. Value:
               - public: indicates a public access point. (Currently only public is supported)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceEndpointState.__new__(_ServiceEndpointState)

        __props__.__dict__["endpoint_enabled"] = endpoint_enabled
        __props__.__dict__["endpoint_type"] = endpoint_type
        return ServiceEndpoint(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="endpointEnabled")
    def endpoint_enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Specifies whether the endpoint is enabled. Valid values:
        """
        return pulumi.get(self, "endpoint_enabled")

    @_builtins.property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> pulumi.Output[_builtins.str]:
        """
        Access point type. Value:
        - public: indicates a public access point. (Currently only public is supported)
        """
        return pulumi.get(self, "endpoint_type")

