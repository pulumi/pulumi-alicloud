# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['DeliveryChannel']


class DeliveryChannel(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delivery_channel_assume_role_arn: Optional[pulumi.Input[str]] = None,
                 delivery_channel_condition: Optional[pulumi.Input[str]] = None,
                 delivery_channel_name: Optional[pulumi.Input[str]] = None,
                 delivery_channel_target_arn: Optional[pulumi.Input[str]] = None,
                 delivery_channel_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a DeliveryChannel resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delivery_channel_assume_role_arn: The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        :param pulumi.Input[str] delivery_channel_condition: The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        :param pulumi.Input[str] delivery_channel_name: The name of the delivery channel.
        :param pulumi.Input[str] delivery_channel_target_arn: - The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
               - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
               - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
               - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        :param pulumi.Input[str] delivery_channel_type: - The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        :param pulumi.Input[str] description: The description of the delivery method.
        :param pulumi.Input[int] status: The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if delivery_channel_assume_role_arn is None:
                raise TypeError("Missing required property 'delivery_channel_assume_role_arn'")
            __props__['delivery_channel_assume_role_arn'] = delivery_channel_assume_role_arn
            __props__['delivery_channel_condition'] = delivery_channel_condition
            __props__['delivery_channel_name'] = delivery_channel_name
            if delivery_channel_target_arn is None:
                raise TypeError("Missing required property 'delivery_channel_target_arn'")
            __props__['delivery_channel_target_arn'] = delivery_channel_target_arn
            if delivery_channel_type is None:
                raise TypeError("Missing required property 'delivery_channel_type'")
            __props__['delivery_channel_type'] = delivery_channel_type
            __props__['description'] = description
            __props__['status'] = status
        super(DeliveryChannel, __self__).__init__(
            'alicloud:cfg/deliveryChannel:DeliveryChannel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delivery_channel_assume_role_arn: Optional[pulumi.Input[str]] = None,
            delivery_channel_condition: Optional[pulumi.Input[str]] = None,
            delivery_channel_name: Optional[pulumi.Input[str]] = None,
            delivery_channel_target_arn: Optional[pulumi.Input[str]] = None,
            delivery_channel_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[int]] = None) -> 'DeliveryChannel':
        """
        Get an existing DeliveryChannel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delivery_channel_assume_role_arn: The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        :param pulumi.Input[str] delivery_channel_condition: The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        :param pulumi.Input[str] delivery_channel_name: The name of the delivery channel.
        :param pulumi.Input[str] delivery_channel_target_arn: - The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
               - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
               - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
               - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        :param pulumi.Input[str] delivery_channel_type: - The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        :param pulumi.Input[str] description: The description of the delivery method.
        :param pulumi.Input[int] status: The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["delivery_channel_assume_role_arn"] = delivery_channel_assume_role_arn
        __props__["delivery_channel_condition"] = delivery_channel_condition
        __props__["delivery_channel_name"] = delivery_channel_name
        __props__["delivery_channel_target_arn"] = delivery_channel_target_arn
        __props__["delivery_channel_type"] = delivery_channel_type
        __props__["description"] = description
        __props__["status"] = status
        return DeliveryChannel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deliveryChannelAssumeRoleArn")
    def delivery_channel_assume_role_arn(self) -> pulumi.Output[str]:
        """
        The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        """
        return pulumi.get(self, "delivery_channel_assume_role_arn")

    @property
    @pulumi.getter(name="deliveryChannelCondition")
    def delivery_channel_condition(self) -> pulumi.Output[str]:
        """
        The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        """
        return pulumi.get(self, "delivery_channel_condition")

    @property
    @pulumi.getter(name="deliveryChannelName")
    def delivery_channel_name(self) -> pulumi.Output[str]:
        """
        The name of the delivery channel.
        """
        return pulumi.get(self, "delivery_channel_name")

    @property
    @pulumi.getter(name="deliveryChannelTargetArn")
    def delivery_channel_target_arn(self) -> pulumi.Output[str]:
        """
        - The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
        - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
        - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
        - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        """
        return pulumi.get(self, "delivery_channel_target_arn")

    @property
    @pulumi.getter(name="deliveryChannelType")
    def delivery_channel_type(self) -> pulumi.Output[str]:
        """
        - The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        """
        return pulumi.get(self, "delivery_channel_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the delivery method.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[int]:
        """
        The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        return pulumi.get(self, "status")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
