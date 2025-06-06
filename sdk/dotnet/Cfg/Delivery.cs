// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg
{
    /// <summary>
    /// Provides a Config Delivery resource.
    /// 
    /// Delivery channel of current account.
    /// 
    /// For information about Config Delivery and how to use it, see [What is Delivery](https://www.alibabacloud.com/help/en/cloud-config/latest/api-config-2020-09-07-createconfigdeliverychannel).
    /// 
    /// &gt; **NOTE:** Available since v1.171.0.
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
    ///     var name = config.Get("name") ?? "tf-example-sls";
    ///     var @this = AliCloud.GetAccount.Invoke();
    /// 
    ///     var thisGetRegions = AliCloud.GetRegions.Invoke(new()
    ///     {
    ///         Current = true,
    ///     });
    /// 
    ///     var @default = new AliCloud.Log.Project("default", new()
    ///     {
    ///         ProjectName = name,
    ///     });
    /// 
    ///     var defaultStore = new AliCloud.Log.Store("default", new()
    ///     {
    ///         LogstoreName = name,
    ///         ProjectName = @default.ProjectName,
    ///     });
    /// 
    ///     var defaultDelivery = new AliCloud.Cfg.Delivery("default", new()
    ///     {
    ///         ConfigurationItemChangeNotification = true,
    ///         NonCompliantNotification = true,
    ///         DeliveryChannelName = name,
    ///         DeliveryChannelTargetArn = Output.Tuple(thisGetRegions, @this, @default.ProjectName, defaultStore.LogstoreName).Apply(values =&gt;
    ///         {
    ///             var thisGetRegions = values.Item1;
    ///             var @this = values.Item2;
    ///             var projectName = values.Item3;
    ///             var logstoreName = values.Item4;
    ///             return $"acs:log:{thisGetRegions.Apply(getRegionsResult =&gt; getRegionsResult.Ids[0])}:{@this.Apply(getAccountResult =&gt; getAccountResult.Id)}:project/{projectName}/logstore/{logstoreName}";
    ///         }),
    ///         DeliveryChannelType = "SLS",
    ///         Description = name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Config Delivery can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:cfg/delivery:Delivery example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cfg/delivery:Delivery")]
    public partial class Delivery : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:  
        /// - true: The specified destination receives resource change logs.
        /// - false: The specified destination does not receive resource change logs.
        /// </summary>
        [Output("configurationItemChangeNotification")]
        public Output<bool?> ConfigurationItemChangeNotification { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:  
        /// - true: The specified destination receives scheduled resource snapshots.
        /// - false: The specified destination does not receive scheduled resource snapshots.
        /// </summary>
        [Output("configurationSnapshot")]
        public Output<bool?> ConfigurationSnapshot { get; private set; } = null!;

        /// <summary>
        /// The rule that is attached to the delivery channel.  
        /// 
        /// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
        /// 
        /// If you specify the risk level or resource types for subscription events, this is as follows:
        /// 
        /// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
        /// 
        /// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
        /// 
        /// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
        /// </summary>
        [Output("deliveryChannelCondition")]
        public Output<string?> DeliveryChannelCondition { get; private set; } = null!;

        /// <summary>
        /// The name of the delivery channel.
        /// </summary>
        [Output("deliveryChannelName")]
        public Output<string?> DeliveryChannelName { get; private set; } = null!;

        /// <summary>
        /// The ARN of the delivery destination.  
        /// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
        /// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
        /// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
        /// </summary>
        [Output("deliveryChannelTargetArn")]
        public Output<string> DeliveryChannelTargetArn { get; private set; } = null!;

        /// <summary>
        /// The type of the delivery channel. Valid values:  
        /// - OSS: Object Storage Service (OSS)
        /// - MNS: Message Service (MNS)
        /// - SLS: Log Service
        /// </summary>
        [Output("deliveryChannelType")]
        public Output<string> DeliveryChannelType { get; private set; } = null!;

        /// <summary>
        /// The description of the delivery channel.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:  
        /// - true: The specified destination receives resource non-compliance events.
        /// - false: The specified destination does not receive resource non-compliance events.
        /// </summary>
        [Output("nonCompliantNotification")]
        public Output<bool?> NonCompliantNotification { get; private set; } = null!;

        /// <summary>
        /// The oss ARN of the delivery channel when the value data oversized limit.  The value must be in one of the following formats:  acs:oss:{RegionId}:{Aliuid}:{bucketName} if your delivery destination is an Object Storage Service (OSS) bucket.
        /// </summary>
        [Output("oversizedDataOssTargetArn")]
        public Output<string?> OversizedDataOssTargetArn { get; private set; } = null!;

        /// <summary>
        /// The status of the delivery channel. Valid values:  
        /// - 0: The delivery channel is disabled.
        /// - 1: The delivery channel is enabled.
        /// </summary>
        [Output("status")]
        public Output<int> Status { get; private set; } = null!;


        /// <summary>
        /// Create a Delivery resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Delivery(string name, DeliveryArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cfg/delivery:Delivery", name, args ?? new DeliveryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Delivery(string name, Input<string> id, DeliveryState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cfg/delivery:Delivery", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Delivery resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Delivery Get(string name, Input<string> id, DeliveryState? state = null, CustomResourceOptions? options = null)
        {
            return new Delivery(name, id, state, options);
        }
    }

    public sealed class DeliveryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:  
        /// - true: The specified destination receives resource change logs.
        /// - false: The specified destination does not receive resource change logs.
        /// </summary>
        [Input("configurationItemChangeNotification")]
        public Input<bool>? ConfigurationItemChangeNotification { get; set; }

        /// <summary>
        /// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:  
        /// - true: The specified destination receives scheduled resource snapshots.
        /// - false: The specified destination does not receive scheduled resource snapshots.
        /// </summary>
        [Input("configurationSnapshot")]
        public Input<bool>? ConfigurationSnapshot { get; set; }

        /// <summary>
        /// The rule that is attached to the delivery channel.  
        /// 
        /// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
        /// 
        /// If you specify the risk level or resource types for subscription events, this is as follows:
        /// 
        /// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
        /// 
        /// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
        /// 
        /// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
        /// </summary>
        [Input("deliveryChannelCondition")]
        public Input<string>? DeliveryChannelCondition { get; set; }

        /// <summary>
        /// The name of the delivery channel.
        /// </summary>
        [Input("deliveryChannelName")]
        public Input<string>? DeliveryChannelName { get; set; }

        /// <summary>
        /// The ARN of the delivery destination.  
        /// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
        /// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
        /// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
        /// </summary>
        [Input("deliveryChannelTargetArn", required: true)]
        public Input<string> DeliveryChannelTargetArn { get; set; } = null!;

        /// <summary>
        /// The type of the delivery channel. Valid values:  
        /// - OSS: Object Storage Service (OSS)
        /// - MNS: Message Service (MNS)
        /// - SLS: Log Service
        /// </summary>
        [Input("deliveryChannelType", required: true)]
        public Input<string> DeliveryChannelType { get; set; } = null!;

        /// <summary>
        /// The description of the delivery channel.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:  
        /// - true: The specified destination receives resource non-compliance events.
        /// - false: The specified destination does not receive resource non-compliance events.
        /// </summary>
        [Input("nonCompliantNotification")]
        public Input<bool>? NonCompliantNotification { get; set; }

        /// <summary>
        /// The oss ARN of the delivery channel when the value data oversized limit.  The value must be in one of the following formats:  acs:oss:{RegionId}:{Aliuid}:{bucketName} if your delivery destination is an Object Storage Service (OSS) bucket.
        /// </summary>
        [Input("oversizedDataOssTargetArn")]
        public Input<string>? OversizedDataOssTargetArn { get; set; }

        /// <summary>
        /// The status of the delivery channel. Valid values:  
        /// - 0: The delivery channel is disabled.
        /// - 1: The delivery channel is enabled.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        public DeliveryArgs()
        {
        }
        public static new DeliveryArgs Empty => new DeliveryArgs();
    }

    public sealed class DeliveryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:  
        /// - true: The specified destination receives resource change logs.
        /// - false: The specified destination does not receive resource change logs.
        /// </summary>
        [Input("configurationItemChangeNotification")]
        public Input<bool>? ConfigurationItemChangeNotification { get; set; }

        /// <summary>
        /// Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at 04:00Z and 16:00Z to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:  
        /// - true: The specified destination receives scheduled resource snapshots.
        /// - false: The specified destination does not receive scheduled resource snapshots.
        /// </summary>
        [Input("configurationSnapshot")]
        public Input<bool>? ConfigurationSnapshot { get; set; }

        /// <summary>
        /// The rule that is attached to the delivery channel.  
        /// 
        /// This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
        /// 
        /// If you specify the risk level or resource types for subscription events, this is as follows:
        /// 
        /// The lowest risk level of the events to which you want to subscribe is in the following format: {"filterType":"RuleRiskLevel","value":"1","multiple":false}, The value field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
        /// 
        /// The setting of the resource types of the events to which you want to subscribe is in the following format: {"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}, The values field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array.
        /// 
        /// Examples:[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}].
        /// </summary>
        [Input("deliveryChannelCondition")]
        public Input<string>? DeliveryChannelCondition { get; set; }

        /// <summary>
        /// The name of the delivery channel.
        /// </summary>
        [Input("deliveryChannelName")]
        public Input<string>? DeliveryChannelName { get; set; }

        /// <summary>
        /// The ARN of the delivery destination.  
        /// - If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
        /// - If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
        /// - If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
        /// </summary>
        [Input("deliveryChannelTargetArn")]
        public Input<string>? DeliveryChannelTargetArn { get; set; }

        /// <summary>
        /// The type of the delivery channel. Valid values:  
        /// - OSS: Object Storage Service (OSS)
        /// - MNS: Message Service (MNS)
        /// - SLS: Log Service
        /// </summary>
        [Input("deliveryChannelType")]
        public Input<string>? DeliveryChannelType { get; set; }

        /// <summary>
        /// The description of the delivery channel.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:  
        /// - true: The specified destination receives resource non-compliance events.
        /// - false: The specified destination does not receive resource non-compliance events.
        /// </summary>
        [Input("nonCompliantNotification")]
        public Input<bool>? NonCompliantNotification { get; set; }

        /// <summary>
        /// The oss ARN of the delivery channel when the value data oversized limit.  The value must be in one of the following formats:  acs:oss:{RegionId}:{Aliuid}:{bucketName} if your delivery destination is an Object Storage Service (OSS) bucket.
        /// </summary>
        [Input("oversizedDataOssTargetArn")]
        public Input<string>? OversizedDataOssTargetArn { get; set; }

        /// <summary>
        /// The status of the delivery channel. Valid values:  
        /// - 0: The delivery channel is disabled.
        /// - 1: The delivery channel is enabled.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        public DeliveryState()
        {
        }
        public static new DeliveryState Empty => new DeliveryState();
    }
}
