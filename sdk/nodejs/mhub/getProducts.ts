// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Mhub Products of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.138.0+.
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
 * const name = config.get("name") || "example_value";
 * const _default = new alicloud.mhub.Product("default", {productName: name});
 * const ids = alicloud.mhub.getProducts({});
 * export const mhubProductId1 = ids.then(ids => ids.products?.[0]?.id);
 * const nameRegex = alicloud.mhub.getProducts({
 *     nameRegex: "^my-Product",
 * });
 * export const mhubProductId2 = nameRegex.then(nameRegex => nameRegex.products?.[0]?.id);
 * ```
 */
export function getProducts(args?: GetProductsArgs, opts?: pulumi.InvokeOptions): Promise<GetProductsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:mhub/getProducts:getProducts", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getProducts.
 */
export interface GetProductsArgs {
    /**
     * A list of Product IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Product name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getProducts.
 */
export interface GetProductsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly products: outputs.mhub.GetProductsProduct[];
}
/**
 * This data source provides the Mhub Products of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.138.0+.
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
 * const name = config.get("name") || "example_value";
 * const _default = new alicloud.mhub.Product("default", {productName: name});
 * const ids = alicloud.mhub.getProducts({});
 * export const mhubProductId1 = ids.then(ids => ids.products?.[0]?.id);
 * const nameRegex = alicloud.mhub.getProducts({
 *     nameRegex: "^my-Product",
 * });
 * export const mhubProductId2 = nameRegex.then(nameRegex => nameRegex.products?.[0]?.id);
 * ```
 */
export function getProductsOutput(args?: GetProductsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetProductsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:mhub/getProducts:getProducts", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getProducts.
 */
export interface GetProductsOutputArgs {
    /**
     * A list of Product IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Product name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
