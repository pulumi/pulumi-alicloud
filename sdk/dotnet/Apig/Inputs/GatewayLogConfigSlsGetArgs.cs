// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Apig.Inputs
{

    public sealed class GatewayLogConfigSlsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Log Service
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        public GatewayLogConfigSlsGetArgs()
        {
        }
        public static new GatewayLogConfigSlsGetArgs Empty => new GatewayLogConfigSlsGetArgs();
    }
}