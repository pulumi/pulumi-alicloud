import * as pulumi from "@pulumi/pulumi";
/**
 * This resource provides a alarm rule resource and it can be used to monitor several cloud services according different metrics.
 * Details for [alarm rule](https://www.alibabacloud.com/help/doc-detail/28608.htm).
 */
export declare class Alarm extends pulumi.CustomResource {
    /**
     * Get an existing Alarm resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlarmState): Alarm;
    /**
     * List contact groups of the alarm rule, which must have been created on the console.
     */
    readonly contactGroups: pulumi.Output<string[]>;
    /**
     * Map of the resources associated with the alarm rule, such as "instanceId", "device" and "port". Each key's value is a string and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly dimensions: pulumi.Output<{
        [key: string]: string;
    }>;
    /**
     * Whether to enable alarm rule. Default to true.
     */
    readonly enabled: pulumi.Output<boolean | undefined>;
    /**
     * End time of the alarm effective period. Default value 24 and it indicates the time 24:00. Valid value range: [0, 24].
     */
    readonly endTime: pulumi.Output<number | undefined>;
    /**
     * Name of the monitoring metrics corresponding to a project, such as "CPUUtilization" and "networkin_rate". For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly metric: pulumi.Output<string>;
    /**
     * The alarm rule name.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Notification type. Valid value [0, 1]. The value 0 indicates TradeManager+email, and the value 1 indicates that TradeManager+email+SMS
     */
    readonly notifyType: pulumi.Output<number | undefined>;
    /**
     * Alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
     */
    readonly operator: pulumi.Output<string | undefined>;
    /**
     * Index query cycle, which must be consistent with that defined for metrics. Default to 300, in seconds.
     */
    readonly period: pulumi.Output<number | undefined>;
    /**
     * Monitor project name, such as "acs_ecs_dashboard" and "acs_rds_dashboard". For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly project: pulumi.Output<string>;
    /**
     * Notification silence period in the alarm state, in seconds. Valid value range: [300, 86400]. Default to 86400
     */
    readonly silenceTime: pulumi.Output<number | undefined>;
    /**
     * Start time of the alarm effective period. Default to 0 and it indicates the time 00:00. Valid value range: [0, 24].
     */
    readonly startTime: pulumi.Output<number | undefined>;
    /**
     * Statistical method. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
     */
    readonly statistics: pulumi.Output<string | undefined>;
    /**
     * The current alarm rule status.
     */
    readonly status: pulumi.Output<string>;
    /**
     * Alarm threshold value, which must be a numeric value currently.
     */
    readonly threshold: pulumi.Output<string>;
    /**
     * Number of consecutive times it has been detected that the values exceed the threshold. Default to 3.
     */
    readonly triggeredCount: pulumi.Output<number | undefined>;
    /**
     * Create a Alarm resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlarmArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Alarm resources.
 */
export interface AlarmState {
    /**
     * List contact groups of the alarm rule, which must have been created on the console.
     */
    readonly contactGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Map of the resources associated with the alarm rule, such as "instanceId", "device" and "port". Each key's value is a string and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly dimensions?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * Whether to enable alarm rule. Default to true.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * End time of the alarm effective period. Default value 24 and it indicates the time 24:00. Valid value range: [0, 24].
     */
    readonly endTime?: pulumi.Input<number>;
    /**
     * Name of the monitoring metrics corresponding to a project, such as "CPUUtilization" and "networkin_rate". For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly metric?: pulumi.Input<string>;
    /**
     * The alarm rule name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Notification type. Valid value [0, 1]. The value 0 indicates TradeManager+email, and the value 1 indicates that TradeManager+email+SMS
     */
    readonly notifyType?: pulumi.Input<number>;
    /**
     * Alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
     */
    readonly operator?: pulumi.Input<string>;
    /**
     * Index query cycle, which must be consistent with that defined for metrics. Default to 300, in seconds.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * Monitor project name, such as "acs_ecs_dashboard" and "acs_rds_dashboard". For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Notification silence period in the alarm state, in seconds. Valid value range: [300, 86400]. Default to 86400
     */
    readonly silenceTime?: pulumi.Input<number>;
    /**
     * Start time of the alarm effective period. Default to 0 and it indicates the time 00:00. Valid value range: [0, 24].
     */
    readonly startTime?: pulumi.Input<number>;
    /**
     * Statistical method. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
     */
    readonly statistics?: pulumi.Input<string>;
    /**
     * The current alarm rule status.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * Alarm threshold value, which must be a numeric value currently.
     */
    readonly threshold?: pulumi.Input<string>;
    /**
     * Number of consecutive times it has been detected that the values exceed the threshold. Default to 3.
     */
    readonly triggeredCount?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a Alarm resource.
 */
export interface AlarmArgs {
    /**
     * List contact groups of the alarm rule, which must have been created on the console.
     */
    readonly contactGroups: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Map of the resources associated with the alarm rule, such as "instanceId", "device" and "port". Each key's value is a string and it uses comma to split multiple items. For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly dimensions: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * Whether to enable alarm rule. Default to true.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * End time of the alarm effective period. Default value 24 and it indicates the time 24:00. Valid value range: [0, 24].
     */
    readonly endTime?: pulumi.Input<number>;
    /**
     * Name of the monitoring metrics corresponding to a project, such as "CPUUtilization" and "networkin_rate". For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly metric: pulumi.Input<string>;
    /**
     * The alarm rule name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Notification type. Valid value [0, 1]. The value 0 indicates TradeManager+email, and the value 1 indicates that TradeManager+email+SMS
     */
    readonly notifyType?: pulumi.Input<number>;
    /**
     * Alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
     */
    readonly operator?: pulumi.Input<string>;
    /**
     * Index query cycle, which must be consistent with that defined for metrics. Default to 300, in seconds.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * Monitor project name, such as "acs_ecs_dashboard" and "acs_rds_dashboard". For more information, see [Metrics Reference](https://www.alibabacloud.com/help/doc-detail/28619.htm).
     */
    readonly project: pulumi.Input<string>;
    /**
     * Notification silence period in the alarm state, in seconds. Valid value range: [300, 86400]. Default to 86400
     */
    readonly silenceTime?: pulumi.Input<number>;
    /**
     * Start time of the alarm effective period. Default to 0 and it indicates the time 00:00. Valid value range: [0, 24].
     */
    readonly startTime?: pulumi.Input<number>;
    /**
     * Statistical method. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
     */
    readonly statistics?: pulumi.Input<string>;
    /**
     * Alarm threshold value, which must be a numeric value currently.
     */
    readonly threshold: pulumi.Input<string>;
    /**
     * Number of consecutive times it has been detected that the values exceed the threshold. Default to 3.
     */
    readonly triggeredCount?: pulumi.Input<number>;
}
