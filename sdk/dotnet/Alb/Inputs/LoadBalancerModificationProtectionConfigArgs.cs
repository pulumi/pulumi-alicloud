// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class LoadBalancerModificationProtectionConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Managed Instance
        /// </summary>
        [Input("reason")]
        public Input<string>? Reason { get; set; }

        /// <summary>
        /// Load Balancing Modify the Protection Status
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public LoadBalancerModificationProtectionConfigArgs()
        {
        }
        public static new LoadBalancerModificationProtectionConfigArgs Empty => new LoadBalancerModificationProtectionConfigArgs();
    }
}
