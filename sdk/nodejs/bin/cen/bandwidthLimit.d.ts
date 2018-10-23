import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a CEN cross-regional interconnection bandwidth resource. To connect networks in different regions, you must set cross-region interconnection bandwidth after buying a bandwidth package. The total bandwidth set for all the interconnected regions of a bandwidth package cannot exceed the bandwidth of the bandwidth package. By default, 1 Kbps bandwidth is provided for connectivity test. To run normal business, you must buy a bandwidth package and set a proper interconnection bandwidth.
 *
 * For example, a CEN instance is bound to a bandwidth package of 20 Mbps and  the interconnection areas are Mainland China and North America. You can set the cross-region interconnection bandwidth between US West 1 and China East 1, China East 2, China South 1, and so on. However, the total bandwidth set for all the interconnected regions cannot exceed 20  Mbps.
 *
 * For information about CEN and how to use it, see [Cross-region interconnection bandwidth](https://www.alibabacloud.com/help/doc-detail/65983.htm)
 */
export declare class BandwidthLimit extends pulumi.CustomResource {
    /**
     * Get an existing BandwidthLimit resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BandwidthLimitState): BandwidthLimit;
    /**
     * The bandwidth configured for the interconnected regions communication.
     */
    readonly bandwidthLimit: pulumi.Output<number>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * List of the two regions to interconnect.
     */
    readonly regionIds: pulumi.Output<string[]>;
    /**
     * Create a BandwidthLimit resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BandwidthLimitArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering BandwidthLimit resources.
 */
export interface BandwidthLimitState {
    /**
     * The bandwidth configured for the interconnected regions communication.
     */
    readonly bandwidthLimit?: pulumi.Input<number>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * List of the two regions to interconnect.
     */
    readonly regionIds?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a BandwidthLimit resource.
 */
export interface BandwidthLimitArgs {
    /**
     * The bandwidth configured for the interconnected regions communication.
     */
    readonly bandwidthLimit: pulumi.Input<number>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * List of the two regions to interconnect.
     */
    readonly regionIds: pulumi.Input<pulumi.Input<string>[]>;
}
