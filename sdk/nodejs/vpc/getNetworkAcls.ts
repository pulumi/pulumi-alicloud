// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Network Acls of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.122.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.vpc.getNetworkAcls({
 *     ids: ["example_value"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstNetworkAclId = example.then(example => example.acls?.[0]?.id);
 * ```
 */
export function getNetworkAcls(args?: GetNetworkAclsArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkAclsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getNetworkAcls:getNetworkAcls", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "networkAclName": args.networkAclName,
        "outputFile": args.outputFile,
        "resourceId": args.resourceId,
        "resourceType": args.resourceType,
        "status": args.status,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkAcls.
 */
export interface GetNetworkAclsArgs {
    /**
     * A list of Network Acl ID.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Network Acl name.
     */
    nameRegex?: string;
    /**
     * The name of the network ACL.
     */
    networkAclName?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the associated resource.
     */
    resourceId?: string;
    /**
     * The type of the associated resource. Valid values `VSwitch`. `resourceType` and `resourceId` need to be specified at the same time to take effect.
     */
    resourceType?: string;
    /**
     * The state of the network ACL. Valid values: `Available` and `Modifying`.
     */
    status?: string;
    /**
     * The ID of the associated VPC.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getNetworkAcls.
 */
export interface GetNetworkAclsResult {
    readonly acls: outputs.vpc.GetNetworkAclsAcl[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly networkAclName?: string;
    readonly outputFile?: string;
    readonly resourceId?: string;
    readonly resourceType?: string;
    readonly status?: string;
    readonly vpcId?: string;
}
/**
 * This data source provides the Network Acls of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.122.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.vpc.getNetworkAcls({
 *     ids: ["example_value"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstNetworkAclId = example.then(example => example.acls?.[0]?.id);
 * ```
 */
export function getNetworkAclsOutput(args?: GetNetworkAclsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworkAclsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:vpc/getNetworkAcls:getNetworkAcls", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "networkAclName": args.networkAclName,
        "outputFile": args.outputFile,
        "resourceId": args.resourceId,
        "resourceType": args.resourceType,
        "status": args.status,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkAcls.
 */
export interface GetNetworkAclsOutputArgs {
    /**
     * A list of Network Acl ID.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Network Acl name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The name of the network ACL.
     */
    networkAclName?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the associated resource.
     */
    resourceId?: pulumi.Input<string>;
    /**
     * The type of the associated resource. Valid values `VSwitch`. `resourceType` and `resourceId` need to be specified at the same time to take effect.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * The state of the network ACL. Valid values: `Available` and `Modifying`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the associated VPC.
     */
    vpcId?: pulumi.Input<string>;
}
