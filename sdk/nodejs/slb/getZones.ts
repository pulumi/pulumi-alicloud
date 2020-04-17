// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides availability zones for SLB that can be accessed by an Alibaba Cloud account within the region configured in the provider.
 * 
 * > **NOTE:** Available in v1.73.0+.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * // Declare the data source
 * const zonesIds = alicloud.slb.getZones();
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/slb_zones.html.markdown.
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:slb/getZones:getZones", {
        "availableSlbAddressIpVersion": args.availableSlbAddressIpVersion,
        "availableSlbAddressType": args.availableSlbAddressType,
        "enableDetails": args.enableDetails,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
     */
    readonly availableSlbAddressIpVersion?: string;
    /**
     * Filter the results by a slb instance address type. Can be either `Vpc`, `classicInternet` or `classicIntranet`
     */
    readonly availableSlbAddressType?: string;
    /**
     * Default to false and only output `id` in the `zones` block. Set it to true can output more details.
     */
    readonly enableDetails?: boolean;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    readonly availableSlbAddressIpVersion?: string;
    readonly availableSlbAddressType?: string;
    readonly enableDetails?: boolean;
    /**
     * A list of zone IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * A list of availability zones. Each element contains the following attributes:
     */
    readonly zones: outputs.slb.GetZonesZone[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}