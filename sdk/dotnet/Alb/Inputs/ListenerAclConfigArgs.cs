// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ListenerAclConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("aclRelations")]
        private InputList<Inputs.ListenerAclConfigAclRelationArgs>? _aclRelations;

        /// <summary>
        /// The ACLs that are associated with the listener. See `acl_relations` below for details.
        /// </summary>
        public InputList<Inputs.ListenerAclConfigAclRelationArgs> AclRelations
        {
            get => _aclRelations ?? (_aclRelations = new InputList<Inputs.ListenerAclConfigAclRelationArgs>());
            set => _aclRelations = value;
        }

        /// <summary>
        /// The type of the ACL. Valid values: `White` Or `Black`. `White`: specifies the ACL as a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists apply to scenarios where only specific IP addresses are allowed to access an application. Risks may occur if the whitelist is improperly set. After you set a whitelist for an Application Load Balancer (ALB) listener, only requests from IP addresses that are added to the whitelist are distributed by the listener. If the whitelist is enabled without IP addresses specified, the ALB listener does not forward requests. `Black`: All requests from the IP addresses or CIDR blocks in the ACL are denied. The blacklist is used to prevent specified IP addresses from accessing an application. If the blacklist is enabled but the corresponding ACL does not contain IP addresses, the ALB listener forwards all requests.
        /// </summary>
        [Input("aclType")]
        public Input<string>? AclType { get; set; }

        public ListenerAclConfigArgs()
        {
        }
        public static new ListenerAclConfigArgs Empty => new ListenerAclConfigArgs();
    }
}