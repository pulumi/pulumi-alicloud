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
    public sealed class GetTablesTableResult
    {
        public readonly ImmutableArray<Outputs.GetTablesTableDefinedColumnResult> DefinedColumns;
        /// <summary>
        /// ID of the table. The value is `&lt;instance_name&gt;:&lt;table_name&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of OTS instance.
        /// </summary>
        public readonly string InstanceName;
        /// <summary>
        /// The maximum number of versions stored in this table.
        /// </summary>
        public readonly int MaxVersion;
        /// <summary>
        /// The property of `TableMeta` which indicates the structure information of a table.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTablesTablePrimaryKeyResult> PrimaryKeys;
        /// <summary>
        /// The table name of the OTS which could not be changed.
        /// </summary>
        public readonly string TableName;
        /// <summary>
        /// The retention time of data stored in this table.
        /// </summary>
        public readonly int TimeToLive;

        [OutputConstructor]
        private GetTablesTableResult(
            ImmutableArray<Outputs.GetTablesTableDefinedColumnResult> definedColumns,

            string id,

            string instanceName,

            int maxVersion,

            ImmutableArray<Outputs.GetTablesTablePrimaryKeyResult> primaryKeys,

            string tableName,

            int timeToLive)
        {
            DefinedColumns = definedColumns;
            Id = id;
            InstanceName = instanceName;
            MaxVersion = maxVersion;
            PrimaryKeys = primaryKeys;
            TableName = tableName;
            TimeToLive = timeToLive;
        }
    }
}
