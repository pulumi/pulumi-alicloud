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
        /// This data source provides a list of Common Bandwidth Packages owned by an Alibaba Cloud account.
        /// 
        /// &gt; **NOTE:** Available in 1.36.0+.
        /// 
        /// ## Public ip addresses Block
        ///   
        ///   The public ip addresses mapping supports the following:
        ///   
        ///   * `ip_address`   - The address of the EIP.
        ///   * `allocation_id` - The ID of the EIP instance.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/common_bandwidth_packages.html.markdown.
        /// </summary>
        public static Task<GetCommonBandwidthPackagesResult> GetCommonBandwidthPackages(GetCommonBandwidthPackagesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCommonBandwidthPackagesResult>("alicloud:vpc/getCommonBandwidthPackages:getCommonBandwidthPackages", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetCommonBandwidthPackagesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Common Bandwidth Packages IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Id of resource group which the common bandwidth package belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        public GetCommonBandwidthPackagesArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetCommonBandwidthPackagesResult
    {
        /// <summary>
        /// (Optional) A list of Common Bandwidth Packages IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Common Bandwidth Packages names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Common Bandwidth Packages. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCommonBandwidthPackagesPackagesResult> Packages;
        /// <summary>
        /// The Id of resource group which the common bandwidth package belongs.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetCommonBandwidthPackagesResult(
            ImmutableArray<string> ids,
            string? nameRegex,
            ImmutableArray<string> names,
            string? outputFile,
            ImmutableArray<Outputs.GetCommonBandwidthPackagesPackagesResult> packages,
            string? resourceGroupId,
            string id)
        {
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Packages = packages;
            ResourceGroupId = resourceGroupId;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetCommonBandwidthPackagesPackagesPublicIpAddressesResult
    {
        public readonly string AllocationId;
        public readonly string IpAddress;

        [OutputConstructor]
        private GetCommonBandwidthPackagesPackagesPublicIpAddressesResult(
            string allocationId,
            string ipAddress)
        {
            AllocationId = allocationId;
            IpAddress = ipAddress;
        }
    }

    [OutputType]
    public sealed class GetCommonBandwidthPackagesPackagesResult
    {
        /// <summary>
        /// The peak bandwidth of the Internet Shared Bandwidth instance.
        /// </summary>
        public readonly string Bandwidth;
        /// <summary>
        /// The business status of the Common Bandwidth Package instance.
        /// </summary>
        public readonly string BusinessStatus;
        /// <summary>
        /// Time of creation.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// The description of the Common Bandwidth Package instance.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of the Common Bandwidth Package.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ISP of the Common Bandwidth Package.
        /// </summary>
        public readonly string Isp;
        /// <summary>
        /// Name of the Common Bandwidth Package.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Public ip addresses that in the Common Bandwidth Pakcage.
        /// </summary>
        public readonly ImmutableArray<GetCommonBandwidthPackagesPackagesPublicIpAddressesResult> PublicIpAddresses;
        /// <summary>
        /// The Id of resource group which the common bandwidth package belongs.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// Status of the Common Bandwidth Package.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetCommonBandwidthPackagesPackagesResult(
            string bandwidth,
            string businessStatus,
            string creationTime,
            string description,
            string id,
            string isp,
            string name,
            ImmutableArray<GetCommonBandwidthPackagesPackagesPublicIpAddressesResult> publicIpAddresses,
            string? resourceGroupId,
            string status)
        {
            Bandwidth = bandwidth;
            BusinessStatus = businessStatus;
            CreationTime = creationTime;
            Description = description;
            Id = id;
            Isp = isp;
            Name = name;
            PublicIpAddresses = publicIpAddresses;
            ResourceGroupId = resourceGroupId;
            Status = status;
        }
    }
    }
}