// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **NOTE:** This datasource has been deprecated from v1.3.2. Please use the datasource `alicloud.dns.getGroups` instead.
 */
export function getDomainGroups(args?: GetDomainGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dns/getDomainGroups:getDomainGroups", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomainGroups.
 */
export interface GetDomainGroupsArgs {
    ids?: string[];
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getDomainGroups.
 */
export interface GetDomainGroupsResult {
    readonly groups: outputs.dns.GetDomainGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * > **NOTE:** This datasource has been deprecated from v1.3.2. Please use the datasource `alicloud.dns.getGroups` instead.
 */
export function getDomainGroupsOutput(args?: GetDomainGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDomainGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:dns/getDomainGroups:getDomainGroups", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomainGroups.
 */
export interface GetDomainGroupsOutputArgs {
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
