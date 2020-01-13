// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Market product items of Alibaba Cloud.
 * 
 * > **NOTE:** Available in 1.64.0+
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const defaultProducts = alicloud.marketplace.getProducts({
 *     categoryId: "53690006",
 *     productType: "SERVICE",
 *     sort: "created_on-desc",
 * });
 * 
 * export const firstProductCode = defaultProducts.productItems.0.code;
 * export const productCodes = defaultProducts.ids!;
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/market_products.html.markdown.
 */
export function getProducts(args?: GetProductsArgs, opts?: pulumi.InvokeOptions): Promise<GetProductsResult> & GetProductsResult {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetProductsResult> = pulumi.runtime.invoke("alicloud:marketplace/getProducts:getProducts", {
        "categoryId": args.categoryId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "productType": args.productType,
        "sort": args.sort,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getProducts.
 */
export interface GetProductsArgs {
    /**
     * The Category ID of products. For more information, see [DescribeProducts](https://help.aliyun.com/document_detail/89834.htm). 
     */
    readonly categoryId?: string;
    /**
     * A list of product code.
     */
    readonly ids?: string[];
    /**
     * A regex string to apply to the product name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The type of products, Valid values: `APP`, `SERVICE`, `MIRROR`, `DOWNLOAD` and `API_SERVICE`.
     */
    readonly productType?: string;
    /**
     * This field determines how to sort the filtered results, Valid values: `user_count-desc`, `created_on-desc`, `price-desc` and `score-desc`.
     */
    readonly sort?: string;
}

/**
 * A collection of values returned by getProducts.
 */
export interface GetProductsResult {
    /**
     * The category id of the product.
     */
    readonly categoryId?: string;
    /**
     * A list of product codes.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly outputFile?: string;
    readonly productType?: string;
    /**
     * A list of products. Each element contains the following attributes:
     */
    readonly products: outputs.marketplace.GetProductsProduct[];
    readonly sort?: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}