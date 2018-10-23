import * as pulumi from "@pulumi/pulumi";
/**
 * A virtual server group contains several ECS instances. The virtual server group can help you to define multiple listening dimension,
 * and to meet the personalized requirements of domain name and URL forwarding.
 *
 * ~> **NOTE:** One ECS instance can be added into multiple virtual server groups.
 *
 * ~> **NOTE:** One virtual server group can be attached with multiple listeners in one load balancer.
 *
 * ~> **NOTE:** One Classic and Internet load balancer, its virtual server group can add Classic and VPC ECS instances.
 *
 * ~> **NOTE:** One Classic and Intranet load balancer, its virtual server group can only add Classic ECS instances.
 *
 * ~> **NOTE:** One VPC load balancer, its virtual server group can only add the same VPC ECS instances.
 */
export declare class ServerGroup extends pulumi.CustomResource {
    /**
     * Get an existing ServerGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerGroupState): ServerGroup;
    /**
     * The Load Balancer ID which is used to launch a new virtual server group.
     */
    readonly loadBalancerId: pulumi.Output<string>;
    /**
     * Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
     */
    readonly name: pulumi.Output<string>;
    /**
     * A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
     */
    readonly servers: pulumi.Output<{
        port: number;
        serverIds: string[];
        weight?: number;
    }[] | undefined>;
    /**
     * Create a ServerGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerGroupArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ServerGroup resources.
 */
export interface ServerGroupState {
    /**
     * The Load Balancer ID which is used to launch a new virtual server group.
     */
    readonly loadBalancerId?: pulumi.Input<string>;
    /**
     * Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
     */
    readonly servers?: pulumi.Input<pulumi.Input<{
        port: pulumi.Input<number>;
        serverIds: pulumi.Input<pulumi.Input<string>[]>;
        weight?: pulumi.Input<number>;
    }>[]>;
}
/**
 * The set of arguments for constructing a ServerGroup resource.
 */
export interface ServerGroupArgs {
    /**
     * The Load Balancer ID which is used to launch a new virtual server group.
     */
    readonly loadBalancerId: pulumi.Input<string>;
    /**
     * Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
     */
    readonly servers?: pulumi.Input<pulumi.Input<{
        port: pulumi.Input<number>;
        serverIds: pulumi.Input<pulumi.Input<string>[]>;
        weight?: pulumi.Input<number>;
    }>[]>;
}
