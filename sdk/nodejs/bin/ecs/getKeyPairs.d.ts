import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of key pairs in an Alibaba Cloud account according to the specified filters.
 */
export declare function getKeyPairs(args?: GetKeyPairsArgs, opts?: pulumi.InvokeOptions): Promise<GetKeyPairsResult>;
/**
 * A collection of arguments for invoking getKeyPairs.
 */
export interface GetKeyPairsArgs {
    /**
     * A finger print used to retrieve specified key pair.
     */
    readonly fingerPrint?: boolean;
    /**
     * A regex string to apply to the resulting key pairs.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getKeyPairs.
 */
export interface GetKeyPairsResult {
    /**
     * Finger print of the key pair.
     */
    readonly fingerPrint: boolean;
    /**
     * A list of key pairs. Each element contains the following attributes:
     */
    readonly keyPairs: {
        fingerPrint: string;
        id: string;
        instances: {
            availabilityZone: string;
            description: string;
            imageId: string;
            instanceId: string;
            instanceName: string;
            instanceType: string;
            keyName: string;
            privateIp: string;
            publicIp: string;
            regionId: string;
            status: string;
            vswitchId: string;
        }[];
        keyName: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
