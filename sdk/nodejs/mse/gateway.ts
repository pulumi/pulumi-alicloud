// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Microservice Engine (MSE) Gateway resource.
 *
 * For information about Microservice Engine (MSE) Gateway and how to use it, see [What is Gateway](https://help.aliyun.com/document_detail/347638.html).
 *
 * > **NOTE:** Available since v1.157.0.
 *
 * ## Import
 *
 * Microservice Engine (MSE) Gateway can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:mse/gateway:Gateway example <id>
 * ```
 */
export class Gateway extends pulumi.CustomResource {
    /**
     * Get an existing Gateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayState, opts?: pulumi.CustomResourceOptions): Gateway {
        return new Gateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:mse/gateway:Gateway';

    /**
     * Returns true if the given object is an instance of Gateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Gateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Gateway.__pulumiType;
    }

    /**
     * The backup vswitch id.
     */
    public readonly backupVswitchId!: pulumi.Output<string | undefined>;
    /**
     * Whether to delete the SLB purchased on behalf of the gateway at the same time.
     */
    public readonly deleteSlb!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the enterprise security group type.
     */
    public readonly enterpriseSecurityGroup!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the Gateway .
     */
    public readonly gatewayName!: pulumi.Output<string | undefined>;
    /**
     * Public network SLB specifications.
     */
    public readonly internetSlbSpec!: pulumi.Output<string | undefined>;
    /**
     * Number of Gateway Nodes.
     */
    public readonly replica!: pulumi.Output<number>;
    /**
     * A list of gateway Slb.
     */
    public /*out*/ readonly slbLists!: pulumi.Output<outputs.mse.GatewaySlbList[]>;
    /**
     * Private network SLB specifications.
     */
    public readonly slbSpec!: pulumi.Output<string | undefined>;
    /**
     * Gateway Node Specifications. Valid values: `MSE_GTW_2_4_200_c`, `MSE_GTW_4_8_200_c`, `MSE_GTW_8_16_200_c`, `MSE_GTW_16_32_200_c`.
     */
    public readonly spec!: pulumi.Output<string>;
    /**
     * The status of the gateway.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The ID of the vpc.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The ID of the vswitch.
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a Gateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayArgs | GatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayState | undefined;
            resourceInputs["backupVswitchId"] = state ? state.backupVswitchId : undefined;
            resourceInputs["deleteSlb"] = state ? state.deleteSlb : undefined;
            resourceInputs["enterpriseSecurityGroup"] = state ? state.enterpriseSecurityGroup : undefined;
            resourceInputs["gatewayName"] = state ? state.gatewayName : undefined;
            resourceInputs["internetSlbSpec"] = state ? state.internetSlbSpec : undefined;
            resourceInputs["replica"] = state ? state.replica : undefined;
            resourceInputs["slbLists"] = state ? state.slbLists : undefined;
            resourceInputs["slbSpec"] = state ? state.slbSpec : undefined;
            resourceInputs["spec"] = state ? state.spec : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as GatewayArgs | undefined;
            if ((!args || args.replica === undefined) && !opts.urn) {
                throw new Error("Missing required property 'replica'");
            }
            if ((!args || args.spec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spec'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["backupVswitchId"] = args ? args.backupVswitchId : undefined;
            resourceInputs["deleteSlb"] = args ? args.deleteSlb : undefined;
            resourceInputs["enterpriseSecurityGroup"] = args ? args.enterpriseSecurityGroup : undefined;
            resourceInputs["gatewayName"] = args ? args.gatewayName : undefined;
            resourceInputs["internetSlbSpec"] = args ? args.internetSlbSpec : undefined;
            resourceInputs["replica"] = args ? args.replica : undefined;
            resourceInputs["slbSpec"] = args ? args.slbSpec : undefined;
            resourceInputs["spec"] = args ? args.spec : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["slbLists"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Gateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Gateway resources.
 */
export interface GatewayState {
    /**
     * The backup vswitch id.
     */
    backupVswitchId?: pulumi.Input<string>;
    /**
     * Whether to delete the SLB purchased on behalf of the gateway at the same time.
     */
    deleteSlb?: pulumi.Input<boolean>;
    /**
     * Whether the enterprise security group type.
     */
    enterpriseSecurityGroup?: pulumi.Input<boolean>;
    /**
     * The name of the Gateway .
     */
    gatewayName?: pulumi.Input<string>;
    /**
     * Public network SLB specifications.
     */
    internetSlbSpec?: pulumi.Input<string>;
    /**
     * Number of Gateway Nodes.
     */
    replica?: pulumi.Input<number>;
    /**
     * A list of gateway Slb.
     */
    slbLists?: pulumi.Input<pulumi.Input<inputs.mse.GatewaySlbList>[]>;
    /**
     * Private network SLB specifications.
     */
    slbSpec?: pulumi.Input<string>;
    /**
     * Gateway Node Specifications. Valid values: `MSE_GTW_2_4_200_c`, `MSE_GTW_4_8_200_c`, `MSE_GTW_8_16_200_c`, `MSE_GTW_16_32_200_c`.
     */
    spec?: pulumi.Input<string>;
    /**
     * The status of the gateway.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the vpc.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The ID of the vswitch.
     */
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Gateway resource.
 */
export interface GatewayArgs {
    /**
     * The backup vswitch id.
     */
    backupVswitchId?: pulumi.Input<string>;
    /**
     * Whether to delete the SLB purchased on behalf of the gateway at the same time.
     */
    deleteSlb?: pulumi.Input<boolean>;
    /**
     * Whether the enterprise security group type.
     */
    enterpriseSecurityGroup?: pulumi.Input<boolean>;
    /**
     * The name of the Gateway .
     */
    gatewayName?: pulumi.Input<string>;
    /**
     * Public network SLB specifications.
     */
    internetSlbSpec?: pulumi.Input<string>;
    /**
     * Number of Gateway Nodes.
     */
    replica: pulumi.Input<number>;
    /**
     * Private network SLB specifications.
     */
    slbSpec?: pulumi.Input<string>;
    /**
     * Gateway Node Specifications. Valid values: `MSE_GTW_2_4_200_c`, `MSE_GTW_4_8_200_c`, `MSE_GTW_8_16_200_c`, `MSE_GTW_16_32_200_c`.
     */
    spec: pulumi.Input<string>;
    /**
     * The ID of the vpc.
     */
    vpcId: pulumi.Input<string>;
    /**
     * The ID of the vswitch.
     */
    vswitchId: pulumi.Input<string>;
}
