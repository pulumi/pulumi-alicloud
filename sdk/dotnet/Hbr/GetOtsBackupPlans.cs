// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    public static class GetOtsBackupPlans
    {
        /// <summary>
        /// This data source provides the Hbr OtsBackupPlans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.163.0+.
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
        ///     var ids = AliCloud.Hbr.GetOtsBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "^my-otsBackupPlan",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrOtsBackupPlanId"] = plans[0].Id,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetOtsBackupPlansResult> InvokeAsync(GetOtsBackupPlansArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOtsBackupPlansResult>("alicloud:hbr/getOtsBackupPlans:getOtsBackupPlans", args ?? new GetOtsBackupPlansArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hbr OtsBackupPlans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.163.0+.
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
        ///     var ids = AliCloud.Hbr.GetOtsBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "^my-otsBackupPlan",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrOtsBackupPlanId"] = plans[0].Id,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetOtsBackupPlansResult> Invoke(GetOtsBackupPlansInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOtsBackupPlansResult>("alicloud:hbr/getOtsBackupPlans:getOtsBackupPlans", args ?? new GetOtsBackupPlansInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hbr OtsBackupPlans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.163.0+.
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
        ///     var ids = AliCloud.Hbr.GetOtsBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "^my-otsBackupPlan",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrOtsBackupPlanId"] = plans[0].Id,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetOtsBackupPlansResult> Invoke(GetOtsBackupPlansInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetOtsBackupPlansResult>("alicloud:hbr/getOtsBackupPlans:getOtsBackupPlans", args ?? new GetOtsBackupPlansInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOtsBackupPlansArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of OtsBackupPlan IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by OtsBackupPlan name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the backup plan.
        /// </summary>
        [Input("planId")]
        public string? PlanId { get; set; }

        /// <summary>
        /// The ID of the backup plan.
        /// </summary>
        [Input("planName")]
        public string? PlanName { get; set; }

        /// <summary>
        /// The ID of backup vault the OtsBackupPlan used.
        /// </summary>
        [Input("vaultId")]
        public string? VaultId { get; set; }

        public GetOtsBackupPlansArgs()
        {
        }
        public static new GetOtsBackupPlansArgs Empty => new GetOtsBackupPlansArgs();
    }

    public sealed class GetOtsBackupPlansInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of OtsBackupPlan IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by OtsBackupPlan name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the backup plan.
        /// </summary>
        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        /// <summary>
        /// The ID of the backup plan.
        /// </summary>
        [Input("planName")]
        public Input<string>? PlanName { get; set; }

        /// <summary>
        /// The ID of backup vault the OtsBackupPlan used.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public GetOtsBackupPlansInvokeArgs()
        {
        }
        public static new GetOtsBackupPlansInvokeArgs Empty => new GetOtsBackupPlansInvokeArgs();
    }


    [OutputType]
    public sealed class GetOtsBackupPlansResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? PlanId;
        public readonly string? PlanName;
        public readonly ImmutableArray<Outputs.GetOtsBackupPlansPlanResult> Plans;
        public readonly string? VaultId;

        [OutputConstructor]
        private GetOtsBackupPlansResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? planId,

            string? planName,

            ImmutableArray<Outputs.GetOtsBackupPlansPlanResult> plans,

            string? vaultId)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PlanId = planId;
            PlanName = planName;
            Plans = plans;
            VaultId = vaultId;
        }
    }
}
