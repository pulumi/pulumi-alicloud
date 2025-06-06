// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a PolarDB Parameter Group resource.
 *
 * For information about PolarDB Parameter Group and how to use it, see [What is Parameter Group](https://www.alibabacloud.com/help/en/polardb/polardb-for-mysql/user-guide/apply-a-parameter-template).
 *
 * > **NOTE:** Available since v1.183.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.polardb.ParameterGroup("example", {
 *     name: "example_value",
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     parameters: [{
 *         paramName: "wait_timeout",
 *         paramValue: "86400",
 *     }],
 *     description: "example_value",
 * });
 * ```
 *
 * ## Import
 *
 * PolarDB Parameter Group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:polardb/parameterGroup:ParameterGroup example <id>
 * ```
 */
export class ParameterGroup extends pulumi.CustomResource {
    /**
     * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ParameterGroupState, opts?: pulumi.CustomResourceOptions): ParameterGroup {
        return new ParameterGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:polardb/parameterGroup:ParameterGroup';

    /**
     * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ParameterGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ParameterGroup.__pulumiType;
    }

    /**
     * The type of the database engine. Only `MySQL` is supported.
     */
    public readonly dbType!: pulumi.Output<string>;
    /**
     * The version number of the database engine. Valid values: `5.6`, `5.7`, `8.0`.
     */
    public readonly dbVersion!: pulumi.Output<string>;
    /**
     * The description of the parameter template. It must be 0 to 200 characters in length.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the parameter template. It must be 8 to 64 characters in length, and can contain letters, digits, and underscores (_). It must start with a letter and cannot contain Chinese characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The parameter template. See the following `Block parameters`.
     */
    public readonly parameters!: pulumi.Output<outputs.polardb.ParameterGroupParameter[]>;

    /**
     * Create a ParameterGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ParameterGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ParameterGroupArgs | ParameterGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ParameterGroupState | undefined;
            resourceInputs["dbType"] = state ? state.dbType : undefined;
            resourceInputs["dbVersion"] = state ? state.dbVersion : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
        } else {
            const args = argsOrState as ParameterGroupArgs | undefined;
            if ((!args || args.dbType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbType'");
            }
            if ((!args || args.dbVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbVersion'");
            }
            if ((!args || args.parameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parameters'");
            }
            resourceInputs["dbType"] = args ? args.dbType : undefined;
            resourceInputs["dbVersion"] = args ? args.dbVersion : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ParameterGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ParameterGroup resources.
 */
export interface ParameterGroupState {
    /**
     * The type of the database engine. Only `MySQL` is supported.
     */
    dbType?: pulumi.Input<string>;
    /**
     * The version number of the database engine. Valid values: `5.6`, `5.7`, `8.0`.
     */
    dbVersion?: pulumi.Input<string>;
    /**
     * The description of the parameter template. It must be 0 to 200 characters in length.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the parameter template. It must be 8 to 64 characters in length, and can contain letters, digits, and underscores (_). It must start with a letter and cannot contain Chinese characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The parameter template. See the following `Block parameters`.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.polardb.ParameterGroupParameter>[]>;
}

/**
 * The set of arguments for constructing a ParameterGroup resource.
 */
export interface ParameterGroupArgs {
    /**
     * The type of the database engine. Only `MySQL` is supported.
     */
    dbType: pulumi.Input<string>;
    /**
     * The version number of the database engine. Valid values: `5.6`, `5.7`, `8.0`.
     */
    dbVersion: pulumi.Input<string>;
    /**
     * The description of the parameter template. It must be 0 to 200 characters in length.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the parameter template. It must be 8 to 64 characters in length, and can contain letters, digits, and underscores (_). It must start with a letter and cannot contain Chinese characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The parameter template. See the following `Block parameters`.
     */
    parameters: pulumi.Input<pulumi.Input<inputs.polardb.ParameterGroupParameter>[]>;
}
