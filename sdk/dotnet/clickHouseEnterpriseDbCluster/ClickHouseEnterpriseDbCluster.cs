// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.clickHouseEnterpriseDbCluster
{
    /// <summary>
    /// Provides a Click House Enterprise D B Cluster resource.
    /// 
    /// Enterprise Edition Cluster Resources.
    /// 
    /// For information about Click House Enterprise D B Cluster and how to use it, see [What is Enterprise D B Cluster](https://next.api.alibabacloud.com/document/clickhouse/2023-05-22/CreateDBInstance).
    /// 
    /// &gt; **NOTE:** Available since v1.247.0.
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
    ///     var vswIpRangeI = config.Get("vswIpRangeI") ?? "172.16.1.0/24";
    ///     var regionId = config.Get("regionId") ?? "cn-beijing";
    ///     var vpcIpRange = config.Get("vpcIpRange") ?? "172.16.0.0/12";
    ///     var vswIpRangeK = config.Get("vswIpRangeK") ?? "172.16.3.0/24";
    ///     var vswIpRangeL = config.Get("vswIpRangeL") ?? "172.16.2.0/24";
    ///     var zoneIdI = config.Get("zoneIdI") ?? "cn-beijing-i";
    ///     var zoneIdL = config.Get("zoneIdL") ?? "cn-beijing-l";
    ///     var zoneIdK = config.Get("zoneIdK") ?? "cn-beijing-k";
    ///     var defaultktKLuM = new AliCloud.Vpc.Network("defaultktKLuM", new()
    ///     {
    ///         CidrBlock = vpcIpRange,
    ///     });
    /// 
    ///     var defaultTQWN3k = new AliCloud.Vpc.Switch("defaultTQWN3k", new()
    ///     {
    ///         VpcId = defaultktKLuM.Id,
    ///         ZoneId = zoneIdI,
    ///         CidrBlock = vswIpRangeI,
    ///     });
    /// 
    ///     var defaultylyLu8 = new AliCloud.Vpc.Switch("defaultylyLu8", new()
    ///     {
    ///         VpcId = defaultktKLuM.Id,
    ///         ZoneId = zoneIdL,
    ///         CidrBlock = vswIpRangeL,
    ///     });
    /// 
    ///     var defaultRNbPh8 = new AliCloud.Vpc.Switch("defaultRNbPh8", new()
    ///     {
    ///         VpcId = defaultktKLuM.Id,
    ///         ZoneId = zoneIdK,
    ///         CidrBlock = vswIpRangeK,
    ///     });
    /// 
    ///     var @default = new AliCloud.ClickHouseEnterpriseDbCluster.ClickHouseEnterpriseDbCluster("default", new()
    ///     {
    ///         ZoneId = zoneIdI,
    ///         VpcId = defaultktKLuM.Id,
    ///         ScaleMin = "8",
    ///         ScaleMax = "16",
    ///         VswitchId = defaultTQWN3k.Id,
    ///         MultiZones = new[]
    ///         {
    ///             new AliCloud.clickHouseEnterpriseDbCluster.Inputs.ClickHouseEnterpriseDbClusterMultiZoneArgs
    ///             {
    ///                 VswitchIds = new[]
    ///                 {
    ///                     defaultTQWN3k.Id,
    ///                 },
    ///                 ZoneId = zoneIdI,
    ///             },
    ///             new AliCloud.clickHouseEnterpriseDbCluster.Inputs.ClickHouseEnterpriseDbClusterMultiZoneArgs
    ///             {
    ///                 VswitchIds = new[]
    ///                 {
    ///                     defaultylyLu8.Id,
    ///                 },
    ///                 ZoneId = zoneIdL,
    ///             },
    ///             new AliCloud.clickHouseEnterpriseDbCluster.Inputs.ClickHouseEnterpriseDbClusterMultiZoneArgs
    ///             {
    ///                 VswitchIds = new[]
    ///                 {
    ///                     defaultRNbPh8.Id,
    ///                 },
    ///                 ZoneId = zoneIdK,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Click House Enterprise D B Cluster can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:clickhouseenterprisedbcluster/clickHouseEnterpriseDbCluster:ClickHouseEnterpriseDbCluster example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:clickhouseenterprisedbcluster/clickHouseEnterpriseDbCluster:ClickHouseEnterpriseDbCluster")]
    public partial class ClickHouseEnterpriseDbCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The list of multi-zone information. See `multi_zones` below.
        /// </summary>
        [Output("multiZones")]
        public Output<ImmutableArray<Outputs.ClickHouseEnterpriseDbClusterMultiZone>> MultiZones { get; private set; } = null!;

        /// <summary>
        /// The region ID of the resource
        /// </summary>
        [Output("regionId")]
        public Output<string> RegionId { get; private set; } = null!;

        /// <summary>
        /// The maximum value of serverless auto scaling.
        /// </summary>
        [Output("scaleMax")]
        public Output<string?> ScaleMax { get; private set; } = null!;

        /// <summary>
        /// The minimum value of serverless auto scaling.
        /// </summary>
        [Output("scaleMin")]
        public Output<string?> ScaleMin { get; private set; } = null!;

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The VPC ID.
        /// </summary>
        [Output("vpcId")]
        public Output<string?> VpcId { get; private set; } = null!;

        /// <summary>
        /// The vSwitch ID.
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The zone ID.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ClickHouseEnterpriseDbCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClickHouseEnterpriseDbCluster(string name, ClickHouseEnterpriseDbClusterArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:clickhouseenterprisedbcluster/clickHouseEnterpriseDbCluster:ClickHouseEnterpriseDbCluster", name, args ?? new ClickHouseEnterpriseDbClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClickHouseEnterpriseDbCluster(string name, Input<string> id, ClickHouseEnterpriseDbClusterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:clickhouseenterprisedbcluster/clickHouseEnterpriseDbCluster:ClickHouseEnterpriseDbCluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClickHouseEnterpriseDbCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClickHouseEnterpriseDbCluster Get(string name, Input<string> id, ClickHouseEnterpriseDbClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new ClickHouseEnterpriseDbCluster(name, id, state, options);
        }
    }

    public sealed class ClickHouseEnterpriseDbClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("multiZones")]
        private InputList<Inputs.ClickHouseEnterpriseDbClusterMultiZoneArgs>? _multiZones;

        /// <summary>
        /// The list of multi-zone information. See `multi_zones` below.
        /// </summary>
        public InputList<Inputs.ClickHouseEnterpriseDbClusterMultiZoneArgs> MultiZones
        {
            get => _multiZones ?? (_multiZones = new InputList<Inputs.ClickHouseEnterpriseDbClusterMultiZoneArgs>());
            set => _multiZones = value;
        }

        /// <summary>
        /// The maximum value of serverless auto scaling.
        /// </summary>
        [Input("scaleMax")]
        public Input<string>? ScaleMax { get; set; }

        /// <summary>
        /// The minimum value of serverless auto scaling.
        /// </summary>
        [Input("scaleMin")]
        public Input<string>? ScaleMin { get; set; }

        /// <summary>
        /// The VPC ID.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The vSwitch ID.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The zone ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ClickHouseEnterpriseDbClusterArgs()
        {
        }
        public static new ClickHouseEnterpriseDbClusterArgs Empty => new ClickHouseEnterpriseDbClusterArgs();
    }

    public sealed class ClickHouseEnterpriseDbClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("multiZones")]
        private InputList<Inputs.ClickHouseEnterpriseDbClusterMultiZoneGetArgs>? _multiZones;

        /// <summary>
        /// The list of multi-zone information. See `multi_zones` below.
        /// </summary>
        public InputList<Inputs.ClickHouseEnterpriseDbClusterMultiZoneGetArgs> MultiZones
        {
            get => _multiZones ?? (_multiZones = new InputList<Inputs.ClickHouseEnterpriseDbClusterMultiZoneGetArgs>());
            set => _multiZones = value;
        }

        /// <summary>
        /// The region ID of the resource
        /// </summary>
        [Input("regionId")]
        public Input<string>? RegionId { get; set; }

        /// <summary>
        /// The maximum value of serverless auto scaling.
        /// </summary>
        [Input("scaleMax")]
        public Input<string>? ScaleMax { get; set; }

        /// <summary>
        /// The minimum value of serverless auto scaling.
        /// </summary>
        [Input("scaleMin")]
        public Input<string>? ScaleMin { get; set; }

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The VPC ID.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The vSwitch ID.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The zone ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ClickHouseEnterpriseDbClusterState()
        {
        }
        public static new ClickHouseEnterpriseDbClusterState Empty => new ClickHouseEnterpriseDbClusterState();
    }
}
