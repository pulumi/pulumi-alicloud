// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    public static class GetMetricRuleBlackLists
    {
        /// <summary>
        /// This data source provides Cloud Monitor Service Metric Rule Black List available to the user.[What is Metric Rule Black List](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruleblacklist)
        /// 
        /// &gt; **NOTE:** Available in 1.194.0+
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
        ///     var @default = AliCloud.Cms.GetMetricRuleBlackLists.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudCmsMetricRuleBlackLists.Id,
        ///         },
        ///         Category = "ecs",
        ///         Namespace = "acs_ecs_dashboard",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudCmsRuleBlackListExampleId"] = lists[0].Id,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetMetricRuleBlackListsResult> InvokeAsync(GetMetricRuleBlackListsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMetricRuleBlackListsResult>("alicloud:cms/getMetricRuleBlackLists:getMetricRuleBlackLists", args ?? new GetMetricRuleBlackListsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Cloud Monitor Service Metric Rule Black List available to the user.[What is Metric Rule Black List](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruleblacklist)
        /// 
        /// &gt; **NOTE:** Available in 1.194.0+
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
        ///     var @default = AliCloud.Cms.GetMetricRuleBlackLists.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudCmsMetricRuleBlackLists.Id,
        ///         },
        ///         Category = "ecs",
        ///         Namespace = "acs_ecs_dashboard",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudCmsRuleBlackListExampleId"] = lists[0].Id,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMetricRuleBlackListsResult> Invoke(GetMetricRuleBlackListsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMetricRuleBlackListsResult>("alicloud:cms/getMetricRuleBlackLists:getMetricRuleBlackLists", args ?? new GetMetricRuleBlackListsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Cloud Monitor Service Metric Rule Black List available to the user.[What is Metric Rule Black List](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruleblacklist)
        /// 
        /// &gt; **NOTE:** Available in 1.194.0+
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
        ///     var @default = AliCloud.Cms.GetMetricRuleBlackLists.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudCmsMetricRuleBlackLists.Id,
        ///         },
        ///         Category = "ecs",
        ///         Namespace = "acs_ecs_dashboard",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudCmsRuleBlackListExampleId"] = lists[0].Id,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMetricRuleBlackListsResult> Invoke(GetMetricRuleBlackListsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMetricRuleBlackListsResult>("alicloud:cms/getMetricRuleBlackLists:getMetricRuleBlackLists", args ?? new GetMetricRuleBlackListsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMetricRuleBlackListsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Metric Rule Black List IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Input("metricRuleBlackListId")]
        public string? MetricRuleBlackListId { get; set; }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// The data namespace of the cloud service.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        [Input("order")]
        public int? Order { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        public GetMetricRuleBlackListsArgs()
        {
        }
        public static new GetMetricRuleBlackListsArgs Empty => new GetMetricRuleBlackListsArgs();
    }

    public sealed class GetMetricRuleBlackListsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Metric Rule Black List IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Input("metricRuleBlackListId")]
        public Input<string>? MetricRuleBlackListId { get; set; }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// The data namespace of the cloud service.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("order")]
        public Input<int>? Order { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        public GetMetricRuleBlackListsInvokeArgs()
        {
        }
        public static new GetMetricRuleBlackListsInvokeArgs Empty => new GetMetricRuleBlackListsInvokeArgs();
    }


    [OutputType]
    public sealed class GetMetricRuleBlackListsResult
    {
        /// <summary>
        /// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Metric Rule Black List IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of Metric Rule Black List Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMetricRuleBlackListsListResult> Lists;
        /// <summary>
        /// The first ID of the resource
        /// </summary>
        public readonly string? MetricRuleBlackListId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of name of Metric Rule Black Lists.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        /// <summary>
        /// The data namespace of the cloud service.
        /// </summary>
        public readonly string? Namespace;
        public readonly int? Order;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;

        [OutputConstructor]
        private GetMetricRuleBlackListsResult(
            string? category,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetMetricRuleBlackListsListResult> lists,

            string? metricRuleBlackListId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? @namespace,

            int? order,

            string? outputFile,

            int? pageNumber,

            int? pageSize)
        {
            Category = category;
            Id = id;
            Ids = ids;
            Lists = lists;
            MetricRuleBlackListId = metricRuleBlackListId;
            NameRegex = nameRegex;
            Names = names;
            Namespace = @namespace;
            Order = order;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
        }
    }
}
