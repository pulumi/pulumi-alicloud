// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class AlarmCompositeExpressionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The relationship between the trigger conditions for multiple metrics. Valid values: `&amp;&amp;`, `||`.
        /// </summary>
        [Input("expressionListJoin")]
        public Input<string>? ExpressionListJoin { get; set; }

        [Input("expressionLists")]
        private InputList<Inputs.AlarmCompositeExpressionExpressionListGetArgs>? _expressionLists;

        /// <summary>
        /// The trigger conditions that are created in standard mode. See `expression_list` below.
        /// </summary>
        public InputList<Inputs.AlarmCompositeExpressionExpressionListGetArgs> ExpressionLists
        {
            get => _expressionLists ?? (_expressionLists = new InputList<Inputs.AlarmCompositeExpressionExpressionListGetArgs>());
            set => _expressionLists = value;
        }

        /// <summary>
        /// The trigger conditions that are created by using expressions.
        /// </summary>
        [Input("expressionRaw")]
        public Input<string>? ExpressionRaw { get; set; }

        /// <summary>
        /// The level of the alert. Valid values: `CRITICAL`, `WARN`, `INFO`.
        /// </summary>
        [Input("level")]
        public Input<string>? Level { get; set; }

        /// <summary>
        /// The number of consecutive triggers.
        /// </summary>
        [Input("times")]
        public Input<int>? Times { get; set; }

        public AlarmCompositeExpressionGetArgs()
        {
        }
        public static new AlarmCompositeExpressionGetArgs Empty => new AlarmCompositeExpressionGetArgs();
    }
}