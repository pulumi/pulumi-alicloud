// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pvtz
{
    public static class GetZones
    {
        /// <summary>
        /// This data source provides the Private Zones of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.13.0.
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
        ///     var name = config.Get("name") ?? "terraform-example.com";
        ///     var @default = new AliCloud.Pvtz.Zone("default", new()
        ///     {
        ///         ZoneName = name,
        ///     });
        /// 
        ///     var ids = AliCloud.Pvtz.GetZones.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["pvtzZonesId0"] = ids.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetZonesResult> InvokeAsync(GetZonesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZonesResult>("alicloud:pvtz/getZones:getZones", args ?? new GetZonesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Private Zones of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.13.0.
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
        ///     var name = config.Get("name") ?? "terraform-example.com";
        ///     var @default = new AliCloud.Pvtz.Zone("default", new()
        ///     {
        ///         ZoneName = name,
        ///     });
        /// 
        ///     var ids = AliCloud.Pvtz.GetZones.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["pvtzZonesId0"] = ids.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetZonesResult> Invoke(GetZonesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZonesResult>("alicloud:pvtz/getZones:getZones", args ?? new GetZonesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Private Zones of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.13.0.
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
        ///     var name = config.Get("name") ?? "terraform-example.com";
        ///     var @default = new AliCloud.Pvtz.Zone("default", new()
        ///     {
        ///         ZoneName = name,
        ///     });
        /// 
        ///     var ids = AliCloud.Pvtz.GetZones.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["pvtzZonesId0"] = ids.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetZonesResult> Invoke(GetZonesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZonesResult>("alicloud:pvtz/getZones:getZones", args ?? new GetZonesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZonesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to query the detailed list of resource attributes. Default value: `false`.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Zones IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The keyword of the zone name.
        /// </summary>
        [Input("keyword")]
        public string? Keyword { get; set; }

        /// <summary>
        /// The language of the response. Default value: `en`. Valid values: `en`, `zh`.
        /// </summary>
        [Input("lang")]
        public string? Lang { get; set; }

        /// <summary>
        /// A regex string to filter results by Zone name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The region ID of the virtual private cloud (VPC) associated with the zone.
        /// </summary>
        [Input("queryRegionId")]
        public string? QueryRegionId { get; set; }

        /// <summary>
        /// The ID of the VPC associated with the zone.
        /// </summary>
        [Input("queryVpcId")]
        public string? QueryVpcId { get; set; }

        /// <summary>
        /// The ID of the resource group to which the zone belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The search mode. The value of Keyword is the search scope. Default value: `LIKE`. Valid values:
        /// - `LIKE`: Fuzzy search.
        /// - `EXACT`: Exact search.
        /// </summary>
        [Input("searchMode")]
        public string? SearchMode { get; set; }

        public GetZonesArgs()
        {
        }
        public static new GetZonesArgs Empty => new GetZonesArgs();
    }

    public sealed class GetZonesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to query the detailed list of resource attributes. Default value: `false`.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Zones IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The keyword of the zone name.
        /// </summary>
        [Input("keyword")]
        public Input<string>? Keyword { get; set; }

        /// <summary>
        /// The language of the response. Default value: `en`. Valid values: `en`, `zh`.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// A regex string to filter results by Zone name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The region ID of the virtual private cloud (VPC) associated with the zone.
        /// </summary>
        [Input("queryRegionId")]
        public Input<string>? QueryRegionId { get; set; }

        /// <summary>
        /// The ID of the VPC associated with the zone.
        /// </summary>
        [Input("queryVpcId")]
        public Input<string>? QueryVpcId { get; set; }

        /// <summary>
        /// The ID of the resource group to which the zone belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The search mode. The value of Keyword is the search scope. Default value: `LIKE`. Valid values:
        /// - `LIKE`: Fuzzy search.
        /// - `EXACT`: Exact search.
        /// </summary>
        [Input("searchMode")]
        public Input<string>? SearchMode { get; set; }

        public GetZonesInvokeArgs()
        {
        }
        public static new GetZonesInvokeArgs Empty => new GetZonesInvokeArgs();
    }


    [OutputType]
    public sealed class GetZonesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Keyword;
        public readonly string? Lang;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Zone names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? QueryRegionId;
        public readonly string? QueryVpcId;
        /// <summary>
        /// The ID of the resource group to which the zone belongs.
        /// </summary>
        public readonly string? ResourceGroupId;
        public readonly string? SearchMode;
        /// <summary>
        /// A list of Zone. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZonesZoneResult> Zones;

        [OutputConstructor]
        private GetZonesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? keyword,

            string? lang,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? queryRegionId,

            string? queryVpcId,

            string? resourceGroupId,

            string? searchMode,

            ImmutableArray<Outputs.GetZonesZoneResult> zones)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Keyword = keyword;
            Lang = lang;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            QueryRegionId = queryRegionId;
            QueryVpcId = queryVpcId;
            ResourceGroupId = resourceGroupId;
            SearchMode = searchMode;
            Zones = zones;
        }
    }
}
