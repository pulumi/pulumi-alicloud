// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Outputs
{

    [OutputType]
    public sealed class ClusterNodeGroupAckConfigVolume
    {
        /// <summary>
        /// The name of ack cluster job pod volume mounts.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The path of ack cluster job pod volume mounts.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// The ack cluster job pod volumes type.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ClusterNodeGroupAckConfigVolume(
            string name,

            string path,

            string type)
        {
            Name = name;
            Path = path;
            Type = type;
        }
    }
}