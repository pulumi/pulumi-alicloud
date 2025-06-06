// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Adb
{
    /// <summary>
    /// Provides a AnalyticDB for MySQL (ADB) Resource Group resource.
    /// 
    /// For information about AnalyticDB for MySQL (ADB) Resource Group and how to use it, see [What is Resource Group](https://www.alibabacloud.com/help/en/analyticdb-for-mysql/latest/api-doc-adb-2019-03-15-api-doc-createdbresourcegroup).
    /// 
    /// &gt; **NOTE:** Available since v1.195.0.
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
    ///     var name = config.Get("name") ?? "tf_example";
    ///     var @default = AliCloud.Adb.GetZones.Invoke();
    /// 
    ///     var defaultGetResourceGroups = AliCloud.ResourceManager.GetResourceGroups.Invoke(new()
    ///     {
    ///         Status = "OK",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "10.4.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "10.4.0.0/24",
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         VswitchName = name,
    ///     });
    /// 
    ///     var defaultDBCluster = new AliCloud.Adb.DBCluster("default", new()
    ///     {
    ///         ComputeResource = "48Core192GB",
    ///         DbClusterCategory = "MixedStorage",
    ///         DbClusterVersion = "3.0",
    ///         DbNodeClass = "E32",
    ///         DbNodeStorage = 100,
    ///         Description = name,
    ///         ElasticIoResource = 1,
    ///         MaintainTime = "04:00Z-05:00Z",
    ///         Mode = "flexible",
    ///         PaymentType = "PayAsYouGo",
    ///         ResourceGroupId = defaultGetResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Ids[0]),
    ///         SecurityIps = new[]
    ///         {
    ///             "10.168.1.12",
    ///             "10.168.1.11",
    ///         },
    ///         VpcId = defaultNetwork.Id,
    ///         VswitchId = defaultSwitch.Id,
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "example" },
    ///         },
    ///     });
    /// 
    ///     var defaultResourceGroup = new AliCloud.Adb.ResourceGroup("default", new()
    ///     {
    ///         GroupName = "TF_EXAMPLE",
    ///         GroupType = "batch",
    ///         NodeNum = 0,
    ///         DbClusterId = defaultDBCluster.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Adb Resource Group can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:adb/resourceGroup:ResourceGroup example &lt;db_cluster_id&gt;:&lt;group_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:adb/resourceGroup:ResourceGroup")]
    public partial class ResourceGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The time when the resource group was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The ID of the DBCluster.
        /// </summary>
        [Output("dbClusterId")]
        public Output<string> DbClusterId { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group. The `group_name` can be up to 255 characters in length and can contain digits, uppercase letters, hyphens (-), and underscores (_). It must start with a digit or uppercase letter.
        /// </summary>
        [Output("groupName")]
        public Output<string> GroupName { get; private set; } = null!;

        /// <summary>
        /// The query execution mode. Default value: `interactive`. Valid values: `interactive`, `batch`.
        /// </summary>
        [Output("groupType")]
        public Output<string> GroupType { get; private set; } = null!;

        /// <summary>
        /// The number of nodes.
        /// </summary>
        [Output("nodeNum")]
        public Output<int?> NodeNum { get; private set; } = null!;

        /// <summary>
        /// The time when the resource group was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// The database accounts that are associated with the resource group.
        /// </summary>
        [Output("user")]
        public Output<string> User { get; private set; } = null!;

        /// <summary>
        /// The database accounts with which to associate the resource group.
        /// </summary>
        [Output("users")]
        public Output<ImmutableArray<string>> Users { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceGroup(string name, ResourceGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:adb/resourceGroup:ResourceGroup", name, args ?? new ResourceGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceGroup(string name, Input<string> id, ResourceGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:adb/resourceGroup:ResourceGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceGroup Get(string name, Input<string> id, ResourceGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceGroup(name, id, state, options);
        }
    }

    public sealed class ResourceGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the DBCluster.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the resource group. The `group_name` can be up to 255 characters in length and can contain digits, uppercase letters, hyphens (-), and underscores (_). It must start with a digit or uppercase letter.
        /// </summary>
        [Input("groupName", required: true)]
        public Input<string> GroupName { get; set; } = null!;

        /// <summary>
        /// The query execution mode. Default value: `interactive`. Valid values: `interactive`, `batch`.
        /// </summary>
        [Input("groupType")]
        public Input<string>? GroupType { get; set; }

        /// <summary>
        /// The number of nodes.
        /// </summary>
        [Input("nodeNum")]
        public Input<int>? NodeNum { get; set; }

        [Input("users")]
        private InputList<string>? _users;

        /// <summary>
        /// The database accounts with which to associate the resource group.
        /// </summary>
        public InputList<string> Users
        {
            get => _users ?? (_users = new InputList<string>());
            set => _users = value;
        }

        public ResourceGroupArgs()
        {
        }
        public static new ResourceGroupArgs Empty => new ResourceGroupArgs();
    }

    public sealed class ResourceGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time when the resource group was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The ID of the DBCluster.
        /// </summary>
        [Input("dbClusterId")]
        public Input<string>? DbClusterId { get; set; }

        /// <summary>
        /// The name of the resource group. The `group_name` can be up to 255 characters in length and can contain digits, uppercase letters, hyphens (-), and underscores (_). It must start with a digit or uppercase letter.
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        /// <summary>
        /// The query execution mode. Default value: `interactive`. Valid values: `interactive`, `batch`.
        /// </summary>
        [Input("groupType")]
        public Input<string>? GroupType { get; set; }

        /// <summary>
        /// The number of nodes.
        /// </summary>
        [Input("nodeNum")]
        public Input<int>? NodeNum { get; set; }

        /// <summary>
        /// The time when the resource group was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// The database accounts that are associated with the resource group.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        [Input("users")]
        private InputList<string>? _users;

        /// <summary>
        /// The database accounts with which to associate the resource group.
        /// </summary>
        public InputList<string> Users
        {
            get => _users ?? (_users = new InputList<string>());
            set => _users = value;
        }

        public ResourceGroupState()
        {
        }
        public static new ResourceGroupState Empty => new ResourceGroupState();
    }
}
