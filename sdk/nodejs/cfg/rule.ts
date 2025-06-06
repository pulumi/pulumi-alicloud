// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Config Rule resource.
 *
 * For information about Config Rule and how to use it, see [What is Rule](https://www.alibabacloud.com/help/en/cloud-config/latest/api-config-2020-09-07-createconfigrule).
 *
 * > **NOTE:** Available since v1.204.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.resourcemanager.getResourceGroups({
 *     status: "OK",
 * });
 * const defaultRule = new alicloud.cfg.Rule("default", {
 *     description: "If the resource matches one of the specified tag key-value pairs, the configuration is considered compliant.",
 *     sourceOwner: "ALIYUN",
 *     sourceIdentifier: "contains-tag",
 *     riskLevel: 1,
 *     tagValueScope: "example-value",
 *     tagKeyScope: "example-key",
 *     excludeResourceIdsScope: "example-resource_id",
 *     regionIdsScope: "cn-hangzhou",
 *     configRuleTriggerTypes: "ConfigurationItemChangeNotification",
 *     resourceGroupIdsScope: _default.then(_default => _default.ids?.[0]),
 *     resourceTypesScopes: ["ACS::RDS::DBInstance"],
 *     ruleName: "contains-tag",
 *     inputParameters: {
 *         key1: "value1",
 *         key2: "value2",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Config Rule can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cfg/rule:Rule example <id>
 * ```
 */
export class Rule extends pulumi.CustomResource {
    /**
     * Get an existing Rule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RuleState, opts?: pulumi.CustomResourceOptions): Rule {
        return new Rule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cfg/rule:Rule';

    /**
     * Returns true if the given object is an instance of Rule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Rule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Rule.__pulumiType;
    }

    /**
     * The ID of Alicloud account.
     */
    public /*out*/ readonly accountId!: pulumi.Output<number>;
    /**
     * compliance information.
     */
    public /*out*/ readonly compliance!: pulumi.Output<outputs.cfg.RuleCompliance>;
    /**
     * Compliance Package ID.
     */
    public /*out*/ readonly compliancePackId!: pulumi.Output<string>;
    /**
     * config rule arn.
     */
    public /*out*/ readonly configRuleArn!: pulumi.Output<string>;
    /**
     * The ID of the rule.
     */
    public /*out*/ readonly configRuleId!: pulumi.Output<string>;
    /**
     * The trigger type of the rule. Valid values:  `ConfigurationItemChangeNotification`: The rule is triggered upon configuration changes. `ScheduledNotification`: The rule is triggered as scheduled.
     */
    public readonly configRuleTriggerTypes!: pulumi.Output<string>;
    /**
     * The timestamp when the rule was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<number>;
    /**
     * The description of the rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The event source of the rule.
     */
    public /*out*/ readonly eventSource!: pulumi.Output<string>;
    /**
     * The rule monitors excluded resource IDs, multiple of which are separated by commas, only applies to rules created based on managed rules, , custom rule this field is empty.
     */
    public readonly excludeResourceIdsScope!: pulumi.Output<string | undefined>;
    /**
     * The settings of the input parameters for the rule.
     */
    public readonly inputParameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The frequency of the compliance evaluations, it is required if the ConfigRuleTriggerTypes value is ScheduledNotification. Valid values:  `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, `TwentyFour_Hours`.
     */
    public readonly maximumExecutionFrequency!: pulumi.Output<string>;
    /**
     * The timestamp when the rule was last modified.
     */
    public /*out*/ readonly modifiedTimestamp!: pulumi.Output<number>;
    /**
     * The rule monitors region IDs, separated by commas, only applies to rules created based on managed rules.
     */
    public readonly regionIdsScope!: pulumi.Output<string | undefined>;
    /**
     * The rule monitors resource group IDs, separated by commas, only applies to rules created based on managed rules.
     */
    public readonly resourceGroupIdsScope!: pulumi.Output<string | undefined>;
    /**
     * The types of the resources to be evaluated against the rule.
     */
    public readonly resourceTypesScopes!: pulumi.Output<string[]>;
    /**
     * The risk level of the resources that are not compliant with the rule. Valid values:  `1`: critical `2`: warning `3`: info
     */
    public readonly riskLevel!: pulumi.Output<number>;
    /**
     * The name of the rule.
     */
    public readonly ruleName!: pulumi.Output<string>;
    /**
     * Field 'scope_compliance_resource_types' has been deprecated from provider version 1.124.1. New field 'resource_types_scope' instead.
     *
     * @deprecated Field 'scope_compliance_resource_types' has been deprecated from provider version 1.124.1. New field 'resource_types_scope' instead.
     */
    public readonly scopeComplianceResourceTypes!: pulumi.Output<string>;
    /**
     * Field 'source_detail_message_type' has been deprecated from provider version 1.124.1. New field 'config_rule_trigger_types' instead.
     *
     * @deprecated Field 'source_detail_message_type' has been deprecated from provider version 1.124.1. New field 'config_rule_trigger_types' instead.
     */
    public readonly sourceDetailMessageType!: pulumi.Output<string>;
    /**
     * The identifier of the rule.  For a managed rule, the value is the name of the managed rule. For a custom rule, the value is the ARN of the custom rule.
     */
    public readonly sourceIdentifier!: pulumi.Output<string>;
    /**
     * Field 'source_maximum_execution_frequency' has been deprecated from provider version 1.124.1. New field 'maximum_execution_frequency' instead.
     *
     * @deprecated Field 'source_maximum_execution_frequency' has been deprecated from provider version 1.124.1. New field 'maximum_execution_frequency' instead.
     */
    public readonly sourceMaximumExecutionFrequency!: pulumi.Output<string>;
    /**
     * Specifies whether you or Alibaba Cloud owns and manages the rule. Valid values:  `CUSTOM_FC`: The rule is a custom rule and you own the rule. `ALIYUN`: The rule is a managed rule and Alibaba Cloud owns the rule
     */
    public readonly sourceOwner!: pulumi.Output<string>;
    /**
     * The status of the rule. Valid values: ACTIVE: The rule is monitoring the configurations of target resources. DELETING_RESULTS: The compliance evaluation result returned by the rule is being deleted. EVALUATING: The rule is triggered and is evaluating whether the configurations of target resources are compliant. INACTIVE: The rule is disabled from monitoring the configurations of target resources.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The rule monitors the tag key, only applies to rules created based on managed rules.
     */
    public readonly tagKeyScope!: pulumi.Output<string | undefined>;
    /**
     * The rule monitors the tag value, only applies to rules created based on managed rules.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    public readonly tagValueScope!: pulumi.Output<string | undefined>;

    /**
     * Create a Rule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RuleArgs | RuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RuleState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["compliance"] = state ? state.compliance : undefined;
            resourceInputs["compliancePackId"] = state ? state.compliancePackId : undefined;
            resourceInputs["configRuleArn"] = state ? state.configRuleArn : undefined;
            resourceInputs["configRuleId"] = state ? state.configRuleId : undefined;
            resourceInputs["configRuleTriggerTypes"] = state ? state.configRuleTriggerTypes : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["eventSource"] = state ? state.eventSource : undefined;
            resourceInputs["excludeResourceIdsScope"] = state ? state.excludeResourceIdsScope : undefined;
            resourceInputs["inputParameters"] = state ? state.inputParameters : undefined;
            resourceInputs["maximumExecutionFrequency"] = state ? state.maximumExecutionFrequency : undefined;
            resourceInputs["modifiedTimestamp"] = state ? state.modifiedTimestamp : undefined;
            resourceInputs["regionIdsScope"] = state ? state.regionIdsScope : undefined;
            resourceInputs["resourceGroupIdsScope"] = state ? state.resourceGroupIdsScope : undefined;
            resourceInputs["resourceTypesScopes"] = state ? state.resourceTypesScopes : undefined;
            resourceInputs["riskLevel"] = state ? state.riskLevel : undefined;
            resourceInputs["ruleName"] = state ? state.ruleName : undefined;
            resourceInputs["scopeComplianceResourceTypes"] = state ? state.scopeComplianceResourceTypes : undefined;
            resourceInputs["sourceDetailMessageType"] = state ? state.sourceDetailMessageType : undefined;
            resourceInputs["sourceIdentifier"] = state ? state.sourceIdentifier : undefined;
            resourceInputs["sourceMaximumExecutionFrequency"] = state ? state.sourceMaximumExecutionFrequency : undefined;
            resourceInputs["sourceOwner"] = state ? state.sourceOwner : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tagKeyScope"] = state ? state.tagKeyScope : undefined;
            resourceInputs["tagValueScope"] = state ? state.tagValueScope : undefined;
        } else {
            const args = argsOrState as RuleArgs | undefined;
            if ((!args || args.riskLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'riskLevel'");
            }
            if ((!args || args.ruleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleName'");
            }
            if ((!args || args.sourceIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceIdentifier'");
            }
            if ((!args || args.sourceOwner === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceOwner'");
            }
            resourceInputs["configRuleTriggerTypes"] = args ? args.configRuleTriggerTypes : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["excludeResourceIdsScope"] = args ? args.excludeResourceIdsScope : undefined;
            resourceInputs["inputParameters"] = args ? args.inputParameters : undefined;
            resourceInputs["maximumExecutionFrequency"] = args ? args.maximumExecutionFrequency : undefined;
            resourceInputs["regionIdsScope"] = args ? args.regionIdsScope : undefined;
            resourceInputs["resourceGroupIdsScope"] = args ? args.resourceGroupIdsScope : undefined;
            resourceInputs["resourceTypesScopes"] = args ? args.resourceTypesScopes : undefined;
            resourceInputs["riskLevel"] = args ? args.riskLevel : undefined;
            resourceInputs["ruleName"] = args ? args.ruleName : undefined;
            resourceInputs["scopeComplianceResourceTypes"] = args ? args.scopeComplianceResourceTypes : undefined;
            resourceInputs["sourceDetailMessageType"] = args ? args.sourceDetailMessageType : undefined;
            resourceInputs["sourceIdentifier"] = args ? args.sourceIdentifier : undefined;
            resourceInputs["sourceMaximumExecutionFrequency"] = args ? args.sourceMaximumExecutionFrequency : undefined;
            resourceInputs["sourceOwner"] = args ? args.sourceOwner : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["tagKeyScope"] = args ? args.tagKeyScope : undefined;
            resourceInputs["tagValueScope"] = args ? args.tagValueScope : undefined;
            resourceInputs["accountId"] = undefined /*out*/;
            resourceInputs["compliance"] = undefined /*out*/;
            resourceInputs["compliancePackId"] = undefined /*out*/;
            resourceInputs["configRuleArn"] = undefined /*out*/;
            resourceInputs["configRuleId"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["eventSource"] = undefined /*out*/;
            resourceInputs["modifiedTimestamp"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Rule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rule resources.
 */
export interface RuleState {
    /**
     * The ID of Alicloud account.
     */
    accountId?: pulumi.Input<number>;
    /**
     * compliance information.
     */
    compliance?: pulumi.Input<inputs.cfg.RuleCompliance>;
    /**
     * Compliance Package ID.
     */
    compliancePackId?: pulumi.Input<string>;
    /**
     * config rule arn.
     */
    configRuleArn?: pulumi.Input<string>;
    /**
     * The ID of the rule.
     */
    configRuleId?: pulumi.Input<string>;
    /**
     * The trigger type of the rule. Valid values:  `ConfigurationItemChangeNotification`: The rule is triggered upon configuration changes. `ScheduledNotification`: The rule is triggered as scheduled.
     */
    configRuleTriggerTypes?: pulumi.Input<string>;
    /**
     * The timestamp when the rule was created.
     */
    createTime?: pulumi.Input<number>;
    /**
     * The description of the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The event source of the rule.
     */
    eventSource?: pulumi.Input<string>;
    /**
     * The rule monitors excluded resource IDs, multiple of which are separated by commas, only applies to rules created based on managed rules, , custom rule this field is empty.
     */
    excludeResourceIdsScope?: pulumi.Input<string>;
    /**
     * The settings of the input parameters for the rule.
     */
    inputParameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The frequency of the compliance evaluations, it is required if the ConfigRuleTriggerTypes value is ScheduledNotification. Valid values:  `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, `TwentyFour_Hours`.
     */
    maximumExecutionFrequency?: pulumi.Input<string>;
    /**
     * The timestamp when the rule was last modified.
     */
    modifiedTimestamp?: pulumi.Input<number>;
    /**
     * The rule monitors region IDs, separated by commas, only applies to rules created based on managed rules.
     */
    regionIdsScope?: pulumi.Input<string>;
    /**
     * The rule monitors resource group IDs, separated by commas, only applies to rules created based on managed rules.
     */
    resourceGroupIdsScope?: pulumi.Input<string>;
    /**
     * The types of the resources to be evaluated against the rule.
     */
    resourceTypesScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The risk level of the resources that are not compliant with the rule. Valid values:  `1`: critical `2`: warning `3`: info
     */
    riskLevel?: pulumi.Input<number>;
    /**
     * The name of the rule.
     */
    ruleName?: pulumi.Input<string>;
    /**
     * Field 'scope_compliance_resource_types' has been deprecated from provider version 1.124.1. New field 'resource_types_scope' instead.
     *
     * @deprecated Field 'scope_compliance_resource_types' has been deprecated from provider version 1.124.1. New field 'resource_types_scope' instead.
     */
    scopeComplianceResourceTypes?: pulumi.Input<string>;
    /**
     * Field 'source_detail_message_type' has been deprecated from provider version 1.124.1. New field 'config_rule_trigger_types' instead.
     *
     * @deprecated Field 'source_detail_message_type' has been deprecated from provider version 1.124.1. New field 'config_rule_trigger_types' instead.
     */
    sourceDetailMessageType?: pulumi.Input<string>;
    /**
     * The identifier of the rule.  For a managed rule, the value is the name of the managed rule. For a custom rule, the value is the ARN of the custom rule.
     */
    sourceIdentifier?: pulumi.Input<string>;
    /**
     * Field 'source_maximum_execution_frequency' has been deprecated from provider version 1.124.1. New field 'maximum_execution_frequency' instead.
     *
     * @deprecated Field 'source_maximum_execution_frequency' has been deprecated from provider version 1.124.1. New field 'maximum_execution_frequency' instead.
     */
    sourceMaximumExecutionFrequency?: pulumi.Input<string>;
    /**
     * Specifies whether you or Alibaba Cloud owns and manages the rule. Valid values:  `CUSTOM_FC`: The rule is a custom rule and you own the rule. `ALIYUN`: The rule is a managed rule and Alibaba Cloud owns the rule
     */
    sourceOwner?: pulumi.Input<string>;
    /**
     * The status of the rule. Valid values: ACTIVE: The rule is monitoring the configurations of target resources. DELETING_RESULTS: The compliance evaluation result returned by the rule is being deleted. EVALUATING: The rule is triggered and is evaluating whether the configurations of target resources are compliant. INACTIVE: The rule is disabled from monitoring the configurations of target resources.
     */
    status?: pulumi.Input<string>;
    /**
     * The rule monitors the tag key, only applies to rules created based on managed rules.
     */
    tagKeyScope?: pulumi.Input<string>;
    /**
     * The rule monitors the tag value, only applies to rules created based on managed rules.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    tagValueScope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Rule resource.
 */
export interface RuleArgs {
    /**
     * The trigger type of the rule. Valid values:  `ConfigurationItemChangeNotification`: The rule is triggered upon configuration changes. `ScheduledNotification`: The rule is triggered as scheduled.
     */
    configRuleTriggerTypes?: pulumi.Input<string>;
    /**
     * The description of the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The rule monitors excluded resource IDs, multiple of which are separated by commas, only applies to rules created based on managed rules, , custom rule this field is empty.
     */
    excludeResourceIdsScope?: pulumi.Input<string>;
    /**
     * The settings of the input parameters for the rule.
     */
    inputParameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The frequency of the compliance evaluations, it is required if the ConfigRuleTriggerTypes value is ScheduledNotification. Valid values:  `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, `TwentyFour_Hours`.
     */
    maximumExecutionFrequency?: pulumi.Input<string>;
    /**
     * The rule monitors region IDs, separated by commas, only applies to rules created based on managed rules.
     */
    regionIdsScope?: pulumi.Input<string>;
    /**
     * The rule monitors resource group IDs, separated by commas, only applies to rules created based on managed rules.
     */
    resourceGroupIdsScope?: pulumi.Input<string>;
    /**
     * The types of the resources to be evaluated against the rule.
     */
    resourceTypesScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The risk level of the resources that are not compliant with the rule. Valid values:  `1`: critical `2`: warning `3`: info
     */
    riskLevel: pulumi.Input<number>;
    /**
     * The name of the rule.
     */
    ruleName: pulumi.Input<string>;
    /**
     * Field 'scope_compliance_resource_types' has been deprecated from provider version 1.124.1. New field 'resource_types_scope' instead.
     *
     * @deprecated Field 'scope_compliance_resource_types' has been deprecated from provider version 1.124.1. New field 'resource_types_scope' instead.
     */
    scopeComplianceResourceTypes?: pulumi.Input<string>;
    /**
     * Field 'source_detail_message_type' has been deprecated from provider version 1.124.1. New field 'config_rule_trigger_types' instead.
     *
     * @deprecated Field 'source_detail_message_type' has been deprecated from provider version 1.124.1. New field 'config_rule_trigger_types' instead.
     */
    sourceDetailMessageType?: pulumi.Input<string>;
    /**
     * The identifier of the rule.  For a managed rule, the value is the name of the managed rule. For a custom rule, the value is the ARN of the custom rule.
     */
    sourceIdentifier: pulumi.Input<string>;
    /**
     * Field 'source_maximum_execution_frequency' has been deprecated from provider version 1.124.1. New field 'maximum_execution_frequency' instead.
     *
     * @deprecated Field 'source_maximum_execution_frequency' has been deprecated from provider version 1.124.1. New field 'maximum_execution_frequency' instead.
     */
    sourceMaximumExecutionFrequency?: pulumi.Input<string>;
    /**
     * Specifies whether you or Alibaba Cloud owns and manages the rule. Valid values:  `CUSTOM_FC`: The rule is a custom rule and you own the rule. `ALIYUN`: The rule is a managed rule and Alibaba Cloud owns the rule
     */
    sourceOwner: pulumi.Input<string>;
    /**
     * The status of the rule. Valid values: ACTIVE: The rule is monitoring the configurations of target resources. DELETING_RESULTS: The compliance evaluation result returned by the rule is being deleted. EVALUATING: The rule is triggered and is evaluating whether the configurations of target resources are compliant. INACTIVE: The rule is disabled from monitoring the configurations of target resources.
     */
    status?: pulumi.Input<string>;
    /**
     * The rule monitors the tag key, only applies to rules created based on managed rules.
     */
    tagKeyScope?: pulumi.Input<string>;
    /**
     * The rule monitors the tag value, only applies to rules created based on managed rules.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    tagValueScope?: pulumi.Input<string>;
}
