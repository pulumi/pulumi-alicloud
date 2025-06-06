// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros
{
    /// <summary>
    /// Provides a ROS Stack Group resource.
    /// 
    /// For information about ROS Stack Group and how to use it, see [What is Stack Group](https://www.alibabacloud.com/help/en/doc-detail/151333.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.107.0.
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
    ///     var example = new AliCloud.Ros.StackGroup("example", new()
    ///     {
    ///         StackGroupName = "example_value",
    ///         TemplateBody = @"    {
    ///     	""ROSTemplateFormatVersion"": ""2015-09-01""
    ///     }
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ROS Stack Group can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ros/stackGroup:StackGroup example &lt;stack_group_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ros/stackGroup:StackGroup")]
    public partial class StackGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
        /// </summary>
        [Output("accountIds")]
        public Output<string?> AccountIds { get; private set; } = null!;

        /// <summary>
        /// The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
        /// </summary>
        [Output("administrationRoleName")]
        public Output<string> AdministrationRoleName { get; private set; } = null!;

        /// <summary>
        /// The description of the stack group.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
        /// </summary>
        [Output("executionRoleName")]
        public Output<string> ExecutionRoleName { get; private set; } = null!;

        /// <summary>
        /// The description of the operation.
        /// </summary>
        [Output("operationDescription")]
        public Output<string?> OperationDescription { get; private set; } = null!;

        /// <summary>
        /// The operation settings, in JSON format.
        /// </summary>
        [Output("operationPreferences")]
        public Output<string?> OperationPreferences { get; private set; } = null!;

        /// <summary>
        /// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.StackGroupParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
        /// </summary>
        [Output("regionIds")]
        public Output<string?> RegionIds { get; private set; } = null!;

        /// <summary>
        /// The id of Stack Group.
        /// </summary>
        [Output("stackGroupId")]
        public Output<string> StackGroupId { get; private set; } = null!;

        /// <summary>
        /// The name of the stack group. The name must be unique in a region.
        /// </summary>
        [Output("stackGroupName")]
        public Output<string> StackGroupName { get; private set; } = null!;

        /// <summary>
        /// The status of Stack Group.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
        /// </summary>
        [Output("templateBody")]
        public Output<string?> TemplateBody { get; private set; } = null!;

        /// <summary>
        /// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Output("templateUrl")]
        public Output<string?> TemplateUrl { get; private set; } = null!;

        /// <summary>
        /// The version of the template.
        /// </summary>
        [Output("templateVersion")]
        public Output<string?> TemplateVersion { get; private set; } = null!;


        /// <summary>
        /// Create a StackGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StackGroup(string name, StackGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ros/stackGroup:StackGroup", name, args ?? new StackGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StackGroup(string name, Input<string> id, StackGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ros/stackGroup:StackGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StackGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StackGroup Get(string name, Input<string> id, StackGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new StackGroup(name, id, state, options);
        }
    }

    public sealed class StackGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
        /// </summary>
        [Input("accountIds")]
        public Input<string>? AccountIds { get; set; }

        /// <summary>
        /// The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
        /// </summary>
        [Input("administrationRoleName")]
        public Input<string>? AdministrationRoleName { get; set; }

        /// <summary>
        /// The description of the stack group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
        /// </summary>
        [Input("executionRoleName")]
        public Input<string>? ExecutionRoleName { get; set; }

        /// <summary>
        /// The description of the operation.
        /// </summary>
        [Input("operationDescription")]
        public Input<string>? OperationDescription { get; set; }

        /// <summary>
        /// The operation settings, in JSON format.
        /// </summary>
        [Input("operationPreferences")]
        public Input<string>? OperationPreferences { get; set; }

        [Input("parameters")]
        private InputList<Inputs.StackGroupParameterArgs>? _parameters;

        /// <summary>
        /// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
        /// </summary>
        public InputList<Inputs.StackGroupParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.StackGroupParameterArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
        /// </summary>
        [Input("regionIds")]
        public Input<string>? RegionIds { get; set; }

        /// <summary>
        /// The name of the stack group. The name must be unique in a region.
        /// </summary>
        [Input("stackGroupName", required: true)]
        public Input<string> StackGroupName { get; set; } = null!;

        /// <summary>
        /// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
        /// </summary>
        [Input("templateBody")]
        public Input<string>? TemplateBody { get; set; }

        /// <summary>
        /// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Input("templateUrl")]
        public Input<string>? TemplateUrl { get; set; }

        /// <summary>
        /// The version of the template.
        /// </summary>
        [Input("templateVersion")]
        public Input<string>? TemplateVersion { get; set; }

        public StackGroupArgs()
        {
        }
        public static new StackGroupArgs Empty => new StackGroupArgs();
    }

    public sealed class StackGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
        /// </summary>
        [Input("accountIds")]
        public Input<string>? AccountIds { get; set; }

        /// <summary>
        /// The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
        /// </summary>
        [Input("administrationRoleName")]
        public Input<string>? AdministrationRoleName { get; set; }

        /// <summary>
        /// The description of the stack group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
        /// </summary>
        [Input("executionRoleName")]
        public Input<string>? ExecutionRoleName { get; set; }

        /// <summary>
        /// The description of the operation.
        /// </summary>
        [Input("operationDescription")]
        public Input<string>? OperationDescription { get; set; }

        /// <summary>
        /// The operation settings, in JSON format.
        /// </summary>
        [Input("operationPreferences")]
        public Input<string>? OperationPreferences { get; set; }

        [Input("parameters")]
        private InputList<Inputs.StackGroupParameterGetArgs>? _parameters;

        /// <summary>
        /// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
        /// </summary>
        public InputList<Inputs.StackGroupParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.StackGroupParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
        /// </summary>
        [Input("regionIds")]
        public Input<string>? RegionIds { get; set; }

        /// <summary>
        /// The id of Stack Group.
        /// </summary>
        [Input("stackGroupId")]
        public Input<string>? StackGroupId { get; set; }

        /// <summary>
        /// The name of the stack group. The name must be unique in a region.
        /// </summary>
        [Input("stackGroupName")]
        public Input<string>? StackGroupName { get; set; }

        /// <summary>
        /// The status of Stack Group.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
        /// </summary>
        [Input("templateBody")]
        public Input<string>? TemplateBody { get; set; }

        /// <summary>
        /// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Input("templateUrl")]
        public Input<string>? TemplateUrl { get; set; }

        /// <summary>
        /// The version of the template.
        /// </summary>
        [Input("templateVersion")]
        public Input<string>? TemplateVersion { get; set; }

        public StackGroupState()
        {
        }
        public static new StackGroupState Empty => new StackGroupState();
    }
}
