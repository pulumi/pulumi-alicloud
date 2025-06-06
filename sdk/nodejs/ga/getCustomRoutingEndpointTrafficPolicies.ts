// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Global Accelerator (GA) Custom Routing Endpoint Traffic Policies of the current Alibaba Cloud user.
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
 * const ids = alicloud.ga.getCustomRoutingEndpointTrafficPolicies({
 *     ids: ["example_id"],
 *     acceleratorId: "your_accelerator_id",
 * });
 * export const gaCustomRoutingEndpointTrafficPoliciesId1 = ids.then(ids => ids.customRoutingEndpointTrafficPolicies?.[0]?.id);
 * ```
 */
export function getCustomRoutingEndpointTrafficPolicies(args: GetCustomRoutingEndpointTrafficPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomRoutingEndpointTrafficPoliciesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ga/getCustomRoutingEndpointTrafficPolicies:getCustomRoutingEndpointTrafficPolicies", {
        "acceleratorId": args.acceleratorId,
        "address": args.address,
        "endpointGroupId": args.endpointGroupId,
        "endpointId": args.endpointId,
        "ids": args.ids,
        "listenerId": args.listenerId,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomRoutingEndpointTrafficPolicies.
 */
export interface GetCustomRoutingEndpointTrafficPoliciesArgs {
    /**
     * The ID of the GA instance to which the traffic policies belong.
     */
    acceleratorId: string;
    /**
     * The IP addresses of the traffic policies.
     */
    address?: string;
    /**
     * The ID of the endpoint group to which the traffic policies belong.
     */
    endpointGroupId?: string;
    /**
     * The ID of the endpoint to which the traffic policies belong.
     */
    endpointId?: string;
    /**
     * A list of Custom Routing Endpoint Traffic Policy IDs.
     */
    ids?: string[];
    /**
     * The ID of the listener to which the traffic policies belong.
     */
    listenerId?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
}

/**
 * A collection of values returned by getCustomRoutingEndpointTrafficPolicies.
 */
export interface GetCustomRoutingEndpointTrafficPoliciesResult {
    /**
     * The ID of the GA instance to which the endpoint belongs.
     */
    readonly acceleratorId: string;
    /**
     * The IP address of the traffic policy.
     */
    readonly address?: string;
    /**
     * A list of Custom Routing Endpoint Traffic Policies. Each element contains the following attributes:
     */
    readonly customRoutingEndpointTrafficPolicies: outputs.ga.GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy[];
    /**
     * The ID of the Custom Routing Endpoint Group.
     */
    readonly endpointGroupId?: string;
    /**
     * The ID of the Custom Routing Endpoint.
     */
    readonly endpointId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * The ID of the custom routing listener to which the endpoint belongs.
     */
    readonly listenerId?: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
}
/**
 * This data source provides the Global Accelerator (GA) Custom Routing Endpoint Traffic Policies of the current Alibaba Cloud user.
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
 * const ids = alicloud.ga.getCustomRoutingEndpointTrafficPolicies({
 *     ids: ["example_id"],
 *     acceleratorId: "your_accelerator_id",
 * });
 * export const gaCustomRoutingEndpointTrafficPoliciesId1 = ids.then(ids => ids.customRoutingEndpointTrafficPolicies?.[0]?.id);
 * ```
 */
export function getCustomRoutingEndpointTrafficPoliciesOutput(args: GetCustomRoutingEndpointTrafficPoliciesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCustomRoutingEndpointTrafficPoliciesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ga/getCustomRoutingEndpointTrafficPolicies:getCustomRoutingEndpointTrafficPolicies", {
        "acceleratorId": args.acceleratorId,
        "address": args.address,
        "endpointGroupId": args.endpointGroupId,
        "endpointId": args.endpointId,
        "ids": args.ids,
        "listenerId": args.listenerId,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomRoutingEndpointTrafficPolicies.
 */
export interface GetCustomRoutingEndpointTrafficPoliciesOutputArgs {
    /**
     * The ID of the GA instance to which the traffic policies belong.
     */
    acceleratorId: pulumi.Input<string>;
    /**
     * The IP addresses of the traffic policies.
     */
    address?: pulumi.Input<string>;
    /**
     * The ID of the endpoint group to which the traffic policies belong.
     */
    endpointGroupId?: pulumi.Input<string>;
    /**
     * The ID of the endpoint to which the traffic policies belong.
     */
    endpointId?: pulumi.Input<string>;
    /**
     * A list of Custom Routing Endpoint Traffic Policy IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the listener to which the traffic policies belong.
     */
    listenerId?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
}
