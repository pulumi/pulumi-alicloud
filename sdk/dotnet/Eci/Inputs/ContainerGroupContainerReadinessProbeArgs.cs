// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupContainerReadinessProbeArgs : global::Pulumi.ResourceArgs
    {
        [Input("execs")]
        private InputList<Inputs.ContainerGroupContainerReadinessProbeExecArgs>? _execs;

        /// <summary>
        /// Health check using command line method. See `exec` below.
        /// </summary>
        public InputList<Inputs.ContainerGroupContainerReadinessProbeExecArgs> Execs
        {
            get => _execs ?? (_execs = new InputList<Inputs.ContainerGroupContainerReadinessProbeExecArgs>());
            set => _execs = value;
        }

        /// <summary>
        /// Threshold for the number of checks that are determined to have failed since the last successful check (must be consecutive failures), default is 3.
        /// </summary>
        [Input("failureThreshold")]
        public Input<int>? FailureThreshold { get; set; }

        [Input("httpGets")]
        private InputList<Inputs.ContainerGroupContainerReadinessProbeHttpGetArgs>? _httpGets;

        /// <summary>
        /// Health check using HTTP request method. See `http_get` below.
        /// 
        /// &gt; **NOTE:** When you configure `readiness_probe`, you can select only one of the `exec`, `tcp_socket`, `http_get`.
        /// </summary>
        public InputList<Inputs.ContainerGroupContainerReadinessProbeHttpGetArgs> HttpGets
        {
            get => _httpGets ?? (_httpGets = new InputList<Inputs.ContainerGroupContainerReadinessProbeHttpGetArgs>());
            set => _httpGets = value;
        }

        /// <summary>
        /// Check the time to start execution, calculated from the completion of container startup.
        /// </summary>
        [Input("initialDelaySeconds")]
        public Input<int>? InitialDelaySeconds { get; set; }

        /// <summary>
        /// Buffer time for the program to handle operations before closing.
        /// </summary>
        [Input("periodSeconds")]
        public Input<int>? PeriodSeconds { get; set; }

        /// <summary>
        /// The check count threshold for re-identifying successful checks since the last failed check (must be consecutive successes), default is 1. Current must be 1.
        /// </summary>
        [Input("successThreshold")]
        public Input<int>? SuccessThreshold { get; set; }

        [Input("tcpSockets")]
        private InputList<Inputs.ContainerGroupContainerReadinessProbeTcpSocketArgs>? _tcpSockets;

        /// <summary>
        /// Health check using TCP socket method. See `tcp_socket` below.
        /// </summary>
        public InputList<Inputs.ContainerGroupContainerReadinessProbeTcpSocketArgs> TcpSockets
        {
            get => _tcpSockets ?? (_tcpSockets = new InputList<Inputs.ContainerGroupContainerReadinessProbeTcpSocketArgs>());
            set => _tcpSockets = value;
        }

        /// <summary>
        /// Check the timeout, the default is 1 second, the minimum is 1 second.
        /// </summary>
        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        public ContainerGroupContainerReadinessProbeArgs()
        {
        }
        public static new ContainerGroupContainerReadinessProbeArgs Empty => new ContainerGroupContainerReadinessProbeArgs();
    }
}
