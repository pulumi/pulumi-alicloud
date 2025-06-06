// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    /// <summary>
    /// Provides a Application Load Balancer (ALB) Load Balancer Security Group Attachment resource.
    /// 
    /// Attachment between Application Load Balancer and Security Group.
    /// 
    /// For information about Application Load Balancer (ALB) Load Balancer Security Group Attachment and how to use it, see [What is Load Balancer Security Group Attachment](https://next.api.alibabacloud.com/document/Alb/2020-06-16/LoadBalancerJoinSecurityGroup).
    /// 
    /// &gt; **NOTE:** Available since v1.226.0.
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
    ///     var @default = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var createVpc = new AliCloud.Vpc.Network("create_vpc", new()
    ///     {
    ///         CidrBlock = "192.168.0.0/16",
    ///         VpcName = name,
    ///     });
    /// 
    ///     var createVsw1 = new AliCloud.Vpc.Switch("create_vsw_1", new()
    ///     {
    ///         VpcId = createVpc.Id,
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         CidrBlock = "192.168.1.0/24",
    ///         VswitchName = name,
    ///     });
    /// 
    ///     var createVsw2 = new AliCloud.Vpc.Switch("create_vsw_2", new()
    ///     {
    ///         VpcId = createVpc.Id,
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[1]?.Id)),
    ///         CidrBlock = "192.168.2.0/24",
    ///         VswitchName = name,
    ///     });
    /// 
    ///     var createSecurityGroup = new AliCloud.Ecs.SecurityGroup("create_security_group", new()
    ///     {
    ///         Name = name,
    ///         VpcId = createVpc.Id,
    ///     });
    /// 
    ///     var createAlb = new AliCloud.Alb.LoadBalancer("create_alb", new()
    ///     {
    ///         LoadBalancerName = name,
    ///         LoadBalancerEdition = "Standard",
    ///         VpcId = createVpc.Id,
    ///         LoadBalancerBillingConfig = new AliCloud.Alb.Inputs.LoadBalancerLoadBalancerBillingConfigArgs
    ///         {
    ///             PayType = "PayAsYouGo",
    ///         },
    ///         AddressType = "Intranet",
    ///         AddressAllocatedMode = "Fixed",
    ///         ZoneMappings = new[]
    ///         {
    ///             new AliCloud.Alb.Inputs.LoadBalancerZoneMappingArgs
    ///             {
    ///                 VswitchId = createVsw2.Id,
    ///                 ZoneId = createVsw2.ZoneId,
    ///             },
    ///             new AliCloud.Alb.Inputs.LoadBalancerZoneMappingArgs
    ///             {
    ///                 VswitchId = createVsw1.Id,
    ///                 ZoneId = createVsw1.ZoneId,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var defaultLoadBalancerSecurityGroupAttachment = new AliCloud.Alb.LoadBalancerSecurityGroupAttachment("default", new()
    ///     {
    ///         SecurityGroupId = createSecurityGroup.Id,
    ///         LoadBalancerId = createAlb.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Application Load Balancer (ALB) Load Balancer Security Group Attachment can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:alb/loadBalancerSecurityGroupAttachment:LoadBalancerSecurityGroupAttachment example &lt;load_balancer_id&gt;:&lt;security_group_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:alb/loadBalancerSecurityGroupAttachment:LoadBalancerSecurityGroupAttachment")]
    public partial class LoadBalancerSecurityGroupAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether to PreCheck only this request. Value:
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The ID of the Application Load Balancer.
        /// </summary>
        [Output("loadBalancerId")]
        public Output<string> LoadBalancerId { get; private set; } = null!;

        /// <summary>
        /// The ID of the security group.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancerSecurityGroupAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancerSecurityGroupAttachment(string name, LoadBalancerSecurityGroupAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:alb/loadBalancerSecurityGroupAttachment:LoadBalancerSecurityGroupAttachment", name, args ?? new LoadBalancerSecurityGroupAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancerSecurityGroupAttachment(string name, Input<string> id, LoadBalancerSecurityGroupAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:alb/loadBalancerSecurityGroupAttachment:LoadBalancerSecurityGroupAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadBalancerSecurityGroupAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancerSecurityGroupAttachment Get(string name, Input<string> id, LoadBalancerSecurityGroupAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancerSecurityGroupAttachment(name, id, state, options);
        }
    }

    public sealed class LoadBalancerSecurityGroupAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to PreCheck only this request. Value:
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the Application Load Balancer.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<string> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// The ID of the security group.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        public LoadBalancerSecurityGroupAttachmentArgs()
        {
        }
        public static new LoadBalancerSecurityGroupAttachmentArgs Empty => new LoadBalancerSecurityGroupAttachmentArgs();
    }

    public sealed class LoadBalancerSecurityGroupAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to PreCheck only this request. Value:
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the Application Load Balancer.
        /// </summary>
        [Input("loadBalancerId")]
        public Input<string>? LoadBalancerId { get; set; }

        /// <summary>
        /// The ID of the security group.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        public LoadBalancerSecurityGroupAttachmentState()
        {
        }
        public static new LoadBalancerSecurityGroupAttachmentState Empty => new LoadBalancerSecurityGroupAttachmentState();
    }
}
