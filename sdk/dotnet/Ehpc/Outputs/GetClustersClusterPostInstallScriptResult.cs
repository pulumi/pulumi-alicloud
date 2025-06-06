// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ehpc.Outputs
{

    [OutputType]
    public sealed class GetClustersClusterPostInstallScriptResult
    {
        /// <summary>
        /// The parameters of the script.
        /// </summary>
        public readonly string Args;
        /// <summary>
        /// The download path of the script.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetClustersClusterPostInstallScriptResult(
            string args,

            string url)
        {
            Args = args;
            Url = url;
        }
    }
}
