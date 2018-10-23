import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides CEN Route Entries available to the user.
 */
export declare function getRouteEntries(args: GetRouteEntriesArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteEntriesResult>;
/**
 * A collection of arguments for invoking getRouteEntries.
 */
export interface GetRouteEntriesArgs {
    /**
     * The destination CIDR block of the route entry to query.
     */
    readonly cidrBlock?: string;
    /**
     * ID of the CEN instance.
     */
    readonly instanceId: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * ID of the route table of the VPC or VBR.
     */
    readonly routeTableId: string;
}
/**
 * A collection of values returned by getRouteEntries.
 */
export interface GetRouteEntriesResult {
    /**
     * A list of CEN Route Entries. Each element contains the following attributes:
     */
    readonly entries: {
        cidrBlock: string;
        conflicts: {
            cidrBlock: string;
            instanceId: string;
            instanceType: string;
            regionId: string;
            status: string;
        }[];
        nextHopId: string;
        nextHopType: string;
        operationalMode: boolean;
        publishStatus: string;
        routeTableId: string;
        routeType: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
