// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Outputs
{

    [OutputType]
    public sealed class ScalingConfigurationInstancePatternInfo
    {
        /// <summary>
        /// Architecture N of instance type N. Valid values: X86, Heterogeneous, BareMetal, Arm, SuperComputeCluster.
        /// </summary>
        public readonly ImmutableArray<string> Architectures;
        /// <summary>
        /// Specifies whether to include burstable instance types.  Valid values: Exclude, Include, Required.
        /// </summary>
        public readonly string? BurstablePerformance;
        /// <summary>
        /// The number of vCPUs that are specified for an instance type in instancePatternInfo.
        /// </summary>
        public readonly int? Cores;
        /// <summary>
        /// Instance type N that you want to exclude. You can use wildcard characters, such as an asterisk (*), to exclude an instance type or an instance family.
        /// </summary>
        public readonly ImmutableArray<string> ExcludedInstanceTypes;
        /// <summary>
        /// The instance family level in instancePatternInfo.
        /// </summary>
        public readonly string? InstanceFamilyLevel;
        /// <summary>
        /// The maximum hourly price for a pay-as-you-go instance or a preemptible instance in instancePatternInfo.
        /// </summary>
        public readonly double? MaxPrice;
        /// <summary>
        /// The memory size that is specified for an instance type in instancePatternInfo.
        /// </summary>
        public readonly double? Memory;

        [OutputConstructor]
        private ScalingConfigurationInstancePatternInfo(
            ImmutableArray<string> architectures,

            string? burstablePerformance,

            int? cores,

            ImmutableArray<string> excludedInstanceTypes,

            string? instanceFamilyLevel,

            double? maxPrice,

            double? memory)
        {
            Architectures = architectures;
            BurstablePerformance = burstablePerformance;
            Cores = cores;
            ExcludedInstanceTypes = excludedInstanceTypes;
            InstanceFamilyLevel = instanceFamilyLevel;
            MaxPrice = maxPrice;
            Memory = memory;
        }
    }
}