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

__all__ = [
    'AccessConfigurationPermissionPolicyArgs',
    'AccessConfigurationPermissionPolicyArgsDict',
    'DirectoryLoginPreferenceArgs',
    'DirectoryLoginPreferenceArgsDict',
    'DirectoryMfaAuthenticationSettingInfoArgs',
    'DirectoryMfaAuthenticationSettingInfoArgsDict',
    'DirectoryPasswordPolicyArgs',
    'DirectoryPasswordPolicyArgsDict',
    'DirectorySamlIdentityProviderConfigurationArgs',
    'DirectorySamlIdentityProviderConfigurationArgsDict',
    'DirectorySamlServiceProviderArgs',
    'DirectorySamlServiceProviderArgsDict',
    'DirectoryUserProvisioningConfigurationArgs',
    'DirectoryUserProvisioningConfigurationArgsDict',
]

MYPY = False

if not MYPY:
    class AccessConfigurationPermissionPolicyArgsDict(TypedDict):
        permission_policy_name: pulumi.Input[_builtins.str]
        """
        The name of the policy.
        """
        permission_policy_type: pulumi.Input[_builtins.str]
        """
        The type of the policy. Valid values: `System`, `Inline`.
        """
        permission_policy_document: NotRequired[pulumi.Input[_builtins.str]]
        """
        The configurations of the inline policy. **NOTE:** If `permission_policy_type` is set to `Inline`, `permission_policy_document` is required.
        """
elif False:
    AccessConfigurationPermissionPolicyArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class AccessConfigurationPermissionPolicyArgs:
    def __init__(__self__, *,
                 permission_policy_name: pulumi.Input[_builtins.str],
                 permission_policy_type: pulumi.Input[_builtins.str],
                 permission_policy_document: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] permission_policy_name: The name of the policy.
        :param pulumi.Input[_builtins.str] permission_policy_type: The type of the policy. Valid values: `System`, `Inline`.
        :param pulumi.Input[_builtins.str] permission_policy_document: The configurations of the inline policy. **NOTE:** If `permission_policy_type` is set to `Inline`, `permission_policy_document` is required.
        """
        pulumi.set(__self__, "permission_policy_name", permission_policy_name)
        pulumi.set(__self__, "permission_policy_type", permission_policy_type)
        if permission_policy_document is not None:
            pulumi.set(__self__, "permission_policy_document", permission_policy_document)

    @_builtins.property
    @pulumi.getter(name="permissionPolicyName")
    def permission_policy_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the policy.
        """
        return pulumi.get(self, "permission_policy_name")

    @permission_policy_name.setter
    def permission_policy_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "permission_policy_name", value)

    @_builtins.property
    @pulumi.getter(name="permissionPolicyType")
    def permission_policy_type(self) -> pulumi.Input[_builtins.str]:
        """
        The type of the policy. Valid values: `System`, `Inline`.
        """
        return pulumi.get(self, "permission_policy_type")

    @permission_policy_type.setter
    def permission_policy_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "permission_policy_type", value)

    @_builtins.property
    @pulumi.getter(name="permissionPolicyDocument")
    def permission_policy_document(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The configurations of the inline policy. **NOTE:** If `permission_policy_type` is set to `Inline`, `permission_policy_document` is required.
        """
        return pulumi.get(self, "permission_policy_document")

    @permission_policy_document.setter
    def permission_policy_document(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "permission_policy_document", value)


if not MYPY:
    class DirectoryLoginPreferenceArgsDict(TypedDict):
        allow_user_to_get_credentials: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether the user can obtain the program access credential in the portal after logging in.
        """
        login_network_masks: NotRequired[pulumi.Input[_builtins.str]]
        """
        IP address whitelist
        """
elif False:
    DirectoryLoginPreferenceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class DirectoryLoginPreferenceArgs:
    def __init__(__self__, *,
                 allow_user_to_get_credentials: Optional[pulumi.Input[_builtins.bool]] = None,
                 login_network_masks: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.bool] allow_user_to_get_credentials: Whether the user can obtain the program access credential in the portal after logging in.
        :param pulumi.Input[_builtins.str] login_network_masks: IP address whitelist
        """
        if allow_user_to_get_credentials is not None:
            pulumi.set(__self__, "allow_user_to_get_credentials", allow_user_to_get_credentials)
        if login_network_masks is not None:
            pulumi.set(__self__, "login_network_masks", login_network_masks)

    @_builtins.property
    @pulumi.getter(name="allowUserToGetCredentials")
    def allow_user_to_get_credentials(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the user can obtain the program access credential in the portal after logging in.
        """
        return pulumi.get(self, "allow_user_to_get_credentials")

    @allow_user_to_get_credentials.setter
    def allow_user_to_get_credentials(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "allow_user_to_get_credentials", value)

    @_builtins.property
    @pulumi.getter(name="loginNetworkMasks")
    def login_network_masks(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        IP address whitelist
        """
        return pulumi.get(self, "login_network_masks")

    @login_network_masks.setter
    def login_network_masks(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "login_network_masks", value)


if not MYPY:
    class DirectoryMfaAuthenticationSettingInfoArgsDict(TypedDict):
        mfa_authentication_advance_settings: NotRequired[pulumi.Input[_builtins.str]]
        """
        Global MFA validation policy
        """
        operation_for_risk_login: NotRequired[pulumi.Input[_builtins.str]]
        """
        MFA verification policy for abnormal logon.
        """
elif False:
    DirectoryMfaAuthenticationSettingInfoArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class DirectoryMfaAuthenticationSettingInfoArgs:
    def __init__(__self__, *,
                 mfa_authentication_advance_settings: Optional[pulumi.Input[_builtins.str]] = None,
                 operation_for_risk_login: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] mfa_authentication_advance_settings: Global MFA validation policy
        :param pulumi.Input[_builtins.str] operation_for_risk_login: MFA verification policy for abnormal logon.
        """
        if mfa_authentication_advance_settings is not None:
            pulumi.set(__self__, "mfa_authentication_advance_settings", mfa_authentication_advance_settings)
        if operation_for_risk_login is not None:
            pulumi.set(__self__, "operation_for_risk_login", operation_for_risk_login)

    @_builtins.property
    @pulumi.getter(name="mfaAuthenticationAdvanceSettings")
    def mfa_authentication_advance_settings(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Global MFA validation policy
        """
        return pulumi.get(self, "mfa_authentication_advance_settings")

    @mfa_authentication_advance_settings.setter
    def mfa_authentication_advance_settings(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mfa_authentication_advance_settings", value)

    @_builtins.property
    @pulumi.getter(name="operationForRiskLogin")
    def operation_for_risk_login(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        MFA verification policy for abnormal logon.
        """
        return pulumi.get(self, "operation_for_risk_login")

    @operation_for_risk_login.setter
    def operation_for_risk_login(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "operation_for_risk_login", value)


if not MYPY:
    class DirectoryPasswordPolicyArgsDict(TypedDict):
        hard_expire: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether to restrict login after Password Expiration
        """
        max_login_attempts: NotRequired[pulumi.Input[_builtins.int]]
        """
        Number of password retries.
        """
        max_password_age: NotRequired[pulumi.Input[_builtins.int]]
        """
        Password validity period.
        """
        max_password_length: NotRequired[pulumi.Input[_builtins.int]]
        """
        Maximum password length.
        """
        min_password_different_chars: NotRequired[pulumi.Input[_builtins.int]]
        """
        The minimum number of different characters in a password.
        """
        min_password_length: NotRequired[pulumi.Input[_builtins.int]]
        """
        Minimum password length.
        """
        password_not_contain_username: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether the user name is not allowed in the password.
        """
        password_reuse_prevention: NotRequired[pulumi.Input[_builtins.int]]
        """
        Historical password check policy.
        """
        require_lower_case_chars: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether lowercase letters are required in the password.
        """
        require_numbers: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether numbers are required in the password.
        """
        require_symbols: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether symbols are required in the password.
        """
        require_upper_case_chars: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether uppercase letters are required in the password.
        """
elif False:
    DirectoryPasswordPolicyArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class DirectoryPasswordPolicyArgs:
    def __init__(__self__, *,
                 hard_expire: Optional[pulumi.Input[_builtins.bool]] = None,
                 max_login_attempts: Optional[pulumi.Input[_builtins.int]] = None,
                 max_password_age: Optional[pulumi.Input[_builtins.int]] = None,
                 max_password_length: Optional[pulumi.Input[_builtins.int]] = None,
                 min_password_different_chars: Optional[pulumi.Input[_builtins.int]] = None,
                 min_password_length: Optional[pulumi.Input[_builtins.int]] = None,
                 password_not_contain_username: Optional[pulumi.Input[_builtins.bool]] = None,
                 password_reuse_prevention: Optional[pulumi.Input[_builtins.int]] = None,
                 require_lower_case_chars: Optional[pulumi.Input[_builtins.bool]] = None,
                 require_numbers: Optional[pulumi.Input[_builtins.bool]] = None,
                 require_symbols: Optional[pulumi.Input[_builtins.bool]] = None,
                 require_upper_case_chars: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.bool] hard_expire: Whether to restrict login after Password Expiration
        :param pulumi.Input[_builtins.int] max_login_attempts: Number of password retries.
        :param pulumi.Input[_builtins.int] max_password_age: Password validity period.
        :param pulumi.Input[_builtins.int] max_password_length: Maximum password length.
        :param pulumi.Input[_builtins.int] min_password_different_chars: The minimum number of different characters in a password.
        :param pulumi.Input[_builtins.int] min_password_length: Minimum password length.
        :param pulumi.Input[_builtins.bool] password_not_contain_username: Whether the user name is not allowed in the password.
        :param pulumi.Input[_builtins.int] password_reuse_prevention: Historical password check policy.
        :param pulumi.Input[_builtins.bool] require_lower_case_chars: Whether lowercase letters are required in the password.
        :param pulumi.Input[_builtins.bool] require_numbers: Whether numbers are required in the password.
        :param pulumi.Input[_builtins.bool] require_symbols: Whether symbols are required in the password.
        :param pulumi.Input[_builtins.bool] require_upper_case_chars: Whether uppercase letters are required in the password.
        """
        if hard_expire is not None:
            pulumi.set(__self__, "hard_expire", hard_expire)
        if max_login_attempts is not None:
            pulumi.set(__self__, "max_login_attempts", max_login_attempts)
        if max_password_age is not None:
            pulumi.set(__self__, "max_password_age", max_password_age)
        if max_password_length is not None:
            pulumi.set(__self__, "max_password_length", max_password_length)
        if min_password_different_chars is not None:
            pulumi.set(__self__, "min_password_different_chars", min_password_different_chars)
        if min_password_length is not None:
            pulumi.set(__self__, "min_password_length", min_password_length)
        if password_not_contain_username is not None:
            pulumi.set(__self__, "password_not_contain_username", password_not_contain_username)
        if password_reuse_prevention is not None:
            pulumi.set(__self__, "password_reuse_prevention", password_reuse_prevention)
        if require_lower_case_chars is not None:
            pulumi.set(__self__, "require_lower_case_chars", require_lower_case_chars)
        if require_numbers is not None:
            pulumi.set(__self__, "require_numbers", require_numbers)
        if require_symbols is not None:
            pulumi.set(__self__, "require_symbols", require_symbols)
        if require_upper_case_chars is not None:
            pulumi.set(__self__, "require_upper_case_chars", require_upper_case_chars)

    @_builtins.property
    @pulumi.getter(name="hardExpire")
    def hard_expire(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to restrict login after Password Expiration
        """
        return pulumi.get(self, "hard_expire")

    @hard_expire.setter
    def hard_expire(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "hard_expire", value)

    @_builtins.property
    @pulumi.getter(name="maxLoginAttempts")
    def max_login_attempts(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Number of password retries.
        """
        return pulumi.get(self, "max_login_attempts")

    @max_login_attempts.setter
    def max_login_attempts(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "max_login_attempts", value)

    @_builtins.property
    @pulumi.getter(name="maxPasswordAge")
    def max_password_age(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Password validity period.
        """
        return pulumi.get(self, "max_password_age")

    @max_password_age.setter
    def max_password_age(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "max_password_age", value)

    @_builtins.property
    @pulumi.getter(name="maxPasswordLength")
    def max_password_length(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Maximum password length.
        """
        return pulumi.get(self, "max_password_length")

    @max_password_length.setter
    def max_password_length(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "max_password_length", value)

    @_builtins.property
    @pulumi.getter(name="minPasswordDifferentChars")
    def min_password_different_chars(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The minimum number of different characters in a password.
        """
        return pulumi.get(self, "min_password_different_chars")

    @min_password_different_chars.setter
    def min_password_different_chars(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "min_password_different_chars", value)

    @_builtins.property
    @pulumi.getter(name="minPasswordLength")
    def min_password_length(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Minimum password length.
        """
        return pulumi.get(self, "min_password_length")

    @min_password_length.setter
    def min_password_length(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "min_password_length", value)

    @_builtins.property
    @pulumi.getter(name="passwordNotContainUsername")
    def password_not_contain_username(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the user name is not allowed in the password.
        """
        return pulumi.get(self, "password_not_contain_username")

    @password_not_contain_username.setter
    def password_not_contain_username(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "password_not_contain_username", value)

    @_builtins.property
    @pulumi.getter(name="passwordReusePrevention")
    def password_reuse_prevention(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Historical password check policy.
        """
        return pulumi.get(self, "password_reuse_prevention")

    @password_reuse_prevention.setter
    def password_reuse_prevention(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "password_reuse_prevention", value)

    @_builtins.property
    @pulumi.getter(name="requireLowerCaseChars")
    def require_lower_case_chars(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether lowercase letters are required in the password.
        """
        return pulumi.get(self, "require_lower_case_chars")

    @require_lower_case_chars.setter
    def require_lower_case_chars(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "require_lower_case_chars", value)

    @_builtins.property
    @pulumi.getter(name="requireNumbers")
    def require_numbers(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether numbers are required in the password.
        """
        return pulumi.get(self, "require_numbers")

    @require_numbers.setter
    def require_numbers(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "require_numbers", value)

    @_builtins.property
    @pulumi.getter(name="requireSymbols")
    def require_symbols(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether symbols are required in the password.
        """
        return pulumi.get(self, "require_symbols")

    @require_symbols.setter
    def require_symbols(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "require_symbols", value)

    @_builtins.property
    @pulumi.getter(name="requireUpperCaseChars")
    def require_upper_case_chars(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether uppercase letters are required in the password.
        """
        return pulumi.get(self, "require_upper_case_chars")

    @require_upper_case_chars.setter
    def require_upper_case_chars(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "require_upper_case_chars", value)


if not MYPY:
    class DirectorySamlIdentityProviderConfigurationArgsDict(TypedDict):
        binding_type: NotRequired[pulumi.Input[_builtins.str]]
        """
        The Binding method for initiating a SAML request.
        """
        certificate_ids: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]
        """
        Certificate ID list
        """
        create_time: NotRequired[pulumi.Input[_builtins.str]]
        """
        CreateTime
        """
        encoded_metadata_document: NotRequired[pulumi.Input[_builtins.str]]
        """
        EncodedMetadataDocument
        """
        entity_id: NotRequired[pulumi.Input[_builtins.str]]
        """
        EntityId
        """
        login_url: NotRequired[pulumi.Input[_builtins.str]]
        """
        LoginUrl
        """
        sso_status: NotRequired[pulumi.Input[_builtins.str]]
        """
        SSOStatus
        """
        update_time: NotRequired[pulumi.Input[_builtins.str]]
        """
        UpdateTime
        """
        want_request_signed: NotRequired[pulumi.Input[_builtins.bool]]
        """
        SP Request whether the signature is required
        """
elif False:
    DirectorySamlIdentityProviderConfigurationArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class DirectorySamlIdentityProviderConfigurationArgs:
    def __init__(__self__, *,
                 binding_type: Optional[pulumi.Input[_builtins.str]] = None,
                 certificate_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 encoded_metadata_document: Optional[pulumi.Input[_builtins.str]] = None,
                 entity_id: Optional[pulumi.Input[_builtins.str]] = None,
                 login_url: Optional[pulumi.Input[_builtins.str]] = None,
                 sso_status: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None,
                 want_request_signed: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.str] binding_type: The Binding method for initiating a SAML request.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] certificate_ids: Certificate ID list
        :param pulumi.Input[_builtins.str] create_time: CreateTime
        :param pulumi.Input[_builtins.str] encoded_metadata_document: EncodedMetadataDocument
        :param pulumi.Input[_builtins.str] entity_id: EntityId
        :param pulumi.Input[_builtins.str] login_url: LoginUrl
        :param pulumi.Input[_builtins.str] sso_status: SSOStatus
        :param pulumi.Input[_builtins.str] update_time: UpdateTime
        :param pulumi.Input[_builtins.bool] want_request_signed: SP Request whether the signature is required
        """
        if binding_type is not None:
            pulumi.set(__self__, "binding_type", binding_type)
        if certificate_ids is not None:
            pulumi.set(__self__, "certificate_ids", certificate_ids)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if encoded_metadata_document is not None:
            pulumi.set(__self__, "encoded_metadata_document", encoded_metadata_document)
        if entity_id is not None:
            pulumi.set(__self__, "entity_id", entity_id)
        if login_url is not None:
            pulumi.set(__self__, "login_url", login_url)
        if sso_status is not None:
            pulumi.set(__self__, "sso_status", sso_status)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)
        if want_request_signed is not None:
            pulumi.set(__self__, "want_request_signed", want_request_signed)

    @_builtins.property
    @pulumi.getter(name="bindingType")
    def binding_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Binding method for initiating a SAML request.
        """
        return pulumi.get(self, "binding_type")

    @binding_type.setter
    def binding_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "binding_type", value)

    @_builtins.property
    @pulumi.getter(name="certificateIds")
    def certificate_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Certificate ID list
        """
        return pulumi.get(self, "certificate_ids")

    @certificate_ids.setter
    def certificate_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "certificate_ids", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        CreateTime
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="encodedMetadataDocument")
    def encoded_metadata_document(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        EncodedMetadataDocument
        """
        return pulumi.get(self, "encoded_metadata_document")

    @encoded_metadata_document.setter
    def encoded_metadata_document(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "encoded_metadata_document", value)

    @_builtins.property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        EntityId
        """
        return pulumi.get(self, "entity_id")

    @entity_id.setter
    def entity_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "entity_id", value)

    @_builtins.property
    @pulumi.getter(name="loginUrl")
    def login_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        LoginUrl
        """
        return pulumi.get(self, "login_url")

    @login_url.setter
    def login_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "login_url", value)

    @_builtins.property
    @pulumi.getter(name="ssoStatus")
    def sso_status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        SSOStatus
        """
        return pulumi.get(self, "sso_status")

    @sso_status.setter
    def sso_status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "sso_status", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        UpdateTime
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)

    @_builtins.property
    @pulumi.getter(name="wantRequestSigned")
    def want_request_signed(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        SP Request whether the signature is required
        """
        return pulumi.get(self, "want_request_signed")

    @want_request_signed.setter
    def want_request_signed(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "want_request_signed", value)


if not MYPY:
    class DirectorySamlServiceProviderArgsDict(TypedDict):
        acs_url: NotRequired[pulumi.Input[_builtins.str]]
        """
        ACS URL of SP.
        """
        authn_sign_algo: NotRequired[pulumi.Input[_builtins.str]]
        """
        Signature algorithms supported by AuthNRequest
        """
        certificate_type: NotRequired[pulumi.Input[_builtins.str]]
        """
        Type of certificate used for signing in the SSO process
        """
        encoded_metadata_document: NotRequired[pulumi.Input[_builtins.str]]
        """
        SP metadata document (Base64 encoding).
        """
        entity_id: NotRequired[pulumi.Input[_builtins.str]]
        """
        SP identity.
        """
        support_encrypted_assertion: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Whether IdP-side encryption of Assertion is supported.
        """
elif False:
    DirectorySamlServiceProviderArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class DirectorySamlServiceProviderArgs:
    def __init__(__self__, *,
                 acs_url: Optional[pulumi.Input[_builtins.str]] = None,
                 authn_sign_algo: Optional[pulumi.Input[_builtins.str]] = None,
                 certificate_type: Optional[pulumi.Input[_builtins.str]] = None,
                 encoded_metadata_document: Optional[pulumi.Input[_builtins.str]] = None,
                 entity_id: Optional[pulumi.Input[_builtins.str]] = None,
                 support_encrypted_assertion: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.str] acs_url: ACS URL of SP.
        :param pulumi.Input[_builtins.str] authn_sign_algo: Signature algorithms supported by AuthNRequest
        :param pulumi.Input[_builtins.str] certificate_type: Type of certificate used for signing in the SSO process
        :param pulumi.Input[_builtins.str] encoded_metadata_document: SP metadata document (Base64 encoding).
        :param pulumi.Input[_builtins.str] entity_id: SP identity.
        :param pulumi.Input[_builtins.bool] support_encrypted_assertion: Whether IdP-side encryption of Assertion is supported.
        """
        if acs_url is not None:
            pulumi.set(__self__, "acs_url", acs_url)
        if authn_sign_algo is not None:
            pulumi.set(__self__, "authn_sign_algo", authn_sign_algo)
        if certificate_type is not None:
            pulumi.set(__self__, "certificate_type", certificate_type)
        if encoded_metadata_document is not None:
            pulumi.set(__self__, "encoded_metadata_document", encoded_metadata_document)
        if entity_id is not None:
            pulumi.set(__self__, "entity_id", entity_id)
        if support_encrypted_assertion is not None:
            pulumi.set(__self__, "support_encrypted_assertion", support_encrypted_assertion)

    @_builtins.property
    @pulumi.getter(name="acsUrl")
    def acs_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ACS URL of SP.
        """
        return pulumi.get(self, "acs_url")

    @acs_url.setter
    def acs_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "acs_url", value)

    @_builtins.property
    @pulumi.getter(name="authnSignAlgo")
    def authn_sign_algo(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Signature algorithms supported by AuthNRequest
        """
        return pulumi.get(self, "authn_sign_algo")

    @authn_sign_algo.setter
    def authn_sign_algo(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "authn_sign_algo", value)

    @_builtins.property
    @pulumi.getter(name="certificateType")
    def certificate_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Type of certificate used for signing in the SSO process
        """
        return pulumi.get(self, "certificate_type")

    @certificate_type.setter
    def certificate_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "certificate_type", value)

    @_builtins.property
    @pulumi.getter(name="encodedMetadataDocument")
    def encoded_metadata_document(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        SP metadata document (Base64 encoding).
        """
        return pulumi.get(self, "encoded_metadata_document")

    @encoded_metadata_document.setter
    def encoded_metadata_document(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "encoded_metadata_document", value)

    @_builtins.property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        SP identity.
        """
        return pulumi.get(self, "entity_id")

    @entity_id.setter
    def entity_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "entity_id", value)

    @_builtins.property
    @pulumi.getter(name="supportEncryptedAssertion")
    def support_encrypted_assertion(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether IdP-side encryption of Assertion is supported.
        """
        return pulumi.get(self, "support_encrypted_assertion")

    @support_encrypted_assertion.setter
    def support_encrypted_assertion(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "support_encrypted_assertion", value)


if not MYPY:
    class DirectoryUserProvisioningConfigurationArgsDict(TypedDict):
        default_landing_page: NotRequired[pulumi.Input[_builtins.str]]
        """
        The duration of the Session after the user logs in.
        """
        session_duration: NotRequired[pulumi.Input[_builtins.str]]
        """
        The duration of the Session after the user logs in.
        """
elif False:
    DirectoryUserProvisioningConfigurationArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class DirectoryUserProvisioningConfigurationArgs:
    def __init__(__self__, *,
                 default_landing_page: Optional[pulumi.Input[_builtins.str]] = None,
                 session_duration: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] default_landing_page: The duration of the Session after the user logs in.
        :param pulumi.Input[_builtins.str] session_duration: The duration of the Session after the user logs in.
        """
        if default_landing_page is not None:
            pulumi.set(__self__, "default_landing_page", default_landing_page)
        if session_duration is not None:
            pulumi.set(__self__, "session_duration", session_duration)

    @_builtins.property
    @pulumi.getter(name="defaultLandingPage")
    def default_landing_page(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The duration of the Session after the user logs in.
        """
        return pulumi.get(self, "default_landing_page")

    @default_landing_page.setter
    def default_landing_page(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_landing_page", value)

    @_builtins.property
    @pulumi.getter(name="sessionDuration")
    def session_duration(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The duration of the Session after the user logs in.
        """
        return pulumi.get(self, "session_duration")

    @session_duration.setter
    def session_duration(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "session_duration", value)


