// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Cen Transit Router Multicast Domain Source available to the user.[What is Transit Router Multicast Domain Source](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-registertransitroutermulticastgroupsources)
 *
 * > **NOTE:** Available since v1.195.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.cen.getTransitRouterMulticastDomainSources({
 *     transitRouterMulticastDomainId: "tr-mcast-domain-xxxxxx",
 * });
 * export const alicloudCenTransitRouterMulticastDomainSourceExampleId = _default.then(_default => _default.sources?.[0]?.id);
 * ```
 */
export function getTransitRouterMulticastDomainSources(args: GetTransitRouterMulticastDomainSourcesArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitRouterMulticastDomainSourcesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getTransitRouterMulticastDomainSources:getTransitRouterMulticastDomainSources", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "transitRouterMulticastDomainId": args.transitRouterMulticastDomainId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterMulticastDomainSources.
 */
export interface GetTransitRouterMulticastDomainSourcesArgs {
    /**
     * A list of the multicast domain IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the multicast domain to which the multicast source belongs.
     */
    transitRouterMulticastDomainId: string;
}

/**
 * A collection of values returned by getTransitRouterMulticastDomainSources.
 */
export interface GetTransitRouterMulticastDomainSourcesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * A list of Transit Router Multicast Domain Source Entries. Each element contains the following attributes:
     */
    readonly sources: outputs.cen.GetTransitRouterMulticastDomainSourcesSource[];
    /**
     * The ID of the multicast domain to which the multicast source belongs.
     */
    readonly transitRouterMulticastDomainId: string;
}
/**
 * This data source provides Cen Transit Router Multicast Domain Source available to the user.[What is Transit Router Multicast Domain Source](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-registertransitroutermulticastgroupsources)
 *
 * > **NOTE:** Available since v1.195.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.cen.getTransitRouterMulticastDomainSources({
 *     transitRouterMulticastDomainId: "tr-mcast-domain-xxxxxx",
 * });
 * export const alicloudCenTransitRouterMulticastDomainSourceExampleId = _default.then(_default => _default.sources?.[0]?.id);
 * ```
 */
export function getTransitRouterMulticastDomainSourcesOutput(args: GetTransitRouterMulticastDomainSourcesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTransitRouterMulticastDomainSourcesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cen/getTransitRouterMulticastDomainSources:getTransitRouterMulticastDomainSources", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "transitRouterMulticastDomainId": args.transitRouterMulticastDomainId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterMulticastDomainSources.
 */
export interface GetTransitRouterMulticastDomainSourcesOutputArgs {
    /**
     * A list of the multicast domain IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the multicast domain to which the multicast source belongs.
     */
    transitRouterMulticastDomainId: pulumi.Input<string>;
}
