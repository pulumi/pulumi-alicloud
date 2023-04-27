// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Tag Policy resource.
 *
 * For information about Tag Policy and how to use it,
 * see [What is Policy](https://www.alibabacloud.com/help/en/resource-management/latest/create-policy).
 *
 * > **NOTE:** Available in v1.203.0+.
 *
 * ## Import
 *
 * Tag Policy can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:tag/policy:Policy example <id>
 * ```
 */
export class Policy extends pulumi.CustomResource {
    /**
     * Get an existing Policy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyState, opts?: pulumi.CustomResourceOptions): Policy {
        return new Policy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:tag/policy:Policy';

    /**
     * Returns true if the given object is an instance of Policy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Policy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Policy.__pulumiType;
    }

    /**
     * The content of the policy.
     */
    public readonly policyContent!: pulumi.Output<string>;
    /**
     * The description of the policy. The description must be 1 to 512 characters in length.
     */
    public readonly policyDesc!: pulumi.Output<string | undefined>;
    /**
     * The name of the policy. name must be 1 to 128 characters in length and can contain letters,
     * digits, and hyphens (-).
     */
    public readonly policyName!: pulumi.Output<string>;
    /**
     * The type of the tag policy. Valid values: `USER`, `RD`.
     */
    public readonly userType!: pulumi.Output<string | undefined>;

    /**
     * Create a Policy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyArgs | PolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyState | undefined;
            resourceInputs["policyContent"] = state ? state.policyContent : undefined;
            resourceInputs["policyDesc"] = state ? state.policyDesc : undefined;
            resourceInputs["policyName"] = state ? state.policyName : undefined;
            resourceInputs["userType"] = state ? state.userType : undefined;
        } else {
            const args = argsOrState as PolicyArgs | undefined;
            if ((!args || args.policyContent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyContent'");
            }
            if ((!args || args.policyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyName'");
            }
            resourceInputs["policyContent"] = args ? args.policyContent : undefined;
            resourceInputs["policyDesc"] = args ? args.policyDesc : undefined;
            resourceInputs["policyName"] = args ? args.policyName : undefined;
            resourceInputs["userType"] = args ? args.userType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Policy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Policy resources.
 */
export interface PolicyState {
    /**
     * The content of the policy.
     */
    policyContent?: pulumi.Input<string>;
    /**
     * The description of the policy. The description must be 1 to 512 characters in length.
     */
    policyDesc?: pulumi.Input<string>;
    /**
     * The name of the policy. name must be 1 to 128 characters in length and can contain letters,
     * digits, and hyphens (-).
     */
    policyName?: pulumi.Input<string>;
    /**
     * The type of the tag policy. Valid values: `USER`, `RD`.
     */
    userType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Policy resource.
 */
export interface PolicyArgs {
    /**
     * The content of the policy.
     */
    policyContent: pulumi.Input<string>;
    /**
     * The description of the policy. The description must be 1 to 512 characters in length.
     */
    policyDesc?: pulumi.Input<string>;
    /**
     * The name of the policy. name must be 1 to 128 characters in length and can contain letters,
     * digits, and hyphens (-).
     */
    policyName: pulumi.Input<string>;
    /**
     * The type of the tag policy. Valid values: `USER`, `RD`.
     */
    userType?: pulumi.Input<string>;
}