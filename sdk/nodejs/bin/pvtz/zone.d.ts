import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a Private Zone resource.
 *
 * ~> **NOTE:** Terraform will auto Create a Private Zone while it uses `alicloud_pvtz_zone` to build a Private Zone resource.
 */
export declare class Zone extends pulumi.CustomResource {
    /**
     * Get an existing Zone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneState): Zone;
    readonly creationTime: pulumi.Output<string>;
    readonly isPtr: pulumi.Output<boolean>;
    /**
     * The name of the Private Zone.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The count of the Private Zone Record.
     */
    readonly recordCount: pulumi.Output<number>;
    /**
     * The remark of the Private Zone.
     */
    readonly remark: pulumi.Output<string | undefined>;
    readonly updateTime: pulumi.Output<string>;
    /**
     * Create a Zone resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ZoneArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Zone resources.
 */
export interface ZoneState {
    readonly creationTime?: pulumi.Input<string>;
    readonly isPtr?: pulumi.Input<boolean>;
    /**
     * The name of the Private Zone.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The count of the Private Zone Record.
     */
    readonly recordCount?: pulumi.Input<number>;
    /**
     * The remark of the Private Zone.
     */
    readonly remark?: pulumi.Input<string>;
    readonly updateTime?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Zone resource.
 */
export interface ZoneArgs {
    /**
     * The name of the Private Zone.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The remark of the Private Zone.
     */
    readonly remark?: pulumi.Input<string>;
}
