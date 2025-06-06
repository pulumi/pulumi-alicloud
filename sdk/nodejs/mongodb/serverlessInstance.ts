// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a MongoDB Serverless Instance resource.
 *
 * For information about MongoDB Serverless Instance and how to use it, see [What is Serverless Instance](https://www.alibabacloud.com/help/doc-detail/26558.html).
 *
 * > **NOTE:** Deprecated since v1.214.0.
 *
 * > **DEPRECATED:**  This resource has been deprecated from version `1.214.0`.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.mongodb.getZones({});
 * const defaultGetNetworks = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultGetSwitches = Promise.all([defaultGetNetworks, _default]).then(([defaultGetNetworks, _default]) => alicloud.vpc.getSwitches({
 *     vpcId: defaultGetNetworks.ids?.[0],
 *     zoneId: _default.zones?.[0]?.id,
 * }));
 * const defaultGetResourceGroups = alicloud.resourcemanager.getResourceGroups({});
 * const example = new alicloud.mongodb.ServerlessInstance("example", {
 *     accountPassword: "Abc12345",
 *     dbInstanceDescription: "example_value",
 *     dbInstanceStorage: 5,
 *     storageEngine: "WiredTiger",
 *     capacityUnit: 100,
 *     engine: "MongoDB",
 *     resourceGroupId: defaultGetResourceGroups.then(defaultGetResourceGroups => defaultGetResourceGroups.groups?.[0]?.id),
 *     engineVersion: "4.2",
 *     period: 1,
 *     periodPriceType: "Month",
 *     vpcId: defaultGetNetworks.then(defaultGetNetworks => defaultGetNetworks.ids?.[0]),
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchId: defaultGetSwitches.then(defaultGetSwitches => defaultGetSwitches.ids?.[0]),
 *     tags: {
 *         Created: "MongodbServerlessInstance",
 *         For: "TF",
 *     },
 *     securityIpGroups: [{
 *         securityIpGroupAttribute: "example_value",
 *         securityIpGroupName: "example_value",
 *         securityIpList: "192.168.0.1",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * MongoDB Serverless Instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:mongodb/serverlessInstance:ServerlessInstance example <id>
 * ```
 */
export class ServerlessInstance extends pulumi.CustomResource {
    /**
     * Get an existing ServerlessInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerlessInstanceState, opts?: pulumi.CustomResourceOptions): ServerlessInstance {
        return new ServerlessInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:mongodb/serverlessInstance:ServerlessInstance';

    /**
     * Returns true if the given object is an instance of ServerlessInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerlessInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerlessInstance.__pulumiType;
    }

    /**
     * The password of the database logon account.
     * * The password length is `8` to `32` bits.
     * * The password consists of at least any three of uppercase letters, lowercase letters, numbers, and special characters. The special character is `!#$%^&*()_+-=`. The MongoDB Serverless instance provides a default database login account. This account cannot be modified. You can only set or modify the password for this account.
     */
    public readonly accountPassword!: pulumi.Output<string>;
    /**
     * Set whether the instance is automatically renewed.
     */
    public readonly autoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * The I/O throughput consumed by the instance. Valid values: `100` to `8000`.
     */
    public readonly capacityUnit!: pulumi.Output<number>;
    /**
     * The db instance description.
     */
    public readonly dbInstanceDescription!: pulumi.Output<string | undefined>;
    /**
     * The db instance storage. Valid values: `1` to `100`.
     */
    public readonly dbInstanceStorage!: pulumi.Output<number>;
    /**
     * The database engine of the instance. Valid values: `MongoDB`.
     */
    public readonly engine!: pulumi.Output<string>;
    /**
     * The database version number. Valid values: `4.2`.
     */
    public readonly engineVersion!: pulumi.Output<string>;
    /**
     * The end time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC. **NOTE:** The difference between the start time and end time must be one hour. For example, if `maintainStartTime` is `01:00Z`, `maintainEndTime` must be `02:00Z`.
     */
    public readonly maintainEndTime!: pulumi.Output<string>;
    /**
     * The start time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC.
     */
    public readonly maintainStartTime!: pulumi.Output<string>;
    /**
     * The purchase duration of the instance, in months. Valid values: `1` to `9`, `12`, `24`, `36`, `60`.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The period price type. Valid values: `Day`, `Month`.
     */
    public readonly periodPriceType!: pulumi.Output<string | undefined>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * An array that consists of the information of IP whitelists.
     */
    public readonly securityIpGroups!: pulumi.Output<outputs.mongodb.ServerlessInstanceSecurityIpGroup[] | undefined>;
    /**
     * The instance status. For more information, see the instance Status Table.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The storage engine used by the instance. Valid values: `WiredTiger`.
     */
    public readonly storageEngine!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The ID of the VPC network.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The of the vswitch.
     */
    public readonly vswitchId!: pulumi.Output<string>;
    /**
     * The ID of the zone. Use this parameter to specify the zone created by the instance.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ServerlessInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerlessInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerlessInstanceArgs | ServerlessInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerlessInstanceState | undefined;
            resourceInputs["accountPassword"] = state ? state.accountPassword : undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["capacityUnit"] = state ? state.capacityUnit : undefined;
            resourceInputs["dbInstanceDescription"] = state ? state.dbInstanceDescription : undefined;
            resourceInputs["dbInstanceStorage"] = state ? state.dbInstanceStorage : undefined;
            resourceInputs["engine"] = state ? state.engine : undefined;
            resourceInputs["engineVersion"] = state ? state.engineVersion : undefined;
            resourceInputs["maintainEndTime"] = state ? state.maintainEndTime : undefined;
            resourceInputs["maintainStartTime"] = state ? state.maintainStartTime : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["periodPriceType"] = state ? state.periodPriceType : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["securityIpGroups"] = state ? state.securityIpGroups : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["storageEngine"] = state ? state.storageEngine : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ServerlessInstanceArgs | undefined;
            if ((!args || args.accountPassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountPassword'");
            }
            if ((!args || args.capacityUnit === undefined) && !opts.urn) {
                throw new Error("Missing required property 'capacityUnit'");
            }
            if ((!args || args.dbInstanceStorage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstanceStorage'");
            }
            if ((!args || args.engineVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'engineVersion'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["accountPassword"] = args?.accountPassword ? pulumi.secret(args.accountPassword) : undefined;
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["capacityUnit"] = args ? args.capacityUnit : undefined;
            resourceInputs["dbInstanceDescription"] = args ? args.dbInstanceDescription : undefined;
            resourceInputs["dbInstanceStorage"] = args ? args.dbInstanceStorage : undefined;
            resourceInputs["engine"] = args ? args.engine : undefined;
            resourceInputs["engineVersion"] = args ? args.engineVersion : undefined;
            resourceInputs["maintainEndTime"] = args ? args.maintainEndTime : undefined;
            resourceInputs["maintainStartTime"] = args ? args.maintainStartTime : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["periodPriceType"] = args ? args.periodPriceType : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["securityIpGroups"] = args ? args.securityIpGroups : undefined;
            resourceInputs["storageEngine"] = args ? args.storageEngine : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["accountPassword"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ServerlessInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerlessInstance resources.
 */
export interface ServerlessInstanceState {
    /**
     * The password of the database logon account.
     * * The password length is `8` to `32` bits.
     * * The password consists of at least any three of uppercase letters, lowercase letters, numbers, and special characters. The special character is `!#$%^&*()_+-=`. The MongoDB Serverless instance provides a default database login account. This account cannot be modified. You can only set or modify the password for this account.
     */
    accountPassword?: pulumi.Input<string>;
    /**
     * Set whether the instance is automatically renewed.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The I/O throughput consumed by the instance. Valid values: `100` to `8000`.
     */
    capacityUnit?: pulumi.Input<number>;
    /**
     * The db instance description.
     */
    dbInstanceDescription?: pulumi.Input<string>;
    /**
     * The db instance storage. Valid values: `1` to `100`.
     */
    dbInstanceStorage?: pulumi.Input<number>;
    /**
     * The database engine of the instance. Valid values: `MongoDB`.
     */
    engine?: pulumi.Input<string>;
    /**
     * The database version number. Valid values: `4.2`.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * The end time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC. **NOTE:** The difference between the start time and end time must be one hour. For example, if `maintainStartTime` is `01:00Z`, `maintainEndTime` must be `02:00Z`.
     */
    maintainEndTime?: pulumi.Input<string>;
    /**
     * The start time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC.
     */
    maintainStartTime?: pulumi.Input<string>;
    /**
     * The purchase duration of the instance, in months. Valid values: `1` to `9`, `12`, `24`, `36`, `60`.
     */
    period?: pulumi.Input<number>;
    /**
     * The period price type. Valid values: `Day`, `Month`.
     */
    periodPriceType?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * An array that consists of the information of IP whitelists.
     */
    securityIpGroups?: pulumi.Input<pulumi.Input<inputs.mongodb.ServerlessInstanceSecurityIpGroup>[]>;
    /**
     * The instance status. For more information, see the instance Status Table.
     */
    status?: pulumi.Input<string>;
    /**
     * The storage engine used by the instance. Valid values: `WiredTiger`.
     */
    storageEngine?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the VPC network.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The of the vswitch.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The ID of the zone. Use this parameter to specify the zone created by the instance.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerlessInstance resource.
 */
export interface ServerlessInstanceArgs {
    /**
     * The password of the database logon account.
     * * The password length is `8` to `32` bits.
     * * The password consists of at least any three of uppercase letters, lowercase letters, numbers, and special characters. The special character is `!#$%^&*()_+-=`. The MongoDB Serverless instance provides a default database login account. This account cannot be modified. You can only set or modify the password for this account.
     */
    accountPassword: pulumi.Input<string>;
    /**
     * Set whether the instance is automatically renewed.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The I/O throughput consumed by the instance. Valid values: `100` to `8000`.
     */
    capacityUnit: pulumi.Input<number>;
    /**
     * The db instance description.
     */
    dbInstanceDescription?: pulumi.Input<string>;
    /**
     * The db instance storage. Valid values: `1` to `100`.
     */
    dbInstanceStorage: pulumi.Input<number>;
    /**
     * The database engine of the instance. Valid values: `MongoDB`.
     */
    engine?: pulumi.Input<string>;
    /**
     * The database version number. Valid values: `4.2`.
     */
    engineVersion: pulumi.Input<string>;
    /**
     * The end time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC. **NOTE:** The difference between the start time and end time must be one hour. For example, if `maintainStartTime` is `01:00Z`, `maintainEndTime` must be `02:00Z`.
     */
    maintainEndTime?: pulumi.Input<string>;
    /**
     * The start time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC.
     */
    maintainStartTime?: pulumi.Input<string>;
    /**
     * The purchase duration of the instance, in months. Valid values: `1` to `9`, `12`, `24`, `36`, `60`.
     */
    period?: pulumi.Input<number>;
    /**
     * The period price type. Valid values: `Day`, `Month`.
     */
    periodPriceType?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * An array that consists of the information of IP whitelists.
     */
    securityIpGroups?: pulumi.Input<pulumi.Input<inputs.mongodb.ServerlessInstanceSecurityIpGroup>[]>;
    /**
     * The storage engine used by the instance. Valid values: `WiredTiger`.
     */
    storageEngine?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the VPC network.
     */
    vpcId: pulumi.Input<string>;
    /**
     * The of the vswitch.
     */
    vswitchId: pulumi.Input<string>;
    /**
     * The ID of the zone. Use this parameter to specify the zone created by the instance.
     */
    zoneId: pulumi.Input<string>;
}
