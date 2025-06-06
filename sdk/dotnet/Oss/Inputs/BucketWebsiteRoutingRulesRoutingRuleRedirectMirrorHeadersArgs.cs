// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether other headers except the following headers are transmitted to the source site. It takes effect only when the RedirectType is set to Mirror. content-length, authorization2, authorization, range, date, and other headers Headers whose names start with oss-/x-oss-/x-drs-
        /// </summary>
        [Input("passAll")]
        public Input<bool>? PassAll { get; set; }

        [Input("passes")]
        private InputList<string>? _passes;

        /// <summary>
        /// Pass through the specified Header to the source site. It takes effect only when the RedirectType is set to Mirror. Each Header is up to 1024 bytes in length and has A character set of 0 to 9, a to Z, A to z, and dashes (-).
        /// </summary>
        public InputList<string> Passes
        {
            get => _passes ?? (_passes = new InputList<string>());
            set => _passes = value;
        }

        [Input("removes")]
        private InputList<string>? _removes;

        /// <summary>
        /// Do not pass the specified Header to the source site. It takes effect only when the RedirectType is set to Mirror. Each Header is up to 1024 bytes in length and has A character set of 0 to 9, a to Z, A to z, and dashes (-).
        /// </summary>
        public InputList<string> Removes
        {
            get => _removes ?? (_removes = new InputList<string>());
            set => _removes = value;
        }

        [Input("sets")]
        private InputList<Inputs.BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersSetArgs>? _sets;

        /// <summary>
        /// Set a Header to send to the source site. Regardless of whether the request contains the specified Header, these headers will be set when returning to the source site. It takes effect only when the RedirectType is set to Mirror. See `set` below.
        /// </summary>
        public InputList<Inputs.BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersSetArgs> Sets
        {
            get => _sets ?? (_sets = new InputList<Inputs.BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersSetArgs>());
            set => _sets = value;
        }

        public BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersArgs()
        {
        }
        public static new BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersArgs Empty => new BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorHeadersArgs();
    }
}
