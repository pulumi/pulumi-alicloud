// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci
{
    public static class GetImageCaches
    {
        /// <summary>
        /// Provides a collection of ECI Image Cache to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.90.0+.
        /// 
        /// ## Example Usage
        /// 
        ///  ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.Eci.GetImageCaches.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "imc-bp1ef0dyp7ldhb1d****",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["imageCache"] = example.Apply(getImageCachesResult =&gt; getImageCachesResult.Caches[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetImageCachesResult> InvokeAsync(GetImageCachesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetImageCachesResult>("alicloud:eci/getImageCaches:getImageCaches", args ?? new GetImageCachesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a collection of ECI Image Cache to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.90.0+.
        /// 
        /// ## Example Usage
        /// 
        ///  ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.Eci.GetImageCaches.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "imc-bp1ef0dyp7ldhb1d****",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["imageCache"] = example.Apply(getImageCachesResult =&gt; getImageCachesResult.Caches[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetImageCachesResult> Invoke(GetImageCachesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetImageCachesResult>("alicloud:eci/getImageCaches:getImageCaches", args ?? new GetImageCachesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a collection of ECI Image Cache to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.90.0+.
        /// 
        /// ## Example Usage
        /// 
        ///  ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.Eci.GetImageCaches.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "imc-bp1ef0dyp7ldhb1d****",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["imageCache"] = example.Apply(getImageCachesResult =&gt; getImageCachesResult.Caches[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetImageCachesResult> Invoke(GetImageCachesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetImageCachesResult>("alicloud:eci/getImageCaches:getImageCaches", args ?? new GetImageCachesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetImageCachesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list ids of ECI Image Cache.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Find the mirror cache containing it according to the image name.
        /// </summary>
        [Input("image")]
        public string? Image { get; set; }

        /// <summary>
        /// The name of ECI Image Cache.
        /// </summary>
        [Input("imageCacheName")]
        public string? ImageCacheName { get; set; }

        /// <summary>
        /// A regex string to filter results by the image cache name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The id of snapshot.
        /// </summary>
        [Input("snapshotId")]
        public string? SnapshotId { get; set; }

        /// <summary>
        /// The status of ECI Image Cache.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetImageCachesArgs()
        {
        }
        public static new GetImageCachesArgs Empty => new GetImageCachesArgs();
    }

    public sealed class GetImageCachesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list ids of ECI Image Cache.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Find the mirror cache containing it according to the image name.
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// The name of ECI Image Cache.
        /// </summary>
        [Input("imageCacheName")]
        public Input<string>? ImageCacheName { get; set; }

        /// <summary>
        /// A regex string to filter results by the image cache name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The id of snapshot.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The status of ECI Image Cache.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetImageCachesInvokeArgs()
        {
        }
        public static new GetImageCachesInvokeArgs Empty => new GetImageCachesInvokeArgs();
    }


    [OutputType]
    public sealed class GetImageCachesResult
    {
        /// <summary>
        /// A list of caches. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImageCachesCachResult> Caches;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list ids of ECI Image Cache.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? Image;
        /// <summary>
        /// The name of the ECI Image Cache.
        /// </summary>
        public readonly string? ImageCacheName;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of ECI Image Cache names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The id of snapshot.
        /// </summary>
        public readonly string? SnapshotId;
        /// <summary>
        /// The status of ECI Image Cache.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetImageCachesResult(
            ImmutableArray<Outputs.GetImageCachesCachResult> caches,

            string id,

            ImmutableArray<string> ids,

            string? image,

            string? imageCacheName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? snapshotId,

            string? status)
        {
            Caches = caches;
            Id = id;
            Ids = ids;
            Image = image;
            ImageCacheName = imageCacheName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            SnapshotId = snapshotId;
            Status = status;
        }
    }
}
