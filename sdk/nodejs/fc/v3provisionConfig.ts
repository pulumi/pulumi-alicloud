// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a FCV3 Provision Config resource.
 *
 * Function Reservation Configuration.
 *
 * For information about FCV3 Provision Config and how to use it, see [What is Provision Config](https://www.alibabacloud.com/help/en/functioncompute/fc-3-0/developer-reference/api-fc-2023-03-30-putprovisionconfig).
 *
 * > **NOTE:** Available since v1.230.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 * import * as time from "@pulumi/time";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const defaultProject = new alicloud.log.Project("default", {
 *     projectName: `${name}-${_default.result}`,
 *     description: name,
 * });
 * const defaultStore = new alicloud.log.Store("default", {
 *     projectName: defaultProject.name,
 *     logstoreName: `${name}-${_default.result}`,
 *     shardCount: 3,
 *     autoSplit: true,
 *     maxSplitShardCount: 60,
 *     appendMeta: true,
 * });
 * const wait10Minutes = new time.index.Sleep("wait_10_minutes", {createDuration: "10m"}, {
 *     dependsOn: [defaultStore],
 * });
 * const _function = new alicloud.fc.V3Function("function", {
 *     memorySize: 512,
 *     cpu: 0.5,
 *     handler: "index.handler",
 *     functionName: name,
 *     runtime: "python3.10",
 *     diskSize: 512,
 *     code: {
 *         zipFile: "UEsDBBQACAAIAAAAAAAAAAAAAAAAAAAAAAAIAAAAaW5kZXgucHmEkEFKxEAQRfd9ig9ZTCJOooIwDMwNXLqXnnQlaalUhU5lRj2KZ/FOXkESGR114bJ/P/7jV4b1xRq1hijtFpM1682cuNgPmgysbRulPT0fRxXnMtwrSPyeCdYRokSLnuMLJTTkbUqEvDMbxm1VdcRD6Tk+T1LW2ldB66knsYdA5iNX17ebm6tN2VnPhcswMPmREPuBacb+CiapLarAj9gT6/H97dVlCNScY3mtYvRkxdZlwDKDEnanPWVLdrdkeXEGlFEazVdfPVHaVeHc3N15CUwppwOJXeK7HshAB8NuOU7J6sP4SRXuH/EvbUfMiqMmDqv5M5FNSfAj/wgAAP//UEsHCPl//NYAAQAArwEAAFBLAQIUABQACAAIAAAAAAD5f/zWAAEAAK8BAAAIAAAAAAAAAAAAAAAAAAAAAABpbmRleC5weVBLBQYAAAAAAQABADYAAAA2AQAAAAA=",
 *     },
 *     logConfig: {
 *         enableInstanceMetrics: true,
 *         enableRequestMetrics: true,
 *         project: defaultProject.projectName,
 *         logstore: defaultStore.logstoreName,
 *         logBeginRule: "None",
 *     },
 * }, {
 *     dependsOn: [wait10Minutes],
 * });
 * const defaultV3ProvisionConfig = new alicloud.fc.V3ProvisionConfig("default", {
 *     target: 1,
 *     targetTrackingPolicies: [
 *         {
 *             name: "t1",
 *             startTime: "2030-10-10T10:10:10Z",
 *             endTime: "2035-10-10T10:10:10Z",
 *             minCapacity: 0,
 *             maxCapacity: 1,
 *             metricTarget: 1,
 *             metricType: "ProvisionedConcurrencyUtilization",
 *         },
 *         {
 *             metricTarget: 1,
 *             metricType: "ProvisionedConcurrencyUtilization",
 *             name: "t2",
 *             startTime: "2030-10-10T10:10:10Z",
 *             endTime: "2035-10-10T10:10:10Z",
 *             minCapacity: 0,
 *             maxCapacity: 1,
 *         },
 *         {
 *             metricType: "ProvisionedConcurrencyUtilization",
 *             timeZone: "Asia/Shanghai",
 *             name: "t3",
 *             startTime: "2030-10-10T10:10:10",
 *             endTime: "2035-10-10T10:10:10",
 *             minCapacity: 0,
 *             maxCapacity: 1,
 *             metricTarget: 1,
 *         },
 *     ],
 *     scheduledActions: [
 *         {
 *             target: 0,
 *             name: "s1",
 *             startTime: "2030-10-10T10:10:10Z",
 *             endTime: "2035-10-10T10:10:10Z",
 *             scheduleExpression: "cron(0 0 4 * * *)",
 *         },
 *         {
 *             name: "s2",
 *             startTime: "2030-10-10T10:10:10Z",
 *             endTime: "2035-10-10T10:10:10Z",
 *             scheduleExpression: "cron(0 0 6 * * *)",
 *             target: 1,
 *         },
 *         {
 *             startTime: "2030-10-10T10:10:10",
 *             endTime: "2035-10-10T10:10:10",
 *             scheduleExpression: "cron(0 0 7 * * *)",
 *             target: 0,
 *             timeZone: "Asia/Shanghai",
 *             name: "s3",
 *         },
 *     ],
 *     qualifier: "LATEST",
 *     alwaysAllocateGpu: true,
 *     functionName: _function.functionName,
 *     alwaysAllocateCpu: true,
 * });
 * ```
 *
 * ## Import
 *
 * FCV3 Provision Config can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:fc/v3ProvisionConfig:V3ProvisionConfig example <id>
 * ```
 */
export class V3ProvisionConfig extends pulumi.CustomResource {
    /**
     * Get an existing V3ProvisionConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: V3ProvisionConfigState, opts?: pulumi.CustomResourceOptions): V3ProvisionConfig {
        return new V3ProvisionConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:fc/v3ProvisionConfig:V3ProvisionConfig';

    /**
     * Returns true if the given object is an instance of V3ProvisionConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is V3ProvisionConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === V3ProvisionConfig.__pulumiType;
    }

    /**
     * Whether the CPU is always allocated. The default value is true.
     */
    public readonly alwaysAllocateCpu!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to always assign GPU to function instance
     */
    public readonly alwaysAllocateGpu!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
     */
    public readonly functionName!: pulumi.Output<string>;
    /**
     * The function alias or LATEST.
     */
    public readonly qualifier!: pulumi.Output<string | undefined>;
    /**
     * Timing policy configuration See `scheduledActions` below.
     */
    public readonly scheduledActions!: pulumi.Output<outputs.fc.V3ProvisionConfigScheduledAction[] | undefined>;
    /**
     * Number of reserved target resources. The value range is [0,10000].
     */
    public readonly target!: pulumi.Output<number | undefined>;
    /**
     * Metric tracking scaling policy configuration See `targetTrackingPolicies` below.
     */
    public readonly targetTrackingPolicies!: pulumi.Output<outputs.fc.V3ProvisionConfigTargetTrackingPolicy[] | undefined>;

    /**
     * Create a V3ProvisionConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: V3ProvisionConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: V3ProvisionConfigArgs | V3ProvisionConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as V3ProvisionConfigState | undefined;
            resourceInputs["alwaysAllocateCpu"] = state ? state.alwaysAllocateCpu : undefined;
            resourceInputs["alwaysAllocateGpu"] = state ? state.alwaysAllocateGpu : undefined;
            resourceInputs["functionName"] = state ? state.functionName : undefined;
            resourceInputs["qualifier"] = state ? state.qualifier : undefined;
            resourceInputs["scheduledActions"] = state ? state.scheduledActions : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
            resourceInputs["targetTrackingPolicies"] = state ? state.targetTrackingPolicies : undefined;
        } else {
            const args = argsOrState as V3ProvisionConfigArgs | undefined;
            if ((!args || args.functionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'functionName'");
            }
            resourceInputs["alwaysAllocateCpu"] = args ? args.alwaysAllocateCpu : undefined;
            resourceInputs["alwaysAllocateGpu"] = args ? args.alwaysAllocateGpu : undefined;
            resourceInputs["functionName"] = args ? args.functionName : undefined;
            resourceInputs["qualifier"] = args ? args.qualifier : undefined;
            resourceInputs["scheduledActions"] = args ? args.scheduledActions : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["targetTrackingPolicies"] = args ? args.targetTrackingPolicies : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(V3ProvisionConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering V3ProvisionConfig resources.
 */
export interface V3ProvisionConfigState {
    /**
     * Whether the CPU is always allocated. The default value is true.
     */
    alwaysAllocateCpu?: pulumi.Input<boolean>;
    /**
     * Whether to always assign GPU to function instance
     */
    alwaysAllocateGpu?: pulumi.Input<boolean>;
    /**
     * The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
     */
    functionName?: pulumi.Input<string>;
    /**
     * The function alias or LATEST.
     */
    qualifier?: pulumi.Input<string>;
    /**
     * Timing policy configuration See `scheduledActions` below.
     */
    scheduledActions?: pulumi.Input<pulumi.Input<inputs.fc.V3ProvisionConfigScheduledAction>[]>;
    /**
     * Number of reserved target resources. The value range is [0,10000].
     */
    target?: pulumi.Input<number>;
    /**
     * Metric tracking scaling policy configuration See `targetTrackingPolicies` below.
     */
    targetTrackingPolicies?: pulumi.Input<pulumi.Input<inputs.fc.V3ProvisionConfigTargetTrackingPolicy>[]>;
}

/**
 * The set of arguments for constructing a V3ProvisionConfig resource.
 */
export interface V3ProvisionConfigArgs {
    /**
     * Whether the CPU is always allocated. The default value is true.
     */
    alwaysAllocateCpu?: pulumi.Input<boolean>;
    /**
     * Whether to always assign GPU to function instance
     */
    alwaysAllocateGpu?: pulumi.Input<boolean>;
    /**
     * The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
     */
    functionName: pulumi.Input<string>;
    /**
     * The function alias or LATEST.
     */
    qualifier?: pulumi.Input<string>;
    /**
     * Timing policy configuration See `scheduledActions` below.
     */
    scheduledActions?: pulumi.Input<pulumi.Input<inputs.fc.V3ProvisionConfigScheduledAction>[]>;
    /**
     * Number of reserved target resources. The value range is [0,10000].
     */
    target?: pulumi.Input<number>;
    /**
     * Metric tracking scaling policy configuration See `targetTrackingPolicies` below.
     */
    targetTrackingPolicies?: pulumi.Input<pulumi.Input<inputs.fc.V3ProvisionConfigTargetTrackingPolicy>[]>;
}