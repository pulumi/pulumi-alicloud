import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the Function Compute functions of the current Alibaba Cloud user.
 */
export declare function getFunctions(args: GetFunctionsArgs, opts?: pulumi.InvokeOptions): Promise<GetFunctionsResult>;
/**
 * A collection of arguments for invoking getFunctions.
 */
export interface GetFunctionsArgs {
    /**
     * A regex string to filter results by function name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Name of the service that contains the functions to find.
     */
    readonly serviceName: string;
}
/**
 * A collection of values returned by getFunctions.
 */
export interface GetFunctionsResult {
    /**
     * A list of functions. Each element contains the following attributes:
     */
    readonly functions: {
        codeChecksum: string;
        codeSize: number;
        creationTime: string;
        description: string;
        handler: string;
        id: string;
        lastModificationTime: string;
        memorySize: number;
        name: string;
        runtime: string;
        timeout: number;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
