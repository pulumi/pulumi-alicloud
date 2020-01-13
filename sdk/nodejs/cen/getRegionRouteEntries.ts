// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Regional Route Entries available to the user.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const entry = alicloud.cen.getRegionRouteEntries({
 *     instanceId: "cen-id1",
 *     regionId: "cn-beijing",
 * });
 * 
 * export const firstRegionRouteEntriesRouteEntryCidrBlock = entry.entries[0].cidrBlock;
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/cen_region_route_entries.html.markdown.
 */
export function getRegionRouteEntries(args: GetRegionRouteEntriesArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionRouteEntriesResult> & GetRegionRouteEntriesResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetRegionRouteEntriesResult> = pulumi.runtime.invoke("alicloud:cen/getRegionRouteEntries:getRegionRouteEntries", {
        "instanceId": args.instanceId,
        "outputFile": args.outputFile,
        "regionId": args.regionId,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getRegionRouteEntries.
 */
export interface GetRegionRouteEntriesArgs {
    /**
     * ID of the CEN instance.
     */
    readonly instanceId: string;
    readonly outputFile?: string;
    /**
     * ID of the region.
     */
    readonly regionId: string;
}

/**
 * A collection of values returned by getRegionRouteEntries.
 */
export interface GetRegionRouteEntriesResult {
    /**
     * A list of CEN Route Entries. Each element contains the following attributes:
     */
    readonly entries: outputs.cen.GetRegionRouteEntriesEntry[];
    readonly instanceId: string;
    readonly outputFile?: string;
    readonly regionId: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}