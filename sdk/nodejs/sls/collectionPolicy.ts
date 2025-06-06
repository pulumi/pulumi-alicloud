// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a SLS Collection Policy resource.
 *
 * Orchestration policies for cloud product log collection.
 *
 * For information about SLS Collection Policy and how to use it, see [What is Collection Policy](https://www.alibabacloud.com/help/zh/sls/developer-reference/api-sls-2020-12-30-upsertcollectionpolicy).
 *
 * > **NOTE:** Available since v1.232.0.
 *
 * ## Import
 *
 * SLS Collection Policy can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:sls/collectionPolicy:CollectionPolicy example <id>
 * ```
 */
export class CollectionPolicy extends pulumi.CustomResource {
    /**
     * Get an existing CollectionPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CollectionPolicyState, opts?: pulumi.CustomResourceOptions): CollectionPolicy {
        return new CollectionPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:sls/collectionPolicy:CollectionPolicy';

    /**
     * Returns true if the given object is an instance of CollectionPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CollectionPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CollectionPolicy.__pulumiType;
    }

    /**
     * Centralized transfer configuration. See `centralizeConfig` below.
     */
    public readonly centralizeConfig!: pulumi.Output<outputs.sls.CollectionPolicyCentralizeConfig>;
    /**
     * Whether to enable centralized Conversion. The default value is false.
     */
    public readonly centralizeEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Log type encoding.
     */
    public readonly dataCode!: pulumi.Output<string>;
    /**
     * The configuration is supported only when the log type is global. For example, if the productCode is sls, global logs will be collected to the corresponding region during the first configuration. See `dataConfig` below.
     */
    public readonly dataConfig!: pulumi.Output<outputs.sls.CollectionPolicyDataConfig>;
    /**
     * Whether to open.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Collection rule configuration. See `policyConfig` below.
     */
    public readonly policyConfig!: pulumi.Output<outputs.sls.CollectionPolicyPolicyConfig>;
    /**
     * The name of the rule, with a minimum of 3 characters and a maximum of 63 characters, must start with a letter.
     */
    public readonly policyName!: pulumi.Output<string>;
    /**
     * Product code.
     */
    public readonly productCode!: pulumi.Output<string>;
    /**
     * For Resource Directory configuration, the account must have opened the resource directory and be an administrator or a delegated administrator. See `resourceDirectory` below.
     */
    public readonly resourceDirectory!: pulumi.Output<outputs.sls.CollectionPolicyResourceDirectory>;

    /**
     * Create a CollectionPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CollectionPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CollectionPolicyArgs | CollectionPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CollectionPolicyState | undefined;
            resourceInputs["centralizeConfig"] = state ? state.centralizeConfig : undefined;
            resourceInputs["centralizeEnabled"] = state ? state.centralizeEnabled : undefined;
            resourceInputs["dataCode"] = state ? state.dataCode : undefined;
            resourceInputs["dataConfig"] = state ? state.dataConfig : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["policyConfig"] = state ? state.policyConfig : undefined;
            resourceInputs["policyName"] = state ? state.policyName : undefined;
            resourceInputs["productCode"] = state ? state.productCode : undefined;
            resourceInputs["resourceDirectory"] = state ? state.resourceDirectory : undefined;
        } else {
            const args = argsOrState as CollectionPolicyArgs | undefined;
            if ((!args || args.dataCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataCode'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.policyConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyConfig'");
            }
            if ((!args || args.policyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyName'");
            }
            if ((!args || args.productCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'productCode'");
            }
            resourceInputs["centralizeConfig"] = args ? args.centralizeConfig : undefined;
            resourceInputs["centralizeEnabled"] = args ? args.centralizeEnabled : undefined;
            resourceInputs["dataCode"] = args ? args.dataCode : undefined;
            resourceInputs["dataConfig"] = args ? args.dataConfig : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["policyConfig"] = args ? args.policyConfig : undefined;
            resourceInputs["policyName"] = args ? args.policyName : undefined;
            resourceInputs["productCode"] = args ? args.productCode : undefined;
            resourceInputs["resourceDirectory"] = args ? args.resourceDirectory : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CollectionPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CollectionPolicy resources.
 */
export interface CollectionPolicyState {
    /**
     * Centralized transfer configuration. See `centralizeConfig` below.
     */
    centralizeConfig?: pulumi.Input<inputs.sls.CollectionPolicyCentralizeConfig>;
    /**
     * Whether to enable centralized Conversion. The default value is false.
     */
    centralizeEnabled?: pulumi.Input<boolean>;
    /**
     * Log type encoding.
     */
    dataCode?: pulumi.Input<string>;
    /**
     * The configuration is supported only when the log type is global. For example, if the productCode is sls, global logs will be collected to the corresponding region during the first configuration. See `dataConfig` below.
     */
    dataConfig?: pulumi.Input<inputs.sls.CollectionPolicyDataConfig>;
    /**
     * Whether to open.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Collection rule configuration. See `policyConfig` below.
     */
    policyConfig?: pulumi.Input<inputs.sls.CollectionPolicyPolicyConfig>;
    /**
     * The name of the rule, with a minimum of 3 characters and a maximum of 63 characters, must start with a letter.
     */
    policyName?: pulumi.Input<string>;
    /**
     * Product code.
     */
    productCode?: pulumi.Input<string>;
    /**
     * For Resource Directory configuration, the account must have opened the resource directory and be an administrator or a delegated administrator. See `resourceDirectory` below.
     */
    resourceDirectory?: pulumi.Input<inputs.sls.CollectionPolicyResourceDirectory>;
}

/**
 * The set of arguments for constructing a CollectionPolicy resource.
 */
export interface CollectionPolicyArgs {
    /**
     * Centralized transfer configuration. See `centralizeConfig` below.
     */
    centralizeConfig?: pulumi.Input<inputs.sls.CollectionPolicyCentralizeConfig>;
    /**
     * Whether to enable centralized Conversion. The default value is false.
     */
    centralizeEnabled?: pulumi.Input<boolean>;
    /**
     * Log type encoding.
     */
    dataCode: pulumi.Input<string>;
    /**
     * The configuration is supported only when the log type is global. For example, if the productCode is sls, global logs will be collected to the corresponding region during the first configuration. See `dataConfig` below.
     */
    dataConfig?: pulumi.Input<inputs.sls.CollectionPolicyDataConfig>;
    /**
     * Whether to open.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Collection rule configuration. See `policyConfig` below.
     */
    policyConfig: pulumi.Input<inputs.sls.CollectionPolicyPolicyConfig>;
    /**
     * The name of the rule, with a minimum of 3 characters and a maximum of 63 characters, must start with a letter.
     */
    policyName: pulumi.Input<string>;
    /**
     * Product code.
     */
    productCode: pulumi.Input<string>;
    /**
     * For Resource Directory configuration, the account must have opened the resource directory and be an administrator or a delegated administrator. See `resourceDirectory` below.
     */
    resourceDirectory?: pulumi.Input<inputs.sls.CollectionPolicyResourceDirectory>;
}
