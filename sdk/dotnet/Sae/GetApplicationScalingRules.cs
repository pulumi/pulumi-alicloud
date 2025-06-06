// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae
{
    public static class GetApplicationScalingRules
    {
        /// <summary>
        /// This data source provides the Sae Application Scaling Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.159.0+.
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
        ///     var ids = AliCloud.Sae.GetApplicationScalingRules.Invoke(new()
        ///     {
        ///         AppId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["saeApplicationScalingRuleId1"] = ids.Apply(getApplicationScalingRulesResult =&gt; getApplicationScalingRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplicationScalingRulesResult> InvokeAsync(GetApplicationScalingRulesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplicationScalingRulesResult>("alicloud:sae/getApplicationScalingRules:getApplicationScalingRules", args ?? new GetApplicationScalingRulesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Sae Application Scaling Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.159.0+.
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
        ///     var ids = AliCloud.Sae.GetApplicationScalingRules.Invoke(new()
        ///     {
        ///         AppId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["saeApplicationScalingRuleId1"] = ids.Apply(getApplicationScalingRulesResult =&gt; getApplicationScalingRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationScalingRulesResult> Invoke(GetApplicationScalingRulesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationScalingRulesResult>("alicloud:sae/getApplicationScalingRules:getApplicationScalingRules", args ?? new GetApplicationScalingRulesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Sae Application Scaling Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.159.0+.
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
        ///     var ids = AliCloud.Sae.GetApplicationScalingRules.Invoke(new()
        ///     {
        ///         AppId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["saeApplicationScalingRuleId1"] = ids.Apply(getApplicationScalingRulesResult =&gt; getApplicationScalingRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplicationScalingRulesResult> Invoke(GetApplicationScalingRulesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationScalingRulesResult>("alicloud:sae/getApplicationScalingRules:getApplicationScalingRules", args ?? new GetApplicationScalingRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplicationScalingRulesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Application.
        /// </summary>
        [Input("appId", required: true)]
        public string AppId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Application Scaling Rule IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetApplicationScalingRulesArgs()
        {
        }
        public static new GetApplicationScalingRulesArgs Empty => new GetApplicationScalingRulesArgs();
    }

    public sealed class GetApplicationScalingRulesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Application.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Application Scaling Rule IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetApplicationScalingRulesInvokeArgs()
        {
        }
        public static new GetApplicationScalingRulesInvokeArgs Empty => new GetApplicationScalingRulesInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplicationScalingRulesResult
    {
        public readonly string AppId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetApplicationScalingRulesRuleResult> Rules;

        [OutputConstructor]
        private GetApplicationScalingRulesResult(
            string appId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetApplicationScalingRulesRuleResult> rules)
        {
            AppId = appId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Rules = rules;
        }
    }
}
