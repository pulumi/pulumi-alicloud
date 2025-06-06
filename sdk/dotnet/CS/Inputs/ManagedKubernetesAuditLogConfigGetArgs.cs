// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class ManagedKubernetesAuditLogConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable audit logging. Valid values: `true`, `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The SLS project to which the Logstore storing the cluster audit logs belongs.
        /// </summary>
        [Input("slsProjectName")]
        public Input<string>? SlsProjectName { get; set; }

        public ManagedKubernetesAuditLogConfigGetArgs()
        {
        }
        public static new ManagedKubernetesAuditLogConfigGetArgs Empty => new ManagedKubernetesAuditLogConfigGetArgs();
    }
}
