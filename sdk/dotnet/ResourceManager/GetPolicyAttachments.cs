// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetPolicyAttachments
    {
        /// <summary>
        /// This data source provides the Resource Manager Policy Attachments of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.93.0+.
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
        ///     var example = AliCloud.ResourceManager.GetPolicyAttachments.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstAttachmentId"] = example.Apply(getPolicyAttachmentsResult =&gt; getPolicyAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetPolicyAttachmentsResult> InvokeAsync(GetPolicyAttachmentsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPolicyAttachmentsResult>("alicloud:resourcemanager/getPolicyAttachments:getPolicyAttachments", args ?? new GetPolicyAttachmentsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Policy Attachments of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.93.0+.
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
        ///     var example = AliCloud.ResourceManager.GetPolicyAttachments.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstAttachmentId"] = example.Apply(getPolicyAttachmentsResult =&gt; getPolicyAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicyAttachmentsResult> Invoke(GetPolicyAttachmentsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicyAttachmentsResult>("alicloud:resourcemanager/getPolicyAttachments:getPolicyAttachments", args ?? new GetPolicyAttachmentsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Policy Attachments of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.93.0+.
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
        ///     var example = AliCloud.ResourceManager.GetPolicyAttachments.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstAttachmentId"] = example.Apply(getPolicyAttachmentsResult =&gt; getPolicyAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicyAttachmentsResult> Invoke(GetPolicyAttachmentsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicyAttachmentsResult>("alicloud:resourcemanager/getPolicyAttachments:getPolicyAttachments", args ?? new GetPolicyAttachmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPolicyAttachmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The language that is used to return the description of the system policy. Valid values:`en`: English, `zh-CN`: Chinese, `ja`: Japanese.
        /// </summary>
        [Input("language")]
        public string? Language { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of the policy. The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
        /// </summary>
        [Input("policyName")]
        public string? PolicyName { get; set; }

        /// <summary>
        /// The type of the policy. Valid values: `Custom` and `System`.
        /// </summary>
        [Input("policyType")]
        public string? PolicyType { get; set; }

        /// <summary>
        /// The name of the object to which the policy is attached.
        /// </summary>
        [Input("principalName")]
        public string? PrincipalName { get; set; }

        /// <summary>
        /// The type of the object to which the policy is attached. If you do not specify this parameter, the system lists all types of objects. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
        /// </summary>
        [Input("principalType")]
        public string? PrincipalType { get; set; }

        /// <summary>
        /// The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs. If you do not specify this parameter, the system lists all policy attachment records under the current account.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        public GetPolicyAttachmentsArgs()
        {
        }
        public static new GetPolicyAttachmentsArgs Empty => new GetPolicyAttachmentsArgs();
    }

    public sealed class GetPolicyAttachmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The language that is used to return the description of the system policy. Valid values:`en`: English, `zh-CN`: Chinese, `ja`: Japanese.
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of the policy. The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
        /// </summary>
        [Input("policyName")]
        public Input<string>? PolicyName { get; set; }

        /// <summary>
        /// The type of the policy. Valid values: `Custom` and `System`.
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        /// <summary>
        /// The name of the object to which the policy is attached.
        /// </summary>
        [Input("principalName")]
        public Input<string>? PrincipalName { get; set; }

        /// <summary>
        /// The type of the object to which the policy is attached. If you do not specify this parameter, the system lists all types of objects. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
        /// </summary>
        [Input("principalType")]
        public Input<string>? PrincipalType { get; set; }

        /// <summary>
        /// The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs. If you do not specify this parameter, the system lists all policy attachment records under the current account.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        public GetPolicyAttachmentsInvokeArgs()
        {
        }
        public static new GetPolicyAttachmentsInvokeArgs Empty => new GetPolicyAttachmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetPolicyAttachmentsResult
    {
        /// <summary>
        /// A list of Resource Manager Policy Attachment. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPolicyAttachmentsAttachmentResult> Attachments;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Resource Manager Policy Attachment IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? Language;
        public readonly string? OutputFile;
        /// <summary>
        /// The name of the policy.
        /// </summary>
        public readonly string? PolicyName;
        /// <summary>
        /// The type of the policy.
        /// </summary>
        public readonly string? PolicyType;
        /// <summary>
        /// The name of the object to which the policy is attached.
        /// </summary>
        public readonly string? PrincipalName;
        /// <summary>
        /// The type of the object to which the policy is attached.
        /// </summary>
        public readonly string? PrincipalType;
        /// <summary>
        /// The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
        /// </summary>
        public readonly string? ResourceGroupId;

        [OutputConstructor]
        private GetPolicyAttachmentsResult(
            ImmutableArray<Outputs.GetPolicyAttachmentsAttachmentResult> attachments,

            string id,

            ImmutableArray<string> ids,

            string? language,

            string? outputFile,

            string? policyName,

            string? policyType,

            string? principalName,

            string? principalType,

            string? resourceGroupId)
        {
            Attachments = attachments;
            Id = id;
            Ids = ids;
            Language = language;
            OutputFile = outputFile;
            PolicyName = policyName;
            PolicyType = policyType;
            PrincipalName = principalName;
            PrincipalType = principalType;
            ResourceGroupId = resourceGroupId;
        }
    }
}
