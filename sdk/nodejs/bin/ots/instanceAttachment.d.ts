import * as pulumi from "@pulumi/pulumi";
/**
 * This resource will help you to bind a VPC to an OTS instance.
 */
export declare class InstanceAttachment extends pulumi.CustomResource {
    /**
     * Get an existing InstanceAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceAttachmentState): InstanceAttachment;
    /**
     * The name of the OTS instance.
     */
    readonly instanceName: pulumi.Output<string>;
    /**
     * The ID of attaching VPC to instance.
     */
    readonly vpcId: pulumi.Output<string>;
    /**
     * The name of attaching VPC to instance.
     */
    readonly vpcName: pulumi.Output<string>;
    /**
     * The ID of attaching VSwitch to instance.
     */
    readonly vswitchId: pulumi.Output<string>;
    /**
     * Create a InstanceAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering InstanceAttachment resources.
 */
export interface InstanceAttachmentState {
    /**
     * The name of the OTS instance.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * The ID of attaching VPC to instance.
     */
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The name of attaching VPC to instance.
     */
    readonly vpcName?: pulumi.Input<string>;
    /**
     * The ID of attaching VSwitch to instance.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a InstanceAttachment resource.
 */
export interface InstanceAttachmentArgs {
    /**
     * The name of the OTS instance.
     */
    readonly instanceName: pulumi.Input<string>;
    /**
     * The name of attaching VPC to instance.
     */
    readonly vpcName: pulumi.Input<string>;
    /**
     * The ID of attaching VSwitch to instance.
     */
    readonly vswitchId: pulumi.Input<string>;
}
