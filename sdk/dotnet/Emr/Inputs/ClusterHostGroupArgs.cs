// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr.Inputs
{

    public sealed class ClusterHostGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// Charge Type for this cluster. Supported value: PostPaid or PrePaid. Default value: PostPaid.
        /// </summary>
        [Input("chargeType")]
        public Input<string>? ChargeType { get; set; }

        [Input("decommissionTimeout")]
        public Input<int>? DecommissionTimeout { get; set; }

        [Input("diskCapacity")]
        public Input<string>? DiskCapacity { get; set; }

        [Input("diskCount")]
        public Input<string>? DiskCount { get; set; }

        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        [Input("enableGracefulDecommission")]
        public Input<bool>? EnableGracefulDecommission { get; set; }

        [Input("gpuDriver")]
        public Input<string>? GpuDriver { get; set; }

        [Input("hostGroupName")]
        public Input<string>? HostGroupName { get; set; }

        [Input("hostGroupType")]
        public Input<string>? HostGroupType { get; set; }

        [Input("instanceList")]
        public Input<string>? InstanceList { get; set; }

        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("nodeCount")]
        public Input<string>? NodeCount { get; set; }

        /// <summary>
        /// If charge type is PrePaid, this should be specified, unit is month. Supported value: 1、2、3、4、5、6、7、8、9、12、24、36.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        [Input("sysDiskCapacity")]
        public Input<string>? SysDiskCapacity { get; set; }

        [Input("sysDiskType")]
        public Input<string>? SysDiskType { get; set; }

        public ClusterHostGroupArgs()
        {
        }
        public static new ClusterHostGroupArgs Empty => new ClusterHostGroupArgs();
    }
}
