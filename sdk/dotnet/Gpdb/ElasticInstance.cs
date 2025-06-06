// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb
{
    /// <summary>
    /// Provides a AnalyticDB for PostgreSQL instance resource which storage type is flexible. Compared to the reserved storage ADB PG instance, you can scale up each disk and smoothly scale out nodes online.\
    /// For more detail product introduction, see [here](https://www.alibabacloud.com/help/doc-detail/141368.htm).
    /// 
    /// &gt; **NOTE:** Deprecated since v1.147.0.
    /// 
    /// &gt; **DEPRECATED:**  This resource  has been deprecated from version `1.147.0`. Please use new resource alicloud_gpdb_instance.
    /// 
    /// ## Example Usage
    /// 
    /// ### Create a AnalyticDB for PostgreSQL instance
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "Gpdb",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         Name = "vpc-123456",
    ///         CidrBlock = "172.16.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
    ///     {
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "172.16.0.0/24",
    ///         VswitchName = "vpc-123456",
    ///     });
    /// 
    ///     var adbPgInstance = new AliCloud.Gpdb.ElasticInstance("adb_pg_instance", new()
    ///     {
    ///         Engine = "gpdb",
    ///         EngineVersion = "6.0",
    ///         SegStorageType = "cloud_essd",
    ///         SegNodeNum = 4,
    ///         StorageSize = 50,
    ///         InstanceSpec = "2C16G",
    ///         DbInstanceDescription = "Created by terraform",
    ///         InstanceNetworkType = "VPC",
    ///         PaymentType = "PayAsYouGo",
    ///         VswitchId = defaultSwitch.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// AnalyticDB for PostgreSQL can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:gpdb/elasticInstance:ElasticInstance adb_pg_instance gp-bpxxxxxxxxxxxxxx
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:gpdb/elasticInstance:ElasticInstance")]
    public partial class ElasticInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ADB PG instance connection string.
        /// </summary>
        [Output("connectionString")]
        public Output<string> ConnectionString { get; private set; } = null!;

        /// <summary>
        /// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
        /// </summary>
        [Output("dbInstanceCategory")]
        public Output<string> DbInstanceCategory { get; private set; } = null!;

        /// <summary>
        /// The description of ADB PG instance. It is a string of 2 to 256 characters.
        /// </summary>
        [Output("dbInstanceDescription")]
        public Output<string?> DbInstanceDescription { get; private set; } = null!;

        /// <summary>
        /// The ID of the encryption key. **Note:** If the `encryption_type` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
        /// </summary>
        [Output("encryptionKey")]
        public Output<string?> EncryptionKey { get; private set; } = null!;

        /// <summary>
        /// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
        /// </summary>
        [Output("encryptionType")]
        public Output<string?> EncryptionType { get; private set; } = null!;

        /// <summary>
        /// Database engine: `gpdb`.
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// Database version. Valid value is `6.0`.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// The network type of ADB PG instance. Only `VPC` supported now.
        /// </summary>
        [Output("instanceNetworkType")]
        public Output<string?> InstanceNetworkType { get; private set; } = null!;

        /// <summary>
        /// The specification of segment nodes. 
        /// * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
        /// * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
        /// </summary>
        [Output("instanceSpec")]
        public Output<string> InstanceSpec { get; private set; } = null!;

        /// <summary>
        /// The subscription period. Valid values: [1~12]. It is valid when payment_type is `Subscription`.  
        /// **NOTE:** Will not take effect after modifying `payment_duration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
        /// </summary>
        [Output("paymentDuration")]
        public Output<int?> PaymentDuration { get; private set; } = null!;

        /// <summary>
        /// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when payment_type is `Subscription`.  
        /// **NOTE:** Will not take effect after modifying `payment_duration_unit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
        /// </summary>
        [Output("paymentDurationUnit")]
        public Output<string?> PaymentDurationUnit { get; private set; } = null!;

        /// <summary>
        /// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
        /// </summary>
        [Output("paymentType")]
        public Output<string?> PaymentType { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.196.0) The connection port of the instance.
        /// </summary>
        [Output("port")]
        public Output<string> Port { get; private set; } = null!;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        [Output("securityIpLists")]
        public Output<ImmutableArray<string>> SecurityIpLists { get; private set; } = null!;

        /// <summary>
        /// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
        /// </summary>
        [Output("segNodeNum")]
        public Output<int> SegNodeNum { get; private set; } = null!;

        /// <summary>
        /// The disk type of segment nodes. Valid values: `cloud_essd`, `cloud_efficiency`.
        /// </summary>
        [Output("segStorageType")]
        public Output<string> SegStorageType { get; private set; } = null!;

        /// <summary>
        /// Instance status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
        /// </summary>
        [Output("storageSize")]
        public Output<int> StorageSize { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The virtual switch ID to launch ADB PG instances in one VPC.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ElasticInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ElasticInstance(string name, ElasticInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:gpdb/elasticInstance:ElasticInstance", name, args ?? new ElasticInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ElasticInstance(string name, Input<string> id, ElasticInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:gpdb/elasticInstance:ElasticInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ElasticInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ElasticInstance Get(string name, Input<string> id, ElasticInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new ElasticInstance(name, id, state, options);
        }
    }

    public sealed class ElasticInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
        /// </summary>
        [Input("dbInstanceCategory")]
        public Input<string>? DbInstanceCategory { get; set; }

        /// <summary>
        /// The description of ADB PG instance. It is a string of 2 to 256 characters.
        /// </summary>
        [Input("dbInstanceDescription")]
        public Input<string>? DbInstanceDescription { get; set; }

        /// <summary>
        /// The ID of the encryption key. **Note:** If the `encryption_type` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
        /// </summary>
        [Input("encryptionKey")]
        public Input<string>? EncryptionKey { get; set; }

        /// <summary>
        /// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        /// <summary>
        /// Database engine: `gpdb`.
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        /// <summary>
        /// Database version. Valid value is `6.0`.
        /// </summary>
        [Input("engineVersion", required: true)]
        public Input<string> EngineVersion { get; set; } = null!;

        /// <summary>
        /// The network type of ADB PG instance. Only `VPC` supported now.
        /// </summary>
        [Input("instanceNetworkType")]
        public Input<string>? InstanceNetworkType { get; set; }

        /// <summary>
        /// The specification of segment nodes. 
        /// * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
        /// * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
        /// </summary>
        [Input("instanceSpec", required: true)]
        public Input<string> InstanceSpec { get; set; } = null!;

        /// <summary>
        /// The subscription period. Valid values: [1~12]. It is valid when payment_type is `Subscription`.  
        /// **NOTE:** Will not take effect after modifying `payment_duration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
        /// </summary>
        [Input("paymentDuration")]
        public Input<int>? PaymentDuration { get; set; }

        /// <summary>
        /// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when payment_type is `Subscription`.  
        /// **NOTE:** Will not take effect after modifying `payment_duration_unit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
        /// </summary>
        [Input("paymentDurationUnit")]
        public Input<string>? PaymentDurationUnit { get; set; }

        /// <summary>
        /// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        [Input("securityIpLists")]
        private InputList<string>? _securityIpLists;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        public InputList<string> SecurityIpLists
        {
            get => _securityIpLists ?? (_securityIpLists = new InputList<string>());
            set => _securityIpLists = value;
        }

        /// <summary>
        /// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
        /// </summary>
        [Input("segNodeNum", required: true)]
        public Input<int> SegNodeNum { get; set; } = null!;

        /// <summary>
        /// The disk type of segment nodes. Valid values: `cloud_essd`, `cloud_efficiency`.
        /// </summary>
        [Input("segStorageType", required: true)]
        public Input<string> SegStorageType { get; set; } = null!;

        /// <summary>
        /// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
        /// </summary>
        [Input("storageSize", required: true)]
        public Input<int> StorageSize { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The virtual switch ID to launch ADB PG instances in one VPC.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        /// <summary>
        /// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ElasticInstanceArgs()
        {
        }
        public static new ElasticInstanceArgs Empty => new ElasticInstanceArgs();
    }

    public sealed class ElasticInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ADB PG instance connection string.
        /// </summary>
        [Input("connectionString")]
        public Input<string>? ConnectionString { get; set; }

        /// <summary>
        /// The edition of the instance. Valid values: `Basic`, `HighAvailability`. Default value: `HighAvailability`.
        /// </summary>
        [Input("dbInstanceCategory")]
        public Input<string>? DbInstanceCategory { get; set; }

        /// <summary>
        /// The description of ADB PG instance. It is a string of 2 to 256 characters.
        /// </summary>
        [Input("dbInstanceDescription")]
        public Input<string>? DbInstanceDescription { get; set; }

        /// <summary>
        /// The ID of the encryption key. **Note:** If the `encryption_type` parameter is set to `CloudDisk`, you must specify this parameter to the encryption key that is in the same region as the disk that is specified by the EncryptionType parameter. Otherwise, leave this parameter empty.
        /// </summary>
        [Input("encryptionKey")]
        public Input<string>? EncryptionKey { get; set; }

        /// <summary>
        /// The type of the encryption. Valid values: `CloudDisk`. **Note:** Disk encryption cannot be disabled after it is enabled.
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        /// <summary>
        /// Database engine: `gpdb`.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Database version. Valid value is `6.0`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// The network type of ADB PG instance. Only `VPC` supported now.
        /// </summary>
        [Input("instanceNetworkType")]
        public Input<string>? InstanceNetworkType { get; set; }

        /// <summary>
        /// The specification of segment nodes. 
        /// * When `db_instance_category` is `HighAvailability`, Valid values: `2C16G`, `4C32G`, `16C128G`.
        /// * When `db_instance_category` is `Basic`, Valid values: `2C8G`, `4C16G`, `8C32G`, `16C64G`.
        /// </summary>
        [Input("instanceSpec")]
        public Input<string>? InstanceSpec { get; set; }

        /// <summary>
        /// The subscription period. Valid values: [1~12]. It is valid when payment_type is `Subscription`.  
        /// **NOTE:** Will not take effect after modifying `payment_duration` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
        /// </summary>
        [Input("paymentDuration")]
        public Input<int>? PaymentDuration { get; set; }

        /// <summary>
        /// The unit of the subscription period. Valid values: `Month`, `Year`. It is valid when payment_type is `Subscription`.  
        /// **NOTE:** Will not take effect after modifying `payment_duration_unit` for now, if you want to renew a PayAsYouGo instance, need to do in on aliyun console.
        /// </summary>
        [Input("paymentDurationUnit")]
        public Input<string>? PaymentDurationUnit { get; set; }

        /// <summary>
        /// Valid values are `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// (Available since v1.196.0) The connection port of the instance.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        [Input("securityIpLists")]
        private InputList<string>? _securityIpLists;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        public InputList<string> SecurityIpLists
        {
            get => _securityIpLists ?? (_securityIpLists = new InputList<string>());
            set => _securityIpLists = value;
        }

        /// <summary>
        /// The number of segment nodes. Minimum is `4`, max is `256`, step is `4`.
        /// </summary>
        [Input("segNodeNum")]
        public Input<int>? SegNodeNum { get; set; }

        /// <summary>
        /// The disk type of segment nodes. Valid values: `cloud_essd`, `cloud_efficiency`.
        /// </summary>
        [Input("segStorageType")]
        public Input<string>? SegStorageType { get; set; }

        /// <summary>
        /// Instance status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The storage capacity of per segment node. Unit: GB. Minimum is `50`, max is `4000`, step is `50`.
        /// </summary>
        [Input("storageSize")]
        public Input<int>? StorageSize { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The virtual switch ID to launch ADB PG instances in one VPC.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the ADB PG instance. If specified, must be consistent with the zone where the vswitch is located.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ElasticInstanceState()
        {
        }
        public static new ElasticInstanceState Empty => new ElasticInstanceState();
    }
}
