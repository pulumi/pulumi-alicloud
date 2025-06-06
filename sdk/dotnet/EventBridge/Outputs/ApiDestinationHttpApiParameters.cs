// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge.Outputs
{

    [OutputType]
    public sealed class ApiDestinationHttpApiParameters
    {
        /// <summary>
        /// The endpoint of the API destination.
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// The HTTP request method. Valid values: `GET`, `POST`, `HEAD`, `DELETE`, `PUT`, `PATCH`.
        /// </summary>
        public readonly string Method;

        [OutputConstructor]
        private ApiDestinationHttpApiParameters(
            string endpoint,

            string method)
        {
            Endpoint = endpoint;
            Method = method;
        }
    }
}
