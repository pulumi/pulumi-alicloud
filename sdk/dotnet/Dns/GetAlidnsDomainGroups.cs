// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    public static class GetAlidnsDomainGroups
    {
        /// <summary>
        /// This data source provides a list of Alidns Domain Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:**  Available in 1.85.0+.
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
        ///     var example = AliCloud.Dns.GetAlidnsDomainGroups.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "c5ef2bc43064445787adf182af2****",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDomainGroupId"] = example.Apply(getAlidnsDomainGroupsResult =&gt; getAlidnsDomainGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetAlidnsDomainGroupsResult> InvokeAsync(GetAlidnsDomainGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlidnsDomainGroupsResult>("alicloud:dns/getAlidnsDomainGroups:getAlidnsDomainGroups", args ?? new GetAlidnsDomainGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of Alidns Domain Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:**  Available in 1.85.0+.
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
        ///     var example = AliCloud.Dns.GetAlidnsDomainGroups.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "c5ef2bc43064445787adf182af2****",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDomainGroupId"] = example.Apply(getAlidnsDomainGroupsResult =&gt; getAlidnsDomainGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAlidnsDomainGroupsResult> Invoke(GetAlidnsDomainGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlidnsDomainGroupsResult>("alicloud:dns/getAlidnsDomainGroups:getAlidnsDomainGroups", args ?? new GetAlidnsDomainGroupsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of Alidns Domain Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:**  Available in 1.85.0+.
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
        ///     var example = AliCloud.Dns.GetAlidnsDomainGroups.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "c5ef2bc43064445787adf182af2****",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDomainGroupId"] = example.Apply(getAlidnsDomainGroupsResult =&gt; getAlidnsDomainGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAlidnsDomainGroupsResult> Invoke(GetAlidnsDomainGroupsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlidnsDomainGroupsResult>("alicloud:dns/getAlidnsDomainGroups:getAlidnsDomainGroups", args ?? new GetAlidnsDomainGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlidnsDomainGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by the domain group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAlidnsDomainGroupsArgs()
        {
        }
        public static new GetAlidnsDomainGroupsArgs Empty => new GetAlidnsDomainGroupsArgs();
    }

    public sealed class GetAlidnsDomainGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by the domain group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAlidnsDomainGroupsInvokeArgs()
        {
        }
        public static new GetAlidnsDomainGroupsInvokeArgs Empty => new GetAlidnsDomainGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlidnsDomainGroupsResult
    {
        /// <summary>
        /// A list of instances. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlidnsDomainGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of instance IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of domain group names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetAlidnsDomainGroupsResult(
            ImmutableArray<Outputs.GetAlidnsDomainGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Groups = groups;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
