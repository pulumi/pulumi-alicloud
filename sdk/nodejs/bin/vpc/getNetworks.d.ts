import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides VPCs available to the user.
 */
export declare function getNetworks(args?: GetNetworksArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworksResult>;
/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksArgs {
    /**
     * Filter results by a specific CIDR block. For example: "172.16.0.0/12".
     */
    readonly cidrBlock?: string;
    /**
     * Indicate whether the VPC is the default one in the specified region.
     */
    readonly isDefault?: boolean;
    /**
     * A regex string to filter VPCs by name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Filter results by a specific status. Valid value are `Pending` and `Available`.
     */
    readonly status?: string;
    /**
     * Filter results by the specified VSwitch.
     */
    readonly vswitchId?: string;
}
/**
 * A collection of values returned by getNetworks.
 */
export interface GetNetworksResult {
    /**
     * A list of VPCs. Each element contains the following attributes:
     */
    readonly vpcs: {
        cidrBlock: string;
        creationTime: string;
        description: string;
        id: string;
        isDefault: boolean;
        regionId: string;
        routeTableId: string;
        status: string;
        vpcName: string;
        vrouterId: string;
        vswitchIds: string[];
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
