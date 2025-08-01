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
    'GetHostsResult',
    'AwaitableGetHostsResult',
    'get_hosts',
    'get_hosts_output',
]

@pulumi.output_type
class GetHostsResult:
    """
    A collection of values returned by getHosts.
    """
    def __init__(__self__, enable_details=None, host_address=None, host_name=None, hosts=None, id=None, ids=None, instance_id=None, name_regex=None, names=None, os_type=None, output_file=None, source=None, source_instance_id=None, source_instance_state=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if host_address and not isinstance(host_address, str):
            raise TypeError("Expected argument 'host_address' to be a str")
        pulumi.set(__self__, "host_address", host_address)
        if host_name and not isinstance(host_name, str):
            raise TypeError("Expected argument 'host_name' to be a str")
        pulumi.set(__self__, "host_name", host_name)
        if hosts and not isinstance(hosts, list):
            raise TypeError("Expected argument 'hosts' to be a list")
        pulumi.set(__self__, "hosts", hosts)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if os_type and not isinstance(os_type, str):
            raise TypeError("Expected argument 'os_type' to be a str")
        pulumi.set(__self__, "os_type", os_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if source and not isinstance(source, str):
            raise TypeError("Expected argument 'source' to be a str")
        pulumi.set(__self__, "source", source)
        if source_instance_id and not isinstance(source_instance_id, str):
            raise TypeError("Expected argument 'source_instance_id' to be a str")
        pulumi.set(__self__, "source_instance_id", source_instance_id)
        if source_instance_state and not isinstance(source_instance_state, str):
            raise TypeError("Expected argument 'source_instance_state' to be a str")
        pulumi.set(__self__, "source_instance_state", source_instance_state)

    @_builtins.property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_details")

    @_builtins.property
    @pulumi.getter(name="hostAddress")
    def host_address(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "host_address")

    @_builtins.property
    @pulumi.getter(name="hostName")
    def host_name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "host_name")

    @_builtins.property
    @pulumi.getter
    def hosts(self) -> Sequence['outputs.GetHostsHostResult']:
        return pulumi.get(self, "hosts")

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
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> _builtins.str:
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="osType")
    def os_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "os_type")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "source")

    @_builtins.property
    @pulumi.getter(name="sourceInstanceId")
    def source_instance_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "source_instance_id")

    @_builtins.property
    @pulumi.getter(name="sourceInstanceState")
    def source_instance_state(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "source_instance_state")


class AwaitableGetHostsResult(GetHostsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHostsResult(
            enable_details=self.enable_details,
            host_address=self.host_address,
            host_name=self.host_name,
            hosts=self.hosts,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            os_type=self.os_type,
            output_file=self.output_file,
            source=self.source,
            source_instance_id=self.source_instance_id,
            source_instance_state=self.source_instance_state)


def get_hosts(enable_details: Optional[_builtins.bool] = None,
              host_address: Optional[_builtins.str] = None,
              host_name: Optional[_builtins.str] = None,
              ids: Optional[Sequence[_builtins.str]] = None,
              instance_id: Optional[_builtins.str] = None,
              name_regex: Optional[_builtins.str] = None,
              os_type: Optional[_builtins.str] = None,
              output_file: Optional[_builtins.str] = None,
              source: Optional[_builtins.str] = None,
              source_instance_id: Optional[_builtins.str] = None,
              source_instance_state: Optional[_builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHostsResult:
    """
    This data source provides the Bastionhost Hosts of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.135.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.bastionhost.get_hosts(instance_id="example_value",
        ids=[
            "1",
            "2",
        ])
    pulumi.export("bastionhostHostId1", ids.hosts[0].id)
    name_regex = alicloud.bastionhost.get_hosts(instance_id="example_value",
        name_regex="^my-Host")
    pulumi.export("bastionhostHostId2", name_regex.hosts[0].id)
    ```


    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param _builtins.str host_address: The host address.
    :param _builtins.str host_name: Specify the new create a host name of the supports up to 128 characters.
    :param Sequence[_builtins.str] ids: A list of Host IDs.
    :param _builtins.str instance_id: Specify the new create a host where the Bastion host ID of.
    :param _builtins.str name_regex: A regex string to filter results by Host name.
    :param _builtins.str os_type: Specify the new create the host's operating system. Valid values: Linux Windows.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str source: Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
    :param _builtins.str source_instance_id: Specify the newly created ECS instance ID or dedicated cluster host ID.
    :param _builtins.str source_instance_state: The source instance state.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['hostAddress'] = host_address
    __args__['hostName'] = host_name
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['osType'] = os_type
    __args__['outputFile'] = output_file
    __args__['source'] = source
    __args__['sourceInstanceId'] = source_instance_id
    __args__['sourceInstanceState'] = source_instance_state
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:bastionhost/getHosts:getHosts', __args__, opts=opts, typ=GetHostsResult).value

    return AwaitableGetHostsResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        host_address=pulumi.get(__ret__, 'host_address'),
        host_name=pulumi.get(__ret__, 'host_name'),
        hosts=pulumi.get(__ret__, 'hosts'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        os_type=pulumi.get(__ret__, 'os_type'),
        output_file=pulumi.get(__ret__, 'output_file'),
        source=pulumi.get(__ret__, 'source'),
        source_instance_id=pulumi.get(__ret__, 'source_instance_id'),
        source_instance_state=pulumi.get(__ret__, 'source_instance_state'))
def get_hosts_output(enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                     host_address: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     host_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                     instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                     name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     os_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     source: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     source_instance_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     source_instance_state: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetHostsResult]:
    """
    This data source provides the Bastionhost Hosts of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.135.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.bastionhost.get_hosts(instance_id="example_value",
        ids=[
            "1",
            "2",
        ])
    pulumi.export("bastionhostHostId1", ids.hosts[0].id)
    name_regex = alicloud.bastionhost.get_hosts(instance_id="example_value",
        name_regex="^my-Host")
    pulumi.export("bastionhostHostId2", name_regex.hosts[0].id)
    ```


    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param _builtins.str host_address: The host address.
    :param _builtins.str host_name: Specify the new create a host name of the supports up to 128 characters.
    :param Sequence[_builtins.str] ids: A list of Host IDs.
    :param _builtins.str instance_id: Specify the new create a host where the Bastion host ID of.
    :param _builtins.str name_regex: A regex string to filter results by Host name.
    :param _builtins.str os_type: Specify the new create the host's operating system. Valid values: Linux Windows.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str source: Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
    :param _builtins.str source_instance_id: Specify the newly created ECS instance ID or dedicated cluster host ID.
    :param _builtins.str source_instance_state: The source instance state.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['hostAddress'] = host_address
    __args__['hostName'] = host_name
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['osType'] = os_type
    __args__['outputFile'] = output_file
    __args__['source'] = source
    __args__['sourceInstanceId'] = source_instance_id
    __args__['sourceInstanceState'] = source_instance_state
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:bastionhost/getHosts:getHosts', __args__, opts=opts, typ=GetHostsResult)
    return __ret__.apply(lambda __response__: GetHostsResult(
        enable_details=pulumi.get(__response__, 'enable_details'),
        host_address=pulumi.get(__response__, 'host_address'),
        host_name=pulumi.get(__response__, 'host_name'),
        hosts=pulumi.get(__response__, 'hosts'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        instance_id=pulumi.get(__response__, 'instance_id'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        os_type=pulumi.get(__response__, 'os_type'),
        output_file=pulumi.get(__response__, 'output_file'),
        source=pulumi.get(__response__, 'source'),
        source_instance_id=pulumi.get(__response__, 'source_instance_id'),
        source_instance_state=pulumi.get(__response__, 'source_instance_state')))
