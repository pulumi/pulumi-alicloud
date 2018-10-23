import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of MNS queues in an Alibaba Cloud account according to the specified parameters.
 */
export declare function getQueues(args?: GetQueuesArgs, opts?: pulumi.InvokeOptions): Promise<GetQueuesResult>;
/**
 * A collection of arguments for invoking getQueues.
 */
export interface GetQueuesArgs {
    /**
     * A string to filter resulting queues by their name prefixs.
     */
    readonly namePrefix?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getQueues.
 */
export interface GetQueuesResult {
    /**
     * A list of users. Each element contains the following attributes:
     */
    readonly queues: {
        delaySeconds: number;
        id: string;
        maximumMessageSize: number;
        messageRetentionPeriod: number;
        name: string;
        pollingWaitSeconds: number;
        visibilityTimeouts: number;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
