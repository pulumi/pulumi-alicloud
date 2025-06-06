// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Config Aggregate Compliance Pack resource.
 *
 * For information about Cloud Config Aggregate Compliance Pack and how to use it, see [What is Aggregate Compliance Pack](https://www.alibabacloud.com/help/en/cloud-config/latest/api-config-2020-09-07-createaggregatecompliancepack).
 *
 * > **NOTE:** Available since v1.124.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform_example";
 * const _default = alicloud.resourcemanager.getAccounts({
 *     status: "CreateSuccess",
 * });
 * const last = _default.then(_default => _default.accounts).length.apply(length => length - 1);
 * const defaultAggregator = new alicloud.cfg.Aggregator("default", {
 *     aggregatorAccounts: [{
 *         accountId: _default.then(_default => _default.accounts[last].accountId),
 *         accountName: _default.then(_default => _default.accounts[last].displayName),
 *         accountType: "ResourceDirectory",
 *     }],
 *     aggregatorName: name,
 *     description: name,
 *     aggregatorType: "CUSTOM",
 * });
 * const defaultAggregateConfigRule = new alicloud.cfg.AggregateConfigRule("default", {
 *     aggregateConfigRuleName: "contains-tag",
 *     aggregatorId: defaultAggregator.id,
 *     configRuleTriggerTypes: "ConfigurationItemChangeNotification",
 *     sourceOwner: "ALIYUN",
 *     sourceIdentifier: "contains-tag",
 *     description: name,
 *     riskLevel: 1,
 *     resourceTypesScopes: ["ACS::ECS::Instance"],
 *     inputParameters: {
 *         key: "example",
 *         value: "example",
 *     },
 * });
 * const defaultAggregateCompliancePack = new alicloud.cfg.AggregateCompliancePack("default", {
 *     aggregateCompliancePackName: name,
 *     aggregatorId: defaultAggregator.id,
 *     description: name,
 *     riskLevel: 1,
 *     configRuleIds: [{
 *         configRuleId: defaultAggregateConfigRule.configRuleId,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Config Aggregate Compliance Pack can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cfg/aggregateCompliancePack:AggregateCompliancePack example <aggregator_id>:<aggregator_compliance_pack_id>
 * ```
 */
export class AggregateCompliancePack extends pulumi.CustomResource {
    /**
     * Get an existing AggregateCompliancePack resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AggregateCompliancePackState, opts?: pulumi.CustomResourceOptions): AggregateCompliancePack {
        return new AggregateCompliancePack(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cfg/aggregateCompliancePack:AggregateCompliancePack';

    /**
     * Returns true if the given object is an instance of AggregateCompliancePack.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AggregateCompliancePack {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AggregateCompliancePack.__pulumiType;
    }

    /**
     * The name of compliance package name. **NOTE:** From version 1.145.0, `aggregateCompliancePackName` can be modified.
     */
    public readonly aggregateCompliancePackName!: pulumi.Output<string>;
    /**
     * The ID of the compliance package.
     */
    public /*out*/ readonly aggregatorCompliancePackId!: pulumi.Output<string>;
    /**
     * The ID of aggregator.
     */
    public readonly aggregatorId!: pulumi.Output<string>;
    /**
     * The Template ID of compliance package.
     */
    public readonly compliancePackTemplateId!: pulumi.Output<string | undefined>;
    /**
     * A list of Config Rule IDs. See `configRuleIds` below.
     */
    public readonly configRuleIds!: pulumi.Output<outputs.cfg.AggregateCompliancePackConfigRuleId[] | undefined>;
    /**
     * A list of Config Rules. See `configRules` below. **NOTE:** Field `configRules` has been deprecated from provider version 1.141.0. New field `configRuleIds` instead.
     *
     * @deprecated Field `configRules` has been deprecated from provider version 1.141.0. New field `configRuleIds` instead.
     */
    public readonly configRules!: pulumi.Output<outputs.cfg.AggregateCompliancePackConfigRule[] | undefined>;
    /**
     * The description of compliance package.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The Risk Level. Valid values:
     */
    public readonly riskLevel!: pulumi.Output<number>;
    /**
     * The status of the Aggregate Compliance Pack.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a AggregateCompliancePack resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AggregateCompliancePackArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AggregateCompliancePackArgs | AggregateCompliancePackState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AggregateCompliancePackState | undefined;
            resourceInputs["aggregateCompliancePackName"] = state ? state.aggregateCompliancePackName : undefined;
            resourceInputs["aggregatorCompliancePackId"] = state ? state.aggregatorCompliancePackId : undefined;
            resourceInputs["aggregatorId"] = state ? state.aggregatorId : undefined;
            resourceInputs["compliancePackTemplateId"] = state ? state.compliancePackTemplateId : undefined;
            resourceInputs["configRuleIds"] = state ? state.configRuleIds : undefined;
            resourceInputs["configRules"] = state ? state.configRules : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["riskLevel"] = state ? state.riskLevel : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as AggregateCompliancePackArgs | undefined;
            if ((!args || args.aggregateCompliancePackName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aggregateCompliancePackName'");
            }
            if ((!args || args.aggregatorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aggregatorId'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.riskLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'riskLevel'");
            }
            resourceInputs["aggregateCompliancePackName"] = args ? args.aggregateCompliancePackName : undefined;
            resourceInputs["aggregatorId"] = args ? args.aggregatorId : undefined;
            resourceInputs["compliancePackTemplateId"] = args ? args.compliancePackTemplateId : undefined;
            resourceInputs["configRuleIds"] = args ? args.configRuleIds : undefined;
            resourceInputs["configRules"] = args ? args.configRules : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["riskLevel"] = args ? args.riskLevel : undefined;
            resourceInputs["aggregatorCompliancePackId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AggregateCompliancePack.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AggregateCompliancePack resources.
 */
export interface AggregateCompliancePackState {
    /**
     * The name of compliance package name. **NOTE:** From version 1.145.0, `aggregateCompliancePackName` can be modified.
     */
    aggregateCompliancePackName?: pulumi.Input<string>;
    /**
     * The ID of the compliance package.
     */
    aggregatorCompliancePackId?: pulumi.Input<string>;
    /**
     * The ID of aggregator.
     */
    aggregatorId?: pulumi.Input<string>;
    /**
     * The Template ID of compliance package.
     */
    compliancePackTemplateId?: pulumi.Input<string>;
    /**
     * A list of Config Rule IDs. See `configRuleIds` below.
     */
    configRuleIds?: pulumi.Input<pulumi.Input<inputs.cfg.AggregateCompliancePackConfigRuleId>[]>;
    /**
     * A list of Config Rules. See `configRules` below. **NOTE:** Field `configRules` has been deprecated from provider version 1.141.0. New field `configRuleIds` instead.
     *
     * @deprecated Field `configRules` has been deprecated from provider version 1.141.0. New field `configRuleIds` instead.
     */
    configRules?: pulumi.Input<pulumi.Input<inputs.cfg.AggregateCompliancePackConfigRule>[]>;
    /**
     * The description of compliance package.
     */
    description?: pulumi.Input<string>;
    /**
     * The Risk Level. Valid values:
     */
    riskLevel?: pulumi.Input<number>;
    /**
     * The status of the Aggregate Compliance Pack.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AggregateCompliancePack resource.
 */
export interface AggregateCompliancePackArgs {
    /**
     * The name of compliance package name. **NOTE:** From version 1.145.0, `aggregateCompliancePackName` can be modified.
     */
    aggregateCompliancePackName: pulumi.Input<string>;
    /**
     * The ID of aggregator.
     */
    aggregatorId: pulumi.Input<string>;
    /**
     * The Template ID of compliance package.
     */
    compliancePackTemplateId?: pulumi.Input<string>;
    /**
     * A list of Config Rule IDs. See `configRuleIds` below.
     */
    configRuleIds?: pulumi.Input<pulumi.Input<inputs.cfg.AggregateCompliancePackConfigRuleId>[]>;
    /**
     * A list of Config Rules. See `configRules` below. **NOTE:** Field `configRules` has been deprecated from provider version 1.141.0. New field `configRuleIds` instead.
     *
     * @deprecated Field `configRules` has been deprecated from provider version 1.141.0. New field `configRuleIds` instead.
     */
    configRules?: pulumi.Input<pulumi.Input<inputs.cfg.AggregateCompliancePackConfigRule>[]>;
    /**
     * The description of compliance package.
     */
    description: pulumi.Input<string>;
    /**
     * The Risk Level. Valid values:
     */
    riskLevel: pulumi.Input<number>;
}
