import * as pulumi from "@pulumi/pulumi";
/**
 * This resource will help you to manager a [Table Store](https://www.alibabacloud.com/help/doc-detail/27280.htm) Instance.
 * It is foundation of creating data table.
 */
export declare class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState): Instance;
    /**
     * The network limitation of accessing instance. Valid values:
     */
    readonly accessedBy: pulumi.Output<string | undefined>;
    /**
     * The description of the instance.
     */
    readonly description: pulumi.Output<string>;
    /**
     * The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
     */
    readonly instanceType: pulumi.Output<string | undefined>;
    /**
     * The name of the instance.
     */
    readonly name: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the instance.
     */
    readonly tags: pulumi.Output<{
        [key: string]: any;
    } | undefined>;
    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * The network limitation of accessing instance. Valid values:
     */
    readonly accessedBy?: pulumi.Input<string>;
    /**
     * The description of the instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * The name of the instance.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the instance.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
}
/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * The network limitation of accessing instance. Valid values:
     */
    readonly accessedBy?: pulumi.Input<string>;
    /**
     * The description of the instance.
     */
    readonly description: pulumi.Input<string>;
    /**
     * The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * The name of the instance.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the instance.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
}
