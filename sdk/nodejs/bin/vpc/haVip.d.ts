import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a HaVip resource.
 *
 * ~> **NOTE:** Terraform will auto build havip instance  while it uses `alicloud_havip` to build a havip resource.
 */
export declare class HaVip extends pulumi.CustomResource {
    /**
     * Get an existing HaVip resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HaVipState): HaVip;
    /**
     * The description of the HaVip instance.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     */
    readonly ipAddress: pulumi.Output<string>;
    /**
     * The vswitch_id of the HaVip, the field can't be changed.
     */
    readonly vswitchId: pulumi.Output<string>;
    /**
     * Create a HaVip resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HaVipArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering HaVip resources.
 */
export interface HaVipState {
    /**
     * The description of the HaVip instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     */
    readonly ipAddress?: pulumi.Input<string>;
    /**
     * The vswitch_id of the HaVip, the field can't be changed.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a HaVip resource.
 */
export interface HaVipArgs {
    /**
     * The description of the HaVip instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     */
    readonly ipAddress?: pulumi.Input<string>;
    /**
     * The vswitch_id of the HaVip, the field can't be changed.
     */
    readonly vswitchId: pulumi.Input<string>;
}
