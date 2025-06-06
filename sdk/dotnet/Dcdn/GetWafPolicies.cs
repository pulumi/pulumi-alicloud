// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn
{
    public static class GetWafPolicies
    {
        /// <summary>
        /// This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.184.0.
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
        ///     var ids = AliCloud.Dcdn.GetWafPolicies.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dcdnWafPolicyId1"] = ids.Apply(getWafPoliciesResult =&gt; getWafPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWafPoliciesResult> InvokeAsync(GetWafPoliciesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWafPoliciesResult>("alicloud:dcdn/getWafPolicies:getWafPolicies", args ?? new GetWafPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.184.0.
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
        ///     var ids = AliCloud.Dcdn.GetWafPolicies.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dcdnWafPolicyId1"] = ids.Apply(getWafPoliciesResult =&gt; getWafPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWafPoliciesResult> Invoke(GetWafPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWafPoliciesResult>("alicloud:dcdn/getWafPolicies:getWafPolicies", args ?? new GetWafPoliciesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.184.0.
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
        ///     var ids = AliCloud.Dcdn.GetWafPolicies.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dcdnWafPolicyId1"] = ids.Apply(getWafPoliciesResult =&gt; getWafPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWafPoliciesResult> Invoke(GetWafPoliciesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWafPoliciesResult>("alicloud:dcdn/getWafPolicies:getWafPolicies", args ?? new GetWafPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWafPoliciesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Waf Policy IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The query conditions. The value is a string in the JSON format. Format: `{"PolicyIds":"The ID of the proteuleIds":"Thection policy","R range of protection rule IDs","PolicyNameLike":"The name of the protection policy","DomainNames":"The protected domain names","PolicyType":"default","DefenseScenes":"waf_group","PolicyStatus":"on","OrderBy":"GmtModified","Desc":"false"}`.
        /// </summary>
        [Input("queryArgs")]
        public string? QueryArgs { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `on`, `off`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetWafPoliciesArgs()
        {
        }
        public static new GetWafPoliciesArgs Empty => new GetWafPoliciesArgs();
    }

    public sealed class GetWafPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Waf Policy IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The query conditions. The value is a string in the JSON format. Format: `{"PolicyIds":"The ID of the proteuleIds":"Thection policy","R range of protection rule IDs","PolicyNameLike":"The name of the protection policy","DomainNames":"The protected domain names","PolicyType":"default","DefenseScenes":"waf_group","PolicyStatus":"on","OrderBy":"GmtModified","Desc":"false"}`.
        /// </summary>
        [Input("queryArgs")]
        public Input<string>? QueryArgs { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `on`, `off`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetWafPoliciesInvokeArgs()
        {
        }
        public static new GetWafPoliciesInvokeArgs Empty => new GetWafPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetWafPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Dcdn Waf Policies. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWafPoliciesPolicyResult> Policies;
        public readonly string? QueryArgs;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetWafPoliciesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetWafPoliciesPolicyResult> policies,

            string? queryArgs,

            string? status)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Policies = policies;
            QueryArgs = queryArgs;
            Status = status;
        }
    }
}
