// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Inputs
{

    public sealed class RdsUpgradeDbInstancePgHbaConfGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP addresses from which the specified users can access the specified databases. If you set this parameter to 0.0.0.0/0, the specified users are allowed to access the specified databases from all IP addresses.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// The name of the database that the specified users are allowed to access. If you set this parameter to all, the specified users are allowed to access all databases in the instance. If you specify multiple databases, separate the database names with commas (,).
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The mask of the instance. If the value of the `Address` parameter is an IP address, you can use this parameter to specify the mask of the IP address.
        /// </summary>
        [Input("mask")]
        public Input<string>? Mask { get; set; }

        /// <summary>
        /// The authentication method of Lightweight Directory Access Protocol (LDAP). Valid values: `trust`, `reject`, `scram-sha-256`, `md5`, `password`, `gss`, `sspi`, `ldap`, `radius`, `cert`, `pam`.
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// Optional. The value of this parameter is based on the value of the HbaItem.N.Method parameter. In this topic, LDAP is used as an example. You must configure this parameter. For more information, see [Authentication Methods](https://www.postgresql.org/docs/11/auth-methods.html).
        /// </summary>
        [Input("option")]
        public Input<string>? Option { get; set; }

        /// <summary>
        /// The priority of an AD domain. If you set this parameter to 0, the AD domain has the highest priority. Valid values: 0 to 10000. This parameter is used to identify each AD domain. When you add an AD domain, the value of the PriorityId parameter of the new AD domain cannot be the same as the value of the PriorityId parameter for any existing AD domain. When you modify or delete an AD domain, you must also modify or delete the value of the PriorityId parameter for this AD domain.
        /// </summary>
        [Input("priorityId", required: true)]
        public Input<int> PriorityId { get; set; } = null!;

        /// <summary>
        /// The type of connection to the instance. Valid values:
        /// * **host**: specifies to verify TCP/IP connections, including SSL connections and non-SSL connections.
        /// * **hostssl**: specifies to verify only TCP/IP connections that are established over SSL connections.
        /// * **hostnossl**: specifies to verify only TCP/IP connections that are established over non-SSL connections.
        /// 
        /// &gt; **NOTE:** You can set this parameter to hostssl only when SSL encryption is enabled for the instance. For more information, see [Configure SSL encryption for an ApsaraDB RDS for PostgreSQL instance](https://www.alibabacloud.com/help/en/doc-detail/229518.htm).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The user that is allowed to access the instance. If you specify multiple users, separate the usernames with commas (,).
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public RdsUpgradeDbInstancePgHbaConfGetArgs()
        {
        }
        public static new RdsUpgradeDbInstancePgHbaConfGetArgs Empty => new RdsUpgradeDbInstancePgHbaConfGetArgs();
    }
}
