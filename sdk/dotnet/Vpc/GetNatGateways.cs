// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static partial class Invokes
    {
        /// <summary>
        /// This data source provides a list of Nat Gateways owned by an Alibaba Cloud account.
        /// 
        /// &gt; **NOTE:** Available in 1.37.0+.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/nat_gateways.html.markdown.
        /// </summary>
        public static Task<GetNatGatewaysResult> GetNatGateways(GetNatGatewaysArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNatGatewaysResult>("alicloud:vpc/getNatGateways:getNatGateways", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetNatGatewaysArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of NAT gateways IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter nat gateways by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        public GetNatGatewaysArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetNatGatewaysResult
    {
        /// <summary>
        /// A list of Nat gateways. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNatGatewaysGatewaysResult> Gateways;
        /// <summary>
        /// (Optional) A list of Nat gateways IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Nat gateways names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? VpcId;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetNatGatewaysResult(
            ImmutableArray<Outputs.GetNatGatewaysGatewaysResult> gateways,
            ImmutableArray<string> ids,
            string? nameRegex,
            ImmutableArray<string> names,
            string? outputFile,
            string? vpcId,
            string id)
        {
            Gateways = gateways;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            VpcId = vpcId;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetNatGatewaysGatewaysResult
    {
        /// <summary>
        /// Time of creation.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// The description of the NAT gateway.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The forward table id. 
        /// </summary>
        public readonly string ForwardTableId;
        /// <summary>
        /// The ID of the NAT gateway.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the NAT gateway.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The snat table id.
        /// </summary>
        public readonly string SnatTableId;
        /// <summary>
        /// The specification of the NAT gateway.
        /// </summary>
        public readonly string Spec;
        /// <summary>
        /// The status of the NAT gateway.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetNatGatewaysGatewaysResult(
            string creationTime,
            string description,
            string forwardTableId,
            string id,
            string name,
            string snatTableId,
            string spec,
            string status)
        {
            CreationTime = creationTime;
            Description = description;
            ForwardTableId = forwardTableId;
            Id = id;
            Name = name;
            SnatTableId = snatTableId;
            Spec = spec;
            Status = status;
        }
    }
    }
}