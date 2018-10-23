import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an RDS instance backup policy resource and used to configure instance backup policy.
 *
 * ~> **NOTE:** Each DB instance has a backup policy and it will be set default values when destroying the resource.
 */
export declare class BackupPolicy extends pulumi.CustomResource {
    /**
     * Get an existing BackupPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackupPolicyState): BackupPolicy;
    /**
     * DB Instance backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Tuesday", "Thursday", "Saturday"].
     */
    readonly backupPeriods: pulumi.Output<string[]>;
    /**
     * DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
     */
    readonly backupTime: pulumi.Output<string | undefined>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * Whether to backup instance log. Default to true.
     */
    readonly logBackup: pulumi.Output<boolean | undefined>;
    /**
     * Instance log backup retention days. Valid values: [7-730]. Default to 7. It can be larger than 'retention_period'.
     */
    readonly logRetentionPeriod: pulumi.Output<number | undefined>;
    /**
     * Instance backup retention days. Valid values: [7-730]. Default to 7.
     */
    readonly retentionPeriod: pulumi.Output<number | undefined>;
    /**
     * Create a BackupPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackupPolicyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering BackupPolicy resources.
 */
export interface BackupPolicyState {
    /**
     * DB Instance backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Tuesday", "Thursday", "Saturday"].
     */
    readonly backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
     */
    readonly backupTime?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * Whether to backup instance log. Default to true.
     */
    readonly logBackup?: pulumi.Input<boolean>;
    /**
     * Instance log backup retention days. Valid values: [7-730]. Default to 7. It can be larger than 'retention_period'.
     */
    readonly logRetentionPeriod?: pulumi.Input<number>;
    /**
     * Instance backup retention days. Valid values: [7-730]. Default to 7.
     */
    readonly retentionPeriod?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a BackupPolicy resource.
 */
export interface BackupPolicyArgs {
    /**
     * DB Instance backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Tuesday", "Thursday", "Saturday"].
     */
    readonly backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
     */
    readonly backupTime?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * Whether to backup instance log. Default to true.
     */
    readonly logBackup?: pulumi.Input<boolean>;
    /**
     * Instance log backup retention days. Valid values: [7-730]. Default to 7. It can be larger than 'retention_period'.
     */
    readonly logRetentionPeriod?: pulumi.Input<number>;
    /**
     * Instance backup retention days. Valid values: [7-730]. Default to 7.
     */
    readonly retentionPeriod?: pulumi.Input<number>;
}
