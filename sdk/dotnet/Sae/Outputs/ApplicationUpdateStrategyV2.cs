// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Outputs
{

    [OutputType]
    public sealed class ApplicationUpdateStrategyV2
    {
        /// <summary>
        /// The phased release policy. See `batch_update` below.
        /// </summary>
        public readonly Outputs.ApplicationUpdateStrategyV2BatchUpdate? BatchUpdate;
        /// <summary>
        /// The type of the release policy. Valid values: `GrayBatchUpdate` and `BatchUpdate`.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ApplicationUpdateStrategyV2(
            Outputs.ApplicationUpdateStrategyV2BatchUpdate? batchUpdate,

            string? type)
        {
            BatchUpdate = batchUpdate;
            Type = type;
        }
    }
}