import * as pulumi from "@pulumi/pulumi";
/**
 * Attaches several ECS instances to a specified scaling group or remove them from it.
 *
 * ~> **NOTE:** ECS instances can be attached or remove only when the scaling group is active and it has no scaling activity in progress.
 *
 * ~> **NOTE:** There are two types ECS instances in a scaling group: "AutoCreated" and "Attached". The total number of them can not larger than the scaling group "MaxSize".
 */
export declare class Attachment extends pulumi.CustomResource {
    /**
     * Get an existing Attachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AttachmentState): Attachment;
    /**
     * Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
     */
    readonly force: pulumi.Output<boolean | undefined>;
    /**
     * ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
     */
    readonly instanceIds: pulumi.Output<string[]>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    readonly scalingGroupId: pulumi.Output<string>;
    /**
     * Create a Attachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Attachment resources.
 */
export interface AttachmentState {
    /**
     * Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
     */
    readonly instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    readonly scalingGroupId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Attachment resource.
 */
export interface AttachmentArgs {
    /**
     * Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
     */
    readonly instanceIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    readonly scalingGroupId: pulumi.Input<string>;
}
