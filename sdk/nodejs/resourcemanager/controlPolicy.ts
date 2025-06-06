// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Control Policy resource.
 *
 * For information about Resource Manager Control Policy and how to use it, see [What is Control Policy](https://www.alibabacloud.com/help/en/resource-management/latest/api-resourcedirectorymaster-2022-04-19-createcontrolpolicy).
 *
 * > **NOTE:** Available since v1.120.0.
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
 * const name = config.get("name") || "tf-example";
 * const example = new alicloud.resourcemanager.ControlPolicy("example", {
 *     controlPolicyName: name,
 *     description: name,
 *     effectScope: "RAM",
 *     policyDocument: `  {
 *     "Version": "1",
 *     "Statement": [
 *       {
 *         "Effect": "Deny",
 *         "Action": [
 *           "ram:UpdateRole",
 *           "ram:DeleteRole",
 *           "ram:AttachPolicyToRole",
 *           "ram:DetachPolicyFromRole"
 *         ],
 *         "Resource": "acs:ram:*:*:role/ResourceDirectoryAccountAccessRole"
 *       }
 *     ]
 *   }
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * Resource Manager Control Policy can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:resourcemanager/controlPolicy:ControlPolicy example <id>
 * ```
 */
export class ControlPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ControlPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ControlPolicyState, opts?: pulumi.CustomResourceOptions): ControlPolicy {
        return new ControlPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/controlPolicy:ControlPolicy';

    /**
     * Returns true if the given object is an instance of ControlPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ControlPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ControlPolicy.__pulumiType;
    }

    /**
     * The name of control policy.
     */
    public readonly controlPolicyName!: pulumi.Output<string>;
    /**
     * The description of control policy.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The effect scope. Valid values `RAM`.
     */
    public readonly effectScope!: pulumi.Output<string>;
    /**
     * The policy document of control policy.
     */
    public readonly policyDocument!: pulumi.Output<string>;

    /**
     * Create a ControlPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ControlPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ControlPolicyArgs | ControlPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ControlPolicyState | undefined;
            resourceInputs["controlPolicyName"] = state ? state.controlPolicyName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectScope"] = state ? state.effectScope : undefined;
            resourceInputs["policyDocument"] = state ? state.policyDocument : undefined;
        } else {
            const args = argsOrState as ControlPolicyArgs | undefined;
            if ((!args || args.controlPolicyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'controlPolicyName'");
            }
            if ((!args || args.effectScope === undefined) && !opts.urn) {
                throw new Error("Missing required property 'effectScope'");
            }
            if ((!args || args.policyDocument === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyDocument'");
            }
            resourceInputs["controlPolicyName"] = args ? args.controlPolicyName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["effectScope"] = args ? args.effectScope : undefined;
            resourceInputs["policyDocument"] = args ? args.policyDocument : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ControlPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ControlPolicy resources.
 */
export interface ControlPolicyState {
    /**
     * The name of control policy.
     */
    controlPolicyName?: pulumi.Input<string>;
    /**
     * The description of control policy.
     */
    description?: pulumi.Input<string>;
    /**
     * The effect scope. Valid values `RAM`.
     */
    effectScope?: pulumi.Input<string>;
    /**
     * The policy document of control policy.
     */
    policyDocument?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ControlPolicy resource.
 */
export interface ControlPolicyArgs {
    /**
     * The name of control policy.
     */
    controlPolicyName: pulumi.Input<string>;
    /**
     * The description of control policy.
     */
    description?: pulumi.Input<string>;
    /**
     * The effect scope. Valid values `RAM`.
     */
    effectScope: pulumi.Input<string>;
    /**
     * The policy document of control policy.
     */
    policyDocument: pulumi.Input<string>;
}
