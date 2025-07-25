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

__all__ = ['SamlProviderArgs', 'SamlProvider']

@pulumi.input_type
class SamlProviderArgs:
    def __init__(__self__, *,
                 encodedsaml_metadata_document: pulumi.Input[_builtins.str],
                 saml_provider_name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a SamlProvider resource.
        :param pulumi.Input[_builtins.str] encodedsaml_metadata_document: The metadata file which is Base64-encoded.
               The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.
        :param pulumi.Input[_builtins.str] saml_provider_name: The name of the IdP.  The name can be up to 128 characters in length. The name can contain letters, digits, periods (.), hyphens (-), and underscores (_). The name cannot start or end with periods (.), hyphens (-), or underscores (_).
        :param pulumi.Input[_builtins.str] description: The description.
        """
        pulumi.set(__self__, "encodedsaml_metadata_document", encodedsaml_metadata_document)
        pulumi.set(__self__, "saml_provider_name", saml_provider_name)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter(name="encodedsamlMetadataDocument")
    def encodedsaml_metadata_document(self) -> pulumi.Input[_builtins.str]:
        """
        The metadata file which is Base64-encoded.
        The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.
        """
        return pulumi.get(self, "encodedsaml_metadata_document")

    @encodedsaml_metadata_document.setter
    def encodedsaml_metadata_document(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "encodedsaml_metadata_document", value)

    @_builtins.property
    @pulumi.getter(name="samlProviderName")
    def saml_provider_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the IdP.  The name can be up to 128 characters in length. The name can contain letters, digits, periods (.), hyphens (-), and underscores (_). The name cannot start or end with periods (.), hyphens (-), or underscores (_).
        """
        return pulumi.get(self, "saml_provider_name")

    @saml_provider_name.setter
    def saml_provider_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "saml_provider_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _SamlProviderState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 encodedsaml_metadata_document: Optional[pulumi.Input[_builtins.str]] = None,
                 saml_provider_name: Optional[pulumi.Input[_builtins.str]] = None,
                 update_date: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SamlProvider resources.
        :param pulumi.Input[_builtins.str] arn: The identity provider's ARN.
        :param pulumi.Input[_builtins.str] description: The description.
        :param pulumi.Input[_builtins.str] encodedsaml_metadata_document: The metadata file which is Base64-encoded.
               The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.
        :param pulumi.Input[_builtins.str] saml_provider_name: The name of the IdP.  The name can be up to 128 characters in length. The name can contain letters, digits, periods (.), hyphens (-), and underscores (_). The name cannot start or end with periods (.), hyphens (-), or underscores (_).
        :param pulumi.Input[_builtins.str] update_date: Update time.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if encodedsaml_metadata_document is not None:
            pulumi.set(__self__, "encodedsaml_metadata_document", encodedsaml_metadata_document)
        if saml_provider_name is not None:
            pulumi.set(__self__, "saml_provider_name", saml_provider_name)
        if update_date is not None:
            pulumi.set(__self__, "update_date", update_date)

    @_builtins.property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The identity provider's ARN.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "arn", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="encodedsamlMetadataDocument")
    def encodedsaml_metadata_document(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The metadata file which is Base64-encoded.
        The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.
        """
        return pulumi.get(self, "encodedsaml_metadata_document")

    @encodedsaml_metadata_document.setter
    def encodedsaml_metadata_document(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "encodedsaml_metadata_document", value)

    @_builtins.property
    @pulumi.getter(name="samlProviderName")
    def saml_provider_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the IdP.  The name can be up to 128 characters in length. The name can contain letters, digits, periods (.), hyphens (-), and underscores (_). The name cannot start or end with periods (.), hyphens (-), or underscores (_).
        """
        return pulumi.get(self, "saml_provider_name")

    @saml_provider_name.setter
    def saml_provider_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "saml_provider_name", value)

    @_builtins.property
    @pulumi.getter(name="updateDate")
    def update_date(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Update time.
        """
        return pulumi.get(self, "update_date")

    @update_date.setter
    def update_date(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_date", value)


@pulumi.type_token("alicloud:ram/samlProvider:SamlProvider")
class SamlProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 encodedsaml_metadata_document: Optional[pulumi.Input[_builtins.str]] = None,
                 saml_provider_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a RAM Saml Provider resource.

        For information about RAM Saml Provider and how to use it, see [What is Saml Provider](https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createsamlprovider).

        > **NOTE:** Available since v1.114.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ram.SamlProvider("example",
            saml_provider_name="terraform-example",
            encodedsaml_metadata_document="  PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48bWQ6RW50aXR5RGVzY3JpcHRvciBlbnRpdHlJRD0iaHR0cDovL2V4YW1wbGUuYWxpeXVuLmNvbS9leGFtcGxlLWlkcCIgeG1sbnM6bWQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDptZXRhZGF0YSI+PG1kOklEUFNTT0Rlc2NyaXB0b3IgV2FudEF1dGhuUmVxdWVzdHNTaWduZWQ9ImZhbHNlIiBwcm90b2NvbFN1cHBvcnRFbnVtZXJhdGlvbj0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnByb3RvY29sIj48bWQ6S2V5RGVzY3JpcHRvciB1c2U9InNpZ25pbmciPjxkczpLZXlJbmZvIHhtbG5zOmRzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj48ZHM6WDUwOURhdGE+PGRzOlg1MDlDZXJ0aWZpY2F0ZT5NSUlEL3pDQ0F1ZWdBd0lCQWdJRU1yb0tjakFOQmdrcWhraUc5dzBCQVFzRkFEQ0JnREVuTUNVR0ExVUVBeE1lClFXeHBlWFZ1SUZKQlRTQkZlR0Z0Y0d4bElFTmxjblJwWm1sallYUmxNUkF3RGdZRFZRUUxFd2RCYkdsaVlXSmgKTVJBd0RnWURWUVFLRXdkQmJHbGlZV0poTVJFd0R3WURWUVFIRXdoSVlXNW5XbWh2ZFRFUk1BOEdBMVVFQ0JNSQpXbWhsU21saGJtY3hDekFKQmdOVkJBWVRBa05PTUNBWERUSXpNVEl3TkRFeU1EY3dNRm9ZRHpJd05URXdOREl4Ck1USXdOekF3V2pDQmdERW5NQ1VHQTFVRUF4TWVRV3hwZVhWdUlGSkJUU0JGZUdGdGNHeGxJRU5sY25ScFptbGoKWVhSbE1SQXdEZ1lEVlFRTEV3ZEJiR2xpWVdKaE1SQXdEZ1lEVlFRS0V3ZEJiR2xpWVdKaE1SRXdEd1lEVlFRSApFd2hJWVc1bldtaHZkVEVSTUE4R0ExVUVDQk1JV21obFNtbGhibWN4Q3pBSkJnTlZCQVlUQWtOT01JSUJJakFOCkJna3Foa2lHOXcwQkFRRUZBQU9DQVE4QU1JSUJDZ0tDQVFFQW9KVGVndWc0eXFaalNzQzFQUWpzbGxreUxWZHEKcXR0UGFqNmNOYldQdVFRNThSMkF4ZHNYeng4c05lOElLYUFYbW84azdDTFhDcXFLVzNjNEpzRWtTOUcva3B2NApJWFpBOGFVcDBCeXdQUFBocmFjUXd4cmJ5dkhja0dqVUpkNEZrOEVjbVVjNjRrSE5LbjBCaVJpL0NEZlM3MXBuCjh5T3dDNUZPSUlYWXhWMGtTTnNQMnozV2tBbFBXWm1sVkZSd1dxeHhGS2xCTjVpdVhaVHA4dk5rU2htVndBTW8KcjVpb2VBaFdXd0N1L0pvdUhLa3lnbVJnSDNhRjlSRlkrOGZ4NkMzR2hjZktISUszRTFBbVVtWlpjR3NDUCtxNApXeTBuSFp4QStaZEhTeE1OYUJPMm5JbkxJSHVDWHgza096eWpGV3dUaTVGSTlwdE5vNktBay9wRThRSURBUUFCCm8zMHdlekFQQmdOVkhSTUVDREFHQVFIL0FnRURNQjBHQTFVZEpRUVdNQlFHQ0NzR0FRVUZCd01CQmdnckJnRUYKQlFjREFqQUxCZ05WSFE4RUJBTUNBb1F3SFFZRFZSMFJBUUgvQkJNd0VZSUpiRzlqWVd4b2IzTjBod1IvQUFBQgpNQjBHQTFVZERnUVdCQlQ2TXluMnJjMVhEQTZqQkZYWVBOYitGaldMVmpBTkJna3Foa2lHOXcwQkFRc0ZBQU9DCkFRRUFoWHpUUzJJaHZjY3hzSVNzVVNFcldNNDJiQlZESHhTa05EemhPRmd0eGNtNUxuNHdjWXJvdkM3NHZxS1oKUWdQWmpGcWw3YUJTb1ZyNFdseWFaZlVBdHdNL3pZZytJbklUSVpBQ0dhM1VNK3h5V0NLSVhRNGpJVldnNG9QWQpxTStjNWllLzJFVlE0YmhObEQyL0lYZUVEZFd2TXMzdmFyRTFCUE5PQXJZZ2tZTmNER3lDSnA0ZmQ3d3ladWxhCllEZFFIWDdpdUJ1R0JOZFRBajlCUW5xaTJRcTc5RndMVTBrQkFvdUpVVVBPUjBpMGtwZ24vc2dSbHhvaHY1bHgKVTFwYVhtMEZRWHpUUDEvdjV5Y24wM3NVckFUekg2VkRpVlQ2N0NRQjR4MXJpOTFvUVRkWERXN1RvRkVhOGIrOApPdE8wZERMdDlnbCtNMkxYRzJTWnBZTkJoZz09PC9kczpYNTA5Q2VydGlmaWNhdGU+PC9kczpYNTA5RGF0YT48L2RzOktleUluZm8+PC9tZDpLZXlEZXNjcmlwdG9yPjxtZDpOYW1lSURGb3JtYXQ+dXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6MS4xOm5hbWVpZC1mb3JtYXQ6ZW1haWxBZGRyZXNzPC9tZDpOYW1lSURGb3JtYXQ+PG1kOk5hbWVJREZvcm1hdD51cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6bmFtZWlkLWZvcm1hdDpwZXJzaXN0ZW50PC9tZDpOYW1lSURGb3JtYXQ+PG1kOlNpbmdsZVNpZ25PblNlcnZpY2UgQmluZGluZz0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmJpbmRpbmdzOkhUVFAtUE9TVCIgTG9jYXRpb249Imh0dHA6Ly9leGFtcGxlLmFsaXl1bi5jb20vZXhhbXBsZS1pZHAvc3NvL3NhbWwiLz48bWQ6U2luZ2xlU2lnbk9uU2VydmljZSBCaW5kaW5nPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YmluZGluZ3M6SFRUUC1SZWRpcmVjdCIgTG9jYXRpb249Imh0dHA6Ly9leGFtcGxlLmFsaXl1bi5jb20vZXhhbXBsZS1pZHAvc3NvL3NhbWwiLz48L21kOklEUFNTT0Rlc2NyaXB0b3I+PC9tZDpFbnRpdHlEZXNjcmlwdG9yPg==\\n",
            description="For Terraform Test")
        ```

        ## Import

        RAM Saml Provider can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ram/samlProvider:SamlProvider example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description.
        :param pulumi.Input[_builtins.str] encodedsaml_metadata_document: The metadata file which is Base64-encoded.
               The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.
        :param pulumi.Input[_builtins.str] saml_provider_name: The name of the IdP.  The name can be up to 128 characters in length. The name can contain letters, digits, periods (.), hyphens (-), and underscores (_). The name cannot start or end with periods (.), hyphens (-), or underscores (_).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SamlProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RAM Saml Provider resource.

        For information about RAM Saml Provider and how to use it, see [What is Saml Provider](https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createsamlprovider).

        > **NOTE:** Available since v1.114.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ram.SamlProvider("example",
            saml_provider_name="terraform-example",
            encodedsaml_metadata_document="  PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48bWQ6RW50aXR5RGVzY3JpcHRvciBlbnRpdHlJRD0iaHR0cDovL2V4YW1wbGUuYWxpeXVuLmNvbS9leGFtcGxlLWlkcCIgeG1sbnM6bWQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDptZXRhZGF0YSI+PG1kOklEUFNTT0Rlc2NyaXB0b3IgV2FudEF1dGhuUmVxdWVzdHNTaWduZWQ9ImZhbHNlIiBwcm90b2NvbFN1cHBvcnRFbnVtZXJhdGlvbj0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnByb3RvY29sIj48bWQ6S2V5RGVzY3JpcHRvciB1c2U9InNpZ25pbmciPjxkczpLZXlJbmZvIHhtbG5zOmRzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj48ZHM6WDUwOURhdGE+PGRzOlg1MDlDZXJ0aWZpY2F0ZT5NSUlEL3pDQ0F1ZWdBd0lCQWdJRU1yb0tjakFOQmdrcWhraUc5dzBCQVFzRkFEQ0JnREVuTUNVR0ExVUVBeE1lClFXeHBlWFZ1SUZKQlRTQkZlR0Z0Y0d4bElFTmxjblJwWm1sallYUmxNUkF3RGdZRFZRUUxFd2RCYkdsaVlXSmgKTVJBd0RnWURWUVFLRXdkQmJHbGlZV0poTVJFd0R3WURWUVFIRXdoSVlXNW5XbWh2ZFRFUk1BOEdBMVVFQ0JNSQpXbWhsU21saGJtY3hDekFKQmdOVkJBWVRBa05PTUNBWERUSXpNVEl3TkRFeU1EY3dNRm9ZRHpJd05URXdOREl4Ck1USXdOekF3V2pDQmdERW5NQ1VHQTFVRUF4TWVRV3hwZVhWdUlGSkJUU0JGZUdGdGNHeGxJRU5sY25ScFptbGoKWVhSbE1SQXdEZ1lEVlFRTEV3ZEJiR2xpWVdKaE1SQXdEZ1lEVlFRS0V3ZEJiR2xpWVdKaE1SRXdEd1lEVlFRSApFd2hJWVc1bldtaHZkVEVSTUE4R0ExVUVDQk1JV21obFNtbGhibWN4Q3pBSkJnTlZCQVlUQWtOT01JSUJJakFOCkJna3Foa2lHOXcwQkFRRUZBQU9DQVE4QU1JSUJDZ0tDQVFFQW9KVGVndWc0eXFaalNzQzFQUWpzbGxreUxWZHEKcXR0UGFqNmNOYldQdVFRNThSMkF4ZHNYeng4c05lOElLYUFYbW84azdDTFhDcXFLVzNjNEpzRWtTOUcva3B2NApJWFpBOGFVcDBCeXdQUFBocmFjUXd4cmJ5dkhja0dqVUpkNEZrOEVjbVVjNjRrSE5LbjBCaVJpL0NEZlM3MXBuCjh5T3dDNUZPSUlYWXhWMGtTTnNQMnozV2tBbFBXWm1sVkZSd1dxeHhGS2xCTjVpdVhaVHA4dk5rU2htVndBTW8KcjVpb2VBaFdXd0N1L0pvdUhLa3lnbVJnSDNhRjlSRlkrOGZ4NkMzR2hjZktISUszRTFBbVVtWlpjR3NDUCtxNApXeTBuSFp4QStaZEhTeE1OYUJPMm5JbkxJSHVDWHgza096eWpGV3dUaTVGSTlwdE5vNktBay9wRThRSURBUUFCCm8zMHdlekFQQmdOVkhSTUVDREFHQVFIL0FnRURNQjBHQTFVZEpRUVdNQlFHQ0NzR0FRVUZCd01CQmdnckJnRUYKQlFjREFqQUxCZ05WSFE4RUJBTUNBb1F3SFFZRFZSMFJBUUgvQkJNd0VZSUpiRzlqWVd4b2IzTjBod1IvQUFBQgpNQjBHQTFVZERnUVdCQlQ2TXluMnJjMVhEQTZqQkZYWVBOYitGaldMVmpBTkJna3Foa2lHOXcwQkFRc0ZBQU9DCkFRRUFoWHpUUzJJaHZjY3hzSVNzVVNFcldNNDJiQlZESHhTa05EemhPRmd0eGNtNUxuNHdjWXJvdkM3NHZxS1oKUWdQWmpGcWw3YUJTb1ZyNFdseWFaZlVBdHdNL3pZZytJbklUSVpBQ0dhM1VNK3h5V0NLSVhRNGpJVldnNG9QWQpxTStjNWllLzJFVlE0YmhObEQyL0lYZUVEZFd2TXMzdmFyRTFCUE5PQXJZZ2tZTmNER3lDSnA0ZmQ3d3ladWxhCllEZFFIWDdpdUJ1R0JOZFRBajlCUW5xaTJRcTc5RndMVTBrQkFvdUpVVVBPUjBpMGtwZ24vc2dSbHhvaHY1bHgKVTFwYVhtMEZRWHpUUDEvdjV5Y24wM3NVckFUekg2VkRpVlQ2N0NRQjR4MXJpOTFvUVRkWERXN1RvRkVhOGIrOApPdE8wZERMdDlnbCtNMkxYRzJTWnBZTkJoZz09PC9kczpYNTA5Q2VydGlmaWNhdGU+PC9kczpYNTA5RGF0YT48L2RzOktleUluZm8+PC9tZDpLZXlEZXNjcmlwdG9yPjxtZDpOYW1lSURGb3JtYXQ+dXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6MS4xOm5hbWVpZC1mb3JtYXQ6ZW1haWxBZGRyZXNzPC9tZDpOYW1lSURGb3JtYXQ+PG1kOk5hbWVJREZvcm1hdD51cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6bmFtZWlkLWZvcm1hdDpwZXJzaXN0ZW50PC9tZDpOYW1lSURGb3JtYXQ+PG1kOlNpbmdsZVNpZ25PblNlcnZpY2UgQmluZGluZz0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmJpbmRpbmdzOkhUVFAtUE9TVCIgTG9jYXRpb249Imh0dHA6Ly9leGFtcGxlLmFsaXl1bi5jb20vZXhhbXBsZS1pZHAvc3NvL3NhbWwiLz48bWQ6U2luZ2xlU2lnbk9uU2VydmljZSBCaW5kaW5nPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YmluZGluZ3M6SFRUUC1SZWRpcmVjdCIgTG9jYXRpb249Imh0dHA6Ly9leGFtcGxlLmFsaXl1bi5jb20vZXhhbXBsZS1pZHAvc3NvL3NhbWwiLz48L21kOklEUFNTT0Rlc2NyaXB0b3I+PC9tZDpFbnRpdHlEZXNjcmlwdG9yPg==\\n",
            description="For Terraform Test")
        ```

        ## Import

        RAM Saml Provider can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ram/samlProvider:SamlProvider example <id>
        ```

        :param str resource_name: The name of the resource.
        :param SamlProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SamlProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 encodedsaml_metadata_document: Optional[pulumi.Input[_builtins.str]] = None,
                 saml_provider_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SamlProviderArgs.__new__(SamlProviderArgs)

            __props__.__dict__["description"] = description
            if encodedsaml_metadata_document is None and not opts.urn:
                raise TypeError("Missing required property 'encodedsaml_metadata_document'")
            __props__.__dict__["encodedsaml_metadata_document"] = encodedsaml_metadata_document
            if saml_provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'saml_provider_name'")
            __props__.__dict__["saml_provider_name"] = saml_provider_name
            __props__.__dict__["arn"] = None
            __props__.__dict__["update_date"] = None
        super(SamlProvider, __self__).__init__(
            'alicloud:ram/samlProvider:SamlProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            encodedsaml_metadata_document: Optional[pulumi.Input[_builtins.str]] = None,
            saml_provider_name: Optional[pulumi.Input[_builtins.str]] = None,
            update_date: Optional[pulumi.Input[_builtins.str]] = None) -> 'SamlProvider':
        """
        Get an existing SamlProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] arn: The identity provider's ARN.
        :param pulumi.Input[_builtins.str] description: The description.
        :param pulumi.Input[_builtins.str] encodedsaml_metadata_document: The metadata file which is Base64-encoded.
               The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.
        :param pulumi.Input[_builtins.str] saml_provider_name: The name of the IdP.  The name can be up to 128 characters in length. The name can contain letters, digits, periods (.), hyphens (-), and underscores (_). The name cannot start or end with periods (.), hyphens (-), or underscores (_).
        :param pulumi.Input[_builtins.str] update_date: Update time.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SamlProviderState.__new__(_SamlProviderState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["encodedsaml_metadata_document"] = encodedsaml_metadata_document
        __props__.__dict__["saml_provider_name"] = saml_provider_name
        __props__.__dict__["update_date"] = update_date
        return SamlProvider(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def arn(self) -> pulumi.Output[_builtins.str]:
        """
        The identity provider's ARN.
        """
        return pulumi.get(self, "arn")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="encodedsamlMetadataDocument")
    def encodedsaml_metadata_document(self) -> pulumi.Output[_builtins.str]:
        """
        The metadata file which is Base64-encoded.
        The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.
        """
        return pulumi.get(self, "encodedsaml_metadata_document")

    @_builtins.property
    @pulumi.getter(name="samlProviderName")
    def saml_provider_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the IdP.  The name can be up to 128 characters in length. The name can contain letters, digits, periods (.), hyphens (-), and underscores (_). The name cannot start or end with periods (.), hyphens (-), or underscores (_).
        """
        return pulumi.get(self, "saml_provider_name")

    @_builtins.property
    @pulumi.getter(name="updateDate")
    def update_date(self) -> pulumi.Output[_builtins.str]:
        """
        Update time.
        """
        return pulumi.get(self, "update_date")

