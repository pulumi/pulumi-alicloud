// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Outputs
{

    [OutputType]
    public sealed class IngressDefaultRule
    {
        /// <summary>
        /// Target application ID.
        /// </summary>
        public readonly string? AppId;
        /// <summary>
        /// Target application name.
        /// </summary>
        public readonly string? AppName;
        /// <summary>
        /// Application backend port.
        /// </summary>
        public readonly int? ContainerPort;

        [OutputConstructor]
        private IngressDefaultRule(
            string? appId,

            string? appName,

            int? containerPort)
        {
            AppId = appId;
            AppName = appName;
            ContainerPort = containerPort;
        }
    }
}