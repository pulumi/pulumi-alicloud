// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class GetCollationTimeZonesCollationTimeZoneResult
    {
        /// <summary>
        /// The code of the instance type.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The offset of the UTC time. The offset is in the following format: (UTC+&lt;i&gt;HH:mm&lt;/i&gt;).
        /// </summary>
        public readonly string? StandardTimeOffset;
        /// <summary>
        /// The time zone that is available for use in ApsaraDB RDS.
        /// </summary>
        public readonly string? TimeZone;

        [OutputConstructor]
        private GetCollationTimeZonesCollationTimeZoneResult(
            string? description,

            string? standardTimeOffset,

            string? timeZone)
        {
            Description = description;
            StandardTimeOffset = standardTimeOffset;
            TimeZone = timeZone;
        }
    }
}