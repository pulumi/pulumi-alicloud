import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM User resource.
 *
 * ~> **NOTE:** When you want to destroy this resource forcefully(means release all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `terraform plan`, then you can delete resource forcefully.
 */
export declare class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState): User;
    /**
     * Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
     */
    readonly comments: pulumi.Output<string | undefined>;
    /**
     * Name of the RAM user which for display. This name can have a string of 1 to 12 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as "-",".", and must not end with a hyphen.
     */
    readonly displayName: pulumi.Output<string | undefined>;
    /**
     * Email of the RAM user.
     */
    readonly email: pulumi.Output<string | undefined>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force: pulumi.Output<boolean | undefined>;
    /**
     * Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
     */
    readonly mobile: pulumi.Output<string | undefined>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: UserArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
     */
    readonly comments?: pulumi.Input<string>;
    /**
     * Name of the RAM user which for display. This name can have a string of 1 to 12 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as "-",".", and must not end with a hyphen.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * Email of the RAM user.
     */
    readonly email?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
     */
    readonly mobile?: pulumi.Input<string>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
     */
    readonly comments?: pulumi.Input<string>;
    /**
     * Name of the RAM user which for display. This name can have a string of 1 to 12 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as "-",".", and must not end with a hyphen.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * Email of the RAM user.
     */
    readonly email?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
     */
    readonly mobile?: pulumi.Input<string>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
}
