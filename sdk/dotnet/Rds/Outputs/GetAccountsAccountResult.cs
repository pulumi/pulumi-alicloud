// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class GetAccountsAccountResult
    {
        /// <summary>
        /// Database description.
        /// </summary>
        public readonly string AccountDescription;
        /// <summary>
        /// Name of database account.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// Privilege type of account.
        /// </summary>
        public readonly string AccountType;
        /// <summary>
        /// A list of database permissions the account has.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccountsAccountDatabasePrivilegeResult> DatabasePrivileges;
        /// <summary>
        /// The ID of the Account.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether the maximum number of databases managed by the account is exceeded.
        /// </summary>
        public readonly string PrivExceeded;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetAccountsAccountResult(
            string accountDescription,

            string accountName,

            string accountType,

            ImmutableArray<Outputs.GetAccountsAccountDatabasePrivilegeResult> databasePrivileges,

            string id,

            string privExceeded,

            string status)
        {
            AccountDescription = accountDescription;
            AccountName = accountName;
            AccountType = accountType;
            DatabasePrivileges = databasePrivileges;
            Id = id;
            PrivExceeded = privExceeded;
            Status = status;
        }
    }
}
