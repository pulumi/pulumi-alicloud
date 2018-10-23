import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of DNS Domains in an Alibaba Cloud account according to the specified filters.
 */
export declare function getDomains(args?: GetDomainsArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainsResult>;
/**
 * A collection of arguments for invoking getDomains.
 */
export interface GetDomainsArgs {
    /**
     * Specifies whether the domain is from Alibaba Cloud or not.
     */
    readonly aliDomain?: boolean;
    /**
     * A regex string to filter results by the domain name.
     */
    readonly domainNameRegex?: string;
    /**
     * A regex string to filter results by the group name.
     */
    readonly groupNameRegex?: string;
    /**
     * Cloud analysis product ID.
     */
    readonly instanceId?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Cloud analysis version code.
     */
    readonly versionCode?: string;
}
/**
 * A collection of values returned by getDomains.
 */
export interface GetDomainsResult {
    /**
     * A list of domains. Each element contains the following attributes:
     */
    readonly domains: {
        aliDomain: boolean;
        dnsServers: string[];
        domainId: string;
        domainName: string;
        groupId: string;
        groupName: string;
        instanceId: string;
        punyCode: string;
        versionCode: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
