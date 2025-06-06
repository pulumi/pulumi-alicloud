// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Vpc Ipv6 Internet Bandwidths of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.143.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.vpc.getIpv6InternetBandwidths({
 *     ids: ["example_id"],
 * });
 * export const vpcIpv6InternetBandwidthId1 = ids.then(ids => ids.bandwidths?.[0]?.id);
 * const ipv6InternetBandwidthId = alicloud.vpc.getIpv6InternetBandwidths({
 *     ipv6InternetBandwidthId: "example_value",
 * });
 * export const vpcIpv6InternetBandwidthId2 = ipv6InternetBandwidthId.then(ipv6InternetBandwidthId => ipv6InternetBandwidthId.bandwidths?.[0]?.id);
 * const ipv6AddressId = alicloud.vpc.getIpv6InternetBandwidths({
 *     ipv6AddressId: "example_value",
 * });
 * export const vpcIpv6InternetBandwidthId3 = ipv6AddressId.then(ipv6AddressId => ipv6AddressId.bandwidths?.[0]?.id);
 * const status = alicloud.vpc.getIpv6InternetBandwidths({
 *     status: "Normal",
 * });
 * export const vpcIpv6InternetBandwidthId4 = status.then(status => status.bandwidths?.[0]?.id);
 * ```
 */
export function getIpv6InternetBandwidths(args?: GetIpv6InternetBandwidthsArgs, opts?: pulumi.InvokeOptions): Promise<GetIpv6InternetBandwidthsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getIpv6InternetBandwidths:getIpv6InternetBandwidths", {
        "ids": args.ids,
        "ipv6AddressId": args.ipv6AddressId,
        "ipv6InternetBandwidthId": args.ipv6InternetBandwidthId,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpv6InternetBandwidths.
 */
export interface GetIpv6InternetBandwidthsArgs {
    /**
     * A list of Ipv6 Internet Bandwidth IDs.
     */
    ids?: string[];
    /**
     * The ID of the IPv6 address.
     */
    ipv6AddressId?: string;
    /**
     * The ID of the Ipv6 Internet Bandwidth.
     */
    ipv6InternetBandwidthId?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the resource. Valid values: `Normal`, `FinancialLocked` and `SecurityLocked`.
     */
    status?: string;
}

/**
 * A collection of values returned by getIpv6InternetBandwidths.
 */
export interface GetIpv6InternetBandwidthsResult {
    readonly bandwidths: outputs.vpc.GetIpv6InternetBandwidthsBandwidth[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly ipv6AddressId?: string;
    readonly ipv6InternetBandwidthId?: string;
    readonly outputFile?: string;
    readonly status?: string;
}
/**
 * This data source provides the Vpc Ipv6 Internet Bandwidths of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.143.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.vpc.getIpv6InternetBandwidths({
 *     ids: ["example_id"],
 * });
 * export const vpcIpv6InternetBandwidthId1 = ids.then(ids => ids.bandwidths?.[0]?.id);
 * const ipv6InternetBandwidthId = alicloud.vpc.getIpv6InternetBandwidths({
 *     ipv6InternetBandwidthId: "example_value",
 * });
 * export const vpcIpv6InternetBandwidthId2 = ipv6InternetBandwidthId.then(ipv6InternetBandwidthId => ipv6InternetBandwidthId.bandwidths?.[0]?.id);
 * const ipv6AddressId = alicloud.vpc.getIpv6InternetBandwidths({
 *     ipv6AddressId: "example_value",
 * });
 * export const vpcIpv6InternetBandwidthId3 = ipv6AddressId.then(ipv6AddressId => ipv6AddressId.bandwidths?.[0]?.id);
 * const status = alicloud.vpc.getIpv6InternetBandwidths({
 *     status: "Normal",
 * });
 * export const vpcIpv6InternetBandwidthId4 = status.then(status => status.bandwidths?.[0]?.id);
 * ```
 */
export function getIpv6InternetBandwidthsOutput(args?: GetIpv6InternetBandwidthsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetIpv6InternetBandwidthsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:vpc/getIpv6InternetBandwidths:getIpv6InternetBandwidths", {
        "ids": args.ids,
        "ipv6AddressId": args.ipv6AddressId,
        "ipv6InternetBandwidthId": args.ipv6InternetBandwidthId,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpv6InternetBandwidths.
 */
export interface GetIpv6InternetBandwidthsOutputArgs {
    /**
     * A list of Ipv6 Internet Bandwidth IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the IPv6 address.
     */
    ipv6AddressId?: pulumi.Input<string>;
    /**
     * The ID of the Ipv6 Internet Bandwidth.
     */
    ipv6InternetBandwidthId?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Normal`, `FinancialLocked` and `SecurityLocked`.
     */
    status?: pulumi.Input<string>;
}
