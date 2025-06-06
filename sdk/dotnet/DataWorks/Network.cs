// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DataWorks
{
    /// <summary>
    /// Provides a Data Works Network resource.
    /// 
    /// Resource Group Network.
    /// 
    /// For information about Data Works Network and how to use it, see [What is Network](https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2024-05-18-createnetwork).
    /// 
    /// &gt; **NOTE:** Available since v1.241.0.
    /// 
    /// ## Import
    /// 
    /// Data Works Network can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:dataworks/network:Network example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dataworks/network:Network")]
    public partial class Network : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Time when the network resource was created
        /// </summary>
        [Output("createTime")]
        public Output<int> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("dwResourceGroupId")]
        public Output<string> DwResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// Network Resource Status
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Virtual Private Cloud ID of network resources
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The vSwitch ID of the network resource.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a Network resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Network(string name, NetworkArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dataworks/network:Network", name, args ?? new NetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Network(string name, Input<string> id, NetworkState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dataworks/network:Network", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Network resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Network Get(string name, Input<string> id, NetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new Network(name, id, state, options);
        }
    }

    public sealed class NetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("dwResourceGroupId", required: true)]
        public Input<string> DwResourceGroupId { get; set; } = null!;

        /// <summary>
        /// Virtual Private Cloud ID of network resources
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The vSwitch ID of the network resource.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        public NetworkArgs()
        {
        }
        public static new NetworkArgs Empty => new NetworkArgs();
    }

    public sealed class NetworkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time when the network resource was created
        /// </summary>
        [Input("createTime")]
        public Input<int>? CreateTime { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("dwResourceGroupId")]
        public Input<string>? DwResourceGroupId { get; set; }

        /// <summary>
        /// Network Resource Status
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Virtual Private Cloud ID of network resources
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The vSwitch ID of the network resource.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public NetworkState()
        {
        }
        public static new NetworkState Empty => new NetworkState();
    }
}
