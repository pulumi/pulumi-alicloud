import * as pulumi from "@pulumi/pulumi";
export declare class Topic extends pulumi.CustomResource {
    /**
     * Get an existing Topic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TopicState): Topic;
    /**
     * Is logging enabled? true or false. Default value to false.
     */
    readonly loggingEnabled: pulumi.Output<boolean | undefined>;
    /**
     * This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
     */
    readonly maximumMessageSize: pulumi.Output<number | undefined>;
    /**
     * Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a Topic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TopicArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Topic resources.
 */
export interface TopicState {
    /**
     * Is logging enabled? true or false. Default value to false.
     */
    readonly loggingEnabled?: pulumi.Input<boolean>;
    /**
     * This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
     */
    readonly maximumMessageSize?: pulumi.Input<number>;
    /**
     * Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Topic resource.
 */
export interface TopicArgs {
    /**
     * Is logging enabled? true or false. Default value to false.
     */
    readonly loggingEnabled?: pulumi.Input<boolean>;
    /**
     * This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
     */
    readonly maximumMessageSize?: pulumi.Input<number>;
    /**
     * Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     */
    readonly name?: pulumi.Input<string>;
}
