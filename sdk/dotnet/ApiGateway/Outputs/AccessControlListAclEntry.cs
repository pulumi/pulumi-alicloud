// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway.Outputs
{

    [OutputType]
    public sealed class AccessControlListAclEntry
    {
        /// <summary>
        /// The description of the ACL.
        /// </summary>
        public readonly string? AclEntryComment;
        /// <summary>
        /// The entries that you want to add to the ACL. You can add CIDR blocks. Separate multiple CIDR blocks with commas (,).
        /// </summary>
        public readonly string? AclEntryIp;

        [OutputConstructor]
        private AccessControlListAclEntry(
            string? aclEntryComment,

            string? aclEntryIp)
        {
            AclEntryComment = aclEntryComment;
            AclEntryIp = aclEntryIp;
        }
    }
}