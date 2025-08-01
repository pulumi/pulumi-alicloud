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
    'GetTopicSubscriptionsResult',
    'AwaitableGetTopicSubscriptionsResult',
    'get_topic_subscriptions',
    'get_topic_subscriptions_output',
]

@pulumi.output_type
class GetTopicSubscriptionsResult:
    """
    A collection of values returned by getTopicSubscriptions.
    """
    def __init__(__self__, id=None, name_prefix=None, names=None, output_file=None, subscriptions=None, topic_name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name_prefix and not isinstance(name_prefix, str):
            raise TypeError("Expected argument 'name_prefix' to be a str")
        pulumi.set(__self__, "name_prefix", name_prefix)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if subscriptions and not isinstance(subscriptions, list):
            raise TypeError("Expected argument 'subscriptions' to be a list")
        pulumi.set(__self__, "subscriptions", subscriptions)
        if topic_name and not isinstance(topic_name, str):
            raise TypeError("Expected argument 'topic_name' to be a str")
        pulumi.set(__self__, "topic_name", topic_name)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_prefix")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of subscription names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def subscriptions(self) -> Sequence['outputs.GetTopicSubscriptionsSubscriptionResult']:
        """
        A list of subscriptions. Each element contains the following attributes:
        """
        return pulumi.get(self, "subscriptions")

    @_builtins.property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> _builtins.str:
        """
        The topic which The subscription belongs to was named with the name.
        """
        return pulumi.get(self, "topic_name")


class AwaitableGetTopicSubscriptionsResult(GetTopicSubscriptionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTopicSubscriptionsResult(
            id=self.id,
            name_prefix=self.name_prefix,
            names=self.names,
            output_file=self.output_file,
            subscriptions=self.subscriptions,
            topic_name=self.topic_name)


def get_topic_subscriptions(name_prefix: Optional[_builtins.str] = None,
                            output_file: Optional[_builtins.str] = None,
                            topic_name: Optional[_builtins.str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTopicSubscriptionsResult:
    """
    This data source provides a list of MNS topic subscriptions in an Alibaba Cloud account according to the specified parameters.

    > **DEPRECATED:**  This datasource has been deprecated from version `1.188.0`. Please use new datasource message_service_subscriptions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    subscriptions = alicloud.mns.get_topic_subscriptions(topic_name="topic_name",
        name_prefix="tf-")
    pulumi.export("firstTopicSubscriptionId", subscriptions.subscriptions[0].id)
    ```


    :param _builtins.str name_prefix: A string to filter resulting subscriptions of the topic by their name prefixs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str topic_name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
    """
    __args__ = dict()
    __args__['namePrefix'] = name_prefix
    __args__['outputFile'] = output_file
    __args__['topicName'] = topic_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:mns/getTopicSubscriptions:getTopicSubscriptions', __args__, opts=opts, typ=GetTopicSubscriptionsResult).value

    return AwaitableGetTopicSubscriptionsResult(
        id=pulumi.get(__ret__, 'id'),
        name_prefix=pulumi.get(__ret__, 'name_prefix'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        subscriptions=pulumi.get(__ret__, 'subscriptions'),
        topic_name=pulumi.get(__ret__, 'topic_name'))
def get_topic_subscriptions_output(name_prefix: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                   output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                   topic_name: Optional[pulumi.Input[_builtins.str]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTopicSubscriptionsResult]:
    """
    This data source provides a list of MNS topic subscriptions in an Alibaba Cloud account according to the specified parameters.

    > **DEPRECATED:**  This datasource has been deprecated from version `1.188.0`. Please use new datasource message_service_subscriptions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    subscriptions = alicloud.mns.get_topic_subscriptions(topic_name="topic_name",
        name_prefix="tf-")
    pulumi.export("firstTopicSubscriptionId", subscriptions.subscriptions[0].id)
    ```


    :param _builtins.str name_prefix: A string to filter resulting subscriptions of the topic by their name prefixs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str topic_name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
    """
    __args__ = dict()
    __args__['namePrefix'] = name_prefix
    __args__['outputFile'] = output_file
    __args__['topicName'] = topic_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:mns/getTopicSubscriptions:getTopicSubscriptions', __args__, opts=opts, typ=GetTopicSubscriptionsResult)
    return __ret__.apply(lambda __response__: GetTopicSubscriptionsResult(
        id=pulumi.get(__response__, 'id'),
        name_prefix=pulumi.get(__response__, 'name_prefix'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        subscriptions=pulumi.get(__response__, 'subscriptions'),
        topic_name=pulumi.get(__response__, 'topic_name')))
