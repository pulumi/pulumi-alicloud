// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
 *
 * > **NOTE:** Available since v1.18.0.
 */
export function getGateways(args?: GetGatewaysArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewaysResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpn/getGateways:getGateways", {
        "businessStatus": args.businessStatus,
        "enableIpsec": args.enableIpsec,
        "ids": args.ids,
        "includeReservationData": args.includeReservationData,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "sslVpn": args.sslVpn,
        "status": args.status,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGateways.
 */
export interface GetGatewaysArgs {
    /**
     * Limit search to specific business status - valid value is "Normal", "FinancialLocked".
     */
    businessStatus?: string;
    /**
     * Indicates whether the IPsec-VPN feature is enabled.
     *
     * @deprecated Field 'enable_ipsec' has been deprecated from provider version 1.193.0 and it will be removed in the future version.
     */
    enableIpsec?: boolean;
    /**
     * IDs of the VPN.
     */
    ids?: string[];
    /**
     * Include ineffective ordering data.
     */
    includeReservationData?: boolean;
    /**
     * A regex string of VPN name.
     */
    nameRegex?: string;
    /**
     * Save the result to the file.
     */
    outputFile?: string;
    /**
     * Indicates whether the SSL-VPN feature is enabled. Valid value is `enable`, `disable`.
     */
    sslVpn?: string;
    /**
     * Limit search to specific status - valid value is "Init", "Provisioning", "Active", "Updating", "Deleting".
     */
    status?: string;
    /**
     * Use the VPC ID as the search key.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getGateways.
 */
export interface GetGatewaysResult {
    /**
     * The business status of the VPN gateway.
     */
    readonly businessStatus?: string;
    /**
     * Whether the ipsec function is enabled.
     *
     * @deprecated Field 'enable_ipsec' has been deprecated from provider version 1.193.0 and it will be removed in the future version.
     */
    readonly enableIpsec?: boolean;
    /**
     * A list of VPN gateways. Each element contains the following attributes:
     */
    readonly gateways: outputs.vpn.GetGatewaysGateway[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IDs of the VPN.
     */
    readonly ids: string[];
    readonly includeReservationData?: boolean;
    readonly nameRegex?: string;
    /**
     * names of the VPN.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * Whether the ssl function is enabled.
     */
    readonly sslVpn?: string;
    /**
     * The status of the VPN
     */
    readonly status?: string;
    /**
     * ID of the VPC that the VPN belongs.
     */
    readonly vpcId?: string;
}
/**
 * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
 *
 * > **NOTE:** Available since v1.18.0.
 */
export function getGatewaysOutput(args?: GetGatewaysOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGatewaysResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:vpn/getGateways:getGateways", {
        "businessStatus": args.businessStatus,
        "enableIpsec": args.enableIpsec,
        "ids": args.ids,
        "includeReservationData": args.includeReservationData,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "sslVpn": args.sslVpn,
        "status": args.status,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGateways.
 */
export interface GetGatewaysOutputArgs {
    /**
     * Limit search to specific business status - valid value is "Normal", "FinancialLocked".
     */
    businessStatus?: pulumi.Input<string>;
    /**
     * Indicates whether the IPsec-VPN feature is enabled.
     *
     * @deprecated Field 'enable_ipsec' has been deprecated from provider version 1.193.0 and it will be removed in the future version.
     */
    enableIpsec?: pulumi.Input<boolean>;
    /**
     * IDs of the VPN.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Include ineffective ordering data.
     */
    includeReservationData?: pulumi.Input<boolean>;
    /**
     * A regex string of VPN name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * Save the result to the file.
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Indicates whether the SSL-VPN feature is enabled. Valid value is `enable`, `disable`.
     */
    sslVpn?: pulumi.Input<string>;
    /**
     * Limit search to specific status - valid value is "Init", "Provisioning", "Active", "Updating", "Deleting".
     */
    status?: pulumi.Input<string>;
    /**
     * Use the VPC ID as the search key.
     */
    vpcId?: pulumi.Input<string>;
}
