// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Inputs
{

    public sealed class CustomDataDiskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Instance storage type
        /// 
        /// local_ssd: local SSD disk
        /// 
        /// cloud_essd:ESSD PL1 cloud disk
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Cloud Disk Performance
        /// 
        /// Currently only supports PL1
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// Instance storage space. Unit: GB.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        public CustomDataDiskGetArgs()
        {
        }
        public static new CustomDataDiskGetArgs Empty => new CustomDataDiskGetArgs();
    }
}