// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    public static class GetCustomLines
    {
        /// <summary>
        /// This data source provides the Alidns Custom Lines of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.151.0+.
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
        ///     var ids = AliCloud.Dns.GetCustomLines.Invoke(new()
        ///     {
        ///         EnableDetails = true,
        ///         DomainName = "your_domain_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alidnsCustomLineId1"] = ids.Apply(getCustomLinesResult =&gt; getCustomLinesResult.Lines[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetCustomLinesResult> InvokeAsync(GetCustomLinesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomLinesResult>("alicloud:dns/getCustomLines:getCustomLines", args ?? new GetCustomLinesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Alidns Custom Lines of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.151.0+.
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
        ///     var ids = AliCloud.Dns.GetCustomLines.Invoke(new()
        ///     {
        ///         EnableDetails = true,
        ///         DomainName = "your_domain_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alidnsCustomLineId1"] = ids.Apply(getCustomLinesResult =&gt; getCustomLinesResult.Lines[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCustomLinesResult> Invoke(GetCustomLinesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomLinesResult>("alicloud:dns/getCustomLines:getCustomLines", args ?? new GetCustomLinesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Alidns Custom Lines of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.151.0+.
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
        ///     var ids = AliCloud.Dns.GetCustomLines.Invoke(new()
        ///     {
        ///         EnableDetails = true,
        ///         DomainName = "your_domain_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alidnsCustomLineId1"] = ids.Apply(getCustomLinesResult =&gt; getCustomLinesResult.Lines[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCustomLinesResult> Invoke(GetCustomLinesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomLinesResult>("alicloud:dns/getCustomLines:getCustomLines", args ?? new GetCustomLinesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomLinesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Domain name.
        /// </summary>
        [Input("domainName", required: true)]
        public string DomainName { get; set; } = null!;

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Custom Line IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public string? Lang { get; set; }

        /// <summary>
        /// A regex string to filter results by Custom Line name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetCustomLinesArgs()
        {
        }
        public static new GetCustomLinesArgs Empty => new GetCustomLinesArgs();
    }

    public sealed class GetCustomLinesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Domain name.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Custom Line IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// A regex string to filter results by Custom Line name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetCustomLinesInvokeArgs()
        {
        }
        public static new GetCustomLinesInvokeArgs Empty => new GetCustomLinesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomLinesResult
    {
        public readonly string DomainName;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Lang;
        public readonly ImmutableArray<Outputs.GetCustomLinesLineResult> Lines;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetCustomLinesResult(
            string domainName,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? lang,

            ImmutableArray<Outputs.GetCustomLinesLineResult> lines,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            DomainName = domainName;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Lang = lang;
            Lines = lines;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
