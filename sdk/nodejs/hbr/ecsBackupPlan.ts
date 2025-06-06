// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a HBR Ecs Backup Plan resource.
 *
 * For information about HBR Ecs Backup Plan and how to use it, see [What is Ecs Backup Plan](https://www.alibabacloud.com/help/doc-detail/186574.htm).
 *
 * > **NOTE:** Available since v1.132.0.
 *
 * > **NOTE:** Deprecated since v1.249.0.
 *
 * > **DEPRECATED:** This resource has been deprecated from version `1.249.0`. Please use new resource alicloud.hbr.Policy and alicloud_hbr_policy_binding.
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
 * const example = alicloud.getZones({
 *     availableResourceCreation: "Instance",
 * });
 * const exampleGetInstanceTypes = example.then(example => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: example.zones?.[0]?.id,
 *     cpuCoreCount: 1,
 *     memorySize: 2,
 * }));
 * const exampleGetImages = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_18.*64",
 *     owners: "system",
 * });
 * const exampleNetwork = new alicloud.vpc.Network("example", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 * });
 * const exampleSwitch = new alicloud.vpc.Switch("example", {
 *     vswitchName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 *     vpcId: exampleNetwork.id,
 *     zoneId: example.then(example => example.zones?.[0]?.id),
 * });
 * const exampleSecurityGroup = new alicloud.ecs.SecurityGroup("example", {
 *     name: "terraform-example",
 *     vpcId: exampleNetwork.id,
 * });
 * const exampleInstance = new alicloud.ecs.Instance("example", {
 *     imageId: exampleGetImages.then(exampleGetImages => exampleGetImages.images?.[0]?.id),
 *     instanceType: exampleGetInstanceTypes.then(exampleGetInstanceTypes => exampleGetInstanceTypes.instanceTypes?.[0]?.id),
 *     availabilityZone: example.then(example => example.zones?.[0]?.id),
 *     securityGroups: [exampleSecurityGroup.id],
 *     instanceName: "terraform-example",
 *     internetChargeType: "PayByBandwidth",
 *     vswitchId: exampleSwitch.id,
 * });
 * const _default = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const exampleVault = new alicloud.hbr.Vault("example", {vaultName: `terraform-example-${_default.result}`});
 * const exampleEcsBackupPlan = new alicloud.hbr.EcsBackupPlan("example", {
 *     ecsBackupPlanName: "terraform-example",
 *     instanceId: exampleInstance.id,
 *     vaultId: exampleVault.id,
 *     retention: "1",
 *     schedule: "I|1602673264|PT2H",
 *     backupType: "COMPLETE",
 *     speedLimit: "0:24:5120",
 *     paths: [
 *         "/home",
 *         "/var",
 *     ],
 *     exclude: "  [\"/home/exclude\"]\n",
 *     include: "  [\"/home/include\"]\n",
 * });
 * ```
 *
 * ## Notice
 *
 * **About Backup path rules:**
 * 1. If there is no wildcard `*`, you can enter 8 items of path.
 * 2. When using wildcard `*`, only one item of path can be input, and wildcards like `/*&#47;*` are supported.
 * 3. Each item of path only supports absolute paths, for example starting with `/`, `\`, `C:\`, `D:\`.
 *
 * **About Restrictions:**
 * 1. When using `VSS`: multiple paths, UNC paths, wildcards, and excluded files not supported.
 * 2. When using `UNC`: VSS not supported, wildcards not supported, and files to be excluded are not supported.
 *
 * **About include/exclude path rules:**
 * 1. Supports up to 8 paths, including paths using wildcards `*`.
 * 2. If the path does not contain `/`, then `*` matches multiple path names or file names, for example `*abc*` will match `/abc/`, `/d/eabcd/`, `/a/abc`; `*.txt` will match all files with an extension `.txt`.
 * 3. If the path contains `/`, each `*` only matches a single-level path or file name. For example, `/a/*&#47;*&#47;` share will match `/a/b/c/share`, but not `/a/d/share`.
 * 4. If the path ends with `/`, it means the folder matches. For example, `*tmp/` will match `/a/b/aaatmp/`, `/tmp/` and so on.
 * 5. The path separator takes Linux system `/` as an example, if it is Windows system, please replace it with `\`.
 *
 * ## Import
 *
 * HBR Ecs Backup Plan can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:hbr/ecsBackupPlan:EcsBackupPlan example <id>
 * ```
 */
export class EcsBackupPlan extends pulumi.CustomResource {
    /**
     * Get an existing EcsBackupPlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EcsBackupPlanState, opts?: pulumi.CustomResourceOptions): EcsBackupPlan {
        return new EcsBackupPlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:hbr/ecsBackupPlan:EcsBackupPlan';

    /**
     * Returns true if the given object is an instance of EcsBackupPlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EcsBackupPlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EcsBackupPlan.__pulumiType;
    }

    /**
     * Backup type. Valid values: `COMPLETE`.
     */
    public readonly backupType!: pulumi.Output<string>;
    /**
     * The role name created in the original account RAM backup by the cross account managed by the current account.
     */
    public readonly crossAccountRoleName!: pulumi.Output<string | undefined>;
    /**
     * The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
     */
    public readonly crossAccountType!: pulumi.Output<string>;
    /**
     * The original account ID of the cross account backup managed by the current account.
     */
    public readonly crossAccountUserId!: pulumi.Output<number | undefined>;
    /**
     * The detail of the backup plan.
     */
    public readonly detail!: pulumi.Output<string | undefined>;
    /**
     * Whether to disable the backup task. Valid values: `true`, `false`.
     */
    public readonly disabled!: pulumi.Output<boolean>;
    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     */
    public readonly ecsBackupPlanName!: pulumi.Output<string>;
    /**
     * Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
     */
    public readonly exclude!: pulumi.Output<string | undefined>;
    /**
     * Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
     */
    public readonly include!: pulumi.Output<string | undefined>;
    /**
     * The ID of ECS instance. The ecs backup client must have been installed on the host.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
     */
    public readonly options!: pulumi.Output<string | undefined>;
    /**
     * List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
     */
    public readonly paths!: pulumi.Output<string[] | undefined>;
    /**
     * Backup retention days, the minimum is 1.
     */
    public readonly retention!: pulumi.Output<string>;
    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * * `startTime` Backup start time, UNIX time seconds.
     */
    public readonly schedule!: pulumi.Output<string>;
    /**
     * Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
     */
    public readonly speedLimit!: pulumi.Output<string | undefined>;
    /**
     * Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
     *
     * @deprecated Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
     */
    public readonly updatePaths!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of Backup vault.
     */
    public readonly vaultId!: pulumi.Output<string>;

    /**
     * Create a EcsBackupPlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EcsBackupPlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EcsBackupPlanArgs | EcsBackupPlanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EcsBackupPlanState | undefined;
            resourceInputs["backupType"] = state ? state.backupType : undefined;
            resourceInputs["crossAccountRoleName"] = state ? state.crossAccountRoleName : undefined;
            resourceInputs["crossAccountType"] = state ? state.crossAccountType : undefined;
            resourceInputs["crossAccountUserId"] = state ? state.crossAccountUserId : undefined;
            resourceInputs["detail"] = state ? state.detail : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["ecsBackupPlanName"] = state ? state.ecsBackupPlanName : undefined;
            resourceInputs["exclude"] = state ? state.exclude : undefined;
            resourceInputs["include"] = state ? state.include : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["paths"] = state ? state.paths : undefined;
            resourceInputs["retention"] = state ? state.retention : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["speedLimit"] = state ? state.speedLimit : undefined;
            resourceInputs["updatePaths"] = state ? state.updatePaths : undefined;
            resourceInputs["vaultId"] = state ? state.vaultId : undefined;
        } else {
            const args = argsOrState as EcsBackupPlanArgs | undefined;
            if ((!args || args.backupType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backupType'");
            }
            if ((!args || args.ecsBackupPlanName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ecsBackupPlanName'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.retention === undefined) && !opts.urn) {
                throw new Error("Missing required property 'retention'");
            }
            if ((!args || args.schedule === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schedule'");
            }
            if ((!args || args.vaultId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vaultId'");
            }
            resourceInputs["backupType"] = args ? args.backupType : undefined;
            resourceInputs["crossAccountRoleName"] = args ? args.crossAccountRoleName : undefined;
            resourceInputs["crossAccountType"] = args ? args.crossAccountType : undefined;
            resourceInputs["crossAccountUserId"] = args ? args.crossAccountUserId : undefined;
            resourceInputs["detail"] = args ? args.detail : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["ecsBackupPlanName"] = args ? args.ecsBackupPlanName : undefined;
            resourceInputs["exclude"] = args ? args.exclude : undefined;
            resourceInputs["include"] = args ? args.include : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["paths"] = args ? args.paths : undefined;
            resourceInputs["retention"] = args ? args.retention : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["speedLimit"] = args ? args.speedLimit : undefined;
            resourceInputs["updatePaths"] = args ? args.updatePaths : undefined;
            resourceInputs["vaultId"] = args ? args.vaultId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EcsBackupPlan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EcsBackupPlan resources.
 */
export interface EcsBackupPlanState {
    /**
     * Backup type. Valid values: `COMPLETE`.
     */
    backupType?: pulumi.Input<string>;
    /**
     * The role name created in the original account RAM backup by the cross account managed by the current account.
     */
    crossAccountRoleName?: pulumi.Input<string>;
    /**
     * The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
     */
    crossAccountType?: pulumi.Input<string>;
    /**
     * The original account ID of the cross account backup managed by the current account.
     */
    crossAccountUserId?: pulumi.Input<number>;
    /**
     * The detail of the backup plan.
     */
    detail?: pulumi.Input<string>;
    /**
     * Whether to disable the backup task. Valid values: `true`, `false`.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     */
    ecsBackupPlanName?: pulumi.Input<string>;
    /**
     * Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
     */
    exclude?: pulumi.Input<string>;
    /**
     * Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
     */
    include?: pulumi.Input<string>;
    /**
     * The ID of ECS instance. The ecs backup client must have been installed on the host.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
     */
    options?: pulumi.Input<string>;
    /**
     * List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
     */
    paths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Backup retention days, the minimum is 1.
     */
    retention?: pulumi.Input<string>;
    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * * `startTime` Backup start time, UNIX time seconds.
     */
    schedule?: pulumi.Input<string>;
    /**
     * Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
     */
    speedLimit?: pulumi.Input<string>;
    /**
     * Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
     *
     * @deprecated Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
     */
    updatePaths?: pulumi.Input<boolean>;
    /**
     * The ID of Backup vault.
     */
    vaultId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EcsBackupPlan resource.
 */
export interface EcsBackupPlanArgs {
    /**
     * Backup type. Valid values: `COMPLETE`.
     */
    backupType: pulumi.Input<string>;
    /**
     * The role name created in the original account RAM backup by the cross account managed by the current account.
     */
    crossAccountRoleName?: pulumi.Input<string>;
    /**
     * The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
     */
    crossAccountType?: pulumi.Input<string>;
    /**
     * The original account ID of the cross account backup managed by the current account.
     */
    crossAccountUserId?: pulumi.Input<number>;
    /**
     * The detail of the backup plan.
     */
    detail?: pulumi.Input<string>;
    /**
     * Whether to disable the backup task. Valid values: `true`, `false`.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     */
    ecsBackupPlanName: pulumi.Input<string>;
    /**
     * Exclude path. String of Json list, up to 255 characters. e.g. `"[\"/home/work\"]"`
     */
    exclude?: pulumi.Input<string>;
    /**
     * Include path. String of Json list, up to 255 characters. e.g. `"[\"/var\"]"`
     */
    include?: pulumi.Input<string>;
    /**
     * The ID of ECS instance. The ecs backup client must have been installed on the host.
     */
    instanceId: pulumi.Input<string>;
    /**
     * Windows operating system with application consistency using VSS, e.g: `{\"UseVSS\":false}`.
     */
    options?: pulumi.Input<string>;
    /**
     * List of backup path. e.g. `["/home", "/var"]`. **Note** If `path` is empty, it means that all directories will be backed up.
     */
    paths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Backup retention days, the minimum is 1.
     */
    retention: pulumi.Input<string>;
    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * * `startTime` Backup start time, UNIX time seconds.
     */
    schedule: pulumi.Input<string>;
    /**
     * Flow control. The format is: `{start}|{end}|{bandwidth}`. Use `|` to separate multiple flow control configurations, multiple flow control configurations not allowed to have overlapping times.
     */
    speedLimit?: pulumi.Input<string>;
    /**
     * Attribute updatePaths has been deprecated in v1.139.0+, and you do not need to set it anymore.
     *
     * @deprecated Attribute updatePaths has been deprecated in v1.139.0+ and you do not need to set it anymore.
     */
    updatePaths?: pulumi.Input<boolean>;
    /**
     * The ID of Backup vault.
     */
    vaultId: pulumi.Input<string>;
}
