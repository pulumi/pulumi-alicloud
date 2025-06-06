// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class KubernetesRuntimeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the runtime. Supported runtimes can be queried by data source alicloud_cs_kubernetes_version.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        [Input("version")]
        public Input<string>? Version { get; set; }

        public KubernetesRuntimeArgs()
        {
        }
        public static new KubernetesRuntimeArgs Empty => new KubernetesRuntimeArgs();
    }
}
