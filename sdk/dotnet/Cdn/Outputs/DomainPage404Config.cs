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
    public sealed class DomainPage404Config
    {
        public readonly string? CustomPageUrl;
        public readonly string? ErrorCode;
        public readonly string? PageType;

        [OutputConstructor]
        private DomainPage404Config(
            string? customPageUrl,

            string? errorCode,

            string? pageType)
        {
            CustomPageUrl = customPageUrl;
            ErrorCode = errorCode;
            PageType = pageType;
        }
    }
}
