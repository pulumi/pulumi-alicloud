// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides an Alicloud EIP Association resource for associating Elastic IP to ECS Instance, SLB Instance or Nat Gateway.
    /// 
    /// &gt; **NOTE:** `alicloud.ecs.EipAssociation` is useful in scenarios where EIPs are either
    ///  pre-existing or distributed to customers or users and therefore cannot be changed.
    /// 
    /// &gt; **NOTE:** From version 1.7.1, the resource support to associate EIP to SLB Instance or Nat Gateway.
    /// 
    /// &gt; **NOTE:** One EIP can only be associated with ECS or SLB instance which in the VPC.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/eip_association.html.markdown.
    /// </summary>
    public partial class EipAssociation : Pulumi.CustomResource
    {
        /// <summary>
        /// The allocation EIP ID.
        /// </summary>
        [Output("allocationId")]
        public Output<string> AllocationId { get; private set; } = null!;

        /// <summary>
        /// The ID of the ECS or SLB instance or Nat Gateway.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The type of cloud product that the eip instance to bind.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// The private IP address in the network segment of the vswitch which has been assigned.
        /// </summary>
        [Output("privateIpAddress")]
        public Output<string> PrivateIpAddress { get; private set; } = null!;


        /// <summary>
        /// Create a EipAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EipAssociation(string name, EipAssociationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/eipAssociation:EipAssociation", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private EipAssociation(string name, Input<string> id, EipAssociationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/eipAssociation:EipAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EipAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EipAssociation Get(string name, Input<string> id, EipAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new EipAssociation(name, id, state, options);
        }
    }

    public sealed class EipAssociationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The allocation EIP ID.
        /// </summary>
        [Input("allocationId", required: true)]
        public Input<string> AllocationId { get; set; } = null!;

        /// <summary>
        /// The ID of the ECS or SLB instance or Nat Gateway.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The type of cloud product that the eip instance to bind.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The private IP address in the network segment of the vswitch which has been assigned.
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        public EipAssociationArgs()
        {
        }
    }

    public sealed class EipAssociationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The allocation EIP ID.
        /// </summary>
        [Input("allocationId")]
        public Input<string>? AllocationId { get; set; }

        /// <summary>
        /// The ID of the ECS or SLB instance or Nat Gateway.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The type of cloud product that the eip instance to bind.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The private IP address in the network segment of the vswitch which has been assigned.
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        public EipAssociationState()
        {
        }
    }
}