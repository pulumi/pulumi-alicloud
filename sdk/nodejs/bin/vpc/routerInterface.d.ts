import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a VPC router interface resource aim to build a connection between two VPCs.
 *
 * -> **NOTE:** Only one pair of connected router interfaces can exist between two routers. Up to 5 router interfaces can be created for each router and each account.
 *
 * -> **NOTE:** The router interface is not connected when it is created. It can be connected by means of resource [alicloud_router_interface_connection](https://www.terraform.io/docs/providers/alicloud/r/router_interface_connection.html).
 *
 */
export declare class RouterInterface extends pulumi.CustomResource {
    /**
     * Get an existing RouterInterface resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouterInterfaceState): RouterInterface;
    /**
     * It has been deprecated from version 1.11.0.
     */
    readonly accessPointId: pulumi.Output<string>;
    /**
     * Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_target_ip` must be specified at the same time.
     */
    readonly healthCheckSourceIp: pulumi.Output<string | undefined>;
    /**
     * Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_source_ip` must be specified at the same time.
     */
    readonly healthCheckTargetIp: pulumi.Output<string | undefined>;
    /**
     * The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     */
    readonly instanceChargeType: pulumi.Output<string | undefined>;
    /**
     * Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
     * If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
     */
    readonly name: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.11.0.
     */
    readonly oppositeAccessPointId: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
     */
    readonly oppositeInterfaceId: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
     */
    readonly oppositeInterfaceOwnerId: pulumi.Output<string>;
    /**
     * The Region of peer side.
     */
    readonly oppositeRegion: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
     */
    readonly oppositeRouterId: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection's 'opposite_router_type' instead.
     */
    readonly oppositeRouterType: pulumi.Output<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     */
    readonly period: pulumi.Output<number | undefined>;
    /**
     * The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
     */
    readonly role: pulumi.Output<string>;
    /**
     * The Router ID.
     */
    readonly routerId: pulumi.Output<string>;
    /**
     * Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
     */
    readonly routerType: pulumi.Output<string>;
    /**
     * Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
     */
    readonly specification: pulumi.Output<string | undefined>;
    /**
     * Create a RouterInterface resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouterInterfaceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RouterInterface resources.
 */
export interface RouterInterfaceState {
    /**
     * It has been deprecated from version 1.11.0.
     */
    readonly accessPointId?: pulumi.Input<string>;
    /**
     * Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_target_ip` must be specified at the same time.
     */
    readonly healthCheckSourceIp?: pulumi.Input<string>;
    /**
     * Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_source_ip` must be specified at the same time.
     */
    readonly healthCheckTargetIp?: pulumi.Input<string>;
    /**
     * The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
     * If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.11.0.
     */
    readonly oppositeAccessPointId?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
     */
    readonly oppositeInterfaceId?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
     */
    readonly oppositeInterfaceOwnerId?: pulumi.Input<string>;
    /**
     * The Region of peer side.
     */
    readonly oppositeRegion?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
     */
    readonly oppositeRouterId?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection's 'opposite_router_type' instead.
     */
    readonly oppositeRouterType?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * The Router ID.
     */
    readonly routerId?: pulumi.Input<string>;
    /**
     * Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
     */
    readonly routerType?: pulumi.Input<string>;
    /**
     * Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
     */
    readonly specification?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RouterInterface resource.
 */
export interface RouterInterfaceArgs {
    /**
     * Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_target_ip` must be specified at the same time.
     */
    readonly healthCheckSourceIp?: pulumi.Input<string>;
    /**
     * Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_source_ip` must be specified at the same time.
     */
    readonly healthCheckTargetIp?: pulumi.Input<string>;
    /**
     * The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
     * If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.11.0.
     */
    readonly oppositeAccessPointId?: pulumi.Input<string>;
    /**
     * The Region of peer side.
     */
    readonly oppositeRegion: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
     */
    readonly role: pulumi.Input<string>;
    /**
     * The Router ID.
     */
    readonly routerId: pulumi.Input<string>;
    /**
     * Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
     */
    readonly routerType: pulumi.Input<string>;
    /**
     * Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
     */
    readonly specification?: pulumi.Input<string>;
}
