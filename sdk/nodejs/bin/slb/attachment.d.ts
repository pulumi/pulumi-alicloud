import * as pulumi from "@pulumi/pulumi";
/**
 * Add a group of backend servers (ECS instance) to the Server Load Balancer or remove them from it.
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
     * The backend servers of the load balancer.
     */
    readonly backendServers: pulumi.Output<string>;
    /**
     * A list of instance ids to added backend server in the SLB.
     */
    readonly instanceIds: pulumi.Output<string[]>;
    /**
     * It has been deprecated from provider version 1.6.0. New field 'instance_ids' replaces it.
     */
    readonly instances: pulumi.Output<string[] | undefined>;
    /**
     * ID of the load balancer.
     */
    readonly loadBalancerId: pulumi.Output<string>;
    /**
     * It has been deprecated from provider version 1.6.0. New field 'load_balancer_id' replaces it.
     */
    readonly slbId: pulumi.Output<string | undefined>;
    /**
     * Weight of the instances. Valid value range: [0-100]. Default to 100.
     */
    readonly weight: pulumi.Output<number | undefined>;
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
     * The backend servers of the load balancer.
     */
    readonly backendServers?: pulumi.Input<string>;
    /**
     * A list of instance ids to added backend server in the SLB.
     */
    readonly instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * It has been deprecated from provider version 1.6.0. New field 'instance_ids' replaces it.
     */
    readonly instances?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the load balancer.
     */
    readonly loadBalancerId?: pulumi.Input<string>;
    /**
     * It has been deprecated from provider version 1.6.0. New field 'load_balancer_id' replaces it.
     */
    readonly slbId?: pulumi.Input<string>;
    /**
     * Weight of the instances. Valid value range: [0-100]. Default to 100.
     */
    readonly weight?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a Attachment resource.
 */
export interface AttachmentArgs {
    /**
     * The backend servers of the load balancer.
     */
    readonly backendServers?: pulumi.Input<string>;
    /**
     * A list of instance ids to added backend server in the SLB.
     */
    readonly instanceIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * It has been deprecated from provider version 1.6.0. New field 'instance_ids' replaces it.
     */
    readonly instances?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the load balancer.
     */
    readonly loadBalancerId: pulumi.Input<string>;
    /**
     * It has been deprecated from provider version 1.6.0. New field 'load_balancer_id' replaces it.
     */
    readonly slbId?: pulumi.Input<string>;
    /**
     * Weight of the instances. Valid value range: [0-100]. Default to 100.
     */
    readonly weight?: pulumi.Input<number>;
}
