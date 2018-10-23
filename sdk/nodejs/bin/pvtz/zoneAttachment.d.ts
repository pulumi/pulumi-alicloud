import * as pulumi from "@pulumi/pulumi";
/**
 * Provides vpcs bound to Alicloud Private Zone resource.
 *
 * ~> **NOTE:** Terraform will auto bind vpc to a Private Zone while it uses `alicloud_pvtz_zone_attachment` to build a Private Zone and VPC binding resource.
 */
export declare class ZoneAttachment extends pulumi.CustomResource {
    /**
     * Get an existing ZoneAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneAttachmentState): ZoneAttachment;
    /**
     * The id List of the VPC, for example:["vpc-1","vpc-2"].
     */
    readonly vpcIds: pulumi.Output<string[] | undefined>;
    /**
     * The name of the Private Zone Record.
     */
    readonly zoneId: pulumi.Output<string>;
    /**
     * Create a ZoneAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZoneAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ZoneAttachment resources.
 */
export interface ZoneAttachmentState {
    /**
     * The id List of the VPC, for example:["vpc-1","vpc-2"].
     */
    readonly vpcIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the Private Zone Record.
     */
    readonly zoneId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ZoneAttachment resource.
 */
export interface ZoneAttachmentArgs {
    /**
     * The id List of the VPC, for example:["vpc-1","vpc-2"].
     */
    readonly vpcIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the Private Zone Record.
     */
    readonly zoneId: pulumi.Input<string>;
}
