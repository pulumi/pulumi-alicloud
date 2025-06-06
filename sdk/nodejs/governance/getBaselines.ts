// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Governance Baseline available to the user.[What is Baseline](https://next.api.aliyun.com/document/governance/2021-01-20/CreateAccountFactoryBaseline)
 *
 * > **NOTE:** Available since v1.228.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform_example";
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const itemPasswordPolicy = config.get("itemPasswordPolicy") || "ACS-BP_ACCOUNT_FACTORY_RAM_USER_PASSWORD_POLICY";
 * const itemServices = config.get("itemServices") || "ACS-BP_ACCOUNT_FACTORY_SUBSCRIBE_SERVICES";
 * const itemRamSecurity = config.get("itemRamSecurity") || "ACS-BP_ACCOUNT_FACTORY_RAM_SECURITY_PREFERENCE";
 * const defaultBaseline = new alicloud.governance.Baseline("default", {
 *     baselineItems: [{
 *         version: "1.0",
 *         name: itemPasswordPolicy,
 *         config: JSON.stringify({
 *             MinimumPasswordLength: 8,
 *             RequireLowercaseCharacters: true,
 *             RequireUppercaseCharacters: true,
 *             RequireNumbers: true,
 *             RequireSymbols: true,
 *             MaxPasswordAge: 0,
 *             HardExpiry: false,
 *             PasswordReusePrevention: 0,
 *             MaxLoginAttempts: 0,
 *         }),
 *     }],
 *     description: name,
 *     baselineName: `${name}-${defaultInteger.result}`,
 * });
 * const _default = pulumi.all([defaultBaseline.id, defaultBaseline.baselineName]).apply(([id, baselineName]) => alicloud.governance.getBaselinesOutput({
 *     ids: [id],
 *     nameRegex: baselineName,
 * }));
 * export const alicloudGovernanceBaselineExampleId = _default.apply(_default => _default.baselines?.[0]?.baselineId);
 * ```
 */
export function getBaselines(args?: GetBaselinesArgs, opts?: pulumi.InvokeOptions): Promise<GetBaselinesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:governance/getBaselines:getBaselines", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getBaselines.
 */
export interface GetBaselinesArgs {
    /**
     * A list of Baseline IDs.
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
}

/**
 * A collection of values returned by getBaselines.
 */
export interface GetBaselinesResult {
    /**
     * A list of Baseline Entries. Each element contains the following attributes:
     */
    readonly baselines: outputs.governance.GetBaselinesBaseline[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Baseline IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of name of Baselines.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides Governance Baseline available to the user.[What is Baseline](https://next.api.aliyun.com/document/governance/2021-01-20/CreateAccountFactoryBaseline)
 *
 * > **NOTE:** Available since v1.228.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform_example";
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const itemPasswordPolicy = config.get("itemPasswordPolicy") || "ACS-BP_ACCOUNT_FACTORY_RAM_USER_PASSWORD_POLICY";
 * const itemServices = config.get("itemServices") || "ACS-BP_ACCOUNT_FACTORY_SUBSCRIBE_SERVICES";
 * const itemRamSecurity = config.get("itemRamSecurity") || "ACS-BP_ACCOUNT_FACTORY_RAM_SECURITY_PREFERENCE";
 * const defaultBaseline = new alicloud.governance.Baseline("default", {
 *     baselineItems: [{
 *         version: "1.0",
 *         name: itemPasswordPolicy,
 *         config: JSON.stringify({
 *             MinimumPasswordLength: 8,
 *             RequireLowercaseCharacters: true,
 *             RequireUppercaseCharacters: true,
 *             RequireNumbers: true,
 *             RequireSymbols: true,
 *             MaxPasswordAge: 0,
 *             HardExpiry: false,
 *             PasswordReusePrevention: 0,
 *             MaxLoginAttempts: 0,
 *         }),
 *     }],
 *     description: name,
 *     baselineName: `${name}-${defaultInteger.result}`,
 * });
 * const _default = pulumi.all([defaultBaseline.id, defaultBaseline.baselineName]).apply(([id, baselineName]) => alicloud.governance.getBaselinesOutput({
 *     ids: [id],
 *     nameRegex: baselineName,
 * }));
 * export const alicloudGovernanceBaselineExampleId = _default.apply(_default => _default.baselines?.[0]?.baselineId);
 * ```
 */
export function getBaselinesOutput(args?: GetBaselinesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetBaselinesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:governance/getBaselines:getBaselines", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getBaselines.
 */
export interface GetBaselinesOutputArgs {
    /**
     * A list of Baseline IDs.
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
}
