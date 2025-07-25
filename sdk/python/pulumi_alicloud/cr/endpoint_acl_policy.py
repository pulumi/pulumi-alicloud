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

__all__ = ['EndpointAclPolicyArgs', 'EndpointAclPolicy']

@pulumi.input_type
class EndpointAclPolicyArgs:
    def __init__(__self__, *,
                 endpoint_type: pulumi.Input[_builtins.str],
                 entry: pulumi.Input[_builtins.str],
                 instance_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 module_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a EndpointAclPolicy resource.
        :param pulumi.Input[_builtins.str] endpoint_type: The type of endpoint. Valid values: `internet`.
        :param pulumi.Input[_builtins.str] entry: The IP segment that allowed to access.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the CR Instance.
        :param pulumi.Input[_builtins.str] description: The description of the entry.
        :param pulumi.Input[_builtins.str] module_name: The module that needs to set the access policy. Valid values: `Registry`.
        """
        pulumi.set(__self__, "endpoint_type", endpoint_type)
        pulumi.set(__self__, "entry", entry)
        pulumi.set(__self__, "instance_id", instance_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if module_name is not None:
            pulumi.set(__self__, "module_name", module_name)

    @_builtins.property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> pulumi.Input[_builtins.str]:
        """
        The type of endpoint. Valid values: `internet`.
        """
        return pulumi.get(self, "endpoint_type")

    @endpoint_type.setter
    def endpoint_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "endpoint_type", value)

    @_builtins.property
    @pulumi.getter
    def entry(self) -> pulumi.Input[_builtins.str]:
        """
        The IP segment that allowed to access.
        """
        return pulumi.get(self, "entry")

    @entry.setter
    def entry(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "entry", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the CR Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the entry.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="moduleName")
    def module_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The module that needs to set the access policy. Valid values: `Registry`.
        """
        return pulumi.get(self, "module_name")

    @module_name.setter
    def module_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "module_name", value)


@pulumi.input_type
class _EndpointAclPolicyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_type: Optional[pulumi.Input[_builtins.str]] = None,
                 entry: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 module_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering EndpointAclPolicy resources.
        :param pulumi.Input[_builtins.str] description: The description of the entry.
        :param pulumi.Input[_builtins.str] endpoint_type: The type of endpoint. Valid values: `internet`.
        :param pulumi.Input[_builtins.str] entry: The IP segment that allowed to access.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the CR Instance.
        :param pulumi.Input[_builtins.str] module_name: The module that needs to set the access policy. Valid values: `Registry`.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if endpoint_type is not None:
            pulumi.set(__self__, "endpoint_type", endpoint_type)
        if entry is not None:
            pulumi.set(__self__, "entry", entry)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if module_name is not None:
            pulumi.set(__self__, "module_name", module_name)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the entry.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of endpoint. Valid values: `internet`.
        """
        return pulumi.get(self, "endpoint_type")

    @endpoint_type.setter
    def endpoint_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "endpoint_type", value)

    @_builtins.property
    @pulumi.getter
    def entry(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The IP segment that allowed to access.
        """
        return pulumi.get(self, "entry")

    @entry.setter
    def entry(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "entry", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the CR Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter(name="moduleName")
    def module_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The module that needs to set the access policy. Valid values: `Registry`.
        """
        return pulumi.get(self, "module_name")

    @module_name.setter
    def module_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "module_name", value)


@pulumi.type_token("alicloud:cr/endpointAclPolicy:EndpointAclPolicy")
class EndpointAclPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_type: Optional[pulumi.Input[_builtins.str]] = None,
                 entry: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 module_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a CR Endpoint Acl Policy resource.

        For information about CR Endpoint Acl Policy and how to use it, see [What is Endpoint Acl Policy](https://www.alibabacloud.com/help/doc-detail/145275.htm).

        > **NOTE:** Available since v1.139.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_integer = random.index.Integer("default",
            min=10000000,
            max=99999999)
        default_registry_enterprise_instance = alicloud.cr.RegistryEnterpriseInstance("default",
            payment_type="Subscription",
            period=1,
            renewal_status="ManualRenewal",
            instance_type="Advanced",
            instance_name=f"{name}-{default_integer['result']}")
        default = alicloud.cr.get_endpoint_acl_service_output(endpoint_type="internet",
            enable=True,
            instance_id=default_registry_enterprise_instance.id,
            module_name="Registry")
        default_endpoint_acl_policy = alicloud.cr.EndpointAclPolicy("default",
            instance_id=default.instance_id,
            entry="192.168.1.0/24",
            description=name,
            module_name="Registry",
            endpoint_type="internet")
        ```

        ## Import

        CR Endpoint Acl Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cr/endpointAclPolicy:EndpointAclPolicy example <instance_id>:<endpoint_type>:<entry>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the entry.
        :param pulumi.Input[_builtins.str] endpoint_type: The type of endpoint. Valid values: `internet`.
        :param pulumi.Input[_builtins.str] entry: The IP segment that allowed to access.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the CR Instance.
        :param pulumi.Input[_builtins.str] module_name: The module that needs to set the access policy. Valid values: `Registry`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EndpointAclPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CR Endpoint Acl Policy resource.

        For information about CR Endpoint Acl Policy and how to use it, see [What is Endpoint Acl Policy](https://www.alibabacloud.com/help/doc-detail/145275.htm).

        > **NOTE:** Available since v1.139.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_integer = random.index.Integer("default",
            min=10000000,
            max=99999999)
        default_registry_enterprise_instance = alicloud.cr.RegistryEnterpriseInstance("default",
            payment_type="Subscription",
            period=1,
            renewal_status="ManualRenewal",
            instance_type="Advanced",
            instance_name=f"{name}-{default_integer['result']}")
        default = alicloud.cr.get_endpoint_acl_service_output(endpoint_type="internet",
            enable=True,
            instance_id=default_registry_enterprise_instance.id,
            module_name="Registry")
        default_endpoint_acl_policy = alicloud.cr.EndpointAclPolicy("default",
            instance_id=default.instance_id,
            entry="192.168.1.0/24",
            description=name,
            module_name="Registry",
            endpoint_type="internet")
        ```

        ## Import

        CR Endpoint Acl Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cr/endpointAclPolicy:EndpointAclPolicy example <instance_id>:<endpoint_type>:<entry>
        ```

        :param str resource_name: The name of the resource.
        :param EndpointAclPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EndpointAclPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_type: Optional[pulumi.Input[_builtins.str]] = None,
                 entry: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 module_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EndpointAclPolicyArgs.__new__(EndpointAclPolicyArgs)

            __props__.__dict__["description"] = description
            if endpoint_type is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_type'")
            __props__.__dict__["endpoint_type"] = endpoint_type
            if entry is None and not opts.urn:
                raise TypeError("Missing required property 'entry'")
            __props__.__dict__["entry"] = entry
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["module_name"] = module_name
        super(EndpointAclPolicy, __self__).__init__(
            'alicloud:cr/endpointAclPolicy:EndpointAclPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            endpoint_type: Optional[pulumi.Input[_builtins.str]] = None,
            entry: Optional[pulumi.Input[_builtins.str]] = None,
            instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            module_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'EndpointAclPolicy':
        """
        Get an existing EndpointAclPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the entry.
        :param pulumi.Input[_builtins.str] endpoint_type: The type of endpoint. Valid values: `internet`.
        :param pulumi.Input[_builtins.str] entry: The IP segment that allowed to access.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the CR Instance.
        :param pulumi.Input[_builtins.str] module_name: The module that needs to set the access policy. Valid values: `Registry`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EndpointAclPolicyState.__new__(_EndpointAclPolicyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["endpoint_type"] = endpoint_type
        __props__.__dict__["entry"] = entry
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["module_name"] = module_name
        return EndpointAclPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the entry.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of endpoint. Valid values: `internet`.
        """
        return pulumi.get(self, "endpoint_type")

    @_builtins.property
    @pulumi.getter
    def entry(self) -> pulumi.Output[_builtins.str]:
        """
        The IP segment that allowed to access.
        """
        return pulumi.get(self, "entry")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the CR Instance.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="moduleName")
    def module_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The module that needs to set the access policy. Valid values: `Registry`.
        """
        return pulumi.get(self, "module_name")

