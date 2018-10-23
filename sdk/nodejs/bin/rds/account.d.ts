import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an RDS account resource and used to manage databases. A RDS instance supports multiple database account.
 */
export declare class Account extends pulumi.CustomResource {
    /**
     * Get an existing Account resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountState): Account;
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The Id of instance in which account belongs.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
     */
    readonly password: pulumi.Output<string>;
    /**
     * Privilege type of account.
     * - Normal: Common privilege.
     * - Super: High privilege.
     */
    readonly type: pulumi.Output<string | undefined>;
    /**
     * Create a Account resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Account resources.
 */
export interface AccountState {
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The Id of instance in which account belongs.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * Privilege type of account.
     * - Normal: Common privilege.
     * - Super: High privilege.
     */
    readonly type?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Account resource.
 */
export interface AccountArgs {
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The Id of instance in which account belongs.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
     */
    readonly password: pulumi.Input<string>;
    /**
     * Privilege type of account.
     * - Normal: Common privilege.
     * - Super: High privilege.
     */
    readonly type?: pulumi.Input<string>;
}
