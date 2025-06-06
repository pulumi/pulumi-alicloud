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
from ._inputs import *

__all__ = ['AppGroupArgs', 'AppGroup']

@pulumi.input_type
class AppGroupArgs:
    def __init__(__self__, *,
                 app_group_name: pulumi.Input[builtins.str],
                 payment_type: pulumi.Input[builtins.str],
                 quota: pulumi.Input['AppGroupQuotaArgs'],
                 type: pulumi.Input[builtins.str],
                 charge_way: Optional[pulumi.Input[builtins.str]] = None,
                 current_version: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 order_type: Optional[pulumi.Input[builtins.str]] = None,
                 orders: Optional[pulumi.Input[Sequence[pulumi.Input['AppGroupOrderArgs']]]] = None):
        """
        The set of arguments for constructing a AppGroup resource.
        :param pulumi.Input[builtins.str] app_group_name: Application Group Name.
        :param pulumi.Input[builtins.str] payment_type: The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
        :param pulumi.Input['AppGroupQuotaArgs'] quota: Quota information.  The details see Block quota.
        :param pulumi.Input[builtins.str] type: Application type. Valid Values: `standard`, `enhanced`.
        :param pulumi.Input[builtins.str] charge_way: Billing model. Valid values:`compute_resource` and `qps`.
        :param pulumi.Input[builtins.str] current_version: The version of Application Group Name.
        :param pulumi.Input[builtins.str] description: The description of the resource.
        :param pulumi.Input[builtins.str] order_type: Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
        :param pulumi.Input[Sequence[pulumi.Input['AppGroupOrderArgs']]] orders: Order cycle information. The details see Block order.
        """
        pulumi.set(__self__, "app_group_name", app_group_name)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "quota", quota)
        pulumi.set(__self__, "type", type)
        if charge_way is not None:
            pulumi.set(__self__, "charge_way", charge_way)
        if current_version is not None:
            pulumi.set(__self__, "current_version", current_version)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if order_type is not None:
            pulumi.set(__self__, "order_type", order_type)
        if orders is not None:
            pulumi.set(__self__, "orders", orders)

    @property
    @pulumi.getter(name="appGroupName")
    def app_group_name(self) -> pulumi.Input[builtins.str]:
        """
        Application Group Name.
        """
        return pulumi.get(self, "app_group_name")

    @app_group_name.setter
    def app_group_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "app_group_name", value)

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> pulumi.Input[builtins.str]:
        """
        The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
        """
        return pulumi.get(self, "payment_type")

    @payment_type.setter
    def payment_type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "payment_type", value)

    @property
    @pulumi.getter
    def quota(self) -> pulumi.Input['AppGroupQuotaArgs']:
        """
        Quota information.  The details see Block quota.
        """
        return pulumi.get(self, "quota")

    @quota.setter
    def quota(self, value: pulumi.Input['AppGroupQuotaArgs']):
        pulumi.set(self, "quota", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[builtins.str]:
        """
        Application type. Valid Values: `standard`, `enhanced`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="chargeWay")
    def charge_way(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Billing model. Valid values:`compute_resource` and `qps`.
        """
        return pulumi.get(self, "charge_way")

    @charge_way.setter
    def charge_way(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "charge_way", value)

    @property
    @pulumi.getter(name="currentVersion")
    def current_version(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The version of Application Group Name.
        """
        return pulumi.get(self, "current_version")

    @current_version.setter
    def current_version(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "current_version", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="orderType")
    def order_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
        """
        return pulumi.get(self, "order_type")

    @order_type.setter
    def order_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "order_type", value)

    @property
    @pulumi.getter
    def orders(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AppGroupOrderArgs']]]]:
        """
        Order cycle information. The details see Block order.
        """
        return pulumi.get(self, "orders")

    @orders.setter
    def orders(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AppGroupOrderArgs']]]]):
        pulumi.set(self, "orders", value)


@pulumi.input_type
class _AppGroupState:
    def __init__(__self__, *,
                 app_group_name: Optional[pulumi.Input[builtins.str]] = None,
                 charge_way: Optional[pulumi.Input[builtins.str]] = None,
                 current_version: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 instance_id: Optional[pulumi.Input[builtins.str]] = None,
                 order_type: Optional[pulumi.Input[builtins.str]] = None,
                 orders: Optional[pulumi.Input[Sequence[pulumi.Input['AppGroupOrderArgs']]]] = None,
                 payment_type: Optional[pulumi.Input[builtins.str]] = None,
                 quota: Optional[pulumi.Input['AppGroupQuotaArgs']] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppGroup resources.
        :param pulumi.Input[builtins.str] app_group_name: Application Group Name.
        :param pulumi.Input[builtins.str] charge_way: Billing model. Valid values:`compute_resource` and `qps`.
        :param pulumi.Input[builtins.str] current_version: The version of Application Group Name.
        :param pulumi.Input[builtins.str] description: The description of the resource.
        :param pulumi.Input[builtins.str] instance_id: The instance id.
        :param pulumi.Input[builtins.str] order_type: Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
        :param pulumi.Input[Sequence[pulumi.Input['AppGroupOrderArgs']]] orders: Order cycle information. The details see Block order.
        :param pulumi.Input[builtins.str] payment_type: The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
        :param pulumi.Input['AppGroupQuotaArgs'] quota: Quota information.  The details see Block quota.
        :param pulumi.Input[builtins.str] status: The status of the resource. Valid values: `producing`,`review_pending`,`config_pending`,`normal`,`frozen`.
        :param pulumi.Input[builtins.str] type: Application type. Valid Values: `standard`, `enhanced`.
        """
        if app_group_name is not None:
            pulumi.set(__self__, "app_group_name", app_group_name)
        if charge_way is not None:
            pulumi.set(__self__, "charge_way", charge_way)
        if current_version is not None:
            pulumi.set(__self__, "current_version", current_version)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if order_type is not None:
            pulumi.set(__self__, "order_type", order_type)
        if orders is not None:
            pulumi.set(__self__, "orders", orders)
        if payment_type is not None:
            pulumi.set(__self__, "payment_type", payment_type)
        if quota is not None:
            pulumi.set(__self__, "quota", quota)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="appGroupName")
    def app_group_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Application Group Name.
        """
        return pulumi.get(self, "app_group_name")

    @app_group_name.setter
    def app_group_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "app_group_name", value)

    @property
    @pulumi.getter(name="chargeWay")
    def charge_way(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Billing model. Valid values:`compute_resource` and `qps`.
        """
        return pulumi.get(self, "charge_way")

    @charge_way.setter
    def charge_way(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "charge_way", value)

    @property
    @pulumi.getter(name="currentVersion")
    def current_version(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The version of Application Group Name.
        """
        return pulumi.get(self, "current_version")

    @current_version.setter
    def current_version(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "current_version", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The instance id.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="orderType")
    def order_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
        """
        return pulumi.get(self, "order_type")

    @order_type.setter
    def order_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "order_type", value)

    @property
    @pulumi.getter
    def orders(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AppGroupOrderArgs']]]]:
        """
        Order cycle information. The details see Block order.
        """
        return pulumi.get(self, "orders")

    @orders.setter
    def orders(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AppGroupOrderArgs']]]]):
        pulumi.set(self, "orders", value)

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
        """
        return pulumi.get(self, "payment_type")

    @payment_type.setter
    def payment_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "payment_type", value)

    @property
    @pulumi.getter
    def quota(self) -> Optional[pulumi.Input['AppGroupQuotaArgs']]:
        """
        Quota information.  The details see Block quota.
        """
        return pulumi.get(self, "quota")

    @quota.setter
    def quota(self, value: Optional[pulumi.Input['AppGroupQuotaArgs']]):
        pulumi.set(self, "quota", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The status of the resource. Valid values: `producing`,`review_pending`,`config_pending`,`normal`,`frozen`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Application type. Valid Values: `standard`, `enhanced`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.type_token("alicloud:opensearch/appGroup:AppGroup")
class AppGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_group_name: Optional[pulumi.Input[builtins.str]] = None,
                 charge_way: Optional[pulumi.Input[builtins.str]] = None,
                 current_version: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 order_type: Optional[pulumi.Input[builtins.str]] = None,
                 orders: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AppGroupOrderArgs', 'AppGroupOrderArgsDict']]]]] = None,
                 payment_type: Optional[pulumi.Input[builtins.str]] = None,
                 quota: Optional[pulumi.Input[Union['AppGroupQuotaArgs', 'AppGroupQuotaArgsDict']]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides a Open Search App Group resource.

        For information about Open Search App Group and how to use it, see [What is App Group](https://www.aliyun.com/product/opensearch).

        > **NOTE:** Available in v1.136.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "name"
        default = alicloud.opensearch.AppGroup("default",
            app_group_name=name,
            payment_type="PayAsYouGo",
            type="standard",
            quota={
                "doc_size": 1,
                "compute_resource": 20,
                "spec": "opensearch.share.common",
            })
        ```

        ## Import

        Open Search App Group can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:opensearch/appGroup:AppGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] app_group_name: Application Group Name.
        :param pulumi.Input[builtins.str] charge_way: Billing model. Valid values:`compute_resource` and `qps`.
        :param pulumi.Input[builtins.str] current_version: The version of Application Group Name.
        :param pulumi.Input[builtins.str] description: The description of the resource.
        :param pulumi.Input[builtins.str] order_type: Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AppGroupOrderArgs', 'AppGroupOrderArgsDict']]]] orders: Order cycle information. The details see Block order.
        :param pulumi.Input[builtins.str] payment_type: The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
        :param pulumi.Input[Union['AppGroupQuotaArgs', 'AppGroupQuotaArgsDict']] quota: Quota information.  The details see Block quota.
        :param pulumi.Input[builtins.str] type: Application type. Valid Values: `standard`, `enhanced`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Open Search App Group resource.

        For information about Open Search App Group and how to use it, see [What is App Group](https://www.aliyun.com/product/opensearch).

        > **NOTE:** Available in v1.136.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "name"
        default = alicloud.opensearch.AppGroup("default",
            app_group_name=name,
            payment_type="PayAsYouGo",
            type="standard",
            quota={
                "doc_size": 1,
                "compute_resource": 20,
                "spec": "opensearch.share.common",
            })
        ```

        ## Import

        Open Search App Group can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:opensearch/appGroup:AppGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param AppGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_group_name: Optional[pulumi.Input[builtins.str]] = None,
                 charge_way: Optional[pulumi.Input[builtins.str]] = None,
                 current_version: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 order_type: Optional[pulumi.Input[builtins.str]] = None,
                 orders: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AppGroupOrderArgs', 'AppGroupOrderArgsDict']]]]] = None,
                 payment_type: Optional[pulumi.Input[builtins.str]] = None,
                 quota: Optional[pulumi.Input[Union['AppGroupQuotaArgs', 'AppGroupQuotaArgsDict']]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppGroupArgs.__new__(AppGroupArgs)

            if app_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'app_group_name'")
            __props__.__dict__["app_group_name"] = app_group_name
            __props__.__dict__["charge_way"] = charge_way
            __props__.__dict__["current_version"] = current_version
            __props__.__dict__["description"] = description
            __props__.__dict__["order_type"] = order_type
            __props__.__dict__["orders"] = orders
            if payment_type is None and not opts.urn:
                raise TypeError("Missing required property 'payment_type'")
            __props__.__dict__["payment_type"] = payment_type
            if quota is None and not opts.urn:
                raise TypeError("Missing required property 'quota'")
            __props__.__dict__["quota"] = quota
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["instance_id"] = None
            __props__.__dict__["status"] = None
        super(AppGroup, __self__).__init__(
            'alicloud:opensearch/appGroup:AppGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_group_name: Optional[pulumi.Input[builtins.str]] = None,
            charge_way: Optional[pulumi.Input[builtins.str]] = None,
            current_version: Optional[pulumi.Input[builtins.str]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            instance_id: Optional[pulumi.Input[builtins.str]] = None,
            order_type: Optional[pulumi.Input[builtins.str]] = None,
            orders: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AppGroupOrderArgs', 'AppGroupOrderArgsDict']]]]] = None,
            payment_type: Optional[pulumi.Input[builtins.str]] = None,
            quota: Optional[pulumi.Input[Union['AppGroupQuotaArgs', 'AppGroupQuotaArgsDict']]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None,
            type: Optional[pulumi.Input[builtins.str]] = None) -> 'AppGroup':
        """
        Get an existing AppGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] app_group_name: Application Group Name.
        :param pulumi.Input[builtins.str] charge_way: Billing model. Valid values:`compute_resource` and `qps`.
        :param pulumi.Input[builtins.str] current_version: The version of Application Group Name.
        :param pulumi.Input[builtins.str] description: The description of the resource.
        :param pulumi.Input[builtins.str] instance_id: The instance id.
        :param pulumi.Input[builtins.str] order_type: Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AppGroupOrderArgs', 'AppGroupOrderArgsDict']]]] orders: Order cycle information. The details see Block order.
        :param pulumi.Input[builtins.str] payment_type: The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
        :param pulumi.Input[Union['AppGroupQuotaArgs', 'AppGroupQuotaArgsDict']] quota: Quota information.  The details see Block quota.
        :param pulumi.Input[builtins.str] status: The status of the resource. Valid values: `producing`,`review_pending`,`config_pending`,`normal`,`frozen`.
        :param pulumi.Input[builtins.str] type: Application type. Valid Values: `standard`, `enhanced`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppGroupState.__new__(_AppGroupState)

        __props__.__dict__["app_group_name"] = app_group_name
        __props__.__dict__["charge_way"] = charge_way
        __props__.__dict__["current_version"] = current_version
        __props__.__dict__["description"] = description
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["order_type"] = order_type
        __props__.__dict__["orders"] = orders
        __props__.__dict__["payment_type"] = payment_type
        __props__.__dict__["quota"] = quota
        __props__.__dict__["status"] = status
        __props__.__dict__["type"] = type
        return AppGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appGroupName")
    def app_group_name(self) -> pulumi.Output[builtins.str]:
        """
        Application Group Name.
        """
        return pulumi.get(self, "app_group_name")

    @property
    @pulumi.getter(name="chargeWay")
    def charge_way(self) -> pulumi.Output[builtins.str]:
        """
        Billing model. Valid values:`compute_resource` and `qps`.
        """
        return pulumi.get(self, "charge_way")

    @property
    @pulumi.getter(name="currentVersion")
    def current_version(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The version of Application Group Name.
        """
        return pulumi.get(self, "current_version")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[builtins.str]:
        """
        The instance id.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="orderType")
    def order_type(self) -> pulumi.Output[builtins.str]:
        """
        Order change type. Valid values: `UPGRADE` and `DOWNGRADE`.
        """
        return pulumi.get(self, "order_type")

    @property
    @pulumi.getter
    def orders(self) -> pulumi.Output[Optional[Sequence['outputs.AppGroupOrder']]]:
        """
        Order cycle information. The details see Block order.
        """
        return pulumi.get(self, "orders")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> pulumi.Output[builtins.str]:
        """
        The billing method of the resource. Valid values: `Subscription` and `PayAsYouGo`.
        """
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter
    def quota(self) -> pulumi.Output['outputs.AppGroupQuota']:
        """
        Quota information.  The details see Block quota.
        """
        return pulumi.get(self, "quota")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[builtins.str]:
        """
        The status of the resource. Valid values: `producing`,`review_pending`,`config_pending`,`normal`,`frozen`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[builtins.str]:
        """
        Application type. Valid Values: `standard`, `enhanced`.
        """
        return pulumi.get(self, "type")

