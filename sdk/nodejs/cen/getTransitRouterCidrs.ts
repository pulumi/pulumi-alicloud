// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cen Transit Router Cidrs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.193.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cen.getTransitRouterCidrs({
 *     ids: ["example_id"],
 *     transitRouterId: "tr-6ehx7q2jze8ch5ji0****",
 * });
 * export const cenTransitRouterCidrId0 = ids.then(ids => ids.cidrs?.[0]?.id);
 * const nameRegex = alicloud.cen.getTransitRouterCidrs({
 *     nameRegex: "^my-name",
 *     transitRouterId: "tr-6ehx7q2jze8ch5ji0****",
 * });
 * export const cenTransitRouterCidrId1 = nameRegex.then(nameRegex => nameRegex.cidrs?.[0]?.id);
 * ```
 */
export function getTransitRouterCidrs(args: GetTransitRouterCidrsArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitRouterCidrsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getTransitRouterCidrs:getTransitRouterCidrs", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "transitRouterCidrId": args.transitRouterCidrId,
        "transitRouterId": args.transitRouterId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterCidrs.
 */
export interface GetTransitRouterCidrsArgs {
    /**
     * A list of Cen Transit Router Cidr IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Transit Router Cidr name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the transit router cidr.
     */
    transitRouterCidrId?: string;
    /**
     * The ID of the transit router.
     */
    transitRouterId: string;
}

/**
 * A collection of values returned by getTransitRouterCidrs.
 */
export interface GetTransitRouterCidrsResult {
    readonly cidrs: outputs.cen.GetTransitRouterCidrsCidr[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly transitRouterCidrId?: string;
    readonly transitRouterId: string;
}
/**
 * This data source provides the Cen Transit Router Cidrs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.193.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cen.getTransitRouterCidrs({
 *     ids: ["example_id"],
 *     transitRouterId: "tr-6ehx7q2jze8ch5ji0****",
 * });
 * export const cenTransitRouterCidrId0 = ids.then(ids => ids.cidrs?.[0]?.id);
 * const nameRegex = alicloud.cen.getTransitRouterCidrs({
 *     nameRegex: "^my-name",
 *     transitRouterId: "tr-6ehx7q2jze8ch5ji0****",
 * });
 * export const cenTransitRouterCidrId1 = nameRegex.then(nameRegex => nameRegex.cidrs?.[0]?.id);
 * ```
 */
export function getTransitRouterCidrsOutput(args: GetTransitRouterCidrsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransitRouterCidrsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cen/getTransitRouterCidrs:getTransitRouterCidrs", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "transitRouterCidrId": args.transitRouterCidrId,
        "transitRouterId": args.transitRouterId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterCidrs.
 */
export interface GetTransitRouterCidrsOutputArgs {
    /**
     * A list of Cen Transit Router Cidr IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Transit Router Cidr name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the transit router cidr.
     */
    transitRouterCidrId?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId: pulumi.Input<string>;
}
