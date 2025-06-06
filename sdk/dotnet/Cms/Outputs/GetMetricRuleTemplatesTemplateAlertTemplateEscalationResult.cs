// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class GetMetricRuleTemplatesTemplateAlertTemplateEscalationResult
    {
        /// <summary>
        /// The condition for triggering critical-level alerts.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateAlertTemplateEscalationCriticalResult> Criticals;
        /// <summary>
        /// The condition for triggering info-level alerts.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateAlertTemplateEscalationInfoResult> Infos;
        /// <summary>
        /// The condition for triggering warn-level alerts.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateAlertTemplateEscalationWarnResult> Warns;

        [OutputConstructor]
        private GetMetricRuleTemplatesTemplateAlertTemplateEscalationResult(
            ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateAlertTemplateEscalationCriticalResult> criticals,

            ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateAlertTemplateEscalationInfoResult> infos,

            ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateAlertTemplateEscalationWarnResult> warns)
        {
            Criticals = criticals;
            Infos = infos;
            Warns = warns;
        }
    }
}
