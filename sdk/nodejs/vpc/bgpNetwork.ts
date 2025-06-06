// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a VPC Bgp Network resource.
 *
 * For information about VPC Bgp Network and how to use it, see [What is Bgp Network](https://www.alibabacloud.com/help/en/doc-detail/91267.html).
 *
 * > **NOTE:** Available since v1.153.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const example = alicloud.expressconnect.getPhysicalConnections({
 *     nameRegex: "^preserved-NODELETING",
 * });
 * const vlanId = new random.index.Integer("vlan_id", {
 *     max: 2999,
 *     min: 1,
 * });
 * const exampleVirtualBorderRouter = new alicloud.expressconnect.VirtualBorderRouter("example", {
 *     localGatewayIp: "10.0.0.1",
 *     peerGatewayIp: "10.0.0.2",
 *     peeringSubnetMask: "255.255.255.252",
 *     physicalConnectionId: example.then(example => example.connections?.[0]?.id),
 *     virtualBorderRouterName: name,
 *     vlanId: vlanId.id,
 *     minRxInterval: 1000,
 *     minTxInterval: 1000,
 *     detectMultiplier: 10,
 * });
 * const exampleBgpNetwork = new alicloud.vpc.BgpNetwork("example", {
 *     dstCidrBlock: "192.168.0.0/24",
 *     routerId: exampleVirtualBorderRouter.id,
 * });
 * ```
 *
 * ## Import
 *
 * VPC Bgp Network can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:vpc/bgpNetwork:BgpNetwork example <router_id>:<dst_cidr_block>
 * ```
 */
export class BgpNetwork extends pulumi.CustomResource {
    /**
     * Get an existing BgpNetwork resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BgpNetworkState, opts?: pulumi.CustomResourceOptions): BgpNetwork {
        return new BgpNetwork(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/bgpNetwork:BgpNetwork';

    /**
     * Returns true if the given object is an instance of BgpNetwork.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BgpNetwork {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BgpNetwork.__pulumiType;
    }

    /**
     * The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
     */
    public readonly dstCidrBlock!: pulumi.Output<string>;
    /**
     * The ID of the vRouter associated with the router interface.
     */
    public readonly routerId!: pulumi.Output<string>;
    /**
     * The state of the advertised BGP network.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a BgpNetwork resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BgpNetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BgpNetworkArgs | BgpNetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BgpNetworkState | undefined;
            resourceInputs["dstCidrBlock"] = state ? state.dstCidrBlock : undefined;
            resourceInputs["routerId"] = state ? state.routerId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as BgpNetworkArgs | undefined;
            if ((!args || args.dstCidrBlock === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dstCidrBlock'");
            }
            if ((!args || args.routerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routerId'");
            }
            resourceInputs["dstCidrBlock"] = args ? args.dstCidrBlock : undefined;
            resourceInputs["routerId"] = args ? args.routerId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BgpNetwork.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BgpNetwork resources.
 */
export interface BgpNetworkState {
    /**
     * The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
     */
    dstCidrBlock?: pulumi.Input<string>;
    /**
     * The ID of the vRouter associated with the router interface.
     */
    routerId?: pulumi.Input<string>;
    /**
     * The state of the advertised BGP network.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BgpNetwork resource.
 */
export interface BgpNetworkArgs {
    /**
     * The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
     */
    dstCidrBlock: pulumi.Input<string>;
    /**
     * The ID of the vRouter associated with the router interface.
     */
    routerId: pulumi.Input<string>;
}
