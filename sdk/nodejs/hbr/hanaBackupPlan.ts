// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Hybrid Backup Recovery (HBR) Hana Backup Plan resource.
 *
 * For information about Hybrid Backup Recovery (HBR) Hana Backup Plan and how to use it, see [What is Hana Backup Plan](https://www.alibabacloud.com/help/en/hybrid-backup-recovery/latest/api-hbr-2017-09-08-createhanabackupplan).
 *
 * > **NOTE:** Available since v1.179.0.
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
 * const example = alicloud.resourcemanager.getResourceGroups({
 *     status: "OK",
 * });
 * const _default = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const exampleVault = new alicloud.hbr.Vault("example", {vaultName: `terraform-example-${_default.result}`});
 * const exampleHanaInstance = new alicloud.hbr.HanaInstance("example", {
 *     alertSetting: "INHERITED",
 *     hanaName: `terraform-example-${_default.result}`,
 *     host: "1.1.1.1",
 *     instanceNumber: 1,
 *     password: "YouPassword123",
 *     resourceGroupId: example.then(example => example.groups?.[0]?.id),
 *     sid: "HXE",
 *     useSsl: false,
 *     userName: "admin",
 *     validateCertificate: false,
 *     vaultId: exampleVault.id,
 * });
 * const exampleHanaBackupPlan = new alicloud.hbr.HanaBackupPlan("example", {
 *     backupPrefix: "DIFF_DATA_BACKUP",
 *     backupType: "COMPLETE",
 *     clusterId: exampleHanaInstance.hanaInstanceId,
 *     databaseName: "SYSTEMDB",
 *     planName: "terraform-example",
 *     resourceGroupId: example.then(example => example.groups?.[0]?.id),
 *     schedule: "I|1602673264|P1D",
 *     vaultId: exampleHanaInstance.vaultId,
 * });
 * ```
 *
 * ## Import
 *
 * Hybrid Backup Recovery (HBR) Hana Backup Plan can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:hbr/hanaBackupPlan:HanaBackupPlan example <plan_id>:<vault_id>:<cluster_id>
 * ```
 */
export class HanaBackupPlan extends pulumi.CustomResource {
    /**
     * Get an existing HanaBackupPlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HanaBackupPlanState, opts?: pulumi.CustomResourceOptions): HanaBackupPlan {
        return new HanaBackupPlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:hbr/hanaBackupPlan:HanaBackupPlan';

    /**
     * Returns true if the given object is an instance of HanaBackupPlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HanaBackupPlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HanaBackupPlan.__pulumiType;
    }

    /**
     * The backup prefix.
     */
    public readonly backupPrefix!: pulumi.Output<string | undefined>;
    /**
     * The backup type. Valid values:
     * - `COMPLETE`: full backup.
     * - `INCREMENTAL`: incremental backup.
     * - `DIFFERENTIAL`: differential backup.
     */
    public readonly backupType!: pulumi.Output<string>;
    /**
     * The ID of the SAP HANA instance.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The name of the database.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * The id of the plan.
     */
    public /*out*/ readonly planId!: pulumi.Output<string>;
    /**
     * The name of the backup plan.
     */
    public readonly planName!: pulumi.Output<string>;
    /**
     * The resource attribute field that represents the resource group ID.
     */
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;
    /**
     * The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
     */
    public readonly schedule!: pulumi.Output<string>;
    /**
     * The status of the resource. Valid values: `Enabled`, `Disabled`.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The ID of the backup vault.
     */
    public readonly vaultId!: pulumi.Output<string>;

    /**
     * Create a HanaBackupPlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HanaBackupPlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HanaBackupPlanArgs | HanaBackupPlanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HanaBackupPlanState | undefined;
            resourceInputs["backupPrefix"] = state ? state.backupPrefix : undefined;
            resourceInputs["backupType"] = state ? state.backupType : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["planId"] = state ? state.planId : undefined;
            resourceInputs["planName"] = state ? state.planName : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vaultId"] = state ? state.vaultId : undefined;
        } else {
            const args = argsOrState as HanaBackupPlanArgs | undefined;
            if ((!args || args.backupType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backupType'");
            }
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            if ((!args || args.planName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'planName'");
            }
            if ((!args || args.schedule === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schedule'");
            }
            if ((!args || args.vaultId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vaultId'");
            }
            resourceInputs["backupPrefix"] = args ? args.backupPrefix : undefined;
            resourceInputs["backupType"] = args ? args.backupType : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["planName"] = args ? args.planName : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["vaultId"] = args ? args.vaultId : undefined;
            resourceInputs["planId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HanaBackupPlan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HanaBackupPlan resources.
 */
export interface HanaBackupPlanState {
    /**
     * The backup prefix.
     */
    backupPrefix?: pulumi.Input<string>;
    /**
     * The backup type. Valid values:
     * - `COMPLETE`: full backup.
     * - `INCREMENTAL`: incremental backup.
     * - `DIFFERENTIAL`: differential backup.
     */
    backupType?: pulumi.Input<string>;
    /**
     * The ID of the SAP HANA instance.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The name of the database.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * The id of the plan.
     */
    planId?: pulumi.Input<string>;
    /**
     * The name of the backup plan.
     */
    planName?: pulumi.Input<string>;
    /**
     * The resource attribute field that represents the resource group ID.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
     */
    schedule?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Enabled`, `Disabled`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the backup vault.
     */
    vaultId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HanaBackupPlan resource.
 */
export interface HanaBackupPlanArgs {
    /**
     * The backup prefix.
     */
    backupPrefix?: pulumi.Input<string>;
    /**
     * The backup type. Valid values:
     * - `COMPLETE`: full backup.
     * - `INCREMENTAL`: incremental backup.
     * - `DIFFERENTIAL`: differential backup.
     */
    backupType: pulumi.Input<string>;
    /**
     * The ID of the SAP HANA instance.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name of the database.
     */
    databaseName: pulumi.Input<string>;
    /**
     * The name of the backup plan.
     */
    planName: pulumi.Input<string>;
    /**
     * The resource attribute field that represents the resource group ID.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
     */
    schedule: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Enabled`, `Disabled`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the backup vault.
     */
    vaultId: pulumi.Input<string>;
}
