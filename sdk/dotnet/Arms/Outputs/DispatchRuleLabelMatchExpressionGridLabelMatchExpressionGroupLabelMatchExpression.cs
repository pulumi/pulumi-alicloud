// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Outputs
{

    [OutputType]
    public sealed class DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpression
    {
        public readonly string Key;
        public readonly string Operator;
        public readonly string Value;

        [OutputConstructor]
        private DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpression(
            string key,

            string @operator,

            string value)
        {
            Key = key;
            Operator = @operator;
            Value = value;
        }
    }
}
