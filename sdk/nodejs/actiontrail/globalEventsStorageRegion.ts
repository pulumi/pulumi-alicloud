// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Global events storage region resource.
 *
 * For information about global events storage region and how to use it, see [What is Global Events Storage Region](https://next.api.alibabacloud.com/api/Actiontrail/2020-07-06/UpdateGlobalEventsStorageRegion).
 *
 * > **NOTE:** Available since v1.201.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const foo = new alicloud.actiontrail.GlobalEventsStorageRegion("foo", {storageRegion: "cn-hangzhou"});
 * ```
 *
 * ## Import
 *
 * Global events storage region not can be imported.
 */
export class GlobalEventsStorageRegion extends pulumi.CustomResource {
    /**
     * Get an existing GlobalEventsStorageRegion resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalEventsStorageRegionState, opts?: pulumi.CustomResourceOptions): GlobalEventsStorageRegion {
        return new GlobalEventsStorageRegion(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:actiontrail/globalEventsStorageRegion:GlobalEventsStorageRegion';

    /**
     * Returns true if the given object is an instance of GlobalEventsStorageRegion.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalEventsStorageRegion {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalEventsStorageRegion.__pulumiType;
    }

    /**
     * Global Events Storage Region.
     */
    public readonly storageRegion!: pulumi.Output<string>;

    /**
     * Create a GlobalEventsStorageRegion resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: GlobalEventsStorageRegionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalEventsStorageRegionArgs | GlobalEventsStorageRegionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalEventsStorageRegionState | undefined;
            resourceInputs["storageRegion"] = state ? state.storageRegion : undefined;
        } else {
            const args = argsOrState as GlobalEventsStorageRegionArgs | undefined;
            resourceInputs["storageRegion"] = args ? args.storageRegion : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalEventsStorageRegion.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalEventsStorageRegion resources.
 */
export interface GlobalEventsStorageRegionState {
    /**
     * Global Events Storage Region.
     */
    storageRegion?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GlobalEventsStorageRegion resource.
 */
export interface GlobalEventsStorageRegionArgs {
    /**
     * Global Events Storage Region.
     */
    storageRegion?: pulumi.Input<string>;
}
