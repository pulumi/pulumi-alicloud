// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a TAG Associated Rule resource.
 *
 * For information about TAG Associated Rule and how to use it, see [What is Associated Rule](https://www.alibabacloud.com/help/en/resource-management/tag/developer-reference/api-tag-2018-08-28-createassociatedresourcerules).
 *
 * > **NOTE:** Available since v1.244.0.
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
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.tag.AssociatedRule("default", {
 *     status: "Enable",
 *     associatedSettingName: "rule:AttachEni-DetachEni-TagInstance:Ecs-Instance:Ecs-Eni",
 *     tagKeys: ["user"],
 * });
 * ```
 *
 * ## Import
 *
 * TAG Associated Rule can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:tag/associatedRule:AssociatedRule example <id>
 * ```
 */
export class AssociatedRule extends pulumi.CustomResource {
    /**
     * Get an existing AssociatedRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AssociatedRuleState, opts?: pulumi.CustomResourceOptions): AssociatedRule {
        return new AssociatedRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:tag/associatedRule:AssociatedRule';

    /**
     * Returns true if the given object is an instance of AssociatedRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AssociatedRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AssociatedRule.__pulumiType;
    }

    /**
     * The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
     */
    public readonly associatedSettingName!: pulumi.Output<string>;
    /**
     * Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * List of tag keys for the associated resource tag rule.
     */
    public readonly tagKeys!: pulumi.Output<string[] | undefined>;

    /**
     * Create a AssociatedRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AssociatedRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AssociatedRuleArgs | AssociatedRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AssociatedRuleState | undefined;
            resourceInputs["associatedSettingName"] = state ? state.associatedSettingName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tagKeys"] = state ? state.tagKeys : undefined;
        } else {
            const args = argsOrState as AssociatedRuleArgs | undefined;
            if ((!args || args.associatedSettingName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'associatedSettingName'");
            }
            if ((!args || args.status === undefined) && !opts.urn) {
                throw new Error("Missing required property 'status'");
            }
            resourceInputs["associatedSettingName"] = args ? args.associatedSettingName : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["tagKeys"] = args ? args.tagKeys : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AssociatedRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AssociatedRule resources.
 */
export interface AssociatedRuleState {
    /**
     * The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
     */
    associatedSettingName?: pulumi.Input<string>;
    /**
     * Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
     */
    status?: pulumi.Input<string>;
    /**
     * List of tag keys for the associated resource tag rule.
     */
    tagKeys?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AssociatedRule resource.
 */
export interface AssociatedRuleArgs {
    /**
     * The setting name of the associated resource tag rule. For specific values, see the Rule Setting Name column in [Resources that Support Associated Resource Tag Settings](https://www.alibabacloud.com/help/en/resource-management/tag/user-guide/associated-resource-label-settings)
     */
    associatedSettingName: pulumi.Input<string>;
    /**
     * Whether to enable the associated resource tag rule. Valid values: `Enable`, `Disable`.
     */
    status: pulumi.Input<string>;
    /**
     * List of tag keys for the associated resource tag rule.
     */
    tagKeys?: pulumi.Input<pulumi.Input<string>[]>;
}
