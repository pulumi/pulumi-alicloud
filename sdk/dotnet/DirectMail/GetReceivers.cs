// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DirectMail
{
    public static class GetReceivers
    {
        /// <summary>
        /// This data source provides the Direct Mail Receiverses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.125.0+.
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
        ///     var example = AliCloud.DirectMail.GetReceivers.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "ca73b1e4fb0df7c935a5097a****",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDirectMailReceiversId"] = example.Apply(getReceiversResult =&gt; getReceiversResult.Receiverses[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetReceiversResult> InvokeAsync(GetReceiversArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetReceiversResult>("alicloud:directmail/getReceivers:getReceivers", args ?? new GetReceiversArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Direct Mail Receiverses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.125.0+.
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
        ///     var example = AliCloud.DirectMail.GetReceivers.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "ca73b1e4fb0df7c935a5097a****",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDirectMailReceiversId"] = example.Apply(getReceiversResult =&gt; getReceiversResult.Receiverses[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetReceiversResult> Invoke(GetReceiversInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetReceiversResult>("alicloud:directmail/getReceivers:getReceivers", args ?? new GetReceiversInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Direct Mail Receiverses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.125.0+.
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
        ///     var example = AliCloud.DirectMail.GetReceivers.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "ca73b1e4fb0df7c935a5097a****",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDirectMailReceiversId"] = example.Apply(getReceiversResult =&gt; getReceiversResult.Receiverses[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetReceiversResult> Invoke(GetReceiversInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetReceiversResult>("alicloud:directmail/getReceivers:getReceivers", args ?? new GetReceiversInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetReceiversArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Receivers IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The key word.
        /// </summary>
        [Input("keyWord")]
        public string? KeyWord { get; set; }

        /// <summary>
        /// A regex string to filter results by Receivers name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid Values: `0` means uploading, `1` means upload completed.
        /// </summary>
        [Input("status")]
        public int? Status { get; set; }

        public GetReceiversArgs()
        {
        }
        public static new GetReceiversArgs Empty => new GetReceiversArgs();
    }

    public sealed class GetReceiversInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Receivers IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The key word.
        /// </summary>
        [Input("keyWord")]
        public Input<string>? KeyWord { get; set; }

        /// <summary>
        /// A regex string to filter results by Receivers name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid Values: `0` means uploading, `1` means upload completed.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        public GetReceiversInvokeArgs()
        {
        }
        public static new GetReceiversInvokeArgs Empty => new GetReceiversInvokeArgs();
    }


    [OutputType]
    public sealed class GetReceiversResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? KeyWord;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetReceiversReceiverseResult> Receiverses;
        public readonly int? Status;

        [OutputConstructor]
        private GetReceiversResult(
            string id,

            ImmutableArray<string> ids,

            string? keyWord,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetReceiversReceiverseResult> receiverses,

            int? status)
        {
            Id = id;
            Ids = ids;
            KeyWord = keyWord;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Receiverses = receiverses;
            Status = status;
        }
    }
}
