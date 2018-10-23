import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of RAM policies in an Alibaba Cloud account according to the specified filters.
 */
export declare function getPolicies(args?: GetPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetPoliciesResult>;
/**
 * A collection of arguments for invoking getPolicies.
 */
export interface GetPoliciesArgs {
    /**
     * Filter results by a specific group name. Returned policies are attached to the specified group.
     */
    readonly groupName?: string;
    /**
     * A regex string to filter resulting policies by name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Filter results by a specific role name. Returned policies are attached to the specified role.
     */
    readonly roleName?: string;
    /**
     * Filter results by a specific policy type. Valid values are `Custom` and `System`.
     */
    readonly type?: string;
    /**
     * Filter results by a specific user name. Returned policies are attached to the specified user.
     */
    readonly userName?: string;
}
/**
 * A collection of values returned by getPolicies.
 */
export interface GetPoliciesResult {
    /**
     * A list of policies. Each element contains the following attributes:
     */
    readonly policies: {
        attachmentCount: number;
        createDate: string;
        defaultVersion: string;
        description: string;
        document: string;
        name: string;
        type: string;
        updateDate: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
