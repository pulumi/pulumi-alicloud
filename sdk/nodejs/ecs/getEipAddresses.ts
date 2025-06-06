// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Eip Addresses of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.126.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getEipAddresses({
 *     ids: ["eip-bp1jvx5ki6c********"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstEipAddressId = example.then(example => example.addresses?.[0]?.id);
 * ```
 */
export function getEipAddresses(args?: GetEipAddressesArgs, opts?: pulumi.InvokeOptions): Promise<GetEipAddressesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getEipAddresses:getEipAddresses", {
        "addressName": args.addressName,
        "associatedInstanceId": args.associatedInstanceId,
        "associatedInstanceType": args.associatedInstanceType,
        "dryRun": args.dryRun,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "includeReservationData": args.includeReservationData,
        "ipAddress": args.ipAddress,
        "ipAddresses": args.ipAddresses,
        "isp": args.isp,
        "lockReason": args.lockReason,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "resourceGroupId": args.resourceGroupId,
        "segmentInstanceId": args.segmentInstanceId,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEipAddresses.
 */
export interface GetEipAddressesArgs {
    /**
     * The eip name.
     */
    addressName?: string;
    /**
     * The associated instance id.
     */
    associatedInstanceId?: string;
    /**
     * The associated instance type.
     */
    associatedInstanceType?: string;
    /**
     * The dry run.
     */
    dryRun?: boolean;
    /**
     * Default to `true`. Set it to `false` can hide the `tags` to output.
     */
    enableDetails?: boolean;
    /**
     * A list of Address IDs.
     */
    ids?: string[];
    /**
     * The include reservation data. Valid values: `BGP` and `BGP_PRO`.
     */
    includeReservationData?: boolean;
    /**
     * The eip address.
     */
    ipAddress?: string;
    /**
     * @deprecated Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead.
     */
    ipAddresses?: string[];
    /**
     * The Internet service provider (ISP). Valid values `BGP` and `BGP_PRO`.
     */
    isp?: string;
    /**
     * The lock reason.
     */
    lockReason?: string;
    /**
     * A regex string to filter results by Address name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The billing method of the EIP. Valid values: `Subscription` and `PayAsYouGo`.
     */
    paymentType?: string;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: string;
    /**
     * The IDs of the contiguous EIPs.  This value is returned only when contiguous EIPs are specified.
     */
    segmentInstanceId?: string;
    /**
     * The status of the EIP. Valid values:  `Associating`: The EIP is being associated. `Unassociating`: The EIP is being disassociated. `InUse`: The EIP is allocated. `Available`:The EIP is available.
     */
    status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getEipAddresses.
 */
export interface GetEipAddressesResult {
    readonly addressName?: string;
    readonly addresses: outputs.ecs.GetEipAddressesAddress[];
    readonly associatedInstanceId?: string;
    readonly associatedInstanceType?: string;
    readonly dryRun?: boolean;
    /**
     * @deprecated Field 'eips' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'addresses' instead.
     */
    readonly eips: outputs.ecs.GetEipAddressesEip[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly includeReservationData?: boolean;
    readonly ipAddress?: string;
    /**
     * @deprecated Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead.
     */
    readonly ipAddresses?: string[];
    readonly isp?: string;
    readonly lockReason?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly paymentType?: string;
    readonly resourceGroupId?: string;
    readonly segmentInstanceId?: string;
    readonly status?: string;
    readonly tags?: {[key: string]: string};
}
/**
 * This data source provides the Eip Addresses of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.126.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getEipAddresses({
 *     ids: ["eip-bp1jvx5ki6c********"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstEipAddressId = example.then(example => example.addresses?.[0]?.id);
 * ```
 */
export function getEipAddressesOutput(args?: GetEipAddressesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEipAddressesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ecs/getEipAddresses:getEipAddresses", {
        "addressName": args.addressName,
        "associatedInstanceId": args.associatedInstanceId,
        "associatedInstanceType": args.associatedInstanceType,
        "dryRun": args.dryRun,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "includeReservationData": args.includeReservationData,
        "ipAddress": args.ipAddress,
        "ipAddresses": args.ipAddresses,
        "isp": args.isp,
        "lockReason": args.lockReason,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "resourceGroupId": args.resourceGroupId,
        "segmentInstanceId": args.segmentInstanceId,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEipAddresses.
 */
export interface GetEipAddressesOutputArgs {
    /**
     * The eip name.
     */
    addressName?: pulumi.Input<string>;
    /**
     * The associated instance id.
     */
    associatedInstanceId?: pulumi.Input<string>;
    /**
     * The associated instance type.
     */
    associatedInstanceType?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * Default to `true`. Set it to `false` can hide the `tags` to output.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Address IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The include reservation data. Valid values: `BGP` and `BGP_PRO`.
     */
    includeReservationData?: pulumi.Input<boolean>;
    /**
     * The eip address.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * @deprecated Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead.
     */
    ipAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Internet service provider (ISP). Valid values `BGP` and `BGP_PRO`.
     */
    isp?: pulumi.Input<string>;
    /**
     * The lock reason.
     */
    lockReason?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Address name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The billing method of the EIP. Valid values: `Subscription` and `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The IDs of the contiguous EIPs.  This value is returned only when contiguous EIPs are specified.
     */
    segmentInstanceId?: pulumi.Input<string>;
    /**
     * The status of the EIP. Valid values:  `Associating`: The EIP is being associated. `Unassociating`: The EIP is being disassociated. `InUse`: The EIP is allocated. `Available`:The EIP is available.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
