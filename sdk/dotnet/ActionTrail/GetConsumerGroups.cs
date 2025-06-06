// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ActionTrail
{
    public static class GetConsumerGroups
    {
        /// <summary>
        /// This data source provides a list of ALIKAFKA Consumer Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.56.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var consumerGroupsDs = AliCloud.ActionTrail.GetConsumerGroups.Invoke(new()
        ///     {
        ///         InstanceId = "xxx",
        ///         ConsumerIdRegex = "CID-alikafkaGroupDatasourceName",
        ///         OutputFile = "consumerGroups.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstGroupName"] = consumerGroupsDs.Apply(getConsumerGroupsResult =&gt; getConsumerGroupsResult.ConsumerIds[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetConsumerGroupsResult> InvokeAsync(GetConsumerGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConsumerGroupsResult>("alicloud:actiontrail/getConsumerGroups:getConsumerGroups", args ?? new GetConsumerGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of ALIKAFKA Consumer Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.56.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var consumerGroupsDs = AliCloud.ActionTrail.GetConsumerGroups.Invoke(new()
        ///     {
        ///         InstanceId = "xxx",
        ///         ConsumerIdRegex = "CID-alikafkaGroupDatasourceName",
        ///         OutputFile = "consumerGroups.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstGroupName"] = consumerGroupsDs.Apply(getConsumerGroupsResult =&gt; getConsumerGroupsResult.ConsumerIds[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetConsumerGroupsResult> Invoke(GetConsumerGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConsumerGroupsResult>("alicloud:actiontrail/getConsumerGroups:getConsumerGroups", args ?? new GetConsumerGroupsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of ALIKAFKA Consumer Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.56.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var consumerGroupsDs = AliCloud.ActionTrail.GetConsumerGroups.Invoke(new()
        ///     {
        ///         InstanceId = "xxx",
        ///         ConsumerIdRegex = "CID-alikafkaGroupDatasourceName",
        ///         OutputFile = "consumerGroups.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstGroupName"] = consumerGroupsDs.Apply(getConsumerGroupsResult =&gt; getConsumerGroupsResult.ConsumerIds[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetConsumerGroupsResult> Invoke(GetConsumerGroupsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetConsumerGroupsResult>("alicloud:actiontrail/getConsumerGroups:getConsumerGroups", args ?? new GetConsumerGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConsumerGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter results by the consumer group id.
        /// </summary>
        [Input("consumerIdRegex")]
        public string? ConsumerIdRegex { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of ALIKAFKA Consumer Groups IDs, It is formatted to `&lt;instance_id&gt;:&lt;consumer_id&gt;`.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the ALIKAFKA Instance that owns the consumer groups.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetConsumerGroupsArgs()
        {
        }
        public static new GetConsumerGroupsArgs Empty => new GetConsumerGroupsArgs();
    }

    public sealed class GetConsumerGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter results by the consumer group id.
        /// </summary>
        [Input("consumerIdRegex")]
        public Input<string>? ConsumerIdRegex { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of ALIKAFKA Consumer Groups IDs, It is formatted to `&lt;instance_id&gt;:&lt;consumer_id&gt;`.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the ALIKAFKA Instance that owns the consumer groups.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetConsumerGroupsInvokeArgs()
        {
        }
        public static new GetConsumerGroupsInvokeArgs Empty => new GetConsumerGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetConsumerGroupsResult
    {
        public readonly string? ConsumerIdRegex;
        public readonly ImmutableArray<string> ConsumerIds;
        /// <summary>
        /// A list of consumer group. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConsumerGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The instance_id of the instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// A list of consumer group names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetConsumerGroupsResult(
            string? consumerIdRegex,

            ImmutableArray<string> consumerIds,

            ImmutableArray<Outputs.GetConsumerGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            ImmutableArray<string> names,

            string? outputFile)
        {
            ConsumerIdRegex = consumerIdRegex;
            ConsumerIds = consumerIds;
            Groups = groups;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
