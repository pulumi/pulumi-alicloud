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

__all__ = ['TopicArgs', 'Topic']

@pulumi.input_type
class TopicArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[_builtins.str],
                 remark: pulumi.Input[_builtins.str],
                 topic: pulumi.Input[_builtins.str],
                 compact_topic: Optional[pulumi.Input[_builtins.bool]] = None,
                 local_topic: Optional[pulumi.Input[_builtins.bool]] = None,
                 partition_num: Optional[pulumi.Input[_builtins.int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a Topic resource.
        :param pulumi.Input[_builtins.str] instance_id: InstanceId of your Kafka resource, the topic will create in this instance.
        :param pulumi.Input[_builtins.str] remark: This attribute is a concise description of topic. The length cannot exceed 64.
        :param pulumi.Input[_builtins.str] topic: Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 249 characters.
        :param pulumi.Input[_builtins.bool] compact_topic: Whether the topic is compactTopic or not. Compact topic must be a localTopic.
        :param pulumi.Input[_builtins.bool] local_topic: Whether the topic is localTopic or not.
        :param pulumi.Input[_builtins.int] partition_num: The number of partitions of the topic. The number should between 1 and 48.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "topic", topic)
        if compact_topic is not None:
            pulumi.set(__self__, "compact_topic", compact_topic)
        if local_topic is not None:
            pulumi.set(__self__, "local_topic", local_topic)
        if partition_num is not None:
            pulumi.set(__self__, "partition_num", partition_num)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        InstanceId of your Kafka resource, the topic will create in this instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter
    def remark(self) -> pulumi.Input[_builtins.str]:
        """
        This attribute is a concise description of topic. The length cannot exceed 64.
        """
        return pulumi.get(self, "remark")

    @remark.setter
    def remark(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "remark", value)

    @_builtins.property
    @pulumi.getter
    def topic(self) -> pulumi.Input[_builtins.str]:
        """
        Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 249 characters.
        """
        return pulumi.get(self, "topic")

    @topic.setter
    def topic(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "topic", value)

    @_builtins.property
    @pulumi.getter(name="compactTopic")
    def compact_topic(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the topic is compactTopic or not. Compact topic must be a localTopic.
        """
        return pulumi.get(self, "compact_topic")

    @compact_topic.setter
    def compact_topic(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "compact_topic", value)

    @_builtins.property
    @pulumi.getter(name="localTopic")
    def local_topic(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the topic is localTopic or not.
        """
        return pulumi.get(self, "local_topic")

    @local_topic.setter
    def local_topic(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "local_topic", value)

    @_builtins.property
    @pulumi.getter(name="partitionNum")
    def partition_num(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of partitions of the topic. The number should between 1 and 48.
        """
        return pulumi.get(self, "partition_num")

    @partition_num.setter
    def partition_num(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "partition_num", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _TopicState:
    def __init__(__self__, *,
                 compact_topic: Optional[pulumi.Input[_builtins.bool]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 local_topic: Optional[pulumi.Input[_builtins.bool]] = None,
                 partition_num: Optional[pulumi.Input[_builtins.int]] = None,
                 remark: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 topic: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Topic resources.
        :param pulumi.Input[_builtins.bool] compact_topic: Whether the topic is compactTopic or not. Compact topic must be a localTopic.
        :param pulumi.Input[_builtins.str] instance_id: InstanceId of your Kafka resource, the topic will create in this instance.
        :param pulumi.Input[_builtins.bool] local_topic: Whether the topic is localTopic or not.
        :param pulumi.Input[_builtins.int] partition_num: The number of partitions of the topic. The number should between 1 and 48.
        :param pulumi.Input[_builtins.str] remark: This attribute is a concise description of topic. The length cannot exceed 64.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] topic: Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 249 characters.
        """
        if compact_topic is not None:
            pulumi.set(__self__, "compact_topic", compact_topic)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if local_topic is not None:
            pulumi.set(__self__, "local_topic", local_topic)
        if partition_num is not None:
            pulumi.set(__self__, "partition_num", partition_num)
        if remark is not None:
            pulumi.set(__self__, "remark", remark)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if topic is not None:
            pulumi.set(__self__, "topic", topic)

    @_builtins.property
    @pulumi.getter(name="compactTopic")
    def compact_topic(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the topic is compactTopic or not. Compact topic must be a localTopic.
        """
        return pulumi.get(self, "compact_topic")

    @compact_topic.setter
    def compact_topic(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "compact_topic", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        InstanceId of your Kafka resource, the topic will create in this instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter(name="localTopic")
    def local_topic(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the topic is localTopic or not.
        """
        return pulumi.get(self, "local_topic")

    @local_topic.setter
    def local_topic(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "local_topic", value)

    @_builtins.property
    @pulumi.getter(name="partitionNum")
    def partition_num(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of partitions of the topic. The number should between 1 and 48.
        """
        return pulumi.get(self, "partition_num")

    @partition_num.setter
    def partition_num(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "partition_num", value)

    @_builtins.property
    @pulumi.getter
    def remark(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        This attribute is a concise description of topic. The length cannot exceed 64.
        """
        return pulumi.get(self, "remark")

    @remark.setter
    def remark(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "remark", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter
    def topic(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 249 characters.
        """
        return pulumi.get(self, "topic")

    @topic.setter
    def topic(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "topic", value)


@pulumi.type_token("alicloud:alikafka/topic:Topic")
class Topic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compact_topic: Optional[pulumi.Input[_builtins.bool]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 local_topic: Optional[pulumi.Input[_builtins.bool]] = None,
                 partition_num: Optional[pulumi.Input[_builtins.int]] = None,
                 remark: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 topic: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides an ALIKAFKA topic resource, see [What is Alikafka topic ](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-alikafka-2019-09-16-createtopic).

        > **NOTE:** Available since v1.56.0.

        > **NOTE:**  Only the following regions support create alikafka topic.
        [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        instance_name = config.get("instanceName")
        if instance_name is None:
            instance_name = "tf-example"
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default_network = alicloud.vpc.Network("default", cidr_block="172.16.0.0/12")
        default_switch = alicloud.vpc.Switch("default",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("default", vpc_id=default_network.id)
        default_instance = alicloud.alikafka.Instance("default",
            name=f"{instance_name}-{default_integer['result']}",
            partition_num=50,
            disk_type=1,
            disk_size=500,
            deploy_type=5,
            io_max=20,
            vswitch_id=default_switch.id,
            security_group=default_security_group.id)
        default_topic = alicloud.alikafka.Topic("default",
            instance_id=default_instance.id,
            topic="example-topic",
            local_topic=False,
            compact_topic=False,
            partition_num=12,
            remark="dafault_kafka_topic_remark")
        ```

        ## Import

        ALIKAFKA TOPIC can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:alikafka/topic:Topic topic alikafka_post-cn-123455abc:topicName
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] compact_topic: Whether the topic is compactTopic or not. Compact topic must be a localTopic.
        :param pulumi.Input[_builtins.str] instance_id: InstanceId of your Kafka resource, the topic will create in this instance.
        :param pulumi.Input[_builtins.bool] local_topic: Whether the topic is localTopic or not.
        :param pulumi.Input[_builtins.int] partition_num: The number of partitions of the topic. The number should between 1 and 48.
        :param pulumi.Input[_builtins.str] remark: This attribute is a concise description of topic. The length cannot exceed 64.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] topic: Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 249 characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TopicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an ALIKAFKA topic resource, see [What is Alikafka topic ](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-alikafka-2019-09-16-createtopic).

        > **NOTE:** Available since v1.56.0.

        > **NOTE:**  Only the following regions support create alikafka topic.
        [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        instance_name = config.get("instanceName")
        if instance_name is None:
            instance_name = "tf-example"
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default_network = alicloud.vpc.Network("default", cidr_block="172.16.0.0/12")
        default_switch = alicloud.vpc.Switch("default",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("default", vpc_id=default_network.id)
        default_instance = alicloud.alikafka.Instance("default",
            name=f"{instance_name}-{default_integer['result']}",
            partition_num=50,
            disk_type=1,
            disk_size=500,
            deploy_type=5,
            io_max=20,
            vswitch_id=default_switch.id,
            security_group=default_security_group.id)
        default_topic = alicloud.alikafka.Topic("default",
            instance_id=default_instance.id,
            topic="example-topic",
            local_topic=False,
            compact_topic=False,
            partition_num=12,
            remark="dafault_kafka_topic_remark")
        ```

        ## Import

        ALIKAFKA TOPIC can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:alikafka/topic:Topic topic alikafka_post-cn-123455abc:topicName
        ```

        :param str resource_name: The name of the resource.
        :param TopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compact_topic: Optional[pulumi.Input[_builtins.bool]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 local_topic: Optional[pulumi.Input[_builtins.bool]] = None,
                 partition_num: Optional[pulumi.Input[_builtins.int]] = None,
                 remark: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 topic: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TopicArgs.__new__(TopicArgs)

            __props__.__dict__["compact_topic"] = compact_topic
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["local_topic"] = local_topic
            __props__.__dict__["partition_num"] = partition_num
            if remark is None and not opts.urn:
                raise TypeError("Missing required property 'remark'")
            __props__.__dict__["remark"] = remark
            __props__.__dict__["tags"] = tags
            if topic is None and not opts.urn:
                raise TypeError("Missing required property 'topic'")
            __props__.__dict__["topic"] = topic
        super(Topic, __self__).__init__(
            'alicloud:alikafka/topic:Topic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            compact_topic: Optional[pulumi.Input[_builtins.bool]] = None,
            instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            local_topic: Optional[pulumi.Input[_builtins.bool]] = None,
            partition_num: Optional[pulumi.Input[_builtins.int]] = None,
            remark: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            topic: Optional[pulumi.Input[_builtins.str]] = None) -> 'Topic':
        """
        Get an existing Topic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] compact_topic: Whether the topic is compactTopic or not. Compact topic must be a localTopic.
        :param pulumi.Input[_builtins.str] instance_id: InstanceId of your Kafka resource, the topic will create in this instance.
        :param pulumi.Input[_builtins.bool] local_topic: Whether the topic is localTopic or not.
        :param pulumi.Input[_builtins.int] partition_num: The number of partitions of the topic. The number should between 1 and 48.
        :param pulumi.Input[_builtins.str] remark: This attribute is a concise description of topic. The length cannot exceed 64.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] topic: Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 249 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TopicState.__new__(_TopicState)

        __props__.__dict__["compact_topic"] = compact_topic
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["local_topic"] = local_topic
        __props__.__dict__["partition_num"] = partition_num
        __props__.__dict__["remark"] = remark
        __props__.__dict__["tags"] = tags
        __props__.__dict__["topic"] = topic
        return Topic(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="compactTopic")
    def compact_topic(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether the topic is compactTopic or not. Compact topic must be a localTopic.
        """
        return pulumi.get(self, "compact_topic")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        InstanceId of your Kafka resource, the topic will create in this instance.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="localTopic")
    def local_topic(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether the topic is localTopic or not.
        """
        return pulumi.get(self, "local_topic")

    @_builtins.property
    @pulumi.getter(name="partitionNum")
    def partition_num(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The number of partitions of the topic. The number should between 1 and 48.
        """
        return pulumi.get(self, "partition_num")

    @_builtins.property
    @pulumi.getter
    def remark(self) -> pulumi.Output[_builtins.str]:
        """
        This attribute is a concise description of topic. The length cannot exceed 64.
        """
        return pulumi.get(self, "remark")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def topic(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 249 characters.
        """
        return pulumi.get(self, "topic")

