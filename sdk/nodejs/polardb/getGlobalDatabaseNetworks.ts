// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the PolarDB Global Database Networks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.181.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _this = alicloud.polardb.getNodeClasses({
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     payType: "PostPaid",
 *     category: "Normal",
 * });
 * const _default = new alicloud.vpc.Network("default", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: _default.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _this.then(_this => _this.classes?.[0]?.zoneId),
 *     vswitchName: "terraform-example",
 * });
 * const cluster = new alicloud.polardb.Cluster("cluster", {
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     payType: "PostPaid",
 *     dbNodeCount: 2,
 *     dbNodeClass: _this.then(_this => _this.classes?.[0]?.supportedEngines?.[0]?.availableResources?.[0]?.dbNodeClass),
 *     vswitchId: defaultSwitch.id,
 * });
 * const defaultGlobalDatabaseNetwork = new alicloud.polardb.GlobalDatabaseNetwork("default", {
 *     dbClusterId: cluster.id,
 *     description: cluster.id,
 * });
 * const ids = alicloud.polardb.getGlobalDatabaseNetworksOutput({
 *     ids: [defaultGlobalDatabaseNetwork.id],
 * });
 * export const polardbGlobalDatabaseNetworkId1 = ids.apply(ids => ids.networks?.[0]?.id);
 * const description = alicloud.polardb.getGlobalDatabaseNetworksOutput({
 *     description: defaultGlobalDatabaseNetwork.description,
 * });
 * export const polardbGlobalDatabaseNetworkId2 = description.apply(description => description.networks?.[0]?.id);
 * ```
 */
export function getGlobalDatabaseNetworks(args?: GetGlobalDatabaseNetworksArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalDatabaseNetworksResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:polardb/getGlobalDatabaseNetworks:getGlobalDatabaseNetworks", {
        "dbClusterId": args.dbClusterId,
        "description": args.description,
        "gdnId": args.gdnId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalDatabaseNetworks.
 */
export interface GetGlobalDatabaseNetworksArgs {
    /**
     * The ID of the cluster.
     */
    dbClusterId?: string;
    /**
     * The description of the Global Database Network.
     */
    description?: string;
    /**
     * The ID of the Global Database Network.
     */
    gdnId?: string;
    /**
     * A list of Global Database Network IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The status of the Global Database Network. Valid values:
     */
    status?: string;
}

/**
 * A collection of values returned by getGlobalDatabaseNetworks.
 */
export interface GetGlobalDatabaseNetworksResult {
    /**
     * The ID of the PolarDB cluster.
     */
    readonly dbClusterId?: string;
    /**
     * The description of the Global Database Network.
     */
    readonly description?: string;
    /**
     * The ID of the Global Database Network.
     */
    readonly gdnId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * A list of PolarDB Global Database Networks. Each element contains the following attributes:
     */
    readonly networks: outputs.polardb.GetGlobalDatabaseNetworksNetwork[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * The status of the Global Database Network.
     */
    readonly status?: string;
}
/**
 * This data source provides the PolarDB Global Database Networks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.181.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _this = alicloud.polardb.getNodeClasses({
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     payType: "PostPaid",
 *     category: "Normal",
 * });
 * const _default = new alicloud.vpc.Network("default", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: _default.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _this.then(_this => _this.classes?.[0]?.zoneId),
 *     vswitchName: "terraform-example",
 * });
 * const cluster = new alicloud.polardb.Cluster("cluster", {
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     payType: "PostPaid",
 *     dbNodeCount: 2,
 *     dbNodeClass: _this.then(_this => _this.classes?.[0]?.supportedEngines?.[0]?.availableResources?.[0]?.dbNodeClass),
 *     vswitchId: defaultSwitch.id,
 * });
 * const defaultGlobalDatabaseNetwork = new alicloud.polardb.GlobalDatabaseNetwork("default", {
 *     dbClusterId: cluster.id,
 *     description: cluster.id,
 * });
 * const ids = alicloud.polardb.getGlobalDatabaseNetworksOutput({
 *     ids: [defaultGlobalDatabaseNetwork.id],
 * });
 * export const polardbGlobalDatabaseNetworkId1 = ids.apply(ids => ids.networks?.[0]?.id);
 * const description = alicloud.polardb.getGlobalDatabaseNetworksOutput({
 *     description: defaultGlobalDatabaseNetwork.description,
 * });
 * export const polardbGlobalDatabaseNetworkId2 = description.apply(description => description.networks?.[0]?.id);
 * ```
 */
export function getGlobalDatabaseNetworksOutput(args?: GetGlobalDatabaseNetworksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGlobalDatabaseNetworksResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:polardb/getGlobalDatabaseNetworks:getGlobalDatabaseNetworks", {
        "dbClusterId": args.dbClusterId,
        "description": args.description,
        "gdnId": args.gdnId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalDatabaseNetworks.
 */
export interface GetGlobalDatabaseNetworksOutputArgs {
    /**
     * The ID of the cluster.
     */
    dbClusterId?: pulumi.Input<string>;
    /**
     * The description of the Global Database Network.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Global Database Network.
     */
    gdnId?: pulumi.Input<string>;
    /**
     * A list of Global Database Network IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The status of the Global Database Network. Valid values:
     */
    status?: pulumi.Input<string>;
}
