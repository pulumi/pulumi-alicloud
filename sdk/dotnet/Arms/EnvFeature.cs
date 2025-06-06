// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms
{
    /// <summary>
    /// Provides a ARMS Env Feature resource. Feature of the arms environment.
    /// 
    /// For information about ARMS Env Feature and how to use it, see [What is Env Feature](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-installenvironmentfeature).
    /// 
    /// &gt; **NOTE:** Available since v1.212.0.
    /// 
    /// ## Import
    /// 
    /// ARMS Env Feature can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:arms/envFeature:EnvFeature example &lt;environment_id&gt;:&lt;env_feature_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:arms/envFeature:EnvFeature")]
    public partial class EnvFeature : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("envFeatureName")]
        public Output<string> EnvFeatureName { get; private set; } = null!;

        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Output("environmentId")]
        public Output<string> EnvironmentId { get; private set; } = null!;

        /// <summary>
        /// Version information of the Feature. You can query Feature information by using ListEnvironmentFeatures.
        /// </summary>
        [Output("featureVersion")]
        public Output<string> FeatureVersion { get; private set; } = null!;

        /// <summary>
        /// Namespace.
        /// </summary>
        [Output("namespace")]
        public Output<string> Namespace { get; private set; } = null!;

        /// <summary>
        /// Status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a EnvFeature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EnvFeature(string name, EnvFeatureArgs args, CustomResourceOptions? options = null)
            : base("alicloud:arms/envFeature:EnvFeature", name, args ?? new EnvFeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EnvFeature(string name, Input<string> id, EnvFeatureState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:arms/envFeature:EnvFeature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EnvFeature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EnvFeature Get(string name, Input<string> id, EnvFeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new EnvFeature(name, id, state, options);
        }
    }

    public sealed class EnvFeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("envFeatureName", required: true)]
        public Input<string> EnvFeatureName { get; set; } = null!;

        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Input("environmentId", required: true)]
        public Input<string> EnvironmentId { get; set; } = null!;

        /// <summary>
        /// Version information of the Feature. You can query Feature information by using ListEnvironmentFeatures.
        /// </summary>
        [Input("featureVersion", required: true)]
        public Input<string> FeatureVersion { get; set; } = null!;

        public EnvFeatureArgs()
        {
        }
        public static new EnvFeatureArgs Empty => new EnvFeatureArgs();
    }

    public sealed class EnvFeatureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("envFeatureName")]
        public Input<string>? EnvFeatureName { get; set; }

        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        /// <summary>
        /// Version information of the Feature. You can query Feature information by using ListEnvironmentFeatures.
        /// </summary>
        [Input("featureVersion")]
        public Input<string>? FeatureVersion { get; set; }

        /// <summary>
        /// Namespace.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public EnvFeatureState()
        {
        }
        public static new EnvFeatureState Empty => new EnvFeatureState();
    }
}
