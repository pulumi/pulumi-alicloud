import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the Function Compute services of the current Alibaba Cloud user.
 */
export declare function getServices(args?: GetServicesArgs, opts?: pulumi.InvokeOptions): Promise<GetServicesResult>;
/**
 * A collection of arguments for invoking getServices.
 */
export interface GetServicesArgs {
    /**
     * A regex string to filter results by FC service name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getServices.
 */
export interface GetServicesResult {
    /**
     * A list of FC services. Each element contains the following attributes:
     */
    readonly services: {
        creationTime: string;
        description: string;
        id: string;
        internetAccess: boolean;
        lastModificationTime: string;
        logConfig: {
            logstore: string;
            project: string;
        };
        name: string;
        role: string;
        vpcConfig: {
            securityGroupId: string;
            vpcId: string;
            vswitchIds: string[];
        };
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
