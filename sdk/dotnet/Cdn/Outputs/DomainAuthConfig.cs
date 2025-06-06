// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn.Outputs
{

    [OutputType]
    public sealed class DomainAuthConfig
    {
        public readonly string? AuthType;
        public readonly string? MasterKey;
        public readonly string? SlaveKey;
        public readonly int? Timeout;

        [OutputConstructor]
        private DomainAuthConfig(
            string? authType,

            string? masterKey,

            string? slaveKey,

            int? timeout)
        {
            AuthType = authType;
            MasterKey = masterKey;
            SlaveKey = slaveKey;
            Timeout = timeout;
        }
    }
}
