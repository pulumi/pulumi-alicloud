import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an RDS account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account.
 */
export declare class AccountPrivilege extends pulumi.CustomResource {
    /**
     * Get an existing AccountPrivilege resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountPrivilegeState): AccountPrivilege;
    /**
     * A specified account name.
     */
    readonly accountName: pulumi.Output<string>;
    /**
     * List of specified database name.
     */
    readonly dbNames: pulumi.Output<string[]>;
    /**
     * The Id of instance in which account belongs.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"]. Default to "ReadOnly".
     */
    readonly privilege: pulumi.Output<string | undefined>;
    /**
     * Create a AccountPrivilege resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountPrivilegeArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering AccountPrivilege resources.
 */
export interface AccountPrivilegeState {
    /**
     * A specified account name.
     */
    readonly accountName?: pulumi.Input<string>;
    /**
     * List of specified database name.
     */
    readonly dbNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Id of instance in which account belongs.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"]. Default to "ReadOnly".
     */
    readonly privilege?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a AccountPrivilege resource.
 */
export interface AccountPrivilegeArgs {
    /**
     * A specified account name.
     */
    readonly accountName: pulumi.Input<string>;
    /**
     * List of specified database name.
     */
    readonly dbNames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Id of instance in which account belongs.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"]. Default to "ReadOnly".
     */
    readonly privilege?: pulumi.Input<string>;
}
