import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a security group rule resource.
 * Represents a single `ingress` or `egress` group rule, which can be added to external Security Groups.
 *
 * ~> **NOTE:**  `nic_type` should set to `intranet` when security group type is `vpc` or specifying the `source_security_group_id`. In this situation it does not distinguish between intranet and internet, the rule is effective on them both.
 *
 */
export declare class SecurityGroupRule extends pulumi.CustomResource {
    /**
     * Get an existing SecurityGroupRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityGroupRuleState): SecurityGroupRule;
    /**
     * The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
     */
    readonly cidrIp: pulumi.Output<string | undefined>;
    /**
     * The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     */
    readonly ipProtocol: pulumi.Output<string>;
    /**
     * Network type, can be either `internet` or `intranet`, the default value is `internet`.
     */
    readonly nicType: pulumi.Output<string>;
    /**
     * Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
     */
    readonly policy: pulumi.Output<string | undefined>;
    /**
     * The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
     * For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
     */
    readonly portRange: pulumi.Output<string | undefined>;
    /**
     * Authorization policy priority, with parameter values: `1-100`, default value: 1.
     */
    readonly priority: pulumi.Output<number | undefined>;
    /**
     * The security group to apply this rule to.
     */
    readonly securityGroupId: pulumi.Output<string>;
    /**
     * The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidr_ip` has already been set.
     */
    readonly sourceGroupOwnerAccount: pulumi.Output<string | undefined>;
    /**
     * The target security group ID within the same region. If this field is specified, the `nic_type` can only select `intranet`.
     */
    readonly sourceSecurityGroupId: pulumi.Output<string | undefined>;
    /**
     * The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
     */
    readonly type: pulumi.Output<string>;
    /**
     * Create a SecurityGroupRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecurityGroupRuleArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SecurityGroupRule resources.
 */
export interface SecurityGroupRuleState {
    /**
     * The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
     */
    readonly cidrIp?: pulumi.Input<string>;
    /**
     * The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     */
    readonly ipProtocol?: pulumi.Input<string>;
    /**
     * Network type, can be either `internet` or `intranet`, the default value is `internet`.
     */
    readonly nicType?: pulumi.Input<string>;
    /**
     * Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
     */
    readonly policy?: pulumi.Input<string>;
    /**
     * The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
     * For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
     */
    readonly portRange?: pulumi.Input<string>;
    /**
     * Authorization policy priority, with parameter values: `1-100`, default value: 1.
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * The security group to apply this rule to.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    /**
     * The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidr_ip` has already been set.
     */
    readonly sourceGroupOwnerAccount?: pulumi.Input<string>;
    /**
     * The target security group ID within the same region. If this field is specified, the `nic_type` can only select `intranet`.
     */
    readonly sourceSecurityGroupId?: pulumi.Input<string>;
    /**
     * The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
     */
    readonly type?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SecurityGroupRule resource.
 */
export interface SecurityGroupRuleArgs {
    /**
     * The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
     */
    readonly cidrIp?: pulumi.Input<string>;
    /**
     * The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     */
    readonly ipProtocol: pulumi.Input<string>;
    /**
     * Network type, can be either `internet` or `intranet`, the default value is `internet`.
     */
    readonly nicType?: pulumi.Input<string>;
    /**
     * Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
     */
    readonly policy?: pulumi.Input<string>;
    /**
     * The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
     * For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
     */
    readonly portRange?: pulumi.Input<string>;
    /**
     * Authorization policy priority, with parameter values: `1-100`, default value: 1.
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * The security group to apply this rule to.
     */
    readonly securityGroupId: pulumi.Input<string>;
    /**
     * The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidr_ip` has already been set.
     */
    readonly sourceGroupOwnerAccount?: pulumi.Input<string>;
    /**
     * The target security group ID within the same region. If this field is specified, the `nic_type` can only select `intranet`.
     */
    readonly sourceSecurityGroupId?: pulumi.Input<string>;
    /**
     * The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
     */
    readonly type: pulumi.Input<string>;
}
