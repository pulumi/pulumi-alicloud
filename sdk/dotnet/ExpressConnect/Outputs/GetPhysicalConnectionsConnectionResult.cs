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
    public sealed class GetPhysicalConnectionsConnectionResult
    {
        /// <summary>
        /// The Physical Leased Line Access Point ID.
        /// </summary>
        public readonly string AccessPointId;
        /// <summary>
        /// To Connect a Device Physical Location.
        /// </summary>
        public readonly string AdLocation;
        /// <summary>
        /// On the Bandwidth of the ECC Service and Physical Connection.
        /// </summary>
        public readonly string Bandwidth;
        /// <summary>
        /// The Physical Connection to Which the Payment Status: Normal, financiallocked, securitylocked.
        /// </summary>
        public readonly string BusinessStatus;
        /// <summary>
        /// Operators for Physical Connection Circuit Provided Coding.
        /// </summary>
        public readonly string CircuitCode;
        /// <summary>
        /// The Representative of the Creation Time Resources Attribute Field.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The Physical Connection to Which the Description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The Physical Connection to Which the Activation Time.
        /// </summary>
        public readonly string EnabledTime;
        /// <summary>
        /// The Expiration Time.
        /// </summary>
        public readonly string EndTime;
        /// <summary>
        /// HasReservationData.
        /// </summary>
        public readonly string HasReservationData;
        /// <summary>
        /// The ID of the Physical Connection.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Provides Access to the Physical Line Operator Value CT: China Telecom, CU: China Unicom, CM: china Mobile, CO: Other Chinese, Equinix:Equinix, Other: Other Overseas.
        /// </summary>
        public readonly string LineOperator;
        /// <summary>
        /// Loa State.
        /// </summary>
        public readonly string LoaStatus;
        /// <summary>
        /// on Behalf of the Pay-as-You-Type of Resource Attribute Field.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// and an on-Premises Data Center Location.
        /// </summary>
        public readonly string PeerLocation;
        /// <summary>
        /// on Behalf of the Resource Level Id of the Resources Property Fields.
        /// </summary>
        public readonly string PhysicalConnectionId;
        /// <summary>
        /// on Behalf of the Resource Name of the Resources-Attribute Field.
        /// </summary>
        public readonly string PhysicalConnectionName;
        /// <summary>
        /// To Connect a Device Port: The Port Number of.
        /// </summary>
        public readonly string PortNumber;
        /// <summary>
        /// The Physical Leased Line Access Port Type Value 100Base-T: Fast Electrical Ports, 1000Base-T (the Default): gigabit Electrical Ports, 1000Base-LX: Gigabit Singlemode Optical Ports (10Km), 10GBase-T: Gigabit Electrical Port, 10GBase-LR: Gigabit Singlemode Optical Ports (10Km).
        /// </summary>
        public readonly string PortType;
        /// <summary>
        /// Redundant Physical Connection to Which the ID.
        /// </summary>
        public readonly string RedundantPhysicalConnectionId;
        /// <summary>
        /// The Renewal of the Entry into Force of the Time.
        /// </summary>
        public readonly string ReservationActiveTime;
        /// <summary>
        /// Renewal Type.
        /// </summary>
        public readonly string ReservationInternetChargeType;
        /// <summary>
        /// Renewal Order Type.
        /// </summary>
        public readonly string ReservationOrderType;
        /// <summary>
        /// The Physical Connection to Which the Specifications.
        /// </summary>
        public readonly string Spec;
        /// <summary>
        /// Resources on Behalf of a State of the Resource Attribute Field.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Physical Private Line of Type. Default Value: VPC.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPhysicalConnectionsConnectionResult(
            string accessPointId,

            string adLocation,

            string bandwidth,

            string businessStatus,

            string circuitCode,

            string createTime,

            string description,

            string enabledTime,

            string endTime,

            string hasReservationData,

            string id,

            string lineOperator,

            string loaStatus,

            string paymentType,

            string peerLocation,

            string physicalConnectionId,

            string physicalConnectionName,

            string portNumber,

            string portType,

            string redundantPhysicalConnectionId,

            string reservationActiveTime,

            string reservationInternetChargeType,

            string reservationOrderType,

            string spec,

            string status,

            string type)
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
            HasReservationData = hasReservationData;
            Id = id;
            LineOperator = lineOperator;
            LoaStatus = loaStatus;
            PaymentType = paymentType;
            PeerLocation = peerLocation;
            PhysicalConnectionId = physicalConnectionId;
            PhysicalConnectionName = physicalConnectionName;
            PortNumber = portNumber;
            PortType = portType;
            RedundantPhysicalConnectionId = redundantPhysicalConnectionId;
            ReservationActiveTime = reservationActiveTime;
            ReservationInternetChargeType = reservationInternetChargeType;
            ReservationOrderType = reservationOrderType;
            Spec = spec;
            Status = status;
            Type = type;
        }
    }
}
