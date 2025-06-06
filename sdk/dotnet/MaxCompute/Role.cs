// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MaxCompute
{
    /// <summary>
    /// Provides a Max Compute Role resource.
    /// 
    /// For information about Max Compute Role and how to use it, see [What is Role](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.242.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new AliCloud.MaxCompute.Project("default", new()
    ///     {
    ///         DefaultQuota = "默认后付费Quota",
    ///         ProjectName = name,
    ///         Comment = name,
    ///         ProductType = "PayAsYouGo",
    ///     });
    /// 
    ///     var defaultRole = new AliCloud.MaxCompute.Role("default", new()
    ///     {
    ///         Type = "admin",
    ///         ProjectName = @default.Id,
    ///         Policy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Action"] = new[]
    ///                     {
    ///                         "odps:*",
    ///                     },
    ///                     ["Effect"] = "Allow",
    ///                     ["Resource"] = new[]
    ///                     {
    ///                         "acs:odps:*:projects/project_name/authorization/roles",
    ///                         "acs:odps:*:projects/project_name/authorization/roles/*/*",
    ///                     },
    ///                 },
    ///             },
    ///             ["Version"] = "1",
    ///         }),
    ///         RoleName = "tf_example112",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Max Compute Role can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:maxcompute/role:Role example &lt;project_name&gt;:&lt;role_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:maxcompute/role:Role")]
    public partial class Role : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Policy Authorization
        /// Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        /// </summary>
        [Output("policy")]
        public Output<string?> Policy { get; private set; } = null!;

        /// <summary>
        /// Project name
        /// </summary>
        [Output("projectName")]
        public Output<string> ProjectName { get; private set; } = null!;

        /// <summary>
        /// Role Name
        /// 
        /// &gt; **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        /// </summary>
        [Output("roleName")]
        public Output<string> RoleName { get; private set; } = null!;

        /// <summary>
        /// Role type Valid values: admin/resource
        /// 
        /// &gt; **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Role resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Role(string name, RoleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:maxcompute/role:Role", name, args ?? new RoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Role(string name, Input<string> id, RoleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:maxcompute/role:Role", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Role resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Role Get(string name, Input<string> id, RoleState? state = null, CustomResourceOptions? options = null)
        {
            return new Role(name, id, state, options);
        }
    }

    public sealed class RoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Policy Authorization
        /// Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Project name
        /// </summary>
        [Input("projectName", required: true)]
        public Input<string> ProjectName { get; set; } = null!;

        /// <summary>
        /// Role Name
        /// 
        /// &gt; **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        /// <summary>
        /// Role type Valid values: admin/resource
        /// 
        /// &gt; **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RoleArgs()
        {
        }
        public static new RoleArgs Empty => new RoleArgs();
    }

    public sealed class RoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Policy Authorization
        /// Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Project name
        /// </summary>
        [Input("projectName")]
        public Input<string>? ProjectName { get; set; }

        /// <summary>
        /// Role Name
        /// 
        /// &gt; **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        /// <summary>
        /// Role type Valid values: admin/resource
        /// 
        /// &gt; **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public RoleState()
        {
        }
        public static new RoleState Empty => new RoleState();
    }
}
