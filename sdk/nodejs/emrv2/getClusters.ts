// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Emr Clusters of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.199.0.
 */
export function getClusters(args?: GetClustersArgs, opts?: pulumi.InvokeOptions): Promise<GetClustersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:emrv2/getClusters:getClusters", {
        "clusterName": args.clusterName,
        "clusterStates": args.clusterStates,
        "clusterTypes": args.clusterTypes,
        "ids": args.ids,
        "maxResults": args.maxResults,
        "nameRegex": args.nameRegex,
        "nextToken": args.nextToken,
        "outputFile": args.outputFile,
        "paymentTypes": args.paymentTypes,
        "resourceGroupId": args.resourceGroupId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusters.
 */
export interface GetClustersArgs {
    /**
     * The cluster name.
     */
    clusterName?: string;
    /**
     * The cluster states.
     */
    clusterStates?: string[];
    /**
     * The cluster types.
     */
    clusterTypes?: string[];
    /**
     * A list of Cluster IDs.
     */
    ids?: string[];
    /**
     * The max results is used to list clusters for next page.
     */
    maxResults?: number;
    /**
     * A regex string to filter results by Cluster name.
     */
    nameRegex?: string;
    /**
     * The next token is used to list clusters for next page.
     */
    nextToken?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The cluster payment types.
     */
    paymentTypes?: string[];
    /**
     * The Resource Group ID.
     */
    resourceGroupId?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getClusters.
 */
export interface GetClustersResult {
    /**
     * The name of the emr cluster.
     */
    readonly clusterName?: string;
    readonly clusterStates?: string[];
    readonly clusterTypes?: string[];
    /**
     * A list of Emr Clusters. Each element contains the following attributes:
     */
    readonly clusters: outputs.emrv2.GetClustersCluster[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Cluster IDS.
     */
    readonly ids: string[];
    readonly maxResults?: number;
    readonly nameRegex?: string;
    /**
     * A list of Cluster names.
     */
    readonly names: string[];
    readonly nextToken?: string;
    readonly outputFile?: string;
    readonly paymentTypes?: string[];
    /**
     * The resource group id of the resource.
     */
    readonly resourceGroupId?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: {[key: string]: string};
    /**
     * The total count of list clusters.
     */
    readonly totalCount: number;
}
/**
 * This data source provides the Emr Clusters of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.199.0.
 */
export function getClustersOutput(args?: GetClustersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetClustersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:emrv2/getClusters:getClusters", {
        "clusterName": args.clusterName,
        "clusterStates": args.clusterStates,
        "clusterTypes": args.clusterTypes,
        "ids": args.ids,
        "maxResults": args.maxResults,
        "nameRegex": args.nameRegex,
        "nextToken": args.nextToken,
        "outputFile": args.outputFile,
        "paymentTypes": args.paymentTypes,
        "resourceGroupId": args.resourceGroupId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusters.
 */
export interface GetClustersOutputArgs {
    /**
     * The cluster name.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * The cluster states.
     */
    clusterStates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The cluster types.
     */
    clusterTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of Cluster IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The max results is used to list clusters for next page.
     */
    maxResults?: pulumi.Input<number>;
    /**
     * A regex string to filter results by Cluster name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The next token is used to list clusters for next page.
     */
    nextToken?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The cluster payment types.
     */
    paymentTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Resource Group ID.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
