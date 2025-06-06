// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Inputs
{

    public sealed class DispatchRuleNotifyTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The content of the email notification.
        /// </summary>
        [Input("emailContent", required: true)]
        public Input<string> EmailContent { get; set; } = null!;

        /// <summary>
        /// The content of the email notification for restored alerts.
        /// </summary>
        [Input("emailRecoverContent", required: true)]
        public Input<string> EmailRecoverContent { get; set; } = null!;

        /// <summary>
        /// The title of the email notification for restored alerts.
        /// </summary>
        [Input("emailRecoverTitle", required: true)]
        public Input<string> EmailRecoverTitle { get; set; } = null!;

        /// <summary>
        /// The title of the email notification.
        /// </summary>
        [Input("emailTitle", required: true)]
        public Input<string> EmailTitle { get; set; } = null!;

        /// <summary>
        /// The content of the robot notification.
        /// </summary>
        [Input("robotContent", required: true)]
        public Input<string> RobotContent { get; set; } = null!;

        /// <summary>
        /// The content of the SMS notification.
        /// </summary>
        [Input("smsContent", required: true)]
        public Input<string> SmsContent { get; set; } = null!;

        /// <summary>
        /// The content of the SMS notification for restored alerts.
        /// </summary>
        [Input("smsRecoverContent", required: true)]
        public Input<string> SmsRecoverContent { get; set; } = null!;

        /// <summary>
        /// The content of the TTS notification.
        /// </summary>
        [Input("ttsContent", required: true)]
        public Input<string> TtsContent { get; set; } = null!;

        /// <summary>
        /// The content of the TTS notification for restored alerts.
        /// </summary>
        [Input("ttsRecoverContent", required: true)]
        public Input<string> TtsRecoverContent { get; set; } = null!;

        public DispatchRuleNotifyTemplateGetArgs()
        {
        }
        public static new DispatchRuleNotifyTemplateGetArgs Empty => new DispatchRuleNotifyTemplateGetArgs();
    }
}
