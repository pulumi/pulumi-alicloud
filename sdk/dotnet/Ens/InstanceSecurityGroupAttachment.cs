// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ens
{
    /// <summary>
    /// Provides a ENS Instance Security Group Attachment resource. Unbind instance and security group.
    /// 
    /// For information about ENS Instance Security Group Attachment and how to use it, see [What is Instance Security Group Attachment](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.216.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new AliCloud.Ens.Instance("default", new()
    ///     {
    ///         SystemDisk = new AliCloud.Ens.Inputs.InstanceSystemDiskArgs
    ///         {
    ///             Size = 20,
    ///         },
    ///         ScheduleAreaLevel = "Region",
    ///         ImageId = "centos_6_08_64_20G_alibase_20171208",
    ///         PaymentType = "Subscription",
    ///         InstanceType = "ens.sn1.stiny",
    ///         Password = "12345678ABCabc",
    ///         Amount = 1,
    ///         Period = 1,
    ///         InternetMaxBandwidthOut = 10,
    ///         PublicIpIdentification = true,
    ///         EnsRegionId = "cn-chenzhou-telecom_unicom_cmcc",
    ///         PeriodUnit = "Month",
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ens.SecurityGroup("default", new()
    ///     {
    ///         Description = "InstanceSecurityGroupAttachment_Description",
    ///         SecurityGroupName = name,
    ///     });
    /// 
    ///     var defaultInstanceSecurityGroupAttachment = new AliCloud.Ens.InstanceSecurityGroupAttachment("default", new()
    ///     {
    ///         InstanceId = @default.Id,
    ///         SecurityGroupId = defaultSecurityGroup.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ENS Instance Security Group Attachment can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ens/instanceSecurityGroupAttachment:InstanceSecurityGroupAttachment example &lt;instance_id&gt;:&lt;security_group_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ens/instanceSecurityGroupAttachment:InstanceSecurityGroupAttachment")]
    public partial class InstanceSecurityGroupAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Instance ID.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Security group ID.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceSecurityGroupAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceSecurityGroupAttachment(string name, InstanceSecurityGroupAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ens/instanceSecurityGroupAttachment:InstanceSecurityGroupAttachment", name, args ?? new InstanceSecurityGroupAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceSecurityGroupAttachment(string name, Input<string> id, InstanceSecurityGroupAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ens/instanceSecurityGroupAttachment:InstanceSecurityGroupAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceSecurityGroupAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceSecurityGroupAttachment Get(string name, Input<string> id, InstanceSecurityGroupAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceSecurityGroupAttachment(name, id, state, options);
        }
    }

    public sealed class InstanceSecurityGroupAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Instance ID.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Security group ID.
        /// </summary>
        [Input("securityGroupId", required: true)]
        public Input<string> SecurityGroupId { get; set; } = null!;

        public InstanceSecurityGroupAttachmentArgs()
        {
        }
        public static new InstanceSecurityGroupAttachmentArgs Empty => new InstanceSecurityGroupAttachmentArgs();
    }

    public sealed class InstanceSecurityGroupAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Instance ID.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Security group ID.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        public InstanceSecurityGroupAttachmentState()
        {
        }
        public static new InstanceSecurityGroupAttachmentState Empty => new InstanceSecurityGroupAttachmentState();
    }
}