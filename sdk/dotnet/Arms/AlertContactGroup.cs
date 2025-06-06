// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms
{
    /// <summary>
    /// Provides a Application Real-Time Monitoring Service (ARMS) Alert Contact Group resource.
    /// 
    /// For information about Application Real-Time Monitoring Service (ARMS) Alert Contact Group and how to use it, see [What is Alert Contact Group](https://next.api.aliyun.com/api/ARMS/2019-08-08/CreateAlertContactGroup).
    /// 
    /// &gt; **NOTE:** Available since v1.131.0.
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
    ///     var example = new AliCloud.Arms.AlertContact("example", new()
    ///     {
    ///         AlertContactName = "example_value",
    ///         DingRobotWebhookUrl = "https://oapi.dingtalk.com/robot/send?access_token=91f2f6****",
    ///         Email = "someone@example.com",
    ///         PhoneNum = "1381111****",
    ///     });
    /// 
    ///     var exampleAlertContactGroup = new AliCloud.Arms.AlertContactGroup("example", new()
    ///     {
    ///         AlertContactGroupName = "example_value",
    ///         ContactIds = new[]
    ///         {
    ///             example.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Application Real-Time Monitoring Service (ARMS) Alert Contact Group can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:arms/alertContactGroup:AlertContactGroup example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:arms/alertContactGroup:AlertContactGroup")]
    public partial class AlertContactGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("alertContactGroupName")]
        public Output<string> AlertContactGroupName { get; private set; } = null!;

        /// <summary>
        /// The list id of alert contact.
        /// </summary>
        [Output("contactIds")]
        public Output<ImmutableArray<string>> ContactIds { get; private set; } = null!;


        /// <summary>
        /// Create a AlertContactGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertContactGroup(string name, AlertContactGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:arms/alertContactGroup:AlertContactGroup", name, args ?? new AlertContactGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertContactGroup(string name, Input<string> id, AlertContactGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:arms/alertContactGroup:AlertContactGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertContactGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertContactGroup Get(string name, Input<string> id, AlertContactGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertContactGroup(name, id, state, options);
        }
    }

    public sealed class AlertContactGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("alertContactGroupName", required: true)]
        public Input<string> AlertContactGroupName { get; set; } = null!;

        [Input("contactIds")]
        private InputList<string>? _contactIds;

        /// <summary>
        /// The list id of alert contact.
        /// </summary>
        public InputList<string> ContactIds
        {
            get => _contactIds ?? (_contactIds = new InputList<string>());
            set => _contactIds = value;
        }

        public AlertContactGroupArgs()
        {
        }
        public static new AlertContactGroupArgs Empty => new AlertContactGroupArgs();
    }

    public sealed class AlertContactGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("alertContactGroupName")]
        public Input<string>? AlertContactGroupName { get; set; }

        [Input("contactIds")]
        private InputList<string>? _contactIds;

        /// <summary>
        /// The list id of alert contact.
        /// </summary>
        public InputList<string> ContactIds
        {
            get => _contactIds ?? (_contactIds = new InputList<string>());
            set => _contactIds = value;
        }

        public AlertContactGroupState()
        {
        }
        public static new AlertContactGroupState Empty => new AlertContactGroupState();
    }
}
