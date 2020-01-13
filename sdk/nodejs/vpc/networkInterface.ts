// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides an ECS Elastic Network Interface resource.
 * 
 * For information about Elastic Network Interface and how to use it, see [Elastic Network Interface](https://www.alibabacloud.com/help/doc-detail/58496.html).
 * 
 * > **NOTE** Only one of privateIps or privateIpsCount can be specified when assign private IPs. 
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const config = new pulumi.Config();
 * const name = config.get("name") || "networkInterfaceName";
 * 
 * const vpc = new alicloud.vpc.Network("vpc", {
 *     cidrBlock: "192.168.0.0/24",
 * });
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const vswitch = new alicloud.vpc.Switch("vswitch", {
 *     availabilityZone: defaultZones.zones[0].id,
 *     cidrBlock: "192.168.0.0/24",
 *     vpcId: vpc.id,
 * });
 * const group = new alicloud.ecs.SecurityGroup("group", {
 *     vpcId: vpc.id,
 * });
 * const defaultNetworkInterface = new alicloud.vpc.NetworkInterface("default", {
 *     privateIp: "192.168.0.2",
 *     privateIpsCount: 3,
 *     securityGroups: [group.id],
 *     vswitchId: vswitch.id,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/network_interface.html.markdown.
 */
export class NetworkInterface extends pulumi.CustomResource {
    /**
     * Get an existing NetworkInterface resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkInterfaceState, opts?: pulumi.CustomResourceOptions): NetworkInterface {
        return new NetworkInterface(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/networkInterface:NetworkInterface';

    /**
     * Returns true if the given object is an instance of NetworkInterface.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkInterface {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkInterface.__pulumiType;
    }

    /**
     * Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * (Available in 1.54.0+) The MAC address of an ENI.
     */
    public /*out*/ readonly mac!: pulumi.Output<string>;
    /**
     * Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The primary private IP of the ENI.
     */
    public readonly privateIp!: pulumi.Output<string>;
    /**
     * List of secondary private IPs to assign to the ENI. Don't use both privateIps and privateIpsCount in the same ENI resource block.
     */
    public readonly privateIps!: pulumi.Output<string[]>;
    /**
     * Number of secondary private IPs to assign to the ENI. Don't use both privateIps and privateIpsCount in the same ENI resource block.
     */
    public readonly privateIpsCount!: pulumi.Output<number>;
    /**
     * The Id of resource group which the network interface belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;
    /**
     * A list of security group ids to associate with.
     */
    public readonly securityGroups!: pulumi.Output<string[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The VSwitch to create the ENI in.
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a NetworkInterface resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkInterfaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkInterfaceArgs | NetworkInterfaceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as NetworkInterfaceState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["mac"] = state ? state.mac : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["privateIp"] = state ? state.privateIp : undefined;
            inputs["privateIps"] = state ? state.privateIps : undefined;
            inputs["privateIpsCount"] = state ? state.privateIpsCount : undefined;
            inputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            inputs["securityGroups"] = state ? state.securityGroups : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as NetworkInterfaceArgs | undefined;
            if (!args || args.securityGroups === undefined) {
                throw new Error("Missing required property 'securityGroups'");
            }
            if (!args || args.vswitchId === undefined) {
                throw new Error("Missing required property 'vswitchId'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["privateIp"] = args ? args.privateIp : undefined;
            inputs["privateIps"] = args ? args.privateIps : undefined;
            inputs["privateIpsCount"] = args ? args.privateIpsCount : undefined;
            inputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            inputs["securityGroups"] = args ? args.securityGroups : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
            inputs["mac"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(NetworkInterface.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkInterface resources.
 */
export interface NetworkInterfaceState {
    /**
     * Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * (Available in 1.54.0+) The MAC address of an ENI.
     */
    readonly mac?: pulumi.Input<string>;
    /**
     * Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The primary private IP of the ENI.
     */
    readonly privateIp?: pulumi.Input<string>;
    /**
     * List of secondary private IPs to assign to the ENI. Don't use both privateIps and privateIpsCount in the same ENI resource block.
     */
    readonly privateIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Number of secondary private IPs to assign to the ENI. Don't use both privateIps and privateIpsCount in the same ENI resource block.
     */
    readonly privateIpsCount?: pulumi.Input<number>;
    /**
     * The Id of resource group which the network interface belongs.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * A list of security group ids to associate with.
     */
    readonly securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The VSwitch to create the ENI in.
     */
    readonly vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkInterface resource.
 */
export interface NetworkInterfaceArgs {
    /**
     * Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The primary private IP of the ENI.
     */
    readonly privateIp?: pulumi.Input<string>;
    /**
     * List of secondary private IPs to assign to the ENI. Don't use both privateIps and privateIpsCount in the same ENI resource block.
     */
    readonly privateIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Number of secondary private IPs to assign to the ENI. Don't use both privateIps and privateIpsCount in the same ENI resource block.
     */
    readonly privateIpsCount?: pulumi.Input<number>;
    /**
     * The Id of resource group which the network interface belongs.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * A list of security group ids to associate with.
     */
    readonly securityGroups: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The VSwitch to create the ENI in.
     */
    readonly vswitchId: pulumi.Input<string>;
}