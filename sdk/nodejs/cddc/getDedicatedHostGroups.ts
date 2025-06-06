// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cddc Dedicated Host Groups of the current Alibaba Cloud user.
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
 * const _default = alicloud.cddc.getDedicatedHostGroups({
 *     engine: "MongoDB",
 * });
 * export const cddcDedicatedHostGroupId = _default.then(_default => _default.id);
 * ```
 */
export function getDedicatedHostGroups(args?: GetDedicatedHostGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetDedicatedHostGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cddc/getDedicatedHostGroups:getDedicatedHostGroups", {
        "engine": args.engine,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDedicatedHostGroups.
 */
export interface GetDedicatedHostGroupsArgs {
    /**
     * Database Engine Type. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
     */
    engine?: string;
    /**
     * A list of Dedicated Host Group IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Dedicated Host Group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getDedicatedHostGroups.
 */
export interface GetDedicatedHostGroupsResult {
    readonly engine?: string;
    readonly groups: outputs.cddc.GetDedicatedHostGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the Cddc Dedicated Host Groups of the current Alibaba Cloud user.
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
 * const _default = alicloud.cddc.getDedicatedHostGroups({
 *     engine: "MongoDB",
 * });
 * export const cddcDedicatedHostGroupId = _default.then(_default => _default.id);
 * ```
 */
export function getDedicatedHostGroupsOutput(args?: GetDedicatedHostGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDedicatedHostGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cddc/getDedicatedHostGroups:getDedicatedHostGroups", {
        "engine": args.engine,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDedicatedHostGroups.
 */
export interface GetDedicatedHostGroupsOutputArgs {
    /**
     * Database Engine Type. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
     */
    engine?: pulumi.Input<string>;
    /**
     * A list of Dedicated Host Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Dedicated Host Group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
