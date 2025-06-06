// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Monitor Service Group Monitoring Agent Process resource.
 *
 * For information about Cloud Monitor Service Group Monitoring Agent Process and how to use it, see [What is Group Monitoring Agent Process](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-creategroupmonitoringagentprocess).
 *
 * > **NOTE:** Available since v1.212.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.cms.AlarmContactGroup("default", {
 *     alarmContactGroupName: name,
 *     contacts: [
 *         "user",
 *         "user1",
 *         "user2",
 *     ],
 * });
 * const defaultMonitorGroup = new alicloud.cms.MonitorGroup("default", {
 *     monitorGroupName: name,
 *     contactGroups: [_default.id],
 * });
 * const defaultServiceGroupMonitoringAgentProcess = new alicloud.cloudmonitor.ServiceGroupMonitoringAgentProcess("default", {
 *     groupId: defaultMonitorGroup.id,
 *     processName: name,
 *     matchExpressFilterRelation: "or",
 *     matchExpresses: [{
 *         name: name,
 *         value: "*",
 *         "function": "all",
 *     }],
 *     alertConfigs: [{
 *         escalationsLevel: "critical",
 *         comparisonOperator: "GreaterThanOrEqualToThreshold",
 *         statistics: "Average",
 *         threshold: "20",
 *         times: "100",
 *         effectiveInterval: "00:00-22:59",
 *         silenceTime: 85800,
 *         webhook: "https://www.aliyun.com",
 *         targetLists: [{
 *             targetListId: "1",
 *             jsonParams: "{}",
 *             level: "WARN",
 *             arn: "acs:mns:cn-hangzhou:120886317861****:/queues/test123/message",
 *         }],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Monitor Service Group Monitoring Agent Process can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudmonitor/serviceGroupMonitoringAgentProcess:ServiceGroupMonitoringAgentProcess example <group_id>:<group_monitoring_agent_process_id>
 * ```
 */
export class ServiceGroupMonitoringAgentProcess extends pulumi.CustomResource {
    /**
     * Get an existing ServiceGroupMonitoringAgentProcess resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceGroupMonitoringAgentProcessState, opts?: pulumi.CustomResourceOptions): ServiceGroupMonitoringAgentProcess {
        return new ServiceGroupMonitoringAgentProcess(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudmonitor/serviceGroupMonitoringAgentProcess:ServiceGroupMonitoringAgentProcess';

    /**
     * Returns true if the given object is an instance of ServiceGroupMonitoringAgentProcess.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceGroupMonitoringAgentProcess {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceGroupMonitoringAgentProcess.__pulumiType;
    }

    /**
     * The alert rule configurations. See `alertConfig` below.
     */
    public readonly alertConfigs!: pulumi.Output<outputs.cloudmonitor.ServiceGroupMonitoringAgentProcessAlertConfig[]>;
    /**
     * The ID of the application group.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The ID of the Group Monitoring Agent Process.
     */
    public /*out*/ readonly groupMonitoringAgentProcessId!: pulumi.Output<string>;
    /**
     * The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
     */
    public readonly matchExpressFilterRelation!: pulumi.Output<string>;
    /**
     * The expressions used to match instances. See `matchExpress` below.
     */
    public readonly matchExpresses!: pulumi.Output<outputs.cloudmonitor.ServiceGroupMonitoringAgentProcessMatchExpress[]>;
    /**
     * The name of the process.
     */
    public readonly processName!: pulumi.Output<string>;

    /**
     * Create a ServiceGroupMonitoringAgentProcess resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceGroupMonitoringAgentProcessArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceGroupMonitoringAgentProcessArgs | ServiceGroupMonitoringAgentProcessState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceGroupMonitoringAgentProcessState | undefined;
            resourceInputs["alertConfigs"] = state ? state.alertConfigs : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupMonitoringAgentProcessId"] = state ? state.groupMonitoringAgentProcessId : undefined;
            resourceInputs["matchExpressFilterRelation"] = state ? state.matchExpressFilterRelation : undefined;
            resourceInputs["matchExpresses"] = state ? state.matchExpresses : undefined;
            resourceInputs["processName"] = state ? state.processName : undefined;
        } else {
            const args = argsOrState as ServiceGroupMonitoringAgentProcessArgs | undefined;
            if ((!args || args.alertConfigs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alertConfigs'");
            }
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.processName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'processName'");
            }
            resourceInputs["alertConfigs"] = args ? args.alertConfigs : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["matchExpressFilterRelation"] = args ? args.matchExpressFilterRelation : undefined;
            resourceInputs["matchExpresses"] = args ? args.matchExpresses : undefined;
            resourceInputs["processName"] = args ? args.processName : undefined;
            resourceInputs["groupMonitoringAgentProcessId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceGroupMonitoringAgentProcess.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceGroupMonitoringAgentProcess resources.
 */
export interface ServiceGroupMonitoringAgentProcessState {
    /**
     * The alert rule configurations. See `alertConfig` below.
     */
    alertConfigs?: pulumi.Input<pulumi.Input<inputs.cloudmonitor.ServiceGroupMonitoringAgentProcessAlertConfig>[]>;
    /**
     * The ID of the application group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * The ID of the Group Monitoring Agent Process.
     */
    groupMonitoringAgentProcessId?: pulumi.Input<string>;
    /**
     * The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
     */
    matchExpressFilterRelation?: pulumi.Input<string>;
    /**
     * The expressions used to match instances. See `matchExpress` below.
     */
    matchExpresses?: pulumi.Input<pulumi.Input<inputs.cloudmonitor.ServiceGroupMonitoringAgentProcessMatchExpress>[]>;
    /**
     * The name of the process.
     */
    processName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceGroupMonitoringAgentProcess resource.
 */
export interface ServiceGroupMonitoringAgentProcessArgs {
    /**
     * The alert rule configurations. See `alertConfig` below.
     */
    alertConfigs: pulumi.Input<pulumi.Input<inputs.cloudmonitor.ServiceGroupMonitoringAgentProcessAlertConfig>[]>;
    /**
     * The ID of the application group.
     */
    groupId: pulumi.Input<string>;
    /**
     * The logical operator used between conditional expressions that are used to match instances. Valid values: `all`, `and`, `or`.
     */
    matchExpressFilterRelation?: pulumi.Input<string>;
    /**
     * The expressions used to match instances. See `matchExpress` below.
     */
    matchExpresses?: pulumi.Input<pulumi.Input<inputs.cloudmonitor.ServiceGroupMonitoringAgentProcessMatchExpress>[]>;
    /**
     * The name of the process.
     */
    processName: pulumi.Input<string>;
}
