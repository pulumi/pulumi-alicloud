// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Nlb Listeners of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.191.0+.
 */
export function getListeners(args?: GetListenersArgs, opts?: pulumi.InvokeOptions): Promise<GetListenersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:nlb/getListeners:getListeners", {
        "ids": args.ids,
        "listenerProtocol": args.listenerProtocol,
        "loadBalancerIds": args.loadBalancerIds,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getListeners.
 */
export interface GetListenersArgs {
    /**
     * A list of Listener IDs.
     */
    ids?: string[];
    /**
     * The listening protocol. Valid values: `TCP`, `UDP`, or `TCPSSL`.
     */
    listenerProtocol?: string;
    /**
     * The ID of the NLB instance. You can specify at most 20 IDs.
     */
    loadBalancerIds?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getListeners.
 */
export interface GetListenersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly listenerProtocol?: string;
    readonly listeners: outputs.nlb.GetListenersListener[];
    readonly loadBalancerIds?: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the Nlb Listeners of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.191.0+.
 */
export function getListenersOutput(args?: GetListenersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetListenersResult> {
    return pulumi.output(args).apply((a: any) => getListeners(a, opts))
}

/**
 * A collection of arguments for invoking getListeners.
 */
export interface GetListenersOutputArgs {
    /**
     * A list of Listener IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The listening protocol. Valid values: `TCP`, `UDP`, or `TCPSSL`.
     */
    listenerProtocol?: pulumi.Input<string>;
    /**
     * The ID of the NLB instance. You can specify at most 20 IDs.
     */
    loadBalancerIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}