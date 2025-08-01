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

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[_builtins.str],
                 end_user_id: pulumi.Input[_builtins.str],
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 phone: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[_builtins.str] email: The email of the user email.
        :param pulumi.Input[_builtins.str] end_user_id: The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        :param pulumi.Input[_builtins.str] password: The password of the user password.
        :param pulumi.Input[_builtins.str] phone: The phone of the mobile phone number.
        :param pulumi.Input[_builtins.str] status: The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        pulumi.set(__self__, "email", email)
        pulumi.set(__self__, "end_user_id", end_user_id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if phone is not None:
            pulumi.set(__self__, "phone", phone)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def email(self) -> pulumi.Input[_builtins.str]:
        """
        The email of the user email.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "email", value)

    @_builtins.property
    @pulumi.getter(name="endUserId")
    def end_user_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        """
        return pulumi.get(self, "end_user_id")

    @end_user_id.setter
    def end_user_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "end_user_id", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The password of the user password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password", value)

    @_builtins.property
    @pulumi.getter
    def phone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The phone of the mobile phone number.
        """
        return pulumi.get(self, "phone")

    @phone.setter
    def phone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "phone", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 email: Optional[pulumi.Input[_builtins.str]] = None,
                 end_user_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 phone: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[_builtins.str] email: The email of the user email.
        :param pulumi.Input[_builtins.str] end_user_id: The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        :param pulumi.Input[_builtins.str] password: The password of the user password.
        :param pulumi.Input[_builtins.str] phone: The phone of the mobile phone number.
        :param pulumi.Input[_builtins.str] status: The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        if email is not None:
            pulumi.set(__self__, "email", email)
        if end_user_id is not None:
            pulumi.set(__self__, "end_user_id", end_user_id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if phone is not None:
            pulumi.set(__self__, "phone", phone)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The email of the user email.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "email", value)

    @_builtins.property
    @pulumi.getter(name="endUserId")
    def end_user_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        """
        return pulumi.get(self, "end_user_id")

    @end_user_id.setter
    def end_user_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "end_user_id", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The password of the user password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password", value)

    @_builtins.property
    @pulumi.getter
    def phone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The phone of the mobile phone number.
        """
        return pulumi.get(self, "phone")

    @phone.setter
    def phone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "phone", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:eds/user:User")
class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email: Optional[pulumi.Input[_builtins.str]] = None,
                 end_user_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 phone: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Elastic Desktop Service (ECD) User resource.

        For information about Elastic Desktop Service (ECD) User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-eds-user-2021-03-08-createusers-desktop).

        > **NOTE:** Available since v1.142.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.eds.User("default",
            end_user_id="terraform_example123",
            email="tf.example@abc.com",
            phone="18888888888",
            password="Example_123")
        ```

        ## Import

        ECD User can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:eds/user:User example <end_user_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] email: The email of the user email.
        :param pulumi.Input[_builtins.str] end_user_id: The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        :param pulumi.Input[_builtins.str] password: The password of the user password.
        :param pulumi.Input[_builtins.str] phone: The phone of the mobile phone number.
        :param pulumi.Input[_builtins.str] status: The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Elastic Desktop Service (ECD) User resource.

        For information about Elastic Desktop Service (ECD) User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-eds-user-2021-03-08-createusers-desktop).

        > **NOTE:** Available since v1.142.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.eds.User("default",
            end_user_id="terraform_example123",
            email="tf.example@abc.com",
            phone="18888888888",
            password="Example_123")
        ```

        ## Import

        ECD User can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:eds/user:User example <end_user_id>
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email: Optional[pulumi.Input[_builtins.str]] = None,
                 end_user_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 phone: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            if email is None and not opts.urn:
                raise TypeError("Missing required property 'email'")
            __props__.__dict__["email"] = email
            if end_user_id is None and not opts.urn:
                raise TypeError("Missing required property 'end_user_id'")
            __props__.__dict__["end_user_id"] = end_user_id
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["phone"] = phone
            __props__.__dict__["status"] = status
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(User, __self__).__init__(
            'alicloud:eds/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            email: Optional[pulumi.Input[_builtins.str]] = None,
            end_user_id: Optional[pulumi.Input[_builtins.str]] = None,
            password: Optional[pulumi.Input[_builtins.str]] = None,
            phone: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] email: The email of the user email.
        :param pulumi.Input[_builtins.str] end_user_id: The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        :param pulumi.Input[_builtins.str] password: The password of the user password.
        :param pulumi.Input[_builtins.str] phone: The phone of the mobile phone number.
        :param pulumi.Input[_builtins.str] status: The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["email"] = email
        __props__.__dict__["end_user_id"] = end_user_id
        __props__.__dict__["password"] = password
        __props__.__dict__["phone"] = phone
        __props__.__dict__["status"] = status
        return User(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def email(self) -> pulumi.Output[_builtins.str]:
        """
        The email of the user email.
        """
        return pulumi.get(self, "email")

    @_builtins.property
    @pulumi.getter(name="endUserId")
    def end_user_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        """
        return pulumi.get(self, "end_user_id")

    @_builtins.property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The password of the user password.
        """
        return pulumi.get(self, "password")

    @_builtins.property
    @pulumi.getter
    def phone(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The phone of the mobile phone number.
        """
        return pulumi.get(self, "phone")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        return pulumi.get(self, "status")

