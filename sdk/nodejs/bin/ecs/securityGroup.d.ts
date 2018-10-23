import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a security group resource.
 *
 * ~> **NOTE:** `alicloud_security_group` is used to build and manage a security group, and `alicloud_security_group_rule` can define ingress or egress rules for it.
 *
 * ~> **NOTE:** From version 1.7.2, `alicloud_security_group` has supported to segregate different ECS instance in which the same security group.
 */
export declare class SecurityGroup extends pulumi.CustomResource {
    /**
     * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityGroupState): SecurityGroup;
    /**
     * The security group description. Defaults to null.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Whether to allow both machines to access each other on all ports in the same security group.
     */
    readonly innerAccess: pulumi.Output<boolean | undefined>;
    /**
     * The name of the security group. Defaults to null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags: pulumi.Output<{
        [key: string]: any;
    } | undefined>;
    /**
     * The VPC ID.
     */
    readonly vpcId: pulumi.Output<string | undefined>;
    /**
     * Create a SecurityGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SecurityGroupArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SecurityGroup resources.
 */
export interface SecurityGroupState {
    /**
     * The security group description. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to allow both machines to access each other on all ports in the same security group.
     */
    readonly innerAccess?: pulumi.Input<boolean>;
    /**
     * The name of the security group. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * The VPC ID.
     */
    readonly vpcId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SecurityGroup resource.
 */
export interface SecurityGroupArgs {
    /**
     * The security group description. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to allow both machines to access each other on all ports in the same security group.
     */
    readonly innerAccess?: pulumi.Input<boolean>;
    /**
     * The name of the security group. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * The VPC ID.
     */
    readonly vpcId?: pulumi.Input<string>;
}
