// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nlb.Inputs
{

    public sealed class ServerGroupHealthCheckArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port that you want to use for health checks on backend servers.
        /// Valid values: `0` to `65535`.
        /// Default value: `0`. If you set the value to 0, the port of the backend server is used for health checks.
        /// </summary>
        [Input("healthCheckConnectPort")]
        public Input<int>? HealthCheckConnectPort { get; set; }

        /// <summary>
        /// The maximum timeout period of a health check. Unit: seconds. Valid values: `1` to `300`. Default value: `5`.
        /// </summary>
        [Input("healthCheckConnectTimeout")]
        public Input<int>? HealthCheckConnectTimeout { get; set; }

        /// <summary>
        /// The domain name that you want to use for health checks. Valid values:
        /// - `$SERVER_IP`: the private IP address of a backend server.
        /// </summary>
        [Input("healthCheckDomain")]
        public Input<string>? HealthCheckDomain { get; set; }

        /// <summary>
        /// Specifies whether to enable the health check feature. Valid values:
        /// </summary>
        [Input("healthCheckEnabled")]
        public Input<bool>? HealthCheckEnabled { get; set; }

        /// <summary>
        /// health check response character string. The value contains a maximum of 512 characters
        /// </summary>
        [Input("healthCheckExp")]
        public Input<string>? HealthCheckExp { get; set; }

        [Input("healthCheckHttpCodes")]
        private InputList<string>? _healthCheckHttpCodes;

        /// <summary>
        /// The HTTP status codes to return for health checks. Separate multiple HTTP status codes with commas (,). Valid values: `http\_2xx` (default), `http\_3xx`, `http\_4xx`, and `http\_5xx`.
        /// 
        /// &gt; **NOTE:**  This parameter takes effect only when `HealthCheckType` is set to `HTTP`.
        /// </summary>
        public InputList<string> HealthCheckHttpCodes
        {
            get => _healthCheckHttpCodes ?? (_healthCheckHttpCodes = new InputList<string>());
            set => _healthCheckHttpCodes = value;
        }

        /// <summary>
        /// The interval at which health checks are performed. Unit: seconds.
        /// Valid values: `5` to `50`.
        /// Default value: `10`.
        /// </summary>
        [Input("healthCheckInterval")]
        public Input<int>? HealthCheckInterval { get; set; }

        /// <summary>
        /// UDP healthy check request string, the value is a character string of 512 characters
        /// </summary>
        [Input("healthCheckReq")]
        public Input<string>? HealthCheckReq { get; set; }

        /// <summary>
        /// The protocol that you want to use for health checks. Valid values: `TCP` (default) and `HTTP`.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        /// <summary>
        /// The path to which health check requests are sent.
        /// 
        /// The path must be 1 to 80 characters in length, and can contain only letters, digits, and the following special characters: `- / . % ? # &amp; =`. It can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : ' , +`. The path must start with a forward slash (/).
        /// 
        /// &gt; **NOTE:**  This parameter takes effect only when `HealthCheckType` is set to `HTTP`.
        /// </summary>
        [Input("healthCheckUrl")]
        public Input<string>? HealthCheckUrl { get; set; }

        /// <summary>
        /// The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from `fail` to `success`.
        /// Valid values: `2` to `10`.
        /// Default value: `2`.
        /// </summary>
        [Input("healthyThreshold")]
        public Input<int>? HealthyThreshold { get; set; }

        /// <summary>
        /// The HTTP method that is used for health checks. Valid values: `GET` (default) and `HEAD`.
        /// 
        /// &gt; **NOTE:**  This parameter takes effect only when `HealthCheckType` is set to `HTTP`.
        /// </summary>
        [Input("httpCheckMethod")]
        public Input<string>? HttpCheckMethod { get; set; }

        /// <summary>
        /// The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from `success` to `fail`.
        /// Valid values: `2` to `10`.
        /// Default value: `2`.
        /// </summary>
        [Input("unhealthyThreshold")]
        public Input<int>? UnhealthyThreshold { get; set; }

        public ServerGroupHealthCheckArgs()
        {
        }
        public static new ServerGroupHealthCheckArgs Empty => new ServerGroupHealthCheckArgs();
    }
}
