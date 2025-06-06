// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **DEPRECATED:** This datasource has been renamed to alicloud.slb.getApplicationLoadBalancers from version 1.123.1.
 *
 * This data source provides the server load balancers of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.slb.LoadBalancer("default", {name: "sample_slb"});
 * const slbsDs = alicloud.slb.getLoadBalancers({
 *     nameRegex: "sample_slb",
 * });
 * export const firstSlbId = slbsDs.then(slbsDs => slbsDs.slbs?.[0]?.id);
 * ```
 */
export function getLoadBalancers(args?: GetLoadBalancersArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:slb/getLoadBalancers:getLoadBalancers", {
        "address": args.address,
        "addressIpVersion": args.addressIpVersion,
        "addressType": args.addressType,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "internetChargeType": args.internetChargeType,
        "loadBalancerName": args.loadBalancerName,
        "masterZoneId": args.masterZoneId,
        "nameRegex": args.nameRegex,
        "networkType": args.networkType,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "paymentType": args.paymentType,
        "resourceGroupId": args.resourceGroupId,
        "serverId": args.serverId,
        "serverIntranetAddress": args.serverIntranetAddress,
        "slaveZoneId": args.slaveZoneId,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancers.
 */
export interface GetLoadBalancersArgs {
    /**
     * Service address of the SLBs.
     */
    address?: string;
    addressIpVersion?: string;
    addressType?: string;
    enableDetails?: boolean;
    /**
     * A list of SLBs IDs.
     */
    ids?: string[];
    internetChargeType?: string;
    loadBalancerName?: string;
    masterZoneId?: string;
    /**
     * A regex string to filter results by SLB name.
     */
    nameRegex?: string;
    /**
     * Network type of the SLBs. Valid values: `vpc` and `classic`.
     */
    networkType?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    paymentType?: string;
    /**
     * The Id of resource group which SLB belongs.
     */
    resourceGroupId?: string;
    serverId?: string;
    serverIntranetAddress?: string;
    slaveZoneId?: string;
    /**
     * SLB current status. Possible values: `inactive`, `active` and `locked`.
     */
    status?: string;
    /**
     * A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as alicloud from "@pulumi/alicloud";
     *
     * const taggedInstances = alicloud.slb.getLoadBalancers({
     *     tags: {
     *         tagKey1: "tagValue1",
     *         tagKey2: "tagValue2",
     *     },
     * });
     * ```
     */
    tags?: {[key: string]: string};
    /**
     * ID of the VPC linked to the SLBs.
     */
    vpcId?: string;
    /**
     * ID of the vSwitch linked to the SLBs.
     */
    vswitchId?: string;
}

/**
 * A collection of values returned by getLoadBalancers.
 */
export interface GetLoadBalancersResult {
    /**
     * Service address of the SLB.
     */
    readonly address?: string;
    readonly addressIpVersion?: string;
    readonly addressType?: string;
    readonly balancers: outputs.slb.GetLoadBalancersBalancer[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of slb IDs.
     */
    readonly ids: string[];
    readonly internetChargeType?: string;
    readonly loadBalancerName?: string;
    readonly masterZoneId?: string;
    readonly nameRegex?: string;
    /**
     * A list of slb names.
     */
    readonly names: string[];
    /**
     * Network type of the SLB. Possible values: `vpc` and `classic`.
     */
    readonly networkType?: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly paymentType?: string;
    readonly resourceGroupId?: string;
    readonly serverId?: string;
    readonly serverIntranetAddress?: string;
    readonly slaveZoneId?: string;
    /**
     * A list of SLBs. Each element contains the following attributes:
     *
     * @deprecated Field 'slbs' has deprecated from v1.123.1 and replace by 'balancers'.
     */
    readonly slbs: outputs.slb.GetLoadBalancersSlb[];
    /**
     * SLB current status. Possible values: `inactive`, `active` and `locked`.
     */
    readonly status?: string;
    /**
     * A map of tags assigned to the SLB instance.
     */
    readonly tags?: {[key: string]: string};
    readonly totalCount: number;
    /**
     * ID of the VPC the SLB belongs to.
     */
    readonly vpcId?: string;
    /**
     * ID of the vSwitch the SLB belongs to.
     */
    readonly vswitchId?: string;
}
/**
 * > **DEPRECATED:** This datasource has been renamed to alicloud.slb.getApplicationLoadBalancers from version 1.123.1.
 *
 * This data source provides the server load balancers of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.slb.LoadBalancer("default", {name: "sample_slb"});
 * const slbsDs = alicloud.slb.getLoadBalancers({
 *     nameRegex: "sample_slb",
 * });
 * export const firstSlbId = slbsDs.then(slbsDs => slbsDs.slbs?.[0]?.id);
 * ```
 */
export function getLoadBalancersOutput(args?: GetLoadBalancersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLoadBalancersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:slb/getLoadBalancers:getLoadBalancers", {
        "address": args.address,
        "addressIpVersion": args.addressIpVersion,
        "addressType": args.addressType,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "internetChargeType": args.internetChargeType,
        "loadBalancerName": args.loadBalancerName,
        "masterZoneId": args.masterZoneId,
        "nameRegex": args.nameRegex,
        "networkType": args.networkType,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "paymentType": args.paymentType,
        "resourceGroupId": args.resourceGroupId,
        "serverId": args.serverId,
        "serverIntranetAddress": args.serverIntranetAddress,
        "slaveZoneId": args.slaveZoneId,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancers.
 */
export interface GetLoadBalancersOutputArgs {
    /**
     * Service address of the SLBs.
     */
    address?: pulumi.Input<string>;
    addressIpVersion?: pulumi.Input<string>;
    addressType?: pulumi.Input<string>;
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of SLBs IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    internetChargeType?: pulumi.Input<string>;
    loadBalancerName?: pulumi.Input<string>;
    masterZoneId?: pulumi.Input<string>;
    /**
     * A regex string to filter results by SLB name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * Network type of the SLBs. Valid values: `vpc` and `classic`.
     */
    networkType?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    paymentType?: pulumi.Input<string>;
    /**
     * The Id of resource group which SLB belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    serverId?: pulumi.Input<string>;
    serverIntranetAddress?: pulumi.Input<string>;
    slaveZoneId?: pulumi.Input<string>;
    /**
     * SLB current status. Possible values: `inactive`, `active` and `locked`.
     */
    status?: pulumi.Input<string>;
    /**
     * A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as alicloud from "@pulumi/alicloud";
     *
     * const taggedInstances = alicloud.slb.getLoadBalancers({
     *     tags: {
     *         tagKey1: "tagValue1",
     *         tagKey2: "tagValue2",
     *     },
     * });
     * ```
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * ID of the VPC linked to the SLBs.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * ID of the vSwitch linked to the SLBs.
     */
    vswitchId?: pulumi.Input<string>;
}
