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
    public sealed class KubernetesRuntime
    {
        /// <summary>
        /// The name of the runtime. Supported runtimes can be queried by data source alicloud_cs_kubernetes_version.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The version of the runtime.
        /// 
        /// The following example is the definition of runtime block:
        /// 
        /// ```
        /// runtime = {
        /// name = "containerd"
        /// version = "1.6.28"
        /// }
        /// ```
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private KubernetesRuntime(
            string? name,

            string? version)
        {
            Name = name;
            Version = version;
        }
    }
}
