import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a key pair resource.
 */
export declare class KeyPair extends pulumi.CustomResource {
    /**
     * Get an existing KeyPair resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KeyPairState): KeyPair;
    readonly fingerPrint: pulumi.Output<string>;
    /**
     * The name of file to save your new key pair's private key. Strongly suggest you to specified it when you creating key pair, otherwise, you wouldn't get its private key ever.
     */
    readonly keyFile: pulumi.Output<string | undefined>;
    /**
     * The key pair's name. It is the only in one Alicloud account.
     */
    readonly keyName: pulumi.Output<string>;
    /**
     * The key pair name's prefix. It is conflict with `key_name`. If it is specified, terraform will using it to build the only key name.
     */
    readonly keyNamePrefix: pulumi.Output<string | undefined>;
    /**
     * You can import an existing public key and using Alicloud key pair to manage it.
     */
    readonly publicKey: pulumi.Output<string | undefined>;
    /**
     * Create a KeyPair resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: KeyPairArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering KeyPair resources.
 */
export interface KeyPairState {
    readonly fingerPrint?: pulumi.Input<string>;
    /**
     * The name of file to save your new key pair's private key. Strongly suggest you to specified it when you creating key pair, otherwise, you wouldn't get its private key ever.
     */
    readonly keyFile?: pulumi.Input<string>;
    /**
     * The key pair's name. It is the only in one Alicloud account.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * The key pair name's prefix. It is conflict with `key_name`. If it is specified, terraform will using it to build the only key name.
     */
    readonly keyNamePrefix?: pulumi.Input<string>;
    /**
     * You can import an existing public key and using Alicloud key pair to manage it.
     */
    readonly publicKey?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a KeyPair resource.
 */
export interface KeyPairArgs {
    /**
     * The name of file to save your new key pair's private key. Strongly suggest you to specified it when you creating key pair, otherwise, you wouldn't get its private key ever.
     */
    readonly keyFile?: pulumi.Input<string>;
    /**
     * The key pair's name. It is the only in one Alicloud account.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * The key pair name's prefix. It is conflict with `key_name`. If it is specified, terraform will using it to build the only key name.
     */
    readonly keyNamePrefix?: pulumi.Input<string>;
    /**
     * You can import an existing public key and using Alicloud key pair to manage it.
     */
    readonly publicKey?: pulumi.Input<string>;
}
