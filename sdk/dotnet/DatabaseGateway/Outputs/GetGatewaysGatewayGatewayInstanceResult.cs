// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DatabaseGateway.Outputs
{

    [OutputType]
    public sealed class GetGatewaysGatewayGatewayInstanceResult
    {
        public readonly string ConnectEndpointType;
        public readonly string CurrentDaemonVersion;
        public readonly string CurrentVersion;
        public readonly string EndPoint;
        public readonly string GatewayInstanceId;
        public readonly string GatewayInstanceStatus;
        public readonly string LastUpdateTime;
        public readonly string LocalIp;
        public readonly string Message;
        public readonly string OutputIp;

        [OutputConstructor]
        private GetGatewaysGatewayGatewayInstanceResult(
            string connectEndpointType,

            string currentDaemonVersion,

            string currentVersion,

            string endPoint,

            string gatewayInstanceId,

            string gatewayInstanceStatus,

            string lastUpdateTime,

            string localIp,

            string message,

            string outputIp)
        {
            ConnectEndpointType = connectEndpointType;
            CurrentDaemonVersion = currentDaemonVersion;
            CurrentVersion = currentVersion;
            EndPoint = endPoint;
            GatewayInstanceId = gatewayInstanceId;
            GatewayInstanceStatus = gatewayInstanceStatus;
            LastUpdateTime = lastUpdateTime;
            LocalIp = localIp;
            Message = message;
            OutputIp = outputIp;
        }
    }
}