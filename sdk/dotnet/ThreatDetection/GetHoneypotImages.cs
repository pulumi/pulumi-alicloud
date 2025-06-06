// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection
{
    public static class GetHoneypotImages
    {
        /// <summary>
        /// This data source provides Threat Detection Honeypot Image available to the user.[What is Honeypot Image](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-listavailablehoneypot)
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
        ///     var @default = AliCloud.ThreatDetection.GetHoneypotImages.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "sha256:02882320c9a55303410127c5dc4ae2dc470150f9d7f2483102d994f5e5f4d9df",
        ///         },
        ///         NameRegex = "^meta",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudThreatDetectionHoneypotImageExampleId"] = @default.Apply(@default =&gt; @default.Apply(getHoneypotImagesResult =&gt; getHoneypotImagesResult.Images[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetHoneypotImagesResult> InvokeAsync(GetHoneypotImagesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHoneypotImagesResult>("alicloud:threatdetection/getHoneypotImages:getHoneypotImages", args ?? new GetHoneypotImagesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Threat Detection Honeypot Image available to the user.[What is Honeypot Image](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-listavailablehoneypot)
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
        ///     var @default = AliCloud.ThreatDetection.GetHoneypotImages.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "sha256:02882320c9a55303410127c5dc4ae2dc470150f9d7f2483102d994f5e5f4d9df",
        ///         },
        ///         NameRegex = "^meta",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudThreatDetectionHoneypotImageExampleId"] = @default.Apply(@default =&gt; @default.Apply(getHoneypotImagesResult =&gt; getHoneypotImagesResult.Images[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetHoneypotImagesResult> Invoke(GetHoneypotImagesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHoneypotImagesResult>("alicloud:threatdetection/getHoneypotImages:getHoneypotImages", args ?? new GetHoneypotImagesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Threat Detection Honeypot Image available to the user.[What is Honeypot Image](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-listavailablehoneypot)
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
        ///     var @default = AliCloud.ThreatDetection.GetHoneypotImages.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "sha256:02882320c9a55303410127c5dc4ae2dc470150f9d7f2483102d994f5e5f4d9df",
        ///         },
        ///         NameRegex = "^meta",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudThreatDetectionHoneypotImageExampleId"] = @default.Apply(@default =&gt; @default.Apply(getHoneypotImagesResult =&gt; getHoneypotImagesResult.Images[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetHoneypotImagesResult> Invoke(GetHoneypotImagesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetHoneypotImagesResult>("alicloud:threatdetection/getHoneypotImages:getHoneypotImages", args ?? new GetHoneypotImagesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHoneypotImagesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Honeypot Image IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Honeypot mirror nam.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("nodeId")]
        public string? NodeId { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetHoneypotImagesArgs()
        {
        }
        public static new GetHoneypotImagesArgs Empty => new GetHoneypotImagesArgs();
    }

    public sealed class GetHoneypotImagesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Honeypot Image IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Honeypot mirror nam.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetHoneypotImagesInvokeArgs()
        {
        }
        public static new GetHoneypotImagesInvokeArgs Empty => new GetHoneypotImagesInvokeArgs();
    }


    [OutputType]
    public sealed class GetHoneypotImagesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Honeypot Image IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of Honeypot Image Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHoneypotImagesImageResult> Images;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of name of Honeypot Images.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? NodeId;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetHoneypotImagesResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetHoneypotImagesImageResult> images,

            string? nameRegex,

            ImmutableArray<string> names,

            string? nodeId,

            string? outputFile)
        {
            Id = id;
            Ids = ids;
            Images = images;
            NameRegex = nameRegex;
            Names = names;
            NodeId = nodeId;
            OutputFile = outputFile;
        }
    }
}
