// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager.Outputs
{

    [OutputType]
    public sealed class GetAccountsAccountResult
    {
        /// <summary>
        /// The ID of the account.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// (Available in v1.125.0+) The Alibaba Cloud account name of the member account.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// The name of the member account.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// The ID of the folder.
        /// </summary>
        public readonly string FolderId;
        /// <summary>
        /// The ID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The way in which the member account joined the resource directory.
        /// </summary>
        public readonly string JoinMethod;
        /// <summary>
        /// The time when the member account joined the resource directory.
        /// </summary>
        public readonly string JoinTime;
        /// <summary>
        /// The time when the member account was modified.
        /// </summary>
        public readonly string ModifyTime;
        /// <summary>
        /// (Available in v1.124.3+) Settlement account ID. If the value is empty, the current account will be used for settlement.
        /// </summary>
        public readonly string PayerAccountId;
        /// <summary>
        /// The ID of the resource directory.
        /// </summary>
        public readonly string ResourceDirectoryId;
        /// <summary>
        /// The status of account, valid values: `CreateCancelled`, `CreateExpired`, `CreateFailed`, `CreateSuccess`, `CreateVerifying`, `InviteSuccess`, `PromoteCancelled`, `PromoteExpired`, `PromoteFailed`, `PromoteSuccess`, and `PromoteVerifying`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The type of the member account.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetAccountsAccountResult(
            string accountId,

            string accountName,

            string displayName,

            string folderId,

            string id,

            string joinMethod,

            string joinTime,

            string modifyTime,

            string payerAccountId,

            string resourceDirectoryId,

            string status,

            string type)
        {
            AccountId = accountId;
            AccountName = accountName;
            DisplayName = displayName;
            FolderId = folderId;
            Id = id;
            JoinMethod = joinMethod;
            JoinTime = joinTime;
            ModifyTime = modifyTime;
            PayerAccountId = payerAccountId;
            ResourceDirectoryId = resourceDirectoryId;
            Status = status;
            Type = type;
        }
    }
}
