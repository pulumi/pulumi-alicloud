// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR
{
    public static class GetChartRepositories
    {
        /// <summary>
        /// This data source provides the Cr Chart Repositories of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.149.0+.
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
        ///     var ids = AliCloud.CR.GetChartRepositories.Invoke(new()
        ///     {
        ///         InstanceId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["crChartRepositoryId1"] = @default.Ids[0],
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetChartRepositoriesResult> InvokeAsync(GetChartRepositoriesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetChartRepositoriesResult>("alicloud:cr/getChartRepositories:getChartRepositories", args ?? new GetChartRepositoriesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cr Chart Repositories of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.149.0+.
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
        ///     var ids = AliCloud.CR.GetChartRepositories.Invoke(new()
        ///     {
        ///         InstanceId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["crChartRepositoryId1"] = @default.Ids[0],
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetChartRepositoriesResult> Invoke(GetChartRepositoriesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetChartRepositoriesResult>("alicloud:cr/getChartRepositories:getChartRepositories", args ?? new GetChartRepositoriesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cr Chart Repositories of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.149.0+.
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
        ///     var ids = AliCloud.CR.GetChartRepositories.Invoke(new()
        ///     {
        ///         InstanceId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["crChartRepositoryId1"] = @default.Ids[0],
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetChartRepositoriesResult> Invoke(GetChartRepositoriesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetChartRepositoriesResult>("alicloud:cr/getChartRepositories:getChartRepositories", args ?? new GetChartRepositoriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetChartRepositoriesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of matched Container Registry Enterprise Edition repositories.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// InstanceId.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by repository name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetChartRepositoriesArgs()
        {
        }
        public static new GetChartRepositoriesArgs Empty => new GetChartRepositoriesArgs();
    }

    public sealed class GetChartRepositoriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of matched Container Registry Enterprise Edition repositories.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// InstanceId.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by repository name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetChartRepositoriesInvokeArgs()
        {
        }
        public static new GetChartRepositoriesInvokeArgs Empty => new GetChartRepositoriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetChartRepositoriesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetChartRepositoriesRepositoryResult> Repositories;

        [OutputConstructor]
        private GetChartRepositoriesResult(
            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetChartRepositoriesRepositoryResult> repositories)
        {
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Repositories = repositories;
        }
    }
}
