// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class V2FunctionInstanceLifecycleConfigPreStop
    {
        /// <summary>
        /// entry point of function.
        /// </summary>
        public readonly string? Handler;
        /// <summary>
        /// max running time of function.
        /// </summary>
        public readonly int? Timeout;

        [OutputConstructor]
        private V2FunctionInstanceLifecycleConfigPreStop(
            string? handler,

            int? timeout)
        {
            Handler = handler;
            Timeout = timeout;
        }
    }
}