// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides user-available access groups. Use when you can create mount points
 *
 * > NOTE: Available in 1.35.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.nas.getAccessGroups({
 *     nameRegex: "^foo",
 *     accessGroupType: "Classic",
 *     description: "tf-testAccAccessGroupsdatasource",
 * });
 * export const alicloudNasAccessGroupsId = example.then(example => example.groups?.[0]?.id);
 * ```
 */
export function getAccessGroups(args?: GetAccessGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:nas/getAccessGroups:getAccessGroups", {
        "accessGroupName": args.accessGroupName,
        "accessGroupType": args.accessGroupType,
        "description": args.description,
        "fileSystemType": args.fileSystemType,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "type": args.type,
        "useutcDateTime": args.useutcDateTime,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessGroups.
 */
export interface GetAccessGroupsArgs {
    /**
     * The name of access group.
     */
    accessGroupName?: string;
    /**
     * Filter results by a specific AccessGroupType.
     */
    accessGroupType?: string;
    /**
     * Filter results by a specific Description.
     */
    description?: string;
    /**
     * The type of file system. Valid values: `standard` and `extreme`. Default to `standard`.
     */
    fileSystemType?: string;
    /**
     * A regex string to filter AccessGroups by name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Field `type` has been deprecated from version 1.95.0. Use `accessGroupType` instead.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.
     */
    type?: string;
    /**
     * Specifies whether the time to return is in UTC. Valid values: true and false.
     */
    useutcDateTime?: boolean;
}

/**
 * A collection of values returned by getAccessGroups.
 */
export interface GetAccessGroupsResult {
    /**
     * (Available in 1.95.0+) The name of the AccessGroup.
     */
    readonly accessGroupName?: string;
    /**
     * (Available in 1.95.0+) The type of the AccessGroup.
     */
    readonly accessGroupType?: string;
    /**
     * Description of the AccessGroup.
     */
    readonly description?: string;
    readonly fileSystemType?: string;
    /**
     * A list of AccessGroups. Each element contains the following attributes:
     */
    readonly groups: outputs.nas.GetAccessGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of AccessGroup IDs, the value is set to `names`. After version 1.95.0 the item value as `<access_group_id>:<file_system_type>`.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of AccessGroup names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * (Deprecated in v1.95.0+) AccessGroupType of the AccessGroup. The Field replace by `accessGroupType` after version 1.95.0.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.
     */
    readonly type?: string;
    readonly useutcDateTime?: boolean;
}
/**
 * This data source provides user-available access groups. Use when you can create mount points
 *
 * > NOTE: Available in 1.35.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.nas.getAccessGroups({
 *     nameRegex: "^foo",
 *     accessGroupType: "Classic",
 *     description: "tf-testAccAccessGroupsdatasource",
 * });
 * export const alicloudNasAccessGroupsId = example.then(example => example.groups?.[0]?.id);
 * ```
 */
export function getAccessGroupsOutput(args?: GetAccessGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccessGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:nas/getAccessGroups:getAccessGroups", {
        "accessGroupName": args.accessGroupName,
        "accessGroupType": args.accessGroupType,
        "description": args.description,
        "fileSystemType": args.fileSystemType,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "type": args.type,
        "useutcDateTime": args.useutcDateTime,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessGroups.
 */
export interface GetAccessGroupsOutputArgs {
    /**
     * The name of access group.
     */
    accessGroupName?: pulumi.Input<string>;
    /**
     * Filter results by a specific AccessGroupType.
     */
    accessGroupType?: pulumi.Input<string>;
    /**
     * Filter results by a specific Description.
     */
    description?: pulumi.Input<string>;
    /**
     * The type of file system. Valid values: `standard` and `extreme`. Default to `standard`.
     */
    fileSystemType?: pulumi.Input<string>;
    /**
     * A regex string to filter AccessGroups by name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Field `type` has been deprecated from version 1.95.0. Use `accessGroupType` instead.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.
     */
    type?: pulumi.Input<string>;
    /**
     * Specifies whether the time to return is in UTC. Valid values: true and false.
     */
    useutcDateTime?: pulumi.Input<boolean>;
}
