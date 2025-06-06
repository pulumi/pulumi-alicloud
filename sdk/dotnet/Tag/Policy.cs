// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Tag
{
    /// <summary>
    /// Provides a TAG Policy resource.
    /// 
    /// For information about TAG Policy and how to use it, see [What is Policy](https://www.alibabacloud.com/help/en/resource-management/latest/create-policy).
    /// 
    /// &gt; **NOTE:** Available since v1.203.0.
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
    ///     var example = new AliCloud.Tag.Policy("example", new()
    ///     {
    ///         PolicyName = name,
    ///         PolicyDesc = name,
    ///         UserType = "USER",
    ///         PolicyContent = @"		{""tags"":{""CostCenter"":{""tag_value"":{""@@assign"":[""Beijing"",""Shanghai""]},""tag_key"":{""@@assign"":""CostCenter""}}}}
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// TAG Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:tag/policy:Policy example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:tag/policy:Policy")]
    public partial class Policy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The document of the tag policy.
        /// </summary>
        [Output("policyContent")]
        public Output<string> PolicyContent { get; private set; } = null!;

        /// <summary>
        /// The description of the policy. The description must be 1 to 512 characters in length.
        /// </summary>
        [Output("policyDesc")]
        public Output<string?> PolicyDesc { get; private set; } = null!;

        /// <summary>
        /// The name of the tag policy. The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (_).
        /// </summary>
        [Output("policyName")]
        public Output<string> PolicyName { get; private set; } = null!;

        /// <summary>
        /// The mode of the Tag Policy feature. Valid values: `USER`, `RD`.
        /// </summary>
        [Output("userType")]
        public Output<string> UserType { get; private set; } = null!;


        /// <summary>
        /// Create a Policy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Policy(string name, PolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:tag/policy:Policy", name, args ?? new PolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Policy(string name, Input<string> id, PolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:tag/policy:Policy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Policy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Policy Get(string name, Input<string> id, PolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new Policy(name, id, state, options);
        }
    }

    public sealed class PolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The document of the tag policy.
        /// </summary>
        [Input("policyContent", required: true)]
        public Input<string> PolicyContent { get; set; } = null!;

        /// <summary>
        /// The description of the policy. The description must be 1 to 512 characters in length.
        /// </summary>
        [Input("policyDesc")]
        public Input<string>? PolicyDesc { get; set; }

        /// <summary>
        /// The name of the tag policy. The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (_).
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        /// <summary>
        /// The mode of the Tag Policy feature. Valid values: `USER`, `RD`.
        /// </summary>
        [Input("userType")]
        public Input<string>? UserType { get; set; }

        public PolicyArgs()
        {
        }
        public static new PolicyArgs Empty => new PolicyArgs();
    }

    public sealed class PolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The document of the tag policy.
        /// </summary>
        [Input("policyContent")]
        public Input<string>? PolicyContent { get; set; }

        /// <summary>
        /// The description of the policy. The description must be 1 to 512 characters in length.
        /// </summary>
        [Input("policyDesc")]
        public Input<string>? PolicyDesc { get; set; }

        /// <summary>
        /// The name of the tag policy. The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (_).
        /// </summary>
        [Input("policyName")]
        public Input<string>? PolicyName { get; set; }

        /// <summary>
        /// The mode of the Tag Policy feature. Valid values: `USER`, `RD`.
        /// </summary>
        [Input("userType")]
        public Input<string>? UserType { get; set; }

        public PolicyState()
        {
        }
        public static new PolicyState Empty => new PolicyState();
    }
}
