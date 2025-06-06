// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr.Outputs
{

    [OutputType]
    public sealed class PolicyRuleRetentionRule
    {
        /// <summary>
        /// Valid values: `annually`, `MONTHLY`, and `WEEKLY`:- `annually`: the first backup of each year. - `MONTHLY`: The first backup of the month. - `WEEKLY`: The first backup of the week. - `DAILY`: The first backup of the day.
        /// </summary>
        public readonly string? AdvancedRetentionType;
        /// <summary>
        /// Retention time, in days.
        /// </summary>
        public readonly int? Retention;

        [OutputConstructor]
        private PolicyRuleRetentionRule(
            string? advancedRetentionType,

            int? retention)
        {
            AdvancedRetentionType = advancedRetentionType;
            Retention = retention;
        }
    }
}
