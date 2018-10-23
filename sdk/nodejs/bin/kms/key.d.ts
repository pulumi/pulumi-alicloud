import * as pulumi from "@pulumi/pulumi";
/**
 * A kms key can help user to protect data security in the transmission process.
 */
export declare class Key extends pulumi.CustomResource {
    /**
     * Get an existing Key resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KeyState): Key;
    /**
     * The Alicloud Resource Name (ARN) of the key.
     */
    readonly arn: pulumi.Output<string>;
    /**
     * Duration in days after which the key is deleted
     * after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
     */
    readonly deletionWindowInDays: pulumi.Output<number | undefined>;
    /**
     * The description of the key as viewed in Alicloud console. Default to "From Terraform".
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Specifies whether the key is enabled. Defaults to true.
     */
    readonly isEnabled: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
     */
    readonly keyUsage: pulumi.Output<string | undefined>;
    /**
     * Create a Key resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: KeyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Key resources.
 */
export interface KeyState {
    /**
     * The Alicloud Resource Name (ARN) of the key.
     */
    readonly arn?: pulumi.Input<string>;
    /**
     * Duration in days after which the key is deleted
     * after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
     */
    readonly deletionWindowInDays?: pulumi.Input<number>;
    /**
     * The description of the key as viewed in Alicloud console. Default to "From Terraform".
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Specifies whether the key is enabled. Defaults to true.
     */
    readonly isEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
     */
    readonly keyUsage?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Key resource.
 */
export interface KeyArgs {
    /**
     * Duration in days after which the key is deleted
     * after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
     */
    readonly deletionWindowInDays?: pulumi.Input<number>;
    /**
     * The description of the key as viewed in Alicloud console. Default to "From Terraform".
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Specifies whether the key is enabled. Defaults to true.
     */
    readonly isEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
     */
    readonly keyUsage?: pulumi.Input<string>;
}
