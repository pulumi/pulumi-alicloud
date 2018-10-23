import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM cloud account alias.
 *
 */
export declare class AccountAlias extends pulumi.CustomResource {
    /**
     * Get an existing AccountAlias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountAliasState): AccountAlias;
    /**
     * Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
     */
    readonly accountAlias: pulumi.Output<string>;
    /**
     * Create a AccountAlias resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountAliasArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering AccountAlias resources.
 */
export interface AccountAliasState {
    /**
     * Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
     */
    readonly accountAlias?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a AccountAlias resource.
 */
export interface AccountAliasArgs {
    /**
     * Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
     */
    readonly accountAlias: pulumi.Input<string>;
}
