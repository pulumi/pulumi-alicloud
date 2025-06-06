// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cddc
{
    public static class GetDedicatedHostAccounts
    {
        /// <summary>
        /// This data source provides the Cddc Dedicated Host Accounts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
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
        ///     var ids = AliCloud.Cddc.GetDedicatedHostAccounts.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cddcDedicatedHostAccountId1"] = ids.Apply(getDedicatedHostAccountsResult =&gt; getDedicatedHostAccountsResult.Accounts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDedicatedHostAccountsResult> InvokeAsync(GetDedicatedHostAccountsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDedicatedHostAccountsResult>("alicloud:cddc/getDedicatedHostAccounts:getDedicatedHostAccounts", args ?? new GetDedicatedHostAccountsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cddc Dedicated Host Accounts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
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
        ///     var ids = AliCloud.Cddc.GetDedicatedHostAccounts.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cddcDedicatedHostAccountId1"] = ids.Apply(getDedicatedHostAccountsResult =&gt; getDedicatedHostAccountsResult.Accounts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDedicatedHostAccountsResult> Invoke(GetDedicatedHostAccountsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDedicatedHostAccountsResult>("alicloud:cddc/getDedicatedHostAccounts:getDedicatedHostAccounts", args ?? new GetDedicatedHostAccountsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cddc Dedicated Host Accounts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
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
        ///     var ids = AliCloud.Cddc.GetDedicatedHostAccounts.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cddcDedicatedHostAccountId1"] = ids.Apply(getDedicatedHostAccountsResult =&gt; getDedicatedHostAccountsResult.Accounts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDedicatedHostAccountsResult> Invoke(GetDedicatedHostAccountsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDedicatedHostAccountsResult>("alicloud:cddc/getDedicatedHostAccounts:getDedicatedHostAccounts", args ?? new GetDedicatedHostAccountsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDedicatedHostAccountsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the host.
        /// </summary>
        [Input("dedicatedHostId")]
        public string? DedicatedHostId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Dedicated Host Account IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Account name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        public GetDedicatedHostAccountsArgs()
        {
        }
        public static new GetDedicatedHostAccountsArgs Empty => new GetDedicatedHostAccountsArgs();
    }

    public sealed class GetDedicatedHostAccountsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the host.
        /// </summary>
        [Input("dedicatedHostId")]
        public Input<string>? DedicatedHostId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Dedicated Host Account IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Account name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        public GetDedicatedHostAccountsInvokeArgs()
        {
        }
        public static new GetDedicatedHostAccountsInvokeArgs Empty => new GetDedicatedHostAccountsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDedicatedHostAccountsResult
    {
        public readonly ImmutableArray<Outputs.GetDedicatedHostAccountsAccountResult> Accounts;
        public readonly string? DedicatedHostId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;

        [OutputConstructor]
        private GetDedicatedHostAccountsResult(
            ImmutableArray<Outputs.GetDedicatedHostAccountsAccountResult> accounts,

            string? dedicatedHostId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize)
        {
            Accounts = accounts;
            DedicatedHostId = dedicatedHostId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
        }
    }
}
