// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso
{
    /// <summary>
    /// Provides a Cloud SSO Access Configuration Provisioning resource.
    /// 
    /// For information about Cloud SSO Access Configuration Provisioning and how to use it, see [What is Access Configuration Provisioning](https://www.alibabacloud.com/help/en/cloudsso/latest/api-cloudsso-2021-05-15-addpermissionpolicytoaccessconfiguration).
    /// 
    /// &gt; **NOTE:** Available since v1.148.0.
    /// 
    /// ## Import
    /// 
    /// Cloud SSO Access Configuration Provisioning can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:cloudsso/accessConfigurationProvisioning:AccessConfigurationProvisioning example &lt;directory_id&gt;:&lt;access_configuration_id&gt;:&lt;target_type&gt;:&lt;target_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cloudsso/accessConfigurationProvisioning:AccessConfigurationProvisioning")]
    public partial class AccessConfigurationProvisioning : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Access configuration ID.
        /// </summary>
        [Output("accessConfigurationId")]
        public Output<string> AccessConfigurationId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Directory.
        /// </summary>
        [Output("directoryId")]
        public Output<string> DirectoryId { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `Provisioned`, `ReprovisionRequired` and `DeprovisionFailed`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the target to create the resource range.
        /// </summary>
        [Output("targetId")]
        public Output<string> TargetId { get; private set; } = null!;

        /// <summary>
        /// The type of the resource range target to be accessed. Valid values: `RD-Account`.
        /// </summary>
        [Output("targetType")]
        public Output<string> TargetType { get; private set; } = null!;


        /// <summary>
        /// Create a AccessConfigurationProvisioning resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessConfigurationProvisioning(string name, AccessConfigurationProvisioningArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cloudsso/accessConfigurationProvisioning:AccessConfigurationProvisioning", name, args ?? new AccessConfigurationProvisioningArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessConfigurationProvisioning(string name, Input<string> id, AccessConfigurationProvisioningState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cloudsso/accessConfigurationProvisioning:AccessConfigurationProvisioning", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AccessConfigurationProvisioning resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessConfigurationProvisioning Get(string name, Input<string> id, AccessConfigurationProvisioningState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessConfigurationProvisioning(name, id, state, options);
        }
    }

    public sealed class AccessConfigurationProvisioningArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Access configuration ID.
        /// </summary>
        [Input("accessConfigurationId", required: true)]
        public Input<string> AccessConfigurationId { get; set; } = null!;

        /// <summary>
        /// The ID of the Directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `Provisioned`, `ReprovisionRequired` and `DeprovisionFailed`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the target to create the resource range.
        /// </summary>
        [Input("targetId", required: true)]
        public Input<string> TargetId { get; set; } = null!;

        /// <summary>
        /// The type of the resource range target to be accessed. Valid values: `RD-Account`.
        /// </summary>
        [Input("targetType", required: true)]
        public Input<string> TargetType { get; set; } = null!;

        public AccessConfigurationProvisioningArgs()
        {
        }
        public static new AccessConfigurationProvisioningArgs Empty => new AccessConfigurationProvisioningArgs();
    }

    public sealed class AccessConfigurationProvisioningState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Access configuration ID.
        /// </summary>
        [Input("accessConfigurationId")]
        public Input<string>? AccessConfigurationId { get; set; }

        /// <summary>
        /// The ID of the Directory.
        /// </summary>
        [Input("directoryId")]
        public Input<string>? DirectoryId { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Provisioned`, `ReprovisionRequired` and `DeprovisionFailed`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the target to create the resource range.
        /// </summary>
        [Input("targetId")]
        public Input<string>? TargetId { get; set; }

        /// <summary>
        /// The type of the resource range target to be accessed. Valid values: `RD-Account`.
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        public AccessConfigurationProvisioningState()
        {
        }
        public static new AccessConfigurationProvisioningState Empty => new AccessConfigurationProvisioningState();
    }
}
