import * as pulumi from "@pulumi/pulumi";
export declare class RouteEntry extends pulumi.CustomResource {
    /**
     * Get an existing RouteEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteEntryState): RouteEntry;
    readonly destinationCidrblock: pulumi.Output<string | undefined>;
    readonly nexthopId: pulumi.Output<string | undefined>;
    readonly nexthopType: pulumi.Output<string | undefined>;
    readonly routeTableId: pulumi.Output<string>;
    readonly routerId: pulumi.Output<string>;
    /**
     * Create a RouteEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteEntryArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RouteEntry resources.
 */
export interface RouteEntryState {
    readonly destinationCidrblock?: pulumi.Input<string>;
    readonly nexthopId?: pulumi.Input<string>;
    readonly nexthopType?: pulumi.Input<string>;
    readonly routeTableId?: pulumi.Input<string>;
    readonly routerId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RouteEntry resource.
 */
export interface RouteEntryArgs {
    readonly destinationCidrblock?: pulumi.Input<string>;
    readonly nexthopId?: pulumi.Input<string>;
    readonly nexthopType?: pulumi.Input<string>;
    readonly routeTableId: pulumi.Input<string>;
    readonly routerId?: pulumi.Input<string>;
}
