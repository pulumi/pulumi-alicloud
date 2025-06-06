// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Using this data source can enable outbound traffic for an Express Connect circuit automatically. If the service has been opened, it will return opened.
 *
 * For information about Express Connect and how to use it, see [What is Express Connect](https://www.alibabacloud.com/help/doc-detail/275179.htm).
 *
 * > **NOTE:** Available since v1.132.0
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const open = alicloud.expressconnect.getPhysicalConnectionService({
 *     enable: "On",
 * });
 * ```
 */
export function getPhysicalConnectionService(args?: GetPhysicalConnectionServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetPhysicalConnectionServiceResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:expressconnect/getPhysicalConnectionService:getPhysicalConnectionService", {
        "enable": args.enable,
    }, opts);
}

/**
 * A collection of arguments for invoking getPhysicalConnectionService.
 */
export interface GetPhysicalConnectionServiceArgs {
    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     *
     * > **NOTE:** Setting `enable = "On"` to enable outbound traffic for an Express Connect circuit that means you have read and agreed the [Express Connect Terms of Service](https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803060947_16271.html). The service can not closed once it is opened.
     */
    enable?: string;
}

/**
 * A collection of values returned by getPhysicalConnectionService.
 */
export interface GetPhysicalConnectionServiceResult {
    readonly enable?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The current service enable status.
     */
    readonly status: string;
}
/**
 * Using this data source can enable outbound traffic for an Express Connect circuit automatically. If the service has been opened, it will return opened.
 *
 * For information about Express Connect and how to use it, see [What is Express Connect](https://www.alibabacloud.com/help/doc-detail/275179.htm).
 *
 * > **NOTE:** Available since v1.132.0
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const open = alicloud.expressconnect.getPhysicalConnectionService({
 *     enable: "On",
 * });
 * ```
 */
export function getPhysicalConnectionServiceOutput(args?: GetPhysicalConnectionServiceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPhysicalConnectionServiceResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:expressconnect/getPhysicalConnectionService:getPhysicalConnectionService", {
        "enable": args.enable,
    }, opts);
}

/**
 * A collection of arguments for invoking getPhysicalConnectionService.
 */
export interface GetPhysicalConnectionServiceOutputArgs {
    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     *
     * > **NOTE:** Setting `enable = "On"` to enable outbound traffic for an Express Connect circuit that means you have read and agreed the [Express Connect Terms of Service](https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803060947_16271.html). The service can not closed once it is opened.
     */
    enable?: pulumi.Input<string>;
}
