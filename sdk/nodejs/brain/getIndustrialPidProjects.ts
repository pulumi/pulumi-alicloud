// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Brain Industrial Pid Projects of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.113.0.
 *
 * > **DEPRECATED:**  This data source has been deprecated from version `1.229.1`.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.brain.getIndustrialPidProjects({
 *     ids: ["3e74e684-cbb5-xxxx"],
 *     nameRegex: "tf-testAcc",
 * });
 * export const firstBrainIndustrialPidProjectId = example.then(example => example.projects?.[0]?.id);
 * ```
 */
export function getIndustrialPidProjects(args?: GetIndustrialPidProjectsArgs, opts?: pulumi.InvokeOptions): Promise<GetIndustrialPidProjectsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:brain/getIndustrialPidProjects:getIndustrialPidProjects", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pidOrganizationId": args.pidOrganizationId,
        "pidProjectName": args.pidProjectName,
    }, opts);
}

/**
 * A collection of arguments for invoking getIndustrialPidProjects.
 */
export interface GetIndustrialPidProjectsArgs {
    /**
     * A list of Pid Project IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Pid Project name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of Pid Organization.
     */
    pidOrganizationId?: string;
    /**
     * The name of Pid Project.
     */
    pidProjectName?: string;
}

/**
 * A collection of values returned by getIndustrialPidProjects.
 */
export interface GetIndustrialPidProjectsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Pid Project names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The ID of Pid Organization.
     */
    readonly pidOrganizationId?: string;
    /**
     * The name of Pid Project.
     */
    readonly pidProjectName?: string;
    /**
     * A list of Brain Industrial Pid Projects. Each element contains the following attributes:
     */
    readonly projects: outputs.brain.GetIndustrialPidProjectsProject[];
}
/**
 * This data source provides the Brain Industrial Pid Projects of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.113.0.
 *
 * > **DEPRECATED:**  This data source has been deprecated from version `1.229.1`.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.brain.getIndustrialPidProjects({
 *     ids: ["3e74e684-cbb5-xxxx"],
 *     nameRegex: "tf-testAcc",
 * });
 * export const firstBrainIndustrialPidProjectId = example.then(example => example.projects?.[0]?.id);
 * ```
 */
export function getIndustrialPidProjectsOutput(args?: GetIndustrialPidProjectsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetIndustrialPidProjectsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:brain/getIndustrialPidProjects:getIndustrialPidProjects", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pidOrganizationId": args.pidOrganizationId,
        "pidProjectName": args.pidProjectName,
    }, opts);
}

/**
 * A collection of arguments for invoking getIndustrialPidProjects.
 */
export interface GetIndustrialPidProjectsOutputArgs {
    /**
     * A list of Pid Project IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Pid Project name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of Pid Organization.
     */
    pidOrganizationId?: pulumi.Input<string>;
    /**
     * The name of Pid Project.
     */
    pidProjectName?: pulumi.Input<string>;
}
