// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection.Outputs
{

    [OutputType]
    public sealed class GetHoneypotProbesProbeHoneypotBindListBindPortListResult
    {
        /// <summary>
        /// Whether to bind the port.
        /// </summary>
        public readonly bool BindPort;
        /// <summary>
        /// End port.
        /// </summary>
        public readonly int EndPort;
        /// <summary>
        /// Whether the port is fixed.
        /// </summary>
        public readonly bool Fixed;
        /// <summary>
        /// Start port.
        /// </summary>
        public readonly int StartPort;
        /// <summary>
        /// Destination port.
        /// </summary>
        public readonly int TargetPort;

        [OutputConstructor]
        private GetHoneypotProbesProbeHoneypotBindListBindPortListResult(
            bool bindPort,

            int endPort,

            bool @fixed,

            int startPort,

            int targetPort)
        {
            BindPort = bindPort;
            EndPort = endPort;
            Fixed = @fixed;
            StartPort = startPort;
            TargetPort = targetPort;
        }
    }
}