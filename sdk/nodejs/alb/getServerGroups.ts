// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Alb Server Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.131.0.
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
 * const _default = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "192.168.0.0/16",
 * });
 * const defaultServerGroup = new alicloud.alb.ServerGroup("default", {
 *     protocol: "HTTP",
 *     vpcId: _default.id,
 *     serverGroupName: name,
 *     healthCheckConfig: {
 *         healthCheckEnabled: false,
 *     },
 *     stickySessionConfig: {
 *         stickySessionEnabled: false,
 *     },
 * });
 * const ids = alicloud.alb.getServerGroupsOutput({
 *     ids: [defaultServerGroup.id],
 * });
 * export const albServerGroupId0 = ids.apply(ids => ids.groups?.[0]?.id);
 * ```
 */
export function getServerGroups(args?: GetServerGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetServerGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:alb/getServerGroups:getServerGroups", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "serverGroupIds": args.serverGroupIds,
        "serverGroupName": args.serverGroupName,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsArgs {
    /**
     * Whether to query the detailed list of resource attributes. Default value: `false`.
     */
    enableDetails?: boolean;
    /**
     * A list of Server Group IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Server Group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: string;
    /**
     * The server group IDs.
     */
    serverGroupIds?: string[];
    /**
     * The names of the Server Group.
     */
    serverGroupName?: string;
    /**
     * The status of the Server Group. Valid values: `Available`, `Configuring`, `Provisioning`.
     */
    status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: string};
    /**
     * The ID of the virtual private cloud (VPC).
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getServerGroups.
 */
export interface GetServerGroupsResult {
    readonly enableDetails?: boolean;
    /**
     * A list of Server Groups. Each element contains the following attributes:
     */
    readonly groups: outputs.alb.GetServerGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Server Group names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly serverGroupIds?: string[];
    /**
     * The name of the Server Group.
     */
    readonly serverGroupName?: string;
    /**
     * The status of the server.
     */
    readonly status?: string;
    /**
     * The tags of the resource. **Note:** `tags` takes effect only if `enableDetails` is set to `true`.
     */
    readonly tags?: {[key: string]: string};
    /**
     * The ID of the VPC.
     */
    readonly vpcId?: string;
}
/**
 * This data source provides the Alb Server Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.131.0.
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
 * const _default = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "192.168.0.0/16",
 * });
 * const defaultServerGroup = new alicloud.alb.ServerGroup("default", {
 *     protocol: "HTTP",
 *     vpcId: _default.id,
 *     serverGroupName: name,
 *     healthCheckConfig: {
 *         healthCheckEnabled: false,
 *     },
 *     stickySessionConfig: {
 *         stickySessionEnabled: false,
 *     },
 * });
 * const ids = alicloud.alb.getServerGroupsOutput({
 *     ids: [defaultServerGroup.id],
 * });
 * export const albServerGroupId0 = ids.apply(ids => ids.groups?.[0]?.id);
 * ```
 */
export function getServerGroupsOutput(args?: GetServerGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServerGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:alb/getServerGroups:getServerGroups", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "serverGroupIds": args.serverGroupIds,
        "serverGroupName": args.serverGroupName,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsOutputArgs {
    /**
     * Whether to query the detailed list of resource attributes. Default value: `false`.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Server Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Server Group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The server group IDs.
     */
    serverGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The names of the Server Group.
     */
    serverGroupName?: pulumi.Input<string>;
    /**
     * The status of the Server Group. Valid values: `Available`, `Configuring`, `Provisioning`.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the virtual private cloud (VPC).
     */
    vpcId?: pulumi.Input<string>;
}
