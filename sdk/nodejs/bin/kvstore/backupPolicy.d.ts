import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a backup policy for ApsaraDB Redis / Memcache instance resource.
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
    readonly backupPeriods: pulumi.Output<string[]>;
    readonly backupTime: pulumi.Output<string | undefined>;
    /**
     * The id of ApsaraDB for Redis or Memcache intance.
     * * `preferred_backup_time`- (Required) Backup time, in the format of HH:mmZ- HH:mm Z
     */
    readonly instanceId: pulumi.Output<string>;
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
    readonly backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    readonly backupTime?: pulumi.Input<string>;
    /**
     * The id of ApsaraDB for Redis or Memcache intance.
     * * `preferred_backup_time`- (Required) Backup time, in the format of HH:mmZ- HH:mm Z
     */
    readonly instanceId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a BackupPolicy resource.
 */
export interface BackupPolicyArgs {
    readonly backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    readonly backupTime?: pulumi.Input<string>;
    /**
     * The id of ApsaraDB for Redis or Memcache intance.
     * * `preferred_backup_time`- (Required) Backup time, in the format of HH:mmZ- HH:mm Z
     */
    readonly instanceId: pulumi.Input<string>;
}
