// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a collection of ECI Image Cache to the specified filters.
 *
 * > **NOTE:** Available in 1.90.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.eci.getImageCaches({
 *    ids: ["imc-bp1ef0dyp7ldhb1d****"],
 * });
 * export const imageCache = example.then(example => example.caches?.[0]?.id);
 * ```
 */
export function getImageCaches(args?: GetImageCachesArgs, opts?: pulumi.InvokeOptions): Promise<GetImageCachesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:eci/getImageCaches:getImageCaches", {
        "ids": args.ids,
        "image": args.image,
        "imageCacheName": args.imageCacheName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "snapshotId": args.snapshotId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getImageCaches.
 */
export interface GetImageCachesArgs {
    /**
     * A list ids of ECI Image Cache.
     */
    ids?: string[];
    /**
     * Find the mirror cache containing it according to the image name.
     */
    image?: string;
    /**
     * The name of ECI Image Cache.
     */
    imageCacheName?: string;
    /**
     * A regex string to filter results by the image cache name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The id of snapshot.
     */
    snapshotId?: string;
    /**
     * The status of ECI Image Cache.
     */
    status?: string;
}

/**
 * A collection of values returned by getImageCaches.
 */
export interface GetImageCachesResult {
    /**
     * A list of caches. Each element contains the following attributes:
     */
    readonly caches: outputs.eci.GetImageCachesCach[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list ids of ECI Image Cache.
     */
    readonly ids: string[];
    readonly image?: string;
    /**
     * The name of the ECI Image Cache.
     */
    readonly imageCacheName?: string;
    readonly nameRegex?: string;
    /**
     * A list of ECI Image Cache names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The id of snapshot.
     */
    readonly snapshotId?: string;
    /**
     * The status of ECI Image Cache.
     */
    readonly status?: string;
}
/**
 * Provides a collection of ECI Image Cache to the specified filters.
 *
 * > **NOTE:** Available in 1.90.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.eci.getImageCaches({
 *    ids: ["imc-bp1ef0dyp7ldhb1d****"],
 * });
 * export const imageCache = example.then(example => example.caches?.[0]?.id);
 * ```
 */
export function getImageCachesOutput(args?: GetImageCachesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetImageCachesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:eci/getImageCaches:getImageCaches", {
        "ids": args.ids,
        "image": args.image,
        "imageCacheName": args.imageCacheName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "snapshotId": args.snapshotId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getImageCaches.
 */
export interface GetImageCachesOutputArgs {
    /**
     * A list ids of ECI Image Cache.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Find the mirror cache containing it according to the image name.
     */
    image?: pulumi.Input<string>;
    /**
     * The name of ECI Image Cache.
     */
    imageCacheName?: pulumi.Input<string>;
    /**
     * A regex string to filter results by the image cache name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The id of snapshot.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * The status of ECI Image Cache.
     */
    status?: pulumi.Input<string>;
}
