// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Route Service available to the user.
 *
 * > **NOTE:** Available in v1.102.0+
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.cen.getRouteServices({
 *     cenId: "cen-7qthudw0ll6jmc****",
 * });
 * export const firstCenRouteServiceId = example.then(example => example.services?.[0]?.id);
 * ```
 */
export function getRouteServices(args: GetRouteServicesArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteServicesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getRouteServices:getRouteServices", {
        "accessRegionId": args.accessRegionId,
        "cenId": args.cenId,
        "host": args.host,
        "hostRegionId": args.hostRegionId,
        "hostVpcId": args.hostVpcId,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteServices.
 */
export interface GetRouteServicesArgs {
    /**
     * The region of the network instances that access the cloud services.
     */
    accessRegionId?: string;
    /**
     * The ID of the CEN instance.
     */
    cenId: string;
    /**
     * The domain name or IP address of the cloud service.
     */
    host?: string;
    /**
     * The region of the cloud service.
     */
    hostRegionId?: string;
    /**
     * The VPC associated with the cloud service.
     */
    hostVpcId?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the cloud service. Valid values: `Active`, `Creating` and `Deleting`.
     */
    status?: string;
}

/**
 * A collection of values returned by getRouteServices.
 */
export interface GetRouteServicesResult {
    /**
     * The region of the network instances that access the cloud services.
     */
    readonly accessRegionId?: string;
    /**
     * The ID of the CEN instance.
     */
    readonly cenId: string;
    /**
     * The domain name or IP address of the cloud service.
     */
    readonly host?: string;
    /**
     * The region of the cloud service.
     */
    readonly hostRegionId?: string;
    /**
     * The VPC associated with the cloud service.
     */
    readonly hostVpcId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of CEN Route Service IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * A list of CEN Route Services. Each element contains the following attributes:
     */
    readonly services: outputs.cen.GetRouteServicesService[];
    /**
     * The status of the cloud service.
     */
    readonly status?: string;
}
/**
 * This data source provides CEN Route Service available to the user.
 *
 * > **NOTE:** Available in v1.102.0+
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.cen.getRouteServices({
 *     cenId: "cen-7qthudw0ll6jmc****",
 * });
 * export const firstCenRouteServiceId = example.then(example => example.services?.[0]?.id);
 * ```
 */
export function getRouteServicesOutput(args: GetRouteServicesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRouteServicesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cen/getRouteServices:getRouteServices", {
        "accessRegionId": args.accessRegionId,
        "cenId": args.cenId,
        "host": args.host,
        "hostRegionId": args.hostRegionId,
        "hostVpcId": args.hostVpcId,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteServices.
 */
export interface GetRouteServicesOutputArgs {
    /**
     * The region of the network instances that access the cloud services.
     */
    accessRegionId?: pulumi.Input<string>;
    /**
     * The ID of the CEN instance.
     */
    cenId: pulumi.Input<string>;
    /**
     * The domain name or IP address of the cloud service.
     */
    host?: pulumi.Input<string>;
    /**
     * The region of the cloud service.
     */
    hostRegionId?: pulumi.Input<string>;
    /**
     * The VPC associated with the cloud service.
     */
    hostVpcId?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the cloud service. Valid values: `Active`, `Creating` and `Deleting`.
     */
    status?: pulumi.Input<string>;
}
