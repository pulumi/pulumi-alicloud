import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a CEN bandwidth package resource. The CEN bandwidth package is an abstracted object that includes an interconnection bandwidth and interconnection areas. To buy a bandwidth package, you must specify the areas to connect. An area consists of one or more Alibaba Cloud regions. The areas in CEN include Mainland China, Asia Pacific, North America, and Europe.
 *
 * For information about CEN and how to use it, see [Manage bandwidth packages](https://www.alibabacloud.com/help/doc-detail/65982.htm).
 */
export declare class BandwidthPackage extends pulumi.CustomResource {
    /**
     * Get an existing BandwidthPackage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BandwidthPackageState): BandwidthPackage;
    /**
     * The bandwidth in Mbps of the bandwidth package. Cannot be less than 1Mbps.
     */
    readonly bandwidth: pulumi.Output<number>;
    /**
     * The billing method. Valid value: PostPaid | PrePaid. Default to PostPaid. If set to PrePaid, the bandwidth package can't be deleted before expired time.
     */
    readonly chargeType: pulumi.Output<string | undefined>;
    /**
     * The description of the bandwidth package. Default to null.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The time of the bandwidth package to expire.
     */
    readonly expiredTime: pulumi.Output<string>;
    /**
     * List of the two areas to connect. Valid value: China | North-America | Asia-Pacific | Europe | Middle-East.
     */
    readonly geographicRegionIds: pulumi.Output<string[]>;
    /**
     * The name of the bandwidth package. Defaults to null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The purchase period in month. Valid value: 1, 2, 3, 6, 12. Default to 1.
     */
    readonly period: pulumi.Output<number | undefined>;
    /**
     * The status of the bandwidth, including "InUse" and "Idle".
     */
    readonly status: pulumi.Output<string>;
    /**
     * Create a BandwidthPackage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BandwidthPackageArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering BandwidthPackage resources.
 */
export interface BandwidthPackageState {
    /**
     * The bandwidth in Mbps of the bandwidth package. Cannot be less than 1Mbps.
     */
    readonly bandwidth?: pulumi.Input<number>;
    /**
     * The billing method. Valid value: PostPaid | PrePaid. Default to PostPaid. If set to PrePaid, the bandwidth package can't be deleted before expired time.
     */
    readonly chargeType?: pulumi.Input<string>;
    /**
     * The description of the bandwidth package. Default to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The time of the bandwidth package to expire.
     */
    readonly expiredTime?: pulumi.Input<string>;
    /**
     * List of the two areas to connect. Valid value: China | North-America | Asia-Pacific | Europe | Middle-East.
     */
    readonly geographicRegionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the bandwidth package. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The purchase period in month. Valid value: 1, 2, 3, 6, 12. Default to 1.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The status of the bandwidth, including "InUse" and "Idle".
     */
    readonly status?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a BandwidthPackage resource.
 */
export interface BandwidthPackageArgs {
    /**
     * The bandwidth in Mbps of the bandwidth package. Cannot be less than 1Mbps.
     */
    readonly bandwidth: pulumi.Input<number>;
    /**
     * The billing method. Valid value: PostPaid | PrePaid. Default to PostPaid. If set to PrePaid, the bandwidth package can't be deleted before expired time.
     */
    readonly chargeType?: pulumi.Input<string>;
    /**
     * The description of the bandwidth package. Default to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * List of the two areas to connect. Valid value: China | North-America | Asia-Pacific | Europe | Middle-East.
     */
    readonly geographicRegionIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the bandwidth package. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The purchase period in month. Valid value: 1, 2, 3, 6, 12. Default to 1.
     */
    readonly period?: pulumi.Input<number>;
}
