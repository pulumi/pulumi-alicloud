// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Dts Consumer Channels of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.146.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.dts.getConsumerChannels({});
 * export const dtsConsumerChannelId1 = ids.then(ids => ids.channels?.[0]?.id);
 * ```
 */
export function getConsumerChannels(args: GetConsumerChannelsArgs, opts?: pulumi.InvokeOptions): Promise<GetConsumerChannelsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dts/getConsumerChannels:getConsumerChannels", {
        "dtsInstanceId": args.dtsInstanceId,
        "ids": args.ids,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getConsumerChannels.
 */
export interface GetConsumerChannelsArgs {
    /**
     * Subscription instance ID.
     */
    dtsInstanceId: string;
    /**
     * A list of Consumer Channel IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getConsumerChannels.
 */
export interface GetConsumerChannelsResult {
    readonly channels: outputs.dts.GetConsumerChannelsChannel[];
    readonly dtsInstanceId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the Dts Consumer Channels of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.146.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.dts.getConsumerChannels({});
 * export const dtsConsumerChannelId1 = ids.then(ids => ids.channels?.[0]?.id);
 * ```
 */
export function getConsumerChannelsOutput(args: GetConsumerChannelsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConsumerChannelsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:dts/getConsumerChannels:getConsumerChannels", {
        "dtsInstanceId": args.dtsInstanceId,
        "ids": args.ids,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getConsumerChannels.
 */
export interface GetConsumerChannelsOutputArgs {
    /**
     * Subscription instance ID.
     */
    dtsInstanceId: pulumi.Input<string>;
    /**
     * A list of Consumer Channel IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
