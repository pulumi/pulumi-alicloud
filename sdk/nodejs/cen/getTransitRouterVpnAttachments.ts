// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Cen Transit Router Vpn Attachment available to the user.[What is Transit Router Vpn Attachment](https://next.api.alibabacloud.com/document/Cbn/2017-09-12/CreateTransitRouterVpnAttachment)
 *
 * > **NOTE:** Available since v1.183.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = alicloud.getAccount({});
 * const defaultInstance = new alicloud.cen.Instance("default", {cenInstanceName: name});
 * const defaultTransitRouter = new alicloud.cen.TransitRouter("default", {cenId: defaultInstance.id});
 * const defaultTransitRouterCidr = new alicloud.cen.TransitRouterCidr("default", {
 *     cidr: "192.168.10.0/24",
 *     transitRouterId: defaultTransitRouter.transitRouterId,
 *     publishCidrRoute: true,
 * });
 * const defaultCustomerGateway = new alicloud.vpn.CustomerGateway("default", {
 *     ipAddress: "1.1.1.8",
 *     customerGatewayName: name,
 * }, {
 *     dependsOn: [defaultTransitRouterCidr],
 * });
 * const defaultGatewayVpnAttachment = new alicloud.vpn.GatewayVpnAttachment("default", {
 *     networkType: "public",
 *     localSubnet: "0.0.0.0/0",
 *     enableTunnelsBgp: false,
 *     vpnAttachmentName: name,
 *     tunnelOptionsSpecifications: [
 *         {
 *             customerGatewayId: defaultCustomerGateway.id,
 *             enableDpd: true,
 *             enableNatTraversal: true,
 *             tunnelIndex: 1,
 *             tunnelIkeConfig: {
 *                 remoteId: "2.2.2.2",
 *                 ikeEncAlg: "aes",
 *                 ikeMode: "main",
 *                 ikeVersion: "ikev1",
 *                 localId: "1.1.1.1",
 *                 ikeAuthAlg: "md5",
 *                 ikeLifetime: 86100,
 *                 ikePfs: "group2",
 *                 psk: "12345678",
 *             },
 *             tunnelIpsecConfig: {
 *                 ipsecAuthAlg: "md5",
 *                 ipsecEncAlg: "aes",
 *                 ipsecLifetime: 86200,
 *                 ipsecPfs: "group5",
 *             },
 *         },
 *         {
 *             enableNatTraversal: true,
 *             tunnelIndex: 2,
 *             tunnelIkeConfig: {
 *                 localId: "4.4.4.4",
 *                 remoteId: "5.5.5.5",
 *                 ikeLifetime: 86400,
 *                 ikePfs: "group5",
 *                 ikeMode: "main",
 *                 ikeVersion: "ikev2",
 *                 psk: "32333442",
 *                 ikeAuthAlg: "md5",
 *                 ikeEncAlg: "aes",
 *             },
 *             tunnelIpsecConfig: {
 *                 ipsecEncAlg: "aes",
 *                 ipsecLifetime: 86400,
 *                 ipsecPfs: "group5",
 *                 ipsecAuthAlg: "sha256",
 *             },
 *             customerGatewayId: defaultCustomerGateway.id,
 *             enableDpd: true,
 *         },
 *     ],
 *     remoteSubnet: "0.0.0.0/0",
 * });
 * const defaultTransitRouterVpnAttachment = new alicloud.cen.TransitRouterVpnAttachment("default", {
 *     autoPublishRouteEnabled: false,
 *     transitRouterAttachmentDescription: name,
 *     transitRouterAttachmentName: name,
 *     cenId: defaultTransitRouter.cenId,
 *     transitRouterId: defaultTransitRouter.transitRouterId,
 *     vpnId: defaultGatewayVpnAttachment.id,
 *     vpnOwnerId: _default.then(_default => _default.id),
 *     chargeType: "POSTPAY",
 *     tags: {
 *         Created: "TF",
 *         For: "VpnAttachment",
 *     },
 * });
 * const ids = pulumi.all([defaultTransitRouterVpnAttachment.id, defaultTransitRouterVpnAttachment.cenId, defaultTransitRouterVpnAttachment.transitRouterId]).apply(([id, cenId, transitRouterId]) => alicloud.cen.getTransitRouterVpnAttachmentsOutput({
 *     ids: [id],
 *     cenId: cenId,
 *     transitRouterId: transitRouterId,
 * }));
 * export const cenTransitRouterVpnAttachmentId0 = ids.apply(ids => ids.attachments?.[0]?.id);
 * ```
 */
export function getTransitRouterVpnAttachments(args?: GetTransitRouterVpnAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitRouterVpnAttachmentsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getTransitRouterVpnAttachments:getTransitRouterVpnAttachments", {
        "cenId": args.cenId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "tags": args.tags,
        "transitRouterAttachmentId": args.transitRouterAttachmentId,
        "transitRouterId": args.transitRouterId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterVpnAttachments.
 */
export interface GetTransitRouterVpnAttachmentsArgs {
    /**
     * The ID of the Cloud Enterprise Network (CEN) instance.
     */
    cenId?: string;
    /**
     * A list of Transit Router Vpn Attachment IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Transit Router Vpn Attachment name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The Status of Transit Router Vpn Attachment. Valid values: `Attached`, `Attaching`, `Detaching`.
     */
    status?: string;
    /**
     * The tag of the resource.
     */
    tags?: {[key: string]: string};
    /**
     * The ID of the VPN attachment.
     */
    transitRouterAttachmentId?: string;
    /**
     * The ID of the transit router.
     */
    transitRouterId?: string;
}

/**
 * A collection of values returned by getTransitRouterVpnAttachments.
 */
export interface GetTransitRouterVpnAttachmentsResult {
    /**
     * A list of Transit Router Vpn Attachment Entries. Each element contains the following attributes:
     */
    readonly attachments: outputs.cen.GetTransitRouterVpnAttachmentsAttachment[];
    /**
     * (Available since v1.245.0) The ID of the Cloud Enterprise Network (CEN) instance.
     */
    readonly cenId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of name of Transit Router Vpn Attachments.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The status of the VPN connection.
     */
    readonly status?: string;
    /**
     * (Available since v1.245.0) The tag of the resource.
     */
    readonly tags?: {[key: string]: string};
    /**
     * (Available since v1.245.0) The ID of the VPN attachment.
     */
    readonly transitRouterAttachmentId?: string;
    /**
     * The ID of the transit router.
     */
    readonly transitRouterId?: string;
}
/**
 * This data source provides Cen Transit Router Vpn Attachment available to the user.[What is Transit Router Vpn Attachment](https://next.api.alibabacloud.com/document/Cbn/2017-09-12/CreateTransitRouterVpnAttachment)
 *
 * > **NOTE:** Available since v1.183.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = alicloud.getAccount({});
 * const defaultInstance = new alicloud.cen.Instance("default", {cenInstanceName: name});
 * const defaultTransitRouter = new alicloud.cen.TransitRouter("default", {cenId: defaultInstance.id});
 * const defaultTransitRouterCidr = new alicloud.cen.TransitRouterCidr("default", {
 *     cidr: "192.168.10.0/24",
 *     transitRouterId: defaultTransitRouter.transitRouterId,
 *     publishCidrRoute: true,
 * });
 * const defaultCustomerGateway = new alicloud.vpn.CustomerGateway("default", {
 *     ipAddress: "1.1.1.8",
 *     customerGatewayName: name,
 * }, {
 *     dependsOn: [defaultTransitRouterCidr],
 * });
 * const defaultGatewayVpnAttachment = new alicloud.vpn.GatewayVpnAttachment("default", {
 *     networkType: "public",
 *     localSubnet: "0.0.0.0/0",
 *     enableTunnelsBgp: false,
 *     vpnAttachmentName: name,
 *     tunnelOptionsSpecifications: [
 *         {
 *             customerGatewayId: defaultCustomerGateway.id,
 *             enableDpd: true,
 *             enableNatTraversal: true,
 *             tunnelIndex: 1,
 *             tunnelIkeConfig: {
 *                 remoteId: "2.2.2.2",
 *                 ikeEncAlg: "aes",
 *                 ikeMode: "main",
 *                 ikeVersion: "ikev1",
 *                 localId: "1.1.1.1",
 *                 ikeAuthAlg: "md5",
 *                 ikeLifetime: 86100,
 *                 ikePfs: "group2",
 *                 psk: "12345678",
 *             },
 *             tunnelIpsecConfig: {
 *                 ipsecAuthAlg: "md5",
 *                 ipsecEncAlg: "aes",
 *                 ipsecLifetime: 86200,
 *                 ipsecPfs: "group5",
 *             },
 *         },
 *         {
 *             enableNatTraversal: true,
 *             tunnelIndex: 2,
 *             tunnelIkeConfig: {
 *                 localId: "4.4.4.4",
 *                 remoteId: "5.5.5.5",
 *                 ikeLifetime: 86400,
 *                 ikePfs: "group5",
 *                 ikeMode: "main",
 *                 ikeVersion: "ikev2",
 *                 psk: "32333442",
 *                 ikeAuthAlg: "md5",
 *                 ikeEncAlg: "aes",
 *             },
 *             tunnelIpsecConfig: {
 *                 ipsecEncAlg: "aes",
 *                 ipsecLifetime: 86400,
 *                 ipsecPfs: "group5",
 *                 ipsecAuthAlg: "sha256",
 *             },
 *             customerGatewayId: defaultCustomerGateway.id,
 *             enableDpd: true,
 *         },
 *     ],
 *     remoteSubnet: "0.0.0.0/0",
 * });
 * const defaultTransitRouterVpnAttachment = new alicloud.cen.TransitRouterVpnAttachment("default", {
 *     autoPublishRouteEnabled: false,
 *     transitRouterAttachmentDescription: name,
 *     transitRouterAttachmentName: name,
 *     cenId: defaultTransitRouter.cenId,
 *     transitRouterId: defaultTransitRouter.transitRouterId,
 *     vpnId: defaultGatewayVpnAttachment.id,
 *     vpnOwnerId: _default.then(_default => _default.id),
 *     chargeType: "POSTPAY",
 *     tags: {
 *         Created: "TF",
 *         For: "VpnAttachment",
 *     },
 * });
 * const ids = pulumi.all([defaultTransitRouterVpnAttachment.id, defaultTransitRouterVpnAttachment.cenId, defaultTransitRouterVpnAttachment.transitRouterId]).apply(([id, cenId, transitRouterId]) => alicloud.cen.getTransitRouterVpnAttachmentsOutput({
 *     ids: [id],
 *     cenId: cenId,
 *     transitRouterId: transitRouterId,
 * }));
 * export const cenTransitRouterVpnAttachmentId0 = ids.apply(ids => ids.attachments?.[0]?.id);
 * ```
 */
export function getTransitRouterVpnAttachmentsOutput(args?: GetTransitRouterVpnAttachmentsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransitRouterVpnAttachmentsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cen/getTransitRouterVpnAttachments:getTransitRouterVpnAttachments", {
        "cenId": args.cenId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "tags": args.tags,
        "transitRouterAttachmentId": args.transitRouterAttachmentId,
        "transitRouterId": args.transitRouterId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterVpnAttachments.
 */
export interface GetTransitRouterVpnAttachmentsOutputArgs {
    /**
     * The ID of the Cloud Enterprise Network (CEN) instance.
     */
    cenId?: pulumi.Input<string>;
    /**
     * A list of Transit Router Vpn Attachment IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Transit Router Vpn Attachment name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The Status of Transit Router Vpn Attachment. Valid values: `Attached`, `Attaching`, `Detaching`.
     */
    status?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the VPN attachment.
     */
    transitRouterAttachmentId?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
}
