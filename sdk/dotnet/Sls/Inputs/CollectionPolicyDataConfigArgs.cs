// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sls.Inputs
{

    public sealed class CollectionPolicyDataConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Valid only when the log type is global. For example, if the productCode is sls, the log is collected to the default dedicated Project of the account in a specific dataRegion.
        /// </summary>
        [Input("dataProject")]
        public Input<string>? DataProject { get; set; }

        /// <summary>
        /// If and only if the log type is global log type, for example, if productCode is sls, global logs will be collected to the corresponding region during the first configuration.
        /// </summary>
        [Input("dataRegion")]
        public Input<string>? DataRegion { get; set; }

        public CollectionPolicyDataConfigArgs()
        {
        }
        public static new CollectionPolicyDataConfigArgs Empty => new CollectionPolicyDataConfigArgs();
    }
}
