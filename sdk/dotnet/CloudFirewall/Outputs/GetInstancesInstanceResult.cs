// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// The Creation time of the resource.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The end time of the resource..
        /// </summary>
        public readonly string EndTime;
        /// <summary>
        /// The ID of the Instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// Automatic renewal period unit. Valid values: `Month`,`Year`.
        /// </summary>
        public readonly string RenewalDurationUnit;
        /// <summary>
        /// Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
        /// </summary>
        public readonly string RenewalStatus;
        /// <summary>
        /// The Status of Instance.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            string createTime,

            string endTime,

            string id,

            string instanceId,

            string paymentType,

            string renewalDurationUnit,

            string renewalStatus,

            string status)
        {
            CreateTime = createTime;
            EndTime = endTime;
            Id = id;
            InstanceId = instanceId;
            PaymentType = paymentType;
            RenewalDurationUnit = renewalDurationUnit;
            RenewalStatus = renewalStatus;
            Status = status;
        }
    }
}
