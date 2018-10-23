import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides Alibaba Cloud regions.
 */
export declare function getRegions(args?: GetRegionsArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionsResult>;
/**
 * A collection of arguments for invoking getRegions.
 */
export interface GetRegionsArgs {
    /**
     * Set to true to match only the region configured in the provider.
     */
    readonly current?: boolean;
    /**
     * The name of the region to select, such as `eu-central-1`.
     */
    readonly name?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getRegions.
 */
export interface GetRegionsResult {
    readonly current: boolean;
    readonly name: string;
    /**
     * A list of regions. Each element contains the following attributes:
     */
    readonly regions: {
        id: string;
        localName: string;
        regionId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
