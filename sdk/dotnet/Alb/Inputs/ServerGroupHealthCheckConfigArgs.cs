// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ServerGroupHealthCheckConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("healthCheckCodes")]
        private InputList<string>? _healthCheckCodes;

        /// <summary>
        /// The HTTP status codes that are used to indicate whether the backend server passes the health check. Valid values:
        /// - If `health_check_protocol` is set to `HTTP` or `HTTPS`. Valid values: `http_2xx`, `http_3xx`, `http_4xx`, and `http_5xx`. Default value: `http_2xx`.
        /// - If `health_check_protocol` is set to `gRPC`. Valid values: `0` to `99`. Default value: `0`.
        /// </summary>
        public InputList<string> HealthCheckCodes
        {
            get => _healthCheckCodes ?? (_healthCheckCodes = new InputList<string>());
            set => _healthCheckCodes = value;
        }

        /// <summary>
        /// The backend port that is used for health checks. Default value: `0`. Valid values: `0` to `65535`. A value of 0 indicates that a backend server port is used for health checks.
        /// </summary>
        [Input("healthCheckConnectPort")]
        public Input<int>? HealthCheckConnectPort { get; set; }

        /// <summary>
        /// Specifies whether to enable the health check feature. Valid values: `true`, `false`.
        /// </summary>
        [Input("healthCheckEnabled", required: true)]
        public Input<bool> HealthCheckEnabled { get; set; } = null!;

        /// <summary>
        /// The domain name that is used for health checks.
        /// </summary>
        [Input("healthCheckHost")]
        public Input<string>? HealthCheckHost { get; set; }

        /// <summary>
        /// The version of the HTTP protocol. Default value: `HTTP1.1`. Valid values: `HTTP1.0` and `HTTP1.1`. **NOTE:** This parameter takes effect only when `health_check_protocol` is set to `HTTP` or `HTTPS`.
        /// </summary>
        [Input("healthCheckHttpVersion")]
        public Input<string>? HealthCheckHttpVersion { get; set; }

        /// <summary>
        /// The interval at which health checks are performed. Unit: seconds. Default value: `2`. Valid values: `1` to `50`.
        /// </summary>
        [Input("healthCheckInterval")]
        public Input<int>? HealthCheckInterval { get; set; }

        /// <summary>
        /// The HTTP method that is used for health checks. Default value: `GET`. Valid values: `GET`, `POST`, `HEAD`. **NOTE:** This parameter takes effect only when `health_check_protocol` is set to `HTTP`, `HTTPS`, or `gRPC`. From version 1.215.0, `health_check_method` can be set to `POST`.
        /// </summary>
        [Input("healthCheckMethod")]
        public Input<string>? HealthCheckMethod { get; set; }

        /// <summary>
        /// The path that is used for health checks. **NOTE:** This parameter takes effect only when `health_check_protocol` is set to `HTTP` or `HTTPS`.
        /// </summary>
        [Input("healthCheckPath")]
        public Input<string>? HealthCheckPath { get; set; }

        /// <summary>
        /// The protocol that is used for health checks. Valid values: `HTTP`, `HTTPS`, `TCP` and `gRPC`.
        /// </summary>
        [Input("healthCheckProtocol")]
        public Input<string>? HealthCheckProtocol { get; set; }

        /// <summary>
        /// The timeout period for a health check response. If a backend Elastic Compute Service (ECS) instance does not send an expected response within the specified period of time, the ECS instance is considered unhealthy. Unit: seconds. Default value: `5`. Valid values: `1` to `300`. **NOTE:** If the value of `health_check_timeout` is smaller than the value of `health_check_interval`, the value of `health_check_timeout` is ignored and the value of `health_check_interval` is used.
        /// </summary>
        [Input("healthCheckTimeout")]
        public Input<int>? HealthCheckTimeout { get; set; }

        /// <summary>
        /// The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. Default value: `3`. Valid values: `2` to `10`.
        /// </summary>
        [Input("healthyThreshold")]
        public Input<int>? HealthyThreshold { get; set; }

        /// <summary>
        /// The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. Default value: `3`. Valid values: `2` to `10`.
        /// </summary>
        [Input("unhealthyThreshold")]
        public Input<int>? UnhealthyThreshold { get; set; }

        public ServerGroupHealthCheckConfigArgs()
        {
        }
        public static new ServerGroupHealthCheckConfigArgs Empty => new ServerGroupHealthCheckConfigArgs();
    }
}
