// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Quotas
{
    /// <summary>
    /// ## Import
    /// 
    /// Quotas Template Service can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:quotas/templateService:TemplateService example 
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:quotas/templateService:TemplateService")]
    public partial class TemplateService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Status of the quota template. Valid values:
        /// - `-1`: disabled.
        /// </summary>
        [Output("serviceStatus")]
        public Output<int> ServiceStatus { get; private set; } = null!;


        /// <summary>
        /// Create a TemplateService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TemplateService(string name, TemplateServiceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:quotas/templateService:TemplateService", name, args ?? new TemplateServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TemplateService(string name, Input<string> id, TemplateServiceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:quotas/templateService:TemplateService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TemplateService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TemplateService Get(string name, Input<string> id, TemplateServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new TemplateService(name, id, state, options);
        }
    }

    public sealed class TemplateServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Status of the quota template. Valid values:
        /// - `-1`: disabled.
        /// </summary>
        [Input("serviceStatus", required: true)]
        public Input<int> ServiceStatus { get; set; } = null!;

        public TemplateServiceArgs()
        {
        }
        public static new TemplateServiceArgs Empty => new TemplateServiceArgs();
    }

    public sealed class TemplateServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Status of the quota template. Valid values:
        /// - `-1`: disabled.
        /// </summary>
        [Input("serviceStatus")]
        public Input<int>? ServiceStatus { get; set; }

        public TemplateServiceState()
        {
        }
        public static new TemplateServiceState Empty => new TemplateServiceState();
    }
}
