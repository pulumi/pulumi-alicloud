// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log.Outputs
{

    [OutputType]
    public sealed class StoreShard
    {
        public readonly string? BeginKey;
        public readonly string? EndKey;
        /// <summary>
        /// The ID of the log project. It formats of `&lt;project&gt;:&lt;name&gt;`.
        /// </summary>
        public readonly int? Id;
        public readonly string? Status;

        [OutputConstructor]
        private StoreShard(
            string? beginKey,

            string? endKey,

            int? id,

            string? status)
        {
            BeginKey = beginKey;
            EndKey = endKey;
            Id = id;
            Status = status;
        }
    }
}