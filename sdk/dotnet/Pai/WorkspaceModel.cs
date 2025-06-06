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
    /// Provides a PAI Workspace Model resource.
    /// 
    /// For information about PAI Workspace Model and how to use it, see [What is Model](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmodel).
    /// 
    /// &gt; **NOTE:** Available since v1.249.0.
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
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform_example";
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var defaultENuC6u = new AliCloud.Pai.WorkspaceWorkspace("defaultENuC6u", new()
    ///     {
    ///         Description = "156",
    ///         DisplayName = name,
    ///         WorkspaceName = $"{name}_{@default.Result}",
    ///         EnvTypes = new[]
    ///         {
    ///             "prod",
    ///         },
    ///     });
    /// 
    ///     var defaultWorkspaceModel = new AliCloud.Pai.WorkspaceModel("default", new()
    ///     {
    ///         Origin = "Civitai",
    ///         Task = "text-to-image-synthesis",
    ///         ModelName = name,
    ///         Accessibility = "PRIVATE",
    ///         WorkspaceId = defaultENuC6u.Id,
    ///         ModelType = "Checkpoint",
    ///         Labels = new[]
    ///         {
    ///             new AliCloud.Pai.Inputs.WorkspaceModelLabelArgs
    ///             {
    ///                 Key = "base_model",
    ///                 Value = "SD 1.5",
    ///             },
    ///         },
    ///         OrderNumber = 1,
    ///         ExtraInfo = 
    ///         {
    ///             { "test", "15" },
    ///         },
    ///         ModelDescription = "ModelDescription.",
    ///         ModelDoc = "https://eas-***.oss-cn-hangzhou.aliyuncs.com/s**.safetensors",
    ///         Domain = "aigc",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// PAI Workspace Model can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:pai/workspaceModel:WorkspaceModel example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:pai/workspaceModel:WorkspaceModel")]
    public partial class WorkspaceModel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The visibility of the model in the workspace. Default value: `PRIVATE`. Valid values:
        /// - `PRIVATE`: In this workspace, it is only visible to you and the administrator.
        /// - `PUBLIC`: In this workspace, it is visible to everyone.
        /// </summary>
        [Output("accessibility")]
        public Output<string> Accessibility { get; private set; } = null!;

        /// <summary>
        /// The domain of the model. Describe the domain in which the model solves the problem. For example: nlp (natural language processing), cv (computer vision), etc.
        /// </summary>
        [Output("domain")]
        public Output<string?> Domain { get; private set; } = null!;

        /// <summary>
        /// Other information about the model.
        /// </summary>
        [Output("extraInfo")]
        public Output<ImmutableDictionary<string, string>?> ExtraInfo { get; private set; } = null!;

        /// <summary>
        /// A list of tags. See `labels` below.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<Outputs.WorkspaceModelLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// The model description, used to distinguish different models.
        /// </summary>
        [Output("modelDescription")]
        public Output<string?> ModelDescription { get; private set; } = null!;

        /// <summary>
        /// The documentation of the model.
        /// </summary>
        [Output("modelDoc")]
        public Output<string?> ModelDoc { get; private set; } = null!;

        /// <summary>
        /// The name of the model. The name must be 1 to 127 characters in length.
        /// </summary>
        [Output("modelName")]
        public Output<string> ModelName { get; private set; } = null!;

        /// <summary>
        /// The model type. Example: Checkpoint or LoRA.
        /// </summary>
        [Output("modelType")]
        public Output<string?> ModelType { get; private set; } = null!;

        /// <summary>
        /// The sequence number of the model. Can be used for custom sorting.
        /// </summary>
        [Output("orderNumber")]
        public Output<int?> OrderNumber { get; private set; } = null!;

        /// <summary>
        /// The source of the model. The community or organization to which the source model belongs, such as ModelScope or HuggingFace.
        /// </summary>
        [Output("origin")]
        public Output<string?> Origin { get; private set; } = null!;

        /// <summary>
        /// The task of the model. Describes the specific problem that the model solves. Example: text-classification.
        /// </summary>
        [Output("task")]
        public Output<string?> Task { get; private set; } = null!;

        /// <summary>
        /// The ID of the workspace.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a WorkspaceModel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkspaceModel(string name, WorkspaceModelArgs args, CustomResourceOptions? options = null)
            : base("alicloud:pai/workspaceModel:WorkspaceModel", name, args ?? new WorkspaceModelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkspaceModel(string name, Input<string> id, WorkspaceModelState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:pai/workspaceModel:WorkspaceModel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkspaceModel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkspaceModel Get(string name, Input<string> id, WorkspaceModelState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkspaceModel(name, id, state, options);
        }
    }

    public sealed class WorkspaceModelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The visibility of the model in the workspace. Default value: `PRIVATE`. Valid values:
        /// - `PRIVATE`: In this workspace, it is only visible to you and the administrator.
        /// - `PUBLIC`: In this workspace, it is visible to everyone.
        /// </summary>
        [Input("accessibility")]
        public Input<string>? Accessibility { get; set; }

        /// <summary>
        /// The domain of the model. Describe the domain in which the model solves the problem. For example: nlp (natural language processing), cv (computer vision), etc.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("extraInfo")]
        private InputMap<string>? _extraInfo;

        /// <summary>
        /// Other information about the model.
        /// </summary>
        public InputMap<string> ExtraInfo
        {
            get => _extraInfo ?? (_extraInfo = new InputMap<string>());
            set => _extraInfo = value;
        }

        [Input("labels")]
        private InputList<Inputs.WorkspaceModelLabelArgs>? _labels;

        /// <summary>
        /// A list of tags. See `labels` below.
        /// </summary>
        public InputList<Inputs.WorkspaceModelLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.WorkspaceModelLabelArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// The model description, used to distinguish different models.
        /// </summary>
        [Input("modelDescription")]
        public Input<string>? ModelDescription { get; set; }

        /// <summary>
        /// The documentation of the model.
        /// </summary>
        [Input("modelDoc")]
        public Input<string>? ModelDoc { get; set; }

        /// <summary>
        /// The name of the model. The name must be 1 to 127 characters in length.
        /// </summary>
        [Input("modelName", required: true)]
        public Input<string> ModelName { get; set; } = null!;

        /// <summary>
        /// The model type. Example: Checkpoint or LoRA.
        /// </summary>
        [Input("modelType")]
        public Input<string>? ModelType { get; set; }

        /// <summary>
        /// The sequence number of the model. Can be used for custom sorting.
        /// </summary>
        [Input("orderNumber")]
        public Input<int>? OrderNumber { get; set; }

        /// <summary>
        /// The source of the model. The community or organization to which the source model belongs, such as ModelScope or HuggingFace.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// The task of the model. Describes the specific problem that the model solves. Example: text-classification.
        /// </summary>
        [Input("task")]
        public Input<string>? Task { get; set; }

        /// <summary>
        /// The ID of the workspace.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public WorkspaceModelArgs()
        {
        }
        public static new WorkspaceModelArgs Empty => new WorkspaceModelArgs();
    }

    public sealed class WorkspaceModelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The visibility of the model in the workspace. Default value: `PRIVATE`. Valid values:
        /// - `PRIVATE`: In this workspace, it is only visible to you and the administrator.
        /// - `PUBLIC`: In this workspace, it is visible to everyone.
        /// </summary>
        [Input("accessibility")]
        public Input<string>? Accessibility { get; set; }

        /// <summary>
        /// The domain of the model. Describe the domain in which the model solves the problem. For example: nlp (natural language processing), cv (computer vision), etc.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("extraInfo")]
        private InputMap<string>? _extraInfo;

        /// <summary>
        /// Other information about the model.
        /// </summary>
        public InputMap<string> ExtraInfo
        {
            get => _extraInfo ?? (_extraInfo = new InputMap<string>());
            set => _extraInfo = value;
        }

        [Input("labels")]
        private InputList<Inputs.WorkspaceModelLabelGetArgs>? _labels;

        /// <summary>
        /// A list of tags. See `labels` below.
        /// </summary>
        public InputList<Inputs.WorkspaceModelLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.WorkspaceModelLabelGetArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// The model description, used to distinguish different models.
        /// </summary>
        [Input("modelDescription")]
        public Input<string>? ModelDescription { get; set; }

        /// <summary>
        /// The documentation of the model.
        /// </summary>
        [Input("modelDoc")]
        public Input<string>? ModelDoc { get; set; }

        /// <summary>
        /// The name of the model. The name must be 1 to 127 characters in length.
        /// </summary>
        [Input("modelName")]
        public Input<string>? ModelName { get; set; }

        /// <summary>
        /// The model type. Example: Checkpoint or LoRA.
        /// </summary>
        [Input("modelType")]
        public Input<string>? ModelType { get; set; }

        /// <summary>
        /// The sequence number of the model. Can be used for custom sorting.
        /// </summary>
        [Input("orderNumber")]
        public Input<int>? OrderNumber { get; set; }

        /// <summary>
        /// The source of the model. The community or organization to which the source model belongs, such as ModelScope or HuggingFace.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// The task of the model. Describes the specific problem that the model solves. Example: text-classification.
        /// </summary>
        [Input("task")]
        public Input<string>? Task { get; set; }

        /// <summary>
        /// The ID of the workspace.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public WorkspaceModelState()
        {
        }
        public static new WorkspaceModelState Empty => new WorkspaceModelState();
    }
}
