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

__all__ = ['DelegatedAdministratorArgs', 'DelegatedAdministrator']

@pulumi.input_type
class DelegatedAdministratorArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 service_principal: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a DelegatedAdministrator resource.
        :param pulumi.Input[_builtins.str] account_id: The ID of the member account in the resource directory.
        :param pulumi.Input[_builtins.str] service_principal: The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "service_principal", service_principal)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the member account in the resource directory.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="servicePrincipal")
    def service_principal(self) -> pulumi.Input[_builtins.str]:
        """
        The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
        """
        return pulumi.get(self, "service_principal")

    @service_principal.setter
    def service_principal(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "service_principal", value)


@pulumi.input_type
class _DelegatedAdministratorState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 service_principal: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering DelegatedAdministrator resources.
        :param pulumi.Input[_builtins.str] account_id: The ID of the member account in the resource directory.
        :param pulumi.Input[_builtins.str] service_principal: The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if service_principal is not None:
            pulumi.set(__self__, "service_principal", service_principal)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the member account in the resource directory.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="servicePrincipal")
    def service_principal(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
        """
        return pulumi.get(self, "service_principal")

    @service_principal.setter
    def service_principal(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_principal", value)


@pulumi.type_token("alicloud:resourcemanager/delegatedAdministrator:DelegatedAdministrator")
class DelegatedAdministrator(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 service_principal: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Resource Manager Delegated Administrator resource.

        For information about Resource Manager Delegated Administrator and how to use it, see [What is Delegated Administrator](https://www.alibabacloud.com/help/en/resource-management/latest/registerdelegatedadministrator#doc-api-ResourceManager-RegisterDelegatedAdministrator).

        > **NOTE:** Available since v1.181.0.

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
        display_name = config.get("displayName")
        if display_name is None:
            display_name = "EAccount"
        default = random.index.Integer("default",
            min=10000,
            max=99999)
        example = alicloud.resourcemanager.get_folders()
        example_account = alicloud.resourcemanager.Account("example",
            display_name=f"{display_name}-{default['result']}",
            folder_id=example.ids[0])
        example_delegated_administrator = alicloud.resourcemanager.DelegatedAdministrator("example",
            account_id=example_account.id,
            service_principal="cloudfw.aliyuncs.com")
        ```

        ## Import

        Resource Manager Delegated Administrator can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:resourcemanager/delegatedAdministrator:DelegatedAdministrator example <account_id>:<service_principal>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: The ID of the member account in the resource directory.
        :param pulumi.Input[_builtins.str] service_principal: The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DelegatedAdministratorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Resource Manager Delegated Administrator resource.

        For information about Resource Manager Delegated Administrator and how to use it, see [What is Delegated Administrator](https://www.alibabacloud.com/help/en/resource-management/latest/registerdelegatedadministrator#doc-api-ResourceManager-RegisterDelegatedAdministrator).

        > **NOTE:** Available since v1.181.0.

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
        display_name = config.get("displayName")
        if display_name is None:
            display_name = "EAccount"
        default = random.index.Integer("default",
            min=10000,
            max=99999)
        example = alicloud.resourcemanager.get_folders()
        example_account = alicloud.resourcemanager.Account("example",
            display_name=f"{display_name}-{default['result']}",
            folder_id=example.ids[0])
        example_delegated_administrator = alicloud.resourcemanager.DelegatedAdministrator("example",
            account_id=example_account.id,
            service_principal="cloudfw.aliyuncs.com")
        ```

        ## Import

        Resource Manager Delegated Administrator can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:resourcemanager/delegatedAdministrator:DelegatedAdministrator example <account_id>:<service_principal>
        ```

        :param str resource_name: The name of the resource.
        :param DelegatedAdministratorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DelegatedAdministratorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 service_principal: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DelegatedAdministratorArgs.__new__(DelegatedAdministratorArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if service_principal is None and not opts.urn:
                raise TypeError("Missing required property 'service_principal'")
            __props__.__dict__["service_principal"] = service_principal
        super(DelegatedAdministrator, __self__).__init__(
            'alicloud:resourcemanager/delegatedAdministrator:DelegatedAdministrator',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            service_principal: Optional[pulumi.Input[_builtins.str]] = None) -> 'DelegatedAdministrator':
        """
        Get an existing DelegatedAdministrator resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: The ID of the member account in the resource directory.
        :param pulumi.Input[_builtins.str] service_principal: The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DelegatedAdministratorState.__new__(_DelegatedAdministratorState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["service_principal"] = service_principal
        return DelegatedAdministrator(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the member account in the resource directory.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="servicePrincipal")
    def service_principal(self) -> pulumi.Output[_builtins.str]:
        """
        The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
        """
        return pulumi.get(self, "service_principal")

