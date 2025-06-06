// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of Alidns instances in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:**  Available in 1.95.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.dns.getAlidnsInstances({
 *     ids: ["dns-cn-oew1npk****"],
 * });
 * export const firstInstanceId = example.then(example => example.instances?.[0]?.id);
 * ```
 */
export function getAlidnsInstances(args?: GetAlidnsInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetAlidnsInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dns/getAlidnsInstances:getAlidnsInstances", {
        "domainType": args.domainType,
        "ids": args.ids,
        "lang": args.lang,
        "outputFile": args.outputFile,
        "userClientIp": args.userClientIp,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlidnsInstances.
 */
export interface GetAlidnsInstancesArgs {
    /**
     * The type of domain.
     */
    domainType?: string;
    /**
     * A list of instance IDs.
     */
    ids?: string[];
    /**
     * Language.
     */
    lang?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The IP address of the client.
     */
    userClientIp?: string;
}

/**
 * A collection of values returned by getAlidnsInstances.
 */
export interface GetAlidnsInstancesResult {
    readonly domainType?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of instance IDs.
     */
    readonly ids: string[];
    /**
     * A list of instances. Each element contains the following attributes:
     */
    readonly instances: outputs.dns.GetAlidnsInstancesInstance[];
    readonly lang?: string;
    readonly outputFile?: string;
    readonly userClientIp?: string;
}
/**
 * This data source provides a list of Alidns instances in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:**  Available in 1.95.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.dns.getAlidnsInstances({
 *     ids: ["dns-cn-oew1npk****"],
 * });
 * export const firstInstanceId = example.then(example => example.instances?.[0]?.id);
 * ```
 */
export function getAlidnsInstancesOutput(args?: GetAlidnsInstancesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAlidnsInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:dns/getAlidnsInstances:getAlidnsInstances", {
        "domainType": args.domainType,
        "ids": args.ids,
        "lang": args.lang,
        "outputFile": args.outputFile,
        "userClientIp": args.userClientIp,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlidnsInstances.
 */
export interface GetAlidnsInstancesOutputArgs {
    /**
     * The type of domain.
     */
    domainType?: pulumi.Input<string>;
    /**
     * A list of instance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Language.
     */
    lang?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The IP address of the client.
     */
    userClientIp?: pulumi.Input<string>;
}
