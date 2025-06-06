// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas
{
    /// <summary>
    /// Provides a NAS Access Rule resource.
    /// 
    /// For information about NAS Access Rule and how to use it, see [What is Access Rule](https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createaccessrule).
    /// 
    /// &gt; **NOTE:** Available since v1.34.0.
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
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var defaultAccessGroup = new AliCloud.Nas.AccessGroup("default", new()
    ///     {
    ///         AccessGroupType = "Vpc",
    ///         Description = "ExtremeAccessGroup",
    ///         AccessGroupName = $"terraform-example-{@default.Result}",
    ///         FileSystemType = "extreme",
    ///     });
    /// 
    ///     var defaultAccessRule = new AliCloud.Nas.AccessRule("default", new()
    ///     {
    ///         AccessGroupName = defaultAccessGroup.AccessGroupName,
    ///         RwAccessType = "RDONLY",
    ///         Ipv6SourceCidrIp = "::1",
    ///         UserAccessType = "no_squash",
    ///         Priority = 1,
    ///         FileSystemType = "extreme",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// NAS Access Rule can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:nas/accessRule:AccessRule example &lt;access_group_name&gt;:&lt;file_system_type&gt;:&lt;access_rule_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:nas/accessRule:AccessRule")]
    public partial class AccessRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// AccessGroupName.
        /// </summary>
        [Output("accessGroupName")]
        public Output<string> AccessGroupName { get; private set; } = null!;

        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Output("accessRuleId")]
        public Output<string> AccessRuleId { get; private set; } = null!;

        /// <summary>
        /// filesystem type. include standard, extreme.
        /// </summary>
        [Output("fileSystemType")]
        public Output<string> FileSystemType { get; private set; } = null!;

        /// <summary>
        /// Ipv6SourceCidrIp.
        /// </summary>
        [Output("ipv6SourceCidrIp")]
        public Output<string?> Ipv6SourceCidrIp { get; private set; } = null!;

        /// <summary>
        /// Priority.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// RWAccess.
        /// </summary>
        [Output("rwAccessType")]
        public Output<string> RwAccessType { get; private set; } = null!;

        /// <summary>
        /// SourceCidrIp.
        /// </summary>
        [Output("sourceCidrIp")]
        public Output<string?> SourceCidrIp { get; private set; } = null!;

        /// <summary>
        /// UserAccess.
        /// </summary>
        [Output("userAccessType")]
        public Output<string> UserAccessType { get; private set; } = null!;


        /// <summary>
        /// Create a AccessRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessRule(string name, AccessRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:nas/accessRule:AccessRule", name, args ?? new AccessRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessRule(string name, Input<string> id, AccessRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:nas/accessRule:AccessRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessRule Get(string name, Input<string> id, AccessRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessRule(name, id, state, options);
        }
    }

    public sealed class AccessRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AccessGroupName.
        /// </summary>
        [Input("accessGroupName", required: true)]
        public Input<string> AccessGroupName { get; set; } = null!;

        /// <summary>
        /// filesystem type. include standard, extreme.
        /// </summary>
        [Input("fileSystemType")]
        public Input<string>? FileSystemType { get; set; }

        /// <summary>
        /// Ipv6SourceCidrIp.
        /// </summary>
        [Input("ipv6SourceCidrIp")]
        public Input<string>? Ipv6SourceCidrIp { get; set; }

        /// <summary>
        /// Priority.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// RWAccess.
        /// </summary>
        [Input("rwAccessType")]
        public Input<string>? RwAccessType { get; set; }

        /// <summary>
        /// SourceCidrIp.
        /// </summary>
        [Input("sourceCidrIp")]
        public Input<string>? SourceCidrIp { get; set; }

        /// <summary>
        /// UserAccess.
        /// </summary>
        [Input("userAccessType")]
        public Input<string>? UserAccessType { get; set; }

        public AccessRuleArgs()
        {
        }
        public static new AccessRuleArgs Empty => new AccessRuleArgs();
    }

    public sealed class AccessRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AccessGroupName.
        /// </summary>
        [Input("accessGroupName")]
        public Input<string>? AccessGroupName { get; set; }

        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Input("accessRuleId")]
        public Input<string>? AccessRuleId { get; set; }

        /// <summary>
        /// filesystem type. include standard, extreme.
        /// </summary>
        [Input("fileSystemType")]
        public Input<string>? FileSystemType { get; set; }

        /// <summary>
        /// Ipv6SourceCidrIp.
        /// </summary>
        [Input("ipv6SourceCidrIp")]
        public Input<string>? Ipv6SourceCidrIp { get; set; }

        /// <summary>
        /// Priority.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// RWAccess.
        /// </summary>
        [Input("rwAccessType")]
        public Input<string>? RwAccessType { get; set; }

        /// <summary>
        /// SourceCidrIp.
        /// </summary>
        [Input("sourceCidrIp")]
        public Input<string>? SourceCidrIp { get; set; }

        /// <summary>
        /// UserAccess.
        /// </summary>
        [Input("userAccessType")]
        public Input<string>? UserAccessType { get; set; }

        public AccessRuleState()
        {
        }
        public static new AccessRuleState Empty => new AccessRuleState();
    }
}
