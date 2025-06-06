// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Sag qos policy resource.
 * You need to create a QoS policy to set priorities, rate limits, and quintuple rules for different messages.
 *
 * For information about Sag Qos Policy and how to use it, see [What is Qos Policy](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/createqospolicy).
 *
 * > **NOTE:** Available since v1.60.0.
 *
 * > **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
 *
 * ## Import
 *
 * The Sag Qos Policy can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:sag/qosPolicy:QosPolicy example qos-abc123456:qospy-abc123456
 * ```
 */
export class QosPolicy extends pulumi.CustomResource {
    /**
     * Get an existing QosPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QosPolicyState, opts?: pulumi.CustomResourceOptions): QosPolicy {
        return new QosPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:sag/qosPolicy:QosPolicy';

    /**
     * Returns true if the given object is an instance of QosPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QosPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QosPolicy.__pulumiType;
    }

    /**
     * The description of the QoS policy.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The destination CIDR block.
     */
    public readonly destCidr!: pulumi.Output<string>;
    /**
     * The destination port range.
     */
    public readonly destPortRange!: pulumi.Output<string>;
    /**
     * The expiration time of the quintuple rule.
     */
    public readonly endTime!: pulumi.Output<string | undefined>;
    /**
     * The transport layer protocol.
     */
    public readonly ipProtocol!: pulumi.Output<string>;
    /**
     * The name of the QoS policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The instance ID of the QoS policy to which the quintuple rule is created.
     */
    public readonly qosId!: pulumi.Output<string>;
    /**
     * The source CIDR block.
     */
    public readonly sourceCidr!: pulumi.Output<string>;
    /**
     * The source port range of the transport layer.
     */
    public readonly sourcePortRange!: pulumi.Output<string>;
    /**
     * The time when the quintuple rule takes effect.
     */
    public readonly startTime!: pulumi.Output<string | undefined>;

    /**
     * Create a QosPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QosPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QosPolicyArgs | QosPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QosPolicyState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destCidr"] = state ? state.destCidr : undefined;
            resourceInputs["destPortRange"] = state ? state.destPortRange : undefined;
            resourceInputs["endTime"] = state ? state.endTime : undefined;
            resourceInputs["ipProtocol"] = state ? state.ipProtocol : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["qosId"] = state ? state.qosId : undefined;
            resourceInputs["sourceCidr"] = state ? state.sourceCidr : undefined;
            resourceInputs["sourcePortRange"] = state ? state.sourcePortRange : undefined;
            resourceInputs["startTime"] = state ? state.startTime : undefined;
        } else {
            const args = argsOrState as QosPolicyArgs | undefined;
            if ((!args || args.destCidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destCidr'");
            }
            if ((!args || args.destPortRange === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destPortRange'");
            }
            if ((!args || args.ipProtocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipProtocol'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            if ((!args || args.qosId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'qosId'");
            }
            if ((!args || args.sourceCidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceCidr'");
            }
            if ((!args || args.sourcePortRange === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourcePortRange'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destCidr"] = args ? args.destCidr : undefined;
            resourceInputs["destPortRange"] = args ? args.destPortRange : undefined;
            resourceInputs["endTime"] = args ? args.endTime : undefined;
            resourceInputs["ipProtocol"] = args ? args.ipProtocol : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["qosId"] = args ? args.qosId : undefined;
            resourceInputs["sourceCidr"] = args ? args.sourceCidr : undefined;
            resourceInputs["sourcePortRange"] = args ? args.sourcePortRange : undefined;
            resourceInputs["startTime"] = args ? args.startTime : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "alicloud:rocketmq/qosPolicy:QosPolicy" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(QosPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QosPolicy resources.
 */
export interface QosPolicyState {
    /**
     * The description of the QoS policy.
     */
    description?: pulumi.Input<string>;
    /**
     * The destination CIDR block.
     */
    destCidr?: pulumi.Input<string>;
    /**
     * The destination port range.
     */
    destPortRange?: pulumi.Input<string>;
    /**
     * The expiration time of the quintuple rule.
     */
    endTime?: pulumi.Input<string>;
    /**
     * The transport layer protocol.
     */
    ipProtocol?: pulumi.Input<string>;
    /**
     * The name of the QoS policy.
     */
    name?: pulumi.Input<string>;
    /**
     * The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
     */
    priority?: pulumi.Input<number>;
    /**
     * The instance ID of the QoS policy to which the quintuple rule is created.
     */
    qosId?: pulumi.Input<string>;
    /**
     * The source CIDR block.
     */
    sourceCidr?: pulumi.Input<string>;
    /**
     * The source port range of the transport layer.
     */
    sourcePortRange?: pulumi.Input<string>;
    /**
     * The time when the quintuple rule takes effect.
     */
    startTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a QosPolicy resource.
 */
export interface QosPolicyArgs {
    /**
     * The description of the QoS policy.
     */
    description?: pulumi.Input<string>;
    /**
     * The destination CIDR block.
     */
    destCidr: pulumi.Input<string>;
    /**
     * The destination port range.
     */
    destPortRange: pulumi.Input<string>;
    /**
     * The expiration time of the quintuple rule.
     */
    endTime?: pulumi.Input<string>;
    /**
     * The transport layer protocol.
     */
    ipProtocol: pulumi.Input<string>;
    /**
     * The name of the QoS policy.
     */
    name?: pulumi.Input<string>;
    /**
     * The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
     */
    priority: pulumi.Input<number>;
    /**
     * The instance ID of the QoS policy to which the quintuple rule is created.
     */
    qosId: pulumi.Input<string>;
    /**
     * The source CIDR block.
     */
    sourceCidr: pulumi.Input<string>;
    /**
     * The source port range of the transport layer.
     */
    sourcePortRange: pulumi.Input<string>;
    /**
     * The time when the quintuple rule takes effect.
     */
    startTime?: pulumi.Input<string>;
}
