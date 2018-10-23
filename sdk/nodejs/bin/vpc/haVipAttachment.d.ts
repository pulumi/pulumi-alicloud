import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an Alicloud HaVip Attachment resource for associating HaVip to ECS Instance.
 *
 * ~> **NOTE:** Terraform will auto build havip attachment while it uses `alicloud_havip_attachment` to build a havip attachment resource.
 */
export declare class HaVipAttachment extends pulumi.CustomResource {
    /**
     * Get an existing HaVipAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HaVipAttachmentState): HaVipAttachment;
    /**
     * The havip_id of the havip attachment, the field can't be changed.
     */
    readonly havipId: pulumi.Output<string>;
    /**
     * The instance_id of the havip attachment, the field can't be changed.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * Create a HaVipAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HaVipAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering HaVipAttachment resources.
 */
export interface HaVipAttachmentState {
    /**
     * The havip_id of the havip attachment, the field can't be changed.
     */
    readonly havipId?: pulumi.Input<string>;
    /**
     * The instance_id of the havip attachment, the field can't be changed.
     */
    readonly instanceId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a HaVipAttachment resource.
 */
export interface HaVipAttachmentArgs {
    /**
     * The havip_id of the havip attachment, the field can't be changed.
     */
    readonly havipId: pulumi.Input<string>;
    /**
     * The instance_id of the havip attachment, the field can't be changed.
     */
    readonly instanceId: pulumi.Input<string>;
}
