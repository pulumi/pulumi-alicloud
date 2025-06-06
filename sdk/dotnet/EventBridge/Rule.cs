// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge
{
    /// <summary>
    /// Provides a Event Bridge Rule resource.
    /// 
    /// For information about Event Bridge Rule and how to use it, see [What is Rule](https://www.alibabacloud.com/help/en/eventbridge/latest/createrule-6).
    /// 
    /// &gt; **NOTE:** Available since v1.129.0.
    /// 
    /// ## Import
    /// 
    /// Event Bridge Rule can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:eventbridge/rule:Rule example &lt;event_bus_name&gt;:&lt;rule_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:eventbridge/rule:Rule")]
    public partial class Rule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the event rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the event bus.
        /// </summary>
        [Output("eventBusName")]
        public Output<string> EventBusName { get; private set; } = null!;

        /// <summary>
        /// The pattern to match interested events. Event mode, JSON format. The value description is as follows: `stringEqual` mode. `stringExpression` mode. Each field has up to 5 expressions (map structure).
        /// </summary>
        [Output("filterPattern")]
        public Output<string> FilterPattern { get; private set; } = null!;

        /// <summary>
        /// The name of the event rule.
        /// </summary>
        [Output("ruleName")]
        public Output<string> RuleName { get; private set; } = null!;

        /// <summary>
        /// The status of the event rule. Valid values: `ENABLE`, `DISABLE`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The targets of rule. See `targets` below.
        /// </summary>
        [Output("targets")]
        public Output<ImmutableArray<Outputs.RuleTarget>> Targets { get; private set; } = null!;


        /// <summary>
        /// Create a Rule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Rule(string name, RuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:eventbridge/rule:Rule", name, args ?? new RuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Rule(string name, Input<string> id, RuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:eventbridge/rule:Rule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Rule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Rule Get(string name, Input<string> id, RuleState? state = null, CustomResourceOptions? options = null)
        {
            return new Rule(name, id, state, options);
        }
    }

    public sealed class RuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the event rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the event bus.
        /// </summary>
        [Input("eventBusName", required: true)]
        public Input<string> EventBusName { get; set; } = null!;

        /// <summary>
        /// The pattern to match interested events. Event mode, JSON format. The value description is as follows: `stringEqual` mode. `stringExpression` mode. Each field has up to 5 expressions (map structure).
        /// </summary>
        [Input("filterPattern", required: true)]
        public Input<string> FilterPattern { get; set; } = null!;

        /// <summary>
        /// The name of the event rule.
        /// </summary>
        [Input("ruleName", required: true)]
        public Input<string> RuleName { get; set; } = null!;

        /// <summary>
        /// The status of the event rule. Valid values: `ENABLE`, `DISABLE`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("targets", required: true)]
        private InputList<Inputs.RuleTargetArgs>? _targets;

        /// <summary>
        /// The targets of rule. See `targets` below.
        /// </summary>
        public InputList<Inputs.RuleTargetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.RuleTargetArgs>());
            set => _targets = value;
        }

        public RuleArgs()
        {
        }
        public static new RuleArgs Empty => new RuleArgs();
    }

    public sealed class RuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the event rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the event bus.
        /// </summary>
        [Input("eventBusName")]
        public Input<string>? EventBusName { get; set; }

        /// <summary>
        /// The pattern to match interested events. Event mode, JSON format. The value description is as follows: `stringEqual` mode. `stringExpression` mode. Each field has up to 5 expressions (map structure).
        /// </summary>
        [Input("filterPattern")]
        public Input<string>? FilterPattern { get; set; }

        /// <summary>
        /// The name of the event rule.
        /// </summary>
        [Input("ruleName")]
        public Input<string>? RuleName { get; set; }

        /// <summary>
        /// The status of the event rule. Valid values: `ENABLE`, `DISABLE`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("targets")]
        private InputList<Inputs.RuleTargetGetArgs>? _targets;

        /// <summary>
        /// The targets of rule. See `targets` below.
        /// </summary>
        public InputList<Inputs.RuleTargetGetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.RuleTargetGetArgs>());
            set => _targets = value;
        }

        public RuleState()
        {
        }
        public static new RuleState Empty => new RuleState();
    }
}
