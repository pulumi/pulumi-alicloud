// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class ListenerAclConfigAclRelation
    {
        /// <summary>
        /// Snooping Binding of the Access Policy Group ID List.
        /// </summary>
        public readonly string? AclId;
        /// <summary>
        /// The Current IP Address of the Listened State
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private ListenerAclConfigAclRelation(
            string? aclId,

            string? status)
        {
            AclId = aclId;
            Status = status;
        }
    }
}
