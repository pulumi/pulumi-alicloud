import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a DNS Group resource.
 */
export declare class Group extends pulumi.CustomResource {
    /**
     * Get an existing Group resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupState): Group;
    /**
     * Name of the domain group.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a Group resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: GroupArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Group resources.
 */
export interface GroupState {
    /**
     * Name of the domain group.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    /**
     * Name of the domain group.
     */
    readonly name?: pulumi.Input<string>;
}
