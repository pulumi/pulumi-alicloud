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
    public sealed class GetUsersUserResult
    {
        /// <summary>
        /// Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// Specify the New Created the User's Display Name. Supports up to 128 Characters.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// Specify the New User's Mailbox.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// The ID of the User.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// You Want to Query the User the Bastion Host ID of.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Specify the New of the User That Created a Different Mobile Phone Number from Your.
        /// </summary>
        public readonly string Mobile;
        /// <summary>
        /// Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN Value: CN: Mainland China (+86) HK: hong Kong, China (+852) Mo: Macau, China (+853) TW: Taiwan, China (+886) ru: Russian (+7) SG: Singapore (+65) My: malaysia (+60) ID: Indonesia (+62) De: Germany (+49) AU: Australia (+61) US: United States (+1) AE: dubai (+971) JP: Japan (+81) Introducing the Long-Range GB: United Kingdom (+44) in: India (+91) KR: South Korea (+82) Ph: philippines (+63) Ch: Switzerland (+41) Se: Sweden (+46).
        /// </summary>
        public readonly string MobileCountryCode;
        /// <summary>
        /// Specify the New of the User That Created the Source. Valid Values: Local: Local User RAM: Ram User.
        /// </summary>
        public readonly string Source;
        /// <summary>
        /// Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        /// </summary>
        public readonly string SourceUserId;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The User ID.
        /// </summary>
        public readonly string UserId;
        /// <summary>
        /// Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        /// </summary>
        public readonly string UserName;

        [OutputConstructor]
        private GetUsersUserResult(
            string comment,

            string displayName,

            string email,

            string id,

            string instanceId,

            string mobile,

            string mobileCountryCode,

            string source,

            string sourceUserId,

            string status,

            string userId,

            string userName)
        {
            Comment = comment;
            DisplayName = displayName;
            Email = email;
            Id = id;
            InstanceId = instanceId;
            Mobile = mobile;
            MobileCountryCode = mobileCountryCode;
            Source = source;
            SourceUserId = sourceUserId;
            Status = status;
            UserId = userId;
            UserName = userName;
        }
    }
}
