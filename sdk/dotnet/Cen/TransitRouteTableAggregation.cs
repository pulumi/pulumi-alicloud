// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    /// <summary>
    /// Provides a Cloud Enterprise Network (CEN) Transit Route Table Aggregation resource.
    /// 
    /// For information about Cloud Enterprise Network (CEN) Transit Route Table Aggregation and how to use it, see [What is Transit Route Table Aggregation](https://next.api.alibabacloud.com/document/Cbn/2017-09-12/CreateTransitRouteTableAggregation).
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
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.Cen.Instance("example", new()
    ///     {
    ///         CenInstanceName = "tf_example",
    ///         Description = "an example for cen",
    ///     });
    /// 
    ///     var exampleTransitRouter = new AliCloud.Cen.TransitRouter("example", new()
    ///     {
    ///         TransitRouterName = "tf_example",
    ///         CenId = example.Id,
    ///     });
    /// 
    ///     var exampleTransitRouterRouteTable = new AliCloud.Cen.TransitRouterRouteTable("example", new()
    ///     {
    ///         TransitRouterId = exampleTransitRouter.TransitRouterId,
    ///     });
    /// 
    ///     var exampleTransitRouteTableAggregation = new AliCloud.Cen.TransitRouteTableAggregation("example", new()
    ///     {
    ///         TransitRouteTableId = exampleTransitRouterRouteTable.TransitRouterRouteTableId,
    ///         TransitRouteTableAggregationCidr = "10.0.0.0/8",
    ///         TransitRouteTableAggregationScope = "VPC",
    ///         TransitRouteTableAggregationName = "tf_example",
    ///         TransitRouteTableAggregationDescription = "tf_example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Enterprise Network (CEN) Transit Route Table Aggregation can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:cen/transitRouteTableAggregation:TransitRouteTableAggregation example &lt;transit_route_table_id&gt;#&lt;transit_route_table_aggregation_cidr&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cen/transitRouteTableAggregation:TransitRouteTableAggregation")]
    public partial class TransitRouteTableAggregation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The status of the resource
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The destination CIDR block of the aggregate route.
        /// 
        /// &gt; **NOTE:**   The following CIDR blocks are not supported:
        /// 
        /// &gt; **NOTE:** *   CIDR blocks that start with 0 or 100.64.
        /// 
        /// &gt; **NOTE:** *   Multicast CIDR blocks, including 224.0.0.1 to 239.255.255.254.
        /// </summary>
        [Output("transitRouteTableAggregationCidr")]
        public Output<string> TransitRouteTableAggregationCidr { get; private set; } = null!;

        /// <summary>
        /// The list of propagation ranges of the aggregation route.
        /// 
        /// &gt; **NOTE:**   You must specify at least one of the following attributes: Aggregation Scope and Aggregate Scope List. We recommend that you specify the latter. The elements in the two attributes cannot be duplicate.
        /// </summary>
        [Output("transitRouteTableAggregationDescription")]
        public Output<string?> TransitRouteTableAggregationDescription { get; private set; } = null!;

        /// <summary>
        /// The name of the aggregate route.
        /// The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.
        /// </summary>
        [Output("transitRouteTableAggregationName")]
        public Output<string?> TransitRouteTableAggregationName { get; private set; } = null!;

        /// <summary>
        /// The scope of networks that you want to advertise the aggregate route.
        /// The valid value is `VPC`, which indicates that the aggregate route is advertised to all VPCs that have associated forwarding correlation with the Enterprise Edition transit router and have route synchronization enabled.
        /// </summary>
        [Output("transitRouteTableAggregationScope")]
        public Output<string?> TransitRouteTableAggregationScope { get; private set; } = null!;

        /// <summary>
        /// Aggregation Route Scopes
        /// </summary>
        [Output("transitRouteTableAggregationScopeLists")]
        public Output<ImmutableArray<string>> TransitRouteTableAggregationScopeLists { get; private set; } = null!;

        /// <summary>
        /// The list of route table IDs of the Enterprise Edition transit router.
        /// </summary>
        [Output("transitRouteTableId")]
        public Output<string> TransitRouteTableId { get; private set; } = null!;


        /// <summary>
        /// Create a TransitRouteTableAggregation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitRouteTableAggregation(string name, TransitRouteTableAggregationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouteTableAggregation:TransitRouteTableAggregation", name, args ?? new TransitRouteTableAggregationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitRouteTableAggregation(string name, Input<string> id, TransitRouteTableAggregationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouteTableAggregation:TransitRouteTableAggregation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransitRouteTableAggregation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitRouteTableAggregation Get(string name, Input<string> id, TransitRouteTableAggregationState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitRouteTableAggregation(name, id, state, options);
        }
    }

    public sealed class TransitRouteTableAggregationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination CIDR block of the aggregate route.
        /// 
        /// &gt; **NOTE:**   The following CIDR blocks are not supported:
        /// 
        /// &gt; **NOTE:** *   CIDR blocks that start with 0 or 100.64.
        /// 
        /// &gt; **NOTE:** *   Multicast CIDR blocks, including 224.0.0.1 to 239.255.255.254.
        /// </summary>
        [Input("transitRouteTableAggregationCidr", required: true)]
        public Input<string> TransitRouteTableAggregationCidr { get; set; } = null!;

        /// <summary>
        /// The list of propagation ranges of the aggregation route.
        /// 
        /// &gt; **NOTE:**   You must specify at least one of the following attributes: Aggregation Scope and Aggregate Scope List. We recommend that you specify the latter. The elements in the two attributes cannot be duplicate.
        /// </summary>
        [Input("transitRouteTableAggregationDescription")]
        public Input<string>? TransitRouteTableAggregationDescription { get; set; }

        /// <summary>
        /// The name of the aggregate route.
        /// The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.
        /// </summary>
        [Input("transitRouteTableAggregationName")]
        public Input<string>? TransitRouteTableAggregationName { get; set; }

        /// <summary>
        /// The scope of networks that you want to advertise the aggregate route.
        /// The valid value is `VPC`, which indicates that the aggregate route is advertised to all VPCs that have associated forwarding correlation with the Enterprise Edition transit router and have route synchronization enabled.
        /// </summary>
        [Input("transitRouteTableAggregationScope")]
        public Input<string>? TransitRouteTableAggregationScope { get; set; }

        [Input("transitRouteTableAggregationScopeLists")]
        private InputList<string>? _transitRouteTableAggregationScopeLists;

        /// <summary>
        /// Aggregation Route Scopes
        /// </summary>
        public InputList<string> TransitRouteTableAggregationScopeLists
        {
            get => _transitRouteTableAggregationScopeLists ?? (_transitRouteTableAggregationScopeLists = new InputList<string>());
            set => _transitRouteTableAggregationScopeLists = value;
        }

        /// <summary>
        /// The list of route table IDs of the Enterprise Edition transit router.
        /// </summary>
        [Input("transitRouteTableId", required: true)]
        public Input<string> TransitRouteTableId { get; set; } = null!;

        public TransitRouteTableAggregationArgs()
        {
        }
        public static new TransitRouteTableAggregationArgs Empty => new TransitRouteTableAggregationArgs();
    }

    public sealed class TransitRouteTableAggregationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The destination CIDR block of the aggregate route.
        /// 
        /// &gt; **NOTE:**   The following CIDR blocks are not supported:
        /// 
        /// &gt; **NOTE:** *   CIDR blocks that start with 0 or 100.64.
        /// 
        /// &gt; **NOTE:** *   Multicast CIDR blocks, including 224.0.0.1 to 239.255.255.254.
        /// </summary>
        [Input("transitRouteTableAggregationCidr")]
        public Input<string>? TransitRouteTableAggregationCidr { get; set; }

        /// <summary>
        /// The list of propagation ranges of the aggregation route.
        /// 
        /// &gt; **NOTE:**   You must specify at least one of the following attributes: Aggregation Scope and Aggregate Scope List. We recommend that you specify the latter. The elements in the two attributes cannot be duplicate.
        /// </summary>
        [Input("transitRouteTableAggregationDescription")]
        public Input<string>? TransitRouteTableAggregationDescription { get; set; }

        /// <summary>
        /// The name of the aggregate route.
        /// The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.
        /// </summary>
        [Input("transitRouteTableAggregationName")]
        public Input<string>? TransitRouteTableAggregationName { get; set; }

        /// <summary>
        /// The scope of networks that you want to advertise the aggregate route.
        /// The valid value is `VPC`, which indicates that the aggregate route is advertised to all VPCs that have associated forwarding correlation with the Enterprise Edition transit router and have route synchronization enabled.
        /// </summary>
        [Input("transitRouteTableAggregationScope")]
        public Input<string>? TransitRouteTableAggregationScope { get; set; }

        [Input("transitRouteTableAggregationScopeLists")]
        private InputList<string>? _transitRouteTableAggregationScopeLists;

        /// <summary>
        /// Aggregation Route Scopes
        /// </summary>
        public InputList<string> TransitRouteTableAggregationScopeLists
        {
            get => _transitRouteTableAggregationScopeLists ?? (_transitRouteTableAggregationScopeLists = new InputList<string>());
            set => _transitRouteTableAggregationScopeLists = value;
        }

        /// <summary>
        /// The list of route table IDs of the Enterprise Edition transit router.
        /// </summary>
        [Input("transitRouteTableId")]
        public Input<string>? TransitRouteTableId { get; set; }

        public TransitRouteTableAggregationState()
        {
        }
        public static new TransitRouteTableAggregationState Empty => new TransitRouteTableAggregationState();
    }
}
