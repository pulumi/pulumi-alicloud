// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersSetArgs : global::Pulumi.ResourceArgs
    {
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Set the value of the Header to 1024 bytes at most. \r\n. It takes effect only when the RedirectType is set to Mirror.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersSetArgs()
        {
        }
        public static new BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersSetArgs Empty => new BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersSetArgs();
    }
}