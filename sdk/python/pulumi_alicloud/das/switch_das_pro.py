# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SwitchDasProArgs', 'SwitchDasPro']

@pulumi.input_type
class SwitchDasProArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 sql_retention: Optional[pulumi.Input[int]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SwitchDasPro resource.
        :param pulumi.Input[str] instance_id: The ID of the database instance.
        :param pulumi.Input[int] sql_retention: The storage duration of SQL Explorer data. Valid values: `30`, `180`, `365`, `1095`, `1825`. Unit: days. Default value: `30`.
        :param pulumi.Input[str] user_id: The ID of the Alibaba Cloud account that is used to create the database instance.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        if sql_retention is not None:
            pulumi.set(__self__, "sql_retention", sql_retention)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the database instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="sqlRetention")
    def sql_retention(self) -> Optional[pulumi.Input[int]]:
        """
        The storage duration of SQL Explorer data. Valid values: `30`, `180`, `365`, `1095`, `1825`. Unit: days. Default value: `30`.
        """
        return pulumi.get(self, "sql_retention")

    @sql_retention.setter
    def sql_retention(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "sql_retention", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Alibaba Cloud account that is used to create the database instance.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _SwitchDasProState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 sql_retention: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[bool]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SwitchDasPro resources.
        :param pulumi.Input[str] instance_id: The ID of the database instance.
        :param pulumi.Input[int] sql_retention: The storage duration of SQL Explorer data. Valid values: `30`, `180`, `365`, `1095`, `1825`. Unit: days. Default value: `30`.
        :param pulumi.Input[bool] status: Whether the database instance has DAS professional.
        :param pulumi.Input[str] user_id: The ID of the Alibaba Cloud account that is used to create the database instance.
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if sql_retention is not None:
            pulumi.set(__self__, "sql_retention", sql_retention)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the database instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="sqlRetention")
    def sql_retention(self) -> Optional[pulumi.Input[int]]:
        """
        The storage duration of SQL Explorer data. Valid values: `30`, `180`, `365`, `1095`, `1825`. Unit: days. Default value: `30`.
        """
        return pulumi.get(self, "sql_retention")

    @sql_retention.setter
    def sql_retention(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "sql_retention", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the database instance has DAS professional.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Alibaba Cloud account that is used to create the database instance.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class SwitchDasPro(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 sql_retention: Optional[pulumi.Input[int]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DAS Switch Das Pro resource.

        For information about DAS Switch Das Pro and how to use it, see [What is Switch Das Pro](https://www.alibabacloud.com/help/en/database-autonomy-service/latest/enabledaspro).

        > **NOTE:** Available in v1.193.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.das.SwitchDasPro("default",
            instance_id="your_sql_id",
            sql_retention=30,
            user_id="your_account_id")
        ```

        ## Import

        DAS Switch Das Pro can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:das/switchDasPro:SwitchDasPro example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The ID of the database instance.
        :param pulumi.Input[int] sql_retention: The storage duration of SQL Explorer data. Valid values: `30`, `180`, `365`, `1095`, `1825`. Unit: days. Default value: `30`.
        :param pulumi.Input[str] user_id: The ID of the Alibaba Cloud account that is used to create the database instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SwitchDasProArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DAS Switch Das Pro resource.

        For information about DAS Switch Das Pro and how to use it, see [What is Switch Das Pro](https://www.alibabacloud.com/help/en/database-autonomy-service/latest/enabledaspro).

        > **NOTE:** Available in v1.193.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.das.SwitchDasPro("default",
            instance_id="your_sql_id",
            sql_retention=30,
            user_id="your_account_id")
        ```

        ## Import

        DAS Switch Das Pro can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:das/switchDasPro:SwitchDasPro example <id>
        ```

        :param str resource_name: The name of the resource.
        :param SwitchDasProArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SwitchDasProArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 sql_retention: Optional[pulumi.Input[int]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SwitchDasProArgs.__new__(SwitchDasProArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["sql_retention"] = sql_retention
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["status"] = None
        super(SwitchDasPro, __self__).__init__(
            'alicloud:das/switchDasPro:SwitchDasPro',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            sql_retention: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[bool]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'SwitchDasPro':
        """
        Get an existing SwitchDasPro resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The ID of the database instance.
        :param pulumi.Input[int] sql_retention: The storage duration of SQL Explorer data. Valid values: `30`, `180`, `365`, `1095`, `1825`. Unit: days. Default value: `30`.
        :param pulumi.Input[bool] status: Whether the database instance has DAS professional.
        :param pulumi.Input[str] user_id: The ID of the Alibaba Cloud account that is used to create the database instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SwitchDasProState.__new__(_SwitchDasProState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["sql_retention"] = sql_retention
        __props__.__dict__["status"] = status
        __props__.__dict__["user_id"] = user_id
        return SwitchDasPro(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the database instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="sqlRetention")
    def sql_retention(self) -> pulumi.Output[int]:
        """
        The storage duration of SQL Explorer data. Valid values: `30`, `180`, `365`, `1095`, `1825`. Unit: days. Default value: `30`.
        """
        return pulumi.get(self, "sql_retention")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[bool]:
        """
        Whether the database instance has DAS professional.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The ID of the Alibaba Cloud account that is used to create the database instance.
        """
        return pulumi.get(self, "user_id")
