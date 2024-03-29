// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class LoadBalancerAccessLogConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This Log Storage Project.
        /// </summary>
        [Input("logProject", required: true)]
        public Input<string> LogProject { get; set; } = null!;

        /// <summary>
        /// This Log Storage Method Is Increased.
        /// </summary>
        [Input("logStore", required: true)]
        public Input<string> LogStore { get; set; } = null!;

        public LoadBalancerAccessLogConfigGetArgs()
        {
        }
        public static new LoadBalancerAccessLogConfigGetArgs Empty => new LoadBalancerAccessLogConfigGetArgs();
    }
}
