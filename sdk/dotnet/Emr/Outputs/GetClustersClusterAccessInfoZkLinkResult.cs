// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr.Outputs
{

    [OutputType]
    public sealed class GetClustersClusterAccessInfoZkLinkResult
    {
        public readonly string Link;
        public readonly string Port;

        [OutputConstructor]
        private GetClustersClusterAccessInfoZkLinkResult(
            string link,

            string port)
        {
            Link = link;
            Port = port;
        }
    }
}