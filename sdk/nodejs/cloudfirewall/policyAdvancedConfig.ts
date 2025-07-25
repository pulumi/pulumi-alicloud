// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Cloud Firewall Policy Advanced Config can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudfirewall/policyAdvancedConfig:PolicyAdvancedConfig example 
 * ```
 */
export class PolicyAdvancedConfig extends pulumi.CustomResource {
    /**
     * Get an existing PolicyAdvancedConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyAdvancedConfigState, opts?: pulumi.CustomResourceOptions): PolicyAdvancedConfig {
        return new PolicyAdvancedConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudfirewall/policyAdvancedConfig:PolicyAdvancedConfig';

    /**
     * Returns true if the given object is an instance of PolicyAdvancedConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolicyAdvancedConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolicyAdvancedConfig.__pulumiType;
    }

    /**
     * Access control policy strict mode of on-state. Valid values:
     */
    public readonly internetSwitch!: pulumi.Output<string>;

    /**
     * Create a PolicyAdvancedConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyAdvancedConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyAdvancedConfigArgs | PolicyAdvancedConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyAdvancedConfigState | undefined;
            resourceInputs["internetSwitch"] = state ? state.internetSwitch : undefined;
        } else {
            const args = argsOrState as PolicyAdvancedConfigArgs | undefined;
            if ((!args || args.internetSwitch === undefined) && !opts.urn) {
                throw new Error("Missing required property 'internetSwitch'");
            }
            resourceInputs["internetSwitch"] = args ? args.internetSwitch : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PolicyAdvancedConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolicyAdvancedConfig resources.
 */
export interface PolicyAdvancedConfigState {
    /**
     * Access control policy strict mode of on-state. Valid values:
     */
    internetSwitch?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PolicyAdvancedConfig resource.
 */
export interface PolicyAdvancedConfigArgs {
    /**
     * Access control policy strict mode of on-state. Valid values:
     */
    internetSwitch: pulumi.Input<string>;
}
