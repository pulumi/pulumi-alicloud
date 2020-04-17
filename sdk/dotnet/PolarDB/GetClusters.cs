// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB
{
    public static class GetClusters
    {
        /// <summary>
        /// The `alicloud.polardb.getClusters` data source provides a collection of PolarDB clusters available in Alibaba Cloud account.
        /// Filters support regular expression for the cluster description, searches by tags, and other filters which are listed below.
        /// 
        /// &gt; **NOTE:** Available in v1.66.0+.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClustersResult> InvokeAsync(GetClustersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetClustersResult>("alicloud:polardb/getClusters:getClusters", args ?? new GetClustersArgs(), options.WithVersion());
    }


    public sealed class GetClustersArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Database type. Options are `MySQL`, `Oracle` and `PostgreSQL`. If no value is specified, all types are returned.
        /// </summary>
        [Input("dbType")]
        public string? DbType { get; set; }

        /// <summary>
        /// A regex string to filter results by cluster description.
        /// </summary>
        [Input("descriptionRegex")]
        public string? DescriptionRegex { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of PolarDB cluster IDs. 
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// status of the cluster.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetClustersArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetClustersResult
    {
        /// <summary>
        /// A list of PolarDB clusters. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterResult> Clusters;
        /// <summary>
        /// `Primary` for primary cluster, `ReadOnly` for read-only cluster, `Guard` for disaster recovery cluster, and `Temp` for temporary cluster.
        /// </summary>
        public readonly string? DbType;
        public readonly string? DescriptionRegex;
        /// <summary>
        /// A list of RDS cluster descriptions. 
        /// </summary>
        public readonly ImmutableArray<string> Descriptions;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of RDS cluster IDs. 
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// Status of the cluster.
        /// </summary>
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetClustersResult(
            ImmutableArray<Outputs.GetClustersClusterResult> clusters,

            string? dbType,

            string? descriptionRegex,

            ImmutableArray<string> descriptions,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? status,

            ImmutableDictionary<string, object>? tags)
        {
            Clusters = clusters;
            DbType = dbType;
            DescriptionRegex = descriptionRegex;
            Descriptions = descriptions;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Status = status;
            Tags = tags;
        }
    }
}