// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Api Gateway APIs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.22.0.
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
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.apigateway.Group("default", {
 *     name: name,
 *     description: name,
 * });
 * const defaultApi = new alicloud.apigateway.Api("default", {
 *     groupId: _default.id,
 *     name: name,
 *     description: name,
 *     authType: "APP",
 *     serviceType: "HTTP",
 *     requestConfig: {
 *         protocol: "HTTP",
 *         method: "GET",
 *         path: "/test/path",
 *         mode: "MAPPING",
 *     },
 *     httpServiceConfig: {
 *         address: "http://apigateway-backend.alicloudapi.com:8080",
 *         method: "GET",
 *         path: "/web/cloudapi",
 *         timeout: 20,
 *         aoneName: "cloudapi-openapi",
 *     },
 *     requestParameters: [{
 *         name: name,
 *         type: "STRING",
 *         required: "OPTIONAL",
 *         "in": "QUERY",
 *         inService: "QUERY",
 *         nameService: name,
 *     }],
 * });
 * const ids = alicloud.apigateway.getApisOutput({
 *     ids: [defaultApi.id],
 * });
 * export const apiGatewayApisId0 = ids.apply(ids => ids.apis?.[0]?.id);
 * ```
 */
export function getApis(args?: GetApisArgs, opts?: pulumi.InvokeOptions): Promise<GetApisResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:apigateway/getApis:getApis", {
        "apiId": args.apiId,
        "groupId": args.groupId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getApis.
 */
export interface GetApisArgs {
    /**
     * The ID of the API.
     */
    apiId?: string;
    /**
     * The ID of the API group.
     */
    groupId?: string;
    /**
     * A list of API IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by API name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getApis.
 */
export interface GetApisResult {
    /**
     * (Available since v1.224.0) The ID of the API.
     */
    readonly apiId?: string;
    /**
     * A list of APIs. Each element contains the following attributes:
     */
    readonly apis: outputs.apigateway.GetApisApi[];
    /**
     * The ID of the API group.
     */
    readonly groupId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of API names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the Api Gateway APIs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.22.0.
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
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.apigateway.Group("default", {
 *     name: name,
 *     description: name,
 * });
 * const defaultApi = new alicloud.apigateway.Api("default", {
 *     groupId: _default.id,
 *     name: name,
 *     description: name,
 *     authType: "APP",
 *     serviceType: "HTTP",
 *     requestConfig: {
 *         protocol: "HTTP",
 *         method: "GET",
 *         path: "/test/path",
 *         mode: "MAPPING",
 *     },
 *     httpServiceConfig: {
 *         address: "http://apigateway-backend.alicloudapi.com:8080",
 *         method: "GET",
 *         path: "/web/cloudapi",
 *         timeout: 20,
 *         aoneName: "cloudapi-openapi",
 *     },
 *     requestParameters: [{
 *         name: name,
 *         type: "STRING",
 *         required: "OPTIONAL",
 *         "in": "QUERY",
 *         inService: "QUERY",
 *         nameService: name,
 *     }],
 * });
 * const ids = alicloud.apigateway.getApisOutput({
 *     ids: [defaultApi.id],
 * });
 * export const apiGatewayApisId0 = ids.apply(ids => ids.apis?.[0]?.id);
 * ```
 */
export function getApisOutput(args?: GetApisOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApisResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:apigateway/getApis:getApis", {
        "apiId": args.apiId,
        "groupId": args.groupId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getApis.
 */
export interface GetApisOutputArgs {
    /**
     * The ID of the API.
     */
    apiId?: pulumi.Input<string>;
    /**
     * The ID of the API group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * A list of API IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by API name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
