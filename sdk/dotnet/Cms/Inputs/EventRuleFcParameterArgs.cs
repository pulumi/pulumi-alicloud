// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class EventRuleFcParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Available since v1.211.1) The ARN of the API operation.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ID of the recipient that receives alert notifications.
        /// </summary>
        [Input("fcParametersId")]
        public Input<string>? FcParametersId { get; set; }

        /// <summary>
        /// The name of the function.
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// The region where Function Compute is deployed.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The name of the Function Compute service.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        public EventRuleFcParameterArgs()
        {
        }
        public static new EventRuleFcParameterArgs Empty => new EventRuleFcParameterArgs();
    }
}
