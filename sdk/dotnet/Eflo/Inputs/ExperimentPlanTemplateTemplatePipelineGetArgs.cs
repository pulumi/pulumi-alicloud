// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eflo.Inputs
{

    public sealed class ExperimentPlanTemplateTemplatePipelineGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Contains a series of parameters related to the environment. See `env_params` below.
        /// </summary>
        [Input("envParams", required: true)]
        public Input<Inputs.ExperimentPlanTemplateTemplatePipelineEnvParamsGetArgs> EnvParams { get; set; } = null!;

        /// <summary>
        /// Indicates the sequence number of the pipeline node.
        /// </summary>
        [Input("pipelineOrder", required: true)]
        public Input<int> PipelineOrder { get; set; } = null!;

        /// <summary>
        /// The use of the template scenario. It can have the following optional parameters:
        /// - baseline: benchmark evaluation
        /// </summary>
        [Input("scene", required: true)]
        public Input<string> Scene { get; set; } = null!;

        [Input("settingParams")]
        private InputMap<string>? _settingParams;

        /// <summary>
        /// Represents additional parameters for the run.
        /// </summary>
        public InputMap<string> SettingParams
        {
            get => _settingParams ?? (_settingParams = new InputMap<string>());
            set => _settingParams = value;
        }

        /// <summary>
        /// Used to uniquely identify a specific payload.
        /// </summary>
        [Input("workloadId", required: true)]
        public Input<int> WorkloadId { get; set; } = null!;

        /// <summary>
        /// The name used to represent a specific payload.
        /// </summary>
        [Input("workloadName", required: true)]
        public Input<string> WorkloadName { get; set; } = null!;

        public ExperimentPlanTemplateTemplatePipelineGetArgs()
        {
        }
        public static new ExperimentPlanTemplateTemplatePipelineGetArgs Empty => new ExperimentPlanTemplateTemplatePipelineGetArgs();
    }
}
