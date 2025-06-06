// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FNF
{
    public static class GetFlows
    {
        /// <summary>
        /// This data source provides the Fnf Flows of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.105.0+.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.FNF.GetFlows.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstFnfFlowId"] = example.Apply(getFlowsResult =&gt; getFlowsResult.Flows[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetFlowsResult> InvokeAsync(GetFlowsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlowsResult>("alicloud:fnf/getFlows:getFlows", args ?? new GetFlowsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Fnf Flows of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.105.0+.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.FNF.GetFlows.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstFnfFlowId"] = example.Apply(getFlowsResult =&gt; getFlowsResult.Flows[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlowsResult> Invoke(GetFlowsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlowsResult>("alicloud:fnf/getFlows:getFlows", args ?? new GetFlowsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Fnf Flows of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.105.0+.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.FNF.GetFlows.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstFnfFlowId"] = example.Apply(getFlowsResult =&gt; getFlowsResult.Flows[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlowsResult> Invoke(GetFlowsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlowsResult>("alicloud:fnf/getFlows:getFlows", args ?? new GetFlowsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlowsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Flow IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The number of resource queries.
        /// </summary>
        [Input("limit")]
        public int? Limit { get; set; }

        /// <summary>
        /// A regex string to filter results by Flow name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetFlowsArgs()
        {
        }
        public static new GetFlowsArgs Empty => new GetFlowsArgs();
    }

    public sealed class GetFlowsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Flow IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The number of resource queries.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// A regex string to filter results by Flow name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetFlowsInvokeArgs()
        {
        }
        public static new GetFlowsInvokeArgs Empty => new GetFlowsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlowsResult
    {
        public readonly ImmutableArray<Outputs.GetFlowsFlowResult> Flows;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly int? Limit;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetFlowsResult(
            ImmutableArray<Outputs.GetFlowsFlowResult> flows,

            string id,

            ImmutableArray<string> ids,

            int? limit,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Flows = flows;
            Id = id;
            Ids = ids;
            Limit = limit;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
