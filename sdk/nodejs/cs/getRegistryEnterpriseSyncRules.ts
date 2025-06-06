// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list Container Registry Enterprise Edition sync rules on Alibaba Cloud.
 *
 * > **NOTE:** Available in v1.90.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Declare the data source
 * const mySyncRules = alicloud.cs.getRegistryEnterpriseSyncRules({
 *     instanceId: "cri-xxx",
 *     namespaceName: "test-namespace",
 *     repoName: "test-repo",
 *     targetInstanceId: "cri-yyy",
 *     nameRegex: "test-rule",
 * });
 * export const output = mySyncRules.then(mySyncRules => mySyncRules.rules.map(__item => __item.id));
 * ```
 */
export function getRegistryEnterpriseSyncRules(args: GetRegistryEnterpriseSyncRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetRegistryEnterpriseSyncRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cs/getRegistryEnterpriseSyncRules:getRegistryEnterpriseSyncRules", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "namespaceName": args.namespaceName,
        "outputFile": args.outputFile,
        "repoName": args.repoName,
        "targetInstanceId": args.targetInstanceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegistryEnterpriseSyncRules.
 */
export interface GetRegistryEnterpriseSyncRulesArgs {
    /**
     * A list of ids to filter results by sync rule id.
     */
    ids?: string[];
    /**
     * ID of Container Registry Enterprise Edition local instance.
     */
    instanceId: string;
    /**
     * A regex string to filter results by sync rule name.
     */
    nameRegex?: string;
    /**
     * Name of Container Registry Enterprise Edition local namespace.
     */
    namespaceName?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Name of Container Registry Enterprise Edition local repo.
     */
    repoName?: string;
    /**
     * ID of Container Registry Enterprise Edition target instance.
     */
    targetInstanceId?: string;
}

/**
 * A collection of values returned by getRegistryEnterpriseSyncRules.
 */
export interface GetRegistryEnterpriseSyncRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of matched Container Registry Enterprise Edition sync rules. Its element is a sync rule uuid.
     */
    readonly ids: string[];
    /**
     * ID of Container Registry Enterprise Edition local instance.
     */
    readonly instanceId: string;
    readonly nameRegex?: string;
    /**
     * A list of sync rule names.
     */
    readonly names: string[];
    /**
     * Name of Container Registry Enterprise Edition local namespace.
     */
    readonly namespaceName?: string;
    readonly outputFile?: string;
    /**
     * Name of Container Registry Enterprise Edition local repo.
     */
    readonly repoName?: string;
    /**
     * A list of matched Container Registry Enterprise Edition sync rules. Each element contains the following attributes:
     */
    readonly rules: outputs.cs.GetRegistryEnterpriseSyncRulesRule[];
    /**
     * ID of Container Registry Enterprise Edition target instance.
     */
    readonly targetInstanceId?: string;
}
/**
 * This data source provides a list Container Registry Enterprise Edition sync rules on Alibaba Cloud.
 *
 * > **NOTE:** Available in v1.90.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Declare the data source
 * const mySyncRules = alicloud.cs.getRegistryEnterpriseSyncRules({
 *     instanceId: "cri-xxx",
 *     namespaceName: "test-namespace",
 *     repoName: "test-repo",
 *     targetInstanceId: "cri-yyy",
 *     nameRegex: "test-rule",
 * });
 * export const output = mySyncRules.then(mySyncRules => mySyncRules.rules.map(__item => __item.id));
 * ```
 */
export function getRegistryEnterpriseSyncRulesOutput(args: GetRegistryEnterpriseSyncRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRegistryEnterpriseSyncRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cs/getRegistryEnterpriseSyncRules:getRegistryEnterpriseSyncRules", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "namespaceName": args.namespaceName,
        "outputFile": args.outputFile,
        "repoName": args.repoName,
        "targetInstanceId": args.targetInstanceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegistryEnterpriseSyncRules.
 */
export interface GetRegistryEnterpriseSyncRulesOutputArgs {
    /**
     * A list of ids to filter results by sync rule id.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of Container Registry Enterprise Edition local instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * A regex string to filter results by sync rule name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * Name of Container Registry Enterprise Edition local namespace.
     */
    namespaceName?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Name of Container Registry Enterprise Edition local repo.
     */
    repoName?: pulumi.Input<string>;
    /**
     * ID of Container Registry Enterprise Edition target instance.
     */
    targetInstanceId?: pulumi.Input<string>;
}
