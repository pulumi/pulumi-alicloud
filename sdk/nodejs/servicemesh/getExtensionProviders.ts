// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Service Mesh Extension Providers of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.191.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.servicemesh.getExtensionProviders({
 *     ids: ["example_id"],
 *     serviceMeshId: "example_service_mesh_id",
 *     type: "httpextauth",
 * });
 * export const serviceMeshExtensionProvidersId1 = ids.then(ids => ids.providers?.[0]?.id);
 * const nameRegex = alicloud.servicemesh.getExtensionProviders({
 *     nameRegex: "^my-ServiceMeshExtensionProvider",
 *     serviceMeshId: "example_service_mesh_id",
 *     type: "httpextauth",
 * });
 * export const serviceMeshExtensionProvidersId2 = nameRegex.then(nameRegex => nameRegex.providers?.[0]?.id);
 * ```
 */
export function getExtensionProviders(args: GetExtensionProvidersArgs, opts?: pulumi.InvokeOptions): Promise<GetExtensionProvidersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:servicemesh/getExtensionProviders:getExtensionProviders", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "serviceMeshId": args.serviceMeshId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getExtensionProviders.
 */
export interface GetExtensionProvidersArgs {
    /**
     * A list of Service Mesh Extension Provider IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Service Mesh Extension Provider name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the Service Mesh.
     */
    serviceMeshId: string;
    /**
     * The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
     */
    type: string;
}

/**
 * A collection of values returned by getExtensionProviders.
 */
export interface GetExtensionProvidersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Extension Provider names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of Service Mesh Extension Providers. Each element contains the following attributes:
     */
    readonly providers: outputs.servicemesh.GetExtensionProvidersProvider[];
    /**
     * The ID of the Service Mesh.
     */
    readonly serviceMeshId: string;
    /**
     * The type of the Service Mesh Extension Provider.
     */
    readonly type: string;
}
/**
 * This data source provides the Service Mesh Extension Providers of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.191.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.servicemesh.getExtensionProviders({
 *     ids: ["example_id"],
 *     serviceMeshId: "example_service_mesh_id",
 *     type: "httpextauth",
 * });
 * export const serviceMeshExtensionProvidersId1 = ids.then(ids => ids.providers?.[0]?.id);
 * const nameRegex = alicloud.servicemesh.getExtensionProviders({
 *     nameRegex: "^my-ServiceMeshExtensionProvider",
 *     serviceMeshId: "example_service_mesh_id",
 *     type: "httpextauth",
 * });
 * export const serviceMeshExtensionProvidersId2 = nameRegex.then(nameRegex => nameRegex.providers?.[0]?.id);
 * ```
 */
export function getExtensionProvidersOutput(args: GetExtensionProvidersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetExtensionProvidersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:servicemesh/getExtensionProviders:getExtensionProviders", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "serviceMeshId": args.serviceMeshId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getExtensionProviders.
 */
export interface GetExtensionProvidersOutputArgs {
    /**
     * A list of Service Mesh Extension Provider IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Service Mesh Extension Provider name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the Service Mesh.
     */
    serviceMeshId: pulumi.Input<string>;
    /**
     * The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
     */
    type: pulumi.Input<string>;
}
