// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class ServiceLogConfig
    {
        /// <summary>
        /// Enable instance level metrics.
        /// </summary>
        public readonly bool? EnableInstanceMetrics;
        /// <summary>
        /// Enable request level metrics.
        /// </summary>
        public readonly bool? EnableRequestMetrics;
        /// <summary>
        /// The log store name of Alicloud Simple Log Service.
        /// </summary>
        public readonly string Logstore;
        /// <summary>
        /// The project name of the Alicloud Simple Log Service.
        /// </summary>
        public readonly string Project;

        [OutputConstructor]
        private ServiceLogConfig(
            bool? enableInstanceMetrics,

            bool? enableRequestMetrics,

            string logstore,

            string project)
        {
            EnableInstanceMetrics = enableInstanceMetrics;
            EnableRequestMetrics = enableRequestMetrics;
            Logstore = logstore;
            Project = project;
        }
    }
}
