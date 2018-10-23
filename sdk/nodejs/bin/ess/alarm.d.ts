import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a ESS alarm task resource.
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
     * The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
     */
    readonly alarmActions: pulumi.Output<string[]>;
    /**
     * Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
     */
    readonly cloudMonitorGroupId: pulumi.Output<number | undefined>;
    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: >=, <=, >, <. Defaults to >=.
     */
    readonly comparisonOperator: pulumi.Output<string | undefined>;
    /**
     * The description for the alarm.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The dimension map for the alarm's associated metric (documented below). For all metrics, you can not set the dimension key as "scaling_group" or "userId", which is set by default, the second dimension for metric, such as "device" for "PackagesNetIn", need to be set by users.
     */
    readonly dimensions: pulumi.Output<{
        [key: string]: any;
    }>;
    /**
     * The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
     */
    readonly evaluationCount: pulumi.Output<number | undefined>;
    /**
     * The name for the alarm's associated metric.
     */
    readonly metricName: pulumi.Output<string>;
    /**
     * The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
     */
    readonly metricType: pulumi.Output<string | undefined>;
    /**
     * The name for ess alarm.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
     */
    readonly period: pulumi.Output<number | undefined>;
    /**
     * The scaling group associated with this alarm.
     */
    readonly scalingGroupId: pulumi.Output<string>;
    /**
     * The state of specified alarm.
     */
    readonly state: pulumi.Output<string>;
    /**
     * The statistic to apply to the alarm's associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
     */
    readonly statistics: pulumi.Output<string | undefined>;
    /**
     * The value against which the specified statistics is compared.
     */
    readonly threshold: pulumi.Output<string>;
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
     * The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
     */
    readonly alarmActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
     */
    readonly cloudMonitorGroupId?: pulumi.Input<number>;
    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: >=, <=, >, <. Defaults to >=.
     */
    readonly comparisonOperator?: pulumi.Input<string>;
    /**
     * The description for the alarm.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The dimension map for the alarm's associated metric (documented below). For all metrics, you can not set the dimension key as "scaling_group" or "userId", which is set by default, the second dimension for metric, such as "device" for "PackagesNetIn", need to be set by users.
     */
    readonly dimensions?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
     */
    readonly evaluationCount?: pulumi.Input<number>;
    /**
     * The name for the alarm's associated metric.
     */
    readonly metricName?: pulumi.Input<string>;
    /**
     * The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
     */
    readonly metricType?: pulumi.Input<string>;
    /**
     * The name for ess alarm.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The scaling group associated with this alarm.
     */
    readonly scalingGroupId?: pulumi.Input<string>;
    /**
     * The state of specified alarm.
     */
    readonly state?: pulumi.Input<string>;
    /**
     * The statistic to apply to the alarm's associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
     */
    readonly statistics?: pulumi.Input<string>;
    /**
     * The value against which the specified statistics is compared.
     */
    readonly threshold?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Alarm resource.
 */
export interface AlarmArgs {
    /**
     * The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
     */
    readonly alarmActions: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
     */
    readonly cloudMonitorGroupId?: pulumi.Input<number>;
    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: >=, <=, >, <. Defaults to >=.
     */
    readonly comparisonOperator?: pulumi.Input<string>;
    /**
     * The description for the alarm.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The dimension map for the alarm's associated metric (documented below). For all metrics, you can not set the dimension key as "scaling_group" or "userId", which is set by default, the second dimension for metric, such as "device" for "PackagesNetIn", need to be set by users.
     */
    readonly dimensions?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
     */
    readonly evaluationCount?: pulumi.Input<number>;
    /**
     * The name for the alarm's associated metric.
     */
    readonly metricName: pulumi.Input<string>;
    /**
     * The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
     */
    readonly metricType?: pulumi.Input<string>;
    /**
     * The name for ess alarm.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The scaling group associated with this alarm.
     */
    readonly scalingGroupId: pulumi.Input<string>;
    /**
     * The statistic to apply to the alarm's associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
     */
    readonly statistics?: pulumi.Input<string>;
    /**
     * The value against which the specified statistics is compared.
     */
    readonly threshold: pulumi.Input<string>;
}
