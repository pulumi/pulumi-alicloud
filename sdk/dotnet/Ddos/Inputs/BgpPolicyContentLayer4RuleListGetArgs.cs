// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos.Inputs
{

    public sealed class BgpPolicyContentLayer4RuleListGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// 1 for observation 2 for blocking.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("conditionLists", required: true)]
        private InputList<Inputs.BgpPolicyContentLayer4RuleListConditionListGetArgs>? _conditionLists;

        /// <summary>
        /// Matching Condition. See `condition_list` below.
        /// </summary>
        public InputList<Inputs.BgpPolicyContentLayer4RuleListConditionListGetArgs> ConditionLists
        {
            get => _conditionLists ?? (_conditionLists = new InputList<Inputs.BgpPolicyContentLayer4RuleListConditionListGetArgs>());
            set => _conditionLists = value;
        }

        /// <summary>
        /// .
        /// </summary>
        [Input("limited", required: true)]
        public Input<int> Limited { get; set; } = null!;

        /// <summary>
        /// 0 indicates that the condition is not met 1 indicates that the condition is met.
        /// </summary>
        [Input("match", required: true)]
        public Input<string> Match { get; set; } = null!;

        /// <summary>
        /// Char indicates a string match hex match.
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// Rule Name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// 1-100, priority, the lower the number, the higher the priority.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        public BgpPolicyContentLayer4RuleListGetArgs()
        {
        }
        public static new BgpPolicyContentLayer4RuleListGetArgs Empty => new BgpPolicyContentLayer4RuleListGetArgs();
    }
}
