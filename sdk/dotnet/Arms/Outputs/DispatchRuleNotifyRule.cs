// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Outputs
{

    [OutputType]
    public sealed class DispatchRuleNotifyRule
    {
        /// <summary>
        /// The notification method. Valid values: dingTalk, sms, webhook, email, and wechat.
        /// </summary>
        public readonly ImmutableArray<string> NotifyChannels;
        /// <summary>
        /// End time of notification.
        /// </summary>
        public readonly string NotifyEndTime;
        /// <summary>
        /// Sets the notification object. See `notify_objects` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DispatchRuleNotifyRuleNotifyObject> NotifyObjects;
        /// <summary>
        /// Start time of notification.
        /// </summary>
        public readonly string NotifyStartTime;

        [OutputConstructor]
        private DispatchRuleNotifyRule(
            ImmutableArray<string> notifyChannels,

            string notifyEndTime,

            ImmutableArray<Outputs.DispatchRuleNotifyRuleNotifyObject> notifyObjects,

            string notifyStartTime)
        {
            NotifyChannels = notifyChannels;
            NotifyEndTime = notifyEndTime;
            NotifyObjects = notifyObjects;
            NotifyStartTime = notifyStartTime;
        }
    }
}
