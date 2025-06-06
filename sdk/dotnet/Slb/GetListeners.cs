// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static class GetListeners
    {
        /// <summary>
        /// This data source provides the listeners related to a server load balancer of the current Alibaba Cloud user.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = new AliCloud.Slb.ApplicationLoadBalancer("default", new()
        ///     {
        ///         LoadBalancerName = "tf-testAccSlbListenertcp",
        ///     });
        /// 
        ///     var tcp = new AliCloud.Slb.Listener("tcp", new()
        ///     {
        ///         LoadBalancerId = @default.Id,
        ///         BackendPort = 22,
        ///         FrontendPort = 22,
        ///         Protocol = "tcp",
        ///         Bandwidth = 10,
        ///         HealthCheckType = "tcp",
        ///         PersistenceTimeout = 3600,
        ///         HealthyThreshold = 8,
        ///         UnhealthyThreshold = 8,
        ///         HealthCheckTimeout = 8,
        ///         HealthCheckInterval = 5,
        ///         HealthCheckHttpCode = "http_2xx",
        ///         HealthCheckConnectPort = 20,
        ///         HealthCheckUri = "/console",
        ///         EstablishedTimeout = 600,
        ///     });
        /// 
        ///     var sampleDs = AliCloud.Slb.GetListeners.Invoke(new()
        ///     {
        ///         LoadBalancerId = @default.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbListenerProtocol"] = sampleDs.Apply(getListenersResult =&gt; getListenersResult.SlbListeners[0]?.Protocol),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetListenersResult> InvokeAsync(GetListenersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetListenersResult>("alicloud:slb/getListeners:getListeners", args ?? new GetListenersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the listeners related to a server load balancer of the current Alibaba Cloud user.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = new AliCloud.Slb.ApplicationLoadBalancer("default", new()
        ///     {
        ///         LoadBalancerName = "tf-testAccSlbListenertcp",
        ///     });
        /// 
        ///     var tcp = new AliCloud.Slb.Listener("tcp", new()
        ///     {
        ///         LoadBalancerId = @default.Id,
        ///         BackendPort = 22,
        ///         FrontendPort = 22,
        ///         Protocol = "tcp",
        ///         Bandwidth = 10,
        ///         HealthCheckType = "tcp",
        ///         PersistenceTimeout = 3600,
        ///         HealthyThreshold = 8,
        ///         UnhealthyThreshold = 8,
        ///         HealthCheckTimeout = 8,
        ///         HealthCheckInterval = 5,
        ///         HealthCheckHttpCode = "http_2xx",
        ///         HealthCheckConnectPort = 20,
        ///         HealthCheckUri = "/console",
        ///         EstablishedTimeout = 600,
        ///     });
        /// 
        ///     var sampleDs = AliCloud.Slb.GetListeners.Invoke(new()
        ///     {
        ///         LoadBalancerId = @default.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbListenerProtocol"] = sampleDs.Apply(getListenersResult =&gt; getListenersResult.SlbListeners[0]?.Protocol),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetListenersResult> Invoke(GetListenersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetListenersResult>("alicloud:slb/getListeners:getListeners", args ?? new GetListenersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the listeners related to a server load balancer of the current Alibaba Cloud user.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = new AliCloud.Slb.ApplicationLoadBalancer("default", new()
        ///     {
        ///         LoadBalancerName = "tf-testAccSlbListenertcp",
        ///     });
        /// 
        ///     var tcp = new AliCloud.Slb.Listener("tcp", new()
        ///     {
        ///         LoadBalancerId = @default.Id,
        ///         BackendPort = 22,
        ///         FrontendPort = 22,
        ///         Protocol = "tcp",
        ///         Bandwidth = 10,
        ///         HealthCheckType = "tcp",
        ///         PersistenceTimeout = 3600,
        ///         HealthyThreshold = 8,
        ///         UnhealthyThreshold = 8,
        ///         HealthCheckTimeout = 8,
        ///         HealthCheckInterval = 5,
        ///         HealthCheckHttpCode = "http_2xx",
        ///         HealthCheckConnectPort = 20,
        ///         HealthCheckUri = "/console",
        ///         EstablishedTimeout = 600,
        ///     });
        /// 
        ///     var sampleDs = AliCloud.Slb.GetListeners.Invoke(new()
        ///     {
        ///         LoadBalancerId = @default.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbListenerProtocol"] = sampleDs.Apply(getListenersResult =&gt; getListenersResult.SlbListeners[0]?.Protocol),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetListenersResult> Invoke(GetListenersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetListenersResult>("alicloud:slb/getListeners:getListeners", args ?? new GetListenersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetListenersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter results by SLB listener description.
        /// </summary>
        [Input("descriptionRegex")]
        public string? DescriptionRegex { get; set; }

        /// <summary>
        /// Filter listeners by the specified frontend port.
        /// </summary>
        [Input("frontendPort")]
        public int? FrontendPort { get; set; }

        /// <summary>
        /// ID of the SLB with listeners.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public string LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Filter listeners by the specified protocol. Valid values: `http`, `https`, `tcp` and `udp`.
        /// </summary>
        [Input("protocol")]
        public string? Protocol { get; set; }

        public GetListenersArgs()
        {
        }
        public static new GetListenersArgs Empty => new GetListenersArgs();
    }

    public sealed class GetListenersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter results by SLB listener description.
        /// </summary>
        [Input("descriptionRegex")]
        public Input<string>? DescriptionRegex { get; set; }

        /// <summary>
        /// Filter listeners by the specified frontend port.
        /// </summary>
        [Input("frontendPort")]
        public Input<int>? FrontendPort { get; set; }

        /// <summary>
        /// ID of the SLB with listeners.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<string> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Filter listeners by the specified protocol. Valid values: `http`, `https`, `tcp` and `udp`.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        public GetListenersInvokeArgs()
        {
        }
        public static new GetListenersInvokeArgs Empty => new GetListenersInvokeArgs();
    }


    [OutputType]
    public sealed class GetListenersResult
    {
        public readonly string? DescriptionRegex;
        /// <summary>
        /// Frontend port used to receive incoming traffic and distribute it to the backend servers.
        /// </summary>
        public readonly int? FrontendPort;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string LoadBalancerId;
        public readonly string? OutputFile;
        /// <summary>
        /// Listener protocol. Possible values: `http`, `https`, `tcp` and `udp`.
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// A list of SLB listeners. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetListenersSlbListenerResult> SlbListeners;

        [OutputConstructor]
        private GetListenersResult(
            string? descriptionRegex,

            int? frontendPort,

            string id,

            string loadBalancerId,

            string? outputFile,

            string? protocol,

            ImmutableArray<Outputs.GetListenersSlbListenerResult> slbListeners)
        {
            DescriptionRegex = descriptionRegex;
            FrontendPort = frontendPort;
            Id = id;
            LoadBalancerId = loadBalancerId;
            OutputFile = outputFile;
            Protocol = protocol;
            SlbListeners = slbListeners;
        }
    }
}
