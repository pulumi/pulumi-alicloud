// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso.Outputs
{

    [OutputType]
    public sealed class DirectoryMfaAuthenticationSettingInfo
    {
        /// <summary>
        /// Global MFA validation policy
        /// </summary>
        public readonly string? MfaAuthenticationAdvanceSettings;
        /// <summary>
        /// MFA verification policy for abnormal logon.
        /// </summary>
        public readonly string? OperationForRiskLogin;

        [OutputConstructor]
        private DirectoryMfaAuthenticationSettingInfo(
            string? mfaAuthenticationAdvanceSettings,

            string? operationForRiskLogin)
        {
            MfaAuthenticationAdvanceSettings = mfaAuthenticationAdvanceSettings;
            OperationForRiskLogin = operationForRiskLogin;
        }
    }
}
