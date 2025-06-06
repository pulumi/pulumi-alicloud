// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ehpc
{
    public static class GetJobTemplates
    {
        /// <summary>
        /// This data source provides the Ehpc Job Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.133.0.
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
        ///     var @default = new AliCloud.Ehpc.JobTemplate("default", new()
        ///     {
        ///         JobTemplateName = "example_value",
        ///         CommandLine = "./LammpsTest/lammps.pbs",
        ///     });
        /// 
        ///     var ids = AliCloud.Ehpc.GetJobTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ehpcJobTemplateId1"] = ids.Apply(getJobTemplatesResult =&gt; getJobTemplatesResult.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetJobTemplatesResult> InvokeAsync(GetJobTemplatesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetJobTemplatesResult>("alicloud:ehpc/getJobTemplates:getJobTemplates", args ?? new GetJobTemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ehpc Job Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.133.0.
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
        ///     var @default = new AliCloud.Ehpc.JobTemplate("default", new()
        ///     {
        ///         JobTemplateName = "example_value",
        ///         CommandLine = "./LammpsTest/lammps.pbs",
        ///     });
        /// 
        ///     var ids = AliCloud.Ehpc.GetJobTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ehpcJobTemplateId1"] = ids.Apply(getJobTemplatesResult =&gt; getJobTemplatesResult.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetJobTemplatesResult> Invoke(GetJobTemplatesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetJobTemplatesResult>("alicloud:ehpc/getJobTemplates:getJobTemplates", args ?? new GetJobTemplatesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ehpc Job Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.133.0.
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
        ///     var @default = new AliCloud.Ehpc.JobTemplate("default", new()
        ///     {
        ///         JobTemplateName = "example_value",
        ///         CommandLine = "./LammpsTest/lammps.pbs",
        ///     });
        /// 
        ///     var ids = AliCloud.Ehpc.GetJobTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             @default.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ehpcJobTemplateId1"] = ids.Apply(getJobTemplatesResult =&gt; getJobTemplatesResult.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetJobTemplatesResult> Invoke(GetJobTemplatesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetJobTemplatesResult>("alicloud:ehpc/getJobTemplates:getJobTemplates", args ?? new GetJobTemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetJobTemplatesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Job Template IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetJobTemplatesArgs()
        {
        }
        public static new GetJobTemplatesArgs Empty => new GetJobTemplatesArgs();
    }

    public sealed class GetJobTemplatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Job Template IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetJobTemplatesInvokeArgs()
        {
        }
        public static new GetJobTemplatesInvokeArgs Empty => new GetJobTemplatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetJobTemplatesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Ehpc Job Templates. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJobTemplatesTemplateResult> Templates;

        [OutputConstructor]
        private GetJobTemplatesResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetJobTemplatesTemplateResult> templates)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Templates = templates;
        }
    }
}
