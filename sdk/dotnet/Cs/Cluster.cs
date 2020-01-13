// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    /// <summary>
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/container_cluster.html.markdown.
    /// </summary>
    public partial class Cluster : Pulumi.CustomResource
    {
        [Output("agentVersion")]
        public Output<string> AgentVersion { get; private set; } = null!;

        [Output("cidrBlock")]
        public Output<string> CidrBlock { get; private set; } = null!;

        [Output("diskCategory")]
        public Output<string?> DiskCategory { get; private set; } = null!;

        [Output("diskSize")]
        public Output<int?> DiskSize { get; private set; } = null!;

        [Output("imageId")]
        public Output<string?> ImageId { get; private set; } = null!;

        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        [Output("isOutdated")]
        public Output<bool?> IsOutdated { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("namePrefix")]
        public Output<string?> NamePrefix { get; private set; } = null!;

        [Output("needSlb")]
        public Output<bool?> NeedSlb { get; private set; } = null!;

        [Output("nodeNumber")]
        public Output<int?> NodeNumber { get; private set; } = null!;

        [Output("nodes")]
        public Output<ImmutableArray<Outputs.ClusterNodes>> Nodes { get; private set; } = null!;

        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        [Output("releaseEip")]
        public Output<bool?> ReleaseEip { get; private set; } = null!;

        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        [Output("size")]
        public Output<int?> Size { get; private set; } = null!;

        [Output("slbId")]
        public Output<string> SlbId { get; private set; } = null!;

        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cs/cluster:Cluster", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cs/cluster:Cluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : Pulumi.ResourceArgs
    {
        [Input("cidrBlock", required: true)]
        public Input<string> CidrBlock { get; set; } = null!;

        [Input("diskCategory")]
        public Input<string>? DiskCategory { get; set; }

        [Input("diskSize")]
        public Input<int>? DiskSize { get; set; }

        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("instanceType", required: true)]
        public Input<string> InstanceType { get; set; } = null!;

        [Input("isOutdated")]
        public Input<bool>? IsOutdated { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        [Input("needSlb")]
        public Input<bool>? NeedSlb { get; set; }

        [Input("nodeNumber")]
        public Input<int>? NodeNumber { get; set; }

        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        [Input("releaseEip")]
        public Input<bool>? ReleaseEip { get; set; }

        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        public ClusterArgs()
        {
        }
    }

    public sealed class ClusterState : Pulumi.ResourceArgs
    {
        [Input("agentVersion")]
        public Input<string>? AgentVersion { get; set; }

        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        [Input("diskCategory")]
        public Input<string>? DiskCategory { get; set; }

        [Input("diskSize")]
        public Input<int>? DiskSize { get; set; }

        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("isOutdated")]
        public Input<bool>? IsOutdated { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        [Input("needSlb")]
        public Input<bool>? NeedSlb { get; set; }

        [Input("nodeNumber")]
        public Input<int>? NodeNumber { get; set; }

        [Input("nodes")]
        private InputList<Inputs.ClusterNodesGetArgs>? _nodes;
        public InputList<Inputs.ClusterNodesGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.ClusterNodesGetArgs>());
            set => _nodes = value;
        }

        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("releaseEip")]
        public Input<bool>? ReleaseEip { get; set; }

        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("slbId")]
        public Input<string>? SlbId { get; set; }

        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public ClusterState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class ClusterNodesGetArgs : Pulumi.ResourceArgs
    {
        [Input("eip")]
        public Input<string>? Eip { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public ClusterNodesGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class ClusterNodes
    {
        public readonly string Eip;
        public readonly string Id;
        public readonly string Name;
        public readonly string PrivateIp;
        public readonly string Status;

        [OutputConstructor]
        private ClusterNodes(
            string eip,
            string id,
            string name,
            string privateIp,
            string status)
        {
            Eip = eip;
            Id = id;
            Name = name;
            PrivateIp = privateIp;
            Status = status;
        }
    }
    }
}