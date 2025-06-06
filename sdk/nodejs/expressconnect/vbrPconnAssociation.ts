// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Express Connect Vbr Pconn Association resource.
 *
 * For information about Express Connect Vbr Pconn Association and how to use it, see [What is Vbr Pconn Association](https://www.alibabacloud.com/help/en/express-connect/latest/associatephysicalconnectiontovirtualborderrouter#doc-api-Vpc-AssociatePhysicalConnectionToVirtualBorderRouter).
 *
 * > **NOTE:** Available since v1.196.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const example = alicloud.expressconnect.getPhysicalConnections({
 *     nameRegex: "^preserved-NODELETING",
 * });
 * const _default = new alicloud.expressconnect.VirtualBorderRouter("default", {
 *     localGatewayIp: "10.0.0.1",
 *     peerGatewayIp: "10.0.0.2",
 *     peeringSubnetMask: "255.255.255.252",
 *     physicalConnectionId: example.then(example => example.connections?.[0]?.id),
 *     virtualBorderRouterName: name,
 *     vlanId: 110,
 *     minRxInterval: 1000,
 *     minTxInterval: 1000,
 *     detectMultiplier: 10,
 *     enableIpv6: true,
 *     localIpv6GatewayIp: "2408:4004:cc:400::1",
 *     peerIpv6GatewayIp: "2408:4004:cc:400::2",
 *     peeringIpv6SubnetMask: "2408:4004:cc:400::/56",
 * });
 * const exampleVbrPconnAssociation = new alicloud.expressconnect.VbrPconnAssociation("example", {
 *     peerGatewayIp: "10.0.0.6",
 *     localGatewayIp: "10.0.0.5",
 *     physicalConnectionId: example.then(example => example.connections?.[1]?.id),
 *     vbrId: _default.id,
 *     peeringSubnetMask: "255.255.255.252",
 *     vlanId: 1122,
 *     enableIpv6: true,
 *     localIpv6GatewayIp: "2408:4004:cc::3",
 *     peerIpv6GatewayIp: "2408:4004:cc::4",
 *     peeringIpv6SubnetMask: "2408:4004:cc::/56",
 * });
 * ```
 *
 * ## Import
 *
 * Express Connect Vbr Pconn Association can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation example <VbrId>:<PhysicalConnectionId>
 * ```
 */
export class VbrPconnAssociation extends pulumi.CustomResource {
    /**
     * Get an existing VbrPconnAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VbrPconnAssociationState, opts?: pulumi.CustomResourceOptions): VbrPconnAssociation {
        return new VbrPconnAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation';

    /**
     * Returns true if the given object is an instance of VbrPconnAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VbrPconnAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VbrPconnAssociation.__pulumiType;
    }

    /**
     * The circuit code provided by the operator for the physical connection.
     */
    public /*out*/ readonly circuitCode!: pulumi.Output<string>;
    /**
     * Whether IPv6 is enabled. Value:
     * - **true**: on.
     * - **false** (default): Off.
     */
    public readonly enableIpv6!: pulumi.Output<boolean>;
    /**
     * The Alibaba cloud IP address of the VBR instance.
     */
    public readonly localGatewayIp!: pulumi.Output<string | undefined>;
    /**
     * The IPv6 address on the Alibaba Cloud side of the VBR instance.
     */
    public readonly localIpv6GatewayIp!: pulumi.Output<string | undefined>;
    /**
     * The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     */
    public readonly peerGatewayIp!: pulumi.Output<string | undefined>;
    /**
     * The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     */
    public readonly peerIpv6GatewayIp!: pulumi.Output<string | undefined>;
    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
     */
    public readonly peeringIpv6SubnetMask!: pulumi.Output<string | undefined>;
    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
     */
    public readonly peeringSubnetMask!: pulumi.Output<string | undefined>;
    /**
     * The ID of the leased line instance.
     */
    public readonly physicalConnectionId!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The ID of the VBR instance.
     */
    public readonly vbrId!: pulumi.Output<string>;
    /**
     * VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
     */
    public readonly vlanId!: pulumi.Output<number>;

    /**
     * Create a VbrPconnAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VbrPconnAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VbrPconnAssociationArgs | VbrPconnAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VbrPconnAssociationState | undefined;
            resourceInputs["circuitCode"] = state ? state.circuitCode : undefined;
            resourceInputs["enableIpv6"] = state ? state.enableIpv6 : undefined;
            resourceInputs["localGatewayIp"] = state ? state.localGatewayIp : undefined;
            resourceInputs["localIpv6GatewayIp"] = state ? state.localIpv6GatewayIp : undefined;
            resourceInputs["peerGatewayIp"] = state ? state.peerGatewayIp : undefined;
            resourceInputs["peerIpv6GatewayIp"] = state ? state.peerIpv6GatewayIp : undefined;
            resourceInputs["peeringIpv6SubnetMask"] = state ? state.peeringIpv6SubnetMask : undefined;
            resourceInputs["peeringSubnetMask"] = state ? state.peeringSubnetMask : undefined;
            resourceInputs["physicalConnectionId"] = state ? state.physicalConnectionId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vbrId"] = state ? state.vbrId : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
        } else {
            const args = argsOrState as VbrPconnAssociationArgs | undefined;
            if ((!args || args.physicalConnectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'physicalConnectionId'");
            }
            if ((!args || args.vbrId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vbrId'");
            }
            if ((!args || args.vlanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vlanId'");
            }
            resourceInputs["enableIpv6"] = args ? args.enableIpv6 : undefined;
            resourceInputs["localGatewayIp"] = args ? args.localGatewayIp : undefined;
            resourceInputs["localIpv6GatewayIp"] = args ? args.localIpv6GatewayIp : undefined;
            resourceInputs["peerGatewayIp"] = args ? args.peerGatewayIp : undefined;
            resourceInputs["peerIpv6GatewayIp"] = args ? args.peerIpv6GatewayIp : undefined;
            resourceInputs["peeringIpv6SubnetMask"] = args ? args.peeringIpv6SubnetMask : undefined;
            resourceInputs["peeringSubnetMask"] = args ? args.peeringSubnetMask : undefined;
            resourceInputs["physicalConnectionId"] = args ? args.physicalConnectionId : undefined;
            resourceInputs["vbrId"] = args ? args.vbrId : undefined;
            resourceInputs["vlanId"] = args ? args.vlanId : undefined;
            resourceInputs["circuitCode"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VbrPconnAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VbrPconnAssociation resources.
 */
export interface VbrPconnAssociationState {
    /**
     * The circuit code provided by the operator for the physical connection.
     */
    circuitCode?: pulumi.Input<string>;
    /**
     * Whether IPv6 is enabled. Value:
     * - **true**: on.
     * - **false** (default): Off.
     */
    enableIpv6?: pulumi.Input<boolean>;
    /**
     * The Alibaba cloud IP address of the VBR instance.
     */
    localGatewayIp?: pulumi.Input<string>;
    /**
     * The IPv6 address on the Alibaba Cloud side of the VBR instance.
     */
    localIpv6GatewayIp?: pulumi.Input<string>;
    /**
     * The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     */
    peerGatewayIp?: pulumi.Input<string>;
    /**
     * The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     */
    peerIpv6GatewayIp?: pulumi.Input<string>;
    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
     */
    peeringIpv6SubnetMask?: pulumi.Input<string>;
    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
     */
    peeringSubnetMask?: pulumi.Input<string>;
    /**
     * The ID of the leased line instance.
     */
    physicalConnectionId?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the VBR instance.
     */
    vbrId?: pulumi.Input<string>;
    /**
     * VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
     */
    vlanId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a VbrPconnAssociation resource.
 */
export interface VbrPconnAssociationArgs {
    /**
     * Whether IPv6 is enabled. Value:
     * - **true**: on.
     * - **false** (default): Off.
     */
    enableIpv6?: pulumi.Input<boolean>;
    /**
     * The Alibaba cloud IP address of the VBR instance.
     */
    localGatewayIp?: pulumi.Input<string>;
    /**
     * The IPv6 address on the Alibaba Cloud side of the VBR instance.
     */
    localIpv6GatewayIp?: pulumi.Input<string>;
    /**
     * The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     */
    peerGatewayIp?: pulumi.Input<string>;
    /**
     * The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     */
    peerIpv6GatewayIp?: pulumi.Input<string>;
    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
     */
    peeringIpv6SubnetMask?: pulumi.Input<string>;
    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
     */
    peeringSubnetMask?: pulumi.Input<string>;
    /**
     * The ID of the leased line instance.
     */
    physicalConnectionId: pulumi.Input<string>;
    /**
     * The ID of the VBR instance.
     */
    vbrId: pulumi.Input<string>;
    /**
     * VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
     */
    vlanId: pulumi.Input<number>;
}
