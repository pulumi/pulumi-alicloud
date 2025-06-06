// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sddp.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// Whether the required RAM authorization is configured.
        /// </summary>
        public readonly bool Authed;
        public readonly string Id;
        /// <summary>
        /// The ID of the instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The number of instances.
        /// </summary>
        public readonly string InstanceNum;
        /// <summary>
        /// Whether the authorized MaxCompute (ODPS) assets.
        /// </summary>
        public readonly bool OdpsSet;
        /// <summary>
        /// Whether the authorized oss assets.
        /// </summary>
        public readonly bool OssBucketSet;
        /// <summary>
        /// The OSS size of the instance.
        /// </summary>
        public readonly string OssSize;
        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// Whether the authorized rds assets.
        /// </summary>
        public readonly bool RdsSet;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            bool authed,

            string id,

            string instanceId,

            string instanceNum,

            bool odpsSet,

            bool ossBucketSet,

            string ossSize,

            string paymentType,

            bool rdsSet,

            string status)
        {
            Authed = authed;
            Id = id;
            InstanceId = instanceId;
            InstanceNum = instanceNum;
            OdpsSet = odpsSet;
            OssBucketSet = ossBucketSet;
            OssSize = ossSize;
            PaymentType = paymentType;
            RdsSet = rdsSet;
            Status = status;
        }
    }
}
