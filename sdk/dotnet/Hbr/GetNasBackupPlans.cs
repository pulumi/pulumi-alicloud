// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    public static class GetNasBackupPlans
    {
        /// <summary>
        /// This data source provides the Hbr NasBackupPlans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.132.0+.
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
        ///     var ids = AliCloud.Hbr.GetNasBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "^my-NasBackupPlan",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrNasBackupPlanId"] = ids.Apply(getNasBackupPlansResult =&gt; getNasBackupPlansResult.Plans[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetNasBackupPlansResult> InvokeAsync(GetNasBackupPlansArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNasBackupPlansResult>("alicloud:hbr/getNasBackupPlans:getNasBackupPlans", args ?? new GetNasBackupPlansArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hbr NasBackupPlans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.132.0+.
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
        ///     var ids = AliCloud.Hbr.GetNasBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "^my-NasBackupPlan",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrNasBackupPlanId"] = ids.Apply(getNasBackupPlansResult =&gt; getNasBackupPlansResult.Plans[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNasBackupPlansResult> Invoke(GetNasBackupPlansInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNasBackupPlansResult>("alicloud:hbr/getNasBackupPlans:getNasBackupPlans", args ?? new GetNasBackupPlansInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hbr NasBackupPlans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.132.0+.
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
        ///     var ids = AliCloud.Hbr.GetNasBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "^my-NasBackupPlan",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrNasBackupPlanId"] = ids.Apply(getNasBackupPlansResult =&gt; getNasBackupPlansResult.Plans[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNasBackupPlansResult> Invoke(GetNasBackupPlansInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNasBackupPlansResult>("alicloud:hbr/getNasBackupPlans:getNasBackupPlans", args ?? new GetNasBackupPlansInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNasBackupPlansArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Nas fileSystem instance ID of the EcsBackupPlan used.
        /// </summary>
        [Input("fileSystemId")]
        public string? FileSystemId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of NasBackupPlan IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by NasBackupPlan name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The backup vault ID of the NasBackupPlan used.
        /// </summary>
        [Input("vaultId")]
        public string? VaultId { get; set; }

        public GetNasBackupPlansArgs()
        {
        }
        public static new GetNasBackupPlansArgs Empty => new GetNasBackupPlansArgs();
    }

    public sealed class GetNasBackupPlansInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Nas fileSystem instance ID of the EcsBackupPlan used.
        /// </summary>
        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of NasBackupPlan IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by NasBackupPlan name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The backup vault ID of the NasBackupPlan used.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public GetNasBackupPlansInvokeArgs()
        {
        }
        public static new GetNasBackupPlansInvokeArgs Empty => new GetNasBackupPlansInvokeArgs();
    }


    [OutputType]
    public sealed class GetNasBackupPlansResult
    {
        public readonly string? FileSystemId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetNasBackupPlansPlanResult> Plans;
        public readonly string? VaultId;

        [OutputConstructor]
        private GetNasBackupPlansResult(
            string? fileSystemId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetNasBackupPlansPlanResult> plans,

            string? vaultId)
        {
            FileSystemId = fileSystemId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Plans = plans;
            VaultId = vaultId;
        }
    }
}
