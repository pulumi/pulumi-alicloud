// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DataWorks.Inputs
{

    public sealed class DiAlarmRuleNotificationSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alarm suppression interval, in minutes
        /// </summary>
        [Input("inhibitionInterval")]
        public Input<int>? InhibitionInterval { get; set; }

        [Input("notificationChannels")]
        private InputList<Inputs.DiAlarmRuleNotificationSettingsNotificationChannelArgs>? _notificationChannels;

        /// <summary>
        /// Alarm notification Channel See `notification_channels` below.
        /// </summary>
        public InputList<Inputs.DiAlarmRuleNotificationSettingsNotificationChannelArgs> NotificationChannels
        {
            get => _notificationChannels ?? (_notificationChannels = new InputList<Inputs.DiAlarmRuleNotificationSettingsNotificationChannelArgs>());
            set => _notificationChannels = value;
        }

        [Input("notificationReceivers")]
        private InputList<Inputs.DiAlarmRuleNotificationSettingsNotificationReceiverArgs>? _notificationReceivers;

        /// <summary>
        /// List of alert notification recipients See `notification_receivers` below.
        /// </summary>
        public InputList<Inputs.DiAlarmRuleNotificationSettingsNotificationReceiverArgs> NotificationReceivers
        {
            get => _notificationReceivers ?? (_notificationReceivers = new InputList<Inputs.DiAlarmRuleNotificationSettingsNotificationReceiverArgs>());
            set => _notificationReceivers = value;
        }

        public DiAlarmRuleNotificationSettingsArgs()
        {
        }
        public static new DiAlarmRuleNotificationSettingsArgs Empty => new DiAlarmRuleNotificationSettingsArgs();
    }
}
