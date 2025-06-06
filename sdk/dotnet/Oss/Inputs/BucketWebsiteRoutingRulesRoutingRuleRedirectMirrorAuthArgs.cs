// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorAuthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mirror back-to-source source Station back-to-source AK
        /// </summary>
        [Input("accessKeyId")]
        public Input<string>? AccessKeyId { get; set; }

        [Input("accessKeySecret")]
        private Input<string>? _accessKeySecret;

        /// <summary>
        /// Mirroring back to the source station back to the source SK will be automatically desensitized when obtaining the configuration.
        /// </summary>
        public Input<string>? AccessKeySecret
        {
            get => _accessKeySecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKeySecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Authentication type of mirror return Source
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        /// <summary>
        /// Signature Region
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorAuthArgs()
        {
        }
        public static new BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorAuthArgs Empty => new BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorAuthArgs();
    }
}
