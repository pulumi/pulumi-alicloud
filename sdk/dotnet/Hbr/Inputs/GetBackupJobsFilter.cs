// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr.Inputs
{

    public sealed class GetBackupJobsFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The key of the field to filter. Valid values: `PlanId`, `VaultId`, `InstanceId`, `Bucket`, `FileSystemId`, `CompleteTime`.
        /// </summary>
        [Input("key")]
        public string? Key { get; set; }

        /// <summary>
        /// The operator of the field to filter. Valid values: `EQUAL`, `NOT_EQUAL`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`, `IN`.
        /// </summary>
        [Input("operator")]
        public string? Operator { get; set; }

        [Input("values")]
        private List<string>? _values;

        /// <summary>
        /// Set of values that are accepted for the given field.
        /// 
        /// &gt; **NOTE:** Numeric types such as `CompleteTime` do not support `IN` operations for the time being.
        /// </summary>
        public List<string> Values
        {
            get => _values ?? (_values = new List<string>());
            set => _values = value;
        }

        public GetBackupJobsFilterArgs()
        {
        }
        public static new GetBackupJobsFilterArgs Empty => new GetBackupJobsFilterArgs();
    }
}
