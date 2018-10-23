import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a ESS scaling rule resource.
 */
export declare class ScalingRule extends pulumi.CustomResource {
    /**
     * Get an existing ScalingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScalingRuleState): ScalingRule;
    /**
     * Adjustment mode of a scaling rule. Optional values:
     * - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
     * - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
     * - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
     */
    readonly adjustmentType: pulumi.Output<string>;
    /**
     * Adjusted value of a scaling rule. Value range:
     * - QuantityChangeInCapacity：(0, 100] U (-100, 0]
     * - PercentChangeInCapacity：[0, 10000] U [-10000, 0]
     * - TotalCapacity：[0, 100]
     */
    readonly adjustmentValue: pulumi.Output<number>;
    /**
     * Unique identifier of a scaling rule.
     */
    readonly ari: pulumi.Output<string>;
    /**
     * Cool-down time of a scaling rule. Value range: [0, 86,400], in seconds. The default value is empty.
     */
    readonly cooldown: pulumi.Output<number | undefined>;
    /**
     * ID of the scaling group of a scaling rule.
     */
    readonly scalingGroupId: pulumi.Output<string>;
    /**
     * Name shown for the scaling rule, which is a string containing 2 to 40 English or Chinese characters.
     */
    readonly scalingRuleName: pulumi.Output<string>;
    /**
     * Create a ScalingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScalingRuleArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ScalingRule resources.
 */
export interface ScalingRuleState {
    /**
     * Adjustment mode of a scaling rule. Optional values:
     * - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
     * - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
     * - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
     */
    readonly adjustmentType?: pulumi.Input<string>;
    /**
     * Adjusted value of a scaling rule. Value range:
     * - QuantityChangeInCapacity：(0, 100] U (-100, 0]
     * - PercentChangeInCapacity：[0, 10000] U [-10000, 0]
     * - TotalCapacity：[0, 100]
     */
    readonly adjustmentValue?: pulumi.Input<number>;
    /**
     * Unique identifier of a scaling rule.
     */
    readonly ari?: pulumi.Input<string>;
    /**
     * Cool-down time of a scaling rule. Value range: [0, 86,400], in seconds. The default value is empty.
     */
    readonly cooldown?: pulumi.Input<number>;
    /**
     * ID of the scaling group of a scaling rule.
     */
    readonly scalingGroupId?: pulumi.Input<string>;
    /**
     * Name shown for the scaling rule, which is a string containing 2 to 40 English or Chinese characters.
     */
    readonly scalingRuleName?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ScalingRule resource.
 */
export interface ScalingRuleArgs {
    /**
     * Adjustment mode of a scaling rule. Optional values:
     * - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
     * - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
     * - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
     */
    readonly adjustmentType: pulumi.Input<string>;
    /**
     * Adjusted value of a scaling rule. Value range:
     * - QuantityChangeInCapacity：(0, 100] U (-100, 0]
     * - PercentChangeInCapacity：[0, 10000] U [-10000, 0]
     * - TotalCapacity：[0, 100]
     */
    readonly adjustmentValue: pulumi.Input<number>;
    /**
     * Cool-down time of a scaling rule. Value range: [0, 86,400], in seconds. The default value is empty.
     */
    readonly cooldown?: pulumi.Input<number>;
    /**
     * ID of the scaling group of a scaling rule.
     */
    readonly scalingGroupId: pulumi.Input<string>;
    /**
     * Name shown for the scaling rule, which is a string containing 2 to 40 English or Chinese characters.
     */
    readonly scalingRuleName?: pulumi.Input<string>;
}
