// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Cloud Phone Instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudphoneinstance/cloudPhoneInstance:CloudPhoneInstance example <id>
 * ```
 */
export class CloudPhoneInstance extends pulumi.CustomResource {
    /**
     * Get an existing CloudPhoneInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudPhoneInstanceState, opts?: pulumi.CustomResourceOptions): CloudPhoneInstance {
        return new CloudPhoneInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudphoneinstance/cloudPhoneInstance:CloudPhoneInstance';

    /**
     * Returns true if the given object is an instance of CloudPhoneInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudPhoneInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudPhoneInstance.__pulumiType;
    }

    /**
     * The ID of the instance group to which the instance belongs
     */
    public readonly androidInstanceGroupId!: pulumi.Output<string | undefined>;
    /**
     * The instance name
     */
    public readonly androidInstanceName!: pulumi.Output<string | undefined>;

    /**
     * Create a CloudPhoneInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CloudPhoneInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudPhoneInstanceArgs | CloudPhoneInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudPhoneInstanceState | undefined;
            resourceInputs["androidInstanceGroupId"] = state ? state.androidInstanceGroupId : undefined;
            resourceInputs["androidInstanceName"] = state ? state.androidInstanceName : undefined;
        } else {
            const args = argsOrState as CloudPhoneInstanceArgs | undefined;
            resourceInputs["androidInstanceGroupId"] = args ? args.androidInstanceGroupId : undefined;
            resourceInputs["androidInstanceName"] = args ? args.androidInstanceName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CloudPhoneInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudPhoneInstance resources.
 */
export interface CloudPhoneInstanceState {
    /**
     * The ID of the instance group to which the instance belongs
     */
    androidInstanceGroupId?: pulumi.Input<string>;
    /**
     * The instance name
     */
    androidInstanceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CloudPhoneInstance resource.
 */
export interface CloudPhoneInstanceArgs {
    /**
     * The ID of the instance group to which the instance belongs
     */
    androidInstanceGroupId?: pulumi.Input<string>;
    /**
     * The instance name
     */
    androidInstanceName?: pulumi.Input<string>;
}
