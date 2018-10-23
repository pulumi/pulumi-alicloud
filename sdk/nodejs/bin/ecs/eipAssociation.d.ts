import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an Alicloud EIP Association resource for associating Elastic IP to ECS Instance, SLB Instance or Nat Gateway.
 *
 * ~> **NOTE:** `alicloud_eip_association` is useful in scenarios where EIPs are either
 *  pre-existing or distributed to customers or users and therefore cannot be changed.
 *
 * ~> **NOTE:** From version 1.7.1, the resource support to associate EIP to SLB Instance or Nat Gateway.
 *
 * ~> **NOTE:** One EIP can only be associated with ECS or SLB instance which in the VPC.
 */
export declare class EipAssociation extends pulumi.CustomResource {
    /**
     * Get an existing EipAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EipAssociationState): EipAssociation;
    /**
     * The allocation EIP ID.
     */
    readonly allocationId: pulumi.Output<string>;
    /**
     * The ID of the ECS or SLB instance or Nat Gateway.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * Create a EipAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EipAssociationArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering EipAssociation resources.
 */
export interface EipAssociationState {
    /**
     * The allocation EIP ID.
     */
    readonly allocationId?: pulumi.Input<string>;
    /**
     * The ID of the ECS or SLB instance or Nat Gateway.
     */
    readonly instanceId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a EipAssociation resource.
 */
export interface EipAssociationArgs {
    /**
     * The allocation EIP ID.
     */
    readonly allocationId?: pulumi.Input<string>;
    /**
     * The ID of the ECS or SLB instance or Nat Gateway.
     */
    readonly instanceId?: pulumi.Input<string>;
}
