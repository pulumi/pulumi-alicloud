// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Resource Manager Shared Resources of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.111.0.
 */
export function getSharedResources(args?: GetSharedResourcesArgs, opts?: pulumi.InvokeOptions): Promise<GetSharedResourcesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:resourcemanager/getSharedResources:getSharedResources", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "resourceShareId": args.resourceShareId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getSharedResources.
 */
export interface GetSharedResourcesArgs {
    /**
     * A list of shared resource IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The resource share ID of resource manager.
     */
    resourceShareId?: string;
    /**
     * The status of share resource. Valid values: `Associated`, `Associating`, `Disassociated`, `Disassociating` and `Failed`.
     */
    status?: string;
}

/**
 * A collection of values returned by getSharedResources.
 */
export interface GetSharedResourcesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * The resource share ID of resource manager.
     */
    readonly resourceShareId?: string;
    /**
     * A list of Resource Manager Shared Resources. Each element contains the following attributes:
     */
    readonly resources: outputs.resourcemanager.GetSharedResourcesResource[];
    /**
     * The status of shared resource.
     */
    readonly status?: string;
}
/**
 * This data source provides the Resource Manager Shared Resources of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.111.0.
 */
export function getSharedResourcesOutput(args?: GetSharedResourcesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSharedResourcesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:resourcemanager/getSharedResources:getSharedResources", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "resourceShareId": args.resourceShareId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getSharedResources.
 */
export interface GetSharedResourcesOutputArgs {
    /**
     * A list of shared resource IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The resource share ID of resource manager.
     */
    resourceShareId?: pulumi.Input<string>;
    /**
     * The status of share resource. Valid values: `Associated`, `Associating`, `Disassociated`, `Disassociating` and `Failed`.
     */
    status?: pulumi.Input<string>;
}
