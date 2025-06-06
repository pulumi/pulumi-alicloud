// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ.Outputs
{

    [OutputType]
    public sealed class ConsumerGroupConsumeRetryPolicy
    {
        /// <summary>
        /// The dead-letter topic. If the consumer fails to consume a message in an abnormal situation and the message is still unsuccessful after retrying, the message will be delivered to the dead letter Topic for subsequent business recovery or backtracking.
        /// </summary>
        public readonly string? DeadLetterTargetTopic;
        /// <summary>
        /// Maximum number of retries.
        /// </summary>
        public readonly int? MaxRetryTimes;
        /// <summary>
        /// Consume retry policy.
        /// </summary>
        public readonly string? RetryPolicy;

        [OutputConstructor]
        private ConsumerGroupConsumeRetryPolicy(
            string? deadLetterTargetTopic,

            int? maxRetryTimes,

            string? retryPolicy)
        {
            DeadLetterTargetTopic = deadLetterTargetTopic;
            MaxRetryTimes = maxRetryTimes;
            RetryPolicy = retryPolicy;
        }
    }
}
