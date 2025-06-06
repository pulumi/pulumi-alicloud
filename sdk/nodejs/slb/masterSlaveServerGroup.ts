// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A master slave server group contains two ECS instances. The master slave server group can help you to define multiple listening dimension.
 *
 * > **NOTE:** One ECS instance can be added into multiple master slave server groups.
 *
 * > **NOTE:** One master slave server group can only add two ECS instances, which are master server and slave server.
 *
 * > **NOTE:** One master slave server group can be attached with tcp/udp listeners in one load balancer.
 *
 * > **NOTE:** One Classic and Internet load balancer, its master slave server group can add Classic and VPC ECS instances.
 *
 * > **NOTE:** One Classic and Intranet load balancer, its master slave server group can only add Classic ECS instances.
 *
 * > **NOTE:** One VPC load balancer, its master slave server group can only add the same VPC ECS instances.
 *
 * > **NOTE:** Available since v1.54.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const msServerGroup = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const msServerGroupGetInstanceTypes = msServerGroup.then(msServerGroup => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: msServerGroup.zones?.[0]?.id,
 *     cpuCoreCount: 2,
 *     memorySize: 8,
 *     instanceTypeFamily: "ecs.g6",
 * }));
 * const image = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_18.*64",
 *     mostRecent: true,
 *     owners: "system",
 * });
 * const config = new pulumi.Config();
 * const slbMasterSlaveServerGroup = config.get("slbMasterSlaveServerGroup") || "forSlbMasterSlaveServerGroup";
 * const main = new alicloud.vpc.Network("main", {
 *     vpcName: slbMasterSlaveServerGroup,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const mainSwitch = new alicloud.vpc.Switch("main", {
 *     vpcId: main.id,
 *     cidrBlock: "172.16.0.0/16",
 *     zoneId: msServerGroup.then(msServerGroup => msServerGroup.zones?.[0]?.id),
 *     vswitchName: slbMasterSlaveServerGroup,
 * });
 * const group = new alicloud.ecs.SecurityGroup("group", {
 *     securityGroupName: slbMasterSlaveServerGroup,
 *     vpcId: main.id,
 * });
 * const msServerGroupInstance: alicloud.ecs.Instance[] = [];
 * for (const range = {value: 0}; range.value < 2; range.value++) {
 *     msServerGroupInstance.push(new alicloud.ecs.Instance(`ms_server_group-${range.value}`, {
 *         imageId: image.then(image => image.images?.[0]?.id),
 *         instanceType: msServerGroupGetInstanceTypes.then(msServerGroupGetInstanceTypes => msServerGroupGetInstanceTypes.instanceTypes?.[0]?.id),
 *         instanceName: slbMasterSlaveServerGroup,
 *         securityGroups: [group.id],
 *         internetChargeType: "PayByTraffic",
 *         internetMaxBandwidthOut: 10,
 *         availabilityZone: msServerGroup.then(msServerGroup => msServerGroup.zones?.[0]?.id),
 *         instanceChargeType: "PostPaid",
 *         systemDiskCategory: "cloud_efficiency",
 *         vswitchId: mainSwitch.id,
 *     }));
 * }
 * const msServerGroupApplicationLoadBalancer = new alicloud.slb.ApplicationLoadBalancer("ms_server_group", {
 *     loadBalancerName: slbMasterSlaveServerGroup,
 *     vswitchId: mainSwitch.id,
 *     loadBalancerSpec: "slb.s2.small",
 * });
 * const msServerGroupEcsNetworkInterface = new alicloud.ecs.EcsNetworkInterface("ms_server_group", {
 *     networkInterfaceName: slbMasterSlaveServerGroup,
 *     vswitchId: mainSwitch.id,
 *     securityGroupIds: [group.id],
 * });
 * const msServerGroupEcsNetworkInterfaceAttachment = new alicloud.ecs.EcsNetworkInterfaceAttachment("ms_server_group", {
 *     instanceId: msServerGroupInstance[0].id,
 *     networkInterfaceId: msServerGroupEcsNetworkInterface.id,
 * });
 * const groupMasterSlaveServerGroup = new alicloud.slb.MasterSlaveServerGroup("group", {
 *     loadBalancerId: msServerGroupApplicationLoadBalancer.id,
 *     name: slbMasterSlaveServerGroup,
 *     servers: [
 *         {
 *             serverId: msServerGroupInstance[0].id,
 *             port: 100,
 *             weight: 100,
 *             serverType: "Master",
 *         },
 *         {
 *             serverId: msServerGroupInstance[1].id,
 *             port: 100,
 *             weight: 100,
 *             serverType: "Slave",
 *         },
 *     ],
 * });
 * const tcp = new alicloud.slb.Listener("tcp", {
 *     loadBalancerId: msServerGroupApplicationLoadBalancer.id,
 *     masterSlaveServerGroupId: groupMasterSlaveServerGroup.id,
 *     frontendPort: 22,
 *     protocol: "tcp",
 *     bandwidth: 10,
 *     healthCheckType: "tcp",
 *     persistenceTimeout: 3600,
 *     healthyThreshold: 8,
 *     unhealthyThreshold: 8,
 *     healthCheckTimeout: 8,
 *     healthCheckInterval: 5,
 *     healthCheckHttpCode: "http_2xx",
 *     healthCheckConnectPort: 20,
 *     healthCheckUri: "/console",
 *     establishedTimeout: 600,
 * });
 * ```
 *
 * ## Import
 *
 * Load balancer master slave server group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:slb/masterSlaveServerGroup:MasterSlaveServerGroup example abc123456
 * ```
 */
export class MasterSlaveServerGroup extends pulumi.CustomResource {
    /**
     * Get an existing MasterSlaveServerGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MasterSlaveServerGroupState, opts?: pulumi.CustomResourceOptions): MasterSlaveServerGroup {
        return new MasterSlaveServerGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:slb/masterSlaveServerGroup:MasterSlaveServerGroup';

    /**
     * Returns true if the given object is an instance of MasterSlaveServerGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MasterSlaveServerGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MasterSlaveServerGroup.__pulumiType;
    }

    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    public readonly deleteProtectionValidation!: pulumi.Output<boolean | undefined>;
    /**
     * The Load Balancer ID which is used to launch a new master slave server group.
     */
    public readonly loadBalancerId!: pulumi.Output<string>;
    /**
     * Name of the master slave server group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of ECS instances to be added. Only two ECS instances can be supported in one resource. See `servers` below.
     */
    public readonly servers!: pulumi.Output<outputs.slb.MasterSlaveServerGroupServer[] | undefined>;

    /**
     * Create a MasterSlaveServerGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MasterSlaveServerGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MasterSlaveServerGroupArgs | MasterSlaveServerGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MasterSlaveServerGroupState | undefined;
            resourceInputs["deleteProtectionValidation"] = state ? state.deleteProtectionValidation : undefined;
            resourceInputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["servers"] = state ? state.servers : undefined;
        } else {
            const args = argsOrState as MasterSlaveServerGroupArgs | undefined;
            if ((!args || args.loadBalancerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            resourceInputs["deleteProtectionValidation"] = args ? args.deleteProtectionValidation : undefined;
            resourceInputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["servers"] = args ? args.servers : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MasterSlaveServerGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MasterSlaveServerGroup resources.
 */
export interface MasterSlaveServerGroupState {
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    deleteProtectionValidation?: pulumi.Input<boolean>;
    /**
     * The Load Balancer ID which is used to launch a new master slave server group.
     */
    loadBalancerId?: pulumi.Input<string>;
    /**
     * Name of the master slave server group.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of ECS instances to be added. Only two ECS instances can be supported in one resource. See `servers` below.
     */
    servers?: pulumi.Input<pulumi.Input<inputs.slb.MasterSlaveServerGroupServer>[]>;
}

/**
 * The set of arguments for constructing a MasterSlaveServerGroup resource.
 */
export interface MasterSlaveServerGroupArgs {
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    deleteProtectionValidation?: pulumi.Input<boolean>;
    /**
     * The Load Balancer ID which is used to launch a new master slave server group.
     */
    loadBalancerId: pulumi.Input<string>;
    /**
     * Name of the master slave server group.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of ECS instances to be added. Only two ECS instances can be supported in one resource. See `servers` below.
     */
    servers?: pulumi.Input<pulumi.Input<inputs.slb.MasterSlaveServerGroupServer>[]>;
}
