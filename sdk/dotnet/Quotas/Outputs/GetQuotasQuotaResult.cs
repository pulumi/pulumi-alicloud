// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Quotas.Outputs
{

    [OutputType]
    public sealed class GetQuotasQuotaResult
    {
        /// <summary>
        /// Is the quota adjustable.
        /// </summary>
        public readonly bool Adjustable;
        /// <summary>
        /// The range of quota adjustment.
        /// </summary>
        public readonly ImmutableArray<string> ApplicableRanges;
        /// <summary>
        /// The type of quota.
        /// </summary>
        public readonly string ApplicableType;
        /// <summary>
        /// Show used quota.
        /// </summary>
        public readonly bool Consumable;
        /// <summary>
        /// The ID of the Quota.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The quota action code.
        /// </summary>
        public readonly string QuotaActionCode;
        /// <summary>
        /// The quota description.
        /// </summary>
        public readonly string QuotaDescription;
        /// <summary>
        /// The quota name.
        /// </summary>
        public readonly string QuotaName;
        /// <summary>
        /// The quota type.
        /// </summary>
        public readonly string QuotaType;
        /// <summary>
        /// The quota unit.
        /// </summary>
        public readonly string QuotaUnit;
        /// <summary>
        /// TotalQuota.
        /// </summary>
        public readonly double TotalQuota;
        /// <summary>
        /// The total of usage.
        /// </summary>
        public readonly double TotalUsage;
        /// <summary>
        /// The unadjustable detail.
        /// </summary>
        public readonly string UnadjustableDetail;

        [OutputConstructor]
        private GetQuotasQuotaResult(
            bool adjustable,

            ImmutableArray<string> applicableRanges,

            string applicableType,

            bool consumable,

            string id,

            string quotaActionCode,

            string quotaDescription,

            string quotaName,

            string quotaType,

            string quotaUnit,

            double totalQuota,

            double totalUsage,

            string unadjustableDetail)
        {
            Adjustable = adjustable;
            ApplicableRanges = applicableRanges;
            ApplicableType = applicableType;
            Consumable = consumable;
            Id = id;
            QuotaActionCode = quotaActionCode;
            QuotaDescription = quotaDescription;
            QuotaName = quotaName;
            QuotaType = quotaType;
            QuotaUnit = quotaUnit;
            TotalQuota = totalQuota;
            TotalUsage = totalUsage;
            UnadjustableDetail = unadjustableDetail;
        }
    }
}
