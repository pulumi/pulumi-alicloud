// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.BastionHost
{
    /// <summary>
    /// Provides a Bastion Host User Group resource.
    /// 
    /// For information about Bastion Host User Group and how to use it, see [What is User Group](https://www.alibabacloud.com/help/doc-detail/204596.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.132.0.
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
    ///     var name = config.Get("name") ?? "tf_example";
    ///     var @default = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultGetNetworks = AliCloud.Vpc.GetNetworks.Invoke(new()
    ///     {
    ///         NameRegex = "^default-NODELETING$",
    ///         CidrBlock = "10.4.0.0/16",
    ///     });
    /// 
    ///     var defaultGetSwitches = AliCloud.Vpc.GetSwitches.Invoke(new()
    ///     {
    ///         CidrBlock = "10.4.0.0/24",
    ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
    ///         ZoneId = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
    ///     {
    ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
    ///     });
    /// 
    ///     var defaultInstance = new AliCloud.BastionHost.Instance("default", new()
    ///     {
    ///         Description = name,
    ///         LicenseCode = "bhah_ent_50_asset",
    ///         PlanCode = "cloudbastion",
    ///         Storage = "5",
    ///         Bandwidth = "5",
    ///         Period = 1,
    ///         VswitchId = defaultGetSwitches.Apply(getSwitchesResult =&gt; getSwitchesResult.Ids[0]),
    ///         SecurityGroupIds = new[]
    ///         {
    ///             defaultSecurityGroup.Id,
    ///         },
    ///     });
    /// 
    ///     var defaultUserGroup = new AliCloud.BastionHost.UserGroup("default", new()
    ///     {
    ///         InstanceId = defaultInstance.Id,
    ///         UserGroupName = name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Bastion Host User Group can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:bastionhost/userGroup:UserGroup example &lt;instance_id&gt;:&lt;user_group_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:bastionhost/userGroup:UserGroup")]
    public partial class UserGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specify the New Group of Remark Information. Supports up to 500 Characters.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Specify the New Group of the Bastion Host of Instance Id.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The User Group self ID.
        /// </summary>
        [Output("userGroupId")]
        public Output<string> UserGroupId { get; private set; } = null!;

        /// <summary>
        /// Specify the New Group Name. Supports up to 128 Characters.
        /// </summary>
        [Output("userGroupName")]
        public Output<string> UserGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a UserGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserGroup(string name, UserGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:bastionhost/userGroup:UserGroup", name, args ?? new UserGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserGroup(string name, Input<string> id, UserGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:bastionhost/userGroup:UserGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserGroup Get(string name, Input<string> id, UserGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new UserGroup(name, id, state, options);
        }
    }

    public sealed class UserGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the New Group of Remark Information. Supports up to 500 Characters.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specify the New Group of the Bastion Host of Instance Id.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Specify the New Group Name. Supports up to 128 Characters.
        /// </summary>
        [Input("userGroupName", required: true)]
        public Input<string> UserGroupName { get; set; } = null!;

        public UserGroupArgs()
        {
        }
        public static new UserGroupArgs Empty => new UserGroupArgs();
    }

    public sealed class UserGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the New Group of Remark Information. Supports up to 500 Characters.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specify the New Group of the Bastion Host of Instance Id.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The User Group self ID.
        /// </summary>
        [Input("userGroupId")]
        public Input<string>? UserGroupId { get; set; }

        /// <summary>
        /// Specify the New Group Name. Supports up to 128 Characters.
        /// </summary>
        [Input("userGroupName")]
        public Input<string>? UserGroupName { get; set; }

        public UserGroupState()
        {
        }
        public static new UserGroupState Empty => new UserGroupState();
    }
}
