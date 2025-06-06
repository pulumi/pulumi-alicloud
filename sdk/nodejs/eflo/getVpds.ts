// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Eflo Vpd available to the user.[What is Vpd](https://help.aliyun.com/document_detail/604976.html)
 *
 * > **NOTE:** Available in 1.201.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.eflo.getVpds({
 *     ids: [defaultAlicloudEfloVpd.id],
 *     nameRegex: defaultAlicloudEfloVpd.name,
 *     vpdName: "RMC-Terraform-Test",
 * });
 * export const alicloudEfloVpdExampleId = _default.then(_default => _default.vpds?.[0]?.id);
 * ```
 */
export function getVpds(args?: GetVpdsArgs, opts?: pulumi.InvokeOptions): Promise<GetVpdsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:eflo/getVpds:getVpds", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "resourceGroupId": args.resourceGroupId,
        "status": args.status,
        "vpdId": args.vpdId,
        "vpdName": args.vpdName,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpds.
 */
export interface GetVpdsArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Vpd IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The Resource group id
     */
    resourceGroupId?: string;
    /**
     * The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
     */
    status?: string;
    /**
     * The id of the vpd.
     */
    vpdId?: string;
    /**
     * The Name of the VPD.
     */
    vpdName?: string;
}

/**
 * A collection of values returned by getVpds.
 */
export interface GetVpdsResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Vpd IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of name of Vpds.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * Resource group id
     */
    readonly resourceGroupId?: string;
    /**
     * The Vpd status.
     */
    readonly status?: string;
    /**
     * The id of the vpd.
     */
    readonly vpdId?: string;
    /**
     * The Name of the VPD.
     */
    readonly vpdName?: string;
    /**
     * A list of Vpd Entries. Each element contains the following attributes:
     */
    readonly vpds: outputs.eflo.GetVpdsVpd[];
}
/**
 * This data source provides Eflo Vpd available to the user.[What is Vpd](https://help.aliyun.com/document_detail/604976.html)
 *
 * > **NOTE:** Available in 1.201.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.eflo.getVpds({
 *     ids: [defaultAlicloudEfloVpd.id],
 *     nameRegex: defaultAlicloudEfloVpd.name,
 *     vpdName: "RMC-Terraform-Test",
 * });
 * export const alicloudEfloVpdExampleId = _default.then(_default => _default.vpds?.[0]?.id);
 * ```
 */
export function getVpdsOutput(args?: GetVpdsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVpdsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:eflo/getVpds:getVpds", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "resourceGroupId": args.resourceGroupId,
        "status": args.status,
        "vpdId": args.vpdId,
        "vpdName": args.vpdName,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpds.
 */
export interface GetVpdsOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Vpd IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The Resource group id
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
     */
    status?: pulumi.Input<string>;
    /**
     * The id of the vpd.
     */
    vpdId?: pulumi.Input<string>;
    /**
     * The Name of the VPD.
     */
    vpdName?: pulumi.Input<string>;
}
