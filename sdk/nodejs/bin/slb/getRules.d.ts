import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the rules associated with a server load balancer listener.
 */
export declare function getRules(args: GetRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetRulesResult>;
/**
 * A collection of arguments for invoking getRules.
 */
export interface GetRulesArgs {
    /**
     * SLB listener port.
     */
    readonly frontendPort: number;
    /**
     * A list of rules IDs to filter results.
     */
    readonly ids?: string[];
    /**
     * ID of the SLB with listener rules.
     */
    readonly loadBalancerId: string;
    /**
     * A regex string to filter results by rule name.
     */
    readonly nameRegex?: string;
}
/**
 * A collection of values returned by getRules.
 */
export interface GetRulesResult {
    /**
     * A list of SLB listener rules. Each element contains the following attributes:
     */
    readonly slbRules: {
        domain: string;
        id: string;
        name: string;
        serverGroupId: string;
        url: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
