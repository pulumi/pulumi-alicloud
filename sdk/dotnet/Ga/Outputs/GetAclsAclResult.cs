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
    public sealed class GetAclsAclResult
    {
        /// <summary>
        /// The entries of the Acl.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAclsAclAclEntryResult> AclEntries;
        /// <summary>
        /// The  ID of the Acl.
        /// </summary>
        public readonly string AclId;
        /// <summary>
        /// The name of the acl.
        /// </summary>
        public readonly string AclName;
        /// <summary>
        /// The address ip version.
        /// </summary>
        public readonly string AddressIpVersion;
        /// <summary>
        /// The ID of the Acl. Its value is same as `acl_id`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The status of the resource. Valid values: `active`, `configuring`, `deleting`, `init`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetAclsAclResult(
            ImmutableArray<Outputs.GetAclsAclAclEntryResult> aclEntries,

            string aclId,

            string aclName,

            string addressIpVersion,

            string id,

            string status)
        {
            AclEntries = aclEntries;
            AclId = aclId;
            AclName = aclName;
            AddressIpVersion = addressIpVersion;
            Id = id;
            Status = status;
        }
    }
}
