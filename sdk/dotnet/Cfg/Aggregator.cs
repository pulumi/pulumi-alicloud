// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg
{
    /// <summary>
    /// Provides a Cloud Config Aggregator resource.
    /// 
    /// For information about Cloud Config Aggregate Config Rule and how to use it, see [What is Aggregator](https://www.alibabacloud.com/help/en/doc-detail/211197.html).
    /// 
    /// &gt; **NOTE:** Available in v1.124.0+.
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
    ///         var example = new AliCloud.Cfg.Aggregator("example", new AliCloud.Cfg.AggregatorArgs
    ///         {
    ///             AggregatorAccounts = 
    ///             {
    ///                 new AliCloud.Cfg.Inputs.AggregatorAggregatorAccountArgs
    ///                 {
    ///                     AccountId = "123968452689****",
    ///                     AccountName = "tf-testacc1234",
    ///                     AccountType = "ResourceDirectory",
    ///                 },
    ///             },
    ///             AggregatorName = "tf-testaccConfigAggregator1234",
    ///             Description = "tf-testaccConfigAggregator1234",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Config Aggregator can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cfg/aggregator:Aggregator example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cfg/aggregator:Aggregator")]
    public partial class Aggregator : Pulumi.CustomResource
    {
        /// <summary>
        /// The information of account in aggregator. If the aggregator_type is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregator_accounts` is not required from version 1.148.0.
        /// </summary>
        [Output("aggregatorAccounts")]
        public Output<ImmutableArray<Outputs.AggregatorAggregatorAccount>> AggregatorAccounts { get; private set; } = null!;

        /// <summary>
        /// The name of aggregator.
        /// </summary>
        [Output("aggregatorName")]
        public Output<string> AggregatorName { get; private set; } = null!;

        /// <summary>
        /// The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
        /// </summary>
        [Output("aggregatorType")]
        public Output<string> AggregatorType { get; private set; } = null!;

        /// <summary>
        /// The description of aggregator.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a Aggregator resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Aggregator(string name, AggregatorArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cfg/aggregator:Aggregator", name, args ?? new AggregatorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Aggregator(string name, Input<string> id, AggregatorState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cfg/aggregator:Aggregator", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Aggregator resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Aggregator Get(string name, Input<string> id, AggregatorState? state = null, CustomResourceOptions? options = null)
        {
            return new Aggregator(name, id, state, options);
        }
    }

    public sealed class AggregatorArgs : Pulumi.ResourceArgs
    {
        [Input("aggregatorAccounts")]
        private InputList<Inputs.AggregatorAggregatorAccountArgs>? _aggregatorAccounts;

        /// <summary>
        /// The information of account in aggregator. If the aggregator_type is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregator_accounts` is not required from version 1.148.0.
        /// </summary>
        public InputList<Inputs.AggregatorAggregatorAccountArgs> AggregatorAccounts
        {
            get => _aggregatorAccounts ?? (_aggregatorAccounts = new InputList<Inputs.AggregatorAggregatorAccountArgs>());
            set => _aggregatorAccounts = value;
        }

        /// <summary>
        /// The name of aggregator.
        /// </summary>
        [Input("aggregatorName", required: true)]
        public Input<string> AggregatorName { get; set; } = null!;

        /// <summary>
        /// The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
        /// </summary>
        [Input("aggregatorType")]
        public Input<string>? AggregatorType { get; set; }

        /// <summary>
        /// The description of aggregator.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        public AggregatorArgs()
        {
        }
    }

    public sealed class AggregatorState : Pulumi.ResourceArgs
    {
        [Input("aggregatorAccounts")]
        private InputList<Inputs.AggregatorAggregatorAccountGetArgs>? _aggregatorAccounts;

        /// <summary>
        /// The information of account in aggregator. If the aggregator_type is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregator_accounts` is not required from version 1.148.0.
        /// </summary>
        public InputList<Inputs.AggregatorAggregatorAccountGetArgs> AggregatorAccounts
        {
            get => _aggregatorAccounts ?? (_aggregatorAccounts = new InputList<Inputs.AggregatorAggregatorAccountGetArgs>());
            set => _aggregatorAccounts = value;
        }

        /// <summary>
        /// The name of aggregator.
        /// </summary>
        [Input("aggregatorName")]
        public Input<string>? AggregatorName { get; set; }

        /// <summary>
        /// The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
        /// </summary>
        [Input("aggregatorType")]
        public Input<string>? AggregatorType { get; set; }

        /// <summary>
        /// The description of aggregator.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AggregatorState()
        {
        }
    }
}