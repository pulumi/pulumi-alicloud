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

__all__ = ['LoginProfileArgs', 'LoginProfile']

@pulumi.input_type
class LoginProfileArgs:
    def __init__(__self__, *,
                 password: pulumi.Input[str],
                 user_name: pulumi.Input[str],
                 mfa_bind_required: Optional[pulumi.Input[bool]] = None,
                 password_reset_required: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a LoginProfile resource.
        :param pulumi.Input[str] password: The logon password of the RAM user. The password must meet the password strength requirements.
        :param pulumi.Input[str] user_name: The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        :param pulumi.Input[bool] mfa_bind_required: Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
        :param pulumi.Input[bool] password_reset_required: Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
        """
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "user_name", user_name)
        if mfa_bind_required is not None:
            pulumi.set(__self__, "mfa_bind_required", mfa_bind_required)
        if password_reset_required is not None:
            pulumi.set(__self__, "password_reset_required", password_reset_required)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        The logon password of the RAM user. The password must meet the password strength requirements.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Input[str]:
        """
        The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_name", value)

    @property
    @pulumi.getter(name="mfaBindRequired")
    def mfa_bind_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
        """
        return pulumi.get(self, "mfa_bind_required")

    @mfa_bind_required.setter
    def mfa_bind_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "mfa_bind_required", value)

    @property
    @pulumi.getter(name="passwordResetRequired")
    def password_reset_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "password_reset_required")

    @password_reset_required.setter
    def password_reset_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "password_reset_required", value)


@pulumi.input_type
class _LoginProfileState:
    def __init__(__self__, *,
                 mfa_bind_required: Optional[pulumi.Input[bool]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 password_reset_required: Optional[pulumi.Input[bool]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LoginProfile resources.
        :param pulumi.Input[bool] mfa_bind_required: Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
        :param pulumi.Input[str] password: The logon password of the RAM user. The password must meet the password strength requirements.
        :param pulumi.Input[bool] password_reset_required: Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
        :param pulumi.Input[str] user_name: The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        """
        if mfa_bind_required is not None:
            pulumi.set(__self__, "mfa_bind_required", mfa_bind_required)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if password_reset_required is not None:
            pulumi.set(__self__, "password_reset_required", password_reset_required)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter(name="mfaBindRequired")
    def mfa_bind_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
        """
        return pulumi.get(self, "mfa_bind_required")

    @mfa_bind_required.setter
    def mfa_bind_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "mfa_bind_required", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The logon password of the RAM user. The password must meet the password strength requirements.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="passwordResetRequired")
    def password_reset_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "password_reset_required")

    @password_reset_required.setter
    def password_reset_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "password_reset_required", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)


class LoginProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mfa_bind_required: Optional[pulumi.Input[bool]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 password_reset_required: Optional[pulumi.Input[bool]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a RAM User Login Profile resource.

        For information about RAM User Login Profile and how to use it, see [What is Login Profile](https://www.alibabacloud.com/help/en/ram/developer-reference/api-ram-2015-05-01-createloginprofile).

        > **NOTE:** Available since v1.0.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        user = alicloud.ram.User("user",
            name="terraform_example",
            display_name="terraform_example",
            mobile="86-18688888888",
            email="hello.uuu@aaa.com",
            comments="terraform_example",
            force=True)
        profile = alicloud.ram.LoginProfile("profile",
            user_name=user.name,
            password="Example_1234")
        ```

        ## Import

        RAM login profile can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ram/loginProfile:LoginProfile example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] mfa_bind_required: Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
        :param pulumi.Input[str] password: The logon password of the RAM user. The password must meet the password strength requirements.
        :param pulumi.Input[bool] password_reset_required: Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
        :param pulumi.Input[str] user_name: The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoginProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RAM User Login Profile resource.

        For information about RAM User Login Profile and how to use it, see [What is Login Profile](https://www.alibabacloud.com/help/en/ram/developer-reference/api-ram-2015-05-01-createloginprofile).

        > **NOTE:** Available since v1.0.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        user = alicloud.ram.User("user",
            name="terraform_example",
            display_name="terraform_example",
            mobile="86-18688888888",
            email="hello.uuu@aaa.com",
            comments="terraform_example",
            force=True)
        profile = alicloud.ram.LoginProfile("profile",
            user_name=user.name,
            password="Example_1234")
        ```

        ## Import

        RAM login profile can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ram/loginProfile:LoginProfile example <id>
        ```

        :param str resource_name: The name of the resource.
        :param LoginProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoginProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mfa_bind_required: Optional[pulumi.Input[bool]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 password_reset_required: Optional[pulumi.Input[bool]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoginProfileArgs.__new__(LoginProfileArgs)

            __props__.__dict__["mfa_bind_required"] = mfa_bind_required
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["password_reset_required"] = password_reset_required
            if user_name is None and not opts.urn:
                raise TypeError("Missing required property 'user_name'")
            __props__.__dict__["user_name"] = user_name
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(LoginProfile, __self__).__init__(
            'alicloud:ram/loginProfile:LoginProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            mfa_bind_required: Optional[pulumi.Input[bool]] = None,
            password: Optional[pulumi.Input[str]] = None,
            password_reset_required: Optional[pulumi.Input[bool]] = None,
            user_name: Optional[pulumi.Input[str]] = None) -> 'LoginProfile':
        """
        Get an existing LoginProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] mfa_bind_required: Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
        :param pulumi.Input[str] password: The logon password of the RAM user. The password must meet the password strength requirements.
        :param pulumi.Input[bool] password_reset_required: Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
        :param pulumi.Input[str] user_name: The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoginProfileState.__new__(_LoginProfileState)

        __props__.__dict__["mfa_bind_required"] = mfa_bind_required
        __props__.__dict__["password"] = password
        __props__.__dict__["password_reset_required"] = password_reset_required
        __props__.__dict__["user_name"] = user_name
        return LoginProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="mfaBindRequired")
    def mfa_bind_required(self) -> pulumi.Output[bool]:
        """
        Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
        """
        return pulumi.get(self, "mfa_bind_required")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        The logon password of the RAM user. The password must meet the password strength requirements.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="passwordResetRequired")
    def password_reset_required(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "password_reset_required")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        """
        The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        """
        return pulumi.get(self, "user_name")

