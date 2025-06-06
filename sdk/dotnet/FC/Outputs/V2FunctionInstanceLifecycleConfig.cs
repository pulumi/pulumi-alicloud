// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class V2FunctionInstanceLifecycleConfig
    {
        /// <summary>
        /// PreFreeze function configuration. See `pre_freeze` below.
        /// </summary>
        public readonly Outputs.V2FunctionInstanceLifecycleConfigPreFreeze? PreFreeze;
        /// <summary>
        /// PreStop function configuration. See `pre_stop` below.
        /// </summary>
        public readonly Outputs.V2FunctionInstanceLifecycleConfigPreStop? PreStop;

        [OutputConstructor]
        private V2FunctionInstanceLifecycleConfig(
            Outputs.V2FunctionInstanceLifecycleConfigPreFreeze? preFreeze,

            Outputs.V2FunctionInstanceLifecycleConfigPreStop? preStop)
        {
            PreFreeze = preFreeze;
            PreStop = preStop;
        }
    }
}
