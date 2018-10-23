import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides availability zones that can be accessed by an Alibaba Cloud account within the region configured in the provider.
 *
 *
 * ~> **NOTE:** If one zone is sold out, it will not be exported.
 */
export declare function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult>;
/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * Filter the results by a specific disk category. Can be either `cloud`, `cloud_efficiency` or `cloud_ssd`.
     */
    readonly availableDiskCategory?: string;
    /**
     * Filter the results by a specific instance type.
     */
    readonly availableInstanceType?: string;
    /**
     * Filter the results by a specific resource type. The following values are allowed: `Instance`, `Disk`, `VSwitch` and `Rds`.
     */
    readonly availableResourceCreation?: string;
    /**
     * Filter the results by a specific ECS instance charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     */
    readonly instanceChargeType?: string;
    /**
     * Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch RDS instances.
     */
    readonly multi?: boolean;
    /**
     * Filter the results by a specific network type. Valid values: `Classic` and `Vpc`.
     */
    readonly networkType?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * - (Optional) Filter the results by a specific ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
     */
    readonly spotStrategy?: string;
}
/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    /**
     * A list of availability zones. Each element contains the following attributes:
     */
    readonly zones: {
        availableDiskCategories: string[];
        availableInstanceTypes: string[];
        availableResourceCreations: string[];
        id: string;
        localName: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
