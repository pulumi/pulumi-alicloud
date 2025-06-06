// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a APIG Environment resource.
 *
 * For information about APIG Environment and how to use it, see [What is Environment](https://next.api.aliyun.com/api/APIG/2024-03-27/CreateEnvironment).
 *
 * > **NOTE:** Available since v1.240.0.
 *
 * ## Import
 *
 * APIG Environment can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:apig/environment:Environment example <id>
 * ```
 */
export class Environment extends pulumi.CustomResource {
    /**
     * Get an existing Environment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentState, opts?: pulumi.CustomResourceOptions): Environment {
        return new Environment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:apig/environment:Environment';

    /**
     * Returns true if the given object is an instance of Environment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Environment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Environment.__pulumiType;
    }

    /**
     * Description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the resource
     */
    public readonly environmentName!: pulumi.Output<string>;
    /**
     * Gateway id
     */
    public readonly gatewayId!: pulumi.Output<string>;
    /**
     * The ID of the resource group
     */
    public readonly resourceGroupId!: pulumi.Output<string>;

    /**
     * Create a Environment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentArgs | EnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["environmentName"] = state ? state.environmentName : undefined;
            resourceInputs["gatewayId"] = state ? state.gatewayId : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
        } else {
            const args = argsOrState as EnvironmentArgs | undefined;
            if ((!args || args.environmentName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environmentName'");
            }
            if ((!args || args.gatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gatewayId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["environmentName"] = args ? args.environmentName : undefined;
            resourceInputs["gatewayId"] = args ? args.gatewayId : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Environment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Environment resources.
 */
export interface EnvironmentState {
    /**
     * Description
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the resource
     */
    environmentName?: pulumi.Input<string>;
    /**
     * Gateway id
     */
    gatewayId?: pulumi.Input<string>;
    /**
     * The ID of the resource group
     */
    resourceGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Environment resource.
 */
export interface EnvironmentArgs {
    /**
     * Description
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the resource
     */
    environmentName: pulumi.Input<string>;
    /**
     * Gateway id
     */
    gatewayId: pulumi.Input<string>;
    /**
     * The ID of the resource group
     */
    resourceGroupId?: pulumi.Input<string>;
}
