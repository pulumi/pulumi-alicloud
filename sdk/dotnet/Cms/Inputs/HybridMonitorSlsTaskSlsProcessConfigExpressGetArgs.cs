// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class HybridMonitorSlsTaskSlsProcessConfigExpressGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// The extended field that specifies the result of basic operations that are performed on aggregation results.
        /// </summary>
        [Input("express")]
        public Input<string>? Express { get; set; }

        public HybridMonitorSlsTaskSlsProcessConfigExpressGetArgs()
        {
        }
    }
}