// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Firewall Vpc Cen Tr Firewall resource.
 *
 * VPC firewall Cloud Enterprise Network Enterprise Edition.
 *
 * For information about Cloud Firewall Vpc Cen Tr Firewall and how to use it, see [What is Vpc Cen Tr Firewall](https://www.alibabacloud.com/help/en/cloud-firewall/cloudfirewall/developer-reference/api-cloudfw-2017-12-07-createtrfirewallv2).
 *
 * > **NOTE:** Available since v1.228.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as time from "@pulumi/time";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const description = config.get("description") || "Created by Terraform";
 * const firewallName = config.get("firewallName") || "tf-example";
 * const trAttachmentMasterCidr = config.get("trAttachmentMasterCidr") || "192.168.3.192/26";
 * const firewallSubnetCidr = config.get("firewallSubnetCidr") || "192.168.3.0/25";
 * const region = config.get("region") || "cn-hangzhou";
 * const trAttachmentSlaveCidr = config.get("trAttachmentSlaveCidr") || "192.168.3.128/26";
 * const firewallVpcCidr = config.get("firewallVpcCidr") || "192.168.3.0/24";
 * const zone1 = config.get("zone1") || "cn-hangzhou-h";
 * const firewallNameUpdate = config.get("firewallNameUpdate") || "tf-example-1";
 * const zone2 = config.get("zone2") || "cn-hangzhou-i";
 * const _default = alicloud.cen.getTransitRouterAvailableResources({});
 * const defaultGetZones = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const cen = new alicloud.cen.Instance("cen", {
 *     description: "terraform example",
 *     cenInstanceName: name,
 * });
 * const tr = new alicloud.cen.TransitRouter("tr", {
 *     transitRouterName: name,
 *     transitRouterDescription: "tr-created-by-terraform",
 *     cenId: cen.id,
 * });
 * const vpc1 = new alicloud.vpc.Network("vpc1", {
 *     description: "created by terraform",
 *     cidrBlock: "192.168.1.0/24",
 *     vpcName: name,
 * });
 * const vpc1vsw1 = new alicloud.vpc.Switch("vpc1vsw1", {
 *     cidrBlock: "192.168.1.0/25",
 *     vswitchName: name,
 *     vpcId: vpc1.id,
 *     zoneId: _default.then(_default => _default.resources?.[0]?.masterZones?.[1]),
 * });
 * const vpc1vsw2 = new alicloud.vpc.Switch("vpc1vsw2", {
 *     vpcId: vpc1.id,
 *     cidrBlock: "192.168.1.128/26",
 *     vswitchName: name,
 *     zoneId: _default.then(_default => _default.resources?.[0]?.masterZones?.[2]),
 * });
 * const foo = new alicloud.vpc.RouteTable("foo", {
 *     vpcId: vpc1.id,
 *     routeTableName: name,
 *     description: name,
 * });
 * const tr_vpc1 = new alicloud.cen.TransitRouterVpcAttachment("tr-vpc1", {
 *     zoneMappings: [
 *         {
 *             vswitchId: vpc1vsw1.id,
 *             zoneId: _default.then(_default => _default.resources?.[0]?.masterZones?.[1]),
 *         },
 *         {
 *             zoneId: _default.then(_default => _default.resources?.[0]?.masterZones?.[2]),
 *             vswitchId: vpc1vsw2.id,
 *         },
 *     ],
 *     vpcId: vpc1.id,
 *     cenId: cen.id,
 *     transitRouterId: tr.transitRouterId,
 * }, {
 *     dependsOn: [foo],
 * });
 * const wait10Minutes = new time.index.Sleep("wait_10_minutes", {createDuration: "10m"}, {
 *     dependsOn: [tr_vpc1],
 * });
 * const defaultVpcCenTrFirewall = new alicloud.cloudfirewall.VpcCenTrFirewall("default", {
 *     cenId: tr_vpc1.cenId,
 *     firewallName: name,
 *     firewallSubnetCidr: firewallSubnetCidr,
 *     trAttachmentSlaveCidr: trAttachmentSlaveCidr,
 *     firewallDescription: "VpcCenTrFirewall created by terraform",
 *     regionNo: region,
 *     trAttachmentMasterCidr: trAttachmentMasterCidr,
 *     firewallVpcCidr: firewallVpcCidr,
 *     transitRouterId: tr.transitRouterId,
 *     routeMode: "managed",
 * }, {
 *     dependsOn: [wait10Minutes],
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Firewall Vpc Cen Tr Firewall can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudfirewall/vpcCenTrFirewall:VpcCenTrFirewall example <id>
 * ```
 */
export class VpcCenTrFirewall extends pulumi.CustomResource {
    /**
     * Get an existing VpcCenTrFirewall resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcCenTrFirewallState, opts?: pulumi.CustomResourceOptions): VpcCenTrFirewall {
        return new VpcCenTrFirewall(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudfirewall/vpcCenTrFirewall:VpcCenTrFirewall';

    /**
     * Returns true if the given object is an instance of VpcCenTrFirewall.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcCenTrFirewall {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcCenTrFirewall.__pulumiType;
    }

    /**
     * The ID of the CEN instance.
     */
    public readonly cenId!: pulumi.Output<string>;
    /**
     * Firewall description.
     */
    public readonly firewallDescription!: pulumi.Output<string | undefined>;
    /**
     * The name of Cloud Firewall.
     */
    public readonly firewallName!: pulumi.Output<string>;
    /**
     * Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
     */
    public readonly firewallSubnetCidr!: pulumi.Output<string>;
    /**
     * Required in automatic mode,  th CIDR of firewall VPC.
     */
    public readonly firewallVpcCidr!: pulumi.Output<string>;
    /**
     * The region ID of the transit router instance.
     */
    public readonly regionNo!: pulumi.Output<string>;
    /**
     * The routing pattern. Value: managed: indicates automatic mode
     */
    public readonly routeMode!: pulumi.Output<string>;
    /**
     * Firewall status. Value:
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
     */
    public readonly trAttachmentMasterCidr!: pulumi.Output<string>;
    /**
     * The primary zone of the switch.
     */
    public readonly trAttachmentMasterZone!: pulumi.Output<string | undefined>;
    /**
     * Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
     */
    public readonly trAttachmentSlaveCidr!: pulumi.Output<string>;
    /**
     * Switch standby area.
     */
    public readonly trAttachmentSlaveZone!: pulumi.Output<string | undefined>;
    /**
     * The ID of the transit router instance.
     */
    public readonly transitRouterId!: pulumi.Output<string>;

    /**
     * Create a VpcCenTrFirewall resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcCenTrFirewallArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcCenTrFirewallArgs | VpcCenTrFirewallState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcCenTrFirewallState | undefined;
            resourceInputs["cenId"] = state ? state.cenId : undefined;
            resourceInputs["firewallDescription"] = state ? state.firewallDescription : undefined;
            resourceInputs["firewallName"] = state ? state.firewallName : undefined;
            resourceInputs["firewallSubnetCidr"] = state ? state.firewallSubnetCidr : undefined;
            resourceInputs["firewallVpcCidr"] = state ? state.firewallVpcCidr : undefined;
            resourceInputs["regionNo"] = state ? state.regionNo : undefined;
            resourceInputs["routeMode"] = state ? state.routeMode : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["trAttachmentMasterCidr"] = state ? state.trAttachmentMasterCidr : undefined;
            resourceInputs["trAttachmentMasterZone"] = state ? state.trAttachmentMasterZone : undefined;
            resourceInputs["trAttachmentSlaveCidr"] = state ? state.trAttachmentSlaveCidr : undefined;
            resourceInputs["trAttachmentSlaveZone"] = state ? state.trAttachmentSlaveZone : undefined;
            resourceInputs["transitRouterId"] = state ? state.transitRouterId : undefined;
        } else {
            const args = argsOrState as VpcCenTrFirewallArgs | undefined;
            if ((!args || args.cenId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenId'");
            }
            if ((!args || args.firewallName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallName'");
            }
            if ((!args || args.firewallSubnetCidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallSubnetCidr'");
            }
            if ((!args || args.firewallVpcCidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallVpcCidr'");
            }
            if ((!args || args.regionNo === undefined) && !opts.urn) {
                throw new Error("Missing required property 'regionNo'");
            }
            if ((!args || args.routeMode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routeMode'");
            }
            if ((!args || args.trAttachmentMasterCidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'trAttachmentMasterCidr'");
            }
            if ((!args || args.trAttachmentSlaveCidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'trAttachmentSlaveCidr'");
            }
            if ((!args || args.transitRouterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterId'");
            }
            resourceInputs["cenId"] = args ? args.cenId : undefined;
            resourceInputs["firewallDescription"] = args ? args.firewallDescription : undefined;
            resourceInputs["firewallName"] = args ? args.firewallName : undefined;
            resourceInputs["firewallSubnetCidr"] = args ? args.firewallSubnetCidr : undefined;
            resourceInputs["firewallVpcCidr"] = args ? args.firewallVpcCidr : undefined;
            resourceInputs["regionNo"] = args ? args.regionNo : undefined;
            resourceInputs["routeMode"] = args ? args.routeMode : undefined;
            resourceInputs["trAttachmentMasterCidr"] = args ? args.trAttachmentMasterCidr : undefined;
            resourceInputs["trAttachmentMasterZone"] = args ? args.trAttachmentMasterZone : undefined;
            resourceInputs["trAttachmentSlaveCidr"] = args ? args.trAttachmentSlaveCidr : undefined;
            resourceInputs["trAttachmentSlaveZone"] = args ? args.trAttachmentSlaveZone : undefined;
            resourceInputs["transitRouterId"] = args ? args.transitRouterId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcCenTrFirewall.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcCenTrFirewall resources.
 */
export interface VpcCenTrFirewallState {
    /**
     * The ID of the CEN instance.
     */
    cenId?: pulumi.Input<string>;
    /**
     * Firewall description.
     */
    firewallDescription?: pulumi.Input<string>;
    /**
     * The name of Cloud Firewall.
     */
    firewallName?: pulumi.Input<string>;
    /**
     * Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
     */
    firewallSubnetCidr?: pulumi.Input<string>;
    /**
     * Required in automatic mode,  th CIDR of firewall VPC.
     */
    firewallVpcCidr?: pulumi.Input<string>;
    /**
     * The region ID of the transit router instance.
     */
    regionNo?: pulumi.Input<string>;
    /**
     * The routing pattern. Value: managed: indicates automatic mode
     */
    routeMode?: pulumi.Input<string>;
    /**
     * Firewall status. Value:
     */
    status?: pulumi.Input<string>;
    /**
     * Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
     */
    trAttachmentMasterCidr?: pulumi.Input<string>;
    /**
     * The primary zone of the switch.
     */
    trAttachmentMasterZone?: pulumi.Input<string>;
    /**
     * Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
     */
    trAttachmentSlaveCidr?: pulumi.Input<string>;
    /**
     * Switch standby area.
     */
    trAttachmentSlaveZone?: pulumi.Input<string>;
    /**
     * The ID of the transit router instance.
     */
    transitRouterId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VpcCenTrFirewall resource.
 */
export interface VpcCenTrFirewallArgs {
    /**
     * The ID of the CEN instance.
     */
    cenId: pulumi.Input<string>;
    /**
     * Firewall description.
     */
    firewallDescription?: pulumi.Input<string>;
    /**
     * The name of Cloud Firewall.
     */
    firewallName: pulumi.Input<string>;
    /**
     * Required in automatic mode, the CIDR of subnet used to store the firewall ENI in the firewall VPC.
     */
    firewallSubnetCidr: pulumi.Input<string>;
    /**
     * Required in automatic mode,  th CIDR of firewall VPC.
     */
    firewallVpcCidr: pulumi.Input<string>;
    /**
     * The region ID of the transit router instance.
     */
    regionNo: pulumi.Input<string>;
    /**
     * The routing pattern. Value: managed: indicates automatic mode
     */
    routeMode: pulumi.Input<string>;
    /**
     * Required in automatic mode, the primary CIDR of network used to connect to the TR in the firewall VPC.
     */
    trAttachmentMasterCidr: pulumi.Input<string>;
    /**
     * The primary zone of the switch.
     */
    trAttachmentMasterZone?: pulumi.Input<string>;
    /**
     * Required in automatic mode, the the secondary CIDR of the subnet in the firewall VPC used to connect to TR.
     */
    trAttachmentSlaveCidr: pulumi.Input<string>;
    /**
     * Switch standby area.
     */
    trAttachmentSlaveZone?: pulumi.Input<string>;
    /**
     * The ID of the transit router instance.
     */
    transitRouterId: pulumi.Input<string>;
}
