// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Yundun
{
    /// <summary>
    /// ## Import
    /// 
    /// Yundun_dbaudit instance can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:yundun/dBAuditInstance:DBAuditInstance example dbaudit-exampe123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:yundun/dBAuditInstance:DBAuditInstance")]
    public partial class DBAuditInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Duration for initially producing the instance. Valid values: [1~9], 12, 24, 36. At present, the provider does not support modify "period".
        /// &gt; **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
        /// </summary>
        [Output("period")]
        public Output<int> Period { get; private set; } = null!;

        /// <summary>
        /// Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
        /// </summary>
        [Output("planCode")]
        public Output<string> PlanCode { get; private set; } = null!;

        /// <summary>
        /// The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// vSwtich ID configured to audit
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a DBAuditInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DBAuditInstance(string name, DBAuditInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:yundun/dBAuditInstance:DBAuditInstance", name, args ?? new DBAuditInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DBAuditInstance(string name, Input<string> id, DBAuditInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:yundun/dBAuditInstance:DBAuditInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DBAuditInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DBAuditInstance Get(string name, Input<string> id, DBAuditInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new DBAuditInstance(name, id, state, options);
        }
    }

    public sealed class DBAuditInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Duration for initially producing the instance. Valid values: [1~9], 12, 24, 36. At present, the provider does not support modify "period".
        /// &gt; **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
        /// </summary>
        [Input("period", required: true)]
        public Input<int> Period { get; set; } = null!;

        /// <summary>
        /// Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
        /// </summary>
        [Input("planCode", required: true)]
        public Input<string> PlanCode { get; set; } = null!;

        /// <summary>
        /// The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// vSwtich ID configured to audit
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        public DBAuditInstanceArgs()
        {
        }
        public static new DBAuditInstanceArgs Empty => new DBAuditInstanceArgs();
    }

    public sealed class DBAuditInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Duration for initially producing the instance. Valid values: [1~9], 12, 24, 36. At present, the provider does not support modify "period".
        /// &gt; **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
        /// </summary>
        [Input("planCode")]
        public Input<string>? PlanCode { get; set; }

        /// <summary>
        /// The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// vSwtich ID configured to audit
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public DBAuditInstanceState()
        {
        }
        public static new DBAuditInstanceState Empty => new DBAuditInstanceState();
    }
}
