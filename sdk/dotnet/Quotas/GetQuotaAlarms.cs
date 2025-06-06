// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Quotas
{
    public static class GetQuotaAlarms
    {
        /// <summary>
        /// This data source provides the Quotas Quota Alarms of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.116.0+.
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
        ///     var example = AliCloud.Quotas.GetQuotaAlarms.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "5VR90-421F886-81E9-xxx",
        ///         },
        ///         NameRegex = "tf-testAcc",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstQuotasQuotaAlarmId"] = example.Apply(getQuotaAlarmsResult =&gt; getQuotaAlarmsResult.Alarms[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetQuotaAlarmsResult> InvokeAsync(GetQuotaAlarmsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetQuotaAlarmsResult>("alicloud:quotas/getQuotaAlarms:getQuotaAlarms", args ?? new GetQuotaAlarmsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Quotas Quota Alarms of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.116.0+.
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
        ///     var example = AliCloud.Quotas.GetQuotaAlarms.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "5VR90-421F886-81E9-xxx",
        ///         },
        ///         NameRegex = "tf-testAcc",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstQuotasQuotaAlarmId"] = example.Apply(getQuotaAlarmsResult =&gt; getQuotaAlarmsResult.Alarms[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetQuotaAlarmsResult> Invoke(GetQuotaAlarmsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetQuotaAlarmsResult>("alicloud:quotas/getQuotaAlarms:getQuotaAlarms", args ?? new GetQuotaAlarmsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Quotas Quota Alarms of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.116.0+.
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
        ///     var example = AliCloud.Quotas.GetQuotaAlarms.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "5VR90-421F886-81E9-xxx",
        ///         },
        ///         NameRegex = "tf-testAcc",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstQuotasQuotaAlarmId"] = example.Apply(getQuotaAlarmsResult =&gt; getQuotaAlarmsResult.Alarms[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetQuotaAlarmsResult> Invoke(GetQuotaAlarmsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetQuotaAlarmsResult>("alicloud:quotas/getQuotaAlarms:getQuotaAlarms", args ?? new GetQuotaAlarmsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetQuotaAlarmsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Quota Alarm IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Quota Alarm name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Product Code.
        /// </summary>
        [Input("productCode")]
        public string? ProductCode { get; set; }

        /// <summary>
        /// The Quota Action Code.
        /// </summary>
        [Input("quotaActionCode")]
        public string? QuotaActionCode { get; set; }

        /// <summary>
        /// The name of Quota Alarm.
        /// </summary>
        [Input("quotaAlarmName")]
        public string? QuotaAlarmName { get; set; }

        [Input("quotaDimensions")]
        private List<Inputs.GetQuotaAlarmsQuotaDimensionArgs>? _quotaDimensions;

        /// <summary>
        /// The Quota Dimensions.
        /// </summary>
        public List<Inputs.GetQuotaAlarmsQuotaDimensionArgs> QuotaDimensions
        {
            get => _quotaDimensions ?? (_quotaDimensions = new List<Inputs.GetQuotaAlarmsQuotaDimensionArgs>());
            set => _quotaDimensions = value;
        }

        public GetQuotaAlarmsArgs()
        {
        }
        public static new GetQuotaAlarmsArgs Empty => new GetQuotaAlarmsArgs();
    }

    public sealed class GetQuotaAlarmsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Quota Alarm IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Quota Alarm name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Product Code.
        /// </summary>
        [Input("productCode")]
        public Input<string>? ProductCode { get; set; }

        /// <summary>
        /// The Quota Action Code.
        /// </summary>
        [Input("quotaActionCode")]
        public Input<string>? QuotaActionCode { get; set; }

        /// <summary>
        /// The name of Quota Alarm.
        /// </summary>
        [Input("quotaAlarmName")]
        public Input<string>? QuotaAlarmName { get; set; }

        [Input("quotaDimensions")]
        private InputList<Inputs.GetQuotaAlarmsQuotaDimensionInputArgs>? _quotaDimensions;

        /// <summary>
        /// The Quota Dimensions.
        /// </summary>
        public InputList<Inputs.GetQuotaAlarmsQuotaDimensionInputArgs> QuotaDimensions
        {
            get => _quotaDimensions ?? (_quotaDimensions = new InputList<Inputs.GetQuotaAlarmsQuotaDimensionInputArgs>());
            set => _quotaDimensions = value;
        }

        public GetQuotaAlarmsInvokeArgs()
        {
        }
        public static new GetQuotaAlarmsInvokeArgs Empty => new GetQuotaAlarmsInvokeArgs();
    }


    [OutputType]
    public sealed class GetQuotaAlarmsResult
    {
        public readonly ImmutableArray<Outputs.GetQuotaAlarmsAlarmResult> Alarms;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ProductCode;
        public readonly string? QuotaActionCode;
        public readonly string? QuotaAlarmName;
        public readonly ImmutableArray<Outputs.GetQuotaAlarmsQuotaDimensionResult> QuotaDimensions;

        [OutputConstructor]
        private GetQuotaAlarmsResult(
            ImmutableArray<Outputs.GetQuotaAlarmsAlarmResult> alarms,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? productCode,

            string? quotaActionCode,

            string? quotaAlarmName,

            ImmutableArray<Outputs.GetQuotaAlarmsQuotaDimensionResult> quotaDimensions)
        {
            Alarms = alarms;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ProductCode = productCode;
            QuotaActionCode = quotaActionCode;
            QuotaAlarmName = quotaAlarmName;
            QuotaDimensions = quotaDimensions;
        }
    }
}
