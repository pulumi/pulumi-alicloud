// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    /// <summary>
    /// Provides a CEN Route Service resource. The virtual border routers (VBRs) and Cloud Connect Network (CCN) instances attached to Cloud Enterprise Network (CEN) instances can access the cloud services deployed in VPCs through the CEN instances.
    /// 
    /// For information about CEN Route Service and how to use it, see [What is Route Service](https://www.alibabacloud.com/help/en/doc-detail/106671.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.99.0+.
    /// 
    /// &gt; **NOTE:** Ensure that at least one VPC in the selected region is attached to the CEN instance.
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
    ///         var config = new Config();
    ///         var name = config.Get("name") ?? "tf-test";
    ///         var exampleNetworks = Output.Create(AliCloud.Vpc.GetNetworks.InvokeAsync(new AliCloud.Vpc.GetNetworksArgs
    ///         {
    ///             IsDefault = true,
    ///         }));
    ///         var exampleInstance = new AliCloud.Cen.Instance("exampleInstance", new AliCloud.Cen.InstanceArgs
    ///         {
    ///         });
    ///         var vpc = new AliCloud.Cen.InstanceAttachment("vpc", new AliCloud.Cen.InstanceAttachmentArgs
    ///         {
    ///             InstanceId = exampleInstance.Id,
    ///             ChildInstanceId = exampleNetworks.Apply(exampleNetworks =&gt; exampleNetworks.Vpcs[0].Id),
    ///             ChildInstanceType = "VPC",
    ///             ChildInstanceRegionId = exampleNetworks.Apply(exampleNetworks =&gt; exampleNetworks.Vpcs[0].RegionId),
    ///         });
    ///         var @this = new AliCloud.Cen.RouteService("this", new AliCloud.Cen.RouteServiceArgs
    ///         {
    ///             AccessRegionId = exampleNetworks.Apply(exampleNetworks =&gt; exampleNetworks.Vpcs[0].RegionId),
    ///             HostRegionId = exampleNetworks.Apply(exampleNetworks =&gt; exampleNetworks.Vpcs[0].RegionId),
    ///             HostVpcId = exampleNetworks.Apply(exampleNetworks =&gt; exampleNetworks.Vpcs[0].Id),
    ///             CenId = vpc.InstanceId,
    ///             Host = "100.118.28.52/32",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class RouteService : Pulumi.CustomResource
    {
        /// <summary>
        /// The region of the network instances that access the cloud services.
        /// </summary>
        [Output("accessRegionId")]
        public Output<string> AccessRegionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Output("cenId")]
        public Output<string> CenId { get; private set; } = null!;

        /// <summary>
        /// The description of the cloud service.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The domain name or IP address of the cloud service.
        /// </summary>
        [Output("host")]
        public Output<string> Host { get; private set; } = null!;

        /// <summary>
        /// The region of the cloud service.
        /// </summary>
        [Output("hostRegionId")]
        public Output<string> HostRegionId { get; private set; } = null!;

        /// <summary>
        /// The VPC associated with the cloud service.
        /// </summary>
        [Output("hostVpcId")]
        public Output<string> HostVpcId { get; private set; } = null!;

        /// <summary>
        /// The status of the cloud service.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a RouteService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouteService(string name, RouteServiceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/routeService:RouteService", name, args ?? new RouteServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouteService(string name, Input<string> id, RouteServiceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/routeService:RouteService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouteService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouteService Get(string name, Input<string> id, RouteServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new RouteService(name, id, state, options);
        }
    }

    public sealed class RouteServiceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The region of the network instances that access the cloud services.
        /// </summary>
        [Input("accessRegionId", required: true)]
        public Input<string> AccessRegionId { get; set; } = null!;

        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        /// <summary>
        /// The description of the cloud service.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The domain name or IP address of the cloud service.
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        /// <summary>
        /// The region of the cloud service.
        /// </summary>
        [Input("hostRegionId", required: true)]
        public Input<string> HostRegionId { get; set; } = null!;

        /// <summary>
        /// The VPC associated with the cloud service.
        /// </summary>
        [Input("hostVpcId", required: true)]
        public Input<string> HostVpcId { get; set; } = null!;

        public RouteServiceArgs()
        {
        }
    }

    public sealed class RouteServiceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The region of the network instances that access the cloud services.
        /// </summary>
        [Input("accessRegionId")]
        public Input<string>? AccessRegionId { get; set; }

        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// The description of the cloud service.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The domain name or IP address of the cloud service.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// The region of the cloud service.
        /// </summary>
        [Input("hostRegionId")]
        public Input<string>? HostRegionId { get; set; }

        /// <summary>
        /// The VPC associated with the cloud service.
        /// </summary>
        [Input("hostVpcId")]
        public Input<string>? HostVpcId { get; set; }

        /// <summary>
        /// The status of the cloud service.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public RouteServiceState()
        {
        }
    }
}