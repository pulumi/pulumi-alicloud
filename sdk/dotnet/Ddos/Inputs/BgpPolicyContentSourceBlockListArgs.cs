// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos.Inputs
{

    public sealed class BgpPolicyContentSourceBlockListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Statistical cycle range 60-1200.
        /// </summary>
        [Input("blockExpireSeconds", required: true)]
        public Input<int> BlockExpireSeconds { get; set; } = null!;

        /// <summary>
        /// The time (unit second) for automatically releasing the black after triggering the speed limit is 60~2592000.
        /// </summary>
        [Input("everySeconds", required: true)]
        public Input<int> EverySeconds { get; set; } = null!;

        /// <summary>
        /// The number of times the speed limit is exceeded in a statistical period ranges from 1 to 1200.
        /// </summary>
        [Input("exceedLimitTimes", required: true)]
        public Input<int> ExceedLimitTimes { get; set; } = null!;

        /// <summary>
        /// Type
        /// </summary>
        [Input("type", required: true)]
        public Input<int> Type { get; set; } = null!;

        public BgpPolicyContentSourceBlockListArgs()
        {
        }
        public static new BgpPolicyContentSourceBlockListArgs Empty => new BgpPolicyContentSourceBlockListArgs();
    }
}