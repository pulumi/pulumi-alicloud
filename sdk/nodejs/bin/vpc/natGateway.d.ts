import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a resource to create a VPC NAT Gateway.
 *
 *
 * ~> **NOTE:** Resource bandwidth packages will not be supported since 00:00 on November 4, 2017, and public IP can be replaced be elastic IPs.
 * If a Nat Gateway has already bought some bandwidth packages, it can not bind elastic IP and you have to submit the [work order](https://selfservice.console.aliyun.com/ticket/createIndex) to solve.
 * If you want to add public IP, you can use resource 'alicloud_eip_association' to bind several elastic IPs for one Nat Gateway.
 *
 * ~> **NOTE:** From version 1.7.1, this resource has deprecated bandwidth packages.
 * But, in order to manage stock bandwidth packages, version 1.13.0 re-support configuring 'bandwidth_packages'.
 *
 */
export declare class NatGateway extends pulumi.CustomResource {
    /**
     * Get an existing NatGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NatGatewayState): NatGateway;
    /**
     * A list ID of the bandwidth packages, and split them with commas
     */
    readonly bandwidthPackageIds: pulumi.Output<string>;
    /**
     * A list of bandwidth packages for the nat gatway. Only support nat gateway created before 00:00 on November 4, 2017. Available in v1.13.0+ and v1.7.1-.
     */
    readonly bandwidthPackages: pulumi.Output<{
        bandwidth: number;
        ipCount: number;
        publicIpAddresses: string;
        zone: string;
    }[] | undefined>;
    /**
     * Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The nat gateway will auto create a snap and forward item, the `forward_table_ids` is the created one.
     */
    readonly forwardTableIds: pulumi.Output<string>;
    /**
     * Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The nat gateway will auto create a snap and forward item, the `snat_table_ids` is the created one.
     */
    readonly snatTableIds: pulumi.Output<string>;
    /**
     * It has been deprecated from provider version 1.7.1, and new field 'specification' can replace it.
     */
    readonly spec: pulumi.Output<string | undefined>;
    /**
     * The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Default to `Small`. Details refer to [Nat Gateway Specification](https://www.alibabacloud.com/help/doc-detail/42757.htm).
     */
    readonly specification: pulumi.Output<string | undefined>;
    /**
     * The VPC ID.
     */
    readonly vpcId: pulumi.Output<string>;
    /**
     * Create a NatGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NatGatewayArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering NatGateway resources.
 */
export interface NatGatewayState {
    /**
     * A list ID of the bandwidth packages, and split them with commas
     */
    readonly bandwidthPackageIds?: pulumi.Input<string>;
    /**
     * A list of bandwidth packages for the nat gatway. Only support nat gateway created before 00:00 on November 4, 2017. Available in v1.13.0+ and v1.7.1-.
     */
    readonly bandwidthPackages?: pulumi.Input<pulumi.Input<{
        bandwidth: pulumi.Input<number>;
        ipCount: pulumi.Input<number>;
        publicIpAddresses?: pulumi.Input<string>;
        zone?: pulumi.Input<string>;
    }>[]>;
    /**
     * Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The nat gateway will auto create a snap and forward item, the `forward_table_ids` is the created one.
     */
    readonly forwardTableIds?: pulumi.Input<string>;
    /**
     * Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The nat gateway will auto create a snap and forward item, the `snat_table_ids` is the created one.
     */
    readonly snatTableIds?: pulumi.Input<string>;
    /**
     * It has been deprecated from provider version 1.7.1, and new field 'specification' can replace it.
     */
    readonly spec?: pulumi.Input<string>;
    /**
     * The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Default to `Small`. Details refer to [Nat Gateway Specification](https://www.alibabacloud.com/help/doc-detail/42757.htm).
     */
    readonly specification?: pulumi.Input<string>;
    /**
     * The VPC ID.
     */
    readonly vpcId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a NatGateway resource.
 */
export interface NatGatewayArgs {
    /**
     * A list of bandwidth packages for the nat gatway. Only support nat gateway created before 00:00 on November 4, 2017. Available in v1.13.0+ and v1.7.1-.
     */
    readonly bandwidthPackages?: pulumi.Input<pulumi.Input<{
        bandwidth: pulumi.Input<number>;
        ipCount: pulumi.Input<number>;
        publicIpAddresses?: pulumi.Input<string>;
        zone?: pulumi.Input<string>;
    }>[]>;
    /**
     * Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * It has been deprecated from provider version 1.7.1, and new field 'specification' can replace it.
     */
    readonly spec?: pulumi.Input<string>;
    /**
     * The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Default to `Small`. Details refer to [Nat Gateway Specification](https://www.alibabacloud.com/help/doc-detail/42757.htm).
     */
    readonly specification?: pulumi.Input<string>;
    /**
     * The VPC ID.
     */
    readonly vpcId: pulumi.Input<string>;
}
