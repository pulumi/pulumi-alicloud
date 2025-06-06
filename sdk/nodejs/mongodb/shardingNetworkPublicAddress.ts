// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a MongoDB Sharding Network Public Address resource.
 *
 * For information about MongoDB Sharding Network Public Address and how to use it, see [What is Sharding Network Public Address](https://www.alibabacloud.com/help/doc-detail/67602.html).
 *
 * > **NOTE:** Available since v1.149.0.
 *
 * > **NOTE:** This operation supports sharded cluster instances only.
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
 * const name = config.get("name") || "terraform-example";
 * const _default = alicloud.mongodb.getZones({});
 * const index = _default.then(_default => _default.zones).length.apply(length => length - 1);
 * const zoneId = _default.then(_default => _default.zones[index].id);
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "172.17.3.0/24",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vswitchName: name,
 *     cidrBlock: "172.17.3.0/24",
 *     vpcId: defaultNetwork.id,
 *     zoneId: zoneId,
 * });
 * const defaultShardingInstance = new alicloud.mongodb.ShardingInstance("default", {
 *     zoneId: zoneId,
 *     vswitchId: defaultSwitch.id,
 *     engineVersion: "4.2",
 *     name: name,
 *     shardLists: [
 *         {
 *             nodeClass: "dds.shard.mid",
 *             nodeStorage: 10,
 *         },
 *         {
 *             nodeClass: "dds.shard.standard",
 *             nodeStorage: 20,
 *             readonlyReplicas: 1,
 *         },
 *     ],
 *     mongoLists: [
 *         {
 *             nodeClass: "dds.mongos.mid",
 *         },
 *         {
 *             nodeClass: "dds.mongos.mid",
 *         },
 *     ],
 * });
 * const example = new alicloud.mongodb.ShardingNetworkPublicAddress("example", {
 *     dbInstanceId: defaultShardingInstance.id,
 *     nodeId: defaultShardingInstance.mongoLists.apply(mongoLists => mongoLists[0].nodeId),
 * });
 * ```
 *
 * ## Import
 *
 * MongoDB Sharding Network Public Address can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:mongodb/shardingNetworkPublicAddress:ShardingNetworkPublicAddress example <db_instance_id>:<node_id>
 * ```
 */
export class ShardingNetworkPublicAddress extends pulumi.CustomResource {
    /**
     * Get an existing ShardingNetworkPublicAddress resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ShardingNetworkPublicAddressState, opts?: pulumi.CustomResourceOptions): ShardingNetworkPublicAddress {
        return new ShardingNetworkPublicAddress(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:mongodb/shardingNetworkPublicAddress:ShardingNetworkPublicAddress';

    /**
     * Returns true if the given object is an instance of ShardingNetworkPublicAddress.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ShardingNetworkPublicAddress {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ShardingNetworkPublicAddress.__pulumiType;
    }

    /**
     * The ID of the instance.
     */
    public readonly dbInstanceId!: pulumi.Output<string>;
    /**
     * The endpoint of the instance.
     */
    public /*out*/ readonly networkAddresses!: pulumi.Output<outputs.mongodb.ShardingNetworkPublicAddressNetworkAddress[]>;
    /**
     * The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
     */
    public readonly nodeId!: pulumi.Output<string>;

    /**
     * Create a ShardingNetworkPublicAddress resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ShardingNetworkPublicAddressArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ShardingNetworkPublicAddressArgs | ShardingNetworkPublicAddressState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ShardingNetworkPublicAddressState | undefined;
            resourceInputs["dbInstanceId"] = state ? state.dbInstanceId : undefined;
            resourceInputs["networkAddresses"] = state ? state.networkAddresses : undefined;
            resourceInputs["nodeId"] = state ? state.nodeId : undefined;
        } else {
            const args = argsOrState as ShardingNetworkPublicAddressArgs | undefined;
            if ((!args || args.dbInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstanceId'");
            }
            if ((!args || args.nodeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeId'");
            }
            resourceInputs["dbInstanceId"] = args ? args.dbInstanceId : undefined;
            resourceInputs["nodeId"] = args ? args.nodeId : undefined;
            resourceInputs["networkAddresses"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ShardingNetworkPublicAddress.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ShardingNetworkPublicAddress resources.
 */
export interface ShardingNetworkPublicAddressState {
    /**
     * The ID of the instance.
     */
    dbInstanceId?: pulumi.Input<string>;
    /**
     * The endpoint of the instance.
     */
    networkAddresses?: pulumi.Input<pulumi.Input<inputs.mongodb.ShardingNetworkPublicAddressNetworkAddress>[]>;
    /**
     * The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
     */
    nodeId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ShardingNetworkPublicAddress resource.
 */
export interface ShardingNetworkPublicAddressArgs {
    /**
     * The ID of the instance.
     */
    dbInstanceId: pulumi.Input<string>;
    /**
     * The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
     */
    nodeId: pulumi.Input<string>;
}
