// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetTransitRouterVpnAttachments
    {
        /// <summary>
        /// This data source provides Cen Transit Router Vpn Attachment available to the user.[What is Transit Router Vpn Attachment](https://next.api.alibabacloud.com/document/Cbn/2017-09-12/CreateTransitRouterVpnAttachment)
        /// 
        /// &gt; **NOTE:** Available since v1.183.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = AliCloud.GetAccount.Invoke();
        /// 
        ///     var defaultInstance = new AliCloud.Cen.Instance("default", new()
        ///     {
        ///         CenInstanceName = name,
        ///     });
        /// 
        ///     var defaultTransitRouter = new AliCloud.Cen.TransitRouter("default", new()
        ///     {
        ///         CenId = defaultInstance.Id,
        ///     });
        /// 
        ///     var defaultTransitRouterCidr = new AliCloud.Cen.TransitRouterCidr("default", new()
        ///     {
        ///         Cidr = "192.168.10.0/24",
        ///         TransitRouterId = defaultTransitRouter.TransitRouterId,
        ///         PublishCidrRoute = true,
        ///     });
        /// 
        ///     var defaultCustomerGateway = new AliCloud.Vpn.CustomerGateway("default", new()
        ///     {
        ///         IpAddress = "1.1.1.8",
        ///         CustomerGatewayName = name,
        ///     }, new CustomResourceOptions
        ///     {
        ///         DependsOn =
        ///         {
        ///             defaultTransitRouterCidr,
        ///         },
        ///     });
        /// 
        ///     var defaultGatewayVpnAttachment = new AliCloud.Vpn.GatewayVpnAttachment("default", new()
        ///     {
        ///         NetworkType = "public",
        ///         LocalSubnet = "0.0.0.0/0",
        ///         EnableTunnelsBgp = false,
        ///         VpnAttachmentName = name,
        ///         TunnelOptionsSpecifications = new[]
        ///         {
        ///             new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationArgs
        ///             {
        ///                 CustomerGatewayId = defaultCustomerGateway.Id,
        ///                 EnableDpd = true,
        ///                 EnableNatTraversal = true,
        ///                 TunnelIndex = 1,
        ///                 TunnelIkeConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs
        ///                 {
        ///                     RemoteId = "2.2.2.2",
        ///                     IkeEncAlg = "aes",
        ///                     IkeMode = "main",
        ///                     IkeVersion = "ikev1",
        ///                     LocalId = "1.1.1.1",
        ///                     IkeAuthAlg = "md5",
        ///                     IkeLifetime = 86100,
        ///                     IkePfs = "group2",
        ///                     Psk = "12345678",
        ///                 },
        ///                 TunnelIpsecConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIpsecConfigArgs
        ///                 {
        ///                     IpsecAuthAlg = "md5",
        ///                     IpsecEncAlg = "aes",
        ///                     IpsecLifetime = 86200,
        ///                     IpsecPfs = "group5",
        ///                 },
        ///             },
        ///             new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationArgs
        ///             {
        ///                 EnableNatTraversal = true,
        ///                 TunnelIndex = 2,
        ///                 TunnelIkeConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs
        ///                 {
        ///                     LocalId = "4.4.4.4",
        ///                     RemoteId = "5.5.5.5",
        ///                     IkeLifetime = 86400,
        ///                     IkePfs = "group5",
        ///                     IkeMode = "main",
        ///                     IkeVersion = "ikev2",
        ///                     Psk = "32333442",
        ///                     IkeAuthAlg = "md5",
        ///                     IkeEncAlg = "aes",
        ///                 },
        ///                 TunnelIpsecConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIpsecConfigArgs
        ///                 {
        ///                     IpsecEncAlg = "aes",
        ///                     IpsecLifetime = 86400,
        ///                     IpsecPfs = "group5",
        ///                     IpsecAuthAlg = "sha256",
        ///                 },
        ///                 CustomerGatewayId = defaultCustomerGateway.Id,
        ///                 EnableDpd = true,
        ///             },
        ///         },
        ///         RemoteSubnet = "0.0.0.0/0",
        ///     });
        /// 
        ///     var defaultTransitRouterVpnAttachment = new AliCloud.Cen.TransitRouterVpnAttachment("default", new()
        ///     {
        ///         AutoPublishRouteEnabled = false,
        ///         TransitRouterAttachmentDescription = name,
        ///         TransitRouterAttachmentName = name,
        ///         CenId = defaultTransitRouter.CenId,
        ///         TransitRouterId = defaultTransitRouter.TransitRouterId,
        ///         VpnId = defaultGatewayVpnAttachment.Id,
        ///         VpnOwnerId = @default.Apply(@default =&gt; @default.Apply(getAccountResult =&gt; getAccountResult.Id)),
        ///         ChargeType = "POSTPAY",
        ///         Tags = 
        ///         {
        ///             { "Created", "TF" },
        ///             { "For", "VpnAttachment" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Cen.GetTransitRouterVpnAttachments.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultTransitRouterVpnAttachment.Id,
        ///         },
        ///         CenId = defaultTransitRouterVpnAttachment.CenId,
        ///         TransitRouterId = defaultTransitRouterVpnAttachment.TransitRouterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cenTransitRouterVpnAttachmentId0"] = ids.Apply(getTransitRouterVpnAttachmentsResult =&gt; getTransitRouterVpnAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTransitRouterVpnAttachmentsResult> InvokeAsync(GetTransitRouterVpnAttachmentsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransitRouterVpnAttachmentsResult>("alicloud:cen/getTransitRouterVpnAttachments:getTransitRouterVpnAttachments", args ?? new GetTransitRouterVpnAttachmentsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Cen Transit Router Vpn Attachment available to the user.[What is Transit Router Vpn Attachment](https://next.api.alibabacloud.com/document/Cbn/2017-09-12/CreateTransitRouterVpnAttachment)
        /// 
        /// &gt; **NOTE:** Available since v1.183.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = AliCloud.GetAccount.Invoke();
        /// 
        ///     var defaultInstance = new AliCloud.Cen.Instance("default", new()
        ///     {
        ///         CenInstanceName = name,
        ///     });
        /// 
        ///     var defaultTransitRouter = new AliCloud.Cen.TransitRouter("default", new()
        ///     {
        ///         CenId = defaultInstance.Id,
        ///     });
        /// 
        ///     var defaultTransitRouterCidr = new AliCloud.Cen.TransitRouterCidr("default", new()
        ///     {
        ///         Cidr = "192.168.10.0/24",
        ///         TransitRouterId = defaultTransitRouter.TransitRouterId,
        ///         PublishCidrRoute = true,
        ///     });
        /// 
        ///     var defaultCustomerGateway = new AliCloud.Vpn.CustomerGateway("default", new()
        ///     {
        ///         IpAddress = "1.1.1.8",
        ///         CustomerGatewayName = name,
        ///     }, new CustomResourceOptions
        ///     {
        ///         DependsOn =
        ///         {
        ///             defaultTransitRouterCidr,
        ///         },
        ///     });
        /// 
        ///     var defaultGatewayVpnAttachment = new AliCloud.Vpn.GatewayVpnAttachment("default", new()
        ///     {
        ///         NetworkType = "public",
        ///         LocalSubnet = "0.0.0.0/0",
        ///         EnableTunnelsBgp = false,
        ///         VpnAttachmentName = name,
        ///         TunnelOptionsSpecifications = new[]
        ///         {
        ///             new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationArgs
        ///             {
        ///                 CustomerGatewayId = defaultCustomerGateway.Id,
        ///                 EnableDpd = true,
        ///                 EnableNatTraversal = true,
        ///                 TunnelIndex = 1,
        ///                 TunnelIkeConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs
        ///                 {
        ///                     RemoteId = "2.2.2.2",
        ///                     IkeEncAlg = "aes",
        ///                     IkeMode = "main",
        ///                     IkeVersion = "ikev1",
        ///                     LocalId = "1.1.1.1",
        ///                     IkeAuthAlg = "md5",
        ///                     IkeLifetime = 86100,
        ///                     IkePfs = "group2",
        ///                     Psk = "12345678",
        ///                 },
        ///                 TunnelIpsecConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIpsecConfigArgs
        ///                 {
        ///                     IpsecAuthAlg = "md5",
        ///                     IpsecEncAlg = "aes",
        ///                     IpsecLifetime = 86200,
        ///                     IpsecPfs = "group5",
        ///                 },
        ///             },
        ///             new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationArgs
        ///             {
        ///                 EnableNatTraversal = true,
        ///                 TunnelIndex = 2,
        ///                 TunnelIkeConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs
        ///                 {
        ///                     LocalId = "4.4.4.4",
        ///                     RemoteId = "5.5.5.5",
        ///                     IkeLifetime = 86400,
        ///                     IkePfs = "group5",
        ///                     IkeMode = "main",
        ///                     IkeVersion = "ikev2",
        ///                     Psk = "32333442",
        ///                     IkeAuthAlg = "md5",
        ///                     IkeEncAlg = "aes",
        ///                 },
        ///                 TunnelIpsecConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIpsecConfigArgs
        ///                 {
        ///                     IpsecEncAlg = "aes",
        ///                     IpsecLifetime = 86400,
        ///                     IpsecPfs = "group5",
        ///                     IpsecAuthAlg = "sha256",
        ///                 },
        ///                 CustomerGatewayId = defaultCustomerGateway.Id,
        ///                 EnableDpd = true,
        ///             },
        ///         },
        ///         RemoteSubnet = "0.0.0.0/0",
        ///     });
        /// 
        ///     var defaultTransitRouterVpnAttachment = new AliCloud.Cen.TransitRouterVpnAttachment("default", new()
        ///     {
        ///         AutoPublishRouteEnabled = false,
        ///         TransitRouterAttachmentDescription = name,
        ///         TransitRouterAttachmentName = name,
        ///         CenId = defaultTransitRouter.CenId,
        ///         TransitRouterId = defaultTransitRouter.TransitRouterId,
        ///         VpnId = defaultGatewayVpnAttachment.Id,
        ///         VpnOwnerId = @default.Apply(@default =&gt; @default.Apply(getAccountResult =&gt; getAccountResult.Id)),
        ///         ChargeType = "POSTPAY",
        ///         Tags = 
        ///         {
        ///             { "Created", "TF" },
        ///             { "For", "VpnAttachment" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Cen.GetTransitRouterVpnAttachments.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultTransitRouterVpnAttachment.Id,
        ///         },
        ///         CenId = defaultTransitRouterVpnAttachment.CenId,
        ///         TransitRouterId = defaultTransitRouterVpnAttachment.TransitRouterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cenTransitRouterVpnAttachmentId0"] = ids.Apply(getTransitRouterVpnAttachmentsResult =&gt; getTransitRouterVpnAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTransitRouterVpnAttachmentsResult> Invoke(GetTransitRouterVpnAttachmentsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransitRouterVpnAttachmentsResult>("alicloud:cen/getTransitRouterVpnAttachments:getTransitRouterVpnAttachments", args ?? new GetTransitRouterVpnAttachmentsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Cen Transit Router Vpn Attachment available to the user.[What is Transit Router Vpn Attachment](https://next.api.alibabacloud.com/document/Cbn/2017-09-12/CreateTransitRouterVpnAttachment)
        /// 
        /// &gt; **NOTE:** Available since v1.183.0.
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
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = AliCloud.GetAccount.Invoke();
        /// 
        ///     var defaultInstance = new AliCloud.Cen.Instance("default", new()
        ///     {
        ///         CenInstanceName = name,
        ///     });
        /// 
        ///     var defaultTransitRouter = new AliCloud.Cen.TransitRouter("default", new()
        ///     {
        ///         CenId = defaultInstance.Id,
        ///     });
        /// 
        ///     var defaultTransitRouterCidr = new AliCloud.Cen.TransitRouterCidr("default", new()
        ///     {
        ///         Cidr = "192.168.10.0/24",
        ///         TransitRouterId = defaultTransitRouter.TransitRouterId,
        ///         PublishCidrRoute = true,
        ///     });
        /// 
        ///     var defaultCustomerGateway = new AliCloud.Vpn.CustomerGateway("default", new()
        ///     {
        ///         IpAddress = "1.1.1.8",
        ///         CustomerGatewayName = name,
        ///     }, new CustomResourceOptions
        ///     {
        ///         DependsOn =
        ///         {
        ///             defaultTransitRouterCidr,
        ///         },
        ///     });
        /// 
        ///     var defaultGatewayVpnAttachment = new AliCloud.Vpn.GatewayVpnAttachment("default", new()
        ///     {
        ///         NetworkType = "public",
        ///         LocalSubnet = "0.0.0.0/0",
        ///         EnableTunnelsBgp = false,
        ///         VpnAttachmentName = name,
        ///         TunnelOptionsSpecifications = new[]
        ///         {
        ///             new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationArgs
        ///             {
        ///                 CustomerGatewayId = defaultCustomerGateway.Id,
        ///                 EnableDpd = true,
        ///                 EnableNatTraversal = true,
        ///                 TunnelIndex = 1,
        ///                 TunnelIkeConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs
        ///                 {
        ///                     RemoteId = "2.2.2.2",
        ///                     IkeEncAlg = "aes",
        ///                     IkeMode = "main",
        ///                     IkeVersion = "ikev1",
        ///                     LocalId = "1.1.1.1",
        ///                     IkeAuthAlg = "md5",
        ///                     IkeLifetime = 86100,
        ///                     IkePfs = "group2",
        ///                     Psk = "12345678",
        ///                 },
        ///                 TunnelIpsecConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIpsecConfigArgs
        ///                 {
        ///                     IpsecAuthAlg = "md5",
        ///                     IpsecEncAlg = "aes",
        ///                     IpsecLifetime = 86200,
        ///                     IpsecPfs = "group5",
        ///                 },
        ///             },
        ///             new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationArgs
        ///             {
        ///                 EnableNatTraversal = true,
        ///                 TunnelIndex = 2,
        ///                 TunnelIkeConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs
        ///                 {
        ///                     LocalId = "4.4.4.4",
        ///                     RemoteId = "5.5.5.5",
        ///                     IkeLifetime = 86400,
        ///                     IkePfs = "group5",
        ///                     IkeMode = "main",
        ///                     IkeVersion = "ikev2",
        ///                     Psk = "32333442",
        ///                     IkeAuthAlg = "md5",
        ///                     IkeEncAlg = "aes",
        ///                 },
        ///                 TunnelIpsecConfig = new AliCloud.Vpn.Inputs.GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIpsecConfigArgs
        ///                 {
        ///                     IpsecEncAlg = "aes",
        ///                     IpsecLifetime = 86400,
        ///                     IpsecPfs = "group5",
        ///                     IpsecAuthAlg = "sha256",
        ///                 },
        ///                 CustomerGatewayId = defaultCustomerGateway.Id,
        ///                 EnableDpd = true,
        ///             },
        ///         },
        ///         RemoteSubnet = "0.0.0.0/0",
        ///     });
        /// 
        ///     var defaultTransitRouterVpnAttachment = new AliCloud.Cen.TransitRouterVpnAttachment("default", new()
        ///     {
        ///         AutoPublishRouteEnabled = false,
        ///         TransitRouterAttachmentDescription = name,
        ///         TransitRouterAttachmentName = name,
        ///         CenId = defaultTransitRouter.CenId,
        ///         TransitRouterId = defaultTransitRouter.TransitRouterId,
        ///         VpnId = defaultGatewayVpnAttachment.Id,
        ///         VpnOwnerId = @default.Apply(@default =&gt; @default.Apply(getAccountResult =&gt; getAccountResult.Id)),
        ///         ChargeType = "POSTPAY",
        ///         Tags = 
        ///         {
        ///             { "Created", "TF" },
        ///             { "For", "VpnAttachment" },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Cen.GetTransitRouterVpnAttachments.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultTransitRouterVpnAttachment.Id,
        ///         },
        ///         CenId = defaultTransitRouterVpnAttachment.CenId,
        ///         TransitRouterId = defaultTransitRouterVpnAttachment.TransitRouterId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cenTransitRouterVpnAttachmentId0"] = ids.Apply(getTransitRouterVpnAttachmentsResult =&gt; getTransitRouterVpnAttachmentsResult.Attachments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTransitRouterVpnAttachmentsResult> Invoke(GetTransitRouterVpnAttachmentsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransitRouterVpnAttachmentsResult>("alicloud:cen/getTransitRouterVpnAttachments:getTransitRouterVpnAttachments", args ?? new GetTransitRouterVpnAttachmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransitRouterVpnAttachmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Cloud Enterprise Network (CEN) instance.
        /// </summary>
        [Input("cenId")]
        public string? CenId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Transit Router Vpn Attachment IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Transit Router Vpn Attachment name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Status of Transit Router Vpn Attachment. Valid values: `Attached`, `Attaching`, `Detaching`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the VPN attachment.
        /// </summary>
        [Input("transitRouterAttachmentId")]
        public string? TransitRouterAttachmentId { get; set; }

        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        [Input("transitRouterId")]
        public string? TransitRouterId { get; set; }

        public GetTransitRouterVpnAttachmentsArgs()
        {
        }
        public static new GetTransitRouterVpnAttachmentsArgs Empty => new GetTransitRouterVpnAttachmentsArgs();
    }

    public sealed class GetTransitRouterVpnAttachmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Cloud Enterprise Network (CEN) instance.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Transit Router Vpn Attachment IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Transit Router Vpn Attachment name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Status of Transit Router Vpn Attachment. Valid values: `Attached`, `Attaching`, `Detaching`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the VPN attachment.
        /// </summary>
        [Input("transitRouterAttachmentId")]
        public Input<string>? TransitRouterAttachmentId { get; set; }

        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        [Input("transitRouterId")]
        public Input<string>? TransitRouterId { get; set; }

        public GetTransitRouterVpnAttachmentsInvokeArgs()
        {
        }
        public static new GetTransitRouterVpnAttachmentsInvokeArgs Empty => new GetTransitRouterVpnAttachmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransitRouterVpnAttachmentsResult
    {
        /// <summary>
        /// A list of Transit Router Vpn Attachment Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTransitRouterVpnAttachmentsAttachmentResult> Attachments;
        /// <summary>
        /// (Available since v1.245.0) The ID of the Cloud Enterprise Network (CEN) instance.
        /// </summary>
        public readonly string? CenId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of name of Transit Router Vpn Attachments.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the VPN connection.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// (Available since v1.245.0) The tag of the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// (Available since v1.245.0) The ID of the VPN attachment.
        /// </summary>
        public readonly string? TransitRouterAttachmentId;
        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        public readonly string? TransitRouterId;

        [OutputConstructor]
        private GetTransitRouterVpnAttachmentsResult(
            ImmutableArray<Outputs.GetTransitRouterVpnAttachmentsAttachmentResult> attachments,

            string? cenId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status,

            ImmutableDictionary<string, string>? tags,

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
            Tags = tags;
            TransitRouterAttachmentId = transitRouterAttachmentId;
            TransitRouterId = transitRouterId;
        }
    }
}
