// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    /// <summary>
    /// Provides a Alidns Domain Group resource. For information about Alidns Domain Group and how to use it, see [What is Resource Alidns Domain Group](https://www.alibabacloud.com/help/en/doc-detail/29762.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.84.0.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new AliCloud.Dns.DomainGroup("default", new()
    ///     {
    ///         DomainGroupName = "tf-example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Alidns domain group can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:dns/domainGroup:DomainGroup example 0932eb3ddee7499085c4d13d45*****
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dns/domainGroup:DomainGroup")]
    public partial class DomainGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        /// </summary>
        [Output("domainGroupName")]
        public Output<string> DomainGroupName { get; private set; } = null!;

        /// <summary>
        /// The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        /// </summary>
        [Output("groupName")]
        public Output<string> GroupName { get; private set; } = null!;

        /// <summary>
        /// User language.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;


        /// <summary>
        /// Create a DomainGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DomainGroup(string name, DomainGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:dns/domainGroup:DomainGroup", name, args ?? new DomainGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DomainGroup(string name, Input<string> id, DomainGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dns/domainGroup:DomainGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DomainGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DomainGroup Get(string name, Input<string> id, DomainGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new DomainGroup(name, id, state, options);
        }
    }

    public sealed class DomainGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        /// </summary>
        [Input("domainGroupName")]
        public Input<string>? DomainGroupName { get; set; }

        /// <summary>
        /// The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        /// <summary>
        /// User language.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        public DomainGroupArgs()
        {
        }
        public static new DomainGroupArgs Empty => new DomainGroupArgs();
    }

    public sealed class DomainGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        /// </summary>
        [Input("domainGroupName")]
        public Input<string>? DomainGroupName { get; set; }

        /// <summary>
        /// The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        /// <summary>
        /// User language.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        public DomainGroupState()
        {
        }
        public static new DomainGroupState Empty => new DomainGroupState();
    }
}
