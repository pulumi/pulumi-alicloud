// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect.Outputs
{

    [OutputType]
    public sealed class GetVirtualPhysicalConnectionsConnectionResult
    {
        /// <summary>
        /// The ID of the access point of the physical connection.
        /// </summary>
        public readonly string AccessPointId;
        /// <summary>
        /// The physical location where the physical connection access device is located.
        /// </summary>
        public readonly string AdLocation;
        /// <summary>
        /// The bandwidth of the physical connection. Unit: Mbps.
        /// </summary>
        public readonly string Bandwidth;
        /// <summary>
        /// The commercial status of the physical line. Value:
        /// - **Normal**: activated.
        /// - **Financialized**: Arrears locked.
        /// - **SecurityLocked**: locked for security reasons.
        /// </summary>
        public readonly string BusinessStatus;
        /// <summary>
        /// The circuit code provided by the operator for the physical connection.
        /// </summary>
        public readonly string CircuitCode;
        /// <summary>
        /// The creation time of the resource
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The description of the physical connection.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The opening time of the physical connection.
        /// </summary>
        public readonly string EnabledTime;
        /// <summary>
        /// The expiration time of the shared line.Time is expressed according to ISO8601 standard and UTC time is used. The format is: YYYY-MM-DDThh:mm:ssZ.
        /// </summary>
        public readonly string EndTime;
        /// <summary>
        /// The estimated bandwidth value of the shared line. The expected bandwidth value will not take effect until the payment is completed.Unit: **M** indicates Mbps,**G** indicates Gbps.
        /// </summary>
        public readonly string ExpectSpec;
        /// <summary>
        /// The ID of the Virtual Physical Connection.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Operators that provide access to physical lines. Value:-**CT**: China Telecom.-**CU**: China Unicom.-**CM**: China Mobile.-**CO**: China Other.-**Equinix**:Equinix.-**Other**: Other abroad.
        /// </summary>
        public readonly string LineOperator;
        /// <summary>
        /// The state of LOA. Value:-**Applying**:LOA application.-**Accept**:LOA application passed.-**Available**:LOA is Available.-**Rejected**:LOA application Rejected.-**Completing**: The dedicated line is under construction.-**Complete**: The construction of the dedicated line is completed.-**Deleted**:LOA has been Deleted.
        /// </summary>
        public readonly string LoaStatus;
        /// <summary>
        /// The payment method of shared dedicated line. Value:-**PayByPhysicalConnectionOwner**: indicates that the owner of the physical line associated with the shared line pays.-**PayByVirtualPhysicalConnectionOwner**: indicates that the owner of the shared line pays.
        /// </summary>
        public readonly string OrderMode;
        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) to which the physical connection belongs.
        /// </summary>
        public readonly string ParentPhysicalConnectionAliUid;
        /// <summary>
        /// The ID of the instance of the physical connection.
        /// </summary>
        public readonly string ParentPhysicalConnectionId;
        /// <summary>
        /// The geographic location of the local data center.
        /// </summary>
        public readonly string PeerLocation;
        /// <summary>
        /// The port number of the physical connection device.
        /// </summary>
        public readonly string PortNumber;
        /// <summary>
        /// Physical connection port type. Value:-**100Base-T**: 100 megabytes port.-**1000Base-T**: Gigabit port.-**1000Base-LX**: Gigabit single mode optical port (10km).-**10GBase-T**: 10 Gigabit port.-**10GBase-LR**: 10 Gigabit single mode optical port (10km).-**40GBase-LR**: 40 megabytes single-mode optical port.-**100GBase-LR**: 100,000 megabytes single-mode optical port.
        /// </summary>
        public readonly string PortType;
        /// <summary>
        /// The ID of the redundant physical connection.
        /// </summary>
        public readonly string RedundantPhysicalConnectionId;
        /// <summary>
        /// The resource group id
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// The bandwidth value of the shared line.Unit: **M** indicates Mbps,**G** indicates Gbps.
        /// </summary>
        public readonly string Spec;
        /// <summary>
        /// The status of the resource
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The ID of the hosted connection
        /// </summary>
        public readonly string VirtualPhysicalConnectionId;
        /// <summary>
        /// The name of the physical connection.
        /// </summary>
        public readonly string VirtualPhysicalConnectionName;
        /// <summary>
        /// The business status of the shared line. Value:
        /// - **Confirmed**: The shared line has been Confirmed to receive.
        /// - **UnConfirmed**: The shared line has not been confirmed to be received.
        /// - **Deleted**: The shared line has been Deleted.
        /// </summary>
        public readonly string VirtualPhysicalConnectionStatus;
        /// <summary>
        /// The VLAN ID of the shared leased line.
        /// </summary>
        public readonly int VlanId;
        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
        /// </summary>
        public readonly string VpconnAliUid;

        [OutputConstructor]
        private GetVirtualPhysicalConnectionsConnectionResult(
            string accessPointId,

            string adLocation,

            string bandwidth,

            string businessStatus,

            string circuitCode,

            string createTime,

            string description,

            string enabledTime,

            string endTime,

            string expectSpec,

            string id,

            string lineOperator,

            string loaStatus,

            string orderMode,

            string parentPhysicalConnectionAliUid,

            string parentPhysicalConnectionId,

            string peerLocation,

            string portNumber,

            string portType,

            string redundantPhysicalConnectionId,

            string resourceGroupId,

            string spec,

            string status,

            string virtualPhysicalConnectionId,

            string virtualPhysicalConnectionName,

            string virtualPhysicalConnectionStatus,

            int vlanId,

            string vpconnAliUid)
        {
            AccessPointId = accessPointId;
            AdLocation = adLocation;
            Bandwidth = bandwidth;
            BusinessStatus = businessStatus;
            CircuitCode = circuitCode;
            CreateTime = createTime;
            Description = description;
            EnabledTime = enabledTime;
            EndTime = endTime;
            ExpectSpec = expectSpec;
            Id = id;
            LineOperator = lineOperator;
            LoaStatus = loaStatus;
            OrderMode = orderMode;
            ParentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
            ParentPhysicalConnectionId = parentPhysicalConnectionId;
            PeerLocation = peerLocation;
            PortNumber = portNumber;
            PortType = portType;
            RedundantPhysicalConnectionId = redundantPhysicalConnectionId;
            ResourceGroupId = resourceGroupId;
            Spec = spec;
            Status = status;
            VirtualPhysicalConnectionId = virtualPhysicalConnectionId;
            VirtualPhysicalConnectionName = virtualPhysicalConnectionName;
            VirtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
            VlanId = vlanId;
            VpconnAliUid = vpconnAliUid;
        }
    }
}
