// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DataWorks.Inputs
{

    public sealed class ProjectMemberRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Project Role Code.
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// project role name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// project role type
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ProjectMemberRoleArgs()
        {
        }
        public static new ProjectMemberRoleArgs Empty => new ProjectMemberRoleArgs();
    }
}
