// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sls.Outputs
{

    [OutputType]
    public sealed class AlertConfigurationPolicyConfiguration
    {
        /// <summary>
        /// The ID of the action policy used. If the alert policy is in advanced mode and the selected alert policy is not configured with a dynamic action policy, set the actionPolicyId to an empty string.
        /// </summary>
        public readonly string? ActionPolicyId;
        /// <summary>
        /// Alarm policy ID. If it is in simple mode or normal mode, set it to sls.builtin.dynamic (dynamic alarm policy built into the system). For advanced mode, set it to the specified alarm policy ID.
        /// </summary>
        public readonly string? AlertPolicyId;
        /// <summary>
        /// Repeat the waiting time. For example, 5m, 1H, etc.
        /// </summary>
        public readonly string? RepeatInterval;

        [OutputConstructor]
        private AlertConfigurationPolicyConfiguration(
            string? actionPolicyId,

            string? alertPolicyId,

            string? repeatInterval)
        {
            ActionPolicyId = actionPolicyId;
            AlertPolicyId = alertPolicyId;
            RepeatInterval = repeatInterval;
        }
    }
}
