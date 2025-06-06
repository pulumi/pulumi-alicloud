// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cloud Sso Access Configurations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.140.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cloudsso.getAccessConfigurations({
 *     directoryId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const cloudSsoAccessConfigurationId1 = ids.then(ids => ids.configurations?.[0]?.id);
 * const nameRegex = alicloud.cloudsso.getAccessConfigurations({
 *     directoryId: "example_value",
 *     nameRegex: "^my-AccessConfiguration",
 * });
 * export const cloudSsoAccessConfigurationId2 = nameRegex.then(nameRegex => nameRegex.configurations?.[0]?.id);
 * ```
 */
export function getAccessConfigurations(args: GetAccessConfigurationsArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessConfigurationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cloudsso/getAccessConfigurations:getAccessConfigurations", {
        "directoryId": args.directoryId,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessConfigurations.
 */
export interface GetAccessConfigurationsArgs {
    /**
     * The ID of the Directory.
     */
    directoryId: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Access Configuration IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Access Configuration name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getAccessConfigurations.
 */
export interface GetAccessConfigurationsResult {
    readonly configurations: outputs.cloudsso.GetAccessConfigurationsConfiguration[];
    readonly directoryId: string;
    readonly enableDetails?: boolean;
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
 * This data source provides the Cloud Sso Access Configurations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.140.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cloudsso.getAccessConfigurations({
 *     directoryId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const cloudSsoAccessConfigurationId1 = ids.then(ids => ids.configurations?.[0]?.id);
 * const nameRegex = alicloud.cloudsso.getAccessConfigurations({
 *     directoryId: "example_value",
 *     nameRegex: "^my-AccessConfiguration",
 * });
 * export const cloudSsoAccessConfigurationId2 = nameRegex.then(nameRegex => nameRegex.configurations?.[0]?.id);
 * ```
 */
export function getAccessConfigurationsOutput(args: GetAccessConfigurationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccessConfigurationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cloudsso/getAccessConfigurations:getAccessConfigurations", {
        "directoryId": args.directoryId,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessConfigurations.
 */
export interface GetAccessConfigurationsOutputArgs {
    /**
     * The ID of the Directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Access Configuration IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Access Configuration name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
