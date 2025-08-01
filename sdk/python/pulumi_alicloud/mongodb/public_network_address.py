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
from ._inputs import *

__all__ = ['PublicNetworkAddressArgs', 'PublicNetworkAddress']

@pulumi.input_type
class PublicNetworkAddressArgs:
    def __init__(__self__, *,
                 db_instance_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a PublicNetworkAddress resource.
        :param pulumi.Input[_builtins.str] db_instance_id: The instance ID.
        """
        pulumi.set(__self__, "db_instance_id", db_instance_id)

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The instance ID.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "db_instance_id", value)


@pulumi.input_type
class _PublicNetworkAddressState:
    def __init__(__self__, *,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 replica_sets: Optional[pulumi.Input[Sequence[pulumi.Input['PublicNetworkAddressReplicaSetArgs']]]] = None):
        """
        Input properties used for looking up and filtering PublicNetworkAddress resources.
        :param pulumi.Input[_builtins.str] db_instance_id: The instance ID.
        :param pulumi.Input[Sequence[pulumi.Input['PublicNetworkAddressReplicaSetArgs']]] replica_sets: Replica set instance information.
        """
        if db_instance_id is not None:
            pulumi.set(__self__, "db_instance_id", db_instance_id)
        if replica_sets is not None:
            pulumi.set(__self__, "replica_sets", replica_sets)

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The instance ID.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "db_instance_id", value)

    @_builtins.property
    @pulumi.getter(name="replicaSets")
    def replica_sets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PublicNetworkAddressReplicaSetArgs']]]]:
        """
        Replica set instance information.
        """
        return pulumi.get(self, "replica_sets")

    @replica_sets.setter
    def replica_sets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PublicNetworkAddressReplicaSetArgs']]]]):
        pulumi.set(self, "replica_sets", value)


@pulumi.type_token("alicloud:mongodb/publicNetworkAddress:PublicNetworkAddress")
class PublicNetworkAddress(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides an Alicloud MongoDB public network address resource.

        For information about MongoDB public network address and how to use it, see [Allocate Public Network Address for MongoDB](https://www.alibabacloud.com/help/en/mongodb/getting-started/apply-for-a-public-endpoint-for-an-apsaradb-for-mongodb-instance-optional).

        > **NOTE:** Available since v1.248.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.mongodb.get_zones()
        index = len(default.zones).apply(lambda length: length - 1)
        zone_id = default.zones[index].id
        default_network = alicloud.vpc.Network("default",
            cidr_block="10.0.0.0/8",
            vpc_name=name)
        default_switch = alicloud.vpc.Switch("default",
            vpc_id=default_network.id,
            zone_id=zone_id,
            cidr_block="10.0.0.0/24")
        default_instance = alicloud.mongodb.Instance("default",
            engine_version="4.4",
            storage_type="cloud_essd1",
            vswitch_id=default_switch.id,
            db_instance_storage=20,
            vpc_id=default_network.id,
            db_instance_class="mdb.shard.4x.large.d",
            storage_engine="WiredTiger",
            network_type="VPC",
            zone_id=zone_id)
        default_public_network_address = alicloud.mongodb.PublicNetworkAddress("default", db_instance_id=default_instance.id)
        ```

        ## Import

        MongoDB public network address can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:mongodb/publicNetworkAddress:PublicNetworkAddress example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] db_instance_id: The instance ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PublicNetworkAddressArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Alicloud MongoDB public network address resource.

        For information about MongoDB public network address and how to use it, see [Allocate Public Network Address for MongoDB](https://www.alibabacloud.com/help/en/mongodb/getting-started/apply-for-a-public-endpoint-for-an-apsaradb-for-mongodb-instance-optional).

        > **NOTE:** Available since v1.248.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.mongodb.get_zones()
        index = len(default.zones).apply(lambda length: length - 1)
        zone_id = default.zones[index].id
        default_network = alicloud.vpc.Network("default",
            cidr_block="10.0.0.0/8",
            vpc_name=name)
        default_switch = alicloud.vpc.Switch("default",
            vpc_id=default_network.id,
            zone_id=zone_id,
            cidr_block="10.0.0.0/24")
        default_instance = alicloud.mongodb.Instance("default",
            engine_version="4.4",
            storage_type="cloud_essd1",
            vswitch_id=default_switch.id,
            db_instance_storage=20,
            vpc_id=default_network.id,
            db_instance_class="mdb.shard.4x.large.d",
            storage_engine="WiredTiger",
            network_type="VPC",
            zone_id=zone_id)
        default_public_network_address = alicloud.mongodb.PublicNetworkAddress("default", db_instance_id=default_instance.id)
        ```

        ## Import

        MongoDB public network address can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:mongodb/publicNetworkAddress:PublicNetworkAddress example <id>
        ```

        :param str resource_name: The name of the resource.
        :param PublicNetworkAddressArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PublicNetworkAddressArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PublicNetworkAddressArgs.__new__(PublicNetworkAddressArgs)

            if db_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_instance_id'")
            __props__.__dict__["db_instance_id"] = db_instance_id
            __props__.__dict__["replica_sets"] = None
        super(PublicNetworkAddress, __self__).__init__(
            'alicloud:mongodb/publicNetworkAddress:PublicNetworkAddress',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            db_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            replica_sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PublicNetworkAddressReplicaSetArgs', 'PublicNetworkAddressReplicaSetArgsDict']]]]] = None) -> 'PublicNetworkAddress':
        """
        Get an existing PublicNetworkAddress resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] db_instance_id: The instance ID.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PublicNetworkAddressReplicaSetArgs', 'PublicNetworkAddressReplicaSetArgsDict']]]] replica_sets: Replica set instance information.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PublicNetworkAddressState.__new__(_PublicNetworkAddressState)

        __props__.__dict__["db_instance_id"] = db_instance_id
        __props__.__dict__["replica_sets"] = replica_sets
        return PublicNetworkAddress(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The instance ID.
        """
        return pulumi.get(self, "db_instance_id")

    @_builtins.property
    @pulumi.getter(name="replicaSets")
    def replica_sets(self) -> pulumi.Output[Sequence['outputs.PublicNetworkAddressReplicaSet']]:
        """
        Replica set instance information.
        """
        return pulumi.get(self, "replica_sets")

