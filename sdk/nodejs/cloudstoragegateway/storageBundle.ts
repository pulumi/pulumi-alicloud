// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Storage Gateway Storage Bundle resource.
 *
 * For information about Cloud Storage Gateway Storage Bundle and how to use it, see [What is Storage Bundle](https://www.alibabacloud.com/help/en/cloud-storage-gateway/latest/createstoragebundle).
 *
 * > **NOTE:** Available since v1.116.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.cloudstoragegateway.StorageBundle("example", {storageBundleName: "example_value"});
 * ```
 *
 * ## Import
 *
 * Cloud Storage Gateway Storage Bundle can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudstoragegateway/storageBundle:StorageBundle example <id>
 * ```
 */
export class StorageBundle extends pulumi.CustomResource {
    /**
     * Get an existing StorageBundle resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StorageBundleState, opts?: pulumi.CustomResourceOptions): StorageBundle {
        return new StorageBundle(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudstoragegateway/storageBundle:StorageBundle';

    /**
     * Returns true if the given object is an instance of StorageBundle.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StorageBundle {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StorageBundle.__pulumiType;
    }

    /**
     * The description of storage bundle.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of storage bundle.
     */
    public readonly storageBundleName!: pulumi.Output<string>;

    /**
     * Create a StorageBundle resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StorageBundleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StorageBundleArgs | StorageBundleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StorageBundleState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["storageBundleName"] = state ? state.storageBundleName : undefined;
        } else {
            const args = argsOrState as StorageBundleArgs | undefined;
            if ((!args || args.storageBundleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageBundleName'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["storageBundleName"] = args ? args.storageBundleName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StorageBundle.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StorageBundle resources.
 */
export interface StorageBundleState {
    /**
     * The description of storage bundle.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of storage bundle.
     */
    storageBundleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StorageBundle resource.
 */
export interface StorageBundleArgs {
    /**
     * The description of storage bundle.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of storage bundle.
     */
    storageBundleName: pulumi.Input<string>;
}
