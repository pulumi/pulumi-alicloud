// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log
{
    /// <summary>
    /// Log service data delivery management, this service provides the function of delivering data in logstore to oss product storage.
    /// [Refer to details](https://www.alibabacloud.com/help/en/doc-detail/43724.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.121.0.
    /// 
    /// &gt; **DEPRECATED:**  This resource has been deprecated from version `1.215.0`. Please use new resource alicloud_log_oss_export.
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
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Max = 99999,
    ///         Min = 10000,
    ///     });
    /// 
    ///     var example = new AliCloud.Log.Project("example", new()
    ///     {
    ///         Name = $"terraform-example-{@default.Result}",
    ///         Description = "terraform-example",
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "example" },
    ///         },
    ///     });
    /// 
    ///     var exampleStore = new AliCloud.Log.Store("example", new()
    ///     {
    ///         Project = example.Name,
    ///         Name = "example-store",
    ///         RetentionPeriod = 3650,
    ///         AutoSplit = true,
    ///         MaxSplitShardCount = 60,
    ///         AppendMeta = true,
    ///     });
    /// 
    ///     var exampleOssShipper = new AliCloud.Log.OssShipper("example", new()
    ///     {
    ///         ProjectName = example.Name,
    ///         LogstoreName = exampleStore.Name,
    ///         ShipperName = "terraform-example",
    ///         OssBucket = "example_bucket",
    ///         OssPrefix = "root",
    ///         BufferInterval = 300,
    ///         BufferSize = 250,
    ///         CompressType = "none",
    ///         PathFormat = "%Y/%m/%d/%H/%M",
    ///         Format = "json",
    ///         JsonEnableTag = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Log oss shipper can be imported using the id or name, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:log/ossShipper:OssShipper example tf-log-project:tf-log-logstore:tf-log-shipper
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:log/ossShipper:OssShipper")]
    public partial class OssShipper : global::Pulumi.CustomResource
    {
        /// <summary>
        /// How often is it delivered every interval.
        /// </summary>
        [Output("bufferInterval")]
        public Output<int> BufferInterval { get; private set; } = null!;

        /// <summary>
        /// Automatically control the creation interval of delivery tasks and set the upper limit of an OSS object size (calculated in uncompressed), unit: `MB`.
        /// </summary>
        [Output("bufferSize")]
        public Output<int> BufferSize { get; private set; } = null!;

        /// <summary>
        /// OSS data storage compression method, support: none, snappy. Among them, none means that the original data is not compressed, and snappy means that the data is compressed using the snappy algorithm, which can reduce the storage space usage of the `OSS Bucket`.
        /// </summary>
        [Output("compressType")]
        public Output<string?> CompressType { get; private set; } = null!;

        [Output("csvConfigColumns")]
        public Output<ImmutableArray<string>> CsvConfigColumns { get; private set; } = null!;

        [Output("csvConfigDelimiter")]
        public Output<string?> CsvConfigDelimiter { get; private set; } = null!;

        [Output("csvConfigHeader")]
        public Output<bool?> CsvConfigHeader { get; private set; } = null!;

        [Output("csvConfigLinefeed")]
        public Output<string?> CsvConfigLinefeed { get; private set; } = null!;

        [Output("csvConfigNullidentifier")]
        public Output<string?> CsvConfigNullidentifier { get; private set; } = null!;

        [Output("csvConfigQuote")]
        public Output<string?> CsvConfigQuote { get; private set; } = null!;

        /// <summary>
        /// Storage format, only supports three types: `json`, `parquet`, `csv`.
        /// **According to the different format, please select the following parameters**
        /// - format = `json`
        /// `json_enable_tag` - (Optional) Whether to deliver the label.
        /// - format = `csv`
        /// `csv_config_delimiter` - (Optional) Separator configuration in csv configuration format.
        /// `csv_config_columns` - (Optional) Field configuration in csv configuration format.
        /// `csv_config_nullidentifier` - (Optional) Invalid field content.
        /// `csv_config_quote` - (Optional) Escape character under csv configuration.
        /// `csv_config_header` - (Optional) Indicates whether to write the field name to the CSV file, the default value is `false`.
        /// `csv_config_linefeed` - (Optional) lineFeed in csv configuration.
        /// - format = `parquet`
        /// `parquet_config` - (Optional) Configure to use parquet storage format.
        /// `name` - (Required) The name of the key.
        /// `type` - (Required) Type of configuration name.
        /// </summary>
        [Output("format")]
        public Output<string> Format { get; private set; } = null!;

        [Output("jsonEnableTag")]
        public Output<bool?> JsonEnableTag { get; private set; } = null!;

        /// <summary>
        /// The name of the log logstore.
        /// </summary>
        [Output("logstoreName")]
        public Output<string> LogstoreName { get; private set; } = null!;

        /// <summary>
        /// The name of the oss bucket.
        /// </summary>
        [Output("ossBucket")]
        public Output<string> OssBucket { get; private set; } = null!;

        /// <summary>
        /// The data synchronized from Log Service to OSS will be stored in this directory of Bucket.
        /// </summary>
        [Output("ossPrefix")]
        public Output<string?> OssPrefix { get; private set; } = null!;

        [Output("parquetConfigs")]
        public Output<ImmutableArray<Outputs.OssShipperParquetConfig>> ParquetConfigs { get; private set; } = null!;

        /// <summary>
        /// The OSS Bucket directory is dynamically generated according to the creation time of the shipper task, it cannot start with a forward slash `/`, the default value is `%Y/%m/%d/%H/%M`.
        /// </summary>
        [Output("pathFormat")]
        public Output<string> PathFormat { get; private set; } = null!;

        /// <summary>
        /// The name of the log project. It is the only in one Alicloud account.
        /// </summary>
        [Output("projectName")]
        public Output<string> ProjectName { get; private set; } = null!;

        /// <summary>
        /// Used for access control, the OSS Bucket owner creates the role mark, such as `acs:ram::13234:role/logrole`
        /// </summary>
        [Output("roleArn")]
        public Output<string?> RoleArn { get; private set; } = null!;

        /// <summary>
        /// Delivery configuration name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
        /// </summary>
        [Output("shipperName")]
        public Output<string> ShipperName { get; private set; } = null!;


        /// <summary>
        /// Create a OssShipper resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OssShipper(string name, OssShipperArgs args, CustomResourceOptions? options = null)
            : base("alicloud:log/ossShipper:OssShipper", name, args ?? new OssShipperArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OssShipper(string name, Input<string> id, OssShipperState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:log/ossShipper:OssShipper", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OssShipper resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OssShipper Get(string name, Input<string> id, OssShipperState? state = null, CustomResourceOptions? options = null)
        {
            return new OssShipper(name, id, state, options);
        }
    }

    public sealed class OssShipperArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// How often is it delivered every interval.
        /// </summary>
        [Input("bufferInterval", required: true)]
        public Input<int> BufferInterval { get; set; } = null!;

        /// <summary>
        /// Automatically control the creation interval of delivery tasks and set the upper limit of an OSS object size (calculated in uncompressed), unit: `MB`.
        /// </summary>
        [Input("bufferSize", required: true)]
        public Input<int> BufferSize { get; set; } = null!;

        /// <summary>
        /// OSS data storage compression method, support: none, snappy. Among them, none means that the original data is not compressed, and snappy means that the data is compressed using the snappy algorithm, which can reduce the storage space usage of the `OSS Bucket`.
        /// </summary>
        [Input("compressType")]
        public Input<string>? CompressType { get; set; }

        [Input("csvConfigColumns")]
        private InputList<string>? _csvConfigColumns;
        public InputList<string> CsvConfigColumns
        {
            get => _csvConfigColumns ?? (_csvConfigColumns = new InputList<string>());
            set => _csvConfigColumns = value;
        }

        [Input("csvConfigDelimiter")]
        public Input<string>? CsvConfigDelimiter { get; set; }

        [Input("csvConfigHeader")]
        public Input<bool>? CsvConfigHeader { get; set; }

        [Input("csvConfigLinefeed")]
        public Input<string>? CsvConfigLinefeed { get; set; }

        [Input("csvConfigNullidentifier")]
        public Input<string>? CsvConfigNullidentifier { get; set; }

        [Input("csvConfigQuote")]
        public Input<string>? CsvConfigQuote { get; set; }

        /// <summary>
        /// Storage format, only supports three types: `json`, `parquet`, `csv`.
        /// **According to the different format, please select the following parameters**
        /// - format = `json`
        /// `json_enable_tag` - (Optional) Whether to deliver the label.
        /// - format = `csv`
        /// `csv_config_delimiter` - (Optional) Separator configuration in csv configuration format.
        /// `csv_config_columns` - (Optional) Field configuration in csv configuration format.
        /// `csv_config_nullidentifier` - (Optional) Invalid field content.
        /// `csv_config_quote` - (Optional) Escape character under csv configuration.
        /// `csv_config_header` - (Optional) Indicates whether to write the field name to the CSV file, the default value is `false`.
        /// `csv_config_linefeed` - (Optional) lineFeed in csv configuration.
        /// - format = `parquet`
        /// `parquet_config` - (Optional) Configure to use parquet storage format.
        /// `name` - (Required) The name of the key.
        /// `type` - (Required) Type of configuration name.
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        [Input("jsonEnableTag")]
        public Input<bool>? JsonEnableTag { get; set; }

        /// <summary>
        /// The name of the log logstore.
        /// </summary>
        [Input("logstoreName", required: true)]
        public Input<string> LogstoreName { get; set; } = null!;

        /// <summary>
        /// The name of the oss bucket.
        /// </summary>
        [Input("ossBucket", required: true)]
        public Input<string> OssBucket { get; set; } = null!;

        /// <summary>
        /// The data synchronized from Log Service to OSS will be stored in this directory of Bucket.
        /// </summary>
        [Input("ossPrefix")]
        public Input<string>? OssPrefix { get; set; }

        [Input("parquetConfigs")]
        private InputList<Inputs.OssShipperParquetConfigArgs>? _parquetConfigs;
        public InputList<Inputs.OssShipperParquetConfigArgs> ParquetConfigs
        {
            get => _parquetConfigs ?? (_parquetConfigs = new InputList<Inputs.OssShipperParquetConfigArgs>());
            set => _parquetConfigs = value;
        }

        /// <summary>
        /// The OSS Bucket directory is dynamically generated according to the creation time of the shipper task, it cannot start with a forward slash `/`, the default value is `%Y/%m/%d/%H/%M`.
        /// </summary>
        [Input("pathFormat", required: true)]
        public Input<string> PathFormat { get; set; } = null!;

        /// <summary>
        /// The name of the log project. It is the only in one Alicloud account.
        /// </summary>
        [Input("projectName", required: true)]
        public Input<string> ProjectName { get; set; } = null!;

        /// <summary>
        /// Used for access control, the OSS Bucket owner creates the role mark, such as `acs:ram::13234:role/logrole`
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// Delivery configuration name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
        /// </summary>
        [Input("shipperName", required: true)]
        public Input<string> ShipperName { get; set; } = null!;

        public OssShipperArgs()
        {
        }
        public static new OssShipperArgs Empty => new OssShipperArgs();
    }

    public sealed class OssShipperState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// How often is it delivered every interval.
        /// </summary>
        [Input("bufferInterval")]
        public Input<int>? BufferInterval { get; set; }

        /// <summary>
        /// Automatically control the creation interval of delivery tasks and set the upper limit of an OSS object size (calculated in uncompressed), unit: `MB`.
        /// </summary>
        [Input("bufferSize")]
        public Input<int>? BufferSize { get; set; }

        /// <summary>
        /// OSS data storage compression method, support: none, snappy. Among them, none means that the original data is not compressed, and snappy means that the data is compressed using the snappy algorithm, which can reduce the storage space usage of the `OSS Bucket`.
        /// </summary>
        [Input("compressType")]
        public Input<string>? CompressType { get; set; }

        [Input("csvConfigColumns")]
        private InputList<string>? _csvConfigColumns;
        public InputList<string> CsvConfigColumns
        {
            get => _csvConfigColumns ?? (_csvConfigColumns = new InputList<string>());
            set => _csvConfigColumns = value;
        }

        [Input("csvConfigDelimiter")]
        public Input<string>? CsvConfigDelimiter { get; set; }

        [Input("csvConfigHeader")]
        public Input<bool>? CsvConfigHeader { get; set; }

        [Input("csvConfigLinefeed")]
        public Input<string>? CsvConfigLinefeed { get; set; }

        [Input("csvConfigNullidentifier")]
        public Input<string>? CsvConfigNullidentifier { get; set; }

        [Input("csvConfigQuote")]
        public Input<string>? CsvConfigQuote { get; set; }

        /// <summary>
        /// Storage format, only supports three types: `json`, `parquet`, `csv`.
        /// **According to the different format, please select the following parameters**
        /// - format = `json`
        /// `json_enable_tag` - (Optional) Whether to deliver the label.
        /// - format = `csv`
        /// `csv_config_delimiter` - (Optional) Separator configuration in csv configuration format.
        /// `csv_config_columns` - (Optional) Field configuration in csv configuration format.
        /// `csv_config_nullidentifier` - (Optional) Invalid field content.
        /// `csv_config_quote` - (Optional) Escape character under csv configuration.
        /// `csv_config_header` - (Optional) Indicates whether to write the field name to the CSV file, the default value is `false`.
        /// `csv_config_linefeed` - (Optional) lineFeed in csv configuration.
        /// - format = `parquet`
        /// `parquet_config` - (Optional) Configure to use parquet storage format.
        /// `name` - (Required) The name of the key.
        /// `type` - (Required) Type of configuration name.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("jsonEnableTag")]
        public Input<bool>? JsonEnableTag { get; set; }

        /// <summary>
        /// The name of the log logstore.
        /// </summary>
        [Input("logstoreName")]
        public Input<string>? LogstoreName { get; set; }

        /// <summary>
        /// The name of the oss bucket.
        /// </summary>
        [Input("ossBucket")]
        public Input<string>? OssBucket { get; set; }

        /// <summary>
        /// The data synchronized from Log Service to OSS will be stored in this directory of Bucket.
        /// </summary>
        [Input("ossPrefix")]
        public Input<string>? OssPrefix { get; set; }

        [Input("parquetConfigs")]
        private InputList<Inputs.OssShipperParquetConfigGetArgs>? _parquetConfigs;
        public InputList<Inputs.OssShipperParquetConfigGetArgs> ParquetConfigs
        {
            get => _parquetConfigs ?? (_parquetConfigs = new InputList<Inputs.OssShipperParquetConfigGetArgs>());
            set => _parquetConfigs = value;
        }

        /// <summary>
        /// The OSS Bucket directory is dynamically generated according to the creation time of the shipper task, it cannot start with a forward slash `/`, the default value is `%Y/%m/%d/%H/%M`.
        /// </summary>
        [Input("pathFormat")]
        public Input<string>? PathFormat { get; set; }

        /// <summary>
        /// The name of the log project. It is the only in one Alicloud account.
        /// </summary>
        [Input("projectName")]
        public Input<string>? ProjectName { get; set; }

        /// <summary>
        /// Used for access control, the OSS Bucket owner creates the role mark, such as `acs:ram::13234:role/logrole`
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// Delivery configuration name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
        /// </summary>
        [Input("shipperName")]
        public Input<string>? ShipperName { get; set; }

        public OssShipperState()
        {
        }
        public static new OssShipperState Empty => new OssShipperState();
    }
}
