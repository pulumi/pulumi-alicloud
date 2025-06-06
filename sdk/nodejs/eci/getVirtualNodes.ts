// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Eci Virtual Nodes of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.145.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.eci.getVirtualNodes({
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const eciVirtualNodeId1 = ids.then(ids => ids.nodes?.[0]?.id);
 * const nameRegex = alicloud.eci.getVirtualNodes({
 *     nameRegex: "^my-VirtualNode",
 * });
 * export const eciVirtualNodeId2 = nameRegex.then(nameRegex => nameRegex.nodes?.[0]?.id);
 * ```
 */
export function getVirtualNodes(args?: GetVirtualNodesArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualNodesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:eci/getVirtualNodes:getVirtualNodes", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "securityGroupId": args.securityGroupId,
        "status": args.status,
        "tags": args.tags,
        "virtualNodeName": args.virtualNodeName,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualNodes.
 */
export interface GetVirtualNodesArgs {
    /**
     * A list of Virtual Node IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Virtual Node name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The resource group ID. If when you create a GPU does not specify a resource group instance will automatically add the account's default resource group.
     */
    resourceGroupId?: string;
    /**
     * VNode itself and by VNode created (ECI) the security group used by.
     */
    securityGroupId?: string;
    /**
     * The Status of the virtual node. Valid values: `Cleaned`, `Failed`, `Pending`, `Ready`.
     */
    status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: string};
    /**
     * The name of the virtual node.
     */
    virtualNodeName?: string;
    vswitchId?: string;
}

/**
 * A collection of values returned by getVirtualNodes.
 */
export interface GetVirtualNodesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly nodes: outputs.eci.GetVirtualNodesNode[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly securityGroupId?: string;
    readonly status?: string;
    readonly tags?: {[key: string]: string};
    readonly virtualNodeName?: string;
    readonly vswitchId?: string;
}
/**
 * This data source provides the Eci Virtual Nodes of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.145.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.eci.getVirtualNodes({
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const eciVirtualNodeId1 = ids.then(ids => ids.nodes?.[0]?.id);
 * const nameRegex = alicloud.eci.getVirtualNodes({
 *     nameRegex: "^my-VirtualNode",
 * });
 * export const eciVirtualNodeId2 = nameRegex.then(nameRegex => nameRegex.nodes?.[0]?.id);
 * ```
 */
export function getVirtualNodesOutput(args?: GetVirtualNodesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVirtualNodesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:eci/getVirtualNodes:getVirtualNodes", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "securityGroupId": args.securityGroupId,
        "status": args.status,
        "tags": args.tags,
        "virtualNodeName": args.virtualNodeName,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualNodes.
 */
export interface GetVirtualNodesOutputArgs {
    /**
     * A list of Virtual Node IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Virtual Node name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The resource group ID. If when you create a GPU does not specify a resource group instance will automatically add the account's default resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * VNode itself and by VNode created (ECI) the security group used by.
     */
    securityGroupId?: pulumi.Input<string>;
    /**
     * The Status of the virtual node. Valid values: `Cleaned`, `Failed`, `Pending`, `Ready`.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the virtual node.
     */
    virtualNodeName?: pulumi.Input<string>;
    vswitchId?: pulumi.Input<string>;
}
