// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Outputs
{

    [OutputType]
    public sealed class ClusterNode
    {
        public readonly string? Eip;
        public readonly string? Id;
        public readonly string? Name;
        public readonly string? PrivateIp;
        public readonly string? Status;

        [OutputConstructor]
        private ClusterNode(
            string? eip,

            string? id,

            string? name,

            string? privateIp,

            string? status)
        {
            Eip = eip;
            Id = id;
            Name = name;
            PrivateIp = privateIp;
            Status = status;
        }
    }
}
