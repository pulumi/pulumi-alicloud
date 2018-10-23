import * as pulumi from "@pulumi/pulumi";
export declare class SnatEntry extends pulumi.CustomResource {
    /**
     * Get an existing SnatEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnatEntryState): SnatEntry;
    readonly snatIp: pulumi.Output<string>;
    readonly snatTableId: pulumi.Output<string>;
    readonly sourceVswitchId: pulumi.Output<string>;
    /**
     * Create a SnatEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnatEntryArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SnatEntry resources.
 */
export interface SnatEntryState {
    readonly snatIp?: pulumi.Input<string>;
    readonly snatTableId?: pulumi.Input<string>;
    readonly sourceVswitchId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SnatEntry resource.
 */
export interface SnatEntryArgs {
    readonly snatIp: pulumi.Input<string>;
    readonly snatTableId: pulumi.Input<string>;
    readonly sourceVswitchId: pulumi.Input<string>;
}
