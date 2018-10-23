import * as pulumi from "@pulumi/pulumi";
export declare class ForwardEntry extends pulumi.CustomResource {
    /**
     * Get an existing ForwardEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ForwardEntryState): ForwardEntry;
    readonly externalIp: pulumi.Output<string>;
    readonly externalPort: pulumi.Output<string>;
    readonly forwardTableId: pulumi.Output<string>;
    readonly internalIp: pulumi.Output<string>;
    readonly internalPort: pulumi.Output<string>;
    readonly ipProtocol: pulumi.Output<string>;
    /**
     * Create a ForwardEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ForwardEntryArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ForwardEntry resources.
 */
export interface ForwardEntryState {
    readonly externalIp?: pulumi.Input<string>;
    readonly externalPort?: pulumi.Input<string>;
    readonly forwardTableId?: pulumi.Input<string>;
    readonly internalIp?: pulumi.Input<string>;
    readonly internalPort?: pulumi.Input<string>;
    readonly ipProtocol?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ForwardEntry resource.
 */
export interface ForwardEntryArgs {
    readonly externalIp: pulumi.Input<string>;
    readonly externalPort: pulumi.Input<string>;
    readonly forwardTableId: pulumi.Input<string>;
    readonly internalIp: pulumi.Input<string>;
    readonly internalPort: pulumi.Input<string>;
    readonly ipProtocol: pulumi.Input<string>;
}
