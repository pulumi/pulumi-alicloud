// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Express Connect Grant Rule To Cens of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.196.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.expressconnect.getGrantRuleToCens({
 *     ids: ["example_id"],
 *     instanceId: "your_vbr_instance_id",
 * });
 * export const expressConnectGrantRuleToCenId0 = ids.then(ids => ids.cens?.[0]?.id);
 * ```
 */
export function getGrantRuleToCens(args: GetGrantRuleToCensArgs, opts?: pulumi.InvokeOptions): Promise<GetGrantRuleToCensResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:expressconnect/getGrantRuleToCens:getGrantRuleToCens", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
    }, opts);
}

/**
 * A collection of arguments for invoking getGrantRuleToCens.
 */
export interface GetGrantRuleToCensArgs {
    /**
     * A list of Grant Rule To Cen IDs.
     */
    ids?: string[];
    /**
     * The ID of the VBR.
     */
    instanceId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
}

/**
 * A collection of values returned by getGrantRuleToCens.
 */
export interface GetGrantRuleToCensResult {
    /**
     * A list of Express Connect Grant Rule To Cens. Each element contains the following attributes:
     */
    readonly cens: outputs.expressconnect.GetGrantRuleToCensCen[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId: string;
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
}
/**
 * This data source provides the Express Connect Grant Rule To Cens of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.196.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.expressconnect.getGrantRuleToCens({
 *     ids: ["example_id"],
 *     instanceId: "your_vbr_instance_id",
 * });
 * export const expressConnectGrantRuleToCenId0 = ids.then(ids => ids.cens?.[0]?.id);
 * ```
 */
export function getGrantRuleToCensOutput(args: GetGrantRuleToCensOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGrantRuleToCensResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:expressconnect/getGrantRuleToCens:getGrantRuleToCens", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
    }, opts);
}

/**
 * A collection of arguments for invoking getGrantRuleToCens.
 */
export interface GetGrantRuleToCensOutputArgs {
    /**
     * A list of Grant Rule To Cen IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the VBR.
     */
    instanceId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
}
