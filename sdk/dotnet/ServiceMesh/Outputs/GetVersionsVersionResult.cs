// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Outputs
{

    [OutputType]
    public sealed class GetVersionsVersionResult
    {
        /// <summary>
        /// The edition of the ASM instance.
        /// </summary>
        public readonly string Edition;
        /// <summary>
        /// The ASM version id. It formats as `&lt;edition&gt;:&lt;version&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The AMS version.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetVersionsVersionResult(
            string edition,

            string id,

            string version)
        {
            Edition = edition;
            Id = id;
            Version = version;
        }
    }
}