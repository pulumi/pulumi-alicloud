// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Inputs
{

    public sealed class SyntheticTaskMonitorConfApiHttpRequestBodyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The request body content, in JSON string format. When the type is text/plain,application/json,application/xml,text/html, the content can be converted to a JSON string.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public SyntheticTaskMonitorConfApiHttpRequestBodyArgs()
        {
        }
        public static new SyntheticTaskMonitorConfApiHttpRequestBodyArgs Empty => new SyntheticTaskMonitorConfApiHttpRequestBodyArgs();
    }
}