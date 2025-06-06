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
    public sealed class V3FunctionInstanceLifecycleConfigPreStop
    {
        /// <summary>
        /// Function Handler: the call entry for the function compute system to run your function.
        /// </summary>
        public readonly string? Handler;
        /// <summary>
        /// The maximum running time of the function, in seconds.
        /// </summary>
        public readonly int? Timeout;

        [OutputConstructor]
        private V3FunctionInstanceLifecycleConfigPreStop(
            string? handler,

            int? timeout)
        {
            Handler = handler;
            Timeout = timeout;
        }
    }
}
