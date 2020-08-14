// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cassandra
{
    public static class GetZones
    {
        /// <summary>
        /// This data source provides availability zones for Cassandra that can be accessed by an Alibaba Cloud account within the region configured in the provider.
        /// 
        /// &gt; **NOTE:** Available in v1.88.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var zonesIds = Output.Create(AliCloud.Cassandra.GetZones.InvokeAsync());
        ///         // Create an Cassandra cluster with the first matched zone
        ///         var cassandra = new AliCloud.Cassandra.Cluster("cassandra", new AliCloud.Cassandra.ClusterArgs
        ///         {
        ///             ZoneId = zonesIds.Apply(zonesIds =&gt; zonesIds.Zones[0].Id),
        ///         });
        ///         // Other properties...
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetZonesResult> InvokeAsync(GetZonesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetZonesResult>("alicloud:cassandra/getZones:getZones", args ?? new GetZonesArgs(), options.WithVersion());
    }


    public sealed class GetZonesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch Cassandra clusters.
        /// </summary>
        [Input("multi")]
        public bool? Multi { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetZonesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetZonesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of zone IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly bool? Multi;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of availability zones. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZonesZoneResult> Zones;

        [OutputConstructor]
        private GetZonesResult(
            string id,

            ImmutableArray<string> ids,

            bool? multi,

            string? outputFile,

            ImmutableArray<Outputs.GetZonesZoneResult> zones)
        {
            Id = id;
            Ids = ids;
            Multi = multi;
            OutputFile = outputFile;
            Zones = zones;
        }
    }
}