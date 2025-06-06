// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a forward resource.
 *
 * > **NOTE:** Available since v1.40.0.
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
 * const name = config.get("name") || "forward-entry-example-name";
 * const _default = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/12",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/21",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: name,
 * });
 * const defaultNatGateway = new alicloud.vpc.NatGateway("default", {
 *     vpcId: defaultNetwork.id,
 *     internetChargeType: "PayByLcu",
 *     natGatewayName: name,
 *     natType: "Enhanced",
 *     vswitchId: defaultSwitch.id,
 * });
 * const defaultEipAddress = new alicloud.ecs.EipAddress("default", {addressName: name});
 * const defaultEipAssociation = new alicloud.ecs.EipAssociation("default", {
 *     allocationId: defaultEipAddress.id,
 *     instanceId: defaultNatGateway.id,
 * });
 * const defaultForwardEntry = new alicloud.vpc.ForwardEntry("default", {
 *     forwardTableId: defaultNatGateway.forwardTableIds,
 *     externalIp: defaultEipAddress.ipAddress,
 *     externalPort: "80",
 *     ipProtocol: "tcp",
 *     internalIp: "172.16.0.3",
 *     internalPort: "8080",
 * });
 * ```
 *
 * ## Import
 *
 * Forward Entry can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:vpc/forwardEntry:ForwardEntry foo ftb-1aece3:fwd-232ce2
 * ```
 */
export class ForwardEntry extends pulumi.CustomResource {
    /**
     * Get an existing ForwardEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ForwardEntryState, opts?: pulumi.CustomResourceOptions): ForwardEntry {
        return new ForwardEntry(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/forwardEntry:ForwardEntry';

    /**
     * Returns true if the given object is an instance of ForwardEntry.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ForwardEntry {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ForwardEntry.__pulumiType;
    }

    /**
     * The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidthPackages`.
     */
    public readonly externalIp!: pulumi.Output<string>;
    /**
     * The external port, valid value is 1~65535|any.
     */
    public readonly externalPort!: pulumi.Output<string>;
    /**
     * The id of the forward entry on the server.
     */
    public /*out*/ readonly forwardEntryId!: pulumi.Output<string>;
    /**
     * The name of forward entry.
     */
    public readonly forwardEntryName!: pulumi.Output<string>;
    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes "forwardTableIds".
     */
    public readonly forwardTableId!: pulumi.Output<string>;
    /**
     * The internal ip, must a private ip.
     */
    public readonly internalIp!: pulumi.Output<string>;
    /**
     * The internal port, valid value is 1~65535|any.
     */
    public readonly internalPort!: pulumi.Output<string>;
    /**
     * The ip protocol, valid value is tcp|udp|any.
     */
    public readonly ipProtocol!: pulumi.Output<string>;
    /**
     * Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies whether to remove limits on the port range. Default value is `false`.
     *
     * > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
     */
    public readonly portBreak!: pulumi.Output<boolean | undefined>;
    /**
     * (Available since v1.119.1) The status of forward entry.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a ForwardEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ForwardEntryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ForwardEntryArgs | ForwardEntryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ForwardEntryState | undefined;
            resourceInputs["externalIp"] = state ? state.externalIp : undefined;
            resourceInputs["externalPort"] = state ? state.externalPort : undefined;
            resourceInputs["forwardEntryId"] = state ? state.forwardEntryId : undefined;
            resourceInputs["forwardEntryName"] = state ? state.forwardEntryName : undefined;
            resourceInputs["forwardTableId"] = state ? state.forwardTableId : undefined;
            resourceInputs["internalIp"] = state ? state.internalIp : undefined;
            resourceInputs["internalPort"] = state ? state.internalPort : undefined;
            resourceInputs["ipProtocol"] = state ? state.ipProtocol : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["portBreak"] = state ? state.portBreak : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ForwardEntryArgs | undefined;
            if ((!args || args.externalIp === undefined) && !opts.urn) {
                throw new Error("Missing required property 'externalIp'");
            }
            if ((!args || args.externalPort === undefined) && !opts.urn) {
                throw new Error("Missing required property 'externalPort'");
            }
            if ((!args || args.forwardTableId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'forwardTableId'");
            }
            if ((!args || args.internalIp === undefined) && !opts.urn) {
                throw new Error("Missing required property 'internalIp'");
            }
            if ((!args || args.internalPort === undefined) && !opts.urn) {
                throw new Error("Missing required property 'internalPort'");
            }
            if ((!args || args.ipProtocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipProtocol'");
            }
            resourceInputs["externalIp"] = args ? args.externalIp : undefined;
            resourceInputs["externalPort"] = args ? args.externalPort : undefined;
            resourceInputs["forwardEntryName"] = args ? args.forwardEntryName : undefined;
            resourceInputs["forwardTableId"] = args ? args.forwardTableId : undefined;
            resourceInputs["internalIp"] = args ? args.internalIp : undefined;
            resourceInputs["internalPort"] = args ? args.internalPort : undefined;
            resourceInputs["ipProtocol"] = args ? args.ipProtocol : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["portBreak"] = args ? args.portBreak : undefined;
            resourceInputs["forwardEntryId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ForwardEntry.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ForwardEntry resources.
 */
export interface ForwardEntryState {
    /**
     * The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidthPackages`.
     */
    externalIp?: pulumi.Input<string>;
    /**
     * The external port, valid value is 1~65535|any.
     */
    externalPort?: pulumi.Input<string>;
    /**
     * The id of the forward entry on the server.
     */
    forwardEntryId?: pulumi.Input<string>;
    /**
     * The name of forward entry.
     */
    forwardEntryName?: pulumi.Input<string>;
    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes "forwardTableIds".
     */
    forwardTableId?: pulumi.Input<string>;
    /**
     * The internal ip, must a private ip.
     */
    internalIp?: pulumi.Input<string>;
    /**
     * The internal port, valid value is 1~65535|any.
     */
    internalPort?: pulumi.Input<string>;
    /**
     * The ip protocol, valid value is tcp|udp|any.
     */
    ipProtocol?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies whether to remove limits on the port range. Default value is `false`.
     *
     * > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
     */
    portBreak?: pulumi.Input<boolean>;
    /**
     * (Available since v1.119.1) The status of forward entry.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ForwardEntry resource.
 */
export interface ForwardEntryArgs {
    /**
     * The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidthPackages`.
     */
    externalIp: pulumi.Input<string>;
    /**
     * The external port, valid value is 1~65535|any.
     */
    externalPort: pulumi.Input<string>;
    /**
     * The name of forward entry.
     */
    forwardEntryName?: pulumi.Input<string>;
    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes "forwardTableIds".
     */
    forwardTableId: pulumi.Input<string>;
    /**
     * The internal ip, must a private ip.
     */
    internalIp: pulumi.Input<string>;
    /**
     * The internal port, valid value is 1~65535|any.
     */
    internalPort: pulumi.Input<string>;
    /**
     * The ip protocol, valid value is tcp|udp|any.
     */
    ipProtocol: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from provider version 1.119.1. New field `forwardEntryName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.119.1. New field 'forward_entry_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies whether to remove limits on the port range. Default value is `false`.
     *
     * > **NOTE:** A SNAT entry and a DNAT entry may use the same public IP address. If you want to specify a port number greater than 1024 in this case, set `portBreak` to true.
     */
    portBreak?: pulumi.Input<boolean>;
}
