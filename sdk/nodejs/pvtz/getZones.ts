// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Private Zones of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.13.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example.com";
 * const _default = new alicloud.pvtz.Zone("default", {zoneName: name});
 * const ids = alicloud.pvtz.getZonesOutput({
 *     ids: [_default.id],
 * });
 * export const pvtzZonesId0 = ids.apply(ids => ids.zones?.[0]?.id);
 * ```
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:pvtz/getZones:getZones", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "keyword": args.keyword,
        "lang": args.lang,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "queryRegionId": args.queryRegionId,
        "queryVpcId": args.queryVpcId,
        "resourceGroupId": args.resourceGroupId,
        "searchMode": args.searchMode,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * Whether to query the detailed list of resource attributes. Default value: `false`.
     */
    enableDetails?: boolean;
    /**
     * A list of Zones IDs.
     */
    ids?: string[];
    /**
     * The keyword of the zone name.
     */
    keyword?: string;
    /**
     * The language of the response. Default value: `en`. Valid values: `en`, `zh`.
     */
    lang?: string;
    /**
     * A regex string to filter results by Zone name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The region ID of the virtual private cloud (VPC) associated with the zone.
     */
    queryRegionId?: string;
    /**
     * The ID of the VPC associated with the zone.
     */
    queryVpcId?: string;
    /**
     * The ID of the resource group to which the zone belongs.
     */
    resourceGroupId?: string;
    /**
     * The search mode. The value of Keyword is the search scope. Default value: `LIKE`. Valid values:
     * - `LIKE`: Fuzzy search.
     * - `EXACT`: Exact search.
     */
    searchMode?: string;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly keyword?: string;
    readonly lang?: string;
    readonly nameRegex?: string;
    /**
     * A list of Zone names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly queryRegionId?: string;
    readonly queryVpcId?: string;
    /**
     * The ID of the resource group to which the zone belongs.
     */
    readonly resourceGroupId?: string;
    readonly searchMode?: string;
    /**
     * A list of Zone. Each element contains the following attributes:
     */
    readonly zones: outputs.pvtz.GetZonesZone[];
}
/**
 * This data source provides the Private Zones of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.13.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example.com";
 * const _default = new alicloud.pvtz.Zone("default", {zoneName: name});
 * const ids = alicloud.pvtz.getZonesOutput({
 *     ids: [_default.id],
 * });
 * export const pvtzZonesId0 = ids.apply(ids => ids.zones?.[0]?.id);
 * ```
 */
export function getZonesOutput(args?: GetZonesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZonesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:pvtz/getZones:getZones", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "keyword": args.keyword,
        "lang": args.lang,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "queryRegionId": args.queryRegionId,
        "queryVpcId": args.queryVpcId,
        "resourceGroupId": args.resourceGroupId,
        "searchMode": args.searchMode,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    /**
     * Whether to query the detailed list of resource attributes. Default value: `false`.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Zones IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The keyword of the zone name.
     */
    keyword?: pulumi.Input<string>;
    /**
     * The language of the response. Default value: `en`. Valid values: `en`, `zh`.
     */
    lang?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Zone name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The region ID of the virtual private cloud (VPC) associated with the zone.
     */
    queryRegionId?: pulumi.Input<string>;
    /**
     * The ID of the VPC associated with the zone.
     */
    queryVpcId?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the zone belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The search mode. The value of Keyword is the search scope. Default value: `LIKE`. Valid values:
     * - `LIKE`: Fuzzy search.
     * - `EXACT`: Exact search.
     */
    searchMode?: pulumi.Input<string>;
}
