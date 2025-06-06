// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of available addons that the cluster can install.
 *
 * > **NOTE:** Available since v1.150.0.
 * **NOTE:** From version v1.166.0, support for returning custom configuration of kubernetes cluster addon.
 */
export function getKubernetesAddons(args: GetKubernetesAddonsArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesAddonsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cs/getKubernetesAddons:getKubernetesAddons", {
        "clusterId": args.clusterId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesAddons.
 */
export interface GetKubernetesAddonsArgs {
    /**
     * The id of kubernetes cluster.
     */
    clusterId: string;
    /**
     * A list of addon IDs. The id of addon consists of the cluster id and the addon name, with the structure <cluster_ud>:<addon_name>.
     */
    ids?: string[];
    /**
     * A regex string to filter results by addon name.
     */
    nameRegex?: string;
}

/**
 * A collection of values returned by getKubernetesAddons.
 */
export interface GetKubernetesAddonsResult {
    /**
     * A list of addons.
     */
    readonly addons: outputs.cs.GetKubernetesAddonsAddon[];
    /**
     * The id of kubernetes cluster.
     */
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of addon names.
     */
    readonly names: string[];
}
/**
 * This data source provides a list of available addons that the cluster can install.
 *
 * > **NOTE:** Available since v1.150.0.
 * **NOTE:** From version v1.166.0, support for returning custom configuration of kubernetes cluster addon.
 */
export function getKubernetesAddonsOutput(args: GetKubernetesAddonsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKubernetesAddonsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cs/getKubernetesAddons:getKubernetesAddons", {
        "clusterId": args.clusterId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesAddons.
 */
export interface GetKubernetesAddonsOutputArgs {
    /**
     * The id of kubernetes cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * A list of addon IDs. The id of addon consists of the cluster id and the addon name, with the structure <cluster_ud>:<addon_name>.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by addon name.
     */
    nameRegex?: pulumi.Input<string>;
}
