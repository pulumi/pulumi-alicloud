// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Eci Container Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.111.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.eci.getContainerGroups({
 *     ids: ["example_value"],
 * });
 * export const firstEciContainerGroupId = example.then(example => example.groups[0].id);
 * ```
 */
export function getContainerGroups(args?: GetContainerGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetContainerGroupsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:eci/getContainerGroups:getContainerGroups", {
        "containerGroupName": args.containerGroupName,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "limit": args.limit,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "status": args.status,
        "tags": args.tags,
        "vswitchId": args.vswitchId,
        "withEvent": args.withEvent,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getContainerGroups.
 */
export interface GetContainerGroupsArgs {
    /**
     * The name of ContainerGroup.
     */
    readonly containerGroupName?: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    readonly enableDetails?: boolean;
    /**
     * A list of Container Group IDs.
     */
    readonly ids?: string[];
    /**
     * The maximum number of resources returned in the response. Default value is `20`. Maximum value: `20`. The number of returned results is no greater than the specified number.
     */
    readonly limit?: number;
    /**
     * A regex string to filter results by Container Group name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The ID of the resource group to which the container group belongs. If you have not specified a resource group for the container group, it is added to the default resource group.
     */
    readonly resourceGroupId?: string;
    /**
     * The status of container.
     */
    readonly status?: string;
    /**
     * The tags attached to the container group. Each tag is a key-value pair. You can attach up to 20 tags to a container group.
     */
    readonly tags?: {[key: string]: any};
    /**
     * The vswitch id.
     */
    readonly vswitchId?: string;
    readonly withEvent?: boolean;
    /**
     * The IDs of the zones where the container groups are deployed. If this parameter is not set, the system automatically selects the zones. By default, no value is specified.
     */
    readonly zoneId?: string;
}

/**
 * A collection of values returned by getContainerGroups.
 */
export interface GetContainerGroupsResult {
    readonly containerGroupName?: string;
    readonly enableDetails?: boolean;
    readonly groups: outputs.eci.GetContainerGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly limit?: number;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly status?: string;
    readonly tags?: {[key: string]: any};
    readonly vswitchId?: string;
    readonly withEvent?: boolean;
    readonly zoneId?: string;
}