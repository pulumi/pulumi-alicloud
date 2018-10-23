import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an elastic IP resource.
 *
 * -> **NOTE:** The resource only support to create `PayByTraffic` elastic IP for international account. Otherwise, you will happened error `COMMODITY.INVALID_COMPONENT`.
 * Your account is international if you can use it to login in [International Web Console](https://account.alibabacloud.com/login/login.htm).
 *
 * -> **NOTE:** From version 1.10.1, this resource supports creating "PrePaid" EIP. In addition, it supports setting EIP name and description.
 */
export declare class Eip extends pulumi.CustomResource {
    /**
     * Get an existing Eip resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EipState): Eip;
    /**
     * Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
     */
    readonly bandwidth: pulumi.Output<number | undefined>;
    /**
     * Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description: pulumi.Output<string | undefined>;
    readonly instance: pulumi.Output<string>;
    /**
     * Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     */
    readonly instanceChargeType: pulumi.Output<string | undefined>;
    /**
     * Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. From version `1.7.1`, default to `PayByTraffic`.
     */
    readonly internetChargeType: pulumi.Output<string | undefined>;
    /**
     * The elastic ip address
     */
    readonly ipAddress: pulumi.Output<string>;
    /**
     * The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`.
     * Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     */
    readonly period: pulumi.Output<number | undefined>;
    /**
     * The EIP current status.
     */
    readonly status: pulumi.Output<string>;
    /**
     * Create a Eip resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EipArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Eip resources.
 */
export interface EipState {
    /**
     * Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
     */
    readonly bandwidth?: pulumi.Input<number>;
    /**
     * Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    readonly instance?: pulumi.Input<string>;
    /**
     * Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. From version `1.7.1`, default to `PayByTraffic`.
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * The elastic ip address
     */
    readonly ipAddress?: pulumi.Input<string>;
    /**
     * The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`.
     * Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The EIP current status.
     */
    readonly status?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Eip resource.
 */
export interface EipArgs {
    /**
     * Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
     */
    readonly bandwidth?: pulumi.Input<number>;
    /**
     * Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    readonly instance?: pulumi.Input<string>;
    /**
     * Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. From version `1.7.1`, default to `PayByTraffic`.
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`.
     * Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     */
    readonly period?: pulumi.Input<number>;
}
