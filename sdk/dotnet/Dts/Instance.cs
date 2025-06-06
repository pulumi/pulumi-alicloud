// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dts
{
    /// <summary>
    /// Provides a Dts Instance resource.
    /// 
    /// For information about Dts Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/en/data-transmission-service/latest/createdtsinstance).
    /// 
    /// &gt; **NOTE:** Available since v1.198.0.
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
    ///     var @default = AliCloud.ResourceManager.GetResourceGroups.Invoke(new()
    ///     {
    ///         Status = "OK",
    ///     });
    /// 
    ///     var defaultGetRegions = AliCloud.GetRegions.Invoke(new()
    ///     {
    ///         Current = true,
    ///     });
    /// 
    ///     var defaultInstance = new AliCloud.Dts.Instance("default", new()
    ///     {
    ///         Type = "sync",
    ///         ResourceGroupId = @default.Apply(@default =&gt; @default.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Ids[0])),
    ///         PaymentType = "Subscription",
    ///         InstanceClass = "large",
    ///         SourceEndpointEngineName = "MySQL",
    ///         SourceRegion = defaultGetRegions.Apply(getRegionsResult =&gt; getRegionsResult.Regions[0]?.Id),
    ///         DestinationEndpointEngineName = "MySQL",
    ///         DestinationRegion = defaultGetRegions.Apply(getRegionsResult =&gt; getRegionsResult.Regions[0]?.Id),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Dts Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:dts/instance:Instance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dts/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether to automatically renew the fee when it expires. Valid values:
        /// - **false**: No, the default value.
        /// - **true**: Yes.
        /// </summary>
        [Output("autoPay")]
        public Output<bool?> AutoPay { get; private set; } = null!;

        /// <summary>
        /// Whether to start the task automatically after the purchase is completed. Value:
        /// - **false**: No, the default value.
        /// - **true**: Yes.
        /// </summary>
        [Output("autoStart")]
        public Output<bool?> AutoStart { get; private set; } = null!;

        /// <summary>
        /// Specifications of ETL. The unit is compute unit (CU),1CU = 1vCPU +4GB of memory. The value range is an integer greater than or equal to 2. **NOTE:** Enter this parameter and enable ETL to clean and convert data.
        /// </summary>
        [Output("computeUnit")]
        public Output<int?> ComputeUnit { get; private set; } = null!;

        /// <summary>
        /// Instance creation time
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The number of private custom RDS instances in the PolarDB-X. The default value is **1**. **NOTE:** This parameter is required only when **source_endpoint_engine_name** is **DRDS**.
        /// </summary>
        [Output("databaseCount")]
        public Output<int> DatabaseCount { get; private set; } = null!;

        /// <summary>
        /// The target database engine type.
        /// - **MySQL**:MySQL databases (including RDS MySQL and self-built MySQL).
        /// - **PolarDB**:PolarDB MySQL.
        /// - **polardb_o**:PolarDB O engine.
        /// - **polardb_pg**:PolarDB PostgreSQL.
        /// - **Redis**:Redis databases (including apsaradb for Redis and user-created Redis).
        /// - **DRDS**: cloud-native distributed database PolarDB-X 1.0 and 2.0.
        /// - **PostgreSQL**: User-created PostgreSQL.
        /// - **ODPS**:MaxCompute project.
        /// - **oracle**: self-built Oracle.
        /// - **mongodb**:MongoDB databases (including apsaradb for MongoDB and user-created MongoDB).
        /// - **tidb**:TiDB database.
        /// - **ADS**: Cloud native data warehouse AnalyticDB MySQL 2.0.
        /// - **ADB30**: Cloud native data warehouse AnalyticDB MySQL 3.0.
        /// - **Greenplum**: Cloud native data warehouse AnalyticDB PostgreSQL.
        /// - **MSSQL**:SQL Server databases (including RDS SQL Server and self-built SQL Server).
        /// - **kafka**:Kafka databases (including Kafka and self-built Kafka).
        /// - **DataHub**: DataHub, an Alibaba cloud streaming data service.
        /// - **clickhouse**: ClickHouse.
        /// - **DB2**: self-built DB2 LUW.
        /// - **as400**:AS/400.
        /// - **Tablestore**: Tablestore.
        /// - **NOTE:**
        /// - The default value is **MySQL**.
        /// - For more information about the supported source and destination databases, see [Database, Synchronization Initialization Type, and Synchronization Topology](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-synchronization-scenarios-1) and [Supported Database and Migration Type](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-migration-scenarios).
        /// - This parameter or **job_id** must be passed in.
        /// </summary>
        [Output("destinationEndpointEngineName")]
        public Output<string> DestinationEndpointEngineName { get; private set; } = null!;

        /// <summary>
        /// The target instance region. For more information, see [List of supported regions](https://www.alibabacloud.com/help/en/data-transmission-service/latest/list-of-supported-regions). **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Output("destinationRegion")]
        public Output<string?> DestinationRegion { get; private set; } = null!;

        /// <summary>
        /// The ID of the subscription instance.
        /// </summary>
        [Output("dtsInstanceId")]
        public Output<string> DtsInstanceId { get; private set; } = null!;

        /// <summary>
        /// Assign a specified number of DU resources to DTS tasks in the DTS exclusive cluster. Valid values: **1** ~ **100**. **NOTE:** The value of this parameter must be within the range of the number of DUs available for the DTS dedicated cluster.
        /// </summary>
        [Output("du")]
        public Output<int?> Du { get; private set; } = null!;

        /// <summary>
        /// Subscription billing type, Valid values: `ONLY_CONFIGURATION_FEE`: charges only configuration fees; `CONFIGURATION_FEE_AND_DATA_FEE`: charges configuration fees and data traffic fees.
        /// </summary>
        [Output("feeType")]
        public Output<string?> FeeType { get; private set; } = null!;

        /// <summary>
        /// The type of the migration or synchronization instance.
        /// - The specifications of the migration instance: **xxlarge**, **xlarge**, **large**, **medium**, **small**.
        /// - The types of synchronization instances: **large**, **medium**, **small**, **micro**.
        /// - **NOTE:** For performance descriptions of different specifications, see [Data Migration Link Specifications](https://www.alibabacloud.com/help/en/data-transmission-service/latest/cd773b) and [Data Synchronization Link Specifications](https://www.alibabacloud.com/help/en/data-transmission-service/latest/6bce7c).
        /// </summary>
        [Output("instanceClass")]
        public Output<string?> InstanceClass { get; private set; } = null!;

        /// <summary>
        /// The name of Dts instance.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The ID of the task obtained by calling the **ConfigureDtsJob** operation (**DtsJobId**).&gt; After you pass in this parameter, you do not need to pass the **source_region**, **destination_region**, **type**, **source_endpoint_engine_name**, or **destination_endpoint_engine_name** parameters. Even if the input is passed in, the configuration in **job_id** shall prevail.
        /// </summary>
        [Output("jobId")]
        public Output<string?> JobId { get; private set; } = null!;

        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`, `PayAsYouGo`.
        /// </summary>
        [Output("paymentType")]
        public Output<string?> PaymentType { get; private set; } = null!;

        /// <summary>
        /// The billing method of the subscription instance. Value: `Year`, `Month`. **NOTE:** This parameter is valid and must be passed in only when `payment_type` is `Subscription`.
        /// </summary>
        [Output("period")]
        public Output<string?> Period { get; private set; } = null!;

        /// <summary>
        /// Resource Group ID.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// Source instance database engine type.
        /// - **MySQL**:MySQL databases (including RDS MySQL and self-built MySQL).
        /// - **PolarDB**:PolarDB MySQL.
        /// - **polardb_o**:PolarDB O engine.
        /// - **polardb_pg**:PolarDB PostgreSQL.
        /// - **Redis**:Redis databases (including apsaradb for Redis and user-created Redis).
        /// - **DRDS**: cloud-native distributed database PolarDB-X 1.0 and 2.0.
        /// - **PostgreSQL**: User-created PostgreSQL.
        /// - **ODPS**:MaxCompute.
        /// - **oracle**: self-built Oracle.
        /// - **mongodb**:MongoDB databases (including apsaradb for MongoDB and user-created MongoDB).
        /// - **tidb**:TiDB database.
        /// - **ADS**: Cloud native data warehouse AnalyticDB MySQL 2.0.
        /// - **ADB30**: Cloud native data warehouse AnalyticDB MySQL 3.0.
        /// - **Greenplum**: Cloud native data warehouse AnalyticDB PostgreSQL.
        /// - **MSSQL**:SQL Server databases (including RDS SQL Server and self-built SQL Server).
        /// - **kafka**:Kafka databases (including Kafka and self-built Kafka).
        /// - **DataHub**: DataHub, an Alibaba cloud streaming data service.
        /// - **clickhouse**: ClickHouse.
        /// - **DB2**: self-built DB2 LUW.
        /// - **as400**:AS/400.
        /// - **Tablestore**: Tablestore.
        /// - **NOTE:**
        /// - The default value is **MySQL**.
        /// - For more information about the supported source and destination databases, see [Database, Synchronization Initialization Type, and Synchronization Topology](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-synchronization-scenarios-1) and [Supported Database and Migration Type](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-migration-scenarios).
        /// - This parameter or **job_id** must be passed in.
        /// </summary>
        [Output("sourceEndpointEngineName")]
        public Output<string> SourceEndpointEngineName { get; private set; } = null!;

        /// <summary>
        /// The source instance region. For more information, see [List of supported regions](https://www.alibabacloud.com/help/en/data-transmission-service/latest/list-of-supported-regions). **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Output("sourceRegion")]
        public Output<string?> SourceRegion { get; private set; } = null!;

        /// <summary>
        /// Instance status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Synchronization topology, value:
        /// - **oneway**: one-way synchronization, the default value.
        /// - **bidirectional**: two-way synchronization.
        /// </summary>
        [Output("syncArchitecture")]
        public Output<string?> SyncArchitecture { get; private set; } = null!;

        /// <summary>
        /// The synchronization direction. Default value: `Forward`. Valid values:
        /// - `Forward`: Data is synchronized from the source database to the destination database.
        /// - `Reverse`: Data is synchronized from the destination database to the source database.
        /// - **NOTE:** You can set this parameter to Reverse to delete the reverse synchronization task only if the topology is two-way synchronization.
        /// </summary>
        [Output("synchronizationDirection")]
        public Output<string?> SynchronizationDirection { get; private set; } = null!;

        /// <summary>
        /// The tag value corresponding to the tag key.See the following `Block Tags`.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The instance type. Valid values:
        /// - **migration**: MIGRATION.
        /// - **sync**: synchronization.
        /// - **subscribe**: SUBSCRIBE.
        /// - **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// Prepaid instance purchase duration.
        /// - When **period** is **Month**, the values are: 1, 2, 3, 4, 5, 6, 7, 8, and 9.
        /// - When **Period** is **Year**, the values are 1, 2, 3, and 5.
        /// - **NOTE:**
        /// - This parameter is valid and must be passed in only when **payment_type** is `Subscription`.
        /// - The billing method of the subscription instance. You can set the parameter `period`.
        /// </summary>
        [Output("usedTime")]
        public Output<int?> UsedTime { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:dts/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dts/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to automatically renew the fee when it expires. Valid values:
        /// - **false**: No, the default value.
        /// - **true**: Yes.
        /// </summary>
        [Input("autoPay")]
        public Input<bool>? AutoPay { get; set; }

        /// <summary>
        /// Whether to start the task automatically after the purchase is completed. Value:
        /// - **false**: No, the default value.
        /// - **true**: Yes.
        /// </summary>
        [Input("autoStart")]
        public Input<bool>? AutoStart { get; set; }

        /// <summary>
        /// Specifications of ETL. The unit is compute unit (CU),1CU = 1vCPU +4GB of memory. The value range is an integer greater than or equal to 2. **NOTE:** Enter this parameter and enable ETL to clean and convert data.
        /// </summary>
        [Input("computeUnit")]
        public Input<int>? ComputeUnit { get; set; }

        /// <summary>
        /// The number of private custom RDS instances in the PolarDB-X. The default value is **1**. **NOTE:** This parameter is required only when **source_endpoint_engine_name** is **DRDS**.
        /// </summary>
        [Input("databaseCount")]
        public Input<int>? DatabaseCount { get; set; }

        /// <summary>
        /// The target database engine type.
        /// - **MySQL**:MySQL databases (including RDS MySQL and self-built MySQL).
        /// - **PolarDB**:PolarDB MySQL.
        /// - **polardb_o**:PolarDB O engine.
        /// - **polardb_pg**:PolarDB PostgreSQL.
        /// - **Redis**:Redis databases (including apsaradb for Redis and user-created Redis).
        /// - **DRDS**: cloud-native distributed database PolarDB-X 1.0 and 2.0.
        /// - **PostgreSQL**: User-created PostgreSQL.
        /// - **ODPS**:MaxCompute project.
        /// - **oracle**: self-built Oracle.
        /// - **mongodb**:MongoDB databases (including apsaradb for MongoDB and user-created MongoDB).
        /// - **tidb**:TiDB database.
        /// - **ADS**: Cloud native data warehouse AnalyticDB MySQL 2.0.
        /// - **ADB30**: Cloud native data warehouse AnalyticDB MySQL 3.0.
        /// - **Greenplum**: Cloud native data warehouse AnalyticDB PostgreSQL.
        /// - **MSSQL**:SQL Server databases (including RDS SQL Server and self-built SQL Server).
        /// - **kafka**:Kafka databases (including Kafka and self-built Kafka).
        /// - **DataHub**: DataHub, an Alibaba cloud streaming data service.
        /// - **clickhouse**: ClickHouse.
        /// - **DB2**: self-built DB2 LUW.
        /// - **as400**:AS/400.
        /// - **Tablestore**: Tablestore.
        /// - **NOTE:**
        /// - The default value is **MySQL**.
        /// - For more information about the supported source and destination databases, see [Database, Synchronization Initialization Type, and Synchronization Topology](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-synchronization-scenarios-1) and [Supported Database and Migration Type](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-migration-scenarios).
        /// - This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("destinationEndpointEngineName")]
        public Input<string>? DestinationEndpointEngineName { get; set; }

        /// <summary>
        /// The target instance region. For more information, see [List of supported regions](https://www.alibabacloud.com/help/en/data-transmission-service/latest/list-of-supported-regions). **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("destinationRegion")]
        public Input<string>? DestinationRegion { get; set; }

        /// <summary>
        /// Assign a specified number of DU resources to DTS tasks in the DTS exclusive cluster. Valid values: **1** ~ **100**. **NOTE:** The value of this parameter must be within the range of the number of DUs available for the DTS dedicated cluster.
        /// </summary>
        [Input("du")]
        public Input<int>? Du { get; set; }

        /// <summary>
        /// Subscription billing type, Valid values: `ONLY_CONFIGURATION_FEE`: charges only configuration fees; `CONFIGURATION_FEE_AND_DATA_FEE`: charges configuration fees and data traffic fees.
        /// </summary>
        [Input("feeType")]
        public Input<string>? FeeType { get; set; }

        /// <summary>
        /// The type of the migration or synchronization instance.
        /// - The specifications of the migration instance: **xxlarge**, **xlarge**, **large**, **medium**, **small**.
        /// - The types of synchronization instances: **large**, **medium**, **small**, **micro**.
        /// - **NOTE:** For performance descriptions of different specifications, see [Data Migration Link Specifications](https://www.alibabacloud.com/help/en/data-transmission-service/latest/cd773b) and [Data Synchronization Link Specifications](https://www.alibabacloud.com/help/en/data-transmission-service/latest/6bce7c).
        /// </summary>
        [Input("instanceClass")]
        public Input<string>? InstanceClass { get; set; }

        /// <summary>
        /// The ID of the task obtained by calling the **ConfigureDtsJob** operation (**DtsJobId**).&gt; After you pass in this parameter, you do not need to pass the **source_region**, **destination_region**, **type**, **source_endpoint_engine_name**, or **destination_endpoint_engine_name** parameters. Even if the input is passed in, the configuration in **job_id** shall prevail.
        /// </summary>
        [Input("jobId")]
        public Input<string>? JobId { get; set; }

        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`, `PayAsYouGo`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The billing method of the subscription instance. Value: `Year`, `Month`. **NOTE:** This parameter is valid and must be passed in only when `payment_type` is `Subscription`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// Resource Group ID.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// Source instance database engine type.
        /// - **MySQL**:MySQL databases (including RDS MySQL and self-built MySQL).
        /// - **PolarDB**:PolarDB MySQL.
        /// - **polardb_o**:PolarDB O engine.
        /// - **polardb_pg**:PolarDB PostgreSQL.
        /// - **Redis**:Redis databases (including apsaradb for Redis and user-created Redis).
        /// - **DRDS**: cloud-native distributed database PolarDB-X 1.0 and 2.0.
        /// - **PostgreSQL**: User-created PostgreSQL.
        /// - **ODPS**:MaxCompute.
        /// - **oracle**: self-built Oracle.
        /// - **mongodb**:MongoDB databases (including apsaradb for MongoDB and user-created MongoDB).
        /// - **tidb**:TiDB database.
        /// - **ADS**: Cloud native data warehouse AnalyticDB MySQL 2.0.
        /// - **ADB30**: Cloud native data warehouse AnalyticDB MySQL 3.0.
        /// - **Greenplum**: Cloud native data warehouse AnalyticDB PostgreSQL.
        /// - **MSSQL**:SQL Server databases (including RDS SQL Server and self-built SQL Server).
        /// - **kafka**:Kafka databases (including Kafka and self-built Kafka).
        /// - **DataHub**: DataHub, an Alibaba cloud streaming data service.
        /// - **clickhouse**: ClickHouse.
        /// - **DB2**: self-built DB2 LUW.
        /// - **as400**:AS/400.
        /// - **Tablestore**: Tablestore.
        /// - **NOTE:**
        /// - The default value is **MySQL**.
        /// - For more information about the supported source and destination databases, see [Database, Synchronization Initialization Type, and Synchronization Topology](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-synchronization-scenarios-1) and [Supported Database and Migration Type](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-migration-scenarios).
        /// - This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("sourceEndpointEngineName")]
        public Input<string>? SourceEndpointEngineName { get; set; }

        /// <summary>
        /// The source instance region. For more information, see [List of supported regions](https://www.alibabacloud.com/help/en/data-transmission-service/latest/list-of-supported-regions). **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("sourceRegion")]
        public Input<string>? SourceRegion { get; set; }

        /// <summary>
        /// Synchronization topology, value:
        /// - **oneway**: one-way synchronization, the default value.
        /// - **bidirectional**: two-way synchronization.
        /// </summary>
        [Input("syncArchitecture")]
        public Input<string>? SyncArchitecture { get; set; }

        /// <summary>
        /// The synchronization direction. Default value: `Forward`. Valid values:
        /// - `Forward`: Data is synchronized from the source database to the destination database.
        /// - `Reverse`: Data is synchronized from the destination database to the source database.
        /// - **NOTE:** You can set this parameter to Reverse to delete the reverse synchronization task only if the topology is two-way synchronization.
        /// </summary>
        [Input("synchronizationDirection")]
        public Input<string>? SynchronizationDirection { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag value corresponding to the tag key.See the following `Block Tags`.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The instance type. Valid values:
        /// - **migration**: MIGRATION.
        /// - **sync**: synchronization.
        /// - **subscribe**: SUBSCRIBE.
        /// - **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Prepaid instance purchase duration.
        /// - When **period** is **Month**, the values are: 1, 2, 3, 4, 5, 6, 7, 8, and 9.
        /// - When **Period** is **Year**, the values are 1, 2, 3, and 5.
        /// - **NOTE:**
        /// - This parameter is valid and must be passed in only when **payment_type** is `Subscription`.
        /// - The billing method of the subscription instance. You can set the parameter `period`.
        /// </summary>
        [Input("usedTime")]
        public Input<int>? UsedTime { get; set; }

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to automatically renew the fee when it expires. Valid values:
        /// - **false**: No, the default value.
        /// - **true**: Yes.
        /// </summary>
        [Input("autoPay")]
        public Input<bool>? AutoPay { get; set; }

        /// <summary>
        /// Whether to start the task automatically after the purchase is completed. Value:
        /// - **false**: No, the default value.
        /// - **true**: Yes.
        /// </summary>
        [Input("autoStart")]
        public Input<bool>? AutoStart { get; set; }

        /// <summary>
        /// Specifications of ETL. The unit is compute unit (CU),1CU = 1vCPU +4GB of memory. The value range is an integer greater than or equal to 2. **NOTE:** Enter this parameter and enable ETL to clean and convert data.
        /// </summary>
        [Input("computeUnit")]
        public Input<int>? ComputeUnit { get; set; }

        /// <summary>
        /// Instance creation time
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The number of private custom RDS instances in the PolarDB-X. The default value is **1**. **NOTE:** This parameter is required only when **source_endpoint_engine_name** is **DRDS**.
        /// </summary>
        [Input("databaseCount")]
        public Input<int>? DatabaseCount { get; set; }

        /// <summary>
        /// The target database engine type.
        /// - **MySQL**:MySQL databases (including RDS MySQL and self-built MySQL).
        /// - **PolarDB**:PolarDB MySQL.
        /// - **polardb_o**:PolarDB O engine.
        /// - **polardb_pg**:PolarDB PostgreSQL.
        /// - **Redis**:Redis databases (including apsaradb for Redis and user-created Redis).
        /// - **DRDS**: cloud-native distributed database PolarDB-X 1.0 and 2.0.
        /// - **PostgreSQL**: User-created PostgreSQL.
        /// - **ODPS**:MaxCompute project.
        /// - **oracle**: self-built Oracle.
        /// - **mongodb**:MongoDB databases (including apsaradb for MongoDB and user-created MongoDB).
        /// - **tidb**:TiDB database.
        /// - **ADS**: Cloud native data warehouse AnalyticDB MySQL 2.0.
        /// - **ADB30**: Cloud native data warehouse AnalyticDB MySQL 3.0.
        /// - **Greenplum**: Cloud native data warehouse AnalyticDB PostgreSQL.
        /// - **MSSQL**:SQL Server databases (including RDS SQL Server and self-built SQL Server).
        /// - **kafka**:Kafka databases (including Kafka and self-built Kafka).
        /// - **DataHub**: DataHub, an Alibaba cloud streaming data service.
        /// - **clickhouse**: ClickHouse.
        /// - **DB2**: self-built DB2 LUW.
        /// - **as400**:AS/400.
        /// - **Tablestore**: Tablestore.
        /// - **NOTE:**
        /// - The default value is **MySQL**.
        /// - For more information about the supported source and destination databases, see [Database, Synchronization Initialization Type, and Synchronization Topology](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-synchronization-scenarios-1) and [Supported Database and Migration Type](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-migration-scenarios).
        /// - This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("destinationEndpointEngineName")]
        public Input<string>? DestinationEndpointEngineName { get; set; }

        /// <summary>
        /// The target instance region. For more information, see [List of supported regions](https://www.alibabacloud.com/help/en/data-transmission-service/latest/list-of-supported-regions). **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("destinationRegion")]
        public Input<string>? DestinationRegion { get; set; }

        /// <summary>
        /// The ID of the subscription instance.
        /// </summary>
        [Input("dtsInstanceId")]
        public Input<string>? DtsInstanceId { get; set; }

        /// <summary>
        /// Assign a specified number of DU resources to DTS tasks in the DTS exclusive cluster. Valid values: **1** ~ **100**. **NOTE:** The value of this parameter must be within the range of the number of DUs available for the DTS dedicated cluster.
        /// </summary>
        [Input("du")]
        public Input<int>? Du { get; set; }

        /// <summary>
        /// Subscription billing type, Valid values: `ONLY_CONFIGURATION_FEE`: charges only configuration fees; `CONFIGURATION_FEE_AND_DATA_FEE`: charges configuration fees and data traffic fees.
        /// </summary>
        [Input("feeType")]
        public Input<string>? FeeType { get; set; }

        /// <summary>
        /// The type of the migration or synchronization instance.
        /// - The specifications of the migration instance: **xxlarge**, **xlarge**, **large**, **medium**, **small**.
        /// - The types of synchronization instances: **large**, **medium**, **small**, **micro**.
        /// - **NOTE:** For performance descriptions of different specifications, see [Data Migration Link Specifications](https://www.alibabacloud.com/help/en/data-transmission-service/latest/cd773b) and [Data Synchronization Link Specifications](https://www.alibabacloud.com/help/en/data-transmission-service/latest/6bce7c).
        /// </summary>
        [Input("instanceClass")]
        public Input<string>? InstanceClass { get; set; }

        /// <summary>
        /// The name of Dts instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The ID of the task obtained by calling the **ConfigureDtsJob** operation (**DtsJobId**).&gt; After you pass in this parameter, you do not need to pass the **source_region**, **destination_region**, **type**, **source_endpoint_engine_name**, or **destination_endpoint_engine_name** parameters. Even if the input is passed in, the configuration in **job_id** shall prevail.
        /// </summary>
        [Input("jobId")]
        public Input<string>? JobId { get; set; }

        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`, `PayAsYouGo`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The billing method of the subscription instance. Value: `Year`, `Month`. **NOTE:** This parameter is valid and must be passed in only when `payment_type` is `Subscription`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// Resource Group ID.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// Source instance database engine type.
        /// - **MySQL**:MySQL databases (including RDS MySQL and self-built MySQL).
        /// - **PolarDB**:PolarDB MySQL.
        /// - **polardb_o**:PolarDB O engine.
        /// - **polardb_pg**:PolarDB PostgreSQL.
        /// - **Redis**:Redis databases (including apsaradb for Redis and user-created Redis).
        /// - **DRDS**: cloud-native distributed database PolarDB-X 1.0 and 2.0.
        /// - **PostgreSQL**: User-created PostgreSQL.
        /// - **ODPS**:MaxCompute.
        /// - **oracle**: self-built Oracle.
        /// - **mongodb**:MongoDB databases (including apsaradb for MongoDB and user-created MongoDB).
        /// - **tidb**:TiDB database.
        /// - **ADS**: Cloud native data warehouse AnalyticDB MySQL 2.0.
        /// - **ADB30**: Cloud native data warehouse AnalyticDB MySQL 3.0.
        /// - **Greenplum**: Cloud native data warehouse AnalyticDB PostgreSQL.
        /// - **MSSQL**:SQL Server databases (including RDS SQL Server and self-built SQL Server).
        /// - **kafka**:Kafka databases (including Kafka and self-built Kafka).
        /// - **DataHub**: DataHub, an Alibaba cloud streaming data service.
        /// - **clickhouse**: ClickHouse.
        /// - **DB2**: self-built DB2 LUW.
        /// - **as400**:AS/400.
        /// - **Tablestore**: Tablestore.
        /// - **NOTE:**
        /// - The default value is **MySQL**.
        /// - For more information about the supported source and destination databases, see [Database, Synchronization Initialization Type, and Synchronization Topology](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-synchronization-scenarios-1) and [Supported Database and Migration Type](https://www.alibabacloud.com/help/en/data-transmission-service/latest/overview-of-data-migration-scenarios).
        /// - This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("sourceEndpointEngineName")]
        public Input<string>? SourceEndpointEngineName { get; set; }

        /// <summary>
        /// The source instance region. For more information, see [List of supported regions](https://www.alibabacloud.com/help/en/data-transmission-service/latest/list-of-supported-regions). **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("sourceRegion")]
        public Input<string>? SourceRegion { get; set; }

        /// <summary>
        /// Instance status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Synchronization topology, value:
        /// - **oneway**: one-way synchronization, the default value.
        /// - **bidirectional**: two-way synchronization.
        /// </summary>
        [Input("syncArchitecture")]
        public Input<string>? SyncArchitecture { get; set; }

        /// <summary>
        /// The synchronization direction. Default value: `Forward`. Valid values:
        /// - `Forward`: Data is synchronized from the source database to the destination database.
        /// - `Reverse`: Data is synchronized from the destination database to the source database.
        /// - **NOTE:** You can set this parameter to Reverse to delete the reverse synchronization task only if the topology is two-way synchronization.
        /// </summary>
        [Input("synchronizationDirection")]
        public Input<string>? SynchronizationDirection { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag value corresponding to the tag key.See the following `Block Tags`.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The instance type. Valid values:
        /// - **migration**: MIGRATION.
        /// - **sync**: synchronization.
        /// - **subscribe**: SUBSCRIBE.
        /// - **NOTE:** This parameter or **job_id** must be passed in.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Prepaid instance purchase duration.
        /// - When **period** is **Month**, the values are: 1, 2, 3, 4, 5, 6, 7, 8, and 9.
        /// - When **Period** is **Year**, the values are 1, 2, 3, and 5.
        /// - **NOTE:**
        /// - This parameter is valid and must be passed in only when **payment_type** is `Subscription`.
        /// - The billing method of the subscription instance. You can set the parameter `period`.
        /// </summary>
        [Input("usedTime")]
        public Input<int>? UsedTime { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
