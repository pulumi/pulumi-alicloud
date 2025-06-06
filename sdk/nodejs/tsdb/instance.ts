// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Time Series Database (TSDB) Instance resource.
 *
 * For information about Time Series Database (TSDB) Instance and how to use it, see [What is Time Series Database (TSDB)](https://www.alibabacloud.com/help/en/doc-detail/55652.htm).
 *
 * > **NOTE:** Available since v1.112.0.
 *
 * > **DEPRECATED:**  This resource has been [deprecated](https://www.alibabacloud.com/en/notice/0313tsdb?_p_lc=1) from version `1.223.1`.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.tsdb.getZones({});
 * const exampleNetwork = new alicloud.vpc.Network("example", {
 *     cidrBlock: "192.168.0.0/16",
 *     name: "tf-testaccTsdbInstance",
 * });
 * const exampleSwitch = new alicloud.vpc.Switch("example", {
 *     availabilityZone: example.then(example => example.ids?.[0]),
 *     cidrBlock: "192.168.1.0/24",
 *     vpcId: exampleNetwork.id,
 * });
 * const exampleInstance = new alicloud.tsdb.Instance("example", {
 *     paymentType: "PayAsYouGo",
 *     vswitchId: exampleSwitch.id,
 *     instanceStorage: "50",
 *     instanceClass: "tsdb.1x.basic",
 *     engineType: "tsdb_tsdb",
 *     instanceAlias: "tf-testaccTsdbInstance",
 * });
 * ```
 *
 * ## Import
 *
 * TSDB Instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:tsdb/instance:Instance example <id>
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:tsdb/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * The app key.
     */
    public readonly appKey!: pulumi.Output<string | undefined>;
    /**
     * The disk type of instance. Valid when the engine type is `tsdbInfluxdb`. `cloudSsd` refers to SSD disk, `cloudEfficiency` refers to efficiency disk, `cloudEssd` refers to ESSD PL1 disk. Valid values: `cloudEfficiency`, `cloudEssd`, `cloudSsd`.
     */
    public readonly diskCategory!: pulumi.Output<string | undefined>;
    /**
     * The duration.
     */
    public readonly duration!: pulumi.Output<string | undefined>;
    /**
     * The engine type of instance Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
     */
    public readonly engineType!: pulumi.Output<string | undefined>;
    /**
     * The alias of the instance.
     */
    public readonly instanceAlias!: pulumi.Output<string | undefined>;
    /**
     * The specification of the instance. 
     * - Following enumerative value for TSDB for InfluxDB️ standart edition:
     * - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
     * - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
     * - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
     * - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
     * - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
     * - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
     * - Following enumerative value for TSDB for InfluxDB High-availability edition:
     * - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
     * - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
     * - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
     * - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
     * - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
     * - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
     * - Following enumerative value for TSDB:
     * - `tsdb.1x.basic` refers to basic edition I;
     * - `tsdb.3x.basic` refers to basic edition II;
     * - `tsdb.4x.basic` refers to basic edtion III;
     * - `tsdb.12x.standard` refers to standard edition I;
     * - `tsdb.24x.standard` refers to standard edition II;
     * - `tsdb.48x.large` refers to ultimate edition I;
     * - `tsdb.96x.large` refers to ultimate edition II.
     */
    public readonly instanceClass!: pulumi.Output<string>;
    /**
     * The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
     */
    public readonly instanceStorage!: pulumi.Output<string>;
    /**
     * The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The vswitch id.
     */
    public readonly vswitchId!: pulumi.Output<string>;
    /**
     * The zone ID of the instance.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["appKey"] = state ? state.appKey : undefined;
            resourceInputs["diskCategory"] = state ? state.diskCategory : undefined;
            resourceInputs["duration"] = state ? state.duration : undefined;
            resourceInputs["engineType"] = state ? state.engineType : undefined;
            resourceInputs["instanceAlias"] = state ? state.instanceAlias : undefined;
            resourceInputs["instanceClass"] = state ? state.instanceClass : undefined;
            resourceInputs["instanceStorage"] = state ? state.instanceStorage : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.instanceClass === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceClass'");
            }
            if ((!args || args.instanceStorage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceStorage'");
            }
            if ((!args || args.paymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentType'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["appKey"] = args ? args.appKey : undefined;
            resourceInputs["diskCategory"] = args ? args.diskCategory : undefined;
            resourceInputs["duration"] = args ? args.duration : undefined;
            resourceInputs["engineType"] = args ? args.engineType : undefined;
            resourceInputs["instanceAlias"] = args ? args.instanceAlias : undefined;
            resourceInputs["instanceClass"] = args ? args.instanceClass : undefined;
            resourceInputs["instanceStorage"] = args ? args.instanceStorage : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * The app key.
     */
    appKey?: pulumi.Input<string>;
    /**
     * The disk type of instance. Valid when the engine type is `tsdbInfluxdb`. `cloudSsd` refers to SSD disk, `cloudEfficiency` refers to efficiency disk, `cloudEssd` refers to ESSD PL1 disk. Valid values: `cloudEfficiency`, `cloudEssd`, `cloudSsd`.
     */
    diskCategory?: pulumi.Input<string>;
    /**
     * The duration.
     */
    duration?: pulumi.Input<string>;
    /**
     * The engine type of instance Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
     */
    engineType?: pulumi.Input<string>;
    /**
     * The alias of the instance.
     */
    instanceAlias?: pulumi.Input<string>;
    /**
     * The specification of the instance. 
     * - Following enumerative value for TSDB for InfluxDB️ standart edition:
     * - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
     * - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
     * - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
     * - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
     * - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
     * - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
     * - Following enumerative value for TSDB for InfluxDB High-availability edition:
     * - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
     * - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
     * - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
     * - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
     * - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
     * - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
     * - Following enumerative value for TSDB:
     * - `tsdb.1x.basic` refers to basic edition I;
     * - `tsdb.3x.basic` refers to basic edition II;
     * - `tsdb.4x.basic` refers to basic edtion III;
     * - `tsdb.12x.standard` refers to standard edition I;
     * - `tsdb.24x.standard` refers to standard edition II;
     * - `tsdb.48x.large` refers to ultimate edition I;
     * - `tsdb.96x.large` refers to ultimate edition II.
     */
    instanceClass?: pulumi.Input<string>;
    /**
     * The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
     */
    instanceStorage?: pulumi.Input<string>;
    /**
     * The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
     */
    status?: pulumi.Input<string>;
    /**
     * The vswitch id.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the instance.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * The app key.
     */
    appKey?: pulumi.Input<string>;
    /**
     * The disk type of instance. Valid when the engine type is `tsdbInfluxdb`. `cloudSsd` refers to SSD disk, `cloudEfficiency` refers to efficiency disk, `cloudEssd` refers to ESSD PL1 disk. Valid values: `cloudEfficiency`, `cloudEssd`, `cloudSsd`.
     */
    diskCategory?: pulumi.Input<string>;
    /**
     * The duration.
     */
    duration?: pulumi.Input<string>;
    /**
     * The engine type of instance Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
     */
    engineType?: pulumi.Input<string>;
    /**
     * The alias of the instance.
     */
    instanceAlias?: pulumi.Input<string>;
    /**
     * The specification of the instance. 
     * - Following enumerative value for TSDB for InfluxDB️ standart edition:
     * - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
     * - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
     * - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
     * - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
     * - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
     * - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
     * - Following enumerative value for TSDB for InfluxDB High-availability edition:
     * - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
     * - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
     * - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
     * - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
     * - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
     * - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
     * - Following enumerative value for TSDB:
     * - `tsdb.1x.basic` refers to basic edition I;
     * - `tsdb.3x.basic` refers to basic edition II;
     * - `tsdb.4x.basic` refers to basic edtion III;
     * - `tsdb.12x.standard` refers to standard edition I;
     * - `tsdb.24x.standard` refers to standard edition II;
     * - `tsdb.48x.large` refers to ultimate edition I;
     * - `tsdb.96x.large` refers to ultimate edition II.
     */
    instanceClass: pulumi.Input<string>;
    /**
     * The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
     */
    instanceStorage: pulumi.Input<string>;
    /**
     * The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
     */
    paymentType: pulumi.Input<string>;
    /**
     * The vswitch id.
     */
    vswitchId: pulumi.Input<string>;
    /**
     * The zone ID of the instance.
     */
    zoneId?: pulumi.Input<string>;
}
