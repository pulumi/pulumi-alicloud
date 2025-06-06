// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * OSS Bucket Worm can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:oss/bucketWorm:BucketWorm example <bucket>:<worm_id>
 * ```
 */
export class BucketWorm extends pulumi.CustomResource {
    /**
     * Get an existing BucketWorm resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketWormState, opts?: pulumi.CustomResourceOptions): BucketWorm {
        return new BucketWorm(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:oss/bucketWorm:BucketWorm';

    /**
     * Returns true if the given object is an instance of BucketWorm.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketWorm {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketWorm.__pulumiType;
    }

    /**
     * The name of the bucket
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * The creation time of the resource
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The specified number of days to retain the Object.
     */
    public readonly retentionPeriodInDays!: pulumi.Output<number | undefined>;
    /**
     * The status of the compliance retention policy. Optional values:
     * - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
     * - `Locked`: The compliance retention policy is Locked.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The ID of the retention policy.
     */
    public /*out*/ readonly wormId!: pulumi.Output<string>;

    /**
     * Create a BucketWorm resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketWormArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketWormArgs | BucketWormState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketWormState | undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["retentionPeriodInDays"] = state ? state.retentionPeriodInDays : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["wormId"] = state ? state.wormId : undefined;
        } else {
            const args = argsOrState as BucketWormArgs | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["retentionPeriodInDays"] = args ? args.retentionPeriodInDays : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["wormId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BucketWorm.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketWorm resources.
 */
export interface BucketWormState {
    /**
     * The name of the bucket
     */
    bucket?: pulumi.Input<string>;
    /**
     * The creation time of the resource
     */
    createTime?: pulumi.Input<string>;
    /**
     * The specified number of days to retain the Object.
     */
    retentionPeriodInDays?: pulumi.Input<number>;
    /**
     * The status of the compliance retention policy. Optional values:
     * - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
     * - `Locked`: The compliance retention policy is Locked.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the retention policy.
     */
    wormId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BucketWorm resource.
 */
export interface BucketWormArgs {
    /**
     * The name of the bucket
     */
    bucket: pulumi.Input<string>;
    /**
     * The specified number of days to retain the Object.
     */
    retentionPeriodInDays?: pulumi.Input<number>;
    /**
     * The status of the compliance retention policy. Optional values:
     * - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
     * - `Locked`: The compliance retention policy is Locked.
     */
    status?: pulumi.Input<string>;
}
