import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the Function Compute triggers of the current Alibaba Cloud user.
 */
export declare function getTriggers(args: GetTriggersArgs, opts?: pulumi.InvokeOptions): Promise<GetTriggersResult>;
/**
 * A collection of arguments for invoking getTriggers.
 */
export interface GetTriggersArgs {
    /**
     * FC function name.
     */
    readonly functionName: string;
    /**
     * A regex string to filter results by FC trigger name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * FC service name.
     */
    readonly serviceName: string;
}
/**
 * A collection of values returned by getTriggers.
 */
export interface GetTriggersResult {
    /**
     * A list of FC triggers. Each element contains the following attributes:
     */
    readonly triggers: {
        config: string;
        creationTime: string;
        id: string;
        invocationRole: string;
        lastModificationTime: string;
        name: string;
        sourceArn: string;
        type: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
