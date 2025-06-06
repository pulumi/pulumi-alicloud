// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss
{
    /// <summary>
    /// Provides a OSS Bucket Style resource.
    /// 
    /// Image styles that contain single or multiple image processing parameters.
    /// 
    /// For information about OSS Bucket Style and how to use it, see [What is Bucket Style](https://next.api.alibabacloud.com/document/Oss/2019-05-17/PutStyle).
    /// 
    /// &gt; **NOTE:** Available since v1.245.0.
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
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var createBucket = new AliCloud.Oss.Bucket("CreateBucket", new()
    ///     {
    ///         StorageClass = "Standard",
    ///         BucketName = $"{name}-{@default.Result}",
    ///     });
    /// 
    ///     var defaultBucketStyle = new AliCloud.Oss.BucketStyle("default", new()
    ///     {
    ///         Bucket = createBucket.Id,
    ///         StyleName = "style-933",
    ///         Content = "image/resize,p_75,w_75",
    ///         Category = "document",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// OSS Bucket Style can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:oss/bucketStyle:BucketStyle example &lt;bucket&gt;:&lt;style_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:oss/bucketStyle:BucketStyle")]
    public partial class BucketStyle : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Storage space to which the picture style belongs
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// Style category, valid values: image, document, video.
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        /// <summary>
        /// The Image style content can contain single or multiple image processing parameters.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        /// <summary>
        /// Image Style Creation Time
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Image Style Name
        /// </summary>
        [Output("styleName")]
        public Output<string> StyleName { get; private set; } = null!;


        /// <summary>
        /// Create a BucketStyle resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketStyle(string name, BucketStyleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:oss/bucketStyle:BucketStyle", name, args ?? new BucketStyleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BucketStyle(string name, Input<string> id, BucketStyleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:oss/bucketStyle:BucketStyle", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing BucketStyle resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketStyle Get(string name, Input<string> id, BucketStyleState? state = null, CustomResourceOptions? options = null)
        {
            return new BucketStyle(name, id, state, options);
        }
    }

    public sealed class BucketStyleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Storage space to which the picture style belongs
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// Style category, valid values: image, document, video.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The Image style content can contain single or multiple image processing parameters.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// Image Style Name
        /// </summary>
        [Input("styleName", required: true)]
        public Input<string> StyleName { get; set; } = null!;

        public BucketStyleArgs()
        {
        }
        public static new BucketStyleArgs Empty => new BucketStyleArgs();
    }

    public sealed class BucketStyleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Storage space to which the picture style belongs
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// Style category, valid values: image, document, video.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The Image style content can contain single or multiple image processing parameters.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// Image Style Creation Time
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Image Style Name
        /// </summary>
        [Input("styleName")]
        public Input<string>? StyleName { get; set; }

        public BucketStyleState()
        {
        }
        public static new BucketStyleState Empty => new BucketStyleState();
    }
}
