# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetQueuesResult',
    'AwaitableGetQueuesResult',
    'get_queues',
    'get_queues_output',
]

@pulumi.output_type
class GetQueuesResult:
    """
    A collection of values returned by getQueues.
    """
    def __init__(__self__, id=None, ids=None, instance_id=None, name_regex=None, names=None, output_file=None, queues=None, virtual_host_name=None):
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
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if queues and not isinstance(queues, list):
            raise TypeError("Expected argument 'queues' to be a list")
        pulumi.set(__self__, "queues", queues)
        if virtual_host_name and not isinstance(virtual_host_name, str):
            raise TypeError("Expected argument 'virtual_host_name' to be a str")
        pulumi.set(__self__, "virtual_host_name", virtual_host_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def queues(self) -> Sequence['outputs.GetQueuesQueueResult']:
        return pulumi.get(self, "queues")

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> str:
        return pulumi.get(self, "virtual_host_name")


class AwaitableGetQueuesResult(GetQueuesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetQueuesResult(
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            queues=self.queues,
            virtual_host_name=self.virtual_host_name)


def get_queues(ids: Optional[Sequence[str]] = None,
               instance_id: Optional[str] = None,
               name_regex: Optional[str] = None,
               output_file: Optional[str] = None,
               virtual_host_name: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetQueuesResult:
    """
    This data source provides the Amqp Queues of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.127.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.amqp.get_queues(instance_id="amqp-abc12345",
        virtual_host_name="my-VirtualHost",
        ids=[
            "my-Queue-1",
            "my-Queue-2",
        ])
    pulumi.export("amqpQueueId1", ids.queues[0].id)
    name_regex = alicloud.amqp.get_queues(instance_id="amqp-abc12345",
        virtual_host_name="my-VirtualHost",
        name_regex="^my-Queue")
    pulumi.export("amqpQueueId2", name_regex.queues[0].id)
    ```


    :param Sequence[str] ids: A list of Queue IDs. Its element value is same as Queue Name.
    :param str instance_id: The ID of the instance.
    :param str name_regex: A regex string to filter results by Queue name.
    :param str virtual_host_name: The name of the virtual host.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['virtualHostName'] = virtual_host_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:amqp/getQueues:getQueues', __args__, opts=opts, typ=GetQueuesResult).value

    return AwaitableGetQueuesResult(
        id=__ret__.id,
        ids=__ret__.ids,
        instance_id=__ret__.instance_id,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        queues=__ret__.queues,
        virtual_host_name=__ret__.virtual_host_name)


@_utilities.lift_output_func(get_queues)
def get_queues_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                      instance_id: Optional[pulumi.Input[str]] = None,
                      name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                      output_file: Optional[pulumi.Input[Optional[str]]] = None,
                      virtual_host_name: Optional[pulumi.Input[str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetQueuesResult]:
    """
    This data source provides the Amqp Queues of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.127.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.amqp.get_queues(instance_id="amqp-abc12345",
        virtual_host_name="my-VirtualHost",
        ids=[
            "my-Queue-1",
            "my-Queue-2",
        ])
    pulumi.export("amqpQueueId1", ids.queues[0].id)
    name_regex = alicloud.amqp.get_queues(instance_id="amqp-abc12345",
        virtual_host_name="my-VirtualHost",
        name_regex="^my-Queue")
    pulumi.export("amqpQueueId2", name_regex.queues[0].id)
    ```


    :param Sequence[str] ids: A list of Queue IDs. Its element value is same as Queue Name.
    :param str instance_id: The ID of the instance.
    :param str name_regex: A regex string to filter results by Queue name.
    :param str virtual_host_name: The name of the virtual host.
    """
    ...