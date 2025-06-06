// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetControlPolicyAttachments
    {
        /// <summary>
        /// This data source provides the Resource Manager Control Policy Attachments of the current Alibaba Cloud user.
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
        ///     var example = AliCloud.ResourceManager.GetControlPolicyAttachments.Invoke(new()
        ///     {
        ///         TargetId = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceManagerControlPolicyAttachmentId"] = example.Apply(getControlPolicyAttachmentsResult =&gt; getControlPolicyAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetControlPolicyAttachmentsResult> InvokeAsync(GetControlPolicyAttachmentsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetControlPolicyAttachmentsResult>("alicloud:resourcemanager/getControlPolicyAttachments:getControlPolicyAttachments", args ?? new GetControlPolicyAttachmentsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Control Policy Attachments of the current Alibaba Cloud user.
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
        ///     var example = AliCloud.ResourceManager.GetControlPolicyAttachments.Invoke(new()
        ///     {
        ///         TargetId = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceManagerControlPolicyAttachmentId"] = example.Apply(getControlPolicyAttachmentsResult =&gt; getControlPolicyAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetControlPolicyAttachmentsResult> Invoke(GetControlPolicyAttachmentsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetControlPolicyAttachmentsResult>("alicloud:resourcemanager/getControlPolicyAttachments:getControlPolicyAttachments", args ?? new GetControlPolicyAttachmentsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Control Policy Attachments of the current Alibaba Cloud user.
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
        ///     var example = AliCloud.ResourceManager.GetControlPolicyAttachments.Invoke(new()
        ///     {
        ///         TargetId = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstResourceManagerControlPolicyAttachmentId"] = example.Apply(getControlPolicyAttachmentsResult =&gt; getControlPolicyAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetControlPolicyAttachmentsResult> Invoke(GetControlPolicyAttachmentsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetControlPolicyAttachmentsResult>("alicloud:resourcemanager/getControlPolicyAttachments:getControlPolicyAttachments", args ?? new GetControlPolicyAttachmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetControlPolicyAttachmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`
        /// </summary>
        [Input("language")]
        public string? Language { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The policy type of control policy. Valid values: `Custom` and `System`.
        /// </summary>
        [Input("policyType")]
        public string? PolicyType { get; set; }

        /// <summary>
        /// The Id of target.
        /// </summary>
        [Input("targetId", required: true)]
        public string TargetId { get; set; } = null!;

        public GetControlPolicyAttachmentsArgs()
        {
        }
        public static new GetControlPolicyAttachmentsArgs Empty => new GetControlPolicyAttachmentsArgs();
    }

    public sealed class GetControlPolicyAttachmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The policy type of control policy. Valid values: `Custom` and `System`.
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        /// <summary>
        /// The Id of target.
        /// </summary>
        [Input("targetId", required: true)]
        public Input<string> TargetId { get; set; } = null!;

        public GetControlPolicyAttachmentsInvokeArgs()
        {
        }
        public static new GetControlPolicyAttachmentsInvokeArgs Empty => new GetControlPolicyAttachmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetControlPolicyAttachmentsResult
    {
        public readonly ImmutableArray<Outputs.GetControlPolicyAttachmentsAttachmentResult> Attachments;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Language;
        public readonly string? OutputFile;
        public readonly string? PolicyType;
        public readonly string TargetId;

        [OutputConstructor]
        private GetControlPolicyAttachmentsResult(
            ImmutableArray<Outputs.GetControlPolicyAttachmentsAttachmentResult> attachments,

            string id,

            ImmutableArray<string> ids,

            string? language,

            string? outputFile,

            string? policyType,

            string targetId)
        {
            Attachments = attachments;
            Id = id;
            Ids = ids;
            Language = language;
            OutputFile = outputFile;
            PolicyType = policyType;
            TargetId = targetId;
        }
    }
}
