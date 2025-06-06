// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms.Outputs
{

    [OutputType]
    public sealed class GetKeysKeyResult
    {
        /// <summary>
        /// The Alibaba Cloud Resource Name (ARN) of the key.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// (Available in 1.123.1+) Specifies whether to enable automatic key rotation.
        /// </summary>
        public readonly string AutomaticRotation;
        /// <summary>
        /// Creation date of key.
        /// </summary>
        public readonly string CreationDate;
        /// <summary>
        /// The owner of the key.
        /// </summary>
        public readonly string Creator;
        /// <summary>
        /// Deletion date of key.
        /// </summary>
        public readonly string DeleteDate;
        /// <summary>
        /// Description of the key.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of the key.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Available in 1.123.1+)  ID of the key.
        /// </summary>
        public readonly string KeyId;
        /// <summary>
        /// (Available in 1.123.1+)  The type of the CMK.
        /// </summary>
        public readonly string KeySpec;
        /// <summary>
        /// (Available in 1.123.1+)  The usage of CMK.
        /// </summary>
        public readonly string KeyUsage;
        /// <summary>
        /// (Available in 1.123.1+)  The date and time the last rotation was performed.
        /// </summary>
        public readonly string LastRotationDate;
        /// <summary>
        /// (Available in 1.123.1+)  The time and date the key material for the CMK expires.
        /// </summary>
        public readonly string MaterialExpireTime;
        /// <summary>
        /// (Available in 1.123.1+)  The time the next rotation is scheduled for execution.
        /// </summary>
        public readonly string NextRotationDate;
        /// <summary>
        /// (Available in 1.123.1+)  The source of the key material for the CMK.
        /// </summary>
        public readonly string Origin;
        /// <summary>
        /// (Available in 1.123.1+)  The ID of the current primary key version of the symmetric CMK.
        /// </summary>
        public readonly string PrimaryKeyVersion;
        /// <summary>
        /// (Available in 1.123.1+)  The protection level of the CMK.
        /// </summary>
        public readonly string ProtectionLevel;
        /// <summary>
        /// (Available in 1.123.1+)  The period of automatic key rotation.
        /// </summary>
        public readonly string RotationInterval;
        /// <summary>
        /// Filter the results by status of the KMS keys. Valid values: `Enabled`, `Disabled`, `PendingDeletion`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetKeysKeyResult(
            string arn,

            string automaticRotation,

            string creationDate,

            string creator,

            string deleteDate,

            string description,

            string id,

            string keyId,

            string keySpec,

            string keyUsage,

            string lastRotationDate,

            string materialExpireTime,

            string nextRotationDate,

            string origin,

            string primaryKeyVersion,

            string protectionLevel,

            string rotationInterval,

            string status)
        {
            Arn = arn;
            AutomaticRotation = automaticRotation;
            CreationDate = creationDate;
            Creator = creator;
            DeleteDate = deleteDate;
            Description = description;
            Id = id;
            KeyId = keyId;
            KeySpec = keySpec;
            KeyUsage = keyUsage;
            LastRotationDate = lastRotationDate;
            MaterialExpireTime = materialExpireTime;
            NextRotationDate = nextRotationDate;
            Origin = origin;
            PrimaryKeyVersion = primaryKeyVersion;
            ProtectionLevel = protectionLevel;
            RotationInterval = rotationInterval;
            Status = status;
        }
    }
}
