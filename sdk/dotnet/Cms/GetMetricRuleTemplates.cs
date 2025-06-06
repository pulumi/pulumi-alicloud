// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    public static class GetMetricRuleTemplates
    {
        /// <summary>
        /// This data source provides the Cms Metric Rule Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///     var ids = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         NameRegex = "^my-MetricRuleTemplate",
        ///     });
        /// 
        ///     var keyword = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         Keyword = "^my-MetricRuleTemplate",
        ///     });
        /// 
        ///     var templateId = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         TemplateId = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cmsMetricRuleTemplateId1"] = ids.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId2"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId3"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId4"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetMetricRuleTemplatesResult> InvokeAsync(GetMetricRuleTemplatesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMetricRuleTemplatesResult>("alicloud:cms/getMetricRuleTemplates:getMetricRuleTemplates", args ?? new GetMetricRuleTemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cms Metric Rule Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///     var ids = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         NameRegex = "^my-MetricRuleTemplate",
        ///     });
        /// 
        ///     var keyword = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         Keyword = "^my-MetricRuleTemplate",
        ///     });
        /// 
        ///     var templateId = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         TemplateId = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cmsMetricRuleTemplateId1"] = ids.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId2"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId3"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId4"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMetricRuleTemplatesResult> Invoke(GetMetricRuleTemplatesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMetricRuleTemplatesResult>("alicloud:cms/getMetricRuleTemplates:getMetricRuleTemplates", args ?? new GetMetricRuleTemplatesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cms Metric Rule Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///     var ids = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         NameRegex = "^my-MetricRuleTemplate",
        ///     });
        /// 
        ///     var keyword = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         Keyword = "^my-MetricRuleTemplate",
        ///     });
        /// 
        ///     var templateId = AliCloud.Cms.GetMetricRuleTemplates.Invoke(new()
        ///     {
        ///         TemplateId = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cmsMetricRuleTemplateId1"] = ids.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId2"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId3"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///         ["cmsMetricRuleTemplateId4"] = nameRegex.Apply(getMetricRuleTemplatesResult =&gt; getMetricRuleTemplatesResult.Templates[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMetricRuleTemplatesResult> Invoke(GetMetricRuleTemplatesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMetricRuleTemplatesResult>("alicloud:cms/getMetricRuleTemplates:getMetricRuleTemplates", args ?? new GetMetricRuleTemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMetricRuleTemplatesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Valid values: `true` or `false`. Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Metric Rule Template IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of the alert template. You can perform fuzzy search based on the template name.
        /// </summary>
        [Input("keyword")]
        public string? Keyword { get; set; }

        /// <summary>
        /// The name of the alert template.
        /// </summary>
        [Input("metricRuleTemplateName")]
        public string? MetricRuleTemplateName { get; set; }

        /// <summary>
        /// A regex string to filter results by Metric Rule Template name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the alert template.
        /// </summary>
        [Input("templateId")]
        public string? TemplateId { get; set; }

        public GetMetricRuleTemplatesArgs()
        {
        }
        public static new GetMetricRuleTemplatesArgs Empty => new GetMetricRuleTemplatesArgs();
    }

    public sealed class GetMetricRuleTemplatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Valid values: `true` or `false`. Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Metric Rule Template IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of the alert template. You can perform fuzzy search based on the template name.
        /// </summary>
        [Input("keyword")]
        public Input<string>? Keyword { get; set; }

        /// <summary>
        /// The name of the alert template.
        /// </summary>
        [Input("metricRuleTemplateName")]
        public Input<string>? MetricRuleTemplateName { get; set; }

        /// <summary>
        /// A regex string to filter results by Metric Rule Template name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the alert template.
        /// </summary>
        [Input("templateId")]
        public Input<string>? TemplateId { get; set; }

        public GetMetricRuleTemplatesInvokeArgs()
        {
        }
        public static new GetMetricRuleTemplatesInvokeArgs Empty => new GetMetricRuleTemplatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetMetricRuleTemplatesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Keyword;
        public readonly string? MetricRuleTemplateName;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? TemplateId;
        public readonly ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateResult> Templates;

        [OutputConstructor]
        private GetMetricRuleTemplatesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? keyword,

            string? metricRuleTemplateName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? templateId,

            ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateResult> templates)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Keyword = keyword;
            MetricRuleTemplateName = metricRuleTemplateName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            TemplateId = templateId;
            Templates = templates;
        }
    }
}
