// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static class GetAttachments
    {
        /// <summary>
        /// This data source provides the server load balancer attachments of the current Alibaba Cloud user.
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
        ///     var sampleDs = AliCloud.Slb.GetAttachments.Invoke(new()
        ///     {
        ///         LoadBalancerId = sampleSlb.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbAttachmentInstanceId"] = sampleDs.Apply(getAttachmentsResult =&gt; getAttachmentsResult.SlbAttachments[0]?.InstanceId),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetAttachmentsResult> InvokeAsync(GetAttachmentsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAttachmentsResult>("alicloud:slb/getAttachments:getAttachments", args ?? new GetAttachmentsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the server load balancer attachments of the current Alibaba Cloud user.
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
        ///     var sampleDs = AliCloud.Slb.GetAttachments.Invoke(new()
        ///     {
        ///         LoadBalancerId = sampleSlb.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbAttachmentInstanceId"] = sampleDs.Apply(getAttachmentsResult =&gt; getAttachmentsResult.SlbAttachments[0]?.InstanceId),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAttachmentsResult> Invoke(GetAttachmentsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAttachmentsResult>("alicloud:slb/getAttachments:getAttachments", args ?? new GetAttachmentsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the server load balancer attachments of the current Alibaba Cloud user.
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
        ///     var sampleDs = AliCloud.Slb.GetAttachments.Invoke(new()
        ///     {
        ///         LoadBalancerId = sampleSlb.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbAttachmentInstanceId"] = sampleDs.Apply(getAttachmentsResult =&gt; getAttachmentsResult.SlbAttachments[0]?.InstanceId),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAttachmentsResult> Invoke(GetAttachmentsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAttachmentsResult>("alicloud:slb/getAttachments:getAttachments", args ?? new GetAttachmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAttachmentsArgs : global::Pulumi.InvokeArgs
    {
        [Input("instanceIds")]
        private List<string>? _instanceIds;

        /// <summary>
        /// List of attached ECS instance IDs.
        /// </summary>
        public List<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new List<string>());
            set => _instanceIds = value;
        }

        /// <summary>
        /// ID of the SLB with attachments.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public string LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAttachmentsArgs()
        {
        }
        public static new GetAttachmentsArgs Empty => new GetAttachmentsArgs();
    }

    public sealed class GetAttachmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("instanceIds")]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// List of attached ECS instance IDs.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        /// <summary>
        /// ID of the SLB with attachments.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<string> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAttachmentsInvokeArgs()
        {
        }
        public static new GetAttachmentsInvokeArgs Empty => new GetAttachmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAttachmentsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> InstanceIds;
        public readonly string LoadBalancerId;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of SLB attachments. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAttachmentsSlbAttachmentResult> SlbAttachments;

        [OutputConstructor]
        private GetAttachmentsResult(
            string id,

            ImmutableArray<string> instanceIds,

            string loadBalancerId,

            string? outputFile,

            ImmutableArray<Outputs.GetAttachmentsSlbAttachmentResult> slbAttachments)
        {
            Id = id;
            InstanceIds = instanceIds;
            LoadBalancerId = loadBalancerId;
            OutputFile = outputFile;
            SlbAttachments = slbAttachments;
        }
    }
}
