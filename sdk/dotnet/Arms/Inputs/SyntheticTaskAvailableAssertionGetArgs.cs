// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Inputs
{

    public sealed class SyntheticTaskAvailableAssertionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expected value.
        /// </summary>
        [Input("expect", required: true)]
        public Input<string> Expect { get; set; } = null!;

        /// <summary>
        /// Condition: gt: greater than; gte: greater than or equal to; lt: less than; te: less than or equal to; eq: equal to; neq: not equal to; ctn: contains; nctn: does not contain; exist: exists; n_exist: does not exist; belong: belongs to; reg_match: regular matching.
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// Check the target. If the target is HttpResCode, HttpResBody, or httpressetime, you do not need to specify the target. If the target is HttpResHead, you need to specify the key in the header. If the target is HttpResHead, you need to use jsonPath.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public SyntheticTaskAvailableAssertionGetArgs()
        {
        }
        public static new SyntheticTaskAvailableAssertionGetArgs Empty => new SyntheticTaskAvailableAssertionGetArgs();
    }
}
