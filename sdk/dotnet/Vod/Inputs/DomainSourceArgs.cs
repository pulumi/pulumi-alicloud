// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vod.Inputs
{

    public sealed class DomainSourceArgs : global::Pulumi.ResourceArgs
    {
        [Input("sourceContent", required: true)]
        public Input<string> SourceContent { get; set; } = null!;

        [Input("sourcePort", required: true)]
        public Input<string> SourcePort { get; set; } = null!;

        [Input("sourcePriority")]
        public Input<string>? SourcePriority { get; set; }

        [Input("sourceType", required: true)]
        public Input<string> SourceType { get; set; } = null!;

        public DomainSourceArgs()
        {
        }
        public static new DomainSourceArgs Empty => new DomainSourceArgs();
    }
}
