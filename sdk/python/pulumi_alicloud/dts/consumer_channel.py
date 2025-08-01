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

__all__ = ['ConsumerChannelArgs', 'ConsumerChannel']

@pulumi.input_type
class ConsumerChannelArgs:
    def __init__(__self__, *,
                 consumer_group_name: pulumi.Input[_builtins.str],
                 consumer_group_password: pulumi.Input[_builtins.str],
                 consumer_group_user_name: pulumi.Input[_builtins.str],
                 dts_instance_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a ConsumerChannel resource.
        :param pulumi.Input[_builtins.str] consumer_group_name: The name of the consumer group.
        :param pulumi.Input[_builtins.str] consumer_group_password: The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
        :param pulumi.Input[_builtins.str] consumer_group_user_name: The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
        :param pulumi.Input[_builtins.str] dts_instance_id: The ID of the subscription instance.
        """
        pulumi.set(__self__, "consumer_group_name", consumer_group_name)
        pulumi.set(__self__, "consumer_group_password", consumer_group_password)
        pulumi.set(__self__, "consumer_group_user_name", consumer_group_user_name)
        pulumi.set(__self__, "dts_instance_id", dts_instance_id)

    @_builtins.property
    @pulumi.getter(name="consumerGroupName")
    def consumer_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the consumer group.
        """
        return pulumi.get(self, "consumer_group_name")

    @consumer_group_name.setter
    def consumer_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "consumer_group_name", value)

    @_builtins.property
    @pulumi.getter(name="consumerGroupPassword")
    def consumer_group_password(self) -> pulumi.Input[_builtins.str]:
        """
        The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
        """
        return pulumi.get(self, "consumer_group_password")

    @consumer_group_password.setter
    def consumer_group_password(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "consumer_group_password", value)

    @_builtins.property
    @pulumi.getter(name="consumerGroupUserName")
    def consumer_group_user_name(self) -> pulumi.Input[_builtins.str]:
        """
        The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
        """
        return pulumi.get(self, "consumer_group_user_name")

    @consumer_group_user_name.setter
    def consumer_group_user_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "consumer_group_user_name", value)

    @_builtins.property
    @pulumi.getter(name="dtsInstanceId")
    def dts_instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the subscription instance.
        """
        return pulumi.get(self, "dts_instance_id")

    @dts_instance_id.setter
    def dts_instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "dts_instance_id", value)


@pulumi.input_type
class _ConsumerChannelState:
    def __init__(__self__, *,
                 consumer_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 consumer_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 consumer_group_password: Optional[pulumi.Input[_builtins.str]] = None,
                 consumer_group_user_name: Optional[pulumi.Input[_builtins.str]] = None,
                 dts_instance_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ConsumerChannel resources.
        :param pulumi.Input[_builtins.str] consumer_group_id: The ID of the consumer group.
        :param pulumi.Input[_builtins.str] consumer_group_name: The name of the consumer group.
        :param pulumi.Input[_builtins.str] consumer_group_password: The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
        :param pulumi.Input[_builtins.str] consumer_group_user_name: The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
        :param pulumi.Input[_builtins.str] dts_instance_id: The ID of the subscription instance.
        """
        if consumer_group_id is not None:
            pulumi.set(__self__, "consumer_group_id", consumer_group_id)
        if consumer_group_name is not None:
            pulumi.set(__self__, "consumer_group_name", consumer_group_name)
        if consumer_group_password is not None:
            pulumi.set(__self__, "consumer_group_password", consumer_group_password)
        if consumer_group_user_name is not None:
            pulumi.set(__self__, "consumer_group_user_name", consumer_group_user_name)
        if dts_instance_id is not None:
            pulumi.set(__self__, "dts_instance_id", dts_instance_id)

    @_builtins.property
    @pulumi.getter(name="consumerGroupId")
    def consumer_group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the consumer group.
        """
        return pulumi.get(self, "consumer_group_id")

    @consumer_group_id.setter
    def consumer_group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "consumer_group_id", value)

    @_builtins.property
    @pulumi.getter(name="consumerGroupName")
    def consumer_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the consumer group.
        """
        return pulumi.get(self, "consumer_group_name")

    @consumer_group_name.setter
    def consumer_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "consumer_group_name", value)

    @_builtins.property
    @pulumi.getter(name="consumerGroupPassword")
    def consumer_group_password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
        """
        return pulumi.get(self, "consumer_group_password")

    @consumer_group_password.setter
    def consumer_group_password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "consumer_group_password", value)

    @_builtins.property
    @pulumi.getter(name="consumerGroupUserName")
    def consumer_group_user_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
        """
        return pulumi.get(self, "consumer_group_user_name")

    @consumer_group_user_name.setter
    def consumer_group_user_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "consumer_group_user_name", value)

    @_builtins.property
    @pulumi.getter(name="dtsInstanceId")
    def dts_instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the subscription instance.
        """
        return pulumi.get(self, "dts_instance_id")

    @dts_instance_id.setter
    def dts_instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dts_instance_id", value)


@pulumi.type_token("alicloud:dts/consumerChannel:ConsumerChannel")
class ConsumerChannel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 consumer_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 consumer_group_password: Optional[pulumi.Input[_builtins.str]] = None,
                 consumer_group_user_name: Optional[pulumi.Input[_builtins.str]] = None,
                 dts_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a DTS Consumer Channel resource.

        For information about DTS Consumer Channel and how to use it, see [What is Consumer Channel](https://www.alibabacloud.com/help/en/doc-detail/264593.htm).

        > **NOTE:** Available since v1.146.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        example = alicloud.get_regions(current=True)
        example_get_zones = alicloud.rds.get_zones(engine="MySQL",
            engine_version="8.0",
            instance_charge_type="PostPaid",
            category="Basic",
            db_instance_storage_type="cloud_essd")
        example_get_instance_classes = alicloud.rds.get_instance_classes(zone_id=example_get_zones.zones[0].id,
            engine="MySQL",
            engine_version="8.0",
            instance_charge_type="PostPaid",
            category="Basic",
            db_instance_storage_type="cloud_essd")
        example_network = alicloud.vpc.Network("example",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        example_switch = alicloud.vpc.Switch("example",
            vpc_id=example_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=example_get_zones.zones[0].id,
            vswitch_name=name)
        example_security_group = alicloud.ecs.SecurityGroup("example",
            name=name,
            vpc_id=example_network.id)
        example_instance = alicloud.rds.Instance("example",
            engine="MySQL",
            engine_version="8.0",
            instance_type=example_get_instance_classes.instance_classes[0].instance_class,
            instance_storage=example_get_instance_classes.instance_classes[0].storage_range.min,
            instance_charge_type="Postpaid",
            instance_name=name,
            vswitch_id=example_switch.id,
            monitoring_period=60,
            db_instance_storage_type="cloud_essd",
            security_group_ids=[example_security_group.id])
        example_rds_account = alicloud.rds.RdsAccount("example",
            db_instance_id=example_instance.id,
            account_name="example_name",
            account_password="example_1234")
        example_database = alicloud.rds.Database("example",
            instance_id=example_instance.id,
            name=name)
        example_account_privilege = alicloud.rds.AccountPrivilege("example",
            instance_id=example_instance.id,
            account_name=example_rds_account.account_name,
            privilege="ReadWrite",
            db_names=[example_database.name])
        example_subscription_job = alicloud.dts.SubscriptionJob("example",
            dts_job_name=name,
            payment_type="PayAsYouGo",
            source_endpoint_engine_name="MySQL",
            source_endpoint_region=example.regions[0].id,
            source_endpoint_instance_type="RDS",
            source_endpoint_instance_id=example_instance.id,
            source_endpoint_database_name=example_database.name,
            source_endpoint_user_name=example_rds_account.account_name,
            source_endpoint_password=example_rds_account.account_password,
            db_list=pulumi.Output.all(
                exampleDatabaseName=example_database.name,
                exampleDatabaseName1=example_database.name
        ).apply(lambda resolved_outputs: f"{{\\"{resolved_outputs['exampleDatabaseName']}\\":{{\\"name\\":\\"{resolved_outputs['exampleDatabaseName1']}\\",\\"all\\":true}}}}")
        ,
            subscription_instance_network_type="vpc",
            subscription_instance_vpc_id=example_network.id,
            subscription_instance_vswitch_id=example_switch.id,
            status="Normal")
        example_consumer_channel = alicloud.dts.ConsumerChannel("example",
            dts_instance_id=example_subscription_job.dts_instance_id,
            consumer_group_name=name,
            consumer_group_user_name="example",
            consumer_group_password="example1234")
        ```

        ## Import

        DTS Consumer Channel can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:dts/consumerChannel:ConsumerChannel example <dts_instance_id>:<consumer_group_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] consumer_group_name: The name of the consumer group.
        :param pulumi.Input[_builtins.str] consumer_group_password: The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
        :param pulumi.Input[_builtins.str] consumer_group_user_name: The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
        :param pulumi.Input[_builtins.str] dts_instance_id: The ID of the subscription instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConsumerChannelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DTS Consumer Channel resource.

        For information about DTS Consumer Channel and how to use it, see [What is Consumer Channel](https://www.alibabacloud.com/help/en/doc-detail/264593.htm).

        > **NOTE:** Available since v1.146.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        example = alicloud.get_regions(current=True)
        example_get_zones = alicloud.rds.get_zones(engine="MySQL",
            engine_version="8.0",
            instance_charge_type="PostPaid",
            category="Basic",
            db_instance_storage_type="cloud_essd")
        example_get_instance_classes = alicloud.rds.get_instance_classes(zone_id=example_get_zones.zones[0].id,
            engine="MySQL",
            engine_version="8.0",
            instance_charge_type="PostPaid",
            category="Basic",
            db_instance_storage_type="cloud_essd")
        example_network = alicloud.vpc.Network("example",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        example_switch = alicloud.vpc.Switch("example",
            vpc_id=example_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=example_get_zones.zones[0].id,
            vswitch_name=name)
        example_security_group = alicloud.ecs.SecurityGroup("example",
            name=name,
            vpc_id=example_network.id)
        example_instance = alicloud.rds.Instance("example",
            engine="MySQL",
            engine_version="8.0",
            instance_type=example_get_instance_classes.instance_classes[0].instance_class,
            instance_storage=example_get_instance_classes.instance_classes[0].storage_range.min,
            instance_charge_type="Postpaid",
            instance_name=name,
            vswitch_id=example_switch.id,
            monitoring_period=60,
            db_instance_storage_type="cloud_essd",
            security_group_ids=[example_security_group.id])
        example_rds_account = alicloud.rds.RdsAccount("example",
            db_instance_id=example_instance.id,
            account_name="example_name",
            account_password="example_1234")
        example_database = alicloud.rds.Database("example",
            instance_id=example_instance.id,
            name=name)
        example_account_privilege = alicloud.rds.AccountPrivilege("example",
            instance_id=example_instance.id,
            account_name=example_rds_account.account_name,
            privilege="ReadWrite",
            db_names=[example_database.name])
        example_subscription_job = alicloud.dts.SubscriptionJob("example",
            dts_job_name=name,
            payment_type="PayAsYouGo",
            source_endpoint_engine_name="MySQL",
            source_endpoint_region=example.regions[0].id,
            source_endpoint_instance_type="RDS",
            source_endpoint_instance_id=example_instance.id,
            source_endpoint_database_name=example_database.name,
            source_endpoint_user_name=example_rds_account.account_name,
            source_endpoint_password=example_rds_account.account_password,
            db_list=pulumi.Output.all(
                exampleDatabaseName=example_database.name,
                exampleDatabaseName1=example_database.name
        ).apply(lambda resolved_outputs: f"{{\\"{resolved_outputs['exampleDatabaseName']}\\":{{\\"name\\":\\"{resolved_outputs['exampleDatabaseName1']}\\",\\"all\\":true}}}}")
        ,
            subscription_instance_network_type="vpc",
            subscription_instance_vpc_id=example_network.id,
            subscription_instance_vswitch_id=example_switch.id,
            status="Normal")
        example_consumer_channel = alicloud.dts.ConsumerChannel("example",
            dts_instance_id=example_subscription_job.dts_instance_id,
            consumer_group_name=name,
            consumer_group_user_name="example",
            consumer_group_password="example1234")
        ```

        ## Import

        DTS Consumer Channel can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:dts/consumerChannel:ConsumerChannel example <dts_instance_id>:<consumer_group_id>
        ```

        :param str resource_name: The name of the resource.
        :param ConsumerChannelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConsumerChannelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 consumer_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 consumer_group_password: Optional[pulumi.Input[_builtins.str]] = None,
                 consumer_group_user_name: Optional[pulumi.Input[_builtins.str]] = None,
                 dts_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConsumerChannelArgs.__new__(ConsumerChannelArgs)

            if consumer_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'consumer_group_name'")
            __props__.__dict__["consumer_group_name"] = consumer_group_name
            if consumer_group_password is None and not opts.urn:
                raise TypeError("Missing required property 'consumer_group_password'")
            __props__.__dict__["consumer_group_password"] = consumer_group_password
            if consumer_group_user_name is None and not opts.urn:
                raise TypeError("Missing required property 'consumer_group_user_name'")
            __props__.__dict__["consumer_group_user_name"] = consumer_group_user_name
            if dts_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'dts_instance_id'")
            __props__.__dict__["dts_instance_id"] = dts_instance_id
            __props__.__dict__["consumer_group_id"] = None
        super(ConsumerChannel, __self__).__init__(
            'alicloud:dts/consumerChannel:ConsumerChannel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            consumer_group_id: Optional[pulumi.Input[_builtins.str]] = None,
            consumer_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            consumer_group_password: Optional[pulumi.Input[_builtins.str]] = None,
            consumer_group_user_name: Optional[pulumi.Input[_builtins.str]] = None,
            dts_instance_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ConsumerChannel':
        """
        Get an existing ConsumerChannel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] consumer_group_id: The ID of the consumer group.
        :param pulumi.Input[_builtins.str] consumer_group_name: The name of the consumer group.
        :param pulumi.Input[_builtins.str] consumer_group_password: The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
        :param pulumi.Input[_builtins.str] consumer_group_user_name: The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
        :param pulumi.Input[_builtins.str] dts_instance_id: The ID of the subscription instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConsumerChannelState.__new__(_ConsumerChannelState)

        __props__.__dict__["consumer_group_id"] = consumer_group_id
        __props__.__dict__["consumer_group_name"] = consumer_group_name
        __props__.__dict__["consumer_group_password"] = consumer_group_password
        __props__.__dict__["consumer_group_user_name"] = consumer_group_user_name
        __props__.__dict__["dts_instance_id"] = dts_instance_id
        return ConsumerChannel(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="consumerGroupId")
    def consumer_group_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the consumer group.
        """
        return pulumi.get(self, "consumer_group_id")

    @_builtins.property
    @pulumi.getter(name="consumerGroupName")
    def consumer_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the consumer group.
        """
        return pulumi.get(self, "consumer_group_name")

    @_builtins.property
    @pulumi.getter(name="consumerGroupPassword")
    def consumer_group_password(self) -> pulumi.Output[_builtins.str]:
        """
        The password of the consumer group account. The length of the `consumer_group_password` is limited to `8` to `32` characters. It can contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
        """
        return pulumi.get(self, "consumer_group_password")

    @_builtins.property
    @pulumi.getter(name="consumerGroupUserName")
    def consumer_group_user_name(self) -> pulumi.Output[_builtins.str]:
        """
        The username of the consumer group. The length of the `consumer_group_user_name` is limited to `1` to `16` characters. It can contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).
        """
        return pulumi.get(self, "consumer_group_user_name")

    @_builtins.property
    @pulumi.getter(name="dtsInstanceId")
    def dts_instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the subscription instance.
        """
        return pulumi.get(self, "dts_instance_id")

