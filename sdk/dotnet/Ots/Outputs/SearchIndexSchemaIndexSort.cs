// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots.Outputs
{

    [OutputType]
    public sealed class SearchIndexSchemaIndexSort
    {
        public readonly ImmutableArray<Outputs.SearchIndexSchemaIndexSortSorter> Sorters;

        [OutputConstructor]
        private SearchIndexSchemaIndexSort(ImmutableArray<Outputs.SearchIndexSchemaIndexSortSorter> sorters)
        {
            Sorters = sorters;
        }
    }
}