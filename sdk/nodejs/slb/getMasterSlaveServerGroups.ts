// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the master slave server groups related to a server load balancer.
 *
 * > **NOTE:** Available in 1.54.0+
 */
export function getMasterSlaveServerGroups(args: GetMasterSlaveServerGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetMasterSlaveServerGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups", {
        "ids": args.ids,
        "loadBalancerId": args.loadBalancerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getMasterSlaveServerGroups.
 */
export interface GetMasterSlaveServerGroupsArgs {
    /**
     * A list of master slave server group IDs to filter results.
     */
    ids?: string[];
    /**
     * ID of the SLB.
     */
    loadBalancerId: string;
    /**
     * A regex string to filter results by master slave server group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getMasterSlaveServerGroups.
 */
export interface GetMasterSlaveServerGroupsResult {
    /**
     * A list of SLB master slave server groups. Each element contains the following attributes:
     */
    readonly groups: outputs.slb.GetMasterSlaveServerGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of SLB master slave server groups IDs.
     */
    readonly ids: string[];
    readonly loadBalancerId: string;
    readonly nameRegex?: string;
    /**
     * A list of SLB master slave server groups names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the master slave server groups related to a server load balancer.
 *
 * > **NOTE:** Available in 1.54.0+
 */
export function getMasterSlaveServerGroupsOutput(args: GetMasterSlaveServerGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMasterSlaveServerGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups", {
        "ids": args.ids,
        "loadBalancerId": args.loadBalancerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getMasterSlaveServerGroups.
 */
export interface GetMasterSlaveServerGroupsOutputArgs {
    /**
     * A list of master slave server group IDs to filter results.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the SLB.
     */
    loadBalancerId: pulumi.Input<string>;
    /**
     * A regex string to filter results by master slave server group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
