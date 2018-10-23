import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of Security Groups in an Alibaba Cloud account according to the specified filters.
 */
export declare function getSecurityGroups(args?: GetSecurityGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityGroupsResult>;
/**
 * A collection of arguments for invoking getSecurityGroups.
 */
export interface GetSecurityGroupsArgs {
    /**
     * A regex string to filter the resulting security groups by their names.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * A map of tags assigned to the ECS instances. It must be in the format:
     * ```
     * data "alicloud_security_groups" "taggedSecurityGroups" {
     * tags = {
     * tagKey1 = "tagValue1",
     * tagKey2 = "tagValue2"
     * }
     * }
     * ```
     */
    readonly tags?: {
        [key: string]: any;
    };
    /**
     * Used to retrieve security groups that belong to the specified VPC ID.
     */
    readonly vpcId?: string;
}
/**
 * A collection of values returned by getSecurityGroups.
 */
export interface GetSecurityGroupsResult {
    /**
     * A list of groups. Each element contains the following attributes:
     */
    readonly groups: {
        creationTime: string;
        description: string;
        id: string;
        innerAccess: boolean;
        name: string;
        tags?: {
            [key: string]: any;
        };
        vpcId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
