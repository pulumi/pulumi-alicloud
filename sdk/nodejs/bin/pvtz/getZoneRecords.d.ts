import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides Private Zone Records resource information owned by an Alibaba Cloud account.
 */
export declare function getZoneRecords(args: GetZoneRecordsArgs, opts?: pulumi.InvokeOptions): Promise<GetZoneRecordsResult>;
/**
 * A collection of arguments for invoking getZoneRecords.
 */
export interface GetZoneRecordsArgs {
    /**
     * Keyword for record rr and value.
     */
    readonly keyword?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * ID of the Private Zone.
     */
    readonly zoneId: string;
}
/**
 * A collection of values returned by getZoneRecords.
 */
export interface GetZoneRecordsResult {
    /**
     * A list of zone records. Each element contains the following attributes:
     */
    readonly records: {
        id: number;
        priority: number;
        resourceRecord: string;
        status: string;
        ttl: number;
        type: string;
        value: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
