# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AlertContactGroupArgs', 'AlertContactGroup']

@pulumi.input_type
class AlertContactGroupArgs:
    def __init__(__self__, *,
                 alert_contact_group_name: pulumi.Input[str],
                 contact_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a AlertContactGroup resource.
        :param pulumi.Input[str] alert_contact_group_name: The name of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] contact_ids: The list id of alert contact.
        """
        pulumi.set(__self__, "alert_contact_group_name", alert_contact_group_name)
        if contact_ids is not None:
            pulumi.set(__self__, "contact_ids", contact_ids)

    @property
    @pulumi.getter(name="alertContactGroupName")
    def alert_contact_group_name(self) -> pulumi.Input[str]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "alert_contact_group_name")

    @alert_contact_group_name.setter
    def alert_contact_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "alert_contact_group_name", value)

    @property
    @pulumi.getter(name="contactIds")
    def contact_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list id of alert contact.
        """
        return pulumi.get(self, "contact_ids")

    @contact_ids.setter
    def contact_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "contact_ids", value)


@pulumi.input_type
class _AlertContactGroupState:
    def __init__(__self__, *,
                 alert_contact_group_name: Optional[pulumi.Input[str]] = None,
                 contact_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering AlertContactGroup resources.
        :param pulumi.Input[str] alert_contact_group_name: The name of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] contact_ids: The list id of alert contact.
        """
        if alert_contact_group_name is not None:
            pulumi.set(__self__, "alert_contact_group_name", alert_contact_group_name)
        if contact_ids is not None:
            pulumi.set(__self__, "contact_ids", contact_ids)

    @property
    @pulumi.getter(name="alertContactGroupName")
    def alert_contact_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "alert_contact_group_name")

    @alert_contact_group_name.setter
    def alert_contact_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_contact_group_name", value)

    @property
    @pulumi.getter(name="contactIds")
    def contact_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list id of alert contact.
        """
        return pulumi.get(self, "contact_ids")

    @contact_ids.setter
    def contact_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "contact_ids", value)


class AlertContactGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_contact_group_name: Optional[pulumi.Input[str]] = None,
                 contact_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Application Real-Time Monitoring Service (ARMS) Alert Contact Group resource.

        For information about Application Real-Time Monitoring Service (ARMS) Alert Contact Group and how to use it, see [What is Alert Contact Group](https://www.alibabacloud.com/help/zh/doc-detail/130677.htm).

        > **NOTE:** Available in v1.131.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_alert_contact = alicloud.arms.AlertContact("exampleAlertContact",
            alert_contact_name="example_value",
            ding_robot_webhook_url="https://oapi.dingtalk.com/robot/send?access_token=91f2f6****",
            email="someone@example.com",
            phone_num="1381111****")
        example_alert_contact_group = alicloud.arms.AlertContactGroup("exampleAlertContactGroup",
            alert_contact_group_name="example_value",
            contact_ids=[example_alert_contact.id])
        ```

        ## Import

        Application Real-Time Monitoring Service (ARMS) Alert Contact Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/alertContactGroup:AlertContactGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_contact_group_name: The name of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] contact_ids: The list id of alert contact.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertContactGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Application Real-Time Monitoring Service (ARMS) Alert Contact Group resource.

        For information about Application Real-Time Monitoring Service (ARMS) Alert Contact Group and how to use it, see [What is Alert Contact Group](https://www.alibabacloud.com/help/zh/doc-detail/130677.htm).

        > **NOTE:** Available in v1.131.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_alert_contact = alicloud.arms.AlertContact("exampleAlertContact",
            alert_contact_name="example_value",
            ding_robot_webhook_url="https://oapi.dingtalk.com/robot/send?access_token=91f2f6****",
            email="someone@example.com",
            phone_num="1381111****")
        example_alert_contact_group = alicloud.arms.AlertContactGroup("exampleAlertContactGroup",
            alert_contact_group_name="example_value",
            contact_ids=[example_alert_contact.id])
        ```

        ## Import

        Application Real-Time Monitoring Service (ARMS) Alert Contact Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/alertContactGroup:AlertContactGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param AlertContactGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertContactGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_contact_group_name: Optional[pulumi.Input[str]] = None,
                 contact_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertContactGroupArgs.__new__(AlertContactGroupArgs)

            if alert_contact_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'alert_contact_group_name'")
            __props__.__dict__["alert_contact_group_name"] = alert_contact_group_name
            __props__.__dict__["contact_ids"] = contact_ids
        super(AlertContactGroup, __self__).__init__(
            'alicloud:arms/alertContactGroup:AlertContactGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alert_contact_group_name: Optional[pulumi.Input[str]] = None,
            contact_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'AlertContactGroup':
        """
        Get an existing AlertContactGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_contact_group_name: The name of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] contact_ids: The list id of alert contact.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertContactGroupState.__new__(_AlertContactGroupState)

        __props__.__dict__["alert_contact_group_name"] = alert_contact_group_name
        __props__.__dict__["contact_ids"] = contact_ids
        return AlertContactGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alertContactGroupName")
    def alert_contact_group_name(self) -> pulumi.Output[str]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "alert_contact_group_name")

    @property
    @pulumi.getter(name="contactIds")
    def contact_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The list id of alert contact.
        """
        return pulumi.get(self, "contact_ids")
