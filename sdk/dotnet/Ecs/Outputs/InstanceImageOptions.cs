// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class InstanceImageOptions
    {
        /// <summary>
        /// Whether to allow the instance logging in with the ecs-user user.
        /// </summary>
        public readonly bool? LoginAsNonRoot;

        [OutputConstructor]
        private InstanceImageOptions(bool? loginAsNonRoot)
        {
            LoginAsNonRoot = loginAsNonRoot;
        }
    }
}