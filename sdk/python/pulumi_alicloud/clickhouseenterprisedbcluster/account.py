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
from . import outputs
from ._inputs import *

__all__ = ['AccountArgs', 'Account']

@pulumi.input_type
class AccountArgs:
    def __init__(__self__, *,
                 account: pulumi.Input[_builtins.str],
                 account_type: pulumi.Input[_builtins.str],
                 db_instance_id: pulumi.Input[_builtins.str],
                 password: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dml_auth_setting: Optional[pulumi.Input['AccountDmlAuthSettingArgs']] = None):
        """
        The set of arguments for constructing a Account resource.
        :param pulumi.Input[_builtins.str] account: The name of the database account.
        :param pulumi.Input[_builtins.str] account_type: The type of the database account. Valid values:
               - `NormalAccount`: Normal account number.
               - `SuperAccount`: The privileged account.
        :param pulumi.Input[_builtins.str] db_instance_id: The cluster ID.
        :param pulumi.Input[_builtins.str] password: Database account password. Set the following rules.
               - Consists of at least three of uppercase letters, lowercase letters, numbers, and special characters.
               - Oh-! @#$%^& *()_+-= is a special character.
               - Length is 8~32 characters.
        :param pulumi.Input[_builtins.str] description: Note information.
        :param pulumi.Input['AccountDmlAuthSettingArgs'] dml_auth_setting: Authorization information. See `dml_auth_setting` below.
        """
        pulumi.set(__self__, "account", account)
        pulumi.set(__self__, "account_type", account_type)
        pulumi.set(__self__, "db_instance_id", db_instance_id)
        pulumi.set(__self__, "password", password)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dml_auth_setting is not None:
            pulumi.set(__self__, "dml_auth_setting", dml_auth_setting)

    @_builtins.property
    @pulumi.getter
    def account(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the database account.
        """
        return pulumi.get(self, "account")

    @account.setter
    def account(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account", value)

    @_builtins.property
    @pulumi.getter(name="accountType")
    def account_type(self) -> pulumi.Input[_builtins.str]:
        """
        The type of the database account. Valid values:
        - `NormalAccount`: Normal account number.
        - `SuperAccount`: The privileged account.
        """
        return pulumi.get(self, "account_type")

    @account_type.setter
    def account_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_type", value)

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The cluster ID.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "db_instance_id", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> pulumi.Input[_builtins.str]:
        """
        Database account password. Set the following rules.
        - Consists of at least three of uppercase letters, lowercase letters, numbers, and special characters.
        - Oh-! @#$%^& *()_+-= is a special character.
        - Length is 8~32 characters.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "password", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Note information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="dmlAuthSetting")
    def dml_auth_setting(self) -> Optional[pulumi.Input['AccountDmlAuthSettingArgs']]:
        """
        Authorization information. See `dml_auth_setting` below.
        """
        return pulumi.get(self, "dml_auth_setting")

    @dml_auth_setting.setter
    def dml_auth_setting(self, value: Optional[pulumi.Input['AccountDmlAuthSettingArgs']]):
        pulumi.set(self, "dml_auth_setting", value)


@pulumi.input_type
class _AccountState:
    def __init__(__self__, *,
                 account: Optional[pulumi.Input[_builtins.str]] = None,
                 account_type: Optional[pulumi.Input[_builtins.str]] = None,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dml_auth_setting: Optional[pulumi.Input['AccountDmlAuthSettingArgs']] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Account resources.
        :param pulumi.Input[_builtins.str] account: The name of the database account.
        :param pulumi.Input[_builtins.str] account_type: The type of the database account. Valid values:
               - `NormalAccount`: Normal account number.
               - `SuperAccount`: The privileged account.
        :param pulumi.Input[_builtins.str] db_instance_id: The cluster ID.
        :param pulumi.Input[_builtins.str] description: Note information.
        :param pulumi.Input['AccountDmlAuthSettingArgs'] dml_auth_setting: Authorization information. See `dml_auth_setting` below.
        :param pulumi.Input[_builtins.str] password: Database account password. Set the following rules.
               - Consists of at least three of uppercase letters, lowercase letters, numbers, and special characters.
               - Oh-! @#$%^& *()_+-= is a special character.
               - Length is 8~32 characters.
        """
        if account is not None:
            pulumi.set(__self__, "account", account)
        if account_type is not None:
            pulumi.set(__self__, "account_type", account_type)
        if db_instance_id is not None:
            pulumi.set(__self__, "db_instance_id", db_instance_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dml_auth_setting is not None:
            pulumi.set(__self__, "dml_auth_setting", dml_auth_setting)
        if password is not None:
            pulumi.set(__self__, "password", password)

    @_builtins.property
    @pulumi.getter
    def account(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the database account.
        """
        return pulumi.get(self, "account")

    @account.setter
    def account(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account", value)

    @_builtins.property
    @pulumi.getter(name="accountType")
    def account_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the database account. Valid values:
        - `NormalAccount`: Normal account number.
        - `SuperAccount`: The privileged account.
        """
        return pulumi.get(self, "account_type")

    @account_type.setter
    def account_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_type", value)

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The cluster ID.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "db_instance_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Note information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="dmlAuthSetting")
    def dml_auth_setting(self) -> Optional[pulumi.Input['AccountDmlAuthSettingArgs']]:
        """
        Authorization information. See `dml_auth_setting` below.
        """
        return pulumi.get(self, "dml_auth_setting")

    @dml_auth_setting.setter
    def dml_auth_setting(self, value: Optional[pulumi.Input['AccountDmlAuthSettingArgs']]):
        pulumi.set(self, "dml_auth_setting", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Database account password. Set the following rules.
        - Consists of at least three of uppercase letters, lowercase letters, numbers, and special characters.
        - Oh-! @#$%^& *()_+-= is a special character.
        - Length is 8~32 characters.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password", value)


@pulumi.type_token("alicloud:clickhouseenterprisedbcluster/account:Account")
class Account(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account: Optional[pulumi.Input[_builtins.str]] = None,
                 account_type: Optional[pulumi.Input[_builtins.str]] = None,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dml_auth_setting: Optional[pulumi.Input[Union['AccountDmlAuthSettingArgs', 'AccountDmlAuthSettingArgsDict']]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Click House Enterprise Db Cluster Account resource.

        Clickhouse enterprise instance account.

        For information about Click House Enterprise Db Cluster Account and how to use it, see [What is Enterprise Db Cluster Account](https://next.api.alibabacloud.com/document/clickhouse/2023-05-22/CreateAccount).

        > **NOTE:** Available since v1.247.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        region_id = config.get("regionId")
        if region_id is None:
            region_id = "cn-beijing"
        vsw_ip_range_i = config.get("vswIpRangeI")
        if vsw_ip_range_i is None:
            vsw_ip_range_i = "172.16.1.0/24"
        vpc_ip_range = config.get("vpcIpRange")
        if vpc_ip_range is None:
            vpc_ip_range = "172.16.0.0/12"
        zone_id_i = config.get("zoneIdI")
        if zone_id_i is None:
            zone_id_i = "cn-beijing-i"
        defaultkt_k_lu_m = alicloud.vpc.Network("defaultktKLuM", cidr_block=vpc_ip_range)
        default_tqwn3k = alicloud.vpc.Switch("defaultTQWN3k",
            vpc_id=defaultkt_k_lu_m.id,
            zone_id=zone_id_i,
            cidr_block=vsw_ip_range_i)
        default_wrov_od = alicloud.clickhouseenterprisedbcluster.ClickHouseEnterpriseDbCluster("defaultWrovOd",
            zone_id=zone_id_i,
            vpc_id=defaultkt_k_lu_m.id,
            scale_min="8",
            scale_max="16",
            vswitch_id=default_tqwn3k.id)
        default = alicloud.clickhouseenterprisedbcluster.Account("default",
            account="abc",
            description="example_desc",
            db_instance_id=default_wrov_od.id,
            account_type="NormalAccount",
            password="abc123456!",
            dml_auth_setting={
                "dml_authority": 0,
                "ddl_authority": True,
                "allow_dictionaries": ["*"],
                "allow_databases": ["*"],
            })
        ```

        ## Import

        Click House Enterprise Db Cluster Account can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:clickhouseenterprisedbcluster/account:Account example <db_instance_id>:<account>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account: The name of the database account.
        :param pulumi.Input[_builtins.str] account_type: The type of the database account. Valid values:
               - `NormalAccount`: Normal account number.
               - `SuperAccount`: The privileged account.
        :param pulumi.Input[_builtins.str] db_instance_id: The cluster ID.
        :param pulumi.Input[_builtins.str] description: Note information.
        :param pulumi.Input[Union['AccountDmlAuthSettingArgs', 'AccountDmlAuthSettingArgsDict']] dml_auth_setting: Authorization information. See `dml_auth_setting` below.
        :param pulumi.Input[_builtins.str] password: Database account password. Set the following rules.
               - Consists of at least three of uppercase letters, lowercase letters, numbers, and special characters.
               - Oh-! @#$%^& *()_+-= is a special character.
               - Length is 8~32 characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Click House Enterprise Db Cluster Account resource.

        Clickhouse enterprise instance account.

        For information about Click House Enterprise Db Cluster Account and how to use it, see [What is Enterprise Db Cluster Account](https://next.api.alibabacloud.com/document/clickhouse/2023-05-22/CreateAccount).

        > **NOTE:** Available since v1.247.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        region_id = config.get("regionId")
        if region_id is None:
            region_id = "cn-beijing"
        vsw_ip_range_i = config.get("vswIpRangeI")
        if vsw_ip_range_i is None:
            vsw_ip_range_i = "172.16.1.0/24"
        vpc_ip_range = config.get("vpcIpRange")
        if vpc_ip_range is None:
            vpc_ip_range = "172.16.0.0/12"
        zone_id_i = config.get("zoneIdI")
        if zone_id_i is None:
            zone_id_i = "cn-beijing-i"
        defaultkt_k_lu_m = alicloud.vpc.Network("defaultktKLuM", cidr_block=vpc_ip_range)
        default_tqwn3k = alicloud.vpc.Switch("defaultTQWN3k",
            vpc_id=defaultkt_k_lu_m.id,
            zone_id=zone_id_i,
            cidr_block=vsw_ip_range_i)
        default_wrov_od = alicloud.clickhouseenterprisedbcluster.ClickHouseEnterpriseDbCluster("defaultWrovOd",
            zone_id=zone_id_i,
            vpc_id=defaultkt_k_lu_m.id,
            scale_min="8",
            scale_max="16",
            vswitch_id=default_tqwn3k.id)
        default = alicloud.clickhouseenterprisedbcluster.Account("default",
            account="abc",
            description="example_desc",
            db_instance_id=default_wrov_od.id,
            account_type="NormalAccount",
            password="abc123456!",
            dml_auth_setting={
                "dml_authority": 0,
                "ddl_authority": True,
                "allow_dictionaries": ["*"],
                "allow_databases": ["*"],
            })
        ```

        ## Import

        Click House Enterprise Db Cluster Account can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:clickhouseenterprisedbcluster/account:Account example <db_instance_id>:<account>
        ```

        :param str resource_name: The name of the resource.
        :param AccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account: Optional[pulumi.Input[_builtins.str]] = None,
                 account_type: Optional[pulumi.Input[_builtins.str]] = None,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dml_auth_setting: Optional[pulumi.Input[Union['AccountDmlAuthSettingArgs', 'AccountDmlAuthSettingArgsDict']]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountArgs.__new__(AccountArgs)

            if account is None and not opts.urn:
                raise TypeError("Missing required property 'account'")
            __props__.__dict__["account"] = account
            if account_type is None and not opts.urn:
                raise TypeError("Missing required property 'account_type'")
            __props__.__dict__["account_type"] = account_type
            if db_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_instance_id'")
            __props__.__dict__["db_instance_id"] = db_instance_id
            __props__.__dict__["description"] = description
            __props__.__dict__["dml_auth_setting"] = dml_auth_setting
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Account, __self__).__init__(
            'alicloud:clickhouseenterprisedbcluster/account:Account',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account: Optional[pulumi.Input[_builtins.str]] = None,
            account_type: Optional[pulumi.Input[_builtins.str]] = None,
            db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            dml_auth_setting: Optional[pulumi.Input[Union['AccountDmlAuthSettingArgs', 'AccountDmlAuthSettingArgsDict']]] = None,
            password: Optional[pulumi.Input[_builtins.str]] = None) -> 'Account':
        """
        Get an existing Account resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account: The name of the database account.
        :param pulumi.Input[_builtins.str] account_type: The type of the database account. Valid values:
               - `NormalAccount`: Normal account number.
               - `SuperAccount`: The privileged account.
        :param pulumi.Input[_builtins.str] db_instance_id: The cluster ID.
        :param pulumi.Input[_builtins.str] description: Note information.
        :param pulumi.Input[Union['AccountDmlAuthSettingArgs', 'AccountDmlAuthSettingArgsDict']] dml_auth_setting: Authorization information. See `dml_auth_setting` below.
        :param pulumi.Input[_builtins.str] password: Database account password. Set the following rules.
               - Consists of at least three of uppercase letters, lowercase letters, numbers, and special characters.
               - Oh-! @#$%^& *()_+-= is a special character.
               - Length is 8~32 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountState.__new__(_AccountState)

        __props__.__dict__["account"] = account
        __props__.__dict__["account_type"] = account_type
        __props__.__dict__["db_instance_id"] = db_instance_id
        __props__.__dict__["description"] = description
        __props__.__dict__["dml_auth_setting"] = dml_auth_setting
        __props__.__dict__["password"] = password
        return Account(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def account(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the database account.
        """
        return pulumi.get(self, "account")

    @_builtins.property
    @pulumi.getter(name="accountType")
    def account_type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of the database account. Valid values:
        - `NormalAccount`: Normal account number.
        - `SuperAccount`: The privileged account.
        """
        return pulumi.get(self, "account_type")

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The cluster ID.
        """
        return pulumi.get(self, "db_instance_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Note information.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="dmlAuthSetting")
    def dml_auth_setting(self) -> pulumi.Output[Optional['outputs.AccountDmlAuthSetting']]:
        """
        Authorization information. See `dml_auth_setting` below.
        """
        return pulumi.get(self, "dml_auth_setting")

    @_builtins.property
    @pulumi.getter
    def password(self) -> pulumi.Output[_builtins.str]:
        """
        Database account password. Set the following rules.
        - Consists of at least three of uppercase letters, lowercase letters, numbers, and special characters.
        - Oh-! @#$%^& *()_+-= is a special character.
        - Length is 8~32 characters.
        """
        return pulumi.get(self, "password")

