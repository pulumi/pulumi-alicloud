// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cen Transit Route Table Aggregations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.202.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cen.getTransitRouteTableAggregations({
 *     ids: ["example_id"],
 *     transitRouteTableId: "your_transit_route_table_id",
 * });
 * export const cenTransitRouterMulticastDomainId0 = ids.then(ids => ids.transitRouteTableAggregations?.[0]?.id);
 * const nameRegex = alicloud.cen.getTransitRouteTableAggregations({
 *     nameRegex: "^my-name",
 *     transitRouteTableId: "your_transit_route_table_id",
 * });
 * export const cenTransitRouterMulticastDomainId1 = nameRegex.then(nameRegex => nameRegex.transitRouteTableAggregations?.[0]?.id);
 * ```
 */
export function getTransitRouteTableAggregations(args: GetTransitRouteTableAggregationsArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitRouteTableAggregationsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getTransitRouteTableAggregations:getTransitRouteTableAggregations", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "transitRouteTableAggregationCidr": args.transitRouteTableAggregationCidr,
        "transitRouteTableId": args.transitRouteTableId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouteTableAggregations.
 */
export interface GetTransitRouteTableAggregationsArgs {
    /**
     * A list of Transit Route Table Aggregation IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Transit Route Table Aggregation name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of Transit Route Table Aggregation. Valid Values: `AllConfigured`, `Configuring`, `ConfigFailed`, `PartialConfigured`, `Deleting`.
     */
    status?: string;
    /**
     * The destination CIDR block of the aggregate route.
     */
    transitRouteTableAggregationCidr?: string;
    /**
     * The ID of the route table of the Enterprise Edition transit router.
     */
    transitRouteTableId: string;
}

/**
 * A collection of values returned by getTransitRouteTableAggregations.
 */
export interface GetTransitRouteTableAggregationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Transit Route Table Aggregation names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The status of the Transit Route Table Aggregation.
     */
    readonly status?: string;
    /**
     * The destination CIDR block of the aggregate route.
     */
    readonly transitRouteTableAggregationCidr?: string;
    /**
     * A list of Cen Transit Route Table Aggregations. Each element contains the following attributes:
     */
    readonly transitRouteTableAggregations: outputs.cen.GetTransitRouteTableAggregationsTransitRouteTableAggregation[];
    /**
     * The ID of the route table of the Enterprise Edition transit router.
     */
    readonly transitRouteTableId: string;
}
/**
 * This data source provides the Cen Transit Route Table Aggregations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.202.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cen.getTransitRouteTableAggregations({
 *     ids: ["example_id"],
 *     transitRouteTableId: "your_transit_route_table_id",
 * });
 * export const cenTransitRouterMulticastDomainId0 = ids.then(ids => ids.transitRouteTableAggregations?.[0]?.id);
 * const nameRegex = alicloud.cen.getTransitRouteTableAggregations({
 *     nameRegex: "^my-name",
 *     transitRouteTableId: "your_transit_route_table_id",
 * });
 * export const cenTransitRouterMulticastDomainId1 = nameRegex.then(nameRegex => nameRegex.transitRouteTableAggregations?.[0]?.id);
 * ```
 */
export function getTransitRouteTableAggregationsOutput(args: GetTransitRouteTableAggregationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTransitRouteTableAggregationsResult> {
    return pulumi.output(args).apply((a: any) => getTransitRouteTableAggregations(a, opts))
}

/**
 * A collection of arguments for invoking getTransitRouteTableAggregations.
 */
export interface GetTransitRouteTableAggregationsOutputArgs {
    /**
     * A list of Transit Route Table Aggregation IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Transit Route Table Aggregation name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of Transit Route Table Aggregation. Valid Values: `AllConfigured`, `Configuring`, `ConfigFailed`, `PartialConfigured`, `Deleting`.
     */
    status?: pulumi.Input<string>;
    /**
     * The destination CIDR block of the aggregate route.
     */
    transitRouteTableAggregationCidr?: pulumi.Input<string>;
    /**
     * The ID of the route table of the Enterprise Edition transit router.
     */
    transitRouteTableId: pulumi.Input<string>;
}