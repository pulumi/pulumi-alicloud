// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas
{
    public static class GetMountTargets
    {
        /// <summary>
        /// This data source provides MountTargets available to the user.
        /// 
        /// &gt; **NOTE**: Available in 1.35.0+
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
        ///     var example = AliCloud.Nas.GetMountTargets.Invoke(new()
        ///     {
        ///         FileSystemId = "1a2sc4d",
        ///         AccessGroupName = "tf-testAccNasConfig",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["theFirstMountTargetDomain"] = example.Apply(getMountTargetsResult =&gt; getMountTargetsResult.Targets[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetMountTargetsResult> InvokeAsync(GetMountTargetsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMountTargetsResult>("alicloud:nas/getMountTargets:getMountTargets", args ?? new GetMountTargetsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides MountTargets available to the user.
        /// 
        /// &gt; **NOTE**: Available in 1.35.0+
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
        ///     var example = AliCloud.Nas.GetMountTargets.Invoke(new()
        ///     {
        ///         FileSystemId = "1a2sc4d",
        ///         AccessGroupName = "tf-testAccNasConfig",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["theFirstMountTargetDomain"] = example.Apply(getMountTargetsResult =&gt; getMountTargetsResult.Targets[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMountTargetsResult> Invoke(GetMountTargetsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMountTargetsResult>("alicloud:nas/getMountTargets:getMountTargets", args ?? new GetMountTargetsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides MountTargets available to the user.
        /// 
        /// &gt; **NOTE**: Available in 1.35.0+
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
        ///     var example = AliCloud.Nas.GetMountTargets.Invoke(new()
        ///     {
        ///         FileSystemId = "1a2sc4d",
        ///         AccessGroupName = "tf-testAccNasConfig",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["theFirstMountTargetDomain"] = example.Apply(getMountTargetsResult =&gt; getMountTargetsResult.Targets[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMountTargetsResult> Invoke(GetMountTargetsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMountTargetsResult>("alicloud:nas/getMountTargets:getMountTargets", args ?? new GetMountTargetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMountTargetsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter results by a specific AccessGroupName.
        /// </summary>
        [Input("accessGroupName")]
        public string? AccessGroupName { get; set; }

        /// <summary>
        /// The ID of the FileSystem that owns the MountTarget.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public string FileSystemId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of MountTargetDomain.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Field `mount_target_domain` has been deprecated from provider version 1.53.0. New field `ids` replaces it.
        /// </summary>
        [Input("mountTargetDomain")]
        public string? MountTargetDomain { get; set; }

        /// <summary>
        /// Filter results by a specific NetworkType.
        /// </summary>
        [Input("networkType")]
        public string? NetworkType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Filter results by the status of mount target. Valid values: `Active`, `Inactive` and `Pending`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// Field `type` has been deprecated from provider version 1.95.0. New field `network_type` replaces it.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// Filter results by a specific VpcId.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        /// <summary>
        /// Filter results by a specific VSwitchId.
        /// </summary>
        [Input("vswitchId")]
        public string? VswitchId { get; set; }

        public GetMountTargetsArgs()
        {
        }
        public static new GetMountTargetsArgs Empty => new GetMountTargetsArgs();
    }

    public sealed class GetMountTargetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter results by a specific AccessGroupName.
        /// </summary>
        [Input("accessGroupName")]
        public Input<string>? AccessGroupName { get; set; }

        /// <summary>
        /// The ID of the FileSystem that owns the MountTarget.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public Input<string> FileSystemId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of MountTargetDomain.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Field `mount_target_domain` has been deprecated from provider version 1.53.0. New field `ids` replaces it.
        /// </summary>
        [Input("mountTargetDomain")]
        public Input<string>? MountTargetDomain { get; set; }

        /// <summary>
        /// Filter results by a specific NetworkType.
        /// </summary>
        [Input("networkType")]
        public Input<string>? NetworkType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Filter results by the status of mount target. Valid values: `Active`, `Inactive` and `Pending`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Field `type` has been deprecated from provider version 1.95.0. New field `network_type` replaces it.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Filter results by a specific VpcId.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// Filter results by a specific VSwitchId.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public GetMountTargetsInvokeArgs()
        {
        }
        public static new GetMountTargetsInvokeArgs Empty => new GetMountTargetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetMountTargetsResult
    {
        /// <summary>
        /// AccessGroup of The MountTarget.
        /// </summary>
        public readonly string? AccessGroupName;
        public readonly string FileSystemId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of MountTargetDomain.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// MountTargetDomain of the MountTarget.
        /// </summary>
        public readonly string? MountTargetDomain;
        /// <summary>
        /// (Available 1.95.0+) NetworkType of The MountTarget.
        /// </summary>
        public readonly string? NetworkType;
        public readonly string? OutputFile;
        /// <summary>
        /// (Available 1.95.0+) The status of the mount target.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// A list of MountTargetDomains. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMountTargetsTargetResult> Targets;
        /// <summary>
        /// Field `type` has been deprecated from provider version 1.95.0. New field `network_type` replaces it.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// VpcId of The MountTarget.
        /// </summary>
        public readonly string? VpcId;
        /// <summary>
        /// VSwitchId of The MountTarget.
        /// </summary>
        public readonly string? VswitchId;

        [OutputConstructor]
        private GetMountTargetsResult(
            string? accessGroupName,

            string fileSystemId,

            string id,

            ImmutableArray<string> ids,

            string? mountTargetDomain,

            string? networkType,

            string? outputFile,

            string? status,

            ImmutableArray<Outputs.GetMountTargetsTargetResult> targets,

            string? type,

            string? vpcId,

            string? vswitchId)
        {
            AccessGroupName = accessGroupName;
            FileSystemId = fileSystemId;
            Id = id;
            Ids = ids;
            MountTargetDomain = mountTargetDomain;
            NetworkType = networkType;
            OutputFile = outputFile;
            Status = status;
            Targets = targets;
            Type = type;
            VpcId = vpcId;
            VswitchId = vswitchId;
        }
    }
}
