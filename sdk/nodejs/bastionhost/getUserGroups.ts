// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Bastionhost User Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.132.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.bastionhost.getUserGroups({
 *     instanceId: "bastionhost-cn-xxxx",
 *     ids: [
 *         "1",
 *         "2",
 *     ],
 * });
 * export const bastionhostUserGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * const nameRegex = alicloud.bastionhost.getUserGroups({
 *     instanceId: "bastionhost-cn-xxxx",
 *     nameRegex: "^my-UserGroup",
 * });
 * export const bastionhostUserGroupId2 = nameRegex.then(nameRegex => nameRegex.groups?.[0]?.id);
 * ```
 */
export function getUserGroups(args: GetUserGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetUserGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:bastionhost/getUserGroups:getUserGroups", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "userGroupName": args.userGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserGroups.
 */
export interface GetUserGroupsArgs {
    /**
     * A list of User Group self IDs.
     */
    ids?: string[];
    /**
     * Specify the New Group of the Bastion Host of Instance Id.
     */
    instanceId: string;
    /**
     * A regex string to filter results by User Group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Specify the New Group Name. Supports up to 128 Characters.
     */
    userGroupName?: string;
}

/**
 * A collection of values returned by getUserGroups.
 */
export interface GetUserGroupsResult {
    readonly groups: outputs.bastionhost.GetUserGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly userGroupName?: string;
}
/**
 * This data source provides the Bastionhost User Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.132.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.bastionhost.getUserGroups({
 *     instanceId: "bastionhost-cn-xxxx",
 *     ids: [
 *         "1",
 *         "2",
 *     ],
 * });
 * export const bastionhostUserGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * const nameRegex = alicloud.bastionhost.getUserGroups({
 *     instanceId: "bastionhost-cn-xxxx",
 *     nameRegex: "^my-UserGroup",
 * });
 * export const bastionhostUserGroupId2 = nameRegex.then(nameRegex => nameRegex.groups?.[0]?.id);
 * ```
 */
export function getUserGroupsOutput(args: GetUserGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetUserGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:bastionhost/getUserGroups:getUserGroups", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "userGroupName": args.userGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserGroups.
 */
export interface GetUserGroupsOutputArgs {
    /**
     * A list of User Group self IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specify the New Group of the Bastion Host of Instance Id.
     */
    instanceId: pulumi.Input<string>;
    /**
     * A regex string to filter results by User Group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Specify the New Group Name. Supports up to 128 Characters.
     */
    userGroupName?: pulumi.Input<string>;
}
