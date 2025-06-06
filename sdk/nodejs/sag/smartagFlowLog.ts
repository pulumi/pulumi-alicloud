// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Smartag Flow Log resource.
 *
 * For information about Smartag Flow Log and how to use it, see [What is Flow Log](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/createflowlog).
 *
 * > **NOTE:** Available since v1.168.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.sag.SmartagFlowLog("example", {
 *     netflowServerIp: "192.168.0.2",
 *     netflowServerPort: 9995,
 *     netflowVersion: "V9",
 *     outputType: "netflow",
 * });
 * ```
 *
 * ## Import
 *
 * Smartag Flow Log can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:sag/smartagFlowLog:SmartagFlowLog example <id>
 * ```
 */
export class SmartagFlowLog extends pulumi.CustomResource {
    /**
     * Get an existing SmartagFlowLog resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SmartagFlowLogState, opts?: pulumi.CustomResourceOptions): SmartagFlowLog {
        return new SmartagFlowLog(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:sag/smartagFlowLog:SmartagFlowLog';

    /**
     * Returns true if the given object is an instance of SmartagFlowLog.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SmartagFlowLog {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SmartagFlowLog.__pulumiType;
    }

    /**
     * The time interval at which log data of active connections is collected. Valid values: `60` to `6000`. Default value: `300`. Unit: second.
     */
    public readonly activeAging!: pulumi.Output<number>;
    /**
     * The description of the flow log.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the flow log.
     */
    public readonly flowLogName!: pulumi.Output<string | undefined>;
    /**
     * The time interval at which log data of inactive connections is connected. Valid values: `10` to `600`. Default value: `15`. Unit: second.
     */
    public readonly inactiveAging!: pulumi.Output<number>;
    /**
     * The Logstore in Log Service. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    public readonly logstoreName!: pulumi.Output<string | undefined>;
    /**
     * The IP address of the NetFlow collector where the flow log is stored. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    public readonly netflowServerIp!: pulumi.Output<string | undefined>;
    /**
     * The port of the NetFlow collector. Default value: `9995`. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    public readonly netflowServerPort!: pulumi.Output<number>;
    /**
     * The NetFlow version. Default value: `V9`. Valid values: `V10`, `V5`, `V9`. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    public readonly netflowVersion!: pulumi.Output<string>;
    /**
     * The location where the flow log is stored. Valid values:
     */
    public readonly outputType!: pulumi.Output<string>;
    /**
     * The project in Log Service. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    public readonly projectName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the region where Log Service is deployed. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    public readonly slsRegionId!: pulumi.Output<string | undefined>;
    /**
     * The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a SmartagFlowLog resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SmartagFlowLogArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SmartagFlowLogArgs | SmartagFlowLogState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SmartagFlowLogState | undefined;
            resourceInputs["activeAging"] = state ? state.activeAging : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["flowLogName"] = state ? state.flowLogName : undefined;
            resourceInputs["inactiveAging"] = state ? state.inactiveAging : undefined;
            resourceInputs["logstoreName"] = state ? state.logstoreName : undefined;
            resourceInputs["netflowServerIp"] = state ? state.netflowServerIp : undefined;
            resourceInputs["netflowServerPort"] = state ? state.netflowServerPort : undefined;
            resourceInputs["netflowVersion"] = state ? state.netflowVersion : undefined;
            resourceInputs["outputType"] = state ? state.outputType : undefined;
            resourceInputs["projectName"] = state ? state.projectName : undefined;
            resourceInputs["slsRegionId"] = state ? state.slsRegionId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as SmartagFlowLogArgs | undefined;
            if ((!args || args.outputType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outputType'");
            }
            resourceInputs["activeAging"] = args ? args.activeAging : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["flowLogName"] = args ? args.flowLogName : undefined;
            resourceInputs["inactiveAging"] = args ? args.inactiveAging : undefined;
            resourceInputs["logstoreName"] = args ? args.logstoreName : undefined;
            resourceInputs["netflowServerIp"] = args ? args.netflowServerIp : undefined;
            resourceInputs["netflowServerPort"] = args ? args.netflowServerPort : undefined;
            resourceInputs["netflowVersion"] = args ? args.netflowVersion : undefined;
            resourceInputs["outputType"] = args ? args.outputType : undefined;
            resourceInputs["projectName"] = args ? args.projectName : undefined;
            resourceInputs["slsRegionId"] = args ? args.slsRegionId : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SmartagFlowLog.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SmartagFlowLog resources.
 */
export interface SmartagFlowLogState {
    /**
     * The time interval at which log data of active connections is collected. Valid values: `60` to `6000`. Default value: `300`. Unit: second.
     */
    activeAging?: pulumi.Input<number>;
    /**
     * The description of the flow log.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the flow log.
     */
    flowLogName?: pulumi.Input<string>;
    /**
     * The time interval at which log data of inactive connections is connected. Valid values: `10` to `600`. Default value: `15`. Unit: second.
     */
    inactiveAging?: pulumi.Input<number>;
    /**
     * The Logstore in Log Service. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    logstoreName?: pulumi.Input<string>;
    /**
     * The IP address of the NetFlow collector where the flow log is stored. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    netflowServerIp?: pulumi.Input<string>;
    /**
     * The port of the NetFlow collector. Default value: `9995`. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    netflowServerPort?: pulumi.Input<number>;
    /**
     * The NetFlow version. Default value: `V9`. Valid values: `V10`, `V5`, `V9`. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    netflowVersion?: pulumi.Input<string>;
    /**
     * The location where the flow log is stored. Valid values:
     */
    outputType?: pulumi.Input<string>;
    /**
     * The project in Log Service. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    projectName?: pulumi.Input<string>;
    /**
     * The ID of the region where Log Service is deployed. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    slsRegionId?: pulumi.Input<string>;
    /**
     * The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SmartagFlowLog resource.
 */
export interface SmartagFlowLogArgs {
    /**
     * The time interval at which log data of active connections is collected. Valid values: `60` to `6000`. Default value: `300`. Unit: second.
     */
    activeAging?: pulumi.Input<number>;
    /**
     * The description of the flow log.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the flow log.
     */
    flowLogName?: pulumi.Input<string>;
    /**
     * The time interval at which log data of inactive connections is connected. Valid values: `10` to `600`. Default value: `15`. Unit: second.
     */
    inactiveAging?: pulumi.Input<number>;
    /**
     * The Logstore in Log Service. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    logstoreName?: pulumi.Input<string>;
    /**
     * The IP address of the NetFlow collector where the flow log is stored. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    netflowServerIp?: pulumi.Input<string>;
    /**
     * The port of the NetFlow collector. Default value: `9995`. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    netflowServerPort?: pulumi.Input<number>;
    /**
     * The NetFlow version. Default value: `V9`. Valid values: `V10`, `V5`, `V9`. If `outputType` is set to `netflow` or `all`, this parameter is required.
     */
    netflowVersion?: pulumi.Input<string>;
    /**
     * The location where the flow log is stored. Valid values:
     */
    outputType: pulumi.Input<string>;
    /**
     * The project in Log Service. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    projectName?: pulumi.Input<string>;
    /**
     * The ID of the region where Log Service is deployed. If `outputType` is set to `sls` or `all`, this parameter is required.
     */
    slsRegionId?: pulumi.Input<string>;
    /**
     * The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
     */
    status?: pulumi.Input<string>;
}
