// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pvtz
{
    /// <summary>
    /// Provides a Private Zone Rule Attachment resource.
    /// 
    /// For information about Private Zone Rule Attachment and how to use it, see [What is Rule Attachment](https://www.alibabacloud.com/help/en/doc-detail/177601.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.143.0.
    /// 
    /// ## Import
    /// 
    /// Private Zone Rule Attachment can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:pvtz/ruleAttachment:RuleAttachment example &lt;rule_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:pvtz/ruleAttachment:RuleAttachment")]
    public partial class RuleAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the rule.
        /// </summary>
        [Output("ruleId")]
        public Output<string> RuleId { get; private set; } = null!;

        /// <summary>
        /// The List of the VPC. See `vpcs` below.
        /// </summary>
        [Output("vpcs")]
        public Output<ImmutableArray<Outputs.RuleAttachmentVpc>> Vpcs { get; private set; } = null!;


        /// <summary>
        /// Create a RuleAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RuleAttachment(string name, RuleAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:pvtz/ruleAttachment:RuleAttachment", name, args ?? new RuleAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RuleAttachment(string name, Input<string> id, RuleAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:pvtz/ruleAttachment:RuleAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RuleAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RuleAttachment Get(string name, Input<string> id, RuleAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new RuleAttachment(name, id, state, options);
        }
    }

    public sealed class RuleAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the rule.
        /// </summary>
        [Input("ruleId", required: true)]
        public Input<string> RuleId { get; set; } = null!;

        [Input("vpcs", required: true)]
        private InputList<Inputs.RuleAttachmentVpcArgs>? _vpcs;

        /// <summary>
        /// The List of the VPC. See `vpcs` below.
        /// </summary>
        public InputList<Inputs.RuleAttachmentVpcArgs> Vpcs
        {
            get => _vpcs ?? (_vpcs = new InputList<Inputs.RuleAttachmentVpcArgs>());
            set => _vpcs = value;
        }

        public RuleAttachmentArgs()
        {
        }
        public static new RuleAttachmentArgs Empty => new RuleAttachmentArgs();
    }

    public sealed class RuleAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the rule.
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        [Input("vpcs")]
        private InputList<Inputs.RuleAttachmentVpcGetArgs>? _vpcs;

        /// <summary>
        /// The List of the VPC. See `vpcs` below.
        /// </summary>
        public InputList<Inputs.RuleAttachmentVpcGetArgs> Vpcs
        {
            get => _vpcs ?? (_vpcs = new InputList<Inputs.RuleAttachmentVpcGetArgs>());
            set => _vpcs = value;
        }

        public RuleAttachmentState()
        {
        }
        public static new RuleAttachmentState Empty => new RuleAttachmentState();
    }
}
