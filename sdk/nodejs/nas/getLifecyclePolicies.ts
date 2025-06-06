// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Nas Lifecycle Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.153.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.nas.getLifecyclePolicies({
 *     fileSystemId: "example_value",
 *     ids: [
 *         "my-LifecyclePolicy-1",
 *         "my-LifecyclePolicy-2",
 *     ],
 * });
 * export const nasLifecyclePolicyId1 = ids.then(ids => ids.policies?.[0]?.id);
 * const nameRegex = alicloud.nas.getLifecyclePolicies({
 *     fileSystemId: "example_value",
 *     nameRegex: "^my-LifecyclePolicy",
 * });
 * export const nasLifecyclePolicyId2 = nameRegex.then(nameRegex => nameRegex.policies?.[0]?.id);
 * ```
 */
export function getLifecyclePolicies(args: GetLifecyclePoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetLifecyclePoliciesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:nas/getLifecyclePolicies:getLifecyclePolicies", {
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getLifecyclePolicies.
 */
export interface GetLifecyclePoliciesArgs {
    /**
     * The ID of the file system.
     */
    fileSystemId: string;
    /**
     * A list of Lifecycle Policy IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Lifecycle Policy name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getLifecyclePolicies.
 */
export interface GetLifecyclePoliciesResult {
    readonly fileSystemId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly policies: outputs.nas.GetLifecyclePoliciesPolicy[];
}
/**
 * This data source provides the Nas Lifecycle Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.153.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.nas.getLifecyclePolicies({
 *     fileSystemId: "example_value",
 *     ids: [
 *         "my-LifecyclePolicy-1",
 *         "my-LifecyclePolicy-2",
 *     ],
 * });
 * export const nasLifecyclePolicyId1 = ids.then(ids => ids.policies?.[0]?.id);
 * const nameRegex = alicloud.nas.getLifecyclePolicies({
 *     fileSystemId: "example_value",
 *     nameRegex: "^my-LifecyclePolicy",
 * });
 * export const nasLifecyclePolicyId2 = nameRegex.then(nameRegex => nameRegex.policies?.[0]?.id);
 * ```
 */
export function getLifecyclePoliciesOutput(args: GetLifecyclePoliciesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLifecyclePoliciesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:nas/getLifecyclePolicies:getLifecyclePolicies", {
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getLifecyclePolicies.
 */
export interface GetLifecyclePoliciesOutputArgs {
    /**
     * The ID of the file system.
     */
    fileSystemId: pulumi.Input<string>;
    /**
     * A list of Lifecycle Policy IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Lifecycle Policy name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
