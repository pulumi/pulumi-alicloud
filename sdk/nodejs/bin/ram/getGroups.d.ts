import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of RAM Groups in an Alibaba Cloud account according to the specified filters.
 */
export declare function getGroups(args?: GetGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupsResult>;
/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsArgs {
    /**
     * A regex string to filter the returned groups by their names.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Filter the results by a specific policy name. If you set this parameter without setting `policy_type`, it will be automatically set to `System`.
     */
    readonly policyName?: string;
    /**
     * Filter the results by a specific policy type. Valid items are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     */
    readonly policyType?: string;
    /**
     * Filter the results by a specific the user name.
     */
    readonly userName?: string;
}
/**
 * A collection of values returned by getGroups.
 */
export interface GetGroupsResult {
    /**
     * A list of groups. Each element contains the following attributes:
     */
    readonly groups: {
        comments: string;
        name: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
