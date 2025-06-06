// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots.Inputs
{

    public sealed class SearchIndexSchemaArgs : global::Pulumi.ResourceArgs
    {
        [Input("fieldSchemas", required: true)]
        private InputList<Inputs.SearchIndexSchemaFieldSchemaArgs>? _fieldSchemas;

        /// <summary>
        /// A list of field schemas. See `field_schema` below.
        /// </summary>
        public InputList<Inputs.SearchIndexSchemaFieldSchemaArgs> FieldSchemas
        {
            get => _fieldSchemas ?? (_fieldSchemas = new InputList<Inputs.SearchIndexSchemaFieldSchemaArgs>());
            set => _fieldSchemas = value;
        }

        [Input("indexSettings")]
        private InputList<Inputs.SearchIndexSchemaIndexSettingArgs>? _indexSettings;

        /// <summary>
        /// The settings of the search index, including routingFields. See `index_setting` below.
        /// </summary>
        public InputList<Inputs.SearchIndexSchemaIndexSettingArgs> IndexSettings
        {
            get => _indexSettings ?? (_indexSettings = new InputList<Inputs.SearchIndexSchemaIndexSettingArgs>());
            set => _indexSettings = value;
        }

        [Input("indexSorts")]
        private InputList<Inputs.SearchIndexSchemaIndexSortArgs>? _indexSorts;

        /// <summary>
        /// The presorting settings of the search index, including sorters. If no value is specified for the indexSort parameter, field values are sorted by primary key by default. See `index_sort` below.
        /// </summary>
        public InputList<Inputs.SearchIndexSchemaIndexSortArgs> IndexSorts
        {
            get => _indexSorts ?? (_indexSorts = new InputList<Inputs.SearchIndexSchemaIndexSortArgs>());
            set => _indexSorts = value;
        }

        public SearchIndexSchemaArgs()
        {
        }
        public static new SearchIndexSchemaArgs Empty => new SearchIndexSchemaArgs();
    }
}
