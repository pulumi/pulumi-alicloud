// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr.Inputs
{

    public sealed class RestoreJobOtsDetailGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("overwriteExisting")]
        public Input<bool>? OverwriteExisting { get; set; }

        public RestoreJobOtsDetailGetArgs()
        {
        }
        public static new RestoreJobOtsDetailGetArgs Empty => new RestoreJobOtsDetailGetArgs();
    }
}