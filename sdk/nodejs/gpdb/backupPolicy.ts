// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * GPDB Backup Policy can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:gpdb/backupPolicy:BackupPolicy example <id>
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
    public static readonly __pulumiType = 'alicloud:gpdb/backupPolicy:BackupPolicy';

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
     * Data backup retention days.
     */
    public readonly backupRetentionPeriod!: pulumi.Output<number>;
    /**
     * The instance ID.
     * > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
     */
    public readonly dbInstanceId!: pulumi.Output<string>;
    /**
     * Whether to enable automatic recovery points. Value Description:
     * - **true**: enabled.
     * - **false**: Closed.
     */
    public readonly enableRecoveryPoint!: pulumi.Output<boolean>;
    /**
     * Data backup cycle. Separate multiple values with commas (,). Value Description:
     * - **Monday**: Monday.
     * - **Tuesday**: Tuesday.
     * - **Wednesday**: Wednesday.
     * - **Thursday**: Thursday.
     * - **Friday**: Friday.
     * - **Saturday**: Saturday.
     * - **Sunday**: Sunday.
     */
    public readonly preferredBackupPeriod!: pulumi.Output<string>;
    /**
     * Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
     */
    public readonly preferredBackupTime!: pulumi.Output<string>;
    /**
     * Recovery point frequency. Value Description:
     * - **1**: Hourly.
     * - **2**: Every two hours.
     * - **4**: Every four hours.
     * - **8**: Every eight hours.
     */
    public readonly recoveryPointPeriod!: pulumi.Output<string>;

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
            resourceInputs["backupRetentionPeriod"] = state ? state.backupRetentionPeriod : undefined;
            resourceInputs["dbInstanceId"] = state ? state.dbInstanceId : undefined;
            resourceInputs["enableRecoveryPoint"] = state ? state.enableRecoveryPoint : undefined;
            resourceInputs["preferredBackupPeriod"] = state ? state.preferredBackupPeriod : undefined;
            resourceInputs["preferredBackupTime"] = state ? state.preferredBackupTime : undefined;
            resourceInputs["recoveryPointPeriod"] = state ? state.recoveryPointPeriod : undefined;
        } else {
            const args = argsOrState as BackupPolicyArgs | undefined;
            if ((!args || args.dbInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstanceId'");
            }
            if ((!args || args.preferredBackupPeriod === undefined) && !opts.urn) {
                throw new Error("Missing required property 'preferredBackupPeriod'");
            }
            if ((!args || args.preferredBackupTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'preferredBackupTime'");
            }
            resourceInputs["backupRetentionPeriod"] = args ? args.backupRetentionPeriod : undefined;
            resourceInputs["dbInstanceId"] = args ? args.dbInstanceId : undefined;
            resourceInputs["enableRecoveryPoint"] = args ? args.enableRecoveryPoint : undefined;
            resourceInputs["preferredBackupPeriod"] = args ? args.preferredBackupPeriod : undefined;
            resourceInputs["preferredBackupTime"] = args ? args.preferredBackupTime : undefined;
            resourceInputs["recoveryPointPeriod"] = args ? args.recoveryPointPeriod : undefined;
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
     * Data backup retention days.
     */
    backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * The instance ID.
     * > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
     */
    dbInstanceId?: pulumi.Input<string>;
    /**
     * Whether to enable automatic recovery points. Value Description:
     * - **true**: enabled.
     * - **false**: Closed.
     */
    enableRecoveryPoint?: pulumi.Input<boolean>;
    /**
     * Data backup cycle. Separate multiple values with commas (,). Value Description:
     * - **Monday**: Monday.
     * - **Tuesday**: Tuesday.
     * - **Wednesday**: Wednesday.
     * - **Thursday**: Thursday.
     * - **Friday**: Friday.
     * - **Saturday**: Saturday.
     * - **Sunday**: Sunday.
     */
    preferredBackupPeriod?: pulumi.Input<string>;
    /**
     * Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
     */
    preferredBackupTime?: pulumi.Input<string>;
    /**
     * Recovery point frequency. Value Description:
     * - **1**: Hourly.
     * - **2**: Every two hours.
     * - **4**: Every four hours.
     * - **8**: Every eight hours.
     */
    recoveryPointPeriod?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BackupPolicy resource.
 */
export interface BackupPolicyArgs {
    /**
     * Data backup retention days.
     */
    backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * The instance ID.
     * > **NOTE:**  You can call the DescribeDBInstances operation to view the details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.
     */
    dbInstanceId: pulumi.Input<string>;
    /**
     * Whether to enable automatic recovery points. Value Description:
     * - **true**: enabled.
     * - **false**: Closed.
     */
    enableRecoveryPoint?: pulumi.Input<boolean>;
    /**
     * Data backup cycle. Separate multiple values with commas (,). Value Description:
     * - **Monday**: Monday.
     * - **Tuesday**: Tuesday.
     * - **Wednesday**: Wednesday.
     * - **Thursday**: Thursday.
     * - **Friday**: Friday.
     * - **Saturday**: Saturday.
     * - **Sunday**: Sunday.
     */
    preferredBackupPeriod: pulumi.Input<string>;
    /**
     * Data backup time. Format: HH:mmZ-HH:mmZ(UTC time).
     */
    preferredBackupTime: pulumi.Input<string>;
    /**
     * Recovery point frequency. Value Description:
     * - **1**: Hourly.
     * - **2**: Every two hours.
     * - **4**: Every four hours.
     * - **8**: Every eight hours.
     */
    recoveryPointPeriod?: pulumi.Input<string>;
}
