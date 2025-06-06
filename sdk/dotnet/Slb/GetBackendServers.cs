// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static class GetBackendServers
    {
        /// <summary>
        /// This data source provides the server load balancer backend servers related to a server load balancer..
        /// 
        /// &gt; **NOTE:** Available in 1.53.0+
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
        ///     var sampleDs = AliCloud.Slb.GetBackendServers.Invoke(new()
        ///     {
        ///         LoadBalancerId = sampleSlb.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbBackendServerId"] = sampleDs.Apply(getBackendServersResult =&gt; getBackendServersResult.BackendServers[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetBackendServersResult> InvokeAsync(GetBackendServersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBackendServersResult>("alicloud:slb/getBackendServers:getBackendServers", args ?? new GetBackendServersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the server load balancer backend servers related to a server load balancer..
        /// 
        /// &gt; **NOTE:** Available in 1.53.0+
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
        ///     var sampleDs = AliCloud.Slb.GetBackendServers.Invoke(new()
        ///     {
        ///         LoadBalancerId = sampleSlb.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbBackendServerId"] = sampleDs.Apply(getBackendServersResult =&gt; getBackendServersResult.BackendServers[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBackendServersResult> Invoke(GetBackendServersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBackendServersResult>("alicloud:slb/getBackendServers:getBackendServers", args ?? new GetBackendServersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the server load balancer backend servers related to a server load balancer..
        /// 
        /// &gt; **NOTE:** Available in 1.53.0+
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
        ///     var sampleDs = AliCloud.Slb.GetBackendServers.Invoke(new()
        ///     {
        ///         LoadBalancerId = sampleSlb.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbBackendServerId"] = sampleDs.Apply(getBackendServersResult =&gt; getBackendServersResult.BackendServers[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBackendServersResult> Invoke(GetBackendServersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetBackendServersResult>("alicloud:slb/getBackendServers:getBackendServers", args ?? new GetBackendServersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBackendServersArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// List of attached ECS instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the SLB with attachments.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public string LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetBackendServersArgs()
        {
        }
        public static new GetBackendServersArgs Empty => new GetBackendServersArgs();
    }

    public sealed class GetBackendServersInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// List of attached ECS instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the SLB with attachments.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<string> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetBackendServersInvokeArgs()
        {
        }
        public static new GetBackendServersInvokeArgs Empty => new GetBackendServersInvokeArgs();
    }


    [OutputType]
    public sealed class GetBackendServersResult
    {
        public readonly ImmutableArray<Outputs.GetBackendServersBackendServerResult> BackendServers;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string LoadBalancerId;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetBackendServersResult(
            ImmutableArray<Outputs.GetBackendServersBackendServerResult> backendServers,

            string id,

            ImmutableArray<string> ids,

            string loadBalancerId,

            string? outputFile)
        {
            BackendServers = backendServers;
            Id = id;
            Ids = ids;
            LoadBalancerId = loadBalancerId;
            OutputFile = outputFile;
        }
    }
}
