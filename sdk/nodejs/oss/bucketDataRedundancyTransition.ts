// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a OSS Bucket Data Redundancy Transition resource. Create a storage redundancy transition task to convert local redundant storage(LRS) to zone redundant storage(ZRS).
 *
 * For information about OSS Bucket Data Redundancy Transition and how to use it, see [What is Bucket Data Redundancy Transition](https://www.alibabacloud.com/help/en/oss/developer-reference/createbucketdataredundancytransition).
 *
 * > **NOTE:** Available since v1.224.0.
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
 * const name = config.get("name") || "terraform-example";
 * const createBucket = new alicloud.oss.Bucket("CreateBucket", {
 *     storageClass: "Standard",
 *     bucket: name,
 * });
 * const _default = new alicloud.oss.BucketDataRedundancyTransition("default", {bucket: createBucket.bucket});
 * ```
 *
 * ## Import
 *
 * OSS Bucket Data Redundancy Transition can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:oss/bucketDataRedundancyTransition:BucketDataRedundancyTransition example <bucket>:<task_id>
 * ```
 */
export class BucketDataRedundancyTransition extends pulumi.CustomResource {
    /**
     * Get an existing BucketDataRedundancyTransition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketDataRedundancyTransitionState, opts?: pulumi.CustomResourceOptions): BucketDataRedundancyTransition {
        return new BucketDataRedundancyTransition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:oss/bucketDataRedundancyTransition:BucketDataRedundancyTransition';

    /**
     * Returns true if the given object is an instance of BucketDataRedundancyTransition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketDataRedundancyTransition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketDataRedundancyTransition.__pulumiType;
    }

    /**
     * Storage space name.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * Stores the creation time of the redundant transformation task.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Stores the state of the redundant translation task. The values are as follows:  Queueing: in the queue.  Processing: In progress.  Finished: Finished.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Unique identification of the storage redundancy conversion task.
     */
    public /*out*/ readonly taskId!: pulumi.Output<string>;

    /**
     * Create a BucketDataRedundancyTransition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketDataRedundancyTransitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketDataRedundancyTransitionArgs | BucketDataRedundancyTransitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketDataRedundancyTransitionState | undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["taskId"] = state ? state.taskId : undefined;
        } else {
            const args = argsOrState as BucketDataRedundancyTransitionArgs | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["taskId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BucketDataRedundancyTransition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketDataRedundancyTransition resources.
 */
export interface BucketDataRedundancyTransitionState {
    /**
     * Storage space name.
     */
    bucket?: pulumi.Input<string>;
    /**
     * Stores the creation time of the redundant transformation task.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Stores the state of the redundant translation task. The values are as follows:  Queueing: in the queue.  Processing: In progress.  Finished: Finished.
     */
    status?: pulumi.Input<string>;
    /**
     * Unique identification of the storage redundancy conversion task.
     */
    taskId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BucketDataRedundancyTransition resource.
 */
export interface BucketDataRedundancyTransitionArgs {
    /**
     * Storage space name.
     */
    bucket: pulumi.Input<string>;
}