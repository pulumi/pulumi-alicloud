// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class LoadBalancerLoadBalancerBillingConfig
    {
        /// <summary>
        /// Pay Type. Valid values: `PayAsYouGo`. **Note:** provider changes the payment type to `PayAsYouGo`, while the actual parameter on api is `PostPay`.
        /// </summary>
        public readonly string PayType;

        [OutputConstructor]
        private LoadBalancerLoadBalancerBillingConfig(string payType)
        {
            PayType = payType;
        }
    }
}