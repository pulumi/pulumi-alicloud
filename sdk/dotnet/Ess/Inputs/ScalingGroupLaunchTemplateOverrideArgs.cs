// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Inputs
{

    public sealed class ScalingGroupLaunchTemplateOverrideArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The instance type in launchTemplateOverride.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The maximum bid price of instance type in launchTemplateOverride.
        /// 
        /// 
        /// &gt; **NOTE:** When detach loadbalancers, instances in group will be remove from loadbalancer's `Default Server Group`; On the contrary, When attach loadbalancers, instances in group will be added to loadbalancer's `Default Server Group`.
        /// 
        /// &gt; **NOTE:** When detach dbInstances, private ip of instances in group will be remove from dbInstance's `WhiteList`; On the contrary, When attach dbInstances, private ip of instances in group will be added to dbInstance's `WhiteList`.
        /// 
        /// &gt; **NOTE:** `on_demand_base_capacity`,`on_demand_percentage_above_base_capacity`,`spot_instance_pools`,`spot_instance_remedy` are valid only if `multi_az_policy` is 'COST_OPTIMIZED'.
        /// </summary>
        [Input("spotPriceLimit")]
        public Input<double>? SpotPriceLimit { get; set; }

        /// <summary>
        /// The weight of the instance type in launchTemplateOverride.
        /// </summary>
        [Input("weightedCapacity")]
        public Input<int>? WeightedCapacity { get; set; }

        public ScalingGroupLaunchTemplateOverrideArgs()
        {
        }
        public static new ScalingGroupLaunchTemplateOverrideArgs Empty => new ScalingGroupLaunchTemplateOverrideArgs();
    }
}
