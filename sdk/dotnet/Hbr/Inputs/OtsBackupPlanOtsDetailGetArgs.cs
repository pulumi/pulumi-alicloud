// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr.Inputs
{

    public sealed class OtsBackupPlanOtsDetailGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("tableNames")]
        private InputList<string>? _tableNames;

        /// <summary>
        /// The names of the destination tables in the Tablestore instance. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<string> TableNames
        {
            get => _tableNames ?? (_tableNames = new InputList<string>());
            set => _tableNames = value;
        }

        public OtsBackupPlanOtsDetailGetArgs()
        {
        }
        public static new OtsBackupPlanOtsDetailGetArgs Empty => new OtsBackupPlanOtsDetailGetArgs();
    }
}
