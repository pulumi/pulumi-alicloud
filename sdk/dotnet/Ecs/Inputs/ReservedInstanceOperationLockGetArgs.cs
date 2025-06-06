// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class ReservedInstanceOperationLockGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The reason why the reserved instance was locked.
        /// </summary>
        [Input("lockReason")]
        public Input<string>? LockReason { get; set; }

        public ReservedInstanceOperationLockGetArgs()
        {
        }
        public static new ReservedInstanceOperationLockGetArgs Empty => new ReservedInstanceOperationLockGetArgs();
    }
}
