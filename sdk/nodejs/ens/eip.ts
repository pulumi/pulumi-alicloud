// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ENS Eip resource. Edge elastic public network IP. When you use it for the first time, please contact the product classmates to add a resource whitelist.
 *
 * For information about ENS Eip and how to use it, see [What is Eip](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createeipinstance).
 *
 * > **NOTE:** Available since v1.213.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.ens.Eip("default", {
 *     description: "EipDescription_autotest",
 *     bandwidth: 5,
 *     isp: "cmcc",
 *     paymentType: "PayAsYouGo",
 *     ensRegionId: "cn-chenzhou-telecom_unicom_cmcc",
 *     eipName: name,
 *     internetChargeType: "95BandwidthByMonth",
 * });
 * ```
 *
 * ## Import
 *
 * ENS Eip can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ens/eip:Eip example <id>
 * ```
 */
export class Eip extends pulumi.CustomResource {
    /**
     * Get an existing Eip resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EipState, opts?: pulumi.CustomResourceOptions): Eip {
        return new Eip(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ens/eip:Eip';

    /**
     * Returns true if the given object is an instance of Eip.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Eip {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Eip.__pulumiType;
    }

    /**
     * The peak bandwidth of the EIP to be specified.Rules:Default value: 5, value range: 5~10000, unit: Mbps. Example value: 5.
     */
    public readonly bandwidth!: pulumi.Output<number>;
    /**
     * The creation time of the EIP instance.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The description of the EIP.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the EIP instance.
     */
    public readonly eipName!: pulumi.Output<string | undefined>;
    /**
     * Ens node ID.
     */
    public readonly ensRegionId!: pulumi.Output<string>;
    /**
     * Billing type of the EIP instance. Valid value: 95bandwidthbymonth.
     */
    public readonly internetChargeType!: pulumi.Output<string>;
    /**
     * Internet service provider, if not filled in, it will be assigned according to the default rules.
     */
    public readonly isp!: pulumi.Output<string>;
    /**
     * The billing type of the EIP instanceValue: PayAsYouGo.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The status of the EIP instance.Rules:Associating: bindingUnassociating: UnbindingInUse: AssignedAvailable: AvailableCreating: CreatingReleasing: Releasing.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Eip resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EipArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EipArgs | EipState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EipState | undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["eipName"] = state ? state.eipName : undefined;
            resourceInputs["ensRegionId"] = state ? state.ensRegionId : undefined;
            resourceInputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            resourceInputs["isp"] = state ? state.isp : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as EipArgs | undefined;
            if ((!args || args.ensRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ensRegionId'");
            }
            if ((!args || args.internetChargeType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'internetChargeType'");
            }
            if ((!args || args.paymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentType'");
            }
            resourceInputs["bandwidth"] = args ? args.bandwidth : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["eipName"] = args ? args.eipName : undefined;
            resourceInputs["ensRegionId"] = args ? args.ensRegionId : undefined;
            resourceInputs["internetChargeType"] = args ? args.internetChargeType : undefined;
            resourceInputs["isp"] = args ? args.isp : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Eip.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Eip resources.
 */
export interface EipState {
    /**
     * The peak bandwidth of the EIP to be specified.Rules:Default value: 5, value range: 5~10000, unit: Mbps. Example value: 5.
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * The creation time of the EIP instance.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The description of the EIP.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the EIP instance.
     */
    eipName?: pulumi.Input<string>;
    /**
     * Ens node ID.
     */
    ensRegionId?: pulumi.Input<string>;
    /**
     * Billing type of the EIP instance. Valid value: 95bandwidthbymonth.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * Internet service provider, if not filled in, it will be assigned according to the default rules.
     */
    isp?: pulumi.Input<string>;
    /**
     * The billing type of the EIP instanceValue: PayAsYouGo.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The status of the EIP instance.Rules:Associating: bindingUnassociating: UnbindingInUse: AssignedAvailable: AvailableCreating: CreatingReleasing: Releasing.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Eip resource.
 */
export interface EipArgs {
    /**
     * The peak bandwidth of the EIP to be specified.Rules:Default value: 5, value range: 5~10000, unit: Mbps. Example value: 5.
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * The description of the EIP.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the EIP instance.
     */
    eipName?: pulumi.Input<string>;
    /**
     * Ens node ID.
     */
    ensRegionId: pulumi.Input<string>;
    /**
     * Billing type of the EIP instance. Valid value: 95bandwidthbymonth.
     */
    internetChargeType: pulumi.Input<string>;
    /**
     * Internet service provider, if not filled in, it will be assigned according to the default rules.
     */
    isp?: pulumi.Input<string>;
    /**
     * The billing type of the EIP instanceValue: PayAsYouGo.
     */
    paymentType: pulumi.Input<string>;
}
