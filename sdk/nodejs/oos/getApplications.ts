// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Oos Applications of the current Alibaba Cloud user.
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
 * const ids = alicloud.oos.getApplications({});
 * export const oosApplicationId1 = ids.then(ids => ids.applications?.[0]?.id);
 * const nameRegex = alicloud.oos.getApplications({
 *     nameRegex: "^my-Application",
 * });
 * export const oosApplicationId2 = nameRegex.then(nameRegex => nameRegex.applications?.[0]?.id);
 * ```
 */
export function getApplications(args?: GetApplicationsArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:oos/getApplications:getApplications", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplications.
 */
export interface GetApplicationsArgs {
    /**
     * A list of Application IDs. Its element value is same as Application Name.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Application name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getApplications.
 */
export interface GetApplicationsResult {
    readonly applications: outputs.oos.GetApplicationsApplication[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly tags?: {[key: string]: string};
}
/**
 * This data source provides the Oos Applications of the current Alibaba Cloud user.
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
 * const ids = alicloud.oos.getApplications({});
 * export const oosApplicationId1 = ids.then(ids => ids.applications?.[0]?.id);
 * const nameRegex = alicloud.oos.getApplications({
 *     nameRegex: "^my-Application",
 * });
 * export const oosApplicationId2 = nameRegex.then(nameRegex => nameRegex.applications?.[0]?.id);
 * ```
 */
export function getApplicationsOutput(args?: GetApplicationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplicationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:oos/getApplications:getApplications", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplications.
 */
export interface GetApplicationsOutputArgs {
    /**
     * A list of Application IDs. Its element value is same as Application Name.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Application name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
