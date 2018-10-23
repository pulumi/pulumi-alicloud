import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of VSwitches owned by an Alibaba Cloud account.
 */
export declare function getSwitches(args?: GetSwitchesArgs, opts?: pulumi.InvokeOptions): Promise<GetSwitchesResult>;
/**
 * A collection of arguments for invoking getSwitches.
 */
export interface GetSwitchesArgs {
    /**
     * Filter results by a specific CIDR block. For example: "172.16.0.0/12".
     */
    readonly cidrBlock?: string;
    /**
     * Indicate whether the VSwitch is created by the system.
     */
    readonly isDefault?: boolean;
    /**
     * A regex string to filter results by name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * ID of the VPC that owns the VSwitch.
     */
    readonly vpcId?: string;
    /**
     * The availability zone of the VSwitch.
     */
    readonly zoneId?: string;
}
/**
 * A collection of values returned by getSwitches.
 */
export interface GetSwitchesResult {
    /**
     * A list of VSwitches. Each element contains the following attributes:
     */
    readonly vswitches: {
        cidrBlock: string;
        creationTime: string;
        description: string;
        id: string;
        instanceIds: string[];
        isDefault: boolean;
        name: string;
        vpcId: string;
        zoneId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
