// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram.Outputs
{

    [OutputType]
    public sealed class GetPolicyDocumentStatementResult
    {
        /// <summary>
        /// Action of the RAM policy document. If you want to create a RAM role policy document, it must be `["sts:AssumeRole"]`.
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// Specifies the condition that are required for a policy to take effect. See `condition` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPolicyDocumentStatementConditionResult> Conditions;
        /// <summary>
        /// This parameter indicates whether or not the `action` is allowed. Valid values are `Allow` and `Deny`. Default value is `Allow`. If you want to create a RAM role policy document, it must be `Allow`.
        /// </summary>
        public readonly string? Effect;
        /// <summary>
        /// Principal of the RAM policy document. If you want to create a RAM role policy document, it must be set. See `principal` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPolicyDocumentStatementPrincipalResult> Principals;
        /// <summary>
        /// List of specific objects which will be authorized. If you want to create a RAM policy document, it must be set.
        /// </summary>
        public readonly ImmutableArray<string> Resources;

        [OutputConstructor]
        private GetPolicyDocumentStatementResult(
            ImmutableArray<string> actions,

            ImmutableArray<Outputs.GetPolicyDocumentStatementConditionResult> conditions,

            string? effect,

            ImmutableArray<Outputs.GetPolicyDocumentStatementPrincipalResult> principals,

            ImmutableArray<string> resources)
        {
            Actions = actions;
            Conditions = conditions;
            Effect = effect;
            Principals = principals;
            Resources = resources;
        }
    }
}
