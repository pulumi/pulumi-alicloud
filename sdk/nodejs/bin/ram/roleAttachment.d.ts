import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM role attachment resource to bind role for several ECS instances.
 */
export declare class RoleAttachment extends pulumi.CustomResource {
    /**
     * Get an existing RoleAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleAttachmentState): RoleAttachment;
    /**
     * The list of ECS instance's IDs.
     */
    readonly instanceIds: pulumi.Output<string[]>;
    /**
     * The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    readonly roleName: pulumi.Output<string>;
    /**
     * Create a RoleAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoleAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RoleAttachment resources.
 */
export interface RoleAttachmentState {
    /**
     * The list of ECS instance's IDs.
     */
    readonly instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    readonly roleName?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RoleAttachment resource.
 */
export interface RoleAttachmentArgs {
    /**
     * The list of ECS instance's IDs.
     */
    readonly instanceIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    readonly roleName: pulumi.Input<string>;
}
