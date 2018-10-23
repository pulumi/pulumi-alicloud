import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM Group membership resource.
 */
export declare class GroupMembership extends pulumi.CustomResource {
    /**
     * Get an existing GroupMembership resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupMembershipState): GroupMembership;
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly groupName: pulumi.Output<string>;
    /**
     * Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userNames: pulumi.Output<string[]>;
    /**
     * Create a GroupMembership resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupMembershipArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering GroupMembership resources.
 */
export interface GroupMembershipState {
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly groupName?: pulumi.Input<string>;
    /**
     * Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userNames?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a GroupMembership resource.
 */
export interface GroupMembershipArgs {
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly groupName: pulumi.Input<string>;
    /**
     * Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userNames: pulumi.Input<pulumi.Input<string>[]>;
}
