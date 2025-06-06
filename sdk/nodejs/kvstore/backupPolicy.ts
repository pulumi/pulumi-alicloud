// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Backup Policy for Tair (Redis OSS-Compatible) And Memcache (KVStore) resource.
 *
 * For information about Backup Policy for Tair (Redis OSS-Compatible) And Memcache (KVStore) and how to use it, see [What is Backup Policy](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-modifybackuppolicy-redis).
 *
 * > **NOTE:** Available since v1.15.0.
 *
 * > **DEPRECATED:**  This resource  has been deprecated from version `1.104.0`. Please use resource alicloud_kvstore_instance.
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
 * const _default = alicloud.kvstore.getZones({});
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: name,
 * });
 * const defaultInstance = new alicloud.kvstore.Instance("default", {
 *     dbInstanceName: name,
 *     vswitchId: defaultSwitch.id,
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     instanceClass: "redis.master.large.default",
 *     instanceType: "Redis",
 *     engineVersion: "5.0",
 *     securityIps: ["10.23.12.24"],
 *     config: {
 *         appendonly: "yes",
 *         "lazyfree-lazy-eviction": "yes",
 *     },
 *     tags: {
 *         Created: "TF",
 *         For: "example",
 *     },
 * });
 * const defaultBackupPolicy = new alicloud.kvstore.BackupPolicy("default", {
 *     instanceId: defaultInstance.id,
 *     backupPeriods: [
 *         "Tuesday",
 *         "Wednesday",
 *     ],
 *     backupTime: "10:00Z-11:00Z",
 * });
 * ```
 *
 * ## Import
 *
 * Tair (Redis OSS-Compatible) And Memcache (KVStore) Backup Policy can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:kvstore/backupPolicy:BackupPolicy example <id>
 * ```
 */
export class BackupPolicy extends pulumi.CustomResource {
    /**
     * Get an existing BackupPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackupPolicyState, opts?: pulumi.CustomResourceOptions): BackupPolicy {
        return new BackupPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:kvstore/backupPolicy:BackupPolicy';

    /**
     * Returns true if the given object is an instance of BackupPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BackupPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BackupPolicy.__pulumiType;
    }

    /**
     * Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     */
    public readonly backupPeriods!: pulumi.Output<string[]>;
    /**
     * Backup time, in the format of HH:mmZ- HH:mm Z.
     */
    public readonly backupTime!: pulumi.Output<string | undefined>;
    /**
     * The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
     */
    public readonly instanceId!: pulumi.Output<string>;

    /**
     * Create a BackupPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackupPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackupPolicyArgs | BackupPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BackupPolicyState | undefined;
            resourceInputs["backupPeriods"] = state ? state.backupPeriods : undefined;
            resourceInputs["backupTime"] = state ? state.backupTime : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
        } else {
            const args = argsOrState as BackupPolicyArgs | undefined;
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["backupPeriods"] = args ? args.backupPeriods : undefined;
            resourceInputs["backupTime"] = args ? args.backupTime : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BackupPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BackupPolicy resources.
 */
export interface BackupPolicyState {
    /**
     * Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     */
    backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Backup time, in the format of HH:mmZ- HH:mm Z.
     */
    backupTime?: pulumi.Input<string>;
    /**
     * The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
     */
    instanceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BackupPolicy resource.
 */
export interface BackupPolicyArgs {
    /**
     * Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     */
    backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Backup time, in the format of HH:mmZ- HH:mm Z.
     */
    backupTime?: pulumi.Input<string>;
    /**
     * The id of Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
     */
    instanceId: pulumi.Input<string>;
}
