import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the server load balancers of the current Alibaba Cloud user.
 */
export declare function getLoadBalancers(args?: GetLoadBalancersArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancersResult>;
/**
 * A collection of arguments for invoking getLoadBalancers.
 */
export interface GetLoadBalancersArgs {
    /**
     * Service address of the SLBs.
     */
    readonly address?: string;
    /**
     * A list of SLBs IDs.
     */
    readonly ids?: string[];
    /**
     * Master availability zone of the SLBs.
     */
    readonly masterAvailabilityZone?: string;
    /**
     * A regex string to filter results by SLB name.
     */
    readonly nameRegex?: string;
    /**
     * Network type of the SLBs. Valid values: `vpc` and `classic`.
     */
    readonly networkType?: string;
    /**
     * Slave availability zone of the SLBs.
     */
    readonly slaveAvailabilityZone?: string;
    /**
     * ID of the VPC linked to the SLBs.
     */
    readonly vpcId?: string;
    /**
     * ID of the VSwitch linked to the SLBs.
     */
    readonly vswitchId?: string;
}
/**
 * A collection of values returned by getLoadBalancers.
 */
export interface GetLoadBalancersResult {
    /**
     * A list of SLBs. Each element contains the following attributes:
     */
    readonly slbs: {
        address: string;
        creationTime: string;
        id: string;
        internet: boolean;
        masterAvailabilityZone: string;
        name: string;
        networkType: string;
        regionId: string;
        slaveAvailabilityZone: string;
        status: string;
        vpcId: string;
        vswitchId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
