// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Function Compute custom domains of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in 1.98.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const fcDomains = alicloud.fc.getCustomDomains({
 *     nameRegex: "sample_fc_custom_domain",
 * });
 * export const firstFcCustomDomainName = fcDomainsDs.domains[0].domainName;
 * ```
 */
export function getCustomDomains(args?: GetCustomDomainsArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomDomainsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:fc/getCustomDomains:getCustomDomains", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomDomains.
 */
export interface GetCustomDomainsArgs {
    /**
     * A list of functions ids.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Function Compute custom domain name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getCustomDomains.
 */
export interface GetCustomDomainsResult {
    /**
     * A list of custom domains, including the following attributes:
     */
    readonly domains: outputs.fc.GetCustomDomainsDomain[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of custom domain ids.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of custom domain names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the Function Compute custom domains of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in 1.98.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const fcDomains = alicloud.fc.getCustomDomains({
 *     nameRegex: "sample_fc_custom_domain",
 * });
 * export const firstFcCustomDomainName = fcDomainsDs.domains[0].domainName;
 * ```
 */
export function getCustomDomainsOutput(args?: GetCustomDomainsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCustomDomainsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:fc/getCustomDomains:getCustomDomains", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomDomains.
 */
export interface GetCustomDomainsOutputArgs {
    /**
     * A list of functions ids.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Function Compute custom domain name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
