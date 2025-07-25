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

__all__ = ['ConsumerGroupArgs', 'ConsumerGroup']

@pulumi.input_type
class ConsumerGroupArgs:
    def __init__(__self__, *,
                 consumer_id: pulumi.Input[_builtins.str],
                 instance_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a ConsumerGroup resource.
        :param pulumi.Input[_builtins.str] consumer_id: ID of the consumer group. The length cannot exceed 64 characters.
        :param pulumi.Input[_builtins.str] instance_id: ID of the ALIKAFKA Instance that owns the groups.
        :param pulumi.Input[_builtins.str] description: The description of the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "consumer_id", consumer_id)
        pulumi.set(__self__, "instance_id", instance_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="consumerId")
    def consumer_id(self) -> pulumi.Input[_builtins.str]:
        """
        ID of the consumer group. The length cannot exceed 64 characters.
        """
        return pulumi.get(self, "consumer_id")

    @consumer_id.setter
    def consumer_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "consumer_id", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        ID of the ALIKAFKA Instance that owns the groups.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

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
class _ConsumerGroupState:
    def __init__(__self__, *,
                 consumer_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering ConsumerGroup resources.
        :param pulumi.Input[_builtins.str] consumer_id: ID of the consumer group. The length cannot exceed 64 characters.
        :param pulumi.Input[_builtins.str] description: The description of the resource.
        :param pulumi.Input[_builtins.str] instance_id: ID of the ALIKAFKA Instance that owns the groups.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        if consumer_id is not None:
            pulumi.set(__self__, "consumer_id", consumer_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="consumerId")
    def consumer_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ID of the consumer group. The length cannot exceed 64 characters.
        """
        return pulumi.get(self, "consumer_id")

    @consumer_id.setter
    def consumer_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "consumer_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ID of the ALIKAFKA Instance that owns the groups.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "instance_id", value)

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


@pulumi.type_token("alicloud:alikafka/consumerGroup:ConsumerGroup")
class ConsumerGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 consumer_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Provides an ALIKAFKA consumer group resource, see [What is alikafka consumer group](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-alikafka-2019-09-16-createconsumergroup).

        > **NOTE:** Available since v1.56.0.

        > **NOTE:**  Only the following regions support create alikafka consumer group.
        [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("default", cidr_block="172.16.0.0/12")
        default_switch = alicloud.vpc.Switch("default",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("default", vpc_id=default_network.id)
        default_instance = alicloud.alikafka.Instance("default",
            name=f"{name}-{default_integer['result']}",
            partition_num=50,
            disk_type=1,
            disk_size=500,
            deploy_type=5,
            io_max=20,
            vswitch_id=default_switch.id,
            security_group=default_security_group.id)
        default_consumer_group = alicloud.alikafka.ConsumerGroup("default",
            consumer_id=name,
            instance_id=default_instance.id)
        ```

        ## Import

        ALIKAFKA GROUP can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:alikafka/consumerGroup:ConsumerGroup group alikafka_post-cn-123455abc:consumerId
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] consumer_id: ID of the consumer group. The length cannot exceed 64 characters.
        :param pulumi.Input[_builtins.str] description: The description of the resource.
        :param pulumi.Input[_builtins.str] instance_id: ID of the ALIKAFKA Instance that owns the groups.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConsumerGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an ALIKAFKA consumer group resource, see [What is alikafka consumer group](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-alikafka-2019-09-16-createconsumergroup).

        > **NOTE:** Available since v1.56.0.

        > **NOTE:**  Only the following regions support create alikafka consumer group.
        [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("default", cidr_block="172.16.0.0/12")
        default_switch = alicloud.vpc.Switch("default",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("default", vpc_id=default_network.id)
        default_instance = alicloud.alikafka.Instance("default",
            name=f"{name}-{default_integer['result']}",
            partition_num=50,
            disk_type=1,
            disk_size=500,
            deploy_type=5,
            io_max=20,
            vswitch_id=default_switch.id,
            security_group=default_security_group.id)
        default_consumer_group = alicloud.alikafka.ConsumerGroup("default",
            consumer_id=name,
            instance_id=default_instance.id)
        ```

        ## Import

        ALIKAFKA GROUP can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:alikafka/consumerGroup:ConsumerGroup group alikafka_post-cn-123455abc:consumerId
        ```

        :param str resource_name: The name of the resource.
        :param ConsumerGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConsumerGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 consumer_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConsumerGroupArgs.__new__(ConsumerGroupArgs)

            if consumer_id is None and not opts.urn:
                raise TypeError("Missing required property 'consumer_id'")
            __props__.__dict__["consumer_id"] = consumer_id
            __props__.__dict__["description"] = description
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["tags"] = tags
        super(ConsumerGroup, __self__).__init__(
            'alicloud:alikafka/consumerGroup:ConsumerGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            consumer_id: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'ConsumerGroup':
        """
        Get an existing ConsumerGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] consumer_id: ID of the consumer group. The length cannot exceed 64 characters.
        :param pulumi.Input[_builtins.str] description: The description of the resource.
        :param pulumi.Input[_builtins.str] instance_id: ID of the ALIKAFKA Instance that owns the groups.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConsumerGroupState.__new__(_ConsumerGroupState)

        __props__.__dict__["consumer_id"] = consumer_id
        __props__.__dict__["description"] = description
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["tags"] = tags
        return ConsumerGroup(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="consumerId")
    def consumer_id(self) -> pulumi.Output[_builtins.str]:
        """
        ID of the consumer group. The length cannot exceed 64 characters.
        """
        return pulumi.get(self, "consumer_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the resource.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        ID of the ALIKAFKA Instance that owns the groups.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

