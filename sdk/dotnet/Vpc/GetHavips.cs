// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetHavips
    {
        /// <summary>
        /// This data source provides the Havips of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.120.0+.
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
        ///     var example = AliCloud.Vpc.GetHavips.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstHavipId"] = example.Apply(getHavipsResult =&gt; getHavipsResult.Havips[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetHavipsResult> InvokeAsync(GetHavipsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHavipsResult>("alicloud:vpc/getHavips:getHavips", args ?? new GetHavipsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Havips of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.120.0+.
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
        ///     var example = AliCloud.Vpc.GetHavips.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstHavipId"] = example.Apply(getHavipsResult =&gt; getHavipsResult.Havips[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetHavipsResult> Invoke(GetHavipsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHavipsResult>("alicloud:vpc/getHavips:getHavips", args ?? new GetHavipsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Havips of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.120.0+.
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
        ///     var example = AliCloud.Vpc.GetHavips.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_value",
        ///         },
        ///         NameRegex = "the_resource_name",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstHavipId"] = example.Apply(getHavipsResult =&gt; getHavipsResult.Havips[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetHavipsResult> Invoke(GetHavipsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetHavipsResult>("alicloud:vpc/getHavips:getHavips", args ?? new GetHavipsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHavipsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Ha Vip IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Ha Vip name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of HaVip instance. Valid value: `Available`, `InUse` and `Pending`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetHavipsArgs()
        {
        }
        public static new GetHavipsArgs Empty => new GetHavipsArgs();
    }

    public sealed class GetHavipsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Ha Vip IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Ha Vip name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of HaVip instance. Valid value: `Available`, `InUse` and `Pending`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetHavipsInvokeArgs()
        {
        }
        public static new GetHavipsInvokeArgs Empty => new GetHavipsInvokeArgs();
    }


    [OutputType]
    public sealed class GetHavipsResult
    {
        public readonly ImmutableArray<Outputs.GetHavipsHavipResult> Havips;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetHavipsResult(
            ImmutableArray<Outputs.GetHavipsHavipResult> havips,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
            Havips = havips;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
