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

__all__ = ['PolicyAdvancedConfigArgs', 'PolicyAdvancedConfig']

@pulumi.input_type
class PolicyAdvancedConfigArgs:
    def __init__(__self__, *,
                 internet_switch: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a PolicyAdvancedConfig resource.
        :param pulumi.Input[_builtins.str] internet_switch: Access control policy strict mode of on-state. Valid values:
        """
        pulumi.set(__self__, "internet_switch", internet_switch)

    @_builtins.property
    @pulumi.getter(name="internetSwitch")
    def internet_switch(self) -> pulumi.Input[_builtins.str]:
        """
        Access control policy strict mode of on-state. Valid values:
        """
        return pulumi.get(self, "internet_switch")

    @internet_switch.setter
    def internet_switch(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "internet_switch", value)


@pulumi.input_type
class _PolicyAdvancedConfigState:
    def __init__(__self__, *,
                 internet_switch: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering PolicyAdvancedConfig resources.
        :param pulumi.Input[_builtins.str] internet_switch: Access control policy strict mode of on-state. Valid values:
        """
        if internet_switch is not None:
            pulumi.set(__self__, "internet_switch", internet_switch)

    @_builtins.property
    @pulumi.getter(name="internetSwitch")
    def internet_switch(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Access control policy strict mode of on-state. Valid values:
        """
        return pulumi.get(self, "internet_switch")

    @internet_switch.setter
    def internet_switch(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "internet_switch", value)


@pulumi.type_token("alicloud:cloudfirewall/policyAdvancedConfig:PolicyAdvancedConfig")
class PolicyAdvancedConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 internet_switch: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        Cloud Firewall Policy Advanced Config can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cloudfirewall/policyAdvancedConfig:PolicyAdvancedConfig example 
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] internet_switch: Access control policy strict mode of on-state. Valid values:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PolicyAdvancedConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Cloud Firewall Policy Advanced Config can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cloudfirewall/policyAdvancedConfig:PolicyAdvancedConfig example 
        ```

        :param str resource_name: The name of the resource.
        :param PolicyAdvancedConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyAdvancedConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 internet_switch: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyAdvancedConfigArgs.__new__(PolicyAdvancedConfigArgs)

            if internet_switch is None and not opts.urn:
                raise TypeError("Missing required property 'internet_switch'")
            __props__.__dict__["internet_switch"] = internet_switch
        super(PolicyAdvancedConfig, __self__).__init__(
            'alicloud:cloudfirewall/policyAdvancedConfig:PolicyAdvancedConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            internet_switch: Optional[pulumi.Input[_builtins.str]] = None) -> 'PolicyAdvancedConfig':
        """
        Get an existing PolicyAdvancedConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] internet_switch: Access control policy strict mode of on-state. Valid values:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyAdvancedConfigState.__new__(_PolicyAdvancedConfigState)

        __props__.__dict__["internet_switch"] = internet_switch
        return PolicyAdvancedConfig(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="internetSwitch")
    def internet_switch(self) -> pulumi.Output[_builtins.str]:
        """
        Access control policy strict mode of on-state. Valid values:
        """
        return pulumi.get(self, "internet_switch")

