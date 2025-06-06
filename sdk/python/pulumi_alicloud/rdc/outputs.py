# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'GetOrganizationsOrganizationResult',
]

@pulumi.output_type
class GetOrganizationsOrganizationResult(dict):
    def __init__(__self__, *,
                 id: builtins.str,
                 organization_id: builtins.str,
                 organization_name: builtins.str):
        """
        :param builtins.str id: The ID of the Organization.
        :param builtins.str organization_id: The first ID of the resource.
        :param builtins.str organization_name: Company name.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "organization_name", organization_name)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of the Organization.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> builtins.str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> builtins.str:
        """
        Company name.
        """
        return pulumi.get(self, "organization_name")


