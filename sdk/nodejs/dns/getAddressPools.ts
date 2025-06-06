// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Alidns Address Pools of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.152.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.dns.getAddressPools({
 *     instanceId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const alidnsAddressPoolId1 = ids.then(ids => ids.pools?.[0]?.id);
 * const nameRegex = alicloud.dns.getAddressPools({
 *     instanceId: "example_value",
 *     nameRegex: "^my-AddressPool",
 * });
 * export const alidnsAddressPoolId2 = nameRegex.then(nameRegex => nameRegex.pools?.[0]?.id);
 * ```
 */
export function getAddressPools(args: GetAddressPoolsArgs, opts?: pulumi.InvokeOptions): Promise<GetAddressPoolsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dns/getAddressPools:getAddressPools", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAddressPools.
 */
export interface GetAddressPoolsArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Address Pool IDs.
     */
    ids?: string[];
    /**
     * The id of the instance.
     */
    instanceId: string;
    /**
     * A regex string to filter results by Address Pool name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getAddressPools.
 */
export interface GetAddressPoolsResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pools: outputs.dns.GetAddressPoolsPool[];
}
/**
 * This data source provides the Alidns Address Pools of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.152.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.dns.getAddressPools({
 *     instanceId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const alidnsAddressPoolId1 = ids.then(ids => ids.pools?.[0]?.id);
 * const nameRegex = alicloud.dns.getAddressPools({
 *     instanceId: "example_value",
 *     nameRegex: "^my-AddressPool",
 * });
 * export const alidnsAddressPoolId2 = nameRegex.then(nameRegex => nameRegex.pools?.[0]?.id);
 * ```
 */
export function getAddressPoolsOutput(args: GetAddressPoolsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAddressPoolsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:dns/getAddressPools:getAddressPools", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAddressPools.
 */
export interface GetAddressPoolsOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Address Pool IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The id of the instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * A regex string to filter results by Address Pool name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
