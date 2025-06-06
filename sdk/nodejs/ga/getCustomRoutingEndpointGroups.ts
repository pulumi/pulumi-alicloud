// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Global Accelerator (GA) Custom Routing Endpoint Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.197.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ga.getCustomRoutingEndpointGroups({
 *     ids: ["example_id"],
 *     acceleratorId: "your_accelerator_id",
 * });
 * export const gaCustomRoutingEndpointGroupsId1 = ids.then(ids => ids.groups?.[0]?.id);
 * const nameRegex = alicloud.ga.getCustomRoutingEndpointGroups({
 *     nameRegex: "tf-example",
 *     acceleratorId: "your_accelerator_id",
 * });
 * export const gaCustomRoutingEndpointGroupsId2 = nameRegex.then(nameRegex => nameRegex.groups?.[0]?.id);
 * ```
 */
export function getCustomRoutingEndpointGroups(args: GetCustomRoutingEndpointGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomRoutingEndpointGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ga/getCustomRoutingEndpointGroups:getCustomRoutingEndpointGroups", {
        "acceleratorId": args.acceleratorId,
        "endpointGroupId": args.endpointGroupId,
        "ids": args.ids,
        "listenerId": args.listenerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomRoutingEndpointGroups.
 */
export interface GetCustomRoutingEndpointGroupsArgs {
    /**
     * The ID of the GA instance.
     */
    acceleratorId: string;
    /**
     * The ID of the endpoint group.
     */
    endpointGroupId?: string;
    /**
     * A list of Custom Routing Endpoint Group IDs.
     */
    ids?: string[];
    /**
     * The ID of the custom routing listener.
     */
    listenerId?: string;
    /**
     * A regex string to filter results by Custom Routing Endpoint Group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The status of the endpoint group. Valid Values: `init`, `active`, `updating`, `deleting`.
     */
    status?: string;
}

/**
 * A collection of values returned by getCustomRoutingEndpointGroups.
 */
export interface GetCustomRoutingEndpointGroupsResult {
    /**
     * The ID of the GA instance.
     */
    readonly acceleratorId: string;
    /**
     * The ID of the Custom Routing Endpoint Group.
     */
    readonly endpointGroupId?: string;
    /**
     * A list of Custom Routing Endpoint Groups. Each element contains the following attributes:
     */
    readonly groups: outputs.ga.GetCustomRoutingEndpointGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * The ID of the custom routing listener.
     */
    readonly listenerId?: string;
    readonly nameRegex?: string;
    /**
     * A list of Custom Routing Endpoint Group names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * The status of the endpoint group.
     */
    readonly status?: string;
}
/**
 * This data source provides the Global Accelerator (GA) Custom Routing Endpoint Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.197.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ga.getCustomRoutingEndpointGroups({
 *     ids: ["example_id"],
 *     acceleratorId: "your_accelerator_id",
 * });
 * export const gaCustomRoutingEndpointGroupsId1 = ids.then(ids => ids.groups?.[0]?.id);
 * const nameRegex = alicloud.ga.getCustomRoutingEndpointGroups({
 *     nameRegex: "tf-example",
 *     acceleratorId: "your_accelerator_id",
 * });
 * export const gaCustomRoutingEndpointGroupsId2 = nameRegex.then(nameRegex => nameRegex.groups?.[0]?.id);
 * ```
 */
export function getCustomRoutingEndpointGroupsOutput(args: GetCustomRoutingEndpointGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCustomRoutingEndpointGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ga/getCustomRoutingEndpointGroups:getCustomRoutingEndpointGroups", {
        "acceleratorId": args.acceleratorId,
        "endpointGroupId": args.endpointGroupId,
        "ids": args.ids,
        "listenerId": args.listenerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomRoutingEndpointGroups.
 */
export interface GetCustomRoutingEndpointGroupsOutputArgs {
    /**
     * The ID of the GA instance.
     */
    acceleratorId: pulumi.Input<string>;
    /**
     * The ID of the endpoint group.
     */
    endpointGroupId?: pulumi.Input<string>;
    /**
     * A list of Custom Routing Endpoint Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the custom routing listener.
     */
    listenerId?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Custom Routing Endpoint Group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The status of the endpoint group. Valid Values: `init`, `active`, `updating`, `deleting`.
     */
    status?: pulumi.Input<string>;
}
