// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ListenerAclConfigAclRelationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Snooping Binding of the Access Policy Group ID List.
        /// </summary>
        [Input("aclId")]
        public Input<string>? AclId { get; set; }

        /// <summary>
        /// The Current IP Address of the Listened State
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ListenerAclConfigAclRelationGetArgs()
        {
        }
        public static new ListenerAclConfigAclRelationGetArgs Empty => new ListenerAclConfigAclRelationGetArgs();
    }
}
