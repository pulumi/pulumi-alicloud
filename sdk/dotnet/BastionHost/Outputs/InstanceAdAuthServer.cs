// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.BastionHost.Outputs
{

    [OutputType]
    public sealed class InstanceAdAuthServer
    {
        /// <summary>
        /// The username of the account that is used for the AD server.
        /// </summary>
        public readonly string Account;
        /// <summary>
        /// The Base distinguished name (DN).
        /// </summary>
        public readonly string BaseDn;
        /// <summary>
        /// The domain on the AD server.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// The field that is used to indicate the email address of a user on the AD server.
        /// </summary>
        public readonly string? EmailMapping;
        /// <summary>
        /// The condition that is used to filter users.
        /// </summary>
        public readonly string? Filter;
        /// <summary>
        /// Specifies whether to support SSL.
        /// </summary>
        public readonly bool IsSsl;
        /// <summary>
        /// The field that is used to indicate the mobile phone number of a user on the AD server.
        /// </summary>
        public readonly string? MobileMapping;
        /// <summary>
        /// The field that is used to indicate the name of a user on the AD server.
        /// </summary>
        public readonly string? NameMapping;
        /// <summary>
        /// The password of the account that is used for the AD server.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The port that is used to access the AD server.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The address of the AD server.
        /// </summary>
        public readonly string Server;
        /// <summary>
        /// The address of the secondary AD server.
        /// </summary>
        public readonly string? StandbyServer;

        [OutputConstructor]
        private InstanceAdAuthServer(
            string account,

            string baseDn,

            string domain,

            string? emailMapping,

            string? filter,

            bool isSsl,

            string? mobileMapping,

            string? nameMapping,

            string? password,

            int port,

            string server,

            string? standbyServer)
        {
            Account = account;
            BaseDn = baseDn;
            Domain = domain;
            EmailMapping = emailMapping;
            Filter = filter;
            IsSsl = isSsl;
            MobileMapping = mobileMapping;
            NameMapping = nameMapping;
            Password = password;
            Port = port;
            Server = server;
            StandbyServer = standbyServer;
        }
    }
}
