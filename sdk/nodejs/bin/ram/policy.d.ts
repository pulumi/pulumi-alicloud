import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a RAM Policy resource.
 *
 * ~> **NOTE:** When you want to destroy this resource forcefully(means remove all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `terraform plan`, then you can delete resource forcefully.
 */
export declare class Policy extends pulumi.CustomResource {
    /**
     * Get an existing Policy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyState): Policy;
    /**
     * The policy attachment count.
     */
    readonly attachmentCount: pulumi.Output<number>;
    /**
     * Description of the RAM policy. This name can have a string of 1 to 1024 characters.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Document of the RAM policy. It is required when the `statement` is not specified.
     */
    readonly document: pulumi.Output<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force: pulumi.Output<boolean | undefined>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Statements of the RAM policy document. It is required when the `document` is not specified.
     */
    readonly statements: pulumi.Output<{
        actions: string[];
        effect: string;
        resources: string[];
    }[]>;
    /**
     * The policy type.
     */
    readonly type: pulumi.Output<string>;
    /**
     * Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     */
    readonly version: pulumi.Output<string | undefined>;
    /**
     * Create a Policy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PolicyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Policy resources.
 */
export interface PolicyState {
    /**
     * The policy attachment count.
     */
    readonly attachmentCount?: pulumi.Input<number>;
    /**
     * Description of the RAM policy. This name can have a string of 1 to 1024 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Document of the RAM policy. It is required when the `statement` is not specified.
     */
    readonly document?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Statements of the RAM policy document. It is required when the `document` is not specified.
     */
    readonly statements?: pulumi.Input<pulumi.Input<{
        actions: pulumi.Input<pulumi.Input<string>[]>;
        effect: pulumi.Input<string>;
        resources: pulumi.Input<pulumi.Input<string>[]>;
    }>[]>;
    /**
     * The policy type.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     */
    readonly version?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Policy resource.
 */
export interface PolicyArgs {
    /**
     * Description of the RAM policy. This name can have a string of 1 to 1024 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Document of the RAM policy. It is required when the `statement` is not specified.
     */
    readonly document?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Statements of the RAM policy document. It is required when the `document` is not specified.
     */
    readonly statements?: pulumi.Input<pulumi.Input<{
        actions: pulumi.Input<pulumi.Input<string>[]>;
        effect: pulumi.Input<string>;
        resources: pulumi.Input<pulumi.Input<string>[]>;
    }>[]>;
    /**
     * Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     */
    readonly version?: pulumi.Input<string>;
}
