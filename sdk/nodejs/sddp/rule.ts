// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Data Security Center Rule resource.
 *
 * For information about Data Security Center Rule and how to use it, see [What is Rule](https://help.aliyun.com/product/88674.html).
 *
 * > **NOTE:** Available in v1.132.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultRule = new alicloud.sddp.Rule("default", {
 *     category: 0,
 *     content: "content",
 *     productCode: "ODPS",
 *     riskLevelId: "4",
 *     ruleName: "rule_name",
 * });
 * ```
 *
 * ## Import
 *
 * Data Security Center Rule can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:sddp/rule:Rule example <id>
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
    public static readonly __pulumiType = 'alicloud:sddp/rule:Rule';

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
     * Sensitive Data Identification Rules for the Type of. Valid values:
     * * `0`: Keyword.
     * * `2`: Regular expression.
     */
    public readonly category!: pulumi.Output<number>;
    /**
     * Sensitive Data Identification Rules the Content.
     */
    public readonly content!: pulumi.Output<string>;
    /**
     * The Content Classification.
     */
    public readonly contentCategory!: pulumi.Output<string>;
    /**
     * Sensitive Data Identification Rules of Type. Valid values: 
     * * `0`: the Built-in.
     * * `1`: The User-Defined.
     */
    public readonly customType!: pulumi.Output<number>;
    /**
     * Sensitive Data Identification a Description of the Rule Information.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The Request and Receive the Language of the Message Type. Valid values:
     * * `zh`: Chinese.
     * * `en`: English.
     */
    public readonly lang!: pulumi.Output<string | undefined>;
    /**
     * Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
     */
    public readonly productCode!: pulumi.Output<string | undefined>;
    /**
     * Product ID. Valid values: 
     * * `1`:MaxCompute
     * * `2`:OSS
     * * `5`:RDS.
     */
    public readonly productId!: pulumi.Output<string | undefined>;
    /**
     * Sensitive Data Identification Rules of Risk Level ID. Valid values: 
     * * `2`:S1, Weak Risk Level.
     * * `3`:S2, Medium Risk Level.
     * * `4`:S3 High Risk Level.
     * * `5`:S4, the Highest Risk Level.
     */
    public readonly riskLevelId!: pulumi.Output<string | undefined>;
    /**
     * Sensitive Data Identification Name of the Rule.
     */
    public readonly ruleName!: pulumi.Output<string>;
    /**
     * Rule Type.
     */
    public readonly ruleType!: pulumi.Output<number | undefined>;
    /**
     * Triggered the Alarm Conditions.
     */
    public readonly statExpress!: pulumi.Output<string | undefined>;
    /**
     * Sensitive Data Identification Rules Detection State of.
     */
    public readonly status!: pulumi.Output<number>;
    /**
     * The Target of rule.
     */
    public readonly target!: pulumi.Output<string | undefined>;
    /**
     * The Level of Risk. Valid values: 
     * * `1`: Weak warn Level.
     * * `2`: Medium Risk Level.
     * * `3`: High Risk Level.
     */
    public readonly warnLevel!: pulumi.Output<number | undefined>;

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
            resourceInputs["category"] = state ? state.category : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["contentCategory"] = state ? state.contentCategory : undefined;
            resourceInputs["customType"] = state ? state.customType : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["lang"] = state ? state.lang : undefined;
            resourceInputs["productCode"] = state ? state.productCode : undefined;
            resourceInputs["productId"] = state ? state.productId : undefined;
            resourceInputs["riskLevelId"] = state ? state.riskLevelId : undefined;
            resourceInputs["ruleName"] = state ? state.ruleName : undefined;
            resourceInputs["ruleType"] = state ? state.ruleType : undefined;
            resourceInputs["statExpress"] = state ? state.statExpress : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
            resourceInputs["warnLevel"] = state ? state.warnLevel : undefined;
        } else {
            const args = argsOrState as RuleArgs | undefined;
            if ((!args || args.category === undefined) && !opts.urn) {
                throw new Error("Missing required property 'category'");
            }
            if ((!args || args.content === undefined) && !opts.urn) {
                throw new Error("Missing required property 'content'");
            }
            if ((!args || args.ruleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleName'");
            }
            resourceInputs["category"] = args ? args.category : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["contentCategory"] = args ? args.contentCategory : undefined;
            resourceInputs["customType"] = args ? args.customType : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["lang"] = args ? args.lang : undefined;
            resourceInputs["productCode"] = args ? args.productCode : undefined;
            resourceInputs["productId"] = args ? args.productId : undefined;
            resourceInputs["riskLevelId"] = args ? args.riskLevelId : undefined;
            resourceInputs["ruleName"] = args ? args.ruleName : undefined;
            resourceInputs["ruleType"] = args ? args.ruleType : undefined;
            resourceInputs["statExpress"] = args ? args.statExpress : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["warnLevel"] = args ? args.warnLevel : undefined;
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
     * Sensitive Data Identification Rules for the Type of. Valid values:
     * * `0`: Keyword.
     * * `2`: Regular expression.
     */
    category?: pulumi.Input<number>;
    /**
     * Sensitive Data Identification Rules the Content.
     */
    content?: pulumi.Input<string>;
    /**
     * The Content Classification.
     */
    contentCategory?: pulumi.Input<string>;
    /**
     * Sensitive Data Identification Rules of Type. Valid values: 
     * * `0`: the Built-in.
     * * `1`: The User-Defined.
     */
    customType?: pulumi.Input<number>;
    /**
     * Sensitive Data Identification a Description of the Rule Information.
     */
    description?: pulumi.Input<string>;
    /**
     * The Request and Receive the Language of the Message Type. Valid values:
     * * `zh`: Chinese.
     * * `en`: English.
     */
    lang?: pulumi.Input<string>;
    /**
     * Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
     */
    productCode?: pulumi.Input<string>;
    /**
     * Product ID. Valid values: 
     * * `1`:MaxCompute
     * * `2`:OSS
     * * `5`:RDS.
     */
    productId?: pulumi.Input<string>;
    /**
     * Sensitive Data Identification Rules of Risk Level ID. Valid values: 
     * * `2`:S1, Weak Risk Level.
     * * `3`:S2, Medium Risk Level.
     * * `4`:S3 High Risk Level.
     * * `5`:S4, the Highest Risk Level.
     */
    riskLevelId?: pulumi.Input<string>;
    /**
     * Sensitive Data Identification Name of the Rule.
     */
    ruleName?: pulumi.Input<string>;
    /**
     * Rule Type.
     */
    ruleType?: pulumi.Input<number>;
    /**
     * Triggered the Alarm Conditions.
     */
    statExpress?: pulumi.Input<string>;
    /**
     * Sensitive Data Identification Rules Detection State of.
     */
    status?: pulumi.Input<number>;
    /**
     * The Target of rule.
     */
    target?: pulumi.Input<string>;
    /**
     * The Level of Risk. Valid values: 
     * * `1`: Weak warn Level.
     * * `2`: Medium Risk Level.
     * * `3`: High Risk Level.
     */
    warnLevel?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Rule resource.
 */
export interface RuleArgs {
    /**
     * Sensitive Data Identification Rules for the Type of. Valid values:
     * * `0`: Keyword.
     * * `2`: Regular expression.
     */
    category: pulumi.Input<number>;
    /**
     * Sensitive Data Identification Rules the Content.
     */
    content: pulumi.Input<string>;
    /**
     * The Content Classification.
     */
    contentCategory?: pulumi.Input<string>;
    /**
     * Sensitive Data Identification Rules of Type. Valid values: 
     * * `0`: the Built-in.
     * * `1`: The User-Defined.
     */
    customType?: pulumi.Input<number>;
    /**
     * Sensitive Data Identification a Description of the Rule Information.
     */
    description?: pulumi.Input<string>;
    /**
     * The Request and Receive the Language of the Message Type. Valid values:
     * * `zh`: Chinese.
     * * `en`: English.
     */
    lang?: pulumi.Input<string>;
    /**
     * Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
     */
    productCode?: pulumi.Input<string>;
    /**
     * Product ID. Valid values: 
     * * `1`:MaxCompute
     * * `2`:OSS
     * * `5`:RDS.
     */
    productId?: pulumi.Input<string>;
    /**
     * Sensitive Data Identification Rules of Risk Level ID. Valid values: 
     * * `2`:S1, Weak Risk Level.
     * * `3`:S2, Medium Risk Level.
     * * `4`:S3 High Risk Level.
     * * `5`:S4, the Highest Risk Level.
     */
    riskLevelId?: pulumi.Input<string>;
    /**
     * Sensitive Data Identification Name of the Rule.
     */
    ruleName: pulumi.Input<string>;
    /**
     * Rule Type.
     */
    ruleType?: pulumi.Input<number>;
    /**
     * Triggered the Alarm Conditions.
     */
    statExpress?: pulumi.Input<string>;
    /**
     * Sensitive Data Identification Rules Detection State of.
     */
    status?: pulumi.Input<number>;
    /**
     * The Target of rule.
     */
    target?: pulumi.Input<string>;
    /**
     * The Level of Risk. Valid values: 
     * * `1`: Weak warn Level.
     * * `2`: Medium Risk Level.
     * * `3`: High Risk Level.
     */
    warnLevel?: pulumi.Input<number>;
}