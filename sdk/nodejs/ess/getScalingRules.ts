// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides available scaling rule resources.
 *
 * > **NOTE:** Available since v1.39.0
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-ex";
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const myName = `${name}-${defaultInteger.result}`;
 * const _default = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: myName,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: myName,
 * });
 * const defaultScalingGroup = new alicloud.ess.ScalingGroup("default", {
 *     minSize: 1,
 *     maxSize: 1,
 *     scalingGroupName: myName,
 *     removalPolicies: [
 *         "OldestInstance",
 *         "NewestInstance",
 *     ],
 *     vswitchIds: [defaultSwitch.id],
 * });
 * const defaultScalingRule = new alicloud.ess.ScalingRule("default", {
 *     scalingGroupId: defaultScalingGroup.id,
 *     scalingRuleName: myName,
 *     adjustmentType: "PercentChangeInCapacity",
 *     adjustmentValue: 1,
 * });
 * const scalingrulesDs = alicloud.ess.getScalingRulesOutput({
 *     scalingGroupId: defaultScalingGroup.id,
 *     ids: [defaultScalingRule.id],
 *     nameRegex: myName,
 * });
 * export const firstScalingRule = scalingrulesDs.apply(scalingrulesDs => scalingrulesDs.rules?.[0]?.id);
 * ```
 */
export function getScalingRules(args?: GetScalingRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetScalingRulesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ess/getScalingRules:getScalingRules", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "scalingGroupId": args.scalingGroupId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getScalingRules.
 */
export interface GetScalingRulesArgs {
    /**
     * A list of scaling rule IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter resulting scaling rules by name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Scaling group id the scaling rules belong to.
     */
    scalingGroupId?: string;
    /**
     * Type of scaling rule.
     */
    type?: string;
}

/**
 * A collection of values returned by getScalingRules.
 */
export interface GetScalingRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of scaling rule ids.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of scaling rule names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of scaling rules. Each element contains the following attributes:
     */
    readonly rules: outputs.ess.GetScalingRulesRule[];
    /**
     * ID of the scaling group.
     */
    readonly scalingGroupId?: string;
    /**
     * Type of the scaling rule.
     */
    readonly type?: string;
}
/**
 * This data source provides available scaling rule resources.
 *
 * > **NOTE:** Available since v1.39.0
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-ex";
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const myName = `${name}-${defaultInteger.result}`;
 * const _default = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: myName,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: myName,
 * });
 * const defaultScalingGroup = new alicloud.ess.ScalingGroup("default", {
 *     minSize: 1,
 *     maxSize: 1,
 *     scalingGroupName: myName,
 *     removalPolicies: [
 *         "OldestInstance",
 *         "NewestInstance",
 *     ],
 *     vswitchIds: [defaultSwitch.id],
 * });
 * const defaultScalingRule = new alicloud.ess.ScalingRule("default", {
 *     scalingGroupId: defaultScalingGroup.id,
 *     scalingRuleName: myName,
 *     adjustmentType: "PercentChangeInCapacity",
 *     adjustmentValue: 1,
 * });
 * const scalingrulesDs = alicloud.ess.getScalingRulesOutput({
 *     scalingGroupId: defaultScalingGroup.id,
 *     ids: [defaultScalingRule.id],
 *     nameRegex: myName,
 * });
 * export const firstScalingRule = scalingrulesDs.apply(scalingrulesDs => scalingrulesDs.rules?.[0]?.id);
 * ```
 */
export function getScalingRulesOutput(args?: GetScalingRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetScalingRulesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ess/getScalingRules:getScalingRules", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "scalingGroupId": args.scalingGroupId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getScalingRules.
 */
export interface GetScalingRulesOutputArgs {
    /**
     * A list of scaling rule IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter resulting scaling rules by name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Scaling group id the scaling rules belong to.
     */
    scalingGroupId?: pulumi.Input<string>;
    /**
     * Type of scaling rule.
     */
    type?: pulumi.Input<string>;
}
