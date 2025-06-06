// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetTrafficMirrorSessions
    {
        /// <summary>
        /// This data source provides the Vpc Traffic Mirror Sessions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var ids = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         NameRegex = "^my-TrafficMirrorSession",
        ///     });
        /// 
        ///     var enabled = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Enabled = false,
        ///     });
        /// 
        ///     var priority = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Priority = 1,
        ///     });
        /// 
        ///     var filterId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorFilterId = "example_value",
        ///     });
        /// 
        ///     var sessionName = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorSessionName = "example_value",
        ///     });
        /// 
        ///     var sourceId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorSourceId = "example_value",
        ///     });
        /// 
        ///     var targetId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorTargetId = "example_value",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Status = "Created",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcTrafficMirrorSessionId1"] = ids.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId2"] = nameRegex.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId3"] = enabled.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId4"] = priority.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId5"] = filterId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId6"] = sessionName.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId7"] = sourceId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId8"] = targetId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId9"] = status.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTrafficMirrorSessionsResult> InvokeAsync(GetTrafficMirrorSessionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTrafficMirrorSessionsResult>("alicloud:vpc/getTrafficMirrorSessions:getTrafficMirrorSessions", args ?? new GetTrafficMirrorSessionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Traffic Mirror Sessions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var ids = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         NameRegex = "^my-TrafficMirrorSession",
        ///     });
        /// 
        ///     var enabled = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Enabled = false,
        ///     });
        /// 
        ///     var priority = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Priority = 1,
        ///     });
        /// 
        ///     var filterId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorFilterId = "example_value",
        ///     });
        /// 
        ///     var sessionName = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorSessionName = "example_value",
        ///     });
        /// 
        ///     var sourceId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorSourceId = "example_value",
        ///     });
        /// 
        ///     var targetId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorTargetId = "example_value",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Status = "Created",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcTrafficMirrorSessionId1"] = ids.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId2"] = nameRegex.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId3"] = enabled.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId4"] = priority.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId5"] = filterId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId6"] = sessionName.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId7"] = sourceId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId8"] = targetId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId9"] = status.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTrafficMirrorSessionsResult> Invoke(GetTrafficMirrorSessionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficMirrorSessionsResult>("alicloud:vpc/getTrafficMirrorSessions:getTrafficMirrorSessions", args ?? new GetTrafficMirrorSessionsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Traffic Mirror Sessions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var ids = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         NameRegex = "^my-TrafficMirrorSession",
        ///     });
        /// 
        ///     var enabled = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Enabled = false,
        ///     });
        /// 
        ///     var priority = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Priority = 1,
        ///     });
        /// 
        ///     var filterId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorFilterId = "example_value",
        ///     });
        /// 
        ///     var sessionName = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorSessionName = "example_value",
        ///     });
        /// 
        ///     var sourceId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorSourceId = "example_value",
        ///     });
        /// 
        ///     var targetId = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         TrafficMirrorTargetId = "example_value",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetTrafficMirrorSessions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         Status = "Created",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcTrafficMirrorSessionId1"] = ids.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId2"] = nameRegex.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId3"] = enabled.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId4"] = priority.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId5"] = filterId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId6"] = sessionName.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId7"] = sourceId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId8"] = targetId.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///         ["vpcTrafficMirrorSessionId9"] = status.Apply(getTrafficMirrorSessionsResult =&gt; getTrafficMirrorSessionsResult.Sessions[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTrafficMirrorSessionsResult> Invoke(GetTrafficMirrorSessionsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficMirrorSessionsResult>("alicloud:vpc/getTrafficMirrorSessions:getTrafficMirrorSessions", args ?? new GetTrafficMirrorSessionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrafficMirrorSessionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies whether to enable traffic mirror sessions. default to `false`.
        /// </summary>
        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Traffic Mirror Session IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Traffic Mirror Session name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        /// </summary>
        [Input("priority")]
        public int? Priority { get; set; }

        /// <summary>
        /// The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The ID of the filter.
        /// </summary>
        [Input("trafficMirrorFilterId")]
        public string? TrafficMirrorFilterId { get; set; }

        /// <summary>
        /// The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        /// </summary>
        [Input("trafficMirrorSessionName")]
        public string? TrafficMirrorSessionName { get; set; }

        /// <summary>
        /// The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source.
        /// </summary>
        [Input("trafficMirrorSourceId")]
        public string? TrafficMirrorSourceId { get; set; }

        /// <summary>
        /// The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        /// </summary>
        [Input("trafficMirrorTargetId")]
        public string? TrafficMirrorTargetId { get; set; }

        public GetTrafficMirrorSessionsArgs()
        {
        }
        public static new GetTrafficMirrorSessionsArgs Empty => new GetTrafficMirrorSessionsArgs();
    }

    public sealed class GetTrafficMirrorSessionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies whether to enable traffic mirror sessions. default to `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Traffic Mirror Session IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Traffic Mirror Session name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the filter.
        /// </summary>
        [Input("trafficMirrorFilterId")]
        public Input<string>? TrafficMirrorFilterId { get; set; }

        /// <summary>
        /// The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        /// </summary>
        [Input("trafficMirrorSessionName")]
        public Input<string>? TrafficMirrorSessionName { get; set; }

        /// <summary>
        /// The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source.
        /// </summary>
        [Input("trafficMirrorSourceId")]
        public Input<string>? TrafficMirrorSourceId { get; set; }

        /// <summary>
        /// The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        /// </summary>
        [Input("trafficMirrorTargetId")]
        public Input<string>? TrafficMirrorTargetId { get; set; }

        public GetTrafficMirrorSessionsInvokeArgs()
        {
        }
        public static new GetTrafficMirrorSessionsInvokeArgs Empty => new GetTrafficMirrorSessionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetTrafficMirrorSessionsResult
    {
        public readonly bool? Enabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? Priority;
        public readonly ImmutableArray<Outputs.GetTrafficMirrorSessionsSessionResult> Sessions;
        public readonly string? Status;
        public readonly string? TrafficMirrorFilterId;
        public readonly string? TrafficMirrorSessionName;
        public readonly string? TrafficMirrorSourceId;
        public readonly string? TrafficMirrorTargetId;

        [OutputConstructor]
        private GetTrafficMirrorSessionsResult(
            bool? enabled,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? priority,

            ImmutableArray<Outputs.GetTrafficMirrorSessionsSessionResult> sessions,

            string? status,

            string? trafficMirrorFilterId,

            string? trafficMirrorSessionName,

            string? trafficMirrorSourceId,

            string? trafficMirrorTargetId)
        {
            Enabled = enabled;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Priority = priority;
            Sessions = sessions;
            Status = status;
            TrafficMirrorFilterId = trafficMirrorFilterId;
            TrafficMirrorSessionName = trafficMirrorSessionName;
            TrafficMirrorSourceId = trafficMirrorSourceId;
            TrafficMirrorTargetId = trafficMirrorTargetId;
        }
    }
}
