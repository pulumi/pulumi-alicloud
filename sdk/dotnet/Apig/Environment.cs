// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Apig
{
    /// <summary>
    /// Provides a APIG Environment resource.
    /// 
    /// For information about APIG Environment and how to use it, see [What is Environment](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.240.0.
    /// 
    /// ## Import
    /// 
    /// APIG Environment can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:apig/environment:Environment example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:apig/environment:Environment")]
    public partial class Environment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Output("environmentName")]
        public Output<string> EnvironmentName { get; private set; } = null!;

        /// <summary>
        /// Gateway id
        /// </summary>
        [Output("gatewayId")]
        public Output<string> GatewayId { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a Environment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Environment(string name, EnvironmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:apig/environment:Environment", name, args ?? new EnvironmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Environment(string name, Input<string> id, EnvironmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:apig/environment:Environment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Environment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Environment Get(string name, Input<string> id, EnvironmentState? state = null, CustomResourceOptions? options = null)
        {
            return new Environment(name, id, state, options);
        }
    }

    public sealed class EnvironmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Input("environmentName", required: true)]
        public Input<string> EnvironmentName { get; set; } = null!;

        /// <summary>
        /// Gateway id
        /// </summary>
        [Input("gatewayId", required: true)]
        public Input<string> GatewayId { get; set; } = null!;

        /// <summary>
        /// The ID of the resource group
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        public EnvironmentArgs()
        {
        }
        public static new EnvironmentArgs Empty => new EnvironmentArgs();
    }

    public sealed class EnvironmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Input("environmentName")]
        public Input<string>? EnvironmentName { get; set; }

        /// <summary>
        /// Gateway id
        /// </summary>
        [Input("gatewayId")]
        public Input<string>? GatewayId { get; set; }

        /// <summary>
        /// The ID of the resource group
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        public EnvironmentState()
        {
        }
        public static new EnvironmentState Empty => new EnvironmentState();
    }
}