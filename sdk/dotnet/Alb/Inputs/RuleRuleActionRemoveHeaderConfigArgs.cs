// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleActionRemoveHeaderConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the removed header field. It can be 1 to 40 characters in length and supports upper and lower case letters a to z, numbers, underscores (_), and dashes (-). Header field names cannot be used repeatedly in RemoveHeader. 
        /// * Request Direction: The header name cannot be set to the following fields (case insensitive):slb-id, slb-ip, x-forwarded-for, x-forwarded-proto, x-forwarded-eip, x-forwarded-port, x-forwarded-client-srcport, connection, upgrade, content-length, transfer-encoding, keep-alive, te, host, cookie, remoteip, and authority.
        /// * Response Direction: The header name cannot be set to the following fields (case insensitive):connection, upgrade, content-length, transfer-encoding.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        public RuleRuleActionRemoveHeaderConfigArgs()
        {
        }
        public static new RuleRuleActionRemoveHeaderConfigArgs Empty => new RuleRuleActionRemoveHeaderConfigArgs();
    }
}