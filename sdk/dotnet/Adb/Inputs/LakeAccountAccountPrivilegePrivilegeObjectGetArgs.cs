// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Adb.Inputs
{

    public sealed class LakeAccountAccountPrivilegePrivilegeObjectGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of column.
        /// </summary>
        [Input("column")]
        public Input<string>? Column { get; set; }

        /// <summary>
        /// The name of database.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// The name of table.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        public LakeAccountAccountPrivilegePrivilegeObjectGetArgs()
        {
        }
        public static new LakeAccountAccountPrivilegePrivilegeObjectGetArgs Empty => new LakeAccountAccountPrivilegePrivilegeObjectGetArgs();
    }
}