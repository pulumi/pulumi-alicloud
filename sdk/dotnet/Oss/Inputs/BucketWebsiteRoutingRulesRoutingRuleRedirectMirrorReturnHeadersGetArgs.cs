// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorReturnHeadersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("returnHeaders")]
        private InputList<Inputs.BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorReturnHeadersReturnHeaderGetArgs>? _returnHeaders;

        /// <summary>
        /// The list of response header rules for mirroring back-to-source return. See `return_header` below.
        /// </summary>
        public InputList<Inputs.BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorReturnHeadersReturnHeaderGetArgs> ReturnHeaders
        {
            get => _returnHeaders ?? (_returnHeaders = new InputList<Inputs.BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorReturnHeadersReturnHeaderGetArgs>());
            set => _returnHeaders = value;
        }

        public BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorReturnHeadersGetArgs()
        {
        }
        public static new BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorReturnHeadersGetArgs Empty => new BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorReturnHeadersGetArgs();
    }
}
