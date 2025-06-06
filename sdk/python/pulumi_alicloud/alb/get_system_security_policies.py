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
from . import outputs

__all__ = [
    'GetSystemSecurityPoliciesResult',
    'AwaitableGetSystemSecurityPoliciesResult',
    'get_system_security_policies',
    'get_system_security_policies_output',
]

@pulumi.output_type
class GetSystemSecurityPoliciesResult:
    """
    A collection of values returned by getSystemSecurityPolicies.
    """
    def __init__(__self__, id=None, ids=None, output_file=None, policies=None, tags=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[builtins.str]:
        """
        A list of System Security Policy IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[builtins.str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def policies(self) -> Sequence['outputs.GetSystemSecurityPoliciesPolicyResult']:
        """
        A list of ALB Security Policies. Each element contains the following attributes:
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, builtins.str]]:
        return pulumi.get(self, "tags")


class AwaitableGetSystemSecurityPoliciesResult(GetSystemSecurityPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemSecurityPoliciesResult(
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            policies=self.policies,
            tags=self.tags)


def get_system_security_policies(ids: Optional[Sequence[builtins.str]] = None,
                                 output_file: Optional[builtins.str] = None,
                                 tags: Optional[Mapping[str, builtins.str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemSecurityPoliciesResult:
    """
    This data source provides the ALB System Security Policies of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.183.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    defaults = alicloud.alb.get_system_security_policies(ids=["tls_cipher_policy_1_0"])
    pulumi.export("albSystemSecurityPolicyId1", defaults.policies[0].id)
    ```


    :param Sequence[builtins.str] ids: A list of System Security Policy IDs.
    :param builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:alb/getSystemSecurityPolicies:getSystemSecurityPolicies', __args__, opts=opts, typ=GetSystemSecurityPoliciesResult).value

    return AwaitableGetSystemSecurityPoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        policies=pulumi.get(__ret__, 'policies'),
        tags=pulumi.get(__ret__, 'tags'))
def get_system_security_policies_output(ids: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                        output_file: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                        tags: Optional[pulumi.Input[Optional[Mapping[str, builtins.str]]]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSystemSecurityPoliciesResult]:
    """
    This data source provides the ALB System Security Policies of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.183.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    defaults = alicloud.alb.get_system_security_policies(ids=["tls_cipher_policy_1_0"])
    pulumi.export("albSystemSecurityPolicyId1", defaults.policies[0].id)
    ```


    :param Sequence[builtins.str] ids: A list of System Security Policy IDs.
    :param builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:alb/getSystemSecurityPolicies:getSystemSecurityPolicies', __args__, opts=opts, typ=GetSystemSecurityPoliciesResult)
    return __ret__.apply(lambda __response__: GetSystemSecurityPoliciesResult(
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        output_file=pulumi.get(__response__, 'output_file'),
        policies=pulumi.get(__response__, 'policies'),
        tags=pulumi.get(__response__, 'tags')))
