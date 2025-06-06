// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ros Stack Instances of the current Alibaba Cloud user.
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
 * const ids = alicloud.ros.getStackInstances({
 *     stackGroupName: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 *     enableDetails: true,
 * });
 * export const rosStackInstanceId1 = ids.then(ids => ids.instances?.[0]?.id);
 * const status = alicloud.ros.getStackInstances({
 *     stackGroupName: "example_value",
 *     status: "CURRENT",
 *     enableDetails: true,
 * });
 * export const rosStackInstanceId2 = status.then(status => status.instances?.[0]?.id);
 * const regionId = alicloud.ros.getStackInstances({
 *     stackGroupName: "example_value",
 *     stackInstanceRegionId: "example_value",
 *     enableDetails: true,
 * });
 * export const rosStackInstanceId3 = regionId.then(regionId => regionId.instances?.[0]?.id);
 * const accountId = alicloud.ros.getStackInstances({
 *     stackGroupName: "example_value",
 *     stackInstanceAccountId: "example_value",
 *     enableDetails: true,
 * });
 * export const rosStackInstanceId4 = accountId.then(accountId => accountId.instances?.[0]?.id);
 * ```
 */
export function getStackInstances(args: GetStackInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetStackInstancesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ros/getStackInstances:getStackInstances", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "stackGroupName": args.stackGroupName,
        "stackInstanceAccountId": args.stackInstanceAccountId,
        "stackInstanceRegionId": args.stackInstanceRegionId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getStackInstances.
 */
export interface GetStackInstancesArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Stack Instance IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The name of the stack group.
     */
    stackGroupName: string;
    /**
     * The account to which the stack instance belongs.
     */
    stackInstanceAccountId?: string;
    /**
     * The region of the stack instance.
     */
    stackInstanceRegionId?: string;
    /**
     * The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`. 
     * * `CURRENT`: The stack corresponding to the stack instance is up to date with the stack group.
     * * `OUTDATED`: The stack corresponding to the stack instance is not up to date with the stack group. The `OUTDATED` state has the following possible causes:
     * * When the CreateStackInstances operation is called to create stack instances, the corresponding stacks fail to be created.
     * * When the UpdateStackInstances or UpdateStackGroup operation is called to update stack instances, the corresponding stacks fail to be updated, or only some of the stack instances are updated.
     * * The create or update operation is not complete.
     */
    status?: string;
}

/**
 * A collection of values returned by getStackInstances.
 */
export interface GetStackInstancesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instances: outputs.ros.GetStackInstancesInstance[];
    readonly outputFile?: string;
    readonly stackGroupName: string;
    readonly stackInstanceAccountId?: string;
    readonly stackInstanceRegionId?: string;
    readonly status?: string;
}
/**
 * This data source provides the Ros Stack Instances of the current Alibaba Cloud user.
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
 * const ids = alicloud.ros.getStackInstances({
 *     stackGroupName: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 *     enableDetails: true,
 * });
 * export const rosStackInstanceId1 = ids.then(ids => ids.instances?.[0]?.id);
 * const status = alicloud.ros.getStackInstances({
 *     stackGroupName: "example_value",
 *     status: "CURRENT",
 *     enableDetails: true,
 * });
 * export const rosStackInstanceId2 = status.then(status => status.instances?.[0]?.id);
 * const regionId = alicloud.ros.getStackInstances({
 *     stackGroupName: "example_value",
 *     stackInstanceRegionId: "example_value",
 *     enableDetails: true,
 * });
 * export const rosStackInstanceId3 = regionId.then(regionId => regionId.instances?.[0]?.id);
 * const accountId = alicloud.ros.getStackInstances({
 *     stackGroupName: "example_value",
 *     stackInstanceAccountId: "example_value",
 *     enableDetails: true,
 * });
 * export const rosStackInstanceId4 = accountId.then(accountId => accountId.instances?.[0]?.id);
 * ```
 */
export function getStackInstancesOutput(args: GetStackInstancesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStackInstancesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ros/getStackInstances:getStackInstances", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "stackGroupName": args.stackGroupName,
        "stackInstanceAccountId": args.stackInstanceAccountId,
        "stackInstanceRegionId": args.stackInstanceRegionId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getStackInstances.
 */
export interface GetStackInstancesOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Stack Instance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The name of the stack group.
     */
    stackGroupName: pulumi.Input<string>;
    /**
     * The account to which the stack instance belongs.
     */
    stackInstanceAccountId?: pulumi.Input<string>;
    /**
     * The region of the stack instance.
     */
    stackInstanceRegionId?: pulumi.Input<string>;
    /**
     * The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`. 
     * * `CURRENT`: The stack corresponding to the stack instance is up to date with the stack group.
     * * `OUTDATED`: The stack corresponding to the stack instance is not up to date with the stack group. The `OUTDATED` state has the following possible causes:
     * * When the CreateStackInstances operation is called to create stack instances, the corresponding stacks fail to be created.
     * * When the UpdateStackInstances or UpdateStackGroup operation is called to update stack instances, the corresponding stacks fail to be updated, or only some of the stack instances are updated.
     * * The create or update operation is not complete.
     */
    status?: pulumi.Input<string>;
}
