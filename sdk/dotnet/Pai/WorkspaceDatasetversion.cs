// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pai
{
    /// <summary>
    /// Provides a PAI Workspace Datasetversion resource.
    /// 
    /// For information about PAI Workspace Dataset Version and how to use it, see [What is Dataset Version](https://next.api.alibabacloud.com/document/AIWorkSpace/2021-02-04/CreateDatasetVersion).
    /// &gt; **NOTE:** Available since v1.236.0.
    /// 
    /// ## Import
    /// 
    /// PAI Workspace Datasetversion can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:pai/workspaceDatasetversion:WorkspaceDatasetversion example &lt;dataset_id&gt;:&lt;version_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:pai/workspaceDatasetversion:WorkspaceDatasetversion")]
    public partial class WorkspaceDatasetversion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Update time.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Data count.
        /// </summary>
        [Output("dataCount")]
        public Output<int?> DataCount { get; private set; } = null!;

        /// <summary>
        /// Data size.
        /// </summary>
        [Output("dataSize")]
        public Output<int?> DataSize { get; private set; } = null!;

        /// <summary>
        /// The data source type. The following values are supported:
        /// - OSS: Alibaba Cloud Object Storage (OSS).
        /// - NAS: Alibaba cloud file storage (NAS).
        /// </summary>
        [Output("dataSourceType")]
        public Output<string> DataSourceType { get; private set; } = null!;

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Output("datasetId")]
        public Output<string> DatasetId { get; private set; } = null!;

        /// <summary>
        /// Description of dataset version.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The tag of the resource See `labels` below.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<Outputs.WorkspaceDatasetversionLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// The extended field, which is of the JsonString type.
        /// 
        /// When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
        /// </summary>
        [Output("options")]
        public Output<string?> Options { get; private set; } = null!;

        /// <summary>
        /// The properties of the dataset. The following values are supported:
        /// - FILE: FILE.
        /// - DIRECTORY: folder.
        /// </summary>
        [Output("property")]
        public Output<string> Property { get; private set; } = null!;

        /// <summary>
        /// The data source ID.
        /// </summary>
        [Output("sourceId")]
        public Output<string?> SourceId { get; private set; } = null!;

        /// <summary>
        /// The data source type. The default value is USER.
        /// </summary>
        [Output("sourceType")]
        public Output<string?> SourceType { get; private set; } = null!;

        /// <summary>
        /// The Uri configuration sample is as follows:
        /// - The data source type is OSS:'oss:// bucket.endpoint/object'
        /// - The data source type is NAS:
        /// 
        /// The general NAS format is: 'nas://.region/subpath/to/dir/';
        /// 
        /// CPFS1.0:'nas://.region/subpath/to/dir /';
        /// 
        /// CPFS2.0:'nas://.region//'.
        /// 
        /// CPFS1.0 and CPFS2.0 are distinguished by the format of fsid: CPFS1.0 is cpfs-;CPFS2.0 is cpfs-.
        /// </summary>
        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Output("versionName")]
        public Output<string> VersionName { get; private set; } = null!;


        /// <summary>
        /// Create a WorkspaceDatasetversion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkspaceDatasetversion(string name, WorkspaceDatasetversionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:pai/workspaceDatasetversion:WorkspaceDatasetversion", name, args ?? new WorkspaceDatasetversionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkspaceDatasetversion(string name, Input<string> id, WorkspaceDatasetversionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:pai/workspaceDatasetversion:WorkspaceDatasetversion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkspaceDatasetversion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkspaceDatasetversion Get(string name, Input<string> id, WorkspaceDatasetversionState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkspaceDatasetversion(name, id, state, options);
        }
    }

    public sealed class WorkspaceDatasetversionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Data count.
        /// </summary>
        [Input("dataCount")]
        public Input<int>? DataCount { get; set; }

        /// <summary>
        /// Data size.
        /// </summary>
        [Input("dataSize")]
        public Input<int>? DataSize { get; set; }

        /// <summary>
        /// The data source type. The following values are supported:
        /// - OSS: Alibaba Cloud Object Storage (OSS).
        /// - NAS: Alibaba cloud file storage (NAS).
        /// </summary>
        [Input("dataSourceType", required: true)]
        public Input<string> DataSourceType { get; set; } = null!;

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Input("datasetId", required: true)]
        public Input<string> DatasetId { get; set; } = null!;

        /// <summary>
        /// Description of dataset version.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputList<Inputs.WorkspaceDatasetversionLabelArgs>? _labels;

        /// <summary>
        /// The tag of the resource See `labels` below.
        /// </summary>
        public InputList<Inputs.WorkspaceDatasetversionLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.WorkspaceDatasetversionLabelArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// The extended field, which is of the JsonString type.
        /// 
        /// When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
        /// </summary>
        [Input("options")]
        public Input<string>? Options { get; set; }

        /// <summary>
        /// The properties of the dataset. The following values are supported:
        /// - FILE: FILE.
        /// - DIRECTORY: folder.
        /// </summary>
        [Input("property", required: true)]
        public Input<string> Property { get; set; } = null!;

        /// <summary>
        /// The data source ID.
        /// </summary>
        [Input("sourceId")]
        public Input<string>? SourceId { get; set; }

        /// <summary>
        /// The data source type. The default value is USER.
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// The Uri configuration sample is as follows:
        /// - The data source type is OSS:'oss:// bucket.endpoint/object'
        /// - The data source type is NAS:
        /// 
        /// The general NAS format is: 'nas://.region/subpath/to/dir/';
        /// 
        /// CPFS1.0:'nas://.region/subpath/to/dir /';
        /// 
        /// CPFS2.0:'nas://.region//'.
        /// 
        /// CPFS1.0 and CPFS2.0 are distinguished by the format of fsid: CPFS1.0 is cpfs-;CPFS2.0 is cpfs-.
        /// </summary>
        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        public WorkspaceDatasetversionArgs()
        {
        }
        public static new WorkspaceDatasetversionArgs Empty => new WorkspaceDatasetversionArgs();
    }

    public sealed class WorkspaceDatasetversionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Update time.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Data count.
        /// </summary>
        [Input("dataCount")]
        public Input<int>? DataCount { get; set; }

        /// <summary>
        /// Data size.
        /// </summary>
        [Input("dataSize")]
        public Input<int>? DataSize { get; set; }

        /// <summary>
        /// The data source type. The following values are supported:
        /// - OSS: Alibaba Cloud Object Storage (OSS).
        /// - NAS: Alibaba cloud file storage (NAS).
        /// </summary>
        [Input("dataSourceType")]
        public Input<string>? DataSourceType { get; set; }

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Input("datasetId")]
        public Input<string>? DatasetId { get; set; }

        /// <summary>
        /// Description of dataset version.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputList<Inputs.WorkspaceDatasetversionLabelGetArgs>? _labels;

        /// <summary>
        /// The tag of the resource See `labels` below.
        /// </summary>
        public InputList<Inputs.WorkspaceDatasetversionLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.WorkspaceDatasetversionLabelGetArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// The extended field, which is of the JsonString type.
        /// 
        /// When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
        /// </summary>
        [Input("options")]
        public Input<string>? Options { get; set; }

        /// <summary>
        /// The properties of the dataset. The following values are supported:
        /// - FILE: FILE.
        /// - DIRECTORY: folder.
        /// </summary>
        [Input("property")]
        public Input<string>? Property { get; set; }

        /// <summary>
        /// The data source ID.
        /// </summary>
        [Input("sourceId")]
        public Input<string>? SourceId { get; set; }

        /// <summary>
        /// The data source type. The default value is USER.
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// The Uri configuration sample is as follows:
        /// - The data source type is OSS:'oss:// bucket.endpoint/object'
        /// - The data source type is NAS:
        /// 
        /// The general NAS format is: 'nas://.region/subpath/to/dir/';
        /// 
        /// CPFS1.0:'nas://.region/subpath/to/dir /';
        /// 
        /// CPFS2.0:'nas://.region//'.
        /// 
        /// CPFS1.0 and CPFS2.0 are distinguished by the format of fsid: CPFS1.0 is cpfs-;CPFS2.0 is cpfs-.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Input("versionName")]
        public Input<string>? VersionName { get; set; }

        public WorkspaceDatasetversionState()
        {
        }
        public static new WorkspaceDatasetversionState Empty => new WorkspaceDatasetversionState();
    }
}
