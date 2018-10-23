import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of EIPs (Elastic IP address) owned by an Alibaba Cloud account.
 */
export declare function getEips(args?: GetEipsArgs, opts?: pulumi.InvokeOptions): Promise<GetEipsResult>;
/**
 * A collection of arguments for invoking getEips.
 */
export interface GetEipsArgs {
    /**
     * A list of EIP IDs.
     */
    readonly ids?: string[];
    /**
     * Deprecated since the version 1.8.0 of this provider.
     */
    readonly inUse?: boolean;
    /**
     * A list of EIP public IP addresses.
     */
    readonly ipAddresses?: string[];
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getEips.
 */
export interface GetEipsResult {
    /**
     * A list of EIPs. Each element contains the following attributes:
     */
    readonly eips: {
        bandwidth: string;
        creationTime: string;
        id: string;
        instanceId: string;
        instanceType: string;
        internetChargeType: string;
        ipAddress: string;
        status: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
