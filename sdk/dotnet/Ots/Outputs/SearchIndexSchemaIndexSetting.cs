// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots.Outputs
{

    [OutputType]
    public sealed class SearchIndexSchemaIndexSetting
    {
        /// <summary>
        /// Specifies custom routing fields. You can specify some primary key columns as routing fields. Tablestore distributes data that is written to a search index across different partitions based on the specified routing fields. The data whose routing field values are the same is distributed to the same partition.
        /// </summary>
        public readonly ImmutableArray<string> RoutingFields;

        [OutputConstructor]
        private SearchIndexSchemaIndexSetting(ImmutableArray<string> routingFields)
        {
            RoutingFields = routingFields;
        }
    }
}
