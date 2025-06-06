// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso.Outputs
{

    [OutputType]
    public sealed class GetUsersUserMfaDeviceResult
    {
        /// <summary>
        /// The MFA Device ID.
        /// </summary>
        public readonly string DeviceId;
        /// <summary>
        /// The MFA Device Name.
        /// </summary>
        public readonly string DeviceName;
        /// <summary>
        /// The MFA Device Type.
        /// </summary>
        public readonly string DeviceType;
        /// <summary>
        /// The Effective Time of MFA Device.
        /// </summary>
        public readonly string EffectiveTime;

        [OutputConstructor]
        private GetUsersUserMfaDeviceResult(
            string deviceId,

            string deviceName,

            string deviceType,

            string effectiveTime)
        {
            DeviceId = deviceId;
            DeviceName = deviceName;
            DeviceType = deviceType;
            EffectiveTime = effectiveTime;
        }
    }
}
