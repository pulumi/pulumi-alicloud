// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Outputs
{

    [OutputType]
    public sealed class GetDispatchRulesRuleNotifyTemplateResult
    {
        /// <summary>
        /// The content of the email.
        /// </summary>
        public readonly string EmailContent;
        /// <summary>
        /// The content of the email.
        /// </summary>
        public readonly string EmailRecoverContent;
        /// <summary>
        /// The title of the email.
        /// </summary>
        public readonly string EmailRecoverTitle;
        /// <summary>
        /// The title of the email.
        /// </summary>
        public readonly string EmailTitle;
        /// <summary>
        /// The content of the robot.
        /// </summary>
        public readonly string RobotContent;
        /// <summary>
        /// The content of the SMS.
        /// </summary>
        public readonly string SmsContent;
        /// <summary>
        /// The content of the SMS.
        /// </summary>
        public readonly string SmsRecoverContent;
        /// <summary>
        /// The content of the TTS.
        /// </summary>
        public readonly string TtsContent;
        /// <summary>
        /// The content of the TTS.
        /// </summary>
        public readonly string TtsRecoverContent;

        [OutputConstructor]
        private GetDispatchRulesRuleNotifyTemplateResult(
            string emailContent,

            string emailRecoverContent,

            string emailRecoverTitle,

            string emailTitle,

            string robotContent,

            string smsContent,

            string smsRecoverContent,

            string ttsContent,

            string ttsRecoverContent)
        {
            EmailContent = emailContent;
            EmailRecoverContent = emailRecoverContent;
            EmailRecoverTitle = emailRecoverTitle;
            EmailTitle = emailTitle;
            RobotContent = robotContent;
            SmsContent = smsContent;
            SmsRecoverContent = smsRecoverContent;
            TtsContent = ttsContent;
            TtsRecoverContent = ttsRecoverContent;
        }
    }
}