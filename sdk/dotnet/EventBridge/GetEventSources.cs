// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge
{
    public static class GetEventSources
    {
        /// <summary>
        /// This data source provides the Event Bridge Event Sources of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.130.0+.
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
        ///     var example = AliCloud.EventBridge.GetEventSources.Invoke(new()
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
        ///         ["firstEventBridgeEventSourceId"] = example.Apply(getEventSourcesResult =&gt; getEventSourcesResult.Sources[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEventSourcesResult> InvokeAsync(GetEventSourcesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventSourcesResult>("alicloud:eventbridge/getEventSources:getEventSources", args ?? new GetEventSourcesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Event Bridge Event Sources of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.130.0+.
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
        ///     var example = AliCloud.EventBridge.GetEventSources.Invoke(new()
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
        ///         ["firstEventBridgeEventSourceId"] = example.Apply(getEventSourcesResult =&gt; getEventSourcesResult.Sources[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventSourcesResult> Invoke(GetEventSourcesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventSourcesResult>("alicloud:eventbridge/getEventSources:getEventSources", args ?? new GetEventSourcesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Event Bridge Event Sources of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.130.0+.
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
        ///     var example = AliCloud.EventBridge.GetEventSources.Invoke(new()
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
        ///         ["firstEventBridgeEventSourceId"] = example.Apply(getEventSourcesResult =&gt; getEventSourcesResult.Sources[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEventSourcesResult> Invoke(GetEventSourcesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventSourcesResult>("alicloud:eventbridge/getEventSources:getEventSources", args ?? new GetEventSourcesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventSourcesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Event Source IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Event Source name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetEventSourcesArgs()
        {
        }
        public static new GetEventSourcesArgs Empty => new GetEventSourcesArgs();
    }

    public sealed class GetEventSourcesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Event Source IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Event Source name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetEventSourcesInvokeArgs()
        {
        }
        public static new GetEventSourcesInvokeArgs Empty => new GetEventSourcesInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventSourcesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetEventSourcesSourceResult> Sources;

        [OutputConstructor]
        private GetEventSourcesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetEventSourcesSourceResult> sources)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Sources = sources;
        }
    }
}
