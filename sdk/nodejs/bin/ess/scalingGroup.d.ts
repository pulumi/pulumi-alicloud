import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a ESS scaling group resource which is a collection of ECS instances with the same application scenarios.
 *
 * It defines the maximum and minimum numbers of ECS instances in the group, and their associated Server Load Balancer instances, RDS instances, and other attributes.
 *
 * ~> **NOTE:** You can launch an ESS scaling group for a VPC network via specifying parameter `vswitch_ids`.
 */
export declare class ScalingGroup extends pulumi.CustomResource {
    /**
     * Get an existing ScalingGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScalingGroupState): ScalingGroup;
    /**
     * If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
     * - The specified RDS instance must be in running status.
     * - The specified RDS instance’s whitelist must have room for more IP addresses.
     */
    readonly dbInstanceIds: pulumi.Output<string[] | undefined>;
    /**
     * Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
     */
    readonly defaultCooldown: pulumi.Output<number | undefined>;
    /**
     * If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
     * - The Server Load Balancer instance must be enabled.
     * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
     * targeting your `alicloud_slb_listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
     * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
     * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
     */
    readonly loadbalancerIds: pulumi.Output<string[] | undefined>;
    /**
     * Maximum number of ECS instances in the scaling group. Value range: [0, 100].
     */
    readonly maxSize: pulumi.Output<number>;
    /**
     * Minimum number of ECS instances in the scaling group. Value range: [0, 100].
     */
    readonly minSize: pulumi.Output<number>;
    /**
     * Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY or BALANCE.
     */
    readonly multiAzPolicy: pulumi.Output<string | undefined>;
    /**
     * RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
     * - OldestInstance: removes the first ECS instance attached to the scaling group.
     * - NewestInstance: removes the first ECS instance attached to the scaling group.
     * - OldestScalingConfiguration: removes the ECS instance with the oldest scaling configuration.
     * - Default values: OldestScalingConfiguration and OldestInstance. You can enter up to two removal policies.
     */
    readonly removalPolicies: pulumi.Output<string[] | undefined>;
    /**
     * Name shown for the scaling group, which must contain 2-40 characters (English or Chinese). If this parameter is not specified, the default value is ScalingGroupId.
     */
    readonly scalingGroupName: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
     */
    readonly vswitchId: pulumi.Output<string | undefined>;
    /**
     * List of virtual switch IDs in which the ecs instances to be launched.
     */
    readonly vswitchIds: pulumi.Output<string[] | undefined>;
    /**
     * Create a ScalingGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScalingGroupArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ScalingGroup resources.
 */
export interface ScalingGroupState {
    /**
     * If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
     * - The specified RDS instance must be in running status.
     * - The specified RDS instance’s whitelist must have room for more IP addresses.
     */
    readonly dbInstanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
     */
    readonly defaultCooldown?: pulumi.Input<number>;
    /**
     * If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
     * - The Server Load Balancer instance must be enabled.
     * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
     * targeting your `alicloud_slb_listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
     * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
     * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
     */
    readonly loadbalancerIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Maximum number of ECS instances in the scaling group. Value range: [0, 100].
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * Minimum number of ECS instances in the scaling group. Value range: [0, 100].
     */
    readonly minSize?: pulumi.Input<number>;
    /**
     * Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY or BALANCE.
     */
    readonly multiAzPolicy?: pulumi.Input<string>;
    /**
     * RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
     * - OldestInstance: removes the first ECS instance attached to the scaling group.
     * - NewestInstance: removes the first ECS instance attached to the scaling group.
     * - OldestScalingConfiguration: removes the ECS instance with the oldest scaling configuration.
     * - Default values: OldestScalingConfiguration and OldestInstance. You can enter up to two removal policies.
     */
    readonly removalPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name shown for the scaling group, which must contain 2-40 characters (English or Chinese). If this parameter is not specified, the default value is ScalingGroupId.
     */
    readonly scalingGroupName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * List of virtual switch IDs in which the ecs instances to be launched.
     */
    readonly vswitchIds?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a ScalingGroup resource.
 */
export interface ScalingGroupArgs {
    /**
     * If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
     * - The specified RDS instance must be in running status.
     * - The specified RDS instance’s whitelist must have room for more IP addresses.
     */
    readonly dbInstanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
     */
    readonly defaultCooldown?: pulumi.Input<number>;
    /**
     * If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
     * - The Server Load Balancer instance must be enabled.
     * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
     * targeting your `alicloud_slb_listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
     * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
     * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
     */
    readonly loadbalancerIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Maximum number of ECS instances in the scaling group. Value range: [0, 100].
     */
    readonly maxSize: pulumi.Input<number>;
    /**
     * Minimum number of ECS instances in the scaling group. Value range: [0, 100].
     */
    readonly minSize: pulumi.Input<number>;
    /**
     * Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY or BALANCE.
     */
    readonly multiAzPolicy?: pulumi.Input<string>;
    /**
     * RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
     * - OldestInstance: removes the first ECS instance attached to the scaling group.
     * - NewestInstance: removes the first ECS instance attached to the scaling group.
     * - OldestScalingConfiguration: removes the ECS instance with the oldest scaling configuration.
     * - Default values: OldestScalingConfiguration and OldestInstance. You can enter up to two removal policies.
     */
    readonly removalPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name shown for the scaling group, which must contain 2-40 characters (English or Chinese). If this parameter is not specified, the default value is ScalingGroupId.
     */
    readonly scalingGroupName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * List of virtual switch IDs in which the ecs instances to be launched.
     */
    readonly vswitchIds?: pulumi.Input<pulumi.Input<string>[]>;
}
