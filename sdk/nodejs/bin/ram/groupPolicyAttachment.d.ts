import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM Group Policy attachment resource.
 */
export declare class GroupPolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing GroupPolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupPolicyAttachmentState): GroupPolicyAttachment;
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly groupName: pulumi.Output<string>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly policyName: pulumi.Output<string>;
    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     */
    readonly policyType: pulumi.Output<string>;
    /**
     * Create a GroupPolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupPolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering GroupPolicyAttachment resources.
 */
export interface GroupPolicyAttachmentState {
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly groupName?: pulumi.Input<string>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly policyName?: pulumi.Input<string>;
    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     */
    readonly policyType?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a GroupPolicyAttachment resource.
 */
export interface GroupPolicyAttachmentArgs {
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly groupName: pulumi.Input<string>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly policyName: pulumi.Input<string>;
    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     */
    readonly policyType: pulumi.Input<string>;
}
