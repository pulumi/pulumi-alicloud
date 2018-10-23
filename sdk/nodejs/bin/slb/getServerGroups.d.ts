import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the VServer groups related to a server load balancer.
 */
export declare function getServerGroups(args: GetServerGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetServerGroupsResult>;
/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsArgs {
    /**
     * A list of VServer group IDs to filter results.
     */
    readonly ids?: string[];
    /**
     * ID of the SLB.
     */
    readonly loadBalancerId: string;
    /**
     * A regex string to filter results by VServer group name.
     */
    readonly nameRegex?: string;
}
/**
 * A collection of values returned by getServerGroups.
 */
export interface GetServerGroupsResult {
    /**
     * A list of SLB VServer groups. Each element contains the following attributes:
     */
    readonly slbServerGroups: {
        id: string;
        name: string;
        servers: {
            instanceId: string;
            weight: number;
        }[];
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
