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
    /// Provides a Vpc Ipam Ipam Pool Allocation resource.
    /// 
    /// Allocates or reserves a CIDR from an IPAM address pool.
    /// 
    /// For information about Vpc Ipam Ipam Pool Allocation and how to use it, see [What is Ipam Pool Allocation](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamPoolAllocation).
    /// 
    /// &gt; **NOTE:** Available since v1.238.0.
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
    ///     var defaultIpam = new AliCloud.Vpc.IpamIpam("defaultIpam", new()
    ///     {
    ///         OperatingRegionLists = new[]
    ///         {
    ///             "cn-hangzhou",
    ///         },
    ///     });
    /// 
    ///     var defaultIpamPool = new AliCloud.Vpc.IpamIpamPool("defaultIpamPool", new()
    ///     {
    ///         IpamScopeId = defaultIpam.PrivateDefaultScopeId,
    ///         PoolRegionId = "cn-hangzhou",
    ///     });
    /// 
    ///     var defaultIpamPoolCidr = new AliCloud.Vpc.IpamIpamPoolCidr("defaultIpamPoolCidr", new()
    ///     {
    ///         Cidr = "10.0.0.0/8",
    ///         IpamPoolId = defaultIpamPool.Id,
    ///     });
    /// 
    ///     var @default = new AliCloud.Vpc.IpamIpamPoolAllocation("default", new()
    ///     {
    ///         IpamPoolAllocationDescription = "init alloc desc",
    ///         IpamPoolAllocationName = name,
    ///         Cidr = "10.0.0.0/20",
    ///         IpamPoolId = defaultIpamPoolCidr.IpamPoolId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Vpc Ipam Ipam Pool Allocation can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:vpc/ipamIpamPoolAllocation:IpamIpamPoolAllocation example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpc/ipamIpamPoolAllocation:IpamIpamPoolAllocation")]
    public partial class IpamIpamPoolAllocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The allocated address segment.
        /// </summary>
        [Output("cidr")]
        public Output<string> Cidr { get; private set; } = null!;

        /// <summary>
        /// Create a custom reserved network segment from The IPAM address pool by entering a mask.
        /// 
        /// &gt; **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        /// </summary>
        [Output("cidrMask")]
        public Output<int?> CidrMask { get; private set; } = null!;

        /// <summary>
        /// Instance creation time.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The description of the ipam pool alloctaion.
        /// It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        /// </summary>
        [Output("ipamPoolAllocationDescription")]
        public Output<string?> IpamPoolAllocationDescription { get; private set; } = null!;

        /// <summary>
        /// The name of the ipam pool allocation.
        /// It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        /// </summary>
        [Output("ipamPoolAllocationName")]
        public Output<string?> IpamPoolAllocationName { get; private set; } = null!;

        /// <summary>
        /// The ID of the IPAM Pool.
        /// </summary>
        [Output("ipamPoolId")]
        public Output<string> IpamPoolId { get; private set; } = null!;

        /// <summary>
        /// When the IPAM Pool to which CIDR is allocated has the region attribute, this attribute is the IPAM Pool region.
        /// When the IPAM Pool to which CIDR is allocated does not have the region attribute, this attribute is the IPAM region.
        /// </summary>
        [Output("regionId")]
        public Output<string> RegionId { get; private set; } = null!;

        /// <summary>
        /// The status of the instance. Value:
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a IpamIpamPoolAllocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IpamIpamPoolAllocation(string name, IpamIpamPoolAllocationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/ipamIpamPoolAllocation:IpamIpamPoolAllocation", name, args ?? new IpamIpamPoolAllocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IpamIpamPoolAllocation(string name, Input<string> id, IpamIpamPoolAllocationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/ipamIpamPoolAllocation:IpamIpamPoolAllocation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IpamIpamPoolAllocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IpamIpamPoolAllocation Get(string name, Input<string> id, IpamIpamPoolAllocationState? state = null, CustomResourceOptions? options = null)
        {
            return new IpamIpamPoolAllocation(name, id, state, options);
        }
    }

    public sealed class IpamIpamPoolAllocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The allocated address segment.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// Create a custom reserved network segment from The IPAM address pool by entering a mask.
        /// 
        /// &gt; **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        /// </summary>
        [Input("cidrMask")]
        public Input<int>? CidrMask { get; set; }

        /// <summary>
        /// The description of the ipam pool alloctaion.
        /// It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        /// </summary>
        [Input("ipamPoolAllocationDescription")]
        public Input<string>? IpamPoolAllocationDescription { get; set; }

        /// <summary>
        /// The name of the ipam pool allocation.
        /// It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        /// </summary>
        [Input("ipamPoolAllocationName")]
        public Input<string>? IpamPoolAllocationName { get; set; }

        /// <summary>
        /// The ID of the IPAM Pool.
        /// </summary>
        [Input("ipamPoolId", required: true)]
        public Input<string> IpamPoolId { get; set; } = null!;

        public IpamIpamPoolAllocationArgs()
        {
        }
        public static new IpamIpamPoolAllocationArgs Empty => new IpamIpamPoolAllocationArgs();
    }

    public sealed class IpamIpamPoolAllocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The allocated address segment.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// Create a custom reserved network segment from The IPAM address pool by entering a mask.
        /// 
        /// &gt; **NOTE:**  Enter at least one of `Cidr` or **CidrMask.
        /// </summary>
        [Input("cidrMask")]
        public Input<int>? CidrMask { get; set; }

        /// <summary>
        /// Instance creation time.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The description of the ipam pool alloctaion.
        /// It must be 1 to 256 characters in length and must start with an English letter or Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
        /// </summary>
        [Input("ipamPoolAllocationDescription")]
        public Input<string>? IpamPoolAllocationDescription { get; set; }

        /// <summary>
        /// The name of the ipam pool allocation.
        /// It must be 1 to 128 characters in length and cannot start with 'http:// 'or 'https.
        /// </summary>
        [Input("ipamPoolAllocationName")]
        public Input<string>? IpamPoolAllocationName { get; set; }

        /// <summary>
        /// The ID of the IPAM Pool.
        /// </summary>
        [Input("ipamPoolId")]
        public Input<string>? IpamPoolId { get; set; }

        /// <summary>
        /// When the IPAM Pool to which CIDR is allocated has the region attribute, this attribute is the IPAM Pool region.
        /// When the IPAM Pool to which CIDR is allocated does not have the region attribute, this attribute is the IPAM region.
        /// </summary>
        [Input("regionId")]
        public Input<string>? RegionId { get; set; }

        /// <summary>
        /// The status of the instance. Value:
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public IpamIpamPoolAllocationState()
        {
        }
        public static new IpamIpamPoolAllocationState Empty => new IpamIpamPoolAllocationState();
    }
}
