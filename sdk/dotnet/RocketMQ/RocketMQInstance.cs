// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ
{
    /// <summary>
    /// ## Import
    /// 
    /// RocketMQ Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:rocketmq/rocketMQInstance:RocketMQInstance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:rocketmq/rocketMQInstance:RocketMQInstance")]
    public partial class RocketMQInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether to enable auto-renewal. This parameter is only applicable when the payment type for the instance is Subscription (prepaid).
        /// - true: Enable auto-renewal
        /// - false: Disable auto-renewal.
        /// </summary>
        [Output("autoRenew")]
        public Output<bool?> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// Auto-renewal period. This parameter is only valid when auto-renewal is enabled. The values can be as follows: 1, 2, 3, 6, 12.
        /// </summary>
        [Output("autoRenewPeriod")]
        public Output<int?> AutoRenewPeriod { get; private set; } = null!;

        /// <summary>
        /// The minimum periodic unit for the duration of auto-renewal. This parameter is only valid when auto-renewal is enabled. Valid values: `Month`, `Year`.
        /// </summary>
        [Output("autoRenewPeriodUnit")]
        public Output<string> AutoRenewPeriodUnit { get; private set; } = null!;

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The name of instance.
        /// </summary>
        [Output("instanceName")]
        public Output<string?> InstanceName { get; private set; } = null!;

        /// <summary>
        /// Instance network configuration information. See `network_info` below.
        /// </summary>
        [Output("networkInfo")]
        public Output<Outputs.RocketMQInstanceNetworkInfo> NetworkInfo { get; private set; } = null!;

        /// <summary>
        /// The payment type for the instance. Alibaba Cloud Message Queue RocketMQ version supports two types of payment. The parameter values are as follows:
        /// - PayAsYouGo: Pay-as-you-go, a post-payment model where you pay after usage.
        /// - Subscription: Subscription-based, a pre-payment model where you pay before usage.
        /// For more information, please refer to [Billing Methods](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/overview-2).
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// Duration of purchase. This parameter is only valid when the payment type for the instance is Subscription (prepaid). The values can be as follows:
        /// - Monthly purchase: 1, 2, 3, 4, 5, 6
        /// - Annual purchase: 1, 2, 3.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The minimum periodic unit for the duration of purchase. The parameter values are as follows:
        /// - Month: Purchase on a monthly basis
        /// - Year: Purchase on an annual basis.
        /// </summary>
        [Output("periodUnit")]
        public Output<string> PeriodUnit { get; private set; } = null!;

        /// <summary>
        /// product info. See `product_info` below.
        /// </summary>
        [Output("productInfo")]
        public Output<Outputs.RocketMQInstanceProductInfo?> ProductInfo { get; private set; } = null!;

        /// <summary>
        /// Custom description.
        /// </summary>
        [Output("remark")]
        public Output<string?> Remark { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The primary series encoding for the instance. For specific differences between the primary series, please refer to [Product Selection](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/instance-selection). The parameter values are as follows:
        /// - standard: Standard Edition
        /// - ultimate: Platinum Edition
        /// - professional: Professional Edition.
        /// </summary>
        [Output("seriesCode")]
        public Output<string> SeriesCode { get; private set; } = null!;

        /// <summary>
        /// The code of the service code instance. The code of the RocketMQ is rmq.
        /// </summary>
        [Output("serviceCode")]
        public Output<string> ServiceCode { get; private set; } = null!;

        /// <summary>
        /// Instance software information. See `software` below.
        /// </summary>
        [Output("software")]
        public Output<Outputs.RocketMQInstanceSoftware> Software { get; private set; } = null!;

        /// <summary>
        /// The status of the instance.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The sub-series encoding for the instance. For specific differences between the sub-series, please refer to [Product Selection](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/instance-selection). The parameter values are as follows:
        /// - cluster_ha: Cluster High Availability Edition
        /// - single_node: Single Node Testing Edition
        /// When selecting the primary series as ultimate (Platinum Edition), the sub-series can only be chosen as cluster_ha (Cluster High Availability Edition).
        /// </summary>
        [Output("subSeriesCode")]
        public Output<string> SubSeriesCode { get; private set; } = null!;

        /// <summary>
        /// The resource label.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a RocketMQInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RocketMQInstance(string name, RocketMQInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/rocketMQInstance:RocketMQInstance", name, args ?? new RocketMQInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RocketMQInstance(string name, Input<string> id, RocketMQInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/rocketMQInstance:RocketMQInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RocketMQInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RocketMQInstance Get(string name, Input<string> id, RocketMQInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new RocketMQInstance(name, id, state, options);
        }
    }

    public sealed class RocketMQInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable auto-renewal. This parameter is only applicable when the payment type for the instance is Subscription (prepaid).
        /// - true: Enable auto-renewal
        /// - false: Disable auto-renewal.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// Auto-renewal period. This parameter is only valid when auto-renewal is enabled. The values can be as follows: 1, 2, 3, 6, 12.
        /// </summary>
        [Input("autoRenewPeriod")]
        public Input<int>? AutoRenewPeriod { get; set; }

        /// <summary>
        /// The minimum periodic unit for the duration of auto-renewal. This parameter is only valid when auto-renewal is enabled. Valid values: `Month`, `Year`.
        /// </summary>
        [Input("autoRenewPeriodUnit")]
        public Input<string>? AutoRenewPeriodUnit { get; set; }

        /// <summary>
        /// The name of instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Instance network configuration information. See `network_info` below.
        /// </summary>
        [Input("networkInfo", required: true)]
        public Input<Inputs.RocketMQInstanceNetworkInfoArgs> NetworkInfo { get; set; } = null!;

        /// <summary>
        /// The payment type for the instance. Alibaba Cloud Message Queue RocketMQ version supports two types of payment. The parameter values are as follows:
        /// - PayAsYouGo: Pay-as-you-go, a post-payment model where you pay after usage.
        /// - Subscription: Subscription-based, a pre-payment model where you pay before usage.
        /// For more information, please refer to [Billing Methods](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/overview-2).
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// Duration of purchase. This parameter is only valid when the payment type for the instance is Subscription (prepaid). The values can be as follows:
        /// - Monthly purchase: 1, 2, 3, 4, 5, 6
        /// - Annual purchase: 1, 2, 3.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The minimum periodic unit for the duration of purchase. The parameter values are as follows:
        /// - Month: Purchase on a monthly basis
        /// - Year: Purchase on an annual basis.
        /// </summary>
        [Input("periodUnit")]
        public Input<string>? PeriodUnit { get; set; }

        /// <summary>
        /// product info. See `product_info` below.
        /// </summary>
        [Input("productInfo")]
        public Input<Inputs.RocketMQInstanceProductInfoArgs>? ProductInfo { get; set; }

        /// <summary>
        /// Custom description.
        /// </summary>
        [Input("remark")]
        public Input<string>? Remark { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The primary series encoding for the instance. For specific differences between the primary series, please refer to [Product Selection](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/instance-selection). The parameter values are as follows:
        /// - standard: Standard Edition
        /// - ultimate: Platinum Edition
        /// - professional: Professional Edition.
        /// </summary>
        [Input("seriesCode", required: true)]
        public Input<string> SeriesCode { get; set; } = null!;

        /// <summary>
        /// The code of the service code instance. The code of the RocketMQ is rmq.
        /// </summary>
        [Input("serviceCode", required: true)]
        public Input<string> ServiceCode { get; set; } = null!;

        /// <summary>
        /// Instance software information. See `software` below.
        /// </summary>
        [Input("software")]
        public Input<Inputs.RocketMQInstanceSoftwareArgs>? Software { get; set; }

        /// <summary>
        /// The sub-series encoding for the instance. For specific differences between the sub-series, please refer to [Product Selection](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/instance-selection). The parameter values are as follows:
        /// - cluster_ha: Cluster High Availability Edition
        /// - single_node: Single Node Testing Edition
        /// When selecting the primary series as ultimate (Platinum Edition), the sub-series can only be chosen as cluster_ha (Cluster High Availability Edition).
        /// </summary>
        [Input("subSeriesCode", required: true)]
        public Input<string> SubSeriesCode { get; set; } = null!;

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The resource label.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public RocketMQInstanceArgs()
        {
        }
        public static new RocketMQInstanceArgs Empty => new RocketMQInstanceArgs();
    }

    public sealed class RocketMQInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable auto-renewal. This parameter is only applicable when the payment type for the instance is Subscription (prepaid).
        /// - true: Enable auto-renewal
        /// - false: Disable auto-renewal.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// Auto-renewal period. This parameter is only valid when auto-renewal is enabled. The values can be as follows: 1, 2, 3, 6, 12.
        /// </summary>
        [Input("autoRenewPeriod")]
        public Input<int>? AutoRenewPeriod { get; set; }

        /// <summary>
        /// The minimum periodic unit for the duration of auto-renewal. This parameter is only valid when auto-renewal is enabled. Valid values: `Month`, `Year`.
        /// </summary>
        [Input("autoRenewPeriodUnit")]
        public Input<string>? AutoRenewPeriodUnit { get; set; }

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The name of instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Instance network configuration information. See `network_info` below.
        /// </summary>
        [Input("networkInfo")]
        public Input<Inputs.RocketMQInstanceNetworkInfoGetArgs>? NetworkInfo { get; set; }

        /// <summary>
        /// The payment type for the instance. Alibaba Cloud Message Queue RocketMQ version supports two types of payment. The parameter values are as follows:
        /// - PayAsYouGo: Pay-as-you-go, a post-payment model where you pay after usage.
        /// - Subscription: Subscription-based, a pre-payment model where you pay before usage.
        /// For more information, please refer to [Billing Methods](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/overview-2).
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Duration of purchase. This parameter is only valid when the payment type for the instance is Subscription (prepaid). The values can be as follows:
        /// - Monthly purchase: 1, 2, 3, 4, 5, 6
        /// - Annual purchase: 1, 2, 3.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The minimum periodic unit for the duration of purchase. The parameter values are as follows:
        /// - Month: Purchase on a monthly basis
        /// - Year: Purchase on an annual basis.
        /// </summary>
        [Input("periodUnit")]
        public Input<string>? PeriodUnit { get; set; }

        /// <summary>
        /// product info. See `product_info` below.
        /// </summary>
        [Input("productInfo")]
        public Input<Inputs.RocketMQInstanceProductInfoGetArgs>? ProductInfo { get; set; }

        /// <summary>
        /// Custom description.
        /// </summary>
        [Input("remark")]
        public Input<string>? Remark { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The primary series encoding for the instance. For specific differences between the primary series, please refer to [Product Selection](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/instance-selection). The parameter values are as follows:
        /// - standard: Standard Edition
        /// - ultimate: Platinum Edition
        /// - professional: Professional Edition.
        /// </summary>
        [Input("seriesCode")]
        public Input<string>? SeriesCode { get; set; }

        /// <summary>
        /// The code of the service code instance. The code of the RocketMQ is rmq.
        /// </summary>
        [Input("serviceCode")]
        public Input<string>? ServiceCode { get; set; }

        /// <summary>
        /// Instance software information. See `software` below.
        /// </summary>
        [Input("software")]
        public Input<Inputs.RocketMQInstanceSoftwareGetArgs>? Software { get; set; }

        /// <summary>
        /// The status of the instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The sub-series encoding for the instance. For specific differences between the sub-series, please refer to [Product Selection](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/instance-selection). The parameter values are as follows:
        /// - cluster_ha: Cluster High Availability Edition
        /// - single_node: Single Node Testing Edition
        /// When selecting the primary series as ultimate (Platinum Edition), the sub-series can only be chosen as cluster_ha (Cluster High Availability Edition).
        /// </summary>
        [Input("subSeriesCode")]
        public Input<string>? SubSeriesCode { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The resource label.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public RocketMQInstanceState()
        {
        }
        public static new RocketMQInstanceState Empty => new RocketMQInstanceState();
    }
}