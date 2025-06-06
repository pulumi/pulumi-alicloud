// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Ecs dedicated host can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ecs/dedicatedHost:DedicatedHost default dh-2zedmxxxx
 * ```
 */
export class DedicatedHost extends pulumi.CustomResource {
    /**
     * Get an existing DedicatedHost resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DedicatedHostState, opts?: pulumi.CustomResourceOptions): DedicatedHost {
        return new DedicatedHost(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/dedicatedHost:DedicatedHost';

    /**
     * Returns true if the given object is an instance of DedicatedHost.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DedicatedHost {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DedicatedHost.__pulumiType;
    }

    /**
     * The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
     */
    public readonly actionOnMaintenance!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
     */
    public readonly autoPlacement!: pulumi.Output<string | undefined>;
    /**
     * The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
     */
    public readonly autoReleaseTime!: pulumi.Output<string>;
    /**
     * Specifies whether to automatically renew the subscription dedicated host.
     */
    public readonly autoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
     */
    public readonly autoRenewPeriod!: pulumi.Output<number | undefined>;
    /**
     * CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
     */
    public readonly cpuOverCommitRatio!: pulumi.Output<number | undefined>;
    /**
     * The dedicated host cluster ID to which the dedicated host belongs.
     */
    public readonly dedicatedHostClusterId!: pulumi.Output<string | undefined>;
    /**
     * The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     */
    public readonly dedicatedHostName!: pulumi.Output<string | undefined>;
    /**
     * The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
     */
    public readonly dedicatedHostType!: pulumi.Output<string>;
    /**
     * The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
     */
    public readonly detailFee!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies whether to only validate the request. Default: `false`.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
     */
    public readonly expiredTime!: pulumi.Output<string>;
    /**
     * Specify the minimum purchase quantity of a dedicated host.
     */
    public readonly minQuantity!: pulumi.Output<number | undefined>;
    /**
     * dedicated host network parameters. contains the following attributes:
     */
    public readonly networkAttributes!: pulumi.Output<outputs.ecs.DedicatedHostNetworkAttribute[] | undefined>;
    /**
     * The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The ID of the resource group to which the dedicated host belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The unit of the subscription period of the dedicated host.
     */
    public readonly saleCycle!: pulumi.Output<string>;
    /**
     * The status of the dedicated host.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a DedicatedHost resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DedicatedHostArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DedicatedHostArgs | DedicatedHostState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DedicatedHostState | undefined;
            resourceInputs["actionOnMaintenance"] = state ? state.actionOnMaintenance : undefined;
            resourceInputs["autoPlacement"] = state ? state.autoPlacement : undefined;
            resourceInputs["autoReleaseTime"] = state ? state.autoReleaseTime : undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["autoRenewPeriod"] = state ? state.autoRenewPeriod : undefined;
            resourceInputs["cpuOverCommitRatio"] = state ? state.cpuOverCommitRatio : undefined;
            resourceInputs["dedicatedHostClusterId"] = state ? state.dedicatedHostClusterId : undefined;
            resourceInputs["dedicatedHostName"] = state ? state.dedicatedHostName : undefined;
            resourceInputs["dedicatedHostType"] = state ? state.dedicatedHostType : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["detailFee"] = state ? state.detailFee : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["expiredTime"] = state ? state.expiredTime : undefined;
            resourceInputs["minQuantity"] = state ? state.minQuantity : undefined;
            resourceInputs["networkAttributes"] = state ? state.networkAttributes : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["saleCycle"] = state ? state.saleCycle : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as DedicatedHostArgs | undefined;
            if ((!args || args.dedicatedHostType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dedicatedHostType'");
            }
            resourceInputs["actionOnMaintenance"] = args ? args.actionOnMaintenance : undefined;
            resourceInputs["autoPlacement"] = args ? args.autoPlacement : undefined;
            resourceInputs["autoReleaseTime"] = args ? args.autoReleaseTime : undefined;
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["autoRenewPeriod"] = args ? args.autoRenewPeriod : undefined;
            resourceInputs["cpuOverCommitRatio"] = args ? args.cpuOverCommitRatio : undefined;
            resourceInputs["dedicatedHostClusterId"] = args ? args.dedicatedHostClusterId : undefined;
            resourceInputs["dedicatedHostName"] = args ? args.dedicatedHostName : undefined;
            resourceInputs["dedicatedHostType"] = args ? args.dedicatedHostType : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["detailFee"] = args ? args.detailFee : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["expiredTime"] = args ? args.expiredTime : undefined;
            resourceInputs["minQuantity"] = args ? args.minQuantity : undefined;
            resourceInputs["networkAttributes"] = args ? args.networkAttributes : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["saleCycle"] = args ? args.saleCycle : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DedicatedHost.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DedicatedHost resources.
 */
export interface DedicatedHostState {
    /**
     * The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
     */
    actionOnMaintenance?: pulumi.Input<string>;
    /**
     * Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
     */
    autoPlacement?: pulumi.Input<string>;
    /**
     * The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
     */
    autoReleaseTime?: pulumi.Input<string>;
    /**
     * Specifies whether to automatically renew the subscription dedicated host.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
     */
    autoRenewPeriod?: pulumi.Input<number>;
    /**
     * CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
     */
    cpuOverCommitRatio?: pulumi.Input<number>;
    /**
     * The dedicated host cluster ID to which the dedicated host belongs.
     */
    dedicatedHostClusterId?: pulumi.Input<string>;
    /**
     * The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     */
    dedicatedHostName?: pulumi.Input<string>;
    /**
     * The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
     */
    dedicatedHostType?: pulumi.Input<string>;
    /**
     * The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
     */
    detailFee?: pulumi.Input<boolean>;
    /**
     * Specifies whether to only validate the request. Default: `false`.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
     */
    expiredTime?: pulumi.Input<string>;
    /**
     * Specify the minimum purchase quantity of a dedicated host.
     */
    minQuantity?: pulumi.Input<number>;
    /**
     * dedicated host network parameters. contains the following attributes:
     */
    networkAttributes?: pulumi.Input<pulumi.Input<inputs.ecs.DedicatedHostNetworkAttribute>[]>;
    /**
     * The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the dedicated host belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The unit of the subscription period of the dedicated host.
     */
    saleCycle?: pulumi.Input<string>;
    /**
     * The status of the dedicated host.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DedicatedHost resource.
 */
export interface DedicatedHostArgs {
    /**
     * The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
     */
    actionOnMaintenance?: pulumi.Input<string>;
    /**
     * Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
     */
    autoPlacement?: pulumi.Input<string>;
    /**
     * The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
     */
    autoReleaseTime?: pulumi.Input<string>;
    /**
     * Specifies whether to automatically renew the subscription dedicated host.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
     */
    autoRenewPeriod?: pulumi.Input<number>;
    /**
     * CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
     */
    cpuOverCommitRatio?: pulumi.Input<number>;
    /**
     * The dedicated host cluster ID to which the dedicated host belongs.
     */
    dedicatedHostClusterId?: pulumi.Input<string>;
    /**
     * The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     */
    dedicatedHostName?: pulumi.Input<string>;
    /**
     * The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
     */
    dedicatedHostType: pulumi.Input<string>;
    /**
     * The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
     */
    detailFee?: pulumi.Input<boolean>;
    /**
     * Specifies whether to only validate the request. Default: `false`.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
     */
    expiredTime?: pulumi.Input<string>;
    /**
     * Specify the minimum purchase quantity of a dedicated host.
     */
    minQuantity?: pulumi.Input<number>;
    /**
     * dedicated host network parameters. contains the following attributes:
     */
    networkAttributes?: pulumi.Input<pulumi.Input<inputs.ecs.DedicatedHostNetworkAttribute>[]>;
    /**
     * The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the dedicated host belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The unit of the subscription period of the dedicated host.
     */
    saleCycle?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
     */
    zoneId?: pulumi.Input<string>;
}
