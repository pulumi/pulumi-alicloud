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
    public sealed class SearchIndexSchemaIndexSortSorter
    {
        public readonly string? FieldName;
        public readonly string? Mode;
        public readonly string? Order;
        public readonly string? SorterType;

        [OutputConstructor]
        private SearchIndexSchemaIndexSortSorter(
            string? fieldName,

            string? mode,

            string? order,

            string? sorterType)
        {
            FieldName = fieldName;
            Mode = mode;
            Order = order;
            SorterType = sorterType;
        }
    }
}