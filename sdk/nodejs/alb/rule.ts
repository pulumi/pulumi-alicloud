// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Application Load Balancer (ALB) Rule resource.
 *
 * For information about Application Load Balancer (ALB) Rule and how to use it, see [What is Rule](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-createrule).
 *
 * > **NOTE:** Available since v1.133.0.
 *
 * > **NOTE:** This version only supports forwarding rules in the request direction.
 *
 * ## Import
 *
 * Application Load Balancer (ALB) Rule can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:alb/rule:Rule example <id>
 * ```
 */
export class Rule extends pulumi.CustomResource {
    /**
     * Get an existing Rule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RuleState, opts?: pulumi.CustomResourceOptions): Rule {
        return new Rule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:alb/rule:Rule';

    /**
     * Returns true if the given object is an instance of Rule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Rule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Rule.__pulumiType;
    }

    /**
     * The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
     * - `Request`: The forwarding rule is applied to the client requests received by ALB.
     * - `Response`: The forwarding rule is applied to the responses returned by backend servers.
     */
    public readonly direction!: pulumi.Output<string>;
    /**
     * Specifies whether to precheck this request.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the listener to which the forwarding rule belongs.
     */
    public readonly listenerId!: pulumi.Output<string>;
    /**
     * The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The actions of the forwarding rules. See `ruleActions` below.
     */
    public readonly ruleActions!: pulumi.Output<outputs.alb.RuleRuleAction[]>;
    /**
     * The conditions of the forwarding rule. See `ruleConditions` below.
     */
    public readonly ruleConditions!: pulumi.Output<outputs.alb.RuleRuleCondition[]>;
    /**
     * The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     */
    public readonly ruleName!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Rule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RuleArgs | RuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RuleState | undefined;
            resourceInputs["direction"] = state ? state.direction : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["listenerId"] = state ? state.listenerId : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["ruleActions"] = state ? state.ruleActions : undefined;
            resourceInputs["ruleConditions"] = state ? state.ruleConditions : undefined;
            resourceInputs["ruleName"] = state ? state.ruleName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as RuleArgs | undefined;
            if ((!args || args.listenerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'listenerId'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            if ((!args || args.ruleActions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleActions'");
            }
            if ((!args || args.ruleConditions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleConditions'");
            }
            if ((!args || args.ruleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleName'");
            }
            resourceInputs["direction"] = args ? args.direction : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["listenerId"] = args ? args.listenerId : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["ruleActions"] = args ? args.ruleActions : undefined;
            resourceInputs["ruleConditions"] = args ? args.ruleConditions : undefined;
            resourceInputs["ruleName"] = args ? args.ruleName : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Rule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rule resources.
 */
export interface RuleState {
    /**
     * The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
     * - `Request`: The forwarding rule is applied to the client requests received by ALB.
     * - `Response`: The forwarding rule is applied to the responses returned by backend servers.
     */
    direction?: pulumi.Input<string>;
    /**
     * Specifies whether to precheck this request.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The ID of the listener to which the forwarding rule belongs.
     */
    listenerId?: pulumi.Input<string>;
    /**
     * The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
     */
    priority?: pulumi.Input<number>;
    /**
     * The actions of the forwarding rules. See `ruleActions` below.
     */
    ruleActions?: pulumi.Input<pulumi.Input<inputs.alb.RuleRuleAction>[]>;
    /**
     * The conditions of the forwarding rule. See `ruleConditions` below.
     */
    ruleConditions?: pulumi.Input<pulumi.Input<inputs.alb.RuleRuleCondition>[]>;
    /**
     * The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     */
    ruleName?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Rule resource.
 */
export interface RuleArgs {
    /**
     * The direction to which the forwarding rule is applied. Default value: `Request`. Valid values:
     * - `Request`: The forwarding rule is applied to the client requests received by ALB.
     * - `Response`: The forwarding rule is applied to the responses returned by backend servers.
     */
    direction?: pulumi.Input<string>;
    /**
     * Specifies whether to precheck this request.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The ID of the listener to which the forwarding rule belongs.
     */
    listenerId: pulumi.Input<string>;
    /**
     * The priority of the rule. Valid values: 1 to 10000. A smaller value indicates a higher priority. **Note*:* The priority of each rule within the same listener must be unique.
     */
    priority: pulumi.Input<number>;
    /**
     * The actions of the forwarding rules. See `ruleActions` below.
     */
    ruleActions: pulumi.Input<pulumi.Input<inputs.alb.RuleRuleAction>[]>;
    /**
     * The conditions of the forwarding rule. See `ruleConditions` below.
     */
    ruleConditions: pulumi.Input<pulumi.Input<inputs.alb.RuleRuleCondition>[]>;
    /**
     * The name of the forwarding rule. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     */
    ruleName: pulumi.Input<string>;
}
