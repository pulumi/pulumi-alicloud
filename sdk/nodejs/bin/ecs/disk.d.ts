import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a ECS disk resource.
 *
 * ~> **NOTE:** One of `size` or `snapshot_id` is required when specifying an ECS disk. If all of them be specified, `size` must more than the size of snapshot which `snapshot_id` represents. Currently, `alicloud_disk` doesn't resize disk.
 */
export declare class Disk extends pulumi.CustomResource {
    /**
     * Get an existing Disk resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DiskState): Disk;
    /**
     * The Zone to create the disk in.
     */
    readonly availabilityZone: pulumi.Output<string>;
    /**
     * Category of the disk. Valid values are `cloud`, `cloud_efficiency` and `cloud_ssd`. Default is `cloud_efficiency`.
     */
    readonly category: pulumi.Output<string | undefined>;
    /**
     * Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * If true, the disk will be encrypted
     */
    readonly encrypted: pulumi.Output<boolean | undefined>;
    /**
     * Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The size of the disk in GiBs, and it value range: 20 ~ 32768.
     */
    readonly size: pulumi.Output<number | undefined>;
    /**
     * A snapshot to base the disk off of. If it is specified, `size` will be invalid and the disk size is equals to the snapshot size.
     */
    readonly snapshotId: pulumi.Output<string | undefined>;
    /**
     * The disk status.
     */
    readonly status: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags: pulumi.Output<{
        [key: string]: any;
    } | undefined>;
    /**
     * Create a Disk resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DiskArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Disk resources.
 */
export interface DiskState {
    /**
     * The Zone to create the disk in.
     */
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * Category of the disk. Valid values are `cloud`, `cloud_efficiency` and `cloud_ssd`. Default is `cloud_efficiency`.
     */
    readonly category?: pulumi.Input<string>;
    /**
     * Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * If true, the disk will be encrypted
     */
    readonly encrypted?: pulumi.Input<boolean>;
    /**
     * Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The size of the disk in GiBs, and it value range: 20 ~ 32768.
     */
    readonly size?: pulumi.Input<number>;
    /**
     * A snapshot to base the disk off of. If it is specified, `size` will be invalid and the disk size is equals to the snapshot size.
     */
    readonly snapshotId?: pulumi.Input<string>;
    /**
     * The disk status.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
}
/**
 * The set of arguments for constructing a Disk resource.
 */
export interface DiskArgs {
    /**
     * The Zone to create the disk in.
     */
    readonly availabilityZone: pulumi.Input<string>;
    /**
     * Category of the disk. Valid values are `cloud`, `cloud_efficiency` and `cloud_ssd`. Default is `cloud_efficiency`.
     */
    readonly category?: pulumi.Input<string>;
    /**
     * Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * If true, the disk will be encrypted
     */
    readonly encrypted?: pulumi.Input<boolean>;
    /**
     * Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The size of the disk in GiBs, and it value range: 20 ~ 32768.
     */
    readonly size?: pulumi.Input<number>;
    /**
     * A snapshot to base the disk off of. If it is specified, `size` will be invalid and the disk size is equals to the snapshot size.
     */
    readonly snapshotId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
}
