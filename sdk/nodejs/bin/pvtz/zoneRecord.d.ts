import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a Private Zone Record resource.
 *
 * ~> **NOTE:** Terraform will auto Create a Private Zone Record while it uses `alicloud_pvtz_zone_record` to build a Private Zone Record resource.
 */
export declare class ZoneRecord extends pulumi.CustomResource {
    /**
     * Get an existing ZoneRecord resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneRecordState): ZoneRecord;
    /**
     * The priority of the Private Zone Record.
     */
    readonly priority: pulumi.Output<number | undefined>;
    /**
     * The resource record of the Private Zone Record.
     */
    readonly resourceRecord: pulumi.Output<string>;
    /**
     * The ttl of the Private Zone Record.
     */
    readonly ttl: pulumi.Output<number | undefined>;
    /**
     * The type of the Private Zone Record.
     */
    readonly type: pulumi.Output<string>;
    /**
     * The value of the Private Zone Record.
     */
    readonly value: pulumi.Output<string>;
    /**
     * The name of the Private Zone Record.
     */
    readonly zoneId: pulumi.Output<string>;
    /**
     * Create a ZoneRecord resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZoneRecordArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ZoneRecord resources.
 */
export interface ZoneRecordState {
    /**
     * The priority of the Private Zone Record.
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * The resource record of the Private Zone Record.
     */
    readonly resourceRecord?: pulumi.Input<string>;
    /**
     * The ttl of the Private Zone Record.
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The type of the Private Zone Record.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The value of the Private Zone Record.
     */
    readonly value?: pulumi.Input<string>;
    /**
     * The name of the Private Zone Record.
     */
    readonly zoneId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ZoneRecord resource.
 */
export interface ZoneRecordArgs {
    /**
     * The priority of the Private Zone Record.
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * The resource record of the Private Zone Record.
     */
    readonly resourceRecord: pulumi.Input<string>;
    /**
     * The ttl of the Private Zone Record.
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The type of the Private Zone Record.
     */
    readonly type: pulumi.Input<string>;
    /**
     * The value of the Private Zone Record.
     */
    readonly value: pulumi.Input<string>;
    /**
     * The name of the Private Zone Record.
     */
    readonly zoneId: pulumi.Input<string>;
}
