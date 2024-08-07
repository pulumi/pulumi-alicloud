// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ.Inputs
{

    public sealed class ConsumerGroupConsumeRetryPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of retries.
        /// </summary>
        [Input("maxRetryTimes")]
        public Input<int>? MaxRetryTimes { get; set; }

        /// <summary>
        /// Consume retry policy.
        /// </summary>
        [Input("retryPolicy")]
        public Input<string>? RetryPolicy { get; set; }

        public ConsumerGroupConsumeRetryPolicyGetArgs()
        {
        }
        public static new ConsumerGroupConsumeRetryPolicyGetArgs Empty => new ConsumerGroupConsumeRetryPolicyGetArgs();
    }
}
