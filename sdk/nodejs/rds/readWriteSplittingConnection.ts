// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an RDS read write splitting connection resource to allocate an Intranet connection string for RDS instance, see [What is DB Read Write Splitting Connection](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-allocatereadwritesplittingconnection).
 *
 * > **NOTE:** Available since v1.48.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const example = alicloud.rds.getZones({
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 * });
 * const exampleGetInstanceClasses = example.then(example => alicloud.rds.getInstanceClasses({
 *     zoneId: example.ids?.[0],
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 * }));
 * const exampleNetwork = new alicloud.vpc.Network("example", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const exampleSwitch = new alicloud.vpc.Switch("example", {
 *     vpcId: exampleNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: example.then(example => example.zones?.[0]?.id),
 *     vswitchName: name,
 * });
 * const exampleSecurityGroup = new alicloud.ecs.SecurityGroup("example", {
 *     name: name,
 *     vpcId: exampleNetwork.id,
 * });
 * const exampleInstance = new alicloud.rds.Instance("example", {
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 *     category: "HighAvailability",
 *     instanceType: exampleGetInstanceClasses.then(exampleGetInstanceClasses => exampleGetInstanceClasses.instanceClasses?.[1]?.instanceClass),
 *     instanceStorage: 20,
 *     instanceChargeType: "Postpaid",
 *     instanceName: name,
 *     vswitchId: exampleSwitch.id,
 *     securityIps: [
 *         "10.168.1.12",
 *         "100.69.7.112",
 *     ],
 * });
 * const exampleReadOnlyInstance = new alicloud.rds.ReadOnlyInstance("example", {
 *     zoneId: exampleInstance.zoneId,
 *     masterDbInstanceId: exampleInstance.id,
 *     engineVersion: exampleInstance.engineVersion,
 *     instanceStorage: exampleInstance.instanceStorage,
 *     instanceType: exampleInstance.instanceType,
 *     instanceName: `${name}readonly`,
 *     vswitchId: exampleSwitch.id,
 * });
 * const _default = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const exampleReadWriteSplittingConnection = new alicloud.rds.ReadWriteSplittingConnection("example", {
 *     instanceId: exampleReadOnlyInstance.masterDbInstanceId,
 *     connectionPrefix: `example-con-${_default.result}`,
 *     distributionType: "Standard",
 * });
 * ```
 *
 * > **NOTE:** Resource `alicloud.rds.ReadWriteSplittingConnection` should be created after `alicloud.rds.ReadOnlyInstance`, so the `dependsOn` statement is necessary.
 *
 * ## Import
 *
 * RDS read write splitting connection can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:rds/readWriteSplittingConnection:ReadWriteSplittingConnection example abc12345678
 * ```
 */
export class ReadWriteSplittingConnection extends pulumi.CustomResource {
    /**
     * Get an existing ReadWriteSplittingConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReadWriteSplittingConnectionState, opts?: pulumi.CustomResourceOptions): ReadWriteSplittingConnection {
        return new ReadWriteSplittingConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rds/readWriteSplittingConnection:ReadWriteSplittingConnection';

    /**
     * Returns true if the given object is an instance of ReadWriteSplittingConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReadWriteSplittingConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReadWriteSplittingConnection.__pulumiType;
    }

    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'rw'.
     */
    public readonly connectionPrefix!: pulumi.Output<string | undefined>;
    /**
     * Connection instance string.
     */
    public /*out*/ readonly connectionString!: pulumi.Output<string>;
    /**
     * Read weight distribution mode. Values are as follows: `Standard` indicates automatic weight distribution based on types, `Custom` indicates custom weight distribution.
     */
    public readonly distributionType!: pulumi.Output<string>;
    /**
     * The Id of instance that can run database.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * Delay threshold, in seconds. The value range is 0 to 7200. Default to 30. Read requests are not routed to the read-only instances with a delay greater than the threshold.
     */
    public readonly maxDelayTime!: pulumi.Output<number>;
    /**
     * Intranet connection port. Valid value: [3001-3999]. Default to 3306.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * Read weight distribution. Read weights increase at a step of 100 up to 10,000. Enter weights in the following format: {"Instanceid":"Weight","Instanceid":"Weight"}. This parameter must be set when distributionType is set to Custom.
     */
    public readonly weight!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a ReadWriteSplittingConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReadWriteSplittingConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReadWriteSplittingConnectionArgs | ReadWriteSplittingConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReadWriteSplittingConnectionState | undefined;
            resourceInputs["connectionPrefix"] = state ? state.connectionPrefix : undefined;
            resourceInputs["connectionString"] = state ? state.connectionString : undefined;
            resourceInputs["distributionType"] = state ? state.distributionType : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["maxDelayTime"] = state ? state.maxDelayTime : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as ReadWriteSplittingConnectionArgs | undefined;
            if ((!args || args.distributionType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'distributionType'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["connectionPrefix"] = args ? args.connectionPrefix : undefined;
            resourceInputs["distributionType"] = args ? args.distributionType : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["maxDelayTime"] = args ? args.maxDelayTime : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["weight"] = args ? args.weight : undefined;
            resourceInputs["connectionString"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ReadWriteSplittingConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReadWriteSplittingConnection resources.
 */
export interface ReadWriteSplittingConnectionState {
    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'rw'.
     */
    connectionPrefix?: pulumi.Input<string>;
    /**
     * Connection instance string.
     */
    connectionString?: pulumi.Input<string>;
    /**
     * Read weight distribution mode. Values are as follows: `Standard` indicates automatic weight distribution based on types, `Custom` indicates custom weight distribution.
     */
    distributionType?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * Delay threshold, in seconds. The value range is 0 to 7200. Default to 30. Read requests are not routed to the read-only instances with a delay greater than the threshold.
     */
    maxDelayTime?: pulumi.Input<number>;
    /**
     * Intranet connection port. Valid value: [3001-3999]. Default to 3306.
     */
    port?: pulumi.Input<number>;
    /**
     * Read weight distribution. Read weights increase at a step of 100 up to 10,000. Enter weights in the following format: {"Instanceid":"Weight","Instanceid":"Weight"}. This parameter must be set when distributionType is set to Custom.
     */
    weight?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a ReadWriteSplittingConnection resource.
 */
export interface ReadWriteSplittingConnectionArgs {
    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'rw'.
     */
    connectionPrefix?: pulumi.Input<string>;
    /**
     * Read weight distribution mode. Values are as follows: `Standard` indicates automatic weight distribution based on types, `Custom` indicates custom weight distribution.
     */
    distributionType: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    instanceId: pulumi.Input<string>;
    /**
     * Delay threshold, in seconds. The value range is 0 to 7200. Default to 30. Read requests are not routed to the read-only instances with a delay greater than the threshold.
     */
    maxDelayTime?: pulumi.Input<number>;
    /**
     * Intranet connection port. Valid value: [3001-3999]. Default to 3306.
     */
    port?: pulumi.Input<number>;
    /**
     * Read weight distribution. Read weights increase at a step of 100 up to 10,000. Enter weights in the following format: {"Instanceid":"Weight","Instanceid":"Weight"}. This parameter must be set when distributionType is set to Custom.
     */
    weight?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
