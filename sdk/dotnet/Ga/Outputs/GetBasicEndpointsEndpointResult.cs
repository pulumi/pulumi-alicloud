// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Outputs
{

    [OutputType]
    public sealed class GetBasicEndpointsEndpointResult
    {
        /// <summary>
        /// The ID of the Global Accelerator Basic Accelerator instance.
        /// </summary>
        public readonly string AcceleratorId;
        /// <summary>
        /// The name of the Basic Endpoint.
        /// </summary>
        public readonly string BasicEndpointName;
        /// <summary>
        /// The address of the Basic Endpoint.
        /// </summary>
        public readonly string EndpointAddress;
        /// <summary>
        /// The ID of the Basic Endpoint Group.
        /// </summary>
        public readonly string EndpointGroupId;
        /// <summary>
        /// The ID of the Basic Endpoint.
        /// </summary>
        public readonly string EndpointId;
        /// <summary>
        /// The sub address of the Basic Endpoint.
        /// </summary>
        public readonly string EndpointSubAddress;
        /// <summary>
        /// The sub address type of the Basic Endpoint.
        /// </summary>
        public readonly string EndpointSubAddressType;
        /// <summary>
        /// The type of the Basic Endpoint. Valid values: `ENI`, `SLB`, `ECS` and `NLB`.
        /// </summary>
        public readonly string EndpointType;
        /// <summary>
        /// The zone id of the Basic Endpoint.
        /// </summary>
        public readonly string EndpointZoneId;
        /// <summary>
        /// The id of the Global Accelerator Basic Endpoint. It formats as `&lt;endpoint_group_id&gt;:&lt;endpoint_id&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The status of the Global Accelerator Basic Endpoint. Valid Value: `init`, `active`, `updating`, `binding`, `unbinding`, `deleting`, `bound`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetBasicEndpointsEndpointResult(
            string acceleratorId,

            string basicEndpointName,

            string endpointAddress,

            string endpointGroupId,

            string endpointId,

            string endpointSubAddress,

            string endpointSubAddressType,

            string endpointType,

            string endpointZoneId,

            string id,

            string status)
        {
            AcceleratorId = acceleratorId;
            BasicEndpointName = basicEndpointName;
            EndpointAddress = endpointAddress;
            EndpointGroupId = endpointGroupId;
            EndpointId = endpointId;
            EndpointSubAddress = endpointSubAddress;
            EndpointSubAddressType = endpointSubAddressType;
            EndpointType = endpointType;
            EndpointZoneId = endpointZoneId;
            Id = id;
            Status = status;
        }
    }
}
