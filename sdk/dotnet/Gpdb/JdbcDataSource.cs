// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb
{
    /// <summary>
    /// Provides a GPDB Jdbc Data Source resource.
    /// 
    /// For information about GPDB Jdbc Data Source and how to use it, see [What is Jdbc Data Source](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.230.0.
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
    ///     var @default = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultGetNetworks = AliCloud.Vpc.GetNetworks.Invoke(new()
    ///     {
    ///         NameRegex = "^default-NODELETING$",
    ///     });
    /// 
    ///     var defaultGetSwitches = AliCloud.Vpc.GetSwitches.Invoke(new()
    ///     {
    ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
    ///         ZoneId = "cn-beijing-h",
    ///     });
    /// 
    ///     var defaulttuqTmM = new AliCloud.Gpdb.Instance("defaulttuqTmM", new()
    ///     {
    ///         InstanceSpec = "2C8G",
    ///         Description = name,
    ///         SegNodeNum = 2,
    ///         SegStorageType = "cloud_essd",
    ///         InstanceNetworkType = "VPC",
    ///         PaymentType = "PayAsYouGo",
    ///         SslEnabled = 0,
    ///         EngineVersion = "6.0",
    ///         ZoneId = "cn-beijing-h",
    ///         VswitchId = defaultGetSwitches.Apply(getSwitchesResult =&gt; getSwitchesResult.Ids[0]),
    ///         StorageSize = 50,
    ///         MasterCu = 4,
    ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
    ///         DbInstanceMode = "StorageElastic",
    ///         Engine = "gpdb",
    ///         DbInstanceCategory = "Basic",
    ///     });
    /// 
    ///     var defaultsk1eaS = new AliCloud.Gpdb.Account("defaultsk1eaS", new()
    ///     {
    ///         AccountDescription = "example_001",
    ///         DbInstanceId = defaulttuqTmM.Id,
    ///         AccountName = "example_001",
    ///         AccountPassword = "example_001",
    ///     });
    /// 
    ///     var defaultRXkfKL = new AliCloud.Gpdb.ExternalDataService("defaultRXkfKL", new()
    ///     {
    ///         ServiceName = name,
    ///         DbInstanceId = defaulttuqTmM.Id,
    ///         ServiceDescription = "myexample",
    ///         ServiceSpec = "8",
    ///     });
    /// 
    ///     var defaultJdbcDataSource = new AliCloud.Gpdb.JdbcDataSource("default", new()
    ///     {
    ///         JdbcConnectionString = "jdbc:mysql://rm-2ze327yr44c61183c.mysql.rds.aliyuncs.com:3306/example_001",
    ///         DataSourceDescription = "myexample",
    ///         DbInstanceId = defaulttuqTmM.Id,
    ///         JdbcPassword = "example_001",
    ///         DataSourceName = defaultRXkfKL.ServiceName,
    ///         DataSourceType = "mysql",
    ///         JdbcUserName = "example_001",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// GPDB Jdbc Data Source can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:gpdb/jdbcDataSource:JdbcDataSource example &lt;db_instance_id&gt;:&lt;data_source_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:gpdb/jdbcDataSource:JdbcDataSource")]
    public partial class JdbcDataSource : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Data Source Description
        /// </summary>
        [Output("dataSourceDescription")]
        public Output<string?> DataSourceDescription { get; private set; } = null!;

        /// <summary>
        /// The data source ID.
        /// </summary>
        [Output("dataSourceId")]
        public Output<string> DataSourceId { get; private set; } = null!;

        /// <summary>
        /// Data Source Name
        /// </summary>
        [Output("dataSourceName")]
        public Output<string?> DataSourceName { get; private set; } = null!;

        /// <summary>
        /// Data Source Type
        /// </summary>
        [Output("dataSourceType")]
        public Output<string?> DataSourceType { get; private set; } = null!;

        /// <summary>
        /// The instance ID.
        /// </summary>
        [Output("dbInstanceId")]
        public Output<string> DbInstanceId { get; private set; } = null!;

        /// <summary>
        /// The JDBC connection string.
        /// </summary>
        [Output("jdbcConnectionString")]
        public Output<string?> JdbcConnectionString { get; private set; } = null!;

        /// <summary>
        /// The password of the database account.
        /// </summary>
        [Output("jdbcPassword")]
        public Output<string?> JdbcPassword { get; private set; } = null!;

        /// <summary>
        /// The name of the database account.
        /// </summary>
        [Output("jdbcUserName")]
        public Output<string> JdbcUserName { get; private set; } = null!;

        /// <summary>
        /// Data Source Status
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a JdbcDataSource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public JdbcDataSource(string name, JdbcDataSourceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:gpdb/jdbcDataSource:JdbcDataSource", name, args ?? new JdbcDataSourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private JdbcDataSource(string name, Input<string> id, JdbcDataSourceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:gpdb/jdbcDataSource:JdbcDataSource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing JdbcDataSource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static JdbcDataSource Get(string name, Input<string> id, JdbcDataSourceState? state = null, CustomResourceOptions? options = null)
        {
            return new JdbcDataSource(name, id, state, options);
        }
    }

    public sealed class JdbcDataSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Data Source Description
        /// </summary>
        [Input("dataSourceDescription")]
        public Input<string>? DataSourceDescription { get; set; }

        /// <summary>
        /// Data Source Name
        /// </summary>
        [Input("dataSourceName")]
        public Input<string>? DataSourceName { get; set; }

        /// <summary>
        /// Data Source Type
        /// </summary>
        [Input("dataSourceType")]
        public Input<string>? DataSourceType { get; set; }

        /// <summary>
        /// The instance ID.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public Input<string> DbInstanceId { get; set; } = null!;

        /// <summary>
        /// The JDBC connection string.
        /// </summary>
        [Input("jdbcConnectionString")]
        public Input<string>? JdbcConnectionString { get; set; }

        /// <summary>
        /// The password of the database account.
        /// </summary>
        [Input("jdbcPassword")]
        public Input<string>? JdbcPassword { get; set; }

        /// <summary>
        /// The name of the database account.
        /// </summary>
        [Input("jdbcUserName", required: true)]
        public Input<string> JdbcUserName { get; set; } = null!;

        public JdbcDataSourceArgs()
        {
        }
        public static new JdbcDataSourceArgs Empty => new JdbcDataSourceArgs();
    }

    public sealed class JdbcDataSourceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Data Source Description
        /// </summary>
        [Input("dataSourceDescription")]
        public Input<string>? DataSourceDescription { get; set; }

        /// <summary>
        /// The data source ID.
        /// </summary>
        [Input("dataSourceId")]
        public Input<string>? DataSourceId { get; set; }

        /// <summary>
        /// Data Source Name
        /// </summary>
        [Input("dataSourceName")]
        public Input<string>? DataSourceName { get; set; }

        /// <summary>
        /// Data Source Type
        /// </summary>
        [Input("dataSourceType")]
        public Input<string>? DataSourceType { get; set; }

        /// <summary>
        /// The instance ID.
        /// </summary>
        [Input("dbInstanceId")]
        public Input<string>? DbInstanceId { get; set; }

        /// <summary>
        /// The JDBC connection string.
        /// </summary>
        [Input("jdbcConnectionString")]
        public Input<string>? JdbcConnectionString { get; set; }

        /// <summary>
        /// The password of the database account.
        /// </summary>
        [Input("jdbcPassword")]
        public Input<string>? JdbcPassword { get; set; }

        /// <summary>
        /// The name of the database account.
        /// </summary>
        [Input("jdbcUserName")]
        public Input<string>? JdbcUserName { get; set; }

        /// <summary>
        /// Data Source Status
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public JdbcDataSourceState()
        {
        }
        public static new JdbcDataSourceState Empty => new JdbcDataSourceState();
    }
}