import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an Alicloud ECS Disk Attachment as a resource, to attach and detach disks from ECS Instances.
 */
export declare class DiskAttachment extends pulumi.CustomResource {
    /**
     * Get an existing DiskAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DiskAttachmentState): DiskAttachment;
    /**
     * The device name has been deprecated, and when attaching disk, it will be allocated automatically by system according to default order from /dev/xvdb to /dev/xvdz.
     */
    readonly deviceName: pulumi.Output<string>;
    /**
     * ID of the Disk to be attached.
     */
    readonly diskId: pulumi.Output<string | undefined>;
    /**
     * ID of the Instance to attach to.
     */
    readonly instanceId: pulumi.Output<string | undefined>;
    /**
     * Create a DiskAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DiskAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering DiskAttachment resources.
 */
export interface DiskAttachmentState {
    /**
     * The device name has been deprecated, and when attaching disk, it will be allocated automatically by system according to default order from /dev/xvdb to /dev/xvdz.
     */
    readonly deviceName?: pulumi.Input<string>;
    /**
     * ID of the Disk to be attached.
     */
    readonly diskId?: pulumi.Input<string>;
    /**
     * ID of the Instance to attach to.
     */
    readonly instanceId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a DiskAttachment resource.
 */
export interface DiskAttachmentArgs {
    /**
     * The device name has been deprecated, and when attaching disk, it will be allocated automatically by system according to default order from /dev/xvdb to /dev/xvdz.
     */
    readonly deviceName?: pulumi.Input<string>;
    /**
     * ID of the Disk to be attached.
     */
    readonly diskId?: pulumi.Input<string>;
    /**
     * ID of the Instance to attach to.
     */
    readonly instanceId?: pulumi.Input<string>;
}
