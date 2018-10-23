import * as pulumi from "@pulumi/pulumi";
/**
 * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
 */
export declare function getGateways(args?: GetGatewaysArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewaysResult>;
/**
 * A collection of arguments for invoking getGateways.
 */
export interface GetGatewaysArgs {
    /**
     * Limit search to specific business status - valid value is "Normal", "FinancialLocked".
     */
    readonly businessStatus?: string;
    /**
     * IDs of the VPN.
     */
    readonly ids?: string[];
    /**
     * A regex string of VPN name.
     */
    readonly nameRegex?: string;
    /**
     * Save the result to the file.
     */
    readonly outputFile?: string;
    /**
     * Limit search to specific status - valid value is "Init", "Provisioning", "Active", "Updating", "Deleting".
     */
    readonly status?: string;
    /**
     * Use the VPC ID as the search key.
     */
    readonly vpcId?: string;
}
/**
 * A collection of values returned by getGateways.
 */
export interface GetGatewaysResult {
    /**
     * A list of VPN gateways. Each element contains the following attributes:
     */
    readonly gateways: {
        businessStatus: string;
        createTime: number;
        description: string;
        enableIpsec: string;
        enableSsl: string;
        endTime: number;
        id: string;
        instanceChargeType: string;
        internetIp: string;
        name: string;
        regionId: string;
        specification: string;
        sslConnections: number;
        status: string;
        vpcId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
