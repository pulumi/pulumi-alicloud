// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a SCDN Accelerated Domain resource.
 *
 * For information about domain config and how to use it, see [Batch set config](https://help.aliyun.com/document_detail/92912.html)
 *
 * > **NOTE:** Available in v1.131.0+.
 *
 * > **NOTE:** Alibaba Cloud SCDN has stopped new customer purchases from January 26, 2023, and you can choose to buy Alibaba Cloud DCDN products with more comprehensive acceleration and protection capabilities. If you are already a SCDN customer, you can submit a work order at any time to apply for a smooth migration to Alibaba Cloud DCDN products. In the future, we will provide better acceleration and security protection services in Alibaba Cloud DCDN, thank you for your understanding and cooperation.
 *
 * > **DEPRECATED:**  This resource has been [deprecated](https://www.aliyun.com/product/scdn) from version `1.219.0`.
 *
 * ## Import
 *
 * SCDN domain config can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:scdn/domainConfig:DomainConfig example <domain_name>:<function_name>:<config_id>
 * ```
 */
export class DomainConfig extends pulumi.CustomResource {
    /**
     * Get an existing DomainConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainConfigState, opts?: pulumi.CustomResourceOptions): DomainConfig {
        return new DomainConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:scdn/domainConfig:DomainConfig';

    /**
     * Returns true if the given object is an instance of DomainConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DomainConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DomainConfig.__pulumiType;
    }

    /**
     * The SCDN domain config id.
     */
    public /*out*/ readonly configId!: pulumi.Output<string>;
    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * The args of the domain config.
     */
    public readonly functionArgs!: pulumi.Output<outputs.scdn.DomainConfigFunctionArg[]>;
    /**
     * The name of the domain config.
     */
    public readonly functionName!: pulumi.Output<string>;
    /**
     * The status of this resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a DomainConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainConfigArgs | DomainConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainConfigState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["functionArgs"] = state ? state.functionArgs : undefined;
            resourceInputs["functionName"] = state ? state.functionName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as DomainConfigArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            if ((!args || args.functionArgs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'functionArgs'");
            }
            if ((!args || args.functionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'functionName'");
            }
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["functionArgs"] = args ? args.functionArgs : undefined;
            resourceInputs["functionName"] = args ? args.functionName : undefined;
            resourceInputs["configId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DomainConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DomainConfig resources.
 */
export interface DomainConfigState {
    /**
     * The SCDN domain config id.
     */
    configId?: pulumi.Input<string>;
    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    domainName?: pulumi.Input<string>;
    /**
     * The args of the domain config.
     */
    functionArgs?: pulumi.Input<pulumi.Input<inputs.scdn.DomainConfigFunctionArg>[]>;
    /**
     * The name of the domain config.
     */
    functionName?: pulumi.Input<string>;
    /**
     * The status of this resource.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DomainConfig resource.
 */
export interface DomainConfigArgs {
    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    domainName: pulumi.Input<string>;
    /**
     * The args of the domain config.
     */
    functionArgs: pulumi.Input<pulumi.Input<inputs.scdn.DomainConfigFunctionArg>[]>;
    /**
     * The name of the domain config.
     */
    functionName: pulumi.Input<string>;
}
