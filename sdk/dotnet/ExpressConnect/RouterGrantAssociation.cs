// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect
{
    /// <summary>
    /// Provides a Express Connect Router Grant Association resource.
    /// 
    /// Network instances authorized to the leased line Gateway.
    /// 
    /// For information about Express Connect Router Grant Association and how to use it, see [What is Grant Association](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.239.0.
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
    ///     var vpcId = config.Get("vpcId") ?? "vpc-xxx";
    ///     var ecrOwnerUid = config.Get("ecrOwnerUid") ?? "18xxx";
    ///     var ecrId = config.Get("ecrId") ?? "ecr-xxx";
    ///     var region = config.Get("region") ?? "cn-hangzhou";
    ///     var @default = new AliCloud.ExpressConnect.RouterGrantAssociation("default", new()
    ///     {
    ///         EcrId = ecrId,
    ///         InstanceRegionId = region,
    ///         InstanceId = vpcId,
    ///         EcrOwnerAliUid = ecrOwnerUid,
    ///         InstanceType = "VPC",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Express Connect Router Grant Association can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:expressconnect/routerGrantAssociation:RouterGrantAssociation example &lt;ecr_id&gt;:&lt;instance_id&gt;:&lt;instance_region_id&gt;:&lt;ecr_owner_ali_uid&gt;:&lt;instance_type&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:expressconnect/routerGrantAssociation:RouterGrantAssociation")]
    public partial class RouterGrantAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the associated Leased Line Gateway instance.
        /// </summary>
        [Output("ecrId")]
        public Output<string> EcrId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) to which the leased line gateway instance is authorized.
        /// </summary>
        [Output("ecrOwnerAliUid")]
        public Output<int> EcrOwnerAliUid { get; private set; } = null!;

        /// <summary>
        /// The ID of the network instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The ID of the region where the authorized network instance is located.
        /// </summary>
        [Output("instanceRegionId")]
        public Output<string> InstanceRegionId { get; private set; } = null!;

        /// <summary>
        /// The type of the network instance. Value:
        /// - `VBR`: the VBR instance.
        /// - `VPC`: VPC instance.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a RouterGrantAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouterGrantAssociation(string name, RouterGrantAssociationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:expressconnect/routerGrantAssociation:RouterGrantAssociation", name, args ?? new RouterGrantAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouterGrantAssociation(string name, Input<string> id, RouterGrantAssociationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:expressconnect/routerGrantAssociation:RouterGrantAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouterGrantAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouterGrantAssociation Get(string name, Input<string> id, RouterGrantAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new RouterGrantAssociation(name, id, state, options);
        }
    }

    public sealed class RouterGrantAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the associated Leased Line Gateway instance.
        /// </summary>
        [Input("ecrId", required: true)]
        public Input<string> EcrId { get; set; } = null!;

        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) to which the leased line gateway instance is authorized.
        /// </summary>
        [Input("ecrOwnerAliUid", required: true)]
        public Input<int> EcrOwnerAliUid { get; set; } = null!;

        /// <summary>
        /// The ID of the network instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The ID of the region where the authorized network instance is located.
        /// </summary>
        [Input("instanceRegionId", required: true)]
        public Input<string> InstanceRegionId { get; set; } = null!;

        /// <summary>
        /// The type of the network instance. Value:
        /// - `VBR`: the VBR instance.
        /// - `VPC`: VPC instance.
        /// </summary>
        [Input("instanceType", required: true)]
        public Input<string> InstanceType { get; set; } = null!;

        public RouterGrantAssociationArgs()
        {
        }
        public static new RouterGrantAssociationArgs Empty => new RouterGrantAssociationArgs();
    }

    public sealed class RouterGrantAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the associated Leased Line Gateway instance.
        /// </summary>
        [Input("ecrId")]
        public Input<string>? EcrId { get; set; }

        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) to which the leased line gateway instance is authorized.
        /// </summary>
        [Input("ecrOwnerAliUid")]
        public Input<int>? EcrOwnerAliUid { get; set; }

        /// <summary>
        /// The ID of the network instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The ID of the region where the authorized network instance is located.
        /// </summary>
        [Input("instanceRegionId")]
        public Input<string>? InstanceRegionId { get; set; }

        /// <summary>
        /// The type of the network instance. Value:
        /// - `VBR`: the VBR instance.
        /// - `VPC`: VPC instance.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public RouterGrantAssociationState()
        {
        }
        public static new RouterGrantAssociationState Empty => new RouterGrantAssociationState();
    }
}