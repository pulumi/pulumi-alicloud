// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DataWorks.Outputs
{

    [OutputType]
    public sealed class DiJobTableMapping
    {
        /// <summary>
        /// Each rule can select different types of source objects to be synchronized, such as source database and source data table. See `source_object_selection_rules` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DiJobTableMappingSourceObjectSelectionRule> SourceObjectSelectionRules;
        /// <summary>
        /// A list of conversion rule definitions for a synchronization object. Each element in the list defines a conversion rule. See `transformation_rules` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DiJobTableMappingTransformationRule> TransformationRules;

        [OutputConstructor]
        private DiJobTableMapping(
            ImmutableArray<Outputs.DiJobTableMappingSourceObjectSelectionRule> sourceObjectSelectionRules,

            ImmutableArray<Outputs.DiJobTableMappingTransformationRule> transformationRules)
        {
            SourceObjectSelectionRules = sourceObjectSelectionRules;
            TransformationRules = transformationRules;
        }
    }
}
