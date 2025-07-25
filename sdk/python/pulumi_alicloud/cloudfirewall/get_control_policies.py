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

__all__ = [
    'GetControlPoliciesResult',
    'AwaitableGetControlPoliciesResult',
    'get_control_policies',
    'get_control_policies_output',
]

@pulumi.output_type
class GetControlPoliciesResult:
    """
    A collection of values returned by getControlPolicies.
    """
    def __init__(__self__, acl_action=None, acl_uuid=None, description=None, destination=None, direction=None, id=None, ids=None, ip_version=None, lang=None, output_file=None, policies=None, proto=None, source=None):
        if acl_action and not isinstance(acl_action, str):
            raise TypeError("Expected argument 'acl_action' to be a str")
        pulumi.set(__self__, "acl_action", acl_action)
        if acl_uuid and not isinstance(acl_uuid, str):
            raise TypeError("Expected argument 'acl_uuid' to be a str")
        pulumi.set(__self__, "acl_uuid", acl_uuid)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if destination and not isinstance(destination, str):
            raise TypeError("Expected argument 'destination' to be a str")
        pulumi.set(__self__, "destination", destination)
        if direction and not isinstance(direction, str):
            raise TypeError("Expected argument 'direction' to be a str")
        pulumi.set(__self__, "direction", direction)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if ip_version and not isinstance(ip_version, str):
            raise TypeError("Expected argument 'ip_version' to be a str")
        pulumi.set(__self__, "ip_version", ip_version)
        if lang and not isinstance(lang, str):
            raise TypeError("Expected argument 'lang' to be a str")
        pulumi.set(__self__, "lang", lang)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)
        if proto and not isinstance(proto, str):
            raise TypeError("Expected argument 'proto' to be a str")
        pulumi.set(__self__, "proto", proto)
        if source and not isinstance(source, str):
            raise TypeError("Expected argument 'source' to be a str")
        pulumi.set(__self__, "source", source)

    @_builtins.property
    @pulumi.getter(name="aclAction")
    def acl_action(self) -> Optional[_builtins.str]:
        """
        The action that Cloud Firewall performs on the traffic.
        """
        return pulumi.get(self, "acl_action")

    @_builtins.property
    @pulumi.getter(name="aclUuid")
    def acl_uuid(self) -> Optional[_builtins.str]:
        """
        The unique ID of the access control policy.
        """
        return pulumi.get(self, "acl_uuid")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        """
        The description of the access control policy.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def destination(self) -> Optional[_builtins.str]:
        """
        The destination address in the access control policy.
        """
        return pulumi.get(self, "destination")

    @_builtins.property
    @pulumi.getter
    def direction(self) -> _builtins.str:
        """
        The direction of the traffic to which the access control policy applies.
        """
        return pulumi.get(self, "direction")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ids(self) -> Sequence[_builtins.str]:
        """
        A list of Control Policy IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="ipVersion")
    def ip_version(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "ip_version")

    @_builtins.property
    @pulumi.getter
    def lang(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "lang")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def policies(self) -> Sequence['outputs.GetControlPoliciesPolicyResult']:
        """
        A list of Cloud Firewall Control Policies. Each element contains the following attributes:
        """
        return pulumi.get(self, "policies")

    @_builtins.property
    @pulumi.getter
    def proto(self) -> Optional[_builtins.str]:
        """
        The type of the protocol in the access control policy.
        """
        return pulumi.get(self, "proto")

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[_builtins.str]:
        """
        The source address in the access control policy.
        """
        return pulumi.get(self, "source")


class AwaitableGetControlPoliciesResult(GetControlPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetControlPoliciesResult(
            acl_action=self.acl_action,
            acl_uuid=self.acl_uuid,
            description=self.description,
            destination=self.destination,
            direction=self.direction,
            id=self.id,
            ids=self.ids,
            ip_version=self.ip_version,
            lang=self.lang,
            output_file=self.output_file,
            policies=self.policies,
            proto=self.proto,
            source=self.source)


def get_control_policies(acl_action: Optional[_builtins.str] = None,
                         acl_uuid: Optional[_builtins.str] = None,
                         description: Optional[_builtins.str] = None,
                         destination: Optional[_builtins.str] = None,
                         direction: Optional[_builtins.str] = None,
                         ip_version: Optional[_builtins.str] = None,
                         lang: Optional[_builtins.str] = None,
                         output_file: Optional[_builtins.str] = None,
                         proto: Optional[_builtins.str] = None,
                         source: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetControlPoliciesResult:
    """
    This data source provides the Cloud Firewall Control Policies of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.129.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cloudfirewall.get_control_policies(direction="in")
    ```


    :param _builtins.str acl_action: The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
    :param _builtins.str acl_uuid: The unique ID of the access control policy.
    :param _builtins.str description: The description of the access control policy.
    :param _builtins.str destination: The destination address defined in the access control policy.
    :param _builtins.str direction: The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
    :param _builtins.str ip_version: The IP version of the address in the access control policy.
    :param _builtins.str lang: The language of the content within the response. Valid values: `en`, `zh`.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str proto: The type of the protocol in the access control policy. Valid values: If `direction` is  `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
    :param _builtins.str source: The source address in the access control policy.
    """
    __args__ = dict()
    __args__['aclAction'] = acl_action
    __args__['aclUuid'] = acl_uuid
    __args__['description'] = description
    __args__['destination'] = destination
    __args__['direction'] = direction
    __args__['ipVersion'] = ip_version
    __args__['lang'] = lang
    __args__['outputFile'] = output_file
    __args__['proto'] = proto
    __args__['source'] = source
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cloudfirewall/getControlPolicies:getControlPolicies', __args__, opts=opts, typ=GetControlPoliciesResult).value

    return AwaitableGetControlPoliciesResult(
        acl_action=pulumi.get(__ret__, 'acl_action'),
        acl_uuid=pulumi.get(__ret__, 'acl_uuid'),
        description=pulumi.get(__ret__, 'description'),
        destination=pulumi.get(__ret__, 'destination'),
        direction=pulumi.get(__ret__, 'direction'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        ip_version=pulumi.get(__ret__, 'ip_version'),
        lang=pulumi.get(__ret__, 'lang'),
        output_file=pulumi.get(__ret__, 'output_file'),
        policies=pulumi.get(__ret__, 'policies'),
        proto=pulumi.get(__ret__, 'proto'),
        source=pulumi.get(__ret__, 'source'))
def get_control_policies_output(acl_action: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                acl_uuid: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                description: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                destination: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                direction: Optional[pulumi.Input[_builtins.str]] = None,
                                ip_version: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                lang: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                proto: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                source: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetControlPoliciesResult]:
    """
    This data source provides the Cloud Firewall Control Policies of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.129.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cloudfirewall.get_control_policies(direction="in")
    ```


    :param _builtins.str acl_action: The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
    :param _builtins.str acl_uuid: The unique ID of the access control policy.
    :param _builtins.str description: The description of the access control policy.
    :param _builtins.str destination: The destination address defined in the access control policy.
    :param _builtins.str direction: The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
    :param _builtins.str ip_version: The IP version of the address in the access control policy.
    :param _builtins.str lang: The language of the content within the response. Valid values: `en`, `zh`.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str proto: The type of the protocol in the access control policy. Valid values: If `direction` is  `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
    :param _builtins.str source: The source address in the access control policy.
    """
    __args__ = dict()
    __args__['aclAction'] = acl_action
    __args__['aclUuid'] = acl_uuid
    __args__['description'] = description
    __args__['destination'] = destination
    __args__['direction'] = direction
    __args__['ipVersion'] = ip_version
    __args__['lang'] = lang
    __args__['outputFile'] = output_file
    __args__['proto'] = proto
    __args__['source'] = source
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:cloudfirewall/getControlPolicies:getControlPolicies', __args__, opts=opts, typ=GetControlPoliciesResult)
    return __ret__.apply(lambda __response__: GetControlPoliciesResult(
        acl_action=pulumi.get(__response__, 'acl_action'),
        acl_uuid=pulumi.get(__response__, 'acl_uuid'),
        description=pulumi.get(__response__, 'description'),
        destination=pulumi.get(__response__, 'destination'),
        direction=pulumi.get(__response__, 'direction'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        ip_version=pulumi.get(__response__, 'ip_version'),
        lang=pulumi.get(__response__, 'lang'),
        output_file=pulumi.get(__response__, 'output_file'),
        policies=pulumi.get(__response__, 'policies'),
        proto=pulumi.get(__response__, 'proto'),
        source=pulumi.get(__response__, 'source')))
