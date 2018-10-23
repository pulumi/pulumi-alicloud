import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides CEN Bandwidth Packages available to the user.
 */
export declare function getBandwidthPackages(args?: GetBandwidthPackagesArgs, opts?: pulumi.InvokeOptions): Promise<GetBandwidthPackagesResult>;
/**
 * A collection of arguments for invoking getBandwidthPackages.
 */
export interface GetBandwidthPackagesArgs {
    /**
     * Limit search to a list of specific CEN Bandwidth Package IDs.
     */
    readonly ids?: string[];
    /**
     * ID of a CEN instance.
     */
    readonly instanceId?: string;
    /**
     * A regex string to filter CEN Bandwidth Package by name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getBandwidthPackages.
 */
export interface GetBandwidthPackagesResult {
    /**
     * A list of CEN bandwidth package. Each element contains the following attributes:
     */
    readonly packages: {
        bandwidth: number;
        bandwidthPackageChargeType: string;
        businessStatus: string;
        creationTime: string;
        description: string;
        geographicRegionAId: string;
        geographicRegionBId: string;
        id: string;
        instanceId: string;
        name: string;
        status: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
