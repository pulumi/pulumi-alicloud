// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas
{
    public static class GetSnapshots
    {
        /// <summary>
        /// This data source provides the Nas Snapshots of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.152.0+.
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
        ///     var ids = AliCloud.Nas.GetSnapshots.Invoke();
        /// 
        ///     var nameRegex = AliCloud.Nas.GetSnapshots.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Snapshot",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nasSnapshotId1"] = ids.Apply(getSnapshotsResult =&gt; getSnapshotsResult.Snapshots[0]?.Id),
        ///         ["nasSnapshotId2"] = nameRegex.Apply(getSnapshotsResult =&gt; getSnapshotsResult.Snapshots[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSnapshotsResult> InvokeAsync(GetSnapshotsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSnapshotsResult>("alicloud:nas/getSnapshots:getSnapshots", args ?? new GetSnapshotsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Nas Snapshots of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.152.0+.
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
        ///     var ids = AliCloud.Nas.GetSnapshots.Invoke();
        /// 
        ///     var nameRegex = AliCloud.Nas.GetSnapshots.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Snapshot",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nasSnapshotId1"] = ids.Apply(getSnapshotsResult =&gt; getSnapshotsResult.Snapshots[0]?.Id),
        ///         ["nasSnapshotId2"] = nameRegex.Apply(getSnapshotsResult =&gt; getSnapshotsResult.Snapshots[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSnapshotsResult> Invoke(GetSnapshotsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnapshotsResult>("alicloud:nas/getSnapshots:getSnapshots", args ?? new GetSnapshotsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Nas Snapshots of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.152.0+.
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
        ///     var ids = AliCloud.Nas.GetSnapshots.Invoke();
        /// 
        ///     var nameRegex = AliCloud.Nas.GetSnapshots.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Snapshot",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nasSnapshotId1"] = ids.Apply(getSnapshotsResult =&gt; getSnapshotsResult.Snapshots[0]?.Id),
        ///         ["nasSnapshotId2"] = nameRegex.Apply(getSnapshotsResult =&gt; getSnapshotsResult.Snapshots[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSnapshotsResult> Invoke(GetSnapshotsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnapshotsResult>("alicloud:nas/getSnapshots:getSnapshots", args ?? new GetSnapshotsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSnapshotsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the file system.
        /// </summary>
        [Input("fileSystemId")]
        public string? FileSystemId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Snapshot IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Snapshot name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        [Input("snapshotName")]
        public string? SnapshotName { get; set; }

        /// <summary>
        /// Status. Valid values: `accomplished`, `failed`, `progressing`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetSnapshotsArgs()
        {
        }
        public static new GetSnapshotsArgs Empty => new GetSnapshotsArgs();
    }

    public sealed class GetSnapshotsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the file system.
        /// </summary>
        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Snapshot IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Snapshot name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        /// <summary>
        /// Status. Valid values: `accomplished`, `failed`, `progressing`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetSnapshotsInvokeArgs()
        {
        }
        public static new GetSnapshotsInvokeArgs Empty => new GetSnapshotsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSnapshotsResult
    {
        public readonly string? FileSystemId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? SnapshotName;
        public readonly ImmutableArray<Outputs.GetSnapshotsSnapshotResult> Snapshots;
        public readonly string? Status;

        [OutputConstructor]
        private GetSnapshotsResult(
            string? fileSystemId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? snapshotName,

            ImmutableArray<Outputs.GetSnapshotsSnapshotResult> snapshots,

            string? status)
        {
            FileSystemId = fileSystemId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            SnapshotName = snapshotName;
            Snapshots = snapshots;
            Status = status;
        }
    }
}
