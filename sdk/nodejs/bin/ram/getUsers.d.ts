import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of RAM users in an Alibaba Cloud account according to the specified filters.
 */
export declare function getUsers(args?: GetUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetUsersResult>;
/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersArgs {
    /**
     * Filter results by a specific group name. Returned users are in the specified group.
     */
    readonly groupName?: string;
    /**
     * A regex string to filter resulting users by their names.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. Returned users are attached to the specified policy.
     */
    readonly policyName?: string;
    /**
     * Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     */
    readonly policyType?: string;
}
/**
 * A collection of values returned by getUsers.
 */
export interface GetUsersResult {
    /**
     * A list of users. Each element contains the following attributes:
     */
    readonly users: {
        createDate: string;
        id: string;
        lastLoginDate: string;
        name: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
