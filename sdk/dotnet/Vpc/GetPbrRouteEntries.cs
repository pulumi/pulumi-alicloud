// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetPbrRouteEntries
    {
        /// <summary>
        /// &gt; **NOTE:** Available in v1.162.0+.
        /// 
        /// The data source lists a number of VPN Pbr Route Entries resource information owned by an Alicloud account.
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
        ///     var ids = AliCloud.Vpc.GetPbrRouteEntries.Invoke(new()
        ///     {
        ///         VpnGatewayId = "example_vpn_gateway_id",
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpnIpsecServerId1"] = ids.Apply(getPbrRouteEntriesResult =&gt; getPbrRouteEntriesResult.Entries[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetPbrRouteEntriesResult> InvokeAsync(GetPbrRouteEntriesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPbrRouteEntriesResult>("alicloud:vpc/getPbrRouteEntries:getPbrRouteEntries", args ?? new GetPbrRouteEntriesArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **NOTE:** Available in v1.162.0+.
        /// 
        /// The data source lists a number of VPN Pbr Route Entries resource information owned by an Alicloud account.
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
        ///     var ids = AliCloud.Vpc.GetPbrRouteEntries.Invoke(new()
        ///     {
        ///         VpnGatewayId = "example_vpn_gateway_id",
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpnIpsecServerId1"] = ids.Apply(getPbrRouteEntriesResult =&gt; getPbrRouteEntriesResult.Entries[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetPbrRouteEntriesResult> Invoke(GetPbrRouteEntriesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPbrRouteEntriesResult>("alicloud:vpc/getPbrRouteEntries:getPbrRouteEntries", args ?? new GetPbrRouteEntriesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **NOTE:** Available in v1.162.0+.
        /// 
        /// The data source lists a number of VPN Pbr Route Entries resource information owned by an Alicloud account.
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
        ///     var ids = AliCloud.Vpc.GetPbrRouteEntries.Invoke(new()
        ///     {
        ///         VpnGatewayId = "example_vpn_gateway_id",
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpnIpsecServerId1"] = ids.Apply(getPbrRouteEntriesResult =&gt; getPbrRouteEntriesResult.Entries[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetPbrRouteEntriesResult> Invoke(GetPbrRouteEntriesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPbrRouteEntriesResult>("alicloud:vpc/getPbrRouteEntries:getPbrRouteEntries", args ?? new GetPbrRouteEntriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPbrRouteEntriesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of VPN Pbr Route Entries IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the VPN gateway.
        /// </summary>
        [Input("vpnGatewayId", required: true)]
        public string VpnGatewayId { get; set; } = null!;

        public GetPbrRouteEntriesArgs()
        {
        }
        public static new GetPbrRouteEntriesArgs Empty => new GetPbrRouteEntriesArgs();
    }

    public sealed class GetPbrRouteEntriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of VPN Pbr Route Entries IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the VPN gateway.
        /// </summary>
        [Input("vpnGatewayId", required: true)]
        public Input<string> VpnGatewayId { get; set; } = null!;

        public GetPbrRouteEntriesInvokeArgs()
        {
        }
        public static new GetPbrRouteEntriesInvokeArgs Empty => new GetPbrRouteEntriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetPbrRouteEntriesResult
    {
        /// <summary>
        /// A list of VPN Pbr Route Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPbrRouteEntriesEntryResult> Entries;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// The ID of the vpn gateway.
        /// </summary>
        public readonly string VpnGatewayId;

        [OutputConstructor]
        private GetPbrRouteEntriesResult(
            ImmutableArray<Outputs.GetPbrRouteEntriesEntryResult> entries,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string vpnGatewayId)
        {
            Entries = entries;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            VpnGatewayId = vpnGatewayId;
        }
    }
}
