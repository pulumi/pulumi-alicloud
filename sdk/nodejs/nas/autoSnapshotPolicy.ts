// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Network Attached Storage (NAS) Auto Snapshot Policy resource.
 *
 * For information about Network Attached Storage (NAS) Auto Snapshot Policy and how to use it, see [What is Auto Snapshot Policy](https://www.alibabacloud.com/help/en/doc-detail/135662.html).
 *
 * > **NOTE:** Available in v1.153.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.nas.AutoSnapshotPolicy("example", {
 *     autoSnapshotPolicyName: "example_value",
 *     repeatWeekdays: [
 *         "3",
 *         "4",
 *         "5",
 *     ],
 *     retentionDays: 30,
 *     timePoints: [
 *         "3",
 *         "4",
 *         "5",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Network Attached Storage (NAS) Auto Snapshot Policy can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:nas/autoSnapshotPolicy:AutoSnapshotPolicy example <id>
 * ```
 */
export class AutoSnapshotPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AutoSnapshotPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AutoSnapshotPolicyState, opts?: pulumi.CustomResourceOptions): AutoSnapshotPolicy {
        return new AutoSnapshotPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:nas/autoSnapshotPolicy:AutoSnapshotPolicy';

    /**
     * Returns true if the given object is an instance of AutoSnapshotPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AutoSnapshotPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AutoSnapshotPolicy.__pulumiType;
    }

    /**
     * The name of the automatic snapshot policy. Limits:
     * - The name must be `2` to `128` characters in length,
     * - The name must start with a letter.
     * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
     * - The value of this parameter is empty by default.
     */
    public readonly autoSnapshotPolicyName!: pulumi.Output<string | undefined>;
    /**
     * The day on which an auto snapshot is created.
     * - A maximum of 7 time points can be selected.
     * - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
     */
    public readonly repeatWeekdays!: pulumi.Output<string[]>;
    /**
     * The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
     * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
     */
    public readonly retentionDays!: pulumi.Output<number>;
    /**
     * The status of the automatic snapshot policy.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The point in time at which an auto snapshot is created.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
     */
    public readonly timePoints!: pulumi.Output<string[]>;

    /**
     * Create a AutoSnapshotPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AutoSnapshotPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AutoSnapshotPolicyArgs | AutoSnapshotPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AutoSnapshotPolicyState | undefined;
            resourceInputs["autoSnapshotPolicyName"] = state ? state.autoSnapshotPolicyName : undefined;
            resourceInputs["repeatWeekdays"] = state ? state.repeatWeekdays : undefined;
            resourceInputs["retentionDays"] = state ? state.retentionDays : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["timePoints"] = state ? state.timePoints : undefined;
        } else {
            const args = argsOrState as AutoSnapshotPolicyArgs | undefined;
            if ((!args || args.repeatWeekdays === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repeatWeekdays'");
            }
            if ((!args || args.timePoints === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timePoints'");
            }
            resourceInputs["autoSnapshotPolicyName"] = args ? args.autoSnapshotPolicyName : undefined;
            resourceInputs["repeatWeekdays"] = args ? args.repeatWeekdays : undefined;
            resourceInputs["retentionDays"] = args ? args.retentionDays : undefined;
            resourceInputs["timePoints"] = args ? args.timePoints : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AutoSnapshotPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AutoSnapshotPolicy resources.
 */
export interface AutoSnapshotPolicyState {
    /**
     * The name of the automatic snapshot policy. Limits:
     * - The name must be `2` to `128` characters in length,
     * - The name must start with a letter.
     * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
     * - The value of this parameter is empty by default.
     */
    autoSnapshotPolicyName?: pulumi.Input<string>;
    /**
     * The day on which an auto snapshot is created.
     * - A maximum of 7 time points can be selected.
     * - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
     */
    repeatWeekdays?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
     * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
     */
    retentionDays?: pulumi.Input<number>;
    /**
     * The status of the automatic snapshot policy.
     */
    status?: pulumi.Input<string>;
    /**
     * The point in time at which an auto snapshot is created.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
     */
    timePoints?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AutoSnapshotPolicy resource.
 */
export interface AutoSnapshotPolicyArgs {
    /**
     * The name of the automatic snapshot policy. Limits:
     * - The name must be `2` to `128` characters in length,
     * - The name must start with a letter.
     * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
     * - The value of this parameter is empty by default.
     */
    autoSnapshotPolicyName?: pulumi.Input<string>;
    /**
     * The day on which an auto snapshot is created.
     * - A maximum of 7 time points can be selected.
     * - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
     */
    repeatWeekdays: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
     * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
     */
    retentionDays?: pulumi.Input<number>;
    /**
     * The point in time at which an auto snapshot is created.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
     */
    timePoints: pulumi.Input<pulumi.Input<string>[]>;
}