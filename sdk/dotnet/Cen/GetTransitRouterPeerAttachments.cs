// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetTransitRouterPeerAttachments
    {
        /// <summary>
        /// This data source provides CEN Transit Router peer attachments available to the user.
        /// 
        /// &gt; **NOTE:** Available in 1.128.0+
        /// </summary>
        public static Task<GetTransitRouterPeerAttachmentsResult> InvokeAsync(GetTransitRouterPeerAttachmentsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransitRouterPeerAttachmentsResult>("alicloud:cen/getTransitRouterPeerAttachments:getTransitRouterPeerAttachments", args ?? new GetTransitRouterPeerAttachmentsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides CEN Transit Router peer attachments available to the user.
        /// 
        /// &gt; **NOTE:** Available in 1.128.0+
        /// </summary>
        public static Output<GetTransitRouterPeerAttachmentsResult> Invoke(GetTransitRouterPeerAttachmentsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransitRouterPeerAttachmentsResult>("alicloud:cen/getTransitRouterPeerAttachments:getTransitRouterPeerAttachments", args ?? new GetTransitRouterPeerAttachmentsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides CEN Transit Router peer attachments available to the user.
        /// 
        /// &gt; **NOTE:** Available in 1.128.0+
        /// </summary>
        public static Output<GetTransitRouterPeerAttachmentsResult> Invoke(GetTransitRouterPeerAttachmentsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransitRouterPeerAttachmentsResult>("alicloud:cen/getTransitRouterPeerAttachments:getTransitRouterPeerAttachments", args ?? new GetTransitRouterPeerAttachmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransitRouterPeerAttachmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the CEN instance.
        /// </summary>
        [Input("cenId", required: true)]
        public string CenId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of CEN Transit Router peer attachments IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter CEN Transit Router peer attachments by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of CEN Transit Router peer attachment. Valid values `Attached`, `Attaching` and `Detaching`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The ID of CEN Transit Router peer attachments.
        /// </summary>
        [Input("transitRouterAttachmentId")]
        public string? TransitRouterAttachmentId { get; set; }

        /// <summary>
        /// The ID of transit router.
        /// </summary>
        [Input("transitRouterId")]
        public string? TransitRouterId { get; set; }

        public GetTransitRouterPeerAttachmentsArgs()
        {
        }
        public static new GetTransitRouterPeerAttachmentsArgs Empty => new GetTransitRouterPeerAttachmentsArgs();
    }

    public sealed class GetTransitRouterPeerAttachmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the CEN instance.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of CEN Transit Router peer attachments IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter CEN Transit Router peer attachments by name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of CEN Transit Router peer attachment. Valid values `Attached`, `Attaching` and `Detaching`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of CEN Transit Router peer attachments.
        /// </summary>
        [Input("transitRouterAttachmentId")]
        public Input<string>? TransitRouterAttachmentId { get; set; }

        /// <summary>
        /// The ID of transit router.
        /// </summary>
        [Input("transitRouterId")]
        public Input<string>? TransitRouterId { get; set; }

        public GetTransitRouterPeerAttachmentsInvokeArgs()
        {
        }
        public static new GetTransitRouterPeerAttachmentsInvokeArgs Empty => new GetTransitRouterPeerAttachmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransitRouterPeerAttachmentsResult
    {
        public readonly ImmutableArray<Outputs.GetTransitRouterPeerAttachmentsAttachmentResult> Attachments;
        public readonly string CenId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of CEN Transit Router peer attachments IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of CEN Transit Router peer attachments names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the transit router attachment.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// ID of the transit router attachment.
        /// </summary>
        public readonly string? TransitRouterAttachmentId;
        /// <summary>
        /// ID of the transit router.
        /// </summary>
        public readonly string? TransitRouterId;

        [OutputConstructor]
        private GetTransitRouterPeerAttachmentsResult(
            ImmutableArray<Outputs.GetTransitRouterPeerAttachmentsAttachmentResult> attachments,

            string cenId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status,

            string? transitRouterAttachmentId,

            string? transitRouterId)
        {
            Attachments = attachments;
            CenId = cenId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
            TransitRouterAttachmentId = transitRouterAttachmentId;
            TransitRouterId = transitRouterId;
        }
    }
}
