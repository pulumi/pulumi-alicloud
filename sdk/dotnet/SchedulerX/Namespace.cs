// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.SchedulerX
{
    /// <summary>
    /// ## Import
    /// 
    /// Schedulerx Namespace can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:schedulerx/namespace:Namespace example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:schedulerx/namespace:Namespace")]
    public partial class Namespace : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Namespace description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Namespace name.
        /// </summary>
        [Output("namespaceName")]
        public Output<string> NamespaceName { get; private set; } = null!;

        /// <summary>
        /// Namespace uid.
        /// </summary>
        [Output("namespaceUid")]
        public Output<string> NamespaceUid { get; private set; } = null!;


        /// <summary>
        /// Create a Namespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Namespace(string name, NamespaceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:schedulerx/namespace:Namespace", name, args ?? new NamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Namespace(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:schedulerx/namespace:Namespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Namespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Namespace Get(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new Namespace(name, id, state, options);
        }
    }

    public sealed class NamespaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Namespace description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Namespace name.
        /// </summary>
        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        /// <summary>
        /// Namespace uid.
        /// </summary>
        [Input("namespaceUid")]
        public Input<string>? NamespaceUid { get; set; }

        public NamespaceArgs()
        {
        }
        public static new NamespaceArgs Empty => new NamespaceArgs();
    }

    public sealed class NamespaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Namespace description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Namespace name.
        /// </summary>
        [Input("namespaceName")]
        public Input<string>? NamespaceName { get; set; }

        /// <summary>
        /// Namespace uid.
        /// </summary>
        [Input("namespaceUid")]
        public Input<string>? NamespaceUid { get; set; }

        public NamespaceState()
        {
        }
        public static new NamespaceState Empty => new NamespaceState();
    }
}
