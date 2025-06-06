// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Api Gateway Instance resource.
 *
 * For information about Api Gateway Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/en/api-gateway/product-overview/dedicated-instances).
 *
 * > **NOTE:** Available since v1.218.0.
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
 * const _default = new alicloud.apigateway.Instance("default", {
 *     instanceName: name,
 *     instanceSpec: "api.s1.small",
 *     httpsPolicy: "HTTPS2_TLS1_0",
 *     zoneId: "cn-hangzhou-MAZ6(i,j,k)",
 *     paymentType: "PayAsYouGo",
 *     instanceType: "normal",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const vpc = new alicloud.vpc.Network("vpc", {
 *     cidrBlock: "172.16.0.0/12",
 *     vpcName: name,
 * });
 * const vswitch1 = new alicloud.vpc.Switch("vswitch_1", {
 *     vpcId: vpc.id,
 *     cidrBlock: "172.16.0.0/16",
 *     zoneId: "cn-hangzhou-j",
 *     vswitchName: `${name}_1`,
 * });
 * const vswitch2 = new alicloud.vpc.Switch("vswitch_2", {
 *     vpcId: vpc.id,
 *     cidrBlock: "172.17.0.0/16",
 *     zoneId: "cn-hangzhou-k",
 *     vswitchName: `${name}_2`,
 * });
 * const securityGroup = new alicloud.ecs.SecurityGroup("security_group", {
 *     vpcId: vpc.id,
 *     securityGroupName: name,
 * });
 * const vpcIntegrationInstance = new alicloud.apigateway.Instance("vpc_integration_instance", {
 *     instanceName: name,
 *     httpsPolicy: "HTTPS2_TLS1_0",
 *     instanceSpec: "api.s1.small",
 *     instanceType: "vpc_connect",
 *     paymentType: "PayAsYouGo",
 *     userVpcId: vpc.id,
 *     instanceCidr: "192.168.0.0/16",
 *     zoneVswitchSecurityGroups: [
 *         {
 *             zoneId: vswitch1.zoneId,
 *             vswitchId: vswitch1.id,
 *             cidrBlock: vswitch1.cidrBlock,
 *             securityGroup: securityGroup.id,
 *         },
 *         {
 *             zoneId: vswitch2.zoneId,
 *             vswitchId: vswitch2.id,
 *             cidrBlock: vswitch2.cidrBlock,
 *             securityGroup: securityGroup.id,
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Api Gateway Instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:apigateway/instance:Instance example <id>
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
    public static readonly __pulumiType = 'alicloud:apigateway/instance:Instance';

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
     * (Available since v1.228.0) The CIDR blocks that can be accessed by the Vpc integration instance.
     */
    public /*out*/ readonly connectCidrBlocks!: pulumi.Output<string>;
    /**
     * Creation time.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
     */
    public readonly deleteVpcIpBlock!: pulumi.Output<string | undefined>;
    /**
     * The time of the instance package. Valid values:
     * - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
     * - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
     *
     * When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
     */
    public readonly duration!: pulumi.Output<number | undefined>;
    /**
     * Specifies whether IPv6 egress capability is enabled.
     */
    public readonly egressIpv6Enable!: pulumi.Output<boolean | undefined>;
    /**
     * Https policy.
     */
    public readonly httpsPolicy!: pulumi.Output<string>;
    /**
     * The VpcID which the client at.
     */
    public readonly ingressVpcId!: pulumi.Output<string | undefined>;
    /**
     * The user ID that the VpcID of `ingressVpcId` belongs to.
     */
    public readonly ingressVpcOwnerId!: pulumi.Output<string | undefined>;
    /**
     * The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
     */
    public readonly ingressVswitchId!: pulumi.Output<string | undefined>;
    /**
     * The CIDR block for the instance deployment. Valid values are:
     * - `192.168.0.0/16`.
     * - `172.16.0.0/12`.
     */
    public readonly instanceCidr!: pulumi.Output<string>;
    /**
     * Instance name.
     */
    public readonly instanceName!: pulumi.Output<string>;
    /**
     * Instance spec.
     */
    public readonly instanceSpec!: pulumi.Output<string>;
    /**
     * The type of the instance. Valid values are:
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * Specifies whether IPv6 ingress capability is enabled.
     */
    public readonly ipv6Enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The payment type of the resource.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
     */
    public readonly pricingCycle!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
     */
    public readonly skipWaitSwitch!: pulumi.Output<boolean | undefined>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Does ipv6 support.
     */
    public /*out*/ readonly supportIpv6!: pulumi.Output<boolean>;
    /**
     * The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
     */
    public readonly toConnectVpcIpBlock!: pulumi.Output<outputs.apigateway.InstanceToConnectVpcIpBlock | undefined>;
    /**
     * User's VpcID.
     */
    public readonly userVpcId!: pulumi.Output<string | undefined>;
    /**
     * Whether the slb of the Vpc supports.
     */
    public readonly vpcSlbIntranetEnable!: pulumi.Output<boolean | undefined>;
    /**
     * The zone where the instance is deployed.
     */
    public readonly zoneId!: pulumi.Output<string>;
    /**
     * Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
     */
    public readonly zoneVswitchSecurityGroups!: pulumi.Output<outputs.apigateway.InstanceZoneVswitchSecurityGroup[] | undefined>;

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
            resourceInputs["connectCidrBlocks"] = state ? state.connectCidrBlocks : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["deleteVpcIpBlock"] = state ? state.deleteVpcIpBlock : undefined;
            resourceInputs["duration"] = state ? state.duration : undefined;
            resourceInputs["egressIpv6Enable"] = state ? state.egressIpv6Enable : undefined;
            resourceInputs["httpsPolicy"] = state ? state.httpsPolicy : undefined;
            resourceInputs["ingressVpcId"] = state ? state.ingressVpcId : undefined;
            resourceInputs["ingressVpcOwnerId"] = state ? state.ingressVpcOwnerId : undefined;
            resourceInputs["ingressVswitchId"] = state ? state.ingressVswitchId : undefined;
            resourceInputs["instanceCidr"] = state ? state.instanceCidr : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["instanceSpec"] = state ? state.instanceSpec : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["ipv6Enabled"] = state ? state.ipv6Enabled : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["pricingCycle"] = state ? state.pricingCycle : undefined;
            resourceInputs["skipWaitSwitch"] = state ? state.skipWaitSwitch : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["supportIpv6"] = state ? state.supportIpv6 : undefined;
            resourceInputs["toConnectVpcIpBlock"] = state ? state.toConnectVpcIpBlock : undefined;
            resourceInputs["userVpcId"] = state ? state.userVpcId : undefined;
            resourceInputs["vpcSlbIntranetEnable"] = state ? state.vpcSlbIntranetEnable : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
            resourceInputs["zoneVswitchSecurityGroups"] = state ? state.zoneVswitchSecurityGroups : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.httpsPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'httpsPolicy'");
            }
            if ((!args || args.instanceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceName'");
            }
            if ((!args || args.instanceSpec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceSpec'");
            }
            if ((!args || args.paymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentType'");
            }
            resourceInputs["deleteVpcIpBlock"] = args ? args.deleteVpcIpBlock : undefined;
            resourceInputs["duration"] = args ? args.duration : undefined;
            resourceInputs["egressIpv6Enable"] = args ? args.egressIpv6Enable : undefined;
            resourceInputs["httpsPolicy"] = args ? args.httpsPolicy : undefined;
            resourceInputs["ingressVpcId"] = args ? args.ingressVpcId : undefined;
            resourceInputs["ingressVpcOwnerId"] = args ? args.ingressVpcOwnerId : undefined;
            resourceInputs["ingressVswitchId"] = args ? args.ingressVswitchId : undefined;
            resourceInputs["instanceCidr"] = args ? args.instanceCidr : undefined;
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["instanceSpec"] = args ? args.instanceSpec : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["ipv6Enabled"] = args ? args.ipv6Enabled : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["pricingCycle"] = args ? args.pricingCycle : undefined;
            resourceInputs["skipWaitSwitch"] = args ? args.skipWaitSwitch : undefined;
            resourceInputs["toConnectVpcIpBlock"] = args ? args.toConnectVpcIpBlock : undefined;
            resourceInputs["userVpcId"] = args ? args.userVpcId : undefined;
            resourceInputs["vpcSlbIntranetEnable"] = args ? args.vpcSlbIntranetEnable : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["zoneVswitchSecurityGroups"] = args ? args.zoneVswitchSecurityGroups : undefined;
            resourceInputs["connectCidrBlocks"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["supportIpv6"] = undefined /*out*/;
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
     * (Available since v1.228.0) The CIDR blocks that can be accessed by the Vpc integration instance.
     */
    connectCidrBlocks?: pulumi.Input<string>;
    /**
     * Creation time.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
     */
    deleteVpcIpBlock?: pulumi.Input<string>;
    /**
     * The time of the instance package. Valid values:
     * - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
     * - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
     *
     * When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
     */
    duration?: pulumi.Input<number>;
    /**
     * Specifies whether IPv6 egress capability is enabled.
     */
    egressIpv6Enable?: pulumi.Input<boolean>;
    /**
     * Https policy.
     */
    httpsPolicy?: pulumi.Input<string>;
    /**
     * The VpcID which the client at.
     */
    ingressVpcId?: pulumi.Input<string>;
    /**
     * The user ID that the VpcID of `ingressVpcId` belongs to.
     */
    ingressVpcOwnerId?: pulumi.Input<string>;
    /**
     * The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
     */
    ingressVswitchId?: pulumi.Input<string>;
    /**
     * The CIDR block for the instance deployment. Valid values are:
     * - `192.168.0.0/16`.
     * - `172.16.0.0/12`.
     */
    instanceCidr?: pulumi.Input<string>;
    /**
     * Instance name.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Instance spec.
     */
    instanceSpec?: pulumi.Input<string>;
    /**
     * The type of the instance. Valid values are:
     */
    instanceType?: pulumi.Input<string>;
    /**
     * Specifies whether IPv6 ingress capability is enabled.
     */
    ipv6Enabled?: pulumi.Input<boolean>;
    /**
     * The payment type of the resource.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
     */
    pricingCycle?: pulumi.Input<string>;
    /**
     * Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
     */
    skipWaitSwitch?: pulumi.Input<boolean>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * Does ipv6 support.
     */
    supportIpv6?: pulumi.Input<boolean>;
    /**
     * The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
     */
    toConnectVpcIpBlock?: pulumi.Input<inputs.apigateway.InstanceToConnectVpcIpBlock>;
    /**
     * User's VpcID.
     */
    userVpcId?: pulumi.Input<string>;
    /**
     * Whether the slb of the Vpc supports.
     */
    vpcSlbIntranetEnable?: pulumi.Input<boolean>;
    /**
     * The zone where the instance is deployed.
     */
    zoneId?: pulumi.Input<string>;
    /**
     * Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
     */
    zoneVswitchSecurityGroups?: pulumi.Input<pulumi.Input<inputs.apigateway.InstanceZoneVswitchSecurityGroup>[]>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * Indicates whether to delete the IP block that the VPC can access, conflict with `toConnectVpcIpBlock`.
     */
    deleteVpcIpBlock?: pulumi.Input<string>;
    /**
     * The time of the instance package. Valid values:
     * - PricingCycle is **Month**, indicating monthly payment. The value range is **1** to **9**.
     * - PricingCycle is **Year**, indicating annual payment. The value range is **1** to **3**.
     *
     * When the value of> ChargeType is **PrePaid**, this parameter is available and must be passed in.
     */
    duration?: pulumi.Input<number>;
    /**
     * Specifies whether IPv6 egress capability is enabled.
     */
    egressIpv6Enable?: pulumi.Input<boolean>;
    /**
     * Https policy.
     */
    httpsPolicy: pulumi.Input<string>;
    /**
     * The VpcID which the client at.
     */
    ingressVpcId?: pulumi.Input<string>;
    /**
     * The user ID that the VpcID of `ingressVpcId` belongs to.
     */
    ingressVpcOwnerId?: pulumi.Input<string>;
    /**
     * The VSwitch ID that belongs to the Vpc of `ingressVpcId`. Required when `ingressVpcId` is set.
     */
    ingressVswitchId?: pulumi.Input<string>;
    /**
     * The CIDR block for the instance deployment. Valid values are:
     * - `192.168.0.0/16`.
     * - `172.16.0.0/12`.
     */
    instanceCidr?: pulumi.Input<string>;
    /**
     * Instance name.
     */
    instanceName: pulumi.Input<string>;
    /**
     * Instance spec.
     */
    instanceSpec: pulumi.Input<string>;
    /**
     * The type of the instance. Valid values are:
     */
    instanceType?: pulumi.Input<string>;
    /**
     * Specifies whether IPv6 ingress capability is enabled.
     */
    ipv6Enabled?: pulumi.Input<boolean>;
    /**
     * The payment type of the resource.
     */
    paymentType: pulumi.Input<string>;
    /**
     * The subscription instance is of the subscription year or month type. This parameter is required when the Payment type is PrePaid. The value range is as follows:
     */
    pricingCycle?: pulumi.Input<string>;
    /**
     * Specifies whether to skip the WAIT_SWITCH status of instance when modifying instance spec. Works only when instance spec change.
     */
    skipWaitSwitch?: pulumi.Input<boolean>;
    /**
     * The additional IP block that the VPC integration instance can access, conflict with `deleteVpcIpBlock`. See `toConnectVpcIpBlock` below.
     */
    toConnectVpcIpBlock?: pulumi.Input<inputs.apigateway.InstanceToConnectVpcIpBlock>;
    /**
     * User's VpcID.
     */
    userVpcId?: pulumi.Input<string>;
    /**
     * Whether the slb of the Vpc supports.
     */
    vpcSlbIntranetEnable?: pulumi.Input<boolean>;
    /**
     * The zone where the instance is deployed.
     */
    zoneId?: pulumi.Input<string>;
    /**
     * Network configuration details for Vpc integration instance which includes the availability zone, VSwitch, and security group information. See `zoneVswitchSecurityGroup` below.
     */
    zoneVswitchSecurityGroups?: pulumi.Input<pulumi.Input<inputs.apigateway.InstanceZoneVswitchSecurityGroup>[]>;
}
