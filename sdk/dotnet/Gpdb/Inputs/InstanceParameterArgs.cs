// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb.Inputs
{

    public sealed class InstanceParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Available since v1.231.0) The default value of the parameter.
        /// </summary>
        [Input("defaultValue")]
        public Input<string>? DefaultValue { get; set; }

        /// <summary>
        /// (Available since v1.231.0) Whether to force restart the instance to config the parameter.
        /// </summary>
        [Input("forceRestartInstance")]
        public Input<string>? ForceRestartInstance { get; set; }

        /// <summary>
        /// (Available since v1.231.0) Whether the parameter is changeable.
        /// </summary>
        [Input("isChangeableConfig")]
        public Input<string>? IsChangeableConfig { get; set; }

        /// <summary>
        /// The name of the parameter.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// (Available since v1.231.0) The optional range of the parameter.
        /// </summary>
        [Input("optionalRange")]
        public Input<string>? OptionalRange { get; set; }

        /// <summary>
        /// (Available since v1.231.0) The description of the parameter.
        /// </summary>
        [Input("parameterDescription")]
        public Input<string>? ParameterDescription { get; set; }

        /// <summary>
        /// The value of the parameter.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public InstanceParameterArgs()
        {
        }
        public static new InstanceParameterArgs Empty => new InstanceParameterArgs();
    }
}
