// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cddc.Outputs
{

    [OutputType]
    public sealed class GetDedicatedHostAccountsAccountResult
    {
        /// <summary>
        /// The name of the Dedicated host account.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// The ID of the Dedicated host.
        /// </summary>
        public readonly string DedicatedHostId;
        /// <summary>
        /// The ID of the Dedicated Host Account. The value formats as `&lt;dedicated_host_id&gt;:&lt;account_name&gt;`.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetDedicatedHostAccountsAccountResult(
            string accountName,

            string dedicatedHostId,

            string id)
        {
            AccountName = accountName;
            DedicatedHostId = dedicatedHostId;
            Id = id;
        }
    }
}
