import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a VPC router interface connection resource to connect two router interfaces which are in two different VPCs.
 * After that, all of the two router interfaces will be active.
 *
 * -> **NOTE:** At present, Router interface does not support changing opposite router interface, the connection delete action is only deactivating it to inactive, not modifying the connection to empty.
 *
 * -> **NOTE:** If you want to changing opposite router interface, you can delete router interface and re-build them.
 *
 * -> **NOTE:** A integrated router interface connection tunnel requires both InitiatingSide and AcceptingSide configuring opposite router interface.
 *
 * -> **NOTE:** Please remember to add a `depends_on` clause in the router interface connection from the InitiatingSide to the AcceptingSide, because the connection from the AcceptingSide to the InitiatingSide must be done first.
 */
export declare class RouterInterfaceConnection extends pulumi.CustomResource {
    /**
     * Get an existing RouterInterfaceConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouterInterfaceConnectionState): RouterInterfaceConnection;
    /**
     * One side router interface ID.
     */
    readonly interfaceId: pulumi.Output<string>;
    /**
     * Another side router interface ID. It must belong the specified "opposite_interface_owner_id" account.
     */
    readonly oppositeInterfaceId: pulumi.Output<string>;
    /**
     * Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to [Provider account_id](https://www.terraform.io/docs/providers/alicloud/index.html#account_id).
     */
    readonly oppositeInterfaceOwnerId: pulumi.Output<string>;
    /**
     * Another side router ID. It must belong the specified "opposite_interface_owner_id" account. It is valid when field "opposite_interface_owner_id" is specified.
     */
    readonly oppositeRouterId: pulumi.Output<string>;
    /**
     * Another side router Type. Optional value: VRouter, VBR. It is valid when field "opposite_interface_owner_id" is specified.
     */
    readonly oppositeRouterType: pulumi.Output<string | undefined>;
    /**
     * Create a RouterInterfaceConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouterInterfaceConnectionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RouterInterfaceConnection resources.
 */
export interface RouterInterfaceConnectionState {
    /**
     * One side router interface ID.
     */
    readonly interfaceId?: pulumi.Input<string>;
    /**
     * Another side router interface ID. It must belong the specified "opposite_interface_owner_id" account.
     */
    readonly oppositeInterfaceId?: pulumi.Input<string>;
    /**
     * Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to [Provider account_id](https://www.terraform.io/docs/providers/alicloud/index.html#account_id).
     */
    readonly oppositeInterfaceOwnerId?: pulumi.Input<string>;
    /**
     * Another side router ID. It must belong the specified "opposite_interface_owner_id" account. It is valid when field "opposite_interface_owner_id" is specified.
     */
    readonly oppositeRouterId?: pulumi.Input<string>;
    /**
     * Another side router Type. Optional value: VRouter, VBR. It is valid when field "opposite_interface_owner_id" is specified.
     */
    readonly oppositeRouterType?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RouterInterfaceConnection resource.
 */
export interface RouterInterfaceConnectionArgs {
    /**
     * One side router interface ID.
     */
    readonly interfaceId: pulumi.Input<string>;
    /**
     * Another side router interface ID. It must belong the specified "opposite_interface_owner_id" account.
     */
    readonly oppositeInterfaceId: pulumi.Input<string>;
    /**
     * Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to [Provider account_id](https://www.terraform.io/docs/providers/alicloud/index.html#account_id).
     */
    readonly oppositeInterfaceOwnerId?: pulumi.Input<string>;
    /**
     * Another side router ID. It must belong the specified "opposite_interface_owner_id" account. It is valid when field "opposite_interface_owner_id" is specified.
     */
    readonly oppositeRouterId?: pulumi.Input<string>;
    /**
     * Another side router Type. Optional value: VRouter, VBR. It is valid when field "opposite_interface_owner_id" is specified.
     */
    readonly oppositeRouterType?: pulumi.Input<string>;
}
