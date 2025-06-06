// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mse
{
    /// <summary>
    /// ## Import
    /// 
    /// MSE Cluster can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:mse/cluster:Cluster example mse-cn-0d9xxxx
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:mse/cluster:Cluster")]
    public partial class Cluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
        /// </summary>
        [Output("aclEntryLists")]
        public Output<ImmutableArray<string>> AclEntryLists { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.205.0) The application version.
        /// </summary>
        [Output("appVersion")]
        public Output<string> AppVersion { get; private set; } = null!;

        /// <summary>
        /// The alias of MSE Cluster.
        /// </summary>
        [Output("clusterAliasName")]
        public Output<string> ClusterAliasName { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.162.0) The cluster id of Cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `cluster_specification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
        /// - Professional Edition
        /// - `MSE_SC_1_2_60_c`: 1C2G
        /// - `MSE_SC_2_4_60_c`: 2C4G
        /// - `MSE_SC_4_8_60_c`: 4C8G
        /// - `MSE_SC_8_16_60_c`: 8C16G
        /// - `MSE_SC_16_32_60_c`:16C32G
        /// - `MSE_SC_1_2_200_c`: 1C2G
        /// - `MSE_SC_2_4_200_c`: 2C4G
        /// - `MSE_SC_4_8_200_c`: 4C8G
        /// - `MSE_SC_8_16_200_c`: 8C16G
        /// - `MSE_SC_16_32_200_c`:16C32G
        /// - Developer Edition
        /// - `MSE_SC_1_2_60_c`: 1C2G
        /// - `MSE_SC_2_4_60_c`: 2C4G
        /// - `MSE_SC_1_2_200_c`: 1C2G
        /// - `MSE_SC_2_4_200_c`: 2C4G
        /// - Serverless Edition
        /// - `MSE_SC_SERVERLESS`: Available since v1.232.0
        /// </summary>
        [Output("clusterSpecification")]
        public Output<string> ClusterSpecification { get; private set; } = null!;

        /// <summary>
        /// The type of MSE Cluster.
        /// </summary>
        [Output("clusterType")]
        public Output<string> ClusterType { get; private set; } = null!;

        /// <summary>
        /// The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
        /// </summary>
        [Output("clusterVersion")]
        public Output<string> ClusterVersion { get; private set; } = null!;

        /// <summary>
        /// The connection type. Valid values: `slb`,`single_eni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster's mse_version is `mse_dev`,please use `single_eni`.
        /// </summary>
        [Output("connectionType")]
        public Output<string> ConnectionType { get; private set; } = null!;

        /// <summary>
        /// The type of Disk.
        /// </summary>
        [Output("diskType")]
        public Output<string?> DiskType { get; private set; } = null!;

        /// <summary>
        /// The count of instance. **NOTE:** From version 1.188.0, `instance_count` can be modified.
        /// </summary>
        [Output("instanceCount")]
        public Output<int> InstanceCount { get; private set; } = null!;

        /// <summary>
        /// The version of MSE. Valid values: `mse_dev` or `mse_pro` or `mse_serverless`(Available since v1.232.0).
        /// </summary>
        [Output("mseVersion")]
        public Output<string> MseVersion { get; private set; } = null!;

        /// <summary>
        /// The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
        /// </summary>
        [Output("netType")]
        public Output<string> NetType { get; private set; } = null!;

        /// <summary>
        /// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// The specification of private network SLB.
        /// </summary>
        [Output("privateSlbSpecification")]
        public Output<string?> PrivateSlbSpecification { get; private set; } = null!;

        /// <summary>
        /// The public network bandwidth.
        /// </summary>
        [Output("pubNetworkFlow")]
        public Output<string> PubNetworkFlow { get; private set; } = null!;

        /// <summary>
        /// The specification of public network SLB. Serverless Instance could ignore this parameter.
        /// </summary>
        [Output("pubSlbSpecification")]
        public Output<string?> PubSlbSpecification { get; private set; } = null!;

        /// <summary>
        /// The extended request parameters in the JSON format.
        /// </summary>
        [Output("requestPars")]
        public Output<string?> RequestPars { get; private set; } = null!;

        /// <summary>
        /// The resource group of the resource.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The status of MSE Cluster.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The id of the VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The id of VSwitch.
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:mse/cluster:Cluster", name, args ?? new ClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:mse/cluster:Cluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("aclEntryLists")]
        private InputList<string>? _aclEntryLists;

        /// <summary>
        /// The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
        /// </summary>
        public InputList<string> AclEntryLists
        {
            get => _aclEntryLists ?? (_aclEntryLists = new InputList<string>());
            set => _aclEntryLists = value;
        }

        /// <summary>
        /// The alias of MSE Cluster.
        /// </summary>
        [Input("clusterAliasName")]
        public Input<string>? ClusterAliasName { get; set; }

        /// <summary>
        /// The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `cluster_specification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
        /// - Professional Edition
        /// - `MSE_SC_1_2_60_c`: 1C2G
        /// - `MSE_SC_2_4_60_c`: 2C4G
        /// - `MSE_SC_4_8_60_c`: 4C8G
        /// - `MSE_SC_8_16_60_c`: 8C16G
        /// - `MSE_SC_16_32_60_c`:16C32G
        /// - `MSE_SC_1_2_200_c`: 1C2G
        /// - `MSE_SC_2_4_200_c`: 2C4G
        /// - `MSE_SC_4_8_200_c`: 4C8G
        /// - `MSE_SC_8_16_200_c`: 8C16G
        /// - `MSE_SC_16_32_200_c`:16C32G
        /// - Developer Edition
        /// - `MSE_SC_1_2_60_c`: 1C2G
        /// - `MSE_SC_2_4_60_c`: 2C4G
        /// - `MSE_SC_1_2_200_c`: 1C2G
        /// - `MSE_SC_2_4_200_c`: 2C4G
        /// - Serverless Edition
        /// - `MSE_SC_SERVERLESS`: Available since v1.232.0
        /// </summary>
        [Input("clusterSpecification", required: true)]
        public Input<string> ClusterSpecification { get; set; } = null!;

        /// <summary>
        /// The type of MSE Cluster.
        /// </summary>
        [Input("clusterType", required: true)]
        public Input<string> ClusterType { get; set; } = null!;

        /// <summary>
        /// The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
        /// </summary>
        [Input("clusterVersion", required: true)]
        public Input<string> ClusterVersion { get; set; } = null!;

        /// <summary>
        /// The connection type. Valid values: `slb`,`single_eni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster's mse_version is `mse_dev`,please use `single_eni`.
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// The type of Disk.
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        /// <summary>
        /// The count of instance. **NOTE:** From version 1.188.0, `instance_count` can be modified.
        /// </summary>
        [Input("instanceCount", required: true)]
        public Input<int> InstanceCount { get; set; } = null!;

        /// <summary>
        /// The version of MSE. Valid values: `mse_dev` or `mse_pro` or `mse_serverless`(Available since v1.232.0).
        /// </summary>
        [Input("mseVersion")]
        public Input<string>? MseVersion { get; set; }

        /// <summary>
        /// The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
        /// </summary>
        [Input("netType", required: true)]
        public Input<string> NetType { get; set; } = null!;

        /// <summary>
        /// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The specification of private network SLB.
        /// </summary>
        [Input("privateSlbSpecification")]
        public Input<string>? PrivateSlbSpecification { get; set; }

        /// <summary>
        /// The public network bandwidth.
        /// </summary>
        [Input("pubNetworkFlow", required: true)]
        public Input<string> PubNetworkFlow { get; set; } = null!;

        /// <summary>
        /// The specification of public network SLB. Serverless Instance could ignore this parameter.
        /// </summary>
        [Input("pubSlbSpecification")]
        public Input<string>? PubSlbSpecification { get; set; }

        /// <summary>
        /// The extended request parameters in the JSON format.
        /// </summary>
        [Input("requestPars")]
        public Input<string>? RequestPars { get; set; }

        /// <summary>
        /// The resource group of the resource.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The id of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The id of VSwitch.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public ClusterArgs()
        {
        }
        public static new ClusterArgs Empty => new ClusterArgs();
    }

    public sealed class ClusterState : global::Pulumi.ResourceArgs
    {
        [Input("aclEntryLists")]
        private InputList<string>? _aclEntryLists;

        /// <summary>
        /// The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
        /// </summary>
        public InputList<string> AclEntryLists
        {
            get => _aclEntryLists ?? (_aclEntryLists = new InputList<string>());
            set => _aclEntryLists = value;
        }

        /// <summary>
        /// (Available since v1.205.0) The application version.
        /// </summary>
        [Input("appVersion")]
        public Input<string>? AppVersion { get; set; }

        /// <summary>
        /// The alias of MSE Cluster.
        /// </summary>
        [Input("clusterAliasName")]
        public Input<string>? ClusterAliasName { get; set; }

        /// <summary>
        /// (Available since v1.162.0) The cluster id of Cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `cluster_specification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
        /// - Professional Edition
        /// - `MSE_SC_1_2_60_c`: 1C2G
        /// - `MSE_SC_2_4_60_c`: 2C4G
        /// - `MSE_SC_4_8_60_c`: 4C8G
        /// - `MSE_SC_8_16_60_c`: 8C16G
        /// - `MSE_SC_16_32_60_c`:16C32G
        /// - `MSE_SC_1_2_200_c`: 1C2G
        /// - `MSE_SC_2_4_200_c`: 2C4G
        /// - `MSE_SC_4_8_200_c`: 4C8G
        /// - `MSE_SC_8_16_200_c`: 8C16G
        /// - `MSE_SC_16_32_200_c`:16C32G
        /// - Developer Edition
        /// - `MSE_SC_1_2_60_c`: 1C2G
        /// - `MSE_SC_2_4_60_c`: 2C4G
        /// - `MSE_SC_1_2_200_c`: 1C2G
        /// - `MSE_SC_2_4_200_c`: 2C4G
        /// - Serverless Edition
        /// - `MSE_SC_SERVERLESS`: Available since v1.232.0
        /// </summary>
        [Input("clusterSpecification")]
        public Input<string>? ClusterSpecification { get; set; }

        /// <summary>
        /// The type of MSE Cluster.
        /// </summary>
        [Input("clusterType")]
        public Input<string>? ClusterType { get; set; }

        /// <summary>
        /// The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
        /// </summary>
        [Input("clusterVersion")]
        public Input<string>? ClusterVersion { get; set; }

        /// <summary>
        /// The connection type. Valid values: `slb`,`single_eni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster's mse_version is `mse_dev`,please use `single_eni`.
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// The type of Disk.
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        /// <summary>
        /// The count of instance. **NOTE:** From version 1.188.0, `instance_count` can be modified.
        /// </summary>
        [Input("instanceCount")]
        public Input<int>? InstanceCount { get; set; }

        /// <summary>
        /// The version of MSE. Valid values: `mse_dev` or `mse_pro` or `mse_serverless`(Available since v1.232.0).
        /// </summary>
        [Input("mseVersion")]
        public Input<string>? MseVersion { get; set; }

        /// <summary>
        /// The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
        /// </summary>
        [Input("netType")]
        public Input<string>? NetType { get; set; }

        /// <summary>
        /// Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The specification of private network SLB.
        /// </summary>
        [Input("privateSlbSpecification")]
        public Input<string>? PrivateSlbSpecification { get; set; }

        /// <summary>
        /// The public network bandwidth.
        /// </summary>
        [Input("pubNetworkFlow")]
        public Input<string>? PubNetworkFlow { get; set; }

        /// <summary>
        /// The specification of public network SLB. Serverless Instance could ignore this parameter.
        /// </summary>
        [Input("pubSlbSpecification")]
        public Input<string>? PubSlbSpecification { get; set; }

        /// <summary>
        /// The extended request parameters in the JSON format.
        /// </summary>
        [Input("requestPars")]
        public Input<string>? RequestPars { get; set; }

        /// <summary>
        /// The resource group of the resource.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of MSE Cluster.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The id of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The id of VSwitch.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public ClusterState()
        {
        }
        public static new ClusterState Empty => new ClusterState();
    }
}
