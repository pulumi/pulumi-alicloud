// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ListenerDefaultActionForwardGroupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("serverGroupTuples", required: true)]
        private InputList<Inputs.ListenerDefaultActionForwardGroupConfigServerGroupTupleGetArgs>? _serverGroupTuples;
        public InputList<Inputs.ListenerDefaultActionForwardGroupConfigServerGroupTupleGetArgs> ServerGroupTuples
        {
            get => _serverGroupTuples ?? (_serverGroupTuples = new InputList<Inputs.ListenerDefaultActionForwardGroupConfigServerGroupTupleGetArgs>());
            set => _serverGroupTuples = value;
        }

        public ListenerDefaultActionForwardGroupConfigGetArgs()
        {
        }
        public static new ListenerDefaultActionForwardGroupConfigGetArgs Empty => new ListenerDefaultActionForwardGroupConfigGetArgs();
    }
}