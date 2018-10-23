import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM User Policy attachment resource.
 */
export declare class UserPolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing UserPolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserPolicyAttachmentState): UserPolicyAttachment;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly policyName: pulumi.Output<string>;
    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     */
    readonly policyType: pulumi.Output<string>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userName: pulumi.Output<string>;
    /**
     * Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserPolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering UserPolicyAttachment resources.
 */
export interface UserPolicyAttachmentState {
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly policyName?: pulumi.Input<string>;
    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     */
    readonly policyType?: pulumi.Input<string>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userName?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a UserPolicyAttachment resource.
 */
export interface UserPolicyAttachmentArgs {
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly policyName: pulumi.Input<string>;
    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     */
    readonly policyType: pulumi.Input<string>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userName: pulumi.Input<string>;
}
