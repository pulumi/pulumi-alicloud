// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.SelectDB.Outputs
{

    [OutputType]
    public sealed class DbInstanceInstanceNetInfo
    {
        /// <summary>
        /// The connection string of the instance.
        /// </summary>
        public readonly string? ConnectionString;
        /// <summary>
        /// The IP address of the instance.
        /// </summary>
        public readonly string? DbIp;
        /// <summary>
        /// The network type of the instance.
        /// </summary>
        public readonly string? NetType;
        /// <summary>
        /// A list for port provides SelectDB service.
        /// </summary>
        public readonly ImmutableArray<Outputs.DbInstanceInstanceNetInfoPortList> PortLists;
        /// <summary>
        /// The VPC ID.
        /// </summary>
        public readonly string? VpcInstanceId;
        /// <summary>
        /// The ID of vswitch for DBInstance.
        /// </summary>
        public readonly string? VswitchId;

        [OutputConstructor]
        private DbInstanceInstanceNetInfo(
            string? connectionString,

            string? dbIp,

            string? netType,

            ImmutableArray<Outputs.DbInstanceInstanceNetInfoPortList> portLists,

            string? vpcInstanceId,

            string? vswitchId)
        {
            ConnectionString = connectionString;
            DbIp = dbIp;
            NetType = netType;
            PortLists = portLists;
            VpcInstanceId = vpcInstanceId;
            VswitchId = vswitchId;
        }
    }
}
