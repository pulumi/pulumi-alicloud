// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ens
{
    /// <summary>
    /// Provides a ENS Key Pair resource.
    /// 
    /// For information about ENS Key Pair and how to use it, see [What is Key Pair](https://www.alibabacloud.com/help/en/ens/latest/createkeypair).
    /// 
    /// &gt; **NOTE:** Available since v1.133.0.
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
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var example = new AliCloud.Ens.KeyPair("example", new()
    ///     {
    ///         KeyPairName = name,
    ///         Version = "2017-11-10",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ENS Key Pair can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ens/keyPair:KeyPair example &lt;key_pair_name&gt;:&lt;version&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ens/keyPair:KeyPair")]
    public partial class KeyPair : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the key pair.
        /// </summary>
        [Output("keyPairName")]
        public Output<string> KeyPairName { get; private set; } = null!;

        /// <summary>
        /// The version number.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a KeyPair resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KeyPair(string name, KeyPairArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ens/keyPair:KeyPair", name, args ?? new KeyPairArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KeyPair(string name, Input<string> id, KeyPairState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ens/keyPair:KeyPair", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KeyPair resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KeyPair Get(string name, Input<string> id, KeyPairState? state = null, CustomResourceOptions? options = null)
        {
            return new KeyPair(name, id, state, options);
        }
    }

    public sealed class KeyPairArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the key pair.
        /// </summary>
        [Input("keyPairName", required: true)]
        public Input<string> KeyPairName { get; set; } = null!;

        /// <summary>
        /// The version number.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public KeyPairArgs()
        {
        }
        public static new KeyPairArgs Empty => new KeyPairArgs();
    }

    public sealed class KeyPairState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the key pair.
        /// </summary>
        [Input("keyPairName")]
        public Input<string>? KeyPairName { get; set; }

        /// <summary>
        /// The version number.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public KeyPairState()
        {
        }
        public static new KeyPairState Empty => new KeyPairState();
    }
}
