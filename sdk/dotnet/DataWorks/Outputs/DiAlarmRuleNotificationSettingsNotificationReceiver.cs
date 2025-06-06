// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DataWorks.Outputs
{

    [OutputType]
    public sealed class DiAlarmRuleNotificationSettingsNotificationReceiver
    {
        /// <summary>
        /// The type of the receiver. Valid values: AliyunUid/DingToken/FeishuToken/WebHookUrl.
        /// </summary>
        public readonly string? ReceiverType;
        /// <summary>
        /// Receiver Value List
        /// </summary>
        public readonly ImmutableArray<string> ReceiverValues;

        [OutputConstructor]
        private DiAlarmRuleNotificationSettingsNotificationReceiver(
            string? receiverType,

            ImmutableArray<string> receiverValues)
        {
            ReceiverType = receiverType;
            ReceiverValues = receiverValues;
        }
    }
}
