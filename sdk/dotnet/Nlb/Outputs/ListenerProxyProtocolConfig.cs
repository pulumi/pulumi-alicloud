// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nlb.Outputs
{

    [OutputType]
    public sealed class ListenerProxyProtocolConfig
    {
        /// <summary>
        /// Whether to enable carrying PrivateLinkEpId to backend servers through Proxy Protocol.
        /// </summary>
        public readonly bool? ProxyProtocolConfigPrivateLinkEpIdEnabled;
        /// <summary>
        /// Whether to enable carrying PrivateLinkEpsId to backend servers through the Proxy Protocol.
        /// </summary>
        public readonly bool? ProxyProtocolConfigPrivateLinkEpsIdEnabled;
        /// <summary>
        /// Whether to enable carrying VpcId to backend servers through Proxy Protocol.
        /// </summary>
        public readonly bool? ProxyProtocolConfigVpcIdEnabled;

        [OutputConstructor]
        private ListenerProxyProtocolConfig(
            bool? proxyProtocolConfigPrivateLinkEpIdEnabled,

            bool? proxyProtocolConfigPrivateLinkEpsIdEnabled,

            bool? proxyProtocolConfigVpcIdEnabled)
        {
            ProxyProtocolConfigPrivateLinkEpIdEnabled = proxyProtocolConfigPrivateLinkEpIdEnabled;
            ProxyProtocolConfigPrivateLinkEpsIdEnabled = proxyProtocolConfigPrivateLinkEpsIdEnabled;
            ProxyProtocolConfigVpcIdEnabled = proxyProtocolConfigVpcIdEnabled;
        }
    }
}
