// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Outputs
{

    [OutputType]
    public sealed class BucketWebsiteRoutingRules
    {
        /// <summary>
        /// Specify a jump rule or a mirroring back-to-origin rule, with a maximum of 20 routing rules. See `routing_rule` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.BucketWebsiteRoutingRulesRoutingRule> RoutingRules;

        [OutputConstructor]
        private BucketWebsiteRoutingRules(ImmutableArray<Outputs.BucketWebsiteRoutingRulesRoutingRule> routingRules)
        {
            RoutingRules = routingRules;
        }
    }
}