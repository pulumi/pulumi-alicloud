import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides CEN instances available to the user.
 */
export declare function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult>;
/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    /**
     * A list of CEN instances IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter CEN instances by name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    /**
     * A list of CEN instances. Each element contains the following attributes:
     */
    readonly instances: {
        bandwidthPackageIds: string[];
        childInstanceIds: string[];
        description: string;
        id: string;
        name: string;
        status: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
