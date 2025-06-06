// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ActionTrail
{
    /// <summary>
    /// Provides a Actiontrail History Delivery Job resource.
    /// 
    /// For information about Actiontrail History Delivery Job and how to use it, see [What is History Delivery Job](https://www.alibabacloud.com/help/en/actiontrail/latest/api-actiontrail-2020-07-06-createdeliveryhistoryjob).
    /// 
    /// &gt; **NOTE:** Available since v1.139.0.
    /// 
    /// &gt; **NOTE:** You are authorized to use the historical event delivery task feature. To use this feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=a2c63.p38356.0.0.e29f552bb6odNZ#/ticket/createIndex) or ask the sales manager to add you to the whitelist.
    /// 
    /// &gt; **NOTE:** Make sure that you have called the `alicloud.actiontrail.Trail` to create a single-account or multi-account trace that delivered to Log Service SLS.
    /// 
    /// &gt; **NOTE:** An Alibaba cloud account can only have one running delivery history job at the same time.
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
    ///     var name = config.Get("name") ?? "tf-example";
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var example = AliCloud.GetRegions.Invoke(new()
    ///     {
    ///         Current = true,
    ///     });
    /// 
    ///     var exampleGetAccount = AliCloud.GetAccount.Invoke();
    /// 
    ///     var exampleProject = new AliCloud.Log.Project("example", new()
    ///     {
    ///         ProjectName = $"{name}-{@default.Result}",
    ///         Description = "tf actiontrail example",
    ///     });
    /// 
    ///     var exampleTrail = new AliCloud.ActionTrail.Trail("example", new()
    ///     {
    ///         TrailName = $"{name}-{@default.Result}",
    ///         SlsProjectArn = Output.Tuple(example, exampleGetAccount, exampleProject.Name).Apply(values =&gt;
    ///         {
    ///             var example = values.Item1;
    ///             var exampleGetAccount = values.Item2;
    ///             var name = values.Item3;
    ///             return $"acs:log:{example.Apply(getRegionsResult =&gt; getRegionsResult.Regions[0]?.Id)}:{exampleGetAccount.Apply(getAccountResult =&gt; getAccountResult.Id)}:project/{name}";
    ///         }),
    ///     });
    /// 
    ///     var exampleHistoryDeliveryJob = new AliCloud.ActionTrail.HistoryDeliveryJob("example", new()
    ///     {
    ///         TrailName = exampleTrail.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Actiontrail History Delivery Job can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:actiontrail/historyDeliveryJob:HistoryDeliveryJob example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:actiontrail/historyDeliveryJob:HistoryDeliveryJob")]
    public partial class HistoryDeliveryJob : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The status of the task. Valid values: `0`, `1`, `2`, `3`. `0`: The task is initializing. `1`: The task is delivering historical events. `2`: The delivery of historical events is complete. `3`: The task fails.
        /// </summary>
        [Output("status")]
        public Output<int> Status { get; private set; } = null!;

        /// <summary>
        /// The name of the trail for which you want to create a historical event delivery task.
        /// </summary>
        [Output("trailName")]
        public Output<string> TrailName { get; private set; } = null!;


        /// <summary>
        /// Create a HistoryDeliveryJob resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HistoryDeliveryJob(string name, HistoryDeliveryJobArgs args, CustomResourceOptions? options = null)
            : base("alicloud:actiontrail/historyDeliveryJob:HistoryDeliveryJob", name, args ?? new HistoryDeliveryJobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HistoryDeliveryJob(string name, Input<string> id, HistoryDeliveryJobState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:actiontrail/historyDeliveryJob:HistoryDeliveryJob", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HistoryDeliveryJob resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HistoryDeliveryJob Get(string name, Input<string> id, HistoryDeliveryJobState? state = null, CustomResourceOptions? options = null)
        {
            return new HistoryDeliveryJob(name, id, state, options);
        }
    }

    public sealed class HistoryDeliveryJobArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the trail for which you want to create a historical event delivery task.
        /// </summary>
        [Input("trailName", required: true)]
        public Input<string> TrailName { get; set; } = null!;

        public HistoryDeliveryJobArgs()
        {
        }
        public static new HistoryDeliveryJobArgs Empty => new HistoryDeliveryJobArgs();
    }

    public sealed class HistoryDeliveryJobState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status of the task. Valid values: `0`, `1`, `2`, `3`. `0`: The task is initializing. `1`: The task is delivering historical events. `2`: The delivery of historical events is complete. `3`: The task fails.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        /// <summary>
        /// The name of the trail for which you want to create a historical event delivery task.
        /// </summary>
        [Input("trailName")]
        public Input<string>? TrailName { get; set; }

        public HistoryDeliveryJobState()
        {
        }
        public static new HistoryDeliveryJobState Empty => new HistoryDeliveryJobState();
    }
}
