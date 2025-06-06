// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Sag Acl Rule resource. This topic describes how to configure an access control list (ACL) rule for a target Smart Access Gateway instance to permit or deny access to or from specified IP addresses in the ACL rule.
 *
 * For information about Sag Acl Rule and how to use it, see [What is access control list (ACL) rule](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/addaclrule).
 *
 * > **NOTE:** Available since v1.60.0.
 *
 * > **NOTE:** Only the following regions support create Cloud Connect Network. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
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
 * const name = config.get("name") || "tf_example";
 * const _default = new alicloud.sag.Acl("default", {name: name});
 * const defaultAclRule = new alicloud.sag.AclRule("default", {
 *     aclId: _default.id,
 *     description: name,
 *     policy: "accept",
 *     ipProtocol: "ALL",
 *     direction: "in",
 *     sourceCidr: "10.10.1.0/24",
 *     sourcePortRange: "-1/-1",
 *     destCidr: "192.168.1.0/24",
 *     destPortRange: "-1/-1",
 *     priority: 1,
 * });
 * ```
 *
 * ## Import
 *
 * The Sag Acl Rule can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:sag/aclRule:AclRule example acr-abc123456
 * ```
 */
export class AclRule extends pulumi.CustomResource {
    /**
     * Get an existing AclRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclRuleState, opts?: pulumi.CustomResourceOptions): AclRule {
        return new AclRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:sag/aclRule:AclRule';

    /**
     * Returns true if the given object is an instance of AclRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AclRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AclRule.__pulumiType;
    }

    /**
     * The ID of the ACL.
     */
    public readonly aclId!: pulumi.Output<string>;
    /**
     * The description of the ACL rule. It must be 1 to 512 characters in length.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
     */
    public readonly destCidr!: pulumi.Output<string>;
    /**
     * The range of the destination port. Valid value: 80/80.
     */
    public readonly destPortRange!: pulumi.Output<string>;
    /**
     * The direction of the ACL rule. Valid values: in|out.
     */
    public readonly direction!: pulumi.Output<string>;
    /**
     * The protocol used by the ACL rule. The value is not case sensitive.
     */
    public readonly ipProtocol!: pulumi.Output<string>;
    /**
     * The policy used by the ACL rule. Valid values: accept|drop.
     */
    public readonly policy!: pulumi.Output<string>;
    /**
     * The priority of the ACL rule. Value range: 1 to 100.
     */
    public readonly priority!: pulumi.Output<number | undefined>;
    /**
     * The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
     */
    public readonly sourceCidr!: pulumi.Output<string>;
    /**
     * The range of the source port. Valid value: 80/80.
     */
    public readonly sourcePortRange!: pulumi.Output<string>;

    /**
     * Create a AclRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AclRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AclRuleArgs | AclRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AclRuleState | undefined;
            resourceInputs["aclId"] = state ? state.aclId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destCidr"] = state ? state.destCidr : undefined;
            resourceInputs["destPortRange"] = state ? state.destPortRange : undefined;
            resourceInputs["direction"] = state ? state.direction : undefined;
            resourceInputs["ipProtocol"] = state ? state.ipProtocol : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["sourceCidr"] = state ? state.sourceCidr : undefined;
            resourceInputs["sourcePortRange"] = state ? state.sourcePortRange : undefined;
        } else {
            const args = argsOrState as AclRuleArgs | undefined;
            if ((!args || args.aclId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aclId'");
            }
            if ((!args || args.destCidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destCidr'");
            }
            if ((!args || args.destPortRange === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destPortRange'");
            }
            if ((!args || args.direction === undefined) && !opts.urn) {
                throw new Error("Missing required property 'direction'");
            }
            if ((!args || args.ipProtocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipProtocol'");
            }
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            if ((!args || args.sourceCidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceCidr'");
            }
            if ((!args || args.sourcePortRange === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourcePortRange'");
            }
            resourceInputs["aclId"] = args ? args.aclId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destCidr"] = args ? args.destCidr : undefined;
            resourceInputs["destPortRange"] = args ? args.destPortRange : undefined;
            resourceInputs["direction"] = args ? args.direction : undefined;
            resourceInputs["ipProtocol"] = args ? args.ipProtocol : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["sourceCidr"] = args ? args.sourceCidr : undefined;
            resourceInputs["sourcePortRange"] = args ? args.sourcePortRange : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AclRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AclRule resources.
 */
export interface AclRuleState {
    /**
     * The ID of the ACL.
     */
    aclId?: pulumi.Input<string>;
    /**
     * The description of the ACL rule. It must be 1 to 512 characters in length.
     */
    description?: pulumi.Input<string>;
    /**
     * The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
     */
    destCidr?: pulumi.Input<string>;
    /**
     * The range of the destination port. Valid value: 80/80.
     */
    destPortRange?: pulumi.Input<string>;
    /**
     * The direction of the ACL rule. Valid values: in|out.
     */
    direction?: pulumi.Input<string>;
    /**
     * The protocol used by the ACL rule. The value is not case sensitive.
     */
    ipProtocol?: pulumi.Input<string>;
    /**
     * The policy used by the ACL rule. Valid values: accept|drop.
     */
    policy?: pulumi.Input<string>;
    /**
     * The priority of the ACL rule. Value range: 1 to 100.
     */
    priority?: pulumi.Input<number>;
    /**
     * The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
     */
    sourceCidr?: pulumi.Input<string>;
    /**
     * The range of the source port. Valid value: 80/80.
     */
    sourcePortRange?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AclRule resource.
 */
export interface AclRuleArgs {
    /**
     * The ID of the ACL.
     */
    aclId: pulumi.Input<string>;
    /**
     * The description of the ACL rule. It must be 1 to 512 characters in length.
     */
    description?: pulumi.Input<string>;
    /**
     * The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
     */
    destCidr: pulumi.Input<string>;
    /**
     * The range of the destination port. Valid value: 80/80.
     */
    destPortRange: pulumi.Input<string>;
    /**
     * The direction of the ACL rule. Valid values: in|out.
     */
    direction: pulumi.Input<string>;
    /**
     * The protocol used by the ACL rule. The value is not case sensitive.
     */
    ipProtocol: pulumi.Input<string>;
    /**
     * The policy used by the ACL rule. Valid values: accept|drop.
     */
    policy: pulumi.Input<string>;
    /**
     * The priority of the ACL rule. Value range: 1 to 100.
     */
    priority?: pulumi.Input<number>;
    /**
     * The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
     */
    sourceCidr: pulumi.Input<string>;
    /**
     * The range of the source port. Valid value: 80/80.
     */
    sourcePortRange: pulumi.Input<string>;
}
