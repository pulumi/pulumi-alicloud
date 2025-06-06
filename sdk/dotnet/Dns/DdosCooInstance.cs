// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    /// <summary>
    /// Provides a BGP-line Anti-DDoS Pro(DdosCoo) Instance resource.
    /// 
    /// For information about BGP-line Anti-DDoS Pro(DdosCoo) Instance and how to use it, see [What is Anti-DDoS Pro Instance](https://www.alibabacloud.com/help/en/ddos-protection/latest/create-an-anti-ddos-pro-or-anti-ddos-premium-instance-by-calling-an-api-operation).
    /// 
    /// &gt; **NOTE:** Available since v1.37.0.
    /// 
    /// &gt; **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.
    /// 
    /// &gt; **NOTE:** From version 1.214.0, if `product_type` is set to `ddoscoo` or `ddoscoo_intl`, the provider `region` should be set to `cn-hangzhou`, and if `product_type` is set to `ddosDip`, the provider `region` should be set to `ap-southeast-1`.
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
    ///     var name = config.Get("name") ?? "tf-example";
    ///     var @default = new AliCloud.Ddos.DdosCooInstance("default", new()
    ///     {
    ///         Name = name,
    ///         BaseBandwidth = "30",
    ///         Bandwidth = "30",
    ///         ServiceBandwidth = "100",
    ///         PortCount = "50",
    ///         DomainCount = "50",
    ///         ProductType = "ddoscoo",
    ///         Period = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DdosCoo Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:dns/ddosCooInstance:DdosCooInstance example &lt;id&gt;
    /// ```
    /// </summary>
    [Obsolete(@"alicloud.dns.DdosCooInstance has been deprecated in favor of alicloud.ddos.DdosCooInstance")]
    [AliCloudResourceType("alicloud:dns/ddosCooInstance:DdosCooInstance")]
    public partial class DdosCooInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`. **NOTE:** `address_type` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Output("addressType")]
        public Output<string> AddressType { get; private set; } = null!;

        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Output("bandwidth")]
        public Output<string> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The mitigation plan of the instance. Valid values:
        /// </summary>
        [Output("bandwidthMode")]
        public Output<string?> BandwidthMode { get; private set; } = null!;

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `base_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Output("baseBandwidth")]
        public Output<string> BaseBandwidth { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.248.0) The time when the instance was created.
        /// </summary>
        [Output("createTime")]
        public Output<int> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Output("domainCount")]
        public Output<string> DomainCount { get; private set; } = null!;

        /// <summary>
        /// The mitigation plan of the instance. Default value: `coop`. Valid values:
        /// </summary>
        [Output("editionSale")]
        public Output<string> EditionSale { get; private set; } = null!;

        /// <summary>
        /// The function plan of the instance. Valid values:
        /// </summary>
        [Output("functionVersion")]
        public Output<string> FunctionVersion { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.212.0) The IP address of the Instance.
        /// </summary>
        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        /// <summary>
        /// The type of modification. Valid values: `UPGRADE`, `DOWNGRADE`.
        /// </summary>
        [Output("modifyType")]
        public Output<string?> ModifyType { get; private set; } = null!;

        /// <summary>
        /// Name of the instance. This name can have a string of `1` to `64` characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The clean bandwidth provided by the instance. **NOTE:** `normal_bandwidth` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_bandwidth` can be modified.
        /// </summary>
        [Output("normalBandwidth")]
        public Output<string> NormalBandwidth { get; private set; } = null!;

        /// <summary>
        /// The clean QPS provided by the instance. **NOTE:** `normal_qps` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_qps` can be modified.
        /// </summary>
        [Output("normalQps")]
        public Output<string> NormalQps { get; private set; } = null!;

        /// <summary>
        /// The duration that you will buy DdosCoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Output("portCount")]
        public Output<string> PortCount { get; private set; } = null!;

        /// <summary>
        /// The mitigation plan of the instance. Valid values:
        /// </summary>
        [Output("productPlan")]
        public Output<string> ProductPlan { get; private set; } = null!;

        /// <summary>
        /// The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
        /// </summary>
        [Output("productType")]
        public Output<string?> ProductType { get; private set; } = null!;

        /// <summary>
        /// Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade. **NOTE:** `service_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Output("serviceBandwidth")]
        public Output<string> ServiceBandwidth { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.248.0) The status of the instance.
        /// </summary>
        [Output("status")]
        public Output<int> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a DdosCooInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DdosCooInstance(string name, DdosCooInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dns/ddosCooInstance:DdosCooInstance", name, args ?? new DdosCooInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DdosCooInstance(string name, Input<string> id, DdosCooInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dns/ddosCooInstance:DdosCooInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DdosCooInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DdosCooInstance Get(string name, Input<string> id, DdosCooInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new DdosCooInstance(name, id, state, options);
        }
    }

    public sealed class DdosCooInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`. **NOTE:** `address_type` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Input("addressType")]
        public Input<string>? AddressType { get; set; }

        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Input("bandwidth")]
        public Input<string>? Bandwidth { get; set; }

        /// <summary>
        /// The mitigation plan of the instance. Valid values:
        /// </summary>
        [Input("bandwidthMode")]
        public Input<string>? BandwidthMode { get; set; }

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `base_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Input("baseBandwidth")]
        public Input<string>? BaseBandwidth { get; set; }

        /// <summary>
        /// Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Input("domainCount", required: true)]
        public Input<string> DomainCount { get; set; } = null!;

        /// <summary>
        /// The mitigation plan of the instance. Default value: `coop`. Valid values:
        /// </summary>
        [Input("editionSale")]
        public Input<string>? EditionSale { get; set; }

        /// <summary>
        /// The function plan of the instance. Valid values:
        /// </summary>
        [Input("functionVersion")]
        public Input<string>? FunctionVersion { get; set; }

        /// <summary>
        /// The type of modification. Valid values: `UPGRADE`, `DOWNGRADE`.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        /// <summary>
        /// Name of the instance. This name can have a string of `1` to `64` characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The clean bandwidth provided by the instance. **NOTE:** `normal_bandwidth` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_bandwidth` can be modified.
        /// </summary>
        [Input("normalBandwidth")]
        public Input<string>? NormalBandwidth { get; set; }

        /// <summary>
        /// The clean QPS provided by the instance. **NOTE:** `normal_qps` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_qps` can be modified.
        /// </summary>
        [Input("normalQps")]
        public Input<string>? NormalQps { get; set; }

        /// <summary>
        /// The duration that you will buy DdosCoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Input("portCount", required: true)]
        public Input<string> PortCount { get; set; } = null!;

        /// <summary>
        /// The mitigation plan of the instance. Valid values:
        /// </summary>
        [Input("productPlan")]
        public Input<string>? ProductPlan { get; set; }

        /// <summary>
        /// The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
        /// </summary>
        [Input("productType")]
        public Input<string>? ProductType { get; set; }

        /// <summary>
        /// Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade. **NOTE:** `service_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Input("serviceBandwidth")]
        public Input<string>? ServiceBandwidth { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DdosCooInstanceArgs()
        {
        }
        public static new DdosCooInstanceArgs Empty => new DdosCooInstanceArgs();
    }

    public sealed class DdosCooInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`. **NOTE:** `address_type` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Input("addressType")]
        public Input<string>? AddressType { get; set; }

        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Input("bandwidth")]
        public Input<string>? Bandwidth { get; set; }

        /// <summary>
        /// The mitigation plan of the instance. Valid values:
        /// </summary>
        [Input("bandwidthMode")]
        public Input<string>? BandwidthMode { get; set; }

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `base_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Input("baseBandwidth")]
        public Input<string>? BaseBandwidth { get; set; }

        /// <summary>
        /// (Available since v1.248.0) The time when the instance was created.
        /// </summary>
        [Input("createTime")]
        public Input<int>? CreateTime { get; set; }

        /// <summary>
        /// Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Input("domainCount")]
        public Input<string>? DomainCount { get; set; }

        /// <summary>
        /// The mitigation plan of the instance. Default value: `coop`. Valid values:
        /// </summary>
        [Input("editionSale")]
        public Input<string>? EditionSale { get; set; }

        /// <summary>
        /// The function plan of the instance. Valid values:
        /// </summary>
        [Input("functionVersion")]
        public Input<string>? FunctionVersion { get; set; }

        /// <summary>
        /// (Available since v1.212.0) The IP address of the Instance.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// The type of modification. Valid values: `UPGRADE`, `DOWNGRADE`.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        /// <summary>
        /// Name of the instance. This name can have a string of `1` to `64` characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The clean bandwidth provided by the instance. **NOTE:** `normal_bandwidth` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_bandwidth` can be modified.
        /// </summary>
        [Input("normalBandwidth")]
        public Input<string>? NormalBandwidth { get; set; }

        /// <summary>
        /// The clean QPS provided by the instance. **NOTE:** `normal_qps` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_qps` can be modified.
        /// </summary>
        [Input("normalQps")]
        public Input<string>? NormalQps { get; set; }

        /// <summary>
        /// The duration that you will buy DdosCoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Input("portCount")]
        public Input<string>? PortCount { get; set; }

        /// <summary>
        /// The mitigation plan of the instance. Valid values:
        /// </summary>
        [Input("productPlan")]
        public Input<string>? ProductPlan { get; set; }

        /// <summary>
        /// The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
        /// </summary>
        [Input("productType")]
        public Input<string>? ProductType { get; set; }

        /// <summary>
        /// Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade. **NOTE:** `service_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
        /// </summary>
        [Input("serviceBandwidth")]
        public Input<string>? ServiceBandwidth { get; set; }

        /// <summary>
        /// (Available since v1.248.0) The status of the instance.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DdosCooInstanceState()
        {
        }
        public static new DdosCooInstanceState Empty => new DdosCooInstanceState();
    }
}
