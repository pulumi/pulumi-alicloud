// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    /// <summary>
    /// Provides a Vpc Ipam Ipam Pool resource.
    /// 
    /// IP Address Management Pool.
    /// 
    /// For information about Vpc Ipam Ipam Pool and how to use it, see [What is Ipam Pool](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamPool).
    /// 
    /// &gt; **NOTE:** Available since v1.234.0.
    /// 
    /// ## Import
    /// 
    /// Vpc Ipam Ipam Pool can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:vpc/ipamIpamPool:IpamIpamPool example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpc/ipamIpamPool:IpamIpamPool")]
    public partial class IpamIpamPool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The default network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Output("allocationDefaultCidrMask")]
        public Output<int?> AllocationDefaultCidrMask { get; private set; } = null!;

        /// <summary>
        /// The maximum network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Output("allocationMaxCidrMask")]
        public Output<int> AllocationMaxCidrMask { get; private set; } = null!;

        /// <summary>
        /// The minimum Network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Output("allocationMinCidrMask")]
        public Output<int?> AllocationMinCidrMask { get; private set; } = null!;

        /// <summary>
        /// Whether the automatic import function is enabled for the address pool.
        /// </summary>
        [Output("autoImport")]
        public Output<bool?> AutoImport { get; private set; } = null!;

        /// <summary>
        /// Whether to clear the default network mask of the IPAM address pool. Value:
        /// </summary>
        [Output("clearAllocationDefaultCidrMask")]
        public Output<bool?> ClearAllocationDefaultCidrMask { get; private set; } = null!;

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The IP protocol version. Currently, only `IPv4` is supported * *.
        /// </summary>
        [Output("ipVersion")]
        public Output<string> IpVersion { get; private set; } = null!;

        /// <summary>
        /// The description of the IPAM address pool.
        /// It must be 2 to 256 characters in length and must start with an English letter or a Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        /// </summary>
        [Output("ipamPoolDescription")]
        public Output<string?> IpamPoolDescription { get; private set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("ipamPoolName")]
        public Output<string> IpamPoolName { get; private set; } = null!;

        /// <summary>
        /// Ipam scope id.
        /// </summary>
        [Output("ipamScopeId")]
        public Output<string> IpamScopeId { get; private set; } = null!;

        /// <summary>
        /// The effective region of the IPAM address pool.
        /// </summary>
        [Output("poolRegionId")]
        public Output<string?> PoolRegionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the IPAM hosting region.
        /// </summary>
        [Output("regionId")]
        public Output<string> RegionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The instance ID of the source IPAM address pool.
        /// 
        /// &gt; **NOTE:**  If this parameter is not entered, the created address pool is the parent address pool.
        /// </summary>
        [Output("sourceIpamPoolId")]
        public Output<string> SourceIpamPoolId { get; private set; } = null!;

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
        /// Create a IpamIpamPool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IpamIpamPool(string name, IpamIpamPoolArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/ipamIpamPool:IpamIpamPool", name, args ?? new IpamIpamPoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IpamIpamPool(string name, Input<string> id, IpamIpamPoolState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/ipamIpamPool:IpamIpamPool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IpamIpamPool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IpamIpamPool Get(string name, Input<string> id, IpamIpamPoolState? state = null, CustomResourceOptions? options = null)
        {
            return new IpamIpamPool(name, id, state, options);
        }
    }

    public sealed class IpamIpamPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Input("allocationDefaultCidrMask")]
        public Input<int>? AllocationDefaultCidrMask { get; set; }

        /// <summary>
        /// The maximum network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Input("allocationMaxCidrMask")]
        public Input<int>? AllocationMaxCidrMask { get; set; }

        /// <summary>
        /// The minimum Network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Input("allocationMinCidrMask")]
        public Input<int>? AllocationMinCidrMask { get; set; }

        /// <summary>
        /// Whether the automatic import function is enabled for the address pool.
        /// </summary>
        [Input("autoImport")]
        public Input<bool>? AutoImport { get; set; }

        /// <summary>
        /// Whether to clear the default network mask of the IPAM address pool. Value:
        /// </summary>
        [Input("clearAllocationDefaultCidrMask")]
        public Input<bool>? ClearAllocationDefaultCidrMask { get; set; }

        /// <summary>
        /// The IP protocol version. Currently, only `IPv4` is supported * *.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// The description of the IPAM address pool.
        /// It must be 2 to 256 characters in length and must start with an English letter or a Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        /// </summary>
        [Input("ipamPoolDescription")]
        public Input<string>? IpamPoolDescription { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("ipamPoolName")]
        public Input<string>? IpamPoolName { get; set; }

        /// <summary>
        /// Ipam scope id.
        /// </summary>
        [Input("ipamScopeId", required: true)]
        public Input<string> IpamScopeId { get; set; } = null!;

        /// <summary>
        /// The effective region of the IPAM address pool.
        /// </summary>
        [Input("poolRegionId")]
        public Input<string>? PoolRegionId { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The instance ID of the source IPAM address pool.
        /// 
        /// &gt; **NOTE:**  If this parameter is not entered, the created address pool is the parent address pool.
        /// </summary>
        [Input("sourceIpamPoolId")]
        public Input<string>? SourceIpamPoolId { get; set; }

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

        public IpamIpamPoolArgs()
        {
        }
        public static new IpamIpamPoolArgs Empty => new IpamIpamPoolArgs();
    }

    public sealed class IpamIpamPoolState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Input("allocationDefaultCidrMask")]
        public Input<int>? AllocationDefaultCidrMask { get; set; }

        /// <summary>
        /// The maximum network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Input("allocationMaxCidrMask")]
        public Input<int>? AllocationMaxCidrMask { get; set; }

        /// <summary>
        /// The minimum Network mask assigned by the IPAM address pool.
        /// IPv4 network mask value range: **0 to 32** bits.
        /// </summary>
        [Input("allocationMinCidrMask")]
        public Input<int>? AllocationMinCidrMask { get; set; }

        /// <summary>
        /// Whether the automatic import function is enabled for the address pool.
        /// </summary>
        [Input("autoImport")]
        public Input<bool>? AutoImport { get; set; }

        /// <summary>
        /// Whether to clear the default network mask of the IPAM address pool. Value:
        /// </summary>
        [Input("clearAllocationDefaultCidrMask")]
        public Input<bool>? ClearAllocationDefaultCidrMask { get; set; }

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The IP protocol version. Currently, only `IPv4` is supported * *.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// The description of the IPAM address pool.
        /// It must be 2 to 256 characters in length and must start with an English letter or a Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        /// </summary>
        [Input("ipamPoolDescription")]
        public Input<string>? IpamPoolDescription { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("ipamPoolName")]
        public Input<string>? IpamPoolName { get; set; }

        /// <summary>
        /// Ipam scope id.
        /// </summary>
        [Input("ipamScopeId")]
        public Input<string>? IpamScopeId { get; set; }

        /// <summary>
        /// The effective region of the IPAM address pool.
        /// </summary>
        [Input("poolRegionId")]
        public Input<string>? PoolRegionId { get; set; }

        /// <summary>
        /// The ID of the IPAM hosting region.
        /// </summary>
        [Input("regionId")]
        public Input<string>? RegionId { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The instance ID of the source IPAM address pool.
        /// 
        /// &gt; **NOTE:**  If this parameter is not entered, the created address pool is the parent address pool.
        /// </summary>
        [Input("sourceIpamPoolId")]
        public Input<string>? SourceIpamPoolId { get; set; }

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

        public IpamIpamPoolState()
        {
        }
        public static new IpamIpamPoolState Empty => new IpamIpamPoolState();
    }
}
