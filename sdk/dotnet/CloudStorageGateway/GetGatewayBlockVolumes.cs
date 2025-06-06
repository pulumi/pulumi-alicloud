// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudStorageGateway
{
    public static class GetGatewayBlockVolumes
    {
        /// <summary>
        /// This data source provides the Cloud Storage Gateway Gateway Block Volumes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.144.0+.
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
        ///     var ids = AliCloud.CloudStorageGateway.GetGatewayBlockVolumes.Invoke(new()
        ///     {
        ///         GatewayId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.CloudStorageGateway.GetGatewayBlockVolumes.Invoke(new()
        ///     {
        ///         GatewayId = "example_value",
        ///         NameRegex = "^my-GatewayBlockVolume",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudStorageGatewayGatewayBlockVolumeId1"] = ids.Apply(getGatewayBlockVolumesResult =&gt; getGatewayBlockVolumesResult.Volumes[0]?.Id),
        ///         ["cloudStorageGatewayGatewayBlockVolumeId2"] = nameRegex.Apply(getGatewayBlockVolumesResult =&gt; getGatewayBlockVolumesResult.Volumes[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetGatewayBlockVolumesResult> InvokeAsync(GetGatewayBlockVolumesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGatewayBlockVolumesResult>("alicloud:cloudstoragegateway/getGatewayBlockVolumes:getGatewayBlockVolumes", args ?? new GetGatewayBlockVolumesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Storage Gateway Gateway Block Volumes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.144.0+.
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
        ///     var ids = AliCloud.CloudStorageGateway.GetGatewayBlockVolumes.Invoke(new()
        ///     {
        ///         GatewayId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.CloudStorageGateway.GetGatewayBlockVolumes.Invoke(new()
        ///     {
        ///         GatewayId = "example_value",
        ///         NameRegex = "^my-GatewayBlockVolume",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudStorageGatewayGatewayBlockVolumeId1"] = ids.Apply(getGatewayBlockVolumesResult =&gt; getGatewayBlockVolumesResult.Volumes[0]?.Id),
        ///         ["cloudStorageGatewayGatewayBlockVolumeId2"] = nameRegex.Apply(getGatewayBlockVolumesResult =&gt; getGatewayBlockVolumesResult.Volumes[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetGatewayBlockVolumesResult> Invoke(GetGatewayBlockVolumesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGatewayBlockVolumesResult>("alicloud:cloudstoragegateway/getGatewayBlockVolumes:getGatewayBlockVolumes", args ?? new GetGatewayBlockVolumesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Storage Gateway Gateway Block Volumes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.144.0+.
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
        ///     var ids = AliCloud.CloudStorageGateway.GetGatewayBlockVolumes.Invoke(new()
        ///     {
        ///         GatewayId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.CloudStorageGateway.GetGatewayBlockVolumes.Invoke(new()
        ///     {
        ///         GatewayId = "example_value",
        ///         NameRegex = "^my-GatewayBlockVolume",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudStorageGatewayGatewayBlockVolumeId1"] = ids.Apply(getGatewayBlockVolumesResult =&gt; getGatewayBlockVolumesResult.Volumes[0]?.Id),
        ///         ["cloudStorageGatewayGatewayBlockVolumeId2"] = nameRegex.Apply(getGatewayBlockVolumesResult =&gt; getGatewayBlockVolumesResult.Volumes[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetGatewayBlockVolumesResult> Invoke(GetGatewayBlockVolumesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGatewayBlockVolumesResult>("alicloud:cloudstoragegateway/getGatewayBlockVolumes:getGatewayBlockVolumes", args ?? new GetGatewayBlockVolumesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGatewayBlockVolumesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Gateway ID.
        /// </summary>
        [Input("gatewayId", required: true)]
        public string GatewayId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Gateway Block Volume IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Gateway Block Volume name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of volume. Valid values:
        /// </summary>
        [Input("status")]
        public int? Status { get; set; }

        public GetGatewayBlockVolumesArgs()
        {
        }
        public static new GetGatewayBlockVolumesArgs Empty => new GetGatewayBlockVolumesArgs();
    }

    public sealed class GetGatewayBlockVolumesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Gateway ID.
        /// </summary>
        [Input("gatewayId", required: true)]
        public Input<string> GatewayId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Gateway Block Volume IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Gateway Block Volume name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of volume. Valid values:
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        public GetGatewayBlockVolumesInvokeArgs()
        {
        }
        public static new GetGatewayBlockVolumesInvokeArgs Empty => new GetGatewayBlockVolumesInvokeArgs();
    }


    [OutputType]
    public sealed class GetGatewayBlockVolumesResult
    {
        public readonly string GatewayId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? Status;
        public readonly ImmutableArray<Outputs.GetGatewayBlockVolumesVolumeResult> Volumes;

        [OutputConstructor]
        private GetGatewayBlockVolumesResult(
            string gatewayId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? status,

            ImmutableArray<Outputs.GetGatewayBlockVolumesVolumeResult> volumes)
        {
            GatewayId = gatewayId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
            Volumes = volumes;
        }
    }
}
