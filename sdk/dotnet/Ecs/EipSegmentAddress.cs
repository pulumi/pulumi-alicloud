// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides a EIP Segment Address resource.
    /// 
    /// For information about EIP Segment Address and how to use it, see [What is Segment Address](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/allocateeipsegmentaddress).
    /// 
    /// &gt; **NOTE:** Available since v1.207.0.
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
    ///     var @default = new AliCloud.Ecs.EipSegmentAddress("default", new()
    ///     {
    ///         EipMask = "28",
    ///         Bandwidth = "5",
    ///         Isp = "BGP",
    ///         InternetChargeType = "PayByBandwidth",
    ///         Netmode = "public",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// EIP Segment Address can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ecs/eipSegmentAddress:EipSegmentAddress example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/eipSegmentAddress:EipSegmentAddress")]
    public partial class EipSegmentAddress : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
        /// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
        /// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
        /// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
        /// 
        /// Default value: `5`. Unit: Mbit/s.
        /// </summary>
        [Output("bandwidth")]
        public Output<string?> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The time when the contiguous Elastic IP address group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The subnet mask of the contiguous EIP group. Valid values:
        /// </summary>
        [Output("eipMask")]
        public Output<string> EipMask { get; private set; } = null!;

        /// <summary>
        /// The metering method of the contiguous EIP group. Valid values:
        /// - `PayByBandwidth` (default)
        /// - `PayByTraffic`
        /// </summary>
        [Output("internetChargeType")]
        public Output<string?> InternetChargeType { get; private set; } = null!;

        /// <summary>
        /// The line type. Valid values:
        /// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
        /// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
        /// 
        /// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
        /// 
        /// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
        /// - `ChinaTelecom`
        /// - `ChinaUnicom`
        /// - `ChinaMobile`
        /// - `ChinaTelecom_L2`
        /// - `ChinaUnicom_L2`
        /// - `ChinaMobile_L2`
        /// 
        /// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
        /// </summary>
        [Output("isp")]
        public Output<string?> Isp { get; private set; } = null!;

        /// <summary>
        /// The network type. Set the value to `public`, which specifies the public network type.
        /// </summary>
        [Output("netmode")]
        public Output<string?> Netmode { get; private set; } = null!;

        /// <summary>
        /// The resource group ID.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The name of the contiguous Elastic IP address group.
        /// </summary>
        [Output("segmentAddressName")]
        public Output<string> SegmentAddressName { get; private set; } = null!;

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The zone of the contiguous EIP group.
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a EipSegmentAddress resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EipSegmentAddress(string name, EipSegmentAddressArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/eipSegmentAddress:EipSegmentAddress", name, args ?? new EipSegmentAddressArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EipSegmentAddress(string name, Input<string> id, EipSegmentAddressState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/eipSegmentAddress:EipSegmentAddress", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EipSegmentAddress resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EipSegmentAddress Get(string name, Input<string> id, EipSegmentAddressState? state = null, CustomResourceOptions? options = null)
        {
            return new EipSegmentAddress(name, id, state, options);
        }
    }

    public sealed class EipSegmentAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
        /// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
        /// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
        /// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
        /// 
        /// Default value: `5`. Unit: Mbit/s.
        /// </summary>
        [Input("bandwidth")]
        public Input<string>? Bandwidth { get; set; }

        /// <summary>
        /// The subnet mask of the contiguous EIP group. Valid values:
        /// </summary>
        [Input("eipMask", required: true)]
        public Input<string> EipMask { get; set; } = null!;

        /// <summary>
        /// The metering method of the contiguous EIP group. Valid values:
        /// - `PayByBandwidth` (default)
        /// - `PayByTraffic`
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// The line type. Valid values:
        /// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
        /// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
        /// 
        /// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
        /// 
        /// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
        /// - `ChinaTelecom`
        /// - `ChinaUnicom`
        /// - `ChinaMobile`
        /// - `ChinaTelecom_L2`
        /// - `ChinaUnicom_L2`
        /// - `ChinaMobile_L2`
        /// 
        /// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
        /// </summary>
        [Input("isp")]
        public Input<string>? Isp { get; set; }

        /// <summary>
        /// The network type. Set the value to `public`, which specifies the public network type.
        /// </summary>
        [Input("netmode")]
        public Input<string>? Netmode { get; set; }

        /// <summary>
        /// The resource group ID.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The zone of the contiguous EIP group.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public EipSegmentAddressArgs()
        {
        }
        public static new EipSegmentAddressArgs Empty => new EipSegmentAddressArgs();
    }

    public sealed class EipSegmentAddressState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
        /// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByBandwidth`: `1` to `500`.****
        /// - Valid values when `InstanceChargeType` is set to `PostPaid` and `InternetChargeType` is set to `PayByTraffic`: `1` to `200`.****
        /// - Valid values when `InstanceChargeType` is set to `PrePaid`: `1` to `1000`.****
        /// 
        /// Default value: `5`. Unit: Mbit/s.
        /// </summary>
        [Input("bandwidth")]
        public Input<string>? Bandwidth { get; set; }

        /// <summary>
        /// The time when the contiguous Elastic IP address group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The subnet mask of the contiguous EIP group. Valid values:
        /// </summary>
        [Input("eipMask")]
        public Input<string>? EipMask { get; set; }

        /// <summary>
        /// The metering method of the contiguous EIP group. Valid values:
        /// - `PayByBandwidth` (default)
        /// - `PayByTraffic`
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// The line type. Valid values:
        /// - `BGP` (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
        /// - `BGP_PRO`: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
        /// 
        /// For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](https://www.alibabacloud.com/help/en/doc-detail/32321.html).
        /// 
        /// If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
        /// - `ChinaTelecom`
        /// - `ChinaUnicom`
        /// - `ChinaMobile`
        /// - `ChinaTelecom_L2`
        /// - `ChinaUnicom_L2`
        /// - `ChinaMobile_L2`
        /// 
        /// If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to `BGP_FinanceCloud`.
        /// </summary>
        [Input("isp")]
        public Input<string>? Isp { get; set; }

        /// <summary>
        /// The network type. Set the value to `public`, which specifies the public network type.
        /// </summary>
        [Input("netmode")]
        public Input<string>? Netmode { get; set; }

        /// <summary>
        /// The resource group ID.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The name of the contiguous Elastic IP address group.
        /// </summary>
        [Input("segmentAddressName")]
        public Input<string>? SegmentAddressName { get; set; }

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The zone of the contiguous EIP group.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public EipSegmentAddressState()
        {
        }
        public static new EipSegmentAddressState Empty => new EipSegmentAddressState();
    }
}