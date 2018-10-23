import * as pulumi from "@pulumi/pulumi";
/**
 * ~> **NOTE:** This datasource has been deprecated from [v1.3.2](https://github.com/alibaba/terraform-provider/releases/tag/V1.3.2). Please use the datasource `alicloud_dns_groups` instead.
 */
export declare function getDomainGroups(args?: GetDomainGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainGroupsResult>;
/**
 * A collection of arguments for invoking getDomainGroups.
 */
export interface GetDomainGroupsArgs {
    readonly nameRegex?: string;
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getDomainGroups.
 */
export interface GetDomainGroupsResult {
    readonly groups: {
        groupId: string;
        groupName: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
