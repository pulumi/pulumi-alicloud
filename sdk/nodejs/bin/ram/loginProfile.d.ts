import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM User Login Profile resource.
 *
 */
export declare class LoginProfile extends pulumi.CustomResource {
    /**
     * Get an existing LoginProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoginProfileState): LoginProfile;
    /**
     * This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
     */
    readonly mfaBindRequired: pulumi.Output<boolean | undefined>;
    /**
     * Password of the RAM user.
     */
    readonly password: pulumi.Output<string>;
    /**
     * This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
     */
    readonly passwordResetRequired: pulumi.Output<boolean | undefined>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userName: pulumi.Output<string>;
    /**
     * Create a LoginProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoginProfileArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering LoginProfile resources.
 */
export interface LoginProfileState {
    /**
     * This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
     */
    readonly mfaBindRequired?: pulumi.Input<boolean>;
    /**
     * Password of the RAM user.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
     */
    readonly passwordResetRequired?: pulumi.Input<boolean>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userName?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a LoginProfile resource.
 */
export interface LoginProfileArgs {
    /**
     * This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
     */
    readonly mfaBindRequired?: pulumi.Input<boolean>;
    /**
     * Password of the RAM user.
     */
    readonly password: pulumi.Input<string>;
    /**
     * This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
     */
    readonly passwordResetRequired?: pulumi.Input<boolean>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userName: pulumi.Input<string>;
}
