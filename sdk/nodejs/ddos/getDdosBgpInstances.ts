// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in v1.183.0+ .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * export = async () => {
 *     const config = new pulumi.Config();
 *     const name = config.get("name") || "tf-example";
 *     const instanceDdosBgpInstance = new alicloud.ddos.DdosBgpInstance("instance", {
 *         name: name,
 *         baseBandwidth: 20,
 *         bandwidth: -1,
 *         ipCount: 100,
 *         ipType: "IPv4",
 *         normalBandwidth: 100,
 *         type: "Enterprise",
 *     });
 *     const instance = await alicloud.ddos.getDdosBgpInstances({
 *         nameRegex: "ddosbgp",
 *     });
 *     return {
 *         instance: [instance].map(__item => __item.id),
 *     };
 * }
 * ```
 */
export function getDdosBgpInstances(args?: GetDdosBgpInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetDdosBgpInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ddos/getDdosBgpInstances:getDdosBgpInstances", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDdosBgpInstances.
 */
export interface GetDdosBgpInstancesArgs {
    /**
     * A list of instance IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by the instance name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getDdosBgpInstances.
 */
export interface GetDdosBgpInstancesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of instance IDs.
     */
    readonly ids: string[];
    /**
     * A list of apis. Each element contains the following attributes:
     */
    readonly instances: outputs.ddos.GetDdosBgpInstancesInstance[];
    readonly nameRegex?: string;
    /**
     * A list of instance names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in v1.183.0+ .
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * export = async () => {
 *     const config = new pulumi.Config();
 *     const name = config.get("name") || "tf-example";
 *     const instanceDdosBgpInstance = new alicloud.ddos.DdosBgpInstance("instance", {
 *         name: name,
 *         baseBandwidth: 20,
 *         bandwidth: -1,
 *         ipCount: 100,
 *         ipType: "IPv4",
 *         normalBandwidth: 100,
 *         type: "Enterprise",
 *     });
 *     const instance = await alicloud.ddos.getDdosBgpInstances({
 *         nameRegex: "ddosbgp",
 *     });
 *     return {
 *         instance: [instance].map(__item => __item.id),
 *     };
 * }
 * ```
 */
export function getDdosBgpInstancesOutput(args?: GetDdosBgpInstancesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDdosBgpInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ddos/getDdosBgpInstances:getDdosBgpInstances", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDdosBgpInstances.
 */
export interface GetDdosBgpInstancesOutputArgs {
    /**
     * A list of instance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by the instance name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
