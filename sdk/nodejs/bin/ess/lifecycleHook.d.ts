import * as pulumi from "@pulumi/pulumi";
export declare class LifecycleHook extends pulumi.CustomResource {
    /**
     * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LifecycleHookState): LifecycleHook;
    readonly defaultResult: pulumi.Output<string | undefined>;
    readonly heartbeatTimeout: pulumi.Output<number | undefined>;
    readonly lifecycleTransition: pulumi.Output<string>;
    readonly name: pulumi.Output<string>;
    readonly notificationArn: pulumi.Output<string>;
    readonly notificationMetadata: pulumi.Output<string>;
    readonly scalingGroupId: pulumi.Output<string>;
    /**
     * Create a LifecycleHook resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LifecycleHookArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering LifecycleHook resources.
 */
export interface LifecycleHookState {
    readonly defaultResult?: pulumi.Input<string>;
    readonly heartbeatTimeout?: pulumi.Input<number>;
    readonly lifecycleTransition?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly notificationArn?: pulumi.Input<string>;
    readonly notificationMetadata?: pulumi.Input<string>;
    readonly scalingGroupId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a LifecycleHook resource.
 */
export interface LifecycleHookArgs {
    readonly defaultResult?: pulumi.Input<string>;
    readonly heartbeatTimeout?: pulumi.Input<number>;
    readonly lifecycleTransition: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly notificationArn?: pulumi.Input<string>;
    readonly notificationMetadata?: pulumi.Input<string>;
    readonly scalingGroupId: pulumi.Input<string>;
}
