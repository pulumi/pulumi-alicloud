// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect
{
    /// <summary>
    /// ## Import
    /// 
    /// Express Connect Router Express Connect Router can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:expressconnect/routerExpressConnectRouter:RouterExpressConnectRouter example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:expressconnect/routerExpressConnectRouter:RouterExpressConnectRouter")]
    public partial class RouterExpressConnectRouter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ASN representing resources.
        /// </summary>
        [Output("alibabaSideAsn")]
        public Output<int> AlibabaSideAsn { get; private set; } = null!;

        /// <summary>
        /// Represents the creation time of the resource.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Represents the description of the leased line gateway.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the Gateway representing the leased line.
        /// </summary>
        [Output("ecrName")]
        public Output<string?> EcrName { get; private set; } = null!;

        /// <summary>
        /// List of regions representing leased line gateways. See `regions` below.
        /// </summary>
        [Output("regions")]
        public Output<ImmutableArray<Outputs.RouterExpressConnectRouterRegion>> Regions { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group to which the ECR instance belongs.
        /// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a RouterExpressConnectRouter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouterExpressConnectRouter(string name, RouterExpressConnectRouterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:expressconnect/routerExpressConnectRouter:RouterExpressConnectRouter", name, args ?? new RouterExpressConnectRouterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouterExpressConnectRouter(string name, Input<string> id, RouterExpressConnectRouterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:expressconnect/routerExpressConnectRouter:RouterExpressConnectRouter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouterExpressConnectRouter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouterExpressConnectRouter Get(string name, Input<string> id, RouterExpressConnectRouterState? state = null, CustomResourceOptions? options = null)
        {
            return new RouterExpressConnectRouter(name, id, state, options);
        }
    }

    public sealed class RouterExpressConnectRouterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ASN representing resources.
        /// </summary>
        [Input("alibabaSideAsn", required: true)]
        public Input<int> AlibabaSideAsn { get; set; } = null!;

        /// <summary>
        /// Represents the description of the leased line gateway.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the Gateway representing the leased line.
        /// </summary>
        [Input("ecrName")]
        public Input<string>? EcrName { get; set; }

        [Input("regions")]
        private InputList<Inputs.RouterExpressConnectRouterRegionArgs>? _regions;

        /// <summary>
        /// List of regions representing leased line gateways. See `regions` below.
        /// </summary>
        public InputList<Inputs.RouterExpressConnectRouterRegionArgs> Regions
        {
            get => _regions ?? (_regions = new InputList<Inputs.RouterExpressConnectRouterRegionArgs>());
            set => _regions = value;
        }

        /// <summary>
        /// The ID of the resource group to which the ECR instance belongs.
        /// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public RouterExpressConnectRouterArgs()
        {
        }
        public static new RouterExpressConnectRouterArgs Empty => new RouterExpressConnectRouterArgs();
    }

    public sealed class RouterExpressConnectRouterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ASN representing resources.
        /// </summary>
        [Input("alibabaSideAsn")]
        public Input<int>? AlibabaSideAsn { get; set; }

        /// <summary>
        /// Represents the creation time of the resource.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Represents the description of the leased line gateway.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the Gateway representing the leased line.
        /// </summary>
        [Input("ecrName")]
        public Input<string>? EcrName { get; set; }

        [Input("regions")]
        private InputList<Inputs.RouterExpressConnectRouterRegionGetArgs>? _regions;

        /// <summary>
        /// List of regions representing leased line gateways. See `regions` below.
        /// </summary>
        public InputList<Inputs.RouterExpressConnectRouterRegionGetArgs> Regions
        {
            get => _regions ?? (_regions = new InputList<Inputs.RouterExpressConnectRouterRegionGetArgs>());
            set => _regions = value;
        }

        /// <summary>
        /// The ID of the resource group to which the ECR instance belongs.
        /// - A string consisting of letters, numbers, hyphens (-), and underscores (_), and the string length can be 0 to 64 characters.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public RouterExpressConnectRouterState()
        {
        }
        public static new RouterExpressConnectRouterState Empty => new RouterExpressConnectRouterState();
    }
}
