// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dfs
{
    public static class GetMountPoints
    {
        /// <summary>
        /// This data source provides the Dfs Mount Points of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
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
        ///     var ids = AliCloud.Dfs.GetMountPoints.Invoke(new()
        ///     {
        ///         FileSystemId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dfsMountPointId1"] = ids.Apply(getMountPointsResult =&gt; getMountPointsResult.Points[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetMountPointsResult> InvokeAsync(GetMountPointsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMountPointsResult>("alicloud:dfs/getMountPoints:getMountPoints", args ?? new GetMountPointsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Dfs Mount Points of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
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
        ///     var ids = AliCloud.Dfs.GetMountPoints.Invoke(new()
        ///     {
        ///         FileSystemId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dfsMountPointId1"] = ids.Apply(getMountPointsResult =&gt; getMountPointsResult.Points[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMountPointsResult> Invoke(GetMountPointsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMountPointsResult>("alicloud:dfs/getMountPoints:getMountPoints", args ?? new GetMountPointsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Dfs Mount Points of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
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
        ///     var ids = AliCloud.Dfs.GetMountPoints.Invoke(new()
        ///     {
        ///         FileSystemId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dfsMountPointId1"] = ids.Apply(getMountPointsResult =&gt; getMountPointsResult.Points[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMountPointsResult> Invoke(GetMountPointsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMountPointsResult>("alicloud:dfs/getMountPoints:getMountPoints", args ?? new GetMountPointsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMountPointsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the File System.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public string FileSystemId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Mount Point IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the Mount Point. Valid values: `Active`, `Inactive`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetMountPointsArgs()
        {
        }
        public static new GetMountPointsArgs Empty => new GetMountPointsArgs();
    }

    public sealed class GetMountPointsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the File System.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public Input<string> FileSystemId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Mount Point IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the Mount Point. Valid values: `Active`, `Inactive`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetMountPointsInvokeArgs()
        {
        }
        public static new GetMountPointsInvokeArgs Empty => new GetMountPointsInvokeArgs();
    }


    [OutputType]
    public sealed class GetMountPointsResult
    {
        public readonly string FileSystemId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetMountPointsPointResult> Points;
        public readonly string? Status;

        [OutputConstructor]
        private GetMountPointsResult(
            string fileSystemId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetMountPointsPointResult> points,

            string? status)
        {
            FileSystemId = fileSystemId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Points = points;
            Status = status;
        }
    }
}
