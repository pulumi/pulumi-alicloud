// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Inputs
{

    public sealed class DispatchRuleNotifyRuleNotifyObjectGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("notifyObjectId", required: true)]
        public Input<string> NotifyObjectId { get; set; } = null!;

        [Input("notifyType", required: true)]
        public Input<string> NotifyType { get; set; } = null!;

        public DispatchRuleNotifyRuleNotifyObjectGetArgs()
        {
        }
        public static new DispatchRuleNotifyRuleNotifyObjectGetArgs Empty => new DispatchRuleNotifyRuleNotifyObjectGetArgs();
    }
}
