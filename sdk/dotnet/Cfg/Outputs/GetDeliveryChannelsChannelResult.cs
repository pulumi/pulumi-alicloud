// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg.Outputs
{

    [OutputType]
    public sealed class GetDeliveryChannelsChannelResult
    {
        /// <summary>
        /// The Alibaba Cloud Resource Name (ARN) of the role assumed by delivery method.
        /// </summary>
        public readonly string DeliveryChannelAssumeRoleArn;
        /// <summary>
        /// The rule attached to the delivery method. This parameter is applicable only to delivery methods of the Message Service (MNS) type.
        /// </summary>
        public readonly string DeliveryChannelCondition;
        /// <summary>
        /// The ID of the delivery channel.
        /// </summary>
        public readonly string DeliveryChannelId;
        /// <summary>
        /// The name of the delivery channel.
        /// </summary>
        public readonly string DeliveryChannelName;
        /// <summary>
        /// The ARN of the delivery destination.
        /// </summary>
        public readonly string DeliveryChannelTargetArn;
        /// <summary>
        /// The type of the delivery channel.
        /// </summary>
        public readonly string DeliveryChannelType;
        /// <summary>
        /// The description of the delivery channel.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Config Delivery Channel.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The status of the config delivery channel. Valid values `0`: Disable delivery channel, `1`: Enable delivery channel.
        /// </summary>
        public readonly int Status;

        [OutputConstructor]
        private GetDeliveryChannelsChannelResult(
            string deliveryChannelAssumeRoleArn,

            string deliveryChannelCondition,

            string deliveryChannelId,

            string deliveryChannelName,

            string deliveryChannelTargetArn,

            string deliveryChannelType,

            string description,

            string id,

            int status)
        {
            DeliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            DeliveryChannelCondition = deliveryChannelCondition;
            DeliveryChannelId = deliveryChannelId;
            DeliveryChannelName = deliveryChannelName;
            DeliveryChannelTargetArn = deliveryChannelTargetArn;
            DeliveryChannelType = deliveryChannelType;
            Description = description;
            Id = id;
            Status = status;
        }
    }
}
