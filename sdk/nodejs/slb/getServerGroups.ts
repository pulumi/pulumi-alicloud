// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the VServer groups related to a server load balancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "slbservergroups";
 * const _default = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/16",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: name,
 * });
 * const defaultApplicationLoadBalancer = new alicloud.slb.ApplicationLoadBalancer("default", {
 *     loadBalancerName: name,
 *     vswitchId: defaultSwitch.id,
 * });
 * const defaultServerGroup = new alicloud.slb.ServerGroup("default", {loadBalancerId: defaultApplicationLoadBalancer.id});
 * const sampleDs = alicloud.slb.getServerGroupsOutput({
 *     loadBalancerId: defaultApplicationLoadBalancer.id,
 * });
 * export const firstSlbServerGroupId = sampleDs.apply(sampleDs => sampleDs.slbServerGroups?.[0]?.id);
 * ```
 */
export function getServerGroups(args: GetServerGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetServerGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:slb/getServerGroups:getServerGroups", {
        "ids": args.ids,
        "loadBalancerId": args.loadBalancerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsArgs {
    /**
     * A list of VServer group IDs to filter results.
     */
    ids?: string[];
    /**
     * ID of the SLB.
     */
    loadBalancerId: string;
    /**
     * A regex string to filter results by VServer group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getServerGroups.
 */
export interface GetServerGroupsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of SLB VServer groups IDs.
     */
    readonly ids: string[];
    readonly loadBalancerId: string;
    readonly nameRegex?: string;
    /**
     * A list of SLB VServer groups names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of SLB VServer groups. Each element contains the following attributes:
     */
    readonly slbServerGroups: outputs.slb.GetServerGroupsSlbServerGroup[];
}
/**
 * This data source provides the VServer groups related to a server load balancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "slbservergroups";
 * const _default = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/16",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: name,
 * });
 * const defaultApplicationLoadBalancer = new alicloud.slb.ApplicationLoadBalancer("default", {
 *     loadBalancerName: name,
 *     vswitchId: defaultSwitch.id,
 * });
 * const defaultServerGroup = new alicloud.slb.ServerGroup("default", {loadBalancerId: defaultApplicationLoadBalancer.id});
 * const sampleDs = alicloud.slb.getServerGroupsOutput({
 *     loadBalancerId: defaultApplicationLoadBalancer.id,
 * });
 * export const firstSlbServerGroupId = sampleDs.apply(sampleDs => sampleDs.slbServerGroups?.[0]?.id);
 * ```
 */
export function getServerGroupsOutput(args: GetServerGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServerGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:slb/getServerGroups:getServerGroups", {
        "ids": args.ids,
        "loadBalancerId": args.loadBalancerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsOutputArgs {
    /**
     * A list of VServer group IDs to filter results.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the SLB.
     */
    loadBalancerId: pulumi.Input<string>;
    /**
     * A regex string to filter results by VServer group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
