// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Global Accelerator (GA) Custom Routing Port Mappings of the current Alibaba Cloud user.
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
 * const _default = alicloud.ga.getCustomRoutingPortMappings({
 *     acceleratorId: "your_accelerator_id",
 * });
 * export const gaCustomRoutingPortMappingsAcceleratorId1 = _default.then(_default => _default.customRoutingPortMappings?.[0]?.acceleratorId);
 * ```
 */
export function getCustomRoutingPortMappings(args: GetCustomRoutingPortMappingsArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomRoutingPortMappingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ga/getCustomRoutingPortMappings:getCustomRoutingPortMappings", {
        "acceleratorId": args.acceleratorId,
        "endpointGroupId": args.endpointGroupId,
        "listenerId": args.listenerId,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomRoutingPortMappings.
 */
export interface GetCustomRoutingPortMappingsArgs {
    /**
     * The ID of the GA instance.
     */
    acceleratorId: string;
    /**
     * The ID of the endpoint group.
     */
    endpointGroupId?: string;
    /**
     * The ID of the listener.
     */
    listenerId?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The access policy of traffic for the backend instance. Valid Values: `allow`, `deny`.
     */
    status?: string;
}

/**
 * A collection of values returned by getCustomRoutingPortMappings.
 */
export interface GetCustomRoutingPortMappingsResult {
    /**
     * The ID of the GA instance.
     */
    readonly acceleratorId: string;
    /**
     * A list of Custom Routing Port Mappings. Each element contains the following attributes:
     */
    readonly customRoutingPortMappings: outputs.ga.GetCustomRoutingPortMappingsCustomRoutingPortMapping[];
    /**
     * The ID of the endpoint group.
     */
    readonly endpointGroupId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the listener.
     */
    readonly listenerId?: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * The access policy of traffic for the backend instance.
     */
    readonly status?: string;
}
/**
 * This data source provides the Global Accelerator (GA) Custom Routing Port Mappings of the current Alibaba Cloud user.
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
 * const _default = alicloud.ga.getCustomRoutingPortMappings({
 *     acceleratorId: "your_accelerator_id",
 * });
 * export const gaCustomRoutingPortMappingsAcceleratorId1 = _default.then(_default => _default.customRoutingPortMappings?.[0]?.acceleratorId);
 * ```
 */
export function getCustomRoutingPortMappingsOutput(args: GetCustomRoutingPortMappingsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCustomRoutingPortMappingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ga/getCustomRoutingPortMappings:getCustomRoutingPortMappings", {
        "acceleratorId": args.acceleratorId,
        "endpointGroupId": args.endpointGroupId,
        "listenerId": args.listenerId,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomRoutingPortMappings.
 */
export interface GetCustomRoutingPortMappingsOutputArgs {
    /**
     * The ID of the GA instance.
     */
    acceleratorId: pulumi.Input<string>;
    /**
     * The ID of the endpoint group.
     */
    endpointGroupId?: pulumi.Input<string>;
    /**
     * The ID of the listener.
     */
    listenerId?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The access policy of traffic for the backend instance. Valid Values: `allow`, `deny`.
     */
    status?: pulumi.Input<string>;
}
