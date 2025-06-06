// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sls.Outputs
{

    [OutputType]
    public sealed class CollectionPolicyDataConfig
    {
        /// <summary>
        /// Valid only when the log type is global. For example, if the productCode is sls, the log is collected to the default dedicated Project of the account in a specific dataRegion.
        /// </summary>
        public readonly string? DataProject;
        /// <summary>
        /// If and only if the log type is global log type, for example, if productCode is sls, global logs will be collected to the corresponding region during the first configuration.
        /// </summary>
        public readonly string? DataRegion;

        [OutputConstructor]
        private CollectionPolicyDataConfig(
            string? dataProject,

            string? dataRegion)
        {
            DataProject = dataProject;
            DataRegion = dataRegion;
        }
    }
}
