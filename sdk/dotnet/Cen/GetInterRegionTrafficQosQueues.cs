// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetInterRegionTrafficQosQueues
    {
        /// <summary>
        /// This data source provides Cen Inter Region Traffic Qos Queue available to the user.
        /// 
        /// &gt; **NOTE:** Available in 1.195.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.Cen.GetInterRegionTrafficQosQueues.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             alicloud_cen_inter_region_traffic_qos_queue.Default.Id,
        ///         },
        ///         NameRegex = alicloud_cen_inter_region_traffic_qos_queue.Default.Name,
        ///         TrafficQosPolicyId = "qos-xxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudCenInterRegionTrafficQosQueueExampleId"] = @default.Apply(@default =&gt; @default.Apply(getInterRegionTrafficQosQueuesResult =&gt; getInterRegionTrafficQosQueuesResult.Queues[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInterRegionTrafficQosQueuesResult> InvokeAsync(GetInterRegionTrafficQosQueuesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInterRegionTrafficQosQueuesResult>("alicloud:cen/getInterRegionTrafficQosQueues:getInterRegionTrafficQosQueues", args ?? new GetInterRegionTrafficQosQueuesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Cen Inter Region Traffic Qos Queue available to the user.
        /// 
        /// &gt; **NOTE:** Available in 1.195.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.Cen.GetInterRegionTrafficQosQueues.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             alicloud_cen_inter_region_traffic_qos_queue.Default.Id,
        ///         },
        ///         NameRegex = alicloud_cen_inter_region_traffic_qos_queue.Default.Name,
        ///         TrafficQosPolicyId = "qos-xxxxxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudCenInterRegionTrafficQosQueueExampleId"] = @default.Apply(@default =&gt; @default.Apply(getInterRegionTrafficQosQueuesResult =&gt; getInterRegionTrafficQosQueuesResult.Queues[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInterRegionTrafficQosQueuesResult> Invoke(GetInterRegionTrafficQosQueuesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInterRegionTrafficQosQueuesResult>("alicloud:cen/getInterRegionTrafficQosQueues:getInterRegionTrafficQosQueues", args ?? new GetInterRegionTrafficQosQueuesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInterRegionTrafficQosQueuesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Inter Region Traffic Qos Queue IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the traffic scheduling policy.
        /// </summary>
        [Input("trafficQosPolicyId", required: true)]
        public string TrafficQosPolicyId { get; set; } = null!;

        public GetInterRegionTrafficQosQueuesArgs()
        {
        }
        public static new GetInterRegionTrafficQosQueuesArgs Empty => new GetInterRegionTrafficQosQueuesArgs();
    }

    public sealed class GetInterRegionTrafficQosQueuesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Inter Region Traffic Qos Queue IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the traffic scheduling policy.
        /// </summary>
        [Input("trafficQosPolicyId", required: true)]
        public Input<string> TrafficQosPolicyId { get; set; } = null!;

        public GetInterRegionTrafficQosQueuesInvokeArgs()
        {
        }
        public static new GetInterRegionTrafficQosQueuesInvokeArgs Empty => new GetInterRegionTrafficQosQueuesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInterRegionTrafficQosQueuesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Inter Region Traffic Qos Queue IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of name of Inter Region Traffic Qos Queues.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Inter Region Traffic Qos Queue Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInterRegionTrafficQosQueuesQueueResult> Queues;
        /// <summary>
        /// The ID of the traffic scheduling policy.
        /// </summary>
        public readonly string TrafficQosPolicyId;

        [OutputConstructor]
        private GetInterRegionTrafficQosQueuesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetInterRegionTrafficQosQueuesQueueResult> queues,

            string trafficQosPolicyId)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Queues = queues;
            TrafficQosPolicyId = trafficQosPolicyId;
        }
    }
}