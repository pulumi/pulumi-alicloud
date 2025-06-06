// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloudauth Face Config resource.
 *
 * For information about Cloudauth Face Config and how to use it, see [What is Face Config](https://help.aliyun.com/zh/id-verification/cloudauth/product-overview/end-of-integration-announcement-on-id-verification).
 *
 * > **NOTE:** Available since v1.137.0.
 *
 * > **NOTE:** In order to provide you with more perfect product capabilities, the real person certification service has stopped access, it is recommended that you use the upgraded version of the [real person certification financial real person certification service](https://help.aliyun.com/zh/id-verification/product-overview/what-is-id-verification-for-financial-services). Users that have access to real person authentication are not affected.
 *
 * ## Import
 *
 * Cloudauth Face Config can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudauth/faceConfig:FaceConfig example <lang>
 * ```
 */
export class FaceConfig extends pulumi.CustomResource {
    /**
     * Get an existing FaceConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FaceConfigState, opts?: pulumi.CustomResourceOptions): FaceConfig {
        return new FaceConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudauth/faceConfig:FaceConfig';

    /**
     * Returns true if the given object is an instance of FaceConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FaceConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FaceConfig.__pulumiType;
    }

    /**
     * Scene name.
     */
    public readonly bizName!: pulumi.Output<string>;
    /**
     * Scene type. **NOTE:** The bizType cannot exceed 32 characters and can only use English letters, numbers and dashes (-).
     */
    public readonly bizType!: pulumi.Output<string>;
    /**
     * Last Modified Date.
     */
    public /*out*/ readonly gmtModified!: pulumi.Output<string>;

    /**
     * Create a FaceConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FaceConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FaceConfigArgs | FaceConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FaceConfigState | undefined;
            resourceInputs["bizName"] = state ? state.bizName : undefined;
            resourceInputs["bizType"] = state ? state.bizType : undefined;
            resourceInputs["gmtModified"] = state ? state.gmtModified : undefined;
        } else {
            const args = argsOrState as FaceConfigArgs | undefined;
            if ((!args || args.bizName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bizName'");
            }
            if ((!args || args.bizType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bizType'");
            }
            resourceInputs["bizName"] = args ? args.bizName : undefined;
            resourceInputs["bizType"] = args ? args.bizType : undefined;
            resourceInputs["gmtModified"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FaceConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FaceConfig resources.
 */
export interface FaceConfigState {
    /**
     * Scene name.
     */
    bizName?: pulumi.Input<string>;
    /**
     * Scene type. **NOTE:** The bizType cannot exceed 32 characters and can only use English letters, numbers and dashes (-).
     */
    bizType?: pulumi.Input<string>;
    /**
     * Last Modified Date.
     */
    gmtModified?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FaceConfig resource.
 */
export interface FaceConfigArgs {
    /**
     * Scene name.
     */
    bizName: pulumi.Input<string>;
    /**
     * Scene type. **NOTE:** The bizType cannot exceed 32 characters and can only use English letters, numbers and dashes (-).
     */
    bizType: pulumi.Input<string>;
}
