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
    public sealed class SearchIndexSchemaFieldSchema
    {
        public readonly string? Analyzer;
        public readonly bool? EnableSortAndAgg;
        public readonly string FieldName;
        public readonly string FieldType;
        public readonly bool? Index;
        public readonly bool? IsArray;
        public readonly bool? Store;

        [OutputConstructor]
        private SearchIndexSchemaFieldSchema(
            string? analyzer,

            bool? enableSortAndAgg,

            string fieldName,

            string fieldType,

            bool? index,

            bool? isArray,

            bool? store)
        {
            Analyzer = analyzer;
            EnableSortAndAgg = enableSortAndAgg;
            FieldName = fieldName;
            FieldType = fieldType;
            Index = index;
            IsArray = isArray;
            Store = store;
        }
    }
}