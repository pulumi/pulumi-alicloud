// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    public static class GetListeners
    {
        /// <summary>
        /// This data source provides the Application Load Balancer (ALB) Listeners of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
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
        ///     var ids = AliCloud.Alb.GetListeners.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["albListenerId1"] = ids.Apply(getListenersResult =&gt; getListenersResult.Listeners[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetListenersResult> InvokeAsync(GetListenersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetListenersResult>("alicloud:alb/getListeners:getListeners", args ?? new GetListenersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Application Load Balancer (ALB) Listeners of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
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
        ///     var ids = AliCloud.Alb.GetListeners.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["albListenerId1"] = ids.Apply(getListenersResult =&gt; getListenersResult.Listeners[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetListenersResult> Invoke(GetListenersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetListenersResult>("alicloud:alb/getListeners:getListeners", args ?? new GetListenersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Application Load Balancer (ALB) Listeners of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
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
        ///     var ids = AliCloud.Alb.GetListeners.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["albListenerId1"] = ids.Apply(getListenersResult =&gt; getListenersResult.Listeners[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetListenersResult> Invoke(GetListenersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetListenersResult>("alicloud:alb/getListeners:getListeners", args ?? new GetListenersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetListenersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Listener IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("listenerIds")]
        private List<string>? _listenerIds;

        /// <summary>
        /// The listener ids.
        /// </summary>
        public List<string> ListenerIds
        {
            get => _listenerIds ?? (_listenerIds = new List<string>());
            set => _listenerIds = value;
        }

        /// <summary>
        /// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
        /// </summary>
        [Input("listenerProtocol")]
        public string? ListenerProtocol { get; set; }

        [Input("loadBalancerIds")]
        private List<string>? _loadBalancerIds;

        /// <summary>
        /// The load balancer ids.
        /// </summary>
        public List<string> LoadBalancerIds
        {
            get => _loadBalancerIds ?? (_loadBalancerIds = new List<string>());
            set => _loadBalancerIds = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The state of the listener. Valid Values: `Running` Or `Stopped`. `Running`: The listener is running. `Stopped`: The listener is stopped.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetListenersArgs()
        {
        }
        public static new GetListenersArgs Empty => new GetListenersArgs();
    }

    public sealed class GetListenersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Listener IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("listenerIds")]
        private InputList<string>? _listenerIds;

        /// <summary>
        /// The listener ids.
        /// </summary>
        public InputList<string> ListenerIds
        {
            get => _listenerIds ?? (_listenerIds = new InputList<string>());
            set => _listenerIds = value;
        }

        /// <summary>
        /// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
        /// </summary>
        [Input("listenerProtocol")]
        public Input<string>? ListenerProtocol { get; set; }

        [Input("loadBalancerIds")]
        private InputList<string>? _loadBalancerIds;

        /// <summary>
        /// The load balancer ids.
        /// </summary>
        public InputList<string> LoadBalancerIds
        {
            get => _loadBalancerIds ?? (_loadBalancerIds = new InputList<string>());
            set => _loadBalancerIds = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The state of the listener. Valid Values: `Running` Or `Stopped`. `Running`: The listener is running. `Stopped`: The listener is stopped.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetListenersInvokeArgs()
        {
        }
        public static new GetListenersInvokeArgs Empty => new GetListenersInvokeArgs();
    }


    [OutputType]
    public sealed class GetListenersResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<string> ListenerIds;
        public readonly string? ListenerProtocol;
        public readonly ImmutableArray<Outputs.GetListenersListenerResult> Listeners;
        public readonly ImmutableArray<string> LoadBalancerIds;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetListenersResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<string> listenerIds,

            string? listenerProtocol,

            ImmutableArray<Outputs.GetListenersListenerResult> listeners,

            ImmutableArray<string> loadBalancerIds,

            string? outputFile,

            string? status)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            ListenerIds = listenerIds;
            ListenerProtocol = listenerProtocol;
            Listeners = listeners;
            LoadBalancerIds = loadBalancerIds;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
