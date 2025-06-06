// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a OOS State Configuration resource.
 *
 * For information about OOS State Configuration and how to use it, see [What is State Configuration](https://www.alibabacloud.com/help/en/doc-detail/208728.html).
 *
 * > **NOTE:** Available in v1.147.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.resourcemanager.getResourceGroups({});
 * const defaultStateConfiguration = new alicloud.oos.StateConfiguration("default", {
 *     templateName: "ACS-ECS-InventoryDataCollection",
 *     configureMode: "ApplyOnly",
 *     description: "terraform-example",
 *     scheduleType: "rate",
 *     scheduleExpression: "1 hour",
 *     resourceGroupId: _default.then(_default => _default.ids?.[0]),
 *     targets: "{\"Filters\": [{\"Type\": \"All\", \"Parameters\": {\"InstanceChargeType\": \"PrePaid\"}}], \"ResourceType\": \"ALIYUN::ECS::Instance\"}",
 *     parameters: "{\"policy\": {\"ACS:Application\": {\"Collection\": \"Enabled\"}}}",
 *     tags: {
 *         Created: "TF",
 *         For: "example",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * OOS State Configuration can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:oos/stateConfiguration:StateConfiguration example <id>
 * ```
 */
export class StateConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing StateConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StateConfigurationState, opts?: pulumi.CustomResourceOptions): StateConfiguration {
        return new StateConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:oos/stateConfiguration:StateConfiguration';

    /**
     * Returns true if the given object is an instance of StateConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StateConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StateConfiguration.__pulumiType;
    }

    /**
     * Configuration mode. Valid values: `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `ApplyOnly`.
     */
    public readonly configureMode!: pulumi.Output<string>;
    /**
     * The description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The parameter of the Template. This field is in the format of JSON strings. For detailed definition instructions, please refer to [Metadata types that are supported by a configuration list](https://www.alibabacloud.com/help/en/doc-detail/208276.html).
     */
    public readonly parameters!: pulumi.Output<string | undefined>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * Timing expression.
     */
    public readonly scheduleExpression!: pulumi.Output<string>;
    /**
     * Timing type. Valid values: `rate`.
     */
    public readonly scheduleType!: pulumi.Output<string>;
    /**
     * The tag of the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The Target resources.  This field is in the format of JSON strings. For detailed definition instructions, please refer to [Parameter](https://www.alibabacloud.com/help/en/doc-detail/120674.html).
     */
    public readonly targets!: pulumi.Output<string>;
    /**
     * The name of the template.
     */
    public readonly templateName!: pulumi.Output<string>;
    /**
     * The version number. If you do not specify this parameter, the system uses the latest version.
     */
    public readonly templateVersion!: pulumi.Output<string>;

    /**
     * Create a StateConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StateConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StateConfigurationArgs | StateConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StateConfigurationState | undefined;
            resourceInputs["configureMode"] = state ? state.configureMode : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["scheduleExpression"] = state ? state.scheduleExpression : undefined;
            resourceInputs["scheduleType"] = state ? state.scheduleType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["targets"] = state ? state.targets : undefined;
            resourceInputs["templateName"] = state ? state.templateName : undefined;
            resourceInputs["templateVersion"] = state ? state.templateVersion : undefined;
        } else {
            const args = argsOrState as StateConfigurationArgs | undefined;
            if ((!args || args.scheduleExpression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scheduleExpression'");
            }
            if ((!args || args.scheduleType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scheduleType'");
            }
            if ((!args || args.targets === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targets'");
            }
            if ((!args || args.templateName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'templateName'");
            }
            resourceInputs["configureMode"] = args ? args.configureMode : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["scheduleExpression"] = args ? args.scheduleExpression : undefined;
            resourceInputs["scheduleType"] = args ? args.scheduleType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targets"] = args ? args.targets : undefined;
            resourceInputs["templateName"] = args ? args.templateName : undefined;
            resourceInputs["templateVersion"] = args ? args.templateVersion : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StateConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StateConfiguration resources.
 */
export interface StateConfigurationState {
    /**
     * Configuration mode. Valid values: `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `ApplyOnly`.
     */
    configureMode?: pulumi.Input<string>;
    /**
     * The description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * The parameter of the Template. This field is in the format of JSON strings. For detailed definition instructions, please refer to [Metadata types that are supported by a configuration list](https://www.alibabacloud.com/help/en/doc-detail/208276.html).
     */
    parameters?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Timing expression.
     */
    scheduleExpression?: pulumi.Input<string>;
    /**
     * Timing type. Valid values: `rate`.
     */
    scheduleType?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Target resources.  This field is in the format of JSON strings. For detailed definition instructions, please refer to [Parameter](https://www.alibabacloud.com/help/en/doc-detail/120674.html).
     */
    targets?: pulumi.Input<string>;
    /**
     * The name of the template.
     */
    templateName?: pulumi.Input<string>;
    /**
     * The version number. If you do not specify this parameter, the system uses the latest version.
     */
    templateVersion?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StateConfiguration resource.
 */
export interface StateConfigurationArgs {
    /**
     * Configuration mode. Valid values: `ApplyAndAutoCorrect`, `ApplyAndMonitor`, `ApplyOnly`.
     */
    configureMode?: pulumi.Input<string>;
    /**
     * The description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * The parameter of the Template. This field is in the format of JSON strings. For detailed definition instructions, please refer to [Metadata types that are supported by a configuration list](https://www.alibabacloud.com/help/en/doc-detail/208276.html).
     */
    parameters?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Timing expression.
     */
    scheduleExpression: pulumi.Input<string>;
    /**
     * Timing type. Valid values: `rate`.
     */
    scheduleType: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Target resources.  This field is in the format of JSON strings. For detailed definition instructions, please refer to [Parameter](https://www.alibabacloud.com/help/en/doc-detail/120674.html).
     */
    targets: pulumi.Input<string>;
    /**
     * The name of the template.
     */
    templateName: pulumi.Input<string>;
    /**
     * The version number. If you do not specify this parameter, the system uses the latest version.
     */
    templateVersion?: pulumi.Input<string>;
}
