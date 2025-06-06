// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cloud Sso Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.138.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cloudsso.getGroups({
 *     directoryId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const cloudSsoGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * const nameRegex = alicloud.cloudsso.getGroups({
 *     directoryId: "example_value",
 *     nameRegex: "^my-Group",
 * });
 * export const cloudSsoGroupId2 = nameRegex.then(nameRegex => nameRegex.groups?.[0]?.id);
 * ```
 */
export function getGroups(args: GetGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cloudsso/getGroups:getGroups", {
        "directoryId": args.directoryId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "provisionType": args.provisionType,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsArgs {
    /**
     * The ID of the Directory.
     */
    directoryId: string;
    /**
     * A list of Group IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ProvisionType of the Group. Valid values: `Manual`, `Synchronized`.
     */
    provisionType?: string;
}

/**
 * A collection of values returned by getGroups.
 */
export interface GetGroupsResult {
    readonly directoryId: string;
    readonly groups: outputs.cloudsso.GetGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly provisionType?: string;
}
/**
 * This data source provides the Cloud Sso Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.138.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cloudsso.getGroups({
 *     directoryId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const cloudSsoGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * const nameRegex = alicloud.cloudsso.getGroups({
 *     directoryId: "example_value",
 *     nameRegex: "^my-Group",
 * });
 * export const cloudSsoGroupId2 = nameRegex.then(nameRegex => nameRegex.groups?.[0]?.id);
 * ```
 */
export function getGroupsOutput(args: GetGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cloudsso/getGroups:getGroups", {
        "directoryId": args.directoryId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "provisionType": args.provisionType,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsOutputArgs {
    /**
     * The ID of the Directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * A list of Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ProvisionType of the Group. Valid values: `Manual`, `Synchronized`.
     */
    provisionType?: pulumi.Input<string>;
}
