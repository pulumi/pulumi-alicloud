// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Outputs
{

    [OutputType]
    public sealed class SyntheticTaskAvailableAssertion
    {
        /// <summary>
        /// Expected value.
        /// </summary>
        public readonly string Expect;
        /// <summary>
        /// Condition: gt: greater than; gte: greater than or equal to; lt: less than; te: less than or equal to; eq: equal to; neq: not equal to; ctn: contains; nctn: does not contain; exist: exists; n_exist: does not exist; belong: belongs to; reg_match: regular matching.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Check the target. If the target is HttpResCode, HttpResBody, or httpressetime, you do not need to specify the target. If the target is HttpResHead, you need to specify the key in the header. If the target is HttpResHead, you need to use jsonPath.
        /// </summary>
        public readonly string? Target;
        /// <summary>
        /// Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private SyntheticTaskAvailableAssertion(
            string expect,

            string @operator,

            string? target,

            string type)
        {
            Expect = expect;
            Operator = @operator;
            Target = target;
            Type = type;
        }
    }
}
