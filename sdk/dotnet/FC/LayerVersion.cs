// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC
{
    /// <summary>
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
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Max = 99999,
    ///         Min = 10000,
    ///     });
    /// 
    ///     var defaultBucket = new AliCloud.Oss.Bucket("default", new()
    ///     {
    ///         BucketName = $"terraform-example-{@default.Result}",
    ///     });
    /// 
    ///     // If you upload the function by OSS Bucket, you need to specify path can't upload by content.
    ///     var defaultBucketObject = new AliCloud.Oss.BucketObject("default", new()
    ///     {
    ///         Bucket = defaultBucket.Id,
    ///         Key = "index.py",
    ///         Content = @"import logging 
    /// def handler(event, context): 
    /// logger = logging.getLogger() 
    /// logger.info('hello world') 
    /// return 'hello world'",
    ///     });
    /// 
    ///     var example = new AliCloud.FC.LayerVersion("example", new()
    ///     {
    ///         LayerName = $"terraform-example-{@default.Result}",
    ///         CompatibleRuntimes = new[]
    ///         {
    ///             "python2.7",
    ///         },
    ///         OssBucketName = defaultBucket.BucketName,
    ///         OssObjectName = defaultBucketObject.Key,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Function Compute Layer Version can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:fc/layerVersion:LayerVersion example my_function
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:fc/layerVersion:LayerVersion")]
    public partial class LayerVersion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The access mode of Layer Version.
        /// </summary>
        [Output("acl")]
        public Output<string> Acl { get; private set; } = null!;

        /// <summary>
        /// The arn of Layer Version.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The checksum of the layer code package.
        /// </summary>
        [Output("codeCheckSum")]
        public Output<string> CodeCheckSum { get; private set; } = null!;

        /// <summary>
        /// The list of runtime environments that are supported by the layer. Valid values: `nodejs14`, `nodejs12`, `nodejs10`, `nodejs8`, `nodejs6`, `python3.9`, `python3`, `python2.7`, `java11`, `java8`, `php7.2`, `go1`,`dotnetcore2.1`, `custom`.
        /// </summary>
        [Output("compatibleRuntimes")]
        public Output<ImmutableArray<string>> CompatibleRuntimes { get; private set; } = null!;

        /// <summary>
        /// The description of the layer version.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the layer.
        /// </summary>
        [Output("layerName")]
        public Output<string> LayerName { get; private set; } = null!;

        /// <summary>
        /// The name of the OSS bucket that stores the ZIP package of the function code.
        /// </summary>
        [Output("ossBucketName")]
        public Output<string?> OssBucketName { get; private set; } = null!;

        /// <summary>
        /// The name of the OSS object (ZIP package) that contains the function code.
        /// </summary>
        [Output("ossObjectName")]
        public Output<string?> OssObjectName { get; private set; } = null!;

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_runtimes`, `description`, `layer_name`, `oss_bucket_name`,  `oss_object_name`, or `zip_file` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Output("skipDestroy")]
        public Output<bool?> SkipDestroy { get; private set; } = null!;

        /// <summary>
        /// The version of Layer Version.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;

        /// <summary>
        /// The ZIP package of the function code that is encoded in the Base64 format.
        /// 
        /// &gt; **NOTE:** `zip_file` and `oss_bucket_name`, `oss_object_name` cannot be used together.
        /// </summary>
        [Output("zipFile")]
        public Output<string?> ZipFile { get; private set; } = null!;


        /// <summary>
        /// Create a LayerVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LayerVersion(string name, LayerVersionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:fc/layerVersion:LayerVersion", name, args ?? new LayerVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LayerVersion(string name, Input<string> id, LayerVersionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:fc/layerVersion:LayerVersion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LayerVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LayerVersion Get(string name, Input<string> id, LayerVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new LayerVersion(name, id, state, options);
        }
    }

    public sealed class LayerVersionArgs : global::Pulumi.ResourceArgs
    {
        [Input("compatibleRuntimes", required: true)]
        private InputList<string>? _compatibleRuntimes;

        /// <summary>
        /// The list of runtime environments that are supported by the layer. Valid values: `nodejs14`, `nodejs12`, `nodejs10`, `nodejs8`, `nodejs6`, `python3.9`, `python3`, `python2.7`, `java11`, `java8`, `php7.2`, `go1`,`dotnetcore2.1`, `custom`.
        /// </summary>
        public InputList<string> CompatibleRuntimes
        {
            get => _compatibleRuntimes ?? (_compatibleRuntimes = new InputList<string>());
            set => _compatibleRuntimes = value;
        }

        /// <summary>
        /// The description of the layer version.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the layer.
        /// </summary>
        [Input("layerName", required: true)]
        public Input<string> LayerName { get; set; } = null!;

        /// <summary>
        /// The name of the OSS bucket that stores the ZIP package of the function code.
        /// </summary>
        [Input("ossBucketName")]
        public Input<string>? OssBucketName { get; set; }

        /// <summary>
        /// The name of the OSS object (ZIP package) that contains the function code.
        /// </summary>
        [Input("ossObjectName")]
        public Input<string>? OssObjectName { get; set; }

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_runtimes`, `description`, `layer_name`, `oss_bucket_name`,  `oss_object_name`, or `zip_file` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Input("skipDestroy")]
        public Input<bool>? SkipDestroy { get; set; }

        /// <summary>
        /// The ZIP package of the function code that is encoded in the Base64 format.
        /// 
        /// &gt; **NOTE:** `zip_file` and `oss_bucket_name`, `oss_object_name` cannot be used together.
        /// </summary>
        [Input("zipFile")]
        public Input<string>? ZipFile { get; set; }

        public LayerVersionArgs()
        {
        }
        public static new LayerVersionArgs Empty => new LayerVersionArgs();
    }

    public sealed class LayerVersionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The access mode of Layer Version.
        /// </summary>
        [Input("acl")]
        public Input<string>? Acl { get; set; }

        /// <summary>
        /// The arn of Layer Version.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The checksum of the layer code package.
        /// </summary>
        [Input("codeCheckSum")]
        public Input<string>? CodeCheckSum { get; set; }

        [Input("compatibleRuntimes")]
        private InputList<string>? _compatibleRuntimes;

        /// <summary>
        /// The list of runtime environments that are supported by the layer. Valid values: `nodejs14`, `nodejs12`, `nodejs10`, `nodejs8`, `nodejs6`, `python3.9`, `python3`, `python2.7`, `java11`, `java8`, `php7.2`, `go1`,`dotnetcore2.1`, `custom`.
        /// </summary>
        public InputList<string> CompatibleRuntimes
        {
            get => _compatibleRuntimes ?? (_compatibleRuntimes = new InputList<string>());
            set => _compatibleRuntimes = value;
        }

        /// <summary>
        /// The description of the layer version.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the layer.
        /// </summary>
        [Input("layerName")]
        public Input<string>? LayerName { get; set; }

        /// <summary>
        /// The name of the OSS bucket that stores the ZIP package of the function code.
        /// </summary>
        [Input("ossBucketName")]
        public Input<string>? OssBucketName { get; set; }

        /// <summary>
        /// The name of the OSS object (ZIP package) that contains the function code.
        /// </summary>
        [Input("ossObjectName")]
        public Input<string>? OssObjectName { get; set; }

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_runtimes`, `description`, `layer_name`, `oss_bucket_name`,  `oss_object_name`, or `zip_file` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Input("skipDestroy")]
        public Input<bool>? SkipDestroy { get; set; }

        /// <summary>
        /// The version of Layer Version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// The ZIP package of the function code that is encoded in the Base64 format.
        /// 
        /// &gt; **NOTE:** `zip_file` and `oss_bucket_name`, `oss_object_name` cannot be used together.
        /// </summary>
        [Input("zipFile")]
        public Input<string>? ZipFile { get; set; }

        public LayerVersionState()
        {
        }
        public static new LayerVersionState Empty => new LayerVersionState();
    }
}
