// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class ListenerQuicConfig
    {
        /// <summary>
        /// There Is a Need to Correlate the QuIC Listener ID. The Https Listener, in Effect at the Time. quicupgradeenabled True When Required.
        /// </summary>
        public readonly string? QuicListenerId;
        /// <summary>
        /// Indicates Whether to Enable the QuIC Upgrade.
        /// 
        /// &gt; **NOTE:** The attribute is valid when the attribute `ListenerProtocol` is `HTTPS`.
        /// </summary>
        public readonly bool? QuicUpgradeEnabled;

        [OutputConstructor]
        private ListenerQuicConfig(
            string? quicListenerId,

            bool? quicUpgradeEnabled)
        {
            QuicListenerId = quicListenerId;
            QuicUpgradeEnabled = quicUpgradeEnabled;
        }
    }
}