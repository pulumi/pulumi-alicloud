// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ARMS Env Pod Monitor resource. PodMonitor for the arms environment.
 *
 * For information about ARMS Env Pod Monitor and how to use it, see [What is Env Pod Monitor](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createenvpodmonitor).
 *
 * > **NOTE:** Available since v1.212.0.
 *
 * ## Import
 *
 * ARMS Env Pod Monitor can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:arms/envPodMonitor:EnvPodMonitor example <environment_id>:<namespace>:<env_pod_monitor_name>
 * ```
 */
export class EnvPodMonitor extends pulumi.CustomResource {
    /**
     * Get an existing EnvPodMonitor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvPodMonitorState, opts?: pulumi.CustomResourceOptions): EnvPodMonitor {
        return new EnvPodMonitor(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:arms/envPodMonitor:EnvPodMonitor';

    /**
     * Returns true if the given object is an instance of EnvPodMonitor.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EnvPodMonitor {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EnvPodMonitor.__pulumiType;
    }

    /**
     * Language environment, default is Chinese zh | en.
     */
    public readonly aliyunLang!: pulumi.Output<string | undefined>;
    /**
     * Yaml configuration string.
     */
    public readonly configYaml!: pulumi.Output<string>;
    /**
     * The name of the resource.
     */
    public /*out*/ readonly envPodMonitorName!: pulumi.Output<string>;
    /**
     * Environment id.
     */
    public readonly environmentId!: pulumi.Output<string>;
    /**
     * Resource namespace.
     */
    public /*out*/ readonly namespace!: pulumi.Output<string>;
    /**
     * PodMonitor status.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a EnvPodMonitor resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvPodMonitorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvPodMonitorArgs | EnvPodMonitorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvPodMonitorState | undefined;
            resourceInputs["aliyunLang"] = state ? state.aliyunLang : undefined;
            resourceInputs["configYaml"] = state ? state.configYaml : undefined;
            resourceInputs["envPodMonitorName"] = state ? state.envPodMonitorName : undefined;
            resourceInputs["environmentId"] = state ? state.environmentId : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as EnvPodMonitorArgs | undefined;
            if ((!args || args.configYaml === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configYaml'");
            }
            if ((!args || args.environmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environmentId'");
            }
            resourceInputs["aliyunLang"] = args ? args.aliyunLang : undefined;
            resourceInputs["configYaml"] = args ? args.configYaml : undefined;
            resourceInputs["environmentId"] = args ? args.environmentId : undefined;
            resourceInputs["envPodMonitorName"] = undefined /*out*/;
            resourceInputs["namespace"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EnvPodMonitor.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EnvPodMonitor resources.
 */
export interface EnvPodMonitorState {
    /**
     * Language environment, default is Chinese zh | en.
     */
    aliyunLang?: pulumi.Input<string>;
    /**
     * Yaml configuration string.
     */
    configYaml?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    envPodMonitorName?: pulumi.Input<string>;
    /**
     * Environment id.
     */
    environmentId?: pulumi.Input<string>;
    /**
     * Resource namespace.
     */
    namespace?: pulumi.Input<string>;
    /**
     * PodMonitor status.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnvPodMonitor resource.
 */
export interface EnvPodMonitorArgs {
    /**
     * Language environment, default is Chinese zh | en.
     */
    aliyunLang?: pulumi.Input<string>;
    /**
     * Yaml configuration string.
     */
    configYaml: pulumi.Input<string>;
    /**
     * Environment id.
     */
    environmentId: pulumi.Input<string>;
}