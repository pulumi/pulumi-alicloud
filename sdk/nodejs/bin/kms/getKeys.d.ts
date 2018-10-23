import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of KMS keys in an Alibaba Cloud account according to the specified filters.
 */
export declare function getKeys(args?: GetKeysArgs, opts?: pulumi.InvokeOptions): Promise<GetKeysResult>;
/**
 * A collection of arguments for invoking getKeys.
 */
export interface GetKeysArgs {
    /**
     * A regex string to filter the results by the KMS key description.
     */
    readonly descriptionRegex?: string;
    /**
     * A list of KMS key IDs.
     */
    readonly ids?: string[];
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Filter the results by status of the KMS keys. Valid values: `Enabled`, `Disabled`, `PendingDeletion`.
     */
    readonly status?: string;
}
/**
 * A collection of values returned by getKeys.
 */
export interface GetKeysResult {
    /**
     * A list of KMS keys. Each element contains the following attributes:
     */
    readonly keys: {
        arn: string;
        creationDate: string;
        creator: string;
        deleteDate: string;
        description: string;
        id: string;
        status: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
