import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a CEN bandwidth package attachment resource. The resource can be used to bind a bandwidth package to a specified CEN instance.
 */
export declare class BandwidthPackageAttachment extends pulumi.CustomResource {
    /**
     * Get an existing BandwidthPackageAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BandwidthPackageAttachmentState): BandwidthPackageAttachment;
    /**
     * The ID of the bandwidth package.
     */
    readonly bandwidthPackageId: pulumi.Output<string>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * Create a BandwidthPackageAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BandwidthPackageAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering BandwidthPackageAttachment resources.
 */
export interface BandwidthPackageAttachmentState {
    /**
     * The ID of the bandwidth package.
     */
    readonly bandwidthPackageId?: pulumi.Input<string>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a BandwidthPackageAttachment resource.
 */
export interface BandwidthPackageAttachmentArgs {
    /**
     * The ID of the bandwidth package.
     */
    readonly bandwidthPackageId: pulumi.Input<string>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId: pulumi.Input<string>;
}
