// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class NodePoolSpotPriceLimitGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Spot instance type.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The maximum hourly price of the spot instance.
        /// </summary>
        [Input("priceLimit")]
        public Input<string>? PriceLimit { get; set; }

        public NodePoolSpotPriceLimitGetArgs()
        {
        }
    }
}