// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **DEPRECATED:** This datasource has been renamed to alicloud.ecs.getEcsKeyPairs from version 1.121.0.
 *
 * This data source provides a list of key pairs in an Alibaba Cloud account according to the specified filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Declare the data source
 * const defaultKeyPair = new alicloud.ecs.KeyPair("default", {keyName: "keyPairDatasource"});
 * const _default = alicloud.ecs.getKeyPairsOutput({
 *     nameRegex: defaultKeyPair.keyName,
 * });
 * ```
 */
export function getKeyPairs(args?: GetKeyPairsArgs, opts?: pulumi.InvokeOptions): Promise<GetKeyPairsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getKeyPairs:getKeyPairs", {
        "fingerPrint": args.fingerPrint,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeyPairs.
 */
export interface GetKeyPairsArgs {
    /**
     * A finger print used to retrieve specified key pair.
     */
    fingerPrint?: string;
    /**
     * A list of key pair IDs.
     */
    ids?: string[];
    /**
     * A regex string to apply to the resulting key pairs.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The Id of resource group which the key pair belongs.
     */
    resourceGroupId?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getKeyPairs.
 */
export interface GetKeyPairsResult {
    /**
     * Finger print of the key pair.
     */
    readonly fingerPrint?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * A list of key pairs. Each element contains the following attributes:
     *
     * @deprecated Field `keyPairs` has been deprecated from provider version 1.121.0. New field `pairs` instead.
     */
    readonly keyPairs: outputs.ecs.GetKeyPairsKeyPair[];
    readonly nameRegex?: string;
    /**
     * A list of key pair names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly pairs: outputs.ecs.GetKeyPairsPair[];
    /**
     * The Id of resource group.
     */
    readonly resourceGroupId?: string;
    /**
     * (Optional, Available in v1.66.0+) A mapping of tags to assign to the resource.
     */
    readonly tags?: {[key: string]: string};
}
/**
 * > **DEPRECATED:** This datasource has been renamed to alicloud.ecs.getEcsKeyPairs from version 1.121.0.
 *
 * This data source provides a list of key pairs in an Alibaba Cloud account according to the specified filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Declare the data source
 * const defaultKeyPair = new alicloud.ecs.KeyPair("default", {keyName: "keyPairDatasource"});
 * const _default = alicloud.ecs.getKeyPairsOutput({
 *     nameRegex: defaultKeyPair.keyName,
 * });
 * ```
 */
export function getKeyPairsOutput(args?: GetKeyPairsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKeyPairsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ecs/getKeyPairs:getKeyPairs", {
        "fingerPrint": args.fingerPrint,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeyPairs.
 */
export interface GetKeyPairsOutputArgs {
    /**
     * A finger print used to retrieve specified key pair.
     */
    fingerPrint?: pulumi.Input<string>;
    /**
     * A list of key pair IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to apply to the resulting key pairs.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The Id of resource group which the key pair belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
