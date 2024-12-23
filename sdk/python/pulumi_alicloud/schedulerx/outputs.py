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

__all__ = [
    'GetNamespacesNamespaceResult',
]

@pulumi.output_type
class GetNamespacesNamespaceResult(dict):
    def __init__(__self__, *,
                 description: str,
                 id: str,
                 namespace_id: str,
                 namespace_name: str):
        """
        :param str description: The description of the resource.
        :param str id: The ID of the resource.
        :param str namespace_id: The ID of the Namespace.
        :param str namespace_name: The name of the resource.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "namespace_id", namespace_id)
        pulumi.set(__self__, "namespace_name", namespace_name)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        """
        The ID of the Namespace.
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> str:
        """
        The name of the resource.
        """
        return pulumi.get(self, "namespace_name")


