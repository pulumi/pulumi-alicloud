// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class GetTriggersTriggerResult
    {
        /// <summary>
        /// JSON-encoded trigger configuration. See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        /// </summary>
        public readonly string Config;
        /// <summary>
        /// FC trigger creation time.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// FC trigger ID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        /// </summary>
        public readonly string InvocationRole;
        /// <summary>
        /// FC trigger last modification time.
        /// </summary>
        public readonly string LastModificationTime;
        /// <summary>
        /// FC trigger name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        /// </summary>
        public readonly string SourceArn;
        /// <summary>
        /// Type of the trigger. Valid values: `oss`, `log`, `timer`, `http`, `mns_topic`, `cdn_events` and `eventbridge`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetTriggersTriggerResult(
            string config,

            string creationTime,

            string id,

            string invocationRole,

            string lastModificationTime,

            string name,

            string sourceArn,

            string type)
        {
            Config = config;
            CreationTime = creationTime;
            Id = id;
            InvocationRole = invocationRole;
            LastModificationTime = lastModificationTime;
            Name = name;
            SourceArn = sourceArn;
            Type = type;
        }
    }
}