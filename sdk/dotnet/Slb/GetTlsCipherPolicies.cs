// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static class GetTlsCipherPolicies
    {
        /// <summary>
        /// This data source provides the Slb Tls Cipher Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
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
        ///     var ids = AliCloud.Slb.GetTlsCipherPolicies.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Slb.GetTlsCipherPolicies.Invoke(new()
        ///     {
        ///         NameRegex = "^My-TlsCipherPolicy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["slbTlsCipherPolicyId1"] = ids.Apply(getTlsCipherPoliciesResult =&gt; getTlsCipherPoliciesResult.Policies[0]?.Id),
        ///         ["slbTlsCipherPolicyId2"] = nameRegex.Apply(getTlsCipherPoliciesResult =&gt; getTlsCipherPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTlsCipherPoliciesResult> InvokeAsync(GetTlsCipherPoliciesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTlsCipherPoliciesResult>("alicloud:slb/getTlsCipherPolicies:getTlsCipherPolicies", args ?? new GetTlsCipherPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Slb Tls Cipher Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
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
        ///     var ids = AliCloud.Slb.GetTlsCipherPolicies.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Slb.GetTlsCipherPolicies.Invoke(new()
        ///     {
        ///         NameRegex = "^My-TlsCipherPolicy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["slbTlsCipherPolicyId1"] = ids.Apply(getTlsCipherPoliciesResult =&gt; getTlsCipherPoliciesResult.Policies[0]?.Id),
        ///         ["slbTlsCipherPolicyId2"] = nameRegex.Apply(getTlsCipherPoliciesResult =&gt; getTlsCipherPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTlsCipherPoliciesResult> Invoke(GetTlsCipherPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTlsCipherPoliciesResult>("alicloud:slb/getTlsCipherPolicies:getTlsCipherPolicies", args ?? new GetTlsCipherPoliciesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Slb Tls Cipher Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
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
        ///     var ids = AliCloud.Slb.GetTlsCipherPolicies.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Slb.GetTlsCipherPolicies.Invoke(new()
        ///     {
        ///         NameRegex = "^My-TlsCipherPolicy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["slbTlsCipherPolicyId1"] = ids.Apply(getTlsCipherPoliciesResult =&gt; getTlsCipherPoliciesResult.Policies[0]?.Id),
        ///         ["slbTlsCipherPolicyId2"] = nameRegex.Apply(getTlsCipherPoliciesResult =&gt; getTlsCipherPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTlsCipherPoliciesResult> Invoke(GetTlsCipherPoliciesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTlsCipherPoliciesResult>("alicloud:slb/getTlsCipherPolicies:getTlsCipherPolicies", args ?? new GetTlsCipherPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTlsCipherPoliciesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Tls Cipher Policy IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The include listener.
        /// </summary>
        [Input("includeListener")]
        public bool? IncludeListener { get; set; }

        /// <summary>
        /// A regex string to filter results by Tls Cipher Policy name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// TLS policy instance state. Valid values: `configuring`, `normal`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
        /// </summary>
        [Input("tlsCipherPolicyName")]
        public string? TlsCipherPolicyName { get; set; }

        public GetTlsCipherPoliciesArgs()
        {
        }
        public static new GetTlsCipherPoliciesArgs Empty => new GetTlsCipherPoliciesArgs();
    }

    public sealed class GetTlsCipherPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Tls Cipher Policy IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The include listener.
        /// </summary>
        [Input("includeListener")]
        public Input<bool>? IncludeListener { get; set; }

        /// <summary>
        /// A regex string to filter results by Tls Cipher Policy name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// TLS policy instance state. Valid values: `configuring`, `normal`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// TLS policy name. Length is from 2 to 128, or in both the English and Chinese characters must be with an uppercase/lowercase letter or a Chinese character and the beginning, may contain numbers, in dot `.`, underscore `_` or dash `-`.
        /// </summary>
        [Input("tlsCipherPolicyName")]
        public Input<string>? TlsCipherPolicyName { get; set; }

        public GetTlsCipherPoliciesInvokeArgs()
        {
        }
        public static new GetTlsCipherPoliciesInvokeArgs Empty => new GetTlsCipherPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTlsCipherPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly bool? IncludeListener;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetTlsCipherPoliciesPolicyResult> Policies;
        public readonly string? Status;
        public readonly string? TlsCipherPolicyName;

        [OutputConstructor]
        private GetTlsCipherPoliciesResult(
            string id,

            ImmutableArray<string> ids,

            bool? includeListener,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetTlsCipherPoliciesPolicyResult> policies,

            string? status,

            string? tlsCipherPolicyName)
        {
            Id = id;
            Ids = ids;
            IncludeListener = includeListener;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Policies = policies;
            Status = status;
            TlsCipherPolicyName = tlsCipherPolicyName;
        }
    }
}
