// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    public static class GetAscripts
    {
        /// <summary>
        /// This data source provides Alb Ascript available to the user.
        /// 
        /// &gt; **NOTE:** Available in 1.195.0+
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
        ///     var @default = AliCloud.Alb.GetAscripts.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudAlbAscript.Id,
        ///         },
        ///         NameRegex = defaultAlicloudAlbAscript.Name,
        ///         AscriptName = "test",
        ///         ListenerId = listenerId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudAlbAscriptExampleId"] = @default.Apply(@default =&gt; @default.Apply(getAscriptsResult =&gt; getAscriptsResult.Ascripts[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetAscriptsResult> InvokeAsync(GetAscriptsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAscriptsResult>("alicloud:alb/getAscripts:getAscripts", args ?? new GetAscriptsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Alb Ascript available to the user.
        /// 
        /// &gt; **NOTE:** Available in 1.195.0+
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
        ///     var @default = AliCloud.Alb.GetAscripts.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudAlbAscript.Id,
        ///         },
        ///         NameRegex = defaultAlicloudAlbAscript.Name,
        ///         AscriptName = "test",
        ///         ListenerId = listenerId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudAlbAscriptExampleId"] = @default.Apply(@default =&gt; @default.Apply(getAscriptsResult =&gt; getAscriptsResult.Ascripts[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAscriptsResult> Invoke(GetAscriptsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAscriptsResult>("alicloud:alb/getAscripts:getAscripts", args ?? new GetAscriptsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Alb Ascript available to the user.
        /// 
        /// &gt; **NOTE:** Available in 1.195.0+
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
        ///     var @default = AliCloud.Alb.GetAscripts.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudAlbAscript.Id,
        ///         },
        ///         NameRegex = defaultAlicloudAlbAscript.Name,
        ///         AscriptName = "test",
        ///         ListenerId = listenerId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudAlbAscriptExampleId"] = @default.Apply(@default =&gt; @default.Apply(getAscriptsResult =&gt; getAscriptsResult.Ascripts[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAscriptsResult> Invoke(GetAscriptsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAscriptsResult>("alicloud:alb/getAscripts:getAscripts", args ?? new GetAscriptsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAscriptsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Script name.
        /// </summary>
        [Input("ascriptName")]
        public string? AscriptName { get; set; }

        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of AScript IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Listener ID of script attribution
        /// </summary>
        [Input("listenerId")]
        public string? ListenerId { get; set; }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAscriptsArgs()
        {
        }
        public static new GetAscriptsArgs Empty => new GetAscriptsArgs();
    }

    public sealed class GetAscriptsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Script name.
        /// </summary>
        [Input("ascriptName")]
        public Input<string>? AscriptName { get; set; }

        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of AScript IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Listener ID of script attribution
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAscriptsInvokeArgs()
        {
        }
        public static new GetAscriptsInvokeArgs Empty => new GetAscriptsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAscriptsResult
    {
        /// <summary>
        /// Script name.
        /// </summary>
        public readonly string? AscriptName;
        /// <summary>
        /// A list of AScript Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAscriptsAscriptResult> Ascripts;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of AScript IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Listener ID of script attribution.
        /// </summary>
        public readonly string? ListenerId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of name of AScripts.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetAscriptsResult(
            string? ascriptName,

            ImmutableArray<Outputs.GetAscriptsAscriptResult> ascripts,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? listenerId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            AscriptName = ascriptName;
            Ascripts = ascripts;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            ListenerId = listenerId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
