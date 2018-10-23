import * as pulumi from "@pulumi/pulumi";
/**
 * This data source lists a number of Private Zones resource information owned by an Alibaba Cloud account.
 */
export declare function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult>;
/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * keyword for zone name.
     */
    readonly keyword?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    /**
     * A list of zones. Each element contains the following attributes:
     */
    readonly zones: {
        bindVpcs: {
            regionId: string;
            vpcId: string;
            vpcName: string;
        }[];
        creationTime: string;
        id: string;
        isPtr: boolean;
        name: string;
        recordCount: number;
        remark: string;
        updateTime: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
