import * as pulumi from "@pulumi/pulumi";
export declare class Subnet extends pulumi.CustomResource {
    /**
     * Get an existing Subnet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubnetState): Subnet;
    readonly availabilityZone: pulumi.Output<string>;
    readonly cidrBlock: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly vpcId: pulumi.Output<string>;
    /**
     * Create a Subnet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubnetArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Subnet resources.
 */
export interface SubnetState {
    readonly availabilityZone?: pulumi.Input<string>;
    readonly cidrBlock?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly vpcId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Subnet resource.
 */
export interface SubnetArgs {
    readonly availabilityZone: pulumi.Input<string>;
    readonly cidrBlock: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly vpcId: pulumi.Input<string>;
}
