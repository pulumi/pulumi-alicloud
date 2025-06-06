// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Vpc Ipv6 Gateways of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.142.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.vpc.getIpv6Gateways({
 *     ids: ["example_id"],
 * });
 * export const vpcIpv6GatewayId1 = ids.then(ids => ids.gateways?.[0]?.id);
 * const nameRegex = alicloud.vpc.getIpv6Gateways({
 *     nameRegex: "^my-Ipv6Gateway",
 * });
 * export const vpcIpv6GatewayId2 = nameRegex.then(nameRegex => nameRegex.gateways?.[0]?.id);
 * const vpcId = alicloud.vpc.getIpv6Gateways({
 *     ids: ["example_id"],
 *     vpcId: "example_value",
 * });
 * export const vpcIpv6GatewayId3 = vpcId.then(vpcId => vpcId.gateways?.[0]?.id);
 * const status = alicloud.vpc.getIpv6Gateways({
 *     ids: ["example_id"],
 *     status: "Available",
 * });
 * export const vpcIpv6GatewayId4 = status.then(status => status.gateways?.[0]?.id);
 * ```
 */
export function getIpv6Gateways(args?: GetIpv6GatewaysArgs, opts?: pulumi.InvokeOptions): Promise<GetIpv6GatewaysResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getIpv6Gateways:getIpv6Gateways", {
        "ids": args.ids,
        "ipv6GatewayName": args.ipv6GatewayName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpv6Gateways.
 */
export interface GetIpv6GatewaysArgs {
    /**
     * A list of Ipv6 Gateway IDs.
     */
    ids?: string[];
    /**
     * The name of the IPv6 gateway.
     */
    ipv6GatewayName?: string;
    /**
     * A regex string to filter results by Ipv6 Gateway name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
     */
    status?: string;
    /**
     * The ID of the virtual private cloud (VPC) to which the IPv6 gateway belongs.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getIpv6Gateways.
 */
export interface GetIpv6GatewaysResult {
    readonly gateways: outputs.vpc.GetIpv6GatewaysGateway[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly ipv6GatewayName?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
    readonly vpcId?: string;
}
/**
 * This data source provides the Vpc Ipv6 Gateways of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.142.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.vpc.getIpv6Gateways({
 *     ids: ["example_id"],
 * });
 * export const vpcIpv6GatewayId1 = ids.then(ids => ids.gateways?.[0]?.id);
 * const nameRegex = alicloud.vpc.getIpv6Gateways({
 *     nameRegex: "^my-Ipv6Gateway",
 * });
 * export const vpcIpv6GatewayId2 = nameRegex.then(nameRegex => nameRegex.gateways?.[0]?.id);
 * const vpcId = alicloud.vpc.getIpv6Gateways({
 *     ids: ["example_id"],
 *     vpcId: "example_value",
 * });
 * export const vpcIpv6GatewayId3 = vpcId.then(vpcId => vpcId.gateways?.[0]?.id);
 * const status = alicloud.vpc.getIpv6Gateways({
 *     ids: ["example_id"],
 *     status: "Available",
 * });
 * export const vpcIpv6GatewayId4 = status.then(status => status.gateways?.[0]?.id);
 * ```
 */
export function getIpv6GatewaysOutput(args?: GetIpv6GatewaysOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetIpv6GatewaysResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:vpc/getIpv6Gateways:getIpv6Gateways", {
        "ids": args.ids,
        "ipv6GatewayName": args.ipv6GatewayName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpv6Gateways.
 */
export interface GetIpv6GatewaysOutputArgs {
    /**
     * A list of Ipv6 Gateway IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the IPv6 gateway.
     */
    ipv6GatewayName?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Ipv6 Gateway name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the virtual private cloud (VPC) to which the IPv6 gateway belongs.
     */
    vpcId?: pulumi.Input<string>;
}
