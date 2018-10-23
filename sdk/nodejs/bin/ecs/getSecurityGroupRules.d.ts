import * as pulumi from "@pulumi/pulumi";
/**
 * The `alicloud_security_group_rules` data source provides a collection of security permissions of a specific security group.
 * Each collection item represents a single `ingress` or `egress` permission rule.
 * The ID of the security group can be provided via a variable or the result from the other data source `alicloud_security_groups`.
 */
export declare function getSecurityGroupRules(args: GetSecurityGroupRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityGroupRulesResult>;
/**
 * A collection of arguments for invoking getSecurityGroupRules.
 */
export interface GetSecurityGroupRulesArgs {
    /**
     * Authorization direction. Valid values are: `ingress` or `egress`.
     */
    readonly direction?: string;
    /**
     * The ID of the security group that owns the rules.
     */
    readonly groupId: string;
    /**
     * The IP protocol. Valid values are: `tcp`, `udp`, `icmp`, `gre` and `all`.
     */
    readonly ipProtocol?: string;
    /**
     * Refers to the network type. Can be either `internet` or `intranet`. The default value is `internet`.
     */
    readonly nicType?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Authorization policy. Can be either `accept` or `drop`. The default value is `accept`.
     */
    readonly policy?: string;
}
/**
 * A collection of values returned by getSecurityGroupRules.
 */
export interface GetSecurityGroupRulesResult {
    /**
     * The description of the security group that owns the rules.
     */
    readonly groupDesc: string;
    /**
     * The name of the security group that owns the rules.
     */
    readonly groupName: string;
    /**
     * A list of security group rules. Each element contains the following attributes:
     */
    readonly rules: {
        description: string;
        destCidrIp: string;
        destGroupId: string;
        destGroupOwnerAccount: string;
        direction: string;
        ipProtocol: string;
        nicType: string;
        policy: string;
        portRange: string;
        priority: number;
        sourceCidrIp: string;
        sourceGroupId: string;
        sourceGroupOwnerAccount: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
