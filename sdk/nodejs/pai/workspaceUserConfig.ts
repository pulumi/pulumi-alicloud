// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a PAI Workspace User Config resource.
 *
 * For information about PAI Workspace User Config and how to use it, see [What is User Config](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-setuserconfigs).
 *
 * > **NOTE:** Available since v1.250.0.
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
 * const _default = new alicloud.pai.WorkspaceUserConfig("default", {
 *     categoryName: "DataPrivacyConfig",
 *     configKey: "customizePAIAssumedRole",
 *     configValue: name,
 * });
 * ```
 *
 * ## Import
 *
 * PAI Workspace User Config can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:pai/workspaceUserConfig:WorkspaceUserConfig example <category_name>:<config_key>
 * ```
 */
export class WorkspaceUserConfig extends pulumi.CustomResource {
    /**
     * Get an existing WorkspaceUserConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkspaceUserConfigState, opts?: pulumi.CustomResourceOptions): WorkspaceUserConfig {
        return new WorkspaceUserConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:pai/workspaceUserConfig:WorkspaceUserConfig';

    /**
     * Returns true if the given object is an instance of WorkspaceUserConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkspaceUserConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkspaceUserConfig.__pulumiType;
    }

    /**
     * The category. Valid values: `DataPrivacyConfig`.
     */
    public readonly categoryName!: pulumi.Output<string>;
    /**
     * The key of the configuration.
     */
    public readonly configKey!: pulumi.Output<string>;
    /**
     * The value of the configuration.
     */
    public readonly configValue!: pulumi.Output<string>;
    /**
     * The scope. Default value: `owner`. Valid values: `owner`, `subUser`.
     */
    public readonly scope!: pulumi.Output<string>;

    /**
     * Create a WorkspaceUserConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkspaceUserConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkspaceUserConfigArgs | WorkspaceUserConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkspaceUserConfigState | undefined;
            resourceInputs["categoryName"] = state ? state.categoryName : undefined;
            resourceInputs["configKey"] = state ? state.configKey : undefined;
            resourceInputs["configValue"] = state ? state.configValue : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
        } else {
            const args = argsOrState as WorkspaceUserConfigArgs | undefined;
            if ((!args || args.categoryName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'categoryName'");
            }
            if ((!args || args.configKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configKey'");
            }
            if ((!args || args.configValue === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configValue'");
            }
            resourceInputs["categoryName"] = args ? args.categoryName : undefined;
            resourceInputs["configKey"] = args ? args.configKey : undefined;
            resourceInputs["configValue"] = args ? args.configValue : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkspaceUserConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkspaceUserConfig resources.
 */
export interface WorkspaceUserConfigState {
    /**
     * The category. Valid values: `DataPrivacyConfig`.
     */
    categoryName?: pulumi.Input<string>;
    /**
     * The key of the configuration.
     */
    configKey?: pulumi.Input<string>;
    /**
     * The value of the configuration.
     */
    configValue?: pulumi.Input<string>;
    /**
     * The scope. Default value: `owner`. Valid values: `owner`, `subUser`.
     */
    scope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkspaceUserConfig resource.
 */
export interface WorkspaceUserConfigArgs {
    /**
     * The category. Valid values: `DataPrivacyConfig`.
     */
    categoryName: pulumi.Input<string>;
    /**
     * The key of the configuration.
     */
    configKey: pulumi.Input<string>;
    /**
     * The value of the configuration.
     */
    configValue: pulumi.Input<string>;
    /**
     * The scope. Default value: `owner`. Valid values: `owner`, `subUser`.
     */
    scope?: pulumi.Input<string>;
}
