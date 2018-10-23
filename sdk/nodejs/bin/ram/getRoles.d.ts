import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
 */
export declare function getRoles(args?: GetRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetRolesResult>;
/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesArgs {
    /**
     * A regex string to filter results by the role name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
     */
    readonly policyName?: string;
    /**
     * Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     */
    readonly policyType?: string;
}
/**
 * A collection of values returned by getRoles.
 */
export interface GetRolesResult {
    /**
     * A list of roles. Each element contains the following attributes:
     */
    readonly roles: {
        arn: string;
        assumeRolePolicyDocument: string;
        createDate: string;
        description: string;
        document: string;
        id: string;
        name: string;
        updateDate: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
