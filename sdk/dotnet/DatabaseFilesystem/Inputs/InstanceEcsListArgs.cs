// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DatabaseFilesystem.Inputs
{

    public sealed class InstanceEcsListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the ECS instance.
        /// 
        /// The following arguments will be discarded. Please use new fields as soon as possible:
        /// </summary>
        [Input("ecsId")]
        public Input<string>? EcsId { get; set; }

        public InstanceEcsListArgs()
        {
        }
        public static new InstanceEcsListArgs Empty => new InstanceEcsListArgs();
    }
}
