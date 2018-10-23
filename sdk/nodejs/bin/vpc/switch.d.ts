import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a VPC switch resource.
 */
export declare class Switch extends pulumi.CustomResource {
    /**
     * Get an existing Switch resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwitchState): Switch;
    /**
     * The AZ for the switch.
     */
    readonly availabilityZone: pulumi.Output<string>;
    /**
     * The CIDR block for the switch.
     */
    readonly cidrBlock: pulumi.Output<string>;
    /**
     * The switch description. Defaults to null.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The name of the switch. Defaults to null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The VPC ID.
     */
    readonly vpcId: pulumi.Output<string>;
    /**
     * Create a Switch resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SwitchArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Switch resources.
 */
export interface SwitchState {
    /**
     * The AZ for the switch.
     */
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * The CIDR block for the switch.
     */
    readonly cidrBlock?: pulumi.Input<string>;
    /**
     * The switch description. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the switch. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The VPC ID.
     */
    readonly vpcId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Switch resource.
 */
export interface SwitchArgs {
    /**
     * The AZ for the switch.
     */
    readonly availabilityZone: pulumi.Input<string>;
    /**
     * The CIDR block for the switch.
     */
    readonly cidrBlock: pulumi.Input<string>;
    /**
     * The switch description. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the switch. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The VPC ID.
     */
    readonly vpcId: pulumi.Input<string>;
}
