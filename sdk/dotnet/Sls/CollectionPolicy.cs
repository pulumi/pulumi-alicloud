// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sls
{
    /// <summary>
    /// Provides a SLS Collection Policy resource.
    /// 
    /// Orchestration policies for cloud product log collection.
    /// 
    /// For information about SLS Collection Policy and how to use it, see [What is Collection Policy](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.232.0.
    /// 
    /// ## Import
    /// 
    /// SLS Collection Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:sls/collectionPolicy:CollectionPolicy example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:sls/collectionPolicy:CollectionPolicy")]
    public partial class CollectionPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Centralized transfer configuration. See `centralize_config` below.
        /// </summary>
        [Output("centralizeConfig")]
        public Output<Outputs.CollectionPolicyCentralizeConfig> CentralizeConfig { get; private set; } = null!;

        /// <summary>
        /// Whether to enable centralized Conversion. The default value is false.
        /// </summary>
        [Output("centralizeEnabled")]
        public Output<bool?> CentralizeEnabled { get; private set; } = null!;

        /// <summary>
        /// Log type encoding.
        /// </summary>
        [Output("dataCode")]
        public Output<string> DataCode { get; private set; } = null!;

        /// <summary>
        /// The configuration is supported only when the log type is global. For example, if the productCode is sls, global logs will be collected to the corresponding region during the first configuration. See `data_config` below.
        /// </summary>
        [Output("dataConfig")]
        public Output<Outputs.CollectionPolicyDataConfig> DataConfig { get; private set; } = null!;

        /// <summary>
        /// Whether to open.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Collection rule configuration. See `policy_config` below.
        /// </summary>
        [Output("policyConfig")]
        public Output<Outputs.CollectionPolicyPolicyConfig> PolicyConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the rule, with a minimum of 3 characters and a maximum of 63 characters, must start with a letter.
        /// </summary>
        [Output("policyName")]
        public Output<string> PolicyName { get; private set; } = null!;

        /// <summary>
        /// Product code.
        /// </summary>
        [Output("productCode")]
        public Output<string> ProductCode { get; private set; } = null!;

        /// <summary>
        /// For Resource Directory configuration, the account must have opened the resource directory and be an administrator or a delegated administrator. See `resource_directory` below.
        /// </summary>
        [Output("resourceDirectory")]
        public Output<Outputs.CollectionPolicyResourceDirectory> ResourceDirectory { get; private set; } = null!;


        /// <summary>
        /// Create a CollectionPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CollectionPolicy(string name, CollectionPolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:sls/collectionPolicy:CollectionPolicy", name, args ?? new CollectionPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CollectionPolicy(string name, Input<string> id, CollectionPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:sls/collectionPolicy:CollectionPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CollectionPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CollectionPolicy Get(string name, Input<string> id, CollectionPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new CollectionPolicy(name, id, state, options);
        }
    }

    public sealed class CollectionPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Centralized transfer configuration. See `centralize_config` below.
        /// </summary>
        [Input("centralizeConfig")]
        public Input<Inputs.CollectionPolicyCentralizeConfigArgs>? CentralizeConfig { get; set; }

        /// <summary>
        /// Whether to enable centralized Conversion. The default value is false.
        /// </summary>
        [Input("centralizeEnabled")]
        public Input<bool>? CentralizeEnabled { get; set; }

        /// <summary>
        /// Log type encoding.
        /// </summary>
        [Input("dataCode", required: true)]
        public Input<string> DataCode { get; set; } = null!;

        /// <summary>
        /// The configuration is supported only when the log type is global. For example, if the productCode is sls, global logs will be collected to the corresponding region during the first configuration. See `data_config` below.
        /// </summary>
        [Input("dataConfig")]
        public Input<Inputs.CollectionPolicyDataConfigArgs>? DataConfig { get; set; }

        /// <summary>
        /// Whether to open.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Collection rule configuration. See `policy_config` below.
        /// </summary>
        [Input("policyConfig", required: true)]
        public Input<Inputs.CollectionPolicyPolicyConfigArgs> PolicyConfig { get; set; } = null!;

        /// <summary>
        /// The name of the rule, with a minimum of 3 characters and a maximum of 63 characters, must start with a letter.
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        /// <summary>
        /// Product code.
        /// </summary>
        [Input("productCode", required: true)]
        public Input<string> ProductCode { get; set; } = null!;

        /// <summary>
        /// For Resource Directory configuration, the account must have opened the resource directory and be an administrator or a delegated administrator. See `resource_directory` below.
        /// </summary>
        [Input("resourceDirectory")]
        public Input<Inputs.CollectionPolicyResourceDirectoryArgs>? ResourceDirectory { get; set; }

        public CollectionPolicyArgs()
        {
        }
        public static new CollectionPolicyArgs Empty => new CollectionPolicyArgs();
    }

    public sealed class CollectionPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Centralized transfer configuration. See `centralize_config` below.
        /// </summary>
        [Input("centralizeConfig")]
        public Input<Inputs.CollectionPolicyCentralizeConfigGetArgs>? CentralizeConfig { get; set; }

        /// <summary>
        /// Whether to enable centralized Conversion. The default value is false.
        /// </summary>
        [Input("centralizeEnabled")]
        public Input<bool>? CentralizeEnabled { get; set; }

        /// <summary>
        /// Log type encoding.
        /// </summary>
        [Input("dataCode")]
        public Input<string>? DataCode { get; set; }

        /// <summary>
        /// The configuration is supported only when the log type is global. For example, if the productCode is sls, global logs will be collected to the corresponding region during the first configuration. See `data_config` below.
        /// </summary>
        [Input("dataConfig")]
        public Input<Inputs.CollectionPolicyDataConfigGetArgs>? DataConfig { get; set; }

        /// <summary>
        /// Whether to open.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Collection rule configuration. See `policy_config` below.
        /// </summary>
        [Input("policyConfig")]
        public Input<Inputs.CollectionPolicyPolicyConfigGetArgs>? PolicyConfig { get; set; }

        /// <summary>
        /// The name of the rule, with a minimum of 3 characters and a maximum of 63 characters, must start with a letter.
        /// </summary>
        [Input("policyName")]
        public Input<string>? PolicyName { get; set; }

        /// <summary>
        /// Product code.
        /// </summary>
        [Input("productCode")]
        public Input<string>? ProductCode { get; set; }

        /// <summary>
        /// For Resource Directory configuration, the account must have opened the resource directory and be an administrator or a delegated administrator. See `resource_directory` below.
        /// </summary>
        [Input("resourceDirectory")]
        public Input<Inputs.CollectionPolicyResourceDirectoryGetArgs>? ResourceDirectory { get; set; }

        public CollectionPolicyState()
        {
        }
        public static new CollectionPolicyState Empty => new CollectionPolicyState();
    }
}