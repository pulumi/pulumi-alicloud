import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides CEN Bandwidth Limits available to the user.
 */
export declare function getBandwidthLimits(args?: GetBandwidthLimitsArgs, opts?: pulumi.InvokeOptions): Promise<GetBandwidthLimitsResult>;
/**
 * A collection of arguments for invoking getBandwidthLimits.
 */
export interface GetBandwidthLimitsArgs {
    /**
     * A list of CEN instances IDs.
     */
    readonly instanceIds?: string[];
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getBandwidthLimits.
 */
export interface GetBandwidthLimitsResult {
    /**
     * A list of CEN Bandwidth Limits. Each element contains the following attributes:
     */
    readonly limits: {
        bandwidthLimit: number;
        instanceId: string;
        localRegionId: string;
        oppositeRegionId: string;
        status: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
