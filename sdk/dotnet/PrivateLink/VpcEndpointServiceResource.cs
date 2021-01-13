// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PrivateLink
{
    /// <summary>
    /// Provides a Private Link Vpc Endpoint Service Resource resource.
    /// 
    /// For information about Private Link Vpc Endpoint Service Resource and how to use it, see [What is Vpc Endpoint Service Resource](https://help.aliyun.com/document_detail/183548.html).
    /// 
    /// &gt; **NOTE:** Available in v1.110.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new AliCloud.PrivateLink.VpcEndpointServiceResource("example", new AliCloud.PrivateLink.VpcEndpointServiceResourceArgs
    ///         {
    ///             ResourceId = "lb-gw8nuym5xxxxx",
    ///             ResourceType = "slb",
    ///             ServiceId = "epsrv-gw8ii1xxxx",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Private Link Vpc Endpoint Service Resource can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource example &lt;service_id&gt;:&lt;resource_id&gt;
    /// ```
    /// </summary>
    public partial class VpcEndpointServiceResource : Pulumi.CustomResource
    {
        /// <summary>
        /// The dry run.
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The ID of Resource.
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;

        /// <summary>
        /// The Type of Resource.
        /// </summary>
        [Output("resourceType")]
        public Output<string> ResourceType { get; private set; } = null!;

        /// <summary>
        /// The ID of Vpc Endpoint Service.
        /// </summary>
        [Output("serviceId")]
        public Output<string> ServiceId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcEndpointServiceResource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcEndpointServiceResource(string name, VpcEndpointServiceResourceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource", name, args ?? new VpcEndpointServiceResourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcEndpointServiceResource(string name, Input<string> id, VpcEndpointServiceResourceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcEndpointServiceResource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcEndpointServiceResource Get(string name, Input<string> id, VpcEndpointServiceResourceState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcEndpointServiceResource(name, id, state, options);
        }
    }

    public sealed class VpcEndpointServiceResourceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of Resource.
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        /// <summary>
        /// The Type of Resource.
        /// </summary>
        [Input("resourceType", required: true)]
        public Input<string> ResourceType { get; set; } = null!;

        /// <summary>
        /// The ID of Vpc Endpoint Service.
        /// </summary>
        [Input("serviceId", required: true)]
        public Input<string> ServiceId { get; set; } = null!;

        public VpcEndpointServiceResourceArgs()
        {
        }
    }

    public sealed class VpcEndpointServiceResourceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of Resource.
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// The Type of Resource.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// The ID of Vpc Endpoint Service.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        public VpcEndpointServiceResourceState()
        {
        }
    }
}