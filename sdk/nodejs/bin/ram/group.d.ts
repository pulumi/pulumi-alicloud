import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM Group resource.
 *
 * ~> **NOTE:** When you want to destroy this resource forcefully(means remove all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `terraform plan`, then you can delete resource forcefully.
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
     * Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
     */
    readonly comments: pulumi.Output<string | undefined>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force: pulumi.Output<boolean | undefined>;
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
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
     * Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
     */
    readonly comments?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    /**
     * Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
     */
    readonly comments?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
}
