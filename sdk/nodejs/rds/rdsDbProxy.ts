// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Information about RDS database exclusive agent and its usage, see [What is RDS DB Proxy](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-modifydbproxy).
 *
 * > **NOTE:** Available since v1.193.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const _default = alicloud.rds.getZones({
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 * });
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
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("default", {
 *     name: name,
 *     vpcId: defaultNetwork.id,
 * });
 * const defaultInstance = new alicloud.rds.Instance("default", {
 *     engine: "MySQL",
 *     engineVersion: "5.7",
 *     instanceType: "rds.mysql.c1.large",
 *     instanceStorage: 20,
 *     instanceChargeType: "Postpaid",
 *     instanceName: name,
 *     vswitchId: defaultSwitch.id,
 *     dbInstanceStorageType: "local_ssd",
 * });
 * const defaultReadOnlyInstance = new alicloud.rds.ReadOnlyInstance("default", {
 *     zoneId: defaultInstance.zoneId,
 *     masterDbInstanceId: defaultInstance.id,
 *     engineVersion: defaultInstance.engineVersion,
 *     instanceStorage: defaultInstance.instanceStorage,
 *     instanceType: defaultInstance.instanceType,
 *     instanceName: `${name}readonly`,
 *     vswitchId: defaultSwitch.id,
 * });
 * const defaultRdsDbProxy = new alicloud.rds.RdsDbProxy("default", {
 *     instanceId: defaultInstance.id,
 *     instanceNetworkType: "VPC",
 *     vpcId: defaultInstance.vpcId,
 *     vswitchId: defaultInstance.vswitchId,
 *     dbProxyInstanceNum: 2,
 *     dbProxyConnectionPrefix: "example",
 *     dbProxyConnectStringPort: 3306,
 *     dbProxyEndpointReadWriteMode: "ReadWrite",
 *     readOnlyInstanceMaxDelayTime: 90,
 *     dbProxyFeatures: "TransactionReadSqlRouteOptimizeStatus:1;ConnectionPersist:1;ReadWriteSpliting:1",
 *     readOnlyInstanceDistributionType: "Custom",
 *     readOnlyInstanceWeights: [
 *         {
 *             instanceId: defaultInstance.id,
 *             weight: "100",
 *         },
 *         {
 *             instanceId: defaultReadOnlyInstance.id,
 *             weight: "500",
 *         },
 *     ],
 * });
 * ```
 *
 * > **NOTE:** Resource `alicloud.rds.RdsDbProxy` should be created after `alicloud.rds.ReadOnlyInstance`, so the `dependsOn` statement is necessary.
 *
 * ## Import
 *
 * RDS database proxy feature can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:rds/rdsDbProxy:RdsDbProxy example abc12345678
 * ```
 */
export class RdsDbProxy extends pulumi.CustomResource {
    /**
     * Get an existing RdsDbProxy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RdsDbProxyState, opts?: pulumi.CustomResourceOptions): RdsDbProxy {
        return new RdsDbProxy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rds/rdsDbProxy:RdsDbProxy';

    /**
     * Returns true if the given object is an instance of RdsDbProxy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RdsDbProxy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RdsDbProxy.__pulumiType;
    }

    /**
     * The port number that is associated with the proxy endpoint.
     */
    public readonly dbProxyConnectStringPort!: pulumi.Output<number>;
    /**
     * The new prefix of the proxy endpoint. Enter a prefix.
     */
    public readonly dbProxyConnectionPrefix!: pulumi.Output<string>;
    /**
     * Connection instance string.
     */
    public /*out*/ readonly dbProxyConnectionString!: pulumi.Output<string>;
    /**
     * Remarks of agent terminal.
     */
    public /*out*/ readonly dbProxyEndpointAliases!: pulumi.Output<string>;
    /**
     * Proxy connection address ID.
     */
    public /*out*/ readonly dbProxyEndpointId!: pulumi.Output<string>;
    /**
     * The read and write attributes of the proxy terminal. Valid values:
     * - ReadWrite: The proxy terminal connects to the primary instance and can receive both read and write requests.
     * - ReadOnly: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.
     *
     * > **NOTE:** Note This setting causes your instance to restart. Proceed with caution.
     */
    public readonly dbProxyEndpointReadWriteMode!: pulumi.Output<string>;
    /**
     * The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: Feature 1:Status;Feature 2:Status;.... Do not add a semicolon (;) at the end of the last value. Valid feature values:
     * - ReadWriteSpliting: read/write splitting.
     * - ConnectionPersist: connection pooling.
     * - TransactionReadSqlRouteOptimizeStatus: transaction splitting.
     * Valid status values:
     * - 1: enabled.
     * - 0: disabled.
     *
     * > **NOTE:** Note You must specify this parameter only when the read/write splitting feature is enabled.
     */
    public readonly dbProxyFeatures!: pulumi.Output<string>;
    /**
     * The number of proxy instances that are enabled. Valid values: 1 to 60.
     */
    public readonly dbProxyInstanceNum!: pulumi.Output<number>;
    /**
     * The database proxy type. Valid values:
     * - common: universal proxy.
     * - exclusive: Exclusive proxy (default).
     */
    public readonly dbProxyInstanceType!: pulumi.Output<string>;
    /**
     * The SSL configuration setting that you want to apply on the instance. Valid values:
     * - Close: disables SSL encryption.
     * - Open: enables SSL encryption or modifies the endpoint that requires SSL encryption.
     * - Update: updates the validity period of the SSL certificate.
     */
    public readonly dbProxySslEnabled!: pulumi.Output<string>;
    /**
     * The point in time at which you want to apply the new database proxy settings. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    public readonly effectiveSpecificTime!: pulumi.Output<string>;
    /**
     * When modifying the number of proxy instances,The time when you want to apply the new database proxy settings.Valid values:
     * - Immediate: ApsaraDB RDS immediately applies the new settings.
     * - MaintainTime: ApsaraDB RDS applies the new settings during the maintenance window that you specified. For more information, see Modify the maintenance window.
     * - SpecificTime: ApsaraDB RDS applies the new settings at a specified point in time.
     *
     * > **NOTE:** Note If you set the EffectiveTime parameter to SpecificTime, you must specify the EffectiveSpecificTime parameter.
     */
    public readonly effectiveTime!: pulumi.Output<string>;
    /**
     * The Id of instance that can run database.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The network type of the instance. Set the value to VPC.
     */
    public readonly instanceNetworkType!: pulumi.Output<string>;
    /**
     * Network type of proxy connection address.
     */
    public /*out*/ readonly netType!: pulumi.Output<string>;
    /**
     * The policy that is used to allocate read weights. Valid values:
     * - Standard: ApsaraDB RDS automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
     * - Custom: You must manually allocate read weights to the instance and its read-only instances.
     *
     * > **NOTE:** Note If you set the ReadOnlyInstanceDistributionType parameter to Custom, you must specify the ReadOnlyInstanceWeight parameter.
     */
    public readonly readOnlyInstanceDistributionType!: pulumi.Output<string>;
    /**
     * The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, ApsaraDB RDS no longer forwards read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained. Unit: seconds. Valid values: 0 to 3600.
     *
     * > **NOTE:** Note If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by ReadWriteSpliting.
     */
    public readonly readOnlyInstanceMaxDelayTime!: pulumi.Output<number>;
    /**
     * A list of the read weights of the instance and its read-only instances.  It contains two sub-fields(instance_id and weight). Read weights increase in increments of 100, and the maximum read weight is 10000. See `readOnlyInstanceWeight` below.
     */
    public readonly readOnlyInstanceWeights!: pulumi.Output<outputs.rds.RdsDbProxyReadOnlyInstanceWeight[]>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The time when the certificate expires.
     */
    public /*out*/ readonly sslExpiredTime!: pulumi.Output<string>;
    /**
     * The point in time at which you want to upgrade the database proxy version of the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    public readonly switchTime!: pulumi.Output<string | undefined>;
    /**
     * The time when you want to upgrade the database proxy version of the instance. Valid values:
     * - MaintainTime: ApsaraDB RDS performs the upgrade during the maintenance window that you specified. This is the default value. For more information, see Modify the maintenance window.
     * - Immediate: ApsaraDB RDS immediately performs the upgrade.
     * - SpecificTime: ApsaraDB RDS performs the upgrade at a specified point in time.
     */
    public readonly upgradeTime!: pulumi.Output<string | undefined>;
    /**
     * The ID of the virtual private cloud (VPC) to which the instance belongs.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The ID of the vSwitch that is associated with the specified VPC.
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a RdsDbProxy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RdsDbProxyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RdsDbProxyArgs | RdsDbProxyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RdsDbProxyState | undefined;
            resourceInputs["dbProxyConnectStringPort"] = state ? state.dbProxyConnectStringPort : undefined;
            resourceInputs["dbProxyConnectionPrefix"] = state ? state.dbProxyConnectionPrefix : undefined;
            resourceInputs["dbProxyConnectionString"] = state ? state.dbProxyConnectionString : undefined;
            resourceInputs["dbProxyEndpointAliases"] = state ? state.dbProxyEndpointAliases : undefined;
            resourceInputs["dbProxyEndpointId"] = state ? state.dbProxyEndpointId : undefined;
            resourceInputs["dbProxyEndpointReadWriteMode"] = state ? state.dbProxyEndpointReadWriteMode : undefined;
            resourceInputs["dbProxyFeatures"] = state ? state.dbProxyFeatures : undefined;
            resourceInputs["dbProxyInstanceNum"] = state ? state.dbProxyInstanceNum : undefined;
            resourceInputs["dbProxyInstanceType"] = state ? state.dbProxyInstanceType : undefined;
            resourceInputs["dbProxySslEnabled"] = state ? state.dbProxySslEnabled : undefined;
            resourceInputs["effectiveSpecificTime"] = state ? state.effectiveSpecificTime : undefined;
            resourceInputs["effectiveTime"] = state ? state.effectiveTime : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["instanceNetworkType"] = state ? state.instanceNetworkType : undefined;
            resourceInputs["netType"] = state ? state.netType : undefined;
            resourceInputs["readOnlyInstanceDistributionType"] = state ? state.readOnlyInstanceDistributionType : undefined;
            resourceInputs["readOnlyInstanceMaxDelayTime"] = state ? state.readOnlyInstanceMaxDelayTime : undefined;
            resourceInputs["readOnlyInstanceWeights"] = state ? state.readOnlyInstanceWeights : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["sslExpiredTime"] = state ? state.sslExpiredTime : undefined;
            resourceInputs["switchTime"] = state ? state.switchTime : undefined;
            resourceInputs["upgradeTime"] = state ? state.upgradeTime : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as RdsDbProxyArgs | undefined;
            if ((!args || args.dbProxyInstanceNum === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbProxyInstanceNum'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.instanceNetworkType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceNetworkType'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["dbProxyConnectStringPort"] = args ? args.dbProxyConnectStringPort : undefined;
            resourceInputs["dbProxyConnectionPrefix"] = args ? args.dbProxyConnectionPrefix : undefined;
            resourceInputs["dbProxyEndpointReadWriteMode"] = args ? args.dbProxyEndpointReadWriteMode : undefined;
            resourceInputs["dbProxyFeatures"] = args ? args.dbProxyFeatures : undefined;
            resourceInputs["dbProxyInstanceNum"] = args ? args.dbProxyInstanceNum : undefined;
            resourceInputs["dbProxyInstanceType"] = args ? args.dbProxyInstanceType : undefined;
            resourceInputs["dbProxySslEnabled"] = args ? args.dbProxySslEnabled : undefined;
            resourceInputs["effectiveSpecificTime"] = args ? args.effectiveSpecificTime : undefined;
            resourceInputs["effectiveTime"] = args ? args.effectiveTime : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["instanceNetworkType"] = args ? args.instanceNetworkType : undefined;
            resourceInputs["readOnlyInstanceDistributionType"] = args ? args.readOnlyInstanceDistributionType : undefined;
            resourceInputs["readOnlyInstanceMaxDelayTime"] = args ? args.readOnlyInstanceMaxDelayTime : undefined;
            resourceInputs["readOnlyInstanceWeights"] = args ? args.readOnlyInstanceWeights : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["switchTime"] = args ? args.switchTime : undefined;
            resourceInputs["upgradeTime"] = args ? args.upgradeTime : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["dbProxyConnectionString"] = undefined /*out*/;
            resourceInputs["dbProxyEndpointAliases"] = undefined /*out*/;
            resourceInputs["dbProxyEndpointId"] = undefined /*out*/;
            resourceInputs["netType"] = undefined /*out*/;
            resourceInputs["sslExpiredTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RdsDbProxy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RdsDbProxy resources.
 */
export interface RdsDbProxyState {
    /**
     * The port number that is associated with the proxy endpoint.
     */
    dbProxyConnectStringPort?: pulumi.Input<number>;
    /**
     * The new prefix of the proxy endpoint. Enter a prefix.
     */
    dbProxyConnectionPrefix?: pulumi.Input<string>;
    /**
     * Connection instance string.
     */
    dbProxyConnectionString?: pulumi.Input<string>;
    /**
     * Remarks of agent terminal.
     */
    dbProxyEndpointAliases?: pulumi.Input<string>;
    /**
     * Proxy connection address ID.
     */
    dbProxyEndpointId?: pulumi.Input<string>;
    /**
     * The read and write attributes of the proxy terminal. Valid values:
     * - ReadWrite: The proxy terminal connects to the primary instance and can receive both read and write requests.
     * - ReadOnly: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.
     *
     * > **NOTE:** Note This setting causes your instance to restart. Proceed with caution.
     */
    dbProxyEndpointReadWriteMode?: pulumi.Input<string>;
    /**
     * The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: Feature 1:Status;Feature 2:Status;.... Do not add a semicolon (;) at the end of the last value. Valid feature values:
     * - ReadWriteSpliting: read/write splitting.
     * - ConnectionPersist: connection pooling.
     * - TransactionReadSqlRouteOptimizeStatus: transaction splitting.
     * Valid status values:
     * - 1: enabled.
     * - 0: disabled.
     *
     * > **NOTE:** Note You must specify this parameter only when the read/write splitting feature is enabled.
     */
    dbProxyFeatures?: pulumi.Input<string>;
    /**
     * The number of proxy instances that are enabled. Valid values: 1 to 60.
     */
    dbProxyInstanceNum?: pulumi.Input<number>;
    /**
     * The database proxy type. Valid values:
     * - common: universal proxy.
     * - exclusive: Exclusive proxy (default).
     */
    dbProxyInstanceType?: pulumi.Input<string>;
    /**
     * The SSL configuration setting that you want to apply on the instance. Valid values:
     * - Close: disables SSL encryption.
     * - Open: enables SSL encryption or modifies the endpoint that requires SSL encryption.
     * - Update: updates the validity period of the SSL certificate.
     */
    dbProxySslEnabled?: pulumi.Input<string>;
    /**
     * The point in time at which you want to apply the new database proxy settings. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    effectiveSpecificTime?: pulumi.Input<string>;
    /**
     * When modifying the number of proxy instances,The time when you want to apply the new database proxy settings.Valid values:
     * - Immediate: ApsaraDB RDS immediately applies the new settings.
     * - MaintainTime: ApsaraDB RDS applies the new settings during the maintenance window that you specified. For more information, see Modify the maintenance window.
     * - SpecificTime: ApsaraDB RDS applies the new settings at a specified point in time.
     *
     * > **NOTE:** Note If you set the EffectiveTime parameter to SpecificTime, you must specify the EffectiveSpecificTime parameter.
     */
    effectiveTime?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The network type of the instance. Set the value to VPC.
     */
    instanceNetworkType?: pulumi.Input<string>;
    /**
     * Network type of proxy connection address.
     */
    netType?: pulumi.Input<string>;
    /**
     * The policy that is used to allocate read weights. Valid values:
     * - Standard: ApsaraDB RDS automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
     * - Custom: You must manually allocate read weights to the instance and its read-only instances.
     *
     * > **NOTE:** Note If you set the ReadOnlyInstanceDistributionType parameter to Custom, you must specify the ReadOnlyInstanceWeight parameter.
     */
    readOnlyInstanceDistributionType?: pulumi.Input<string>;
    /**
     * The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, ApsaraDB RDS no longer forwards read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained. Unit: seconds. Valid values: 0 to 3600.
     *
     * > **NOTE:** Note If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by ReadWriteSpliting.
     */
    readOnlyInstanceMaxDelayTime?: pulumi.Input<number>;
    /**
     * A list of the read weights of the instance and its read-only instances.  It contains two sub-fields(instance_id and weight). Read weights increase in increments of 100, and the maximum read weight is 10000. See `readOnlyInstanceWeight` below.
     */
    readOnlyInstanceWeights?: pulumi.Input<pulumi.Input<inputs.rds.RdsDbProxyReadOnlyInstanceWeight>[]>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The time when the certificate expires.
     */
    sslExpiredTime?: pulumi.Input<string>;
    /**
     * The point in time at which you want to upgrade the database proxy version of the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    switchTime?: pulumi.Input<string>;
    /**
     * The time when you want to upgrade the database proxy version of the instance. Valid values:
     * - MaintainTime: ApsaraDB RDS performs the upgrade during the maintenance window that you specified. This is the default value. For more information, see Modify the maintenance window.
     * - Immediate: ApsaraDB RDS immediately performs the upgrade.
     * - SpecificTime: ApsaraDB RDS performs the upgrade at a specified point in time.
     */
    upgradeTime?: pulumi.Input<string>;
    /**
     * The ID of the virtual private cloud (VPC) to which the instance belongs.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The ID of the vSwitch that is associated with the specified VPC.
     */
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RdsDbProxy resource.
 */
export interface RdsDbProxyArgs {
    /**
     * The port number that is associated with the proxy endpoint.
     */
    dbProxyConnectStringPort?: pulumi.Input<number>;
    /**
     * The new prefix of the proxy endpoint. Enter a prefix.
     */
    dbProxyConnectionPrefix?: pulumi.Input<string>;
    /**
     * The read and write attributes of the proxy terminal. Valid values:
     * - ReadWrite: The proxy terminal connects to the primary instance and can receive both read and write requests.
     * - ReadOnly: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.
     *
     * > **NOTE:** Note This setting causes your instance to restart. Proceed with caution.
     */
    dbProxyEndpointReadWriteMode?: pulumi.Input<string>;
    /**
     * The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: Feature 1:Status;Feature 2:Status;.... Do not add a semicolon (;) at the end of the last value. Valid feature values:
     * - ReadWriteSpliting: read/write splitting.
     * - ConnectionPersist: connection pooling.
     * - TransactionReadSqlRouteOptimizeStatus: transaction splitting.
     * Valid status values:
     * - 1: enabled.
     * - 0: disabled.
     *
     * > **NOTE:** Note You must specify this parameter only when the read/write splitting feature is enabled.
     */
    dbProxyFeatures?: pulumi.Input<string>;
    /**
     * The number of proxy instances that are enabled. Valid values: 1 to 60.
     */
    dbProxyInstanceNum: pulumi.Input<number>;
    /**
     * The database proxy type. Valid values:
     * - common: universal proxy.
     * - exclusive: Exclusive proxy (default).
     */
    dbProxyInstanceType?: pulumi.Input<string>;
    /**
     * The SSL configuration setting that you want to apply on the instance. Valid values:
     * - Close: disables SSL encryption.
     * - Open: enables SSL encryption or modifies the endpoint that requires SSL encryption.
     * - Update: updates the validity period of the SSL certificate.
     */
    dbProxySslEnabled?: pulumi.Input<string>;
    /**
     * The point in time at which you want to apply the new database proxy settings. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    effectiveSpecificTime?: pulumi.Input<string>;
    /**
     * When modifying the number of proxy instances,The time when you want to apply the new database proxy settings.Valid values:
     * - Immediate: ApsaraDB RDS immediately applies the new settings.
     * - MaintainTime: ApsaraDB RDS applies the new settings during the maintenance window that you specified. For more information, see Modify the maintenance window.
     * - SpecificTime: ApsaraDB RDS applies the new settings at a specified point in time.
     *
     * > **NOTE:** Note If you set the EffectiveTime parameter to SpecificTime, you must specify the EffectiveSpecificTime parameter.
     */
    effectiveTime?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The network type of the instance. Set the value to VPC.
     */
    instanceNetworkType: pulumi.Input<string>;
    /**
     * The policy that is used to allocate read weights. Valid values:
     * - Standard: ApsaraDB RDS automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
     * - Custom: You must manually allocate read weights to the instance and its read-only instances.
     *
     * > **NOTE:** Note If you set the ReadOnlyInstanceDistributionType parameter to Custom, you must specify the ReadOnlyInstanceWeight parameter.
     */
    readOnlyInstanceDistributionType?: pulumi.Input<string>;
    /**
     * The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, ApsaraDB RDS no longer forwards read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained. Unit: seconds. Valid values: 0 to 3600.
     *
     * > **NOTE:** Note If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by ReadWriteSpliting.
     */
    readOnlyInstanceMaxDelayTime?: pulumi.Input<number>;
    /**
     * A list of the read weights of the instance and its read-only instances.  It contains two sub-fields(instance_id and weight). Read weights increase in increments of 100, and the maximum read weight is 10000. See `readOnlyInstanceWeight` below.
     */
    readOnlyInstanceWeights?: pulumi.Input<pulumi.Input<inputs.rds.RdsDbProxyReadOnlyInstanceWeight>[]>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The point in time at which you want to upgrade the database proxy version of the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    switchTime?: pulumi.Input<string>;
    /**
     * The time when you want to upgrade the database proxy version of the instance. Valid values:
     * - MaintainTime: ApsaraDB RDS performs the upgrade during the maintenance window that you specified. This is the default value. For more information, see Modify the maintenance window.
     * - Immediate: ApsaraDB RDS immediately performs the upgrade.
     * - SpecificTime: ApsaraDB RDS performs the upgrade at a specified point in time.
     */
    upgradeTime?: pulumi.Input<string>;
    /**
     * The ID of the virtual private cloud (VPC) to which the instance belongs.
     */
    vpcId: pulumi.Input<string>;
    /**
     * The ID of the vSwitch that is associated with the specified VPC.
     */
    vswitchId: pulumi.Input<string>;
}
