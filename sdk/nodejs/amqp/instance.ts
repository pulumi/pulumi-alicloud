// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Amqp Instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:amqp/instance:Instance example <id>
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
    public static readonly __pulumiType = 'alicloud:amqp/instance:Instance';

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
     * Renewal method. Automatic renewal: true; Manual renewal: false. When RenewalStatus has a value, the value of RenewalStatus shall prevail.
     */
    public readonly autoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * OrderCreateTime.
     */
    public /*out*/ readonly createTime!: pulumi.Output<number>;
    /**
     * The instance name.
     */
    public readonly instanceName!: pulumi.Output<string>;
    /**
     * Instance type. Valid values: 
     * - professional: professional Edition
     * - enterprise: enterprise Edition
     * - vip: Platinum Edition.
     * - serverless: Serverless Edition.
     * > **NOTE:** There should not set the `instanceType` parameter when creating a serverless instance. Only need to set `paymentType = "PayAsYouGo"` and `serverlessChargeType = "onDemand"`.
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * The maximum number of connections, according to the value given on the purchase page of the cloud message queue RabbitMQ version console.
     */
    public readonly maxConnections!: pulumi.Output<number>;
    /**
     * Peak TPS traffic of the public network, which must be a multiple of 128, unit: times per second.
     */
    public readonly maxEipTps!: pulumi.Output<string>;
    /**
     * Configure the private network TPS traffic peak, please set the value according to the cloud message queue RabbitMQ version of the console purchase page given.
     */
    public readonly maxTps!: pulumi.Output<string>;
    /**
     * This parameter must be provided while you change the instance specification. Type of instance lifting and lowering:
     * - Upgrade: Upgrade
     * - Downgrade: Downgrading.
     */
    public readonly modifyType!: pulumi.Output<string | undefined>;
    /**
     * The Payment type. Valid value: 
     * - Subscription: Pre-paid.
     * - PayAsYouGo: Post-paid, and for serverless Edition.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * Prepayment cycle, unit: periodCycle. This parameter is valid when PaymentType is set to Subscription.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * Prepaid cycle units. Value: Month, Year.
     */
    public readonly periodCycle!: pulumi.Output<string | undefined>;
    /**
     * Configure the maximum number of queues. The value range is as follows:  Professional version:[50,1000], minimum modification step size is 5  Enterprise Edition:[200,6000], minimum modification step size is 100  Platinum version:[10000,80000], minimum modification step size is 100.
     */
    public readonly queueCapacity!: pulumi.Output<string>;
    /**
     * The number of automatic renewal cycles.
     */
    public readonly renewalDuration!: pulumi.Output<number>;
    /**
     * Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years.
     */
    public readonly renewalDurationUnit!: pulumi.Output<string>;
    /**
     * The renewal status. Value: AutoRenewal: automatic renewal. ManualRenewal: manual renewal. NotRenewal: no renewal.
     */
    public readonly renewalStatus!: pulumi.Output<string>;
    /**
     * The billing type of the serverless instance. Value: onDemand.
     */
    public readonly serverlessChargeType!: pulumi.Output<string | undefined>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Configure the message storage space. Unit: GB. The value is as follows:  Professional Edition and Enterprise Edition: Fixed to 0. Description A value of 0 indicates that the Professional Edition and Enterprise Edition instances do not charge storage fees, but do not have storage space. Platinum version example: m × 100, where the value range of m is [7,28].
     */
    public readonly storageSize!: pulumi.Output<string>;
    /**
     * Whether to support public network.
     */
    public readonly supportEip!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to activate the message trace function. The values are as follows:  true: Enable message trace function false: message trace function is not enabled Description The Platinum Edition instance provides the 15-day message trace function free of charge. The trace function can only be enabled and the trace storage duration can only be set to 15 days. For instances of other specifications, you can enable or disable the trace function.
     */
    public readonly supportTracing!: pulumi.Output<boolean>;
    /**
     * Configure the storage duration of message traces. Unit: Days. The value is as follows:  3:3 days 7:7 days 15:15 days This parameter is valid when SupportTracing is true.
     */
    public readonly tracingStorageTime!: pulumi.Output<number>;

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
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["maxConnections"] = state ? state.maxConnections : undefined;
            resourceInputs["maxEipTps"] = state ? state.maxEipTps : undefined;
            resourceInputs["maxTps"] = state ? state.maxTps : undefined;
            resourceInputs["modifyType"] = state ? state.modifyType : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["periodCycle"] = state ? state.periodCycle : undefined;
            resourceInputs["queueCapacity"] = state ? state.queueCapacity : undefined;
            resourceInputs["renewalDuration"] = state ? state.renewalDuration : undefined;
            resourceInputs["renewalDurationUnit"] = state ? state.renewalDurationUnit : undefined;
            resourceInputs["renewalStatus"] = state ? state.renewalStatus : undefined;
            resourceInputs["serverlessChargeType"] = state ? state.serverlessChargeType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["storageSize"] = state ? state.storageSize : undefined;
            resourceInputs["supportEip"] = state ? state.supportEip : undefined;
            resourceInputs["supportTracing"] = state ? state.supportTracing : undefined;
            resourceInputs["tracingStorageTime"] = state ? state.tracingStorageTime : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.paymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentType'");
            }
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["maxConnections"] = args ? args.maxConnections : undefined;
            resourceInputs["maxEipTps"] = args ? args.maxEipTps : undefined;
            resourceInputs["maxTps"] = args ? args.maxTps : undefined;
            resourceInputs["modifyType"] = args ? args.modifyType : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["periodCycle"] = args ? args.periodCycle : undefined;
            resourceInputs["queueCapacity"] = args ? args.queueCapacity : undefined;
            resourceInputs["renewalDuration"] = args ? args.renewalDuration : undefined;
            resourceInputs["renewalDurationUnit"] = args ? args.renewalDurationUnit : undefined;
            resourceInputs["renewalStatus"] = args ? args.renewalStatus : undefined;
            resourceInputs["serverlessChargeType"] = args ? args.serverlessChargeType : undefined;
            resourceInputs["storageSize"] = args ? args.storageSize : undefined;
            resourceInputs["supportEip"] = args ? args.supportEip : undefined;
            resourceInputs["supportTracing"] = args ? args.supportTracing : undefined;
            resourceInputs["tracingStorageTime"] = args ? args.tracingStorageTime : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
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
     * Renewal method. Automatic renewal: true; Manual renewal: false. When RenewalStatus has a value, the value of RenewalStatus shall prevail.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * OrderCreateTime.
     */
    createTime?: pulumi.Input<number>;
    /**
     * The instance name.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Instance type. Valid values: 
     * - professional: professional Edition
     * - enterprise: enterprise Edition
     * - vip: Platinum Edition.
     * - serverless: Serverless Edition.
     * > **NOTE:** There should not set the `instanceType` parameter when creating a serverless instance. Only need to set `paymentType = "PayAsYouGo"` and `serverlessChargeType = "onDemand"`.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The maximum number of connections, according to the value given on the purchase page of the cloud message queue RabbitMQ version console.
     */
    maxConnections?: pulumi.Input<number>;
    /**
     * Peak TPS traffic of the public network, which must be a multiple of 128, unit: times per second.
     */
    maxEipTps?: pulumi.Input<string>;
    /**
     * Configure the private network TPS traffic peak, please set the value according to the cloud message queue RabbitMQ version of the console purchase page given.
     */
    maxTps?: pulumi.Input<string>;
    /**
     * This parameter must be provided while you change the instance specification. Type of instance lifting and lowering:
     * - Upgrade: Upgrade
     * - Downgrade: Downgrading.
     */
    modifyType?: pulumi.Input<string>;
    /**
     * The Payment type. Valid value: 
     * - Subscription: Pre-paid.
     * - PayAsYouGo: Post-paid, and for serverless Edition.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * Prepayment cycle, unit: periodCycle. This parameter is valid when PaymentType is set to Subscription.
     */
    period?: pulumi.Input<number>;
    /**
     * Prepaid cycle units. Value: Month, Year.
     */
    periodCycle?: pulumi.Input<string>;
    /**
     * Configure the maximum number of queues. The value range is as follows:  Professional version:[50,1000], minimum modification step size is 5  Enterprise Edition:[200,6000], minimum modification step size is 100  Platinum version:[10000,80000], minimum modification step size is 100.
     */
    queueCapacity?: pulumi.Input<string>;
    /**
     * The number of automatic renewal cycles.
     */
    renewalDuration?: pulumi.Input<number>;
    /**
     * Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years.
     */
    renewalDurationUnit?: pulumi.Input<string>;
    /**
     * The renewal status. Value: AutoRenewal: automatic renewal. ManualRenewal: manual renewal. NotRenewal: no renewal.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * The billing type of the serverless instance. Value: onDemand.
     */
    serverlessChargeType?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * Configure the message storage space. Unit: GB. The value is as follows:  Professional Edition and Enterprise Edition: Fixed to 0. Description A value of 0 indicates that the Professional Edition and Enterprise Edition instances do not charge storage fees, but do not have storage space. Platinum version example: m × 100, where the value range of m is [7,28].
     */
    storageSize?: pulumi.Input<string>;
    /**
     * Whether to support public network.
     */
    supportEip?: pulumi.Input<boolean>;
    /**
     * Whether to activate the message trace function. The values are as follows:  true: Enable message trace function false: message trace function is not enabled Description The Platinum Edition instance provides the 15-day message trace function free of charge. The trace function can only be enabled and the trace storage duration can only be set to 15 days. For instances of other specifications, you can enable or disable the trace function.
     */
    supportTracing?: pulumi.Input<boolean>;
    /**
     * Configure the storage duration of message traces. Unit: Days. The value is as follows:  3:3 days 7:7 days 15:15 days This parameter is valid when SupportTracing is true.
     */
    tracingStorageTime?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * Renewal method. Automatic renewal: true; Manual renewal: false. When RenewalStatus has a value, the value of RenewalStatus shall prevail.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The instance name.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Instance type. Valid values: 
     * - professional: professional Edition
     * - enterprise: enterprise Edition
     * - vip: Platinum Edition.
     * - serverless: Serverless Edition.
     * > **NOTE:** There should not set the `instanceType` parameter when creating a serverless instance. Only need to set `paymentType = "PayAsYouGo"` and `serverlessChargeType = "onDemand"`.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The maximum number of connections, according to the value given on the purchase page of the cloud message queue RabbitMQ version console.
     */
    maxConnections?: pulumi.Input<number>;
    /**
     * Peak TPS traffic of the public network, which must be a multiple of 128, unit: times per second.
     */
    maxEipTps?: pulumi.Input<string>;
    /**
     * Configure the private network TPS traffic peak, please set the value according to the cloud message queue RabbitMQ version of the console purchase page given.
     */
    maxTps?: pulumi.Input<string>;
    /**
     * This parameter must be provided while you change the instance specification. Type of instance lifting and lowering:
     * - Upgrade: Upgrade
     * - Downgrade: Downgrading.
     */
    modifyType?: pulumi.Input<string>;
    /**
     * The Payment type. Valid value: 
     * - Subscription: Pre-paid.
     * - PayAsYouGo: Post-paid, and for serverless Edition.
     */
    paymentType: pulumi.Input<string>;
    /**
     * Prepayment cycle, unit: periodCycle. This parameter is valid when PaymentType is set to Subscription.
     */
    period?: pulumi.Input<number>;
    /**
     * Prepaid cycle units. Value: Month, Year.
     */
    periodCycle?: pulumi.Input<string>;
    /**
     * Configure the maximum number of queues. The value range is as follows:  Professional version:[50,1000], minimum modification step size is 5  Enterprise Edition:[200,6000], minimum modification step size is 100  Platinum version:[10000,80000], minimum modification step size is 100.
     */
    queueCapacity?: pulumi.Input<string>;
    /**
     * The number of automatic renewal cycles.
     */
    renewalDuration?: pulumi.Input<number>;
    /**
     * Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years.
     */
    renewalDurationUnit?: pulumi.Input<string>;
    /**
     * The renewal status. Value: AutoRenewal: automatic renewal. ManualRenewal: manual renewal. NotRenewal: no renewal.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * The billing type of the serverless instance. Value: onDemand.
     */
    serverlessChargeType?: pulumi.Input<string>;
    /**
     * Configure the message storage space. Unit: GB. The value is as follows:  Professional Edition and Enterprise Edition: Fixed to 0. Description A value of 0 indicates that the Professional Edition and Enterprise Edition instances do not charge storage fees, but do not have storage space. Platinum version example: m × 100, where the value range of m is [7,28].
     */
    storageSize?: pulumi.Input<string>;
    /**
     * Whether to support public network.
     */
    supportEip?: pulumi.Input<boolean>;
    /**
     * Whether to activate the message trace function. The values are as follows:  true: Enable message trace function false: message trace function is not enabled Description The Platinum Edition instance provides the 15-day message trace function free of charge. The trace function can only be enabled and the trace storage duration can only be set to 15 days. For instances of other specifications, you can enable or disable the trace function.
     */
    supportTracing?: pulumi.Input<boolean>;
    /**
     * Configure the storage duration of message traces. Unit: Days. The value is as follows:  3:3 days 7:7 days 15:15 days This parameter is valid when SupportTracing is true.
     */
    tracingStorageTime?: pulumi.Input<number>;
}
